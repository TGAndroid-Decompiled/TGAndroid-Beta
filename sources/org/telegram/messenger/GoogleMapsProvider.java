package org.telegram.messenger;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.IMapsProvider;
public class GoogleMapsProvider implements IMapsProvider {

    public static final class GoogleCameraUpdate implements IMapsProvider.ICameraUpdate {
        private h8.a cameraUpdate;

        private GoogleCameraUpdate(h8.a aVar) {
            this.cameraUpdate = aVar;
        }
    }

    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private j8.b circleOptions;

        @Override
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            j8.b bVar = this.circleOptions;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            bVar.getClass();
            bVar.f11810a = latLng2;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions fillColor(int i10) {
            this.circleOptions.e = i10;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions radius(double d) {
            this.circleOptions.f11811b = d;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeColor(int i10) {
            this.circleOptions.d = i10;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokePattern(List<IMapsProvider.PatternItem> list) {
            ArrayList arrayList = new ArrayList();
            for (IMapsProvider.PatternItem patternItem : list) {
                if (patternItem instanceof IMapsProvider.PatternItem.Gap) {
                    arrayList.add(new j8.c(((IMapsProvider.PatternItem.Gap) patternItem).length, 1));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new j8.c(((IMapsProvider.PatternItem.Dash) patternItem).length, 0));
                }
            }
            this.circleOptions.f11815r = arrayList;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeWidth(int i10) {
            this.circleOptions.f11812c = i10;
            return this;
        }

        private GoogleCircleOptions() {
            ?? obj = new Object();
            obj.f11810a = null;
            obj.f11811b = 0.0d;
            obj.f11812c = 10.0f;
            obj.d = -16777216;
            obj.e = 0;
            obj.f11813f = 0.0f;
            obj.h = true;
            obj.f11814n = false;
            obj.f11815r = null;
            this.circleOptions = obj;
        }
    }

    public static final class GoogleLatLngBounds implements IMapsProvider.ILatLngBounds {
        private LatLngBounds bounds;

        @Override
        public IMapsProvider.LatLng getCenter() {
            LatLngBounds latLngBounds = this.bounds;
            LatLng latLng = latLngBounds.f5874a;
            double d = latLng.f5872a;
            LatLng latLng2 = latLngBounds.f5875b;
            double d10 = (d + latLng2.f5872a) / 2.0d;
            double d11 = latLng2.f5873b;
            double d12 = latLng.f5873b;
            if (d12 > d11) {
                d11 += 360.0d;
            }
            LatLng latLng3 = new LatLng(d10, (d11 + d12) / 2.0d);
            return new IMapsProvider.LatLng(latLng3.f5872a, latLng3.f5873b);
        }

        private GoogleLatLngBounds(LatLngBounds latLngBounds) {
            this.bounds = latLngBounds;
        }
    }

    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private j8.d builder;

        @Override
        public IMapsProvider.ILatLngBounds build() {
            j8.d dVar = this.builder;
            n6.l.j("no included points", !Double.isNaN(dVar.f11819c));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(dVar.f11817a, dVar.f11819c), new LatLng(dVar.f11818b, dVar.d)));
        }

        @Override
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            j8.d dVar = this.builder;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            dVar.getClass();
            double d = dVar.f11817a;
            double d10 = latLng2.f5872a;
            dVar.f11817a = Math.min(d, d10);
            dVar.f11818b = Math.max(dVar.f11818b, d10);
            boolean isNaN = Double.isNaN(dVar.f11819c);
            double d11 = latLng2.f5873b;
            if (isNaN) {
                dVar.f11819c = d11;
                dVar.d = d11;
                return this;
            }
            double d12 = dVar.f11819c;
            double d13 = dVar.d;
            if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
                if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                    dVar.f11819c = d11;
                    return this;
                }
                dVar.d = d11;
            }
            return this;
        }

        private GoogleLatLngBoundsBuilder() {
            ?? obj = new Object();
            obj.f11817a = Double.POSITIVE_INFINITY;
            obj.f11818b = Double.NEGATIVE_INFINITY;
            obj.f11819c = Double.NaN;
            obj.d = Double.NaN;
            this.builder = obj;
        }
    }

    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private h8.c googleMap;
        private Map<j8.a, GoogleCircle> implToAbsCircleMap;
        private Map<j8.f, GoogleMarker> implToAbsMarkerMap;

        public final class GoogleCircle implements IMapsProvider.ICircle {
            private j8.a circle;

            @Override
            public double getRadius() {
                j8.a aVar = this.circle;
                aVar.getClass();
                try {
                    s7.f fVar = (s7.f) aVar.f11809a;
                    Parcel N0 = fVar.N0(fVar.O0(), 6);
                    double readDouble = N0.readDouble();
                    N0.recycle();
                    return readDouble;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void remove() {
                j8.a aVar = this.circle;
                aVar.getClass();
                try {
                    s7.f fVar = (s7.f) aVar.f11809a;
                    fVar.S0(fVar.O0(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void setCenter(IMapsProvider.LatLng latLng) {
                j8.a aVar = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                aVar.getClass();
                try {
                    s7.f fVar = (s7.f) aVar.f11809a;
                    Parcel O0 = fVar.O0();
                    s7.b.b(O0, latLng2);
                    fVar.S0(O0, 3);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void setFillColor(int i10) {
                j8.a aVar = this.circle;
                aVar.getClass();
                try {
                    s7.f fVar = (s7.f) aVar.f11809a;
                    Parcel O0 = fVar.O0();
                    O0.writeInt(i10);
                    fVar.S0(O0, 11);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void setRadius(double d) {
                j8.a aVar = this.circle;
                aVar.getClass();
                try {
                    s7.f fVar = (s7.f) aVar.f11809a;
                    Parcel O0 = fVar.O0();
                    O0.writeDouble(d);
                    fVar.S0(O0, 5);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void setStrokeColor(int i10) {
                j8.a aVar = this.circle;
                aVar.getClass();
                try {
                    s7.f fVar = (s7.f) aVar.f11809a;
                    Parcel O0 = fVar.O0();
                    O0.writeInt(i10);
                    fVar.S0(O0, 9);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            private GoogleCircle(j8.a aVar) {
                GoogleMapImpl.this = r1;
                this.circle = aVar;
            }
        }

        public final class GoogleMarker implements IMapsProvider.IMarker {
            private j8.f marker;

            @Override
            public IMapsProvider.LatLng getPosition() {
                LatLng createFromParcel;
                j8.f fVar = this.marker;
                fVar.getClass();
                try {
                    s7.i iVar = (s7.i) fVar.f11821a;
                    Parcel N0 = iVar.N0(iVar.O0(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i10 = s7.b.f41803a;
                    if (N0.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = creator.createFromParcel(N0);
                    }
                    LatLng latLng = createFromParcel;
                    N0.recycle();
                    return new IMapsProvider.LatLng(latLng.f5872a, latLng.f5873b);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public Object getTag() {
                j8.f fVar = this.marker;
                fVar.getClass();
                try {
                    s7.i iVar = (s7.i) fVar.f11821a;
                    Parcel N0 = iVar.N0(iVar.O0(), 30);
                    x6.a L0 = x6.b.L0(N0.readStrongBinder());
                    N0.recycle();
                    return x6.b.M0(L0);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void remove() {
                j8.f fVar = this.marker;
                fVar.getClass();
                try {
                    s7.i iVar = (s7.i) fVar.f11821a;
                    iVar.S0(iVar.O0(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void setIcon(Bitmap bitmap) {
                this.marker.a(v7.c9.a(bitmap));
            }

            @Override
            public void setPosition(IMapsProvider.LatLng latLng) {
                j8.f fVar = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                fVar.getClass();
                try {
                    s7.i iVar = (s7.i) fVar.f11821a;
                    Parcel O0 = iVar.O0();
                    s7.b.b(O0, latLng2);
                    iVar.S0(O0, 3);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void setRotation(int i10) {
                j8.f fVar = this.marker;
                float f7 = i10;
                fVar.getClass();
                try {
                    s7.i iVar = (s7.i) fVar.f11821a;
                    Parcel O0 = iVar.O0();
                    O0.writeFloat(f7);
                    iVar.S0(O0, 22);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void setTag(Object obj) {
                j8.f fVar = this.marker;
                fVar.getClass();
                try {
                    s7.a aVar = fVar.f11821a;
                    x6.b bVar = new x6.b(obj);
                    s7.i iVar = (s7.i) aVar;
                    Parcel O0 = iVar.O0();
                    s7.b.c(O0, bVar);
                    iVar.S0(O0, 29);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }

            private GoogleMarker(j8.f fVar) {
                GoogleMapImpl.this = r1;
                this.marker = fVar;
            }

            @Override
            public void setIcon(int i10) {
                this.marker.a(v7.c9.b(i10));
            }
        }

        public static void lambda$setOnCameraMoveStartedListener$0(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener, int i10) {
            int i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 1;
                }
            }
            onCameraMoveStartedListener.onCameraMoveStarted(i11);
        }

        public boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, j8.f fVar) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(fVar);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            s7.h hVar;
            h8.c cVar = this.googleMap;
            j8.b bVar = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            cVar.getClass();
            try {
                n6.l.i(bVar, "CircleOptions must not be null.");
                i8.f fVar = cVar.f9256a;
                Parcel O0 = fVar.O0();
                s7.b.b(O0, bVar);
                Parcel N0 = fVar.N0(O0, 35);
                IBinder readStrongBinder = N0.readStrongBinder();
                int i10 = s7.g.f41805b;
                if (readStrongBinder == null) {
                    hVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (queryLocalInterface instanceof s7.h) {
                        hVar = (s7.h) queryLocalInterface;
                    } else {
                        hVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 9);
                    }
                }
                N0.recycle();
                j8.a aVar = new j8.a(hVar);
                GoogleCircle googleCircle = new GoogleCircle(aVar);
                this.implToAbsCircleMap.put(aVar, googleCircle);
                return googleCircle;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            s7.a aVar;
            j8.f fVar;
            h8.c cVar = this.googleMap;
            j8.g gVar = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            cVar.getClass();
            try {
                n6.l.i(gVar, "MarkerOptions must not be null.");
                i8.f fVar2 = cVar.f9256a;
                Parcel O0 = fVar2.O0();
                s7.b.b(O0, gVar);
                Parcel N0 = fVar2.N0(O0, 11);
                IBinder readStrongBinder = N0.readStrongBinder();
                int i10 = s7.j.f41806b;
                if (readStrongBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof s7.a) {
                        aVar = (s7.a) queryLocalInterface;
                    } else {
                        aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 9);
                    }
                }
                N0.recycle();
                if (aVar != 0) {
                    fVar = new j8.f(aVar);
                } else {
                    fVar = null;
                }
                GoogleMarker googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
                return googleMarker;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            h8.c cVar = this.googleMap;
            h8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                n6.l.i(aVar, "CameraUpdate must not be null.");
                i8.f fVar = cVar.f9256a;
                x6.a aVar2 = aVar.f9255a;
                Parcel O0 = fVar.O0();
                s7.b.c(O0, aVar2);
                fVar.S0(O0, 5);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public IMapsProvider.CameraPosition getCameraPosition() {
            CameraPosition createFromParcel;
            h8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                i8.f fVar = cVar.f9256a;
                Parcel N0 = fVar.N0(fVar.O0(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i10 = s7.b.f41803a;
                if (N0.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = creator.createFromParcel(N0);
                }
                CameraPosition cameraPosition = createFromParcel;
                N0.recycle();
                LatLng latLng = cameraPosition.f5869a;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.f5872a, latLng.f5873b), cameraPosition.f5870b);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public float getMaxZoomLevel() {
            h8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                i8.f fVar = cVar.f9256a;
                Parcel N0 = fVar.N0(fVar.O0(), 2);
                float readFloat = N0.readFloat();
                N0.recycle();
                return readFloat;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public float getMinZoomLevel() {
            h8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                i8.f fVar = cVar.f9256a;
                Parcel N0 = fVar.N0(fVar.O0(), 3);
                float readFloat = N0.readFloat();
                N0.recycle();
                return readFloat;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public IMapsProvider.IProjection getProjection() {
            i8.b bVar;
            h8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                i8.f fVar = cVar.f9256a;
                Parcel N0 = fVar.N0(fVar.O0(), 26);
                IBinder readStrongBinder = N0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (queryLocalInterface instanceof i8.b) {
                        bVar = (i8.b) queryLocalInterface;
                    } else {
                        bVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 9);
                    }
                }
                N0.recycle();
                return new GoogleProjection(new h8.g(bVar));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public IMapsProvider.IUISettings getUiSettings() {
            i8.c cVar;
            h8.c cVar2 = this.googleMap;
            cVar2.getClass();
            try {
                if (cVar2.f9257b == null) {
                    i8.f fVar = cVar2.f9256a;
                    Parcel N0 = fVar.N0(fVar.O0(), 25);
                    IBinder readStrongBinder = N0.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (queryLocalInterface instanceof i8.c) {
                            cVar = (i8.c) queryLocalInterface;
                        } else {
                            cVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 9);
                        }
                    }
                    N0.recycle();
                    cVar2.f9257b = new h8.h(cVar);
                }
                return new GoogleUISettings(cVar2.f9257b);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            h8.c cVar = this.googleMap;
            h8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                n6.l.i(aVar, "CameraUpdate must not be null.");
                i8.f fVar = cVar.f9256a;
                x6.a aVar2 = aVar.f9255a;
                Parcel O0 = fVar.O0();
                s7.b.c(O0, aVar2);
                fVar.S0(O0, 4);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            j8.e eVar;
            h8.c cVar = this.googleMap;
            if (iMapStyleOptions != null) {
                eVar = ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            } else {
                eVar = null;
            }
            cVar.getClass();
            try {
                i8.f fVar = cVar.f9256a;
                Parcel O0 = fVar.O0();
                s7.b.b(O0, eVar);
                Parcel N0 = fVar.N0(O0, 91);
                N0.readInt();
                N0.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setMapType(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    this.googleMap.a(4);
                    return;
                }
                this.googleMap.a(2);
                return;
            }
            this.googleMap.a(1);
        }

        @Override
        public void setMyLocationEnabled(boolean z10) {
            h8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                i8.f fVar = cVar.f9256a;
                Parcel O0 = fVar.O0();
                int i10 = s7.b.f41803a;
                O0.writeInt(z10 ? 1 : 0);
                fVar.S0(O0, 22);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setOnCameraIdleListener(Runnable runnable) {
            h8.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            m4 m4Var = new m4(runnable);
            i8.f fVar = cVar.f9256a;
            try {
                h8.i iVar = new h8.i(m4Var, (char) 0);
                Parcel O0 = fVar.O0();
                s7.b.c(O0, iVar);
                fVar.S0(O0, 99);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setOnCameraMoveListener(Runnable runnable) {
            h8.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            m4 m4Var = new m4(runnable);
            i8.f fVar = cVar.f9256a;
            try {
                h8.i iVar = new h8.i(m4Var);
                Parcel O0 = fVar.O0();
                s7.b.c(O0, iVar);
                fVar.S0(O0, 97);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            h8.c cVar = this.googleMap;
            c0 c0Var = new c0(onCameraMoveStartedListener, 4);
            i8.f fVar = cVar.f9256a;
            try {
                h8.i iVar = new h8.i(c0Var);
                Parcel O0 = fVar.O0();
                s7.b.c(O0, iVar);
                fVar.S0(O0, 96);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setOnMapLoadedCallback(Runnable runnable) {
            h8.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            m4 m4Var = new m4(runnable);
            i8.f fVar = cVar.f9256a;
            try {
                h8.i iVar = new h8.i(m4Var, (byte) 0);
                Parcel O0 = fVar.O0();
                s7.b.c(O0, iVar);
                fVar.S0(O0, 42);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            h8.c cVar = this.googleMap;
            d dVar = new d(3, this, onMarkerClickListener);
            i8.f fVar = cVar.f9256a;
            try {
                h8.i iVar = new h8.i(dVar);
                Parcel O0 = fVar.O0();
                s7.b.c(O0, iVar);
                fVar.S0(O0, 30);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setOnMyLocationChangeListener(q0.a aVar) {
            h8.c cVar = this.googleMap;
            Objects.requireNonNull(aVar);
            l4 l4Var = new l4(aVar, 2);
            i8.f fVar = cVar.f9256a;
            try {
                h8.i iVar = new h8.i(l4Var);
                Parcel O0 = fVar.O0();
                s7.b.c(O0, iVar);
                fVar.S0(O0, 36);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setPadding(int i10, int i11, int i12, int i13) {
            h8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                i8.f fVar = cVar.f9256a;
                Parcel O0 = fVar.O0();
                O0.writeInt(i10);
                O0.writeInt(i11);
                O0.writeInt(i12);
                O0.writeInt(i13);
                fVar.S0(O0, 39);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private GoogleMapImpl(h8.c cVar) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = cVar;
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            h8.c cVar = this.googleMap;
            h8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            h8.i iVar = null;
            h8.b bVar = iCancelableCallback == null ? null : new h8.b() {
                {
                    GoogleMapImpl.this = this;
                }

                @Override
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                n6.l.i(aVar, "CameraUpdate must not be null.");
                i8.f fVar = cVar.f9256a;
                x6.a aVar2 = aVar.f9255a;
                if (bVar != null) {
                    iVar = new h8.i(bVar);
                }
                Parcel O0 = fVar.O0();
                s7.b.c(O0, aVar2);
                s7.b.c(O0, iVar);
                fVar.S0(O0, 6);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i10, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            h8.c cVar = this.googleMap;
            h8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            h8.i iVar = null;
            h8.b bVar = iCancelableCallback == null ? null : new h8.b() {
                {
                    GoogleMapImpl.this = this;
                }

                @Override
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                n6.l.i(aVar, "CameraUpdate must not be null.");
                i8.f fVar = cVar.f9256a;
                x6.a aVar2 = aVar.f9255a;
                if (bVar != null) {
                    iVar = new h8.i(bVar);
                }
                Parcel O0 = fVar.O0();
                s7.b.c(O0, aVar2);
                O0.writeInt(i10);
                s7.b.c(O0, iVar);
                fVar.S0(O0, 7);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private j8.e mapStyleOptions;

        private GoogleMapStyleOptions(j8.e eVar) {
            this.mapStyleOptions = eVar;
        }
    }

    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private h8.d mapView;
        private Runnable onLayoutListener;

        public class AnonymousClass1 extends h8.d {
            public AnonymousClass1(Context context) {
                super(context);
                GoogleMapView.this = r1;
            }

            public Boolean lambda$dispatchTouchEvent$0(MotionEvent motionEvent) {
                return Boolean.valueOf(super.dispatchTouchEvent(motionEvent));
            }

            public Boolean lambda$onInterceptTouchEvent$1(MotionEvent motionEvent) {
                return Boolean.valueOf(super.onInterceptTouchEvent(motionEvent));
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (GoogleMapView.this.dispatchInterceptor != null) {
                    return GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new o4(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (GoogleMapView.this.interceptInterceptor != null) {
                    return GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new o4(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                super.onLayout(z10, i10, i11, i12, i13);
                if (GoogleMapView.this.onLayoutListener != null) {
                    GoogleMapView.this.onLayoutListener.run();
                }
            }
        }

        private void findGlSurfaceView(View view) {
            if (view instanceof GLSurfaceView) {
                this.glSurfaceView = (GLSurfaceView) view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    findGlSurfaceView(viewGroup.getChildAt(i10));
                }
            }
        }

        public void lambda$getMapAsync$0(q0.a aVar, h8.c cVar) {
            aVar.accept(new GoogleMapImpl(cVar));
            findGlSurfaceView(this.mapView);
        }

        @Override
        public GLSurfaceView getGlSurfaceView() {
            return this.glSurfaceView;
        }

        @Override
        public void getMapAsync(q0.a aVar) {
            this.mapView.getMapAsync(new n4(this, aVar));
        }

        @Override
        public View getView() {
            return this.mapView;
        }

        @Override
        public void onCreate(Bundle bundle) {
            this.mapView.onCreate(bundle);
        }

        @Override
        public void onDestroy() {
            this.mapView.onDestroy();
        }

        @Override
        public void onLowMemory() {
            this.mapView.onLowMemory();
        }

        @Override
        public void onPause() {
            this.mapView.onPause();
        }

        @Override
        public void onResume() {
            this.mapView.onResume();
        }

        @Override
        public void setOnDispatchTouchEventInterceptor(IMapsProvider.ITouchInterceptor iTouchInterceptor) {
            this.dispatchInterceptor = iTouchInterceptor;
        }

        @Override
        public void setOnInterceptTouchEventInterceptor(IMapsProvider.ITouchInterceptor iTouchInterceptor) {
            this.interceptInterceptor = iTouchInterceptor;
        }

        @Override
        public void setOnLayoutListener(Runnable runnable) {
            this.onLayoutListener = runnable;
        }

        private GoogleMapView(Context context) {
            this.mapView = new AnonymousClass1(context);
        }
    }

    public static final class GoogleMarkerOptions implements IMapsProvider.IMarkerOptions {
        private j8.g markerOptions;

        @Override
        public IMapsProvider.IMarkerOptions anchor(float f7, float f10) {
            j8.g gVar = this.markerOptions;
            gVar.e = f7;
            gVar.f11825f = f10;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions flat(boolean z10) {
            this.markerOptions.f11827r = z10;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.d = v7.c9.a(bitmap);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions position(IMapsProvider.LatLng latLng) {
            this.markerOptions.f11822a = new LatLng(latLng.latitude, latLng.longitude);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions snippet(String str) {
            this.markerOptions.f11824c = str;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions title(String str) {
            this.markerOptions.f11823b = str;
            return this;
        }

        private GoogleMarkerOptions() {
            ?? obj = new Object();
            obj.e = 0.5f;
            obj.f11825f = 1.0f;
            obj.f11826n = true;
            obj.f11827r = false;
            obj.f11828s = 0.0f;
            obj.v = 0.5f;
            obj.f11829w = 0.0f;
            obj.f11830x = 1.0f;
            this.markerOptions = obj;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(int i10) {
            this.markerOptions.d = v7.c9.b(i10);
            return this;
        }
    }

    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private h8.g projection;

        @Override
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            h8.g gVar = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            gVar.getClass();
            try {
                i8.b bVar = gVar.f9260a;
                Parcel O0 = bVar.O0();
                s7.b.b(O0, latLng2);
                Parcel N0 = bVar.N0(O0, 2);
                x6.a L0 = x6.b.L0(N0.readStrongBinder());
                N0.recycle();
                return (Point) x6.b.M0(L0);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private GoogleProjection(h8.g gVar) {
            this.projection = gVar;
        }
    }

    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private h8.h uiSettings;

        @Override
        public void setCompassEnabled(boolean z10) {
            h8.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                i8.c cVar = hVar.f9261a;
                Parcel O0 = cVar.O0();
                int i10 = s7.b.f41803a;
                O0.writeInt(z10 ? 1 : 0);
                cVar.S0(O0, 2);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setMyLocationButtonEnabled(boolean z10) {
            h8.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                i8.c cVar = hVar.f9261a;
                Parcel O0 = cVar.O0();
                int i10 = s7.b.f41803a;
                O0.writeInt(z10 ? 1 : 0);
                cVar.S0(O0, 3);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setZoomControlsEnabled(boolean z10) {
            h8.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                i8.c cVar = hVar.f9261a;
                Parcel O0 = cVar.O0();
                int i10 = s7.b.f41803a;
                O0.writeInt(z10 ? 1 : 0);
                cVar.S0(O0, 1);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private GoogleUISettings(h8.h hVar) {
            this.uiSettings = hVar;
        }
    }

    @Override
    public int getInstallMapsString() {
        return R.string.InstallGoogleMaps;
    }

    @Override
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override
    public void initializeMaps(Context context) {
        synchronized (h8.e.class) {
            h8.e.b(context);
        }
    }

    @Override
    public IMapsProvider.IMapStyleOptions loadRawResourceStyle(Context context, int i10) {
        InputStream openRawResource = context.getResources().openRawResource(i10);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    u6.b.a(openRawResource);
                    u6.b.a(byteArrayOutputStream);
                    return new GoogleMapStyleOptions(new j8.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                }
            }
        } catch (IOException e) {
            String obj = e.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + obj);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            i8.a aVar = v7.x7.f43201a;
            n6.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel O0 = aVar.O0();
            s7.b.b(O0, latLng2);
            Parcel N0 = aVar.N0(O0, 8);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new GoogleCameraUpdate(new h8.a(L0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i10) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        n6.l.i(latLngBounds, "bounds must not be null");
        try {
            i8.a aVar = v7.x7.f43201a;
            n6.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel O0 = aVar.O0();
            s7.b.b(O0, latLngBounds);
            O0.writeInt(i10);
            Parcel N0 = aVar.N0(O0, 10);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new GoogleCameraUpdate(new h8.a(L0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f7) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            i8.a aVar = v7.x7.f43201a;
            n6.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel O0 = aVar.O0();
            s7.b.b(O0, latLng2);
            O0.writeFloat(f7);
            Parcel N0 = aVar.N0(O0, 9);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new GoogleCameraUpdate(new h8.a(L0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public IMapsProvider.ICircleOptions onCreateCircleOptions() {
        return new GoogleCircleOptions();
    }

    @Override
    public IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder() {
        return new GoogleLatLngBoundsBuilder();
    }

    @Override
    public IMapsProvider.IMapView onCreateMapView(Context context) {
        return new GoogleMapView(context);
    }

    @Override
    public IMapsProvider.IMarkerOptions onCreateMarkerOptions() {
        return new GoogleMarkerOptions();
    }
}

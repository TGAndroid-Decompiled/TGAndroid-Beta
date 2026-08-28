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
        private r7.a cameraUpdate;

        private GoogleCameraUpdate(r7.a aVar) {
            this.cameraUpdate = aVar;
        }
    }

    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private t7.b circleOptions;

        @Override
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            t7.b bVar = this.circleOptions;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            bVar.getClass();
            bVar.f47708a = latLng2;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions fillColor(int i9) {
            this.circleOptions.f47711e = i9;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions radius(double d) {
            this.circleOptions.f47709b = d;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeColor(int i9) {
            this.circleOptions.d = i9;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokePattern(List<IMapsProvider.PatternItem> list) {
            ArrayList arrayList = new ArrayList();
            for (IMapsProvider.PatternItem patternItem : list) {
                if (patternItem instanceof IMapsProvider.PatternItem.Gap) {
                    arrayList.add(new t7.c(((IMapsProvider.PatternItem.Gap) patternItem).length, 1));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new t7.c(((IMapsProvider.PatternItem.Dash) patternItem).length, 0));
                }
            }
            this.circleOptions.f47714r = arrayList;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeWidth(int i9) {
            this.circleOptions.f47710c = i9;
            return this;
        }

        private GoogleCircleOptions() {
            ?? obj = new Object();
            obj.f47708a = null;
            obj.f47709b = 0.0d;
            obj.f47710c = 10.0f;
            obj.d = -16777216;
            obj.f47711e = 0;
            obj.f47712f = 0.0f;
            obj.h = true;
            obj.f47713n = false;
            obj.f47714r = null;
            this.circleOptions = obj;
        }
    }

    public static final class GoogleLatLngBounds implements IMapsProvider.ILatLngBounds {
        private LatLngBounds bounds;

        @Override
        public IMapsProvider.LatLng getCenter() {
            LatLngBounds latLngBounds = this.bounds;
            LatLng latLng = latLngBounds.f3913a;
            double d = latLng.f3911a;
            LatLng latLng2 = latLngBounds.f3914b;
            double d9 = (d + latLng2.f3911a) / 2.0d;
            double d10 = latLng2.f3912b;
            double d11 = latLng.f3912b;
            if (d11 > d10) {
                d10 += 360.0d;
            }
            LatLng latLng3 = new LatLng(d9, (d10 + d11) / 2.0d);
            return new IMapsProvider.LatLng(latLng3.f3911a, latLng3.f3912b);
        }

        private GoogleLatLngBounds(LatLngBounds latLngBounds) {
            this.bounds = latLngBounds;
        }
    }

    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private t7.d builder;

        @Override
        public IMapsProvider.ILatLngBounds build() {
            t7.d dVar = this.builder;
            x5.l.j("no included points", !Double.isNaN(dVar.f47718c));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(dVar.f47716a, dVar.f47718c), new LatLng(dVar.f47717b, dVar.d)));
        }

        @Override
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            t7.d dVar = this.builder;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            dVar.getClass();
            double d = dVar.f47716a;
            double d9 = latLng2.f3911a;
            dVar.f47716a = Math.min(d, d9);
            dVar.f47717b = Math.max(dVar.f47717b, d9);
            boolean isNaN = Double.isNaN(dVar.f47718c);
            double d10 = latLng2.f3912b;
            if (isNaN) {
                dVar.f47718c = d10;
                dVar.d = d10;
                return this;
            }
            double d11 = dVar.f47718c;
            double d12 = dVar.d;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    dVar.f47718c = d10;
                    return this;
                }
                dVar.d = d10;
            }
            return this;
        }

        private GoogleLatLngBoundsBuilder() {
            ?? obj = new Object();
            obj.f47716a = Double.POSITIVE_INFINITY;
            obj.f47717b = Double.NEGATIVE_INFINITY;
            obj.f47718c = Double.NaN;
            obj.d = Double.NaN;
            this.builder = obj;
        }
    }

    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private r7.c googleMap;
        private Map<t7.a, GoogleCircle> implToAbsCircleMap;
        private Map<t7.f, GoogleMarker> implToAbsMarkerMap;

        public final class GoogleCircle implements IMapsProvider.ICircle {
            private t7.a circle;

            @Override
            public double getRadius() {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.f47707a;
                    Parcel L0 = fVar.L0(fVar.M0(), 6);
                    double readDouble = L0.readDouble();
                    L0.recycle();
                    return readDouble;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void remove() {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.f47707a;
                    fVar.Q0(fVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setCenter(IMapsProvider.LatLng latLng) {
                t7.a aVar = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.f47707a;
                    Parcel M0 = fVar.M0();
                    c7.b.b(M0, latLng2);
                    fVar.Q0(M0, 3);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setFillColor(int i9) {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.f47707a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i9);
                    fVar.Q0(M0, 11);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setRadius(double d) {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.f47707a;
                    Parcel M0 = fVar.M0();
                    M0.writeDouble(d);
                    fVar.Q0(M0, 5);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setStrokeColor(int i9) {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.f47707a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i9);
                    fVar.Q0(M0, 9);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            private GoogleCircle(t7.a aVar) {
                GoogleMapImpl.this = r1;
                this.circle = aVar;
            }
        }

        public final class GoogleMarker implements IMapsProvider.IMarker {
            private t7.f marker;

            @Override
            public IMapsProvider.LatLng getPosition() {
                LatLng createFromParcel;
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.f47720a;
                    Parcel L0 = iVar.L0(iVar.M0(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i9 = c7.b.f2324a;
                    if (L0.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = creator.createFromParcel(L0);
                    }
                    LatLng latLng = createFromParcel;
                    L0.recycle();
                    return new IMapsProvider.LatLng(latLng.f3911a, latLng.f3912b);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public Object getTag() {
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.f47720a;
                    Parcel L0 = iVar.L0(iVar.M0(), 30);
                    h6.a J0 = h6.b.J0(L0.readStrongBinder());
                    L0.recycle();
                    return h6.b.K0(J0);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void remove() {
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.f47720a;
                    iVar.Q0(iVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setIcon(Bitmap bitmap) {
                this.marker.a(g7.m7.a(bitmap));
            }

            @Override
            public void setPosition(IMapsProvider.LatLng latLng) {
                t7.f fVar = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.f47720a;
                    Parcel M0 = iVar.M0();
                    c7.b.b(M0, latLng2);
                    iVar.Q0(M0, 3);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setRotation(int i9) {
                t7.f fVar = this.marker;
                float f10 = i9;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.f47720a;
                    Parcel M0 = iVar.M0();
                    M0.writeFloat(f10);
                    iVar.Q0(M0, 22);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setTag(Object obj) {
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.a aVar = fVar.f47720a;
                    h6.b bVar = new h6.b(obj);
                    c7.i iVar = (c7.i) aVar;
                    Parcel M0 = iVar.M0();
                    c7.b.c(M0, bVar);
                    iVar.Q0(M0, 29);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            private GoogleMarker(t7.f fVar) {
                GoogleMapImpl.this = r1;
                this.marker = fVar;
            }

            @Override
            public void setIcon(int i9) {
                this.marker.a(g7.m7.b(i9));
            }
        }

        public static void lambda$setOnCameraMoveStartedListener$0(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener, int i9) {
            int i10 = 2;
            if (i9 != 2) {
                i10 = 3;
                if (i9 != 3) {
                    i10 = 1;
                }
            }
            onCameraMoveStartedListener.onCameraMoveStarted(i10);
        }

        public boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, t7.f fVar) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(fVar);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            c7.h hVar;
            r7.c cVar = this.googleMap;
            t7.b bVar = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            cVar.getClass();
            try {
                x5.l.i(bVar, "CircleOptions must not be null.");
                s7.f fVar = cVar.f47084a;
                Parcel M0 = fVar.M0();
                c7.b.b(M0, bVar);
                Parcel L0 = fVar.L0(M0, 35);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i9 = c7.g.f2326b;
                if (readStrongBinder == null) {
                    hVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (queryLocalInterface instanceof c7.h) {
                        hVar = (c7.h) queryLocalInterface;
                    } else {
                        hVar = new b7.a(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 1);
                    }
                }
                L0.recycle();
                t7.a aVar = new t7.a(hVar);
                GoogleCircle googleCircle = new GoogleCircle(aVar);
                this.implToAbsCircleMap.put(aVar, googleCircle);
                return googleCircle;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            c7.a aVar;
            t7.f fVar;
            r7.c cVar = this.googleMap;
            t7.g gVar = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            cVar.getClass();
            try {
                x5.l.i(gVar, "MarkerOptions must not be null.");
                s7.f fVar2 = cVar.f47084a;
                Parcel M0 = fVar2.M0();
                c7.b.b(M0, gVar);
                Parcel L0 = fVar2.L0(M0, 11);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i9 = c7.j.f2327b;
                if (readStrongBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof c7.a) {
                        aVar = (c7.a) queryLocalInterface;
                    } else {
                        aVar = new b7.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 1);
                    }
                }
                L0.recycle();
                if (aVar != 0) {
                    fVar = new t7.f(aVar);
                } else {
                    fVar = null;
                }
                GoogleMarker googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
                return googleMarker;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.f47084a;
                h6.a aVar2 = aVar.f47083a;
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                fVar.Q0(M0, 5);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public IMapsProvider.CameraPosition getCameraPosition() {
            CameraPosition createFromParcel;
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.f47084a;
                Parcel L0 = fVar.L0(fVar.M0(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i9 = c7.b.f2324a;
                if (L0.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = creator.createFromParcel(L0);
                }
                CameraPosition cameraPosition = createFromParcel;
                L0.recycle();
                LatLng latLng = cameraPosition.f3908a;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.f3911a, latLng.f3912b), cameraPosition.f3909b);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public float getMaxZoomLevel() {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.f47084a;
                Parcel L0 = fVar.L0(fVar.M0(), 2);
                float readFloat = L0.readFloat();
                L0.recycle();
                return readFloat;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public float getMinZoomLevel() {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.f47084a;
                Parcel L0 = fVar.L0(fVar.M0(), 3);
                float readFloat = L0.readFloat();
                L0.recycle();
                return readFloat;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public IMapsProvider.IProjection getProjection() {
            s7.b bVar;
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.f47084a;
                Parcel L0 = fVar.L0(fVar.M0(), 26);
                IBinder readStrongBinder = L0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (queryLocalInterface instanceof s7.b) {
                        bVar = (s7.b) queryLocalInterface;
                    } else {
                        bVar = new b7.a(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 1);
                    }
                }
                L0.recycle();
                return new GoogleProjection(new r7.g(bVar));
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public IMapsProvider.IUISettings getUiSettings() {
            s7.c cVar;
            r7.c cVar2 = this.googleMap;
            cVar2.getClass();
            try {
                if (cVar2.f47085b == null) {
                    s7.f fVar = cVar2.f47084a;
                    Parcel L0 = fVar.L0(fVar.M0(), 25);
                    IBinder readStrongBinder = L0.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (queryLocalInterface instanceof s7.c) {
                            cVar = (s7.c) queryLocalInterface;
                        } else {
                            cVar = new b7.a(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 1);
                        }
                    }
                    L0.recycle();
                    cVar2.f47085b = new r7.h(cVar);
                }
                return new GoogleUISettings(cVar2.f47085b);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.f47084a;
                h6.a aVar2 = aVar.f47083a;
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                fVar.Q0(M0, 4);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            t7.e eVar;
            r7.c cVar = this.googleMap;
            if (iMapStyleOptions != null) {
                eVar = ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            } else {
                eVar = null;
            }
            cVar.getClass();
            try {
                s7.f fVar = cVar.f47084a;
                Parcel M0 = fVar.M0();
                c7.b.b(M0, eVar);
                Parcel L0 = fVar.L0(M0, 91);
                L0.readInt();
                L0.recycle();
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setMapType(int i9) {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
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
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.f47084a;
                Parcel M0 = fVar.M0();
                int i9 = c7.b.f2324a;
                M0.writeInt(z10 ? 1 : 0);
                fVar.Q0(M0, 22);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnCameraIdleListener(Runnable runnable) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            g4 g4Var = new g4(runnable);
            s7.f fVar = cVar.f47084a;
            try {
                r7.i iVar = new r7.i(g4Var, (char) 0);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 99);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnCameraMoveListener(Runnable runnable) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            g4 g4Var = new g4(runnable);
            s7.f fVar = cVar.f47084a;
            try {
                r7.i iVar = new r7.i(g4Var);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 97);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            r7.c cVar = this.googleMap;
            d dVar = new d(onCameraMoveStartedListener, 5);
            s7.f fVar = cVar.f47084a;
            try {
                r7.i iVar = new r7.i(dVar);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 96);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnMapLoadedCallback(Runnable runnable) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            g4 g4Var = new g4(runnable);
            s7.f fVar = cVar.f47084a;
            try {
                r7.i iVar = new r7.i(g4Var, (byte) 0);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 42);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            r7.c cVar = this.googleMap;
            c cVar2 = new c(2, this, onMarkerClickListener);
            s7.f fVar = cVar.f47084a;
            try {
                r7.i iVar = new r7.i(cVar2);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 30);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnMyLocationChangeListener(q0.a aVar) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(aVar);
            f4 f4Var = new f4(aVar, 2);
            s7.f fVar = cVar.f47084a;
            try {
                r7.i iVar = new r7.i(f4Var);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 36);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setPadding(int i9, int i10, int i11, int i12) {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.f47084a;
                Parcel M0 = fVar.M0();
                M0.writeInt(i9);
                M0.writeInt(i10);
                M0.writeInt(i11);
                M0.writeInt(i12);
                fVar.Q0(M0, 39);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        private GoogleMapImpl(r7.c cVar) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = cVar;
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            r7.i iVar = null;
            r7.b bVar = iCancelableCallback == null ? null : new r7.b() {
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
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.f47084a;
                h6.a aVar2 = aVar.f47083a;
                if (bVar != null) {
                    iVar = new r7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 6);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i9, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            r7.i iVar = null;
            r7.b bVar = iCancelableCallback == null ? null : new r7.b() {
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
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.f47084a;
                h6.a aVar2 = aVar.f47083a;
                if (bVar != null) {
                    iVar = new r7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                M0.writeInt(i9);
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 7);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private t7.e mapStyleOptions;

        private GoogleMapStyleOptions(t7.e eVar) {
            this.mapStyleOptions = eVar;
        }
    }

    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private r7.d mapView;
        private Runnable onLayoutListener;

        public class AnonymousClass1 extends r7.d {
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
                    return GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new i4(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (GoogleMapView.this.interceptInterceptor != null) {
                    return GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new i4(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
                super.onLayout(z10, i9, i10, i11, i12);
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
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    findGlSurfaceView(viewGroup.getChildAt(i9));
                }
            }
        }

        public void lambda$getMapAsync$0(q0.a aVar, r7.c cVar) {
            aVar.accept(new GoogleMapImpl(cVar));
            findGlSurfaceView(this.mapView);
        }

        @Override
        public GLSurfaceView getGlSurfaceView() {
            return this.glSurfaceView;
        }

        @Override
        public void getMapAsync(q0.a aVar) {
            this.mapView.getMapAsync(new h4(this, aVar));
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
        private t7.g markerOptions;

        @Override
        public IMapsProvider.IMarkerOptions anchor(float f10, float f11) {
            t7.g gVar = this.markerOptions;
            gVar.f47724e = f10;
            gVar.f47725f = f11;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions flat(boolean z10) {
            this.markerOptions.f47727r = z10;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.d = g7.m7.a(bitmap);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions position(IMapsProvider.LatLng latLng) {
            this.markerOptions.f47721a = new LatLng(latLng.latitude, latLng.longitude);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions snippet(String str) {
            this.markerOptions.f47723c = str;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions title(String str) {
            this.markerOptions.f47722b = str;
            return this;
        }

        private GoogleMarkerOptions() {
            ?? obj = new Object();
            obj.f47724e = 0.5f;
            obj.f47725f = 1.0f;
            obj.f47726n = true;
            obj.f47727r = false;
            obj.f47728s = 0.0f;
            obj.v = 0.5f;
            obj.f47729w = 0.0f;
            obj.f47730x = 1.0f;
            this.markerOptions = obj;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(int i9) {
            this.markerOptions.d = g7.m7.b(i9);
            return this;
        }
    }

    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private r7.g projection;

        @Override
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            r7.g gVar = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            gVar.getClass();
            try {
                s7.b bVar = gVar.f47088a;
                Parcel M0 = bVar.M0();
                c7.b.b(M0, latLng2);
                Parcel L0 = bVar.L0(M0, 2);
                h6.a J0 = h6.b.J0(L0.readStrongBinder());
                L0.recycle();
                return (Point) h6.b.K0(J0);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        private GoogleProjection(r7.g gVar) {
            this.projection = gVar;
        }
    }

    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private r7.h uiSettings;

        @Override
        public void setCompassEnabled(boolean z10) {
            r7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                s7.c cVar = hVar.f47089a;
                Parcel M0 = cVar.M0();
                int i9 = c7.b.f2324a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 2);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setMyLocationButtonEnabled(boolean z10) {
            r7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                s7.c cVar = hVar.f47089a;
                Parcel M0 = cVar.M0();
                int i9 = c7.b.f2324a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 3);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setZoomControlsEnabled(boolean z10) {
            r7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                s7.c cVar = hVar.f47089a;
                Parcel M0 = cVar.M0();
                int i9 = c7.b.f2324a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 1);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        private GoogleUISettings(r7.h hVar) {
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
        synchronized (r7.e.class) {
            r7.e.a(context);
        }
    }

    @Override
    public IMapsProvider.IMapStyleOptions loadRawResourceStyle(Context context, int i9) {
        InputStream openRawResource = context.getResources().openRawResource(i9);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    e6.b.a(openRawResource);
                    e6.b.a(byteArrayOutputStream);
                    return new GoogleMapStyleOptions(new t7.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                }
            }
        } catch (IOException e10) {
            String obj = e10.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i9 + ": " + obj);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            s7.a aVar = g7.f7.f7179a;
            x5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            c7.b.b(M0, latLng2);
            Parcel L0 = aVar.L0(M0, 8);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new r7.a(J0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i9) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        x5.l.i(latLngBounds, "bounds must not be null");
        try {
            s7.a aVar = g7.f7.f7179a;
            x5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            c7.b.b(M0, latLngBounds);
            M0.writeInt(i9);
            Parcel L0 = aVar.L0(M0, 10);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new r7.a(J0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f10) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            s7.a aVar = g7.f7.f7179a;
            x5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            c7.b.b(M0, latLng2);
            M0.writeFloat(f10);
            Parcel L0 = aVar.L0(M0, 9);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new r7.a(J0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
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

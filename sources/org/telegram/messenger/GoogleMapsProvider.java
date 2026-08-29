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
        private t7.a cameraUpdate;

        private GoogleCameraUpdate(t7.a aVar) {
            this.cameraUpdate = aVar;
        }
    }

    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private v7.b circleOptions;

        @Override
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            v7.b bVar = this.circleOptions;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            bVar.getClass();
            bVar.f49438a = latLng2;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions fillColor(int i10) {
            this.circleOptions.f49441e = i10;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions radius(double d) {
            this.circleOptions.f49439b = d;
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
                    arrayList.add(new v7.c(((IMapsProvider.PatternItem.Gap) patternItem).length, 1));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new v7.c(((IMapsProvider.PatternItem.Dash) patternItem).length, 0));
                }
            }
            this.circleOptions.f49444r = arrayList;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeWidth(int i10) {
            this.circleOptions.f49440c = i10;
            return this;
        }

        private GoogleCircleOptions() {
            ?? obj = new Object();
            obj.f49438a = null;
            obj.f49439b = 0.0d;
            obj.f49440c = 10.0f;
            obj.d = -16777216;
            obj.f49441e = 0;
            obj.f49442f = 0.0f;
            obj.h = true;
            obj.f49443n = false;
            obj.f49444r = null;
            this.circleOptions = obj;
        }
    }

    public static final class GoogleLatLngBounds implements IMapsProvider.ILatLngBounds {
        private LatLngBounds bounds;

        @Override
        public IMapsProvider.LatLng getCenter() {
            LatLngBounds latLngBounds = this.bounds;
            LatLng latLng = latLngBounds.f4927a;
            double d = latLng.f4925a;
            LatLng latLng2 = latLngBounds.f4928b;
            double d10 = (d + latLng2.f4925a) / 2.0d;
            double d11 = latLng2.f4926b;
            double d12 = latLng.f4926b;
            if (d12 > d11) {
                d11 += 360.0d;
            }
            LatLng latLng3 = new LatLng(d10, (d11 + d12) / 2.0d);
            return new IMapsProvider.LatLng(latLng3.f4925a, latLng3.f4926b);
        }

        private GoogleLatLngBounds(LatLngBounds latLngBounds) {
            this.bounds = latLngBounds;
        }
    }

    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private v7.d builder;

        @Override
        public IMapsProvider.ILatLngBounds build() {
            v7.d dVar = this.builder;
            z5.l.j("no included points", !Double.isNaN(dVar.f49448c));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(dVar.f49446a, dVar.f49448c), new LatLng(dVar.f49447b, dVar.d)));
        }

        @Override
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            v7.d dVar = this.builder;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            dVar.getClass();
            double d = dVar.f49446a;
            double d10 = latLng2.f4925a;
            dVar.f49446a = Math.min(d, d10);
            dVar.f49447b = Math.max(dVar.f49447b, d10);
            boolean isNaN = Double.isNaN(dVar.f49448c);
            double d11 = latLng2.f4926b;
            if (isNaN) {
                dVar.f49448c = d11;
                dVar.d = d11;
                return this;
            }
            double d12 = dVar.f49448c;
            double d13 = dVar.d;
            if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
                if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                    dVar.f49448c = d11;
                    return this;
                }
                dVar.d = d11;
            }
            return this;
        }

        private GoogleLatLngBoundsBuilder() {
            ?? obj = new Object();
            obj.f49446a = Double.POSITIVE_INFINITY;
            obj.f49447b = Double.NEGATIVE_INFINITY;
            obj.f49448c = Double.NaN;
            obj.d = Double.NaN;
            this.builder = obj;
        }
    }

    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private t7.c googleMap;
        private Map<v7.a, GoogleCircle> implToAbsCircleMap;
        private Map<v7.f, GoogleMarker> implToAbsMarkerMap;

        public final class GoogleCircle implements IMapsProvider.ICircle {
            private v7.a circle;

            @Override
            public double getRadius() {
                v7.a aVar = this.circle;
                aVar.getClass();
                try {
                    e7.f fVar = (e7.f) aVar.f49437a;
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
                v7.a aVar = this.circle;
                aVar.getClass();
                try {
                    e7.f fVar = (e7.f) aVar.f49437a;
                    fVar.Q0(fVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setCenter(IMapsProvider.LatLng latLng) {
                v7.a aVar = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                aVar.getClass();
                try {
                    e7.f fVar = (e7.f) aVar.f49437a;
                    Parcel M0 = fVar.M0();
                    e7.b.b(M0, latLng2);
                    fVar.Q0(M0, 3);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setFillColor(int i10) {
                v7.a aVar = this.circle;
                aVar.getClass();
                try {
                    e7.f fVar = (e7.f) aVar.f49437a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i10);
                    fVar.Q0(M0, 11);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setRadius(double d) {
                v7.a aVar = this.circle;
                aVar.getClass();
                try {
                    e7.f fVar = (e7.f) aVar.f49437a;
                    Parcel M0 = fVar.M0();
                    M0.writeDouble(d);
                    fVar.Q0(M0, 5);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setStrokeColor(int i10) {
                v7.a aVar = this.circle;
                aVar.getClass();
                try {
                    e7.f fVar = (e7.f) aVar.f49437a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i10);
                    fVar.Q0(M0, 9);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            private GoogleCircle(v7.a aVar) {
                GoogleMapImpl.this = r1;
                this.circle = aVar;
            }
        }

        public final class GoogleMarker implements IMapsProvider.IMarker {
            private v7.f marker;

            @Override
            public IMapsProvider.LatLng getPosition() {
                LatLng createFromParcel;
                v7.f fVar = this.marker;
                fVar.getClass();
                try {
                    e7.i iVar = (e7.i) fVar.f49450a;
                    Parcel L0 = iVar.L0(iVar.M0(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i10 = e7.b.f5836a;
                    if (L0.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = creator.createFromParcel(L0);
                    }
                    LatLng latLng = createFromParcel;
                    L0.recycle();
                    return new IMapsProvider.LatLng(latLng.f4925a, latLng.f4926b);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public Object getTag() {
                v7.f fVar = this.marker;
                fVar.getClass();
                try {
                    e7.i iVar = (e7.i) fVar.f49450a;
                    Parcel L0 = iVar.L0(iVar.M0(), 30);
                    j6.a J0 = j6.b.J0(L0.readStrongBinder());
                    L0.recycle();
                    return j6.b.K0(J0);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void remove() {
                v7.f fVar = this.marker;
                fVar.getClass();
                try {
                    e7.i iVar = (e7.i) fVar.f49450a;
                    iVar.Q0(iVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setIcon(Bitmap bitmap) {
                this.marker.a(i7.h8.a(bitmap));
            }

            @Override
            public void setPosition(IMapsProvider.LatLng latLng) {
                v7.f fVar = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                fVar.getClass();
                try {
                    e7.i iVar = (e7.i) fVar.f49450a;
                    Parcel M0 = iVar.M0();
                    e7.b.b(M0, latLng2);
                    iVar.Q0(M0, 3);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setRotation(int i10) {
                v7.f fVar = this.marker;
                float f9 = i10;
                fVar.getClass();
                try {
                    e7.i iVar = (e7.i) fVar.f49450a;
                    Parcel M0 = iVar.M0();
                    M0.writeFloat(f9);
                    iVar.Q0(M0, 22);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override
            public void setTag(Object obj) {
                v7.f fVar = this.marker;
                fVar.getClass();
                try {
                    e7.a aVar = fVar.f49450a;
                    j6.b bVar = new j6.b(obj);
                    e7.i iVar = (e7.i) aVar;
                    Parcel M0 = iVar.M0();
                    e7.b.c(M0, bVar);
                    iVar.Q0(M0, 29);
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }

            private GoogleMarker(v7.f fVar) {
                GoogleMapImpl.this = r1;
                this.marker = fVar;
            }

            @Override
            public void setIcon(int i10) {
                this.marker.a(i7.h8.b(i10));
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

        public boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, v7.f fVar) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(fVar);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            e7.h hVar;
            t7.c cVar = this.googleMap;
            v7.b bVar = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            cVar.getClass();
            try {
                z5.l.i(bVar, "CircleOptions must not be null.");
                u7.f fVar = cVar.f48167a;
                Parcel M0 = fVar.M0();
                e7.b.b(M0, bVar);
                Parcel L0 = fVar.L0(M0, 35);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i10 = e7.g.f5838b;
                if (readStrongBinder == null) {
                    hVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (queryLocalInterface instanceof e7.h) {
                        hVar = (e7.h) queryLocalInterface;
                    } else {
                        hVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 4);
                    }
                }
                L0.recycle();
                v7.a aVar = new v7.a(hVar);
                GoogleCircle googleCircle = new GoogleCircle(aVar);
                this.implToAbsCircleMap.put(aVar, googleCircle);
                return googleCircle;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            e7.a aVar;
            v7.f fVar;
            t7.c cVar = this.googleMap;
            v7.g gVar = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            cVar.getClass();
            try {
                z5.l.i(gVar, "MarkerOptions must not be null.");
                u7.f fVar2 = cVar.f48167a;
                Parcel M0 = fVar2.M0();
                e7.b.b(M0, gVar);
                Parcel L0 = fVar2.L0(M0, 11);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i10 = e7.j.f5839b;
                if (readStrongBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof e7.a) {
                        aVar = (e7.a) queryLocalInterface;
                    } else {
                        aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
                    }
                }
                L0.recycle();
                if (aVar != 0) {
                    fVar = new v7.f(aVar);
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
            t7.c cVar = this.googleMap;
            t7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                z5.l.i(aVar, "CameraUpdate must not be null.");
                u7.f fVar = cVar.f48167a;
                j6.a aVar2 = aVar.f48166a;
                Parcel M0 = fVar.M0();
                e7.b.c(M0, aVar2);
                fVar.Q0(M0, 5);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public IMapsProvider.CameraPosition getCameraPosition() {
            CameraPosition createFromParcel;
            t7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                u7.f fVar = cVar.f48167a;
                Parcel L0 = fVar.L0(fVar.M0(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i10 = e7.b.f5836a;
                if (L0.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = creator.createFromParcel(L0);
                }
                CameraPosition cameraPosition = createFromParcel;
                L0.recycle();
                LatLng latLng = cameraPosition.f4922a;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.f4925a, latLng.f4926b), cameraPosition.f4923b);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public float getMaxZoomLevel() {
            t7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                u7.f fVar = cVar.f48167a;
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
            t7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                u7.f fVar = cVar.f48167a;
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
            u7.b bVar;
            t7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                u7.f fVar = cVar.f48167a;
                Parcel L0 = fVar.L0(fVar.M0(), 26);
                IBinder readStrongBinder = L0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (queryLocalInterface instanceof u7.b) {
                        bVar = (u7.b) queryLocalInterface;
                    } else {
                        bVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 4);
                    }
                }
                L0.recycle();
                return new GoogleProjection(new t7.g(bVar));
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public IMapsProvider.IUISettings getUiSettings() {
            u7.c cVar;
            t7.c cVar2 = this.googleMap;
            cVar2.getClass();
            try {
                if (cVar2.f48168b == null) {
                    u7.f fVar = cVar2.f48167a;
                    Parcel L0 = fVar.L0(fVar.M0(), 25);
                    IBinder readStrongBinder = L0.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (queryLocalInterface instanceof u7.c) {
                            cVar = (u7.c) queryLocalInterface;
                        } else {
                            cVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 4);
                        }
                    }
                    L0.recycle();
                    cVar2.f48168b = new t7.h(cVar);
                }
                return new GoogleUISettings(cVar2.f48168b);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            t7.c cVar = this.googleMap;
            t7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                z5.l.i(aVar, "CameraUpdate must not be null.");
                u7.f fVar = cVar.f48167a;
                j6.a aVar2 = aVar.f48166a;
                Parcel M0 = fVar.M0();
                e7.b.c(M0, aVar2);
                fVar.Q0(M0, 4);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            v7.e eVar;
            t7.c cVar = this.googleMap;
            if (iMapStyleOptions != null) {
                eVar = ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            } else {
                eVar = null;
            }
            cVar.getClass();
            try {
                u7.f fVar = cVar.f48167a;
                Parcel M0 = fVar.M0();
                e7.b.b(M0, eVar);
                Parcel L0 = fVar.L0(M0, 91);
                L0.readInt();
                L0.recycle();
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
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
            t7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                u7.f fVar = cVar.f48167a;
                Parcel M0 = fVar.M0();
                int i10 = e7.b.f5836a;
                M0.writeInt(z10 ? 1 : 0);
                fVar.Q0(M0, 22);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnCameraIdleListener(Runnable runnable) {
            t7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            i4 i4Var = new i4(runnable);
            u7.f fVar = cVar.f48167a;
            try {
                t7.i iVar = new t7.i(i4Var, (char) 0);
                Parcel M0 = fVar.M0();
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 99);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnCameraMoveListener(Runnable runnable) {
            t7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            i4 i4Var = new i4(runnable);
            u7.f fVar = cVar.f48167a;
            try {
                t7.i iVar = new t7.i(i4Var);
                Parcel M0 = fVar.M0();
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 97);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            t7.c cVar = this.googleMap;
            d dVar = new d(onCameraMoveStartedListener, 5);
            u7.f fVar = cVar.f48167a;
            try {
                t7.i iVar = new t7.i(dVar);
                Parcel M0 = fVar.M0();
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 96);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnMapLoadedCallback(Runnable runnable) {
            t7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            i4 i4Var = new i4(runnable);
            u7.f fVar = cVar.f48167a;
            try {
                t7.i iVar = new t7.i(i4Var, (byte) 0);
                Parcel M0 = fVar.M0();
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 42);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            t7.c cVar = this.googleMap;
            c cVar2 = new c(2, this, onMarkerClickListener);
            u7.f fVar = cVar.f48167a;
            try {
                t7.i iVar = new t7.i(cVar2);
                Parcel M0 = fVar.M0();
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 30);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setOnMyLocationChangeListener(q0.a aVar) {
            t7.c cVar = this.googleMap;
            Objects.requireNonNull(aVar);
            h4 h4Var = new h4(aVar, 2);
            u7.f fVar = cVar.f48167a;
            try {
                t7.i iVar = new t7.i(h4Var);
                Parcel M0 = fVar.M0();
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 36);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setPadding(int i10, int i11, int i12, int i13) {
            t7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                u7.f fVar = cVar.f48167a;
                Parcel M0 = fVar.M0();
                M0.writeInt(i10);
                M0.writeInt(i11);
                M0.writeInt(i12);
                M0.writeInt(i13);
                fVar.Q0(M0, 39);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        private GoogleMapImpl(t7.c cVar) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = cVar;
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            t7.c cVar = this.googleMap;
            t7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            t7.i iVar = null;
            t7.b bVar = iCancelableCallback == null ? null : new t7.b() {
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
                z5.l.i(aVar, "CameraUpdate must not be null.");
                u7.f fVar = cVar.f48167a;
                j6.a aVar2 = aVar.f48166a;
                if (bVar != null) {
                    iVar = new t7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                e7.b.c(M0, aVar2);
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 6);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i10, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            t7.c cVar = this.googleMap;
            t7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            t7.i iVar = null;
            t7.b bVar = iCancelableCallback == null ? null : new t7.b() {
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
                z5.l.i(aVar, "CameraUpdate must not be null.");
                u7.f fVar = cVar.f48167a;
                j6.a aVar2 = aVar.f48166a;
                if (bVar != null) {
                    iVar = new t7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                e7.b.c(M0, aVar2);
                M0.writeInt(i10);
                e7.b.c(M0, iVar);
                fVar.Q0(M0, 7);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private v7.e mapStyleOptions;

        private GoogleMapStyleOptions(v7.e eVar) {
            this.mapStyleOptions = eVar;
        }
    }

    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private t7.d mapView;
        private Runnable onLayoutListener;

        public class AnonymousClass1 extends t7.d {
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
                    return GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new k4(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (GoogleMapView.this.interceptInterceptor != null) {
                    return GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new k4(this, 1));
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

        public void lambda$getMapAsync$0(q0.a aVar, t7.c cVar) {
            aVar.accept(new GoogleMapImpl(cVar));
            findGlSurfaceView(this.mapView);
        }

        @Override
        public GLSurfaceView getGlSurfaceView() {
            return this.glSurfaceView;
        }

        @Override
        public void getMapAsync(q0.a aVar) {
            this.mapView.getMapAsync(new j4(this, aVar));
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
        private v7.g markerOptions;

        @Override
        public IMapsProvider.IMarkerOptions anchor(float f9, float f10) {
            v7.g gVar = this.markerOptions;
            gVar.f49454e = f9;
            gVar.f49455f = f10;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions flat(boolean z10) {
            this.markerOptions.f49457r = z10;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.d = i7.h8.a(bitmap);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions position(IMapsProvider.LatLng latLng) {
            this.markerOptions.f49451a = new LatLng(latLng.latitude, latLng.longitude);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions snippet(String str) {
            this.markerOptions.f49453c = str;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions title(String str) {
            this.markerOptions.f49452b = str;
            return this;
        }

        private GoogleMarkerOptions() {
            ?? obj = new Object();
            obj.f49454e = 0.5f;
            obj.f49455f = 1.0f;
            obj.f49456n = true;
            obj.f49457r = false;
            obj.f49458s = 0.0f;
            obj.v = 0.5f;
            obj.f49459w = 0.0f;
            obj.f49460x = 1.0f;
            this.markerOptions = obj;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(int i10) {
            this.markerOptions.d = i7.h8.b(i10);
            return this;
        }
    }

    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private t7.g projection;

        @Override
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            t7.g gVar = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            gVar.getClass();
            try {
                u7.b bVar = gVar.f48171a;
                Parcel M0 = bVar.M0();
                e7.b.b(M0, latLng2);
                Parcel L0 = bVar.L0(M0, 2);
                j6.a J0 = j6.b.J0(L0.readStrongBinder());
                L0.recycle();
                return (Point) j6.b.K0(J0);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        private GoogleProjection(t7.g gVar) {
            this.projection = gVar;
        }
    }

    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private t7.h uiSettings;

        @Override
        public void setCompassEnabled(boolean z10) {
            t7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                u7.c cVar = hVar.f48172a;
                Parcel M0 = cVar.M0();
                int i10 = e7.b.f5836a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 2);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setMyLocationButtonEnabled(boolean z10) {
            t7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                u7.c cVar = hVar.f48172a;
                Parcel M0 = cVar.M0();
                int i10 = e7.b.f5836a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 3);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override
        public void setZoomControlsEnabled(boolean z10) {
            t7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                u7.c cVar = hVar.f48172a;
                Parcel M0 = cVar.M0();
                int i10 = e7.b.f5836a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 1);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }

        private GoogleUISettings(t7.h hVar) {
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
        synchronized (t7.e.class) {
            t7.e.a(context);
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
                    g6.b.a(openRawResource);
                    g6.b.a(byteArrayOutputStream);
                    return new GoogleMapStyleOptions(new v7.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                }
            }
        } catch (IOException e10) {
            String obj = e10.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + obj);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            u7.a aVar = i7.u7.f8519a;
            z5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            e7.b.b(M0, latLng2);
            Parcel L0 = aVar.L0(M0, 8);
            j6.a J0 = j6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new t7.a(J0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i10) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        z5.l.i(latLngBounds, "bounds must not be null");
        try {
            u7.a aVar = i7.u7.f8519a;
            z5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            e7.b.b(M0, latLngBounds);
            M0.writeInt(i10);
            Parcel L0 = aVar.L0(M0, 10);
            j6.a J0 = j6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new t7.a(J0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f9) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            u7.a aVar = i7.u7.f8519a;
            z5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            e7.b.b(M0, latLng2);
            M0.writeFloat(f9);
            Parcel L0 = aVar.L0(M0, 9);
            j6.a J0 = j6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new t7.a(J0));
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

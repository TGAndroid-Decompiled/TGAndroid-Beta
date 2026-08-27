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

public class GoogleMapsProvider implements IMapsProvider {

    public static final class GoogleCameraUpdate implements IMapsProvider.ICameraUpdate {
        private s7.a cameraUpdate;

        private GoogleCameraUpdate(s7.a aVar) {
            this.cameraUpdate = aVar;
        }
    }

    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private u7.b circleOptions;

        @Override
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            u7.b bVar = this.circleOptions;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            bVar.getClass();
            bVar.f48430a = latLng2;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions fillColor(int i10) {
            this.circleOptions.f48433e = i10;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions radius(double d) {
            this.circleOptions.f48431b = d;
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
                    arrayList.add(new u7.c(((IMapsProvider.PatternItem.Gap) patternItem).length, 1));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new u7.c(((IMapsProvider.PatternItem.Dash) patternItem).length, 0));
                }
            }
            this.circleOptions.f48436r = arrayList;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeWidth(int i10) {
            this.circleOptions.f48432c = i10;
            return this;
        }

        private GoogleCircleOptions() {
            u7.b bVar = new u7.b();
            bVar.f48430a = null;
            bVar.f48431b = 0.0d;
            bVar.f48432c = 10.0f;
            bVar.d = -16777216;
            bVar.f48433e = 0;
            bVar.f48434f = 0.0f;
            bVar.h = true;
            bVar.f48435n = false;
            bVar.f48436r = null;
            this.circleOptions = bVar;
        }
    }

    public static final class GoogleLatLngBounds implements IMapsProvider.ILatLngBounds {
        private LatLngBounds bounds;

        @Override
        public IMapsProvider.LatLng getCenter() {
            LatLngBounds latLngBounds = this.bounds;
            LatLng latLng = latLngBounds.f4355a;
            double d = latLng.f4353a;
            LatLng latLng2 = latLngBounds.f4356b;
            double d10 = (d + latLng2.f4353a) / 2.0d;
            double d11 = latLng2.f4354b;
            double d12 = latLng.f4354b;
            if (d12 > d11) {
                d11 += 360.0d;
            }
            LatLng latLng3 = new LatLng(d10, (d11 + d12) / 2.0d);
            return new IMapsProvider.LatLng(latLng3.f4353a, latLng3.f4354b);
        }

        private GoogleLatLngBounds(LatLngBounds latLngBounds) {
            this.bounds = latLngBounds;
        }
    }

    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private u7.d builder;

        @Override
        public IMapsProvider.ILatLngBounds build() {
            u7.d dVar = this.builder;
            y5.l.j("no included points", !Double.isNaN(dVar.f48440c));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(dVar.f48438a, dVar.f48440c), new LatLng(dVar.f48439b, dVar.d)));
        }

        @Override
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            u7.d dVar = this.builder;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            dVar.getClass();
            double d = dVar.f48438a;
            double d10 = latLng2.f4353a;
            dVar.f48438a = Math.min(d, d10);
            dVar.f48439b = Math.max(dVar.f48439b, d10);
            boolean zIsNaN = Double.isNaN(dVar.f48440c);
            double d11 = latLng2.f4354b;
            if (zIsNaN) {
                dVar.f48440c = d11;
                dVar.d = d11;
                return this;
            }
            double d12 = dVar.f48440c;
            double d13 = dVar.d;
            if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
                if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                    dVar.f48440c = d11;
                    return this;
                }
                dVar.d = d11;
            }
            return this;
        }

        private GoogleLatLngBoundsBuilder() {
            u7.d dVar = new u7.d();
            dVar.f48438a = Double.POSITIVE_INFINITY;
            dVar.f48439b = Double.NEGATIVE_INFINITY;
            dVar.f48440c = Double.NaN;
            dVar.d = Double.NaN;
            this.builder = dVar;
        }
    }

    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private s7.c googleMap;
        private Map<u7.a, GoogleCircle> implToAbsCircleMap;
        private Map<u7.f, GoogleMarker> implToAbsMarkerMap;

        public final class GoogleCircle implements IMapsProvider.ICircle {
            private u7.a circle;

            @Override
            public double getRadius() {
                u7.a aVar = this.circle;
                aVar.getClass();
                try {
                    d7.f fVar = (d7.f) aVar.f48429a;
                    Parcel parcelL0 = fVar.L0(fVar.M0(), 6);
                    double d = parcelL0.readDouble();
                    parcelL0.recycle();
                    return d;
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void remove() {
                u7.a aVar = this.circle;
                aVar.getClass();
                try {
                    d7.f fVar = (d7.f) aVar.f48429a;
                    fVar.Q0(fVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void setCenter(IMapsProvider.LatLng latLng) {
                u7.a aVar = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                aVar.getClass();
                try {
                    d7.f fVar = (d7.f) aVar.f48429a;
                    Parcel parcelM0 = fVar.M0();
                    d7.b.b(parcelM0, latLng2);
                    fVar.Q0(parcelM0, 3);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void setFillColor(int i10) {
                u7.a aVar = this.circle;
                aVar.getClass();
                try {
                    d7.f fVar = (d7.f) aVar.f48429a;
                    Parcel parcelM0 = fVar.M0();
                    parcelM0.writeInt(i10);
                    fVar.Q0(parcelM0, 11);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void setRadius(double d) {
                u7.a aVar = this.circle;
                aVar.getClass();
                try {
                    d7.f fVar = (d7.f) aVar.f48429a;
                    Parcel parcelM0 = fVar.M0();
                    parcelM0.writeDouble(d);
                    fVar.Q0(parcelM0, 5);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void setStrokeColor(int i10) {
                u7.a aVar = this.circle;
                aVar.getClass();
                try {
                    d7.f fVar = (d7.f) aVar.f48429a;
                    Parcel parcelM0 = fVar.M0();
                    parcelM0.writeInt(i10);
                    fVar.Q0(parcelM0, 9);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            private GoogleCircle(u7.a aVar) {
                this.circle = aVar;
            }
        }

        public final class GoogleMarker implements IMapsProvider.IMarker {
            private u7.f marker;

            @Override
            public IMapsProvider.LatLng getPosition() {
                u7.f fVar = this.marker;
                fVar.getClass();
                try {
                    d7.i iVar = (d7.i) fVar.f48442a;
                    Parcel parcelL0 = iVar.L0(iVar.M0(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i10 = d7.b.f4868a;
                    LatLng latLngCreateFromParcel = parcelL0.readInt() == 0 ? null : creator.createFromParcel(parcelL0);
                    parcelL0.recycle();
                    return new IMapsProvider.LatLng(latLngCreateFromParcel.f4353a, latLngCreateFromParcel.f4354b);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public Object getTag() {
                u7.f fVar = this.marker;
                fVar.getClass();
                try {
                    d7.i iVar = (d7.i) fVar.f48442a;
                    Parcel parcelL0 = iVar.L0(iVar.M0(), 30);
                    i6.a aVarJ0 = i6.b.J0(parcelL0.readStrongBinder());
                    parcelL0.recycle();
                    return i6.b.K0(aVarJ0);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void remove() {
                u7.f fVar = this.marker;
                fVar.getClass();
                try {
                    d7.i iVar = (d7.i) fVar.f48442a;
                    iVar.Q0(iVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void setIcon(Bitmap bitmap) {
                this.marker.a(h7.r7.a(bitmap));
            }

            @Override
            public void setPosition(IMapsProvider.LatLng latLng) {
                u7.f fVar = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                fVar.getClass();
                try {
                    d7.i iVar = (d7.i) fVar.f48442a;
                    Parcel parcelM0 = iVar.M0();
                    d7.b.b(parcelM0, latLng2);
                    iVar.Q0(parcelM0, 3);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void setRotation(int i10) {
                u7.f fVar = this.marker;
                float f10 = i10;
                fVar.getClass();
                try {
                    d7.i iVar = (d7.i) fVar.f48442a;
                    Parcel parcelM0 = iVar.M0();
                    parcelM0.writeFloat(f10);
                    iVar.Q0(parcelM0, 22);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            @Override
            public void setTag(Object obj) {
                u7.f fVar = this.marker;
                fVar.getClass();
                try {
                    d7.a aVar = fVar.f48442a;
                    i6.b bVar = new i6.b(obj);
                    d7.i iVar = (d7.i) aVar;
                    Parcel parcelM0 = iVar.M0();
                    d7.b.c(parcelM0, bVar);
                    iVar.Q0(parcelM0, 29);
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            }

            private GoogleMarker(u7.f fVar) {
                this.marker = fVar;
            }

            @Override
            public void setIcon(int i10) {
                this.marker.a(h7.r7.b(i10));
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

        public boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, u7.f fVar) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(fVar);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            d7.h fVar;
            s7.c cVar = this.googleMap;
            u7.b bVar = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            cVar.getClass();
            try {
                y5.l.i(bVar, "CircleOptions must not be null.");
                t7.f fVar2 = cVar.f47804a;
                Parcel parcelM0 = fVar2.M0();
                d7.b.b(parcelM0, bVar);
                Parcel parcelL0 = fVar2.L0(parcelM0, 35);
                IBinder strongBinder = parcelL0.readStrongBinder();
                int i10 = d7.g.f4870b;
                if (strongBinder == null) {
                    fVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    fVar = iInterfaceQueryLocalInterface instanceof d7.h ? (d7.h) iInterfaceQueryLocalInterface : new d7.f(strongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 4);
                }
                parcelL0.recycle();
                u7.a aVar = new u7.a(fVar);
                GoogleCircle googleCircle = new GoogleCircle(aVar);
                this.implToAbsCircleMap.put(aVar, googleCircle);
                return googleCircle;
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            d7.a iVar;
            s7.c cVar = this.googleMap;
            u7.g gVar = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            cVar.getClass();
            try {
                y5.l.i(gVar, "MarkerOptions must not be null.");
                t7.f fVar = cVar.f47804a;
                Parcel parcelM0 = fVar.M0();
                d7.b.b(parcelM0, gVar);
                Parcel parcelL0 = fVar.L0(parcelM0, 11);
                IBinder strongBinder = parcelL0.readStrongBinder();
                int i10 = d7.j.f4871b;
                if (strongBinder == null) {
                    iVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    iVar = iInterfaceQueryLocalInterface instanceof d7.a ? (d7.a) iInterfaceQueryLocalInterface : new d7.i(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
                }
                parcelL0.recycle();
                u7.f fVar2 = iVar != null ? new u7.f(iVar) : null;
                GoogleMarker googleMarker = new GoogleMarker(fVar2);
                this.implToAbsMarkerMap.put(fVar2, googleMarker);
                return googleMarker;
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            s7.c cVar = this.googleMap;
            s7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                y5.l.i(aVar, "CameraUpdate must not be null.");
                t7.f fVar = cVar.f47804a;
                i6.a aVar2 = aVar.f47803a;
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, aVar2);
                fVar.Q0(parcelM0, 5);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public IMapsProvider.CameraPosition getCameraPosition() {
            s7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                t7.f fVar = cVar.f47804a;
                Parcel parcelL0 = fVar.L0(fVar.M0(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i10 = d7.b.f4868a;
                CameraPosition cameraPositionCreateFromParcel = parcelL0.readInt() == 0 ? null : creator.createFromParcel(parcelL0);
                parcelL0.recycle();
                LatLng latLng = cameraPositionCreateFromParcel.f4350a;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.f4353a, latLng.f4354b), cameraPositionCreateFromParcel.f4351b);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public float getMaxZoomLevel() {
            s7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                t7.f fVar = cVar.f47804a;
                Parcel parcelL0 = fVar.L0(fVar.M0(), 2);
                float f10 = parcelL0.readFloat();
                parcelL0.recycle();
                return f10;
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public float getMinZoomLevel() {
            s7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                t7.f fVar = cVar.f47804a;
                Parcel parcelL0 = fVar.L0(fVar.M0(), 3);
                float f10 = parcelL0.readFloat();
                parcelL0.recycle();
                return f10;
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public IMapsProvider.IProjection getProjection() {
            t7.b bVar;
            s7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                t7.f fVar = cVar.f47804a;
                Parcel parcelL0 = fVar.L0(fVar.M0(), 26);
                IBinder strongBinder = parcelL0.readStrongBinder();
                if (strongBinder == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    bVar = iInterfaceQueryLocalInterface instanceof t7.b ? (t7.b) iInterfaceQueryLocalInterface : new t7.b(strongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 4);
                }
                parcelL0.recycle();
                return new GoogleProjection(new s7.g(bVar));
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public IMapsProvider.IUISettings getUiSettings() {
            t7.c cVar;
            s7.c cVar2 = this.googleMap;
            cVar2.getClass();
            try {
                if (cVar2.f47805b == null) {
                    t7.f fVar = cVar2.f47804a;
                    Parcel parcelL0 = fVar.L0(fVar.M0(), 25);
                    IBinder strongBinder = parcelL0.readStrongBinder();
                    if (strongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        cVar = iInterfaceQueryLocalInterface instanceof t7.c ? (t7.c) iInterfaceQueryLocalInterface : new t7.c(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 4);
                    }
                    parcelL0.recycle();
                    cVar2.f47805b = new s7.h(cVar);
                }
                return new GoogleUISettings(cVar2.f47805b);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            s7.c cVar = this.googleMap;
            s7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                y5.l.i(aVar, "CameraUpdate must not be null.");
                t7.f fVar = cVar.f47804a;
                i6.a aVar2 = aVar.f47803a;
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, aVar2);
                fVar.Q0(parcelM0, 4);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            s7.c cVar = this.googleMap;
            u7.e eVar = iMapStyleOptions == null ? null : ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            cVar.getClass();
            try {
                t7.f fVar = cVar.f47804a;
                Parcel parcelM0 = fVar.M0();
                d7.b.b(parcelM0, eVar);
                Parcel parcelL0 = fVar.L0(parcelM0, 91);
                parcelL0.readInt();
                parcelL0.recycle();
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setMapType(int i10) {
            if (i10 == 0) {
                this.googleMap.a(1);
            } else if (i10 == 1) {
                this.googleMap.a(2);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.googleMap.a(4);
            }
        }

        @Override
        public void setMyLocationEnabled(boolean z10) {
            s7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                t7.f fVar = cVar.f47804a;
                Parcel parcelM0 = fVar.M0();
                int i10 = d7.b.f4868a;
                parcelM0.writeInt(z10 ? 1 : 0);
                fVar.Q0(parcelM0, 22);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setOnCameraIdleListener(Runnable runnable) {
            s7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            i4 i4Var = new i4(runnable);
            t7.f fVar = cVar.f47804a;
            try {
                s7.i iVar = new s7.i(i4Var, (char) 0);
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 99);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setOnCameraMoveListener(Runnable runnable) {
            s7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            i4 i4Var = new i4(runnable);
            t7.f fVar = cVar.f47804a;
            try {
                s7.i iVar = new s7.i(i4Var);
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 97);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            s7.c cVar = this.googleMap;
            d dVar = new d(onCameraMoveStartedListener, 5);
            t7.f fVar = cVar.f47804a;
            try {
                s7.i iVar = new s7.i(dVar);
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 96);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setOnMapLoadedCallback(Runnable runnable) {
            s7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            i4 i4Var = new i4(runnable);
            t7.f fVar = cVar.f47804a;
            try {
                s7.i iVar = new s7.i(i4Var, (byte) 0);
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 42);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            s7.c cVar = this.googleMap;
            c cVar2 = new c(2, this, onMarkerClickListener);
            t7.f fVar = cVar.f47804a;
            try {
                s7.i iVar = new s7.i(cVar2);
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 30);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setOnMyLocationChangeListener(q0.a aVar) {
            s7.c cVar = this.googleMap;
            Objects.requireNonNull(aVar);
            h4 h4Var = new h4(aVar, 2);
            t7.f fVar = cVar.f47804a;
            try {
                s7.i iVar = new s7.i(h4Var);
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 36);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setPadding(int i10, int i11, int i12, int i13) {
            s7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                t7.f fVar = cVar.f47804a;
                Parcel parcelM0 = fVar.M0();
                parcelM0.writeInt(i10);
                parcelM0.writeInt(i11);
                parcelM0.writeInt(i12);
                parcelM0.writeInt(i13);
                fVar.Q0(parcelM0, 39);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        private GoogleMapImpl(s7.c cVar) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = cVar;
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            s7.c cVar = this.googleMap;
            s7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            s7.i iVar = null;
            s7.b bVar = iCancelableCallback == null ? null : new s7.b() {
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
                y5.l.i(aVar, "CameraUpdate must not be null.");
                t7.f fVar = cVar.f47804a;
                i6.a aVar2 = aVar.f47803a;
                if (bVar != null) {
                    iVar = new s7.i(bVar);
                }
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, aVar2);
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 6);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i10, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            s7.c cVar = this.googleMap;
            s7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            s7.i iVar = null;
            s7.b bVar = iCancelableCallback == null ? null : new s7.b() {
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
                y5.l.i(aVar, "CameraUpdate must not be null.");
                t7.f fVar = cVar.f47804a;
                i6.a aVar2 = aVar.f47803a;
                if (bVar != null) {
                    iVar = new s7.i(bVar);
                }
                Parcel parcelM0 = fVar.M0();
                d7.b.c(parcelM0, aVar2);
                parcelM0.writeInt(i10);
                d7.b.c(parcelM0, iVar);
                fVar.Q0(parcelM0, 7);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }
    }

    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private u7.e mapStyleOptions;

        private GoogleMapStyleOptions(u7.e eVar) {
            this.mapStyleOptions = eVar;
        }
    }

    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private s7.d mapView;
        private Runnable onLayoutListener;

        public class AnonymousClass1 extends s7.d {
            public AnonymousClass1(Context context) {
                super(context);
            }

            public Boolean lambda$dispatchTouchEvent$0(MotionEvent motionEvent) {
                return Boolean.valueOf(super.dispatchTouchEvent(motionEvent));
            }

            public Boolean lambda$onInterceptTouchEvent$1(MotionEvent motionEvent) {
                return Boolean.valueOf(super.onInterceptTouchEvent(motionEvent));
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return GoogleMapView.this.dispatchInterceptor != null ? GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new k4(this, 0)) : super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return GoogleMapView.this.interceptInterceptor != null ? GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new k4(this, 1)) : super.onInterceptTouchEvent(motionEvent);
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

        public void lambda$getMapAsync$0(q0.a aVar, s7.c cVar) {
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
        private u7.g markerOptions;

        @Override
        public IMapsProvider.IMarkerOptions anchor(float f10, float f11) {
            u7.g gVar = this.markerOptions;
            gVar.f48446e = f10;
            gVar.f48447f = f11;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions flat(boolean z10) {
            this.markerOptions.f48449r = z10;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.d = h7.r7.a(bitmap);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions position(IMapsProvider.LatLng latLng) {
            this.markerOptions.f48443a = new LatLng(latLng.latitude, latLng.longitude);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions snippet(String str) {
            this.markerOptions.f48445c = str;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions title(String str) {
            this.markerOptions.f48444b = str;
            return this;
        }

        private GoogleMarkerOptions() {
            u7.g gVar = new u7.g();
            gVar.f48446e = 0.5f;
            gVar.f48447f = 1.0f;
            gVar.f48448n = true;
            gVar.f48449r = false;
            gVar.f48450s = 0.0f;
            gVar.v = 0.5f;
            gVar.f48451w = 0.0f;
            gVar.f48452x = 1.0f;
            this.markerOptions = gVar;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(int i10) {
            this.markerOptions.d = h7.r7.b(i10);
            return this;
        }
    }

    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private s7.g projection;

        @Override
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            s7.g gVar = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            gVar.getClass();
            try {
                t7.b bVar = gVar.f47808a;
                Parcel parcelM0 = bVar.M0();
                d7.b.b(parcelM0, latLng2);
                Parcel parcelL0 = bVar.L0(parcelM0, 2);
                i6.a aVarJ0 = i6.b.J0(parcelL0.readStrongBinder());
                parcelL0.recycle();
                return (Point) i6.b.K0(aVarJ0);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        private GoogleProjection(s7.g gVar) {
            this.projection = gVar;
        }
    }

    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private s7.h uiSettings;

        @Override
        public void setCompassEnabled(boolean z10) {
            s7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                t7.c cVar = hVar.f47809a;
                Parcel parcelM0 = cVar.M0();
                int i10 = d7.b.f4868a;
                parcelM0.writeInt(z10 ? 1 : 0);
                cVar.Q0(parcelM0, 2);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setMyLocationButtonEnabled(boolean z10) {
            s7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                t7.c cVar = hVar.f47809a;
                Parcel parcelM0 = cVar.M0();
                int i10 = d7.b.f4868a;
                parcelM0.writeInt(z10 ? 1 : 0);
                cVar.Q0(parcelM0, 3);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        @Override
        public void setZoomControlsEnabled(boolean z10) {
            s7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                t7.c cVar = hVar.f47809a;
                Parcel parcelM0 = cVar.M0();
                int i10 = d7.b.f4868a;
                parcelM0.writeInt(z10 ? 1 : 0);
                cVar.Q0(parcelM0, 1);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }

        private GoogleUISettings(s7.h hVar) {
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
        synchronized (s7.e.class) {
            s7.e.a(context);
        }
    }

    @Override
    public IMapsProvider.IMapStyleOptions loadRawResourceStyle(Context context, int i10) {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i11 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                    if (i11 == -1) {
                        f6.b.a(inputStreamOpenRawResource);
                        f6.b.a(byteArrayOutputStream);
                        return new GoogleMapStyleOptions(new u7.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                } catch (Throwable th) {
                    f6.b.a(inputStreamOpenRawResource);
                    f6.b.a(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e9) {
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + e9.toString());
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            t7.a aVar = h7.g7.f8402a;
            y5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel parcelM0 = aVar.M0();
            d7.b.b(parcelM0, latLng2);
            Parcel parcelL0 = aVar.L0(parcelM0, 8);
            i6.a aVarJ0 = i6.b.J0(parcelL0.readStrongBinder());
            parcelL0.recycle();
            return new GoogleCameraUpdate(new s7.a(aVarJ0));
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i10) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        y5.l.i(latLngBounds, "bounds must not be null");
        try {
            t7.a aVar = h7.g7.f8402a;
            y5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel parcelM0 = aVar.M0();
            d7.b.b(parcelM0, latLngBounds);
            parcelM0.writeInt(i10);
            Parcel parcelL0 = aVar.L0(parcelM0, 10);
            i6.a aVarJ0 = i6.b.J0(parcelL0.readStrongBinder());
            parcelL0.recycle();
            return new GoogleCameraUpdate(new s7.a(aVarJ0));
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f10) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            t7.a aVar = h7.g7.f8402a;
            y5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel parcelM0 = aVar.M0();
            d7.b.b(parcelM0, latLng2);
            parcelM0.writeFloat(f10);
            Parcel parcelL0 = aVar.L0(parcelM0, 9);
            i6.a aVarJ0 = i6.b.J0(parcelL0.readStrongBinder());
            parcelL0.recycle();
            return new GoogleCameraUpdate(new s7.a(aVarJ0));
        } catch (RemoteException e9) {
            throw new a7.c(e9);
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

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
import androidx.car.app.HostException;
import androidx.core.util.Consumer;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzj;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.internal.maps.zzy;
import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.internal.mlkit_vision_common.zzhf;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.internal.zzb;
import com.google.android.gms.maps.internal.zzbt;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.zza;
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
        private CameraUpdate cameraUpdate;

        private GoogleCameraUpdate(CameraUpdate cameraUpdate) {
            this.cameraUpdate = cameraUpdate;
        }
    }

    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private CircleOptions circleOptions;

        @Override
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            CircleOptions circleOptions = this.circleOptions;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            circleOptions.getClass();
            circleOptions.zza = latLng2;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions fillColor(int i) {
            this.circleOptions.zze = i;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions radius(double d) {
            this.circleOptions.zzb = d;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeColor(int i) {
            this.circleOptions.zzd = i;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokePattern(List<IMapsProvider.PatternItem> list) {
            ArrayList arrayList = new ArrayList();
            for (IMapsProvider.PatternItem patternItem : list) {
                if (patternItem instanceof IMapsProvider.PatternItem.Gap) {
                    arrayList.add(new Gap(((IMapsProvider.PatternItem.Gap) patternItem).length, 0));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new Gap(((IMapsProvider.PatternItem.Dash) patternItem).length, 1));
                }
            }
            this.circleOptions.zzi = arrayList;
            return this;
        }

        @Override
        public IMapsProvider.ICircleOptions strokeWidth(int i) {
            this.circleOptions.zzc = i;
            return this;
        }

        private GoogleCircleOptions() {
            CircleOptions circleOptions = new CircleOptions();
            circleOptions.zza = null;
            circleOptions.zzb = 0.0d;
            circleOptions.zzc = 10.0f;
            circleOptions.zzd = -16777216;
            circleOptions.zze = 0;
            circleOptions.zzf = 0.0f;
            circleOptions.zzg = true;
            circleOptions.zzh = false;
            circleOptions.zzi = null;
            this.circleOptions = circleOptions;
        }
    }

    public static final class GoogleLatLngBounds implements IMapsProvider.ILatLngBounds {
        private LatLngBounds bounds;

        @Override
        public IMapsProvider.LatLng getCenter() {
            LatLngBounds latLngBounds = this.bounds;
            LatLng latLng = latLngBounds.southwest;
            double d = latLng.latitude;
            LatLng latLng2 = latLngBounds.northeast;
            double d2 = (d + latLng2.latitude) / 2.0d;
            double d3 = latLng2.longitude;
            double d4 = latLng.longitude;
            if (d4 > d3) {
                d3 += 360.0d;
            }
            LatLng latLng3 = new LatLng(d2, (d3 + d4) / 2.0d);
            return new IMapsProvider.LatLng(latLng3.latitude, latLng3.longitude);
        }

        private GoogleLatLngBounds(LatLngBounds latLngBounds) {
            this.bounds = latLngBounds;
        }
    }

    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private LatLngBounds.Builder builder;

        @Override
        public IMapsProvider.ILatLngBounds build() {
            LatLngBounds.Builder builder = this.builder;
            zzah.checkState("no included points", !Double.isNaN(builder.zzc));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(builder.zza, builder.zzc), new LatLng(builder.zzb, builder.zzd)));
        }

        @Override
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            LatLngBounds.Builder builder = this.builder;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            builder.getClass();
            double d = builder.zza;
            double d2 = latLng2.latitude;
            builder.zza = Math.min(d, d2);
            builder.zzb = Math.max(builder.zzb, d2);
            boolean zIsNaN = Double.isNaN(builder.zzc);
            double d3 = latLng2.longitude;
            if (zIsNaN) {
                builder.zzc = d3;
                builder.zzd = d3;
                return this;
            }
            double d4 = builder.zzc;
            double d5 = builder.zzd;
            if (d4 > d5 ? !(d4 <= d3 || d3 <= d5) : !(d4 <= d3 && d3 <= d5)) {
                if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - d5) + 360.0d) % 360.0d) {
                    builder.zzc = d3;
                    return this;
                }
                builder.zzd = d3;
            }
            return this;
        }

        private GoogleLatLngBoundsBuilder() {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            builder.zza = Double.POSITIVE_INFINITY;
            builder.zzb = Double.NEGATIVE_INFINITY;
            builder.zzc = Double.NaN;
            builder.zzd = Double.NaN;
            this.builder = builder;
        }
    }

    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private GoogleMap googleMap;
        private Map<Circle, GoogleCircle> implToAbsCircleMap;
        private Map<Marker, GoogleMarker> implToAbsMarkerMap;

        public final class GoogleCircle implements IMapsProvider.ICircle {
            private Circle circle;

            @Override
            public double getRadius() {
                Circle circle = this.circle;
                circle.getClass();
                try {
                    zzj zzjVar = (zzj) circle.zza;
                    Parcel parcelZzH = zzjVar.zzH(zzjVar.zza(), 6);
                    double d = parcelZzH.readDouble();
                    parcelZzH.recycle();
                    return d;
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void remove() {
                Circle circle = this.circle;
                circle.getClass();
                try {
                    zzj zzjVar = (zzj) circle.zza;
                    zzjVar.zzc(zzjVar.zza(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void setCenter(IMapsProvider.LatLng latLng) {
                Circle circle = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                circle.getClass();
                try {
                    zzj zzjVar = (zzj) circle.zza;
                    Parcel parcelZza = zzjVar.zza();
                    zzc.zze(parcelZza, latLng2);
                    zzjVar.zzc(parcelZza, 3);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void setFillColor(int i) {
                Circle circle = this.circle;
                circle.getClass();
                try {
                    zzj zzjVar = (zzj) circle.zza;
                    Parcel parcelZza = zzjVar.zza();
                    parcelZza.writeInt(i);
                    zzjVar.zzc(parcelZza, 11);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void setRadius(double d) {
                Circle circle = this.circle;
                circle.getClass();
                try {
                    zzj zzjVar = (zzj) circle.zza;
                    Parcel parcelZza = zzjVar.zza();
                    parcelZza.writeDouble(d);
                    zzjVar.zzc(parcelZza, 5);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void setStrokeColor(int i) {
                Circle circle = this.circle;
                circle.getClass();
                try {
                    zzj zzjVar = (zzj) circle.zza;
                    Parcel parcelZza = zzjVar.zza();
                    parcelZza.writeInt(i);
                    zzjVar.zzc(parcelZza, 9);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            private GoogleCircle(Circle circle) {
                this.circle = circle;
            }
        }

        public final class GoogleMarker implements IMapsProvider.IMarker {
            private Marker marker;

            @Override
            public IMapsProvider.LatLng getPosition() {
                Marker marker = this.marker;
                marker.getClass();
                try {
                    zzy zzyVar = (zzy) marker.zza;
                    Parcel parcelZzH = zzyVar.zzH(zzyVar.zza(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i = zzc.$r8$clinit;
                    LatLng latLngCreateFromParcel = parcelZzH.readInt() == 0 ? null : creator.createFromParcel(parcelZzH);
                    parcelZzH.recycle();
                    return new IMapsProvider.LatLng(latLngCreateFromParcel.latitude, latLngCreateFromParcel.longitude);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public Object getTag() {
                Marker marker = this.marker;
                marker.getClass();
                try {
                    zzy zzyVar = (zzy) marker.zza;
                    Parcel parcelZzH = zzyVar.zzH(zzyVar.zza(), 30);
                    IObjectWrapper iObjectWrapperAsInterface = ObjectWrapper.asInterface(parcelZzH.readStrongBinder());
                    parcelZzH.recycle();
                    return ObjectWrapper.unwrap(iObjectWrapperAsInterface);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void remove() {
                Marker marker = this.marker;
                marker.getClass();
                try {
                    zzy zzyVar = (zzy) marker.zza;
                    zzyVar.zzc(zzyVar.zza(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void setIcon(Bitmap bitmap) {
                this.marker.setIcon(zzhf.fromBitmap(bitmap));
            }

            @Override
            public void setPosition(IMapsProvider.LatLng latLng) {
                Marker marker = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                marker.getClass();
                try {
                    zzy zzyVar = (zzy) marker.zza;
                    Parcel parcelZza = zzyVar.zza();
                    zzc.zze(parcelZza, latLng2);
                    zzyVar.zzc(parcelZza, 3);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void setRotation(int i) {
                Marker marker = this.marker;
                float f = i;
                marker.getClass();
                try {
                    zzy zzyVar = (zzy) marker.zza;
                    Parcel parcelZza = zzyVar.zza();
                    parcelZza.writeFloat(f);
                    zzyVar.zzc(parcelZza, 22);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            @Override
            public void setTag(Object obj) {
                Marker marker = this.marker;
                marker.getClass();
                try {
                    zzaa zzaaVar = marker.zza;
                    ObjectWrapper objectWrapper = new ObjectWrapper(obj);
                    zzy zzyVar = (zzy) zzaaVar;
                    Parcel parcelZza = zzyVar.zza();
                    zzc.zzg(parcelZza, objectWrapper);
                    zzyVar.zzc(parcelZza, 29);
                } catch (RemoteException e) {
                    throw new HostException(e);
                }
            }

            private GoogleMarker(Marker marker) {
                this.marker = marker;
            }

            @Override
            public void setIcon(int i) {
                this.marker.setIcon(zzhf.fromResource(i));
            }
        }

        public static void lambda$setOnCameraMoveStartedListener$0(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener, int i) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 1;
                }
            }
            onCameraMoveStartedListener.onCameraMoveStarted(i2);
        }

        public boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, Marker marker) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(marker);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(marker);
                this.implToAbsMarkerMap.put(marker, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            zzl zzjVar;
            GoogleMap googleMap = this.googleMap;
            CircleOptions circleOptions = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            googleMap.getClass();
            try {
                zzah.checkNotNull(circleOptions, "CircleOptions must not be null.");
                zzg zzgVar = googleMap.zza;
                Parcel parcelZza = zzgVar.zza();
                zzc.zze(parcelZza, circleOptions);
                Parcel parcelZzH = zzgVar.zzH(parcelZza, 35);
                IBinder strongBinder = parcelZzH.readStrongBinder();
                int i = zzk.$r8$clinit;
                if (strongBinder == null) {
                    zzjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    zzjVar = iInterfaceQueryLocalInterface instanceof zzl ? (zzl) iInterfaceQueryLocalInterface : new zzj(strongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 5);
                }
                parcelZzH.recycle();
                Circle circle = new Circle(zzjVar);
                GoogleCircle googleCircle = new GoogleCircle(circle);
                this.implToAbsCircleMap.put(circle, googleCircle);
                return googleCircle;
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            zzaa zzyVar;
            GoogleMap googleMap = this.googleMap;
            MarkerOptions markerOptions = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            googleMap.getClass();
            try {
                zzah.checkNotNull(markerOptions, "MarkerOptions must not be null.");
                zzg zzgVar = googleMap.zza;
                Parcel parcelZza = zzgVar.zza();
                zzc.zze(parcelZza, markerOptions);
                Parcel parcelZzH = zzgVar.zzH(parcelZza, 11);
                IBinder strongBinder = parcelZzH.readStrongBinder();
                int i = zzz.$r8$clinit;
                if (strongBinder == null) {
                    zzyVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    zzyVar = iInterfaceQueryLocalInterface instanceof zzaa ? (zzaa) iInterfaceQueryLocalInterface : new zzy(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 5);
                }
                parcelZzH.recycle();
                Marker marker = zzyVar != null ? new Marker(zzyVar) : null;
                GoogleMarker googleMarker = new GoogleMarker(marker);
                this.implToAbsMarkerMap.put(marker, googleMarker);
                return googleMarker;
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            GoogleMap googleMap = this.googleMap;
            CameraUpdate cameraUpdate = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            googleMap.getClass();
            try {
                zzah.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
                zzg zzgVar = googleMap.zza;
                IObjectWrapper iObjectWrapper = cameraUpdate.zza;
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, iObjectWrapper);
                zzgVar.zzc(parcelZza, 5);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public IMapsProvider.CameraPosition getCameraPosition() {
            GoogleMap googleMap = this.googleMap;
            googleMap.getClass();
            try {
                zzg zzgVar = googleMap.zza;
                Parcel parcelZzH = zzgVar.zzH(zzgVar.zza(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i = zzc.$r8$clinit;
                CameraPosition cameraPositionCreateFromParcel = parcelZzH.readInt() == 0 ? null : creator.createFromParcel(parcelZzH);
                parcelZzH.recycle();
                LatLng latLng = cameraPositionCreateFromParcel.target;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.latitude, latLng.longitude), cameraPositionCreateFromParcel.zoom);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public float getMaxZoomLevel() {
            GoogleMap googleMap = this.googleMap;
            googleMap.getClass();
            try {
                zzg zzgVar = googleMap.zza;
                Parcel parcelZzH = zzgVar.zzH(zzgVar.zza(), 2);
                float f = parcelZzH.readFloat();
                parcelZzH.recycle();
                return f;
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public float getMinZoomLevel() {
            GoogleMap googleMap = this.googleMap;
            googleMap.getClass();
            try {
                zzg zzgVar = googleMap.zza;
                Parcel parcelZzH = zzgVar.zzH(zzgVar.zza(), 3);
                float f = parcelZzH.readFloat();
                parcelZzH.recycle();
                return f;
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public IMapsProvider.IProjection getProjection() {
            zzbt zzbtVar;
            GoogleMap googleMap = this.googleMap;
            googleMap.getClass();
            try {
                zzg zzgVar = googleMap.zza;
                Parcel parcelZzH = zzgVar.zzH(zzgVar.zza(), 26);
                IBinder strongBinder = parcelZzH.readStrongBinder();
                if (strongBinder == null) {
                    zzbtVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    zzbtVar = iInterfaceQueryLocalInterface instanceof zzbt ? (zzbt) iInterfaceQueryLocalInterface : new zzbt(strongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 5);
                }
                parcelZzH.recycle();
                return new GoogleProjection(new Projection(zzbtVar));
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public IMapsProvider.IUISettings getUiSettings() {
            zzbz zzbzVar;
            GoogleMap googleMap = this.googleMap;
            googleMap.getClass();
            try {
                if (googleMap.zzc == null) {
                    zzg zzgVar = googleMap.zza;
                    Parcel parcelZzH = zzgVar.zzH(zzgVar.zza(), 25);
                    IBinder strongBinder = parcelZzH.readStrongBinder();
                    if (strongBinder == null) {
                        zzbzVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        zzbzVar = iInterfaceQueryLocalInterface instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface : new zzbz(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 5);
                    }
                    parcelZzH.recycle();
                    googleMap.zzc = new UiSettings(zzbzVar);
                }
                return new GoogleUISettings(googleMap.zzc);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            GoogleMap googleMap = this.googleMap;
            CameraUpdate cameraUpdate = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            googleMap.getClass();
            try {
                zzah.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
                zzg zzgVar = googleMap.zza;
                IObjectWrapper iObjectWrapper = cameraUpdate.zza;
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, iObjectWrapper);
                zzgVar.zzc(parcelZza, 4);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            GoogleMap googleMap = this.googleMap;
            MapStyleOptions mapStyleOptions = iMapStyleOptions == null ? null : ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            googleMap.getClass();
            try {
                zzg zzgVar = googleMap.zza;
                Parcel parcelZza = zzgVar.zza();
                zzc.zze(parcelZza, mapStyleOptions);
                Parcel parcelZzH = zzgVar.zzH(parcelZza, 91);
                parcelZzH.readInt();
                parcelZzH.recycle();
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setMapType(int i) {
            if (i == 0) {
                this.googleMap.setMapType(1);
            } else if (i == 1) {
                this.googleMap.setMapType(2);
            } else {
                if (i != 2) {
                    return;
                }
                this.googleMap.setMapType(4);
            }
        }

        @Override
        public void setMyLocationEnabled(boolean z) {
            GoogleMap googleMap = this.googleMap;
            googleMap.getClass();
            try {
                zzg zzgVar = googleMap.zza;
                Parcel parcelZza = zzgVar.zza();
                int i = zzc.$r8$clinit;
                parcelZza.writeInt(z ? 1 : 0);
                zzgVar.zzc(parcelZza, 22);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setOnCameraIdleListener(Runnable runnable) {
            GoogleMap googleMap = this.googleMap;
            Objects.requireNonNull(runnable);
            GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1 googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1 = new GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1(runnable);
            zzg zzgVar = googleMap.zza;
            try {
                zza zzaVar = new zza(googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1, (char) 0);
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 99);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setOnCameraMoveListener(Runnable runnable) {
            GoogleMap googleMap = this.googleMap;
            Objects.requireNonNull(runnable);
            GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1 googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1 = new GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1(runnable);
            zzg zzgVar = googleMap.zza;
            try {
                zza zzaVar = new zza(googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1);
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 97);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            GoogleMap googleMap = this.googleMap;
            BillingController$$ExternalSyntheticLambda0 billingController$$ExternalSyntheticLambda0 = new BillingController$$ExternalSyntheticLambda0(onCameraMoveStartedListener, 5);
            zzg zzgVar = googleMap.zza;
            try {
                zza zzaVar = new zza(billingController$$ExternalSyntheticLambda0);
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 96);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setOnMapLoadedCallback(Runnable runnable) {
            GoogleMap googleMap = this.googleMap;
            Objects.requireNonNull(runnable);
            GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1 googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1 = new GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1(runnable);
            zzg zzgVar = googleMap.zza;
            try {
                zza zzaVar = new zza(googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1, (byte) 0);
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 42);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            GoogleMap googleMap = this.googleMap;
            GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda3 googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda3 = new GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda3(0, this, onMarkerClickListener);
            zzg zzgVar = googleMap.zza;
            try {
                zza zzaVar = new zza(googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda3);
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 30);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setOnMyLocationChangeListener(Consumer consumer) {
            GoogleMap googleMap = this.googleMap;
            Objects.requireNonNull(consumer);
            GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0 googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0 = new GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0(consumer, 0);
            zzg zzgVar = googleMap.zza;
            try {
                zza zzaVar = new zza(googleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0);
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 36);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setPadding(int i, int i2, int i3, int i4) {
            GoogleMap googleMap = this.googleMap;
            googleMap.getClass();
            try {
                zzg zzgVar = googleMap.zza;
                Parcel parcelZza = zzgVar.zza();
                parcelZza.writeInt(i);
                parcelZza.writeInt(i2);
                parcelZza.writeInt(i3);
                parcelZza.writeInt(i4);
                zzgVar.zzc(parcelZza, 39);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        private GoogleMapImpl(GoogleMap googleMap) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = googleMap;
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            GoogleMap googleMap = this.googleMap;
            CameraUpdate cameraUpdate = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            zza zzaVar = null;
            GoogleMap.CancelableCallback cancelableCallback = iCancelableCallback == null ? null : new GoogleMap.CancelableCallback() {
                @Override
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            googleMap.getClass();
            try {
                zzah.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
                zzg zzgVar = googleMap.zza;
                IObjectWrapper iObjectWrapper = cameraUpdate.zza;
                if (cancelableCallback != null) {
                    zzaVar = new zza(cancelableCallback);
                }
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, iObjectWrapper);
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 6);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            GoogleMap googleMap = this.googleMap;
            CameraUpdate cameraUpdate = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            zza zzaVar = null;
            GoogleMap.CancelableCallback cancelableCallback = iCancelableCallback == null ? null : new GoogleMap.CancelableCallback() {
                @Override
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            googleMap.getClass();
            try {
                zzah.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
                zzg zzgVar = googleMap.zza;
                IObjectWrapper iObjectWrapper = cameraUpdate.zza;
                if (cancelableCallback != null) {
                    zzaVar = new zza(cancelableCallback);
                }
                Parcel parcelZza = zzgVar.zza();
                zzc.zzg(parcelZza, iObjectWrapper);
                parcelZza.writeInt(i);
                zzc.zzg(parcelZza, zzaVar);
                zzgVar.zzc(parcelZza, 7);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }
    }

    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private MapStyleOptions mapStyleOptions;

        private GoogleMapStyleOptions(MapStyleOptions mapStyleOptions) {
            this.mapStyleOptions = mapStyleOptions;
        }
    }

    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private MapView mapView;
        private Runnable onLayoutListener;

        public class AnonymousClass1 extends MapView {
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
                return GoogleMapView.this.dispatchInterceptor != null ? GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new GoogleMapsProvider$GoogleMapView$1$$ExternalSyntheticLambda0(this, 0)) : super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return GoogleMapView.this.interceptInterceptor != null ? GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new GoogleMapsProvider$GoogleMapView$1$$ExternalSyntheticLambda0(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
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
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    findGlSurfaceView(viewGroup.getChildAt(i));
                }
            }
        }

        public void lambda$getMapAsync$0(Consumer consumer, GoogleMap googleMap) {
            consumer.accept(new GoogleMapImpl(googleMap));
            findGlSurfaceView(this.mapView);
        }

        @Override
        public GLSurfaceView getGlSurfaceView() {
            return this.glSurfaceView;
        }

        @Override
        public void getMapAsync(Consumer consumer) {
            this.mapView.getMapAsync(new GoogleMapsProvider$GoogleMapView$$ExternalSyntheticLambda0(this, consumer));
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
        private MarkerOptions markerOptions;

        @Override
        public IMapsProvider.IMarkerOptions anchor(float f, float f2) {
            MarkerOptions markerOptions = this.markerOptions;
            markerOptions.zze = f;
            markerOptions.zzf = f2;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions flat(boolean z) {
            this.markerOptions.zzi = z;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.zzd = zzhf.fromBitmap(bitmap);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions position(IMapsProvider.LatLng latLng) {
            this.markerOptions.zza = new LatLng(latLng.latitude, latLng.longitude);
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions snippet(String str) {
            this.markerOptions.zzc = str;
            return this;
        }

        @Override
        public IMapsProvider.IMarkerOptions title(String str) {
            this.markerOptions.zzb = str;
            return this;
        }

        private GoogleMarkerOptions() {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.zze = 0.5f;
            markerOptions.zzf = 1.0f;
            markerOptions.zzh = true;
            markerOptions.zzi = false;
            markerOptions.zzj = 0.0f;
            markerOptions.zzk = 0.5f;
            markerOptions.zzl = 0.0f;
            markerOptions.zzm = 1.0f;
            this.markerOptions = markerOptions;
        }

        @Override
        public IMapsProvider.IMarkerOptions icon(int i) {
            this.markerOptions.zzd = zzhf.fromResource(i);
            return this;
        }
    }

    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private Projection projection;

        @Override
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            Projection projection = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            projection.getClass();
            try {
                zzbt zzbtVar = projection.zza;
                Parcel parcelZza = zzbtVar.zza();
                zzc.zze(parcelZza, latLng2);
                Parcel parcelZzH = zzbtVar.zzH(parcelZza, 2);
                IObjectWrapper iObjectWrapperAsInterface = ObjectWrapper.asInterface(parcelZzH.readStrongBinder());
                parcelZzH.recycle();
                return (Point) ObjectWrapper.unwrap(iObjectWrapperAsInterface);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        private GoogleProjection(Projection projection) {
            this.projection = projection;
        }
    }

    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private UiSettings uiSettings;

        @Override
        public void setCompassEnabled(boolean z) {
            UiSettings uiSettings = this.uiSettings;
            uiSettings.getClass();
            try {
                zzbz zzbzVar = uiSettings.zza;
                Parcel parcelZza = zzbzVar.zza();
                int i = zzc.$r8$clinit;
                parcelZza.writeInt(z ? 1 : 0);
                zzbzVar.zzc(parcelZza, 2);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setMyLocationButtonEnabled(boolean z) {
            UiSettings uiSettings = this.uiSettings;
            uiSettings.getClass();
            try {
                zzbz zzbzVar = uiSettings.zza;
                Parcel parcelZza = zzbzVar.zza();
                int i = zzc.$r8$clinit;
                parcelZza.writeInt(z ? 1 : 0);
                zzbzVar.zzc(parcelZza, 3);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        @Override
        public void setZoomControlsEnabled(boolean z) {
            UiSettings uiSettings = this.uiSettings;
            uiSettings.getClass();
            try {
                zzbz zzbzVar = uiSettings.zza;
                Parcel parcelZza = zzbzVar.zza();
                int i = zzc.$r8$clinit;
                parcelZza.writeInt(z ? 1 : 0);
                zzbzVar.zzc(parcelZza, 1);
            } catch (RemoteException e) {
                throw new HostException(e);
            }
        }

        private GoogleUISettings(UiSettings uiSettings) {
            this.uiSettings = uiSettings;
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
        synchronized (MapsInitializer.class) {
            MapsInitializer.initialize(context);
        }
    }

    @Override
    public IMapsProvider.IMapStyleOptions loadRawResourceStyle(Context context, int i) {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i2 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                    if (i2 == -1) {
                        Hex.closeQuietly(inputStreamOpenRawResource);
                        Hex.closeQuietly(byteArrayOutputStream);
                        return new GoogleMapStyleOptions(new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    Hex.closeQuietly(inputStreamOpenRawResource);
                    Hex.closeQuietly(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + e.toString());
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            zzb zzbVar = CameraUpdateFactory.zza;
            zzah.checkNotNull(zzbVar, "CameraUpdateFactory is not initialized");
            Parcel parcelZza = zzbVar.zza();
            zzc.zze(parcelZza, latLng2);
            Parcel parcelZzH = zzbVar.zzH(parcelZza, 8);
            IObjectWrapper iObjectWrapperAsInterface = ObjectWrapper.asInterface(parcelZzH.readStrongBinder());
            parcelZzH.recycle();
            return new GoogleCameraUpdate(new CameraUpdate(iObjectWrapperAsInterface));
        } catch (RemoteException e) {
            throw new HostException(e);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        zzah.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            zzb zzbVar = CameraUpdateFactory.zza;
            zzah.checkNotNull(zzbVar, "CameraUpdateFactory is not initialized");
            Parcel parcelZza = zzbVar.zza();
            zzc.zze(parcelZza, latLngBounds);
            parcelZza.writeInt(i);
            Parcel parcelZzH = zzbVar.zzH(parcelZza, 10);
            IObjectWrapper iObjectWrapperAsInterface = ObjectWrapper.asInterface(parcelZzH.readStrongBinder());
            parcelZzH.recycle();
            return new GoogleCameraUpdate(new CameraUpdate(iObjectWrapperAsInterface));
        } catch (RemoteException e) {
            throw new HostException(e);
        }
    }

    @Override
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            zzb zzbVar = CameraUpdateFactory.zza;
            zzah.checkNotNull(zzbVar, "CameraUpdateFactory is not initialized");
            Parcel parcelZza = zzbVar.zza();
            zzc.zze(parcelZza, latLng2);
            parcelZza.writeFloat(f);
            Parcel parcelZzH = zzbVar.zzH(parcelZza, 9);
            IObjectWrapper iObjectWrapperAsInterface = ObjectWrapper.asInterface(parcelZzH.readStrongBinder());
            parcelZzH.recycle();
            return new GoogleCameraUpdate(new CameraUpdate(iObjectWrapperAsInterface));
        } catch (RemoteException e) {
            throw new HostException(e);
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

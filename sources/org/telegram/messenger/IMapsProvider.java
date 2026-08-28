package org.telegram.messenger;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    public static final class CameraPosition {
        public final LatLng target;
        public final float zoom;

        public CameraPosition(LatLng latLng, float f10) {
            this.target = latLng;
            this.zoom = f10;
        }
    }

    public interface ICallableMethod<R, A> {
        R call(A a2);
    }

    public interface ICameraUpdate {
    }

    public interface ICancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface ICircle {
        double getRadius();

        void remove();

        void setCenter(LatLng latLng);

        void setFillColor(int i9);

        void setRadius(double d);

        void setStrokeColor(int i9);
    }

    public interface ICircleOptions {
        ICircleOptions center(LatLng latLng);

        ICircleOptions fillColor(int i9);

        ICircleOptions radius(double d);

        ICircleOptions strokeColor(int i9);

        ICircleOptions strokePattern(List<PatternItem> list);

        ICircleOptions strokeWidth(int i9);
    }

    public interface ILatLngBounds {
        LatLng getCenter();
    }

    public interface ILatLngBoundsBuilder {
        ILatLngBounds build();

        ILatLngBoundsBuilder include(LatLng latLng);
    }

    public interface IMap {
        ICircle addCircle(ICircleOptions iCircleOptions);

        IMarker addMarker(IMarkerOptions iMarkerOptions);

        void animateCamera(ICameraUpdate iCameraUpdate);

        void animateCamera(ICameraUpdate iCameraUpdate, int i9, ICancelableCallback iCancelableCallback);

        void animateCamera(ICameraUpdate iCameraUpdate, ICancelableCallback iCancelableCallback);

        CameraPosition getCameraPosition();

        float getMaxZoomLevel();

        float getMinZoomLevel();

        IProjection getProjection();

        IUISettings getUiSettings();

        void moveCamera(ICameraUpdate iCameraUpdate);

        void setMapStyle(IMapStyleOptions iMapStyleOptions);

        void setMapType(int i9);

        void setMyLocationEnabled(boolean z10);

        void setOnCameraIdleListener(Runnable runnable);

        void setOnCameraMoveListener(Runnable runnable);

        void setOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener);

        void setOnMapLoadedCallback(Runnable runnable);

        void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener);

        void setOnMyLocationChangeListener(q0.a aVar);

        void setPadding(int i9, int i10, int i11, int i12);
    }

    public interface IMapStyleOptions {
    }

    public interface IMapView {
        GLSurfaceView getGlSurfaceView();

        void getMapAsync(q0.a aVar);

        View getView();

        void onCreate(Bundle bundle);

        void onDestroy();

        void onLowMemory();

        void onPause();

        void onResume();

        void setOnDispatchTouchEventInterceptor(ITouchInterceptor iTouchInterceptor);

        void setOnInterceptTouchEventInterceptor(ITouchInterceptor iTouchInterceptor);

        void setOnLayoutListener(Runnable runnable);
    }

    public interface IMarker {
        LatLng getPosition();

        Object getTag();

        void remove();

        void setIcon(int i9);

        void setIcon(Bitmap bitmap);

        void setPosition(LatLng latLng);

        void setRotation(int i9);

        void setTag(Object obj);
    }

    public interface IMarkerOptions {
        IMarkerOptions anchor(float f10, float f11);

        IMarkerOptions flat(boolean z10);

        IMarkerOptions icon(int i9);

        IMarkerOptions icon(Bitmap bitmap);

        IMarkerOptions position(LatLng latLng);

        IMarkerOptions snippet(String str);

        IMarkerOptions title(String str);
    }

    public interface IProjection {
        Point toScreenLocation(LatLng latLng);
    }

    public interface ITouchInterceptor {
        boolean onInterceptTouchEvent(MotionEvent motionEvent, ICallableMethod<Boolean, MotionEvent> iCallableMethod);
    }

    public interface IUISettings {
        void setCompassEnabled(boolean z10);

        void setMyLocationButtonEnabled(boolean z10);

        void setZoomControlsEnabled(boolean z10);
    }

    public static final class LatLng {
        public final double latitude;
        public final double longitude;

        public LatLng(double d, double d9) {
            this.latitude = d;
            this.longitude = d9;
        }
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onCameraMoveStarted(int i9);
    }

    public interface OnMarkerClickListener {
        boolean onClick(IMarker iMarker);
    }

    public static class PatternItem {

        public static final class Dash extends PatternItem {
            public final int length;

            public Dash(int i9) {
                this.length = i9;
            }
        }

        public static final class Gap extends PatternItem {
            public final int length;

            public Gap(int i9) {
                this.length = i9;
            }
        }
    }

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    IMapStyleOptions loadRawResourceStyle(Context context, int i9);

    ICameraUpdate newCameraUpdateLatLng(LatLng latLng);

    ICameraUpdate newCameraUpdateLatLngBounds(ILatLngBounds iLatLngBounds, int i9);

    ICameraUpdate newCameraUpdateLatLngZoom(LatLng latLng, float f10);

    ICircleOptions onCreateCircleOptions();

    ILatLngBoundsBuilder onCreateLatLngBoundsBuilder();

    IMapView onCreateMapView(Context context);

    IMarkerOptions onCreateMarkerOptions();
}

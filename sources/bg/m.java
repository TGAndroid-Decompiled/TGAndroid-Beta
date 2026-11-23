package bg;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import org.telegram.messenger.a8;
import org.telegram.ui.da0;
public final class m implements SensorEventListener {
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public long I;
    public final da0 f3271a;
    public SensorManager f3272b;
    public Sensor f3273c;
    public Sensor d;
    public Sensor f3274e;
    public boolean f3275f;
    public final float[] h = new float[9];
    public final float[] f3276n = new float[9];
    public final float[] f3277r = new float[4];
    public final float[] f3278s = new float[3];
    public final float[] f3279w = new float[3];
    public boolean f3280x;
    public float f3281y;

    public m(da0 da0Var) {
        this.f3271a = da0Var;
    }

    public final void a(Location location) {
        if (location == null) {
            return;
        }
        try {
            this.f3281y = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis()).getDeclination();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: bg.m.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}

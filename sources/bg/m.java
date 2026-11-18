package bg;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import org.telegram.messenger.a8;
import org.telegram.ui.ca0;
public final class m implements SensorEventListener {
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public long I;
    public final ca0 f3300a;
    public SensorManager f3301b;
    public Sensor f3302c;
    public Sensor d;
    public Sensor f3303e;
    public boolean f3304f;
    public final float[] h = new float[9];
    public final float[] f3305n = new float[9];
    public final float[] f3306r = new float[4];
    public final float[] f3307s = new float[3];
    public final float[] f3308w = new float[3];
    public boolean f3309x;
    public float f3310y;

    public m(ca0 ca0Var) {
        this.f3300a = ca0Var;
    }

    public final void a(Location location) {
        if (location == null) {
            return;
        }
        try {
            this.f3310y = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis()).getDeclination();
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

package defpackage;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
public final class iq2 implements SensorEventListener {
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public long I;
    public final yb6 a;
    public SensorManager b;
    public Sensor c;
    public Sensor d;
    public Sensor e;
    public boolean f;
    public final float[] h = new float[9];
    public final float[] n = new float[9];
    public final float[] r = new float[4];
    public final float[] s = new float[3];
    public final float[] w = new float[3];
    public boolean x;
    public float y;

    public iq2(yb6 yb6Var) {
        this.a = yb6Var;
    }

    public final void a(Location location) {
        if (location == null) {
            return;
        }
        try {
            this.y = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis()).getDeclination();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq2.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}

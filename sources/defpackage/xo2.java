package defpackage;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
public final class xo2 implements SensorEventListener {
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public long I;
    public final z96 a;
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

    public xo2(z96 z96Var) {
        this.a = z96Var;
    }

    public final void a(Location location) {
        if (location == null) {
            return;
        }
        try {
            this.y = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis()).getDeclination();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo2.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}

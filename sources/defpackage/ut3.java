package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.a;
public final class ut3 implements SensorEventListener {
    public byte E;
    public int F;
    public int G;
    public long H;
    public boolean J;
    public boolean K;
    public float M;
    public final SensorManager a;
    public final AudioManager b;
    public final Sensor c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f;
    public final PowerManager.WakeLock h;
    public boolean n;
    public boolean r;
    public ndc s;
    public boolean w;
    public long x;
    public int y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public ut3() {
        SensorManager sensorManager = (SensorManager) a.b.getSystemService("sensor");
        this.a = sensorManager;
        this.c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (e21.a) {
                fc4.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f = null;
        }
        this.h = ((PowerManager) a.b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.b = (AudioManager) a.b.getSystemService("audio");
    }

    public final void a() {
        int i;
        ndc ndcVar = this.s;
        if (ndcVar == null) {
            return;
        }
        if (this.r) {
            i = 0;
        } else {
            i = 3;
        }
        ndcVar.w0(i);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut3.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}

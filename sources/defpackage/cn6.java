package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
public final class cn6 implements Runnable {
    public final byte a;
    public final MediaController b;

    public cn6(MediaController mediaController, byte b) {
        this.a = b;
        this.b = mediaController;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        MediaController mediaController = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                try {
                    mediaController.B1 = (char) 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.A1 = minBufferSize;
                    while (i < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.y1.add(allocateDirect);
                        i++;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                String[] strArr2 = MediaController.W1;
                try {
                    mediaController.q0 = uc7.e1().getFloat("playbackSpeed", 1.0f);
                    mediaController.r0 = uc7.e1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController.s0 = uc7.e1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController.t0 = uc7.e1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) a.b.getSystemService("sensor");
                    mediaController.c = sensorManager;
                    mediaController.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController.c.getDefaultSensor(9);
                    mediaController.n = defaultSensor;
                    if (mediaController.h == null || defaultSensor == null) {
                        if (f11.a) {
                            cc4.b("gravity or linear sensor not found");
                        }
                        mediaController.f = mediaController.c.getDefaultSensor(1);
                        mediaController.h = null;
                        mediaController.n = null;
                    }
                    mediaController.e = mediaController.c.getDefaultSensor(8);
                    mediaController.d = ((PowerManager) a.b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                try {
                    ao6 ao6Var = new ao6(mediaController);
                    TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(ao6Var, 32);
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 2:
                String[] strArr3 = MediaController.W1;
                while (i < 4) {
                    jn7.f(i).a(mediaController, 143);
                    jn7.f(i).a(mediaController, 136);
                    jn7.f(i).a(mediaController, 1);
                    jn7.f(i).a(mediaController, 7);
                    jn7.f(i).a(mediaController, 42);
                    jn7.f(i).a(mediaController, 74);
                    jn7.f(i).a(mediaController, 33);
                    jn7.f(i).a(mediaController, 248);
                    jn7.e().a(mediaController, 288);
                    i++;
                }
                return;
            case 3:
                String[] strArr4 = MediaController.W1;
                Sensor sensor = mediaController.h;
                if (sensor != null) {
                    mediaController.c.unregisterListener(mediaController, sensor);
                }
                Sensor sensor2 = mediaController.n;
                if (sensor2 != null) {
                    mediaController.c.unregisterListener(mediaController, sensor2);
                }
                Sensor sensor3 = mediaController.f;
                if (sensor3 != null) {
                    mediaController.c.unregisterListener(mediaController, sensor3);
                }
                mediaController.c.unregisterListener(mediaController, mediaController.e);
                return;
            case 4:
                String[] strArr5 = MediaController.W1;
                Sensor sensor4 = mediaController.n;
                if (sensor4 != null) {
                    mediaController.c.registerListener(mediaController, sensor4, 30000);
                }
                Sensor sensor5 = mediaController.h;
                if (sensor5 != null) {
                    mediaController.c.registerListener(mediaController, sensor5, 30000);
                }
                Sensor sensor6 = mediaController.f;
                if (sensor6 != null) {
                    mediaController.c.registerListener(mediaController, sensor6, 30000);
                }
                mediaController.c.registerListener(mediaController, mediaController.e, 3);
                return;
            case 5:
                String[] strArr6 = MediaController.W1;
                mediaController.Q();
                return;
            case 6:
                String[] strArr7 = MediaController.W1;
                mediaController.M1 = null;
                jn7.f(mediaController.i1).k(157, Integer.valueOf(mediaController.h1));
                return;
            default:
                String[] strArr8 = MediaController.W1;
                mediaController.b0(true);
                mediaController.f1 = new AudioRecord(0, mediaController.B1, 16, 2, mediaController.A1);
                System.currentTimeMillis();
                mediaController.m1 = 0;
                mediaController.w1 = 0L;
                mediaController.z1.rewind();
                mediaController.f1.startRecording();
                mediaController.N1.c(mediaController.P1);
                jn7.f(mediaController.i1).k(160, new Object[0]);
                return;
        }
    }
}

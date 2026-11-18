package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class td implements Runnable {
    public final int f26982a;
    public final MediaController f26983b;

    public td(MediaController mediaController, int i7) {
        this.f26982a = i7;
        this.f26983b = mediaController;
    }

    @Override
    public final void run() {
        int i7 = 0;
        switch (this.f26982a) {
            case 0:
                MediaController mediaController = this.f26983b;
                String[] strArr = MediaController.W1;
                try {
                    mediaController.B1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.A1 = minBufferSize;
                    while (i7 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.f22750y1.add(allocateDirect);
                        i7++;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.f26983b;
                String[] strArr2 = MediaController.W1;
                try {
                    mediaController2.f22728q0 = mp.g1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.f22731r0 = mp.g1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.f22734s0 = mp.g1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.f22736t0 = mp.g1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) t0.f26913b.getSystemService("sensor");
                    mediaController2.f22699c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.f22699c.getDefaultSensor(9);
                    mediaController2.f22722n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (s2.f26721a) {
                            a8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f22707f = mediaController2.f22699c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.f22722n = null;
                    }
                    mediaController2.f22704e = mediaController2.f22699c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) t0.f26913b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                try {
                    se seVar = new se(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) t0.f26913b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(seVar, 32);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 2:
                MediaController mediaController3 = this.f26983b;
                String[] strArr3 = MediaController.W1;
                while (i7 < 4) {
                    ks.f(i7).b(mediaController3, 142);
                    ks.f(i7).b(mediaController3, 135);
                    ks.f(i7).b(mediaController3, 1);
                    ks.f(i7).b(mediaController3, 7);
                    ks.f(i7).b(mediaController3, 41);
                    ks.f(i7).b(mediaController3, 73);
                    ks.f(i7).b(mediaController3, 32);
                    ks.f(i7).b(mediaController3, 247);
                    ks.e().b(mediaController3, 287);
                    i7++;
                }
                return;
            case 3:
                MediaController mediaController4 = this.f26983b;
                Sensor sensor = mediaController4.f22722n;
                if (sensor != null) {
                    mediaController4.f22699c.registerListener(mediaController4, sensor, 30000);
                }
                Sensor sensor2 = mediaController4.h;
                if (sensor2 != null) {
                    mediaController4.f22699c.registerListener(mediaController4, sensor2, 30000);
                }
                Sensor sensor3 = mediaController4.f22707f;
                if (sensor3 != null) {
                    mediaController4.f22699c.registerListener(mediaController4, sensor3, 30000);
                }
                mediaController4.f22699c.registerListener(mediaController4, mediaController4.f22704e, 3);
                return;
            case 4:
                MediaController mediaController5 = this.f26983b;
                String[] strArr4 = MediaController.W1;
                mediaController5.q(true, true, false, false);
                return;
            case 5:
                MediaController mediaController6 = this.f26983b;
                Sensor sensor4 = mediaController6.h;
                if (sensor4 != null) {
                    mediaController6.f22699c.unregisterListener(mediaController6, sensor4);
                }
                Sensor sensor5 = mediaController6.f22722n;
                if (sensor5 != null) {
                    mediaController6.f22699c.unregisterListener(mediaController6, sensor5);
                }
                Sensor sensor6 = mediaController6.f22707f;
                if (sensor6 != null) {
                    mediaController6.f22699c.unregisterListener(mediaController6, sensor6);
                }
                mediaController6.f22699c.unregisterListener(mediaController6, mediaController6.f22704e);
                return;
            case 6:
                MediaController.d(this.f26983b);
                return;
            case 7:
                MediaController mediaController7 = this.f26983b;
                mediaController7.M1 = null;
                ks.f(mediaController7.f22715i1).k(156, Integer.valueOf(mediaController7.f22713h1));
                return;
            case 8:
                MediaController mediaController8 = this.f26983b;
                String[] strArr5 = MediaController.W1;
                mediaController8.Y(true);
                mediaController8.f22709f1 = new AudioRecord(0, mediaController8.B1, 16, 2, mediaController8.A1);
                System.currentTimeMillis();
                mediaController8.f22721m1 = 0;
                mediaController8.f22744w1 = 0L;
                mediaController8.f22752z1.rewind();
                mediaController8.f22709f1.startRecording();
                mediaController8.N1.c(mediaController8.P1);
                ks.f(mediaController8.f22715i1).k(159, new Object[0]);
                return;
            default:
                MediaController mediaController9 = this.f26983b;
                String[] strArr6 = MediaController.W1;
                mediaController9.q(true, true, false, false);
                return;
        }
    }
}

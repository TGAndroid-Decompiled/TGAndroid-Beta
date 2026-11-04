package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class od implements Runnable {
    public final int f24526a;
    public final MediaController f24527b;

    public od(MediaController mediaController, int i3) {
        this.f24526a = i3;
        this.f24527b = mediaController;
    }

    @Override
    public final void run() {
        int i3 = 0;
        switch (this.f24526a) {
            case 0:
                MediaController mediaController = this.f24527b;
                String[] strArr = MediaController.W1;
                try {
                    mediaController.B1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.A1 = minBufferSize;
                    while (i3 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.f21358y1.add(allocateDirect);
                        i3++;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.f24527b;
                String[] strArr2 = MediaController.W1;
                try {
                    mediaController2.f21336q0 = hp.e1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.f21339r0 = hp.e1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.f21342s0 = hp.e1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.f21344t0 = hp.e1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) t0.f25457b.getSystemService("sensor");
                    mediaController2.f21307c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.f21307c.getDefaultSensor(9);
                    mediaController2.f21329n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (r2.f25040a) {
                            a8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f21315f = mediaController2.f21307c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.f21329n = null;
                    }
                    mediaController2.f21312e = mediaController2.f21307c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) t0.f25457b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                try {
                    ne neVar = new ne(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) t0.f25457b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(neVar, 32);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 2:
                MediaController mediaController3 = this.f24527b;
                String[] strArr3 = MediaController.W1;
                while (i3 < 4) {
                    hs.f(i3).b(mediaController3, 142);
                    hs.f(i3).b(mediaController3, 135);
                    hs.f(i3).b(mediaController3, 1);
                    hs.f(i3).b(mediaController3, 7);
                    hs.f(i3).b(mediaController3, 41);
                    hs.f(i3).b(mediaController3, 73);
                    hs.f(i3).b(mediaController3, 32);
                    hs.f(i3).b(mediaController3, 244);
                    hs.e().b(mediaController3, 284);
                    i3++;
                }
                return;
            case 3:
                MediaController mediaController4 = this.f24527b;
                Sensor sensor = mediaController4.f21329n;
                if (sensor != null) {
                    mediaController4.f21307c.registerListener(mediaController4, sensor, 30000);
                }
                Sensor sensor2 = mediaController4.h;
                if (sensor2 != null) {
                    mediaController4.f21307c.registerListener(mediaController4, sensor2, 30000);
                }
                Sensor sensor3 = mediaController4.f21315f;
                if (sensor3 != null) {
                    mediaController4.f21307c.registerListener(mediaController4, sensor3, 30000);
                }
                mediaController4.f21307c.registerListener(mediaController4, mediaController4.f21312e, 3);
                return;
            case 4:
                MediaController mediaController5 = this.f24527b;
                String[] strArr4 = MediaController.W1;
                mediaController5.q(true, true, false, false);
                return;
            case 5:
                MediaController mediaController6 = this.f24527b;
                Sensor sensor4 = mediaController6.h;
                if (sensor4 != null) {
                    mediaController6.f21307c.unregisterListener(mediaController6, sensor4);
                }
                Sensor sensor5 = mediaController6.f21329n;
                if (sensor5 != null) {
                    mediaController6.f21307c.unregisterListener(mediaController6, sensor5);
                }
                Sensor sensor6 = mediaController6.f21315f;
                if (sensor6 != null) {
                    mediaController6.f21307c.unregisterListener(mediaController6, sensor6);
                }
                mediaController6.f21307c.unregisterListener(mediaController6, mediaController6.f21312e);
                return;
            case 6:
                MediaController.d(this.f24527b);
                return;
            case 7:
                MediaController mediaController7 = this.f24527b;
                mediaController7.M1 = null;
                hs.f(mediaController7.f21323i1).k(156, Integer.valueOf(mediaController7.f21321h1));
                return;
            case 8:
                MediaController mediaController8 = this.f24527b;
                String[] strArr5 = MediaController.W1;
                mediaController8.Y(true);
                mediaController8.f21317f1 = new AudioRecord(0, mediaController8.B1, 16, 2, mediaController8.A1);
                System.currentTimeMillis();
                mediaController8.m1 = 0;
                mediaController8.f21352w1 = 0L;
                mediaController8.f21360z1.rewind();
                mediaController8.f21317f1.startRecording();
                mediaController8.N1.c(mediaController8.P1);
                hs.f(mediaController8.f21323i1).k(159, new Object[0]);
                return;
            default:
                MediaController mediaController9 = this.f24527b;
                String[] strArr6 = MediaController.W1;
                mediaController9.q(true, true, false, false);
                return;
        }
    }
}

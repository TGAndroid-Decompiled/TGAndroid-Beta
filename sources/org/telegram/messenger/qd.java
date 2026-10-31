package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class qd implements Runnable {
    public final int f17577a;
    public final MediaController f17578b;

    public qd(MediaController mediaController, int i10) {
        this.f17577a = i10;
        this.f17578b = mediaController;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f17577a) {
            case 0:
                MediaController mediaController = this.f17578b;
                String[] strArr = MediaController.U1;
                try {
                    mediaController.f14496z1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.f14494y1 = minBufferSize;
                    while (i10 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.f14494y1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.f14488w1.add(allocateDirect);
                        i10++;
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.f17578b;
                String[] strArr2 = MediaController.U1;
                try {
                    mediaController2.f14470p0 = vp.d1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.f14472q0 = vp.d1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.f14475r0 = vp.d1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.f14478s0 = vp.d1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) w0.f19025b.getSystemService("sensor");
                    mediaController2.f14443c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.f14443c.getDefaultSensor(9);
                    mediaController2.f14465n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (v2.f18448a) {
                            f8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f14450f = mediaController2.f14443c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.f14465n = null;
                    }
                    mediaController2.e = mediaController2.f14443c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) w0.f19025b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                try {
                    te teVar = new te(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) w0.f19025b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(teVar, 32);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            case 2:
                MediaController mediaController3 = this.f17578b;
                String[] strArr3 = MediaController.U1;
                while (i10 < 4) {
                    zs.f(i10).b(mediaController3, 142);
                    zs.f(i10).b(mediaController3, 135);
                    zs.f(i10).b(mediaController3, 1);
                    zs.f(i10).b(mediaController3, 7);
                    zs.f(i10).b(mediaController3, 41);
                    zs.f(i10).b(mediaController3, 73);
                    zs.f(i10).b(mediaController3, 32);
                    zs.f(i10).b(mediaController3, 244);
                    zs.e().b(mediaController3, 284);
                    i10++;
                }
                return;
            case 3:
                MediaController mediaController4 = this.f17578b;
                Sensor sensor = mediaController4.f14465n;
                if (sensor != null) {
                    mediaController4.f14443c.registerListener(mediaController4, sensor, 30000);
                }
                Sensor sensor2 = mediaController4.h;
                if (sensor2 != null) {
                    mediaController4.f14443c.registerListener(mediaController4, sensor2, 30000);
                }
                Sensor sensor3 = mediaController4.f14450f;
                if (sensor3 != null) {
                    mediaController4.f14443c.registerListener(mediaController4, sensor3, 30000);
                }
                mediaController4.f14443c.registerListener(mediaController4, mediaController4.e, 3);
                return;
            case 4:
                MediaController mediaController5 = this.f17578b;
                String[] strArr4 = MediaController.U1;
                mediaController5.q(true, true, false, false);
                return;
            case 5:
                MediaController mediaController6 = this.f17578b;
                Sensor sensor4 = mediaController6.h;
                if (sensor4 != null) {
                    mediaController6.f14443c.unregisterListener(mediaController6, sensor4);
                }
                Sensor sensor5 = mediaController6.f14465n;
                if (sensor5 != null) {
                    mediaController6.f14443c.unregisterListener(mediaController6, sensor5);
                }
                Sensor sensor6 = mediaController6.f14450f;
                if (sensor6 != null) {
                    mediaController6.f14443c.unregisterListener(mediaController6, sensor6);
                }
                mediaController6.f14443c.unregisterListener(mediaController6, mediaController6.e);
                return;
            case 6:
                MediaController.d(this.f17578b);
                return;
            case 7:
                MediaController mediaController7 = this.f17578b;
                mediaController7.K1 = null;
                zs.f(mediaController7.f14454g1).k(156, Integer.valueOf(mediaController7.f14452f1));
                return;
            case 8:
                MediaController mediaController8 = this.f17578b;
                String[] strArr5 = MediaController.U1;
                mediaController8.Y(true);
                mediaController8.f14447d1 = new AudioRecord(0, mediaController8.f14496z1, 16, 2, mediaController8.f14494y1);
                System.currentTimeMillis();
                mediaController8.f14462k1 = 0;
                mediaController8.f14483u1 = 0L;
                mediaController8.f14491x1.rewind();
                mediaController8.f14447d1.startRecording();
                mediaController8.L1.c(mediaController8.N1);
                zs.f(mediaController8.f14454g1).k(159, new Object[0]);
                return;
            default:
                MediaController mediaController9 = this.f17578b;
                String[] strArr6 = MediaController.U1;
                mediaController9.q(true, true, false, false);
                return;
        }
    }
}

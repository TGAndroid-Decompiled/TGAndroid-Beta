package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class rd implements Runnable {
    public final int f17923a;
    public final MediaController f17924b;

    public rd(MediaController mediaController, int i10) {
        this.f17923a = i10;
        this.f17924b = mediaController;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f17923a) {
            case 0:
                MediaController mediaController = this.f17924b;
                String[] strArr = MediaController.U1;
                try {
                    mediaController.f14497z1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.f14495y1 = minBufferSize;
                    while (i10 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.f14495y1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.f14489w1.add(allocateDirect);
                        i10++;
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.f17924b;
                String[] strArr2 = MediaController.U1;
                try {
                    mediaController2.f14471p0 = wp.d1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.f14473q0 = wp.d1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.f14476r0 = wp.d1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.f14479s0 = wp.d1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) w0.f18945b.getSystemService("sensor");
                    mediaController2.f14444c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.f14444c.getDefaultSensor(9);
                    mediaController2.f14466n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (v2.f18578a) {
                            f8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f14451f = mediaController2.f14444c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.f14466n = null;
                    }
                    mediaController2.e = mediaController2.f14444c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) w0.f18945b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                try {
                    ue ueVar = new ue(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) w0.f18945b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(ueVar, 32);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            case 2:
                MediaController mediaController3 = this.f17924b;
                String[] strArr3 = MediaController.U1;
                while (i10 < 4) {
                    at.f(i10).b(mediaController3, 142);
                    at.f(i10).b(mediaController3, 135);
                    at.f(i10).b(mediaController3, 1);
                    at.f(i10).b(mediaController3, 7);
                    at.f(i10).b(mediaController3, 41);
                    at.f(i10).b(mediaController3, 73);
                    at.f(i10).b(mediaController3, 32);
                    at.f(i10).b(mediaController3, 244);
                    at.e().b(mediaController3, 284);
                    i10++;
                }
                return;
            case 3:
                MediaController mediaController4 = this.f17924b;
                Sensor sensor = mediaController4.f14466n;
                if (sensor != null) {
                    mediaController4.f14444c.registerListener(mediaController4, sensor, 30000);
                }
                Sensor sensor2 = mediaController4.h;
                if (sensor2 != null) {
                    mediaController4.f14444c.registerListener(mediaController4, sensor2, 30000);
                }
                Sensor sensor3 = mediaController4.f14451f;
                if (sensor3 != null) {
                    mediaController4.f14444c.registerListener(mediaController4, sensor3, 30000);
                }
                mediaController4.f14444c.registerListener(mediaController4, mediaController4.e, 3);
                return;
            case 4:
                MediaController mediaController5 = this.f17924b;
                String[] strArr4 = MediaController.U1;
                mediaController5.q(true, true, false, false);
                return;
            case 5:
                MediaController mediaController6 = this.f17924b;
                Sensor sensor4 = mediaController6.h;
                if (sensor4 != null) {
                    mediaController6.f14444c.unregisterListener(mediaController6, sensor4);
                }
                Sensor sensor5 = mediaController6.f14466n;
                if (sensor5 != null) {
                    mediaController6.f14444c.unregisterListener(mediaController6, sensor5);
                }
                Sensor sensor6 = mediaController6.f14451f;
                if (sensor6 != null) {
                    mediaController6.f14444c.unregisterListener(mediaController6, sensor6);
                }
                mediaController6.f14444c.unregisterListener(mediaController6, mediaController6.e);
                return;
            case 6:
                MediaController.d(this.f17924b);
                return;
            case 7:
                MediaController mediaController7 = this.f17924b;
                mediaController7.K1 = null;
                at.f(mediaController7.f14455g1).k(156, Integer.valueOf(mediaController7.f14453f1));
                return;
            case 8:
                MediaController mediaController8 = this.f17924b;
                String[] strArr5 = MediaController.U1;
                mediaController8.Y(true);
                mediaController8.f14448d1 = new AudioRecord(0, mediaController8.f14497z1, 16, 2, mediaController8.f14495y1);
                System.currentTimeMillis();
                mediaController8.f14463k1 = 0;
                mediaController8.f14484u1 = 0L;
                mediaController8.f14492x1.rewind();
                mediaController8.f14448d1.startRecording();
                mediaController8.L1.c(mediaController8.N1);
                at.f(mediaController8.f14455g1).k(159, new Object[0]);
                return;
            default:
                MediaController mediaController9 = this.f17924b;
                String[] strArr6 = MediaController.U1;
                mediaController9.q(true, true, false, false);
                return;
        }
    }
}

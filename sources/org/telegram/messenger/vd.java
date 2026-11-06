package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class vd implements Runnable {
    public final int f25959a;
    public final MediaController f25960b;

    public vd(MediaController mediaController, int i7) {
        this.f25959a = i7;
        this.f25960b = mediaController;
    }

    @Override
    public final void run() {
        int i7 = 0;
        switch (this.f25959a) {
            case 0:
                MediaController mediaController = this.f25960b;
                String[] strArr = MediaController.V1;
                try {
                    mediaController.A1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.f21306z1 = minBufferSize;
                    while (i7 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.f21306z1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.f21301x1.add(allocateDirect);
                        i7++;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.f25960b;
                String[] strArr2 = MediaController.V1;
                try {
                    mediaController2.f21280p0 = qp.e1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.f21282q0 = qp.e1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.f21285r0 = qp.e1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.f21288s0 = qp.e1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) t0.f25555b.getSystemService("sensor");
                    mediaController2.f21253c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.f21253c.getDefaultSensor(9);
                    mediaController2.f21276n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (r2.f25191a) {
                            a8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f21261f = mediaController2.f21253c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.f21276n = null;
                    }
                    mediaController2.f21258e = mediaController2.f21253c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) t0.f25555b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                try {
                    ue ueVar = new ue(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) t0.f25555b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(ueVar, 32);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 2:
                MediaController mediaController3 = this.f25960b;
                String[] strArr3 = MediaController.V1;
                while (i7 < 4) {
                    qs.f(i7).b(mediaController3, 142);
                    qs.f(i7).b(mediaController3, 135);
                    qs.f(i7).b(mediaController3, 1);
                    qs.f(i7).b(mediaController3, 7);
                    qs.f(i7).b(mediaController3, 41);
                    qs.f(i7).b(mediaController3, 73);
                    qs.f(i7).b(mediaController3, 32);
                    qs.f(i7).b(mediaController3, 244);
                    qs.e().b(mediaController3, 284);
                    i7++;
                }
                return;
            case 3:
                MediaController mediaController4 = this.f25960b;
                Sensor sensor = mediaController4.f21276n;
                if (sensor != null) {
                    mediaController4.f21253c.registerListener(mediaController4, sensor, 30000);
                }
                Sensor sensor2 = mediaController4.h;
                if (sensor2 != null) {
                    mediaController4.f21253c.registerListener(mediaController4, sensor2, 30000);
                }
                Sensor sensor3 = mediaController4.f21261f;
                if (sensor3 != null) {
                    mediaController4.f21253c.registerListener(mediaController4, sensor3, 30000);
                }
                mediaController4.f21253c.registerListener(mediaController4, mediaController4.f21258e, 3);
                return;
            case 4:
                MediaController mediaController5 = this.f25960b;
                String[] strArr4 = MediaController.V1;
                mediaController5.q(true, true, false, false);
                return;
            case 5:
                MediaController mediaController6 = this.f25960b;
                Sensor sensor4 = mediaController6.h;
                if (sensor4 != null) {
                    mediaController6.f21253c.unregisterListener(mediaController6, sensor4);
                }
                Sensor sensor5 = mediaController6.f21276n;
                if (sensor5 != null) {
                    mediaController6.f21253c.unregisterListener(mediaController6, sensor5);
                }
                Sensor sensor6 = mediaController6.f21261f;
                if (sensor6 != null) {
                    mediaController6.f21253c.unregisterListener(mediaController6, sensor6);
                }
                mediaController6.f21253c.unregisterListener(mediaController6, mediaController6.f21258e);
                return;
            case 6:
                MediaController.d(this.f25960b);
                return;
            case 7:
                MediaController mediaController7 = this.f25960b;
                mediaController7.L1 = null;
                qs.f(mediaController7.f21267h1).k(156, Integer.valueOf(mediaController7.f21265g1));
                return;
            case 8:
                MediaController mediaController8 = this.f25960b;
                String[] strArr5 = MediaController.V1;
                mediaController8.Y(true);
                mediaController8.f21260e1 = new AudioRecord(0, mediaController8.A1, 16, 2, mediaController8.f21306z1);
                System.currentTimeMillis();
                mediaController8.l1 = 0;
                mediaController8.f21295v1 = 0L;
                mediaController8.f21304y1.rewind();
                mediaController8.f21260e1.startRecording();
                mediaController8.M1.c(mediaController8.O1);
                qs.f(mediaController8.f21267h1).k(159, new Object[0]);
                return;
            default:
                MediaController mediaController9 = this.f25960b;
                String[] strArr6 = MediaController.V1;
                mediaController9.q(true, true, false, false);
                return;
        }
    }
}

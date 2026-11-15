package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class ud implements Runnable {
    public final int f26803a;
    public final MediaController f26804b;

    public ud(MediaController mediaController, int i7) {
        this.f26803a = i7;
        this.f26804b = mediaController;
    }

    @Override
    public final void run() {
        int i7 = 0;
        switch (this.f26803a) {
            case 0:
                MediaController mediaController = this.f26804b;
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
                        mediaController.f22387y1.add(allocateDirect);
                        i7++;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.f26804b;
                String[] strArr2 = MediaController.W1;
                try {
                    mediaController2.f22365q0 = np.e1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.f22368r0 = np.e1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.f22371s0 = np.e1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.f22373t0 = np.e1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) t0.f26600b.getSystemService("sensor");
                    mediaController2.f22336c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.f22336c.getDefaultSensor(9);
                    mediaController2.f22359n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (r2.f26198a) {
                            a8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f22344f = mediaController2.f22336c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.f22359n = null;
                    }
                    mediaController2.f22341e = mediaController2.f22336c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) t0.f26600b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                try {
                    te teVar = new te(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) t0.f26600b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(teVar, 32);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 2:
                MediaController mediaController3 = this.f26804b;
                String[] strArr3 = MediaController.W1;
                while (i7 < 4) {
                    ns.f(i7).b(mediaController3, 142);
                    ns.f(i7).b(mediaController3, 135);
                    ns.f(i7).b(mediaController3, 1);
                    ns.f(i7).b(mediaController3, 7);
                    ns.f(i7).b(mediaController3, 41);
                    ns.f(i7).b(mediaController3, 73);
                    ns.f(i7).b(mediaController3, 32);
                    ns.f(i7).b(mediaController3, 244);
                    ns.e().b(mediaController3, 284);
                    i7++;
                }
                return;
            case 3:
                MediaController mediaController4 = this.f26804b;
                Sensor sensor = mediaController4.f22359n;
                if (sensor != null) {
                    mediaController4.f22336c.registerListener(mediaController4, sensor, 30000);
                }
                Sensor sensor2 = mediaController4.h;
                if (sensor2 != null) {
                    mediaController4.f22336c.registerListener(mediaController4, sensor2, 30000);
                }
                Sensor sensor3 = mediaController4.f22344f;
                if (sensor3 != null) {
                    mediaController4.f22336c.registerListener(mediaController4, sensor3, 30000);
                }
                mediaController4.f22336c.registerListener(mediaController4, mediaController4.f22341e, 3);
                return;
            case 4:
                MediaController mediaController5 = this.f26804b;
                String[] strArr4 = MediaController.W1;
                mediaController5.q(true, true, false, false);
                return;
            case 5:
                MediaController mediaController6 = this.f26804b;
                Sensor sensor4 = mediaController6.h;
                if (sensor4 != null) {
                    mediaController6.f22336c.unregisterListener(mediaController6, sensor4);
                }
                Sensor sensor5 = mediaController6.f22359n;
                if (sensor5 != null) {
                    mediaController6.f22336c.unregisterListener(mediaController6, sensor5);
                }
                Sensor sensor6 = mediaController6.f22344f;
                if (sensor6 != null) {
                    mediaController6.f22336c.unregisterListener(mediaController6, sensor6);
                }
                mediaController6.f22336c.unregisterListener(mediaController6, mediaController6.f22341e);
                return;
            case 6:
                MediaController.d(this.f26804b);
                return;
            case 7:
                MediaController mediaController7 = this.f26804b;
                mediaController7.M1 = null;
                ns.f(mediaController7.f22352i1).k(156, Integer.valueOf(mediaController7.f22350h1));
                return;
            case 8:
                MediaController mediaController8 = this.f26804b;
                String[] strArr5 = MediaController.W1;
                mediaController8.Y(true);
                mediaController8.f22346f1 = new AudioRecord(0, mediaController8.B1, 16, 2, mediaController8.A1);
                System.currentTimeMillis();
                mediaController8.f22358m1 = 0;
                mediaController8.f22381w1 = 0L;
                mediaController8.f22389z1.rewind();
                mediaController8.f22346f1.startRecording();
                mediaController8.N1.c(mediaController8.P1);
                ns.f(mediaController8.f22352i1).k(159, new Object[0]);
                return;
            default:
                MediaController mediaController9 = this.f26804b;
                String[] strArr6 = MediaController.W1;
                mediaController9.q(true, true, false, false);
                return;
        }
    }
}

package l3;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
public abstract class e {
    private static final s8.z a() {
        ?? wVar = new com.google.android.gms.common.api.internal.w();
        Integer[] numArr = {8, 7};
        s8.l.b(2, numArr);
        wVar.h(wVar.f2869a + 2);
        System.arraycopy(numArr, 0, wVar.f2871c, wVar.f2869a, 2);
        wVar.f2869a += 2;
        int i10 = h5.d0.f6924a;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            s8.l.b(2, numArr2);
            wVar.h(wVar.f2869a + 2);
            System.arraycopy(numArr2, 0, wVar.f2871c, wVar.f2869a, 2);
            wVar.f2869a += 2;
        }
        if (i10 >= 33) {
            wVar.b(30);
        }
        return wVar.i();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        s8.z a2 = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (a2.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}

package g0;

import a8.ed;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import e2.n0;
import f9.f0;
import f9.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public abstract class a {
    public static k2.b a(AudioManager audioManager, b2.f fVar, i0 i0Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(fVar.b());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(ed.a(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i10);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (n0.M(format) || k2.b.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(ed.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(ed.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        f0 t10 = i0.t();
        for (Map.Entry entry : hashMap.entrySet()) {
            t10.c(new k2.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new k2.b(t10.f(), i0Var, list);
    }

    public static AudioDeviceInfo b(AudioManager audioManager, b2.f fVar) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(fVar.b());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }

    public static Object c(Bundle bundle) {
        return bundle.getParcelable("RESULT_DATA", Intent.class);
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void f(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}

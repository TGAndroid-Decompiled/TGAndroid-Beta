package g0;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import b8.od;
import e0.e0;
import g2.n0;
import g9.f0;
import g9.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public abstract class a {
    public static Paint a(Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        Paint paint = new Paint(1);
        paint.setShader(bitmapShader);
        paint.setFilterBitmap(true);
        return paint;
    }

    public static void b(Canvas canvas, e0 e0Var, int i3, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i3 * 8, (float[]) e0Var.f9226c, 0, (float[]) e0Var.d, 0, (int[]) e0Var.f9228f, 0, (short[]) e0Var.f9227e, 0, i3 * 6, paint);
    }

    public static m2.b c(AudioManager audioManager, d2.f fVar, i0 i0Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(fVar.b());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(od.a(12)));
        for (int i3 = 0; i3 < directProfilesForAttributes.size(); i3++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i3);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (n0.M(format) || m2.b.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(od.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(od.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        f0 p10 = i0.p();
        for (Map.Entry entry : hashMap.entrySet()) {
            p10.c(new m2.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new m2.b(p10.f(), i0Var, list);
    }

    public static AudioDeviceInfo d(AudioManager audioManager, d2.f fVar) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(fVar.b());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }

    public static Object e(Bundle bundle) {
        return bundle.getParcelable("RESULT_DATA", Intent.class);
    }

    public static String f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void h(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}

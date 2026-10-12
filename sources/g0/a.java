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
import e0.g0;
import e2.m0;
import e9.k0;
import e9.n0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v7.b8;
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

    public static void b(Canvas canvas, g0 g0Var, int i10, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i10 * 8, (float[]) g0Var.f8218b, 0, (float[]) g0Var.f8219c, 0, (int[]) g0Var.e, 0, (short[]) g0Var.d, 0, i10 * 6, paint);
    }

    public static k2.b c(AudioManager audioManager, b2.f fVar, n0 n0Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(fVar.b());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(b8.a(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i10);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (m0.M(format) || k2.b.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(b8.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(b8.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        k0 t10 = n0.t();
        for (Map.Entry entry : hashMap.entrySet()) {
            t10.c(new k2.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new k2.b(t10.f(), n0Var, list);
    }

    public static AudioDeviceInfo d(AudioManager audioManager, b2.f fVar) {
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

package g0;

import a6.i;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import e0.i0;
import e2.d0;
import e9.f0;
import j2.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v7.y7;
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

    public static void b(Canvas canvas, i0 i0Var, int i10, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i10 * 8, (float[]) i0Var.f7090b, 0, (float[]) i0Var.f7091c, 0, (int[]) i0Var.e, 0, (short[]) i0Var.d, 0, i10 * 6, paint);
    }

    public static k2.b c(AudioManager audioManager, b2.e eVar) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) eVar.b().f2037a);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(y7.a(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i10);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (d0.K(format) || k2.b.e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(y7.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(y7.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        f0 u10 = e9.i0.u();
        for (Map.Entry entry : hashMap.entrySet()) {
            u10.b(new k2.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new k2.b(u10.i());
    }

    public static i d(AudioManager audioManager, b2.e eVar) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) eVar.b().f2037a);
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return new i(h.c(audioDevicesForAttributes.get(0)), 27);
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

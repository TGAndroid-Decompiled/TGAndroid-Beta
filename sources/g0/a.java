package g0;

import a4.k;
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
import android.window.OnBackInvokedDispatcher;
import c8.e1;
import h2.m0;
import h9.f0;
import h9.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.telegram.ui.qb1;
import org.telegram.ui.sn0;
import org.telegram.ui.xb1;
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

    public static void b(Canvas canvas, k kVar, int i7, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i7 * 8, (float[]) kVar.f192c, 0, (float[]) kVar.d, 0, (int[]) kVar.f194f, 0, (short[]) kVar.f193e, 0, i7 * 6, paint);
    }

    public static n2.b c(AudioManager audioManager, e2.e eVar, i0 i0Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(eVar.b());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(e1.a(12)));
        for (int i7 = 0; i7 < directProfilesForAttributes.size(); i7++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i7);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (m0.M(format) || n2.b.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(e1.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(e1.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        f0 p10 = i0.p();
        for (Map.Entry entry : hashMap.entrySet()) {
            p10.c(new n2.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new n2.b(p10.f(), i0Var, list);
    }

    public static AudioDeviceInfo d(AudioManager audioManager, e2.e eVar) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(eVar.b());
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

    public static sn0 h(xb1 xb1Var, qb1 qb1Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = xb1Var.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return null;
        }
        sn0 sn0Var = new sn0(qb1Var, 1);
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, sn0Var);
        return sn0Var;
    }

    public static void i(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static void j(xb1 xb1Var, sn0 sn0Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = xb1Var.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(sn0Var);
        }
    }
}

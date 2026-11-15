package ai;

import android.content.Context;
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
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.telegram.ui.qb1;
import org.telegram.ui.tn0;
import org.telegram.ui.xb1;
public abstract class d {
    public static boolean f1173a;
    public static long f1174b;
    public static int f1175c;
    public static boolean d;

    public static void a(Context context) {
        if (f1175c == 0 && !d) {
            ArrayList arrayList = new ArrayList();
            try {
                if (SpeechRecognizer.isRecognitionAvailable(context)) {
                    arrayList.add(SpeechRecognizer.createSpeechRecognizer(context));
                }
            } catch (Throwable unused) {
            }
            if (arrayList.isEmpty()) {
                f1175c = -1;
                Log.d("Dictation", "support probe: no recognition service");
                return;
            }
            d = true;
            int[] iArr = {arrayList.size()};
            boolean[] zArr = {false};
            boolean[] zArr2 = {false};
            a1.e eVar = new a1.e(8, zArr2, arrayList);
            org.telegram.messenger.g0.i3(new a1.e(9, zArr2, eVar), 3000L);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                SpeechRecognizer speechRecognizer = (SpeechRecognizer) arrayList.get(i7);
                Intent putExtra = new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                b bVar = new b(new boolean[]{false}, zArr2, iArr, zArr, eVar);
                try {
                    speechRecognizer.checkRecognitionSupport(putExtra, context.getMainExecutor(), new c(zArr, bVar));
                } catch (Throwable unused2) {
                    bVar.run();
                }
                i7 = i10;
            }
        }
    }

    public static Paint b(Bitmap bitmap) {
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

    public static void c(Canvas canvas, a4.k kVar, int i7, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i7 * 8, (float[]) kVar.f192c, 0, (float[]) kVar.d, 0, (int[]) kVar.f194f, 0, (short[]) kVar.f193e, 0, i7 * 6, paint);
    }

    public static n2.b d(AudioManager audioManager, e2.e eVar, h9.i0 i0Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(eVar.b());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(c8.g1.a(12)));
        for (int i7 = 0; i7 < directProfilesForAttributes.size(); i7++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i7);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (h2.l0.M(format) || n2.b.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(c8.g1.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(c8.g1.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        h9.f0 p10 = h9.i0.p();
        for (Map.Entry entry : hashMap.entrySet()) {
            p10.c(new n2.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new n2.b(p10.f(), i0Var, list);
    }

    public static AudioDeviceInfo e(AudioManager audioManager, e2.e eVar) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(eVar.b());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }

    public static Object f(Bundle bundle) {
        return bundle.getParcelable("RESULT_DATA", Intent.class);
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h() {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = f1174b;
        if (j3 == 0 || elapsedRealtime - j3 > 60000) {
            f1174b = elapsedRealtime;
            try {
                z10 = SpeechRecognizer.isRecognitionAvailable(org.telegram.messenger.t0.f26600b);
            } catch (Throwable unused) {
                z10 = false;
            }
            f1173a = z10;
        }
        if (!f1173a || f1175c < 0) {
            return false;
        }
        return true;
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static tn0 j(xb1 xb1Var, qb1 qb1Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = xb1Var.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return null;
        }
        tn0 tn0Var = new tn0(qb1Var, 1);
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, tn0Var);
        return tn0Var;
    }

    public static void k(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static void l(xb1 xb1Var, tn0 tn0Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = xb1Var.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(tn0Var);
        }
    }
}

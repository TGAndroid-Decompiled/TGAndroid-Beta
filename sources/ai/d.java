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
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.ac1;
import org.telegram.ui.tb1;
import org.telegram.ui.wn0;
public abstract class d {
    public static boolean f1138a;
    public static long f1139b;
    public static int f1140c;
    public static boolean d;

    public static void a(Context context) {
        if (f1140c == 0 && !d) {
            ArrayList arrayList = new ArrayList();
            try {
                if (SpeechRecognizer.isRecognitionAvailable(context)) {
                    arrayList.add(SpeechRecognizer.createSpeechRecognizer(context));
                }
            } catch (Throwable unused) {
            }
            if (arrayList.isEmpty()) {
                f1140c = -1;
                Log.d("Dictation", "support probe: no recognition service");
                return;
            }
            d = true;
            int[] iArr = {arrayList.size()};
            boolean[] zArr = {false};
            boolean[] zArr2 = {false};
            a1.e eVar = new a1.e(8, zArr2, arrayList);
            org.telegram.messenger.g0.h3(new a1.e(9, zArr2, eVar), 3000L);
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

    public static boolean b(Context context) {
        if (context != null && DictationAsr.C()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = w0.f1589a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            w0.b(linkedHashMap, context);
            ArrayList arrayList2 = new ArrayList(linkedHashMap.values());
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                String language = Locale.forLanguageTag((String) obj).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                    arrayList.add(language);
                }
            }
            if (arrayList.size() > 1) {
                arrayList.remove("en");
            }
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (DictationAsr.J((String) obj2) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Paint c(Bitmap bitmap) {
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

    public static void d(Canvas canvas, a4.k kVar, int i7, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i7 * 8, (float[]) kVar.f192c, 0, (float[]) kVar.d, 0, (int[]) kVar.f194f, 0, (short[]) kVar.f193e, 0, i7 * 6, paint);
    }

    public static n2.b e(AudioManager audioManager, e2.e eVar, h9.i0 i0Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(eVar.b());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(c8.k1.a(12)));
        for (int i7 = 0; i7 < directProfilesForAttributes.size(); i7++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i7);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (h2.l0.M(format) || n2.b.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(c8.k1.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(c8.k1.a(audioProfile.getChannelMasks())));
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

    public static AudioDeviceInfo f(AudioManager audioManager, e2.e eVar) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(eVar.b());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }

    public static Object g(Bundle bundle) {
        return bundle.getParcelable("RESULT_DATA", Intent.class);
    }

    public static String h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean i() {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = f1139b;
        if (j3 == 0 || elapsedRealtime - j3 > 60000) {
            f1139b = elapsedRealtime;
            try {
                z10 = SpeechRecognizer.isRecognitionAvailable(org.telegram.messenger.t0.f26941b);
            } catch (Throwable unused) {
                z10 = false;
            }
            f1138a = z10;
        }
        if (!f1138a || f1140c < 0) {
            return false;
        }
        return true;
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static wn0 k(ac1 ac1Var, tb1 tb1Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = ac1Var.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return null;
        }
        wn0 wn0Var = new wn0(tb1Var, 1);
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, wn0Var);
        return wn0Var;
    }

    public static void l(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static void m(ac1 ac1Var, wn0 wn0Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = ac1Var.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(wn0Var);
        }
    }
}

package defpackage;

import android.app.ActivityManager;
import android.app.Application;
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
import android.os.Process;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public abstract class s4 {
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

    public static void b(Canvas canvas, e0c e0cVar, int i, Paint paint) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i << 3, (float[]) e0cVar.c, 0, (float[]) e0cVar.d, 0, (int[]) e0cVar.f, 0, (short[]) e0cVar.e, 0, i * 6, paint);
    }

    public static ArrayList c(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = n34.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(mm2.c(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList3.add(new bn8(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, rr5.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public static r00 d(AudioManager audioManager, o00 o00Var, mo5 mo5Var, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(o00Var.b());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(ine.a(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (hac.N(format) || r00.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(ine.a(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(ine.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        jo5 p = mo5.p();
        for (Map.Entry entry : hashMap.entrySet()) {
            p.c(new q00(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new r00(p.f(), mo5Var, list);
    }

    public static AudioDeviceInfo e(AudioManager audioManager, o00 o00Var) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(o00Var.b());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }

    public static bn8 f(Context context) {
        Object obj;
        String j;
        context.getClass();
        int myPid = Process.myPid();
        ArrayList c = c(context);
        int size = c.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = c.get(i);
                i++;
                if (((bn8) obj).b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        bn8 bn8Var = (bn8) obj;
        if (bn8Var == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 33) {
                j = Process.myProcessName();
                j.getClass();
            } else if ((i2 < 28 || (j = Application.getProcessName()) == null) && (j = fp.j()) == null) {
                j = "";
            }
            return new bn8(myPid, 0, j, false);
        }
        return bn8Var;
    }

    public static Object g(Bundle bundle) {
        return bundle.getParcelable("RESULT_DATA", Intent.class);
    }

    public static String h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static up j(bic bicVar, thc thcVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = bicVar.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return null;
        }
        up upVar = new up(thcVar, (byte) 6);
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, upVar);
        return upVar;
    }

    public static void k(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static void l(bic bicVar, up upVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher = bicVar.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(upVar);
        }
    }
}

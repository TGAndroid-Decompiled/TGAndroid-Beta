package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public abstract class mka {
    public static volatile jka a;
    public static volatile ArrayList b;

    public static void a(Context context, ArrayList arrayList) {
        List p = p(arrayList);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            c(context, p);
        }
        if (i >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                arrayList2.add(((hka) obj).c());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw qu6.l(it);
    }

    public static boolean b(Context context, hka hkaVar) {
        Bitmap decodeStream;
        IconCompat c;
        IconCompat iconCompat = hkaVar.h;
        if (iconCompat != null) {
            int i = iconCompat.a;
            if (i != 6 && i != 4) {
                return true;
            }
            InputStream k = iconCompat.k(context);
            if (k == null || (decodeStream = BitmapFactory.decodeStream(k)) == null) {
                return false;
            }
            if (i == 6) {
                c = new IconCompat(5);
                c.b = decodeStream;
            } else {
                c = IconCompat.c(decodeStream);
            }
            hkaVar.h = c;
            return true;
        }
        return false;
    }

    public static void c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hka hkaVar = (hka) obj;
            if (!b(context, hkaVar)) {
                list.remove(hkaVar);
            }
        }
    }

    public static Icon d(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static List e(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = vr9.b(context.getSystemService(vr9.i())).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                arrayList.add(new gka(context, shortcutInfo).a());
            }
            return arrayList;
        }
        try {
            return j(context).b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static void f(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static int g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return vr9.b(context.getSystemService(vr9.i())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static ArrayList h(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static List i(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, mka.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) == null) {
                            arrayList.add(null);
                        } else {
                            throw new ClassCastException();
                            break;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static jka j(Context context) {
        if (a == null) {
            try {
                a = (jka) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, mka.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new Object();
            }
        }
        return a;
    }

    public static List k(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return hka.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((ShortcutManager) context.getSystemService(ShortcutManager.class)).getPinnedShortcuts());
            return hka.a(context, arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void m(android.content.Context r11, defpackage.hka r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mka.m(android.content.Context, hka):void");
    }

    public static void n(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            vr9.b(context.getSystemService(vr9.i())).removeAllDynamicShortcuts();
        }
        j(context).c();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw qu6.l(it);
    }

    public static void o(Context context, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(arrayList);
        }
        j(context).d(arrayList);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw qu6.l(it);
    }

    public static List p(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((hka) obj).getClass();
        }
        return arrayList2;
    }

    public static void q(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            vr9.b(context.getSystemService(vr9.i())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            grb.o();
        } else {
            Collections.singletonList(str);
            throw null;
        }
    }

    public static void r(android.content.Context r17, defpackage.hka r18, android.content.IntentSender r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mka.r(android.content.Context, hka, android.content.IntentSender):void");
    }

    public static void s(Window window) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(false);
    }

    public static void t(Window window) {
        window.setDecorFitsSystemWindows(false);
    }

    public static void u(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void v(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void w(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            efd.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static defpackage.ev6 x(android.media.MediaRoute2Info r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mka.x(android.media.MediaRoute2Info):ev6");
    }

    public static void y(Context context, ArrayList arrayList) {
        List p = p(arrayList);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            c(context, p);
        }
        if (i >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                arrayList2.add(((hka) obj).c());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw qu6.l(it);
    }
}

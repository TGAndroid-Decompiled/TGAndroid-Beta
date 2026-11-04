package g0;

import a1.g;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.drawable.IconCompat;
import d2.t1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public abstract class f {
    public static volatile e f11793a;
    public static volatile ArrayList f11794b;

    public static void a(Context context, ArrayList arrayList) {
        List p10 = p(arrayList);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 29) {
            c(context, p10);
        }
        if (i3 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p10;
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                arrayList2.add(((c) obj).d());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p10);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw g.m(it);
    }

    public static boolean b(Context context, c cVar) {
        Bitmap decodeStream;
        IconCompat c2;
        IconCompat iconCompat = cVar.h;
        if (iconCompat != null) {
            int i3 = iconCompat.f1549a;
            if (i3 != 6 && i3 != 4) {
                return true;
            }
            InputStream k10 = iconCompat.k(context);
            if (k10 == null || (decodeStream = BitmapFactory.decodeStream(k10)) == null) {
                return false;
            }
            if (i3 == 6) {
                c2 = new IconCompat(5);
                c2.f1550b = decodeStream;
            } else {
                c2 = IconCompat.c(decodeStream);
            }
            cVar.h = c2;
            return true;
        }
        return false;
    }

    public static void c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            c cVar = (c) obj;
            if (!b(context, cVar)) {
                list.remove(cVar);
            }
        }
    }

    public static Icon d(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static List e(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = t1.b(context.getSystemService(t1.e())).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                arrayList.add(new b(context, shortcutInfo).a());
            }
            return arrayList;
        }
        try {
            return j(context).b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static void f(int i3) {
        SdkExtensions.getExtensionVersion(i3);
    }

    public static int g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return t1.b(context.getSystemService(t1.e())).getMaxShortcutCountPerActivity();
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

    public static java.util.List i(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: g0.f.i(android.content.Context):java.util.List");
    }

    public static e j(Context context) {
        if (f11793a == null) {
            try {
                f11793a = (e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f11793a == null) {
                f11793a = new Object();
            }
        }
        return f11793a;
    }

    public static List k(Context context) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            return c.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i3 >= 25) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((ShortcutManager) context.getSystemService(ShortcutManager.class)).getPinnedShortcuts());
            return c.a(context, arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void m(Context context, c cVar) {
        context.getClass();
        cVar.getClass();
        int i3 = Build.VERSION.SDK_INT;
        int g7 = g(context);
        if (g7 != 0) {
            if (i3 <= 29) {
                b(context, cVar);
            }
            int i10 = -1;
            if (i3 >= 30) {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(cVar.d());
            } else if (i3 >= 25) {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (shortcutManager.isRateLimitingActive()) {
                    return;
                }
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= g7) {
                    int i11 = -1;
                    String str = null;
                    for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                        if (shortcutInfo.getRank() > i11) {
                            str = shortcutInfo.getId();
                            i11 = shortcutInfo.getRank();
                        }
                    }
                    shortcutManager.removeDynamicShortcuts(Arrays.asList(str));
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(cVar.d()));
            }
            e j10 = j(context);
            try {
                List<c> b10 = j10.b();
                if (b10.size() >= g7) {
                    String str2 = null;
                    for (c cVar2 : b10) {
                        int i12 = cVar2.f11791m;
                        if (i12 > i10) {
                            str2 = cVar2.f11782b;
                            i10 = i12;
                        }
                    }
                    j10.d(Arrays.asList(str2));
                }
                j10.a(Arrays.asList(cVar));
                Iterator it = ((ArrayList) i(context)).iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        Collections.singletonList(cVar);
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Exception unused) {
                Iterator it2 = ((ArrayList) i(context)).iterator();
                if (it2.hasNext()) {
                    if (it2.next() == null) {
                        Collections.singletonList(cVar);
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                Iterator it3 = ((ArrayList) i(context)).iterator();
                if (it3.hasNext()) {
                    if (it3.next() == null) {
                        Collections.singletonList(cVar);
                        throw null;
                    }
                    throw new ClassCastException();
                }
                q(context, cVar.f11782b);
                throw th2;
            }
            q(context, cVar.f11782b);
        }
    }

    public static void n(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            t1.b(context.getSystemService(t1.e())).removeAllDynamicShortcuts();
        }
        j(context).c();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw g.m(it);
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
        throw g.m(it);
    }

    public static List p(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((c) obj).getClass();
        }
        return arrayList2;
    }

    public static void q(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            t1.b(context.getSystemService(t1.e())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() == null) {
            Collections.singletonList(str);
            throw null;
        }
        throw new ClassCastException();
    }

    public static void r(android.content.Context r16, g0.c r17, android.content.IntentSender r18) {
        throw new UnsupportedOperationException("Method not decompiled: g0.f.r(android.content.Context, g0.c, android.content.IntentSender):void");
    }

    public static void s(Window window) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(false);
    }

    public static void t(Window window) {
        window.setDecorFitsSystemWindows(false);
    }

    public static void u(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void v(Surface surface, float f10) {
        int i3;
        if (f10 == 0.0f) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        try {
            surface.setFrameRate(f10, i3);
        } catch (IllegalStateException e10) {
            g2.a.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    public static r4.m w(android.media.MediaRoute2Info r13) {
        throw new UnsupportedOperationException("Method not decompiled: g0.f.w(android.media.MediaRoute2Info):r4.m");
    }

    public static void x(Context context, ArrayList arrayList) {
        List p10 = p(arrayList);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 29) {
            c(context, p10);
        }
        if (i3 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p10;
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                arrayList2.add(((c) obj).d());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p10);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw g.m(it);
    }
}

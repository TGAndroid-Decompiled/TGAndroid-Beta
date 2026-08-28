package g0;

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
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.drawable.IconCompat;
import fh.y5;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public abstract class f {
    public static volatile e f7065a;
    public static volatile ArrayList f7066b;

    public static void a(Context context, ArrayList arrayList) {
        List p6 = p(arrayList);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 29) {
            c(context, p6);
        }
        if (i9 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p6;
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
        j(context).a(p6);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public static boolean b(Context context, c cVar) {
        Bitmap decodeStream;
        IconCompat c10;
        IconCompat iconCompat = cVar.h;
        if (iconCompat != null) {
            int i9 = iconCompat.f675a;
            if (i9 != 6 && i9 != 4) {
                return true;
            }
            InputStream k10 = iconCompat.k(context);
            if (k10 == null || (decodeStream = BitmapFactory.decodeStream(k10)) == null) {
                return false;
            }
            if (i9 == 6) {
                c10 = new IconCompat(5);
                c10.f676b = decodeStream;
            } else {
                c10 = IconCompat.c(decodeStream);
            }
            cVar.h = c10;
            return true;
        }
        return false;
    }

    public static void c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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
            List<ShortcutInfo> dynamicShortcuts = y5.b(context.getSystemService(y5.g())).getDynamicShortcuts();
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

    public static void f(int i9) {
        SdkExtensions.getExtensionVersion(i9);
    }

    public static int g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return y5.b(context.getSystemService(y5.g())).getMaxShortcutCountPerActivity();
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
        if (f7066b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) == null) {
                            arrayList.add(null);
                        } else {
                            throw new ClassCastException();
                            break;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (f7066b == null) {
                f7066b = arrayList;
            }
        }
        return f7066b;
    }

    public static e j(Context context) {
        if (f7065a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f7065a = (e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f7065a == null) {
                f7065a = new Object();
            }
        }
        return f7065a;
    }

    public static List k(Context context) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            return c.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i9 >= 25) {
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
        int i9 = Build.VERSION.SDK_INT;
        int g10 = g(context);
        if (g10 != 0) {
            if (i9 <= 29) {
                b(context, cVar);
            }
            int i10 = -1;
            if (i9 >= 30) {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(cVar.d());
            } else if (i9 >= 25) {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (shortcutManager.isRateLimitingActive()) {
                    return;
                }
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= g10) {
                    String str = null;
                    int i11 = -1;
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
                if (b10.size() >= g10) {
                    String str2 = null;
                    for (c cVar2 : b10) {
                        int i12 = cVar2.f7063m;
                        if (i12 > i10) {
                            str2 = cVar2.f7054b;
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
            } catch (Throwable th) {
                Iterator it3 = ((ArrayList) i(context)).iterator();
                if (it3.hasNext()) {
                    if (it3.next() == null) {
                        Collections.singletonList(cVar);
                        throw null;
                    }
                    throw new ClassCastException();
                }
                q(context, cVar.f7054b);
                throw th;
            }
            q(context, cVar.f7054b);
        }
    }

    public static void n(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            y5.b(context.getSystemService(y5.g())).removeAllDynamicShortcuts();
        }
        j(context).c();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
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
        it.next().getClass();
        throw new ClassCastException();
    }

    public static List p(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((c) obj).getClass();
        }
        return arrayList2;
    }

    public static void q(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            y5.b(context.getSystemService(y5.g())).reportShortcutUsed(str);
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

    public static c2.n v(android.media.MediaRoute2Info r13) {
        throw new UnsupportedOperationException("Method not decompiled: g0.f.v(android.media.MediaRoute2Info):c2.n");
    }

    public static void w(Context context, ArrayList arrayList) {
        List p6 = p(arrayList);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 29) {
            c(context, p6);
        }
        if (i9 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p6;
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
        j(context).a(p6);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}

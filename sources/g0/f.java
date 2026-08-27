package g0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.drawable.IconCompat;
import c2.a0;
import c2.m;
import c2.n;
import f9.z;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class f {

    public static volatile e f6343a;

    public static volatile ArrayList f6344b;

    public static void a(Context context, ArrayList arrayList) {
        List listP = p(arrayList);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, listP);
        }
        if (i10 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) listP;
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                arrayList2.add(((c) obj).d());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(listP);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static boolean b(Context context, c cVar) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatC;
        IconCompat iconCompat = cVar.h;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.f1176a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream inputStreamK = iconCompat.k(context);
        if (inputStreamK == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamK)) == null) {
            return false;
        }
        if (i10 == 6) {
            iconCompatC = new IconCompat(5);
            iconCompatC.f1177b = bitmapDecodeStream;
        } else {
            iconCompatC = IconCompat.c(bitmapDecodeStream);
        }
        cVar.h = iconCompatC;
        return true;
    }

    public static void c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return j(context).b();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List<ShortcutInfo> dynamicShortcuts = z.b(context.getSystemService(z.g())).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).a());
        }
        return arrayList;
    }

    public static void f(int i10) {
        SdkExtensions.getExtensionVersion(i10);
    }

    public static int g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return z.b(context.getSystemService(z.g())).getMaxShortcutCountPerActivity();
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
        if (f6344b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (f6344b == null) {
                f6344b = arrayList;
            }
        }
        return f6344b;
    }

    public static e j(Context context) {
        if (f6343a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f6343a = (e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f6343a == null) {
                f6343a = new d();
            }
        }
        return f6343a;
    }

    public static List k(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return c.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i10 < 25) {
            return Collections.EMPTY_LIST;
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(shortcutManager.getPinnedShortcuts());
        return c.a(context, arrayList);
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void m(Context context, c cVar) {
        context.getClass();
        cVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        int iG = g(context);
        if (iG == 0) {
            return;
        }
        if (i10 <= 29) {
            b(context, cVar);
        }
        int i11 = -1;
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(cVar.d());
        } else if (i10 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iG) {
                String id2 = null;
                int rank = -1;
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    if (shortcutInfo.getRank() > rank) {
                        id2 = shortcutInfo.getId();
                        rank = shortcutInfo.getRank();
                    }
                }
                shortcutManager.removeDynamicShortcuts(Arrays.asList(id2));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(cVar.d()));
        }
        e eVarJ = j(context);
        try {
            List<c> listB = eVarJ.b();
            if (listB.size() >= iG) {
                String str = null;
                for (c cVar2 : listB) {
                    int i12 = cVar2.f6341m;
                    if (i12 > i11) {
                        str = cVar2.f6332b;
                        i11 = i12;
                    }
                }
                eVarJ.d(Arrays.asList(str));
            }
            eVarJ.a(Arrays.asList(cVar));
            Iterator it = ((ArrayList) i(context)).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(cVar);
                throw null;
            }
        } catch (Exception unused) {
            Iterator it2 = ((ArrayList) i(context)).iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(cVar);
                throw null;
            }
        } catch (Throwable th) {
            Iterator it3 = ((ArrayList) i(context)).iterator();
            if (!it3.hasNext()) {
                q(context, cVar.f6332b);
                throw th;
            }
            if (it3.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(cVar);
            throw null;
        }
        q(context, cVar.f6332b);
    }

    public static void n(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            z.b(context.getSystemService(z.g())).removeAllDynamicShortcuts();
        }
        j(context).c();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static void o(Context context, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(arrayList);
        }
        j(context).d(arrayList);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static List p(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c) obj).getClass();
        }
        return arrayList2;
    }

    public static void q(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            z.b(context.getSystemService(z.g())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(str);
            throw null;
        }
    }

    public static void r(Context context, c cVar, IntentSender intentSender) {
        boolean zIsRequestPinShortcutSupported;
        Bitmap bitmapB;
        Object obj;
        Resources resourcesForApplication;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(cVar.d(), intentSender);
            return;
        }
        if (i10 >= 26) {
            zIsRequestPinShortcutSupported = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        } else if (f0.e.b(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            zIsRequestPinShortcutSupported = false;
        } else {
            Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = it.next().activityInfo.permission;
                    if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                        zIsRequestPinShortcutSupported = true;
                    }
                } else {
                    zIsRequestPinShortcutSupported = false;
                }
            }
        }
        if (zIsRequestPinShortcutSupported) {
            Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            Intent[] intentArr = cVar.f6333c;
            intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", cVar.f6334e.toString());
            IconCompat iconCompat = cVar.h;
            if (iconCompat != null) {
                Context context2 = cVar.f6331a;
                if (iconCompat.f1176a == 2 && (obj = iconCompat.f1177b) != null) {
                    String str2 = (String) obj;
                    if (str2.contains(":")) {
                        String str3 = str2.split(":", -1)[1];
                        String str4 = str3.split("/", -1)[0];
                        String str5 = str3.split("/", -1)[1];
                        String str6 = str2.split(":", -1)[0];
                        if ("0_resource_name_obfuscated".equals(str5)) {
                            Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                        } else {
                            String strH = iconCompat.h();
                            if ("android".equals(strH)) {
                                resourcesForApplication = Resources.getSystem();
                            } else {
                                PackageManager packageManager = context2.getPackageManager();
                                try {
                                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strH, 8192);
                                    resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                                } catch (PackageManager.NameNotFoundException e9) {
                                    Log.e("IconCompat", "Unable to find pkg=" + strH + " for icon", e9);
                                }
                            }
                            int identifier = resourcesForApplication.getIdentifier(str5, str4, str6);
                            if (iconCompat.f1179e != identifier) {
                                Log.i("IconCompat", "Id has changed for " + strH + " " + str2);
                                iconCompat.f1179e = identifier;
                            }
                        }
                    }
                }
                int i11 = iconCompat.f1176a;
                if (i11 == 1) {
                    bitmapB = (Bitmap) iconCompat.f1177b;
                } else if (i11 == 2) {
                    try {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context2.createPackageContext(iconCompat.h(), 0), iconCompat.f1179e));
                    } catch (PackageManager.NameNotFoundException e10) {
                        throw new IllegalArgumentException("Can't find package " + iconCompat.f1177b, e10);
                    }
                } else {
                    if (i11 != 5) {
                        throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                    }
                    bitmapB = IconCompat.b((Bitmap) iconCompat.f1177b, true);
                }
                intent.putExtra("android.intent.extra.shortcut.ICON", bitmapB);
            }
            if (intentSender == null) {
                context.sendBroadcast(intent);
            } else {
                context.sendOrderedBroadcast(intent, null, new androidx.mediarouter.app.f(intentSender, 5), null, -1, null, null);
            }
        }
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

    public static n v(MediaRoute2Info mediaRoute2Info) {
        int i10;
        if (mediaRoute2Info != null) {
            m mVar = new m(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            int connectionState = mediaRoute2Info.getConnectionState();
            Bundle bundle = mVar.f2306a;
            bundle.putInt("connectionState", connectionState);
            bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras == null) {
                bundle.putBundle("extras", null);
            } else {
                bundle.putBundle("extras", new Bundle(extras));
            }
            bundle.putBoolean("enabled", true);
            bundle.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle.putStringArrayList("deduplicationIds", new ArrayList<>(a0.b(mediaRoute2Info)));
                int iC = a0.c(mediaRoute2Info);
                i10 = 2;
                if (iC == 2) {
                    i10 = 12;
                } else if (iC == 3) {
                    i10 = 13;
                } else if (iC == 4) {
                    i10 = 14;
                } else if (iC == 22) {
                    i10 = 20;
                } else if (iC == 23) {
                    i10 = 21;
                } else if (iC == 26) {
                    i10 = 22;
                } else if (iC == 29) {
                    i10 = 24;
                } else if (iC != 2000) {
                    switch (iC) {
                        case 8:
                            i10 = 3;
                            break;
                        case 9:
                            i10 = 16;
                            break;
                        case 10:
                            i10 = 23;
                            break;
                        case 11:
                            i10 = 17;
                            break;
                        case 12:
                            i10 = 18;
                            break;
                        case 13:
                            i10 = 19;
                            break;
                        default:
                            switch (iC) {
                                case 1001:
                                    i10 = 1;
                                    break;
                                case 1002:
                                    break;
                                case 1003:
                                    i10 = 4;
                                    break;
                                case 1004:
                                    i10 = 5;
                                    break;
                                case 1005:
                                    i10 = 6;
                                    break;
                                case 1006:
                                    i10 = 7;
                                    break;
                                case 1007:
                                    i10 = 8;
                                    break;
                                case 1008:
                                    i10 = 9;
                                    break;
                                case 1009:
                                    i10 = 10;
                                    break;
                                case 1010:
                                    i10 = 11;
                                    break;
                                default:
                                    i10 = 0;
                                    break;
                            }
                            break;
                    }
                } else {
                    i10 = 1000;
                }
            } else {
                i10 = 0;
            }
            CharSequence description = mediaRoute2Info.getDescription();
            if (description != null) {
                bundle.putString("status", description.toString());
            }
            Uri iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
                bundle.putString("iconUri", iconUri.toString());
            }
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle2 == null) {
                    bundle.putBundle("extras", null);
                } else {
                    bundle.putBundle("extras", new Bundle(bundle2));
                }
                if (i10 == 0) {
                    i10 = extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                }
                bundle.putInt("deviceType", i10);
                bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                    mVar.a(parcelableArrayList);
                }
                return mVar.b();
            }
        }
        return null;
    }

    public static void w(Context context, ArrayList arrayList) {
        List listP = p(arrayList);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, listP);
        }
        if (i10 >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) listP;
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                arrayList2.add(((c) obj).d());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(listP);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}

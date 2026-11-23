package org.telegram.messenger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public abstract class as {
    public static final LinkedList f22928a;
    public static boolean f22929b;
    public static xr f22930c;
    public static ComponentName d;

    static {
        LinkedList linkedList = new LinkedList();
        f22928a = linkedList;
        linkedList.add(NotificationBadge$AdwHomeBadger.class);
        linkedList.add(NotificationBadge$ApexHomeBadger.class);
        linkedList.add(NotificationBadge$NewHtcHomeBadger.class);
        linkedList.add(NotificationBadge$NovaHomeBadger.class);
        linkedList.add(NotificationBadge$SonyHomeBadger.class);
        linkedList.add(NotificationBadge$XiaomiHomeBadger.class);
        linkedList.add(NotificationBadge$AsusHomeBadger.class);
        linkedList.add(NotificationBadge$HuaweiHomeBadger.class);
        linkedList.add(NotificationBadge$OPPOHomeBader.class);
        linkedList.add(NotificationBadge$SamsungHomeBadger.class);
        linkedList.add(NotificationBadge$ZukHomeBadger.class);
        linkedList.add(NotificationBadge$VivoHomeBadger.class);
    }

    public static boolean a(Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = t0.f26895b.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static void b() {
        xr xrVar;
        xr xrVar2;
        Context context = t0.f26895b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            d = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                Iterator it = f22928a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        xrVar2 = (xr) ((Class) it.next()).newInstance();
                    } catch (Exception unused) {
                        xrVar2 = null;
                    }
                    if (xrVar2 != null && xrVar2.b().contains(str)) {
                        f22930c = xrVar2;
                        break;
                    }
                }
                if (f22930c != null) {
                    return;
                }
            }
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                for (int i7 = 0; i7 < queryIntentActivities.size(); i7++) {
                    String str2 = queryIntentActivities.get(i7).activityInfo.packageName;
                    Iterator it2 = f22928a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        try {
                            xrVar = (xr) ((Class) it2.next()).newInstance();
                        } catch (Exception unused2) {
                            xrVar = null;
                        }
                        if (xrVar != null && xrVar.b().contains(str2)) {
                            f22930c = xrVar;
                            break;
                        }
                    }
                    if (f22930c != null) {
                        break;
                    }
                }
            }
            if (f22930c == null) {
                String str3 = Build.MANUFACTURER;
                if (str3.equalsIgnoreCase("Xiaomi")) {
                    f22930c = new xr() {
                        @Override
                        public final void a(int i10) {
                            Integer valueOf;
                            Object obj = "";
                            try {
                                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                                Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                                declaredField.setAccessible(true);
                                if (i10 == 0) {
                                    valueOf = "";
                                } else {
                                    valueOf = Integer.valueOf(i10);
                                }
                                declaredField.set(newInstance, String.valueOf(valueOf));
                            } catch (Throwable unused3) {
                                Intent intent2 = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                                intent2.putExtra("android.intent.extra.update_application_component_name", as.d.getPackageName() + "/" + as.d.getClassName());
                                if (i10 != 0) {
                                    obj = Integer.valueOf(i10);
                                }
                                intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
                                if (as.a(intent2)) {
                                    g0.g3(new j6.o(intent2, 12));
                                }
                            }
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
                        }
                    };
                } else if (str3.equalsIgnoreCase("ZUK")) {
                    f22930c = new NotificationBadge$ZukHomeBadger();
                } else if (str3.equalsIgnoreCase("OPPO")) {
                    f22930c = new xr() {
                        public int f22757a = -1;

                        @Override
                        public final void a(int i10) {
                            if (this.f22757a != i10) {
                                this.f22757a = i10;
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("app_badge_count", i10);
                                    t0.f26895b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                                } catch (Throwable unused3) {
                                }
                            }
                        }

                        @Override
                        public final List b() {
                            return Collections.singletonList("com.oppo.launcher");
                        }
                    };
                } else if (str3.equalsIgnoreCase("VIVO")) {
                    f22930c = new xr() {
                        @Override
                        public final void a(int i10) {
                            Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                            intent2.setPackage("com.vivo.launcher");
                            intent2.putExtra("packageName", t0.f26895b.getPackageName());
                            intent2.putExtra("className", as.d.getClassName());
                            intent2.putExtra("notificationNum", i10);
                            t0.f26895b.sendBroadcast(intent2);
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.vivo.launcher");
                        }
                    };
                } else {
                    f22930c = new NotificationBadge$DefaultBadger();
                }
            }
        }
    }
}

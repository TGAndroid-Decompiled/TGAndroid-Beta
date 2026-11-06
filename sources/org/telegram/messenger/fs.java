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
public abstract class fs {
    public static final LinkedList f22439a;
    public static boolean f22440b;
    public static cs f22441c;
    public static ComponentName d;

    static {
        LinkedList linkedList = new LinkedList();
        f22439a = linkedList;
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
        List<ResolveInfo> queryBroadcastReceivers = t0.f25555b.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static void b() {
        cs csVar;
        cs csVar2;
        Context context = t0.f25555b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            d = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                Iterator it = f22439a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        csVar2 = (cs) ((Class) it.next()).newInstance();
                    } catch (Exception unused) {
                        csVar2 = null;
                    }
                    if (csVar2 != null && csVar2.b().contains(str)) {
                        f22441c = csVar2;
                        break;
                    }
                }
                if (f22441c != null) {
                    return;
                }
            }
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                for (int i7 = 0; i7 < queryIntentActivities.size(); i7++) {
                    String str2 = queryIntentActivities.get(i7).activityInfo.packageName;
                    Iterator it2 = f22439a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        try {
                            csVar = (cs) ((Class) it2.next()).newInstance();
                        } catch (Exception unused2) {
                            csVar = null;
                        }
                        if (csVar != null && csVar.b().contains(str2)) {
                            f22441c = csVar;
                            break;
                        }
                    }
                    if (f22441c != null) {
                        break;
                    }
                }
            }
            if (f22441c == null) {
                String str3 = Build.MANUFACTURER;
                if (str3.equalsIgnoreCase("Xiaomi")) {
                    f22441c = new cs() {
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
                                intent2.putExtra("android.intent.extra.update_application_component_name", fs.d.getPackageName() + "/" + fs.d.getClassName());
                                if (i10 != 0) {
                                    obj = Integer.valueOf(i10);
                                }
                                intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
                                if (fs.a(intent2)) {
                                    g0.h3(new m.f3(intent2, 9));
                                }
                            }
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
                        }
                    };
                } else if (str3.equalsIgnoreCase("ZUK")) {
                    f22441c = new NotificationBadge$ZukHomeBadger();
                } else if (str3.equalsIgnoreCase("OPPO")) {
                    f22441c = new cs() {
                        public int f21316a = -1;

                        @Override
                        public final void a(int i10) {
                            if (this.f21316a != i10) {
                                this.f21316a = i10;
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("app_badge_count", i10);
                                    t0.f25555b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
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
                    f22441c = new cs() {
                        @Override
                        public final void a(int i10) {
                            Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                            intent2.setPackage("com.vivo.launcher");
                            intent2.putExtra("packageName", t0.f25555b.getPackageName());
                            intent2.putExtra("className", fs.d.getClassName());
                            intent2.putExtra("notificationNum", i10);
                            t0.f25555b.sendBroadcast(intent2);
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.vivo.launcher");
                        }
                    };
                } else {
                    f22441c = new NotificationBadge$DefaultBadger();
                }
            }
        }
    }
}

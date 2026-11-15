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
public abstract class cs {
    public static final LinkedList f22937a;
    public static boolean f22938b;
    public static zr f22939c;
    public static ComponentName d;

    static {
        LinkedList linkedList = new LinkedList();
        f22937a = linkedList;
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
        List<ResolveInfo> queryBroadcastReceivers = t0.f26609b.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static void b() {
        zr zrVar;
        zr zrVar2;
        Context context = t0.f26609b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            d = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                Iterator it = f22937a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        zrVar2 = (zr) ((Class) it.next()).newInstance();
                    } catch (Exception unused) {
                        zrVar2 = null;
                    }
                    if (zrVar2 != null && zrVar2.b().contains(str)) {
                        f22939c = zrVar2;
                        break;
                    }
                }
                if (f22939c != null) {
                    return;
                }
            }
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                for (int i7 = 0; i7 < queryIntentActivities.size(); i7++) {
                    String str2 = queryIntentActivities.get(i7).activityInfo.packageName;
                    Iterator it2 = f22937a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        try {
                            zrVar = (zr) ((Class) it2.next()).newInstance();
                        } catch (Exception unused2) {
                            zrVar = null;
                        }
                        if (zrVar != null && zrVar.b().contains(str2)) {
                            f22939c = zrVar;
                            break;
                        }
                    }
                    if (f22939c != null) {
                        break;
                    }
                }
            }
            if (f22939c == null) {
                String str3 = Build.MANUFACTURER;
                if (str3.equalsIgnoreCase("Xiaomi")) {
                    f22939c = new zr() {
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
                                intent2.putExtra("android.intent.extra.update_application_component_name", cs.d.getPackageName() + "/" + cs.d.getClassName());
                                if (i10 != 0) {
                                    obj = Integer.valueOf(i10);
                                }
                                intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
                                if (cs.a(intent2)) {
                                    g0.h3(new j6.o(intent2, 12));
                                }
                            }
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
                        }
                    };
                } else if (str3.equalsIgnoreCase("ZUK")) {
                    f22939c = new NotificationBadge$ZukHomeBadger();
                } else if (str3.equalsIgnoreCase("OPPO")) {
                    f22939c = new zr() {
                        public int f22399a = -1;

                        @Override
                        public final void a(int i10) {
                            if (this.f22399a != i10) {
                                this.f22399a = i10;
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("app_badge_count", i10);
                                    t0.f26609b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
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
                    f22939c = new zr() {
                        @Override
                        public final void a(int i10) {
                            Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                            intent2.setPackage("com.vivo.launcher");
                            intent2.putExtra("packageName", t0.f26609b.getPackageName());
                            intent2.putExtra("className", cs.d.getClassName());
                            intent2.putExtra("notificationNum", i10);
                            t0.f26609b.sendBroadcast(intent2);
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.vivo.launcher");
                        }
                    };
                } else {
                    f22939c = new NotificationBadge$DefaultBadger();
                }
            }
        }
    }
}

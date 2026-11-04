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
public abstract class wr {
    public static final LinkedList f26250a;
    public static boolean f26251b;
    public static ur f26252c;
    public static ComponentName d;

    static {
        LinkedList linkedList = new LinkedList();
        f26250a = linkedList;
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
        List<ResolveInfo> queryBroadcastReceivers = t0.f25457b.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static void b() {
        ur urVar;
        ur urVar2;
        Context context = t0.f25457b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            d = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                Iterator it = f26250a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        urVar2 = (ur) ((Class) it.next()).newInstance();
                    } catch (Exception unused) {
                        urVar2 = null;
                    }
                    if (urVar2 != null && urVar2.b().contains(str)) {
                        f26252c = urVar2;
                        break;
                    }
                }
                if (f26252c != null) {
                    return;
                }
            }
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                for (int i3 = 0; i3 < queryIntentActivities.size(); i3++) {
                    String str2 = queryIntentActivities.get(i3).activityInfo.packageName;
                    Iterator it2 = f26250a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        try {
                            urVar = (ur) ((Class) it2.next()).newInstance();
                        } catch (Exception unused2) {
                            urVar = null;
                        }
                        if (urVar != null && urVar.b().contains(str2)) {
                            f26252c = urVar;
                            break;
                        }
                    }
                    if (f26252c != null) {
                        break;
                    }
                }
            }
            if (f26252c == null) {
                String str3 = Build.MANUFACTURER;
                if (str3.equalsIgnoreCase("Xiaomi")) {
                    f26252c = new ur() {
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
                                intent2.putExtra("android.intent.extra.update_application_component_name", wr.d.getPackageName() + "/" + wr.d.getClassName());
                                if (i10 != 0) {
                                    obj = Integer.valueOf(i10);
                                }
                                intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
                                if (wr.a(intent2)) {
                                    g0.h3(new mi.b0(intent2, 8));
                                }
                            }
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
                        }
                    };
                } else if (str3.equalsIgnoreCase("ZUK")) {
                    f26252c = new NotificationBadge$ZukHomeBadger();
                } else if (str3.equalsIgnoreCase("OPPO")) {
                    f26252c = new ur() {
                        public int f21370a = -1;

                        @Override
                        public final void a(int i10) {
                            if (this.f21370a != i10) {
                                this.f21370a = i10;
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("app_badge_count", i10);
                                    t0.f25457b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
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
                    f26252c = new ur() {
                        @Override
                        public final void a(int i10) {
                            Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                            intent2.setPackage("com.vivo.launcher");
                            intent2.putExtra("packageName", t0.f25457b.getPackageName());
                            intent2.putExtra("className", wr.d.getClassName());
                            intent2.putExtra("notificationNum", i10);
                            t0.f25457b.sendBroadcast(intent2);
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.vivo.launcher");
                        }
                    };
                } else {
                    f26252c = new NotificationBadge$DefaultBadger();
                }
            }
        }
    }
}

package defpackage;

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
import org.telegram.messenger.NotificationBadge$AdwHomeBadger;
import org.telegram.messenger.NotificationBadge$ApexHomeBadger;
import org.telegram.messenger.NotificationBadge$AsusHomeBadger;
import org.telegram.messenger.NotificationBadge$DefaultBadger;
import org.telegram.messenger.NotificationBadge$HuaweiHomeBadger;
import org.telegram.messenger.NotificationBadge$NewHtcHomeBadger;
import org.telegram.messenger.NotificationBadge$NovaHomeBadger;
import org.telegram.messenger.NotificationBadge$OPPOHomeBader;
import org.telegram.messenger.NotificationBadge$SamsungHomeBadger;
import org.telegram.messenger.NotificationBadge$SonyHomeBadger;
import org.telegram.messenger.NotificationBadge$VivoHomeBadger;
import org.telegram.messenger.NotificationBadge$XiaomiHomeBadger;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger;
import org.telegram.messenger.a;
public abstract class dm7 {
    public static final LinkedList a;
    public static boolean b;
    public static bm7 c;
    public static ComponentName d;

    static {
        LinkedList linkedList = new LinkedList();
        a = linkedList;
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
        List<ResolveInfo> queryBroadcastReceivers = a.b.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static void b() {
        bm7 bm7Var;
        bm7 bm7Var2;
        Context context = a.b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            d = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        bm7Var2 = (bm7) ((Class) it.next()).newInstance();
                    } catch (Exception unused) {
                        bm7Var2 = null;
                    }
                    if (bm7Var2 != null && bm7Var2.b().contains(str)) {
                        c = bm7Var2;
                        break;
                    }
                }
                if (c != null) {
                    return;
                }
            }
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    String str2 = queryIntentActivities.get(i).activityInfo.packageName;
                    Iterator it2 = a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        try {
                            bm7Var = (bm7) ((Class) it2.next()).newInstance();
                        } catch (Exception unused2) {
                            bm7Var = null;
                        }
                        if (bm7Var != null && bm7Var.b().contains(str2)) {
                            c = bm7Var;
                            break;
                        }
                    }
                    if (c != null) {
                        break;
                    }
                }
            }
            if (c == null) {
                String str3 = Build.MANUFACTURER;
                if (str3.equalsIgnoreCase("Xiaomi")) {
                    c = new bm7() {
                        @Override
                        public final void a(int i2) {
                            Integer valueOf;
                            Object obj = "";
                            try {
                                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                                Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                                declaredField.setAccessible(true);
                                if (i2 == 0) {
                                    valueOf = "";
                                } else {
                                    valueOf = Integer.valueOf(i2);
                                }
                                declaredField.set(newInstance, String.valueOf(valueOf));
                            } catch (Throwable unused3) {
                                Intent intent2 = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                                intent2.putExtra("android.intent.extra.update_application_component_name", dm7.d.getPackageName() + "/" + dm7.d.getClassName());
                                if (i2 != 0) {
                                    obj = Integer.valueOf(i2);
                                }
                                intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
                                if (dm7.a(intent2)) {
                                    gm.c3(new ei7(intent2, (byte) 2));
                                }
                            }
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
                        }
                    };
                } else if (str3.equalsIgnoreCase("ZUK")) {
                    c = new NotificationBadge$ZukHomeBadger();
                } else if (str3.equalsIgnoreCase("OPPO")) {
                    c = new bm7() {
                        public int a = -1;

                        @Override
                        public final void a(int i2) {
                            if (this.a != i2) {
                                this.a = i2;
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("app_badge_count", i2);
                                    a.b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
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
                    c = new bm7() {
                        @Override
                        public final void a(int i2) {
                            Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                            intent2.setPackage("com.vivo.launcher");
                            intent2.putExtra("packageName", a.b.getPackageName());
                            intent2.putExtra("className", dm7.d.getClassName());
                            intent2.putExtra("notificationNum", i2);
                            a.b.sendBroadcast(intent2);
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.vivo.launcher");
                        }
                    };
                } else {
                    c = new NotificationBadge$DefaultBadger();
                }
            }
        }
    }
}

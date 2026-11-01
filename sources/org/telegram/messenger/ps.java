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
public abstract class ps {
    public static final LinkedList f17633a;
    public static boolean f17634b;
    public static ms f17635c;
    public static ComponentName d;

    static {
        LinkedList linkedList = new LinkedList();
        f17633a = linkedList;
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
        List<ResolveInfo> queryBroadcastReceivers = w0.f18945b.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static void b() {
        ms msVar;
        ms msVar2;
        Context context = w0.f18945b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            d = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                Iterator it = f17633a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        msVar2 = (ms) ((Class) it.next()).newInstance();
                    } catch (Exception unused) {
                        msVar2 = null;
                    }
                    if (msVar2 != null && msVar2.b().contains(str)) {
                        f17635c = msVar2;
                        break;
                    }
                }
                if (f17635c != null) {
                    return;
                }
            }
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                    String str2 = queryIntentActivities.get(i10).activityInfo.packageName;
                    Iterator it2 = f17633a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        try {
                            msVar = (ms) ((Class) it2.next()).newInstance();
                        } catch (Exception unused2) {
                            msVar = null;
                        }
                        if (msVar != null && msVar.b().contains(str2)) {
                            f17635c = msVar;
                            break;
                        }
                    }
                    if (f17635c != null) {
                        break;
                    }
                }
            }
            if (f17635c == null) {
                String str3 = Build.MANUFACTURER;
                if (str3.equalsIgnoreCase("Xiaomi")) {
                    f17635c = new ms() {
                        @Override
                        public final void a(int i11) {
                            Integer valueOf;
                            Object obj = "";
                            try {
                                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                                Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                                declaredField.setAccessible(true);
                                if (i11 == 0) {
                                    valueOf = "";
                                } else {
                                    valueOf = Integer.valueOf(i11);
                                }
                                declaredField.set(newInstance, String.valueOf(valueOf));
                            } catch (Throwable unused3) {
                                Intent intent2 = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                                intent2.putExtra("android.intent.extra.update_application_component_name", ps.d.getPackageName() + "/" + ps.d.getClassName());
                                if (i11 != 0) {
                                    obj = Integer.valueOf(i11);
                                }
                                intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
                                if (ps.a(intent2)) {
                                    i0.g3(new mg.c2(intent2, 7));
                                }
                            }
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
                        }
                    };
                } else if (str3.equalsIgnoreCase("ZUK")) {
                    f17635c = new NotificationBadge$ZukHomeBadger();
                } else if (str3.equalsIgnoreCase("OPPO")) {
                    f17635c = new ms() {
                        public int f14506a = -1;

                        @Override
                        public final void a(int i11) {
                            if (this.f14506a != i11) {
                                this.f14506a = i11;
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("app_badge_count", i11);
                                    w0.f18945b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
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
                    f17635c = new ms() {
                        @Override
                        public final void a(int i11) {
                            Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                            intent2.setPackage("com.vivo.launcher");
                            intent2.putExtra("packageName", w0.f18945b.getPackageName());
                            intent2.putExtra("className", ps.d.getClassName());
                            intent2.putExtra("notificationNum", i11);
                            w0.f18945b.sendBroadcast(intent2);
                        }

                        @Override
                        public final List b() {
                            return Arrays.asList("com.vivo.launcher");
                        }
                    };
                } else {
                    f17635c = new NotificationBadge$DefaultBadger();
                }
            }
        }
    }
}

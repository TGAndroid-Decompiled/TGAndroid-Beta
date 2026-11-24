package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
public final class e7f {
    public static final ce6 u = new ce6("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final tn7 c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final sm2 i;
    public final Resources j;
    public zz0 k;
    public xab l;
    public pm7 m;
    public pm7 n;
    public pm7 o;
    public pm7 p;
    public pm7 q;
    public pm7 r;
    public pm7 s;
    public pm7 t;

    public e7f(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        ce6 ce6Var = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        ite.h(ie1Var);
        ite.e("Must be called from the main thread.");
        le1 le1Var = ie1Var.e;
        ite.h(le1Var);
        je1 je1Var = le1Var.f;
        ite.h(je1Var);
        tn7 tn7Var = je1Var.d;
        ite.h(tn7Var);
        this.c = tn7Var;
        je1Var.b();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), je1Var.a);
        String str = tn7Var.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = tn7Var.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(tn7Var.I);
        this.i = new sm2(context.getApplicationContext(), new em5(1, dimensionPixelSize, dimensionPixelSize));
        if (ate.a() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689633), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        k7f.a(m3f.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final pm7 a(String str) {
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        tn7 tn7Var = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    pm7 pm7Var = this.r;
                    if (pm7Var == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        ce6 ce6Var = yif.a;
                        int i3 = (j > 10000L ? 1 : (j == 10000L ? 0 : -1));
                        int i4 = tn7Var.E;
                        if (i3 == 0) {
                            i4 = tn7Var.F;
                        } else if (j == 30000) {
                            i4 = tn7Var.G;
                        }
                        int i5 = tn7Var.S;
                        if (i3 == 0) {
                            i5 = tn7Var.T;
                        } else if (j == 30000) {
                            i5 = tn7Var.U;
                        }
                        pm7 b = new om7(i4, broadcast, resources.getString(i5)).b();
                        this.r = b;
                        return b;
                    }
                    return pm7Var;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z = this.k.c;
                    pm7 pm7Var2 = this.o;
                    if (pm7Var2 == null) {
                        if (z) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        pm7 b2 = new om7(tn7Var.r, pendingIntent, resources.getString(tn7Var.N)).b();
                        this.o = b2;
                        return b2;
                    }
                    return pm7Var2;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z2 = this.k.d;
                    pm7 pm7Var3 = this.p;
                    if (pm7Var3 == null) {
                        if (z2) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        pm7 b3 = new om7(tn7Var.s, pendingIntent, resources.getString(tn7Var.O)).b();
                        this.p = b3;
                        return b3;
                    }
                    return pm7Var3;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    pm7 pm7Var4 = this.t;
                    if (pm7Var4 == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        pm7 b4 = new om7(tn7Var.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(tn7Var.V)).b();
                        this.t = b4;
                        return b4;
                    }
                    return pm7Var4;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    pm7 pm7Var5 = this.s;
                    if (pm7Var5 == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        pm7 b5 = new om7(tn7Var.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(tn7Var.V, "")).b();
                        this.s = b5;
                        return b5;
                    }
                    return pm7Var5;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    zz0 zz0Var = this.k;
                    int i6 = zz0Var.b;
                    if (zz0Var.a) {
                        pm7 pm7Var6 = this.n;
                        if (pm7Var6 == null) {
                            if (i6 == 2) {
                                i = tn7Var.f;
                                i2 = tn7Var.K;
                            } else {
                                i = tn7Var.h;
                                i2 = tn7Var.L;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            pm7 b6 = new om7(i, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i2)).b();
                            this.n = b6;
                            return b6;
                        }
                        return pm7Var6;
                    }
                    pm7 pm7Var7 = this.m;
                    if (pm7Var7 == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        pm7 b7 = new om7(tn7Var.n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(tn7Var.M)).b();
                        this.m = b7;
                        return b7;
                    }
                    return pm7Var7;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    pm7 pm7Var8 = this.q;
                    if (pm7Var8 == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        ce6 ce6Var2 = yif.a;
                        int i7 = (j > 10000L ? 1 : (j == 10000L ? 0 : -1));
                        int i8 = tn7Var.w;
                        if (i7 == 0) {
                            i8 = tn7Var.x;
                        } else if (j == 30000) {
                            i8 = tn7Var.y;
                        }
                        int i9 = tn7Var.P;
                        if (i7 == 0) {
                            i9 = tn7Var.Q;
                        } else if (j == 30000) {
                            i9 = tn7Var.R;
                        }
                        pm7 b8 = new om7(i8, broadcast2, resources.getString(i9)).b();
                        this.q = b8;
                        return b8;
                    }
                    return pm7Var8;
                }
                break;
        }
        ce6 ce6Var3 = u;
        Log.e(ce6Var3.a, ce6Var3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        pm7 a;
        NotificationManager notificationManager = this.b;
        if (notificationManager != null && this.k != null) {
            xab xabVar = this.l;
            if (xabVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) xabVar.c;
            }
            Context context = this.a;
            an7 an7Var = new an7(context, "cast_media_notification");
            an7Var.g(bitmap);
            tn7 tn7Var = this.c;
            an7Var.F.icon = tn7Var.e;
            an7Var.e = an7.c((String) this.k.f);
            int i = 0;
            an7Var.f = an7.c(this.j.getString(tn7Var.J, (String) this.k.g));
            an7Var.f(2, true);
            an7Var.k = false;
            an7Var.x = 1;
            ComponentName componentName = this.e;
            if (componentName == null) {
                activities = null;
            } else {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                intent.setComponent(componentName);
                ArrayList arrayList = new ArrayList();
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(context.getPackageManager());
                }
                if (component != null) {
                    int size = arrayList.size();
                    try {
                        for (Intent a2 = tre.a(context, component); a2 != null; a2 = tre.a(context, a2.getComponent())) {
                            arrayList.add(size, a2);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(intent);
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
                } else {
                    dq9.m("No intents added to TaskStackBuilder; cannot getPendingIntent");
                    return;
                }
            }
            if (activities != null) {
                an7Var.g = activities;
            }
            hvd hvdVar = tn7Var.W;
            ce6 ce6Var = u;
            if (hvdVar != null) {
                ce6Var.b("actionsProvider != null", new Object[0]);
                int[] b = yif.b(hvdVar);
                if (b == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b.clone();
                }
                this.g = iArr;
                ArrayList a3 = yif.a(hvdVar);
                this.f = new ArrayList();
                if (a3 != null) {
                    int size2 = a3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = a3.get(i2);
                        i2++;
                        zl7 zl7Var = (zl7) obj;
                        String str = zl7Var.a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a = new om7(zl7Var.b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), zl7Var.c).b();
                        } else {
                            a = a(str);
                        }
                        if (a != null) {
                            this.f.add(a);
                        }
                    }
                }
            } else {
                ce6Var.b("actionsProvider == null", new Object[0]);
                this.f = new ArrayList();
                ArrayList arrayList2 = tn7Var.a;
                int size3 = arrayList2.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    pm7 a4 = a((String) obj2);
                    if (a4 != null) {
                        this.f.add(a4);
                    }
                }
                int[] iArr2 = tn7Var.b;
                this.g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f;
            int size4 = arrayList3.size();
            while (i < size4) {
                Object obj3 = arrayList3.get(i);
                i++;
                pm7 pm7Var = (pm7) obj3;
                if (pm7Var != null) {
                    an7Var.b.add(pm7Var);
                }
            }
            ?? jn7Var = new jn7();
            jn7Var.e = null;
            int[] iArr3 = this.g;
            if (iArr3 != null) {
                jn7Var.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
            if (mediaSessionCompat$Token != null) {
                jn7Var.f = mediaSessionCompat$Token;
            }
            an7Var.i(jn7Var);
            notificationManager.notify("castMediaNotification", 1, an7Var.b());
        }
    }
}

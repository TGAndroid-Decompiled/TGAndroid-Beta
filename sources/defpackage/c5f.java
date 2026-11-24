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
public final class c5f {
    public static final dc6 u = new dc6("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final ql7 c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final gl2 i;
    public final Resources j;
    public sy0 k;
    public v8b l;
    public mk7 m;
    public mk7 n;
    public mk7 o;
    public mk7 p;
    public mk7 q;
    public mk7 r;
    public mk7 s;
    public mk7 t;

    public c5f(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        dc6 dc6Var = ad1.l;
        fre.e("Must be called from the main thread.");
        ad1 ad1Var = ad1.n;
        fre.h(ad1Var);
        fre.e("Must be called from the main thread.");
        dd1 dd1Var = ad1Var.e;
        fre.h(dd1Var);
        bd1 bd1Var = dd1Var.f;
        fre.h(bd1Var);
        ql7 ql7Var = bd1Var.d;
        fre.h(ql7Var);
        this.c = ql7Var;
        bd1Var.b();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), bd1Var.a);
        String str = ql7Var.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = ql7Var.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(ql7Var.I);
        this.i = new gl2(context.getApplicationContext(), new ek5(1, dimensionPixelSize, dimensionPixelSize));
        if (xqe.a() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689633), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        i5f.a(k1f.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final mk7 a(String str) {
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        ql7 ql7Var = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    mk7 mk7Var = this.r;
                    if (mk7Var == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        dc6 dc6Var = xgf.a;
                        int i3 = (j > 10000L ? 1 : (j == 10000L ? 0 : -1));
                        int i4 = ql7Var.E;
                        if (i3 == 0) {
                            i4 = ql7Var.F;
                        } else if (j == 30000) {
                            i4 = ql7Var.G;
                        }
                        int i5 = ql7Var.S;
                        if (i3 == 0) {
                            i5 = ql7Var.T;
                        } else if (j == 30000) {
                            i5 = ql7Var.U;
                        }
                        mk7 b = new lk7(i4, broadcast, resources.getString(i5)).b();
                        this.r = b;
                        return b;
                    }
                    return mk7Var;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z = this.k.c;
                    mk7 mk7Var2 = this.o;
                    if (mk7Var2 == null) {
                        if (z) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        mk7 b2 = new lk7(ql7Var.r, pendingIntent, resources.getString(ql7Var.N)).b();
                        this.o = b2;
                        return b2;
                    }
                    return mk7Var2;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z2 = this.k.d;
                    mk7 mk7Var3 = this.p;
                    if (mk7Var3 == null) {
                        if (z2) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        mk7 b3 = new lk7(ql7Var.s, pendingIntent, resources.getString(ql7Var.O)).b();
                        this.p = b3;
                        return b3;
                    }
                    return mk7Var3;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    mk7 mk7Var4 = this.t;
                    if (mk7Var4 == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        mk7 b4 = new lk7(ql7Var.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(ql7Var.V)).b();
                        this.t = b4;
                        return b4;
                    }
                    return mk7Var4;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    mk7 mk7Var5 = this.s;
                    if (mk7Var5 == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        mk7 b5 = new lk7(ql7Var.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(ql7Var.V, "")).b();
                        this.s = b5;
                        return b5;
                    }
                    return mk7Var5;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    sy0 sy0Var = this.k;
                    int i6 = sy0Var.b;
                    if (sy0Var.a) {
                        mk7 mk7Var6 = this.n;
                        if (mk7Var6 == null) {
                            if (i6 == 2) {
                                i = ql7Var.f;
                                i2 = ql7Var.K;
                            } else {
                                i = ql7Var.h;
                                i2 = ql7Var.L;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            mk7 b6 = new lk7(i, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i2)).b();
                            this.n = b6;
                            return b6;
                        }
                        return mk7Var6;
                    }
                    mk7 mk7Var7 = this.m;
                    if (mk7Var7 == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        mk7 b7 = new lk7(ql7Var.n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(ql7Var.M)).b();
                        this.m = b7;
                        return b7;
                    }
                    return mk7Var7;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    mk7 mk7Var8 = this.q;
                    if (mk7Var8 == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        dc6 dc6Var2 = xgf.a;
                        int i7 = (j > 10000L ? 1 : (j == 10000L ? 0 : -1));
                        int i8 = ql7Var.w;
                        if (i7 == 0) {
                            i8 = ql7Var.x;
                        } else if (j == 30000) {
                            i8 = ql7Var.y;
                        }
                        int i9 = ql7Var.P;
                        if (i7 == 0) {
                            i9 = ql7Var.Q;
                        } else if (j == 30000) {
                            i9 = ql7Var.R;
                        }
                        mk7 b8 = new lk7(i8, broadcast2, resources.getString(i9)).b();
                        this.q = b8;
                        return b8;
                    }
                    return mk7Var8;
                }
                break;
        }
        dc6 dc6Var3 = u;
        Log.e(dc6Var3.a, dc6Var3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        mk7 a;
        NotificationManager notificationManager = this.b;
        if (notificationManager != null && this.k != null) {
            v8b v8bVar = this.l;
            if (v8bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) v8bVar.c;
            }
            Context context = this.a;
            xk7 xk7Var = new xk7(context, "cast_media_notification");
            xk7Var.g(bitmap);
            ql7 ql7Var = this.c;
            xk7Var.F.icon = ql7Var.e;
            xk7Var.e = xk7.c((String) this.k.f);
            int i = 0;
            xk7Var.f = xk7.c(this.j.getString(ql7Var.J, (String) this.k.g));
            xk7Var.f(2, true);
            xk7Var.k = false;
            xk7Var.x = 1;
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
                        for (Intent a2 = qpe.a(context, component); a2 != null; a2 = qpe.a(context, a2.getComponent())) {
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
                    sc8.j("No intents added to TaskStackBuilder; cannot getPendingIntent");
                    return;
                }
            }
            if (activities != null) {
                xk7Var.g = activities;
            }
            etd etdVar = ql7Var.W;
            dc6 dc6Var = u;
            if (etdVar != null) {
                dc6Var.b("actionsProvider != null", new Object[0]);
                int[] b = xgf.b(etdVar);
                if (b == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b.clone();
                }
                this.g = iArr;
                ArrayList a3 = xgf.a(etdVar);
                this.f = new ArrayList();
                if (a3 != null) {
                    int size2 = a3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = a3.get(i2);
                        i2++;
                        wj7 wj7Var = (wj7) obj;
                        String str = wj7Var.a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a = new lk7(wj7Var.b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), wj7Var.c).b();
                        } else {
                            a = a(str);
                        }
                        if (a != null) {
                            this.f.add(a);
                        }
                    }
                }
            } else {
                dc6Var.b("actionsProvider == null", new Object[0]);
                this.f = new ArrayList();
                ArrayList arrayList2 = ql7Var.a;
                int size3 = arrayList2.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    mk7 a4 = a((String) obj2);
                    if (a4 != null) {
                        this.f.add(a4);
                    }
                }
                int[] iArr2 = ql7Var.b;
                this.g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f;
            int size4 = arrayList3.size();
            while (i < size4) {
                Object obj3 = arrayList3.get(i);
                i++;
                mk7 mk7Var = (mk7) obj3;
                if (mk7Var != null) {
                    xk7Var.b.add(mk7Var);
                }
            }
            ?? gl7Var = new gl7();
            gl7Var.e = null;
            int[] iArr3 = this.g;
            if (iArr3 != null) {
                gl7Var.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
            if (mediaSessionCompat$Token != null) {
                gl7Var.f = mediaSessionCompat$Token;
            }
            xk7Var.i(gl7Var);
            notificationManager.notify("castMediaNotification", 1, xk7Var.b());
        }
    }
}

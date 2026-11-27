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
public final class t9f {
    public static final he6 u = new he6("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final po7 c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final am2 i;
    public final Resources j;
    public az0 k;
    public k7b l;
    public ln7 m;
    public ln7 n;
    public ln7 o;
    public ln7 p;
    public ln7 q;
    public ln7 r;
    public ln7 s;
    public ln7 t;

    public t9f(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        he6 he6Var = id1.l;
        xve.e("Must be called from the main thread.");
        id1 id1Var = id1.n;
        xve.h(id1Var);
        xve.e("Must be called from the main thread.");
        ld1 ld1Var = id1Var.e;
        xve.h(ld1Var);
        jd1 jd1Var = ld1Var.f;
        xve.h(jd1Var);
        po7 po7Var = jd1Var.d;
        xve.h(po7Var);
        this.c = po7Var;
        jd1Var.b();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), jd1Var.a);
        String str = po7Var.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = po7Var.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(po7Var.I);
        this.i = new am2(context.getApplicationContext(), new hm5(1, dimensionPixelSize, dimensionPixelSize));
        if (rve.a() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689633), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        z9f.a(b6f.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final ln7 a(String str) {
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        po7 po7Var = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    ln7 ln7Var = this.r;
                    if (ln7Var == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        he6 he6Var = nlf.a;
                        int i3 = (j > 10000L ? 1 : (j == 10000L ? 0 : -1));
                        int i4 = po7Var.E;
                        if (i3 == 0) {
                            i4 = po7Var.F;
                        } else if (j == 30000) {
                            i4 = po7Var.G;
                        }
                        int i5 = po7Var.S;
                        if (i3 == 0) {
                            i5 = po7Var.T;
                        } else if (j == 30000) {
                            i5 = po7Var.U;
                        }
                        ln7 b = new kn7(i4, broadcast, resources.getString(i5)).b();
                        this.r = b;
                        return b;
                    }
                    return ln7Var;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z = this.k.c;
                    ln7 ln7Var2 = this.o;
                    if (ln7Var2 == null) {
                        if (z) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        ln7 b2 = new kn7(po7Var.r, pendingIntent, resources.getString(po7Var.N)).b();
                        this.o = b2;
                        return b2;
                    }
                    return ln7Var2;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z2 = this.k.d;
                    ln7 ln7Var3 = this.p;
                    if (ln7Var3 == null) {
                        if (z2) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        ln7 b3 = new kn7(po7Var.s, pendingIntent, resources.getString(po7Var.O)).b();
                        this.p = b3;
                        return b3;
                    }
                    return ln7Var3;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    ln7 ln7Var4 = this.t;
                    if (ln7Var4 == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        ln7 b4 = new kn7(po7Var.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(po7Var.V)).b();
                        this.t = b4;
                        return b4;
                    }
                    return ln7Var4;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    ln7 ln7Var5 = this.s;
                    if (ln7Var5 == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        ln7 b5 = new kn7(po7Var.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(po7Var.V, "")).b();
                        this.s = b5;
                        return b5;
                    }
                    return ln7Var5;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    az0 az0Var = this.k;
                    int i6 = az0Var.b;
                    if (az0Var.a) {
                        ln7 ln7Var6 = this.n;
                        if (ln7Var6 == null) {
                            if (i6 == 2) {
                                i = po7Var.f;
                                i2 = po7Var.K;
                            } else {
                                i = po7Var.h;
                                i2 = po7Var.L;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            ln7 b6 = new kn7(i, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i2)).b();
                            this.n = b6;
                            return b6;
                        }
                        return ln7Var6;
                    }
                    ln7 ln7Var7 = this.m;
                    if (ln7Var7 == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        ln7 b7 = new kn7(po7Var.n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(po7Var.M)).b();
                        this.m = b7;
                        return b7;
                    }
                    return ln7Var7;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    ln7 ln7Var8 = this.q;
                    if (ln7Var8 == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        he6 he6Var2 = nlf.a;
                        int i7 = (j > 10000L ? 1 : (j == 10000L ? 0 : -1));
                        int i8 = po7Var.w;
                        if (i7 == 0) {
                            i8 = po7Var.x;
                        } else if (j == 30000) {
                            i8 = po7Var.y;
                        }
                        int i9 = po7Var.P;
                        if (i7 == 0) {
                            i9 = po7Var.Q;
                        } else if (j == 30000) {
                            i9 = po7Var.R;
                        }
                        ln7 b8 = new kn7(i8, broadcast2, resources.getString(i9)).b();
                        this.q = b8;
                        return b8;
                    }
                    return ln7Var8;
                }
                break;
        }
        he6 he6Var3 = u;
        Log.e(he6Var3.a, he6Var3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        ln7 a;
        NotificationManager notificationManager = this.b;
        if (notificationManager != null && this.k != null) {
            k7b k7bVar = this.l;
            if (k7bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) k7bVar.c;
            }
            Context context = this.a;
            wn7 wn7Var = new wn7(context, "cast_media_notification");
            wn7Var.g(bitmap);
            po7 po7Var = this.c;
            wn7Var.F.icon = po7Var.e;
            wn7Var.e = wn7.c((String) this.k.f);
            int i = 0;
            wn7Var.f = wn7.c(this.j.getString(po7Var.J, (String) this.k.g));
            wn7Var.f(2, true);
            wn7Var.k = false;
            wn7Var.x = 1;
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
                        for (Intent a2 = iue.a(context, component); a2 != null; a2 = iue.a(context, a2.getComponent())) {
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
                    grb.i("No intents added to TaskStackBuilder; cannot getPendingIntent");
                    return;
                }
            }
            if (activities != null) {
                wn7Var.g = activities;
            }
            uxd uxdVar = po7Var.W;
            he6 he6Var = u;
            if (uxdVar != null) {
                he6Var.b("actionsProvider != null", new Object[0]);
                int[] b = nlf.b(uxdVar);
                if (b == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b.clone();
                }
                this.g = iArr;
                ArrayList a3 = nlf.a(uxdVar);
                this.f = new ArrayList();
                if (a3 != null) {
                    int size2 = a3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = a3.get(i2);
                        i2++;
                        vm7 vm7Var = (vm7) obj;
                        String str = vm7Var.a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a = new kn7(vm7Var.b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), vm7Var.c).b();
                        } else {
                            a = a(str);
                        }
                        if (a != null) {
                            this.f.add(a);
                        }
                    }
                }
            } else {
                he6Var.b("actionsProvider == null", new Object[0]);
                this.f = new ArrayList();
                ArrayList arrayList2 = po7Var.a;
                int size3 = arrayList2.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    ln7 a4 = a((String) obj2);
                    if (a4 != null) {
                        this.f.add(a4);
                    }
                }
                int[] iArr2 = po7Var.b;
                this.g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f;
            int size4 = arrayList3.size();
            while (i < size4) {
                Object obj3 = arrayList3.get(i);
                i++;
                ln7 ln7Var = (ln7) obj3;
                if (ln7Var != null) {
                    wn7Var.b.add(ln7Var);
                }
            }
            ?? fo7Var = new fo7();
            fo7Var.e = null;
            int[] iArr3 = this.g;
            if (iArr3 != null) {
                fo7Var.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
            if (mediaSessionCompat$Token != null) {
                fo7Var.f = mediaSessionCompat$Token;
            }
            wn7Var.i(fo7Var);
            notificationManager.notify("castMediaNotification", 1, wn7Var.b());
        }
    }
}

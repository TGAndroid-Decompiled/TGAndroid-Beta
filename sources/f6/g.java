package f6;

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
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import e0.b0;
import e0.k;
import e0.t;
import e6.q;
import java.util.ArrayList;
import java.util.Arrays;
import n4.y;
import n6.l;
import v7.w6;
public final class g {
    public static final g6.b f9749u = new g6.b("MediaNotificationProxy", null);
    public final Context f9750a;
    public final NotificationManager f9751b;
    public final e6.f f9752c;
    public final ComponentName d;
    public final ComponentName f9753e;
    public ArrayList f9754f = new ArrayList();
    public int[] f9755g;
    public final long h;
    public final cf.c f9756i;
    public final Resources f9757j;
    public f f9758k;
    public y f9759l;
    public k f9760m;
    public k f9761n;
    public k f9762o;
    public k f9763p;
    public k f9764q;
    public k f9765r;
    public k f9766s;
    public k f9767t;

    public g(Context context) {
        this.f9750a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f9751b = notificationManager;
        g6.b bVar = d6.a.f8103l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.f8105n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        d6.b bVar2 = aVar.f8109e;
        l.h(bVar2);
        e6.a aVar2 = bVar2.f8120f;
        l.h(aVar2);
        e6.f fVar = aVar2.d;
        l.h(fVar);
        this.f9752c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f9757j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f8642a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f9753e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f9753e = null;
        }
        this.h = fVar.f8666c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f9756i = new cf.c(context.getApplicationContext(), new e6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (u6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689632), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        f2.a(f1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final k a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j3 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f9757j;
        Context context = this.f9750a;
        ComponentName componentName = this.d;
        e6.f fVar = this.f9752c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f9765r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, a0.f6711a | 134217728);
                        g6.b bVar = j.f9788a;
                        int i12 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i13 = fVar.f8674y;
                        if (i12 == 0) {
                            i13 = fVar.E;
                        } else if (j3 == 30000) {
                            i13 = fVar.F;
                        }
                        int i14 = fVar.R;
                        if (i12 == 0) {
                            i14 = fVar.S;
                        } else if (j3 == 30000) {
                            i14 = fVar.T;
                        }
                        this.f9765r = new e0.j(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f9765r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f9758k.f9745c;
                    if (this.f9762o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, a0.f6711a);
                        }
                        this.f9762o = new e0.j(fVar.f8670r, resources.getString(fVar.M), pendingIntent).b();
                    }
                    return this.f9762o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f9758k.d;
                    if (this.f9763p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, a0.f6711a);
                        }
                        this.f9763p = new e0.j(fVar.f8671s, resources.getString(fVar.N), pendingIntent).b();
                    }
                    return this.f9763p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f9767t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f9767t = new e0.j(fVar.G, resources.getString(fVar.U), PendingIntent.getBroadcast(context, 0, intent4, a0.f6711a)).b();
                    }
                    return this.f9767t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f9766s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f9766s = new e0.j(fVar.G, resources.getString(fVar.U, ""), PendingIntent.getBroadcast(context, 0, intent5, a0.f6711a)).b();
                    }
                    return this.f9766s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    f fVar2 = this.f9758k;
                    int i15 = fVar2.f9743a;
                    if (fVar2.f9744b) {
                        if (this.f9761n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f8668f;
                                i11 = fVar.J;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f9761n = new e0.j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, a0.f6711a)).b();
                        }
                        return this.f9761n;
                    }
                    if (this.f9760m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f9760m = new e0.j(fVar.f8669n, resources.getString(fVar.L), PendingIntent.getBroadcast(context, 0, intent7, a0.f6711a)).b();
                    }
                    return this.f9760m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f9764q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, a0.f6711a | 134217728);
                        g6.b bVar2 = j.f9788a;
                        int i16 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f8672w;
                        } else if (j3 == 30000) {
                            i17 = fVar.f8673x;
                        }
                        int i18 = fVar.O;
                        if (i16 == 0) {
                            i18 = fVar.P;
                        } else if (j3 == 30000) {
                            i18 = fVar.Q;
                        }
                        this.f9764q = new e0.j(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f9764q;
                }
                break;
        }
        g6.b bVar3 = f9749u;
        Log.e(bVar3.f10249a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        k a2;
        NotificationManager notificationManager = this.f9751b;
        if (notificationManager != null && this.f9758k != null) {
            y yVar = this.f9759l;
            if (yVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) yVar.f16640c;
            }
            Context context = this.f9750a;
            t tVar = new t(context, "cast_media_notification");
            tVar.j(bitmap);
            e6.f fVar = this.f9752c;
            tVar.E.icon = fVar.f8667e;
            tVar.f8482e = t.d((String) this.f9758k.f9747f);
            int i10 = 0;
            tVar.f8483f = t.d(this.f9757j.getString(fVar.I, (String) this.f9758k.f9748g));
            tVar.h(2, true);
            tVar.f8487k = false;
            tVar.f8499x = 1;
            ComponentName componentName = this.f9753e;
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
                        for (Intent a10 = w6.a(context, component); a10 != null; a10 = w6.a(context, a10.getComponent())) {
                            arrayList.add(size, a10);
                        }
                    } catch (PackageManager.NameNotFoundException e7) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e7);
                    }
                }
                arrayList.add(intent);
                int i11 = a0.f6711a | 134217728;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                tVar.f8484g = activities;
            }
            q qVar = fVar.V;
            g6.b bVar = f9749u;
            if (qVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = j.b(qVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f9755g = iArr;
                ArrayList a11 = j.a(qVar);
                this.f9754f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = a11.get(i12);
                        i12++;
                        e6.d dVar = (e6.d) obj;
                        String str = dVar.f8661a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.j(dVar.f8662b, dVar.f8663c, PendingIntent.getBroadcast(context, 0, intent2, a0.f6711a)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f9754f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f9754f = new ArrayList();
                ArrayList arrayList2 = fVar.f8664a;
                int size3 = arrayList2.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    k a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f9754f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f8665b;
                this.f9755g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f9754f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                k kVar = (k) obj3;
                if (kVar != null) {
                    tVar.f8480b.add(kVar);
                }
            }
            ?? b0Var = new b0();
            b0Var.f52346e = null;
            int[] iArr3 = this.f9755g;
            if (iArr3 != null) {
                b0Var.f52346e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f9758k.f9746e;
            if (mediaSessionCompat$Token != null) {
                b0Var.f52347f = mediaSessionCompat$Token;
            }
            tVar.n(b0Var);
            notificationManager.notify("castMediaNotification", 1, tVar.b());
        }
    }
}

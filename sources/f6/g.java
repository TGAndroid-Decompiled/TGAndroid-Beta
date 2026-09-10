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
import bi.u6;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import e0.b0;
import e0.k;
import e0.t;
import e6.q;
import java.util.ArrayList;
import java.util.Arrays;
import n6.l;
import v7.x6;
public final class g {
    public static final g6.b f7856u = new g6.b("MediaNotificationProxy", null);
    public final Context f7857a;
    public final NotificationManager f7858b;
    public final e6.f f7859c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f7860f = new ArrayList();
    public int[] f7861g;
    public final long h;
    public final u6 f7862i;
    public final Resources f7863j;
    public f f7864k;
    public of.b f7865l;
    public k f7866m;
    public k f7867n;
    public k f7868o;
    public k f7869p;
    public k f7870q;
    public k f7871r;
    public k f7872s;
    public k f7873t;

    public g(Context context) {
        this.f7857a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f7858b = notificationManager;
        g6.b bVar = d6.a.f6281l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.f6283n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        d6.b bVar2 = aVar.e;
        l.h(bVar2);
        e6.a aVar2 = bVar2.f6296f;
        l.h(aVar2);
        e6.f fVar = aVar2.d;
        l.h(fVar);
        this.f7859c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f7863j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f7283a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = fVar.f7305c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f7862i = new u6(context.getApplicationContext(), new e6.b(1, dimensionPixelSize, dimensionPixelSize));
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
        Resources resources = this.f7863j;
        Context context = this.f7857a;
        ComponentName componentName = this.d;
        e6.f fVar = this.f7859c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f7871r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, a0.f5020a | 134217728);
                        g6.b bVar = j.f7893a;
                        int i12 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i13 = fVar.f7312y;
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
                        this.f7871r = new e0.j(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f7871r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f7864k.f7853c;
                    if (this.f7868o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, a0.f5020a);
                        }
                        this.f7868o = new e0.j(fVar.f7308r, resources.getString(fVar.M), pendingIntent).b();
                    }
                    return this.f7868o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f7864k.d;
                    if (this.f7869p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, a0.f5020a);
                        }
                        this.f7869p = new e0.j(fVar.f7309s, resources.getString(fVar.N), pendingIntent).b();
                    }
                    return this.f7869p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f7873t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f7873t = new e0.j(fVar.G, resources.getString(fVar.U), PendingIntent.getBroadcast(context, 0, intent4, a0.f5020a)).b();
                    }
                    return this.f7873t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f7872s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f7872s = new e0.j(fVar.G, resources.getString(fVar.U, ""), PendingIntent.getBroadcast(context, 0, intent5, a0.f5020a)).b();
                    }
                    return this.f7872s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    f fVar2 = this.f7864k;
                    int i15 = fVar2.f7851a;
                    if (fVar2.f7852b) {
                        if (this.f7867n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f7306f;
                                i11 = fVar.J;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f7867n = new e0.j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, a0.f5020a)).b();
                        }
                        return this.f7867n;
                    }
                    if (this.f7866m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f7866m = new e0.j(fVar.f7307n, resources.getString(fVar.L), PendingIntent.getBroadcast(context, 0, intent7, a0.f5020a)).b();
                    }
                    return this.f7866m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f7870q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, a0.f5020a | 134217728);
                        g6.b bVar2 = j.f7893a;
                        int i16 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f7310w;
                        } else if (j3 == 30000) {
                            i17 = fVar.f7311x;
                        }
                        int i18 = fVar.O;
                        if (i16 == 0) {
                            i18 = fVar.P;
                        } else if (j3 == 30000) {
                            i18 = fVar.Q;
                        }
                        this.f7870q = new e0.j(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f7870q;
                }
                break;
        }
        g6.b bVar3 = f7856u;
        Log.e(bVar3.f8558a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        k a2;
        NotificationManager notificationManager = this.f7858b;
        if (notificationManager != null && this.f7864k != null) {
            of.b bVar = this.f7865l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f14295c;
            }
            Context context = this.f7857a;
            t tVar = new t(context, "cast_media_notification");
            tVar.j(bitmap);
            e6.f fVar = this.f7859c;
            tVar.E.icon = fVar.e;
            tVar.e = t.d((String) this.f7864k.f7854f);
            int i10 = 0;
            tVar.f7138f = t.d(this.f7863j.getString(fVar.I, (String) this.f7864k.f7855g));
            tVar.h(2, true);
            tVar.f7142k = false;
            tVar.f7154x = 1;
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
                        for (Intent a10 = x6.a(context, component); a10 != null; a10 = x6.a(context, a10.getComponent())) {
                            arrayList.add(size, a10);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(intent);
                int i11 = a0.f5020a | 134217728;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                tVar.f7139g = activities;
            }
            q qVar = fVar.V;
            g6.b bVar2 = f7856u;
            if (qVar != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = j.b(qVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f7861g = iArr;
                ArrayList a11 = j.a(qVar);
                this.f7860f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = a11.get(i12);
                        i12++;
                        e6.d dVar = (e6.d) obj;
                        String str = dVar.f7300a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.j(dVar.f7301b, dVar.f7302c, PendingIntent.getBroadcast(context, 0, intent2, a0.f5020a)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f7860f.add(a2);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f7860f = new ArrayList();
                ArrayList arrayList2 = fVar.f7303a;
                int size3 = arrayList2.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    k a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f7860f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f7304b;
                this.f7861g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f7860f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                k kVar = (k) obj3;
                if (kVar != null) {
                    tVar.f7136b.add(kVar);
                }
            }
            ?? b0Var = new b0();
            b0Var.e = null;
            int[] iArr3 = this.f7861g;
            if (iArr3 != null) {
                b0Var.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f7864k.e;
            if (mediaSessionCompat$Token != null) {
                b0Var.f47190f = mediaSessionCompat$Token;
            }
            tVar.n(b0Var);
            notificationManager.notify("castMediaNotification", 1, tVar.b());
        }
    }
}

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
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.z5;
import e0.r;
import e0.z;
import e6.p;
import java.util.ArrayList;
import java.util.Arrays;
import n4.s;
import n6.l;
import v7.y6;
public final class f {
    public static final g6.b f9026u = new g6.b("MediaNotificationProxy", null);
    public final Context f9027a;
    public final NotificationManager f9028b;
    public final e6.f f9029c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f9030f = new ArrayList();
    public int[] f9031g;
    public final long h;
    public final z5 f9032i;
    public final Resources f9033j;
    public af.e f9034k;
    public s f9035l;
    public e0.i f9036m;
    public e0.i f9037n;
    public e0.i f9038o;
    public e0.i f9039p;
    public e0.i f9040q;
    public e0.i f9041r;
    public e0.i f9042s;
    public e0.i f9043t;

    public f(Context context) {
        this.f9027a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f9028b = notificationManager;
        g6.b bVar = d6.a.f6373l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.f6375n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        d6.b bVar2 = aVar.e;
        l.h(bVar2);
        e6.a aVar2 = bVar2.f6388f;
        l.h(aVar2);
        e6.f fVar = aVar2.d;
        l.h(fVar);
        this.f9029c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f9033j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f8461a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = fVar.f8483c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f9032i = new z5(context.getApplicationContext(), new e6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (u6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689632), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        d2.a(d1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final e0.i a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f9033j;
        Context context = this.f9027a;
        ComponentName componentName = this.d;
        e6.f fVar = this.f9029c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f9041r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        g6.b bVar = i.f9063a;
                        int i12 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i13 = fVar.f8490y;
                        if (i12 == 0) {
                            i13 = fVar.E;
                        } else if (j10 == 30000) {
                            i13 = fVar.F;
                        }
                        int i14 = fVar.R;
                        if (i12 == 0) {
                            i14 = fVar.S;
                        } else if (j10 == 30000) {
                            i14 = fVar.T;
                        }
                        this.f9041r = new e0.h(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f9041r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f9034k.f559c;
                    if (this.f9038o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f9038o = new e0.h(fVar.f8486r, resources.getString(fVar.M), pendingIntent).b();
                    }
                    return this.f9038o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f9034k.d;
                    if (this.f9039p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f9039p = new e0.h(fVar.f8487s, resources.getString(fVar.N), pendingIntent).b();
                    }
                    return this.f9039p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f9043t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f9043t = new e0.h(fVar.G, resources.getString(fVar.U), PendingIntent.getBroadcast(context, 0, intent4, 67108864)).b();
                    }
                    return this.f9043t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f9042s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f9042s = new e0.h(fVar.G, resources.getString(fVar.U, ""), PendingIntent.getBroadcast(context, 0, intent5, 67108864)).b();
                    }
                    return this.f9042s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    af.e eVar = this.f9034k;
                    int i15 = eVar.f558b;
                    if (eVar.f557a) {
                        if (this.f9037n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f8484f;
                                i11 = fVar.J;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f9037n = new e0.h(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, 67108864)).b();
                        }
                        return this.f9037n;
                    }
                    if (this.f9036m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f9036m = new e0.h(fVar.f8485n, resources.getString(fVar.L), PendingIntent.getBroadcast(context, 0, intent7, 67108864)).b();
                    }
                    return this.f9036m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f9040q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        g6.b bVar2 = i.f9063a;
                        int i16 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f8488w;
                        } else if (j10 == 30000) {
                            i17 = fVar.f8489x;
                        }
                        int i18 = fVar.O;
                        if (i16 == 0) {
                            i18 = fVar.P;
                        } else if (j10 == 30000) {
                            i18 = fVar.Q;
                        }
                        this.f9040q = new e0.h(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f9040q;
                }
                break;
        }
        g6.b bVar3 = f9026u;
        Log.e(bVar3.f9937a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.i a2;
        NotificationManager notificationManager = this.f9028b;
        if (notificationManager != null && this.f9034k != null) {
            s sVar = this.f9035l;
            if (sVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) sVar.f15746c;
            }
            Context context = this.f9027a;
            r rVar = new r(context, "cast_media_notification");
            rVar.j(bitmap);
            e6.f fVar = this.f9029c;
            rVar.E.icon = fVar.e;
            rVar.e = r.d((String) this.f9034k.f560f);
            int i10 = 0;
            rVar.f8269f = r.d(this.f9033j.getString(fVar.I, (String) this.f9034k.f561g));
            rVar.h(2, true);
            rVar.f8273k = false;
            rVar.f8285x = 1;
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
                        for (Intent a10 = y6.a(context, component); a10 != null; a10 = y6.a(context, a10.getComponent())) {
                            arrayList.add(size, a10);
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
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                rVar.f8270g = activities;
            }
            p pVar = fVar.V;
            g6.b bVar = f9026u;
            if (pVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f9031g = iArr;
                ArrayList a11 = i.a(pVar);
                this.f9030f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = a11.get(i11);
                        i11++;
                        e6.d dVar = (e6.d) obj;
                        String str = dVar.f8478a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.h(dVar.f8479b, dVar.f8480c, PendingIntent.getBroadcast(context, 0, intent2, 67108864)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f9030f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f9030f = new ArrayList();
                ArrayList arrayList2 = fVar.f8481a;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    e0.i a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f9030f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f8482b;
                this.f9031g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f9030f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                e0.i iVar = (e0.i) obj3;
                if (iVar != null) {
                    rVar.f8267b.add(iVar);
                }
            }
            ?? zVar = new z();
            zVar.e = null;
            int[] iArr3 = this.f9031g;
            if (iArr3 != null) {
                zVar.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f9034k.e;
            if (mediaSessionCompat$Token != null) {
                zVar.f49240f = mediaSessionCompat$Token;
            }
            rVar.n(zVar);
            notificationManager.notify("castMediaNotification", 1, rVar.b());
        }
    }
}

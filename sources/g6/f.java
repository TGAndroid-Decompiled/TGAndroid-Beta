package g6;

import a8.me;
import a8.ub;
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
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import e0.q;
import e0.y;
import f6.p;
import java.util.ArrayList;
import java.util.Arrays;
import n4.s;
import o6.l;
public final class f {
    public static final h6.b f12357u = new h6.b("MediaNotificationProxy", null);
    public final Context f12358a;
    public final NotificationManager f12359b;
    public final f6.f f12360c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f12361f = new ArrayList();
    public int[] f12362g;
    public final long h;
    public final me f12363i;
    public final Resources f12364j;
    public bf.d f12365k;
    public s f12366l;
    public e0.h f12367m;
    public e0.h f12368n;
    public e0.h f12369o;
    public e0.h f12370p;
    public e0.h f12371q;
    public e0.h f12372r;
    public e0.h f12373s;
    public e0.h f12374t;

    public f(Context context) {
        this.f12358a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f12359b = notificationManager;
        h6.b bVar = e6.a.f9779l;
        l.e("Must be called from the main thread.");
        e6.a aVar = e6.a.f9781n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        e6.b bVar2 = aVar.e;
        l.h(bVar2);
        f6.a aVar2 = bVar2.f9794f;
        l.h(aVar2);
        f6.f fVar = aVar2.d;
        l.h(fVar);
        this.f12360c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f12364j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f10182a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = fVar.f10204c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f12363i = new me(context.getApplicationContext(), new f6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (v6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689632), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        a2.a(a1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final e0.h a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f12364j;
        Context context = this.f12358a;
        ComponentName componentName = this.d;
        f6.f fVar = this.f12360c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f12372r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        h6.b bVar = i.f12394a;
                        int i12 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i13 = fVar.f10211y;
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
                        this.f12372r = new e0.g(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f12372r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f12365k.f3909c;
                    if (this.f12369o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f12369o = new e0.g(fVar.f10207r, resources.getString(fVar.M), pendingIntent).b();
                    }
                    return this.f12369o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f12365k.d;
                    if (this.f12370p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f12370p = new e0.g(fVar.f10208s, resources.getString(fVar.N), pendingIntent).b();
                    }
                    return this.f12370p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f12374t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f12374t = new e0.g(fVar.G, resources.getString(fVar.U), PendingIntent.getBroadcast(context, 0, intent4, 67108864)).b();
                    }
                    return this.f12374t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f12373s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f12373s = new e0.g(fVar.G, resources.getString(fVar.U, ""), PendingIntent.getBroadcast(context, 0, intent5, 67108864)).b();
                    }
                    return this.f12373s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    bf.d dVar = this.f12365k;
                    int i15 = dVar.f3908b;
                    if (dVar.f3907a) {
                        if (this.f12368n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f10205f;
                                i11 = fVar.J;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f12368n = new e0.g(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, 67108864)).b();
                        }
                        return this.f12368n;
                    }
                    if (this.f12367m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f12367m = new e0.g(fVar.f10206n, resources.getString(fVar.L), PendingIntent.getBroadcast(context, 0, intent7, 67108864)).b();
                    }
                    return this.f12367m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f12371q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        h6.b bVar2 = i.f12394a;
                        int i16 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f10209w;
                        } else if (j10 == 30000) {
                            i17 = fVar.f10210x;
                        }
                        int i18 = fVar.O;
                        if (i16 == 0) {
                            i18 = fVar.P;
                        } else if (j10 == 30000) {
                            i18 = fVar.Q;
                        }
                        this.f12371q = new e0.g(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f12371q;
                }
                break;
        }
        h6.b bVar3 = f12357u;
        Log.e(bVar3.f12620a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a2;
        NotificationManager notificationManager = this.f12359b;
        if (notificationManager != null && this.f12365k != null) {
            s sVar = this.f12366l;
            if (sVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) sVar.f18696c;
            }
            Context context = this.f12358a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            f6.f fVar = this.f12360c;
            qVar.F.icon = fVar.e;
            qVar.e = q.d((String) this.f12365k.f3910f);
            int i10 = 0;
            qVar.f9578f = q.d(this.f12364j.getString(fVar.I, (String) this.f12365k.f3911g));
            qVar.h(2, true);
            qVar.f9582k = false;
            qVar.f9594x = 1;
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
                        for (Intent a10 = ub.a(context, component); a10 != null; a10 = ub.a(context, a10.getComponent())) {
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
                qVar.f9579g = activities;
            }
            p pVar = fVar.V;
            h6.b bVar = f12357u;
            if (pVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f12362g = iArr;
                ArrayList a11 = i.a(pVar);
                this.f12361f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = a11.get(i11);
                        i11++;
                        f6.d dVar = (f6.d) obj;
                        String str = dVar.f10199a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.g(dVar.f10200b, dVar.f10201c, PendingIntent.getBroadcast(context, 0, intent2, 67108864)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f12361f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f12361f = new ArrayList();
                ArrayList arrayList2 = fVar.f10202a;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    e0.h a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f12361f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f10203b;
                this.f12362g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f12361f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f9576b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.e = null;
            int[] iArr3 = this.f12362g;
            if (iArr3 != null) {
                yVar.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f12365k.e;
            if (mediaSessionCompat$Token != null) {
                yVar.f52690f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

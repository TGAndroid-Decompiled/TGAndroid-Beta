package i6;

import a8.r7;
import a8.y9;
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
import java.util.ArrayList;
import java.util.Arrays;
import q6.m;
public final class f {
    public static final j6.b f16217u = new j6.b("MediaNotificationProxy", null);
    public final Context f16218a;
    public final NotificationManager f16219b;
    public final h6.f f16220c;
    public final ComponentName d;
    public final ComponentName f16221e;
    public ArrayList f16222f = new ArrayList();
    public int[] f16223g;
    public final long h;
    public final r7 f16224i;
    public final Resources f16225j;
    public gf.d f16226k;
    public wf.b f16227l;
    public e0.h f16228m;
    public e0.h f16229n;
    public e0.h f16230o;
    public e0.h f16231p;
    public e0.h f16232q;
    public e0.h f16233r;
    public e0.h f16234s;
    public e0.h f16235t;

    public f(Context context) {
        this.f16218a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f16219b = notificationManager;
        j6.b bVar = g6.a.f13177l;
        m.e("Must be called from the main thread.");
        g6.a aVar = g6.a.f13179n;
        m.h(aVar);
        m.e("Must be called from the main thread.");
        g6.b bVar2 = aVar.f13183e;
        m.h(bVar2);
        h6.a aVar2 = bVar2.f13194f;
        m.h(aVar2);
        h6.f fVar = aVar2.d;
        m.h(fVar);
        this.f16220c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f16225j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f13879a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f16221e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f16221e = null;
        }
        this.h = fVar.f13904c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.I);
        this.f16224i = new r7(context.getApplicationContext(), new h6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (x6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689633), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        a2.a(a1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final e0.h a(String str) {
        int i7;
        int i10;
        int hashCode = str.hashCode();
        long j3 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f16225j;
        Context context = this.f16218a;
        ComponentName componentName = this.d;
        h6.f fVar = this.f16220c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f16233r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        j6.b bVar = j.f16258a;
                        int i11 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i12 = fVar.E;
                        if (i11 == 0) {
                            i12 = fVar.F;
                        } else if (j3 == 30000) {
                            i12 = fVar.G;
                        }
                        int i13 = fVar.S;
                        if (i11 == 0) {
                            i13 = fVar.T;
                        } else if (j3 == 30000) {
                            i13 = fVar.U;
                        }
                        this.f16233r = new e0.g(i12, broadcast, resources.getString(i13)).b();
                    }
                    return this.f16233r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f16226k.f13527c;
                    if (this.f16230o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f16230o = new e0.g(fVar.f13908r, pendingIntent, resources.getString(fVar.N)).b();
                    }
                    return this.f16230o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f16226k.d;
                    if (this.f16231p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f16231p = new e0.g(fVar.f13909s, pendingIntent, resources.getString(fVar.O)).b();
                    }
                    return this.f16231p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f16235t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f16235t = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(fVar.V)).b();
                    }
                    return this.f16235t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f16234s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f16234s = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(fVar.V, "")).b();
                    }
                    return this.f16234s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    gf.d dVar = this.f16226k;
                    int i14 = dVar.f13526b;
                    if (dVar.f13525a) {
                        if (this.f16229n == null) {
                            if (i14 == 2) {
                                i7 = fVar.f13906f;
                                i10 = fVar.K;
                            } else {
                                i7 = fVar.h;
                                i10 = fVar.L;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f16229n = new e0.g(i7, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i10)).b();
                        }
                        return this.f16229n;
                    }
                    if (this.f16228m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f16228m = new e0.g(fVar.f13907n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(fVar.M)).b();
                    }
                    return this.f16228m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f16232q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        j6.b bVar2 = j.f16258a;
                        int i15 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i16 = fVar.f13910w;
                        if (i15 == 0) {
                            i16 = fVar.f13911x;
                        } else if (j3 == 30000) {
                            i16 = fVar.f13912y;
                        }
                        int i17 = fVar.P;
                        if (i15 == 0) {
                            i17 = fVar.Q;
                        } else if (j3 == 30000) {
                            i17 = fVar.R;
                        }
                        this.f16232q = new e0.g(i16, broadcast2, resources.getString(i17)).b();
                    }
                    return this.f16232q;
                }
                break;
        }
        j6.b bVar3 = f16217u;
        Log.e(bVar3.f17332a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a10;
        NotificationManager notificationManager = this.f16219b;
        if (notificationManager != null && this.f16226k != null) {
            wf.b bVar = this.f16227l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f59801c;
            }
            Context context = this.f16218a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            h6.f fVar = this.f16220c;
            qVar.F.icon = fVar.f13905e;
            qVar.f10241e = q.d((String) this.f16226k.f13529f);
            int i7 = 0;
            qVar.f10242f = q.d(this.f16225j.getString(fVar.J, (String) this.f16226k.f13530g));
            qVar.h(2, true);
            qVar.f10246k = false;
            qVar.f10258x = 1;
            ComponentName componentName = this.f16221e;
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
                        for (Intent a11 = y9.a(context, component); a11 != null; a11 = y9.a(context, a11.getComponent())) {
                            arrayList.add(size, a11);
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e10);
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
                qVar.f10243g = activities;
            }
            h6.q qVar2 = fVar.W;
            j6.b bVar2 = f16217u;
            if (qVar2 != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = j.b(qVar2);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f16223g = iArr;
                ArrayList a12 = j.a(qVar2);
                this.f16222f = new ArrayList();
                if (a12 != null) {
                    int size2 = a12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = a12.get(i10);
                        i10++;
                        h6.d dVar = (h6.d) obj;
                        String str = dVar.f13898a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a10 = new e0.g(dVar.f13899b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), dVar.f13900c).b();
                        } else {
                            a10 = a(str);
                        }
                        if (a10 != null) {
                            this.f16222f.add(a10);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f16222f = new ArrayList();
                ArrayList arrayList2 = fVar.f13902a;
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    e0.h a13 = a((String) obj2);
                    if (a13 != null) {
                        this.f16222f.add(a13);
                    }
                }
                int[] iArr2 = fVar.f13903b;
                this.f16223g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f16222f;
            int size4 = arrayList3.size();
            while (i7 < size4) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f10239b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.f4356e = null;
            int[] iArr3 = this.f16223g;
            if (iArr3 != null) {
                yVar.f4356e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f16226k.f13528e;
            if (mediaSessionCompat$Token != null) {
                yVar.f4357f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

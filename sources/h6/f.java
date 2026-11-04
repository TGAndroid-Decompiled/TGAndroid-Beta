package h6;

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
import b8.jb;
import b8.ke;
import com.google.android.gms.internal.cast.b1;
import com.google.android.gms.internal.cast.b2;
import e0.q;
import e0.y;
import g6.o;
import java.util.ArrayList;
import java.util.Arrays;
import p6.m;
public final class f {
    public static final i6.b f14312u = new i6.b("MediaNotificationProxy", null);
    public final Context f14313a;
    public final NotificationManager f14314b;
    public final g6.f f14315c;
    public final ComponentName d;
    public final ComponentName f14316e;
    public ArrayList f14317f = new ArrayList();
    public int[] f14318g;
    public final long h;
    public final ke f14319i;
    public final Resources f14320j;
    public df.d f14321k;
    public tf.b f14322l;
    public e0.h f14323m;
    public e0.h f14324n;
    public e0.h f14325o;
    public e0.h f14326p;
    public e0.h f14327q;
    public e0.h f14328r;
    public e0.h f14329s;
    public e0.h f14330t;

    public f(Context context) {
        this.f14313a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f14314b = notificationManager;
        i6.b bVar = f6.a.f11442l;
        m.d("Must be called from the main thread.");
        f6.a aVar = f6.a.f11444n;
        m.g(aVar);
        m.d("Must be called from the main thread.");
        f6.b bVar2 = aVar.f11448e;
        m.g(bVar2);
        g6.a aVar2 = bVar2.f11459f;
        m.g(aVar2);
        g6.f fVar = aVar2.d;
        m.g(fVar);
        this.f14315c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f14320j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f11972a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f14316e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f14316e = null;
        }
        this.h = fVar.f11997c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.I);
        this.f14319i = new ke(context.getApplicationContext(), new g6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (w6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689633), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        b2.a(b1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final e0.h a(String str) {
        int i3;
        int i10;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f14320j;
        Context context = this.f14313a;
        ComponentName componentName = this.d;
        g6.f fVar = this.f14315c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f14328r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        i6.b bVar = i.f14351a;
                        int i11 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i12 = fVar.E;
                        if (i11 == 0) {
                            i12 = fVar.F;
                        } else if (j10 == 30000) {
                            i12 = fVar.G;
                        }
                        int i13 = fVar.S;
                        if (i11 == 0) {
                            i13 = fVar.T;
                        } else if (j10 == 30000) {
                            i13 = fVar.U;
                        }
                        this.f14328r = new e0.g(i12, broadcast, resources.getString(i13)).b();
                    }
                    return this.f14328r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f14321k.f8848c;
                    if (this.f14325o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f14325o = new e0.g(fVar.f12001r, pendingIntent, resources.getString(fVar.N)).b();
                    }
                    return this.f14325o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f14321k.d;
                    if (this.f14326p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f14326p = new e0.g(fVar.f12002s, pendingIntent, resources.getString(fVar.O)).b();
                    }
                    return this.f14326p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f14330t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f14330t = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(fVar.V)).b();
                    }
                    return this.f14330t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f14329s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f14329s = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(fVar.V, "")).b();
                    }
                    return this.f14329s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    df.d dVar = this.f14321k;
                    int i14 = dVar.f8847b;
                    if (dVar.f8846a) {
                        if (this.f14324n == null) {
                            if (i14 == 2) {
                                i3 = fVar.f11999f;
                                i10 = fVar.K;
                            } else {
                                i3 = fVar.h;
                                i10 = fVar.L;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f14324n = new e0.g(i3, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i10)).b();
                        }
                        return this.f14324n;
                    }
                    if (this.f14323m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f14323m = new e0.g(fVar.f12000n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(fVar.M)).b();
                    }
                    return this.f14323m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f14327q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        i6.b bVar2 = i.f14351a;
                        int i15 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i16 = fVar.f12003w;
                        if (i15 == 0) {
                            i16 = fVar.f12004x;
                        } else if (j10 == 30000) {
                            i16 = fVar.f12005y;
                        }
                        int i17 = fVar.P;
                        if (i15 == 0) {
                            i17 = fVar.Q;
                        } else if (j10 == 30000) {
                            i17 = fVar.R;
                        }
                        this.f14327q = new e0.g(i16, broadcast2, resources.getString(i17)).b();
                    }
                    return this.f14327q;
                }
                break;
        }
        i6.b bVar3 = f14312u;
        Log.e(bVar3.f14620a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a10;
        NotificationManager notificationManager = this.f14314b;
        if (notificationManager != null && this.f14321k != null) {
            tf.b bVar = this.f14322l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f55095b;
            }
            Context context = this.f14313a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            g6.f fVar = this.f14315c;
            qVar.F.icon = fVar.f11998e;
            qVar.f9281e = q.d((String) this.f14321k.f8850f);
            int i3 = 0;
            qVar.f9282f = q.d(this.f14320j.getString(fVar.J, (String) this.f14321k.f8851g));
            qVar.h(2, true);
            qVar.f9286k = false;
            qVar.f9298x = 1;
            ComponentName componentName = this.f14316e;
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
                        for (Intent a11 = jb.a(context, component); a11 != null; a11 = jb.a(context, a11.getComponent())) {
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
                qVar.f9283g = activities;
            }
            o oVar = fVar.W;
            i6.b bVar2 = f14312u;
            if (oVar != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(oVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f14318g = iArr;
                ArrayList a12 = i.a(oVar);
                this.f14317f = new ArrayList();
                if (a12 != null) {
                    int size2 = a12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = a12.get(i10);
                        i10++;
                        g6.d dVar = (g6.d) obj;
                        String str = dVar.f11991a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a10 = new e0.g(dVar.f11992b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), dVar.f11993c).b();
                        } else {
                            a10 = a(str);
                        }
                        if (a10 != null) {
                            this.f14317f.add(a10);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f14317f = new ArrayList();
                ArrayList arrayList2 = fVar.f11995a;
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    e0.h a13 = a((String) obj2);
                    if (a13 != null) {
                        this.f14317f.add(a13);
                    }
                }
                int[] iArr2 = fVar.f11996b;
                this.f14318g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f14317f;
            int size4 = arrayList3.size();
            while (i3 < size4) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f9279b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.f2341e = null;
            int[] iArr3 = this.f14318g;
            if (iArr3 != null) {
                yVar.f2341e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f14321k.f8849e;
            if (mediaSessionCompat$Token != null) {
                yVar.f2342f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

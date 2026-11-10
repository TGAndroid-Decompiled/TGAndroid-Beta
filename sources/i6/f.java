package i6;

import a8.r7;
import a8.u9;
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
import h6.p;
import java.util.ArrayList;
import java.util.Arrays;
import q6.m;
public final class f {
    public static final j6.b f15360u = new j6.b("MediaNotificationProxy", null);
    public final Context f15361a;
    public final NotificationManager f15362b;
    public final h6.f f15363c;
    public final ComponentName d;
    public final ComponentName f15364e;
    public ArrayList f15365f = new ArrayList();
    public int[] f15366g;
    public final long h;
    public final r7 f15367i;
    public final Resources f15368j;
    public gf.d f15369k;
    public wf.b f15370l;
    public e0.h f15371m;
    public e0.h f15372n;
    public e0.h f15373o;
    public e0.h f15374p;
    public e0.h f15375q;
    public e0.h f15376r;
    public e0.h f15377s;
    public e0.h f15378t;

    public f(Context context) {
        this.f15361a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f15362b = notificationManager;
        j6.b bVar = g6.a.f13520l;
        m.d("Must be called from the main thread.");
        g6.a aVar = g6.a.f13522n;
        m.g(aVar);
        m.d("Must be called from the main thread.");
        g6.b bVar2 = aVar.f13526e;
        m.g(bVar2);
        h6.a aVar2 = bVar2.f13537f;
        m.g(aVar2);
        h6.f fVar = aVar2.d;
        m.g(fVar);
        this.f15363c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f15368j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f14215a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f15364e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f15364e = null;
        }
        this.h = fVar.f14239c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f15367i = new r7(context.getApplicationContext(), new h6.b(1, dimensionPixelSize, dimensionPixelSize));
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
        Resources resources = this.f15368j;
        Context context = this.f15361a;
        ComponentName componentName = this.d;
        h6.f fVar = this.f15363c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f15376r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        j6.b bVar = i.f15399a;
                        int i11 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i12 = fVar.D;
                        if (i11 == 0) {
                            i12 = fVar.E;
                        } else if (j3 == 30000) {
                            i12 = fVar.F;
                        }
                        int i13 = fVar.R;
                        if (i11 == 0) {
                            i13 = fVar.S;
                        } else if (j3 == 30000) {
                            i13 = fVar.T;
                        }
                        this.f15376r = new e0.g(i12, broadcast, resources.getString(i13)).b();
                    }
                    return this.f15376r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z9 = this.f15369k.f13878c;
                    if (this.f15373o == null) {
                        if (z9) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f15373o = new e0.g(fVar.f14243r, pendingIntent, resources.getString(fVar.M)).b();
                    }
                    return this.f15373o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z10 = this.f15369k.d;
                    if (this.f15374p == null) {
                        if (z10) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f15374p = new e0.g(fVar.f14244s, pendingIntent, resources.getString(fVar.N)).b();
                    }
                    return this.f15374p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f15378t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f15378t = new e0.g(fVar.G, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(fVar.U)).b();
                    }
                    return this.f15378t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f15377s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f15377s = new e0.g(fVar.G, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(fVar.U, "")).b();
                    }
                    return this.f15377s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    gf.d dVar = this.f15369k;
                    int i14 = dVar.f13877b;
                    if (dVar.f13876a) {
                        if (this.f15372n == null) {
                            if (i14 == 2) {
                                i7 = fVar.f14241f;
                                i10 = fVar.J;
                            } else {
                                i7 = fVar.h;
                                i10 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f15372n = new e0.g(i7, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i10)).b();
                        }
                        return this.f15372n;
                    }
                    if (this.f15371m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f15371m = new e0.g(fVar.f14242n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(fVar.L)).b();
                    }
                    return this.f15371m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f15375q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        j6.b bVar2 = i.f15399a;
                        int i15 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i16 = fVar.f14245w;
                        if (i15 == 0) {
                            i16 = fVar.f14246x;
                        } else if (j3 == 30000) {
                            i16 = fVar.f14247y;
                        }
                        int i17 = fVar.O;
                        if (i15 == 0) {
                            i17 = fVar.P;
                        } else if (j3 == 30000) {
                            i17 = fVar.Q;
                        }
                        this.f15375q = new e0.g(i16, broadcast2, resources.getString(i17)).b();
                    }
                    return this.f15375q;
                }
                break;
        }
        j6.b bVar3 = f15360u;
        Log.e(bVar3.f16508a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a10;
        NotificationManager notificationManager = this.f15362b;
        if (notificationManager != null && this.f15369k != null) {
            wf.b bVar = this.f15370l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f57667c;
            }
            Context context = this.f15361a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            h6.f fVar = this.f15363c;
            qVar.F.icon = fVar.f14240e;
            qVar.f10102e = q.d((String) this.f15369k.f13880f);
            int i7 = 0;
            qVar.f10103f = q.d(this.f15368j.getString(fVar.I, (String) this.f15369k.f13881g));
            qVar.h(2, true);
            qVar.f10107k = false;
            qVar.f10119x = 1;
            ComponentName componentName = this.f15364e;
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
                        for (Intent a11 = u9.a(context, component); a11 != null; a11 = u9.a(context, a11.getComponent())) {
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
                qVar.f10104g = activities;
            }
            p pVar = fVar.V;
            j6.b bVar2 = f15360u;
            if (pVar != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f15366g = iArr;
                ArrayList a12 = i.a(pVar);
                this.f15365f = new ArrayList();
                if (a12 != null) {
                    int size2 = a12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = a12.get(i10);
                        i10++;
                        h6.d dVar = (h6.d) obj;
                        String str = dVar.f14234a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a10 = new e0.g(dVar.f14235b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), dVar.f14236c).b();
                        } else {
                            a10 = a(str);
                        }
                        if (a10 != null) {
                            this.f15365f.add(a10);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f15365f = new ArrayList();
                ArrayList arrayList2 = fVar.f14237a;
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    e0.h a13 = a((String) obj2);
                    if (a13 != null) {
                        this.f15365f.add(a13);
                    }
                }
                int[] iArr2 = fVar.f14238b;
                this.f15366g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f15365f;
            int size4 = arrayList3.size();
            while (i7 < size4) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f10100b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.f5261e = null;
            int[] iArr3 = this.f15366g;
            if (iArr3 != null) {
                yVar.f5261e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f15369k.f13879e;
            if (mediaSessionCompat$Token != null) {
                yVar.f5262f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

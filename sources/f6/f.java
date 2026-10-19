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
import e0.q;
import e0.y;
import e6.p;
import java.util.ArrayList;
import java.util.Arrays;
import n4.s;
import n6.l;
import v7.y6;
public final class f {
    public static final g6.b f10466u = new g6.b("MediaNotificationProxy", null);
    public final Context f10467a;
    public final NotificationManager f10468b;
    public final e6.f f10469c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f10470f = new ArrayList();
    public int[] f10471g;
    public final long h;
    public final z5 f10472i;
    public final Resources f10473j;
    public af.e f10474k;
    public s f10475l;
    public e0.h f10476m;
    public e0.h f10477n;
    public e0.h f10478o;
    public e0.h f10479p;
    public e0.h f10480q;
    public e0.h f10481r;
    public e0.h f10482s;
    public e0.h f10483t;

    public f(Context context) {
        this.f10467a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f10468b = notificationManager;
        g6.b bVar = d6.a.f7826l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.f7828n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        d6.b bVar2 = aVar.e;
        l.h(bVar2);
        e6.a aVar2 = bVar2.f7841f;
        l.h(aVar2);
        e6.f fVar = aVar2.d;
        l.h(fVar);
        this.f10469c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f10473j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f8338a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = fVar.f8360c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f10472i = new z5(context.getApplicationContext(), new e6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (u6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131689632), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        d2.a(d1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final e0.h a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f10473j;
        Context context = this.f10467a;
        ComponentName componentName = this.d;
        e6.f fVar = this.f10469c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f10481r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        g6.b bVar = i.f10503a;
                        int i12 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i13 = fVar.f8367y;
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
                        this.f10481r = new e0.g(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f10481r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f10474k.f559c;
                    if (this.f10478o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f10478o = new e0.g(fVar.f8363r, resources.getString(fVar.M), pendingIntent).b();
                    }
                    return this.f10478o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f10474k.d;
                    if (this.f10479p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f10479p = new e0.g(fVar.f8364s, resources.getString(fVar.N), pendingIntent).b();
                    }
                    return this.f10479p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f10483t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f10483t = new e0.g(fVar.G, resources.getString(fVar.U), PendingIntent.getBroadcast(context, 0, intent4, 67108864)).b();
                    }
                    return this.f10483t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f10482s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f10482s = new e0.g(fVar.G, resources.getString(fVar.U, ""), PendingIntent.getBroadcast(context, 0, intent5, 67108864)).b();
                    }
                    return this.f10482s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    af.e eVar = this.f10474k;
                    int i15 = eVar.f558b;
                    if (eVar.f557a) {
                        if (this.f10477n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f8361f;
                                i11 = fVar.J;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f10477n = new e0.g(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, 67108864)).b();
                        }
                        return this.f10477n;
                    }
                    if (this.f10476m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f10476m = new e0.g(fVar.f8362n, resources.getString(fVar.L), PendingIntent.getBroadcast(context, 0, intent7, 67108864)).b();
                    }
                    return this.f10476m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f10480q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        g6.b bVar2 = i.f10503a;
                        int i16 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f8365w;
                        } else if (j10 == 30000) {
                            i17 = fVar.f8366x;
                        }
                        int i18 = fVar.O;
                        if (i16 == 0) {
                            i18 = fVar.P;
                        } else if (j10 == 30000) {
                            i18 = fVar.Q;
                        }
                        this.f10480q = new e0.g(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f10480q;
                }
                break;
        }
        g6.b bVar3 = f10466u;
        Log.e(bVar3.f10842a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a2;
        NotificationManager notificationManager = this.f10468b;
        if (notificationManager != null && this.f10474k != null) {
            s sVar = this.f10475l;
            if (sVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) sVar.f17126c;
            }
            Context context = this.f10467a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            e6.f fVar = this.f10469c;
            qVar.E.icon = fVar.e;
            qVar.e = q.d((String) this.f10474k.f560f);
            int i10 = 0;
            qVar.f8144f = q.d(this.f10473j.getString(fVar.I, (String) this.f10474k.f561g));
            qVar.h(2, true);
            qVar.f8148k = false;
            qVar.f8160x = 1;
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
                qVar.f8145g = activities;
            }
            p pVar = fVar.V;
            g6.b bVar = f10466u;
            if (pVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f10471g = iArr;
                ArrayList a11 = i.a(pVar);
                this.f10470f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = a11.get(i11);
                        i11++;
                        e6.d dVar = (e6.d) obj;
                        String str = dVar.f8355a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.g(dVar.f8356b, dVar.f8357c, PendingIntent.getBroadcast(context, 0, intent2, 67108864)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f10470f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f10470f = new ArrayList();
                ArrayList arrayList2 = fVar.f8358a;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    e0.h a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f10470f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f8359b;
                this.f10471g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f10470f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f8142b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.e = null;
            int[] iArr3 = this.f10471g;
            if (iArr3 != null) {
                yVar.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f10474k.e;
            if (mediaSessionCompat$Token != null) {
                yVar.f50625f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

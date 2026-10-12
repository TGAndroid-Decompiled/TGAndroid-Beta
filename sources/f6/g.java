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
import ci.u5;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import e0.r;
import e0.z;
import e6.q;
import java.util.ArrayList;
import java.util.Arrays;
import n6.m;
import v7.w6;
public final class g {
    public static final g6.b f9758u = new g6.b("MediaNotificationProxy", null);
    public final Context f9759a;
    public final NotificationManager f9760b;
    public final e6.f f9761c;
    public final ComponentName d;
    public final ComponentName f9762e;
    public ArrayList f9763f = new ArrayList();
    public int[] f9764g;
    public final long h;
    public final u5 f9765i;
    public final Resources f9766j;
    public f f9767k;
    public pf.b f9768l;
    public e0.i f9769m;
    public e0.i f9770n;
    public e0.i f9771o;
    public e0.i f9772p;
    public e0.i f9773q;
    public e0.i f9774r;
    public e0.i f9775s;
    public e0.i f9776t;

    public g(Context context) {
        this.f9759a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f9760b = notificationManager;
        g6.b bVar = d6.a.f8150l;
        m.e("Must be called from the main thread.");
        d6.a aVar = d6.a.f8152n;
        m.h(aVar);
        m.e("Must be called from the main thread.");
        d6.b bVar2 = aVar.f8156e;
        m.h(bVar2);
        e6.a aVar2 = bVar2.f8167f;
        m.h(aVar2);
        e6.f fVar = aVar2.d;
        m.h(fVar);
        this.f9761c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f9766j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f8634a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f9762e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f9762e = null;
        }
        this.h = fVar.f8658c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f9765i = new u5(context.getApplicationContext(), new e6.b(1, dimensionPixelSize, dimensionPixelSize));
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
        long j3 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f9766j;
        Context context = this.f9759a;
        ComponentName componentName = this.d;
        e6.f fVar = this.f9761c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f9774r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        g6.b bVar = j.f9797a;
                        int i12 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i13 = fVar.f8666y;
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
                        this.f9774r = new e0.h(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f9774r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f9767k.f9754c;
                    if (this.f9771o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f9771o = new e0.h(fVar.f8662r, resources.getString(fVar.M), pendingIntent).b();
                    }
                    return this.f9771o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f9767k.d;
                    if (this.f9772p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f9772p = new e0.h(fVar.f8663s, resources.getString(fVar.N), pendingIntent).b();
                    }
                    return this.f9772p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f9776t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f9776t = new e0.h(fVar.G, resources.getString(fVar.U), PendingIntent.getBroadcast(context, 0, intent4, 67108864)).b();
                    }
                    return this.f9776t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f9775s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f9775s = new e0.h(fVar.G, resources.getString(fVar.U, ""), PendingIntent.getBroadcast(context, 0, intent5, 67108864)).b();
                    }
                    return this.f9775s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    f fVar2 = this.f9767k;
                    int i15 = fVar2.f9752a;
                    if (fVar2.f9753b) {
                        if (this.f9770n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f8660f;
                                i11 = fVar.J;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f9770n = new e0.h(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, 67108864)).b();
                        }
                        return this.f9770n;
                    }
                    if (this.f9769m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f9769m = new e0.h(fVar.f8661n, resources.getString(fVar.L), PendingIntent.getBroadcast(context, 0, intent7, 67108864)).b();
                    }
                    return this.f9769m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f9773q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        g6.b bVar2 = j.f9797a;
                        int i16 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f8664w;
                        } else if (j3 == 30000) {
                            i17 = fVar.f8665x;
                        }
                        int i18 = fVar.O;
                        if (i16 == 0) {
                            i18 = fVar.P;
                        } else if (j3 == 30000) {
                            i18 = fVar.Q;
                        }
                        this.f9773q = new e0.h(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f9773q;
                }
                break;
        }
        g6.b bVar3 = f9758u;
        Log.e(bVar3.f10321a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.i a2;
        NotificationManager notificationManager = this.f9760b;
        if (notificationManager != null && this.f9767k != null) {
            pf.b bVar = this.f9768l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f45449c;
            }
            Context context = this.f9759a;
            r rVar = new r(context, "cast_media_notification");
            rVar.j(bitmap);
            e6.f fVar = this.f9761c;
            rVar.E.icon = fVar.f8659e;
            rVar.f8466e = r.d((String) this.f9767k.f9756f);
            int i10 = 0;
            rVar.f8467f = r.d(this.f9766j.getString(fVar.I, (String) this.f9767k.f9757g));
            rVar.h(2, true);
            rVar.f8471k = false;
            rVar.f8483x = 1;
            ComponentName componentName = this.f9762e;
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
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                rVar.f8468g = activities;
            }
            q qVar = fVar.V;
            g6.b bVar2 = f9758u;
            if (qVar != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = j.b(qVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f9764g = iArr;
                ArrayList a11 = j.a(qVar);
                this.f9763f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = a11.get(i11);
                        i11++;
                        e6.d dVar = (e6.d) obj;
                        String str = dVar.f8653a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.h(dVar.f8654b, dVar.f8655c, PendingIntent.getBroadcast(context, 0, intent2, 67108864)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f9763f.add(a2);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f9763f = new ArrayList();
                ArrayList arrayList2 = fVar.f8656a;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    e0.i a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f9763f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f8657b;
                this.f9764g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f9763f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                e0.i iVar = (e0.i) obj3;
                if (iVar != null) {
                    rVar.f8464b.add(iVar);
                }
            }
            ?? zVar = new z();
            zVar.f53713e = null;
            int[] iArr3 = this.f9764g;
            if (iArr3 != null) {
                zVar.f53713e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f9767k.f9755e;
            if (mediaSessionCompat$Token != null) {
                zVar.f53714f = mediaSessionCompat$Token;
            }
            rVar.n(zVar);
            notificationManager.notify("castMediaNotification", 1, rVar.b());
        }
    }
}

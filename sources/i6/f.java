package i6;

import a8.r7;
import a8.w9;
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
    public static final j6.b f15813u = new j6.b("MediaNotificationProxy", null);
    public final Context f15814a;
    public final NotificationManager f15815b;
    public final h6.f f15816c;
    public final ComponentName d;
    public final ComponentName f15817e;
    public ArrayList f15818f = new ArrayList();
    public int[] f15819g;
    public final long h;
    public final r7 f15820i;
    public final Resources f15821j;
    public gf.d f15822k;
    public wf.b f15823l;
    public e0.h f15824m;
    public e0.h f15825n;
    public e0.h f15826o;
    public e0.h f15827p;
    public e0.h f15828q;
    public e0.h f15829r;
    public e0.h f15830s;
    public e0.h f15831t;

    public f(Context context) {
        this.f15814a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f15815b = notificationManager;
        j6.b bVar = g6.a.f12869l;
        m.d("Must be called from the main thread.");
        g6.a aVar = g6.a.f12871n;
        m.g(aVar);
        m.d("Must be called from the main thread.");
        g6.b bVar2 = aVar.f12875e;
        m.g(bVar2);
        h6.a aVar2 = bVar2.f12886f;
        m.g(aVar2);
        h6.f fVar = aVar2.d;
        m.g(fVar);
        this.f15816c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f15821j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f13572a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f15817e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f15817e = null;
        }
        this.h = fVar.f13597c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.I);
        this.f15820i = new r7(context.getApplicationContext(), new h6.b(1, dimensionPixelSize, dimensionPixelSize));
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
        Resources resources = this.f15821j;
        Context context = this.f15814a;
        ComponentName componentName = this.d;
        h6.f fVar = this.f15816c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f15829r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        j6.b bVar = i.f15852a;
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
                        this.f15829r = new e0.g(i12, broadcast, resources.getString(i13)).b();
                    }
                    return this.f15829r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f15822k.f13220c;
                    if (this.f15826o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f15826o = new e0.g(fVar.f13601r, pendingIntent, resources.getString(fVar.N)).b();
                    }
                    return this.f15826o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f15822k.d;
                    if (this.f15827p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f15827p = new e0.g(fVar.f13602s, pendingIntent, resources.getString(fVar.O)).b();
                    }
                    return this.f15827p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f15831t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f15831t = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(fVar.V)).b();
                    }
                    return this.f15831t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f15830s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f15830s = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(fVar.V, "")).b();
                    }
                    return this.f15830s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    gf.d dVar = this.f15822k;
                    int i14 = dVar.f13219b;
                    if (dVar.f13218a) {
                        if (this.f15825n == null) {
                            if (i14 == 2) {
                                i7 = fVar.f13599f;
                                i10 = fVar.K;
                            } else {
                                i7 = fVar.h;
                                i10 = fVar.L;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f15825n = new e0.g(i7, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i10)).b();
                        }
                        return this.f15825n;
                    }
                    if (this.f15824m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f15824m = new e0.g(fVar.f13600n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(fVar.M)).b();
                    }
                    return this.f15824m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f15828q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        j6.b bVar2 = i.f15852a;
                        int i15 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i16 = fVar.f13603w;
                        if (i15 == 0) {
                            i16 = fVar.f13604x;
                        } else if (j3 == 30000) {
                            i16 = fVar.f13605y;
                        }
                        int i17 = fVar.P;
                        if (i15 == 0) {
                            i17 = fVar.Q;
                        } else if (j3 == 30000) {
                            i17 = fVar.R;
                        }
                        this.f15828q = new e0.g(i16, broadcast2, resources.getString(i17)).b();
                    }
                    return this.f15828q;
                }
                break;
        }
        j6.b bVar3 = f15813u;
        Log.e(bVar3.f16859a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a10;
        NotificationManager notificationManager = this.f15815b;
        if (notificationManager != null && this.f15822k != null) {
            wf.b bVar = this.f15823l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f59108c;
            }
            Context context = this.f15814a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            h6.f fVar = this.f15816c;
            qVar.F.icon = fVar.f13598e;
            qVar.f9933e = q.d((String) this.f15822k.f13222f);
            int i7 = 0;
            qVar.f9934f = q.d(this.f15821j.getString(fVar.J, (String) this.f15822k.f13223g));
            qVar.h(2, true);
            qVar.f9938k = false;
            qVar.f9950x = 1;
            ComponentName componentName = this.f15817e;
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
                        for (Intent a11 = w9.a(context, component); a11 != null; a11 = w9.a(context, a11.getComponent())) {
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
                qVar.f9935g = activities;
            }
            p pVar = fVar.W;
            j6.b bVar2 = f15813u;
            if (pVar != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f15819g = iArr;
                ArrayList a12 = i.a(pVar);
                this.f15818f = new ArrayList();
                if (a12 != null) {
                    int size2 = a12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = a12.get(i10);
                        i10++;
                        h6.d dVar = (h6.d) obj;
                        String str = dVar.f13591a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a10 = new e0.g(dVar.f13592b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), dVar.f13593c).b();
                        } else {
                            a10 = a(str);
                        }
                        if (a10 != null) {
                            this.f15818f.add(a10);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f15818f = new ArrayList();
                ArrayList arrayList2 = fVar.f13595a;
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    e0.h a13 = a((String) obj2);
                    if (a13 != null) {
                        this.f15818f.add(a13);
                    }
                }
                int[] iArr2 = fVar.f13596b;
                this.f15819g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f15818f;
            int size4 = arrayList3.size();
            while (i7 < size4) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f9931b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.f4083e = null;
            int[] iArr3 = this.f15819g;
            if (iArr3 != null) {
                yVar.f4083e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f15822k.f13221e;
            if (mediaSessionCompat$Token != null) {
                yVar.f4084f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

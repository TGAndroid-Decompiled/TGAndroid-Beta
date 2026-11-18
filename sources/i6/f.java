package i6;

import a8.r7;
import a8.x9;
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
    public static final j6.b f16131u = new j6.b("MediaNotificationProxy", null);
    public final Context f16132a;
    public final NotificationManager f16133b;
    public final h6.f f16134c;
    public final ComponentName d;
    public final ComponentName f16135e;
    public ArrayList f16136f = new ArrayList();
    public int[] f16137g;
    public final long h;
    public final r7 f16138i;
    public final Resources f16139j;
    public gf.d f16140k;
    public wf.b f16141l;
    public e0.h f16142m;
    public e0.h f16143n;
    public e0.h f16144o;
    public e0.h f16145p;
    public e0.h f16146q;
    public e0.h f16147r;
    public e0.h f16148s;
    public e0.h f16149t;

    public f(Context context) {
        this.f16132a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f16133b = notificationManager;
        j6.b bVar = g6.a.f13186l;
        m.e("Must be called from the main thread.");
        g6.a aVar = g6.a.f13188n;
        m.h(aVar);
        m.e("Must be called from the main thread.");
        g6.b bVar2 = aVar.f13192e;
        m.h(bVar2);
        h6.a aVar2 = bVar2.f13203f;
        m.h(aVar2);
        h6.f fVar = aVar2.d;
        m.h(fVar);
        this.f16134c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f16139j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f13887a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f16135e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f16135e = null;
        }
        this.h = fVar.f13912c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.I);
        this.f16138i = new r7(context.getApplicationContext(), new h6.b(1, dimensionPixelSize, dimensionPixelSize));
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
        Resources resources = this.f16139j;
        Context context = this.f16132a;
        ComponentName componentName = this.d;
        h6.f fVar = this.f16134c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f16147r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        j6.b bVar = i.f16170a;
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
                        this.f16147r = new e0.g(i12, broadcast, resources.getString(i13)).b();
                    }
                    return this.f16147r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f16140k.f13535c;
                    if (this.f16144o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f16144o = new e0.g(fVar.f13916r, pendingIntent, resources.getString(fVar.N)).b();
                    }
                    return this.f16144o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f16140k.d;
                    if (this.f16145p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f16145p = new e0.g(fVar.f13917s, pendingIntent, resources.getString(fVar.O)).b();
                    }
                    return this.f16145p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f16149t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f16149t = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(fVar.V)).b();
                    }
                    return this.f16149t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f16148s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f16148s = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(fVar.V, "")).b();
                    }
                    return this.f16148s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    gf.d dVar = this.f16140k;
                    int i14 = dVar.f13534b;
                    if (dVar.f13533a) {
                        if (this.f16143n == null) {
                            if (i14 == 2) {
                                i7 = fVar.f13914f;
                                i10 = fVar.K;
                            } else {
                                i7 = fVar.h;
                                i10 = fVar.L;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f16143n = new e0.g(i7, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i10)).b();
                        }
                        return this.f16143n;
                    }
                    if (this.f16142m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f16142m = new e0.g(fVar.f13915n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(fVar.M)).b();
                    }
                    return this.f16142m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f16146q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        j6.b bVar2 = i.f16170a;
                        int i15 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i16 = fVar.f13918w;
                        if (i15 == 0) {
                            i16 = fVar.f13919x;
                        } else if (j3 == 30000) {
                            i16 = fVar.f13920y;
                        }
                        int i17 = fVar.P;
                        if (i15 == 0) {
                            i17 = fVar.Q;
                        } else if (j3 == 30000) {
                            i17 = fVar.R;
                        }
                        this.f16146q = new e0.g(i16, broadcast2, resources.getString(i17)).b();
                    }
                    return this.f16146q;
                }
                break;
        }
        j6.b bVar3 = f16131u;
        Log.e(bVar3.f17244a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a10;
        NotificationManager notificationManager = this.f16133b;
        if (notificationManager != null && this.f16140k != null) {
            wf.b bVar = this.f16141l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f59673c;
            }
            Context context = this.f16132a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            h6.f fVar = this.f16134c;
            qVar.F.icon = fVar.f13913e;
            qVar.f10251e = q.d((String) this.f16140k.f13537f);
            int i7 = 0;
            qVar.f10252f = q.d(this.f16139j.getString(fVar.J, (String) this.f16140k.f13538g));
            qVar.h(2, true);
            qVar.f10256k = false;
            qVar.f10268x = 1;
            ComponentName componentName = this.f16135e;
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
                        for (Intent a11 = x9.a(context, component); a11 != null; a11 = x9.a(context, a11.getComponent())) {
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
                qVar.f10253g = activities;
            }
            p pVar = fVar.W;
            j6.b bVar2 = f16131u;
            if (pVar != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f16137g = iArr;
                ArrayList a12 = i.a(pVar);
                this.f16136f = new ArrayList();
                if (a12 != null) {
                    int size2 = a12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = a12.get(i10);
                        i10++;
                        h6.d dVar = (h6.d) obj;
                        String str = dVar.f13906a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a10 = new e0.g(dVar.f13907b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), dVar.f13908c).b();
                        } else {
                            a10 = a(str);
                        }
                        if (a10 != null) {
                            this.f16136f.add(a10);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f16136f = new ArrayList();
                ArrayList arrayList2 = fVar.f13910a;
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    e0.h a13 = a((String) obj2);
                    if (a13 != null) {
                        this.f16136f.add(a13);
                    }
                }
                int[] iArr2 = fVar.f13911b;
                this.f16137g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f16136f;
            int size4 = arrayList3.size();
            while (i7 < size4) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f10249b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.f4364e = null;
            int[] iArr3 = this.f16137g;
            if (iArr3 != null) {
                yVar.f4364e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f16140k.f13536e;
            if (mediaSessionCompat$Token != null) {
                yVar.f4365f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

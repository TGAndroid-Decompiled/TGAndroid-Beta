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
    public static final j6.b f15355u = new j6.b("MediaNotificationProxy", null);
    public final Context f15356a;
    public final NotificationManager f15357b;
    public final h6.f f15358c;
    public final ComponentName d;
    public final ComponentName f15359e;
    public ArrayList f15360f = new ArrayList();
    public int[] f15361g;
    public final long h;
    public final r7 f15362i;
    public final Resources f15363j;
    public gf.d f15364k;
    public wf.b f15365l;
    public e0.h f15366m;
    public e0.h f15367n;
    public e0.h f15368o;
    public e0.h f15369p;
    public e0.h f15370q;
    public e0.h f15371r;
    public e0.h f15372s;
    public e0.h f15373t;

    public f(Context context) {
        this.f15356a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f15357b = notificationManager;
        j6.b bVar = g6.a.f13518l;
        m.d("Must be called from the main thread.");
        g6.a aVar = g6.a.f13520n;
        m.g(aVar);
        m.d("Must be called from the main thread.");
        g6.b bVar2 = aVar.f13524e;
        m.g(bVar2);
        h6.a aVar2 = bVar2.f13535f;
        m.g(aVar2);
        h6.f fVar = aVar2.d;
        m.g(fVar);
        this.f15358c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f15363j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f14213a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f15359e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f15359e = null;
        }
        this.h = fVar.f14237c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.f15362i = new r7(context.getApplicationContext(), new h6.b(1, dimensionPixelSize, dimensionPixelSize));
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
        Resources resources = this.f15363j;
        Context context = this.f15356a;
        ComponentName componentName = this.d;
        h6.f fVar = this.f15358c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f15371r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        j6.b bVar = i.f15394a;
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
                        this.f15371r = new e0.g(i12, broadcast, resources.getString(i13)).b();
                    }
                    return this.f15371r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z9 = this.f15364k.f13876c;
                    if (this.f15368o == null) {
                        if (z9) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.f15368o = new e0.g(fVar.f14241r, pendingIntent, resources.getString(fVar.M)).b();
                    }
                    return this.f15368o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z10 = this.f15364k.d;
                    if (this.f15369p == null) {
                        if (z10) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.f15369p = new e0.g(fVar.f14242s, pendingIntent, resources.getString(fVar.N)).b();
                    }
                    return this.f15369p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f15373t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f15373t = new e0.g(fVar.G, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(fVar.U)).b();
                    }
                    return this.f15373t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f15372s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f15372s = new e0.g(fVar.G, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(fVar.U, "")).b();
                    }
                    return this.f15372s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    gf.d dVar = this.f15364k;
                    int i14 = dVar.f13875b;
                    if (dVar.f13874a) {
                        if (this.f15367n == null) {
                            if (i14 == 2) {
                                i7 = fVar.f14239f;
                                i10 = fVar.J;
                            } else {
                                i7 = fVar.h;
                                i10 = fVar.K;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f15367n = new e0.g(i7, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(i10)).b();
                        }
                        return this.f15367n;
                    }
                    if (this.f15366m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f15366m = new e0.g(fVar.f14240n, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(fVar.L)).b();
                    }
                    return this.f15366m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f15370q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        j6.b bVar2 = i.f15394a;
                        int i15 = (j3 > 10000L ? 1 : (j3 == 10000L ? 0 : -1));
                        int i16 = fVar.f14243w;
                        if (i15 == 0) {
                            i16 = fVar.f14244x;
                        } else if (j3 == 30000) {
                            i16 = fVar.f14245y;
                        }
                        int i17 = fVar.O;
                        if (i15 == 0) {
                            i17 = fVar.P;
                        } else if (j3 == 30000) {
                            i17 = fVar.Q;
                        }
                        this.f15370q = new e0.g(i16, broadcast2, resources.getString(i17)).b();
                    }
                    return this.f15370q;
                }
                break;
        }
        j6.b bVar3 = f15355u;
        Log.e(bVar3.f16505a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        e0.h a10;
        NotificationManager notificationManager = this.f15357b;
        if (notificationManager != null && this.f15364k != null) {
            wf.b bVar = this.f15365l;
            if (bVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bVar.f57564c;
            }
            Context context = this.f15356a;
            q qVar = new q(context, "cast_media_notification");
            qVar.j(bitmap);
            h6.f fVar = this.f15358c;
            qVar.F.icon = fVar.f14238e;
            qVar.f10097e = q.d((String) this.f15364k.f13878f);
            int i7 = 0;
            qVar.f10098f = q.d(this.f15363j.getString(fVar.I, (String) this.f15364k.f13879g));
            qVar.h(2, true);
            qVar.f10102k = false;
            qVar.f10114x = 1;
            ComponentName componentName = this.f15359e;
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
                qVar.f10099g = activities;
            }
            p pVar = fVar.V;
            j6.b bVar2 = f15355u;
            if (pVar != null) {
                bVar2.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f15361g = iArr;
                ArrayList a12 = i.a(pVar);
                this.f15360f = new ArrayList();
                if (a12 != null) {
                    int size2 = a12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = a12.get(i10);
                        i10++;
                        h6.d dVar = (h6.d) obj;
                        String str = dVar.f14232a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a10 = new e0.g(dVar.f14233b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), dVar.f14234c).b();
                        } else {
                            a10 = a(str);
                        }
                        if (a10 != null) {
                            this.f15360f.add(a10);
                        }
                    }
                }
            } else {
                bVar2.b("actionsProvider == null", new Object[0]);
                this.f15360f = new ArrayList();
                ArrayList arrayList2 = fVar.f14235a;
                int size3 = arrayList2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    e0.h a13 = a((String) obj2);
                    if (a13 != null) {
                        this.f15360f.add(a13);
                    }
                }
                int[] iArr2 = fVar.f14236b;
                this.f15361g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f15360f;
            int size4 = arrayList3.size();
            while (i7 < size4) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                e0.h hVar = (e0.h) obj3;
                if (hVar != null) {
                    qVar.f10095b.add(hVar);
                }
            }
            ?? yVar = new y();
            yVar.f5258e = null;
            int[] iArr3 = this.f15361g;
            if (iArr3 != null) {
                yVar.f5258e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f15364k.f13877e;
            if (mediaSessionCompat$Token != null) {
                yVar.f5259f = mediaSessionCompat$Token;
            }
            qVar.n(yVar);
            notificationManager.notify("castMediaNotification", 1, qVar.b());
        }
    }
}

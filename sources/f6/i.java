package f6;

import a4.m;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b0;
import android.support.v4.media.session.e0;
import android.support.v4.media.session.v;
import android.text.TextUtils;
import android.util.Log;
import bi.u6;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.internal.cast.r;
import e6.q;
import java.util.ArrayList;
import java.util.List;
import n6.l;
public final class i {
    public static final g6.b v = new g6.b("MediaSessionManager", null);
    public final Context f7875a;
    public final d6.b f7876b;
    public final r f7877c;
    public final d6.g d;
    public final e6.f e;
    public final ComponentName f7878f;
    public final ComponentName f7879g;
    public final u6 h;
    public final u6 f7880i;
    public final g f7881j;
    public final c0 f7882k;
    public final androidx.activity.i f7883l;
    public final d6.c0 f7884m;
    public e6.h f7885n;
    public CastDevice f7886o;
    public b0 f7887p;
    public boolean f7888q;
    public PlaybackStateCompat.CustomAction f7889r;
    public PlaybackStateCompat.CustomAction f7890s;
    public PlaybackStateCompat.CustomAction f7891t;
    public PlaybackStateCompat.CustomAction f7892u;

    public i(Context context, d6.b bVar, r rVar) {
        d6.g gVar;
        e6.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        e6.f fVar2;
        int size;
        this.f7875a = context;
        this.f7876b = bVar;
        this.f7877c = rVar;
        g6.b bVar2 = d6.a.f6281l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.f6283n;
        g gVar2 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        e6.a aVar2 = bVar.f6296f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.e = fVar;
        this.f7884m = new d6.c0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f7284b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f7878f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f7283a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f7879g = componentName2;
        u6 u6Var = new u6(context);
        this.h = u6Var;
        u6Var.e = new m(this, 14);
        u6 u6Var2 = new u6(context);
        this.f7880i = u6Var2;
        u6Var2.e = new pb.c(this, 16);
        this.f7882k = new c0(Looper.getMainLooper(), 0);
        g6.b bVar3 = g.f7856u;
        e6.a aVar3 = bVar.f6296f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            q qVar = fVar2.V;
            if (qVar != null) {
                ArrayList a2 = j.a(qVar);
                int[] b10 = j.b(qVar);
                if (a2 == null) {
                    size = 0;
                } else {
                    size = a2.size();
                }
                if (a2 != null && !a2.isEmpty()) {
                    if (a2.size() > 5) {
                        Log.e(bVar3.f8558a, bVar3.d(e6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i10 : b10) {
                            if (i10 < 0 || i10 >= size) {
                                Log.e(bVar3.f8558a, bVar3.d(e6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f8558a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f8558a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            gVar2 = new g(context);
        }
        this.f7881j = gVar2;
        this.f7883l = new androidx.activity.i(this, 16);
    }

    public final void a(e6.h hVar, CastDevice castDevice) {
        e6.a aVar;
        ComponentName componentName;
        d6.b bVar = this.f7876b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f6296f;
        }
        if (!this.f7888q && bVar != null && aVar != null && this.e != null && hVar != null && castDevice != null && (componentName = this.f7879g) != null) {
            this.f7885n = hVar;
            hVar.p(this.f7884m);
            this.f7886o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            int i10 = a0.f5020a;
            Context context = this.f7875a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
            if (aVar.f7286f) {
                b0 b0Var = new b0(context, "CastMediaSession", componentName, broadcast);
                this.f7887p = b0Var;
                j(0, null);
                CastDevice castDevice2 = this.f7886o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.f7886o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    b0Var.e(new MediaMetadataCompat(bundle));
                }
                b0Var.d(new h(this), null);
                b0Var.c(true);
                this.f7877c.L0(b0Var);
            }
            this.f7888q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.b():void");
    }

    public final long c(String str, int i10, Bundle bundle) {
        long j3;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    if (i10 == 3) {
                        j3 = 514;
                        i10 = 3;
                    } else {
                        j3 = 512;
                    }
                    if (i10 != 2) {
                        return j3;
                    }
                    return 516L;
                }
            } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                e6.h hVar = this.f7885n;
                if (hVar != null && hVar.h()) {
                    c6.q e = hVar.e();
                    l.h(e);
                    if ((128 & e.f4452n) == 0 && e.F == 0) {
                        Integer num = (Integer) e.N.get(e.f4450c);
                        if (num != null && num.intValue() > 0) {
                            return 16L;
                        }
                    } else {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
            e6.h hVar2 = this.f7885n;
            if (hVar2 != null && hVar2.h()) {
                c6.q e7 = hVar2.e();
                l.h(e7);
                if ((64 & e7.f4452n) == 0 && e7.F == 0) {
                    Integer num2 = (Integer) e7.N.get(e7.f4450c);
                    if (num2 != null && num2.intValue() < e7.G.size() - 1) {
                        return 32L;
                    }
                } else {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(c6.l lVar) {
        m6.a aVar;
        e6.a aVar2 = this.f7876b.f6296f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f4428a;
        if (list != null && !list.isEmpty()) {
            aVar = (m6.a) lVar.f4428a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f13577b;
    }

    public final void e(Bitmap bitmap, int i10) {
        android.support.v4.media.c cVar;
        String str;
        MediaMetadata metadata;
        b0 b0Var = this.f7887p;
        if (b0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        b0 b0Var2 = this.f7887p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (b0Var2 != null && (metadata = ((android.support.v4.media.session.h) b0Var2.f520b.f14294b).f533a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f490b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            cVar = new android.support.v4.media.c();
        } else {
            cVar = new android.support.v4.media.c(mediaMetadataCompat);
        }
        if (i10 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        cVar.h(str, bitmap);
        b0Var.e(new MediaMetadataCompat(cVar.f494a));
    }

    public final void f(android.support.v4.media.session.e0 r13, java.lang.String r14, e6.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.f(android.support.v4.media.session.e0, java.lang.String, e6.d):void");
    }

    public final void g(boolean z10) {
        if (this.f7876b.h) {
            c0 c0Var = this.f7882k;
            androidx.activity.i iVar = this.f7883l;
            if (iVar != null) {
                c0Var.removeCallbacks(iVar);
            }
            Context context = this.f7875a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    c0Var.postDelayed(iVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        g gVar = this.f7881j;
        if (gVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            u6 u6Var = gVar.f7862i;
            u6Var.C();
            u6Var.e = null;
            NotificationManager notificationManager = gVar.f7858b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f7876b.h) {
            return;
        }
        this.f7882k.removeCallbacks(this.f7883l);
        Context context = this.f7875a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        b0 b0Var;
        c6.l lVar;
        long j3;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        android.support.v4.media.c cVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j10;
        q qVar;
        long j11;
        int i11;
        b0 b0Var2 = this.f7887p;
        if (b0Var2 != null) {
            v vVar = b0Var2.f519a;
            Bundle bundle = new Bundle();
            e0 e0Var = new e0();
            e6.h hVar = this.f7885n;
            e6.f fVar = this.e;
            if (hVar != null && this.f7881j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j10 = 0;
                } else {
                    j10 = hVar.a();
                }
                e0Var.c(i10, j10, 1.0f);
                if (i10 == 0) {
                    b10 = e0Var.b();
                } else {
                    if (fVar != null) {
                        qVar = fVar.V;
                    } else {
                        qVar = null;
                    }
                    e6.h hVar2 = this.f7885n;
                    if (hVar2 == null || hVar2.j() || this.f7885n.n()) {
                        j11 = 0;
                    } else {
                        j11 = 256;
                    }
                    if (qVar != null) {
                        ArrayList a2 = j.a(qVar);
                        if (a2 != null) {
                            int size = a2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = a2.get(i12);
                                i12++;
                                ArrayList arrayList = a2;
                                e6.d dVar = (e6.d) obj;
                                int i13 = size;
                                String str = dVar.f7300a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(e0Var, str, dVar);
                                } else {
                                    j11 = c(str, i10, bundle) | j11;
                                }
                                size = i13;
                                a2 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f7303a;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                i11 = size2;
                                j11 = c(str2, i10, bundle) | j11;
                            } else {
                                i11 = size2;
                                f(e0Var, str2, null);
                            }
                            size2 = i11;
                            arrayList2 = arrayList3;
                        }
                    }
                    e0Var.e = j11;
                    b10 = e0Var.b();
                }
            } else {
                b10 = e0Var.b();
            }
            b0Var2.f(b10);
            if (fVar != null && fVar.W) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (fVar != null && fVar.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                vVar.f541a.setExtras(bundle);
            }
            if (i10 != 0) {
                if (this.f7885n != null) {
                    ComponentName componentName = this.f7878f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f7875a, 0, intent, a0.f5020a | 134217728);
                    }
                    if (activity != null) {
                        vVar.f541a.setSessionActivity(activity);
                    }
                }
                e6.h hVar3 = this.f7885n;
                if (hVar3 != null && (b0Var = this.f7887p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f4429b;
                    if (hVar3.j()) {
                        j3 = 0;
                    } else {
                        j3 = mediaInfo.e;
                    }
                    c6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    c6.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    b0 b0Var3 = this.f7887p;
                    if (b0Var3 == null || (metadata = ((android.support.v4.media.session.h) b0Var3.f520b.f14294b).f533a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f490b = metadata;
                    }
                    if (createFromParcel == null) {
                        cVar = new android.support.v4.media.c();
                    } else {
                        cVar = new android.support.v4.media.c(createFromParcel);
                    }
                    cVar.i(j3);
                    if (string != null) {
                        cVar.j("android.media.metadata.TITLE", string);
                        cVar.j("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        cVar.j("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    b0Var.e(new MediaMetadataCompat(cVar.f494a));
                    Uri d = d(lVar);
                    if (d != null) {
                        this.h.A(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(null, 0);
                    }
                    Uri d10 = d(lVar);
                    if (d10 != null) {
                        this.f7880i.A(d10);
                        return;
                    } else {
                        e(bitmap, 3);
                        return;
                    }
                }
                return;
            }
            b0Var2.e(new MediaMetadataCompat(new Bundle()));
        }
    }
}

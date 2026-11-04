package h6;

import a3.o;
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
import android.support.v4.media.session.a0;
import android.support.v4.media.session.u;
import android.text.TextUtils;
import android.util.Log;
import b8.ke;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.q;
import com.google.android.gms.internal.cast.z;
import e6.l;
import f6.d0;
import gi.v5;
import gi.w5;
import java.util.ArrayList;
import java.util.List;
import p6.m;
public final class h {
    public static final i6.b v = new i6.b("MediaSessionManager", null);
    public final Context f14332a;
    public final f6.b f14333b;
    public final q f14334c;
    public final f6.g d;
    public final g6.f f14335e;
    public final ComponentName f14336f;
    public final ComponentName f14337g;
    public final ke h;
    public final ke f14338i;
    public final f f14339j;
    public final z f14340k;
    public final o f14341l;
    public final d0 f14342m;
    public g6.h f14343n;
    public CastDevice f14344o;
    public a0 f14345p;
    public boolean f14346q;
    public PlaybackStateCompat.CustomAction f14347r;
    public PlaybackStateCompat.CustomAction f14348s;
    public PlaybackStateCompat.CustomAction f14349t;
    public PlaybackStateCompat.CustomAction f14350u;

    public h(Context context, f6.b bVar, q qVar) {
        f6.g gVar;
        g6.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        g6.f fVar2;
        int size;
        this.f14332a = context;
        this.f14333b = bVar;
        this.f14334c = qVar;
        i6.b bVar2 = f6.a.f11442l;
        m.d("Must be called from the main thread.");
        f6.a aVar = f6.a.f11444n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        g6.a aVar2 = bVar.f11459f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.f14335e = fVar;
        this.f14342m = new d0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f11973b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f14336f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f11972a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f14337g = componentName2;
        ke keVar = new ke(context);
        this.h = keVar;
        keVar.f2719f = new w5(this, 1);
        ke keVar2 = new ke(context);
        this.f14338i = keVar2;
        keVar2.f2719f = new v5(this, 2);
        this.f14340k = new z(Looper.getMainLooper(), 0);
        i6.b bVar3 = f.f14312u;
        g6.a aVar3 = bVar.f11459f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            g6.o oVar = fVar2.W;
            if (oVar != null) {
                ArrayList a10 = i.a(oVar);
                int[] b10 = i.b(oVar);
                if (a10 == null) {
                    size = 0;
                } else {
                    size = a10.size();
                }
                if (a10 != null && !a10.isEmpty()) {
                    if (a10.size() > 5) {
                        Log.e(bVar3.f14620a, bVar3.d(g6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i3 : b10) {
                            if (i3 < 0 || i3 >= size) {
                                Log.e(bVar3.f14620a, bVar3.d(g6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f14620a, bVar3.d(g6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f14620a, bVar3.d(g6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f14339j = fVar3;
        this.f14341l = new o(this, 24);
    }

    public final void a(g6.h hVar, CastDevice castDevice) {
        g6.a aVar;
        ComponentName componentName;
        f6.b bVar = this.f14333b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f11459f;
        }
        if (!this.f14346q && bVar != null && aVar != null && this.f14335e != null && hVar != null && castDevice != null && (componentName = this.f14337g) != null) {
            this.f14343n = hVar;
            hVar.p(this.f14342m);
            this.f14344o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.f14332a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (aVar.f11976f) {
                a0 a0Var = new a0(context, "CastMediaSession", componentName, broadcast);
                this.f14345p = a0Var;
                j(0, null);
                CastDevice castDevice2 = this.f14344o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.f14344o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    a0Var.s(new MediaMetadataCompat(bundle));
                }
                a0Var.r(new g(this, 0), null);
                a0Var.q(true);
                this.f14334c.M0(a0Var);
            }
            this.f14346q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: h6.h.b():void");
    }

    public final long c(String str, int i3, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    if (i3 == 3) {
                        j10 = 514;
                        i3 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i3 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                g6.h hVar = this.f14343n;
                if (hVar != null && hVar.h()) {
                    e6.q e10 = hVar.e();
                    m.g(e10);
                    if ((128 & e10.f9757n) == 0 && e10.G == 0) {
                        Integer num = (Integer) e10.O.get(e10.f9754c);
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
            g6.h hVar2 = this.f14343n;
            if (hVar2 != null && hVar2.h()) {
                e6.q e11 = hVar2.e();
                m.g(e11);
                if ((64 & e11.f9757n) == 0 && e11.G == 0) {
                    Integer num2 = (Integer) e11.O.get(e11.f9754c);
                    if (num2 != null && num2.intValue() < e11.H.size() - 1) {
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

    public final Uri d(l lVar) {
        o6.a aVar;
        g6.a aVar2 = this.f14333b.f11459f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f9729a;
        if (list != null && !list.isEmpty()) {
            aVar = (o6.a) lVar.f9729a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f20915b;
    }

    public final void e(Bitmap bitmap, int i3) {
        android.support.v4.media.c cVar;
        String str;
        MediaMetadata metadata;
        a0 a0Var = this.f14345p;
        if (a0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        a0 a0Var2 = this.f14345p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (a0Var2 != null && (metadata = ((android.support.v4.media.session.h) ((p4.q) a0Var2.f1187c).f53181a).f1200a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f1150b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            cVar = new android.support.v4.media.c(0);
        } else {
            cVar = new android.support.v4.media.c(mediaMetadataCompat);
        }
        if (i3 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        cVar.k0(str, bitmap);
        a0Var.s(new MediaMetadataCompat((Bundle) cVar.f1155b));
    }

    public final void f(android.support.v4.media.session.d0 r13, java.lang.String r14, g6.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: h6.h.f(android.support.v4.media.session.d0, java.lang.String, g6.d):void");
    }

    public final void g(boolean z10) {
        if (this.f14333b.h) {
            z zVar = this.f14340k;
            o oVar = this.f14341l;
            if (oVar != null) {
                zVar.removeCallbacks(oVar);
            }
            Context context = this.f14332a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    zVar.postDelayed(oVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f14339j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            ke keVar = fVar.f14319i;
            keVar.N();
            keVar.f2719f = null;
            NotificationManager notificationManager = fVar.f14314b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f14333b.h) {
            return;
        }
        this.f14340k.removeCallbacks(this.f14341l);
        Context context = this.f14332a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i3, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        a0 a0Var;
        l lVar;
        long j10;
        MediaMetadata metadata;
        int i10;
        MediaMetadataCompat createFromParcel;
        android.support.v4.media.c cVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        g6.o oVar;
        long j12;
        int i11;
        a0 a0Var2 = this.f14345p;
        if (a0Var2 != null) {
            u uVar = (u) a0Var2.f1186b;
            Bundle bundle = new Bundle();
            android.support.v4.media.session.d0 d0Var = new android.support.v4.media.session.d0();
            g6.h hVar = this.f14343n;
            g6.f fVar = this.f14335e;
            if (hVar != null && this.f14339j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j11 = 0;
                } else {
                    j11 = hVar.a();
                }
                d0Var.c(i3, j11, 1.0f);
                if (i3 == 0) {
                    b10 = d0Var.b();
                } else {
                    if (fVar != null) {
                        oVar = fVar.W;
                    } else {
                        oVar = null;
                    }
                    g6.h hVar2 = this.f14343n;
                    if (hVar2 == null || hVar2.j() || this.f14343n.n()) {
                        j12 = 0;
                    } else {
                        j12 = 256;
                    }
                    if (oVar != null) {
                        ArrayList a10 = i.a(oVar);
                        if (a10 != null) {
                            int size = a10.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = a10.get(i12);
                                i12++;
                                ArrayList arrayList = a10;
                                g6.d dVar = (g6.d) obj;
                                int i13 = size;
                                String str = dVar.f11991a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(d0Var, str, dVar);
                                } else {
                                    j12 = c(str, i3, bundle) | j12;
                                }
                                size = i13;
                                a10 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f11995a;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                i11 = size2;
                                j12 = c(str2, i3, bundle) | j12;
                            } else {
                                i11 = size2;
                                f(d0Var, str2, null);
                            }
                            size2 = i11;
                            arrayList2 = arrayList3;
                        }
                    }
                    d0Var.f1192e = j12;
                    b10 = d0Var.b();
                }
            } else {
                b10 = d0Var.b();
            }
            a0Var2.t(b10);
            if (fVar != null && fVar.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (fVar != null && fVar.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                uVar.f1216a.setExtras(bundle);
            }
            if (i3 != 0) {
                if (this.f14343n != null) {
                    ComponentName componentName = this.f14336f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f14332a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        uVar.f1216a.setSessionActivity(activity);
                    }
                }
                g6.h hVar3 = this.f14343n;
                if (hVar3 != null && (a0Var = this.f14345p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f9730b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.f6549e;
                    }
                    l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    a0 a0Var3 = this.f14345p;
                    if (a0Var3 == null || (metadata = ((android.support.v4.media.session.h) ((p4.q) a0Var3.f1187c).f53181a).f1200a.getMetadata()) == null) {
                        i10 = 0;
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        i10 = 0;
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f1150b = metadata;
                    }
                    if (createFromParcel == null) {
                        cVar = new android.support.v4.media.c(i10);
                    } else {
                        cVar = new android.support.v4.media.c(createFromParcel);
                    }
                    cVar.l0(j10);
                    if (string != null) {
                        cVar.m0("android.media.metadata.TITLE", string);
                        cVar.m0("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        cVar.m0("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    a0Var.s(new MediaMetadataCompat((Bundle) cVar.f1155b));
                    Uri d = d(lVar);
                    if (d != null) {
                        this.h.M(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(null, 0);
                    }
                    Uri d10 = d(lVar);
                    if (d10 != null) {
                        this.f14338i.M(d10);
                        return;
                    } else {
                        e(bitmap, 3);
                        return;
                    }
                }
                return;
            }
            a0Var2.s(new MediaMetadataCompat(new Bundle()));
        }
    }
}

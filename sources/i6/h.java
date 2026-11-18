package i6;

import a8.r7;
import a8.sa;
import ab.w;
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
import android.support.v4.media.session.d0;
import android.support.v4.media.session.u;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.y;
import f6.l;
import f6.q;
import g6.c0;
import hi.u5;
import hi.w4;
import java.util.ArrayList;
import java.util.List;
import q6.m;
public final class h {
    public static final j6.b v = new j6.b("MediaSessionManager", null);
    public final Context f16151a;
    public final g6.b f16152b;
    public final p f16153c;
    public final g6.g d;
    public final h6.f f16154e;
    public final ComponentName f16155f;
    public final ComponentName f16156g;
    public final r7 h;
    public final r7 f16157i;
    public final f f16158j;
    public final y f16159k;
    public final sa f16160l;
    public final c0 f16161m;
    public h6.h f16162n;
    public CastDevice f16163o;
    public a0 f16164p;
    public boolean f16165q;
    public PlaybackStateCompat.CustomAction f16166r;
    public PlaybackStateCompat.CustomAction f16167s;
    public PlaybackStateCompat.CustomAction f16168t;
    public PlaybackStateCompat.CustomAction f16169u;

    public h(Context context, g6.b bVar, p pVar) {
        g6.g gVar;
        h6.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        h6.f fVar2;
        int size;
        this.f16151a = context;
        this.f16152b = bVar;
        this.f16153c = pVar;
        j6.b bVar2 = g6.a.f13186l;
        m.e("Must be called from the main thread.");
        g6.a aVar = g6.a.f13188n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        h6.a aVar2 = bVar.f13203f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.f16154e = fVar;
        this.f16161m = new c0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f13888b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f16155f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f13887a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f16156g = componentName2;
        r7 r7Var = new r7(context);
        this.h = r7Var;
        r7Var.f620f = new w4(this, 3);
        r7 r7Var2 = new r7(context);
        this.f16157i = r7Var2;
        r7Var2.f620f = new u5(this, 2);
        this.f16159k = new y(Looper.getMainLooper(), 0);
        j6.b bVar3 = f.f16131u;
        h6.a aVar3 = bVar.f13203f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            h6.p pVar2 = fVar2.W;
            if (pVar2 != null) {
                ArrayList a10 = i.a(pVar2);
                int[] b10 = i.b(pVar2);
                if (a10 == null) {
                    size = 0;
                } else {
                    size = a10.size();
                }
                if (a10 != null && !a10.isEmpty()) {
                    if (a10.size() > 5) {
                        Log.e(bVar3.f17244a, bVar3.d(h6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i7 : b10) {
                            if (i7 < 0 || i7 >= size) {
                                Log.e(bVar3.f17244a, bVar3.d(h6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f17244a, bVar3.d(h6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f17244a, bVar3.d(h6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f16158j = fVar3;
        this.f16160l = new sa(this, 29);
    }

    public final void a(h6.h hVar, CastDevice castDevice) {
        h6.a aVar;
        ComponentName componentName;
        g6.b bVar = this.f16152b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f13203f;
        }
        if (!this.f16165q && bVar != null && aVar != null && this.f16154e != null && hVar != null && castDevice != null && (componentName = this.f16156g) != null) {
            this.f16162n = hVar;
            hVar.p(this.f16161m);
            this.f16163o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.f16151a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (aVar.f13891f) {
                a0 a0Var = new a0(context, "CastMediaSession", componentName, broadcast);
                this.f16164p = a0Var;
                j(0, null);
                CastDevice castDevice2 = this.f16163o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.f16163o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    a0Var.t(new MediaMetadataCompat(bundle));
                }
                a0Var.s(new g(this, 0), null);
                a0Var.r(true);
                this.f16153c.m1(a0Var);
            }
            this.f16165q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: i6.h.b():void");
    }

    public final long c(String str, int i7, Bundle bundle) {
        long j3;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    if (i7 == 3) {
                        j3 = 514;
                        i7 = 3;
                    } else {
                        j3 = 512;
                    }
                    if (i7 != 2) {
                        return j3;
                    }
                    return 516L;
                }
            } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                h6.h hVar = this.f16162n;
                if (hVar != null && hVar.h()) {
                    q e10 = hVar.e();
                    m.h(e10);
                    if ((128 & e10.f11448n) == 0 && e10.G == 0) {
                        Integer num = (Integer) e10.O.get(e10.f11445c);
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
            h6.h hVar2 = this.f16162n;
            if (hVar2 != null && hVar2.h()) {
                q e11 = hVar2.e();
                m.h(e11);
                if ((64 & e11.f11448n) == 0 && e11.G == 0) {
                    Integer num2 = (Integer) e11.O.get(e11.f11445c);
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
        p6.a aVar;
        h6.a aVar2 = this.f16152b.f13203f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f11420a;
        if (list != null && !list.isEmpty()) {
            aVar = (p6.a) lVar.f11420a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f55474b;
    }

    public final void e(int i7, Bitmap bitmap) {
        w wVar;
        String str;
        MediaMetadata metadata;
        a0 a0Var = this.f16164p;
        if (a0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        a0 a0Var2 = this.f16164p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (a0Var2 != null && (metadata = ((android.support.v4.media.session.h) ((wf.b) a0Var2.f1705c).f59672b).f1718a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f1670b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            wVar = new w();
        } else {
            wVar = new w(mediaMetadataCompat);
        }
        if (i7 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        wVar.h(str, bitmap);
        a0Var.t(new MediaMetadataCompat(wVar.f1004a));
    }

    public final void f(android.support.v4.media.session.d0 r13, java.lang.String r14, h6.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: i6.h.f(android.support.v4.media.session.d0, java.lang.String, h6.d):void");
    }

    public final void g(boolean z10) {
        if (this.f16152b.h) {
            y yVar = this.f16159k;
            sa saVar = this.f16160l;
            if (saVar != null) {
                yVar.removeCallbacks(saVar);
            }
            Context context = this.f16151a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    yVar.postDelayed(saVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f16158j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            r7 r7Var = fVar.f16138i;
            r7Var.N();
            r7Var.f620f = null;
            NotificationManager notificationManager = fVar.f16133b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f16152b.h) {
            return;
        }
        this.f16159k.removeCallbacks(this.f16160l);
        Context context = this.f16151a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i7, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        a0 a0Var;
        l lVar;
        long j3;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        w wVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j10;
        h6.p pVar;
        long j11;
        int i10;
        a0 a0Var2 = this.f16164p;
        if (a0Var2 != null) {
            u uVar = (u) a0Var2.f1704b;
            Bundle bundle = new Bundle();
            d0 d0Var = new d0();
            h6.h hVar = this.f16162n;
            h6.f fVar = this.f16154e;
            if (hVar != null && this.f16158j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j10 = 0;
                } else {
                    j10 = hVar.a();
                }
                d0Var.c(i7, j10, 1.0f);
                if (i7 == 0) {
                    b10 = d0Var.b();
                } else {
                    if (fVar != null) {
                        pVar = fVar.W;
                    } else {
                        pVar = null;
                    }
                    h6.h hVar2 = this.f16162n;
                    if (hVar2 == null || hVar2.j() || this.f16162n.n()) {
                        j11 = 0;
                    } else {
                        j11 = 256;
                    }
                    if (pVar != null) {
                        ArrayList a10 = i.a(pVar);
                        if (a10 != null) {
                            int size = a10.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = a10.get(i11);
                                i11++;
                                ArrayList arrayList = a10;
                                h6.d dVar = (h6.d) obj;
                                int i12 = size;
                                String str = dVar.f13906a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(d0Var, str, dVar);
                                } else {
                                    j11 = c(str, i7, bundle) | j11;
                                }
                                size = i12;
                                a10 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f13910a;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                i10 = size2;
                                j11 = c(str2, i7, bundle) | j11;
                            } else {
                                i10 = size2;
                                f(d0Var, str2, null);
                            }
                            size2 = i10;
                            arrayList2 = arrayList3;
                        }
                    }
                    d0Var.f1710e = j11;
                    b10 = d0Var.b();
                }
            } else {
                b10 = d0Var.b();
            }
            a0Var2.u(b10);
            if (fVar != null && fVar.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (fVar != null && fVar.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                uVar.f1734a.setExtras(bundle);
            }
            if (i7 != 0) {
                if (this.f16162n != null) {
                    ComponentName componentName = this.f16155f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f16151a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        uVar.f1734a.setSessionActivity(activity);
                    }
                }
                h6.h hVar3 = this.f16162n;
                if (hVar3 != null && (a0Var = this.f16164p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f11421b;
                    if (hVar3.j()) {
                        j3 = 0;
                    } else {
                        j3 = mediaInfo.f6165e;
                    }
                    l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    a0 a0Var3 = this.f16164p;
                    if (a0Var3 == null || (metadata = ((android.support.v4.media.session.h) ((wf.b) a0Var3.f1705c).f59672b).f1718a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f1670b = metadata;
                    }
                    if (createFromParcel == null) {
                        wVar = new w();
                    } else {
                        wVar = new w(createFromParcel);
                    }
                    wVar.i(j3);
                    if (string != null) {
                        wVar.j("android.media.metadata.TITLE", string);
                        wVar.j("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        wVar.j("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    a0Var.t(new MediaMetadataCompat(wVar.f1004a));
                    Uri d = d(lVar);
                    if (d != null) {
                        this.h.M(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(0, null);
                    }
                    Uri d2 = d(lVar);
                    if (d2 != null) {
                        this.f16157i.M(d2);
                        return;
                    } else {
                        e(3, bitmap);
                        return;
                    }
                }
                return;
            }
            a0Var2.t(new MediaMetadataCompat(new Bundle()));
        }
    }
}

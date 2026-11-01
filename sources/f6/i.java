package f6;

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
import com.google.android.gms.internal.cast.q;
import com.google.android.gms.internal.cast.z;
import d6.c0;
import e6.o;
import java.util.ArrayList;
import java.util.List;
import n6.l;
public final class i {
    public static final g6.b v = new g6.b("MediaSessionManager", null);
    public final Context f6943a;
    public final d6.b f6944b;
    public final q f6945c;
    public final d6.g d;
    public final e6.f e;
    public final ComponentName f6946f;
    public final ComponentName f6947g;
    public final bh.d h;
    public final bh.d f6948i;
    public final g f6949j;
    public final z f6950k;
    public final androidx.activity.i f6951l;
    public final c0 f6952m;
    public e6.h f6953n;
    public CastDevice f6954o;
    public a0 f6955p;
    public boolean f6956q;
    public PlaybackStateCompat.CustomAction f6957r;
    public PlaybackStateCompat.CustomAction f6958s;
    public PlaybackStateCompat.CustomAction f6959t;
    public PlaybackStateCompat.CustomAction f6960u;

    public i(Context context, d6.b bVar, q qVar) {
        d6.g gVar;
        e6.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        e6.f fVar2;
        int size;
        this.f6943a = context;
        this.f6944b = bVar;
        this.f6945c = qVar;
        g6.b bVar2 = d6.a.f5740l;
        l.d("Must be called from the main thread.");
        d6.a aVar = d6.a.f5742n;
        g gVar2 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        e6.a aVar2 = bVar.f5755f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.e = fVar;
        this.f6952m = new c0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f6255b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f6946f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f6254a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f6947g = componentName2;
        bh.d dVar = new bh.d(context);
        this.h = dVar;
        dVar.e = new a4.l(this, 15);
        bh.d dVar2 = new bh.d(context);
        this.f6948i = dVar2;
        dVar2.e = new k6.h(this, 23);
        this.f6950k = new z(Looper.getMainLooper(), 0);
        g6.b bVar3 = g.f6924u;
        e6.a aVar3 = bVar.f5755f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            o oVar = fVar2.V;
            if (oVar != null) {
                ArrayList a2 = j.a(oVar);
                int[] b10 = j.b(oVar);
                if (a2 == null) {
                    size = 0;
                } else {
                    size = a2.size();
                }
                if (a2 != null && !a2.isEmpty()) {
                    if (a2.size() > 5) {
                        Log.e(bVar3.f7368a, bVar3.d(e6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i10 : b10) {
                            if (i10 < 0 || i10 >= size) {
                                Log.e(bVar3.f7368a, bVar3.d(e6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f7368a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f7368a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            gVar2 = new g(context);
        }
        this.f6949j = gVar2;
        this.f6951l = new androidx.activity.i(this, 18);
    }

    public final void a(e6.h hVar, CastDevice castDevice) {
        e6.a aVar;
        ComponentName componentName;
        d6.b bVar = this.f6944b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f5755f;
        }
        if (!this.f6956q && bVar != null && aVar != null && this.e != null && hVar != null && castDevice != null && (componentName = this.f6947g) != null) {
            this.f6953n = hVar;
            hVar.p(this.f6952m);
            this.f6954o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.f6943a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (aVar.f6257f) {
                a0 a0Var = new a0(context, "CastMediaSession", componentName, broadcast);
                this.f6955p = a0Var;
                j(0, null);
                CastDevice castDevice2 = this.f6954o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.f6954o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    a0Var.B(new MediaMetadataCompat(bundle));
                }
                a0Var.z(new h(this, 0), null);
                a0Var.x(true);
                this.f6945c.M0(a0Var);
            }
            this.f6956q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.b():void");
    }

    public final long c(String str, int i10, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    if (i10 == 3) {
                        j10 = 514;
                        i10 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i10 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                e6.h hVar = this.f6953n;
                if (hVar != null && hVar.h()) {
                    c6.q e = hVar.e();
                    l.g(e);
                    if ((128 & e.f3925n) == 0 && e.F == 0) {
                        Integer num = (Integer) e.N.get(e.f3923c);
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
            e6.h hVar2 = this.f6953n;
            if (hVar2 != null && hVar2.h()) {
                c6.q e7 = hVar2.e();
                l.g(e7);
                if ((64 & e7.f3925n) == 0 && e7.F == 0) {
                    Integer num2 = (Integer) e7.N.get(e7.f3923c);
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
        e6.a aVar2 = this.f6944b.f5755f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f3901a;
        if (list != null && !list.isEmpty()) {
            aVar = (m6.a) lVar.f3901a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f13017b;
    }

    public final void e(Bitmap bitmap, int i10) {
        a4.l lVar;
        String str;
        MediaMetadata metadata;
        a0 a0Var = this.f6955p;
        if (a0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        a0 a0Var2 = this.f6955p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (a0Var2 != null && (metadata = ((android.support.v4.media.session.h) ((hf.b) a0Var2.f876c).f7658b).f888a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f845b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            lVar = new a4.l(1);
        } else {
            lVar = new a4.l(mediaMetadataCompat);
        }
        if (i10 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        lVar.A(str, bitmap);
        a0Var.B(new MediaMetadataCompat((Bundle) lVar.f279b));
    }

    public final void f(android.support.v4.media.session.d0 r13, java.lang.String r14, e6.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.f(android.support.v4.media.session.d0, java.lang.String, e6.d):void");
    }

    public final void g(boolean z10) {
        if (this.f6944b.h) {
            z zVar = this.f6950k;
            androidx.activity.i iVar = this.f6951l;
            if (iVar != null) {
                zVar.removeCallbacks(iVar);
            }
            Context context = this.f6943a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    zVar.postDelayed(iVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        g gVar = this.f6949j;
        if (gVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            bh.d dVar = gVar.f6930i;
            dVar.N();
            dVar.e = null;
            NotificationManager notificationManager = gVar.f6926b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f6944b.h) {
            return;
        }
        this.f6950k.removeCallbacks(this.f6951l);
        Context context = this.f6943a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        a0 a0Var;
        c6.l lVar;
        long j10;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        a4.l lVar2;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        o oVar;
        long j12;
        int i11;
        a0 a0Var2 = this.f6955p;
        if (a0Var2 != null) {
            u uVar = (u) a0Var2.f875b;
            Bundle bundle = new Bundle();
            d0 d0Var = new d0();
            e6.h hVar = this.f6953n;
            e6.f fVar = this.e;
            if (hVar != null && this.f6949j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j11 = 0;
                } else {
                    j11 = hVar.a();
                }
                d0Var.c(i10, j11, 1.0f);
                if (i10 == 0) {
                    b10 = d0Var.b();
                } else {
                    if (fVar != null) {
                        oVar = fVar.V;
                    } else {
                        oVar = null;
                    }
                    e6.h hVar2 = this.f6953n;
                    if (hVar2 == null || hVar2.j() || this.f6953n.n()) {
                        j12 = 0;
                    } else {
                        j12 = 256;
                    }
                    if (oVar != null) {
                        ArrayList a2 = j.a(oVar);
                        if (a2 != null) {
                            int size = a2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = a2.get(i12);
                                i12++;
                                ArrayList arrayList = a2;
                                e6.d dVar = (e6.d) obj;
                                int i13 = size;
                                String str = dVar.f6271a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(d0Var, str, dVar);
                                } else {
                                    j12 = c(str, i10, bundle) | j12;
                                }
                                size = i13;
                                a2 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f6274a;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                i11 = size2;
                                j12 = c(str2, i10, bundle) | j12;
                            } else {
                                i11 = size2;
                                f(d0Var, str2, null);
                            }
                            size2 = i11;
                            arrayList2 = arrayList3;
                        }
                    }
                    d0Var.e = j12;
                    b10 = d0Var.b();
                }
            } else {
                b10 = d0Var.b();
            }
            a0Var2.C(b10);
            if (fVar != null && fVar.W) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (fVar != null && fVar.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                uVar.f902a.setExtras(bundle);
            }
            if (i10 != 0) {
                if (this.f6953n != null) {
                    ComponentName componentName = this.f6946f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f6943a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        uVar.f902a.setSessionActivity(activity);
                    }
                }
                e6.h hVar3 = this.f6953n;
                if (hVar3 != null && (a0Var = this.f6955p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f3902b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.e;
                    }
                    c6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    c6.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    a0 a0Var3 = this.f6955p;
                    if (a0Var3 == null || (metadata = ((android.support.v4.media.session.h) ((hf.b) a0Var3.f876c).f7658b).f888a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f845b = metadata;
                    }
                    if (createFromParcel == null) {
                        lVar2 = new a4.l(1);
                    } else {
                        lVar2 = new a4.l(createFromParcel);
                    }
                    lVar2.C(j10);
                    if (string != null) {
                        lVar2.D("android.media.metadata.TITLE", string);
                        lVar2.D("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        lVar2.D("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    a0Var.B(new MediaMetadataCompat((Bundle) lVar2.f279b));
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
                        this.f6948i.M(d10);
                        return;
                    } else {
                        e(bitmap, 3);
                        return;
                    }
                }
                return;
            }
            a0Var2.B(new MediaMetadataCompat(new Bundle()));
        }
    }
}

package g6;

import a8.me;
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
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.y;
import d6.q;
import e6.c0;
import java.util.ArrayList;
import java.util.List;
import o6.l;
public final class h {
    public static final h6.b v = new h6.b("MediaSessionManager", null);
    public final Context f12376a;
    public final e6.b f12377b;
    public final p f12378c;
    public final e6.g d;
    public final f6.f e;
    public final ComponentName f12379f;
    public final ComponentName f12380g;
    public final me h;
    public final me f12381i;
    public final f f12382j;
    public final y f12383k;
    public final a5.d f12384l;
    public final c0 f12385m;
    public f6.h f12386n;
    public CastDevice f12387o;
    public b0 f12388p;
    public boolean f12389q;
    public PlaybackStateCompat.CustomAction f12390r;
    public PlaybackStateCompat.CustomAction f12391s;
    public PlaybackStateCompat.CustomAction f12392t;
    public PlaybackStateCompat.CustomAction f12393u;

    public h(Context context, e6.b bVar, p pVar) {
        e6.g gVar;
        f6.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        f6.f fVar2;
        int size;
        this.f12376a = context;
        this.f12377b = bVar;
        this.f12378c = pVar;
        h6.b bVar2 = e6.a.f9779l;
        l.e("Must be called from the main thread.");
        e6.a aVar = e6.a.f9781n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        f6.a aVar2 = bVar.f9794f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.e = fVar;
        this.f12385m = new c0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f10183b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f12379f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f10182a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f12380g = componentName2;
        me meVar = new me(context);
        this.h = meVar;
        meVar.e = new rb.c(this, 23);
        me meVar2 = new me(context);
        this.f12381i = meVar2;
        meVar2.e = new za.c(this, 24);
        this.f12383k = new y(Looper.getMainLooper(), 0);
        h6.b bVar3 = f.f12357u;
        f6.a aVar3 = bVar.f9794f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            f6.p pVar2 = fVar2.V;
            if (pVar2 != null) {
                ArrayList a2 = i.a(pVar2);
                int[] b10 = i.b(pVar2);
                if (a2 == null) {
                    size = 0;
                } else {
                    size = a2.size();
                }
                if (a2 != null && !a2.isEmpty()) {
                    if (a2.size() > 5) {
                        Log.e(bVar3.f12620a, bVar3.d(f6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i10 : b10) {
                            if (i10 < 0 || i10 >= size) {
                                Log.e(bVar3.f12620a, bVar3.d(f6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f12620a, bVar3.d(f6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f12620a, bVar3.d(f6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f12382j = fVar3;
        this.f12384l = new a5.d(this, 23);
    }

    public final void a(f6.h hVar, CastDevice castDevice) {
        f6.a aVar;
        ComponentName componentName;
        e6.b bVar = this.f12377b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f9794f;
        }
        if (!this.f12389q && bVar != null && aVar != null && this.e != null && hVar != null && castDevice != null && (componentName = this.f12380g) != null) {
            this.f12386n = hVar;
            hVar.p(this.f12385m);
            this.f12387o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.f12376a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (aVar.f10185f) {
                b0 b0Var = new b0(context, "CastMediaSession", componentName, broadcast);
                this.f12388p = b0Var;
                j(0, null);
                CastDevice castDevice2 = this.f12387o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.f12387o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    b0Var.e(new MediaMetadataCompat(bundle));
                }
                b0Var.d(new g(this), null);
                b0Var.c(true);
                this.f12378c.K0(b0Var);
            }
            this.f12389q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: g6.h.b():void");
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
                f6.h hVar = this.f12386n;
                if (hVar != null && hVar.h()) {
                    q e = hVar.e();
                    l.h(e);
                    if ((128 & e.f8122n) == 0 && e.F == 0) {
                        Integer num = (Integer) e.N.get(e.f8120c);
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
            f6.h hVar2 = this.f12386n;
            if (hVar2 != null && hVar2.h()) {
                q e10 = hVar2.e();
                l.h(e10);
                if ((64 & e10.f8122n) == 0 && e10.F == 0) {
                    Integer num2 = (Integer) e10.N.get(e10.f8120c);
                    if (num2 != null && num2.intValue() < e10.G.size() - 1) {
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

    public final Uri d(d6.l lVar) {
        n6.a aVar;
        f6.a aVar2 = this.f12377b.f9794f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f8098a;
        if (list != null && !list.isEmpty()) {
            aVar = (n6.a) lVar.f8098a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f18725b;
    }

    public final void e(Bitmap bitmap, int i10) {
        a4.l lVar;
        String str;
        MediaMetadata metadata;
        b0 b0Var = this.f12388p;
        if (b0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        b0 b0Var2 = this.f12388p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (b0Var2 != null && (metadata = ((android.support.v4.media.session.h) b0Var2.f2052b.f18695b).f2065a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f2023b = metadata;
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
        b0Var.e(new MediaMetadataCompat((Bundle) lVar.f279b));
    }

    public final void f(android.support.v4.media.session.e0 r13, java.lang.String r14, f6.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: g6.h.f(android.support.v4.media.session.e0, java.lang.String, f6.d):void");
    }

    public final void g(boolean z10) {
        if (this.f12377b.h) {
            y yVar = this.f12383k;
            a5.d dVar = this.f12384l;
            if (dVar != null) {
                yVar.removeCallbacks(dVar);
            }
            Context context = this.f12376a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    yVar.postDelayed(dVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f12382j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            me meVar = fVar.f12363i;
            meVar.C();
            meVar.e = null;
            NotificationManager notificationManager = fVar.f12359b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f12377b.h) {
            return;
        }
        this.f12383k.removeCallbacks(this.f12384l);
        Context context = this.f12376a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        b0 b0Var;
        d6.l lVar;
        long j10;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        a4.l lVar2;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        f6.p pVar;
        long j12;
        int i11;
        b0 b0Var2 = this.f12388p;
        if (b0Var2 != null) {
            v vVar = b0Var2.f2051a;
            Bundle bundle = new Bundle();
            e0 e0Var = new e0();
            f6.h hVar = this.f12386n;
            f6.f fVar = this.e;
            if (hVar != null && this.f12382j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j11 = 0;
                } else {
                    j11 = hVar.a();
                }
                e0Var.c(i10, j11, 1.0f);
                if (i10 == 0) {
                    b10 = e0Var.b();
                } else {
                    if (fVar != null) {
                        pVar = fVar.V;
                    } else {
                        pVar = null;
                    }
                    f6.h hVar2 = this.f12386n;
                    if (hVar2 == null || hVar2.j() || this.f12386n.n()) {
                        j12 = 0;
                    } else {
                        j12 = 256;
                    }
                    if (pVar != null) {
                        ArrayList a2 = i.a(pVar);
                        if (a2 != null) {
                            int size = a2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = a2.get(i12);
                                i12++;
                                ArrayList arrayList = a2;
                                f6.d dVar = (f6.d) obj;
                                int i13 = size;
                                String str = dVar.f10199a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(e0Var, str, dVar);
                                } else {
                                    j12 = c(str, i10, bundle) | j12;
                                }
                                size = i13;
                                a2 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f10202a;
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
                                f(e0Var, str2, null);
                            }
                            size2 = i11;
                            arrayList2 = arrayList3;
                        }
                    }
                    e0Var.e = j12;
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
                vVar.f2073a.setExtras(bundle);
            }
            if (i10 != 0) {
                if (this.f12386n != null) {
                    ComponentName componentName = this.f12379f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f12376a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        vVar.f2073a.setSessionActivity(activity);
                    }
                }
                f6.h hVar3 = this.f12386n;
                if (hVar3 != null && (b0Var = this.f12388p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f8099b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.e;
                    }
                    d6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    d6.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    b0 b0Var3 = this.f12388p;
                    if (b0Var3 == null || (metadata = ((android.support.v4.media.session.h) b0Var3.f2052b.f18695b).f2065a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f2023b = metadata;
                    }
                    if (createFromParcel == null) {
                        lVar2 = new a4.l(1);
                    } else {
                        lVar2 = new a4.l(createFromParcel);
                    }
                    lVar2.B(j10);
                    if (string != null) {
                        lVar2.F("android.media.metadata.TITLE", string);
                        lVar2.F("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        lVar2.F("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    b0Var.e(new MediaMetadataCompat((Bundle) lVar2.f279b));
                    Uri d = d(lVar);
                    if (d != null) {
                        this.h.B(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(null, 0);
                    }
                    Uri d10 = d(lVar);
                    if (d10 != null) {
                        this.f12381i.B(d10);
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

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
import android.support.v4.media.session.b0;
import android.support.v4.media.session.e0;
import android.support.v4.media.session.v;
import android.text.TextUtils;
import android.util.Log;
import c6.q;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.r;
import com.google.android.gms.internal.cast.z5;
import d6.c0;
import e6.p;
import java.util.ArrayList;
import java.util.List;
import n6.l;
public final class h {
    public static final g6.b v = new g6.b("MediaSessionManager", null);
    public final Context f9042a;
    public final d6.b f9043b;
    public final r f9044c;
    public final d6.g d;
    public final e6.f e;
    public final ComponentName f9045f;
    public final ComponentName f9046g;
    public final z5 h;
    public final z5 f9047i;
    public final f f9048j;
    public final a0 f9049k;
    public final androidx.activity.i f9050l;
    public final c0 f9051m;
    public e6.h f9052n;
    public CastDevice f9053o;
    public b0 f9054p;
    public boolean f9055q;
    public PlaybackStateCompat.CustomAction f9056r;
    public PlaybackStateCompat.CustomAction f9057s;
    public PlaybackStateCompat.CustomAction f9058t;
    public PlaybackStateCompat.CustomAction f9059u;

    public h(Context context, d6.b bVar, r rVar) {
        d6.g gVar;
        e6.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        e6.f fVar2;
        int size;
        this.f9042a = context;
        this.f9043b = bVar;
        this.f9044c = rVar;
        g6.b bVar2 = d6.a.f6370l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.f6372n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        e6.a aVar2 = bVar.f6385f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.e = fVar;
        this.f9051m = new c0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f8459b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f9045f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f8458a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f9046g = componentName2;
        z5 z5Var = new z5(context);
        this.h = z5Var;
        z5Var.e = new ya.c(this, 18);
        z5 z5Var2 = new z5(context);
        this.f9047i = z5Var2;
        z5Var2.e = new a6.i(this, 18);
        this.f9049k = new a0(Looper.getMainLooper(), 0);
        g6.b bVar3 = f.f9023u;
        e6.a aVar3 = bVar.f6385f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            p pVar = fVar2.V;
            if (pVar != null) {
                ArrayList a2 = i.a(pVar);
                int[] b10 = i.b(pVar);
                if (a2 == null) {
                    size = 0;
                } else {
                    size = a2.size();
                }
                if (a2 != null && !a2.isEmpty()) {
                    if (a2.size() > 5) {
                        Log.e(bVar3.f9934a, bVar3.d(e6.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i10 : b10) {
                            if (i10 < 0 || i10 >= size) {
                                Log.e(bVar3.f9934a, bVar3.d(e6.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f9934a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f9934a, bVar3.d(e6.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f9048j = fVar3;
        this.f9050l = new androidx.activity.i(this, 19);
    }

    public final void a(e6.h hVar, CastDevice castDevice) {
        e6.a aVar;
        ComponentName componentName;
        d6.b bVar = this.f9043b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f6385f;
        }
        if (!this.f9055q && bVar != null && aVar != null && this.e != null && hVar != null && castDevice != null && (componentName = this.f9046g) != null) {
            this.f9052n = hVar;
            hVar.p(this.f9051m);
            this.f9053o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.f9042a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (aVar.f8461f) {
                b0 b0Var = new b0(context, "CastMediaSession", componentName, broadcast);
                this.f9054p = b0Var;
                j(0, null);
                CastDevice castDevice2 = this.f9053o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.f9053o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    b0Var.e(new MediaMetadataCompat(bundle));
                }
                b0Var.d(new g(this), null);
                b0Var.c(true);
                this.f9044c.K0(b0Var);
            }
            this.f9055q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: f6.h.b():void");
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
                e6.h hVar = this.f9052n;
                if (hVar != null && hVar.h()) {
                    q e = hVar.e();
                    l.h(e);
                    if ((128 & e.f4523n) == 0 && e.F == 0) {
                        Integer num = (Integer) e.N.get(e.f4521c);
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
            e6.h hVar2 = this.f9052n;
            if (hVar2 != null && hVar2.h()) {
                q e7 = hVar2.e();
                l.h(e7);
                if ((64 & e7.f4523n) == 0 && e7.F == 0) {
                    Integer num2 = (Integer) e7.N.get(e7.f4521c);
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
        e6.a aVar2 = this.f9043b.f6385f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f4499a;
        if (list != null && !list.isEmpty()) {
            aVar = (m6.a) lVar.f4499a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f15701b;
    }

    public final void e(Bitmap bitmap, int i10) {
        android.support.v4.media.c cVar;
        String str;
        MediaMetadata metadata;
        b0 b0Var = this.f9054p;
        if (b0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        b0 b0Var2 = this.f9054p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (b0Var2 != null && (metadata = ((android.support.v4.media.session.h) b0Var2.f978b.f43355b).f991a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f948b = metadata;
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
        cVar.b(str, bitmap);
        b0Var.e(new MediaMetadataCompat(cVar.f952a));
    }

    public final void f(android.support.v4.media.session.e0 r13, java.lang.String r14, e6.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: f6.h.f(android.support.v4.media.session.e0, java.lang.String, e6.d):void");
    }

    public final void g(boolean z10) {
        if (this.f9043b.h) {
            a0 a0Var = this.f9049k;
            androidx.activity.i iVar = this.f9050l;
            if (iVar != null) {
                a0Var.removeCallbacks(iVar);
            }
            Context context = this.f9042a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    a0Var.postDelayed(iVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f9048j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            z5 z5Var = fVar.f9029i;
            z5Var.B();
            z5Var.e = null;
            NotificationManager notificationManager = fVar.f9025b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f9043b.h) {
            return;
        }
        this.f9049k.removeCallbacks(this.f9050l);
        Context context = this.f9042a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        b0 b0Var;
        c6.l lVar;
        long j10;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        android.support.v4.media.c cVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        p pVar;
        long j12;
        int i11;
        b0 b0Var2 = this.f9054p;
        if (b0Var2 != null) {
            v vVar = b0Var2.f977a;
            Bundle bundle = new Bundle();
            e0 e0Var = new e0();
            e6.h hVar = this.f9052n;
            e6.f fVar = this.e;
            if (hVar != null && this.f9048j != null) {
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
                    e6.h hVar2 = this.f9052n;
                    if (hVar2 == null || hVar2.j() || this.f9052n.n()) {
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
                                e6.d dVar = (e6.d) obj;
                                int i13 = size;
                                String str = dVar.f8475a;
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
                        ArrayList arrayList2 = fVar.f8478a;
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
                vVar.f999a.setExtras(bundle);
            }
            if (i10 != 0) {
                if (this.f9052n != null) {
                    ComponentName componentName = this.f9045f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f9042a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        vVar.f999a.setSessionActivity(activity);
                    }
                }
                e6.h hVar3 = this.f9052n;
                if (hVar3 != null && (b0Var = this.f9054p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f4500b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.e;
                    }
                    c6.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    c6.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    b0 b0Var3 = this.f9054p;
                    if (b0Var3 == null || (metadata = ((android.support.v4.media.session.h) b0Var3.f978b.f43355b).f991a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f948b = metadata;
                    }
                    if (createFromParcel == null) {
                        cVar = new android.support.v4.media.c();
                    } else {
                        cVar = new android.support.v4.media.c(createFromParcel);
                    }
                    cVar.c(j10);
                    if (string != null) {
                        cVar.d("android.media.metadata.TITLE", string);
                        cVar.d("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        cVar.d("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    b0Var.e(new MediaMetadataCompat(cVar.f952a));
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
                        this.f9047i.A(d10);
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

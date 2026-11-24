package defpackage;

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
import android.support.v4.media.session.a;
import android.support.v4.media.session.f;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import java.util.ArrayList;
public final class kgf {
    public static final dc6 v = new dc6("MediaSessionManager", null);
    public final Context a;
    public final dd1 b;
    public final ocd c;
    public final j6a d;
    public final ql7 e;
    public final ComponentName f;
    public final ComponentName g;
    public final gl2 h;
    public final gl2 i;
    public final c5f j;
    public final o59 k;
    public final bod l;
    public final cbf m;
    public i69 n;
    public CastDevice o;
    public mv6 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public kgf(Context context, dd1 dd1Var, ocd ocdVar) {
        j6a j6aVar;
        ql7 ql7Var;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        ql7 ql7Var2;
        int size;
        this.a = context;
        this.b = dd1Var;
        this.c = ocdVar;
        dc6 dc6Var = ad1.l;
        fre.e("Must be called from the main thread.");
        ad1 ad1Var = ad1.n;
        c5f c5fVar = null;
        if (ad1Var != null) {
            j6aVar = ad1Var.b();
        } else {
            j6aVar = null;
        }
        this.d = j6aVar;
        bd1 bd1Var = dd1Var.f;
        if (bd1Var == null) {
            ql7Var = null;
        } else {
            ql7Var = bd1Var.d;
        }
        this.e = ql7Var;
        this.m = new cbf(this, (byte) 2);
        if (bd1Var == null) {
            str = null;
        } else {
            str = bd1Var.b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f = componentName;
        if (bd1Var == null) {
            str2 = null;
        } else {
            str2 = bd1Var.a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.g = componentName2;
        gl2 gl2Var = new gl2(context);
        this.h = gl2Var;
        gl2Var.f = new sld(this);
        gl2 gl2Var2 = new gl2(context);
        this.i = gl2Var2;
        gl2Var2.f = new xdd(this);
        this.k = new o59(Looper.getMainLooper(), (byte) 3);
        dc6 dc6Var2 = c5f.u;
        bd1 bd1Var2 = dd1Var.f;
        if (bd1Var2 != null && (ql7Var2 = bd1Var2.d) != null) {
            etd etdVar = ql7Var2.W;
            if (etdVar != null) {
                ArrayList a = xgf.a(etdVar);
                int[] b = xgf.b(etdVar);
                if (a == null) {
                    size = 0;
                } else {
                    size = a.size();
                }
                if (a != null && !a.isEmpty()) {
                    if (a.size() > 5) {
                        Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b != null && (r1 = b.length) != 0) {
                        for (int i : b) {
                            if (i < 0 || i >= size) {
                                Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(dc6Var2.a, dc6Var2.d(xj7.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            c5fVar = new c5f(context);
        }
        this.j = c5fVar;
        this.l = new bod(this, (byte) 4);
    }

    public final void a(i69 i69Var, CastDevice castDevice) {
        bd1 bd1Var;
        ComponentName componentName;
        dd1 dd1Var = this.b;
        if (dd1Var == null) {
            bd1Var = null;
        } else {
            bd1Var = dd1Var.f;
        }
        if (!this.q && dd1Var != null && bd1Var != null && this.e != null && i69Var != null && castDevice != null && (componentName = this.g) != null) {
            this.n = i69Var;
            i69Var.p(this.m);
            this.o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (bd1Var.f) {
                mv6 mv6Var = new mv6(context, "CastMediaSession", componentName, broadcast);
                this.p = mv6Var;
                j(0, null);
                CastDevice castDevice2 = this.o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.o.d);
                    ps psVar = MediaMetadataCompat.d;
                    if (psVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) psVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        w26.j("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                        return;
                    } else {
                        bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                        mv6Var.m0(new MediaMetadataCompat(bundle));
                    }
                }
                mv6Var.k0(new eh7(this, (byte) 1), null);
                mv6Var.i0(true);
                this.c.T(mv6Var);
            }
            this.q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgf.b():void");
    }

    public final long c(String str, int i, Bundle bundle) {
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    int i2 = 3;
                    if (i == 3) {
                        j = 514;
                    } else {
                        i2 = i;
                        j = 512;
                    }
                    if (i2 != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                i69 i69Var = this.n;
                if (i69Var != null && i69Var.h()) {
                    fy6 e = i69Var.e();
                    fre.h(e);
                    if ((e.n & 128) == 0 && e.G == 0) {
                        Integer num = (Integer) e.O.get(e.c);
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
            i69 i69Var2 = this.n;
            if (i69Var2 != null && i69Var2.h()) {
                fy6 e2 = i69Var2.e();
                fre.h(e2);
                if ((e2.n & 64) == 0 && e2.G == 0) {
                    Integer num2 = (Integer) e2.O.get(e2.c);
                    if (num2 != null && num2.intValue() < e2.H.size() - 1) {
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

    public final Uri d(ir6 ir6Var) {
        vsc vscVar;
        bd1 bd1Var = this.b.f;
        if (bd1Var != null) {
            bd1Var.b();
        }
        ArrayList arrayList = ir6Var.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            vscVar = (vsc) ir6Var.a.get(0);
        } else {
            vscVar = null;
        }
        if (vscVar == null) {
            return null;
        }
        return vscVar.b;
    }

    public final void e(int i, Bitmap bitmap) {
        pj4 pj4Var;
        String str;
        MediaMetadata metadata;
        mv6 mv6Var = this.p;
        if (mv6Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        mv6 mv6Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (mv6Var2 != null && (metadata = ((a) ((wk4) mv6Var2.c).b).a.getMetadata()) != null) {
            ps psVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            pj4Var = new pj4((byte) 15);
        } else {
            pj4Var = new pj4(mediaMetadataCompat);
        }
        if (i == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        pj4Var.W(str, bitmap);
        mv6Var.m0(new MediaMetadataCompat((Bundle) pj4Var.b));
    }

    public final void f(android.support.v4.media.session.f r12, java.lang.String r13, defpackage.wj7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgf.f(android.support.v4.media.session.f, java.lang.String, wj7):void");
    }

    public final void g(boolean z) {
        if (this.b.h) {
            o59 o59Var = this.k;
            bod bodVar = this.l;
            if (bodVar != null) {
                o59Var.removeCallbacks(bodVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    o59Var.postDelayed(bodVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        c5f c5fVar = this.j;
        if (c5fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            gl2 gl2Var = c5fVar.i;
            gl2Var.R();
            gl2Var.f = null;
            NotificationManager notificationManager = c5fVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.b.h) {
            return;
        }
        this.k.removeCallbacks(this.l);
        Context context = this.a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat b;
        mv6 mv6Var;
        ir6 ir6Var;
        long j;
        MediaMetadataCompat mediaMetadataCompat;
        pj4 pj4Var;
        Bitmap bitmap;
        MediaMetadata metadata;
        PendingIntent activity;
        long j2;
        etd etdVar;
        long j3;
        int i2;
        mv6 mv6Var2 = this.p;
        if (mv6Var2 != null) {
            zu6 zu6Var = (zu6) mv6Var2.b;
            Bundle bundle = new Bundle();
            f fVar = new f();
            i69 i69Var = this.n;
            ql7 ql7Var = this.e;
            if (i69Var != null && this.j != null) {
                if (i69Var.s() != 0 && !i69Var.j()) {
                    j2 = i69Var.a();
                } else {
                    j2 = 0;
                }
                fVar.c(i, j2, 1.0f);
                if (i == 0) {
                    b = fVar.b();
                } else {
                    if (ql7Var != null) {
                        etdVar = ql7Var.W;
                    } else {
                        etdVar = null;
                    }
                    i69 i69Var2 = this.n;
                    if (i69Var2 != null && !i69Var2.j() && !this.n.n()) {
                        j3 = 256;
                    } else {
                        j3 = 0;
                    }
                    if (etdVar != null) {
                        ArrayList a = xgf.a(etdVar);
                        if (a != null) {
                            int size = a.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = a.get(i3);
                                i3++;
                                ArrayList arrayList = a;
                                wj7 wj7Var = (wj7) obj;
                                int i4 = size;
                                String str = wj7Var.a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(fVar, str, wj7Var);
                                } else {
                                    j3 |= c(str, i, bundle);
                                }
                                size = i4;
                                a = arrayList;
                            }
                        }
                    } else if (ql7Var != null) {
                        ArrayList arrayList2 = ql7Var.a;
                        int size2 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList2.get(i5);
                            i5++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (!TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                i2 = size2;
                                f(fVar, str2, null);
                            } else {
                                i2 = size2;
                                j3 |= c(str2, i, bundle);
                            }
                            size2 = i2;
                            arrayList2 = arrayList3;
                        }
                    }
                    fVar.e = j3;
                    b = fVar.b();
                }
            } else {
                b = fVar.b();
            }
            mv6Var2.n0(b);
            if (ql7Var != null && ql7Var.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (ql7Var != null && ql7Var.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                zu6Var.a.setExtras(bundle);
            }
            if (i != 0) {
                if (this.n != null) {
                    ComponentName componentName = this.f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        zu6Var.a.setSessionActivity(activity);
                    }
                }
                i69 i69Var3 = this.n;
                if (i69Var3 != null && (mv6Var = this.p) != null && mediaInfo != null && (ir6Var = mediaInfo.d) != null) {
                    Bundle bundle2 = ir6Var.b;
                    if (i69Var3.j()) {
                        j = 0;
                    } else {
                        j = mediaInfo.e;
                    }
                    ir6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    ir6.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    mv6 mv6Var3 = this.p;
                    if (mv6Var3 != null && (metadata = ((a) ((wk4) mv6Var3.c).b).a.getMetadata()) != null) {
                        ps psVar = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        mediaMetadataCompat.b = metadata;
                    } else {
                        mediaMetadataCompat = null;
                    }
                    if (mediaMetadataCompat == null) {
                        pj4Var = new pj4((byte) 15);
                    } else {
                        pj4Var = new pj4(mediaMetadataCompat);
                    }
                    pj4Var.X(j);
                    if (string != null) {
                        pj4Var.Y("android.media.metadata.TITLE", string);
                        pj4Var.Y("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        pj4Var.Y("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    mv6Var.m0(new MediaMetadataCompat((Bundle) pj4Var.b));
                    Uri d = d(ir6Var);
                    if (d != null) {
                        this.h.Q(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(0, null);
                    }
                    Uri d2 = d(ir6Var);
                    if (d2 != null) {
                        this.i.Q(d2);
                        return;
                    } else {
                        e(3, bitmap);
                        return;
                    }
                }
                return;
            }
            mv6Var2.m0(new MediaMetadataCompat(new Bundle()));
        }
    }
}

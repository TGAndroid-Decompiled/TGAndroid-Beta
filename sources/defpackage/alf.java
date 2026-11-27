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
public final class alf {
    public static final he6 v = new he6("MediaSessionManager", null);
    public final Context a;
    public final ld1 b;
    public final hhd c;
    public final baa d;
    public final po7 e;
    public final ComponentName f;
    public final ComponentName g;
    public final am2 h;
    public final am2 i;
    public final t9f j;
    public final b99 k;
    public final dhe l;
    public final sff m;
    public v99 n;
    public CastDevice o;
    public rx6 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public alf(Context context, ld1 ld1Var, hhd hhdVar) {
        baa baaVar;
        po7 po7Var;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        po7 po7Var2;
        int size;
        this.a = context;
        this.b = ld1Var;
        this.c = hhdVar;
        he6 he6Var = id1.l;
        xve.e("Must be called from the main thread.");
        id1 id1Var = id1.n;
        t9f t9fVar = null;
        if (id1Var != null) {
            baaVar = id1Var.b();
        } else {
            baaVar = null;
        }
        this.d = baaVar;
        jd1 jd1Var = ld1Var.f;
        if (jd1Var == null) {
            po7Var = null;
        } else {
            po7Var = jd1Var.d;
        }
        this.e = po7Var;
        this.m = new sff(this, (byte) 2);
        if (jd1Var == null) {
            str = null;
        } else {
            str = jd1Var.b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f = componentName;
        if (jd1Var == null) {
            str2 = null;
        } else {
            str2 = jd1Var.a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.g = componentName2;
        am2 am2Var = new am2(context);
        this.h = am2Var;
        am2Var.f = new xae(this);
        am2 am2Var2 = new am2(context);
        this.i = am2Var2;
        am2Var2.f = new oqd(this);
        this.k = new b99(Looper.getMainLooper(), (byte) 3);
        he6 he6Var2 = t9f.u;
        jd1 jd1Var2 = ld1Var.f;
        if (jd1Var2 != null && (po7Var2 = jd1Var2.d) != null) {
            uxd uxdVar = po7Var2.W;
            if (uxdVar != null) {
                ArrayList a = nlf.a(uxdVar);
                int[] b = nlf.b(uxdVar);
                if (a == null) {
                    size = 0;
                } else {
                    size = a.size();
                }
                if (a != null && !a.isEmpty()) {
                    if (a.size() > 5) {
                        Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b != null && (r1 = b.length) != 0) {
                        for (int i : b) {
                            if (i < 0 || i >= size) {
                                Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(he6Var2.a, he6Var2.d(wm7.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            t9fVar = new t9f(context);
        }
        this.j = t9fVar;
        this.l = new dhe(this, (byte) 3);
    }

    public final void a(v99 v99Var, CastDevice castDevice) {
        jd1 jd1Var;
        ComponentName componentName;
        ld1 ld1Var = this.b;
        if (ld1Var == null) {
            jd1Var = null;
        } else {
            jd1Var = ld1Var.f;
        }
        if (!this.q && ld1Var != null && jd1Var != null && this.e != null && v99Var != null && castDevice != null && (componentName = this.g) != null) {
            this.n = v99Var;
            v99Var.p(this.m);
            this.o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (jd1Var.f) {
                rx6 rx6Var = new rx6(context, "CastMediaSession", componentName, broadcast);
                this.p = rx6Var;
                j(0, null);
                CastDevice castDevice2 = this.o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.o.d);
                    qs qsVar = MediaMetadataCompat.d;
                    if (qsVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) qsVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        lq5.j("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                        return;
                    } else {
                        bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                        rx6Var.r0(new MediaMetadataCompat(bundle));
                    }
                }
                rx6Var.p0(new oj7(this, (byte) 1), null);
                rx6Var.n0(true);
                this.c.T(rx6Var);
            }
            this.q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alf.b():void");
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
                v99 v99Var = this.n;
                if (v99Var != null && v99Var.h()) {
                    j07 e = v99Var.e();
                    xve.h(e);
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
            v99 v99Var2 = this.n;
            if (v99Var2 != null && v99Var2.h()) {
                j07 e2 = v99Var2.e();
                xve.h(e2);
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

    public final Uri d(mt6 mt6Var) {
        kxc kxcVar;
        jd1 jd1Var = this.b.f;
        if (jd1Var != null) {
            jd1Var.b();
        }
        ArrayList arrayList = mt6Var.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            kxcVar = (kxc) mt6Var.a.get(0);
        } else {
            kxcVar = null;
        }
        if (kxcVar == null) {
            return null;
        }
        return kxcVar.b;
    }

    public final void e(int i, Bitmap bitmap) {
        v34 v34Var;
        String str;
        MediaMetadata metadata;
        rx6 rx6Var = this.p;
        if (rx6Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        rx6 rx6Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (rx6Var2 != null && (metadata = ((a) ((um4) rx6Var2.c).b).a.getMetadata()) != null) {
            qs qsVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            v34Var = new v34((byte) 16);
        } else {
            v34Var = new v34(mediaMetadataCompat);
        }
        if (i == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        v34Var.Q(str, bitmap);
        rx6Var.r0(new MediaMetadataCompat((Bundle) v34Var.b));
    }

    public final void f(android.support.v4.media.session.f r12, java.lang.String r13, defpackage.vm7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alf.f(android.support.v4.media.session.f, java.lang.String, vm7):void");
    }

    public final void g(boolean z) {
        if (this.b.h) {
            b99 b99Var = this.k;
            dhe dheVar = this.l;
            if (dheVar != null) {
                b99Var.removeCallbacks(dheVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    b99Var.postDelayed(dheVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        t9f t9fVar = this.j;
        if (t9fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            am2 am2Var = t9fVar.i;
            am2Var.Q();
            am2Var.f = null;
            NotificationManager notificationManager = t9fVar.b;
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
        rx6 rx6Var;
        mt6 mt6Var;
        long j;
        MediaMetadataCompat mediaMetadataCompat;
        v34 v34Var;
        Bitmap bitmap;
        MediaMetadata metadata;
        PendingIntent activity;
        long j2;
        uxd uxdVar;
        long j3;
        int i2;
        rx6 rx6Var2 = this.p;
        if (rx6Var2 != null) {
            ex6 ex6Var = (ex6) rx6Var2.b;
            Bundle bundle = new Bundle();
            f fVar = new f();
            v99 v99Var = this.n;
            po7 po7Var = this.e;
            if (v99Var != null && this.j != null) {
                if (v99Var.s() != 0 && !v99Var.j()) {
                    j2 = v99Var.a();
                } else {
                    j2 = 0;
                }
                fVar.c(i, j2, 1.0f);
                if (i == 0) {
                    b = fVar.b();
                } else {
                    if (po7Var != null) {
                        uxdVar = po7Var.W;
                    } else {
                        uxdVar = null;
                    }
                    v99 v99Var2 = this.n;
                    if (v99Var2 != null && !v99Var2.j() && !this.n.n()) {
                        j3 = 256;
                    } else {
                        j3 = 0;
                    }
                    if (uxdVar != null) {
                        ArrayList a = nlf.a(uxdVar);
                        if (a != null) {
                            int size = a.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = a.get(i3);
                                i3++;
                                ArrayList arrayList = a;
                                vm7 vm7Var = (vm7) obj;
                                int i4 = size;
                                String str = vm7Var.a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(fVar, str, vm7Var);
                                } else {
                                    j3 |= c(str, i, bundle);
                                }
                                size = i4;
                                a = arrayList;
                            }
                        }
                    } else if (po7Var != null) {
                        ArrayList arrayList2 = po7Var.a;
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
            rx6Var2.s0(b);
            if (po7Var != null && po7Var.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (po7Var != null && po7Var.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                ex6Var.a.setExtras(bundle);
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
                        ex6Var.a.setSessionActivity(activity);
                    }
                }
                v99 v99Var3 = this.n;
                if (v99Var3 != null && (rx6Var = this.p) != null && mediaInfo != null && (mt6Var = mediaInfo.d) != null) {
                    Bundle bundle2 = mt6Var.b;
                    if (v99Var3.j()) {
                        j = 0;
                    } else {
                        j = mediaInfo.e;
                    }
                    mt6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    mt6.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    rx6 rx6Var3 = this.p;
                    if (rx6Var3 != null && (metadata = ((a) ((um4) rx6Var3.c).b).a.getMetadata()) != null) {
                        qs qsVar = MediaMetadataCompat.d;
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
                        v34Var = new v34((byte) 16);
                    } else {
                        v34Var = new v34(mediaMetadataCompat);
                    }
                    v34Var.R(j);
                    if (string != null) {
                        v34Var.S("android.media.metadata.TITLE", string);
                        v34Var.S("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        v34Var.S("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    rx6Var.r0(new MediaMetadataCompat((Bundle) v34Var.b));
                    Uri d = d(mt6Var);
                    if (d != null) {
                        this.h.P(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(0, null);
                    }
                    Uri d2 = d(mt6Var);
                    if (d2 != null) {
                        this.i.P(d2);
                        return;
                    } else {
                        e(3, bitmap);
                        return;
                    }
                }
                return;
            }
            rx6Var2.r0(new MediaMetadataCompat(new Bundle()));
        }
    }
}

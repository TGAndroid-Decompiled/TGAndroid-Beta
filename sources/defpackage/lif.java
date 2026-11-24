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
public final class lif {
    public static final ce6 v = new ce6("MediaSessionManager", null);
    public final Context a;
    public final le1 b;
    public final qed c;
    public final l8a d;
    public final tn7 e;
    public final ComponentName f;
    public final ComponentName g;
    public final sm2 h;
    public final sm2 i;
    public final e7f j;
    public final q79 k;
    public final eqd l;
    public final ddf m;
    public k89 n;
    public CastDevice o;
    public mx6 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public lif(Context context, le1 le1Var, qed qedVar) {
        l8a l8aVar;
        tn7 tn7Var;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        tn7 tn7Var2;
        int size;
        this.a = context;
        this.b = le1Var;
        this.c = qedVar;
        ce6 ce6Var = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        e7f e7fVar = null;
        if (ie1Var != null) {
            l8aVar = ie1Var.b();
        } else {
            l8aVar = null;
        }
        this.d = l8aVar;
        je1 je1Var = le1Var.f;
        if (je1Var == null) {
            tn7Var = null;
        } else {
            tn7Var = je1Var.d;
        }
        this.e = tn7Var;
        this.m = new ddf(this, (byte) 2);
        if (je1Var == null) {
            str = null;
        } else {
            str = je1Var.b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f = componentName;
        if (je1Var == null) {
            str2 = null;
        } else {
            str2 = je1Var.a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.g = componentName2;
        sm2 sm2Var = new sm2(context);
        this.h = sm2Var;
        sm2Var.f = new und(this);
        sm2 sm2Var2 = new sm2(context);
        this.i = sm2Var2;
        ?? obj = new Object();
        obj.a = this;
        sm2Var2.f = obj;
        this.k = new q79(Looper.getMainLooper(), (byte) 3);
        ce6 ce6Var2 = e7f.u;
        je1 je1Var2 = le1Var.f;
        if (je1Var2 != null && (tn7Var2 = je1Var2.d) != null) {
            hvd hvdVar = tn7Var2.W;
            if (hvdVar != null) {
                ArrayList a = yif.a(hvdVar);
                int[] b = yif.b(hvdVar);
                if (a == null) {
                    size = 0;
                } else {
                    size = a.size();
                }
                if (a != null && !a.isEmpty()) {
                    if (a.size() > 5) {
                        Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b != null && (r1 = b.length) != 0) {
                        for (int i : b) {
                            if (i < 0 || i >= size) {
                                Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(ce6Var2.a, ce6Var2.d(am7.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            e7fVar = new e7f(context);
        }
        this.j = e7fVar;
        this.l = new eqd(this, (byte) 4);
    }

    public final void a(k89 k89Var, CastDevice castDevice) {
        je1 je1Var;
        ComponentName componentName;
        le1 le1Var = this.b;
        if (le1Var == null) {
            je1Var = null;
        } else {
            je1Var = le1Var.f;
        }
        if (!this.q && le1Var != null && je1Var != null && this.e != null && k89Var != null && castDevice != null && (componentName = this.g) != null) {
            this.n = k89Var;
            k89Var.p(this.m);
            this.o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (je1Var.f) {
                mx6 mx6Var = new mx6(context, "CastMediaSession", componentName, broadcast);
                this.p = mx6Var;
                j(0, null);
                CastDevice castDevice2 = this.o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131689513, this.o.d);
                    qt qtVar = MediaMetadataCompat.d;
                    if (qtVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) qtVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        u36.j("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                        return;
                    } else {
                        bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                        mx6Var.q0(new MediaMetadataCompat(bundle));
                    }
                }
                mx6Var.o0(new hj7(this, (byte) 1), null);
                mx6Var.l0(true);
                this.c.T(mx6Var);
            }
            this.q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lif.b():void");
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
                k89 k89Var = this.n;
                if (k89Var != null && k89Var.h()) {
                    f07 e = k89Var.e();
                    ite.h(e);
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
            k89 k89Var2 = this.n;
            if (k89Var2 != null && k89Var2.h()) {
                f07 e2 = k89Var2.e();
                ite.h(e2);
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

    public final Uri d(it6 it6Var) {
        wuc wucVar;
        je1 je1Var = this.b.f;
        if (je1Var != null) {
            je1Var.b();
        }
        ArrayList arrayList = it6Var.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            wucVar = (wuc) it6Var.a.get(0);
        } else {
            wucVar = null;
        }
        if (wucVar == null) {
            return null;
        }
        return wucVar.b;
    }

    public final void e(int i, Bitmap bitmap) {
        k44 k44Var;
        String str;
        MediaMetadata metadata;
        mx6 mx6Var = this.p;
        if (mx6Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        mx6 mx6Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (mx6Var2 != null && (metadata = ((a) ((wm4) mx6Var2.c).b).a.getMetadata()) != null) {
            qt qtVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            k44Var = new k44((byte) 17);
        } else {
            k44Var = new k44(mediaMetadataCompat);
        }
        if (i == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        k44Var.Q(str, bitmap);
        mx6Var.q0(new MediaMetadataCompat((Bundle) k44Var.b));
    }

    public final void f(android.support.v4.media.session.f r12, java.lang.String r13, defpackage.zl7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lif.f(android.support.v4.media.session.f, java.lang.String, zl7):void");
    }

    public final void g(boolean z) {
        if (this.b.h) {
            q79 q79Var = this.k;
            eqd eqdVar = this.l;
            if (eqdVar != null) {
                q79Var.removeCallbacks(eqdVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    q79Var.postDelayed(eqdVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        e7f e7fVar = this.j;
        if (e7fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            sm2 sm2Var = e7fVar.i;
            sm2Var.Q();
            sm2Var.f = null;
            NotificationManager notificationManager = e7fVar.b;
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
        mx6 mx6Var;
        it6 it6Var;
        long j;
        MediaMetadataCompat mediaMetadataCompat;
        k44 k44Var;
        Bitmap bitmap;
        MediaMetadata metadata;
        PendingIntent activity;
        long j2;
        hvd hvdVar;
        long j3;
        int i2;
        mx6 mx6Var2 = this.p;
        if (mx6Var2 != null) {
            zw6 zw6Var = (zw6) mx6Var2.b;
            Bundle bundle = new Bundle();
            f fVar = new f();
            k89 k89Var = this.n;
            tn7 tn7Var = this.e;
            if (k89Var != null && this.j != null) {
                if (k89Var.s() != 0 && !k89Var.j()) {
                    j2 = k89Var.a();
                } else {
                    j2 = 0;
                }
                fVar.c(i, j2, 1.0f);
                if (i == 0) {
                    b = fVar.b();
                } else {
                    if (tn7Var != null) {
                        hvdVar = tn7Var.W;
                    } else {
                        hvdVar = null;
                    }
                    k89 k89Var2 = this.n;
                    if (k89Var2 != null && !k89Var2.j() && !this.n.n()) {
                        j3 = 256;
                    } else {
                        j3 = 0;
                    }
                    if (hvdVar != null) {
                        ArrayList a = yif.a(hvdVar);
                        if (a != null) {
                            int size = a.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = a.get(i3);
                                i3++;
                                ArrayList arrayList = a;
                                zl7 zl7Var = (zl7) obj;
                                int i4 = size;
                                String str = zl7Var.a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(fVar, str, zl7Var);
                                } else {
                                    j3 |= c(str, i, bundle);
                                }
                                size = i4;
                                a = arrayList;
                            }
                        }
                    } else if (tn7Var != null) {
                        ArrayList arrayList2 = tn7Var.a;
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
            mx6Var2.r0(b);
            if (tn7Var != null && tn7Var.X) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (tn7Var != null && tn7Var.Y) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                zw6Var.a.setExtras(bundle);
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
                        zw6Var.a.setSessionActivity(activity);
                    }
                }
                k89 k89Var3 = this.n;
                if (k89Var3 != null && (mx6Var = this.p) != null && mediaInfo != null && (it6Var = mediaInfo.d) != null) {
                    Bundle bundle2 = it6Var.b;
                    if (k89Var3.j()) {
                        j = 0;
                    } else {
                        j = mediaInfo.e;
                    }
                    it6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    it6.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    mx6 mx6Var3 = this.p;
                    if (mx6Var3 != null && (metadata = ((a) ((wm4) mx6Var3.c).b).a.getMetadata()) != null) {
                        qt qtVar = MediaMetadataCompat.d;
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
                        k44Var = new k44((byte) 17);
                    } else {
                        k44Var = new k44(mediaMetadataCompat);
                    }
                    k44Var.T(j);
                    if (string != null) {
                        k44Var.U("android.media.metadata.TITLE", string);
                        k44Var.U("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        k44Var.U("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    mx6Var.q0(new MediaMetadataCompat((Bundle) k44Var.b));
                    Uri d = d(it6Var);
                    if (d != null) {
                        this.h.P(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(0, null);
                    }
                    Uri d2 = d(it6Var);
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
            mx6Var2.q0(new MediaMetadataCompat(new Bundle()));
        }
    }
}

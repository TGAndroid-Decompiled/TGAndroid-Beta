package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
public final class xw6 extends MediaSession.Callback {
    public final byte a;
    public final Object b;

    public xw6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
        jx6 jx6Var;
        IBinder asBinder;
        bcc bccVar;
        bx6 b = b();
        if (b == null) {
            return;
        }
        Bundle o = hac.o(bundle);
        e(b);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    kx6 kx6Var = b.c;
                    kk5 a = kx6Var.a();
                    if (a == null) {
                        asBinder = null;
                    } else {
                        asBinder = a.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (kx6Var.a) {
                        bccVar = kx6Var.d;
                    }
                    if (bccVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(bccVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (o != null) {
                    ((yw6) this.b).c((ks6) gpe.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), ks6.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (o != null) {
                    ((yw6) this.b).d((ks6) gpe.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), ks6.CREATOR), o.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (o != null) {
                    ((yw6) this.b).E((ks6) gpe.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), ks6.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                ArrayList arrayList = b.h;
                if (arrayList != null && o != null) {
                    int i = o.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i >= 0 && i < arrayList.size()) {
                        jx6Var = (jx6) arrayList.get(i);
                    } else {
                        jx6Var = null;
                    }
                    if (jx6Var != null) {
                        ((yw6) this.b).E(jx6Var.a);
                    }
                }
            } else {
                ((yw6) this.b).e(str, o, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            ncd.c("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b.d(null);
    }

    public static void d(zw6 zw6Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = zw6Var.a;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        zw6Var.e(new ny6(str, -1, -1));
    }

    public static void e(bx6 bx6Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = bx6Var.a;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                ncd.d("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        bx6Var.d(new my6(str, -1, -1));
    }

    public final zw6 a() {
        zw6 zw6Var;
        synchronized (((yw6) this.b).b) {
            zw6Var = (zw6) ((yw6) this.b).d.get();
        }
        if (zw6Var != null && ((yw6) this.b) == zw6Var.b()) {
            return zw6Var;
        }
        return null;
    }

    public final bx6 b() {
        bx6 bx6Var;
        synchronized (((yw6) this.b).b) {
            bx6Var = (bx6) ((yw6) this.b).d.get();
        }
        if (bx6Var != null && ((yw6) this.b) == bx6Var.b()) {
            return bx6Var;
        }
        return null;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i;
        IBinder asBinder;
        bcc bccVar;
        switch (this.a) {
            case 0:
                c(str, bundle, resultReceiver);
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    try {
                        if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            Bundle bundle2 = new Bundle();
                            MediaSessionCompat$Token mediaSessionCompat$Token = a.c;
                            lk5 a2 = mediaSessionCompat$Token.a();
                            if (a2 == null) {
                                asBinder = null;
                            } else {
                                asBinder = a2.asBinder();
                            }
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                            synchronized (mediaSessionCompat$Token.a) {
                                bccVar = mediaSessionCompat$Token.d;
                            }
                            if (bccVar != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("a", new ParcelImpl(bccVar));
                                bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                            }
                            resultReceiver.send(0, bundle2);
                        } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                            bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") && a.g != null && (i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i < a.g.size()) {
                            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) a.g.get(i);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                    }
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yw6 yw6Var = (yw6) obj;
                bx6 b2 = b();
                if (b2 != null) {
                    Bundle o = hac.o(bundle);
                    e(b2);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (o != null) {
                                yw6Var.v((Uri) o.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), hac.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            yw6Var.w();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (o != null) {
                                yw6Var.x(o.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), hac.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (o != null) {
                                yw6Var.A(o.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), hac.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (o != null) {
                                yw6Var.D((Uri) o.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), hac.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (o != null) {
                                o.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (o != null) {
                                yw6Var.M(o.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (o != null) {
                                yw6Var.P(o.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (o != null) {
                                hac.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                yw6Var.L((i19) gpe.a(o.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), i19.CREATOR));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            if (o != null) {
                                yw6Var.J(o.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                            }
                        } else {
                            yw6Var.g(str, o);
                        }
                    } catch (BadParcelableException unused) {
                        ncd.c("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    b2.d(null);
                    return;
                }
                return;
            default:
                yw6 yw6Var2 = (yw6) obj;
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            mx6.D(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                mx6.D(bundle2);
                                yw6Var2.x(string, bundle2);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                mx6.D(bundle3);
                                yw6Var2.A(string2, bundle3);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                                mx6.D(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                yw6Var2.M(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                yw6Var2.P(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                                mx6.D(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            } else {
                                yw6Var2.f(str);
                            }
                        }
                    } catch (BadParcelableException unused2) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onFastForward() {
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    e(b);
                    ((yw6) this.b).h();
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    boolean i = ((yw6) obj).i(intent);
                    b2.d(null);
                    if (i || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    boolean i2 = ((yw6) obj).i(intent);
                    a.e(null);
                    if (i2 || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final void onPause() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yw6) obj).k();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    ((yw6) obj).k();
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlay() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yw6) obj).n();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    ((yw6) obj).n();
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    Bundle o = hac.o(bundle);
                    e(b2);
                    ((yw6) obj).q(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    ((yw6) obj).q(str, bundle);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    Bundle o = hac.o(bundle);
                    e(b2);
                    ((yw6) obj).u(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    ((yw6) obj).t(str);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    Bundle o = hac.o(bundle);
                    e(b);
                    ((yw6) this.b).v(uri, o);
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPrepare() {
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    e(b);
                    ((yw6) this.b).w();
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    Bundle o = hac.o(bundle);
                    e(b2);
                    ((yw6) obj).x(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    ((yw6) obj).x(str, bundle);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    Bundle o = hac.o(bundle);
                    e(b2);
                    ((yw6) obj).A(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    ((yw6) obj).A(str, bundle);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    Bundle o = hac.o(bundle);
                    e(b);
                    ((yw6) this.b).D(uri, o);
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    mx6.D(bundle);
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewind() {
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    e(b);
                    ((yw6) this.b).F();
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSeekTo(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yw6) obj).G(j);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    ((yw6) obj).G(j);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSetPlaybackSpeed(float f) {
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    e(b);
                    ((yw6) this.b).J(f);
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSetRating(Rating rating) {
        i19 i19Var;
        i19 i19Var2;
        RatingCompat ratingCompat;
        float f;
        float f2 = 0.0f;
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    e(b);
                    yw6 yw6Var = (yw6) this.b;
                    if (rating != null) {
                        int ratingStyle = rating.getRatingStyle();
                        if (rating.isRated()) {
                            switch (ratingStyle) {
                                case 1:
                                    if (rating.hasHeart()) {
                                        f2 = 1.0f;
                                    }
                                    i19Var = new i19(1, f2);
                                    i19Var.getClass();
                                    i19Var.c = rating;
                                    break;
                                case 2:
                                    if (rating.isThumbUp()) {
                                        f2 = 1.0f;
                                    }
                                    i19Var2 = new i19(2, f2);
                                    i19Var = i19Var2;
                                    i19Var.getClass();
                                    i19Var.c = rating;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    i19Var = i19.d(rating.getStarRating(), ratingStyle);
                                    i19Var.getClass();
                                    i19Var.c = rating;
                                    break;
                                case 6:
                                    i19Var = i19.c(rating.getPercentRating());
                                    i19Var.getClass();
                                    i19Var.c = rating;
                                    break;
                            }
                            yw6Var.K(i19Var);
                            b.d(null);
                            return;
                        }
                        switch (ratingStyle) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i19Var2 = new i19(ratingStyle, -1.0f);
                                i19Var = i19Var2;
                                break;
                            default:
                                i19Var = null;
                                break;
                        }
                        i19Var.getClass();
                        i19Var.c = rating;
                        yw6Var.K(i19Var);
                        b.d(null);
                        return;
                    }
                    i19Var = null;
                    yw6Var.K(i19Var);
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    if (rating != null) {
                        int b2 = h19.b(rating);
                        if (h19.e(rating)) {
                            switch (b2) {
                                case 1:
                                    if (h19.d(rating)) {
                                        f2 = 1.0f;
                                    }
                                    ratingCompat = new RatingCompat(1, f2);
                                    ratingCompat.getClass();
                                    break;
                                case 2:
                                    if (h19.f(rating)) {
                                        f2 = 1.0f;
                                    }
                                    ratingCompat = new RatingCompat(2, f2);
                                    ratingCompat.getClass();
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    float c = h19.c(rating);
                                    if (b2 != 3) {
                                        if (b2 != 4) {
                                            if (b2 != 5) {
                                                Log.e("Rating", "Invalid rating style (" + b2 + ") for a star rating");
                                                ratingCompat = null;
                                                ratingCompat.getClass();
                                                break;
                                            } else {
                                                f = 5.0f;
                                            }
                                        } else {
                                            f = 4.0f;
                                        }
                                    } else {
                                        f = 3.0f;
                                    }
                                    if (c >= 0.0f && c <= f) {
                                        ratingCompat = new RatingCompat(b2, c);
                                        ratingCompat.getClass();
                                    } else {
                                        Log.e("Rating", "Trying to set out of range star-based rating");
                                        ratingCompat = null;
                                        ratingCompat.getClass();
                                    }
                                    break;
                                case 6:
                                    float a2 = h19.a(rating);
                                    if (a2 >= 0.0f && a2 <= 100.0f) {
                                        ratingCompat = new RatingCompat(6, a2);
                                        ratingCompat.getClass();
                                    } else {
                                        Log.e("Rating", "Invalid percentage-based rating value");
                                        ratingCompat = null;
                                        ratingCompat.getClass();
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            switch (b2) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    ratingCompat = new RatingCompat(b2, -1.0f);
                                    break;
                                default:
                                    ratingCompat = null;
                                    break;
                            }
                            ratingCompat.getClass();
                        }
                    }
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSkipToNext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yw6) obj).S();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    ((yw6) obj).S();
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSkipToPrevious() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yw6) obj).V();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    ((yw6) obj).V();
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSkipToQueueItem(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yw6) obj).Y(j);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    ((yw6) obj).Y(j);
                    a.e(null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onStop() {
        switch (this.a) {
            case 0:
                bx6 b = b();
                if (b != null) {
                    e(b);
                    ((yw6) this.b).b0();
                    b.d(null);
                    return;
                }
                return;
            default:
                zw6 a = a();
                if (a != null) {
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }
}

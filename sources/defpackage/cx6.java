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
public final class cx6 extends MediaSession.Callback {
    public final byte a;
    public final Object b;

    public cx6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
        ox6 ox6Var;
        IBinder asBinder;
        aec aecVar;
        gx6 b = b();
        if (b == null) {
            return;
        }
        Bundle o = gcc.o(bundle);
        e(b);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    px6 px6Var = b.c;
                    nk5 a = px6Var.a();
                    if (a == null) {
                        asBinder = null;
                    } else {
                        asBinder = a.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (px6Var.a) {
                        aecVar = px6Var.d;
                    }
                    if (aecVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(aecVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (o != null) {
                    ((dx6) this.b).c((os6) bse.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), os6.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (o != null) {
                    ((dx6) this.b).d((os6) bse.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), os6.CREATOR), o.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (o != null) {
                    ((dx6) this.b).E((os6) bse.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), os6.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                ArrayList arrayList = b.h;
                if (arrayList != null && o != null) {
                    int i = o.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i >= 0 && i < arrayList.size()) {
                        ox6Var = (ox6) arrayList.get(i);
                    } else {
                        ox6Var = null;
                    }
                    if (ox6Var != null) {
                        ((dx6) this.b).E(ox6Var.a);
                    }
                }
            } else {
                ((dx6) this.b).e(str, o, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            efd.c("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b.d(null);
    }

    public static void d(ex6 ex6Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = ex6Var.a;
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
        ex6Var.e(new sy6(str, -1, -1));
    }

    public static void e(gx6 gx6Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = gx6Var.a;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                efd.d("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        gx6Var.d(new ry6(str, -1, -1));
    }

    public final ex6 a() {
        ex6 ex6Var;
        synchronized (((dx6) this.b).b) {
            ex6Var = (ex6) ((dx6) this.b).d.get();
        }
        if (ex6Var != null && ((dx6) this.b) == ex6Var.b()) {
            return ex6Var;
        }
        return null;
    }

    public final gx6 b() {
        gx6 gx6Var;
        synchronized (((dx6) this.b).b) {
            gx6Var = (gx6) ((dx6) this.b).d.get();
        }
        if (gx6Var != null && ((dx6) this.b) == gx6Var.b()) {
            return gx6Var;
        }
        return null;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i;
        IBinder asBinder;
        aec aecVar;
        switch (this.a) {
            case 0:
                c(str, bundle, resultReceiver);
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
                    d(a);
                    try {
                        if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            Bundle bundle2 = new Bundle();
                            MediaSessionCompat$Token mediaSessionCompat$Token = a.c;
                            ok5 a2 = mediaSessionCompat$Token.a();
                            if (a2 == null) {
                                asBinder = null;
                            } else {
                                asBinder = a2.asBinder();
                            }
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                            synchronized (mediaSessionCompat$Token.a) {
                                aecVar = mediaSessionCompat$Token.d;
                            }
                            if (aecVar != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("a", new ParcelImpl(aecVar));
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
                dx6 dx6Var = (dx6) obj;
                gx6 b2 = b();
                if (b2 != null) {
                    Bundle o = gcc.o(bundle);
                    e(b2);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (o != null) {
                                dx6Var.v((Uri) o.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), gcc.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            dx6Var.w();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (o != null) {
                                dx6Var.x(o.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), gcc.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (o != null) {
                                dx6Var.A(o.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), gcc.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (o != null) {
                                dx6Var.D((Uri) o.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), gcc.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (o != null) {
                                o.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (o != null) {
                                dx6Var.M(o.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (o != null) {
                                dx6Var.P(o.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (o != null) {
                                gcc.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                dx6Var.L((u29) bse.a(o.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), u29.CREATOR));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            if (o != null) {
                                dx6Var.J(o.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                            }
                        } else {
                            dx6Var.g(str, o);
                        }
                    } catch (BadParcelableException unused) {
                        efd.c("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    b2.d(null);
                    return;
                }
                return;
            default:
                dx6 dx6Var2 = (dx6) obj;
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
                    d(a);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            rx6.D(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                rx6.D(bundle2);
                                dx6Var2.x(string, bundle2);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                rx6.D(bundle3);
                                dx6Var2.A(string2, bundle3);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                                rx6.D(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                dx6Var2.M(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                dx6Var2.P(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                                rx6.D(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            } else {
                                dx6Var2.f(str);
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
                gx6 b = b();
                if (b != null) {
                    e(b);
                    ((dx6) this.b).h();
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
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
                gx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    boolean i = ((dx6) obj).i(intent);
                    b2.d(null);
                    if (i || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    boolean i2 = ((dx6) obj).i(intent);
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
                gx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((dx6) obj).k();
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    ((dx6) obj).k();
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
                gx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((dx6) obj).n();
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    ((dx6) obj).n();
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
                gx6 b2 = b();
                if (b2 != null) {
                    Bundle o = gcc.o(bundle);
                    e(b2);
                    ((dx6) obj).q(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
                    d(a);
                    ((dx6) obj).q(str, bundle);
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
                gx6 b2 = b();
                if (b2 != null) {
                    Bundle o = gcc.o(bundle);
                    e(b2);
                    ((dx6) obj).u(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
                    d(a);
                    ((dx6) obj).t(str);
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
                gx6 b = b();
                if (b != null) {
                    Bundle o = gcc.o(bundle);
                    e(b);
                    ((dx6) this.b).v(uri, o);
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
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
                gx6 b = b();
                if (b != null) {
                    e(b);
                    ((dx6) this.b).w();
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
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
                gx6 b2 = b();
                if (b2 != null) {
                    Bundle o = gcc.o(bundle);
                    e(b2);
                    ((dx6) obj).x(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
                    d(a);
                    ((dx6) obj).x(str, bundle);
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
                gx6 b2 = b();
                if (b2 != null) {
                    Bundle o = gcc.o(bundle);
                    e(b2);
                    ((dx6) obj).A(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
                    d(a);
                    ((dx6) obj).A(str, bundle);
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
                gx6 b = b();
                if (b != null) {
                    Bundle o = gcc.o(bundle);
                    e(b);
                    ((dx6) this.b).D(uri, o);
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    rx6.D(bundle);
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
                gx6 b = b();
                if (b != null) {
                    e(b);
                    ((dx6) this.b).F();
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
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
                gx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((dx6) obj).G(j);
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    ((dx6) obj).G(j);
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
                gx6 b = b();
                if (b != null) {
                    e(b);
                    ((dx6) this.b).J(f);
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
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
        u29 u29Var;
        u29 u29Var2;
        RatingCompat ratingCompat;
        float f;
        float f2 = 0.0f;
        switch (this.a) {
            case 0:
                gx6 b = b();
                if (b != null) {
                    e(b);
                    dx6 dx6Var = (dx6) this.b;
                    if (rating != null) {
                        int ratingStyle = rating.getRatingStyle();
                        if (rating.isRated()) {
                            switch (ratingStyle) {
                                case 1:
                                    if (rating.hasHeart()) {
                                        f2 = 1.0f;
                                    }
                                    u29Var = new u29(1, f2);
                                    u29Var.getClass();
                                    u29Var.c = rating;
                                    break;
                                case 2:
                                    if (rating.isThumbUp()) {
                                        f2 = 1.0f;
                                    }
                                    u29Var2 = new u29(2, f2);
                                    u29Var = u29Var2;
                                    u29Var.getClass();
                                    u29Var.c = rating;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    u29Var = u29.d(rating.getStarRating(), ratingStyle);
                                    u29Var.getClass();
                                    u29Var.c = rating;
                                    break;
                                case 6:
                                    u29Var = u29.c(rating.getPercentRating());
                                    u29Var.getClass();
                                    u29Var.c = rating;
                                    break;
                            }
                            dx6Var.K(u29Var);
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
                                u29Var2 = new u29(ratingStyle, -1.0f);
                                u29Var = u29Var2;
                                break;
                            default:
                                u29Var = null;
                                break;
                        }
                        u29Var.getClass();
                        u29Var.c = rating;
                        dx6Var.K(u29Var);
                        b.d(null);
                        return;
                    }
                    u29Var = null;
                    dx6Var.K(u29Var);
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    if (rating != null) {
                        int b2 = t29.b(rating);
                        if (t29.e(rating)) {
                            switch (b2) {
                                case 1:
                                    if (t29.d(rating)) {
                                        f2 = 1.0f;
                                    }
                                    ratingCompat = new RatingCompat(1, f2);
                                    ratingCompat.getClass();
                                    break;
                                case 2:
                                    if (t29.f(rating)) {
                                        f2 = 1.0f;
                                    }
                                    ratingCompat = new RatingCompat(2, f2);
                                    ratingCompat.getClass();
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    float c = t29.c(rating);
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
                                    float a2 = t29.a(rating);
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
                gx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((dx6) obj).S();
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    ((dx6) obj).S();
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
                gx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((dx6) obj).V();
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    ((dx6) obj).V();
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
                gx6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((dx6) obj).Y(j);
                    b2.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    ((dx6) obj).Y(j);
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
                gx6 b = b();
                if (b != null) {
                    e(b);
                    ((dx6) this.b).b0();
                    b.d(null);
                    return;
                }
                return;
            default:
                ex6 a = a();
                if (a != null) {
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }
}

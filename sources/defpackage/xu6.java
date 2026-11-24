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
public final class xu6 extends MediaSession.Callback {
    public final byte a;
    public final Object b;

    public xu6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
        jv6 jv6Var;
        IBinder asBinder;
        aac aacVar;
        bv6 b = b();
        if (b == null) {
            return;
        }
        Bundle o = g8c.o(bundle);
        e(b);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    kv6 kv6Var = b.c;
                    li5 a = kv6Var.a();
                    if (a == null) {
                        asBinder = null;
                    } else {
                        asBinder = a.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (kv6Var.a) {
                        aacVar = kv6Var.d;
                    }
                    if (aacVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(aacVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (o != null) {
                    ((yu6) this.b).c((kq6) dne.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), kq6.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (o != null) {
                    ((yu6) this.b).d((kq6) dne.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), kq6.CREATOR), o.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (o != null) {
                    ((yu6) this.b).E((kq6) dne.a(o.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), kq6.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                ArrayList arrayList = b.h;
                if (arrayList != null && o != null) {
                    int i = o.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i >= 0 && i < arrayList.size()) {
                        jv6Var = (jv6) arrayList.get(i);
                    } else {
                        jv6Var = null;
                    }
                    if (jv6Var != null) {
                        ((yu6) this.b).E(jv6Var.a);
                    }
                }
            } else {
                ((yu6) this.b).e(str, o, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            lad.c("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b.d(null);
    }

    public static void d(zu6 zu6Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = zu6Var.a;
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
        zu6Var.e(new nw6(str, -1, -1));
    }

    public static void e(bv6 bv6Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = bv6Var.a;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                lad.d("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        bv6Var.d(new mw6(str, -1, -1));
    }

    public final zu6 a() {
        zu6 zu6Var;
        synchronized (((yu6) this.b).b) {
            zu6Var = (zu6) ((yu6) this.b).d.get();
        }
        if (zu6Var != null && ((yu6) this.b) == zu6Var.b()) {
            return zu6Var;
        }
        return null;
    }

    public final bv6 b() {
        bv6 bv6Var;
        synchronized (((yu6) this.b).b) {
            bv6Var = (bv6) ((yu6) this.b).d.get();
        }
        if (bv6Var != null && ((yu6) this.b) == bv6Var.b()) {
            return bv6Var;
        }
        return null;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i;
        IBinder asBinder;
        aac aacVar;
        switch (this.a) {
            case 0:
                c(str, bundle, resultReceiver);
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
                    d(a);
                    try {
                        if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            Bundle bundle2 = new Bundle();
                            MediaSessionCompat$Token mediaSessionCompat$Token = a.c;
                            mi5 a2 = mediaSessionCompat$Token.a();
                            if (a2 == null) {
                                asBinder = null;
                            } else {
                                asBinder = a2.asBinder();
                            }
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                            synchronized (mediaSessionCompat$Token.a) {
                                aacVar = mediaSessionCompat$Token.d;
                            }
                            if (aacVar != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("a", new ParcelImpl(aacVar));
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
                yu6 yu6Var = (yu6) obj;
                bv6 b2 = b();
                if (b2 != null) {
                    Bundle o = g8c.o(bundle);
                    e(b2);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (o != null) {
                                yu6Var.v((Uri) o.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), g8c.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            yu6Var.w();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (o != null) {
                                yu6Var.x(o.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), g8c.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (o != null) {
                                yu6Var.A(o.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), g8c.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (o != null) {
                                yu6Var.D((Uri) o.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), g8c.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (o != null) {
                                o.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (o != null) {
                                yu6Var.M(o.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (o != null) {
                                yu6Var.P(o.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (o != null) {
                                g8c.o(o.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                yu6Var.L((hz8) dne.a(o.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), hz8.CREATOR));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            if (o != null) {
                                yu6Var.J(o.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                            }
                        } else {
                            yu6Var.g(str, o);
                        }
                    } catch (BadParcelableException unused) {
                        lad.c("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    b2.d(null);
                    return;
                }
                return;
            default:
                yu6 yu6Var2 = (yu6) obj;
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
                    d(a);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            mv6.B(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                mv6.B(bundle2);
                                yu6Var2.x(string, bundle2);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                mv6.B(bundle3);
                                yu6Var2.A(string2, bundle3);
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                                mv6.B(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                yu6Var2.M(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                yu6Var2.P(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                                mv6.B(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            } else {
                                yu6Var2.f(str);
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
                bv6 b = b();
                if (b != null) {
                    e(b);
                    ((yu6) this.b).h();
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
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
                bv6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    boolean i = ((yu6) obj).i(intent);
                    b2.d(null);
                    if (i || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    boolean i2 = ((yu6) obj).i(intent);
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
                bv6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yu6) obj).k();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    ((yu6) obj).k();
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
                bv6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yu6) obj).n();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    ((yu6) obj).n();
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
                bv6 b2 = b();
                if (b2 != null) {
                    Bundle o = g8c.o(bundle);
                    e(b2);
                    ((yu6) obj).q(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
                    d(a);
                    ((yu6) obj).q(str, bundle);
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
                bv6 b2 = b();
                if (b2 != null) {
                    Bundle o = g8c.o(bundle);
                    e(b2);
                    ((yu6) obj).u(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
                    d(a);
                    ((yu6) obj).t(str);
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
                bv6 b = b();
                if (b != null) {
                    Bundle o = g8c.o(bundle);
                    e(b);
                    ((yu6) this.b).v(uri, o);
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
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
                bv6 b = b();
                if (b != null) {
                    e(b);
                    ((yu6) this.b).w();
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
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
                bv6 b2 = b();
                if (b2 != null) {
                    Bundle o = g8c.o(bundle);
                    e(b2);
                    ((yu6) obj).x(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
                    d(a);
                    ((yu6) obj).x(str, bundle);
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
                bv6 b2 = b();
                if (b2 != null) {
                    Bundle o = g8c.o(bundle);
                    e(b2);
                    ((yu6) obj).A(str, o);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
                    d(a);
                    ((yu6) obj).A(str, bundle);
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
                bv6 b = b();
                if (b != null) {
                    Bundle o = g8c.o(bundle);
                    e(b);
                    ((yu6) this.b).D(uri, o);
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    mv6.B(bundle);
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
                bv6 b = b();
                if (b != null) {
                    e(b);
                    ((yu6) this.b).F();
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
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
                bv6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yu6) obj).G(j);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    ((yu6) obj).G(j);
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
                bv6 b = b();
                if (b != null) {
                    e(b);
                    ((yu6) this.b).J(f);
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
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
        hz8 hz8Var;
        hz8 hz8Var2;
        RatingCompat ratingCompat;
        float f;
        float f2 = 0.0f;
        switch (this.a) {
            case 0:
                bv6 b = b();
                if (b != null) {
                    e(b);
                    yu6 yu6Var = (yu6) this.b;
                    if (rating != null) {
                        int ratingStyle = rating.getRatingStyle();
                        if (rating.isRated()) {
                            switch (ratingStyle) {
                                case 1:
                                    if (rating.hasHeart()) {
                                        f2 = 1.0f;
                                    }
                                    hz8Var = new hz8(1, f2);
                                    hz8Var.getClass();
                                    hz8Var.c = rating;
                                    break;
                                case 2:
                                    if (rating.isThumbUp()) {
                                        f2 = 1.0f;
                                    }
                                    hz8Var2 = new hz8(2, f2);
                                    hz8Var = hz8Var2;
                                    hz8Var.getClass();
                                    hz8Var.c = rating;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    hz8Var = hz8.d(rating.getStarRating(), ratingStyle);
                                    hz8Var.getClass();
                                    hz8Var.c = rating;
                                    break;
                                case 6:
                                    hz8Var = hz8.c(rating.getPercentRating());
                                    hz8Var.getClass();
                                    hz8Var.c = rating;
                                    break;
                            }
                            yu6Var.K(hz8Var);
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
                                hz8Var2 = new hz8(ratingStyle, -1.0f);
                                hz8Var = hz8Var2;
                                break;
                            default:
                                hz8Var = null;
                                break;
                        }
                        hz8Var.getClass();
                        hz8Var.c = rating;
                        yu6Var.K(hz8Var);
                        b.d(null);
                        return;
                    }
                    hz8Var = null;
                    yu6Var.K(hz8Var);
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    if (rating != null) {
                        int b2 = gz8.b(rating);
                        if (gz8.e(rating)) {
                            switch (b2) {
                                case 1:
                                    if (gz8.d(rating)) {
                                        f2 = 1.0f;
                                    }
                                    ratingCompat = new RatingCompat(1, f2);
                                    ratingCompat.getClass();
                                    break;
                                case 2:
                                    if (gz8.f(rating)) {
                                        f2 = 1.0f;
                                    }
                                    ratingCompat = new RatingCompat(2, f2);
                                    ratingCompat.getClass();
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    float c = gz8.c(rating);
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
                                    float a2 = gz8.a(rating);
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
                bv6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yu6) obj).S();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    ((yu6) obj).S();
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
                bv6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yu6) obj).V();
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    ((yu6) obj).V();
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
                bv6 b2 = b();
                if (b2 != null) {
                    e(b2);
                    ((yu6) obj).Y(j);
                    b2.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    ((yu6) obj).Y(j);
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
                bv6 b = b();
                if (b != null) {
                    e(b);
                    ((yu6) this.b).b0();
                    b.d(null);
                    return;
                }
                return;
            default:
                zu6 a = a();
                if (a != null) {
                    d(a);
                    a.e(null);
                    return;
                }
                return;
        }
    }
}

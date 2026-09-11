package n4;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;
public final class o extends MediaSession.Callback {
    public final p f16469a;

    public o(p pVar) {
        this.f16469a = pVar;
    }

    public static void b(r rVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = rVar.f16476a;
        String str = null;
        if (i10 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e7) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e7);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        rVar.d(new a0(str, -1, -1));
    }

    public final r a() {
        r rVar;
        synchronized (this.f16469a.f16470a) {
            rVar = (r) this.f16469a.d.get();
        }
        if (rVar != null && this.f16469a == rVar.b()) {
            return rVar;
        }
        return null;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        v vVar;
        IBinder asBinder;
        y4.d dVar;
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    x xVar = a2.f16478c;
                    h a10 = xVar.a();
                    if (a10 == null) {
                        asBinder = null;
                    } else {
                        asBinder = a10.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (xVar.f16492a) {
                        dVar = xVar.d;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f16469a.b((l) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.f16469a.c((l) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f16469a.q((l) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = a2.h;
                if (list != null && bundle != null) {
                    int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i10 >= 0 && i10 < list.size()) {
                        vVar = (v) list.get(i10);
                    } else {
                        vVar = null;
                    }
                    if (vVar != null) {
                        this.f16469a.q(vVar.f16488a);
                    }
                }
            } else {
                this.f16469a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.d(null);
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            p pVar = this.f16469a;
            if (equals) {
                if (bundle != null) {
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle2);
                    pVar.l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                pVar.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle3);
                    pVar.n(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle4);
                    pVar.o(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.F(bundle5);
                    pVar.p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    pVar.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    pVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    y.F(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    pVar.v((i0) w7.a0.a(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), i0.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                if (bundle != null) {
                    pVar.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                }
            } else {
                pVar.e(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a2.d(null);
    }

    @Override
    public final void onFastForward() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.f();
        a2.d(null);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        r a2 = a();
        if (a2 != null) {
            b(a2);
            boolean g10 = this.f16469a.g(intent);
            a2.d(null);
            if (!g10 && !super.onMediaButtonEvent(intent)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onPause() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.h();
        a2.d(null);
    }

    @Override
    public final void onPlay() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.i();
        a2.d(null);
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.f16469a.j(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.f16469a.k(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.f16469a.l(uri, bundle);
        a2.d(null);
    }

    @Override
    public final void onPrepare() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.m();
        a2.d(null);
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.f16469a.n(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.f16469a.o(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        y.F(bundle);
        b(a2);
        this.f16469a.p(uri, bundle);
        a2.d(null);
    }

    @Override
    public final void onRewind() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.r();
        a2.d(null);
    }

    @Override
    public final void onSeekTo(long j3) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.s(j3);
        a2.d(null);
    }

    @Override
    public final void onSetPlaybackSpeed(float f7) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.t(f7);
        a2.d(null);
    }

    @Override
    public final void onSetRating(Rating rating) {
        i0 i0Var;
        i0 i0Var2;
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        if (rating != null) {
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                float f7 = 0.0f;
                switch (ratingStyle) {
                    case 1:
                        if (rating.hasHeart()) {
                            f7 = 1.0f;
                        }
                        i0Var2 = new i0(1, f7);
                        i0Var = i0Var2;
                        break;
                    case 2:
                        if (rating.isThumbUp()) {
                            f7 = 1.0f;
                        }
                        i0Var2 = new i0(2, f7);
                        i0Var = i0Var2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i0Var = i0.d(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        i0Var = i0.c(rating.getPercentRating());
                        break;
                }
                this.f16469a.u(i0Var);
                a2.d(null);
            }
            switch (ratingStyle) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    i0Var = new i0(ratingStyle, -1.0f);
                    break;
                default:
                    i0Var = null;
                    break;
            }
            i0Var.getClass();
            i0Var.f16454c = rating;
            this.f16469a.u(i0Var);
            a2.d(null);
        }
        i0Var = null;
        this.f16469a.u(i0Var);
        a2.d(null);
    }

    @Override
    public final void onSkipToNext() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.y();
        a2.d(null);
    }

    @Override
    public final void onSkipToPrevious() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.z();
        a2.d(null);
    }

    @Override
    public final void onSkipToQueueItem(long j3) {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.A(j3);
        a2.d(null);
    }

    @Override
    public final void onStop() {
        r a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16469a.B();
        a2.d(null);
    }
}

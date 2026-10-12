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
public final class p extends MediaSession.Callback {
    public final q f16337a;

    public p(q qVar) {
        this.f16337a = qVar;
    }

    public static void b(s sVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = sVar.f16344a;
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
        sVar.d(new a0(str, -1, -1));
    }

    public final s a() {
        s sVar;
        synchronized (this.f16337a.f16338a) {
            sVar = (s) this.f16337a.d.get();
        }
        if (sVar != null && this.f16337a == sVar.b()) {
            return sVar;
        }
        return null;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        v vVar;
        IBinder asBinder;
        y4.d dVar;
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    x xVar = a2.f16346c;
                    h a10 = xVar.a();
                    if (a10 == null) {
                        asBinder = null;
                    } else {
                        asBinder = a10.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (xVar.f16359a) {
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
                    this.f16337a.b((m) w7.z.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), m.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.f16337a.c((m) w7.z.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), m.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f16337a.q((m) w7.z.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), m.CREATOR));
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
                        this.f16337a.q(vVar.f16355a);
                    }
                }
            } else {
                this.f16337a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.d(null);
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            q qVar = this.f16337a;
            if (equals) {
                if (bundle != null) {
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.G(bundle2);
                    qVar.l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                qVar.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.G(bundle3);
                    qVar.n(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.G(bundle4);
                    qVar.o(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    y.G(bundle5);
                    qVar.p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    qVar.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    qVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    y.G(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    qVar.v((h0) w7.z.a(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), h0.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                if (bundle != null) {
                    qVar.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                }
            } else {
                qVar.e(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a2.d(null);
    }

    @Override
    public final void onFastForward() {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.f();
        a2.d(null);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        s a2 = a();
        if (a2 != null) {
            b(a2);
            boolean g10 = this.f16337a.g(intent);
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
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.h();
        a2.d(null);
    }

    @Override
    public final void onPlay() {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.i();
        a2.d(null);
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        this.f16337a.j(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        this.f16337a.k(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        this.f16337a.l(uri, bundle);
        a2.d(null);
    }

    @Override
    public final void onPrepare() {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.m();
        a2.d(null);
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        this.f16337a.n(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        this.f16337a.o(str, bundle);
        a2.d(null);
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        y.G(bundle);
        b(a2);
        this.f16337a.p(uri, bundle);
        a2.d(null);
    }

    @Override
    public final void onRewind() {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.r();
        a2.d(null);
    }

    @Override
    public final void onSeekTo(long j3) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.s(j3);
        a2.d(null);
    }

    @Override
    public final void onSetPlaybackSpeed(float f7) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.t(f7);
        a2.d(null);
    }

    @Override
    public final void onSetRating(Rating rating) {
        h0 h0Var;
        h0 h0Var2;
        s a2 = a();
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
                        h0Var2 = new h0(1, f7);
                        h0Var = h0Var2;
                        break;
                    case 2:
                        if (rating.isThumbUp()) {
                            f7 = 1.0f;
                        }
                        h0Var2 = new h0(2, f7);
                        h0Var = h0Var2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        h0Var = h0.d(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        h0Var = h0.c(rating.getPercentRating());
                        break;
                }
                this.f16337a.u(h0Var);
                a2.d(null);
            }
            switch (ratingStyle) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    h0Var = new h0(ratingStyle, -1.0f);
                    break;
                default:
                    h0Var = null;
                    break;
            }
            h0Var.getClass();
            h0Var.f16319c = rating;
            this.f16337a.u(h0Var);
            a2.d(null);
        }
        h0Var = null;
        this.f16337a.u(h0Var);
        a2.d(null);
    }

    @Override
    public final void onSkipToNext() {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.y();
        a2.d(null);
    }

    @Override
    public final void onSkipToPrevious() {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.z();
        a2.d(null);
    }

    @Override
    public final void onSkipToQueueItem(long j3) {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.A(j3);
        a2.d(null);
    }

    @Override
    public final void onStop() {
        s a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f16337a.B();
        a2.d(null);
    }
}

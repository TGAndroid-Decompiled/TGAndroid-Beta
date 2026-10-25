package n4;

import a8.ue;
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
import androidx.versionedparcelable.ParcelImpl;
import e2.n0;
import java.util.List;
public final class k extends MediaSession.Callback {
    public final l f18673a;

    public k(l lVar) {
        this.f18673a = lVar;
    }

    public static void b(n nVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = nVar.f18679a;
        String str = null;
        if (i10 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                e2.a.d("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        nVar.d(new t(str, -1, -1));
    }

    public final n a() {
        n nVar;
        synchronized (this.f18673a.f18674a) {
            nVar = (n) this.f18673a.d.get();
        }
        if (nVar != null && this.f18673a == nVar.b()) {
            return nVar;
        }
        return null;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        q qVar;
        IBinder asBinder;
        z4.d dVar;
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    r rVar = a2.f18681c;
                    d a10 = rVar.a();
                    if (a10 == null) {
                        asBinder = null;
                    } else {
                        asBinder = a10.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (rVar.f18692a) {
                        dVar = rVar.d;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (o10 != null) {
                    this.f18673a.b((h) ue.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), h.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (o10 != null) {
                    this.f18673a.c((h) ue.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), h.CREATOR), o10.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (o10 != null) {
                    this.f18673a.q((h) ue.a(o10.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), h.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = a2.h;
                if (list != null && o10 != null) {
                    int i10 = o10.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i10 >= 0 && i10 < list.size()) {
                        qVar = (q) list.get(i10);
                    } else {
                        qVar = null;
                    }
                    if (qVar != null) {
                        this.f18673a.q(qVar.f18689a);
                    }
                }
            } else {
                this.f18673a.d(str, o10, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            e2.a.c("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.d(null);
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            l lVar = this.f18673a;
            if (equals) {
                if (o10 != null) {
                    lVar.l((Uri) o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), n0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                lVar.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (o10 != null) {
                    lVar.n(o10.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), n0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (o10 != null) {
                    lVar.o(o10.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), n0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (o10 != null) {
                    lVar.p((Uri) o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), n0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (o10 != null) {
                    o10.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (o10 != null) {
                    lVar.w(o10.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (o10 != null) {
                    lVar.x(o10.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (o10 != null) {
                    n0.o(o10.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    lVar.v((a0) ue.a(o10.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), a0.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                if (o10 != null) {
                    lVar.t(o10.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                }
            } else {
                lVar.e(str, o10);
            }
        } catch (BadParcelableException unused) {
            e2.a.c("MediaSessionCompat", "Could not unparcel the data.");
        }
        a2.d(null);
    }

    @Override
    public final void onFastForward() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.f();
        a2.d(null);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        n a2 = a();
        if (a2 != null) {
            b(a2);
            boolean g7 = this.f18673a.g(intent);
            a2.d(null);
            if (!g7 && !super.onMediaButtonEvent(intent)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onPause() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.h();
        a2.d(null);
    }

    @Override
    public final void onPlay() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.i();
        a2.d(null);
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        this.f18673a.j(str, o10);
        a2.d(null);
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        this.f18673a.k(str, o10);
        a2.d(null);
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        this.f18673a.l(uri, o10);
        a2.d(null);
    }

    @Override
    public final void onPrepare() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.m();
        a2.d(null);
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        this.f18673a.n(str, o10);
        a2.d(null);
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        this.f18673a.o(str, o10);
        a2.d(null);
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        Bundle o10 = n0.o(bundle);
        b(a2);
        this.f18673a.p(uri, o10);
        a2.d(null);
    }

    @Override
    public final void onRewind() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.r();
        a2.d(null);
    }

    @Override
    public final void onSeekTo(long j10) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.s(j10);
        a2.d(null);
    }

    @Override
    public final void onSetPlaybackSpeed(float f7) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.t(f7);
        a2.d(null);
    }

    @Override
    public final void onSetRating(Rating rating) {
        a0 a0Var;
        a0 a0Var2;
        n a2 = a();
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
                        a0Var2 = new a0(1, f7);
                        a0Var = a0Var2;
                        break;
                    case 2:
                        if (rating.isThumbUp()) {
                            f7 = 1.0f;
                        }
                        a0Var2 = new a0(2, f7);
                        a0Var = a0Var2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        a0Var = a0.d(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        a0Var = a0.c(rating.getPercentRating());
                        break;
                }
                this.f18673a.u(a0Var);
                a2.d(null);
            }
            switch (ratingStyle) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    a0Var = new a0(ratingStyle, -1.0f);
                    break;
                default:
                    a0Var = null;
                    break;
            }
            a0Var.getClass();
            a0Var.f18656c = rating;
            this.f18673a.u(a0Var);
            a2.d(null);
        }
        a0Var = null;
        this.f18673a.u(a0Var);
        a2.d(null);
    }

    @Override
    public final void onSkipToNext() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.y();
        a2.d(null);
    }

    @Override
    public final void onSkipToPrevious() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.z();
        a2.d(null);
    }

    @Override
    public final void onSkipToQueueItem(long j10) {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.A(j10);
        a2.d(null);
    }

    @Override
    public final void onStop() {
        n a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f18673a.B();
        a2.d(null);
    }
}

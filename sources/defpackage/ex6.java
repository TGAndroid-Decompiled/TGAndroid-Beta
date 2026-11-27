package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d;
import java.util.ArrayList;
public class ex6 {
    public final MediaSession a;
    public final d b;
    public final MediaSessionCompat$Token c;
    public final Object d = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public ArrayList g;
    public MediaMetadataCompat h;
    public byte i;
    public int j;
    public dx6 k;
    public sy6 l;

    public ex6(Context context, String str) {
        MediaSession a = a(context, str);
        this.a = a;
        d dVar = new d(this);
        this.b = dVar;
        this.c = new MediaSessionCompat$Token(a.getSessionToken(), dVar);
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final dx6 b() {
        dx6 dx6Var;
        synchronized (this.d) {
            dx6Var = this.k;
        }
        return dx6Var;
    }

    public sy6 c() {
        sy6 sy6Var;
        synchronized (this.d) {
            sy6Var = this.l;
        }
        return sy6Var;
    }

    public final void d(dx6 dx6Var, Handler handler) {
        cx6 cx6Var;
        synchronized (this.d) {
            this.k = dx6Var;
            MediaSession mediaSession = this.a;
            if (dx6Var == null) {
                cx6Var = null;
            } else {
                cx6Var = (cx6) dx6Var.e;
            }
            mediaSession.setCallback(cx6Var, handler);
            if (dx6Var != null) {
                dx6Var.c0(this, handler);
            }
        }
    }

    public void e(sy6 sy6Var) {
        synchronized (this.d) {
            this.l = sy6Var;
        }
    }
}

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
public class zw6 {
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
    public yw6 k;
    public ny6 l;

    public zw6(Context context, String str) {
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

    public final yw6 b() {
        yw6 yw6Var;
        synchronized (this.d) {
            yw6Var = this.k;
        }
        return yw6Var;
    }

    public ny6 c() {
        ny6 ny6Var;
        synchronized (this.d) {
            ny6Var = this.l;
        }
        return ny6Var;
    }

    public final void d(yw6 yw6Var, Handler handler) {
        xw6 xw6Var;
        synchronized (this.d) {
            this.k = yw6Var;
            MediaSession mediaSession = this.a;
            if (yw6Var == null) {
                xw6Var = null;
            } else {
                xw6Var = (xw6) yw6Var.e;
            }
            mediaSession.setCallback(xw6Var, handler);
            if (yw6Var != null) {
                yw6Var.c0(this, handler);
            }
        }
    }

    public void e(ny6 ny6Var) {
        synchronized (this.d) {
            this.l = ny6Var;
        }
    }
}

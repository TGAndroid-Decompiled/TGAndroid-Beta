package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13562a;
    public final int f13563b;
    public boolean f13564c;
    public boolean d;
    public final Object f13565e;
    public final Object f13566f;
    public final Object f13567g;

    public d(boolean z10, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f13562a = z10;
        this.f13563b = i7;
        this.f13566f = str;
        this.f13567g = str2;
        this.f13565e = mediaSessionCompat$Token;
        this.f13564c = z11;
        this.d = z12;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z10) {
        this.f13564c = true;
        this.d = false;
        this.f13565e = sVar;
        this.f13563b = i7;
        this.f13562a = z10;
        this.f13566f = dVar;
        this.f13567g = eVar;
    }
}

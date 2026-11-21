package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13559a;
    public final int f13560b;
    public boolean f13561c;
    public boolean d;
    public final Object f13562e;
    public final Object f13563f;
    public final Object f13564g;

    public d(boolean z10, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f13559a = z10;
        this.f13560b = i7;
        this.f13563f = str;
        this.f13564g = str2;
        this.f13562e = mediaSessionCompat$Token;
        this.f13561c = z11;
        this.d = z12;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z10) {
        this.f13561c = true;
        this.d = false;
        this.f13562e = sVar;
        this.f13560b = i7;
        this.f13559a = z10;
        this.f13563f = dVar;
        this.f13564g = eVar;
    }
}

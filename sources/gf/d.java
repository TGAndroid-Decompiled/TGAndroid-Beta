package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13530a;
    public final int f13531b;
    public boolean f13532c;
    public boolean d;
    public final Object f13533e;
    public final Object f13534f;
    public final Object f13535g;

    public d(boolean z10, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f13530a = z10;
        this.f13531b = i7;
        this.f13534f = str;
        this.f13535g = str2;
        this.f13533e = mediaSessionCompat$Token;
        this.f13532c = z11;
        this.d = z12;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z10) {
        this.f13532c = true;
        this.d = false;
        this.f13533e = sVar;
        this.f13531b = i7;
        this.f13530a = z10;
        this.f13534f = dVar;
        this.f13535g = eVar;
    }
}

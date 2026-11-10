package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13876a;
    public final int f13877b;
    public boolean f13878c;
    public boolean d;
    public final Object f13879e;
    public final Object f13880f;
    public final Object f13881g;

    public d(boolean z9, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z10, boolean z11) {
        this.f13876a = z9;
        this.f13877b = i7;
        this.f13880f = str;
        this.f13881g = str2;
        this.f13879e = mediaSessionCompat$Token;
        this.f13878c = z10;
        this.d = z11;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z9) {
        this.f13878c = true;
        this.d = false;
        this.f13879e = sVar;
        this.f13877b = i7;
        this.f13876a = z9;
        this.f13880f = dVar;
        this.f13881g = eVar;
    }
}

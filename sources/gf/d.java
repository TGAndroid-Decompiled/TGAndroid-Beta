package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13874a;
    public final int f13875b;
    public boolean f13876c;
    public boolean d;
    public final Object f13877e;
    public final Object f13878f;
    public final Object f13879g;

    public d(boolean z9, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z10, boolean z11) {
        this.f13874a = z9;
        this.f13875b = i7;
        this.f13878f = str;
        this.f13879g = str2;
        this.f13877e = mediaSessionCompat$Token;
        this.f13876c = z10;
        this.d = z11;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z9) {
        this.f13876c = true;
        this.d = false;
        this.f13877e = sVar;
        this.f13875b = i7;
        this.f13874a = z9;
        this.f13878f = dVar;
        this.f13879g = eVar;
    }
}

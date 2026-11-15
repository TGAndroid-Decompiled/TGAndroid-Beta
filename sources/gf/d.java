package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13218a;
    public final int f13219b;
    public boolean f13220c;
    public boolean d;
    public final Object f13221e;
    public final Object f13222f;
    public final Object f13223g;

    public d(boolean z10, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f13218a = z10;
        this.f13219b = i7;
        this.f13222f = str;
        this.f13223g = str2;
        this.f13221e = mediaSessionCompat$Token;
        this.f13220c = z11;
        this.d = z12;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z10) {
        this.f13220c = true;
        this.d = false;
        this.f13221e = sVar;
        this.f13219b = i7;
        this.f13218a = z10;
        this.f13222f = dVar;
        this.f13223g = eVar;
    }
}

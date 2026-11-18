package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13533a;
    public final int f13534b;
    public boolean f13535c;
    public boolean d;
    public final Object f13536e;
    public final Object f13537f;
    public final Object f13538g;

    public d(boolean z10, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f13533a = z10;
        this.f13534b = i7;
        this.f13537f = str;
        this.f13538g = str2;
        this.f13536e = mediaSessionCompat$Token;
        this.f13535c = z11;
        this.d = z12;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z10) {
        this.f13535c = true;
        this.d = false;
        this.f13536e = sVar;
        this.f13534b = i7;
        this.f13533a = z10;
        this.f13537f = dVar;
        this.f13538g = eVar;
    }
}

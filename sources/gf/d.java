package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;
public final class d {
    public final boolean f13525a;
    public final int f13526b;
    public boolean f13527c;
    public boolean d;
    public final Object f13528e;
    public final Object f13529f;
    public final Object f13530g;

    public d(boolean z10, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f13525a = z10;
        this.f13526b = i7;
        this.f13529f = str;
        this.f13530g = str2;
        this.f13528e = mediaSessionCompat$Token;
        this.f13527c = z11;
        this.d = z12;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z10) {
        this.f13527c = true;
        this.d = false;
        this.f13528e = sVar;
        this.f13526b = i7;
        this.f13525a = z10;
        this.f13529f = dVar;
        this.f13530g = eVar;
    }
}

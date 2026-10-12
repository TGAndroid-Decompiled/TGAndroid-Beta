package f6;

import android.support.v4.media.session.MediaSessionCompat$Token;
import cf.s;
public final class f {
    public final int f9752a;
    public final boolean f9753b;
    public boolean f9754c;
    public boolean d;
    public final Object f9755e;
    public final Object f9756f;
    public final Object f9757g;

    public f(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f9753b = z10;
        this.f9752a = i10;
        this.f9756f = str;
        this.f9757g = str2;
        this.f9755e = mediaSessionCompat$Token;
        this.f9754c = z11;
        this.d = z12;
    }

    public f(s sVar, int i10, f fVar, ze.b bVar, boolean z10) {
        this.f9754c = true;
        this.d = false;
        this.f9755e = sVar;
        this.f9752a = i10;
        this.f9753b = z10;
        this.f9756f = fVar;
        this.f9757g = bVar;
    }
}

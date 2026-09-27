package f6;

import android.support.v4.media.session.MediaSessionCompat$Token;
import bf.s;
public final class f {
    public final int f8954a;
    public final boolean f8955b;
    public boolean f8956c;
    public boolean d;
    public final Object e;
    public final Object f8957f;
    public final Object f8958g;

    public f(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f8955b = z10;
        this.f8954a = i10;
        this.f8957f = str;
        this.f8958g = str2;
        this.e = mediaSessionCompat$Token;
        this.f8956c = z11;
        this.d = z12;
    }

    public f(s sVar, int i10, f fVar, ye.b bVar, boolean z10) {
        this.f8956c = true;
        this.d = false;
        this.e = sVar;
        this.f8954a = i10;
        this.f8955b = z10;
        this.f8957f = fVar;
        this.f8958g = bVar;
    }
}

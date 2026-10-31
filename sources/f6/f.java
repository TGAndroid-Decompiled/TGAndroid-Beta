package f6;

import android.support.v4.media.session.MediaSessionCompat$Token;
import ve.r;
public final class f {
    public final int f6918a;
    public final boolean f6919b;
    public boolean f6920c;
    public boolean d;
    public final Object e;
    public final Object f6921f;
    public final Object f6922g;

    public f(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f6919b = z10;
        this.f6918a = i10;
        this.f6921f = str;
        this.f6922g = str2;
        this.e = mediaSessionCompat$Token;
        this.f6920c = z11;
        this.d = z12;
    }

    public f(r rVar, int i10, f fVar, se.b bVar, boolean z10) {
        this.f6920c = true;
        this.d = false;
        this.e = rVar;
        this.f6918a = i10;
        this.f6919b = z10;
        this.f6921f = fVar;
        this.f6922g = bVar;
    }
}

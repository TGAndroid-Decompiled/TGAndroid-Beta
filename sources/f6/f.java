package f6;

import android.support.v4.media.session.MediaSessionCompat$Token;
import bf.s;
public final class f {
    public final int f8951a;
    public final boolean f8952b;
    public boolean f8953c;
    public boolean d;
    public final Object e;
    public final Object f8954f;
    public final Object f8955g;

    public f(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f8952b = z10;
        this.f8951a = i10;
        this.f8954f = str;
        this.f8955g = str2;
        this.e = mediaSessionCompat$Token;
        this.f8953c = z11;
        this.d = z12;
    }

    public f(s sVar, int i10, f fVar, ye.b bVar, boolean z10) {
        this.f8953c = true;
        this.d = false;
        this.e = sVar;
        this.f8951a = i10;
        this.f8952b = z10;
        this.f8954f = fVar;
        this.f8955g = bVar;
    }
}

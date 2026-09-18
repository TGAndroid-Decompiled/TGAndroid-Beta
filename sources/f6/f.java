package f6;

import android.support.v4.media.session.MediaSessionCompat$Token;
import bf.s;
public final class f {
    public final int f8968a;
    public final boolean f8969b;
    public boolean f8970c;
    public boolean d;
    public final Object e;
    public final Object f8971f;
    public final Object f8972g;

    public f(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f8969b = z10;
        this.f8968a = i10;
        this.f8971f = str;
        this.f8972g = str2;
        this.e = mediaSessionCompat$Token;
        this.f8970c = z11;
        this.d = z12;
    }

    public f(s sVar, int i10, f fVar, ye.b bVar, boolean z10) {
        this.f8970c = true;
        this.d = false;
        this.e = sVar;
        this.f8968a = i10;
        this.f8969b = z10;
        this.f8971f = fVar;
        this.f8972g = bVar;
    }
}

package f6;

import android.support.v4.media.session.MediaSessionCompat$Token;
import bf.s;
public final class f {
    public final int f8963a;
    public final boolean f8964b;
    public boolean f8965c;
    public boolean d;
    public final Object e;
    public final Object f8966f;
    public final Object f8967g;

    public f(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f8964b = z10;
        this.f8963a = i10;
        this.f8966f = str;
        this.f8967g = str2;
        this.e = mediaSessionCompat$Token;
        this.f8965c = z11;
        this.d = z12;
    }

    public f(s sVar, int i10, f fVar, ye.b bVar, boolean z10) {
        this.f8965c = true;
        this.d = false;
        this.e = sVar;
        this.f8963a = i10;
        this.f8964b = z10;
        this.f8966f = fVar;
        this.f8967g = bVar;
    }
}

package f6;

import android.support.v4.media.session.MediaSessionCompat$Token;
import bf.s;
public final class f {
    public final int f8952a;
    public final boolean f8953b;
    public boolean f8954c;
    public boolean d;
    public final Object e;
    public final Object f8955f;
    public final Object f8956g;

    public f(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f8953b = z10;
        this.f8952a = i10;
        this.f8955f = str;
        this.f8956g = str2;
        this.e = mediaSessionCompat$Token;
        this.f8954c = z11;
        this.d = z12;
    }

    public f(s sVar, int i10, f fVar, ye.b bVar, boolean z10) {
        this.f8954c = true;
        this.d = false;
        this.e = sVar;
        this.f8952a = i10;
        this.f8953b = z10;
        this.f8955f = fVar;
        this.f8956g = bVar;
    }
}

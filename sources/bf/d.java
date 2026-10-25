package bf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import ef.s;
public final class d {
    public final boolean f3907a;
    public final int f3908b;
    public boolean f3909c;
    public boolean d;
    public final Object e;
    public final Object f3910f;
    public final Object f3911g;

    public d(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f3907a = z10;
        this.f3908b = i10;
        this.f3910f = str;
        this.f3911g = str2;
        this.e = mediaSessionCompat$Token;
        this.f3909c = z11;
        this.d = z12;
    }

    public d(s sVar, int i10, d dVar, e eVar, boolean z10) {
        this.f3909c = true;
        this.d = false;
        this.e = sVar;
        this.f3908b = i10;
        this.f3907a = z10;
        this.f3910f = dVar;
        this.f3911g = eVar;
    }
}

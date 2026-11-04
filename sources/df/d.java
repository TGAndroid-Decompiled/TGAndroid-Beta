package df;

import android.support.v4.media.session.MediaSessionCompat$Token;
import gf.s;
public final class d {
    public final boolean f8846a;
    public final int f8847b;
    public boolean f8848c;
    public boolean d;
    public final Object f8849e;
    public final Object f8850f;
    public final Object f8851g;

    public d(boolean z10, int i3, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f8846a = z10;
        this.f8847b = i3;
        this.f8850f = str;
        this.f8851g = str2;
        this.f8849e = mediaSessionCompat$Token;
        this.f8848c = z11;
        this.d = z12;
    }

    public d(s sVar, int i3, d dVar, e eVar, boolean z10) {
        this.f8848c = true;
        this.d = false;
        this.f8849e = sVar;
        this.f8847b = i3;
        this.f8846a = z10;
        this.f8850f = dVar;
        this.f8851g = eVar;
    }
}

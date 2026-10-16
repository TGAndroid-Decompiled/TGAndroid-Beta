package af;

import android.support.v4.media.session.MediaSessionCompat$Token;
public final class e {
    public final boolean f557a;
    public final int f558b;
    public boolean f559c;
    public boolean d;
    public final Object e;
    public final Object f560f;
    public final Object f561g;

    public e(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f557a = z10;
        this.f558b = i10;
        this.f560f = str;
        this.f561g = str2;
        this.e = mediaSessionCompat$Token;
        this.f559c = z11;
        this.d = z12;
    }

    public e(df.s sVar, int i10, e eVar, f fVar, boolean z10) {
        this.f559c = true;
        this.d = false;
        this.e = sVar;
        this.f558b = i10;
        this.f557a = z10;
        this.f560f = eVar;
        this.f561g = fVar;
    }
}

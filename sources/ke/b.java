package ke;

import android.support.v4.media.session.MediaSessionCompat$Token;
import ne.s;
public final class b {
    public final boolean f11103a;
    public final int f11104b;
    public boolean f11105c;
    public boolean d;
    public final Object f11106e;
    public final Object f11107f;
    public final Object f11108g;

    public b(boolean z4, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z10, boolean z11) {
        this.f11103a = z4;
        this.f11104b = i10;
        this.f11107f = str;
        this.f11108g = str2;
        this.f11106e = mediaSessionCompat$Token;
        this.f11105c = z10;
        this.d = z11;
    }

    public b(s sVar, int i10, b bVar, c cVar, boolean z4) {
        this.f11105c = true;
        this.d = false;
        this.f11106e = sVar;
        this.f11104b = i10;
        this.f11103a = z4;
        this.f11107f = bVar;
        this.f11108g = cVar;
    }
}

package af;

import android.support.v4.media.session.MediaSessionCompat$Token;
public final class e {
    public final boolean f553a;
    public final int f554b;
    public boolean f555c;
    public boolean d;
    public final Object e;
    public final Object f556f;
    public final Object f557g;

    public e(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f553a = z10;
        this.f554b = i10;
        this.f556f = str;
        this.f557g = str2;
        this.e = mediaSessionCompat$Token;
        this.f555c = z11;
        this.d = z12;
    }

    public e(df.s sVar, int i10, e eVar, f fVar, boolean z10) {
        this.f555c = true;
        this.d = false;
        this.e = sVar;
        this.f554b = i10;
        this.f553a = z10;
        this.f556f = eVar;
        this.f557g = fVar;
    }
}

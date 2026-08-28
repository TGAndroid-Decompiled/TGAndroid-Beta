package fe;

import android.support.v4.media.session.MediaSessionCompat$Token;
import ie.s;
public final class b {
    public final boolean f6046a;
    public final int f6047b;
    public boolean f6048c;
    public boolean d;
    public final Object f6049e;
    public final Object f6050f;
    public final Object f6051g;

    public b(boolean z10, int i9, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f6046a = z10;
        this.f6047b = i9;
        this.f6050f = str;
        this.f6051g = str2;
        this.f6049e = mediaSessionCompat$Token;
        this.f6048c = z11;
        this.d = z12;
    }

    public b(s sVar, int i9, b bVar, c cVar, boolean z10) {
        this.f6048c = true;
        this.d = false;
        this.f6049e = sVar;
        this.f6047b = i9;
        this.f6046a = z10;
        this.f6050f = bVar;
        this.f6051g = cVar;
    }
}

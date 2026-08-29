package ie;

import android.support.v4.media.session.MediaSessionCompat$Token;
import le.s;
public final class b {
    public final boolean f8883a;
    public final int f8884b;
    public boolean f8885c;
    public boolean d;
    public final Object f8886e;
    public final Object f8887f;
    public final Object f8888g;

    public b(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.f8883a = z10;
        this.f8884b = i10;
        this.f8887f = str;
        this.f8888g = str2;
        this.f8886e = mediaSessionCompat$Token;
        this.f8885c = z11;
        this.d = z12;
    }

    public b(s sVar, int i10, b bVar, c cVar, boolean z10) {
        this.f8885c = true;
        this.d = false;
        this.f8886e = sVar;
        this.f8884b = i10;
        this.f8883a = z10;
        this.f8887f = bVar;
        this.f8888g = cVar;
    }
}

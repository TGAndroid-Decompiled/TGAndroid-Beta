package h3;

import android.util.Base64;

public final class q implements o8.i {

    public final int f8072a;

    @Override
    public final Object get() {
        switch (this.f8072a) {
            case 0:
                return new j(new com.google.android.exoplayer2.upstream.r(), 2500, 5000);
            default:
                byte[] bArr = new byte[12];
                i3.h.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}

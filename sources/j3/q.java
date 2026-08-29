package j3;

import android.util.Base64;
public final class q implements p8.i {
    public final int f10679a;

    @Override
    public final Object get() {
        switch (this.f10679a) {
            case 0:
                return new j(new com.google.android.exoplayer2.upstream.r(), 2500, 5000);
            default:
                byte[] bArr = new byte[12];
                k3.h.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}

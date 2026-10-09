package k6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import n6.y;
public abstract class l extends b8.b implements y {
    public final int f14719b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 7);
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.b(z10);
        this.f14719b = Arrays.hashCode(bArr);
    }

    public static byte[] K0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f14719b);
            return true;
        }
        x6.b bVar = new x6.b(L0());
        parcel2.writeNoException();
        m7.a.c(parcel2, bVar);
        return true;
    }

    public abstract byte[] L0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y)) {
            try {
                y yVar = (y) obj;
                if (((l) yVar).f14719b == this.f14719b) {
                    return Arrays.equals(L0(), (byte[]) x6.b.L0(new x6.b(((l) yVar).L0())));
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14719b;
    }
}

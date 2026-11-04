package m6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p6.n0;
public abstract class l extends com.google.android.gms.internal.cast.o implements n0 {
    public final int f19201b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 7);
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        p6.m.b(z10);
        this.f19201b = Arrays.hashCode(bArr);
    }

    public static byte[] N0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f19201b);
            return true;
        }
        z6.b bVar = new z6.b(M0());
        parcel2.writeNoException();
        o7.g.b(parcel2, bVar);
        return true;
    }

    public abstract byte[] M0();

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            try {
                n0 n0Var = (n0) obj;
                if (((l) n0Var).f19201b == this.f19201b) {
                    return Arrays.equals(M0(), (byte[]) z6.b.N0(new z6.b(((l) n0Var).M0())));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19201b;
    }
}

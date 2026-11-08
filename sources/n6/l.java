package n6;

import a8.q;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import q6.n0;
public abstract class l extends q implements n0 {
    public final int f20513b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 9);
        boolean z9;
        if (bArr.length == 25) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.b(z9);
        this.f20513b = Arrays.hashCode(bArr);
    }

    public static byte[] n1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            try {
                n0 n0Var = (n0) obj;
                if (((l) n0Var).f20513b == this.f20513b) {
                    return Arrays.equals(m1(), (byte[]) a7.b.n1(new a7.b(((l) n0Var).m1())));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20513b;
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f20513b);
            return true;
        }
        a7.b bVar = new a7.b(m1());
        parcel2.writeNoException();
        p7.g.b(parcel2, bVar);
        return true;
    }

    public abstract byte[] m1();
}

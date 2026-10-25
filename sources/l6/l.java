package l6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o6.x;
public abstract class l extends c8.b implements x {
    public final int f16942b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 7);
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6.l.b(z10);
        this.f16942b = Arrays.hashCode(bArr);
    }

    public static byte[] K0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f16942b);
            return true;
        }
        y6.b bVar = new y6.b(L0());
        parcel2.writeNoException();
        n7.a.c(parcel2, bVar);
        return true;
    }

    public abstract byte[] L0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            try {
                x xVar = (x) obj;
                if (((l) xVar).f16942b == this.f16942b) {
                    return Arrays.equals(L0(), (byte[]) y6.b.L0(new y6.b(((l) xVar).L0())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16942b;
    }
}

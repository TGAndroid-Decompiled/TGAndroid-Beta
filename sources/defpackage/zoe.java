package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public abstract class zoe extends e1d implements IInterface {
    public final int b;

    public zoe(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 6);
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        ite.b(z);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] U(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            bh7.j(e);
            return null;
        }
    }

    public abstract byte[] T();

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.b);
            return true;
        }
        eq7 eq7Var = new eq7(T());
        parcel2.writeNoException();
        nid.b(parcel2, eq7Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zoe) {
            try {
                zoe zoeVar = (zoe) obj;
                if (zoeVar.b == this.b) {
                    return Arrays.equals(T(), (byte[]) eq7.U(new eq7(zoeVar.T())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}

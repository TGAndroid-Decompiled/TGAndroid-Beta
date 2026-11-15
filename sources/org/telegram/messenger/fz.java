package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class fz {
    public xi.a f23575a;
    public long f23576b;
    public boolean f23577c;
    public boolean d;
    public long f23578e;

    public fz(xi.a aVar) {
        this.f23575a = aVar;
    }

    public static fz a(int i7, SerializedData serializedData) {
        long j3;
        long j10;
        n2.o0 a10 = xi.a.a();
        boolean z10 = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a10.f20831c = readString;
        a10.f20830b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a10.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a10.f20832e = readString3;
        String readString4 = serializedData.readString(false);
        if (readString4 != null) {
            str = readString4;
        }
        a10.f20833f = str;
        int i10 = 2;
        if (i7 >= 2) {
            j3 = serializedData.readInt64(false);
            j10 = serializedData.readInt64(false);
        } else {
            j3 = 0;
            j10 = 0;
        }
        if (i7 >= 3) {
            a10.q(xi.a.f(serializedData.readInt32(false)));
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i10 = 1;
            }
            a10.q(i10);
        }
        fz fzVar = new fz(a10.d());
        fzVar.f23578e = j10;
        fzVar.f23576b = j3;
        if (j3 > 0) {
            z10 = true;
        }
        fzVar.d = z10;
        return fzVar;
    }
}

package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class bz {
    public xi.a f23197a;
    public long f23198b;
    public boolean f23199c;
    public boolean d;
    public long f23200e;

    public bz(xi.a aVar) {
        this.f23197a = aVar;
    }

    public static bz a(int i7, SerializedData serializedData) {
        long j3;
        long j10;
        n2.o0 a10 = xi.a.a();
        boolean z10 = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a10.f21223c = readString;
        a10.f21222b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a10.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a10.f21224e = readString3;
        String readString4 = serializedData.readString(false);
        if (readString4 != null) {
            str = readString4;
        }
        a10.f21225f = str;
        int i10 = 2;
        if (i7 >= 2) {
            j3 = serializedData.readInt64(false);
            j10 = serializedData.readInt64(false);
        } else {
            j3 = 0;
            j10 = 0;
        }
        if (i7 >= 3) {
            a10.p(xi.a.f(serializedData.readInt32(false)));
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i10 = 1;
            }
            a10.p(i10);
        }
        bz bzVar = new bz(a10.d());
        bzVar.f23200e = j10;
        bzVar.f23198b = j3;
        if (j3 > 0) {
            z10 = true;
        }
        bzVar.d = z10;
        return bzVar;
    }
}

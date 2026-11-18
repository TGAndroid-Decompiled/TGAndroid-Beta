package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class az {
    public xi.a f22985a;
    public long f22986b;
    public boolean f22987c;
    public boolean d;
    public long f22988e;

    public az(xi.a aVar) {
        this.f22985a = aVar;
    }

    public static az a(int i7, SerializedData serializedData) {
        long j3;
        long j10;
        n2.o0 a10 = xi.a.a();
        boolean z10 = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a10.f21192c = readString;
        a10.f21191b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a10.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a10.f21193e = readString3;
        String readString4 = serializedData.readString(false);
        if (readString4 != null) {
            str = readString4;
        }
        a10.f21194f = str;
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
        az azVar = new az(a10.d());
        azVar.f22988e = j10;
        azVar.f22986b = j3;
        if (j3 > 0) {
            z10 = true;
        }
        azVar.d = z10;
        return azVar;
    }
}

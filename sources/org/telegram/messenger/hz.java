package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class hz {
    public ui.a f22994a;
    public long f22995b;
    public boolean f22996c;
    public boolean d;
    public long f22997e;

    public hz(ui.a aVar) {
        this.f22994a = aVar;
    }

    public static hz a(int i7, SerializedData serializedData) {
        long j3;
        long j10;
        n2.n0 a10 = ui.a.a();
        boolean z9 = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a10.f20256c = readString;
        a10.f20255b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a10.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a10.f20257e = readString3;
        String readString4 = serializedData.readString(false);
        if (readString4 != null) {
            str = readString4;
        }
        a10.f20258f = str;
        int i10 = 2;
        if (i7 >= 2) {
            j3 = serializedData.readInt64(false);
            j10 = serializedData.readInt64(false);
        } else {
            j3 = 0;
            j10 = 0;
        }
        if (i7 >= 3) {
            a10.p(ui.a.f(serializedData.readInt32(false)));
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i10 = 1;
            }
            a10.p(i10);
        }
        hz hzVar = new hz(a10.d());
        hzVar.f22997e = j10;
        hzVar.f22995b = j3;
        if (j3 > 0) {
            z9 = true;
        }
        hzVar.d = z9;
        return hzVar;
    }
}

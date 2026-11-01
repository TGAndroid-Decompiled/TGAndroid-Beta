package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class tz {
    public ji.b f18325a;
    public long f18326b;
    public boolean f18327c;
    public boolean d;
    public long e;

    public tz(ji.b bVar) {
        this.f18325a = bVar;
    }

    public static tz a(int i10, SerializedData serializedData) {
        long j10;
        long j11;
        ji.a a2 = ji.b.a();
        boolean z10 = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a2.f10424c = readString;
        a2.f10423b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a2.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a2.e = readString3;
        String readString4 = serializedData.readString(false);
        if (readString4 != null) {
            str = readString4;
        }
        a2.f10425f = str;
        int i11 = 2;
        if (i10 >= 2) {
            j10 = serializedData.readInt64(false);
            j11 = serializedData.readInt64(false);
        } else {
            j10 = 0;
            j11 = 0;
        }
        if (i10 >= 3) {
            int e = ji.b.e(serializedData.readInt32(false));
            if (e == 0) {
                e = 1;
            }
            a2.f10422a = e;
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i11 = 1;
            }
            a2.f10422a = i11;
        }
        tz tzVar = new tz(a2.d());
        tzVar.e = j11;
        tzVar.f18326b = j10;
        if (j10 > 0) {
            z10 = true;
        }
        tzVar.d = z10;
        return tzVar;
    }
}

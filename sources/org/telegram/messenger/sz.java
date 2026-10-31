package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class sz {
    public ji.b f17974a;
    public long f17975b;
    public boolean f17976c;
    public boolean d;
    public long e;

    public sz(ji.b bVar) {
        this.f17974a = bVar;
    }

    public static sz a(int i10, SerializedData serializedData) {
        long j10;
        long j11;
        ji.a a2 = ji.b.a();
        boolean z10 = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a2.f10423c = readString;
        a2.f10422b = serializedData.readInt32(false);
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
        a2.f10424f = str;
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
            a2.f10421a = e;
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i11 = 1;
            }
            a2.f10421a = i11;
        }
        sz szVar = new sz(a2.d());
        szVar.e = j11;
        szVar.f17975b = j10;
        if (j10 > 0) {
            z10 = true;
        }
        szVar.d = z10;
        return szVar;
    }
}

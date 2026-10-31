package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class n0 implements m0 {
    public final String f17025a;
    public final long f17026b;
    public long f17027c;

    public n0(String str, long j10) {
        this.f17025a = str;
        this.f17026b = j10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f17027c) {
                long j10 = (long) d;
                this.f17027c = j10;
                editor.putLong(this.f17025a, j10);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f17027c = sharedPreferences.getLong(this.f17025a, this.f17026b);
    }
}

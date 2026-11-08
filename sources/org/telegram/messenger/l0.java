package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements k0 {
    public final String f23816a;
    public final long f23817b;
    public long f23818c;

    public l0(String str, long j3) {
        this.f23816a = str;
        this.f23817b = j3;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23818c) {
                long j3 = (long) d;
                this.f23818c = j3;
                editor.putLong(this.f23816a, j3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23818c = sharedPreferences.getLong(this.f23816a, this.f23817b);
    }
}

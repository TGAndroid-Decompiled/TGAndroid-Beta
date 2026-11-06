package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements k0 {
    public final String f23811a;
    public final long f23812b;
    public long f23813c;

    public l0(String str, long j3) {
        this.f23811a = str;
        this.f23812b = j3;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23813c) {
                long j3 = (long) d;
                this.f23813c = j3;
                editor.putLong(this.f23811a, j3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23813c = sharedPreferences.getLong(this.f23811a, this.f23812b);
    }
}

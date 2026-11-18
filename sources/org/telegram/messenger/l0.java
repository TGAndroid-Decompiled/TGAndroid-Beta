package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements k0 {
    public final String f25308a;
    public final long f25309b;
    public long f25310c;

    public l0(String str, long j3) {
        this.f25308a = str;
        this.f25309b = j3;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f25310c) {
                long j3 = (long) d;
                this.f25310c = j3;
                editor.putLong(this.f25308a, j3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25310c = sharedPreferences.getLong(this.f25308a, this.f25309b);
    }
}

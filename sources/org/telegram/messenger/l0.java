package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements k0 {
    public final String f23919a;
    public final long f23920b;
    public long f23921c;

    public l0(String str, long j10) {
        this.f23919a = str;
        this.f23920b = j10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23921c) {
                long j10 = (long) d;
                this.f23921c = j10;
                editor.putLong(this.f23919a, j10);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23921c = sharedPreferences.getLong(this.f23919a, this.f23920b);
    }
}

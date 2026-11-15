package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements k0 {
    public final String f24783a;
    public final long f24784b;
    public long f24785c;

    public l0(String str, long j3) {
        this.f24783a = str;
        this.f24784b = j3;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f24785c) {
                long j3 = (long) d;
                this.f24785c = j3;
                editor.putLong(this.f24783a, j3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24785c = sharedPreferences.getLong(this.f24783a, this.f24784b);
    }
}

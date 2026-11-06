package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class i0 implements k0 {
    public double f23003a;

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23003a) {
                this.f23003a = d;
                editor.putFloat("ton_usd_rate", (float) d);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23003a = sharedPreferences.getFloat("ton_usd_rate", (float) 3.0d);
    }
}

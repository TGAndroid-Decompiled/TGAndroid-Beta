package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements m0 {
    public final String f16656a;
    public final int f16657b;
    public int f16658c;

    public l0(String str, int i10) {
        this.f16656a = str;
        this.f16657b = i10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f16658c) {
                int i10 = (int) d;
                this.f16658c = i10;
                editor.putInt(this.f16656a, i10);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f16658c = sharedPreferences.getInt(this.f16656a, this.f16657b);
    }
}

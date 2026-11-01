package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements m0 {
    public final String f16853a;
    public final int f16854b;
    public int f16855c;

    public l0(String str, int i10) {
        this.f16853a = str;
        this.f16854b = i10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f16855c) {
                int i10 = (int) d;
                this.f16855c = i10;
                editor.putInt(this.f16853a, i10);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f16855c = sharedPreferences.getInt(this.f16853a, this.f16854b);
    }
}

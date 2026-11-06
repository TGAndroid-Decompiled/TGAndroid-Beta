package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f23430a;
    public final int f23431b;
    public int f23432c;

    public j0(String str, int i7) {
        this.f23430a = str;
        this.f23431b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23432c) {
                int i7 = (int) d;
                this.f23432c = i7;
                editor.putInt(this.f23430a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23432c = sharedPreferences.getInt(this.f23430a, this.f23431b);
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f23462a;
    public final int f23463b;
    public int f23464c;

    public j0(String str, int i7) {
        this.f23462a = str;
        this.f23463b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23464c) {
                int i7 = (int) d;
                this.f23464c = i7;
                editor.putInt(this.f23462a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23464c = sharedPreferences.getInt(this.f23462a, this.f23463b);
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f23618a;
    public final int f23619b;
    public int f23620c;

    public j0(String str, int i3) {
        this.f23618a = str;
        this.f23619b = i3;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23620c) {
                int i3 = (int) d;
                this.f23620c = i3;
                editor.putInt(this.f23618a, i3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23620c = sharedPreferences.getInt(this.f23618a, this.f23619b);
    }
}

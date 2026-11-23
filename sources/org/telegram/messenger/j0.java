package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f24774a;
    public final int f24775b;
    public int f24776c;

    public j0(String str, int i7) {
        this.f24774a = str;
        this.f24775b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f24776c) {
                int i7 = (int) d;
                this.f24776c = i7;
                editor.putInt(this.f24774a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24776c = sharedPreferences.getInt(this.f24774a, this.f24775b);
    }
}

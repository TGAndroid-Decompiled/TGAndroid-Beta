package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f24496a;
    public final int f24497b;
    public int f24498c;

    public j0(String str, int i7) {
        this.f24496a = str;
        this.f24497b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f24498c) {
                int i7 = (int) d;
                this.f24498c = i7;
                editor.putInt(this.f24496a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24498c = sharedPreferences.getInt(this.f24496a, this.f24497b);
    }
}

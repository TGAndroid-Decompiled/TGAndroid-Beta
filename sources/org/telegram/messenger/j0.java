package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f24491a;
    public final int f24492b;
    public int f24493c;

    public j0(String str, int i7) {
        this.f24491a = str;
        this.f24492b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f24493c) {
                int i7 = (int) d;
                this.f24493c = i7;
                editor.putInt(this.f24491a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24493c = sharedPreferences.getInt(this.f24491a, this.f24492b);
    }
}

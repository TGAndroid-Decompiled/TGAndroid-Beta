package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f24790a;
    public final int f24791b;
    public int f24792c;

    public j0(String str, int i7) {
        this.f24790a = str;
        this.f24791b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f24792c) {
                int i7 = (int) d;
                this.f24792c = i7;
                editor.putInt(this.f24790a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24792c = sharedPreferences.getInt(this.f24790a, this.f24791b);
    }
}

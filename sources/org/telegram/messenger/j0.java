package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f23458a;
    public final int f23459b;
    public int f23460c;

    public j0(String str, int i7) {
        this.f23458a = str;
        this.f23459b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f23460c) {
                int i7 = (int) d;
                this.f23460c = i7;
                editor.putInt(this.f23458a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f23460c = sharedPreferences.getInt(this.f23458a, this.f23459b);
    }
}

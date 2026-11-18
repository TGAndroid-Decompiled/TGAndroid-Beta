package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f24765a;
    public final int f24766b;
    public int f24767c;

    public j0(String str, int i7) {
        this.f24765a = str;
        this.f24766b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f24767c) {
                int i7 = (int) d;
                this.f24767c = i7;
                editor.putInt(this.f24765a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24767c = sharedPreferences.getInt(this.f24765a, this.f24766b);
    }
}

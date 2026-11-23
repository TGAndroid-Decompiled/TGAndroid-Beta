package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24437a;
    public final boolean f24438b;
    public boolean f24439c;

    public h0(String str, boolean z10) {
        this.f24437a = str;
        this.f24438b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24439c) {
            this.f24439c = z10;
            editor.putBoolean(this.f24437a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24439c = sharedPreferences.getBoolean(this.f24437a, this.f24438b);
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f22812a;
    public final boolean f22813b;
    public boolean f22814c;

    public h0(String str, boolean z10) {
        this.f22812a = str;
        this.f22813b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f22814c) {
            this.f22814c = z10;
            editor.putBoolean(this.f22812a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f22814c = sharedPreferences.getBoolean(this.f22812a, this.f22813b);
    }
}

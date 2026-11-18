package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24334a;
    public final boolean f24335b;
    public boolean f24336c;

    public h0(String str, boolean z10) {
        this.f24334a = str;
        this.f24335b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24336c) {
            this.f24336c = z10;
            editor.putBoolean(this.f24334a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24336c = sharedPreferences.getBoolean(this.f24334a, this.f24335b);
    }
}

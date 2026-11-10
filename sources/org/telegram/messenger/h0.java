package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f22782a;
    public final boolean f22783b;
    public boolean f22784c;

    public h0(String str, boolean z9) {
        this.f22782a = str;
        this.f22783b = z9;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z9;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z9 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f22784c) {
            this.f22784c = z9;
            editor.putBoolean(this.f22782a, z9);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f22784c = sharedPreferences.getBoolean(this.f22782a, this.f22783b);
    }
}

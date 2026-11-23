package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24339a;
    public final boolean f24340b;
    public boolean f24341c;

    public h0(String str, boolean z10) {
        this.f24339a = str;
        this.f24340b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24341c) {
            this.f24341c = z10;
            editor.putBoolean(this.f24339a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24341c = sharedPreferences.getBoolean(this.f24339a, this.f24340b);
    }
}

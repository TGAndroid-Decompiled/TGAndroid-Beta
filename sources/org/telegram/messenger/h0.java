package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24337a;
    public final boolean f24338b;
    public boolean f24339c;

    public h0(String str, boolean z10) {
        this.f24337a = str;
        this.f24338b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24339c) {
            this.f24339c = z10;
            editor.putBoolean(this.f24337a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24339c = sharedPreferences.getBoolean(this.f24337a, this.f24338b);
    }
}

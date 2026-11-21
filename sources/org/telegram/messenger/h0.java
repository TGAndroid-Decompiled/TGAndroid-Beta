package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24362a;
    public final boolean f24363b;
    public boolean f24364c;

    public h0(String str, boolean z10) {
        this.f24362a = str;
        this.f24363b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24364c) {
            this.f24364c = z10;
            editor.putBoolean(this.f24362a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24364c = sharedPreferences.getBoolean(this.f24362a, this.f24363b);
    }
}

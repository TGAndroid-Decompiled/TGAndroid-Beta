package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24007a;
    public final boolean f24008b;
    public boolean f24009c;

    public h0(String str, boolean z10) {
        this.f24007a = str;
        this.f24008b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24009c) {
            this.f24009c = z10;
            editor.putBoolean(this.f24007a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24009c = sharedPreferences.getBoolean(this.f24007a, this.f24008b);
    }
}

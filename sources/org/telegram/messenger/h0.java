package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24303a;
    public final boolean f24304b;
    public boolean f24305c;

    public h0(String str, boolean z10) {
        this.f24303a = str;
        this.f24304b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24305c) {
            this.f24305c = z10;
            editor.putBoolean(this.f24303a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24305c = sharedPreferences.getBoolean(this.f24303a, this.f24304b);
    }
}

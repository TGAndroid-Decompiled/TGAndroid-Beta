package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f22765a;
    public final boolean f22766b;
    public boolean f22767c;

    public h0(String str, boolean z9) {
        this.f22765a = str;
        this.f22766b = z9;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z9;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z9 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f22767c) {
            this.f22767c = z9;
            editor.putBoolean(this.f22765a, z9);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f22767c = sharedPreferences.getBoolean(this.f22765a, this.f22766b);
    }
}

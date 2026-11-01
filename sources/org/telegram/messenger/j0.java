package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements m0 {
    public final String f16391a;
    public final boolean f16392b;
    public boolean f16393c;

    public j0(String str, boolean z10) {
        this.f16391a = str;
        this.f16392b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f16393c) {
            this.f16393c = z10;
            editor.putBoolean(this.f16391a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f16393c = sharedPreferences.getBoolean(this.f16391a, this.f16392b);
    }
}

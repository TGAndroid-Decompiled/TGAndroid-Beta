package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f22772a;
    public final boolean f22773b;
    public boolean f22774c;

    public h0(String str, boolean z9) {
        this.f22772a = str;
        this.f22773b = z9;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z9;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z9 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f22774c) {
            this.f22774c = z9;
            editor.putBoolean(this.f22772a, z9);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f22774c = sharedPreferences.getBoolean(this.f22772a, this.f22773b);
    }
}

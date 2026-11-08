package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f22778a;
    public final boolean f22779b;
    public boolean f22780c;

    public h0(String str, boolean z9) {
        this.f22778a = str;
        this.f22779b = z9;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z9;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z9 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f22780c) {
            this.f22780c = z9;
            editor.putBoolean(this.f22778a, z9);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f22780c = sharedPreferences.getBoolean(this.f22778a, this.f22779b);
    }
}

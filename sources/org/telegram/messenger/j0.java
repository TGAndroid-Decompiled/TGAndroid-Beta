package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements m0 {
    public final String f16202a;
    public final boolean f16203b;
    public boolean f16204c;

    public j0(String str, boolean z10) {
        this.f16202a = str;
        this.f16203b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f16204c) {
            this.f16204c = z10;
            editor.putBoolean(this.f16202a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f16204c = sharedPreferences.getBoolean(this.f16202a, this.f16203b);
    }
}

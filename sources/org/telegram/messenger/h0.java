package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class h0 implements k0 {
    public final String f24004a;
    public final boolean f24005b;
    public boolean f24006c;

    public h0(String str, boolean z10) {
        this.f24004a = str;
        this.f24005b = z10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.f24006c) {
            this.f24006c = z10;
            editor.putBoolean(this.f24004a, z10);
            return true;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24006c = sharedPreferences.getBoolean(this.f24004a, this.f24005b);
    }
}

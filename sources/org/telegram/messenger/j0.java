package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class j0 implements k0 {
    public final String f24762a;
    public final int f24763b;
    public int f24764c;

    public j0(String str, int i7) {
        this.f24762a = str;
        this.f24763b = i7;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f24764c) {
                int i7 = (int) d;
                this.f24764c = i7;
                editor.putInt(this.f24762a, i7);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24764c = sharedPreferences.getInt(this.f24762a, this.f24763b);
    }
}

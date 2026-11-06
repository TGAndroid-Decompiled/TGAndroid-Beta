package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f24103a;
    public final String f24104b;
    public String f24105c;

    public n0(String str, String str2) {
        this.f24103a = str;
        this.f24104b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f24105c)) {
                String str = tL_jsonString.value;
                this.f24105c = str;
                editor.putString(this.f24103a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24105c = sharedPreferences.getString(this.f24103a, this.f24104b);
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f25709a;
    public final String f25710b;
    public String f25711c;

    public n0(String str, String str2) {
        this.f25709a = str;
        this.f25710b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f25711c)) {
                String str = tL_jsonString.value;
                this.f25711c = str;
                editor.putString(this.f25709a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25711c = sharedPreferences.getString(this.f25709a, this.f25710b);
    }
}

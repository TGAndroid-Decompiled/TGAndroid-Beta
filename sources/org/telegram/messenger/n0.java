package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f25964a;
    public final String f25965b;
    public String f25966c;

    public n0(String str, String str2) {
        this.f25964a = str;
        this.f25965b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f25966c)) {
                String str = tL_jsonString.value;
                this.f25966c = str;
                editor.putString(this.f25964a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25966c = sharedPreferences.getString(this.f25964a, this.f25965b);
    }
}

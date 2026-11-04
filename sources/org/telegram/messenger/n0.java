package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f24295a;
    public final String f24296b;
    public String f24297c;

    public n0(String str, String str2) {
        this.f24295a = str;
        this.f24296b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f24297c)) {
                String str = tL_jsonString.value;
                this.f24297c = str;
                editor.putString(this.f24295a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24297c = sharedPreferences.getString(this.f24295a, this.f24296b);
    }
}

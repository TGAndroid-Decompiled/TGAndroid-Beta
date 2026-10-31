package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class q0 implements m0 {
    public final String f17537a;
    public final String f17538b;
    public String f17539c;

    public q0(String str, String str2) {
        this.f17537a = str;
        this.f17538b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f17539c)) {
                String str = tL_jsonString.value;
                this.f17539c = str;
                editor.putString(this.f17537a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f17539c = sharedPreferences.getString(this.f17537a, this.f17538b);
    }
}

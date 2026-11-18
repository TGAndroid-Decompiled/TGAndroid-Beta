package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f25871a;
    public final String f25872b;
    public String f25873c;

    public n0(String str, String str2) {
        this.f25871a = str;
        this.f25872b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f25873c)) {
                String str = tL_jsonString.value;
                this.f25873c = str;
                editor.putString(this.f25871a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25873c = sharedPreferences.getString(this.f25871a, this.f25872b);
    }
}

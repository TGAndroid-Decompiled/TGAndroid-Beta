package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f25897a;
    public final String f25898b;
    public String f25899c;

    public n0(String str, String str2) {
        this.f25897a = str;
        this.f25898b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f25899c)) {
                String str = tL_jsonString.value;
                this.f25899c = str;
                editor.putString(this.f25897a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25899c = sharedPreferences.getString(this.f25897a, this.f25898b);
    }
}

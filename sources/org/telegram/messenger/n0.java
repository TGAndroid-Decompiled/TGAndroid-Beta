package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f24110a;
    public final String f24111b;
    public String f24112c;

    public n0(String str, String str2) {
        this.f24110a = str;
        this.f24111b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f24112c)) {
                String str = tL_jsonString.value;
                this.f24112c = str;
                editor.putString(this.f24110a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24112c = sharedPreferences.getString(this.f24110a, this.f24111b);
    }
}

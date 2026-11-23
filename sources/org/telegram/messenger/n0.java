package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f25673a;
    public final String f25674b;
    public String f25675c;

    public n0(String str, String str2) {
        this.f25673a = str;
        this.f25674b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f25675c)) {
                String str = tL_jsonString.value;
                this.f25675c = str;
                editor.putString(this.f25673a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25675c = sharedPreferences.getString(this.f25673a, this.f25674b);
    }
}

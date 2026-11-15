package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f25131a;
    public final String f25132b;
    public String f25133c;

    public n0(String str, String str2) {
        this.f25131a = str;
        this.f25132b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f25133c)) {
                String str = tL_jsonString.value;
                this.f25133c = str;
                editor.putString(this.f25131a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25133c = sharedPreferences.getString(this.f25131a, this.f25132b);
    }
}

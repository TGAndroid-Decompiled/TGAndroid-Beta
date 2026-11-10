package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f24120a;
    public final String f24121b;
    public String f24122c;

    public n0(String str, String str2) {
        this.f24120a = str;
        this.f24121b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f24122c)) {
                String str = tL_jsonString.value;
                this.f24122c = str;
                editor.putString(this.f24120a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24122c = sharedPreferences.getString(this.f24120a, this.f24121b);
    }
}

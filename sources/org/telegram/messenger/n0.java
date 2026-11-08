package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n0 implements k0 {
    public final String f24116a;
    public final String f24117b;
    public String f24118c;

    public n0(String str, String str2) {
        this.f24116a = str;
        this.f24117b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f24118c)) {
                String str = tL_jsonString.value;
                this.f24118c = str;
                editor.putString(this.f24116a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f24118c = sharedPreferences.getString(this.f24116a, this.f24117b);
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class q0 implements m0 {
    public final String f17723a;
    public final String f17724b;
    public String f17725c;

    public q0(String str, String str2) {
        this.f17723a = str;
        this.f17724b = str2;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonString) {
            TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
            if (!TextUtils.equals(tL_jsonString.value, this.f17725c)) {
                String str = tL_jsonString.value;
                this.f17725c = str;
                editor.putString(this.f17723a, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f17725c = sharedPreferences.getString(this.f17723a, this.f17724b);
    }
}

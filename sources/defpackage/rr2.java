package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class rr2 extends fr2 {
    public final String d;
    public final int e;
    public volatile String f;

    public rr2(int i, String str, String str2) {
        super(str);
        this.d = str2;
        this.e = i;
        this.f = str2;
    }

    @Override
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonString)) {
            return false;
        }
        String str = ((TLRPC.TL_jsonString) jSONValue).value;
        if (TextUtils.equals(str, this.f)) {
            return false;
        }
        this.f = str;
        editor.putString(e(), str);
        return true;
    }

    @Override
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e == 2 && !TextUtils.equals(this.f, this.d)) {
            this.f = this.d;
            editor.remove(e());
            return true;
        }
        return false;
    }

    @Override
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = sharedPreferences.getString(e(), this.d);
        } catch (ClassCastException e) {
            fa4.g(e, true);
            this.f = this.d;
        }
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}

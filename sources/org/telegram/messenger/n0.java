package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class n0 implements m0 {
    public final String f17236a;
    public final long f17237b;
    public long f17238c;

    public n0(String str, long j10) {
        this.f17236a = str;
        this.f17237b = j10;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f17238c) {
                long j10 = (long) d;
                this.f17238c = j10;
                editor.putLong(this.f17236a, j10);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f17238c = sharedPreferences.getLong(this.f17236a, this.f17237b);
    }
}

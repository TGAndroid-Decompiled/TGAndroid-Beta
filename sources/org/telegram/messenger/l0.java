package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class l0 implements k0 {
    public final String f25334a;
    public final long f25335b;
    public long f25336c;

    public l0(String str, long j3) {
        this.f25334a = str;
        this.f25335b = j3;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d != this.f25336c) {
                long j3 = (long) d;
                this.f25336c = j3;
                editor.putLong(this.f25334a, j3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        this.f25336c = sharedPreferences.getLong(this.f25334a, this.f25335b);
    }
}

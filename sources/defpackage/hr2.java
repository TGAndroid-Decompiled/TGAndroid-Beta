package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class hr2 extends fr2 {
    public final float d;
    public final int e;
    public volatile float f;

    public hr2(String str, int i, float f) {
        super(str);
        this.d = f;
        this.e = i;
        this.f = f;
    }

    @Override
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            float f = (float) ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (!Float.isNaN(f) && !Float.isInfinite(f)) {
                float max = Math.max(-3.4028235E38f, Math.min(Float.MAX_VALUE, f));
                if (max != this.f) {
                    this.f = max;
                    editor.putFloat(e(), max);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e == 2) {
            float f = this.f;
            float f2 = this.d;
            if (f != f2) {
                this.f = f2;
                editor.remove(e());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = Math.max(-3.4028235E38f, Math.min(Float.MAX_VALUE, sharedPreferences.getFloat(e(), this.d)));
        } catch (ClassCastException e) {
            fa4.g(e, true);
            this.f = this.d;
        }
    }

    public final float f() {
        return this.f;
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}

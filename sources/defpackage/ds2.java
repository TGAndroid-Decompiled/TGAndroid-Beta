package defpackage;

import android.content.SharedPreferences;
import java.util.function.IntSupplier;
import org.telegram.tgnet.TLRPC;
public final class ds2 extends yr2 {
    public final IntSupplier d;
    public final int e;
    public final int f;
    public final Integer g;
    public final int h;
    public volatile boolean i;
    public volatile int j;

    public ds2(String str, IntSupplier intSupplier, int i, int i2, Integer num, int i3) {
        super(str);
        this.d = intSupplier;
        this.e = i;
        this.f = i2;
        this.g = num;
        this.h = i3;
    }

    @Override
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        double d;
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        } else {
            Integer num = this.g;
            if (num != null) {
                if (jSONValue instanceof TLRPC.TL_jsonBool) {
                    if (((TLRPC.TL_jsonBool) jSONValue).value) {
                        d = num.intValue();
                    } else {
                        d = 0.0d;
                    }
                } else {
                    return c(editor);
                }
            } else {
                return false;
            }
        }
        if (d == Math.rint(d) && d >= -2.147483648E9d && d <= 2.147483647E9d) {
            int max = Math.max(this.e, Math.min(this.f, (int) d));
            if (max != f()) {
                this.j = max;
                this.i = true;
                editor.putInt(e(), max);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.h == 2 && this.i) {
            int i = this.j;
            this.i = false;
            editor.remove(e());
            if (i != f()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d(SharedPreferences sharedPreferences) {
        try {
            if (sharedPreferences.contains(e())) {
                this.j = Math.max(this.e, Math.min(this.f, sharedPreferences.getInt(e(), 0)));
                this.i = true;
                return;
            }
            this.i = false;
        } catch (ClassCastException e) {
            cc4.g(e, true);
            this.i = false;
        }
    }

    public final int f() {
        if (this.i) {
            return this.j;
        }
        return Math.max(this.e, Math.min(this.f, this.d.getAsInt()));
    }

    public final String toString() {
        return this.a + "=" + f();
    }
}

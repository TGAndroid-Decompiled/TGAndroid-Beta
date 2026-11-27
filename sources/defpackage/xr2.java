package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class xr2 extends yr2 {
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final int h;
    public volatile double i;

    public xr2(String str, double d, double d2, double d3, double d4, int i) {
        super(str);
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = i;
        this.i = d;
    }

    @Override
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (!Double.isNaN(d) && !Double.isInfinite(d)) {
                double max = Math.max(this.e, Math.min(this.f, d));
                if (max != this.i && Math.abs(max - this.i) >= this.g) {
                    this.i = max;
                    editor.putLong(e(), Double.doubleToRawLongBits(max));
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
        if (this.h == 2) {
            double d = this.i;
            double d2 = this.d;
            if (d != d2) {
                this.i = d2;
                editor.remove(e());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.contains(e())) {
            this.i = this.d;
            return;
        }
        try {
            try {
                this.i = Math.max(this.e, Math.min(this.f, Double.longBitsToDouble(sharedPreferences.getLong(e(), 0L))));
            } catch (ClassCastException e) {
                cc4.g(e, true);
                this.i = this.d;
            }
        } catch (ClassCastException unused) {
            this.i = Math.max(this.e, Math.min(this.f, sharedPreferences.getFloat(e(), (float) this.d)));
        }
    }

    public final String toString() {
        return this.a + "=" + this.i;
    }
}

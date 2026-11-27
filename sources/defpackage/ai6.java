package defpackage;

import android.content.SharedPreferences;
import java.util.function.LongSupplier;
import org.telegram.tgnet.TLRPC;
public abstract class ai6 extends yr2 {
    public final LongSupplier d;
    public final long e;
    public final long f;
    public final int g;
    public volatile boolean h;
    public volatile long i;

    public ai6(String str, LongSupplier longSupplier, long j, long j2, int i) {
        super(str);
        this.d = longSupplier;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
            if (d == Math.rint(d) && d >= -9.223372036854776E18d && d < 9.223372036854776E18d) {
                long max = Math.max(this.e, Math.min(this.f, (long) d));
                if (max != f()) {
                    this.i = max;
                    this.h = true;
                    editor.putLong(e(), max);
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
        if (this.g == 2 && this.h) {
            long j = this.i;
            this.h = false;
            editor.remove(e());
            if (j != f()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d(SharedPreferences sharedPreferences) {
        try {
            if (sharedPreferences.contains(e())) {
                this.i = Math.max(this.e, Math.min(this.f, sharedPreferences.getLong(e(), 0L)));
                this.h = true;
                return;
            }
            this.h = false;
        } catch (ClassCastException e) {
            cc4.g(e, true);
            this.h = false;
        }
    }

    public final long f() {
        if (this.h) {
            return this.i;
        }
        return Math.max(this.e, Math.min(this.f, this.d.getAsLong()));
    }
}

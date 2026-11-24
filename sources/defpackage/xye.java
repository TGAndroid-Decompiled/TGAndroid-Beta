package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
public abstract class xye {
    public static co4 e(co4[] co4VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        co4 co4Var = null;
        int i4 = Integer.MAX_VALUE;
        for (co4 co4Var2 : co4VarArr) {
            int abs = Math.abs(co4Var2.c - i2) << 1;
            if (co4Var2.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (co4Var == null || i4 > i5) {
                co4Var = co4Var2;
                i4 = i5;
            }
        }
        return co4Var;
    }

    public abstract Typeface a(Context context, yn4 yn4Var, Resources resources, int i);

    public abstract Typeface b(Context context, co4[] co4VarArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File c = aze.c(context);
        Typeface typeface = null;
        if (c == null) {
            return null;
        }
        try {
            if (aze.a(c, resources, i)) {
                typeface = Typeface.createFromFile(c.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            c.delete();
            throw th;
        }
        c.delete();
        return typeface;
    }
}

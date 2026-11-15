package c8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
public abstract class k0 {
    public k0() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i7);

    public abstract Typeface b(Context context, o0.h[] hVarArr, int i7);

    public Typeface c(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = l0.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!l0.c(d, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i7, String str, int i10) {
        File d = l0.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!l0.b(d, resources, i7)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.h f(o0.h[] hVarArr, int i7) {
        int i10;
        boolean z10;
        int i11;
        new nb.a(11);
        if ((i7 & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0.h hVar = null;
        int i12 = Integer.MAX_VALUE;
        for (o0.h hVar2 : hVarArr) {
            int abs = Math.abs(hVar2.f21214c - i10) * 2;
            if (hVar2.d == z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (hVar == null || i12 > i13) {
                hVar = hVar2;
                i12 = i13;
            }
        }
        return hVar;
    }
}

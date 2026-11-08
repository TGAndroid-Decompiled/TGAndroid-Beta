package a3;

import a8.t6;
import a8.u6;
import ab.b0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.fragment.app.t0;
import c8.he;
import c8.j0;
import c8.k0;
import java.nio.MappedByteBuffer;
public final class f implements Runnable {
    public final int f81a;
    public final Object f82b;

    public f(androidx.fragment.app.k kVar, t0 t0Var) {
        this.f81a = 9;
        this.f82b = kVar;
    }

    private final void a() {
        androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.f82b;
        synchronized (qVar.d) {
            try {
                if (qVar.f2333n == null) {
                    return;
                }
                try {
                    o0.h d = qVar.d();
                    int i7 = d.f20694e;
                    if (i7 == 2) {
                        synchronized (qVar.d) {
                        }
                    }
                    if (i7 == 0) {
                        int i10 = n0.g.f20125a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        pb.b bVar = qVar.f2330c;
                        Context context = qVar.f2328a;
                        bVar.getClass();
                        o0.h[] hVarArr = {d};
                        j0 j0Var = i0.e.f15126a;
                        he.a("TypefaceCompat.createFromFontInfo");
                        Typeface b10 = i0.e.f15126a.b(context, hVarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer e10 = k0.e(qVar.f2328a, d.f20691a);
                        if (e10 != null && b10 != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            b0 b0Var = new b0(b10, u6.a(e10));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (qVar.d) {
                                t6 t6Var = qVar.f2333n;
                                if (t6Var != null) {
                                    t6Var.b(b0Var);
                                }
                            }
                            qVar.a();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                } catch (Throwable th2) {
                    synchronized (qVar.d) {
                        try {
                            t6 t6Var2 = qVar.f2333n;
                            if (t6Var2 != null) {
                                t6Var2.a(th2);
                            }
                            qVar.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: a3.f.run():void");
    }

    public f(Object obj, int i7) {
        this.f81a = i7;
        this.f82b = obj;
    }
}

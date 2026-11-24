package defpackage;

import android.content.Context;
import org.telegram.ui.Dictation.DictationAsr;
public final class kn3 {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public kn3(Context context, xcc xccVar) {
        this.d = context.getApplicationContext();
        this.e = xccVar;
        this.c = 15000L;
        this.h = new ycc();
        this.g = bfb.a;
    }

    public static kn3 c(in3 in3Var, p86 p86Var) {
        int i;
        long nativeSessionNew;
        gn3 gn3Var = (gn3) in3Var.b;
        long h = DictationAsr.h(gn3Var);
        if (h == 0) {
            return null;
        }
        kn3 kn3Var = new kn3(in3Var, p86Var);
        String a = gn3Var.a((String) in3Var.c);
        String str = a.split(",")[0];
        if (gda.o() == 0) {
            i = 2;
        } else {
            i = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(h, a, str, i);
        kn3Var.c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.S(gn3Var);
            return null;
        }
        return kn3Var;
    }

    public final void a() {
        String nativeSessionFinish;
        long j = this.c;
        if (j != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.c);
            this.c = 0L;
            DictationAsr.S((gn3) this.e);
        }
    }

    public final void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn3.b(java.lang.String):void");
    }

    public kn3(in3 in3Var, p86 p86Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = in3Var;
        this.e = (gn3) in3Var.b;
        this.f = p86Var;
    }
}

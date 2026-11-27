package defpackage;

import android.content.Context;
import org.telegram.ui.Dictation.DictationAsr;
public final class rm3 {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public rm3(Context context, uec uecVar) {
        this.d = context.getApplicationContext();
        this.e = uecVar;
        this.c = 15000L;
        this.h = new vec();
        this.g = vgb.a;
    }

    public static rm3 c(pm3 pm3Var, t86 t86Var) {
        int i;
        long nativeSessionNew;
        nm3 nm3Var = (nm3) pm3Var.b;
        long h = DictationAsr.h(nm3Var);
        if (h == 0) {
            return null;
        }
        rm3 rm3Var = new rm3(pm3Var, t86Var);
        String a = nm3Var.a((String) pm3Var.c);
        String str = a.split(",")[0];
        if (xea.o() == 0) {
            i = 2;
        } else {
            i = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(h, a, str, i);
        rm3Var.c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.U(nm3Var);
            return null;
        }
        return rm3Var;
    }

    public final void a() {
        String nativeSessionFinish;
        long j = this.c;
        if (j != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.c);
            this.c = 0L;
            DictationAsr.U((nm3) this.e);
        }
    }

    public final void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm3.b(java.lang.String):void");
    }

    public rm3(pm3 pm3Var, t86 t86Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = pm3Var;
        this.e = (nm3) pm3Var.b;
        this.f = t86Var;
    }
}

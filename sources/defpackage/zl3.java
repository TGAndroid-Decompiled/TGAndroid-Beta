package defpackage;

import android.content.Context;
import org.telegram.ui.Dictation.DictationAsr;
public final class zl3 {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public zl3(Context context, uac uacVar) {
        this.d = context.getApplicationContext();
        this.e = uacVar;
        this.c = 15000L;
        this.h = new vac();
        this.g = adb.a;
    }

    public static zl3 c(xl3 xl3Var, p66 p66Var) {
        int i;
        long nativeSessionNew;
        vl3 vl3Var = (vl3) xl3Var.b;
        long h = DictationAsr.h(vl3Var);
        if (h == 0) {
            return null;
        }
        zl3 zl3Var = new zl3(xl3Var, p66Var);
        String a = vl3Var.a((String) xl3Var.c);
        String str = a.split(",")[0];
        if (gba.o() == 0) {
            i = 2;
        } else {
            i = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(h, a, str, i);
        zl3Var.c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.S(vl3Var);
            return null;
        }
        return zl3Var;
    }

    public final void a() {
        String nativeSessionFinish;
        long j = this.c;
        if (j != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.c);
            this.c = 0L;
            DictationAsr.S((vl3) this.e);
        }
    }

    public final void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl3.b(java.lang.String):void");
    }

    public zl3(xl3 xl3Var, p66 p66Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = xl3Var;
        this.e = (vl3) xl3Var.b;
        this.f = p66Var;
    }
}

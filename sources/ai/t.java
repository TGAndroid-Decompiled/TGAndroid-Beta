package ai;

import android.content.Context;
import org.telegram.messenger.cz;
import org.telegram.ui.Dictation.DictationAsr;
public final class t {
    public boolean f1529a;
    public boolean f1530b;
    public long f1531c;
    public final Object d;
    public final Object f1532e;
    public Object f1533f;
    public Object f1534g;
    public Object h;

    public t(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.f1532e = xVar;
        this.f1531c = 15000L;
        this.h = new d3.y();
        this.f1534g = h2.g0.f13755a;
    }

    public static t c(android.support.v4.media.session.a0 a0Var, h2 h2Var) {
        int i7;
        long nativeSessionNew;
        p pVar = (p) a0Var.f1675b;
        long k10 = DictationAsr.k(pVar);
        if (k10 == 0) {
            return null;
        }
        t tVar = new t(a0Var, h2Var);
        String a10 = pVar.a((String) a0Var.f1676c);
        String str = a10.split(",")[0];
        if (cz.o() == 0) {
            i7 = 2;
        } else {
            i7 = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, str, i7);
        tVar.f1531c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.P(pVar);
            return null;
        }
        return tVar;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.f1531c;
        if (j3 != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.f1531c);
            this.f1531c = 0L;
            DictationAsr.P((p) this.f1532e);
        }
    }

    public void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t.b(java.lang.String):void");
    }

    public t(android.support.v4.media.session.a0 a0Var, h2 h2Var) {
        this.f1534g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.f1532e = (p) a0Var.f1675b;
        this.f1533f = h2Var;
    }
}

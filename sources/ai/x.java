package ai;

import android.content.Context;
import org.telegram.messenger.bz;
import org.telegram.ui.Dictation.DictationAsr;
public final class x {
    public boolean f1595a;
    public boolean f1596b;
    public long f1597c;
    public final Object d;
    public final Object f1598e;
    public Object f1599f;
    public Object f1600g;
    public Object h;

    public x(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.f1598e = xVar;
        this.f1597c = 15000L;
        this.h = new d3.y();
        this.f1600g = h2.g0.f13789a;
    }

    public static x c(android.support.v4.media.session.a0 a0Var, q2 q2Var) {
        int i7;
        long nativeSessionNew;
        t tVar = (t) a0Var.f1717b;
        long k10 = DictationAsr.k(tVar);
        if (k10 == 0) {
            return null;
        }
        x xVar = new x(a0Var, q2Var);
        String a10 = tVar.a((String) a0Var.f1718c);
        String str = a10.split(",")[0];
        if (bz.o() == 0) {
            i7 = 2;
        } else {
            i7 = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, str, i7);
        xVar.f1597c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.Q(tVar);
            return null;
        }
        return xVar;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.f1597c;
        if (j3 != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.f1597c);
            this.f1597c = 0L;
            DictationAsr.Q((t) this.f1598e);
        }
    }

    public void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.x.b(java.lang.String):void");
    }

    public x(android.support.v4.media.session.a0 a0Var, q2 q2Var) {
        this.f1600g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.f1598e = (t) a0Var.f1717b;
        this.f1599f = q2Var;
    }
}

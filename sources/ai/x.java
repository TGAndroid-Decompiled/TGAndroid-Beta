package ai;

import android.content.Context;
import org.telegram.messenger.cz;
import org.telegram.ui.Dictation.DictationAsr;
public final class x {
    public boolean f1606a;
    public boolean f1607b;
    public long f1608c;
    public final Object d;
    public final Object f1609e;
    public Object f1610f;
    public Object f1611g;
    public Object h;

    public x(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.f1609e = xVar;
        this.f1608c = 15000L;
        this.h = new d3.y();
        this.f1611g = h2.g0.f13792a;
    }

    public static x c(android.support.v4.media.session.a0 a0Var, r2 r2Var) {
        int i7;
        long nativeSessionNew;
        t tVar = (t) a0Var.f1724b;
        long k10 = DictationAsr.k(tVar);
        if (k10 == 0) {
            return null;
        }
        x xVar = new x(a0Var, r2Var);
        String a10 = tVar.a((String) a0Var.f1725c);
        String str = a10.split(",")[0];
        if (cz.o() == 0) {
            i7 = 2;
        } else {
            i7 = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, str, i7);
        xVar.f1608c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.Q(tVar);
            return null;
        }
        return xVar;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.f1608c;
        if (j3 != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.f1608c);
            this.f1608c = 0L;
            DictationAsr.Q((t) this.f1609e);
        }
    }

    public void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.x.b(java.lang.String):void");
    }

    public x(android.support.v4.media.session.a0 a0Var, r2 r2Var) {
        this.f1611g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.f1609e = (t) a0Var.f1724b;
        this.f1610f = r2Var;
    }
}

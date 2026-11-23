package ai;

import android.content.Context;
import org.telegram.messenger.bz;
import org.telegram.ui.Dictation.DictationAsr;
public final class u {
    public boolean f1541a;
    public boolean f1542b;
    public long f1543c;
    public final Object d;
    public final Object f1544e;
    public Object f1545f;
    public Object f1546g;
    public Object h;

    public u(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.f1544e = xVar;
        this.f1543c = 15000L;
        this.h = new d3.y();
        this.f1546g = h2.g0.f13755a;
    }

    public static u c(android.support.v4.media.session.a0 a0Var, i2 i2Var) {
        int i7;
        long nativeSessionNew;
        q qVar = (q) a0Var.f1676b;
        long k10 = DictationAsr.k(qVar);
        if (k10 == 0) {
            return null;
        }
        u uVar = new u(a0Var, i2Var);
        String a10 = qVar.a((String) a0Var.f1677c);
        String str = a10.split(",")[0];
        if (bz.o() == 0) {
            i7 = 2;
        } else {
            i7 = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, str, i7);
        uVar.f1543c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.T(qVar);
            return null;
        }
        return uVar;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.f1543c;
        if (j3 != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.f1543c);
            this.f1543c = 0L;
            DictationAsr.T((q) this.f1544e);
        }
    }

    public void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.u.b(java.lang.String):void");
    }

    public u(android.support.v4.media.session.a0 a0Var, i2 i2Var) {
        this.f1546g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.f1544e = (q) a0Var.f1676b;
        this.f1545f = i2Var;
    }
}

package ai;

import android.content.Context;
import org.telegram.ui.Dictation.DictationAsr;
public final class w {
    public boolean f1599a;
    public boolean f1600b;
    public long f1601c;
    public final Object d;
    public final Object f1602e;
    public Object f1603f;
    public Object f1604g;
    public Object h;

    public w(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.f1602e = xVar;
        this.f1601c = 15000L;
        this.h = new d3.y();
        this.f1604g = h2.g0.f13448a;
    }

    public static w c(android.support.v4.media.session.a0 a0Var, n2 n2Var) {
        long nativeSessionNew;
        long k10 = DictationAsr.k((s) a0Var.f1706b);
        if (k10 == 0) {
            return null;
        }
        w wVar = new w(a0Var, n2Var);
        String str = (String) a0Var.f1707c;
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, str, str.split(",")[0]);
        wVar.f1601c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.M((s) a0Var.f1706b);
            return null;
        }
        return wVar;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.f1601c;
        if (j3 != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.f1601c);
            this.f1601c = 0L;
            DictationAsr.M((s) this.f1602e);
        }
    }

    public void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.w.b(java.lang.String):void");
    }

    public w(android.support.v4.media.session.a0 a0Var, n2 n2Var) {
        this.f1604g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.f1602e = (s) a0Var.f1706b;
        this.f1603f = n2Var;
    }
}

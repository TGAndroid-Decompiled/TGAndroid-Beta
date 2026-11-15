package ai;

import android.content.Context;
import org.telegram.ui.Dictation.DictationAsr;
public final class x {
    public boolean f1608a;
    public boolean f1609b;
    public long f1610c;
    public final Object d;
    public final Object f1611e;
    public Object f1612f;
    public Object f1613g;
    public Object h;

    public x(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.f1611e = xVar;
        this.f1610c = 15000L;
        this.h = new d3.y();
        this.f1613g = h2.g0.f13448a;
    }

    public static x c(android.support.v4.media.session.a0 a0Var, o2 o2Var) {
        long nativeSessionNew;
        long k10 = DictationAsr.k((t) a0Var.f1713b);
        if (k10 == 0) {
            return null;
        }
        x xVar = new x(a0Var, o2Var);
        String str = (String) a0Var.f1714c;
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, str, str.split(",")[0]);
        xVar.f1610c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.M((t) a0Var.f1713b);
            return null;
        }
        return xVar;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.f1610c;
        if (j3 != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.f1610c);
            this.f1610c = 0L;
            DictationAsr.M((t) this.f1611e);
        }
    }

    public void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.x.b(java.lang.String):void");
    }

    public x(android.support.v4.media.session.a0 a0Var, o2 o2Var) {
        this.f1613g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.f1611e = (t) a0Var.f1713b;
        this.f1612f = o2Var;
    }
}

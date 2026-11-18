package ai;

import android.content.Context;
import org.telegram.messenger.bz;
import org.telegram.ui.Dictation.DictationAsr;
public final class x {
    public boolean f1600a;
    public boolean f1601b;
    public long f1602c;
    public final Object d;
    public final Object f1603e;
    public Object f1604f;
    public Object f1605g;
    public Object h;

    public x(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.f1603e = xVar;
        this.f1602c = 15000L;
        this.h = new d3.y();
        this.f1605g = h2.g0.f13760a;
    }

    public static x c(android.support.v4.media.session.a0 a0Var, o2 o2Var) {
        int i7;
        long nativeSessionNew;
        long j3 = DictationAsr.j((t) a0Var.f1705b);
        if (j3 == 0) {
            return null;
        }
        x xVar = new x(a0Var, o2Var);
        String str = (String) a0Var.f1706c;
        String str2 = str.split(",")[0];
        if (bz.o() == 0) {
            i7 = 2;
        } else {
            i7 = 4;
        }
        nativeSessionNew = DictationAsr.nativeSessionNew(j3, str, str2, i7);
        xVar.f1602c = nativeSessionNew;
        if (nativeSessionNew == 0) {
            DictationAsr.M((t) a0Var.f1705b);
            return null;
        }
        return xVar;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.f1602c;
        if (j3 != 0) {
            nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
            b(nativeSessionFinish);
            DictationAsr.nativeSessionFree(this.f1602c);
            this.f1602c = 0L;
            DictationAsr.M((t) this.f1603e);
        }
    }

    public void b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.x.b(java.lang.String):void");
    }

    public x(android.support.v4.media.session.a0 a0Var, o2 o2Var) {
        this.f1605g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.f1603e = (t) a0Var.f1705b;
        this.f1604f = o2Var;
    }
}

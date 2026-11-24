package defpackage;

import android.text.style.URLSpan;
import android.view.View;
public final class bm1 implements q8c {
    public final byte a;
    public final Object b;
    public final Object c;

    public bm1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        byte b = this.a;
        gb2 gb2Var = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj3;
                View view = (View) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                k27 k27Var = mu1Var.v5;
                if (view instanceof gb2) {
                    gb2Var = (gb2) view;
                }
                mu1Var.f6(uRLSpan, false, k27Var, gb2Var);
                return Boolean.TRUE;
            default:
                return od8.d((View) obj, (String) obj3, (String) obj2, null, null);
        }
    }
}

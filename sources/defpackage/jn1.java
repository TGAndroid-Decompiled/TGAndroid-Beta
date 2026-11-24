package defpackage;

import android.text.style.URLSpan;
import android.view.View;
public final class jn1 implements rac {
    public final byte a;
    public final Object b;
    public final Object c;

    public jn1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        byte b = this.a;
        rc2 rc2Var = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj3;
                View view = (View) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                k47 k47Var = yv1Var.v5;
                if (view instanceof rc2) {
                    rc2Var = (rc2) view;
                }
                yv1Var.m6(uRLSpan, false, k47Var, rc2Var);
                return Boolean.TRUE;
            default:
                return qf8.d((View) obj, (String) obj3, (String) obj2, null, null);
        }
    }
}

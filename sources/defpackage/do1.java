package defpackage;

import android.text.style.URLSpan;
import android.view.View;
public final class do1 implements qcc {
    public final byte a;
    public final Object b;
    public final Object c;

    public do1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        byte b = this.a;
        wb2 wb2Var = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj3;
                View view = (View) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                r47 r47Var = zu1Var.v5;
                if (view instanceof wb2) {
                    wb2Var = (wb2) view;
                }
                zu1Var.m6(uRLSpan, false, r47Var, wb2Var);
                return Boolean.TRUE;
            default:
                return ch8.d((View) obj, (String) obj3, (String) obj2, null, null);
        }
    }
}

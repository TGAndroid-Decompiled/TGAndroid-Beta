package defpackage;

import android.view.KeyEvent;
public final class z02 implements nac {
    public final byte a;
    public final KeyEvent.Callback b;

    public z02(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                i22 i22Var = (i22) callback;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                k12 k12Var = i22Var.B2;
                k12Var.setText(charSequence);
                k12Var.w(charSequence.length(), charSequence.length());
                i22Var.i1();
                return;
            case 1:
                i22 i22Var2 = (i22) callback;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                m12 m12Var = i22Var2.M2;
                m12Var.setText(charSequence2);
                m12Var.w(charSequence2.length(), charSequence2.length());
                i22Var2.i1();
                return;
            default:
                tc1 tc1Var = (tc1) callback;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                jc1 jc1Var = tc1Var.f;
                jc1Var.setText((CharSequence) obj);
                jc1Var.d();
                jc1Var.k(true);
                hc1 hc1Var = tc1Var.d0;
                gm.r(hc1Var);
                hc1Var.run();
                return;
        }
    }
}

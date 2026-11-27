package defpackage;

import android.view.KeyEvent;
public final class e02 implements mcc {
    public final byte a;
    public final KeyEvent.Callback b;

    public e02(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                n12 n12Var = (n12) callback;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                p02 p02Var = n12Var.B2;
                p02Var.setText(charSequence);
                p02Var.w(charSequence.length(), charSequence.length());
                n12Var.j1();
                return;
            case 1:
                n12 n12Var2 = (n12) callback;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                r02 r02Var = n12Var2.M2;
                r02Var.setText(charSequence2);
                r02Var.w(charSequence2.length(), charSequence2.length());
                n12Var2.j1();
                return;
            default:
                ub1 ub1Var = (ub1) callback;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                kb1 kb1Var = ub1Var.f;
                kb1Var.setText((CharSequence) obj);
                kb1Var.d();
                kb1Var.k(true);
                hb1 hb1Var = ub1Var.d0;
                hl.r(hb1Var);
                hb1Var.run();
                return;
        }
    }
}

package defpackage;

import android.view.KeyEvent;
public final class mz1 implements m8c {
    public final byte a;
    public final KeyEvent.Callback b;

    public mz1(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                x02 x02Var = (x02) callback;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                zz1 zz1Var = x02Var.B2;
                zz1Var.setText(charSequence);
                zz1Var.w(charSequence.length(), charSequence.length());
                x02Var.i1();
                return;
            case 1:
                x02 x02Var2 = (x02) callback;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                b02 b02Var = x02Var2.M2;
                b02Var.setText(charSequence2);
                b02Var.w(charSequence2.length(), charSequence2.length());
                x02Var2.i1();
                return;
            default:
                mb1 mb1Var = (mb1) callback;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                cb1 cb1Var = mb1Var.f;
                cb1Var.setText((CharSequence) obj);
                cb1Var.d();
                cb1Var.k(true);
                za1 za1Var = mb1Var.d0;
                gl.r(za1Var);
                za1Var.run();
                return;
        }
    }
}

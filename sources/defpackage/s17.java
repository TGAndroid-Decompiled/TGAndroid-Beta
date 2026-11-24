package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class s17 extends s35 {
    public final byte S;
    public final KeyEvent.Callback T;

    public s17(KeyEvent.Callback callback, byte b) {
        super(true);
        this.S = b;
        this.T = callback;
    }

    @Override
    public final boolean A1(View view) {
        switch (this.S) {
            case 0:
                if (!(view instanceof gb2)) {
                    return false;
                }
                return !((gb2) view).getMessageObject().O3();
            case 1:
                return false;
            default:
                if (!(view instanceof gb2)) {
                    return false;
                }
                return !((gb2) view).getMessageObject().O3();
        }
    }

    @Override
    public final void a0(wg2 wg2Var, p49 p49Var) {
        switch (this.S) {
            case 1:
                boolean z = w01.a;
                try {
                    super.a0(wg2Var, p49Var);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    gl.c3(new vl6(this, (byte) 12));
                    return;
                }
            default:
                super.a0(wg2Var, p49Var);
                return;
        }
    }

    @Override
    public final int j(p49 p49Var) {
        switch (this.S) {
            case 2:
                return A0(p49Var);
            default:
                return super.j(p49Var);
        }
    }

    @Override
    public final int k(p49 p49Var) {
        switch (this.S) {
            case 2:
                return B0(p49Var);
            default:
                return super.k(p49Var);
        }
    }

    @Override
    public final int l(p49 p49Var) {
        switch (this.S) {
            case 2:
                return C0(p49Var);
            default:
                return super.l(p49Var);
        }
    }

    @Override
    public final boolean x0() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
            default:
                return super.x0();
            case 2:
                return true;
        }
    }

    @Override
    public final boolean z1(int i) {
        c27 d;
        byte b;
        byte b2;
        byte b3;
        byte b4 = this.S;
        KeyEvent.Callback callback = this.T;
        switch (b4) {
            case 0:
                ot7 ot7Var = (ot7) callback;
                ArrayList arrayList = ot7Var.u0;
                int size = (arrayList.size() - 1) - i;
                f27 f27Var = ot7Var.v0;
                if (f27Var != null && size >= 0 && size < arrayList.size() && (d = f27Var.d((k27) arrayList.get(size))) != null && d.a != d.b && (b = d.c) == d.d && b != 0) {
                    int size2 = f27Var.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c27 c27Var = (c27) f27Var.e.get(i2);
                        if (c27Var != d) {
                            byte b5 = c27Var.c;
                            byte b6 = d.c;
                            if (b5 <= b6 && c27Var.d >= b6) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 1:
                f37 f37Var = (f37) callback;
                k27 k27Var = (k27) f37Var.r.f.get(i);
                f27 c = f37Var.c(k27Var);
                if (c != null) {
                    ArrayList arrayList2 = c.e;
                    c27 d2 = c.d(k27Var);
                    if (d2.a != d2.b && (b2 = d2.c) == d2.d && b2 != 0) {
                        int size3 = arrayList2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            c27 c27Var2 = (c27) arrayList2.get(i3);
                            if (c27Var2 != d2) {
                                byte b7 = c27Var2.c;
                                byte b8 = d2.c;
                                if (b7 <= b8 && c27Var2.d >= b8) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            default:
                j47 j47Var = (j47) callback;
                k27 k27Var2 = (k27) j47Var.N.get((A() - 1) - i);
                f27 j = j47Var.j(k27Var2);
                if (j != null) {
                    ArrayList arrayList3 = j.e;
                    c27 d3 = j.d(k27Var2);
                    if (d3.a != d3.b && (b3 = d3.c) == d3.d && b3 != 0) {
                        int size4 = arrayList3.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            c27 c27Var3 = (c27) arrayList3.get(i4);
                            if (c27Var3 != d3) {
                                byte b9 = c27Var3.c;
                                byte b10 = d3.c;
                                if (b9 <= b10 && c27Var3.d >= b10) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
        }
    }
}

package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class s37 extends r55 {
    public final byte S;
    public final KeyEvent.Callback T;

    public s37(KeyEvent.Callback callback, byte b) {
        super(true);
        this.S = b;
        this.T = callback;
    }

    @Override
    public final boolean A1(View view) {
        switch (this.S) {
            case 0:
                if (!(view instanceof rc2)) {
                    return false;
                }
                return !((rc2) view).getMessageObject().O3();
            case 1:
                return false;
            default:
                if (!(view instanceof rc2)) {
                    return false;
                }
                return !((rc2) view).getMessageObject().O3();
        }
    }

    @Override
    public final void a0(ki2 ki2Var, r69 r69Var) {
        switch (this.S) {
            case 1:
                boolean z = e21.a;
                try {
                    super.a0(ki2Var, r69Var);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    gm.c3(new pg6(this, (byte) 19));
                    return;
                }
            default:
                super.a0(ki2Var, r69Var);
                return;
        }
    }

    @Override
    public final int j(r69 r69Var) {
        switch (this.S) {
            case 2:
                return A0(r69Var);
            default:
                return super.j(r69Var);
        }
    }

    @Override
    public final int k(r69 r69Var) {
        switch (this.S) {
            case 2:
                return B0(r69Var);
            default:
                return super.k(r69Var);
        }
    }

    @Override
    public final int l(r69 r69Var) {
        switch (this.S) {
            case 2:
                return C0(r69Var);
            default:
                return super.l(r69Var);
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
        c47 d;
        byte b;
        byte b2;
        byte b3;
        byte b4 = this.S;
        KeyEvent.Callback callback = this.T;
        switch (b4) {
            case 0:
                pv7 pv7Var = (pv7) callback;
                ArrayList arrayList = pv7Var.u0;
                int size = (arrayList.size() - 1) - i;
                f47 f47Var = pv7Var.v0;
                if (f47Var != null && size >= 0 && size < arrayList.size() && (d = f47Var.d((k47) arrayList.get(size))) != null && d.a != d.b && (b = d.c) == d.d && b != 0) {
                    int size2 = f47Var.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c47 c47Var = (c47) f47Var.e.get(i2);
                        if (c47Var != d) {
                            byte b5 = c47Var.c;
                            byte b6 = d.c;
                            if (b5 <= b6 && c47Var.d >= b6) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 1:
                f57 f57Var = (f57) callback;
                k47 k47Var = (k47) f57Var.r.f.get(i);
                f47 c = f57Var.c(k47Var);
                if (c != null) {
                    ArrayList arrayList2 = c.e;
                    c47 d2 = c.d(k47Var);
                    if (d2.a != d2.b && (b2 = d2.c) == d2.d && b2 != 0) {
                        int size3 = arrayList2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            c47 c47Var2 = (c47) arrayList2.get(i3);
                            if (c47Var2 != d2) {
                                byte b7 = c47Var2.c;
                                byte b8 = d2.c;
                                if (b7 <= b8 && c47Var2.d >= b8) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            default:
                j67 j67Var = (j67) callback;
                k47 k47Var2 = (k47) j67Var.N.get((A() - 1) - i);
                f47 j = j67Var.j(k47Var2);
                if (j != null) {
                    ArrayList arrayList3 = j.e;
                    c47 d3 = j.d(k47Var2);
                    if (d3.a != d3.b && (b3 = d3.c) == d3.d && b3 != 0) {
                        int size4 = arrayList3.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            c47 c47Var3 = (c47) arrayList3.get(i4);
                            if (c47Var3 != d3) {
                                byte b9 = c47Var3.c;
                                byte b10 = d3.c;
                                if (b9 <= b10 && c47Var3.d >= b10) {
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

package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
public final class mf5 extends x1 {
    public final byte a;
    public final gl0 b;
    public final Serializable c;

    public mf5() {
        this.a = (byte) 1;
        this.b = new ui6();
        this.c = new ArrayList();
    }

    @Override
    public final void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public final void d() {
        int i;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char charAt = charSequence.charAt(i2);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        if (i2 == -1) {
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < size + 1; i++) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((hp5) this.b).g = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final gl0 e() {
        byte b = this.a;
        gl0 gl0Var = this.b;
        switch (b) {
            case 0:
                return (lf5) gl0Var;
            default:
                return (hp5) gl0Var;
        }
    }

    @Override
    public final void g(qp5 qp5Var) {
        switch (this.a) {
            case 0:
                qp5Var.a((String) this.c, (lf5) this.b);
                return;
            default:
                return;
        }
    }

    @Override
    public final il2 h(fq3 fq3Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (fq3Var.g >= 4) {
                    return new il2(-1, fq3Var.c + 4, false);
                }
                if (!fq3Var.h) {
                    return null;
                }
                return il2.a(fq3Var.e);
        }
    }

    public mf5(int i, String str) {
        this.a = (byte) 0;
        ?? ui6Var = new ui6();
        this.b = ui6Var;
        ui6Var.g = i;
        this.c = str;
    }
}

package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
public final class od5 extends x1 {
    public final byte a;
    public final gk0 b;
    public final Serializable c;

    public od5() {
        this.a = (byte) 1;
        this.b = new tg6();
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
                ((hn5) this.b).g = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final gk0 e() {
        byte b = this.a;
        gk0 gk0Var = this.b;
        switch (b) {
            case 0:
                return (nd5) gk0Var;
            default:
                return (hn5) gk0Var;
        }
    }

    @Override
    public final void g(qn5 qn5Var) {
        switch (this.a) {
            case 0:
                qn5Var.a((String) this.c, (nd5) this.b);
                return;
            default:
                return;
        }
    }

    @Override
    public final vj2 h(vo3 vo3Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (vo3Var.g >= 4) {
                    return new vj2(-1, vo3Var.c + 4, false);
                }
                if (!vo3Var.h) {
                    return null;
                }
                return vj2.a(vo3Var.e);
        }
    }

    public od5(int i, String str) {
        this.a = (byte) 0;
        ?? tg6Var = new tg6();
        this.b = tg6Var;
        tg6Var.g = i;
        this.c = str;
    }
}

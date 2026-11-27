package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
public final class pf5 extends y1 {
    public final byte a;
    public final hk0 b;
    public final Serializable c;

    public pf5() {
        this.a = (byte) 1;
        this.b = new yi6();
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
                ((kp5) this.b).g = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final hk0 e() {
        byte b = this.a;
        hk0 hk0Var = this.b;
        switch (b) {
            case 0:
                return (of5) hk0Var;
            default:
                return (kp5) hk0Var;
        }
    }

    @Override
    public final void g(tp5 tp5Var) {
        switch (this.a) {
            case 0:
                tp5Var.a((String) this.c, (of5) this.b);
                return;
            default:
                return;
        }
    }

    @Override
    public final qk2 h(mp3 mp3Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (mp3Var.g >= 4) {
                    return new qk2(-1, mp3Var.c + 4, false);
                }
                if (!mp3Var.h) {
                    return null;
                }
                return qk2.a(mp3Var.e);
        }
    }

    public pf5(int i, String str) {
        this.a = (byte) 0;
        ?? yi6Var = new yi6();
        this.b = yi6Var;
        yi6Var.g = i;
        this.c = str;
    }
}

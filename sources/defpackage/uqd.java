package defpackage;

import java.util.Arrays;
public final class uqd {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public uqd(String str) {
        this.a = (byte) 4;
        wm9 wm9Var = new wm9((byte) 28, false);
        this.c = wm9Var;
        this.d = wm9Var;
        this.b = str;
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                wm9 wm9Var = (wm9) ((wm9) this.c).d;
                String str = "";
                while (wm9Var != null) {
                    Object obj = wm9Var.c;
                    sb.append(str);
                    String str2 = (String) wm9Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    wm9Var = (wm9) wm9Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}

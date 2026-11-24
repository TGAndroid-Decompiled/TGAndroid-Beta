package defpackage;

import java.util.Arrays;
import java.util.List;
public final class t11 extends u11 {
    public static final List c = Arrays.asList(new t11((byte) 2), new t11((byte) 3), new t11((byte) 4), new t11((byte) 1), new t11((byte) 0));
    public final byte b;

    public t11(byte b) {
        this.b = b;
    }

    public static t11 o(int i) {
        List list = c;
        if (i >= 0 && i <= list.size()) {
            return (t11) list.get(i);
        }
        zo4.m("Shape type must be in range from 0 to ", list.size() - 1, ", but got ", i);
        return null;
    }

    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final int d() {
        switch (this.b) {
            case 0:
                return 2131232536;
            case 1:
                return 2131232259;
            case 2:
                return 2131232537;
            case 3:
                return 2131232542;
            default:
                return 2131232544;
        }
    }

    @Override
    public final String h(int i) {
        if (i != 0 && i != 1) {
            if (i != 2) {
                return null;
            }
            return "brush";
        }
        return "shape";
    }

    public final int l() {
        switch (this.b) {
            case 0:
                return 2131232536;
            case 1:
                return 2131232260;
            case 2:
                return 2131232538;
            case 3:
                return 2131232543;
            default:
                return 2131232545;
        }
    }

    public final String m() {
        switch (this.b) {
            case 0:
                return jb6.M0(2131747409, null);
            case 1:
                return jb6.M0(2131747407, null);
            case 2:
                return jb6.M0(2131747406, null);
            case 3:
                return jb6.M0(2131747395, null);
            default:
                return jb6.M0(2131747394, null);
        }
    }

    public final int n() {
        switch (this.b) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 0;
            case 3:
                return 1;
            default:
                return 2;
        }
    }
}

package defpackage;

import java.util.Arrays;
import java.util.List;
public final class u01 extends v01 {
    public static final List c = Arrays.asList(new u01((byte) 2), new u01((byte) 3), new u01((byte) 4), new u01((byte) 1), new u01((byte) 0));
    public final byte b;

    public u01(byte b) {
        this.b = b;
    }

    public static u01 o(int i) {
        List list = c;
        if (i >= 0 && i <= list.size()) {
            return (u01) list.get(i);
        }
        xi4.m("Shape type must be in range from 0 to ", list.size() - 1, ", but got ", i);
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
                return 2131232535;
            case 1:
                return 2131232258;
            case 2:
                return 2131232536;
            case 3:
                return 2131232541;
            default:
                return 2131232543;
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
                return 2131232535;
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

    public final String m() {
        switch (this.b) {
            case 0:
                return ob6.M0(2131747403, null);
            case 1:
                return ob6.M0(2131747401, null);
            case 2:
                return ob6.M0(2131747400, null);
            case 3:
                return ob6.M0(2131747389, null);
            default:
                return ob6.M0(2131747388, null);
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

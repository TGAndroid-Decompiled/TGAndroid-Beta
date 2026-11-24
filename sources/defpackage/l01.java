package defpackage;

import java.util.Arrays;
import java.util.List;
public final class l01 extends m01 {
    public static final List c = Arrays.asList(new l01((byte) 2), new l01((byte) 3), new l01((byte) 4), new l01((byte) 1), new l01((byte) 0));
    public final byte b;

    public l01(byte b) {
        this.b = b;
    }

    public static l01 o(int i) {
        List list = c;
        if (i >= 0 && i <= list.size()) {
            return (l01) list.get(i);
        }
        wn4.k("Shape type must be in range from 0 to ", list.size() - 1, ", but got ", i);
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
                return 2131232524;
            case 1:
                return 2131232258;
            case 2:
                return 2131232525;
            case 3:
                return 2131232530;
            default:
                return 2131232532;
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
                return 2131232524;
            case 1:
                return 2131232259;
            case 2:
                return 2131232526;
            case 3:
                return 2131232531;
            default:
                return 2131232533;
        }
    }

    public final String m() {
        switch (this.b) {
            case 0:
                return k96.M0(2131747483, null);
            case 1:
                return k96.M0(2131747481, null);
            case 2:
                return k96.M0(2131747480, null);
            case 3:
                return k96.M0(2131747469, null);
            default:
                return k96.M0(2131747468, null);
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

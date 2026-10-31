package ig;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.cd;
public final class g extends h {
    public static final List f8308c = Arrays.asList(new g(2), new g(3), new g(4), new g(1), new g(0));
    public final int f8309b;

    public g(int i10) {
        this.f8309b = i10;
    }

    public static g p(int i10) {
        List list = f8308c;
        if (i10 >= 0 && i10 <= list.size()) {
            return (g) list.get(i10);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final int e() {
        switch (this.f8309b) {
            case 0:
                return 2131232518;
            case 1:
                return 2131232252;
            case 2:
                return 2131232519;
            case 3:
                return 2131232524;
            default:
                return 2131232526;
        }
    }

    @Override
    public final String i(int i10) {
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return "brush";
        }
        return "shape";
    }

    public final int m() {
        switch (this.f8309b) {
            case 0:
                return 2131232518;
            case 1:
                return 2131232253;
            case 2:
                return 2131232520;
            case 3:
                return 2131232525;
            default:
                return 2131232527;
        }
    }

    public final String n() {
        switch (this.f8309b) {
            case 0:
                return cd.L0(2131747692, null);
            case 1:
                return cd.L0(2131747690, null);
            case 2:
                return cd.L0(2131747689, null);
            case 3:
                return cd.L0(2131747678, null);
            default:
                return cd.L0(2131747677, null);
        }
    }

    public final int o() {
        switch (this.f8309b) {
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

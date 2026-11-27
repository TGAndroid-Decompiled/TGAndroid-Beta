package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;
public final class yf0 implements hcc {
    public final byte a;
    public final Object b;

    public yf0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((e) obj).getSimpleMenuOverlay();
            case 1:
                return Boolean.valueOf(((EditTextBoldCursor) obj).w());
            case 2:
                return ((yn5) obj).getCloseIntoObject();
            case 3:
                return Boolean.valueOf(((xt3) obj).w());
            case 4:
                return ((ProfileActivity) obj).getSimpleMenuOverlay();
            case 5:
                return ((er9) obj).K;
            default:
                return ((wua) obj).j();
        }
    }
}

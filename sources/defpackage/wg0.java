package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;
public final class wg0 implements iac {
    public final byte a;
    public final Object b;

    public wg0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((d) obj).getSimpleMenuOverlay();
            case 1:
                return Boolean.valueOf(((EditTextBoldCursor) obj).w());
            case 2:
                return ((vn5) obj).getCloseIntoObject();
            case 3:
                return Boolean.valueOf(((qu3) obj).w());
            case 4:
                return ((ProfileActivity) obj).getSimpleMenuOverlay();
            case 5:
                return ((pp9) obj).K;
            default:
                return ((wsa) obj).j();
        }
    }
}

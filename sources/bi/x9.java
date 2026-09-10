package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zp;
public final class x9 extends zp {
    public final int f3930i = 0;

    public x9(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f3930i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f29782b * 2.0f) + this.f29781a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f3930i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f29782b * 2.0f) + this.f29781a);
        }
    }

    public x9(int i10) {
        super(i10);
    }
}

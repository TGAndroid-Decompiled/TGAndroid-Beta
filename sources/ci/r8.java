package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.up;
public final class r8 extends up {
    public final int f5460i = 0;

    public r8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f5460i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28847b * 2.0f) + this.f28846a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f5460i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28847b * 2.0f) + this.f28846a);
        }
    }

    public r8(int i10) {
        super(i10);
    }
}

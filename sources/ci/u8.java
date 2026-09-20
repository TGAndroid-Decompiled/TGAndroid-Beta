package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tp;
public final class u8 extends tp {
    public final int f5634i = 0;

    public u8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f5634i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28412b * 2.0f) + this.f28411a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f5634i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28412b * 2.0f) + this.f28411a);
        }
    }

    public u8(int i10) {
        super(i10);
    }
}

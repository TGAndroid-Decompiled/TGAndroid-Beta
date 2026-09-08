package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sp;
public final class u8 extends sp {
    public final int f8284i = 0;

    public u8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f8284i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f30410b * 2.0f) + this.f30409a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f8284i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f30410b * 2.0f) + this.f30409a);
        }
    }

    public u8(int i10) {
        super(i10);
    }
}

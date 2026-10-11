package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jq;
public final class r8 extends jq {
    public final int f5909i = 0;

    public r8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f5909i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f27808b * 2.0f) + this.f27807a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f5909i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f27808b * 2.0f) + this.f27807a);
        }
    }

    public r8(int i10) {
        super(i10);
    }
}

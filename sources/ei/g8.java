package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eq;
public final class g8 extends eq {
    public final int f9082i = 0;

    public g8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f9082i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f26025b * 2.0f) + this.f26024a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f9082i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f26025b * 2.0f) + this.f26024a);
        }
    }

    public g8(int i10) {
        super(i10);
    }
}

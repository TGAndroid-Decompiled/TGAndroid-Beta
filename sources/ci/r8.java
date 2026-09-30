package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wp;
public final class r8 extends wp {
    public final int f5469i = 0;

    public r8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f5469i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f30027b * 2.0f) + this.f30026a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f5469i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f30027b * 2.0f) + this.f30026a);
        }
    }

    public r8(int i10) {
        super(i10);
    }
}

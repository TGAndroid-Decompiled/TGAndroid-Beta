package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gq;
public final class c8 extends gq {
    public final int f10615i = 0;

    public c8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f10615i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28675b * 2.0f) + this.f28674a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f10615i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28675b * 2.0f) + this.f28674a);
        }
    }

    public c8(int i10) {
        super(i10);
    }
}

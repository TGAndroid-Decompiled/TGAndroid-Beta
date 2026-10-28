package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gq;
public final class c8 extends gq {
    public final int f10614i = 0;

    public c8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f10614i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28714b * 2.0f) + this.f28713a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f10614i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28714b * 2.0f) + this.f28713a);
        }
    }

    public c8(int i10) {
        super(i10);
    }
}

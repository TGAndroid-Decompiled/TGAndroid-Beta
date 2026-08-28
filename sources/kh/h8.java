package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jp;
public final class h8 extends jp {
    public final int f15400i = 0;

    public h8(float f10, float f11, int i9) {
        super(f10, f11, i9);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f15400i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f29811b * 2.0f) + this.f29810a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f15400i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f29811b * 2.0f) + this.f29810a);
        }
    }

    public h8(int i9) {
        super(i9);
    }
}

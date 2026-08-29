package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.np;
public final class v7 extends np {
    public final int f18760i = 0;

    public v7(float f9, float f10, int i10) {
        super(f9, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f18760i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f31105b * 2.0f) + this.f31104a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f18760i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f31105b * 2.0f) + this.f31104a);
        }
    }

    public v7(int i10) {
        super(i10);
    }
}

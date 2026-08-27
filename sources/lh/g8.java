package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hp;

public final class g8 extends hp {

    public final int f16040i = 0;

    public g8(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f16040i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f29071b * 2.0f) + this.f29070a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f16040i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f29071b * 2.0f) + this.f29070a);
        }
    }

    public g8(int i10) {
        super(i10);
    }
}

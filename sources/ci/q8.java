package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wp;
public final class q8 extends wp {
    public final int f5795i = 0;

    public q8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f5795i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f32590b * 2.0f) + this.f32589a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f5795i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f32590b * 2.0f) + this.f32589a);
        }
    }

    public q8(int i10) {
        super(i10);
    }
}

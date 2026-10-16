package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gq;
public final class q8 extends gq {
    public final int f7653i = 0;

    public q8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f7653i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f25085b * 2.0f) + this.f25084a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f7653i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f25085b * 2.0f) + this.f25084a);
        }
    }

    public q8(int i10) {
        super(i10);
    }
}

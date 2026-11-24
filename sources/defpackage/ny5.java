package defpackage;

import org.telegram.ui.LaunchActivity;
public final class ny5 implements tz7 {
    public final byte a;
    public final y0a b;

    public ny5(y0a y0aVar, byte b) {
        this.a = b;
        this.b = y0aVar;
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        y0a y0aVar = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (i == 1) {
                    y0aVar.run();
                    return;
                }
                return;
            default:
                if (i == 1) {
                    y0aVar.run();
                    return;
                }
                return;
        }
    }
}

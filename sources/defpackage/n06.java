package defpackage;

import org.telegram.ui.LaunchActivity;
public final class n06 implements z28 {
    public final byte a;
    public final r4a b;

    public n06(r4a r4aVar, byte b) {
        this.a = b;
        this.b = r4aVar;
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        r4a r4aVar = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (i == 1) {
                    r4aVar.run();
                    return;
                }
                return;
            default:
                if (i == 1) {
                    r4aVar.run();
                    return;
                }
                return;
        }
    }
}

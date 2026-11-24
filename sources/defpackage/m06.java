package defpackage;

import org.telegram.ui.LaunchActivity;
public final class m06 implements w18 {
    public final byte a;
    public final a3a b;

    public m06(a3a a3aVar, byte b) {
        this.a = b;
        this.b = a3aVar;
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        a3a a3aVar = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (i == 1) {
                    a3aVar.run();
                    return;
                }
                return;
            default:
                if (i == 1) {
                    a3aVar.run();
                    return;
                }
                return;
        }
    }
}

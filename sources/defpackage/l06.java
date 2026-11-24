package defpackage;

import org.telegram.ui.LaunchActivity;
public final class l06 implements qac {
    public final byte a;
    public final a3a b;

    public l06(a3a a3aVar, byte b) {
        this.a = b;
        this.b = a3aVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        a3a a3aVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (a3aVar != null && "paid".equals(str)) {
                    a3aVar.run();
                    return;
                }
                return;
            default:
                if (a3aVar != null && "paid".equals(str)) {
                    a3aVar.run();
                    return;
                }
                return;
        }
    }
}

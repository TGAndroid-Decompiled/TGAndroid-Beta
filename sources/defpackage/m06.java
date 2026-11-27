package defpackage;

import org.telegram.ui.LaunchActivity;
public final class m06 implements pcc {
    public final byte a;
    public final r4a b;

    public m06(r4a r4aVar, byte b) {
        this.a = b;
        this.b = r4aVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        r4a r4aVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (r4aVar != null && "paid".equals(str)) {
                    r4aVar.run();
                    return;
                }
                return;
            default:
                if (r4aVar != null && "paid".equals(str)) {
                    r4aVar.run();
                    return;
                }
                return;
        }
    }
}

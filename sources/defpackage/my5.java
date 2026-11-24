package defpackage;

import org.telegram.ui.LaunchActivity;
public final class my5 implements p8c {
    public final byte a;
    public final y0a b;

    public my5(y0a y0aVar, byte b) {
        this.a = b;
        this.b = y0aVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        y0a y0aVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (y0aVar != null && "paid".equals(str)) {
                    y0aVar.run();
                    return;
                }
                return;
            default:
                if (y0aVar != null && "paid".equals(str)) {
                    y0aVar.run();
                    return;
                }
                return;
        }
    }
}

package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class gx4 implements pcc {
    public final byte a;
    public final e b;

    public gx4(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                ?? obj2 = new Object();
                obj2.a = true;
                eVar.showAsSheet((e) obj, obj2);
                return;
            default:
                Long l = (Long) obj;
                if (!eVar.isFinished) {
                    if (l != null && l.longValue() != Long.MAX_VALUE) {
                        eVar.presentFragment(ProfileActivity.Q2(l.longValue()), true);
                        return;
                    } else {
                        hl.c3(new pg6((byte) 17));
                        return;
                    }
                }
                return;
        }
    }
}

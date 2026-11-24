package defpackage;

import android.view.View;
import java.util.Iterator;
public final class ec2 implements dn {
    public final byte a;
    public final Object b;

    public ec2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void invalidate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((rc2) obj).r2();
                return;
            case 1:
                Iterator it = ((u85) obj).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                fz9 fz9Var = (fz9) obj;
                if (!oi5.b && fz9Var.getParent() != null) {
                    ((View) fz9Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}

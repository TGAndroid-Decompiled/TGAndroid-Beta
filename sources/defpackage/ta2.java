package defpackage;

import android.view.View;
import java.util.Iterator;
public final class ta2 implements dm {
    public final byte a;
    public final Object b;

    public ta2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void invalidate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((gb2) obj).r2();
                return;
            case 1:
                Iterator it = ((w65) obj).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                dx9 dx9Var = (dx9) obj;
                if (!pg5.b && dx9Var.getParent() != null) {
                    ((View) dx9Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}

package defpackage;

import android.view.View;
import java.util.Iterator;
public final class jb2 implements em {
    public final byte a;
    public final Object b;

    public jb2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void invalidate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wb2) obj).r2();
                return;
            case 1:
                Iterator it = ((y85) obj).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                w0a w0aVar = (w0a) obj;
                if (!ri5.b && w0aVar.getParent() != null) {
                    ((View) w0aVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}

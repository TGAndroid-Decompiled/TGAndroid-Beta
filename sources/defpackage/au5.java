package defpackage;

import android.graphics.Path;
import android.view.View;
public final class au5 implements pcc {
    public final byte a;
    public final float b;
    public final float c;
    public final View d;

    public au5(View view, float f, float f2, byte b) {
        this.a = b;
        this.d = view;
        this.b = f;
        this.c = f2;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        View view = this.d;
        switch (b) {
            case 0:
                ((bu5) view).y.addPath((Path) obj, f2, f);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((jja) view).n(f2, f);
                return;
        }
    }
}

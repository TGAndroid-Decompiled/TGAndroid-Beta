package defpackage;

import android.view.View;
public final class lt1 implements m8c {
    public final byte a;
    public final t7b b;
    public final View c;
    public final fx0 d;

    public lt1(fx0 fx0Var, t7b t7bVar, View view, byte b) {
        this.a = b;
        this.d = fx0Var;
        this.b = t7bVar;
        this.c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        m7b m7bVar = null;
        View view = this.c;
        t7b t7bVar = this.b;
        fx0 fx0Var = this.d;
        switch (b) {
            case 0:
                qt1 qt1Var = (qt1) fx0Var;
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l2 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    gl.d3(new aj1(qt1Var, l2, (byte) 23));
                    qt1Var.dismiss();
                    t7bVar.X(null);
                } else {
                    if ((view instanceof waa) && view.isAttachedToWindow()) {
                        m7bVar = o7b.b((waa) view);
                    }
                    t7bVar.X(m7bVar);
                }
                gl.d3(runnable);
                return;
            default:
                vqa vqaVar = (vqa) fx0Var;
                Long l3 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Long l4 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    gl.d3(new t7a(vqaVar, l4, (byte) 11));
                    t7bVar.X(null);
                    yoa yoaVar = vqaVar.U2;
                    if (yoaVar != null) {
                        yoaVar.dismiss();
                        vqaVar.U2 = null;
                    }
                } else {
                    if ((view instanceof waa) && view.isAttachedToWindow()) {
                        m7bVar = o7b.b((waa) view);
                    }
                    t7bVar.X(m7bVar);
                }
                gl.d3(runnable2);
                return;
        }
    }
}

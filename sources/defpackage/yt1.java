package defpackage;

import android.view.View;
public final class yt1 implements mcc {
    public final byte a;
    public final sbb b;
    public final View c;
    public final nx0 d;

    public yt1(nx0 nx0Var, sbb sbbVar, View view, byte b) {
        this.a = b;
        this.d = nx0Var;
        this.b = sbbVar;
        this.c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        lbb lbbVar = null;
        View view = this.c;
        sbb sbbVar = this.b;
        nx0 nx0Var = this.d;
        switch (b) {
            case 0:
                du1 du1Var = (du1) nx0Var;
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l2 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    hl.c3(new jj1(du1Var, l2, (byte) 23));
                    du1Var.dismiss();
                    sbbVar.X(null);
                } else {
                    if ((view instanceof nea) && view.isAttachedToWindow()) {
                        lbbVar = nbb.b((nea) view);
                    }
                    sbbVar.X(lbbVar);
                }
                hl.c3(runnable);
                return;
            default:
                wua wuaVar = (wua) nx0Var;
                Long l3 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Long l4 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    hl.c3(new kba(wuaVar, l4, (byte) 12));
                    sbbVar.X(null);
                    zsa zsaVar = wuaVar.U2;
                    if (zsaVar != null) {
                        zsaVar.dismiss();
                        wuaVar.U2 = null;
                    }
                } else {
                    if ((view instanceof nea) && view.isAttachedToWindow()) {
                        lbbVar = nbb.b((nea) view);
                    }
                    sbbVar.X(lbbVar);
                }
                hl.c3(runnable2);
                return;
        }
    }
}

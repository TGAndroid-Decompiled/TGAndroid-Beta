package ng;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import og.e0;
import og.f0;
import og.s;
import og.v;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.sk0;
import s4.c1;
public abstract class f extends sk0 {
    public final p6 f13776c;
    public boolean d;
    public k2 e;
    public TLRPC.TL_payments_checkedGiftCode f13777f;
    public String h;
    public p2 f13778n;

    public f(p6 p6Var) {
        this.f13776c = p6Var;
    }

    @Override
    public final boolean D(c1 c1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override
    public final int b() {
        return 5;
    }

    @Override
    public final int d(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 3;
                    if (i10 != 3) {
                        i11 = 4;
                        if (i10 != 4) {
                            return 5;
                        }
                    }
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: ng.f.t(s4.c1, int):void");
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        View vVar;
        Context context = viewGroup.getContext();
        p6 p6Var = this.f13776c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            vVar = new s(context, p6Var);
                        } else {
                            vVar = new View(context);
                        }
                    } else {
                        vVar = new og.a(context, p6Var);
                        vVar.setPadding(0, 0, 0, i0.L(14.0f));
                    }
                } else {
                    vVar = new f0(context, p6Var);
                }
            } else {
                vVar = new e0(context, p6Var);
            }
        } else {
            vVar = new v(context, p6Var);
        }
        return sc.e.o(vVar, vVar, -1, -2);
    }
}

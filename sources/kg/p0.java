package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.iz;
public abstract class p0 extends c {
    public final Context f17138x;
    public final e6 f17139y;

    public p0(Context context, e6 e6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.f17138x = context;
        this.f17139y = e6Var;
        new iz(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i3) {
        int i10;
        ArrayList arrayList = this.f16933f;
        if (arrayList.isEmpty() || i3 - 1 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f16933f;
        if (arrayList.isEmpty()) {
            if (this.f16937w) {
                return 3;
            }
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0 && !this.f16933f.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z10 = true;
        if (i11 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i3);
            v4 v4Var = (v4) view;
            if (H != null) {
                i10 = 2;
            } else {
                i10 = i3;
            }
            if (i3 == b() - 1) {
                z10 = false;
            }
            v4Var.a(H, i10, z10, false);
        } else if (i11 == 1) {
            ((x3) view).setText(bd.M0(2131748760, null));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View x3Var;
        e6 e6Var = this.f17139y;
        Context context = this.f17138x;
        if (i3 == 0) {
            x3Var = new v4(context, e6Var);
        } else {
            x3Var = new x3(context, e6Var);
        }
        return new u4.d1(x3Var);
    }
}

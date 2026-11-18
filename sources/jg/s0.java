package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.wz;
public abstract class s0 extends c {
    public final Context f17648x;
    public final i6 f17649y;

    public s0(Context context, i6 i6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.f17648x = context;
        this.f17649y = i6Var;
        new wz(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i7) {
        int i10;
        ArrayList arrayList = this.f17406f;
        if (arrayList.isEmpty() || i7 - 1 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f17406f;
        if (arrayList.isEmpty()) {
            if (this.f17410w) {
                return 3;
            }
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0 && !this.f17406f.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z10 = true;
        if (i11 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i7);
            w4 w4Var = (w4) view;
            if (H != null) {
                i10 = 2;
            } else {
                i10 = i7;
            }
            if (i7 == b() - 1) {
                z10 = false;
            }
            w4Var.a(H, i10, z10, false);
        } else if (i11 == 1) {
            ((y3) view).setText(gd.M0(2131748560, null));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View y3Var;
        i6 i6Var = this.f17649y;
        Context context = this.f17648x;
        if (i7 == 0) {
            y3Var = new w4(context, i6Var);
        } else {
            y3Var = new y3(context, i6Var);
        }
        return new v4.f1(y3Var);
    }
}

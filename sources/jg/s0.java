package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.pz;
public abstract class s0 extends c {
    public final Context f17265x;
    public final e6 f17266y;

    public s0(Context context, e6 e6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.f17265x = context;
        this.f17266y = e6Var;
        new pz(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i7) {
        int i10;
        ArrayList arrayList = this.f17023f;
        if (arrayList.isEmpty() || i7 - 1 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f17023f;
        if (arrayList.isEmpty()) {
            if (this.f17027w) {
                return 3;
            }
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0 && !this.f17023f.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z10 = true;
        if (i11 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i7);
            v4 v4Var = (v4) view;
            if (H != null) {
                i10 = 2;
            } else {
                i10 = i7;
            }
            if (i7 == b() - 1) {
                z10 = false;
            }
            v4Var.a(H, i10, z10, false);
        } else if (i11 == 1) {
            ((x3) view).setText(hd.M0(2131748752, null));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View x3Var;
        e6 e6Var = this.f17266y;
        Context context = this.f17265x;
        if (i7 == 0) {
            x3Var = new v4(context, e6Var);
        } else {
            x3Var = new x3(context, e6Var);
        }
        return new v4.e1(x3Var);
    }
}

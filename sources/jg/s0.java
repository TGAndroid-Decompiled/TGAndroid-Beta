package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.lz;
public abstract class s0 extends c {
    public final Context f16914x;
    public final h6 f16915y;

    public s0(Context context, h6 h6Var, boolean z9, boolean z10) {
        super(z9, z10);
        this.f16914x = context;
        this.f16915y = h6Var;
        new lz(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i7) {
        int i10;
        ArrayList arrayList = this.f16674f;
        if (arrayList.isEmpty() || i7 - 1 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f16674f;
        if (arrayList.isEmpty()) {
            if (this.f16678w) {
                return 3;
            }
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0 && !this.f16674f.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z9 = true;
        if (i11 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i7);
            v4 v4Var = (v4) view;
            if (H != null) {
                i10 = 2;
            } else {
                i10 = i7;
            }
            if (i7 == b() - 1) {
                z9 = false;
            }
            v4Var.a(H, i10, z9, false);
        } else if (i11 == 1) {
            ((x3) view).setText(id.M0(2131748752, null));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View x3Var;
        h6 h6Var = this.f16915y;
        Context context = this.f16914x;
        if (i7 == 0) {
            x3Var = new v4(context, h6Var);
        } else {
            x3Var = new x3(context, h6Var);
        }
        return new v4.d1(x3Var);
    }
}

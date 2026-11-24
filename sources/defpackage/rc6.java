package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class rc6 extends oh0 {
    public final Context x;
    public final ylb y;

    public rc6(ylb ylbVar, Context context, boolean z, boolean z2) {
        super(z, z2);
        this.x = context;
        this.y = ylbVar;
        new tk4(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i) {
        int i2;
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty() && i - 1 >= 0 && i2 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i2);
        }
        return null;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            if (this.w) {
                return 3;
            }
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int d(int i) {
        if (i == 0 && !this.f.isEmpty()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3 = u69Var.f;
        View view = u69Var.a;
        boolean z = true;
        if (i3 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i);
            tc6 tc6Var = (tc6) view;
            if (H != null) {
                i2 = 2;
            } else {
                i2 = i;
            }
            if (i == b() - 1) {
                z = false;
            }
            tc6Var.a(H, i2, z, false);
        } else if (i3 == 1) {
            ((l55) view).setText(jb6.M0(2131748509, null));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View l55Var;
        ylb ylbVar = this.y;
        Context context = this.x;
        if (i == 0) {
            l55Var = new tc6(context, ylbVar);
        } else {
            l55Var = new l55(context, ylbVar);
        }
        return new u69(l55Var);
    }
}

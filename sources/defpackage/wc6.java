package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class wc6 extends og0 {
    public final Context x;
    public final vnb y;

    public wc6(vnb vnbVar, Context context, boolean z, boolean z2) {
        super(z, z2);
        this.x = context;
        this.y = vnbVar;
        new tk4(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(f89 f89Var) {
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
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3 = f89Var.f;
        View view = f89Var.a;
        boolean z = true;
        if (i3 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i);
            yc6 yc6Var = (yc6) view;
            if (H != null) {
                i2 = 2;
            } else {
                i2 = i;
            }
            if (i == b() - 1) {
                z = false;
            }
            yc6Var.a(H, i2, z, false);
        } else if (i3 == 1) {
            ((p55) view).setText(ob6.M0(2131748506, null));
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View p55Var;
        vnb vnbVar = this.y;
        Context context = this.x;
        if (i == 0) {
            p55Var = new yc6(context, vnbVar);
        } else {
            p55Var = new p55(context, vnbVar);
        }
        return new f89(p55Var);
    }
}

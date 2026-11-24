package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class sa6 extends ng0 {
    public final Context x;
    public final wjb y;

    public sa6(wjb wjbVar, Context context, boolean z, boolean z2) {
        super(z, z2);
        this.x = context;
        this.y = wjbVar;
        new pi4(context, null).setIsSingleCell(true);
    }

    @Override
    public final boolean D(s49 s49Var) {
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
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3 = s49Var.f;
        View view = s49Var.a;
        boolean z = true;
        if (i3 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i);
            ua6 ua6Var = (ua6) view;
            if (H != null) {
                i2 = 2;
            } else {
                i2 = i;
            }
            if (i == b() - 1) {
                z = false;
            }
            ua6Var.a(H, i2, z, false);
        } else if (i3 == 1) {
            ((l35) view).setText(k96.M0(2131748560, null));
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View l35Var;
        wjb wjbVar = this.y;
        Context context = this.x;
        if (i == 0) {
            l35Var = new ua6(context, wjbVar);
        } else {
            l35Var = new l35(context, wjbVar);
        }
        return new s49(l35Var);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class pob extends q59 {
    public final Context c;
    public final rob d;

    public pob(rob robVar, Context context) {
        this.d = robVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        BlendMode blendMode;
        n08 n08Var = (n08) u69Var.a;
        rob robVar = this.d;
        n08Var.setPattern((TLRPC.TL_wallPaper) robVar.W0.get(i));
        n08Var.getImageReceiver().p1 = new PorterDuffColorFilter(robVar.l1, robVar.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = 0;
            if (robVar.b == 1) {
                int C0 = cmb.C0(cmb.Fe);
                long j = robVar.w.l;
                int i3 = (int) j;
                if (i3 == 0) {
                    if (j == 0) {
                        i2 = C0;
                    }
                } else {
                    i2 = i3;
                }
            } else if (robVar.D1 instanceof mtc) {
                i2 = robVar.e1;
            }
            if (i2 != 0 && robVar.n1 >= 0.0f) {
                ImageReceiver imageReceiver = robVar.z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.P(blendMode);
                return;
            }
            n08Var.getImageReceiver().P(null);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2 = this.d.J1;
        oob oobVar = new oob(this);
        ?? bf0Var = new bf0(this.c);
        bf0Var.H = new RectF();
        int i3 = z8c.t0;
        bf0Var.K = i3;
        bf0Var.setRoundRadius(gm.L(6.0f));
        bf0Var.V = i2;
        bf0Var.U = oobVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(bf0Var, null);
        bf0Var.I = radialProgress2;
        radialProgress2.p(gm.L(30.0f), gm.L(30.0f), gm.L(70.0f), gm.L(70.0f));
        bf0Var.R = new Paint(3);
        bf0Var.T = er3.q(i3).k();
        bf0Var.setOutlineProvider(new xj((byte) 7));
        bf0Var.setClipToOutline(true);
        return new u69(bf0Var);
    }
}

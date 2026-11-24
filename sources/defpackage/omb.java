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
public final class omb extends n39 {
    public final Context c;
    public final qmb d;

    public omb(qmb qmbVar, Context context) {
        this.d = qmbVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
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
    public final void t(s49 s49Var, int i) {
        BlendMode blendMode;
        ly7 ly7Var = (ly7) s49Var.a;
        qmb qmbVar = this.d;
        ly7Var.setPattern((TLRPC.TL_wallPaper) qmbVar.W0.get(i));
        ly7Var.getImageReceiver().p1 = new PorterDuffColorFilter(qmbVar.l1, qmbVar.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = 0;
            if (qmbVar.b == 1) {
                int C0 = bkb.C0(bkb.Fe);
                long j = qmbVar.w.l;
                int i3 = (int) j;
                if (i3 == 0) {
                    if (j == 0) {
                        i2 = C0;
                    }
                } else {
                    i2 = i3;
                }
            } else if (qmbVar.D1 instanceof krc) {
                i2 = qmbVar.e1;
            }
            if (i2 != 0 && qmbVar.n1 >= 0.0f) {
                ImageReceiver imageReceiver = qmbVar.z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.P(blendMode);
                return;
            }
            ly7Var.getImageReceiver().P(null);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2 = this.d.J1;
        nmb nmbVar = new nmb(this);
        ?? be0Var = new be0(this.c);
        be0Var.H = new RectF();
        int i3 = y6c.t0;
        be0Var.K = i3;
        be0Var.setRoundRadius(gl.L(6.0f));
        be0Var.V = i2;
        be0Var.U = nmbVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(be0Var, null);
        be0Var.I = radialProgress2;
        radialProgress2.p(gl.L(30.0f), gl.L(30.0f), gl.L(70.0f), gl.L(70.0f));
        be0Var.R = new Paint(3);
        be0Var.T = up3.q(i3).k();
        be0Var.setOutlineProvider(new xi((byte) 7));
        be0Var.setClipToOutline(true);
        return new s49(be0Var);
    }
}

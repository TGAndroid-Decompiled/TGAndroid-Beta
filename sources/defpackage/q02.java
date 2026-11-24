package defpackage;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class q02 extends s02 {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final x02 d;

    public q02(x02 x02Var, Context context) {
        super(context);
        this.d = x02Var;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = x02.G4;
        wjb wjbVar = x02Var.J0;
        ox4 ox4Var = new ox4(context);
        ox4Var.d = wjbVar;
        ox4Var.R = true;
        TextView textView = ox4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        ox4Var.b.setVisibility(8);
        ox4Var.b(false);
        be0 be0Var = new be0(context);
        ox4Var.c = be0Var;
        ox4Var.addView(be0Var, nme.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        ox4Var.x = bkb.v0(bkb.Sl, wjbVar);
        ox4Var.s = bkb.v0(bkb.Ql, wjbVar);
        ox4Var.w = bkb.v0(bkb.Rl, wjbVar);
        ox4Var.a();
        this.a = ox4Var;
        ox4Var.getBackupImageView().a.h1 = new qm0((byte) 24);
        addView(this.a, nme.c(-1.0f, -1));
    }

    public final void a(boolean z) {
        boolean z2;
        if (this.c != null && (-this.b.id) == this.d.T2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a.f(z2, z);
        oy8 y = this.a.getBackupImageView().getImageReceiver().y();
        if (z) {
            if (z2 && y != null) {
                y.F(0);
                y.K(-1);
                y.O(false, 0.0f);
                y.start();
            }
        } else if (y != null) {
            y.stop();
            y.O(false, 0.0f);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}

package defpackage;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class g12 extends i12 {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final n12 d;

    public g12(n12 n12Var, Context context) {
        super(context);
        this.d = n12Var;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = n12.G4;
        vnb vnbVar = n12Var.J0;
        uz4 uz4Var = new uz4(context);
        uz4Var.d = vnbVar;
        uz4Var.R = true;
        TextView textView = uz4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        uz4Var.b.setVisibility(8);
        uz4Var.b(false);
        de0 de0Var = new de0(context);
        uz4Var.c = de0Var;
        uz4Var.addView(de0Var, tre.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        uz4Var.x = aob.v0(aob.Tl, vnbVar);
        uz4Var.s = aob.v0(aob.Rl, vnbVar);
        uz4Var.w = aob.v0(aob.Sl, vnbVar);
        uz4Var.a();
        this.a = uz4Var;
        uz4Var.getBackupImageView().a.h1 = new rm0((byte) 29);
        addView(this.a, tre.c(-1.0f, -1));
    }

    public final void a(boolean z) {
        boolean z2;
        if (this.c != null && (-this.b.id) == this.d.T2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a.f(z2, z);
        b29 y = this.a.getBackupImageView().getImageReceiver().y();
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

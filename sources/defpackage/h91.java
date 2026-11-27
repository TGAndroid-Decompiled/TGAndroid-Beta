package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class h91 extends FrameLayout implements snb {
    public final bv8 a;
    public final uv8 b;
    public TLRPC.Chat c;

    public h91(Context context) {
        super(context);
        int i;
        int L;
        String M0 = ob6.M0(2131743094, null);
        uv8 uv8Var = new uv8(context);
        this.b = uv8Var;
        int ceil = (int) Math.ceil(uv8Var.getPaint().measureText(M0));
        bv8 bv8Var = new bv8(context, null);
        this.a = bv8Var;
        bv8Var.O0 = true;
        bv8Var.G0 = true;
        if (ob6.a0) {
            i = hl.L(44.0f) + ceil;
        } else {
            i = 0;
        }
        if (ob6.a0) {
            L = 0;
        } else {
            L = hl.L(44.0f) + ceil;
        }
        bv8Var.setPadding(i, 0, L, 0);
        bv8Var.c0 = 0;
        bv8Var.d0 = -hl.L(4.0f);
        addView(bv8Var, tre.c(-1.0f, -1));
        uv8Var.setText(M0);
        uv8Var.setTextSize(1, 14.0f);
        yob.X(uv8Var, aob.Ji, null);
        uv8Var.setProgressColor(aob.w0(null, aob.Ei, false));
        int i2 = aob.Yl;
        int w0 = aob.w0(null, i2, false);
        aob.w0(null, aob.Hi, false);
        uv8Var.setBackground(rnb.e(w0, 16.0f));
        Drawable background = uv8Var.getBackground();
        uob M = yob.M(i2);
        uv8Var.setBackground(background);
        yob.j(uv8Var, background, M, null, null);
        uv8Var.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        addView(uv8Var, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setProgressColor(aob.w0(null, aob.Ei, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

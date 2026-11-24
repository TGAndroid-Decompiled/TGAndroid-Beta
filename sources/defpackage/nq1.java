package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nq1 extends e37 {
    public final yv1 f;

    public nq1(yv1 yv1Var, Context context, int i, k47 k47Var) {
        super(context);
        this.f = yv1Var;
        this.a = null;
        if (!k47Var.g4()) {
            k47Var.O4();
        }
        tk4 tk4Var = new tk4(context, null);
        this.c = tk4Var;
        tk4Var.e(cmb.F8, cmb.h6, -1);
        tk4Var.setViewType(13);
        tk4Var.setIsSingleCell(false);
        addView(tk4Var, qoe.c(-1.0f, -2));
        l66 l66Var = new l66(context, null);
        this.b = l66Var;
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(19);
        anb.X(l66Var, cmb.D8, null);
        anb.G(l66Var, cmb.Wc, null);
        l66Var.setEllipsize(TextUtils.TruncateAt.END);
        l66Var.setSingleLine();
        l66Var.setLines(1);
        l66Var.setMaxLines(1);
        addView(l66Var, qoe.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = oc7.r1(i).g1(-k47.B0(k47Var.k));
        tL_channels_getMessageAuthor.id = k47Var.e1();
        l66Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i).sendRequest(tL_channels_getMessageAuthor, new w22(this, i, (byte) 3));
        setBackground(cmb.Y(cmb.w0(null, cmb.H5, false), 6, 0));
        setEnabled(false);
    }
}

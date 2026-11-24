package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ap1 extends e17 {
    public final mu1 f;

    public ap1(mu1 mu1Var, Context context, int i, k27 k27Var) {
        super(context);
        this.f = mu1Var;
        this.a = null;
        if (!k27Var.g4()) {
            k27Var.O4();
        }
        pi4 pi4Var = new pi4(context, null);
        this.c = pi4Var;
        pi4Var.e(bkb.F8, bkb.h6, -1);
        pi4Var.setViewType(13);
        pi4Var.setIsSingleCell(false);
        addView(pi4Var, nme.c(-1.0f, -2));
        l46 l46Var = new l46(context, null);
        this.b = l46Var;
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(19);
        zkb.X(l46Var, bkb.D8, null);
        zkb.G(l46Var, bkb.Wc, null);
        l46Var.setEllipsize(TextUtils.TruncateAt.END);
        l46Var.setSingleLine();
        l46Var.setLines(1);
        l46Var.setMaxLines(1);
        addView(l46Var, nme.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = na7.q1(i).f1(-k27.B0(k27Var.k));
        tL_channels_getMessageAuthor.id = k27Var.e1();
        l46Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i).sendRequest(tL_channels_getMessageAuthor, new l12(this, i, (byte) 3));
        setBackground(bkb.Y(bkb.w0(null, bkb.H5, false), 6, 0));
        setEnabled(false);
    }
}

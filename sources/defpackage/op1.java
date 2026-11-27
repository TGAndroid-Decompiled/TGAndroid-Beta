package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class op1 extends l37 {
    public final zu1 f;

    public op1(zu1 zu1Var, Context context, int i, r47 r47Var) {
        super(context);
        this.f = zu1Var;
        this.a = null;
        if (!r47Var.g4()) {
            r47Var.O4();
        }
        tk4 tk4Var = new tk4(context, null);
        this.c = tk4Var;
        tk4Var.e(aob.G8, aob.i6, -1);
        tk4Var.setViewType(13);
        tk4Var.setIsSingleCell(false);
        addView(tk4Var, tre.c(-1.0f, -2));
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setTextSize(1, 14.0f);
        p66Var.setGravity(19);
        yob.X(p66Var, aob.E8, null);
        yob.G(p66Var, aob.Xc, null);
        p66Var.setEllipsize(TextUtils.TruncateAt.END);
        p66Var.setSingleLine();
        p66Var.setLines(1);
        p66Var.setMaxLines(1);
        addView(p66Var, tre.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = uc7.s1(i).h1(-r47.B0(r47Var.k));
        tL_channels_getMessageAuthor.id = r47Var.e1();
        p66Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i).sendRequest(tL_channels_getMessageAuthor, new b22(this, i, (byte) 3));
        setBackground(aob.Y(aob.w0(null, aob.I5, false), 6, 0));
        setEnabled(false);
    }
}

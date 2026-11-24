package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class z20 extends c30 {
    public final byte E;
    public final Context F;
    public final KeyEvent.Callback G;

    public z20(KeyEvent.Callback callback, Context context, Context context2, byte b) {
        super(context);
        this.E = b;
        this.G = callback;
        this.F = context2;
    }

    @Override
    public final TextView a() {
        byte b = this.E;
        KeyEvent.Callback callback = this.G;
        Context context = this.F;
        switch (b) {
            case 0:
                fl6 fl6Var = new fl6((Activity) context);
                anb.X(fl6Var, cmb.Ej, ((i30) callback).J0);
                fl6Var.setTextSize(1, 17.0f);
                fl6Var.setTypeface(gm.o());
                fl6Var.setEllipsize(TextUtils.TruncateAt.END);
                fl6Var.setSingleLine(true);
                return fl6Var;
            case 1:
                fl6 fl6Var2 = new fl6((Activity) context);
                i30 i30Var = (i30) callback;
                anb.X(fl6Var2, cmb.Ij, i30Var.J0);
                fl6Var2.setTextSize(1, 13.0f);
                fl6Var2.setEllipsize(TextUtils.TruncateAt.END);
                fl6Var2.setSingleLine(true);
                fl6Var2.setPadding(gm.L(6.0f), 0, gm.L(6.0f), gm.L(1.0f));
                int i = cmb.h6;
                fg0 Y = cmb.Y(cmb.v0(i, i30Var.J0), gm.L(4.0f), gm.L(4.0f));
                wmb M = anb.M(i);
                ylb ylbVar = i30Var.J0;
                fl6Var2.setBackground(Y);
                anb.j(fl6Var2, Y, null, M, ylbVar);
                fl6Var2.setOnClickListener(new t(this, fl6Var2, (byte) 21));
                return fl6Var2;
            default:
                fl6 fl6Var3 = new fl6(context);
                anb.X(fl6Var3, cmb.Ij, ((dx9) callback).O);
                fl6Var3.setTextSize(1, 12.0f);
                fl6Var3.setEllipsize(TextUtils.TruncateAt.END);
                fl6Var3.setSingleLine(true);
                fl6Var3.setPadding(gm.L(0.0f), 0, gm.L(0.0f), gm.L(0.0f));
                return fl6Var3;
        }
    }
}

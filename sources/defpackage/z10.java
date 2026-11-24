package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class z10 extends c20 {
    public final byte E;
    public final Context F;
    public final KeyEvent.Callback G;

    public z10(KeyEvent.Callback callback, Context context, Context context2, byte b) {
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
                cj6 cj6Var = new cj6((Activity) context);
                zkb.X(cj6Var, bkb.Ej, ((i20) callback).J0);
                cj6Var.setTextSize(1, 17.0f);
                cj6Var.setTypeface(gl.o());
                cj6Var.setEllipsize(TextUtils.TruncateAt.END);
                cj6Var.setSingleLine(true);
                return cj6Var;
            case 1:
                cj6 cj6Var2 = new cj6((Activity) context);
                i20 i20Var = (i20) callback;
                zkb.X(cj6Var2, bkb.Ij, i20Var.J0);
                cj6Var2.setTextSize(1, 13.0f);
                cj6Var2.setEllipsize(TextUtils.TruncateAt.END);
                cj6Var2.setSingleLine(true);
                cj6Var2.setPadding(gl.L(6.0f), 0, gl.L(6.0f), gl.L(1.0f));
                int i = bkb.h6;
                ff0 Y = bkb.Y(bkb.v0(i, i20Var.J0), gl.L(4.0f), gl.L(4.0f));
                vkb M = zkb.M(i);
                wjb wjbVar = i20Var.J0;
                cj6Var2.setBackground(Y);
                zkb.j(cj6Var2, Y, null, M, wjbVar);
                cj6Var2.setOnClickListener(new t(this, cj6Var2, (byte) 21));
                return cj6Var2;
            default:
                cj6 cj6Var3 = new cj6(context);
                zkb.X(cj6Var3, bkb.Ij, ((av9) callback).O);
                cj6Var3.setTextSize(1, 12.0f);
                cj6Var3.setEllipsize(TextUtils.TruncateAt.END);
                cj6Var3.setSingleLine(true);
                cj6Var3.setPadding(gl.L(0.0f), 0, gl.L(0.0f), gl.L(0.0f));
                return cj6Var3;
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ft7 extends gt7 {
    public final l7 M;

    public ft7(Context context) {
        super(context, null);
        l7 l7Var = new l7((byte) 5, context, this);
        this.M = l7Var;
        l7Var.setTextSize(1, 18.0f);
        anb.X(l7Var, cmb.F6, null);
        anb.D(l7Var, cmb.G6, null);
        l7Var.setBackground(null);
        l7Var.setSingleLine(true);
        l7Var.setInputType(1);
        l7Var.setTypeface(Typeface.DEFAULT);
        anb.l(l7Var, 30, cmb.k6, null);
        l7Var.setCursorWidth(1.5f);
        l7Var.setPadding(gm.L(15.0f), 0, gm.L(15.0f), 0);
        e(l7Var);
        addView(l7Var, qoe.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.M;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

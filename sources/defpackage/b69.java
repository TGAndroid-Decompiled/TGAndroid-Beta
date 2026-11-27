package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.CheckBoxSquare;
public final class b69 extends FrameLayout {
    public final m66 a;
    public final p66 b;
    public final CheckBoxSquare c;

    public b69(Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(checkBoxSquare, tre.d(18, 18.0f, i | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        m66 m66Var = new m66(this);
        this.a = m66Var;
        p66 p66Var = new p66(context, m66Var, vnbVar);
        this.b = p66Var;
        yob.X(p66Var, aob.G6, vnbVar);
        yob.G(p66Var, aob.J6, vnbVar);
        p66Var.setTextSize(1, 15.0f);
        p66Var.setMaxLines(2);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        p66Var.setGravity(i2 | 16);
        p66Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = ob6.a0;
        int i3 = (z ? 5 : 3) | 48;
        if (z) {
            f = 16.0f;
        } else {
            f = 58.0f;
        }
        if (z) {
            f2 = 58.0f;
        } else {
            f2 = 16.0f;
        }
        addView(p66Var, tre.d(-1, -1.0f, i3, f, 21.0f, f2, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.c;
    }

    public TextView getTextView() {
        return this.b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m66 m66Var = this.a;
        if (m66Var != null) {
            canvas.save();
            p66 p66Var = this.b;
            canvas.translate(p66Var.getLeft(), p66Var.getTop());
            if (m66Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z) {
        this.c.a(z, true);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.CheckBoxSquare;
public final class p49 extends FrameLayout {
    public final i66 a;
    public final l66 b;
    public final CheckBoxSquare c;

    public p49(Context context, ylb ylbVar) {
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
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(checkBoxSquare, qoe.d(18, 18.0f, i | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        i66 i66Var = new i66(this);
        this.a = i66Var;
        l66 l66Var = new l66(context, i66Var, ylbVar);
        this.b = l66Var;
        anb.X(l66Var, cmb.F6, ylbVar);
        anb.G(l66Var, cmb.I6, ylbVar);
        l66Var.setTextSize(1, 15.0f);
        l66Var.setMaxLines(2);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        l66Var.setGravity(i2 | 16);
        l66Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = jb6.a0;
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
        addView(l66Var, qoe.d(-1, -1.0f, i3, f, 21.0f, f2, 21.0f));
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
        i66 i66Var = this.a;
        if (i66Var != null) {
            canvas.save();
            l66 l66Var = this.b;
            canvas.translate(l66Var.getLeft(), l66Var.getTop());
            if (i66Var.g(canvas)) {
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

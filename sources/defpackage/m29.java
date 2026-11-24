package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.CheckBoxSquare;
public final class m29 extends FrameLayout {
    public final i46 a;
    public final l46 b;
    public final CheckBoxSquare c;

    public m29(Context context, wjb wjbVar) {
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
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(checkBoxSquare, nme.d(18, 18.0f, i | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        i46 i46Var = new i46(this);
        this.a = i46Var;
        l46 l46Var = new l46(context, i46Var, wjbVar);
        this.b = l46Var;
        zkb.X(l46Var, bkb.F6, wjbVar);
        zkb.G(l46Var, bkb.I6, wjbVar);
        l46Var.setTextSize(1, 15.0f);
        l46Var.setMaxLines(2);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        l46Var.setGravity(i2 | 16);
        l46Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = k96.a0;
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
        addView(l46Var, nme.d(-1, -1.0f, i3, f, 21.0f, f2, 21.0f));
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
        i46 i46Var = this.a;
        if (i46Var != null) {
            canvas.save();
            l46 l46Var = this.b;
            canvas.translate(l46Var.getLeft(), l46Var.getTop());
            if (i46Var.g(canvas)) {
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

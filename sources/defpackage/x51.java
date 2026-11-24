package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
public class x51 extends l66 {
    public final Path M;
    public final RectF N;
    public y51 O;
    public y51 P;

    public x51(Context context) {
        super(context, null);
        this.M = new Path();
        this.N = new RectF();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.P != null && getMeasuredWidth() > 0) {
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.P, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.P.a()) - gm.L(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.P = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y51 y51Var;
        Runnable runnable;
        y51 y51Var2;
        Layout layout;
        int action = motionEvent.getAction();
        float x = motionEvent.getX() - getPaddingLeft();
        int y = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y >= 0 && y < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y);
            Spanned spanned = (Spanned) getText();
            y51[] y51VarArr = (y51[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), y51.class);
            for (int i = 0; i < y51VarArr.length; i++) {
                y51Var = y51VarArr[i];
                int spanStart = spanned.getSpanStart(y51Var);
                int spanEnd = spanned.getSpanEnd(y51Var);
                Path path = this.M;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.N;
                path.computeBounds(rectF, true);
                if (rectF.contains(x, y)) {
                    break;
                }
            }
        }
        y51Var = null;
        if (action == 0) {
            this.O = y51Var;
            if (y51Var != null) {
                u51 u51Var = y51Var.e;
                if (u51Var == null) {
                    u51Var = new u51(this);
                    y51Var.e = u51Var;
                }
                u51Var.c(true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (y51Var2 = this.O) != null && y51Var2 != y51Var) {
                u51 u51Var2 = y51Var2.e;
                if (u51Var2 == null) {
                    u51Var2 = new u51(this);
                    y51Var2.e = u51Var2;
                }
                u51Var2.c(false);
                this.O = null;
            }
        } else {
            y51 y51Var3 = this.O;
            if (y51Var3 != null) {
                u51 u51Var3 = y51Var3.e;
                if (u51Var3 == null) {
                    u51Var3 = new u51(this);
                    y51Var3.e = u51Var3;
                }
                u51Var3.c(false);
                if (action == 1 && (runnable = this.O.d) != null) {
                    runnable.run();
                }
            }
            this.O = null;
        }
        if (this.O == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public x51(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.M = new Path();
        this.N = new RectF();
    }
}

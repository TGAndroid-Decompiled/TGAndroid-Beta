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
public class y41 extends p66 {
    public final Path M;
    public final RectF N;
    public z41 O;
    public z41 P;

    public y41(Context context) {
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
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.P.a()) - hl.L(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.P = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z41 z41Var;
        Runnable runnable;
        z41 z41Var2;
        Layout layout;
        int action = motionEvent.getAction();
        float x = motionEvent.getX() - getPaddingLeft();
        int y = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y >= 0 && y < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y);
            Spanned spanned = (Spanned) getText();
            z41[] z41VarArr = (z41[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), z41.class);
            for (int i = 0; i < z41VarArr.length; i++) {
                z41Var = z41VarArr[i];
                int spanStart = spanned.getSpanStart(z41Var);
                int spanEnd = spanned.getSpanEnd(z41Var);
                Path path = this.M;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.N;
                path.computeBounds(rectF, true);
                if (rectF.contains(x, y)) {
                    break;
                }
            }
        }
        z41Var = null;
        if (action == 0) {
            this.O = z41Var;
            if (z41Var != null) {
                v41 v41Var = z41Var.e;
                if (v41Var == null) {
                    v41Var = new v41(this);
                    z41Var.e = v41Var;
                }
                v41Var.c(true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (z41Var2 = this.O) != null && z41Var2 != z41Var) {
                v41 v41Var2 = z41Var2.e;
                if (v41Var2 == null) {
                    v41Var2 = new v41(this);
                    z41Var2.e = v41Var2;
                }
                v41Var2.c(false);
                this.O = null;
            }
        } else {
            z41 z41Var3 = this.O;
            if (z41Var3 != null) {
                v41 v41Var3 = z41Var3.e;
                if (v41Var3 == null) {
                    v41Var3 = new v41(this);
                    z41Var3.e = v41Var3;
                }
                v41Var3.c(false);
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

    public y41(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.M = new Path();
        this.N = new RectF();
    }
}

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
public class q41 extends l46 {
    public final Path M;
    public final RectF N;
    public r41 O;
    public r41 P;

    public q41(Context context) {
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
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.P.a()) - gl.L(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.P = null;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r41 r41Var;
        Runnable runnable;
        r41 r41Var2;
        Layout layout;
        int action = motionEvent.getAction();
        float x = motionEvent.getX() - getPaddingLeft();
        int y = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y >= 0 && y < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y);
            Spanned spanned = (Spanned) getText();
            r41[] r41VarArr = (r41[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), r41.class);
            for (int i = 0; i < r41VarArr.length; i++) {
                r41Var = r41VarArr[i];
                int spanStart = spanned.getSpanStart(r41Var);
                int spanEnd = spanned.getSpanEnd(r41Var);
                Path path = this.M;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.N;
                path.computeBounds(rectF, true);
                if (rectF.contains(x, y)) {
                    break;
                }
            }
        }
        r41Var = null;
        if (action == 0) {
            this.O = r41Var;
            if (r41Var != null) {
                n41 n41Var = r41Var.e;
                if (n41Var == null) {
                    n41Var = new n41(this);
                    r41Var.e = n41Var;
                }
                n41Var.c(true);
                return true;
            }
        } else if (action != 1 && action != 3) {
            if (action == 2 && (r41Var2 = this.O) != null && r41Var2 != r41Var) {
                n41 n41Var2 = r41Var2.e;
                if (n41Var2 == null) {
                    n41Var2 = new n41(this);
                    r41Var2.e = n41Var2;
                }
                n41Var2.c(false);
                this.O = null;
            }
        } else {
            r41 r41Var3 = this.O;
            if (r41Var3 != null) {
                n41 n41Var3 = r41Var3.e;
                if (n41Var3 == null) {
                    n41Var3 = new n41(this);
                    r41Var3.e = n41Var3;
                }
                n41Var3.c(false);
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

    public q41(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.M = new Path();
        this.N = new RectF();
    }
}

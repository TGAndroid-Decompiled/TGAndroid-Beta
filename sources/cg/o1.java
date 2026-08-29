package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.y80;
public final class o1 extends LinearLayout {
    public int f3239a;
    public final TextView f3240b;
    public final y80 f3241c;
    public LinearLayout d;
    public final y0 f3242e;
    public final ViewGroup f3243f;
    public boolean h;
    public final p1 f3244n;

    public o1(p1 p1Var, Context context, int i10) {
        super(context);
        this.f3244n = p1Var;
        setOrientation(1);
        ViewGroup A = p1Var.A(context, i10);
        this.f3243f = A;
        addView(A);
        this.f3242e = (y0) A;
        TextView textView = new TextView(context);
        this.f3240b = textView;
        textView.setGravity(1);
        int i11 = g6.f23169j5;
        textView.setTextColor(p1Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, f6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        y80 y80Var = new y80(context, null);
        this.f3241c = y80Var;
        y80Var.setGravity(1);
        y80Var.setTextSize(1, 15.0f);
        y80Var.setTextColor(p1Var.getThemedColor(i11));
        if (!p1Var.A) {
            y80Var.setLines(2);
        }
        addView(y80Var, f6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f3243f) {
            boolean z10 = view instanceof b;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f3244n.H);
            }
            if (z10) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f3240b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f3243f;
        boolean z10 = viewGroup instanceof b;
        p1 p1Var = this.f3244n;
        if (z10) {
            ((b) viewGroup).setTopOffset(p1Var.H);
        }
        viewGroup.getLayoutParams().height = p1Var.f3269s;
        y80 y80Var = this.f3241c;
        y80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            y80Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}

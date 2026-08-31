package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
public final class m1 extends LinearLayout {
    public int f6390a;
    public final TextView f6391b;
    public final g90 f6392c;
    public LinearLayout d;
    public final x0 f6393e;
    public final ViewGroup f6394f;
    public boolean h;
    public final n1 f6395n;

    public m1(n1 n1Var, Context context, int i10) {
        super(context);
        this.f6395n = n1Var;
        setOrientation(1);
        ViewGroup A = n1Var.A(context, i10);
        this.f6394f = A;
        addView(A);
        this.f6393e = (x0) A;
        TextView textView = new TextView(context);
        this.f6391b = textView;
        textView.setGravity(1);
        int i11 = k6.f21766j5;
        textView.setTextColor(n1Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, c6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        g90 g90Var = new g90(context, null);
        this.f6392c = g90Var;
        g90Var.setGravity(1);
        g90Var.setTextSize(1, 15.0f);
        g90Var.setTextColor(n1Var.getThemedColor(i11));
        if (!n1Var.B) {
            g90Var.setLines(2);
        }
        addView(g90Var, c6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f6394f) {
            boolean z4 = view instanceof b;
            if (z4) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f6395n.I);
            }
            if (z4) {
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
        TextView textView = this.f6391b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f6394f;
        boolean z4 = viewGroup instanceof b;
        n1 n1Var = this.f6395n;
        if (z4) {
            ((b) viewGroup).setTopOffset(n1Var.I);
        }
        viewGroup.getLayoutParams().height = n1Var.f6417s;
        g90 g90Var = this.f6392c;
        g90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            g90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}

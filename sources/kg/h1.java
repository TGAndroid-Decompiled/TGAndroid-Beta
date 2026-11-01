package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.du0;
import w7.b6;
public final class h1 extends LinearLayout {
    public int f11101a;
    public final TextView f11102b;
    public final p80 f11103c;
    public LinearLayout d;
    public final t0 e;
    public final ViewGroup f11104f;
    public boolean h;
    public final i1 f11105n;

    public h1(i1 i1Var, Context context, int i10) {
        super(context);
        int i11;
        l lVar;
        this.f11105n = i1Var;
        setOrientation(1);
        du0 du0Var = (du0) i1Var.f11113k1.get(i10);
        int i12 = du0Var.f36680a;
        if (i12 == 0) {
            ?? aVar = new a(context, i1Var.I0);
            aVar.f10990b.setOnScrollListener(new a1(i1Var, 1));
            lVar = aVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                lVar = new z1(context, i1Var.f21584a);
            } else if (i12 == 10) {
                lVar = new v0(context, i1Var.I0);
            } else {
                lVar = new k2(context, i1Var.f11121t1, i1Var.f21584a, du0Var.f36680a, i1Var.I0);
            }
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            l lVar2 = new l(i11, context, i1Var.I0);
            lVar2.f10990b.setOnScrollListener(new a1(i1Var, 0));
            lVar = lVar2;
        }
        this.f11104f = lVar;
        addView(lVar);
        this.e = lVar;
        TextView textView = new TextView(context);
        this.f11102b = textView;
        textView.setGravity(1);
        int i13 = t6.f21038j5;
        m5.m(textView, i13, i1Var.I0, 1, 20.0f);
        addView(textView, b6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        this.f11103c = p80Var;
        p80Var.setGravity(1);
        p80Var.setTextSize(1, 15.0f);
        a7.V(p80Var, i13, i1Var.I0);
        if (!i1Var.f11123v1) {
            p80Var.setLines(2);
        }
        addView(p80Var, b6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f11104f) {
            boolean z10 = view instanceof a;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f11105n.C1);
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
        TextView textView = this.f11102b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f11104f;
        boolean z10 = viewGroup instanceof a;
        i1 i1Var = this.f11105n;
        if (z10) {
            ((a) viewGroup).setTopOffset(i1Var.C1);
        }
        viewGroup.getLayoutParams().height = i1Var.f11118q1;
        p80 p80Var = this.f11103c;
        p80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(16.0f);
            textView.setVisibility(8);
            p80Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}

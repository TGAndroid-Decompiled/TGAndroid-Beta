package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import di.ab;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class t0 extends FrameLayout implements org.telegram.ui.ActionBar.x5, n9 {
    public final org.telegram.ui.ActionBar.c6 f13521a;
    public final ab f13522b;
    public final AnimatedArrowDrawable f13523c;
    public final h1 d;
    public final Paint e;
    public a f13524f;
    public e3 h;
    public boolean f13525n;

    public t0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = new Paint();
        this.f13521a = c6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Dk, c6Var));
        this.f13523c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.f1(this, 2));
        ab abVar = new ab(this, context, 6);
        this.f13522b = abVar;
        abVar.setOnClickListener(new ah.g0(this, 29));
        addView(abVar, w7.z5.e(53, -1, 51));
        h1 h1Var = new h1(context, c6Var);
        this.d = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setTextSize(1, SharedConfig.fontSize);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        h1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        h1Var.setListener(new q0(this));
        h1Var.setDelegate(new f1.a(this, 23));
        addView(h1Var, w7.z5.a(-2.0f, 53.0f, 0.0f, 16.0f, 0.0f, -1, 51));
        d();
    }

    @Override
    public final void d() {
        this.d.t();
        int i10 = org.telegram.ui.ActionBar.g6.Dk;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13521a;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f13523c;
        animatedArrowDrawable.f22533a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Fk, c6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        e3 e3Var = this.h;
        if (e3Var != null) {
            o9Var = e3Var.f13244a.getTextSelectionHelper();
        } else {
            o9Var = null;
        }
        if (o9Var != null) {
            h1 h1Var = this.d;
            if (h1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop());
                o9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.d;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new r0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    public int[] getColorKeys() {
        return null;
    }

    public h1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f13524f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f13524f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13107b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}

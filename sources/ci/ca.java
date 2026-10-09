package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.hs;
public abstract class ca extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public int J;
    public boolean K;
    public final g2 f4845a;
    public final int f4846b;
    public final ba f4847c;
    public final ArrayList d;
    public d40 f4848e;
    public final m9 f4849f;
    public boolean h;
    public Utilities.Callback f4850n;
    public final org.telegram.ui.Components.g6 f4851r;
    public final LinearGradient f4852s;
    public final Paint v;
    public final Matrix f4853w;
    public final org.telegram.ui.Components.g6 f4854x;
    public final LinearGradient f4855y;

    public ca(Context context, org.telegram.ui.ActionBar.e6 e6Var, m9 m9Var) {
        super(context);
        int i10;
        this.d = new ArrayList();
        hs hsVar = hs.h;
        this.f4851r = new org.telegram.ui.Components.g6(this, 0L, 300L, hsVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f4852s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f4853w = new Matrix();
        this.f4854x = new org.telegram.ui.Components.g6(this, 0L, 300L, hsVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f4855y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f4849f = m9Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        ba baVar = new ba(this, context);
        this.f4847c = baVar;
        addView(baVar, w7.x5.d(-2.0f, -1));
        g2 g2Var = new g2(this, context, 1);
        this.f4845a = g2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            g2Var.setRevealOnFocusHint(false);
        }
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xh, e6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Yh;
        g2Var.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        g2Var.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        g2Var.setCursorWidth(1.5f);
        g2Var.setInputType(g2Var.getInputType() | 176);
        g2Var.setSingleLine(true);
        g2Var.setBackgroundDrawable(null);
        g2Var.setVerticalScrollBarEnabled(false);
        g2Var.setHorizontalScrollBarEnabled(false);
        g2Var.setTextIsSelectable(false);
        g2Var.setPadding(0, 0, 0, 0);
        g2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g2Var.setGravity(i10 | 16);
        baVar.addView(g2Var);
        g2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f4846b = (int) g2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        g2Var.addTextChangedListener(new z9(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e7 = this.f4851r.e(canScrollVertically(-1));
        Matrix matrix = this.f4853w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f4852s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e10 = this.f4854x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f4855y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.G) {
            this.G = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.q.C(20.0f, this.H, rect.top);
        rect.bottom = org.telegram.messenger.q.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        ba baVar = this.f4847c;
        if (baVar != null) {
            baVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f4850n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f4845a.setText(charSequence);
        this.h = false;
    }
}

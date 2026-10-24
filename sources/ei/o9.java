package ei;

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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.zr;
public abstract class o9 extends ScrollView implements org.telegram.ui.ActionBar.b6 {
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.g6 f9572a;
    public final e2 f9573b;
    public final int f9574c;
    public final n9 d;
    public final ArrayList e;
    public t30 f9575f;
    public final a9 h;
    public boolean f9576n;
    public Utilities.Callback f9577r;
    public final org.telegram.ui.Components.d6 f9578s;
    public final LinearGradient v;
    public final Paint f9579w;
    public final Matrix f9580x;
    public final org.telegram.ui.Components.d6 f9581y;

    public o9(Context context, org.telegram.ui.ActionBar.g6 g6Var, a9 a9Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        zr zrVar = zr.h;
        this.f9578s = new org.telegram.ui.Components.d6(this, 0L, 300L, zrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.v = linearGradient;
        Paint paint = new Paint(1);
        this.f9579w = paint;
        this.f9580x = new Matrix();
        this.f9581y = new org.telegram.ui.Components.d6(this, 0L, 300L, zrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f9572a = g6Var;
        this.h = a9Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
        n9 n9Var = new n9(this, context);
        this.d = n9Var;
        addView(n9Var, w7.z5.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, 1);
        this.f9573b = e2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            e2Var.setRevealOnFocusHint(false);
        }
        e2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.m(e2Var, 34, org.telegram.ui.ActionBar.k6.Xh, g6Var);
        org.telegram.ui.ActionBar.r6.W(e2Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Yh;
        org.telegram.ui.ActionBar.r6.m(e2Var, 30, i11, g6Var);
        org.telegram.ui.ActionBar.r6.m(e2Var, 36, i11, g6Var);
        e2Var.setCursorWidth(1.5f);
        e2Var.setInputType(e2Var.getInputType() | 176);
        e2Var.setSingleLine(true);
        e2Var.setBackgroundDrawable(null);
        e2Var.setVerticalScrollBarEnabled(false);
        e2Var.setHorizontalScrollBarEnabled(false);
        e2Var.setTextIsSelectable(false);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e2Var.setGravity(i10 | 16);
        n9Var.addView(e2Var);
        e2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f9574c = (int) e2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        e2Var.addTextChangedListener(new l9(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f9578s.e(canScrollVertically(-1));
        Matrix matrix = this.f9580x;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.v.setLocalMatrix(matrix);
        Paint paint = this.f9579w;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f9581y.e(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (e7 * 255.0f));
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
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.v0.C(20.0f, this.I, rect.top);
        rect.bottom = org.telegram.messenger.v0.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        n9 n9Var = this.d;
        if (n9Var != null) {
            n9Var.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f9577r = callback;
    }

    public void setText(CharSequence charSequence) {
        this.f9576n = true;
        this.f9573b.setText(charSequence);
        this.f9576n = false;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f9572a;
        e2 e2Var = this.f9573b;
        if (e2Var != null) {
            try {
                e2Var.setHintColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xh, g6Var));
                int i10 = org.telegram.ui.ActionBar.k6.Yh;
                e2Var.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                e2Var.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

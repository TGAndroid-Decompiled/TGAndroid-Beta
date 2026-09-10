package bi;

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
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wr;
public abstract class ob extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public int J;
    public boolean K;
    public final t2 f3334a;
    public final int f3335b;
    public final nb f3336c;
    public final ArrayList d;
    public w30 e;
    public final sa f3337f;
    public boolean h;
    public Utilities.Callback f3338n;
    public final org.telegram.ui.Components.d6 f3339r;
    public final LinearGradient f3340s;
    public final Paint v;
    public final Matrix f3341w;
    public final org.telegram.ui.Components.d6 f3342x;
    public final LinearGradient f3343y;

    public ob(Context context, org.telegram.ui.ActionBar.f6 f6Var, sa saVar) {
        super(context);
        int i10;
        this.d = new ArrayList();
        wr wrVar = wr.h;
        this.f3339r = new org.telegram.ui.Components.d6(this, 0L, 300L, wrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f3340s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f3341w = new Matrix();
        this.f3342x = new org.telegram.ui.Components.d6(this, 0L, 300L, wrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f3343y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f3337f = saVar;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        nb nbVar = new nb(this, context);
        this.f3336c = nbVar;
        addView(nbVar, w7.a6.c(-2.0f, -1));
        t2 t2Var = new t2(this, context, 1);
        this.f3334a = t2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            t2Var.setRevealOnFocusHint(false);
        }
        t2Var.setTextSize(1, 16.0f);
        t2Var.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        t2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Yh;
        t2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t2Var.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t2Var.setCursorWidth(1.5f);
        t2Var.setInputType(t2Var.getInputType() | 176);
        t2Var.setSingleLine(true);
        t2Var.setBackgroundDrawable(null);
        t2Var.setVerticalScrollBarEnabled(false);
        t2Var.setHorizontalScrollBarEnabled(false);
        t2Var.setTextIsSelectable(false);
        t2Var.setPadding(0, 0, 0, 0);
        t2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        t2Var.setGravity(i10 | 16);
        nbVar.addView(t2Var);
        t2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f3335b = (int) t2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        t2Var.addTextChangedListener(new lb(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f3339r.e(canScrollVertically(-1));
        Matrix matrix = this.f3341w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f3340s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f3342x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f3343y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
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
        if (this.G) {
            this.G = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.a2.C(20.0f, this.H, rect.top);
        rect.bottom = org.telegram.messenger.a2.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        nb nbVar = this.f3336c;
        if (nbVar != null) {
            nbVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f3338n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f3334a.setText(charSequence);
        this.h = false;
    }
}

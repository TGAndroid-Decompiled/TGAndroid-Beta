package nh;

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
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jr;
public abstract class b9 extends ScrollView {
    public final Paint A;
    public final Matrix B;
    public boolean C;
    public int D;
    public float E;
    public int F;
    public boolean G;
    public final ig.f f17430a;
    public final int f17431b;
    public final ig.j f17432c;
    public final ArrayList d;
    public j30 f17433e;
    public final o8 f17434f;
    public boolean h;
    public Utilities.Callback f17435n;
    public final org.telegram.ui.Components.d6 f17436r;
    public final LinearGradient f17437s;
    public final Paint v;
    public final Matrix f17438w;
    public final org.telegram.ui.Components.d6 f17439x;
    public final LinearGradient f17440y;

    public b9(Context context, org.telegram.ui.ActionBar.c6 c6Var, o8 o8Var) {
        super(context);
        int i10;
        this.d = new ArrayList();
        jr jrVar = jr.h;
        this.f17436r = new org.telegram.ui.Components.d6(this, 0L, 300L, jrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f17437s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f17438w = new Matrix();
        this.f17439x = new org.telegram.ui.Components.d6(this, 0L, 300L, jrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f17440y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f17434f = o8Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        ig.j jVar = new ig.j(this, context);
        this.f17432c = jVar;
        addView(jVar, i7.f6.c(-2.0f, -1));
        ig.f fVar = new ig.f(this, context, 2);
        this.f17430a = fVar;
        if (Build.VERSION.SDK_INT >= 25) {
            fVar.setRevealOnFocusHint(false);
        }
        fVar.setTextSize(1, 16.0f);
        fVar.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Yh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fVar.setCursorWidth(1.5f);
        fVar.setInputType(fVar.getInputType() | 176);
        fVar.setSingleLine(true);
        fVar.setBackgroundDrawable(null);
        fVar.setVerticalScrollBarEnabled(false);
        fVar.setHorizontalScrollBarEnabled(false);
        fVar.setTextIsSelectable(false);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar.setGravity(i10 | 16);
        jVar.addView(fVar);
        fVar.setHintText(LocaleController.getString(R.string.Search));
        this.f17431b = (int) fVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        fVar.addTextChangedListener(new z8(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e10 = this.f17436r.e(canScrollVertically(-1));
        Matrix matrix = this.f17438w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f17437s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e11 = this.f17439x.e(canScrollVertically(1));
        Matrix matrix2 = this.B;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f17440y.setLocalMatrix(matrix2);
        Paint paint2 = this.A;
        paint2.setAlpha((int) (e11 * 255.0f));
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
        if (this.C) {
            this.C = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.x3.C(20.0f, this.D, rect.top);
        rect.bottom = org.telegram.messenger.x3.C(50.0f, this.D, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f9) {
        this.E = f9;
        ig.j jVar = this.f17432c;
        if (jVar != null) {
            jVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f17435n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f17430a.setText(charSequence);
        this.h = false;
    }
}

package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w20;
public abstract class q9 extends ScrollView {
    public final Paint A;
    public final Matrix B;
    public boolean C;
    public int D;
    public float E;
    public int F;
    public boolean G;
    public final fg.g f15889a;
    public final int f15890b;
    public final fg.l f15891c;
    public final ArrayList d;
    public w20 f15892e;
    public final c9 f15893f;
    public boolean h;
    public Utilities.Callback f15894n;
    public final org.telegram.ui.Components.y5 f15895r;
    public final LinearGradient f15896s;
    public final Paint v;
    public final Matrix f15897w;
    public final org.telegram.ui.Components.y5 f15898x;
    public final LinearGradient f15899y;

    public q9(Context context, org.telegram.ui.ActionBar.b6 b6Var, c9 c9Var) {
        super(context);
        int i9;
        this.d = new ArrayList();
        gr grVar = gr.h;
        this.f15895r = new org.telegram.ui.Components.y5(this, 0L, 300L, grVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f15896s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f15897w = new Matrix();
        this.f15898x = new org.telegram.ui.Components.y5(this, 0L, 300L, grVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f15899y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f15893f = c9Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        fg.l lVar = new fg.l(this, context);
        this.f15891c = lVar;
        addView(lVar, g7.e6.c(-2.0f, -1));
        fg.g gVar = new fg.g(this, context, 2);
        this.f15889a = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        gVar.setHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, b6Var));
        gVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.Yh;
        gVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        gVar.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        gVar.setGravity(i9 | 16);
        lVar.addView(gVar);
        gVar.setHintText(LocaleController.getString(R.string.Search));
        this.f15890b = (int) gVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        gVar.addTextChangedListener(new o9(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e10 = this.f15895r.e(canScrollVertically(-1));
        Matrix matrix = this.f15897w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f15896s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e11 = this.f15898x.e(canScrollVertically(1));
        Matrix matrix2 = this.B;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f15899y.setLocalMatrix(matrix2);
        Paint paint2 = this.A;
        paint2.setAlpha((int) (e11 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.C) {
            this.C = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.l0.C(20.0f, this.D, rect.top);
        rect.bottom = org.telegram.messenger.l0.C(50.0f, this.D, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.E = f10;
        fg.l lVar = this.f15891c;
        if (lVar != null) {
            lVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f15894n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f15889a.setText(charSequence);
        this.h = false;
    }
}

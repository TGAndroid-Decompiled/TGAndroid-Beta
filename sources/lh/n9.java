package lh;

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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.er;

public abstract class n9 extends ScrollView {
    public final Paint A;
    public final Matrix B;
    public boolean C;
    public int D;
    public float E;
    public int F;
    public boolean G;

    public final gg.g f16440a;

    public final int f16441b;

    public final gg.k f16442c;
    public final ArrayList d;

    public a30 f16443e;

    public final z8 f16444f;
    public boolean h;

    public Utilities.Callback f16445n;

    public final org.telegram.ui.Components.y5 f16446r;

    public final LinearGradient f16447s;
    public final Paint v;

    public final Matrix f16448w;

    public final org.telegram.ui.Components.y5 f16449x;

    public final LinearGradient f16450y;

    public n9(Context context, org.telegram.ui.ActionBar.c6 c6Var, z8 z8Var) {
        super(context);
        this.d = new ArrayList();
        er erVar = er.h;
        this.f16446r = new org.telegram.ui.Components.y5(this, 0L, 300L, erVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f16447s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f16448w = new Matrix();
        this.f16449x = new org.telegram.ui.Components.y5(this, 0L, 300L, erVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f16450y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f16444f = z8Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        gg.k kVar = new gg.k(this, context);
        this.f16442c = kVar;
        addView(kVar, h7.z5.c(-2.0f, -1));
        gg.g gVar = new gg.g(this, context, 2);
        this.f16440a = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        gVar.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        gVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        int i10 = org.telegram.ui.ActionBar.g6.Yh;
        gVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        gVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        gVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        kVar.addView(gVar);
        gVar.setHintText(LocaleController.getString(R.string.Search));
        this.f16441b = (int) gVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        gVar.addTextChangedListener(new l9(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY = getScrollY();
        float f10 = scrollY;
        canvas.saveLayerAlpha(0.0f, f10, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float fE = this.f16446r.e(canScrollVertically(-1));
        Matrix matrix = this.f16448w;
        matrix.reset();
        matrix.postTranslate(0.0f, f10);
        this.f16447s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (fE * 255.0f));
        canvas.drawRect(0.0f, f10, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float fE2 = this.f16449x.e(canScrollVertically(1));
        Matrix matrix2 = this.B;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f16450y.setLocalMatrix(matrix2);
        Paint paint2 = this.A;
        paint2.setAlpha((int) (fE2 * 255.0f));
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
        rect.top = org.telegram.messenger.y1.C(20.0f, this.D, rect.top);
        rect.bottom = org.telegram.messenger.y1.C(50.0f, this.D, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.E = f10;
        gg.k kVar = this.f16442c;
        if (kVar != null) {
            kVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f16445n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f16440a.setText(charSequence);
        this.h = false;
    }
}

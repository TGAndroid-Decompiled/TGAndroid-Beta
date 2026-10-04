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
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.tr;
public abstract class ba extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public int J;
    public boolean K;
    public final h2 f4778a;
    public final int f4779b;
    public final aa f4780c;
    public final ArrayList d;
    public q30 f4781e;
    public final l9 f4782f;
    public boolean h;
    public Utilities.Callback f4783n;
    public final org.telegram.ui.Components.e6 f4784r;
    public final LinearGradient f4785s;
    public final Paint v;
    public final Matrix f4786w;
    public final org.telegram.ui.Components.e6 f4787x;
    public final LinearGradient f4788y;

    public ba(Context context, org.telegram.ui.ActionBar.d6 d6Var, l9 l9Var) {
        super(context);
        int i10;
        this.d = new ArrayList();
        tr trVar = tr.h;
        this.f4784r = new org.telegram.ui.Components.e6(this, 0L, 300L, trVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f4785s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f4786w = new Matrix();
        this.f4787x = new org.telegram.ui.Components.e6(this, 0L, 300L, trVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f4788y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f4782f = l9Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
        aa aaVar = new aa(this, context);
        this.f4780c = aaVar;
        addView(aaVar, w7.z5.c(-2.0f, -1));
        h2 h2Var = new h2(this, context, 1);
        this.f4778a = h2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            h2Var.setRevealOnFocusHint(false);
        }
        h2Var.setTextSize(1, 16.0f);
        h2Var.setHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xh, d6Var));
        h2Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Yh;
        h2Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        h2Var.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        h2Var.setCursorWidth(1.5f);
        h2Var.setInputType(h2Var.getInputType() | 176);
        h2Var.setSingleLine(true);
        h2Var.setBackgroundDrawable(null);
        h2Var.setVerticalScrollBarEnabled(false);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setTextIsSelectable(false);
        h2Var.setPadding(0, 0, 0, 0);
        h2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h2Var.setGravity(i10 | 16);
        aaVar.addView(h2Var);
        h2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f4779b = (int) h2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        h2Var.addTextChangedListener(new y9(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e7 = this.f4784r.e(canScrollVertically(-1));
        Matrix matrix = this.f4786w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f4785s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e10 = this.f4787x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f4788y.setLocalMatrix(matrix2);
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
        aa aaVar = this.f4780c;
        if (aaVar != null) {
            aaVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f4783n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f4778a.setText(charSequence);
        this.h = false;
    }
}

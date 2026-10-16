package di;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.z30;
public abstract class ba extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public int J;
    public boolean K;
    public final g2 f6668a;
    public final int f6669b;
    public final aa f6670c;
    public final ArrayList d;
    public z30 e;
    public final l9 f6671f;
    public boolean h;
    public Utilities.Callback f6672n;
    public final org.telegram.ui.Components.g6 f6673r;
    public final LinearGradient f6674s;
    public final Paint v;
    public final Matrix f6675w;
    public final org.telegram.ui.Components.g6 f6676x;
    public final LinearGradient f6677y;

    public ba(Context context, org.telegram.ui.ActionBar.c6 c6Var, l9 l9Var) {
        super(context);
        int i10;
        this.d = new ArrayList();
        es esVar = es.h;
        this.f6673r = new org.telegram.ui.Components.g6(this, 0L, 300L, esVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f6674s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f6675w = new Matrix();
        this.f6676x = new org.telegram.ui.Components.g6(this, 0L, 300L, esVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f6677y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f6671f = l9Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        aa aaVar = new aa(this, context);
        this.f6670c = aaVar;
        addView(aaVar, w7.z5.d(-2.0f, -1));
        g2 g2Var = new g2(this, context, 1);
        this.f6668a = g2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            g2Var.setRevealOnFocusHint(false);
        }
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Yh;
        g2Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        g2Var.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
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
        aaVar.addView(g2Var);
        g2Var.setHintText(LocaleController.getString(R.string.Search));
        this.f6669b = (int) g2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        g2Var.addTextChangedListener(new y9(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f6673r.e(canScrollVertically(-1));
        Matrix matrix = this.f6675w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f6674s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f6676x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f6677y.setLocalMatrix(matrix2);
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
        rect.top = org.telegram.messenger.g0.C(20.0f, this.H, rect.top);
        rect.bottom = org.telegram.messenger.g0.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        aa aaVar = this.f6670c;
        if (aaVar != null) {
            aaVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f6672n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f6668a.setText(charSequence);
        this.h = false;
    }
}

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.v30;
public abstract class o9 extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public int J;
    public boolean K;
    public final e2 f9559a;
    public final int f9560b;
    public final n9 f9561c;
    public final ArrayList d;
    public v30 e;
    public final a9 f9562f;
    public boolean h;
    public Utilities.Callback f9563n;
    public final org.telegram.ui.Components.f6 f9564r;
    public final LinearGradient f9565s;
    public final Paint v;
    public final Matrix f9566w;
    public final org.telegram.ui.Components.f6 f9567x;
    public final LinearGradient f9568y;

    public o9(Context context, org.telegram.ui.ActionBar.d6 d6Var, a9 a9Var) {
        super(context);
        int i10;
        this.d = new ArrayList();
        bs bsVar = bs.h;
        this.f9564r = new org.telegram.ui.Components.f6(this, 0L, 300L, bsVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f9565s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f9566w = new Matrix();
        this.f9567x = new org.telegram.ui.Components.f6(this, 0L, 300L, bsVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f9568y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f9562f = a9Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
        n9 n9Var = new n9(this, context);
        this.f9561c = n9Var;
        addView(n9Var, w7.z5.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, 1);
        this.f9559a = e2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            e2Var.setRevealOnFocusHint(false);
        }
        e2Var.setTextSize(1, 16.0f);
        e2Var.setHintColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xh, d6Var));
        e2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.Yh;
        e2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        e2Var.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
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
        this.f9560b = (int) e2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        e2Var.addTextChangedListener(new l9(this));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f9564r.e(canScrollVertically(-1));
        Matrix matrix = this.f9566w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f9565s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e7 = this.f9567x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f9568y.setLocalMatrix(matrix2);
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
        n9 n9Var = this.f9561c;
        if (n9Var != null) {
            n9Var.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f9563n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f9559a.setText(charSequence);
        this.h = false;
    }
}

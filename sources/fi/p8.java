package fi;

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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.xq;
public abstract class p8 extends ScrollView implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.w5 D;
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.f6 f12611a;
    public final ah.i f12612b;
    public final int f12613c;
    public final ah.n d;
    public final ArrayList f12614e;
    public c20 f12615f;
    public final d8 h;
    public boolean f12616n;
    public org.telegram.messenger.c20 f12617r;
    public final org.telegram.ui.Components.w5 f12618s;
    public final LinearGradient f12619w;
    public final Paint f12620x;
    public final Matrix f12621y;

    public p8(Context context, org.telegram.ui.ActionBar.f6 f6Var, d8 d8Var) {
        super(context);
        int i7;
        this.f12614e = new ArrayList();
        xq xqVar = xq.h;
        this.f12618s = new org.telegram.ui.Components.w5(this, 0L, 300L, xqVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f12619w = linearGradient;
        Paint paint = new Paint(1);
        this.f12620x = paint;
        this.f12621y = new Matrix();
        this.D = new org.telegram.ui.Components.w5(this, 0L, 300L, xqVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f12611a = f6Var;
        this.h = d8Var;
        setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
        ah.n nVar = new ah.n(this, context);
        this.d = nVar;
        addView(nVar, c8.ha.c(-2.0f, -1));
        ah.i iVar = new ah.i(2, context, this);
        this.f12612b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.m(iVar, 34, org.telegram.ui.ActionBar.k6.Li, f6Var);
        org.telegram.ui.ActionBar.r6.V(iVar, org.telegram.ui.ActionBar.k6.G6, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Mi;
        org.telegram.ui.ActionBar.r6.m(iVar, 30, i10, f6Var);
        org.telegram.ui.ActionBar.r6.m(iVar, 36, i10, f6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        nVar.addView(iVar);
        iVar.setHintText(hd.M0(2131745837, null));
        this.f12613c = (int) iVar.getPaint().measureText(hd.M0(2131745837, null));
        iVar.addTextChangedListener(new ah.j(this, 6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f12618s.d(canScrollVertically(-1));
        Matrix matrix = this.f12621y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f12619w.setLocalMatrix(matrix);
        Paint paint = this.f12620x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), org.telegram.messenger.g0.L(8.0f) + scrollY, paint);
        float d2 = this.D.d(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - org.telegram.messenger.g0.L(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.k5.C(20.0f, this.I, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    public void setContainerHeight(float f10) {
        this.J = f10;
        ah.n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(org.telegram.messenger.c20 c20Var) {
        this.f12617r = c20Var;
    }

    public void setText(CharSequence charSequence) {
        this.f12616n = true;
        this.f12612b.setText(charSequence);
        this.f12616n = false;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f12611a;
        ah.i iVar = this.f12612b;
        if (iVar != null) {
            try {
                iVar.setHintColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Li, f6Var));
                int i7 = org.telegram.ui.ActionBar.k6.Mi;
                iVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.messenger.g0.z3(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

package hi;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m20;
public abstract class n8 extends ScrollView implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.c6 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.i6 f15108a;
    public final ah.i f15109b;
    public final int f15110c;
    public final ah.n d;
    public final ArrayList f15111e;
    public m20 f15112f;
    public final b8 h;
    public boolean f15113n;
    public x10 f15114r;
    public final org.telegram.ui.Components.c6 f15115s;
    public final LinearGradient f15116w;
    public final Paint f15117x;
    public final Matrix f15118y;

    public n8(Context context, org.telegram.ui.ActionBar.i6 i6Var, b8 b8Var) {
        super(context);
        int i7;
        this.f15111e = new ArrayList();
        lr lrVar = lr.h;
        this.f15115s = new org.telegram.ui.Components.c6(this, 0L, 300L, lrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f15116w = linearGradient;
        Paint paint = new Paint(1);
        this.f15117x = paint;
        this.f15118y = new Matrix();
        this.E = new org.telegram.ui.Components.c6(this, 0L, 300L, lrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f15108a = i6Var;
        this.h = b8Var;
        setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.x3(this, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
        ah.n nVar = new ah.n(this, context);
        this.d = nVar;
        addView(nVar, c8.ma.c(-2.0f, -1));
        ah.i iVar = new ah.i(2, context, this);
        this.f15109b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.l(iVar, 34, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        org.telegram.ui.ActionBar.u6.U(iVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.Pi;
        org.telegram.ui.ActionBar.u6.l(iVar, 30, i10, i6Var);
        org.telegram.ui.ActionBar.u6.l(iVar, 36, i10, i6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        if (gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        nVar.addView(iVar);
        iVar.setHintText(gd.M0(2131745641, null));
        this.f15110c = (int) iVar.getPaint().measureText(gd.M0(2131745641, null));
        iVar.addTextChangedListener(new ah.j(this, 8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f15115s.d(canScrollVertically(-1));
        Matrix matrix = this.f15118y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f15116w.setLocalMatrix(matrix);
        Paint paint = this.f15117x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), org.telegram.messenger.g0.L(8.0f) + scrollY, paint);
        float d2 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - org.telegram.messenger.g0.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.f3.C(20.0f, this.J, rect.top);
        rect.bottom = org.telegram.messenger.f3.C(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.K = f10;
        ah.n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(x10 x10Var) {
        this.f15114r = x10Var;
    }

    public void setText(CharSequence charSequence) {
        this.f15113n = true;
        this.f15109b.setText(charSequence);
        this.f15113n = false;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f15108a;
        ah.i iVar = this.f15109b;
        if (iVar != null) {
            try {
                iVar.setHintColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Oi, i6Var));
                int i7 = org.telegram.ui.ActionBar.n6.Pi;
                iVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.messenger.g0.x3(this, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

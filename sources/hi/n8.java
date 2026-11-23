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
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;
public abstract class n8 extends ScrollView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.d6 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.h6 f15078a;
    public final ah.i f15079b;
    public final int f15080c;
    public final ah.n d;
    public final ArrayList f15081e;
    public p20 f15082f;
    public final b8 h;
    public boolean f15083n;
    public y10 f15084r;
    public final org.telegram.ui.Components.d6 f15085s;
    public final LinearGradient f15086w;
    public final Paint f15087x;
    public final Matrix f15088y;

    public n8(Context context, org.telegram.ui.ActionBar.h6 h6Var, b8 b8Var) {
        super(context);
        int i7;
        this.f15081e = new ArrayList();
        nr nrVar = nr.h;
        this.f15085s = new org.telegram.ui.Components.d6(this, 0L, 300L, nrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f15086w = linearGradient;
        Paint paint = new Paint(1);
        this.f15087x = paint;
        this.f15088y = new Matrix();
        this.E = new org.telegram.ui.Components.d6(this, 0L, 300L, nrVar);
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
        this.f15078a = h6Var;
        this.h = b8Var;
        setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.x3(this, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
        ah.n nVar = new ah.n(this, context);
        this.d = nVar;
        addView(nVar, c8.na.c(-2.0f, -1));
        ah.i iVar = new ah.i(2, context, this);
        this.f15079b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.l(iVar, 34, org.telegram.ui.ActionBar.m6.Oi, h6Var);
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.Pi;
        org.telegram.ui.ActionBar.t6.l(iVar, 30, i10, h6Var);
        org.telegram.ui.ActionBar.t6.l(iVar, 36, i10, h6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        nVar.addView(iVar);
        iVar.setHintText(hd.N0(2131745640, null));
        this.f15080c = (int) iVar.getPaint().measureText(hd.N0(2131745640, null));
        iVar.addTextChangedListener(new ah.j(this, 8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f15085s.d(canScrollVertically(-1));
        Matrix matrix = this.f15088y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f15086w.setLocalMatrix(matrix);
        Paint paint = this.f15087x;
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

    public void setOnSearchTextChange(y10 y10Var) {
        this.f15084r = y10Var;
    }

    public void setText(CharSequence charSequence) {
        this.f15083n = true;
        this.f15079b.setText(charSequence);
        this.f15083n = false;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f15078a;
        ah.i iVar = this.f15079b;
        if (iVar != null) {
            try {
                iVar.setHintColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Oi, h6Var));
                int i7 = org.telegram.ui.ActionBar.m6.Pi;
                iVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.messenger.g0.x3(this, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f20;
public abstract class n8 extends ScrollView implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.e6 f14768a;
    public final ah.i f14769b;
    public final int f14770c;
    public final ah.n d;
    public final ArrayList f14771e;
    public f20 f14772f;
    public final b8 h;
    public boolean f14773n;
    public z10 f14774r;
    public final org.telegram.ui.Components.u5 f14775s;
    public final LinearGradient f14776w;
    public final Paint f14777x;
    public final Matrix f14778y;

    public n8(Context context, org.telegram.ui.ActionBar.e6 e6Var, b8 b8Var) {
        super(context);
        int i7;
        this.f14771e = new ArrayList();
        er erVar = er.h;
        this.f14775s = new org.telegram.ui.Components.u5(this, 0L, 300L, erVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f14776w = linearGradient;
        Paint paint = new Paint(1);
        this.f14777x = paint;
        this.f14778y = new Matrix();
        this.E = new org.telegram.ui.Components.u5(this, 0L, 300L, erVar);
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
        this.f14768a = e6Var;
        this.h = b8Var;
        setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.y3(this, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        ah.n nVar = new ah.n(this, context);
        this.d = nVar;
        addView(nVar, c8.ja.c(-2.0f, -1));
        ah.i iVar = new ah.i(2, context, this);
        this.f14769b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.l(iVar, 34, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        org.telegram.ui.ActionBar.q6.U(iVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        org.telegram.ui.ActionBar.q6.l(iVar, 30, i10, e6Var);
        org.telegram.ui.ActionBar.q6.l(iVar, 36, i10, e6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        nVar.addView(iVar);
        iVar.setHintText(hd.M0(2131745836, null));
        this.f14770c = (int) iVar.getPaint().measureText(hd.M0(2131745836, null));
        iVar.addTextChangedListener(new ah.j(this, 7));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f14775s.d(canScrollVertically(-1));
        Matrix matrix = this.f14778y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f14776w.setLocalMatrix(matrix);
        Paint paint = this.f14777x;
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
        rect.top = org.telegram.messenger.k5.C(20.0f, this.J, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.K = f10;
        ah.n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(z10 z10Var) {
        this.f14774r = z10Var;
    }

    public void setText(CharSequence charSequence) {
        this.f14773n = true;
        this.f14769b.setText(charSequence);
        this.f14773n = false;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f14768a;
        ah.i iVar = this.f14769b;
        if (iVar != null) {
            try {
                iVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Oi, e6Var));
                int i7 = org.telegram.ui.ActionBar.j6.Pi;
                iVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.messenger.g0.y3(this, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

package gi;

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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;
public abstract class q8 extends ScrollView implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.e6 f13439a;
    public final bh.g f13440b;
    public final int f13441c;
    public final bh.l d;
    public final ArrayList f13442e;
    public y10 f13443f;
    public final c8 h;
    public boolean f13444n;
    public u10 f13445r;
    public final org.telegram.ui.Components.u5 f13446s;
    public final LinearGradient f13447w;
    public final Paint f13448x;
    public final Matrix f13449y;

    public q8(Context context, org.telegram.ui.ActionBar.e6 e6Var, c8 c8Var) {
        super(context);
        int i3;
        this.f13442e = new ArrayList();
        xq xqVar = xq.h;
        this.f13446s = new org.telegram.ui.Components.u5(this, 0L, 300L, xqVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f13447w = linearGradient;
        Paint paint = new Paint(1);
        this.f13448x = paint;
        this.f13449y = new Matrix();
        this.E = new org.telegram.ui.Components.u5(this, 0L, 300L, xqVar);
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
        this.f13439a = e6Var;
        this.h = c8Var;
        setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        bh.l lVar = new bh.l(this, context);
        this.d = lVar;
        addView(lVar, mf.c(-2.0f, -1));
        bh.g gVar = new bh.g(2, context, this);
        this.f13440b = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.m(gVar, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        org.telegram.ui.ActionBar.r6.V(gVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Mi;
        org.telegram.ui.ActionBar.r6.m(gVar, 30, i10, e6Var);
        org.telegram.ui.ActionBar.r6.m(gVar, 36, i10, e6Var);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        gVar.setGravity(i3 | 16);
        lVar.addView(gVar);
        gVar.setHintText(bd.M0(2131745846, null));
        this.f13441c = (int) gVar.getPaint().measureText(bd.M0(2131745846, null));
        gVar.addTextChangedListener(new bh.h(this, 6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f13446s.d(canScrollVertically(-1));
        Matrix matrix = this.f13449y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f13447w.setLocalMatrix(matrix);
        Paint paint = this.f13448x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), org.telegram.messenger.g0.L(8.0f) + scrollY, paint);
        float d10 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - org.telegram.messenger.g0.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), Integer.MIN_VALUE));
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
        bh.l lVar = this.d;
        if (lVar != null) {
            lVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(u10 u10Var) {
        this.f13445r = u10Var;
    }

    public void setText(CharSequence charSequence) {
        this.f13444n = true;
        this.f13440b.setText(charSequence);
        this.f13444n = false;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f13439a;
        bh.g gVar = this.f13440b;
        if (gVar != null) {
            try {
                gVar.setHintColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Li, e6Var));
                int i3 = org.telegram.ui.ActionBar.k6.Mi;
                gVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                gVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.messenger.g0.z3(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

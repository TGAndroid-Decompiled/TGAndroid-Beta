package defpackage;

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
public abstract class v5b extends ScrollView implements tjb {
    public final lm E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final wjb a;
    public final l7 b;
    public final int c;
    public final gz9 d;
    public final ArrayList e;
    public ya5 f;
    public final l5b h;
    public boolean n;
    public p8c r;
    public final lm s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public v5b(Context context, wjb wjbVar, l5b l5bVar) {
        super(context);
        int i;
        this.e = new ArrayList();
        s33 s33Var = s33.h;
        this.s = new lm(this, 0L, 300L, s33Var);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.E = new lm(this, 0L, 300L, s33Var);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = wjbVar;
        this.h = l5bVar;
        setVerticalScrollBarEnabled(false);
        gl.u3(this, bkb.w0(null, bkb.c6, false));
        gz9 gz9Var = new gz9(this, context);
        this.d = gz9Var;
        addView(gz9Var, nme.c(-2.0f, -1));
        l7 l7Var = new l7((byte) 8, context, this);
        this.b = l7Var;
        if (Build.VERSION.SDK_INT >= 25) {
            l7Var.setRevealOnFocusHint(false);
        }
        l7Var.setTextSize(1, 16.0f);
        zkb.l(l7Var, 34, bkb.Ni, wjbVar);
        zkb.X(l7Var, bkb.F6, wjbVar);
        int i2 = bkb.Oi;
        zkb.l(l7Var, 30, i2, wjbVar);
        zkb.l(l7Var, 36, i2, wjbVar);
        l7Var.setCursorWidth(1.5f);
        l7Var.setInputType(l7Var.getInputType() | 176);
        l7Var.setSingleLine(true);
        l7Var.setBackgroundDrawable(null);
        l7Var.setVerticalScrollBarEnabled(false);
        l7Var.setHorizontalScrollBarEnabled(false);
        l7Var.setTextIsSelectable(false);
        l7Var.setPadding(0, 0, 0, 0);
        l7Var.setImeOptions(268435462);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        l7Var.setGravity(i | 16);
        gz9Var.addView(l7Var);
        l7Var.setHintText(k96.M0(2131745644, null));
        this.c = (int) l7Var.getPaint().measureText(k96.M0(2131745644, null));
        l7Var.addTextChangedListener(new jf6(this, (byte) 14));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.s.d(canScrollVertically(-1));
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.w.setLocalMatrix(matrix);
        Paint paint = this.x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), gl.L(8.0f) + scrollY, paint);
        float d2 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - gl.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - gl.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = de9.w(20.0f, this.J, rect.top);
        rect.bottom = de9.w(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setContainerHeight(float f) {
        this.K = f;
        gz9 gz9Var = this.d;
        if (gz9Var != null) {
            gz9Var.requestLayout();
        }
    }

    public void setOnSearchTextChange(p8c p8cVar) {
        this.r = p8cVar;
    }

    public void setText(CharSequence charSequence) {
        this.n = true;
        this.b.setText(charSequence);
        this.n = false;
    }

    @Override
    public final void updateColors() {
        wjb wjbVar = this.a;
        l7 l7Var = this.b;
        if (l7Var != null) {
            try {
                l7Var.setHintColor(bkb.v0(bkb.Ni, wjbVar));
                int i = bkb.Oi;
                l7Var.setCursorColor(bkb.v0(i, wjbVar));
                l7Var.setHandlesColor(bkb.v0(i, wjbVar));
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        gl.u3(this, bkb.w0(null, bkb.c6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

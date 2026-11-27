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
public abstract class t9b extends ScrollView implements snb {
    public final mm E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final vnb a;
    public final m7 b;
    public final int c;
    public final a3a d;
    public final ArrayList e;
    public zc5 f;
    public final i9b h;
    public boolean n;
    public pcc r;
    public final mm s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public t9b(Context context, vnb vnbVar, i9b i9bVar) {
        super(context);
        int i;
        this.e = new ArrayList();
        k43 k43Var = k43.h;
        this.s = new mm(this, 0L, 300L, k43Var);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.E = new mm(this, 0L, 300L, k43Var);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = vnbVar;
        this.h = i9bVar;
        setVerticalScrollBarEnabled(false);
        hl.u3(this, aob.w0(null, aob.d6, false));
        a3a a3aVar = new a3a(this, context);
        this.d = a3aVar;
        addView(a3aVar, tre.c(-2.0f, -1));
        m7 m7Var = new m7((byte) 8, context, this);
        this.b = m7Var;
        if (Build.VERSION.SDK_INT >= 25) {
            m7Var.setRevealOnFocusHint(false);
        }
        m7Var.setTextSize(1, 16.0f);
        yob.l(m7Var, 34, aob.Oi, vnbVar);
        yob.X(m7Var, aob.G6, vnbVar);
        int i2 = aob.Pi;
        yob.l(m7Var, 30, i2, vnbVar);
        yob.l(m7Var, 36, i2, vnbVar);
        m7Var.setCursorWidth(1.5f);
        m7Var.setInputType(m7Var.getInputType() | 176);
        m7Var.setSingleLine(true);
        m7Var.setBackgroundDrawable(null);
        m7Var.setVerticalScrollBarEnabled(false);
        m7Var.setHorizontalScrollBarEnabled(false);
        m7Var.setTextIsSelectable(false);
        m7Var.setPadding(0, 0, 0, 0);
        m7Var.setImeOptions(268435462);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        m7Var.setGravity(i | 16);
        a3aVar.addView(m7Var);
        m7Var.setHintText(ob6.M0(2131745564, null));
        this.c = (int) m7Var.getPaint().measureText(ob6.M0(2131745564, null));
        m7Var.addTextChangedListener(new nh6(this, (byte) 15));
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
        canvas.drawRect(0.0f, scrollY2, getWidth(), hl.L(8.0f) + scrollY, paint);
        float d2 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - hl.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - hl.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = uh9.w(20.0f, this.J, rect.top);
        rect.bottom = uh9.w(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setContainerHeight(float f) {
        this.K = f;
        a3a a3aVar = this.d;
        if (a3aVar != null) {
            a3aVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(pcc pccVar) {
        this.r = pccVar;
    }

    public void setText(CharSequence charSequence) {
        this.n = true;
        this.b.setText(charSequence);
        this.n = false;
    }

    @Override
    public final void updateColors() {
        vnb vnbVar = this.a;
        m7 m7Var = this.b;
        if (m7Var != null) {
            try {
                m7Var.setHintColor(aob.v0(aob.Oi, vnbVar));
                int i = aob.Pi;
                m7Var.setCursorColor(aob.v0(i, vnbVar));
                m7Var.setHandlesColor(aob.v0(i, vnbVar));
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        hl.u3(this, aob.w0(null, aob.d6, false));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class hz9 extends ScrollView implements tjb {
    public final lm E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final wjb a;
    public final l7 b;
    public final int c;
    public final gz9 d;
    public final ArrayList e;
    public ya5 f;
    public boolean h;
    public p8c n;
    public int r;
    public final lm s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public hz9(Context context, wjb wjbVar) {
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
        setVerticalScrollBarEnabled(false);
        int w0 = bkb.w0(null, bkb.c6, false);
        this.r = w0;
        gl.v3(this, w0);
        gz9 gz9Var = new gz9(this, context);
        this.d = gz9Var;
        addView(gz9Var, nme.c(-2.0f, -1));
        l7 l7Var = new l7((byte) 6, context, this);
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
        l7Var.addTextChangedListener(new jf6(this, (byte) 11));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        ya5 ya5Var = (ya5) view;
        if (ya5Var.E) {
            this.f = null;
            gz9 gz9Var = this.d;
            hz9 hz9Var = (hz9) gz9Var.n;
            hz9Var.I = true;
            hz9Var.e.remove(ya5Var);
            ya5Var.setOnClickListener(null);
            gz9Var.c();
            gz9Var.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gz9Var.b = animatorSet;
            animatorSet.addListener(new eh8((Object) gz9Var, (Object) ya5Var, (byte) 14));
            ArrayList arrayList = gz9Var.h;
            arrayList.clear();
            arrayList.add(ya5Var);
            ArrayList arrayList2 = gz9Var.d;
            arrayList2.clear();
            gz9Var.e.clear();
            arrayList2.add(ya5Var);
            ArrayList arrayList3 = gz9Var.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(ya5Var, View.ALPHA, 1.0f, 0.0f));
            gz9Var.requestLayout();
            hashSet.remove(Long.valueOf(ya5Var.getUid()));
            runnable.run();
            return;
        }
        ya5 ya5Var2 = this.f;
        if (ya5Var2 != null) {
            ya5Var2.a();
            this.f = null;
        }
        this.f = ya5Var;
        ya5Var.b();
    }

    public final void b(boolean z, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i;
        Property property;
        Property property2;
        Property property3;
        Object K0;
        na7 na7Var;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        na7 q1 = na7.q1(y6c.t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i2 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i2 >= arrayList2.size()) {
                break;
            }
            ya5 ya5Var = (ya5) arrayList2.get(i2);
            if (!hashSet.contains(Long.valueOf(ya5Var.getUid()))) {
                arrayList4.add(ya5Var);
            }
            i2++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            int i3 = 0;
            while (true) {
                if (i3 < arrayList2.size()) {
                    if (((ya5) arrayList2.get(i3)).getUid() == longValue) {
                        na7Var = q1;
                        break;
                    }
                    i3++;
                } else {
                    if (longValue >= 0) {
                        K0 = q1.V1(l);
                    } else {
                        K0 = q1.K0(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList3.get(i4);
                            i4++;
                            TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj;
                            na7Var = q1;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                q1 = na7Var;
                            }
                        }
                    }
                    na7Var = q1;
                    tL_help_country = K0;
                    if (tL_help_country != null) {
                        ya5 ya5Var2 = new ya5(getContext(), tL_help_country, null, true, this.a);
                        ya5Var2.setOnClickListener(new hu4(this, hashSet, runnable, (byte) 20));
                        arrayList5.add(ya5Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            q1 = na7Var;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            gz9 gz9Var = this.d;
            ArrayList arrayList6 = gz9Var.e;
            ArrayList arrayList7 = gz9Var.d;
            ArrayList arrayList8 = gz9Var.f;
            hz9 hz9Var = (hz9) gz9Var.n;
            hz9Var.I = true;
            ArrayList arrayList9 = hz9Var.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = gz9Var.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                ((ya5) arrayList4.get(i5)).setOnClickListener(null);
            }
            gz9Var.c();
            if (z) {
                gz9Var.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                gz9Var.b = animatorSet;
                animatorSet.addListener(new fz9(gz9Var, arrayList4, (byte) 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i6 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i6 >= size2) {
                        break;
                    }
                    ya5 ya5Var3 = (ya5) arrayList4.get(i6);
                    arrayList6.add(ya5Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(ya5Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(ya5Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(ya5Var3, property, 1.0f, 0.0f));
                    i6++;
                }
                for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                    ya5 ya5Var4 = (ya5) arrayList5.get(i7);
                    arrayList7.add(ya5Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(ya5Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(ya5Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(ya5Var4, property, 0.0f, 1.0f));
                }
                i = 0;
            } else {
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    gz9Var.removeView((View) arrayList4.get(i8));
                }
                arrayList10.clear();
                gz9Var.b = null;
                i = 0;
                gz9Var.c = false;
                hz9Var.b.setAllowDrawCursor(true);
            }
            for (int i9 = i; i9 < arrayList5.size(); i9++) {
                gz9Var.addView((View) arrayList5.get(i9));
            }
            gz9Var.requestLayout();
        }
        this.b.setOnKeyListener(new ez9(this, hashSet, runnable));
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

    public EditTextBoldCursor getEditText() {
        return this.b;
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
        this.n = p8cVar;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.c6, false);
            int i = this.r;
            if (i != 0 && w0 != i) {
                this.r = w0;
                gl.v3(this, w0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

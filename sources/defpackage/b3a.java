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
public abstract class b3a extends ScrollView implements snb {
    public final mm E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final vnb a;
    public final m7 b;
    public final int c;
    public final a3a d;
    public final ArrayList e;
    public zc5 f;
    public boolean h;
    public pcc n;
    public int r;
    public final mm s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public b3a(Context context, vnb vnbVar) {
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
        setVerticalScrollBarEnabled(false);
        int w0 = aob.w0(null, aob.d6, false);
        this.r = w0;
        hl.u3(this, w0);
        a3a a3aVar = new a3a(this, context);
        this.d = a3aVar;
        addView(a3aVar, tre.c(-2.0f, -1));
        m7 m7Var = new m7((byte) 6, context, this);
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
        m7Var.addTextChangedListener(new nh6(this, (byte) 12));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        zc5 zc5Var = (zc5) view;
        if (zc5Var.E) {
            this.f = null;
            a3a a3aVar = this.d;
            b3a b3aVar = (b3a) a3aVar.n;
            b3aVar.I = true;
            b3aVar.e.remove(zc5Var);
            zc5Var.setOnClickListener(null);
            a3aVar.c();
            a3aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            a3aVar.b = animatorSet;
            animatorSet.addListener(new wd8((Object) a3aVar, (Object) zc5Var, (byte) 15));
            ArrayList arrayList = a3aVar.h;
            arrayList.clear();
            arrayList.add(zc5Var);
            ArrayList arrayList2 = a3aVar.d;
            arrayList2.clear();
            a3aVar.e.clear();
            arrayList2.add(zc5Var);
            ArrayList arrayList3 = a3aVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(zc5Var, View.ALPHA, 1.0f, 0.0f));
            a3aVar.requestLayout();
            hashSet.remove(Long.valueOf(zc5Var.getUid()));
            runnable.run();
            return;
        }
        zc5 zc5Var2 = this.f;
        if (zc5Var2 != null) {
            zc5Var2.a();
            this.f = null;
        }
        this.f = zc5Var;
        zc5Var.b();
    }

    public final void b(boolean z, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        uc7 uc7Var;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        uc7 s1 = uc7.s1(yac.t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i2 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i2 >= arrayList2.size()) {
                break;
            }
            zc5 zc5Var = (zc5) arrayList2.get(i2);
            if (!hashSet.contains(Long.valueOf(zc5Var.getUid()))) {
                arrayList4.add(zc5Var);
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
                    if (((zc5) arrayList2.get(i3)).getUid() == longValue) {
                        uc7Var = s1;
                        break;
                    }
                    i3++;
                } else {
                    if (longValue >= 0) {
                        M0 = s1.X1(l);
                    } else {
                        M0 = s1.M0(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList3.get(i4);
                            i4++;
                            TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj;
                            uc7Var = s1;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                s1 = uc7Var;
                            }
                        }
                    }
                    uc7Var = s1;
                    tL_help_country = M0;
                    if (tL_help_country != null) {
                        zc5 zc5Var2 = new zc5(getContext(), tL_help_country, null, true, this.a);
                        zc5Var2.setOnClickListener(new lw4(this, hashSet, runnable, (byte) 20));
                        arrayList5.add(zc5Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            s1 = uc7Var;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            a3a a3aVar = this.d;
            ArrayList arrayList6 = a3aVar.e;
            ArrayList arrayList7 = a3aVar.d;
            ArrayList arrayList8 = a3aVar.f;
            b3a b3aVar = (b3a) a3aVar.n;
            b3aVar.I = true;
            ArrayList arrayList9 = b3aVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = a3aVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                ((zc5) arrayList4.get(i5)).setOnClickListener(null);
            }
            a3aVar.c();
            if (z) {
                a3aVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                a3aVar.b = animatorSet;
                animatorSet.addListener(new z2a(a3aVar, arrayList4, (byte) 0));
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
                    zc5 zc5Var3 = (zc5) arrayList4.get(i6);
                    arrayList6.add(zc5Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(zc5Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(zc5Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(zc5Var3, property, 1.0f, 0.0f));
                    i6++;
                }
                for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                    zc5 zc5Var4 = (zc5) arrayList5.get(i7);
                    arrayList7.add(zc5Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(zc5Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(zc5Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(zc5Var4, property, 0.0f, 1.0f));
                }
                i = 0;
            } else {
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    a3aVar.removeView((View) arrayList4.get(i8));
                }
                arrayList10.clear();
                a3aVar.b = null;
                i = 0;
                a3aVar.c = false;
                b3aVar.b.setAllowDrawCursor(true);
            }
            for (int i9 = i; i9 < arrayList5.size(); i9++) {
                a3aVar.addView((View) arrayList5.get(i9));
            }
            a3aVar.requestLayout();
        }
        this.b.setOnKeyListener(new y2a(this, hashSet, runnable));
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

    public EditTextBoldCursor getEditText() {
        return this.b;
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
        this.n = pccVar;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.d6, false);
            int i = this.r;
            if (i != 0 && w0 != i) {
                this.r = w0;
                hl.u3(this, w0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

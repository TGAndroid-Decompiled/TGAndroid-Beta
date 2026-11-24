package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class nx3 extends View {
    public final Paint a;
    public final TextPaint b;
    public final ArrayList c;
    public float[] d;
    public lw3 e;
    public final px3 f;

    public nx3(px3 px3Var, Context context) {
        super(context);
        String str;
        String a;
        this.f = px3Var;
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(gm.n1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(gm.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        setPadding(0, 0, 0, 0);
        if (px3Var.E0(4)) {
            kx3 kx3Var = new kx3(this, 4, 2131232206, jb6.M0(2131744128, null));
            int i = px3.C1;
            if (!z8c.h(px3Var.a).p()) {
                Drawable mutate = getContext().getResources().getDrawable(2131232249).mutate();
                kx3Var.j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(cmb.p1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                kx3Var.n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(kx3Var);
        }
        if (px3Var.E0(0)) {
            arrayList.add(new kx3(this, 0, 2131231653, jb6.M0(2131744127, null)));
        }
        if (px3Var.E0(5)) {
            iuc iucVar = juc.b;
            kx3[] kx3VarArr = {null};
            StringBuilder sb = new StringBuilder();
            if (iucVar == null) {
                str = "🌤";
            } else {
                str = iucVar.c;
            }
            sb.append(str);
            sb.append(" ");
            if (iucVar == null) {
                if (juc.a()) {
                    a = "24°C";
                } else {
                    a = "72°F";
                }
            } else {
                a = iucVar.a();
            }
            sb.append(a);
            CharSequence m = gw3.m(sb.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder = m;
            if (oc7.r1(px3Var.a).l4.v2.f) {
                spannableStringBuilder = m;
                spannableStringBuilder = m;
                if (use.d("android.permission.ACCESS_COARSE_LOCATION") && iucVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new ta6(gm.L(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    kx3VarArr[0] = new kx3(this, spannableStringBuilder2);
                    use.c(2131624120, 2131747035, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ra((byte) 10, new ra((byte) 9, new qy1(this, kx3VarArr, (byte) 15), false), false));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            kx3 kx3Var2 = kx3VarArr[0];
            arrayList.add(kx3Var2 == null ? new kx3(this, spannableStringBuilder) : kx3Var2);
        }
        if (px3Var.E0(6)) {
            arrayList.add(new kx3(this, 6, 2131231191, jb6.M0(2131744129, null)));
        }
        if (px3Var.E0(1)) {
            arrayList.add(new kx3(this, 1, 2131231192, jb6.M0(2131744130, null)));
        }
        if (px3Var.E0(2)) {
            arrayList.add(new kx3(this, 2, 2131231149, jb6.M0(2131744126, null)));
        }
        if (px3Var.E0(3)) {
            arrayList.add(new mx3(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                float[] fArr = this.d;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = 0.0f;
                i2++;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            jx3 jx3Var = (jx3) obj;
            int i4 = jx3Var.e - 1;
            float[] fArr2 = this.d;
            float f = fArr2[i4];
            if (f > 0.0f) {
                fArr2[i4] = f + gm.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i4] = fArr3[i4] + jx3Var.h.e(false, jx3Var.b);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            jx3 jx3Var2 = (jx3) obj2;
            jx3Var2.a(canvas, aq1.z((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[jx3Var2.e - 1], 2.0f, getPaddingLeft()) + jx3Var2.d, hg9.y(48.0f, jx3Var2.e - 1, gm.L(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((jx3) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((jx3) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.c;
        int size2 = arrayList.size();
        int i3 = 0;
        int i4 = 1;
        float f = 0.0f;
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList.get(i5);
            i5++;
            jx3 jx3Var = (jx3) obj;
            jx3Var.d = f;
            float L = jx3Var.b + gm.L(10.0f) + f;
            if (L > paddingLeft) {
                i4++;
                jx3Var.d = 0.0f;
                f = jx3Var.b + gm.L(10.0f) + 0.0f;
            } else {
                f = L;
            }
            jx3Var.e = i4;
        }
        float[] fArr = this.d;
        if (fArr != null && fArr.length == i4) {
            Arrays.fill(fArr, 0.0f);
        } else {
            this.d = new float[i4];
        }
        int size3 = arrayList.size();
        while (i3 < size3) {
            Object obj2 = arrayList.get(i3);
            i3++;
            jx3 jx3Var2 = (jx3) obj2;
            int i6 = jx3Var2.e - 1;
            float[] fArr2 = this.d;
            float f2 = fArr2[i6];
            if (f2 > 0.0f) {
                fArr2[i6] = f2 + gm.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i6] = fArr3[i6] + jx3Var2.b;
        }
        setMeasuredDimension(size, hg9.y(12.0f, i4 - 1, hg9.y(36.0f, i4, gm.L(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jx3 jx3Var;
        lw3 lw3Var;
        boolean z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jx3Var = (jx3) obj;
                if (jx3Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                jx3Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            jx3 jx3Var2 = (jx3) obj2;
            if (jx3Var2 != jx3Var) {
                jx3Var2.g.c(false);
            }
        }
        if (jx3Var != null) {
            u51 u51Var = jx3Var.g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z = true;
            } else {
                z = false;
            }
            u51Var.c(z);
        }
        if (motionEvent.getAction() == 1 && jx3Var != null && (lw3Var = this.e) != null) {
            byte b = jx3Var.a;
            px3 px3Var = lw3Var.b;
            int i3 = px3.C1;
            px3Var.H0(b);
        }
        if (jx3Var == null) {
            return false;
        }
        return true;
    }
}

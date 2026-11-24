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
public final class cw3 extends View {
    public final Paint a;
    public final TextPaint b;
    public final ArrayList c;
    public float[] d;
    public av3 e;
    public final ew3 f;

    public cw3(ew3 ew3Var, Context context) {
        super(context);
        String str;
        String a;
        this.f = ew3Var;
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(gl.n1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(gl.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        setPadding(0, 0, 0, 0);
        if (ew3Var.E0(4)) {
            zv3 zv3Var = new zv3(this, 4, 2131232205, k96.M0(2131744202, null));
            int i = ew3.C1;
            if (!y6c.h(ew3Var.a).p()) {
                Drawable mutate = getContext().getResources().getDrawable(2131232248).mutate();
                zv3Var.j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                zv3Var.n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(zv3Var);
        }
        if (ew3Var.E0(0)) {
            arrayList.add(new zv3(this, 0, 2131231652, k96.M0(2131744201, null)));
        }
        if (ew3Var.E0(5)) {
            fsc fscVar = gsc.b;
            zv3[] zv3VarArr = {null};
            StringBuilder sb = new StringBuilder();
            if (fscVar == null) {
                str = "🌤";
            } else {
                str = fscVar.c;
            }
            sb.append(str);
            sb.append(" ");
            if (fscVar == null) {
                if (gsc.a()) {
                    a = "24°C";
                } else {
                    a = "72°F";
                }
            } else {
                a = fscVar.a();
            }
            sb.append(a);
            CharSequence m = vu3.m(sb.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder = m;
            if (na7.q1(ew3Var.a).k4.v2.f) {
                spannableStringBuilder = m;
                spannableStringBuilder = m;
                if (rqe.d("android.permission.ACCESS_COARSE_LOCATION") && fscVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new u86(gl.L(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    zv3VarArr[0] = new zv3(this, spannableStringBuilder2);
                    rqe.c(2131624120, 2131747109, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ra((byte) 10, new ra((byte) 9, new pz1(this, zv3VarArr, (byte) 14), false), false));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            zv3 zv3Var2 = zv3VarArr[0];
            arrayList.add(zv3Var2 == null ? new zv3(this, spannableStringBuilder) : zv3Var2);
        }
        if (ew3Var.E0(6)) {
            arrayList.add(new zv3(this, 6, 2131231190, k96.M0(2131744203, null)));
        }
        if (ew3Var.E0(1)) {
            arrayList.add(new zv3(this, 1, 2131231191, k96.M0(2131744204, null)));
        }
        if (ew3Var.E0(2)) {
            arrayList.add(new zv3(this, 2, 2131231148, k96.M0(2131744200, null)));
        }
        if (ew3Var.E0(3)) {
            arrayList.add(new bw3(this));
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
                fa4.g(e, true);
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            yv3 yv3Var = (yv3) obj;
            int i4 = yv3Var.e - 1;
            float[] fArr2 = this.d;
            float f = fArr2[i4];
            if (f > 0.0f) {
                fArr2[i4] = f + gl.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i4] = fArr3[i4] + yv3Var.h.e(false, yv3Var.b);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            yv3 yv3Var2 = (yv3) obj2;
            yv3Var2.a(canvas, oo1.z((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[yv3Var2.e - 1], 2.0f, getPaddingLeft()) + yv3Var2.d, de9.y(48.0f, yv3Var2.e - 1, gl.L(12.0f)));
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
            ((yv3) obj).b(true);
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
            ((yv3) obj).b(false);
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
            yv3 yv3Var = (yv3) obj;
            yv3Var.d = f;
            float L = yv3Var.b + gl.L(10.0f) + f;
            if (L > paddingLeft) {
                i4++;
                yv3Var.d = 0.0f;
                f = yv3Var.b + gl.L(10.0f) + 0.0f;
            } else {
                f = L;
            }
            yv3Var.e = i4;
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
            yv3 yv3Var2 = (yv3) obj2;
            int i6 = yv3Var2.e - 1;
            float[] fArr2 = this.d;
            float f2 = fArr2[i6];
            if (f2 > 0.0f) {
                fArr2[i6] = f2 + gl.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i6] = fArr3[i6] + yv3Var2.b;
        }
        setMeasuredDimension(size, de9.y(12.0f, i4 - 1, de9.y(36.0f, i4, gl.L(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yv3 yv3Var;
        av3 av3Var;
        boolean z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                yv3Var = (yv3) obj;
                if (yv3Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                yv3Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            yv3 yv3Var2 = (yv3) obj2;
            if (yv3Var2 != yv3Var) {
                yv3Var2.g.c(false);
            }
        }
        if (yv3Var != null) {
            n41 n41Var = yv3Var.g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z = true;
            } else {
                z = false;
            }
            n41Var.c(z);
        }
        if (motionEvent.getAction() == 1 && yv3Var != null && (av3Var = this.e) != null) {
            byte b = yv3Var.a;
            ew3 ew3Var = av3Var.b;
            int i3 = ew3.C1;
            ew3Var.H0(b);
        }
        if (yv3Var == null) {
            return false;
        }
        return true;
    }
}

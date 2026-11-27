package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
public final class oq3 extends View implements fn7, snb {
    public boolean E;
    public int F;
    public final Paint a;
    public final Paint b;
    public final int c;
    public final ArrayList d;
    public float e;
    public float f;
    public float h;
    public final ImageReceiver n;
    public final ImageReceiver r;
    public final b29 s;
    public final b29 w;
    public boolean x;
    public int y;

    public oq3(Context context, int i) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.r = imageReceiver2;
        this.c = i;
        imageReceiver.y = true;
        imageReceiver2.y = true;
        b29 b29Var = new b29(2131624005, hl.L(28.0f), hl.L(28.0f), true, null);
        this.s = b29Var;
        b29 b29Var2 = new b29(2131624004, hl.L(28.0f), hl.L(28.0f), true, null);
        this.w = b29Var2;
        imageReceiver.g0(b29Var);
        imageReceiver2.g0(b29Var2);
        imageReceiver.M(1);
        b29Var.F(1);
        b29Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i = this.c;
        ArrayList arrayList2 = lq3.q(i).H;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (true) {
            arrayList = this.d;
            if (i2 >= arrayList.size()) {
                break;
            }
            hashMap.put(((nq3) arrayList.get(i2)).c, (nq3) arrayList.get(i2));
            lq3.q(i).v((jq3) arrayList.get(i2));
            i2++;
        }
        arrayList.clear();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            String S0 = ((r47) arrayList2.get(i3)).S0();
            if (xb4.G(i).S(S0)) {
                nq3 nq3Var = (nq3) hashMap.get(S0);
                if (nq3Var == null) {
                    nq3Var = new nq3(this, S0);
                }
                lq3.q(i).a(S0, null, nq3Var);
                arrayList.add(nq3Var);
            }
        }
        if (arrayList.size() == 0 && !this.E) {
            if (lq3.q(i).J.size() > 0) {
                this.e = 1.0f;
                this.f = 1.0f;
                this.x = true;
                return;
            }
            this.e = 0.0f;
            this.f = 0.0f;
            this.x = false;
        }
    }

    public final void b() {
        float f;
        kf7.a0(this.c);
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                break;
            }
            j += ((nq3) arrayList.get(i)).a;
            j2 += ((nq3) arrayList.get(i)).b;
            i++;
        }
        float f2 = 1.0f;
        if (j == 0) {
            this.e = 1.0f;
            f = 1.0f;
        } else {
            f = ((float) j2) / ((float) j);
            this.e = f;
        }
        if (f > 1.0f) {
            this.e = 1.0f;
        } else {
            f2 = 0.0f;
            if (f < 0.0f) {
                this.e = 0.0f;
            } else {
                f2 = f;
            }
        }
        this.h = ((f2 - this.f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.e5) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        jn7.f(this.c).b(this, jn7.e5);
        this.n.I();
        this.r.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i2 = this.c;
            if (i < size) {
                lq3.q(i2).v((jq3) arrayList.get(i));
                i++;
            } else {
                arrayList.clear();
                jn7.f(i2).n(this, jn7.e5);
                this.n.K();
                this.r.K();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i = this.y;
            int i2 = aob.v8;
            int w0 = aob.w0(null, i2, false);
            ImageReceiver imageReceiver = this.r;
            ImageReceiver imageReceiver2 = this.n;
            Paint paint = this.a;
            Paint paint2 = this.b;
            if (i != w0) {
                this.y = aob.w0(null, i2, false);
                paint.setColor(aob.w0(null, i2, false));
                paint2.setColor(aob.w0(null, i2, false));
                int w02 = aob.w0(null, i2, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.p1 = new PorterDuffColorFilter(w02, mode);
                imageReceiver.p1 = new PorterDuffColorFilter(aob.w0(null, i2, false), mode);
                paint2.setAlpha(100);
            }
            float f = this.f;
            float f2 = this.e;
            if (f != f2) {
                float f3 = this.h;
                float f4 = f + f3;
                this.f = f4;
                if (f3 > 0.0f && f4 > f2) {
                    this.f = f2;
                } else if (f3 < 0.0f && f4 < f2) {
                    this.f = f2;
                } else {
                    invalidate();
                }
            }
            int L = hl.L(8.0f);
            float L2 = hl.L(1.0f);
            float L3 = hl.L(16.0f);
            RectF rectF = hl.P;
            float measuredHeight = L + (getMeasuredHeight() / 2);
            float f5 = measuredHeight - L2;
            float f6 = measuredHeight + L2;
            rectF.set(L3, f5, getMeasuredWidth() - L3, f6);
            canvas.drawRoundRect(rectF, L2, L2, paint2);
            rectF.set(L3, f5, ((getMeasuredWidth() - (2.0f * L3)) * this.f) + L3, f6);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f5);
            if (this.e != 1.0f) {
                this.x = false;
            }
            if (this.x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.e == 1.0f && !this.x && this.s.b0 == 0) {
                b29 b29Var = this.w;
                b29Var.I(0, false, false);
                b29Var.start();
                this.x = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.E = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        int L = hl.L(15.0f);
        float f = L;
        int i3 = L << 1;
        this.n.i0(f, f, getMeasuredWidth() - i3, getMeasuredHeight() - i3);
        this.r.i0(f, f, getMeasuredWidth() - i3, getMeasuredHeight() - i3);
    }

    @Override
    public void setAlpha(float f) {
        if (f == 0.0f) {
            this.E = false;
        }
        super.setAlpha(f);
    }

    @Override
    public void setVisibility(int i) {
        if (i != 0) {
            this.E = false;
        }
        super.setVisibility(i);
    }

    @Override
    public final void updateColors() {
        b29 b29Var;
        b29 b29Var2 = this.s;
        if (b29Var2 != null && (b29Var = this.w) != null) {
            int w0 = aob.w0(null, aob.v8, false);
            if (w0 != this.F || b29Var2.getColorFilter() == null) {
                this.F = w0;
                b29Var2.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                b29Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

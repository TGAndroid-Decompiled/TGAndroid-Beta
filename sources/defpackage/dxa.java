package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public abstract class dxa extends FrameLayout implements tjb {
    public final Window a;
    public final nf0 b;
    public final nf0 c;
    public final hk1 d;
    public final RadialProgressView e;
    public final TextView f;
    public final ar8 h;
    public final ArrayList n;
    public gxa r;
    public final int s;

    public dxa(Context context, int i, mf0 mf0Var, wjb wjbVar) {
        super(context);
        ima imaVar;
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i;
        LinearLayout j = de9.j(context, 1);
        this.h = new ar8(context, (byte) 11);
        hk1 hk1Var = new hk1(getContext(), wjbVar);
        this.d = hk1Var;
        ?? obj = new Object();
        TextView textView = hk1Var.d;
        textView.setOnTouchListener(obj);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final dxa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                dxa dxaVar = this.b;
                switch (b) {
                    case 0:
                        dxaVar.h(true);
                        return;
                    case 1:
                        dxaVar.c();
                        return;
                    default:
                        dxaVar.c.c(false);
                        return;
                }
            }
        });
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            this.b = new nf0(getContext(), null);
                            nf0 nf0Var = new nf0(getContext(), null);
                            this.c = nf0Var;
                            nf0Var.u0.E = true;
                            imaVar = nf0Var;
                        } else {
                            this.b = new nf0(getContext(), null);
                            nf0 nf0Var2 = new nf0(getContext(), null);
                            this.c = nf0Var2;
                            nf0Var2.u0.E = true;
                            imaVar = nf0Var2;
                        }
                    } else {
                        mma mmaVar = new mma(getContext());
                        this.b = mmaVar;
                        mmaVar.u0.F = true;
                        ?? mmaVar2 = new mma(getContext());
                        mmaVar2.N1 = -1;
                        mmaVar2.O1 = new RectF();
                        mmaVar2.Q1 = gl.L(9.0f);
                        mmaVar2.R1 = gl.L(13.0f);
                        mmaVar2.S1 = new String[101];
                        mmaVar2.U1 = 1.0f;
                        mmaVar2.V1 = 0;
                        mmaVar2.W1 = -1;
                        mmaVar2.X1 = -1;
                        for (int i2 = 1; i2 <= 100; i2++) {
                            mmaVar2.S1[i2] = oo1.n(i2, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        mmaVar2.P1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        mmaVar2.i1 = true;
                        this.c = mmaVar2;
                        imaVar = mmaVar2;
                    }
                } else {
                    nf0 nf0Var3 = new nf0(getContext(), null);
                    nf0Var3.x0 = true;
                    nf0Var3.y0 = true;
                    this.b = nf0Var3;
                    nf0 nf0Var4 = new nf0(getContext(), null);
                    this.c = nf0Var4;
                    nf0Var4.u0.E = true;
                    imaVar = nf0Var4;
                }
            } else {
                this.b = new ima(getContext(), wjbVar);
                ima imaVar2 = new ima(getContext(), wjbVar);
                this.c = imaVar2;
                imaVar2.u0.E = true;
                imaVar = imaVar2;
            }
        } else {
            this.b = new nf0(getContext(), wjbVar);
            nf0 nf0Var5 = new nf0(getContext(), wjbVar);
            this.c = nf0Var5;
            nf0Var5.u0.E = true;
            imaVar = nf0Var5;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = mf0Var;
        imaVar.a = mf0Var;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.u0, -2, -2);
        frameLayout.addView(imaVar);
        frameLayout.addView(imaVar.u0, -2, -2);
        frameLayout.addView(radialProgressView, nme.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 15.0f);
        frameLayout.addView(textView2, nme.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        zkb.X(textView2, bkb.r5, wjbVar);
        this.b.setDateSelectionListener(new wh9(this, (byte) 28));
        this.b.u0.d(false, false);
        this.b.u0.setOnTouchListener(new Object());
        this.b.u0.setOnClickListener(new View.OnClickListener(this) {
            public final dxa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                dxa dxaVar = this.b;
                switch (b) {
                    case 0:
                        dxaVar.h(true);
                        return;
                    case 1:
                        dxaVar.c();
                        return;
                    default:
                        dxaVar.c.c(false);
                        return;
                }
            }
        });
        imaVar.u0.setOnClickListener(new View.OnClickListener(this) {
            public final dxa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                dxa dxaVar = this.b;
                switch (b) {
                    case 0:
                        dxaVar.h(true);
                        return;
                    case 1:
                        dxaVar.c();
                        return;
                    default:
                        dxaVar.c.c(false);
                        return;
                }
            }
        });
        this.b.setVisibility(0);
        imaVar.setVisibility(4);
        this.b.setHeader(this.d);
        j.addView(this.d, nme.c(52.0f, -1));
        j.addView(frameLayout, nme.c(-2.0f, -1));
        j.addView(this.h, nme.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            j.setClipChildren(false);
            j.setClipToPadding(false);
        }
        addView(j);
    }

    public final ValueAnimator a(long j, boolean z) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        nf0 nf0Var = this.b;
        nf0Var.K = false;
        nf0 nf0Var2 = this.c;
        nf0Var2.K = false;
        nf0Var.z0 = (byte) 2;
        nf0Var2.z0 = (byte) 1;
        final ?? obj = new Object();
        lk1 lk1Var = nf0Var.h0;
        obj.b = lk1Var.l;
        obj.a = lk1Var.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        obj.c = this.r.d.b[binarySearch];
        nf0Var2.setVisibility(0);
        nf0Var2.A0 = obj;
        nf0Var.A0 = obj;
        long j2 = 0;
        long j3 = 2147483647L;
        for (int i = 0; i < this.r.d.d.size(); i++) {
            if (((ek1) this.r.d.d.get(i)).a[binarySearch] > j2) {
                j2 = ((ek1) this.r.d.d.get(i)).a[binarySearch];
            }
            if (((ek1) this.r.d.d.get(i)).a[binarySearch] < j3) {
                j3 = ((ek1) this.r.d.d.get(i)).a[binarySearch];
            }
        }
        float f = ((float) j3) + ((float) (j2 - j3));
        float f2 = nf0Var.x;
        final float f3 = (f - f2) / (nf0Var.w - f2);
        nf0Var.q(obj);
        nf0Var2.q(obj);
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (!z) {
            f5 = 1.0f;
            f4 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f4);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dxa dxaVar = dxa.this;
                nf0 nf0Var3 = dxaVar.b;
                float f6 = nf0Var3.G0;
                lk1 lk1Var2 = nf0Var3.h0;
                float f7 = lk1Var2.l;
                float f8 = lk1Var2.k;
                float f9 = ((f6 / (f7 - f8)) * f8) - nf0.l1;
                RectF rectF = nf0Var3.I0;
                float f10 = rectF.top;
                float height = rectF.height();
                zyb zybVar = obj;
                zybVar.e = (height * (1.0f - f3)) + f10;
                zybVar.d = (nf0Var3.H0 * zybVar.c) - f9;
                zybVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nf0 nf0Var4 = dxaVar.c;
                nf0Var4.invalidate();
                nf0Var4.q(zybVar);
                nf0Var3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new c84());
        return ofFloat;
    }

    public final void d() {
        fk1 fk1Var;
        ArrayList arrayList;
        int i;
        nf0 nf0Var = this.b;
        nf0Var.G();
        nf0Var.invalidate();
        nf0 nf0Var2 = this.c;
        nf0Var2.G();
        nf0Var2.invalidate();
        hk1 hk1Var = this.d;
        hk1Var.a();
        hk1Var.invalidate();
        gxa gxaVar = this.r;
        if (gxaVar != null && (fk1Var = gxaVar.d) != null && (arrayList = fk1Var.d) != null && arrayList.size() > 1) {
            for (int i2 = 0; i2 < this.r.d.d.size(); i2++) {
                if (((ek1) this.r.d.d.get(i2)).g >= 0 && bkb.d1(((ek1) this.r.d.d.get(i2)).g)) {
                    i = bkb.w0(null, ((ek1) this.r.d.d.get(i2)).g, false);
                } else {
                    int i3 = (bm2.h(bkb.w0(null, bkb.c6, false)) > 0.5d ? 1 : (bm2.h(bkb.w0(null, bkb.c6, false)) == 0.5d ? 0 : -1));
                    gxa gxaVar2 = this.r;
                    if (i3 < 0) {
                        i = ((ek1) gxaVar2.d.d.get(i2)).i;
                    } else {
                        i = ((ek1) gxaVar2.d.d.get(i2)).h;
                    }
                }
                ArrayList arrayList2 = this.n;
                if (i2 < arrayList2.size()) {
                    oi4 oi4Var = ((cxa) arrayList2.get(i2)).a;
                    oi4Var.getClass();
                    oi4Var.r = bkb.w0(null, bkb.c6, false);
                    oi4Var.w = -1;
                    oi4Var.s = i;
                    oi4Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(bkb.w0(null, bkb.g6, false));
        this.f.setTextColor(bkb.w0(null, bkb.r5, false));
    }

    public final void e(gxa gxaVar, boolean z) {
        boolean z2;
        boolean z3;
        if (gxaVar != null) {
            String str = gxaVar.j;
            hk1 hk1Var = this.d;
            hk1Var.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            nf0 nf0Var = this.b;
            nf0Var.setLandscape(z2);
            ArrayList arrayList = nf0Var.d;
            lk1 lk1Var = nf0Var.h0;
            nf0 nf0Var2 = this.c;
            nf0Var2.setLandscape(z2);
            this.r = gxaVar;
            boolean z4 = gxaVar.l;
            ArrayList arrayList2 = this.n;
            ar8 ar8Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f;
            if (!z4 && !gxaVar.a) {
                textView.setVisibility(8);
                m06 m06Var = nf0Var.u0;
                boolean z5 = gxaVar.n;
                m06Var.a = z5;
                hk1Var.c(!z5);
                if (gxaVar.d == null && gxaVar.f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(gxaVar);
                    nf0Var.D(null);
                    return;
                }
                if (!z) {
                    radialProgressView.setVisibility(8);
                }
                if (nf0Var.D(gxaVar.d) && gxaVar.h) {
                    lk1Var.k = 0.0f;
                    lk1Var.l = 1.0f;
                    lk1Var.a.A(true, false, false);
                }
                hk1Var.setUseWeekInterval(gxaVar.o);
                nf0Var.u0.setUseWeek(gxaVar.o);
                m06 m06Var2 = nf0Var.u0;
                if (this.r.g == null && this.s != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                m06Var2.G = z3;
                nf0Var2.u0.G = false;
                m06Var2.setEnabled(m06Var2.G);
                m06 m06Var3 = nf0Var2.u0;
                m06Var3.setEnabled(m06Var3.G);
                int size = arrayList.size();
                ar8Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i = 0; i < size; i++) {
                        k26 k26Var = (k26) arrayList.get(i);
                        cxa cxaVar = new cxa(this, i);
                        cxaVar.b = k26Var;
                        String str2 = k26Var.a.d;
                        oi4 oi4Var = cxaVar.a;
                        oi4Var.setText(str2);
                        oi4Var.a(k26Var.n, false);
                        oi4Var.setOnTouchListener(new Object());
                        oi4Var.setOnClickListener(new b99(cxaVar, k26Var, (byte) 19));
                        oi4Var.setOnLongClickListener(new u0(cxaVar, k26Var, (byte) 7));
                    }
                }
                long j = this.r.c;
                if (j > 0) {
                    nf0Var.t0 = Arrays.binarySearch(nf0Var.i0.a, j);
                    nf0Var.v0 = true;
                    nf0Var.u0.setVisibility(0);
                    nf0Var.w0 = 1.0f;
                    nf0Var.x((nf0Var.H0 * lk1Var.k) - nf0.l1);
                    try {
                        nf0Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g(true);
                } else {
                    h(false);
                    nf0Var.invalidate();
                }
                d();
                if (z) {
                    nf0Var.z0 = (byte) 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    nf0Var.A0 = obj;
                    obj.f = 0.0f;
                    ofFloat.addUpdateListener(new gja(this, (byte) 8));
                    ofFloat.addListener(new bxa(this, (byte) 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = gxaVar.b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            ar8Var.removeAllViews();
            arrayList2.clear();
            nf0Var.D(null);
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        boolean z2;
        float f;
        nf0 nf0Var = this.b;
        long selectedDate = nf0Var.getSelectedDate();
        fk1 fk1Var = this.r.e;
        nf0 nf0Var2 = this.c;
        if (!z || nf0Var2.getVisibility() != 0) {
            nf0Var2.J(fk1Var, selectedDate);
        }
        nf0Var2.D(fk1Var);
        ArrayList arrayList2 = nf0Var2.d;
        if (this.r.d.d.size() > 1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int size = this.r.d.d.size();
                arrayList = this.n;
                if (i >= size) {
                    break;
                }
                int i3 = 0;
                while (true) {
                    if (i3 < fk1Var.d.size()) {
                        if (((ek1) fk1Var.d.get(i3)).c.equals(((ek1) this.r.d.d.get(i)).c)) {
                            boolean z3 = ((cxa) arrayList.get(i)).a.b;
                            ((k26) arrayList2.get(i3)).n = z3;
                            k26 k26Var = (k26) arrayList2.get(i3);
                            if (z3) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            k26Var.o = f;
                            ((cxa) arrayList.get(i)).a.c = true;
                            ((cxa) arrayList.get(i)).a.animate().alpha(1.0f).start();
                            if (z3) {
                                i2++;
                            }
                            z2 = true;
                        } else {
                            i3++;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    ((cxa) arrayList.get(i)).a.c = false;
                    ((cxa) arrayList.get(i)).a.animate().alpha(0.0f).start();
                }
                i++;
            }
            if (i2 == 0) {
                for (int i4 = 0; i4 < this.r.d.d.size(); i4++) {
                    ((cxa) arrayList.get(i4)).a.c = true;
                    ((cxa) arrayList.get(i4)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        nf0Var.u0.setAlpha(0.0f);
        nf0Var.w0 = 0.0f;
        nf0Var.v0 = false;
        nf0Var.j1 = false;
        nf0Var2.G();
        hk1 hk1Var = this.d;
        if (!z) {
            nf0Var2.d();
            hk1Var.d(selectedDate, true);
        }
        nf0Var2.setHeader(hk1Var);
        nf0Var.setHeader(null);
        if (z) {
            nf0Var.setVisibility(4);
            nf0Var2.setVisibility(0);
            nf0Var.z0 = (byte) 0;
            nf0Var2.z0 = (byte) 0;
            nf0Var.K = false;
            nf0Var2.K = true;
            hk1Var.d(selectedDate, false);
            return;
        }
        ValueAnimator a = a(selectedDate, true);
        a.addListener(new bxa(this, (byte) 0));
        a.start();
    }

    public final void h(boolean z) {
        fk1 fk1Var;
        gxa gxaVar = this.r;
        if (gxaVar != null && (fk1Var = gxaVar.d) != null && fk1Var.a != null) {
            hk1 hk1Var = this.d;
            TextView textView = hk1Var.d;
            nf0 nf0Var = this.b;
            hk1Var.b(nf0Var.getStartDate(), nf0Var.getEndDate());
            TextView textView2 = hk1Var.a;
            if (z) {
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.3f);
                textView2.setScaleY(0.3f);
                textView2.setPivotX(0.0f);
                textView2.setPivotY(0.0f);
                textView2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
                textView.setAlpha(1.0f);
                textView.setTranslationX(0.0f);
                textView.setTranslationY(0.0f);
                textView.setScaleX(1.0f);
                textView.setScaleY(1.0f);
                textView.setPivotY(gl.L(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            nf0Var.u0.f.setAlpha(1.0f);
            nf0 nf0Var2 = this.c;
            nf0Var2.setHeader(null);
            long selectedDate = nf0Var.getSelectedDate();
            this.r.c = 0L;
            int i = 0;
            nf0Var.setVisibility(0);
            nf0Var2.d();
            nf0Var2.setHeader(null);
            nf0Var.setHeader(hk1Var);
            ArrayList arrayList = this.n;
            if (!z) {
                nf0Var2.setVisibility(4);
                nf0Var.K = true;
                nf0Var2.K = false;
                nf0Var.invalidate();
                Window window = this.a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    cxa cxaVar = (cxa) obj;
                    cxaVar.a.setAlpha(1.0f);
                    cxaVar.a.c = true;
                }
                return;
            }
            ValueAnimator a = a(selectedDate, false);
            a.addListener(new bxa(this, (byte) 1));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                cxa cxaVar2 = (cxa) obj2;
                cxaVar2.a.animate().alpha(1.0f).start();
                cxaVar2.a.c = true;
            }
            a.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
                d();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void c() {
    }

    public void f() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(gxa gxaVar) {
    }
}

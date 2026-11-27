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
public abstract class g1b extends FrameLayout implements snb {
    public final Window a;
    public final pf0 b;
    public final pf0 c;
    public final qk1 d;
    public final RadialProgressView e;
    public final TextView f;
    public final ir8 h;
    public final ArrayList n;
    public i1b r;
    public final int s;

    public g1b(Context context, int i, of0 of0Var, vnb vnbVar) {
        super(context);
        fqa fqaVar;
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i;
        LinearLayout j = uh9.j(context, 1);
        this.h = new ir8(context, (byte) 12);
        qk1 qk1Var = new qk1(getContext(), vnbVar);
        this.d = qk1Var;
        ?? obj = new Object();
        TextView textView = qk1Var.d;
        textView.setOnTouchListener(obj);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final g1b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                g1b g1bVar = this.b;
                switch (b) {
                    case 0:
                        g1bVar.h(true);
                        return;
                    case 1:
                        g1bVar.c();
                        return;
                    default:
                        g1bVar.c.c(false);
                        return;
                }
            }
        });
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            this.b = new pf0(getContext(), null);
                            pf0 pf0Var = new pf0(getContext(), null);
                            this.c = pf0Var;
                            pf0Var.u0.E = true;
                            fqaVar = pf0Var;
                        } else {
                            this.b = new pf0(getContext(), null);
                            pf0 pf0Var2 = new pf0(getContext(), null);
                            this.c = pf0Var2;
                            pf0Var2.u0.E = true;
                            fqaVar = pf0Var2;
                        }
                    } else {
                        jqa jqaVar = new jqa(getContext());
                        this.b = jqaVar;
                        jqaVar.u0.F = true;
                        ?? jqaVar2 = new jqa(getContext());
                        jqaVar2.N1 = -1;
                        jqaVar2.O1 = new RectF();
                        jqaVar2.Q1 = hl.L(9.0f);
                        jqaVar2.R1 = hl.L(13.0f);
                        jqaVar2.S1 = new String[101];
                        jqaVar2.U1 = 1.0f;
                        jqaVar2.V1 = 0;
                        jqaVar2.W1 = -1;
                        jqaVar2.X1 = -1;
                        for (int i2 = 1; i2 <= 100; i2++) {
                            jqaVar2.S1[i2] = bp1.n(i2, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        jqaVar2.P1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        jqaVar2.i1 = true;
                        this.c = jqaVar2;
                        fqaVar = jqaVar2;
                    }
                } else {
                    pf0 pf0Var3 = new pf0(getContext(), null);
                    pf0Var3.x0 = true;
                    pf0Var3.y0 = true;
                    this.b = pf0Var3;
                    pf0 pf0Var4 = new pf0(getContext(), null);
                    this.c = pf0Var4;
                    pf0Var4.u0.E = true;
                    fqaVar = pf0Var4;
                }
            } else {
                this.b = new fqa(getContext(), vnbVar);
                fqa fqaVar2 = new fqa(getContext(), vnbVar);
                this.c = fqaVar2;
                fqaVar2.u0.E = true;
                fqaVar = fqaVar2;
            }
        } else {
            this.b = new pf0(getContext(), vnbVar);
            pf0 pf0Var5 = new pf0(getContext(), vnbVar);
            this.c = pf0Var5;
            pf0Var5.u0.E = true;
            fqaVar = pf0Var5;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = of0Var;
        fqaVar.a = of0Var;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.u0, -2, -2);
        frameLayout.addView(fqaVar);
        frameLayout.addView(fqaVar.u0, -2, -2);
        frameLayout.addView(radialProgressView, tre.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 15.0f);
        frameLayout.addView(textView2, tre.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        yob.X(textView2, aob.s5, vnbVar);
        this.b.setDateSelectionListener(new hja(this, (byte) 11));
        this.b.u0.d(false, false);
        this.b.u0.setOnTouchListener(new Object());
        this.b.u0.setOnClickListener(new View.OnClickListener(this) {
            public final g1b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                g1b g1bVar = this.b;
                switch (b) {
                    case 0:
                        g1bVar.h(true);
                        return;
                    case 1:
                        g1bVar.c();
                        return;
                    default:
                        g1bVar.c.c(false);
                        return;
                }
            }
        });
        fqaVar.u0.setOnClickListener(new View.OnClickListener(this) {
            public final g1b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                g1b g1bVar = this.b;
                switch (b) {
                    case 0:
                        g1bVar.h(true);
                        return;
                    case 1:
                        g1bVar.c();
                        return;
                    default:
                        g1bVar.c.c(false);
                        return;
                }
            }
        });
        this.b.setVisibility(0);
        fqaVar.setVisibility(4);
        this.b.setHeader(this.d);
        j.addView(this.d, tre.c(52.0f, -1));
        j.addView(frameLayout, tre.c(-2.0f, -1));
        j.addView(this.h, tre.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
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
        pf0 pf0Var = this.b;
        pf0Var.K = false;
        pf0 pf0Var2 = this.c;
        pf0Var2.K = false;
        pf0Var.z0 = (byte) 2;
        pf0Var2.z0 = (byte) 1;
        final ?? obj = new Object();
        uk1 uk1Var = pf0Var.h0;
        obj.b = uk1Var.l;
        obj.a = uk1Var.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        obj.c = this.r.d.b[binarySearch];
        pf0Var2.setVisibility(0);
        pf0Var2.A0 = obj;
        pf0Var.A0 = obj;
        long j2 = 0;
        long j3 = 2147483647L;
        for (int i = 0; i < this.r.d.d.size(); i++) {
            if (((nk1) this.r.d.d.get(i)).a[binarySearch] > j2) {
                j2 = ((nk1) this.r.d.d.get(i)).a[binarySearch];
            }
            if (((nk1) this.r.d.d.get(i)).a[binarySearch] < j3) {
                j3 = ((nk1) this.r.d.d.get(i)).a[binarySearch];
            }
        }
        float f = ((float) j3) + ((float) (j2 - j3));
        float f2 = pf0Var.x;
        final float f3 = (f - f2) / (pf0Var.w - f2);
        pf0Var.q(obj);
        pf0Var2.q(obj);
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
                g1b g1bVar = g1b.this;
                pf0 pf0Var3 = g1bVar.b;
                float f6 = pf0Var3.G0;
                uk1 uk1Var2 = pf0Var3.h0;
                float f7 = uk1Var2.l;
                float f8 = uk1Var2.k;
                float f9 = ((f6 / (f7 - f8)) * f8) - pf0.l1;
                RectF rectF = pf0Var3.I0;
                float f10 = rectF.top;
                float height = rectF.height();
                z2c z2cVar = obj;
                z2cVar.e = (height * (1.0f - f3)) + f10;
                z2cVar.d = (pf0Var3.H0 * z2cVar.c) - f9;
                z2cVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0 pf0Var4 = g1bVar.c;
                pf0Var4.invalidate();
                pf0Var4.q(z2cVar);
                pf0Var3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x84());
        return ofFloat;
    }

    public final void d() {
        ok1 ok1Var;
        ArrayList arrayList;
        int i;
        pf0 pf0Var = this.b;
        pf0Var.G();
        pf0Var.invalidate();
        pf0 pf0Var2 = this.c;
        pf0Var2.G();
        pf0Var2.invalidate();
        qk1 qk1Var = this.d;
        qk1Var.a();
        qk1Var.invalidate();
        i1b i1bVar = this.r;
        if (i1bVar != null && (ok1Var = i1bVar.d) != null && (arrayList = ok1Var.d) != null && arrayList.size() > 1) {
            for (int i2 = 0; i2 < this.r.d.d.size(); i2++) {
                if (((nk1) this.r.d.d.get(i2)).g >= 0 && aob.d1(((nk1) this.r.d.d.get(i2)).g)) {
                    i = aob.w0(null, ((nk1) this.r.d.d.get(i2)).g, false);
                } else {
                    int i3 = (vm2.h(aob.w0(null, aob.d6, false)) > 0.5d ? 1 : (vm2.h(aob.w0(null, aob.d6, false)) == 0.5d ? 0 : -1));
                    i1b i1bVar2 = this.r;
                    if (i3 < 0) {
                        i = ((nk1) i1bVar2.d.d.get(i2)).i;
                    } else {
                        i = ((nk1) i1bVar2.d.d.get(i2)).h;
                    }
                }
                ArrayList arrayList2 = this.n;
                if (i2 < arrayList2.size()) {
                    sk4 sk4Var = ((f1b) arrayList2.get(i2)).a;
                    sk4Var.getClass();
                    sk4Var.r = aob.w0(null, aob.d6, false);
                    sk4Var.w = -1;
                    sk4Var.s = i;
                    sk4Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(aob.w0(null, aob.h6, false));
        this.f.setTextColor(aob.w0(null, aob.s5, false));
    }

    public final void e(i1b i1bVar, boolean z) {
        boolean z2;
        boolean z3;
        if (i1bVar != null) {
            String str = i1bVar.j;
            qk1 qk1Var = this.d;
            qk1Var.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            pf0 pf0Var = this.b;
            pf0Var.setLandscape(z2);
            ArrayList arrayList = pf0Var.d;
            uk1 uk1Var = pf0Var.h0;
            pf0 pf0Var2 = this.c;
            pf0Var2.setLandscape(z2);
            this.r = i1bVar;
            boolean z4 = i1bVar.l;
            ArrayList arrayList2 = this.n;
            ir8 ir8Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f;
            if (!z4 && !i1bVar.a) {
                textView.setVisibility(8);
                q26 q26Var = pf0Var.u0;
                boolean z5 = i1bVar.n;
                q26Var.a = z5;
                qk1Var.c(!z5);
                if (i1bVar.d == null && i1bVar.f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(i1bVar);
                    pf0Var.D(null);
                    return;
                }
                if (!z) {
                    radialProgressView.setVisibility(8);
                }
                if (pf0Var.D(i1bVar.d) && i1bVar.h) {
                    uk1Var.k = 0.0f;
                    uk1Var.l = 1.0f;
                    uk1Var.a.A(true, false, false);
                }
                qk1Var.setUseWeekInterval(i1bVar.o);
                pf0Var.u0.setUseWeek(i1bVar.o);
                q26 q26Var2 = pf0Var.u0;
                if (this.r.g == null && this.s != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                q26Var2.G = z3;
                pf0Var2.u0.G = false;
                q26Var2.setEnabled(q26Var2.G);
                q26 q26Var3 = pf0Var2.u0;
                q26Var3.setEnabled(q26Var3.G);
                int size = arrayList.size();
                ir8Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i = 0; i < size; i++) {
                        o46 o46Var = (o46) arrayList.get(i);
                        f1b f1bVar = new f1b(this, i);
                        f1bVar.b = o46Var;
                        String str2 = o46Var.a.d;
                        sk4 sk4Var = f1bVar.a;
                        sk4Var.setText(str2);
                        sk4Var.a(o46Var.n, false);
                        sk4Var.setOnTouchListener(new Object());
                        sk4Var.setOnClickListener(new jy8(f1bVar, o46Var, (byte) 22));
                        sk4Var.setOnLongClickListener(new v0(f1bVar, o46Var, (byte) 7));
                    }
                }
                long j = this.r.c;
                if (j > 0) {
                    pf0Var.t0 = Arrays.binarySearch(pf0Var.i0.a, j);
                    pf0Var.v0 = true;
                    pf0Var.u0.setVisibility(0);
                    pf0Var.w0 = 1.0f;
                    pf0Var.x((pf0Var.H0 * uk1Var.k) - pf0.l1);
                    try {
                        pf0Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g(true);
                } else {
                    h(false);
                    pf0Var.invalidate();
                }
                d();
                if (z) {
                    pf0Var.z0 = (byte) 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    pf0Var.A0 = obj;
                    obj.f = 0.0f;
                    ofFloat.addUpdateListener(new ija(this, (byte) 10));
                    ofFloat.addListener(new e1b(this, (byte) 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = i1bVar.b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            ir8Var.removeAllViews();
            arrayList2.clear();
            pf0Var.D(null);
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        boolean z2;
        float f;
        pf0 pf0Var = this.b;
        long selectedDate = pf0Var.getSelectedDate();
        ok1 ok1Var = this.r.e;
        pf0 pf0Var2 = this.c;
        if (!z || pf0Var2.getVisibility() != 0) {
            pf0Var2.J(ok1Var, selectedDate);
        }
        pf0Var2.D(ok1Var);
        ArrayList arrayList2 = pf0Var2.d;
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
                    if (i3 < ok1Var.d.size()) {
                        if (((nk1) ok1Var.d.get(i3)).c.equals(((nk1) this.r.d.d.get(i)).c)) {
                            boolean z3 = ((f1b) arrayList.get(i)).a.b;
                            ((o46) arrayList2.get(i3)).n = z3;
                            o46 o46Var = (o46) arrayList2.get(i3);
                            if (z3) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            o46Var.o = f;
                            ((f1b) arrayList.get(i)).a.c = true;
                            ((f1b) arrayList.get(i)).a.animate().alpha(1.0f).start();
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
                    ((f1b) arrayList.get(i)).a.c = false;
                    ((f1b) arrayList.get(i)).a.animate().alpha(0.0f).start();
                }
                i++;
            }
            if (i2 == 0) {
                for (int i4 = 0; i4 < this.r.d.d.size(); i4++) {
                    ((f1b) arrayList.get(i4)).a.c = true;
                    ((f1b) arrayList.get(i4)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        pf0Var.u0.setAlpha(0.0f);
        pf0Var.w0 = 0.0f;
        pf0Var.v0 = false;
        pf0Var.j1 = false;
        pf0Var2.G();
        qk1 qk1Var = this.d;
        if (!z) {
            pf0Var2.d();
            qk1Var.d(selectedDate, true);
        }
        pf0Var2.setHeader(qk1Var);
        pf0Var.setHeader(null);
        if (z) {
            pf0Var.setVisibility(4);
            pf0Var2.setVisibility(0);
            pf0Var.z0 = (byte) 0;
            pf0Var2.z0 = (byte) 0;
            pf0Var.K = false;
            pf0Var2.K = true;
            qk1Var.d(selectedDate, false);
            return;
        }
        ValueAnimator a = a(selectedDate, true);
        a.addListener(new e1b(this, (byte) 0));
        a.start();
    }

    public final void h(boolean z) {
        ok1 ok1Var;
        i1b i1bVar = this.r;
        if (i1bVar != null && (ok1Var = i1bVar.d) != null && ok1Var.a != null) {
            qk1 qk1Var = this.d;
            TextView textView = qk1Var.d;
            pf0 pf0Var = this.b;
            qk1Var.b(pf0Var.getStartDate(), pf0Var.getEndDate());
            TextView textView2 = qk1Var.a;
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
                textView.setPivotY(hl.L(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            pf0Var.u0.f.setAlpha(1.0f);
            pf0 pf0Var2 = this.c;
            pf0Var2.setHeader(null);
            long selectedDate = pf0Var.getSelectedDate();
            this.r.c = 0L;
            int i = 0;
            pf0Var.setVisibility(0);
            pf0Var2.d();
            pf0Var2.setHeader(null);
            pf0Var.setHeader(qk1Var);
            ArrayList arrayList = this.n;
            if (!z) {
                pf0Var2.setVisibility(4);
                pf0Var.K = true;
                pf0Var2.K = false;
                pf0Var.invalidate();
                Window window = this.a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    f1b f1bVar = (f1b) obj;
                    f1bVar.a.setAlpha(1.0f);
                    f1bVar.a.c = true;
                }
                return;
            }
            ValueAnimator a = a(selectedDate, false);
            a.addListener(new e1b(this, (byte) 1));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                f1b f1bVar2 = (f1b) obj2;
                f1bVar2.a.animate().alpha(1.0f).start();
                f1bVar2.a.c = true;
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
            cc4.g(e, true);
        }
    }

    public void c() {
    }

    public void f() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(i1b i1bVar) {
    }
}

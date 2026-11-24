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
public abstract class gza extends FrameLayout implements vlb {
    public final Window a;
    public final ng0 b;
    public final ng0 c;
    public final pl1 d;
    public final RadialProgressView e;
    public final TextView f;
    public final ct8 h;
    public final ArrayList n;
    public jza r;
    public final int s;

    public gza(Context context, int i, mg0 mg0Var, ylb ylbVar) {
        super(context);
        joa joaVar;
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i;
        LinearLayout i2 = hg9.i(context, 1);
        this.h = new ct8(context, (byte) 11);
        pl1 pl1Var = new pl1(getContext(), ylbVar);
        this.d = pl1Var;
        ?? obj = new Object();
        TextView textView = pl1Var.d;
        textView.setOnTouchListener(obj);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final gza b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                gza gzaVar = this.b;
                switch (b) {
                    case 0:
                        gzaVar.h(true);
                        return;
                    case 1:
                        gzaVar.c();
                        return;
                    default:
                        gzaVar.c.c(false);
                        return;
                }
            }
        });
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            this.b = new ng0(getContext(), null);
                            ng0 ng0Var = new ng0(getContext(), null);
                            this.c = ng0Var;
                            ng0Var.u0.E = true;
                            joaVar = ng0Var;
                        } else {
                            this.b = new ng0(getContext(), null);
                            ng0 ng0Var2 = new ng0(getContext(), null);
                            this.c = ng0Var2;
                            ng0Var2.u0.E = true;
                            joaVar = ng0Var2;
                        }
                    } else {
                        noa noaVar = new noa(getContext());
                        this.b = noaVar;
                        noaVar.u0.F = true;
                        ?? noaVar2 = new noa(getContext());
                        noaVar2.N1 = -1;
                        noaVar2.O1 = new RectF();
                        noaVar2.Q1 = gm.L(9.0f);
                        noaVar2.R1 = gm.L(13.0f);
                        noaVar2.S1 = new String[101];
                        noaVar2.U1 = 1.0f;
                        noaVar2.V1 = 0;
                        noaVar2.W1 = -1;
                        noaVar2.X1 = -1;
                        for (int i3 = 1; i3 <= 100; i3++) {
                            noaVar2.S1[i3] = aq1.n(i3, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        noaVar2.P1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        noaVar2.i1 = true;
                        this.c = noaVar2;
                        joaVar = noaVar2;
                    }
                } else {
                    ng0 ng0Var3 = new ng0(getContext(), null);
                    ng0Var3.x0 = true;
                    ng0Var3.y0 = true;
                    this.b = ng0Var3;
                    ng0 ng0Var4 = new ng0(getContext(), null);
                    this.c = ng0Var4;
                    ng0Var4.u0.E = true;
                    joaVar = ng0Var4;
                }
            } else {
                this.b = new joa(getContext(), ylbVar);
                joa joaVar2 = new joa(getContext(), ylbVar);
                this.c = joaVar2;
                joaVar2.u0.E = true;
                joaVar = joaVar2;
            }
        } else {
            this.b = new ng0(getContext(), ylbVar);
            ng0 ng0Var5 = new ng0(getContext(), ylbVar);
            this.c = ng0Var5;
            ng0Var5.u0.E = true;
            joaVar = ng0Var5;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = mg0Var;
        joaVar.a = mg0Var;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.u0, -2, -2);
        frameLayout.addView(joaVar);
        frameLayout.addView(joaVar.u0, -2, -2);
        frameLayout.addView(radialProgressView, qoe.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 15.0f);
        frameLayout.addView(textView2, qoe.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        anb.X(textView2, cmb.r5, ylbVar);
        this.b.setDateSelectionListener(new wta(this, (byte) 2));
        this.b.u0.d(false, false);
        this.b.u0.setOnTouchListener(new Object());
        this.b.u0.setOnClickListener(new View.OnClickListener(this) {
            public final gza b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                gza gzaVar = this.b;
                switch (b) {
                    case 0:
                        gzaVar.h(true);
                        return;
                    case 1:
                        gzaVar.c();
                        return;
                    default:
                        gzaVar.c.c(false);
                        return;
                }
            }
        });
        joaVar.u0.setOnClickListener(new View.OnClickListener(this) {
            public final gza b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                gza gzaVar = this.b;
                switch (b) {
                    case 0:
                        gzaVar.h(true);
                        return;
                    case 1:
                        gzaVar.c();
                        return;
                    default:
                        gzaVar.c.c(false);
                        return;
                }
            }
        });
        this.b.setVisibility(0);
        joaVar.setVisibility(4);
        this.b.setHeader(this.d);
        i2.addView(this.d, qoe.c(52.0f, -1));
        i2.addView(frameLayout, qoe.c(-2.0f, -1));
        i2.addView(this.h, qoe.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            i2.setClipChildren(false);
            i2.setClipToPadding(false);
        }
        addView(i2);
    }

    public final ValueAnimator a(long j, boolean z) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ng0 ng0Var = this.b;
        ng0Var.K = false;
        ng0 ng0Var2 = this.c;
        ng0Var2.K = false;
        ng0Var.z0 = (byte) 2;
        ng0Var2.z0 = (byte) 1;
        final ?? obj = new Object();
        tl1 tl1Var = ng0Var.h0;
        obj.b = tl1Var.l;
        obj.a = tl1Var.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        obj.c = this.r.d.b[binarySearch];
        ng0Var2.setVisibility(0);
        ng0Var2.A0 = obj;
        ng0Var.A0 = obj;
        long j2 = 0;
        long j3 = 2147483647L;
        for (int i = 0; i < this.r.d.d.size(); i++) {
            if (((ml1) this.r.d.d.get(i)).a[binarySearch] > j2) {
                j2 = ((ml1) this.r.d.d.get(i)).a[binarySearch];
            }
            if (((ml1) this.r.d.d.get(i)).a[binarySearch] < j3) {
                j3 = ((ml1) this.r.d.d.get(i)).a[binarySearch];
            }
        }
        float f = ((float) j3) + ((float) (j2 - j3));
        float f2 = ng0Var.x;
        final float f3 = (f - f2) / (ng0Var.w - f2);
        ng0Var.q(obj);
        ng0Var2.q(obj);
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
                gza gzaVar = gza.this;
                ng0 ng0Var3 = gzaVar.b;
                float f6 = ng0Var3.G0;
                tl1 tl1Var2 = ng0Var3.h0;
                float f7 = tl1Var2.l;
                float f8 = tl1Var2.k;
                float f9 = ((f6 / (f7 - f8)) * f8) - ng0.l1;
                RectF rectF = ng0Var3.I0;
                float f10 = rectF.top;
                float height = rectF.height();
                a1c a1cVar = obj;
                a1cVar.e = (height * (1.0f - f3)) + f10;
                a1cVar.d = (ng0Var3.H0 * a1cVar.c) - f9;
                a1cVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var4 = gzaVar.c;
                ng0Var4.invalidate();
                ng0Var4.q(a1cVar);
                ng0Var3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new l94());
        return ofFloat;
    }

    public final void d() {
        nl1 nl1Var;
        ArrayList arrayList;
        int i;
        ng0 ng0Var = this.b;
        ng0Var.G();
        ng0Var.invalidate();
        ng0 ng0Var2 = this.c;
        ng0Var2.G();
        ng0Var2.invalidate();
        pl1 pl1Var = this.d;
        pl1Var.a();
        pl1Var.invalidate();
        jza jzaVar = this.r;
        if (jzaVar != null && (nl1Var = jzaVar.d) != null && (arrayList = nl1Var.d) != null && arrayList.size() > 1) {
            for (int i2 = 0; i2 < this.r.d.d.size(); i2++) {
                if (((ml1) this.r.d.d.get(i2)).g >= 0 && cmb.d1(((ml1) this.r.d.d.get(i2)).g)) {
                    i = cmb.w0(null, ((ml1) this.r.d.d.get(i2)).g, false);
                } else {
                    int i3 = (on2.h(cmb.w0(null, cmb.c6, false)) > 0.5d ? 1 : (on2.h(cmb.w0(null, cmb.c6, false)) == 0.5d ? 0 : -1));
                    jza jzaVar2 = this.r;
                    if (i3 < 0) {
                        i = ((ml1) jzaVar2.d.d.get(i2)).i;
                    } else {
                        i = ((ml1) jzaVar2.d.d.get(i2)).h;
                    }
                }
                ArrayList arrayList2 = this.n;
                if (i2 < arrayList2.size()) {
                    sk4 sk4Var = ((fza) arrayList2.get(i2)).a;
                    sk4Var.getClass();
                    sk4Var.r = cmb.w0(null, cmb.c6, false);
                    sk4Var.w = -1;
                    sk4Var.s = i;
                    sk4Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(cmb.w0(null, cmb.g6, false));
        this.f.setTextColor(cmb.w0(null, cmb.r5, false));
    }

    public final void e(jza jzaVar, boolean z) {
        boolean z2;
        boolean z3;
        if (jzaVar != null) {
            String str = jzaVar.j;
            pl1 pl1Var = this.d;
            pl1Var.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            ng0 ng0Var = this.b;
            ng0Var.setLandscape(z2);
            ArrayList arrayList = ng0Var.d;
            tl1 tl1Var = ng0Var.h0;
            ng0 ng0Var2 = this.c;
            ng0Var2.setLandscape(z2);
            this.r = jzaVar;
            boolean z4 = jzaVar.l;
            ArrayList arrayList2 = this.n;
            ct8 ct8Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f;
            if (!z4 && !jzaVar.a) {
                textView.setVisibility(8);
                m26 m26Var = ng0Var.u0;
                boolean z5 = jzaVar.n;
                m26Var.a = z5;
                pl1Var.c(!z5);
                if (jzaVar.d == null && jzaVar.f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(jzaVar);
                    ng0Var.D(null);
                    return;
                }
                if (!z) {
                    radialProgressView.setVisibility(8);
                }
                if (ng0Var.D(jzaVar.d) && jzaVar.h) {
                    tl1Var.k = 0.0f;
                    tl1Var.l = 1.0f;
                    tl1Var.a.A(true, false, false);
                }
                pl1Var.setUseWeekInterval(jzaVar.o);
                ng0Var.u0.setUseWeek(jzaVar.o);
                m26 m26Var2 = ng0Var.u0;
                if (this.r.g == null && this.s != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                m26Var2.G = z3;
                ng0Var2.u0.G = false;
                m26Var2.setEnabled(m26Var2.G);
                m26 m26Var3 = ng0Var2.u0;
                m26Var3.setEnabled(m26Var3.G);
                int size = arrayList.size();
                ct8Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i = 0; i < size; i++) {
                        l46 l46Var = (l46) arrayList.get(i);
                        fza fzaVar = new fza(this, i);
                        fzaVar.b = l46Var;
                        String str2 = l46Var.a.d;
                        sk4 sk4Var = fzaVar.a;
                        sk4Var.setText(str2);
                        sk4Var.a(l46Var.n, false);
                        sk4Var.setOnTouchListener(new Object());
                        sk4Var.setOnClickListener(new r39(fzaVar, l46Var, (byte) 20));
                        sk4Var.setOnLongClickListener(new u0(fzaVar, l46Var, (byte) 7));
                    }
                }
                long j = this.r.c;
                if (j > 0) {
                    ng0Var.t0 = Arrays.binarySearch(ng0Var.i0.a, j);
                    ng0Var.v0 = true;
                    ng0Var.u0.setVisibility(0);
                    ng0Var.w0 = 1.0f;
                    ng0Var.x((ng0Var.H0 * tl1Var.k) - ng0.l1);
                    try {
                        ng0Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g(true);
                } else {
                    h(false);
                    ng0Var.invalidate();
                }
                d();
                if (z) {
                    ng0Var.z0 = (byte) 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    ng0Var.A0 = obj;
                    obj.f = 0.0f;
                    ofFloat.addUpdateListener(new rha(this, (byte) 10));
                    ofFloat.addListener(new eza(this, (byte) 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = jzaVar.b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            ct8Var.removeAllViews();
            arrayList2.clear();
            ng0Var.D(null);
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        boolean z2;
        float f;
        ng0 ng0Var = this.b;
        long selectedDate = ng0Var.getSelectedDate();
        nl1 nl1Var = this.r.e;
        ng0 ng0Var2 = this.c;
        if (!z || ng0Var2.getVisibility() != 0) {
            ng0Var2.J(nl1Var, selectedDate);
        }
        ng0Var2.D(nl1Var);
        ArrayList arrayList2 = ng0Var2.d;
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
                    if (i3 < nl1Var.d.size()) {
                        if (((ml1) nl1Var.d.get(i3)).c.equals(((ml1) this.r.d.d.get(i)).c)) {
                            boolean z3 = ((fza) arrayList.get(i)).a.b;
                            ((l46) arrayList2.get(i3)).n = z3;
                            l46 l46Var = (l46) arrayList2.get(i3);
                            if (z3) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            l46Var.o = f;
                            ((fza) arrayList.get(i)).a.c = true;
                            ((fza) arrayList.get(i)).a.animate().alpha(1.0f).start();
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
                    ((fza) arrayList.get(i)).a.c = false;
                    ((fza) arrayList.get(i)).a.animate().alpha(0.0f).start();
                }
                i++;
            }
            if (i2 == 0) {
                for (int i4 = 0; i4 < this.r.d.d.size(); i4++) {
                    ((fza) arrayList.get(i4)).a.c = true;
                    ((fza) arrayList.get(i4)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        ng0Var.u0.setAlpha(0.0f);
        ng0Var.w0 = 0.0f;
        ng0Var.v0 = false;
        ng0Var.j1 = false;
        ng0Var2.G();
        pl1 pl1Var = this.d;
        if (!z) {
            ng0Var2.d();
            pl1Var.d(selectedDate, true);
        }
        ng0Var2.setHeader(pl1Var);
        ng0Var.setHeader(null);
        if (z) {
            ng0Var.setVisibility(4);
            ng0Var2.setVisibility(0);
            ng0Var.z0 = (byte) 0;
            ng0Var2.z0 = (byte) 0;
            ng0Var.K = false;
            ng0Var2.K = true;
            pl1Var.d(selectedDate, false);
            return;
        }
        ValueAnimator a = a(selectedDate, true);
        a.addListener(new eza(this, (byte) 0));
        a.start();
    }

    public final void h(boolean z) {
        nl1 nl1Var;
        jza jzaVar = this.r;
        if (jzaVar != null && (nl1Var = jzaVar.d) != null && nl1Var.a != null) {
            pl1 pl1Var = this.d;
            TextView textView = pl1Var.d;
            ng0 ng0Var = this.b;
            pl1Var.b(ng0Var.getStartDate(), ng0Var.getEndDate());
            TextView textView2 = pl1Var.a;
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
                textView.setPivotY(gm.L(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            ng0Var.u0.f.setAlpha(1.0f);
            ng0 ng0Var2 = this.c;
            ng0Var2.setHeader(null);
            long selectedDate = ng0Var.getSelectedDate();
            this.r.c = 0L;
            int i = 0;
            ng0Var.setVisibility(0);
            ng0Var2.d();
            ng0Var2.setHeader(null);
            ng0Var.setHeader(pl1Var);
            ArrayList arrayList = this.n;
            if (!z) {
                ng0Var2.setVisibility(4);
                ng0Var.K = true;
                ng0Var2.K = false;
                ng0Var.invalidate();
                Window window = this.a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    fza fzaVar = (fza) obj;
                    fzaVar.a.setAlpha(1.0f);
                    fzaVar.a.c = true;
                }
                return;
            }
            ValueAnimator a = a(selectedDate, false);
            a.addListener(new eza(this, (byte) 1));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                fza fzaVar2 = (fza) obj2;
                fzaVar2.a.animate().alpha(1.0f).start();
                fzaVar2.a.c = true;
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
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(jza jzaVar) {
    }

    public void c() {
    }

    public void f() {
    }
}

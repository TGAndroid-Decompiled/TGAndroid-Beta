package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class xy0 extends FrameLayout {
    public static final HashMap L = new HashMap();
    public static final HashMap M = new HashMap();
    public static TextPaint N;
    public boolean E;
    public final RectF F;
    public ValueAnimator G;
    public float H;
    public int I;
    public final HashSet J;
    public final HashSet K;
    public final Paint a;
    public boolean b;
    public boolean c;
    public final ActionBarLayout d;
    public final vy0 e;
    public int f;
    public final km h;
    public int n;
    public final km r;
    public boolean s;
    public final ln w;
    public int x;
    public boolean y;

    public xy0(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        d53 d53Var = d53.h;
        this.h = new km(this, 200L, d53Var, 0);
        this.r = new km(this, 200L, d53Var, 0);
        this.w = new ln(this, 0L, 200L, d53Var);
        this.x = z8c.t0;
        this.F = new RectF();
        this.J = new HashSet();
        this.K = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(cmb.w0(null, cmb.Z6, false));
        vy0 vy0Var = new vy0(this, this);
        this.e = vy0Var;
        kfc.k(this, vy0Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (N == null) {
            TextPaint textPaint = new TextPaint(1);
            N = textPaint;
            textPaint.setTypeface(gm.o());
            N.setTextSize(gm.L(17.0f));
        }
        return N;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        if (indexOf >= 0) {
            return str.substring(0, indexOf + 1);
        }
        return str;
    }

    public final void b() {
        fz0 fz0Var;
        ValueAnimator valueAnimator;
        ArrayList<wy0> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        wy0 wy0Var = (wy0) b10.f(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            fz0Var = null;
        } else {
            fz0Var = launchActivity.x0;
        }
        if (fz0Var != null && (valueAnimator = fz0Var.d) != null) {
            valueAnimator.cancel();
            fz0Var.d = null;
        }
        if (size != 1 && fz0Var != null) {
            fz0Var.f();
        } else {
            e(wy0Var);
        }
    }

    public final uy0 c(wy0 wy0Var) {
        ArrayList<uy0> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabDrawables.size(); i++) {
            if (tabDrawables.get(i).a == wy0Var) {
                return tabDrawables.get(i);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f) {
        rectF.set(gm.L(4.0f), (getHeight() - gm.L(4.0f)) - gm.L(50.0f), getWidth() - gm.L(4.0f), getHeight() - gm.L(4.0f));
        rectF.offset(0.0f, (-gm.L(8.0f)) * f);
        float R1 = gm.R1(1.0f, 0.95f, Math.abs(f));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f2 = (width / 2.0f) * R1;
        rectF.left = centerX - f2;
        rectF.right = centerX + f2;
        float f3 = (height / 2.0f) * R1;
        rectF.top = centerY - f3;
        rectF.bottom = centerY + f3;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        getTabs();
        ArrayList<uy0> tabDrawables = getTabDrawables();
        if (this.H > 0.0f) {
            this.a.setColor(this.h.a(this.f, false));
            super.dispatchDraw(canvas);
            int a = this.r.a(this.n, false);
            float d = this.w.d(this.s);
            if (this.b) {
                int i = 0;
                while (i < tabDrawables.size()) {
                    uy0 uy0Var = tabDrawables.get(i);
                    float c = uy0Var.c();
                    float b = uy0Var.b();
                    if (b <= 0.0f || c > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.F;
                        d(rectF, c);
                        uy0Var.w = 0.0f;
                        if (d > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        uy0Var.m = a;
                        uy0Var.o = z;
                        canvas2 = canvas;
                        uy0Var.a(canvas2, rectF, gm.L(18.0f), b, 1.0f);
                    }
                    i++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        vy0 vy0Var;
        if (this.b && !getTabs().isEmpty() && (vy0Var = this.e) != null && vy0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(wy0 wy0Var) {
        yv1 yv1Var;
        ms1 ms1Var;
        d Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z = Q instanceof yv1;
            if (z && (ms1Var = (yv1Var = (yv1) Q).a0) != null) {
                ms1Var.R();
                yv1Var.a0.K0(true, false, true);
            }
            if (wy0Var.J != null) {
                i34 sheetFragment = this.d.getSheetFragment();
                o oVar = wy0Var.J;
                sx sxVar = oVar.L;
                sy0.a(sxVar);
                sheetFragment.addSheet(sxVar);
                rx rxVar = sxVar.c;
                sxVar.h = false;
                sxVar.n = false;
                ValueAnimator valueAnimator = sxVar.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = sxVar.F;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                sxVar.y = 0.0f;
                sxVar.x = 0.0f;
                sxVar.r();
                sxVar.A();
                rxVar.invalidate();
                rxVar.requestLayout();
                oVar.W(sheetFragment.getParentActivity(), sheetFragment);
                sxVar.q(sheetFragment);
                sxVar.o();
                h(this.x, wy0Var, false);
                return;
            }
            new x0(this, wy0Var, (byte) 9).a(Q);
            if (wy0Var.C) {
                if (!z || ((yv1) Q).a() != wy0Var.a.c) {
                    this.c = true;
                    gm.d3(new tv0(this, Q, yv1.ga(wy0Var.a.c), (byte) 3), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<wy0> tabs = getTabs();
        ArrayList<uy0> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabs.size(); i++) {
            tabs.get(i).a();
        }
        tabs.clear();
        for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
            tabDrawables.get(i2).d = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(wy0 wy0Var, qac qacVar) {
        String str;
        if (wy0Var == null) {
            qacVar.a(Boolean.TRUE);
        } else if (!wy0Var.y) {
            h(this.x, wy0Var, true);
            qacVar.a(Boolean.TRUE);
        } else {
            TLRPC.User W1 = oc7.r1(wy0Var.a.a).W1(Long.valueOf(wy0Var.a.c));
            if (W1 != null) {
                str = bw2.m(0, W1.first_name, W1.last_name);
            } else {
                rwc rwcVar = wy0Var.a;
                if (rwcVar.g == 6) {
                    str = rwcVar.e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            he heVar = alertDialog$Builder.a;
            heVar.S = str;
            heVar.U = jb6.M0(2131752870, null);
            alertDialog$Builder.j(jb6.M0(2131752869, null), new ki(this, zArr, wy0Var, qacVar, r9));
            alertDialog$Builder.g(jb6.M0(2131752542, null), new jf(zArr, (Object) qacVar, (Object) r9, (byte) 8));
            he[] heVarArr = {heVar};
            heVar.setOnDismissListener(new ty0(zArr, qacVar));
            heVarArr[0].show();
            anb.X((TextView) heVarArr[0].c(-1), cmb.p7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return gm.L(60.0f);
        }
        return gm.L(68.0f);
    }

    public ArrayList<uy0> getTabDrawables() {
        int i = this.x;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = M;
        ArrayList<uy0> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i);
            ArrayList<uy0> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<wy0> getTabs() {
        int i = this.x;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = L;
        ArrayList<wy0> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i);
            ArrayList<wy0> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i, wy0 wy0Var, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i);
        HashMap hashMap2 = M;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(wy0Var);
        if (z) {
            wy0Var.a();
        }
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            uy0 uy0Var = (uy0) arrayList3.get(i2);
            int indexOf = arrayList.indexOf(uy0Var.a);
            uy0Var.d = indexOf;
            if (indexOf >= 0) {
                uy0Var.c = indexOf;
            }
        }
        n();
        gm.d3(new tv0(this, arrayList3, wy0Var, (byte) 4), 320L);
        o(true);
        invalidate();
        vy0 vy0Var = this.e;
        if (vy0Var != null) {
            vy0Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i, boolean z) {
        boolean z2;
        float f;
        if (i != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z3 = false;
            if (!actionBarLayout.R || actionBarLayout.U) {
                z = false;
            }
            this.f = i;
            if (gm.B(i) < 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = 0.08f;
            } else {
                f = 0.75f;
            }
            int v = cmb.v(i, cmb.p1(f, -1));
            this.n = v;
            if (gm.B(v) < 0.721f) {
                z3 = true;
            }
            this.s = z3;
            if (!z) {
                this.h.a(this.f, true);
                this.r.a(this.n, true);
                this.w.f(this.s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f, float f2, int i) {
        wy0 wy0Var;
        boolean z;
        ArrayList<wy0> tabs = getTabs();
        ArrayList<uy0> tabDrawables = getTabDrawables();
        if (this.b) {
            if (tabs.isEmpty()) {
                wy0Var = null;
            } else {
                wy0Var = tabs.get(0);
            }
            uy0 c = c(wy0Var);
            if (c != null) {
                fg0 fg0Var = c.l;
                float c2 = c.c();
                RectF rectF = this.F;
                d(rectF, c2);
                if (i != 0 && i != 2) {
                    if (i == 1 || i == 3) {
                        if (this.E && i == 1) {
                            b();
                        } else if (this.y && i == 1) {
                            g(wy0Var, new bn0((byte) 2));
                        }
                        this.y = false;
                        this.E = false;
                        fg0Var.setState(new int[0]);
                    }
                } else {
                    boolean contains = fg0Var.getBounds().contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()));
                    this.y = contains;
                    if (!contains && rectF.contains(f, f2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.E = z;
                    fg0Var.setState(this.y ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
                    if (tabDrawables.get(i2) != c) {
                        tabDrawables.get(i2).l.setState(new int[0]);
                    }
                }
            } else {
                this.E = false;
                this.y = false;
            }
        } else {
            this.E = false;
            this.y = false;
        }
        if (this.E || this.y) {
            return true;
        }
        return false;
    }

    public final wy0 k(k47 k47Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (k47Var == null || (message = k47Var.k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final wy0 l(rwc rwcVar) {
        Integer valueOf = Integer.valueOf(this.x);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            wy0 wy0Var = (wy0) arrayList.get(i);
            if (rwcVar.equals(wy0Var.a)) {
                e(wy0Var);
                return wy0Var;
            }
        }
        return null;
    }

    public final wy0 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<wy0> tabs = getTabs();
        for (int i = 0; i < tabs.size(); i++) {
            wy0 wy0Var = tabs.get(i);
            o oVar = wy0Var.J;
            if (oVar != null && !oVar.e0.isEmpty()) {
                Object f = b10.f(1, wy0Var.J.e0);
                if ((f instanceof TLRPC.WebPage) && ((TLRPC.WebPage) f).id == webPage.id) {
                    e(wy0Var);
                    return wy0Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m;
        ArrayList<wy0> tabs = getTabs();
        ArrayList<uy0> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i = 0; i < tabDrawables.size(); i++) {
            uy0 uy0Var = tabDrawables.get(i);
            if (tabs.size() > 1 && uy0Var.c == 0) {
                m = gw3.m(jb6.G(tabs.size() - 1, "BotMoreTabs", uy0Var.a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m == null) {
                    uy0Var.v = null;
                } else {
                    uy0Var.v = new uib(m, 17.0f, gm.o());
                }
            } else {
                m = gw3.m(uy0Var.a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                uy0Var.v = null;
            }
            charSequence = m;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(jb6.a0(null, null, 2131754748, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(jb6.a0(null, null, 2131754748, charSequence));
    }

    public final void o(boolean z) {
        if (this.I != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                this.G = null;
                valueAnimator.cancel();
            }
            this.I = getExpandedHeight();
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, this.I);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new f0(this, (byte) 21));
                this.G.addListener(new g0(this, (byte) 28));
                this.G.setDuration(250L);
                this.G.setInterpolator(gb.w);
                this.G.start();
            } else {
                this.H = this.I;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = kfc.a;
                afc.c((View) parent);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setCurrentAccount(int i) {
        if (this.x != i) {
            this.x = i;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i) {
        i(i, true);
    }

    public void setupTab(uy0 uy0Var) {
        boolean z = false;
        int a = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        uy0Var.w = 0.0f;
        if (d > 0.5f) {
            z = true;
        }
        uy0Var.m = a;
        uy0Var.o = z;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}

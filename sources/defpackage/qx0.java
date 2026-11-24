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
public final class qx0 extends FrameLayout {
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
    public final ox0 e;
    public int f;
    public final kl h;
    public int n;
    public final kl r;
    public boolean s;
    public final lm w;
    public int x;
    public boolean y;

    public qx0(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        s33 s33Var = s33.h;
        this.h = new kl(this, 200L, s33Var, 0);
        this.r = new kl(this, 200L, s33Var, 0);
        this.w = new lm(this, 0L, 200L, s33Var);
        this.x = y6c.t0;
        this.F = new RectF();
        this.J = new HashSet();
        this.K = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(bkb.w0(null, bkb.Z6, false));
        ox0 ox0Var = new ox0(this, this);
        this.e = ox0Var;
        jdc.k(this, ox0Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (N == null) {
            TextPaint textPaint = new TextPaint(1);
            N = textPaint;
            textPaint.setTypeface(gl.o());
            N.setTextSize(gl.L(17.0f));
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
        yx0 yx0Var;
        ValueAnimator valueAnimator;
        ArrayList<px0> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        px0 px0Var = (px0) b00.f(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            yx0Var = null;
        } else {
            yx0Var = launchActivity.x0;
        }
        if (yx0Var != null && (valueAnimator = yx0Var.d) != null) {
            valueAnimator.cancel();
            yx0Var.d = null;
        }
        if (size != 1 && yx0Var != null) {
            yx0Var.f();
        } else {
            e(px0Var);
        }
    }

    public final nx0 c(px0 px0Var) {
        ArrayList<nx0> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabDrawables.size(); i++) {
            if (tabDrawables.get(i).a == px0Var) {
                return tabDrawables.get(i);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f) {
        rectF.set(gl.L(4.0f), (getHeight() - gl.L(4.0f)) - gl.L(50.0f), getWidth() - gl.L(4.0f), getHeight() - gl.L(4.0f));
        rectF.offset(0.0f, (-gl.L(8.0f)) * f);
        float R1 = gl.R1(1.0f, 0.95f, Math.abs(f));
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
        ArrayList<nx0> tabDrawables = getTabDrawables();
        if (this.H > 0.0f) {
            this.a.setColor(this.h.a(this.f, false));
            super.dispatchDraw(canvas);
            int a = this.r.a(this.n, false);
            float d = this.w.d(this.s);
            if (this.b) {
                int i = 0;
                while (i < tabDrawables.size()) {
                    nx0 nx0Var = tabDrawables.get(i);
                    float c = nx0Var.c();
                    float b = nx0Var.b();
                    if (b <= 0.0f || c > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.F;
                        d(rectF, c);
                        nx0Var.w = 0.0f;
                        if (d > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        nx0Var.m = a;
                        nx0Var.o = z;
                        canvas2 = canvas;
                        nx0Var.a(canvas2, rectF, gl.L(18.0f), b, 1.0f);
                    }
                    i++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ox0 ox0Var;
        if (this.b && !getTabs().isEmpty() && (ox0Var = this.e) != null && ox0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(px0 px0Var) {
        mu1 mu1Var;
        ar1 ar1Var;
        d Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z = Q instanceof mu1;
            if (z && (ar1Var = (mu1Var = (mu1) Q).a0) != null) {
                ar1Var.S();
                mu1Var.a0.K0(true, false, true);
            }
            if (px0Var.J != null) {
                x14 sheetFragment = this.d.getSheetFragment();
                o oVar = px0Var.J;
                sw swVar = oVar.L;
                lx0.a(swVar);
                sheetFragment.addSheet(swVar);
                rw rwVar = swVar.c;
                swVar.h = false;
                swVar.n = false;
                ValueAnimator valueAnimator = swVar.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = swVar.F;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                swVar.y = 0.0f;
                swVar.x = 0.0f;
                swVar.r();
                swVar.A();
                rwVar.invalidate();
                rwVar.requestLayout();
                oVar.W(sheetFragment.getParentActivity(), sheetFragment);
                swVar.p(sheetFragment);
                swVar.o();
                h(this.x, px0Var, false);
                return;
            }
            new x0(this, px0Var, (byte) 8).a(Q);
            if (px0Var.C) {
                if (!z || ((mu1) Q).a() != px0Var.a.c) {
                    this.c = true;
                    gl.e3(new fv0(this, Q, mu1.U9(px0Var.a.c), (byte) 2), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<px0> tabs = getTabs();
        ArrayList<nx0> tabDrawables = getTabDrawables();
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

    public final void g(px0 px0Var, p8c p8cVar) {
        String str;
        if (px0Var == null) {
            p8cVar.a(Boolean.TRUE);
        } else if (!px0Var.y) {
            h(this.x, px0Var, true);
            p8cVar.a(Boolean.TRUE);
        } else {
            TLRPC.User V1 = na7.q1(px0Var.a.a).V1(Long.valueOf(px0Var.a.c));
            if (V1 != null) {
                str = qu2.m(0, V1.first_name, V1.last_name);
            } else {
                quc qucVar = px0Var.a;
                if (qucVar.g == 6) {
                    str = qucVar.e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = str;
            hdVar.U = k96.M0(2131752905, null);
            alertDialog$Builder.j(k96.M0(2131752904, null), new kh(this, zArr, px0Var, p8cVar, r9));
            alertDialog$Builder.g(k96.M0(2131752577, null), new ie(zArr, (Object) p8cVar, (Object) r9, (byte) 8));
            hd[] hdVarArr = {hdVar};
            hdVar.setOnDismissListener(new mx0(zArr, p8cVar));
            hdVarArr[0].show();
            zkb.X((TextView) hdVarArr[0].c(-1), bkb.p7, null);
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
            return gl.L(60.0f);
        }
        return gl.L(68.0f);
    }

    public ArrayList<nx0> getTabDrawables() {
        int i = this.x;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = M;
        ArrayList<nx0> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i);
            ArrayList<nx0> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<px0> getTabs() {
        int i = this.x;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = L;
        ArrayList<px0> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i);
            ArrayList<px0> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i, px0 px0Var, boolean z) {
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
        arrayList.remove(px0Var);
        if (z) {
            px0Var.a();
        }
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            nx0 nx0Var = (nx0) arrayList3.get(i2);
            int indexOf = arrayList.indexOf(nx0Var.a);
            nx0Var.d = indexOf;
            if (indexOf >= 0) {
                nx0Var.c = indexOf;
            }
        }
        n();
        gl.e3(new fv0(this, arrayList3, px0Var, (byte) 3), 320L);
        o(true);
        invalidate();
        ox0 ox0Var = this.e;
        if (ox0Var != null) {
            ox0Var.i();
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
            if (gl.B(i) < 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = 0.08f;
            } else {
                f = 0.75f;
            }
            int v = bkb.v(i, bkb.p1(f, -1));
            this.n = v;
            if (gl.B(v) < 0.721f) {
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
        px0 px0Var;
        boolean z;
        ArrayList<px0> tabs = getTabs();
        ArrayList<nx0> tabDrawables = getTabDrawables();
        if (this.b) {
            if (tabs.isEmpty()) {
                px0Var = null;
            } else {
                px0Var = tabs.get(0);
            }
            nx0 c = c(px0Var);
            if (c != null) {
                ff0 ff0Var = c.l;
                float c2 = c.c();
                RectF rectF = this.F;
                d(rectF, c2);
                if (i != 0 && i != 2) {
                    if (i == 1 || i == 3) {
                        if (this.E && i == 1) {
                            b();
                        } else if (this.y && i == 1) {
                            g(px0Var, new bm0((byte) 2));
                        }
                        this.y = false;
                        this.E = false;
                        ff0Var.setState(new int[0]);
                    }
                } else {
                    boolean contains = ff0Var.getBounds().contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()));
                    this.y = contains;
                    if (!contains && rectF.contains(f, f2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.E = z;
                    ff0Var.setState(this.y ? new int[]{16842919, 16842910} : new int[0]);
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

    public final px0 k(k27 k27Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (k27Var == null || (message = k27Var.k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final px0 l(quc qucVar) {
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
            px0 px0Var = (px0) arrayList.get(i);
            if (qucVar.equals(px0Var.a)) {
                e(px0Var);
                return px0Var;
            }
        }
        return null;
    }

    public final px0 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<px0> tabs = getTabs();
        for (int i = 0; i < tabs.size(); i++) {
            px0 px0Var = tabs.get(i);
            o oVar = px0Var.J;
            if (oVar != null && !oVar.e0.isEmpty()) {
                Object f = b00.f(1, px0Var.J.e0);
                if ((f instanceof TLRPC.WebPage) && ((TLRPC.WebPage) f).id == webPage.id) {
                    e(px0Var);
                    return px0Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m;
        ArrayList<px0> tabs = getTabs();
        ArrayList<nx0> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i = 0; i < tabDrawables.size(); i++) {
            nx0 nx0Var = tabDrawables.get(i);
            if (tabs.size() > 1 && nx0Var.c == 0) {
                m = vu3.m(k96.G(tabs.size() - 1, "BotMoreTabs", nx0Var.a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m == null) {
                    nx0Var.v = null;
                } else {
                    nx0Var.v = new tgb(m, 17.0f, gl.o());
                }
            } else {
                m = vu3.m(nx0Var.a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                nx0Var.v = null;
            }
            charSequence = m;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(k96.a0(null, null, 2131754748, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(k96.a0(null, null, 2131754748, charSequence));
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
                ofFloat.addUpdateListener(new f0(this, (byte) 19));
                this.G.addListener(new g0(this, (byte) 26));
                this.G.setDuration(250L);
                this.G.setInterpolator(gb.w);
                this.G.start();
            } else {
                this.H = this.I;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = jdc.a;
                zcc.c((View) parent);
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

    public void setupTab(nx0 nx0Var) {
        boolean z = false;
        int a = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        nx0Var.w = 0.0f;
        if (d > 0.5f) {
            z = true;
        }
        nx0Var.m = a;
        nx0Var.o = z;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}

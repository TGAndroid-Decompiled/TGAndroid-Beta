package ih;

import ag.a1;
import ag.t0;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ig.c0;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.gr;
import org.telegram.ui.lg;
import org.telegram.ui.un;
import w7.b6;
import w7.e6;
public final class d extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, k6 {
    public final int[] D;
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final fe.b H;
    public final fe.b I;
    public final b f8523a;
    public final c f8524b;
    public final e f8525c;
    public final un d;
    public final FrameLayout.LayoutParams e;
    public final u5 f8526f;
    public f h;
    public q1 f8527n;
    public int f8528r;
    public lg f8529s;
    public final a5 f8530w;
    public final a5 f8531x;
    public final int f8532y;

    public d(Activity activity, p6 p6Var, un unVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.D = new int[2];
        this.E = new Rect();
        c0 c0Var = new c0(this, 1);
        gr grVar = gr.h;
        this.H = new fe.b(0, c0Var, grVar, 380L, false);
        this.I = new fe.b(0, new c0(this, 1), grVar, 380L, false);
        this.d = unVar;
        this.f8532y = ((l0) unVar.getMessagesController().f18957y7.I.f10700a).f16658c;
        b bVar = new b(this, activity, p6Var, 0);
        this.f8523a = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        a7.V(bVar, t6.G6, p6Var);
        a7.H(bVar, t6.Uc, p6Var);
        a7.E(bVar, t6.H6, p6Var);
        bVar.setHint(cd.L0(2131747198, null));
        bVar.setTextSize(1, 15.0f);
        bVar.setMaxLines(Integer.MAX_VALUE);
        bVar.setBackground(null);
        bVar.setImeOptions(268435462);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.addTextChangedListener(new a1(this, 3));
        c cVar = new c(activity, 0);
        this.f8524b = cVar;
        int i10 = t6.Ji;
        y h02 = t6.h0(t6.w0(i10, p6Var), 1, -1);
        w6 N = a7.N(i10);
        cVar.setBackground(h02);
        a7.k(cVar, h02, null, N, p6Var);
        e6.a(cVar);
        e eVar = new e(getContext(), 36);
        this.f8525c = eVar;
        y h03 = t6.h0(t6.w0(i10, p6Var), 1, -1);
        w6 N2 = a7.N(i10);
        eVar.setBackground(h03);
        a7.k(eVar, h03, null, N2, p6Var);
        eVar.setOnClickListener(new t0(5, this, unVar));
        e6.a(eVar);
        u5 u5Var = new u5(getContext());
        this.f8526f = u5Var;
        u5Var.setTextSize(13);
        u5Var.setGravity(17);
        u5Var.setTranslationY(i0.L(44.0f));
        u5Var.setVisibility(8);
        a5 a5Var = new a5(activity, 4);
        this.f8531x = a5Var;
        addView(a5Var, layoutParams);
        a5 a5Var2 = new a5(activity, 3);
        this.f8530w = a5Var2;
        a5Var.addView(a5Var2, b6.c(-2.0f, -1));
        a5Var2.addView(u5Var, b6.e(54, 24, 53));
        a5Var2.addView(cVar, b6.e(44, 44, 51));
        a5Var2.addView(eVar, b6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        a5Var2.addView(bVar, b6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        bVar.setPadding(i0.L(5.0f), i0.L(11.0f), i0.L(5.0f), i0.L(11.0f));
    }

    public static void a(d dVar) {
        u5 u5Var = dVar.f8526f;
        f10.d(u5Var, dVar.H.e);
        int i10 = t6.A6;
        un unVar = dVar.d;
        u5Var.setTextColor(i0.b.f(dVar.I.e, t6.w0(i10, unVar.getResourceProvider()), t6.w0(t6.f21153p7, unVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.A6));
        hashSet.add(Integer.valueOf(t6.f21153p7));
    }

    public f getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.F.removeOnPreDrawListener(this);
        }
        this.F = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        w1 w1Var;
        kh.a aVar;
        q1 q1Var = this.f8527n;
        if (q1Var != null) {
            int f12 = q1Var.getMessageObject().f1();
            if (this.f8527n.isAttachedToWindow() && this.f8528r == f12 && (w1Var = this.f8527n.f22751v2) != null && (aVar = w1Var.f23360l) != null && w1Var.f23367s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                q1 q1Var2 = this.f8527n;
                int[] iArr = this.D;
                q1Var2.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                a5 a5Var = this.f8531x;
                if (i12 != width) {
                    layoutParams.width = width;
                    a5Var.setLayoutParams(layoutParams);
                }
                a5Var.setTranslationX(rect.left);
                a5Var.setTranslationY(i0.L(0.66f) + rect.top);
                return true;
            }
            lg lgVar = this.f8529s;
            if (lgVar != null) {
                lgVar.run();
                this.f8529s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.f8530w.setAlpha(f7);
    }

    public void setCellToWatch(q1 q1Var) {
        this.f8527n = q1Var;
        this.f8528r = q1Var.getMessageObject().f1();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            c cVar = this.f8524b;
            ((Drawable) cVar.f8522c).setColorFilter(porterDuffColorFilter);
            ((Drawable) cVar.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.f8525c.f8535c).setColorFilter(porterDuffColorFilter);
            b bVar = this.f8523a;
            bVar.setCursorColor(i10);
            bVar.setHandlesColor(i10);
            bVar.setHintTextColor(i10);
        }
    }

    @Override
    public final void updateColors() {
        un unVar;
        try {
            u5 u5Var = this.f8526f;
            if (u5Var != null && (unVar = this.d) != null) {
                u5Var.setTextColor(i0.b.f(this.I.e, t6.w0(t6.A6, unVar.getResourceProvider()), t6.w0(t6.f21153p7, unVar.getResourceProvider())));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}

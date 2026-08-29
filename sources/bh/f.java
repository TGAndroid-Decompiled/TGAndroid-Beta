package bh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.u10;
import org.telegram.ui.ig;
import org.telegram.ui.tn;
public final class f extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect A;
    public ViewTreeObserver B;
    public int C;
    public final vd.a D;
    public final vd.a E;
    public final b f2654a;
    public final e f2655b;
    public final g f2656c;
    public final tn d;
    public final FrameLayout.LayoutParams f2657e;
    public final h5 f2658f;
    public h h;
    public s1 f2659n;
    public int f2660r;
    public ig f2661s;
    public final d v;
    public final d f2662w;
    public final int f2663x;
    public final int[] f2664y;

    public f(Activity activity, c6 c6Var, tn tnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f2657e = layoutParams;
        this.f2664y = new int[2];
        this.A = new Rect();
        a1.c cVar = new a1.c(this, 12);
        jr jrVar = jr.h;
        this.D = new vd.a(0, cVar, jrVar, 380L, false);
        this.E = new vd.a(0, new a1.c(this, 12), jrVar, 380L, false);
        this.d = tnVar;
        this.f2663x = tnVar.getMessagesController().config.pollAnswerLengthMax.get();
        b bVar = new b(this, activity, c6Var, 0);
        this.f2654a = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(g6.v0(g6.G6, c6Var));
        bVar.setLinkTextColor(g6.v0(g6.gc, c6Var));
        bVar.setHintTextColor(g6.v0(g6.H6, c6Var));
        bVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        bVar.setTextSize(1, 15.0f);
        bVar.setMaxLines(Integer.MAX_VALUE);
        bVar.setBackground(null);
        bVar.setImeOptions(268435462);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.addTextChangedListener(new c(this, 0));
        e eVar = new e(activity);
        this.f2655b = eVar;
        int i10 = g6.Vh;
        eVar.setBackground(g6.f0(g6.v0(i10, c6Var), 1, -1));
        h6.a(eVar);
        g gVar = new g(getContext(), 36);
        this.f2656c = gVar;
        gVar.setBackground(g6.f0(g6.v0(i10, c6Var), 1, -1));
        gVar.setOnClickListener(new ag.n(2, this, tnVar));
        h6.a(gVar);
        h5 h5Var = new h5(getContext());
        this.f2658f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        d dVar = new d(activity, 1);
        this.f2662w = dVar;
        addView(dVar, layoutParams);
        d dVar2 = new d(activity, 0);
        this.v = dVar2;
        dVar.addView(dVar2, f6.c(-2.0f, -1));
        dVar2.addView(h5Var, f6.e(54, 24, 53));
        dVar2.addView(eVar, f6.e(44, 44, 51));
        dVar2.addView(gVar, f6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        dVar2.addView(bVar, f6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        bVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(f fVar) {
        h5 h5Var = fVar.f2658f;
        u10.d(h5Var, fVar.D.f49505e);
        int i10 = g6.A6;
        tn tnVar = fVar.d;
        h5Var.setTextColor(i0.a.d(fVar.E.f49505e, g6.v0(i10, tnVar.getResourceProvider()), g6.v0(g6.f23279p7, tnVar.getResourceProvider())));
    }

    public h getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.B = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.B.removeOnPreDrawListener(this);
        }
        this.B = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        s1 s1Var;
        dh.a aVar;
        s1 s1Var2 = this.f2659n;
        if (s1Var2 != null) {
            int id2 = s1Var2.getMessageObject().getId();
            if (this.f2659n.isAttachedToWindow() && this.f2660r == id2 && (aVar = (s1Var = this.f2659n).W5) != null && s1Var.f25400j6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.A;
                rect.set(bounds);
                s1 s1Var3 = this.f2659n;
                int[] iArr = this.f2664y;
                s1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f2657e;
                int i12 = layoutParams.width;
                d dVar = this.f2662w;
                if (i12 != width) {
                    layoutParams.width = width;
                    dVar.setLayoutParams(layoutParams);
                }
                dVar.setTranslationX(rect.left);
                dVar.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ig igVar = this.f2661s;
            if (igVar != null) {
                igVar.run();
                this.f2661s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f9) {
        this.v.setAlpha(f9);
    }

    public void setCellToWatch(s1 s1Var) {
        this.f2659n = s1Var;
        this.f2660r = s1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.C != i10) {
            this.C = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            e eVar = this.f2655b;
            eVar.f2652b.setColorFilter(porterDuffColorFilter);
            eVar.f2653c.setColorFilter(porterDuffColorFilter);
            this.f2656c.f2665a.setColorFilter(porterDuffColorFilter);
            b bVar = this.f2654a;
            bVar.setCursorColor(i10);
            bVar.setHandlesColor(i10);
            bVar.setHintTextColor(i10);
        }
    }
}

package eh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ng;
import org.telegram.ui.xn;
public final class f extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect B;
    public ViewTreeObserver C;
    public int D;
    public final xd.a E;
    public final xd.a F;
    public final b f5623a;
    public final e f5624b;
    public final g f5625c;
    public final xn d;
    public final FrameLayout.LayoutParams f5626e;
    public final l5 f5627f;
    public h h;
    public t1 f5628n;
    public int f5629r;
    public ng f5630s;
    public final d v;
    public final d f5631w;
    public final int f5632x;
    public final int[] f5633y;

    public f(Activity activity, g6 g6Var, xn xnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f5626e = layoutParams;
        this.f5633y = new int[2];
        this.B = new Rect();
        a1.c cVar = new a1.c(this, 25);
        pr prVar = pr.h;
        this.E = new xd.a(0, cVar, prVar, 380L, false);
        this.F = new xd.a(0, new a1.c(this, 25), prVar, 380L, false);
        this.d = xnVar;
        this.f5632x = xnVar.getMessagesController().config.pollAnswerLengthMax.get();
        b bVar = new b(this, activity, g6Var, 0);
        this.f5623a = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(k6.v0(k6.G6, g6Var));
        bVar.setLinkTextColor(k6.v0(k6.f21720gc, g6Var));
        bVar.setHintTextColor(k6.v0(k6.H6, g6Var));
        bVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        bVar.setTextSize(1, 15.0f);
        bVar.setMaxLines(Integer.MAX_VALUE);
        bVar.setBackground(null);
        bVar.setImeOptions(268435462);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.addTextChangedListener(new c(this, 0));
        e eVar = new e(activity);
        this.f5624b = eVar;
        int i10 = k6.Vh;
        eVar.setBackground(k6.f0(k6.v0(i10, g6Var), 1, -1));
        e6.a(eVar);
        g gVar = new g(getContext(), 36);
        this.f5625c = gVar;
        gVar.setBackground(k6.f0(k6.v0(i10, g6Var), 1, -1));
        gVar.setOnClickListener(new dg.n(2, this, xnVar));
        e6.a(gVar);
        l5 l5Var = new l5(getContext());
        this.f5627f = l5Var;
        l5Var.setTextSize(13);
        l5Var.setGravity(17);
        l5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        l5Var.setVisibility(8);
        d dVar = new d(activity, 1);
        this.f5631w = dVar;
        addView(dVar, layoutParams);
        d dVar2 = new d(activity, 0);
        this.v = dVar2;
        dVar.addView(dVar2, c6.c(-2.0f, -1));
        dVar2.addView(l5Var, c6.e(54, 24, 53));
        dVar2.addView(eVar, c6.e(44, 44, 51));
        dVar2.addView(gVar, c6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        dVar2.addView(bVar, c6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        bVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(f fVar) {
        l5 l5Var = fVar.f5627f;
        a20.d(l5Var, fVar.E.f50505e);
        int i10 = k6.A6;
        xn xnVar = fVar.d;
        l5Var.setTextColor(i0.a.d(fVar.F.f50505e, k6.v0(i10, xnVar.getResourceProvider()), k6.v0(k6.f21876p7, xnVar.getResourceProvider())));
    }

    public h getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.C = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.C.removeOnPreDrawListener(this);
        }
        this.C = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        t1 t1Var;
        gh.a aVar;
        t1 t1Var2 = this.f5628n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f5628n.isAttachedToWindow() && this.f5629r == id2 && (aVar = (t1Var = this.f5628n).X5) != null && t1Var.f23917k6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.B;
                rect.set(bounds);
                t1 t1Var3 = this.f5628n;
                int[] iArr = this.f5633y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f5626e;
                int i12 = layoutParams.width;
                d dVar = this.f5631w;
                if (i12 != width) {
                    layoutParams.width = width;
                    dVar.setLayoutParams(layoutParams);
                }
                dVar.setTranslationX(rect.left);
                dVar.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ng ngVar = this.f5630s;
            if (ngVar != null) {
                ngVar.run();
                this.f5630s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.v.setAlpha(f10);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f5628n = t1Var;
        this.f5629r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.D != i10) {
            this.D = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            e eVar = this.f5624b;
            eVar.f5621b.setColorFilter(porterDuffColorFilter);
            eVar.f5622c.setColorFilter(porterDuffColorFilter);
            this.f5625c.f5634a.setColorFilter(porterDuffColorFilter);
            b bVar = this.f5623a;
            bVar.setCursorColor(i10);
            bVar.setHandlesColor(i10);
            bVar.setHintTextColor(i10);
        }
    }
}

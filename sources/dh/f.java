package dh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z10;
import org.telegram.ui.ng;
import org.telegram.ui.xn;
public final class f extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect B;
    public ViewTreeObserver C;
    public int D;
    public final xd.a E;
    public final xd.a F;
    public final b f4891a;
    public final e f4892b;
    public final g f4893c;
    public final xn d;
    public final FrameLayout.LayoutParams e;
    public final k5 f4894f;
    public h h;
    public t1 f4895n;
    public int f4896r;
    public ng f4897s;
    public final d v;
    public final d f4898w;
    public final int f4899x;
    public final int[] f4900y;

    public f(Activity activity, f6 f6Var, xn xnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f4900y = new int[2];
        this.B = new Rect();
        a1.c cVar = new a1.c(this, 20);
        nr nrVar = nr.h;
        this.E = new xd.a(0, cVar, nrVar, 380L, false);
        this.F = new xd.a(0, new a1.c(this, 20), nrVar, 380L, false);
        this.d = xnVar;
        this.f4899x = xnVar.getMessagesController().config.pollAnswerLengthMax.get();
        b bVar = new b(this, activity, f6Var, 0);
        this.f4891a = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(j6.v0(j6.G6, f6Var));
        bVar.setLinkTextColor(j6.v0(j6.f19966gc, f6Var));
        bVar.setHintTextColor(j6.v0(j6.H6, f6Var));
        bVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        bVar.setTextSize(1, 15.0f);
        bVar.setMaxLines(Integer.MAX_VALUE);
        bVar.setBackground(null);
        bVar.setImeOptions(268435462);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.addTextChangedListener(new c(this, 0));
        e eVar = new e(activity);
        this.f4892b = eVar;
        int i10 = j6.Vh;
        eVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        d6.a(eVar);
        g gVar = new g(getContext(), 36);
        this.f4893c = gVar;
        gVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        gVar.setOnClickListener(new cg.n(2, this, xnVar));
        d6.a(gVar);
        k5 k5Var = new k5(getContext());
        this.f4894f = k5Var;
        k5Var.setTextSize(13);
        k5Var.setGravity(17);
        k5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        k5Var.setVisibility(8);
        d dVar = new d(activity, 1);
        this.f4898w = dVar;
        addView(dVar, layoutParams);
        d dVar2 = new d(activity, 0);
        this.v = dVar2;
        dVar.addView(dVar2, b6.c(-2.0f, -1));
        dVar2.addView(k5Var, b6.e(54, 24, 53));
        dVar2.addView(eVar, b6.e(44, 44, 51));
        dVar2.addView(gVar, b6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        dVar2.addView(bVar, b6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        bVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(f fVar) {
        k5 k5Var = fVar.f4894f;
        z10.d(k5Var, fVar.E.e);
        int i10 = j6.A6;
        xn xnVar = fVar.d;
        k5Var.setTextColor(i0.a.d(fVar.F.e, j6.v0(i10, xnVar.getResourceProvider()), j6.v0(j6.f20122p7, xnVar.getResourceProvider())));
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
        fh.a aVar;
        t1 t1Var2 = this.f4895n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f4895n.isAttachedToWindow() && this.f4896r == id2 && (aVar = (t1Var = this.f4895n).X5) != null && t1Var.f22117k6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.B;
                rect.set(bounds);
                t1 t1Var3 = this.f4895n;
                int[] iArr = this.f4900y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                d dVar = this.f4898w;
                if (i12 != width) {
                    layoutParams.width = width;
                    dVar.setLayoutParams(layoutParams);
                }
                dVar.setTranslationX(rect.left);
                dVar.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ng ngVar = this.f4897s;
            if (ngVar != null) {
                ngVar.run();
                this.f4897s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.v.setAlpha(f10);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f4895n = t1Var;
        this.f4896r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.D != i10) {
            this.D = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            e eVar = this.f4892b;
            eVar.f4889b.setColorFilter(porterDuffColorFilter);
            eVar.f4890c.setColorFilter(porterDuffColorFilter);
            this.f4893c.f4901a.setColorFilter(porterDuffColorFilter);
            b bVar = this.f4891a;
            bVar.setCursorColor(i10);
            bVar.setHandlesColor(i10);
            bVar.setHintTextColor(i10);
        }
    }
}

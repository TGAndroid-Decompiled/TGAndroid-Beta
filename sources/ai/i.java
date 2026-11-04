package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import ci.wb;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.m9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wp;
public final class i extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final gi.d f685a;
    public final org.telegram.ui.Components.h6 f686b;
    public final org.telegram.ui.Components.h6 f687c;
    public final m9 d;
    public final Paint f688e;
    public final cg.p f689f;
    public final wp h;
    public final wp[] f690n;

    public i(Context context, m9 m9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f688e = paint;
        this.f689f = new cg.p(new a1.c(this, 2));
        this.h = new wp(2131231117, 0);
        this.f690n = new wp[1];
        this.d = m9Var;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        gi.d dVar = new gi.d(context, null, true);
        this.f685a = dVar;
        org.telegram.ui.Components.g6 g6Var = dVar.d;
        g6Var.D = false;
        g6Var.E = true;
        g6Var.F = true;
        g6Var.G = true;
        g6Var.H = false;
        ?? imageView = new ImageView(context);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f686b = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f687c = h6Var2;
        h6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = m9Var.d.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(h6Var, mf.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(h6Var2, mf.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, mf.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, mf.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j10, boolean z10) {
        String h02 = org.telegram.messenger.g0.h0((int) j10, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) bd.M0(2131750423, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.f685a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        m9 m9Var = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = m9Var.f24180f;
        if (tL_starGiftAuctionState != null) {
            this.f686b.c(bd.a0(null, null, 2131750422, bd.E(tL_starGiftAuctionState.current_round, ','), bd.E(m9Var.f24180f.total_rounds, ',')), z10, true);
        }
        String l10 = k2.p1.l(m9Var.f24179e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = m9Var.d();
        wp[] wpVarArr = this.f690n;
        org.telegram.ui.Components.h6 h6Var = this.f687c;
        if (d != 2 && d != 3) {
            h6Var.c(wb.a1(false, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750425, l10, Integer.valueOf(m9Var.f24182i))), 0.66f, wpVarArr), z10, true);
            org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.G6, null);
            return;
        }
        h6Var.c(wb.a1(false, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750424, l10)), 0.66f, wpVarArr), z10, true);
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.f28122q7, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f688e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f689f.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(146), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f688e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

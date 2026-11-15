package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import di.lb;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.r9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq;
public final class f extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final hi.d f3490a;
    public final org.telegram.ui.Components.h6 f3491b;
    public final org.telegram.ui.Components.h6 f3492c;
    public final r9 d;
    public final Paint f3493e;
    public final bg.q f3494f;
    public final eq h;
    public final eq[] f3495n;

    public f(Context context, r9 r9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f3493e = paint;
        this.f3494f = new bg.q(new a1.c(this, 11));
        this.h = new eq(2131231117, 0);
        this.f3495n = new eq[1];
        this.d = r9Var;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        hi.d dVar = new hi.d(context, null, true);
        this.f3490a = dVar;
        org.telegram.ui.Components.g6 g6Var = dVar.d;
        g6Var.E = false;
        g6Var.F = true;
        g6Var.G = true;
        g6Var.H = true;
        g6Var.I = false;
        ?? imageView = new ImageView(context);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f3491b = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f3492c = h6Var2;
        h6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = r9Var.d.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(h6Var, ja.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(h6Var2, ja.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, ja.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, ja.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z10) {
        String h02 = org.telegram.messenger.g0.h0((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) hd.M0(2131750415, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.f3490a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        r9 r9Var = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var.f26270f;
        if (tL_starGiftAuctionState != null) {
            this.f3491b.c(hd.a0(null, null, 2131750414, hd.E(tL_starGiftAuctionState.current_round, ','), hd.E(r9Var.f26270f.total_rounds, ',')), z10, true);
        }
        String l10 = i5.c.l(r9Var.f26269e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = r9Var.d();
        eq[] eqVarArr = this.f3495n;
        org.telegram.ui.Components.h6 h6Var = this.f3492c;
        if (d != 2 && d != 3) {
            h6Var.c(lb.a1(false, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750417, l10, Integer.valueOf(r9Var.f26272i))), 0.66f, eqVarArr), z10, true);
            org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, null);
            return;
        }
        h6Var.c(lb.a1(false, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750416, l10)), 0.66f, eqVarArr), z10, true);
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.f29090q7, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f3493e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3494f.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(146), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f3493e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import di.pb;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nq;
public final class f extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final hi.e f3603a;
    public final org.telegram.ui.Components.o6 f3604b;
    public final org.telegram.ui.Components.o6 f3605c;
    public final q9 d;
    public final Paint f3606e;
    public final bg.r f3607f;
    public final nq h;
    public final nq[] f3608n;

    public f(Context context, q9 q9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f3606e = paint;
        this.f3607f = new bg.r(new a1.c(this, 12));
        this.h = new nq(2131231117, 0);
        this.f3608n = new nq[1];
        this.d = q9Var;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
        hi.e eVar = new hi.e(context, null, true);
        this.f3603a = eVar;
        org.telegram.ui.Components.n6 n6Var = eVar.d;
        n6Var.E = false;
        n6Var.F = true;
        n6Var.G = true;
        n6Var.H = true;
        n6Var.I = false;
        ?? imageView = new ImageView(context);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f3604b = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f3605c = o6Var2;
        o6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = q9Var.d.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(o6Var, ma.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(o6Var2, ma.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, ma.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(eVar, ma.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z10) {
        String h02 = org.telegram.messenger.g0.h0((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) gd.N0(2131750398, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.f3603a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        q9 q9Var = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var.f26400f;
        if (tL_starGiftAuctionState != null) {
            this.f3604b.c(gd.a0(null, null, 2131750397, gd.E(tL_starGiftAuctionState.current_round, ','), gd.E(q9Var.f26400f.total_rounds, ',')), z10, true);
        }
        String l10 = i5.c.l(q9Var.f26399e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = q9Var.d();
        nq[] nqVarArr = this.f3608n;
        org.telegram.ui.Components.o6 o6Var = this.f3605c;
        if (d != 2 && d != 3) {
            o6Var.c(pb.b1(false, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750400, l10, Integer.valueOf(q9Var.f26402i))), 0.66f, nqVarArr), z10, true);
            org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, null);
            return;
        }
        o6Var.c(pb.b1(false, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750399, l10)), 0.66f, nqVarArr), z10, true);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.f29619q7, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f3606e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3607f.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(146), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f3606e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

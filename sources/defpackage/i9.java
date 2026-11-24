package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i9 extends FrameLayout implements tjb {
    public final u41 a;
    public final hn b;
    public final hn c;
    public final gt4 d;
    public final Paint e;
    public final hx2 f;
    public final cm2 h;
    public final cm2[] n;

    public i9(Context context, gt4 gt4Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new hx2(new l0(this, (byte) 3));
        this.h = new cm2(2131231119, 0);
        this.n = new cm2[1];
        this.d = gt4Var;
        setPadding(gl.L(14.0f), gl.L(9.0f), gl.L(14.0f), gl.L(9.0f));
        paint.setShadowLayer(gl.L(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(bkb.w0(null, bkb.c6, false));
        u41 u41Var = new u41(null, context, true);
        this.a = u41Var;
        gn gnVar = u41Var.d;
        gnVar.E = false;
        gnVar.F = true;
        gnVar.G = true;
        gnVar.H = true;
        gnVar.I = false;
        ?? imageView = new ImageView(context);
        hn hnVar = new hn(context, false, false, false);
        this.b = hnVar;
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.o());
        zkb.U(hnVar, bkb.F6, null);
        hn hnVar2 = new hn(context, false, false, false);
        this.c = hnVar2;
        hnVar2.setTextSize(gl.L(12.0f));
        TLRPC.Document document = gt4Var.d.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(hnVar, nme.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(hnVar2, nme.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, nme.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(u41Var, nme.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j, boolean z) {
        String h0 = gl.h0((int) j, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) k96.M0(2131750399, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h0);
        this.a.i(spannableStringBuilder, z, true);
    }

    public final void b(boolean z) {
        gt4 gt4Var = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var.f;
        if (tL_starGiftAuctionState != null) {
            this.b.c(k96.a0(null, null, 2131750398, k96.E(tL_starGiftAuctionState.current_round, ','), k96.E(gt4Var.f.total_rounds, ',')), z, true);
        }
        String concat = "⭐️".concat(k96.E(gt4Var.e.bid_amount, ','));
        int d = gt4Var.d();
        cm2[] cm2VarArr = this.n;
        hn hnVar = this.c;
        if (d != 2 && d != 3) {
            hnVar.c(jva.a1(false, gl.T2(k96.a0(null, null, 2131750401, concat, Integer.valueOf(gt4Var.i))), 0.66f, cm2VarArr), z, true);
            zkb.U(hnVar, bkb.F6, null);
            return;
        }
        hnVar.c(jva.a1(false, gl.T2(k96.a0(null, null, 2131750400, concat)), 0.66f, cm2VarArr), z, true);
        zkb.U(hnVar, bkb.p7, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(gl.L(14.0f), gl.L(9.0f), getMeasuredWidth() - gl.L(14.0f), getMeasuredHeight() - gl.L(9.0f), gl.L(8.0f), gl.L(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(146.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.e.setColor(bkb.w0(null, bkb.c6, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
public final class i9 extends FrameLayout implements vlb {
    public final b61 a;
    public final io b;
    public final io c;
    public final hv4 d;
    public final Paint e;
    public final ry2 f;
    public final pn2 h;
    public final pn2[] n;

    public i9(Context context, hv4 hv4Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new ry2(new l0(this, (byte) 3));
        this.h = new pn2(2131231120, 0);
        this.n = new pn2[1];
        this.d = hv4Var;
        setPadding(gm.L(14.0f), gm.L(9.0f), gm.L(14.0f), gm.L(9.0f));
        paint.setShadowLayer(gm.L(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(cmb.w0(null, cmb.c6, false));
        b61 b61Var = new b61(null, context, true);
        this.a = b61Var;
        ho hoVar = b61Var.d;
        hoVar.E = false;
        hoVar.F = true;
        hoVar.G = true;
        hoVar.H = true;
        hoVar.I = false;
        ?? imageView = new ImageView(context);
        io ioVar = new io(context, false, false, false);
        this.b = ioVar;
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setTypeface(gm.o());
        anb.U(ioVar, cmb.F6, null);
        io ioVar2 = new io(context, false, false, false);
        this.c = ioVar2;
        ioVar2.setTextSize(gm.L(12.0f));
        TLRPC.Document document = hv4Var.d.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(ioVar, qoe.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(ioVar2, qoe.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, qoe.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(b61Var, qoe.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j, boolean z) {
        String h0 = gm.h0((int) j, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) jb6.M0(2131750348, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h0);
        this.a.i(spannableStringBuilder, z, true);
    }

    public final void b(boolean z) {
        hv4 hv4Var = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var.f;
        if (tL_starGiftAuctionState != null) {
            this.b.c(jb6.a0(null, null, 2131750347, jb6.E(tL_starGiftAuctionState.current_round, ','), jb6.E(hv4Var.f.total_rounds, ',')), z, true);
        }
        String concat = "⭐️".concat(jb6.E(hv4Var.e.bid_amount, ','));
        int d = hv4Var.d();
        pn2[] pn2VarArr = this.n;
        io ioVar = this.c;
        if (d != 2 && d != 3) {
            ioVar.c(nxa.b1(false, gm.S2(jb6.a0(null, null, 2131750350, concat, Integer.valueOf(hv4Var.i))), 0.66f, pn2VarArr), z, true);
            anb.U(ioVar, cmb.F6, null);
            return;
        }
        ioVar.c(nxa.b1(false, gm.S2(jb6.a0(null, null, 2131750349, concat)), 0.66f, pn2VarArr), z, true);
        anb.U(ioVar, cmb.p7, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(gm.L(14.0f), gm.L(9.0f), getMeasuredWidth() - gm.L(14.0f), getMeasuredHeight() - gm.L(9.0f), gm.L(8.0f), gm.L(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(146.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.e.setColor(cmb.w0(null, cmb.c6, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

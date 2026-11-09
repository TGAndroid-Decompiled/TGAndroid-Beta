package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.yz;
public final class p1 extends FrameLayout {
    public final w8 f17477a;
    public final ImageReceiver f17478b;
    public final xh.l f17479c;
    public final wo d;
    public final ImageView f17480e;
    public final g6 f17481f;
    public boolean h;
    public final int[] f17482n;
    public boolean f17483r;

    public p1(Context context, g6 g6Var, boolean z9) {
        super(context);
        int i7;
        float f10;
        int i10;
        this.f17477a = new w8((g6) null);
        this.f17478b = new ImageReceiver(this);
        this.f17482n = new int[1];
        this.f17481f = g6Var;
        setWillNotDraw(false);
        if (z9) {
            i7 = 42;
        } else {
            i7 = 16;
        }
        xh.l lVar = new xh.l(context);
        this.f17479c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        s6.U(lVar, l6.f28275z6, g6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z10 = id.f23157a0;
        if (z10) {
            f10 = i7;
        } else {
            f10 = 64.0f;
        }
        addView(lVar, ha.d(-1, -2.0f, 7, f10, 7.0f, z10 ? 64.0f : i7, 0.0f));
        if (z9) {
            ImageView imageView = new ImageView(context);
            this.f17480e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231627);
            s6.s(imageView, l6.Ii, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (id.f23157a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            addView(imageView, ha.e(50, 50, i10 | 112));
        } else {
            this.f17480e = null;
        }
        wo woVar = new wo(21, getContext(), g6Var);
        this.d = woVar;
        woVar.b(-1, l6.f27865d6, l6.f27995k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, ha.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(s1 s1Var, String str, boolean z9) {
        boolean z10;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j3;
        String str2;
        hc hcVar;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (s1Var != null) {
            z10 = s1Var.f17537g;
        } else {
            z10 = false;
        }
        this.h = z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) s1Var.f17533b);
        spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i7 = l6.G6;
        g6 g6Var = this.f17481f;
        spannableStringBuilder.setSpan(new yz(i7, g6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            yz yzVar = new yz(l6.f28065o6, g6Var);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(yzVar, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        ij ijVar = s1Var.f17535e;
        xh.l lVar = this.f17479c;
        if (ijVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = s1Var.f17535e.f23318z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = s1Var.f17535e.v;
            }
            CharSequence m10 = i6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = s1Var.f17535e.f23262k;
            if (message != null) {
                ij.B5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (s1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(80.0f);
            int i10 = o1.d;
            SpannableString spannableString = new SpannableString("+");
            o1 o1Var = new o1(s1Var.a() - 1);
            this.f17482n[0] = (int) (((ny0) o1Var.f17468c).f36541c + org.telegram.messenger.g0.L(10.0f));
            spannableString.setSpan(o1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = p10.f24470s0;
        TLRPC.MessageMedia m12 = ij.m1(s1Var.f17535e);
        long j10 = 0;
        ImageReceiver imageReceiver = this.f17478b;
        if (m12 != null && (photo2 = m12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            hc f10 = hc.f(w10, m12.photo);
            ij ijVar2 = s1Var.f17535e;
            BitmapDrawable bitmapDrawable = ijVar2.G1;
            if (w10 != null) {
                j10 = w10.size;
            }
            imageReceiver.p0(f10, "36_36", bitmapDrawable, j10, null, ijVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && m12.document != null && (ij.L4(s1Var.f17535e.f23262k) || s1Var.f17535e.t4())) {
            TLRPC.PhotoSize w11 = w7.w(m12.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                hc b10 = hc.b(m12.document);
                j3 = m12.document.size;
                hcVar = b10;
                str2 = "g";
            } else {
                hc f11 = hc.f(w11, m12.document);
                j3 = w11.size;
                str2 = "36_36";
                hcVar = f11;
            }
            long j11 = j3;
            ij ijVar3 = s1Var.f17535e;
            imageReceiver.p0(hcVar, str2, ijVar3.G1, j11, null, ijVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && (webPage = m12.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            hc f12 = hc.f(w12, m12.webpage.photo);
            BitmapDrawable bitmapDrawable2 = s1Var.f17535e.G1;
            if (w12 != null) {
                j10 = w12.size;
            }
            imageReceiver.p0(f12, "36_36", bitmapDrawable2, j10, null, m12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else {
            TLRPC.User f13 = p10.i(i11).f();
            w8 w8Var = this.f17477a;
            w8Var.r(f13);
            imageReceiver.i0(p10.i(i11).f(), w8Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        }
        this.f17483r = z9;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (id.f23157a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f17478b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f17483r) {
            Paint W0 = l6.W0("paintDivider", this.f17481f);
            if (W0 == null) {
                W0 = l6.f27988k0;
            }
            Paint paint = W0;
            float f12 = 64.0f;
            if (id.f23157a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!id.f23157a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f17483r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z9) {
        float f10;
        ViewPropertyAnimator animate = this.f17480e.animate();
        if (z9 && !this.h) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
    }
}

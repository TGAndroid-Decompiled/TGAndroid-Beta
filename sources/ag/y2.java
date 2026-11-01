package ag;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.messenger.k6;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.y41;
import w7.b6;
public final class y2 extends FrameLayout {
    public final r8 f807a;
    public final ImageReceiver f808b;
    public final nh.p f809c;
    public final ep d;
    public final ImageView e;
    public final p6 f810f;
    public boolean h;
    public final int[] f811n;
    public boolean f812r;

    public y2(Context context, p6 p6Var, boolean z10) {
        super(context);
        int i10;
        float f7;
        int i11;
        this.f807a = new r8((p6) null);
        this.f808b = new ImageReceiver(this);
        this.f811n = new int[1];
        this.f810f = p6Var;
        setWillNotDraw(false);
        if (z10) {
            i10 = 42;
        } else {
            i10 = 16;
        }
        nh.p pVar = new nh.p(context);
        this.f809c = pVar;
        pVar.setLines(2);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        a7.V(pVar, t6.f21331z6, p6Var);
        pVar.setTextSize(1, 14.0f);
        boolean z11 = dd.X;
        if (z11) {
            f7 = i10;
        } else {
            f7 = 64.0f;
        }
        addView(pVar, b6.d(-1, -2.0f, 7, f7, 7.0f, z11 ? 64.0f : i10, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231628);
            a7.t(imageView, t6.Ii, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (dd.X) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(imageView, b6.e(50, 50, i11 | 112));
        } else {
            this.e = null;
        }
        ep epVar = new ep(21, getContext(), p6Var);
        this.d = epVar;
        epVar.b(-1, t6.f20930d6, t6.f21060k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar, b6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(h3 h3Var, String str, boolean z10) {
        boolean z11;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        jc jcVar;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (h3Var != null) {
            z11 = h3Var.f555g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) h3Var.f552b);
        spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        int i10 = t6.G6;
        p6 p6Var = this.f810f;
        spannableStringBuilder.setSpan(new l00(i10, p6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            l00 l00Var = new l00(t6.f21135o6, p6Var);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(l00Var, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        kj kjVar = h3Var.e;
        nh.p pVar = this.f809c;
        if (kjVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = h3Var.e.f16747z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = h3Var.e.v;
            }
            CharSequence m10 = k6.m(new SpannableStringBuilder(charSequence), pVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = h3Var.e.f16690k;
            if (message != null) {
                kj.A5(m10, message.entities, pVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (h3Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(80.0f);
            int i11 = x2.d;
            SpannableString spannableString = new SpannableString("+");
            x2 x2Var = new x2(h3Var.a() - 1);
            this.f811n[0] = (int) (((rz0) x2Var.f799c).f30126c + org.telegram.messenger.i0.L(10.0f));
            spannableString.setSpan(x2Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, pVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        pVar.setText(spannableStringBuilder);
        int i12 = e20.f15506s0;
        TLRPC.MessageMedia n12 = kj.n1(h3Var.e);
        long j11 = 0;
        ImageReceiver imageReceiver = this.f808b;
        if (n12 != null && (photo2 = n12.photo) != null) {
            TLRPC.PhotoSize w9 = b8.w(photo2.sizes, org.telegram.messenger.i0.L(36.0f), true, null, true);
            jc f7 = jc.f(w9, n12.photo);
            kj kjVar2 = h3Var.e;
            BitmapDrawable bitmapDrawable = kjVar2.G1;
            if (w9 != null) {
                j11 = w9.size;
            }
            imageReceiver.p0(f7, "36_36", bitmapDrawable, j11, null, kjVar2, 0);
            imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        } else if (n12 != null && n12.document != null && (kj.L4(h3Var.e.f16690k) || h3Var.e.t4())) {
            TLRPC.PhotoSize w10 = b8.w(n12.document.thumbs, org.telegram.messenger.i0.L(36.0f), true, null, true);
            if (w10 == null) {
                jc b10 = jc.b(n12.document);
                j10 = n12.document.size;
                jcVar = b10;
                str2 = "g";
            } else {
                jc f10 = jc.f(w10, n12.document);
                j10 = w10.size;
                str2 = "36_36";
                jcVar = f10;
            }
            long j12 = j10;
            kj kjVar3 = h3Var.e;
            imageReceiver.p0(jcVar, str2, kjVar3.G1, j12, null, kjVar3, 0);
            imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        } else if (n12 != null && (webPage = n12.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w11 = b8.w(photo.sizes, org.telegram.messenger.i0.L(36.0f), true, null, true);
            jc f11 = jc.f(w11, n12.webpage.photo);
            BitmapDrawable bitmapDrawable2 = h3Var.e.G1;
            if (w11 != null) {
                j11 = w11.size;
            }
            imageReceiver.p0(f11, "36_36", bitmapDrawable2, j11, null, n12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        } else {
            TLRPC.User f12 = e20.i(i12).f();
            r8 r8Var = this.f807a;
            r8Var.r(f12);
            imageReceiver.i0(e20.i(i12).f(), r8Var, null);
            imageReceiver.J0(org.telegram.messenger.i0.L(36.0f));
        }
        this.f812r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f7;
        if (dd.X) {
            L = getMeasuredWidth() - org.telegram.messenger.i0.L(51.0f);
        } else {
            L = org.telegram.messenger.i0.L(15.0f);
        }
        float f10 = L;
        ImageReceiver imageReceiver = this.f808b;
        imageReceiver.y0(f10, org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f812r) {
            Paint W0 = t6.W0("paintDivider", this.f810f);
            if (W0 == null) {
                W0 = t6.f21053k0;
            }
            Paint paint = W0;
            float f11 = 64.0f;
            if (dd.X) {
                f7 = 0.0f;
            } else {
                f7 = 64.0f;
            }
            float L2 = org.telegram.messenger.i0.L(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!dd.X) {
                f11 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.i0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f) + (this.f812r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.e.animate();
        if (z10 && !this.h) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).start();
    }
}

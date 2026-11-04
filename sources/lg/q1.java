package lg;

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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.i6;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;
public final class q1 extends FrameLayout {
    public final u8 f18414a;
    public final ImageReceiver f18415b;
    public final yh.l f18416c;
    public final wo d;
    public final ImageView f18417e;
    public final e6 f18418f;
    public boolean h;
    public final int[] f18419n;
    public boolean f18420r;

    public q1(Context context, e6 e6Var, boolean z10) {
        super(context);
        int i3;
        float f10;
        int i10;
        this.f18414a = new u8((e6) null);
        this.f18415b = new ImageReceiver(this);
        this.f18419n = new int[1];
        this.f18418f = e6Var;
        setWillNotDraw(false);
        if (z10) {
            i3 = 42;
        } else {
            i3 = 16;
        }
        yh.l lVar = new yh.l(context);
        this.f18416c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(lVar, k6.f28290z6, e6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z11 = bd.f21784a0;
        if (z11) {
            f10 = i3;
        } else {
            f10 = 64.0f;
        }
        addView(lVar, mf.d(-1, -2.0f, 7, f10, 7.0f, z11 ? 64.0f : i3, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f18417e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231627);
            r6.t(imageView, k6.Ii, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (bd.f21784a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            addView(imageView, mf.e(50, 50, i10 | 112));
        } else {
            this.f18417e = null;
        }
        wo woVar = new wo(21, getContext(), e6Var);
        this.d = woVar;
        woVar.b(-1, k6.f27878d6, k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, mf.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(t1 t1Var, String str, boolean z10) {
        boolean z11;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ac acVar;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (t1Var != null) {
            z11 = t1Var.f18478g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) t1Var.f18474b);
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i3 = k6.G6;
        e6 e6Var = this.f18418f;
        spannableStringBuilder.setSpan(new tz(i3, e6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            tz tzVar = new tz(k6.f28081o6, e6Var);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(tzVar, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        zi ziVar = t1Var.f18476e;
        yh.l lVar = this.f18416c;
        if (ziVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = t1Var.f18476e.f26924z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = t1Var.f18476e.v;
            }
            CharSequence m10 = i6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = t1Var.f18476e.f26868k;
            if (message != null) {
                zi.C5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (t1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(80.0f);
            int i10 = p1.d;
            SpannableString spannableString = new SpannableString("+");
            p1 p1Var = new p1(t1Var.a() - 1);
            this.f18419n[0] = (int) (((ly0) p1Var.f18405c).f35918c + org.telegram.messenger.g0.L(10.0f));
            spannableString.setSpan(p1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = h10.f22829t0;
        TLRPC.MessageMedia n12 = zi.n1(t1Var.f18476e);
        long j11 = 0;
        ImageReceiver imageReceiver = this.f18415b;
        if (n12 != null && (photo2 = n12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            ac f10 = ac.f(w10, n12.photo);
            zi ziVar2 = t1Var.f18476e;
            BitmapDrawable bitmapDrawable = ziVar2.G1;
            if (w10 != null) {
                j11 = w10.size;
            }
            imageReceiver.p0(f10, "36_36", bitmapDrawable, j11, null, ziVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (n12 != null && n12.document != null && (zi.M4(t1Var.f18476e.f26868k) || t1Var.f18476e.u4())) {
            TLRPC.PhotoSize w11 = w7.w(n12.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                ac b10 = ac.b(n12.document);
                j10 = n12.document.size;
                acVar = b10;
                str2 = "g";
            } else {
                ac f11 = ac.f(w11, n12.document);
                j10 = w11.size;
                str2 = "36_36";
                acVar = f11;
            }
            long j12 = j10;
            zi ziVar3 = t1Var.f18476e;
            imageReceiver.p0(acVar, str2, ziVar3.G1, j12, null, ziVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (n12 != null && (webPage = n12.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            ac f12 = ac.f(w12, n12.webpage.photo);
            BitmapDrawable bitmapDrawable2 = t1Var.f18476e.G1;
            if (w12 != null) {
                j11 = w12.size;
            }
            imageReceiver.p0(f12, "36_36", bitmapDrawable2, j11, null, n12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else {
            TLRPC.User f13 = h10.i(i11).f();
            u8 u8Var = this.f18414a;
            u8Var.r(f13);
            imageReceiver.i0(h10.i(i11).f(), u8Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        }
        this.f18420r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (bd.f21784a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f18415b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f18420r) {
            Paint W0 = k6.W0("paintDivider", this.f18418f);
            if (W0 == null) {
                W0 = k6.f28002k0;
            }
            Paint paint = W0;
            float f12 = 64.0f;
            if (bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!bd.f21784a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f18420r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f10;
        ViewPropertyAnimator animate = this.f18417e.animate();
        if (z10 && !this.h) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
    }
}

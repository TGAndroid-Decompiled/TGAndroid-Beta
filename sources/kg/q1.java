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
import c8.ja;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.y31;
public final class q1 extends FrameLayout {
    public final t8 f18070a;
    public final ImageReceiver f18071b;
    public final xh.l f18072c;
    public final fp d;
    public final ImageView f18073e;
    public final e6 f18074f;
    public boolean h;
    public final int[] f18075n;
    public boolean f18076r;

    public q1(Context context, e6 e6Var, boolean z10) {
        super(context);
        int i7;
        float f10;
        int i10;
        this.f18070a = new t8((e6) null);
        this.f18071b = new ImageReceiver(this);
        this.f18075n = new int[1];
        this.f18074f = e6Var;
        setWillNotDraw(false);
        if (z10) {
            i7 = 42;
        } else {
            i7 = 16;
        }
        xh.l lVar = new xh.l(context);
        this.f18072c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        q6.U(lVar, j6.f29260z6, e6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z11 = hd.f24101a0;
        if (z11) {
            f10 = i7;
        } else {
            f10 = 64.0f;
        }
        addView(lVar, ja.d(-1, -2.0f, 7, f10, 7.0f, z11 ? 64.0f : i7, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f18073e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231627);
            q6.s(imageView, j6.Li, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (hd.f24101a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            addView(imageView, ja.e(50, 50, i10 | 112));
        } else {
            this.f18073e = null;
        }
        fp fpVar = new fp(21, getContext(), e6Var);
        this.d = fpVar;
        fpVar.b(-1, j6.f28849d6, j6.f28979k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        addView(fpVar, ja.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(u1 u1Var, String str, boolean z10) {
        boolean z11;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j3;
        String str2;
        gc gcVar;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (u1Var != null) {
            z11 = u1Var.f18118g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) u1Var.f18114b);
        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i7 = j6.G6;
        e6 e6Var = this.f18074f;
        spannableStringBuilder.setSpan(new b00(i7, e6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            b00 b00Var = new b00(j6.f29049o6, e6Var);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(b00Var, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        gj gjVar = u1Var.f18116e;
        xh.l lVar = this.f18072c;
        if (gjVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = u1Var.f18116e.f23875z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = u1Var.f18116e.v;
            }
            CharSequence m10 = org.telegram.messenger.j6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = u1Var.f18116e.f23817k;
            if (message != null) {
                gj.B5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (u1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(80.0f);
            int i10 = p1.d;
            SpannableString spannableString = new SpannableString("+");
            p1 p1Var = new p1(u1Var.a() - 1);
            this.f18075n[0] = (int) (((oy0) p1Var.f18038c).f38105c + org.telegram.messenger.g0.L(10.0f));
            spannableString.setSpan(p1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = m10.f24934t0;
        TLRPC.MessageMedia m12 = gj.m1(u1Var.f18116e);
        long j10 = 0;
        ImageReceiver imageReceiver = this.f18071b;
        if (m12 != null && (photo2 = m12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            gc f10 = gc.f(w10, m12.photo);
            gj gjVar2 = u1Var.f18116e;
            BitmapDrawable bitmapDrawable = gjVar2.I1;
            if (w10 != null) {
                j10 = w10.size;
            }
            imageReceiver.p0(f10, "36_36", bitmapDrawable, j10, null, gjVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && m12.document != null && (gj.L4(u1Var.f18116e.f23817k) || u1Var.f18116e.t4())) {
            TLRPC.PhotoSize w11 = w7.w(m12.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                gc b10 = gc.b(m12.document);
                j3 = m12.document.size;
                gcVar = b10;
                str2 = "g";
            } else {
                gc f11 = gc.f(w11, m12.document);
                j3 = w11.size;
                str2 = "36_36";
                gcVar = f11;
            }
            long j11 = j3;
            gj gjVar3 = u1Var.f18116e;
            imageReceiver.p0(gcVar, str2, gjVar3.I1, j11, null, gjVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && (webPage = m12.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            gc f12 = gc.f(w12, m12.webpage.photo);
            BitmapDrawable bitmapDrawable2 = u1Var.f18116e.I1;
            if (w12 != null) {
                j10 = w12.size;
            }
            imageReceiver.p0(f12, "36_36", bitmapDrawable2, j10, null, m12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else {
            TLRPC.User f13 = m10.i(i11).f();
            t8 t8Var = this.f18070a;
            t8Var.r(f13);
            imageReceiver.i0(m10.i(i11).f(), t8Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        }
        this.f18076r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (hd.f24101a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f18071b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f18076r) {
            Paint W0 = j6.W0("paintDivider", this.f18074f);
            if (W0 == null) {
                W0 = j6.f28972k0;
            }
            Paint paint = W0;
            float f12 = 64.0f;
            if (hd.f24101a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!hd.f24101a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f18076r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f10;
        ViewPropertyAnimator animate = this.f18073e.animate();
        if (z10 && !this.h) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
    }
}

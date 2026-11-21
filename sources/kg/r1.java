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
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.xy0;
public final class r1 extends FrameLayout {
    public final b9 f18472a;
    public final ImageReceiver f18473b;
    public final xh.l f18474c;
    public final op d;
    public final ImageView f18475e;
    public final h6 f18476f;
    public boolean h;
    public final int[] f18477n;
    public boolean f18478r;

    public r1(Context context, h6 h6Var, boolean z10) {
        super(context);
        int i7;
        float f10;
        int i10;
        this.f18472a = new b9((h6) null);
        this.f18473b = new ImageReceiver(this);
        this.f18477n = new int[1];
        this.f18476f = h6Var;
        setWillNotDraw(false);
        if (z10) {
            i7 = 42;
        } else {
            i7 = 16;
        }
        xh.l lVar = new xh.l(context);
        this.f18474c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        t6.U(lVar, m6.f29789z6, h6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z11 = gd.f24241a0;
        if (z11) {
            f10 = i7;
        } else {
            f10 = 64.0f;
        }
        addView(lVar, ma.d(-1, -2.0f, 7, f10, 7.0f, z11 ? 64.0f : i7, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f18475e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231628);
            t6.s(imageView, m6.Li, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (gd.f24241a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            addView(imageView, ma.e(50, 50, i10 | 112));
        } else {
            this.f18475e = null;
        }
        op opVar = new op(21, getContext(), h6Var);
        this.d = opVar;
        opVar.b(-1, m6.f29378d6, m6.f29508k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        addView(opVar, ma.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(u1 u1Var, String str, boolean z10) {
        boolean z11;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j3;
        String str2;
        fc fcVar;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (u1Var != null) {
            z11 = u1Var.f18535g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) u1Var.f18531b);
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i7 = m6.G6;
        h6 h6Var = this.f18476f;
        spannableStringBuilder.setSpan(new k00(i7, h6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            k00 k00Var = new k00(m6.f29578o6, h6Var);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(k00Var, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        fj fjVar = u1Var.f18533e;
        xh.l lVar = this.f18474c;
        if (fjVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = u1Var.f18533e.f24051z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = u1Var.f18533e.v;
            }
            CharSequence m10 = j6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = u1Var.f18533e.f23993k;
            if (message != null) {
                fj.B5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (u1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.f24146q.x - org.telegram.messenger.g0.L(80.0f);
            int i10 = q1.d;
            SpannableString spannableString = new SpannableString("+");
            q1 q1Var = new q1(u1Var.a() - 1);
            this.f18477n[0] = (int) (((xy0) q1Var.f18466c).f42254c + org.telegram.messenger.g0.L(10.0f));
            spannableString.setSpan(q1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = j10.f24798t0;
        TLRPC.MessageMedia m12 = fj.m1(u1Var.f18533e);
        long j10 = 0;
        ImageReceiver imageReceiver = this.f18473b;
        if (m12 != null && (photo2 = m12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            fc f10 = fc.f(w10, m12.photo);
            fj fjVar2 = u1Var.f18533e;
            BitmapDrawable bitmapDrawable = fjVar2.I1;
            if (w10 != null) {
                j10 = w10.size;
            }
            imageReceiver.p0(f10, "36_36", bitmapDrawable, j10, null, fjVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && m12.document != null && (fj.L4(u1Var.f18533e.f23993k) || u1Var.f18533e.t4())) {
            TLRPC.PhotoSize w11 = w7.w(m12.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                fc b10 = fc.b(m12.document);
                j3 = m12.document.size;
                fcVar = b10;
                str2 = "g";
            } else {
                fc f11 = fc.f(w11, m12.document);
                j3 = w11.size;
                str2 = "36_36";
                fcVar = f11;
            }
            long j11 = j3;
            fj fjVar3 = u1Var.f18533e;
            imageReceiver.p0(fcVar, str2, fjVar3.I1, j11, null, fjVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && (webPage = m12.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            fc f12 = fc.f(w12, m12.webpage.photo);
            BitmapDrawable bitmapDrawable2 = u1Var.f18533e.I1;
            if (w12 != null) {
                j10 = w12.size;
            }
            imageReceiver.p0(f12, "36_36", bitmapDrawable2, j10, null, m12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else {
            TLRPC.User f13 = j10.i(i11).f();
            b9 b9Var = this.f18472a;
            b9Var.r(f13);
            imageReceiver.i0(j10.i(i11).f(), b9Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        }
        this.f18478r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (gd.f24241a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f18473b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f18478r) {
            Paint W0 = m6.W0("paintDivider", this.f18476f);
            if (W0 == null) {
                W0 = m6.f29501k0;
            }
            Paint paint = W0;
            float f12 = 64.0f;
            if (gd.f24241a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!gd.f24241a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f18478r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f10;
        ViewPropertyAnimator animate = this.f18475e.animate();
        if (z10 && !this.h) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
    }
}

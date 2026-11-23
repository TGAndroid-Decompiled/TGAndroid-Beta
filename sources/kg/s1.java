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
import c8.na;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
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
public final class s1 extends FrameLayout {
    public final b9 f18446a;
    public final ImageReceiver f18447b;
    public final xh.l f18448c;
    public final op d;
    public final ImageView f18449e;
    public final h6 f18450f;
    public boolean h;
    public final int[] f18451n;
    public boolean f18452r;

    public s1(Context context, h6 h6Var, boolean z10) {
        super(context);
        int i7;
        float f10;
        int i10;
        this.f18446a = new b9((h6) null);
        this.f18447b = new ImageReceiver(this);
        this.f18451n = new int[1];
        this.f18450f = h6Var;
        setWillNotDraw(false);
        if (z10) {
            i7 = 42;
        } else {
            i7 = 16;
        }
        xh.l lVar = new xh.l(context);
        this.f18448c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        t6.U(lVar, m6.f29758z6, h6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z11 = hd.f24408a0;
        if (z11) {
            f10 = i7;
        } else {
            f10 = 64.0f;
        }
        addView(lVar, na.d(-1, -2.0f, 7, f10, 7.0f, z11 ? 64.0f : i7, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f18449e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231628);
            t6.s(imageView, m6.Li, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (hd.f24408a0) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            addView(imageView, na.e(50, 50, i10 | 112));
        } else {
            this.f18449e = null;
        }
        op opVar = new op(21, getContext(), h6Var);
        this.d = opVar;
        opVar.b(-1, m6.f29347d6, m6.f29477k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        addView(opVar, na.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(v1 v1Var, String str, boolean z10) {
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
        if (v1Var != null) {
            z11 = v1Var.f18510g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) v1Var.f18506b);
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i7 = m6.G6;
        h6 h6Var = this.f18450f;
        spannableStringBuilder.setSpan(new k00(i7, h6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            k00 k00Var = new k00(m6.f29547o6, h6Var);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(k00Var, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        gj gjVar = v1Var.f18508e;
        xh.l lVar = this.f18448c;
        if (gjVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = v1Var.f18508e.f24235z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = v1Var.f18508e.v;
            }
            CharSequence m10 = j6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = v1Var.f18508e.f24177k;
            if (message != null) {
                gj.B5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (v1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(80.0f);
            int i10 = r1.d;
            SpannableString spannableString = new SpannableString("+");
            r1 r1Var = new r1(v1Var.a() - 1);
            this.f18451n[0] = (int) (((xy0) r1Var.f18443c).f42224c + org.telegram.messenger.g0.L(10.0f));
            spannableString.setSpan(r1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = k10.f24932t0;
        TLRPC.MessageMedia m12 = gj.m1(v1Var.f18508e);
        long j10 = 0;
        ImageReceiver imageReceiver = this.f18447b;
        if (m12 != null && (photo2 = m12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            gc f10 = gc.f(w10, m12.photo);
            gj gjVar2 = v1Var.f18508e;
            BitmapDrawable bitmapDrawable = gjVar2.I1;
            if (w10 != null) {
                j10 = w10.size;
            }
            imageReceiver.p0(f10, "36_36", bitmapDrawable, j10, null, gjVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && m12.document != null && (gj.L4(v1Var.f18508e.f24177k) || v1Var.f18508e.t4())) {
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
            gj gjVar3 = v1Var.f18508e;
            imageReceiver.p0(gcVar, str2, gjVar3.I1, j11, null, gjVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && (webPage = m12.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            gc f12 = gc.f(w12, m12.webpage.photo);
            BitmapDrawable bitmapDrawable2 = v1Var.f18508e.I1;
            if (w12 != null) {
                j10 = w12.size;
            }
            imageReceiver.p0(f12, "36_36", bitmapDrawable2, j10, null, m12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else {
            TLRPC.User f13 = k10.i(i11).f();
            b9 b9Var = this.f18446a;
            b9Var.r(f13);
            imageReceiver.i0(k10.i(i11).f(), b9Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        }
        this.f18452r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f10;
        if (hd.f24408a0) {
            L = getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f);
        } else {
            L = org.telegram.messenger.g0.L(15.0f);
        }
        float f11 = L;
        ImageReceiver imageReceiver = this.f18447b;
        imageReceiver.y0(f11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.f18452r) {
            Paint W0 = m6.W0("paintDivider", this.f18450f);
            if (W0 == null) {
                W0 = m6.f29470k0;
            }
            Paint paint = W0;
            float f12 = 64.0f;
            if (hd.f24408a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!hd.f24408a0) {
                f12 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - org.telegram.messenger.g0.L(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f18452r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f10;
        ViewPropertyAnimator animate = this.f18449e.animate();
        if (z10 && !this.h) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
    }
}

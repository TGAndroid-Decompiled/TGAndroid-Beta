package defpackage;

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
import org.telegram.tgnet.TLRPC;
public final class kz8 extends FrameLayout {
    public final pc0 a;
    public final ImageReceiver b;
    public final xna c;
    public final jh2 d;
    public final ImageView e;
    public final ylb f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public kz8(ylb ylbVar, Context context, boolean z) {
        super(context);
        int i;
        float f;
        int i2;
        this.a = new pc0((ylb) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = ylbVar;
        setWillNotDraw(false);
        if (z) {
            i = 42;
        } else {
            i = 16;
        }
        xna xnaVar = new xna(context);
        this.c = xnaVar;
        xnaVar.setLines(2);
        xnaVar.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(xnaVar, cmb.y6, ylbVar);
        xnaVar.setTextSize(1, 14.0f);
        boolean z2 = jb6.a0;
        if (z2) {
            f = i;
        } else {
            f = 64.0f;
        }
        addView(xnaVar, qoe.d(-1, -2.0f, 7, f, 7.0f, z2 ? 64.0f : i, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231632);
            anb.s(imageView, cmb.Ki, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (jb6.a0) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            addView(imageView, qoe.e(50, 50, i2 | 112));
        } else {
            this.e = null;
        }
        jh2 jh2Var = new jh2(21, ylbVar, getContext());
        this.d = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        addView(jh2Var, qoe.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(oz8 oz8Var, String str, boolean z) {
        boolean z2;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j;
        String str2;
        gn5 gn5Var;
        int[] iArr;
        int length;
        String str3 = str;
        if (oz8Var != null) {
            z2 = oz8Var.g;
        } else {
            z2 = false;
        }
        this.h = z2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) oz8Var.b);
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        int i = cmb.F6;
        ylb ylbVar = this.f;
        spannableStringBuilder.setSpan(new do4(i, ylbVar), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            do4 do4Var = new do4(cmb.n6, ylbVar);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(do4Var, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        k47 k47Var = oz8Var.e;
        xna xnaVar = this.c;
        if (k47Var != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = oz8Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = oz8Var.e.v;
            }
            CharSequence m = gw3.m(new SpannableStringBuilder(charSequence), xnaVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = oz8Var.e.k;
            if (message != null) {
                k47.A5(m, message.entities, xnaVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m);
        }
        if (oz8Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = gm.q.x - gm.L(80.0f);
            int i2 = s0.d;
            SpannableString spannableString = new SpannableString("+");
            s0 s0Var = new s0(oz8Var.a() - 1);
            this.n[0] = (int) (((uib) s0Var.c).c + gm.L(10.0f));
            spannableString.setSpan(s0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, xnaVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        xnaVar.setText(spannableStringBuilder);
        int i3 = z8c.t0;
        TLRPC.MessageMedia m1 = k47.m1(oz8Var.e);
        long j2 = 0;
        ImageReceiver imageReceiver = this.b;
        if (m1 != null) {
            TLRPC.Photo photo2 = m1.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w = bc4.w(photo2.sizes, gm.L(36.0f), true, null, true);
                gn5 f = gn5.f(w, m1.photo);
                k47 k47Var2 = oz8Var.e;
                BitmapDrawable bitmapDrawable = k47Var2.I1;
                if (w != null) {
                    j2 = w.size;
                }
                imageReceiver.c0(f, "36_36", bitmapDrawable, j2, null, k47Var2, 0);
                imageReceiver.q0(gm.L(4.0f));
            } else if (m1.document != null && (k47.K4(oz8Var.e.k) || oz8Var.e.s4())) {
                TLRPC.PhotoSize w2 = bc4.w(m1.document.thumbs, gm.L(36.0f), true, null, true);
                TLRPC.Document document = m1.document;
                if (w2 == null) {
                    gn5 b = gn5.b(document);
                    j = m1.document.size;
                    gn5Var = b;
                    str2 = "g";
                } else {
                    gn5 f2 = gn5.f(w2, document);
                    j = w2.size;
                    str2 = "36_36";
                    gn5Var = f2;
                }
                long j3 = j;
                k47 k47Var3 = oz8Var.e;
                imageReceiver.c0(gn5Var, str2, k47Var3.I1, j3, null, k47Var3, 0);
                imageReceiver.q0(gm.L(4.0f));
            }
            this.r = z;
            invalidate();
        }
        if (m1 != null && (webPage = m1.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w3 = bc4.w(photo.sizes, gm.L(36.0f), true, null, true);
            gn5 f3 = gn5.f(w3, m1.webpage.photo);
            BitmapDrawable bitmapDrawable2 = oz8Var.e.I1;
            if (w3 != null) {
                j2 = w3.size;
            }
            imageReceiver.c0(f3, "36_36", bitmapDrawable2, j2, null, m1.webpage, 0);
            imageReceiver.q0(gm.L(4.0f));
        } else {
            TLRPC.User f4 = z8c.h(i3).f();
            pc0 pc0Var = this.a;
            pc0Var.q(f4);
            imageReceiver.U(z8c.h(i3).f(), pc0Var, null);
            imageReceiver.q0(gm.L(36.0f));
        }
        this.r = z;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f;
        if (jb6.a0) {
            L = getMeasuredWidth() - gm.L(51.0f);
        } else {
            L = gm.L(15.0f);
        }
        float f2 = L;
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, gm.L(7.0f), gm.L(36.0f), gm.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint U0 = cmb.U0("paintDivider", this.f);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            Paint paint = U0;
            float f3 = 64.0f;
            if (jb6.a0) {
                f = 0.0f;
            } else {
                f = 64.0f;
            }
            float L2 = gm.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!jb6.a0) {
                f3 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - gm.L(f3), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z) {
        float f;
        ViewPropertyAnimator animate = this.e.animate();
        if (z && !this.h) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).start();
    }
}

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
public final class jx8 extends FrameLayout {
    public final pb0 a;
    public final ImageReceiver b;
    public final wla c;
    public final wf2 d;
    public final ImageView e;
    public final wjb f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public jx8(wjb wjbVar, Context context, boolean z) {
        super(context);
        int i;
        float f;
        int i2;
        this.a = new pb0((wjb) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = wjbVar;
        setWillNotDraw(false);
        if (z) {
            i = 42;
        } else {
            i = 16;
        }
        wla wlaVar = new wla(context);
        this.c = wlaVar;
        wlaVar.setLines(2);
        wlaVar.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(wlaVar, bkb.y6, wjbVar);
        wlaVar.setTextSize(1, 14.0f);
        boolean z2 = k96.a0;
        if (z2) {
            f = i;
        } else {
            f = 64.0f;
        }
        addView(wlaVar, nme.d(-1, -2.0f, 7, f, 7.0f, z2 ? 64.0f : i, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231631);
            zkb.s(imageView, bkb.Ki, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            if (k96.a0) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            addView(imageView, nme.e(50, 50, i2 | 112));
        } else {
            this.e = null;
        }
        wf2 wf2Var = new wf2(21, wjbVar, getContext());
        this.d = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        addView(wf2Var, nme.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(nx8 nx8Var, String str, boolean z) {
        boolean z2;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j;
        String str2;
        gl5 gl5Var;
        int[] iArr;
        int length;
        String str3 = str;
        if (nx8Var != null) {
            z2 = nx8Var.g;
        } else {
            z2 = false;
        }
        this.h = z2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) nx8Var.b);
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        int i = bkb.F6;
        wjb wjbVar = this.f;
        spannableStringBuilder.setSpan(new cm4(i, wjbVar), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            cm4 cm4Var = new cm4(bkb.n6, wjbVar);
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(cm4Var, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        k27 k27Var = nx8Var.e;
        wla wlaVar = this.c;
        if (k27Var != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = nx8Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = nx8Var.e.v;
            }
            CharSequence m = vu3.m(new SpannableStringBuilder(charSequence), wlaVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = nx8Var.e.k;
            if (message != null) {
                k27.A5(m, message.entities, wlaVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m);
        }
        if (nx8Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = gl.q.x - gl.L(80.0f);
            int i2 = s0.d;
            SpannableString spannableString = new SpannableString("+");
            s0 s0Var = new s0(nx8Var.a() - 1);
            this.n[0] = (int) (((tgb) s0Var.c).c + gl.L(10.0f));
            spannableString.setSpan(s0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, wlaVar.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        wlaVar.setText(spannableStringBuilder);
        int i3 = y6c.t0;
        TLRPC.MessageMedia m1 = k27.m1(nx8Var.e);
        long j2 = 0;
        ImageReceiver imageReceiver = this.b;
        if (m1 != null) {
            TLRPC.Photo photo2 = m1.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w = ba4.w(photo2.sizes, gl.L(36.0f), true, null, true);
                gl5 f = gl5.f(w, m1.photo);
                k27 k27Var2 = nx8Var.e;
                BitmapDrawable bitmapDrawable = k27Var2.I1;
                if (w != null) {
                    j2 = w.size;
                }
                imageReceiver.c0(f, "36_36", bitmapDrawable, j2, null, k27Var2, 0);
                imageReceiver.q0(gl.L(4.0f));
            } else if (m1.document != null && (k27.K4(nx8Var.e.k) || nx8Var.e.s4())) {
                TLRPC.PhotoSize w2 = ba4.w(m1.document.thumbs, gl.L(36.0f), true, null, true);
                TLRPC.Document document = m1.document;
                if (w2 == null) {
                    gl5 b = gl5.b(document);
                    j = m1.document.size;
                    gl5Var = b;
                    str2 = "g";
                } else {
                    gl5 f2 = gl5.f(w2, document);
                    j = w2.size;
                    str2 = "36_36";
                    gl5Var = f2;
                }
                long j3 = j;
                k27 k27Var3 = nx8Var.e;
                imageReceiver.c0(gl5Var, str2, k27Var3.I1, j3, null, k27Var3, 0);
                imageReceiver.q0(gl.L(4.0f));
            }
            this.r = z;
            invalidate();
        }
        if (m1 != null && (webPage = m1.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w3 = ba4.w(photo.sizes, gl.L(36.0f), true, null, true);
            gl5 f3 = gl5.f(w3, m1.webpage.photo);
            BitmapDrawable bitmapDrawable2 = nx8Var.e.I1;
            if (w3 != null) {
                j2 = w3.size;
            }
            imageReceiver.c0(f3, "36_36", bitmapDrawable2, j2, null, m1.webpage, 0);
            imageReceiver.q0(gl.L(4.0f));
        } else {
            TLRPC.User f4 = y6c.h(i3).f();
            pb0 pb0Var = this.a;
            pb0Var.q(f4);
            imageReceiver.U(y6c.h(i3).f(), pb0Var, null);
            imageReceiver.q0(gl.L(36.0f));
        }
        this.r = z;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f;
        if (k96.a0) {
            L = getMeasuredWidth() - gl.L(51.0f);
        } else {
            L = gl.L(15.0f);
        }
        float f2 = L;
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, gl.L(7.0f), gl.L(36.0f), gl.L(36.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint U0 = bkb.U0("paintDivider", this.f);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            Paint paint = U0;
            float f3 = 64.0f;
            if (k96.a0) {
                f = 0.0f;
            } else {
                f = 64.0f;
            }
            float L2 = gl.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!k96.a0) {
                f3 = 0.0f;
            }
            canvas.drawRect(L2, measuredHeight, width - gl.L(f3), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f) + (this.r ? 1 : 0), 1073741824));
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

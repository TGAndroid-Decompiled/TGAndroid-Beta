package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fxb extends FrameLayout implements tjb {
    public boolean E;
    public ec0 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int a;
    public final wjb b;
    public c9a c;
    public final l46 d;
    public final gn e;
    public final rj4 f;
    public final ImageView h;
    public boolean n;
    public final lm r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public fxb(int i, wjb wjbVar, Context context) {
        super(context);
        this.r = new lm(360L, this, s33.h);
        this.s = false;
        this.y = false;
        this.E = false;
        this.J = bkb.T8;
        this.M = 0;
        this.a = i;
        this.b = wjbVar;
        setClipChildren(false);
        setClipToPadding(false);
        l46 l46Var = new l46(context, wjbVar);
        this.d = l46Var;
        l46Var.setTextSize(1, 14.0f);
        l46Var.setTypeface(gl.o());
        addView(l46Var, nme.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        ote.a(l46Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, nme.e(34, 34, 17));
        gn gnVar = new gn(false, false, false);
        this.e = gnVar;
        gnVar.w(gl.L(11.0f));
        gnVar.x(gl.o());
        gnVar.N = gl.q.x;
        gnVar.b = 17;
        rj4 rj4Var = new rj4(this, context, wjbVar);
        this.f = rj4Var;
        addView(rj4Var, nme.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        ote.a(rj4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i;
        gn gnVar = this.e;
        int max = (int) Math.max(gl.L(16.66f), gnVar.d + gl.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + gl.L(11.0f);
        if (gnVar.d > 0.0f) {
            i = gl.L(4.66f) + max;
        } else {
            i = 0;
        }
        return gl.L(11.0f) + measuredWidth + i + this.M;
    }

    public int getTextColor() {
        float f;
        int i = bkb.y6;
        wjb wjbVar = this.b;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.Ei, wjbVar);
        if (this.y) {
            f = 1.0f;
        } else {
            f = this.G;
        }
        return bm2.f(f, v0, v02);
    }

    private void setLayout(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    public final void b(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        boolean z2;
        String str;
        setLayout(false);
        long j2 = this.x;
        long j3 = tL_forumTopic.id;
        if (j2 == j3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = j3;
        this.h.setVisibility(8);
        l46 l46Var = this.d;
        l46Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            cm2 cm2Var = new cm2(2131232149, 0);
            cm2Var.I = 0.66f;
            cm2Var.J = 0.66f;
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new gm(tL_forumTopic.icon_emoji_id, l46Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        l46Var.setText(spannableStringBuilder);
        setSelected(z);
        h();
        e(tL_forumTopic.unread_count, na7.q1(this.a).n2(j, this.x, null), z2);
        boolean z3 = tL_forumTopic.pinned;
        if (this.s != z3) {
            this.s = z3;
        }
    }

    public final void c() {
        setLayout(false);
        this.x = 0L;
        this.y = true;
        this.h.setVisibility(8);
        l46 l46Var = this.d;
        l46Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new cm2(2131231908, 0), 0, 1, 33);
        l46Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        setLayout(z2);
        this.x = 0L;
        this.y = false;
        int i3 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i);
        if (z) {
            cxb cxbVar = new cxb(getContext());
            cxbVar.b.setColor(bkb.v0(bkb.Ei, this.b));
            imageView.setImageDrawable(cxbVar);
            i2 = 2131753061;
        } else {
            i2 = 2131754286;
        }
        String M0 = k96.M0(i2, null);
        l46 l46Var = this.d;
        l46Var.setText(M0);
        if (!z) {
            i3 = 0;
        }
        l46Var.setVisibility(i3);
        setSelected(z3);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.d) {
            canvas.save();
            float d = this.r.d(this.n);
            if (d > 0.0f) {
                if (this.c == null) {
                    this.c = new c9a(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.c.a(canvas, d);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(int i, boolean z, boolean z2) {
        int i2;
        gn gnVar = this.e;
        if (i > 0) {
            if (z) {
                i2 = bkb.U8;
            } else {
                i2 = bkb.T8;
            }
            this.J = i2;
            gnVar.t(k96.E(i, ','), z2, true);
        } else {
            this.J = bkb.U8;
            gnVar.t("", z2, true);
        }
        if (z2 && this.K < i) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new dxb(this, (byte) 0));
            this.L.addListener(new iab(this, (byte) 7));
            b00.n(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.K = i;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.x = -1L;
        this.h.setVisibility(8);
        l46 l46Var = this.d;
        l46Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        u86 u86Var = new u86(gl.L(42.0f), l46Var);
        u86Var.e = 0.95f;
        spannableStringBuilder.setSpan(u86Var, 0, 1, 33);
        l46Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        boolean z2;
        setLayout(true);
        long n = cf3.n(tL_forumTopic.from_id);
        if (this.x == n) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = n;
        this.h.setVisibility(8);
        l46 l46Var = this.d;
        l46Var.setVisibility(0);
        ec0 ec0Var = this.F;
        int i = this.a;
        if (ec0Var == null) {
            ec0 ec0Var2 = new ec0(18.0f, i, l46Var);
            this.F = ec0Var2;
            ec0Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject Z1 = na7.q1(i).Z1(n);
        if (Z1 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            ec0 ec0Var3 = this.F;
            pb0 pb0Var = ec0Var3.c;
            pb0Var.o(Z1);
            ec0Var3.b.U(Z1, pb0Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) cf3.k(y6c.t0, n));
        l46Var.setText(TextUtils.ellipsize(spannableStringBuilder, l46Var.getPaint(), gl.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z);
        e(tL_forumTopic.unread_count, na7.q1(i).n2(j, n, null), z2);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        l46 l46Var = this.d;
        l46Var.setTextColor(textColor);
        l46Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        ImageView imageView = this.h;
        int measuredWidth = (i5 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i6 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = gl.L(11.0f);
        int i7 = i6 / 2;
        l46 l46Var = this.d;
        l46Var.layout(L, i7 - (l46Var.getMeasuredHeight() / 2), l46Var.getMeasuredWidth() + gl.L(11.0f), (l46Var.getMeasuredHeight() / 2) + i7);
        int i8 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        rj4 rj4Var = this.f;
        if (i8 > 0) {
            rj4Var.layout(((i5 - gl.L(11.0f)) - this.M) - rj4Var.getMeasuredWidth(), i7 - (rj4Var.getMeasuredHeight() / 2), (i5 - gl.L(11.0f)) - this.M, (rj4Var.getMeasuredHeight() / 2) + i7);
        } else {
            int L2 = gl.L(11.0f);
            int L3 = gl.L(4.66f);
            int measuredWidth2 = l46Var.getMeasuredWidth() + gl.L(11.0f);
            rj4Var.layout(L3 + l46Var.getMeasuredWidth() + L2, i7 - (rj4Var.getMeasuredHeight() / 2), rj4Var.getMeasuredWidth() + gl.L(4.66f) + measuredWidth2, (rj4Var.getMeasuredHeight() / 2) + i7);
        }
        if (this.w != 0 && rj4Var.getLeft() != this.w) {
            rj4Var.setTranslationX((-rj4Var.getLeft()) + this.w);
            rj4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(s33.h).start();
        }
        this.w = rj4Var.getLeft();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.d.measure(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), 1073741824));
    }

    public void setReorder(boolean z) {
        this.n = z;
        invalidate();
    }

    @Override
    public void setSelected(boolean z) {
        float f;
        if (this.H == z) {
            return;
        }
        this.H = z;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.G;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new dxb(this, (byte) 1));
        this.I.addListener(new pu9((byte) 11, this, z));
        this.I.setInterpolator(s33.h);
        this.I.setDuration(320L);
        this.I.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof cxb)) {
                ((cxb) imageView.getDrawable()).b.setColor(bkb.v0(bkb.Ei, this.b));
                imageView.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}

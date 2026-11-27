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
public final class g1c extends FrameLayout implements snb {
    public boolean E;
    public gc0 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int a;
    public final vnb b;
    public sca c;
    public final p66 d;
    public final hn e;
    public final vl4 f;
    public final ImageView h;
    public boolean n;
    public final mm r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public g1c(int i, vnb vnbVar, Context context) {
        super(context);
        this.r = new mm(360L, this, k43.h);
        this.s = false;
        this.y = false;
        this.E = false;
        this.J = aob.U8;
        this.M = 0;
        this.a = i;
        this.b = vnbVar;
        setClipChildren(false);
        setClipToPadding(false);
        p66 p66Var = new p66(context, vnbVar);
        this.d = p66Var;
        p66Var.setTextSize(1, 14.0f);
        p66Var.setTypeface(hl.o());
        addView(p66Var, tre.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        iye.a(p66Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, tre.e(34, 34, 17));
        hn hnVar = new hn(false, false, false);
        this.e = hnVar;
        hnVar.w(hl.L(11.0f));
        hnVar.x(hl.o());
        hnVar.N = hl.q.x;
        hnVar.b = 17;
        vl4 vl4Var = new vl4(this, context, vnbVar);
        this.f = vl4Var;
        addView(vl4Var, tre.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        iye.a(vl4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i;
        hn hnVar = this.e;
        int max = (int) Math.max(hl.L(16.66f), hnVar.d + hl.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + hl.L(11.0f);
        if (hnVar.d > 0.0f) {
            i = hl.L(4.66f) + max;
        } else {
            i = 0;
        }
        return hl.L(11.0f) + measuredWidth + i + this.M;
    }

    public int getTextColor() {
        float f;
        int i = aob.z6;
        vnb vnbVar = this.b;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.Fi, vnbVar);
        if (this.y) {
            f = 1.0f;
        } else {
            f = this.G;
        }
        return vm2.f(f, v0, v02);
    }

    private void setLayout(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.Fi));
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
        p66 p66Var = this.d;
        p66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            wm2 wm2Var = new wm2(2131232149, 0);
            wm2Var.I = 0.66f;
            wm2Var.J = 0.66f;
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new hm(tL_forumTopic.icon_emoji_id, p66Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        p66Var.setText(spannableStringBuilder);
        setSelected(z);
        h();
        e(tL_forumTopic.unread_count, uc7.s1(this.a).p2(j, this.x, null), z2);
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
        p66 p66Var = this.d;
        p66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new wm2(2131231908, 0), 0, 1, 33);
        p66Var.setText(spannableStringBuilder);
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
            d1c d1cVar = new d1c(getContext());
            d1cVar.b.setColor(aob.v0(aob.Fi, this.b));
            imageView.setImageDrawable(d1cVar);
            i2 = 2131753057;
        } else {
            i2 = 2131754282;
        }
        String M0 = ob6.M0(i2, null);
        p66 p66Var = this.d;
        p66Var.setText(M0);
        if (!z) {
            i3 = 0;
        }
        p66Var.setVisibility(i3);
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
                    this.c = new sca(this);
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
        hn hnVar = this.e;
        if (i > 0) {
            if (z) {
                i2 = aob.V8;
            } else {
                i2 = aob.U8;
            }
            this.J = i2;
            hnVar.t(ob6.E(i, ','), z2, true);
        } else {
            this.J = aob.V8;
            hnVar.t("", z2, true);
        }
        if (z2 && this.K < i) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new e1c(this, (byte) 0));
            this.L.addListener(new omb(this, (byte) 6));
            c00.o(2.0f, this.L);
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
        p66 p66Var = this.d;
        p66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ya6 ya6Var = new ya6(hl.L(42.0f), p66Var);
        ya6Var.e = 0.95f;
        spannableStringBuilder.setSpan(ya6Var, 0, 1, 33);
        p66Var.setText(spannableStringBuilder);
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
        long n = wf3.n(tL_forumTopic.from_id);
        if (this.x == n) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = n;
        this.h.setVisibility(8);
        p66 p66Var = this.d;
        p66Var.setVisibility(0);
        gc0 gc0Var = this.F;
        int i = this.a;
        if (gc0Var == null) {
            gc0 gc0Var2 = new gc0(18.0f, i, p66Var);
            this.F = gc0Var2;
            gc0Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject b2 = uc7.s1(i).b2(n);
        if (b2 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            gc0 gc0Var3 = this.F;
            rb0 rb0Var = gc0Var3.c;
            rb0Var.o(b2);
            gc0Var3.b.U(b2, rb0Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) wf3.k(yac.t0, n));
        p66Var.setText(TextUtils.ellipsize(spannableStringBuilder, p66Var.getPaint(), hl.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z);
        e(tL_forumTopic.unread_count, uc7.s1(i).p2(j, n, null), z2);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        p66 p66Var = this.d;
        p66Var.setTextColor(textColor);
        p66Var.setEmojiColor(textColor);
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
        int L = hl.L(11.0f);
        int i7 = i6 / 2;
        p66 p66Var = this.d;
        p66Var.layout(L, i7 - (p66Var.getMeasuredHeight() / 2), p66Var.getMeasuredWidth() + hl.L(11.0f), (p66Var.getMeasuredHeight() / 2) + i7);
        int i8 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        vl4 vl4Var = this.f;
        if (i8 > 0) {
            vl4Var.layout(((i5 - hl.L(11.0f)) - this.M) - vl4Var.getMeasuredWidth(), i7 - (vl4Var.getMeasuredHeight() / 2), (i5 - hl.L(11.0f)) - this.M, (vl4Var.getMeasuredHeight() / 2) + i7);
        } else {
            int L2 = hl.L(11.0f);
            int L3 = hl.L(4.66f);
            int measuredWidth2 = p66Var.getMeasuredWidth() + hl.L(11.0f);
            vl4Var.layout(L3 + p66Var.getMeasuredWidth() + L2, i7 - (vl4Var.getMeasuredHeight() / 2), vl4Var.getMeasuredWidth() + hl.L(4.66f) + measuredWidth2, (vl4Var.getMeasuredHeight() / 2) + i7);
        }
        if (this.w != 0 && vl4Var.getLeft() != this.w) {
            vl4Var.setTranslationX((-vl4Var.getLeft()) + this.w);
            vl4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(k43.h).start();
        }
        this.w = vl4Var.getLeft();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.d.measure(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(36.0f), 1073741824));
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
        ofFloat.addUpdateListener(new e1c(this, (byte) 1));
        this.I.addListener(new i1a((byte) 10, this, z));
        this.I.setInterpolator(k43.h);
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
            if (imageView != null && (imageView.getDrawable() instanceof d1c)) {
                ((d1c) imageView.getDrawable()).b.setColor(aob.v0(aob.Fi, this.b));
                imageView.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

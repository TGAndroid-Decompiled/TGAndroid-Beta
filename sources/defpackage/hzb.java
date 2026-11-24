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
public final class hzb extends FrameLayout implements vlb {
    public boolean E;
    public ed0 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int a;
    public final ylb b;
    public cba c;
    public final l66 d;
    public final ho e;
    public final yc f;
    public final ImageView h;
    public boolean n;
    public final ln r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public hzb(int i, ylb ylbVar, Context context) {
        super(context);
        this.r = new ln(360L, this, d53.h);
        this.s = false;
        this.y = false;
        this.E = false;
        this.J = cmb.T8;
        this.M = 0;
        this.a = i;
        this.b = ylbVar;
        setClipChildren(false);
        setClipToPadding(false);
        l66 l66Var = new l66(context, ylbVar);
        this.d = l66Var;
        l66Var.setTextSize(1, 14.0f);
        l66Var.setTypeface(gm.o());
        addView(l66Var, qoe.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        rve.a(l66Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, qoe.e(34, 34, 17));
        ho hoVar = new ho(false, false, false);
        this.e = hoVar;
        hoVar.w(gm.L(11.0f));
        hoVar.x(gm.o());
        hoVar.N = gm.q.x;
        hoVar.b = 17;
        yc ycVar = new yc(this, context, ylbVar);
        this.f = ycVar;
        addView(ycVar, qoe.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        rve.a(ycVar);
        h();
    }

    private int getMeasuringWidth() {
        int i;
        ho hoVar = this.e;
        int max = (int) Math.max(gm.L(16.66f), hoVar.d + gm.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + gm.L(11.0f);
        if (hoVar.d > 0.0f) {
            i = gm.L(4.66f) + max;
        } else {
            i = 0;
        }
        return gm.L(11.0f) + measuredWidth + i + this.M;
    }

    public int getTextColor() {
        float f;
        int i = cmb.y6;
        ylb ylbVar = this.b;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.Ei, ylbVar);
        if (this.y) {
            f = 1.0f;
        } else {
            f = this.G;
        }
        return on2.f(f, v0, v02);
    }

    private void setLayout(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.Ei));
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
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            pn2 pn2Var = new pn2(2131232150, 0);
            pn2Var.I = 0.66f;
            pn2Var.J = 0.66f;
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new gn(tL_forumTopic.icon_emoji_id, l66Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        l66Var.setText(spannableStringBuilder);
        setSelected(z);
        h();
        e(tL_forumTopic.unread_count, oc7.r1(this.a).o2(j, this.x, null), z2);
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
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new pn2(2131231909, 0), 0, 1, 33);
        l66Var.setText(spannableStringBuilder);
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
            ezb ezbVar = new ezb(getContext());
            ezbVar.b.setColor(cmb.v0(cmb.Ei, this.b));
            imageView.setImageDrawable(ezbVar);
            i2 = 2131753029;
        } else {
            i2 = 2131754254;
        }
        String M0 = jb6.M0(i2, null);
        l66 l66Var = this.d;
        l66Var.setText(M0);
        if (!z) {
            i3 = 0;
        }
        l66Var.setVisibility(i3);
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
                    this.c = new cba(this);
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
        ho hoVar = this.e;
        if (i > 0) {
            if (z) {
                i2 = cmb.U8;
            } else {
                i2 = cmb.T8;
            }
            this.J = i2;
            hoVar.t(jb6.E(i, ','), z2, true);
        } else {
            this.J = cmb.U8;
            hoVar.t("", z2, true);
        }
        if (z2 && this.K < i) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new fzb(this, (byte) 0));
            this.L.addListener(new q7b(this, (byte) 9));
            b10.n(2.0f, this.L);
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
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ta6 ta6Var = new ta6(gm.L(42.0f), l66Var);
        ta6Var.e = 0.95f;
        spannableStringBuilder.setSpan(ta6Var, 0, 1, 33);
        l66Var.setText(spannableStringBuilder);
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
        long n = pg3.n(tL_forumTopic.from_id);
        if (this.x == n) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = n;
        this.h.setVisibility(8);
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        ed0 ed0Var = this.F;
        int i = this.a;
        if (ed0Var == null) {
            ed0 ed0Var2 = new ed0(18.0f, i, l66Var);
            this.F = ed0Var2;
            ed0Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject a2 = oc7.r1(i).a2(n);
        if (a2 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            ed0 ed0Var3 = this.F;
            pc0 pc0Var = ed0Var3.c;
            pc0Var.o(a2);
            ed0Var3.b.U(a2, pc0Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) pg3.k(z8c.t0, n));
        l66Var.setText(TextUtils.ellipsize(spannableStringBuilder, l66Var.getPaint(), gm.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z);
        e(tL_forumTopic.unread_count, oc7.r1(i).o2(j, n, null), z2);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        l66 l66Var = this.d;
        l66Var.setTextColor(textColor);
        l66Var.setEmojiColor(textColor);
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
        int L = gm.L(11.0f);
        int i7 = i6 / 2;
        l66 l66Var = this.d;
        l66Var.layout(L, i7 - (l66Var.getMeasuredHeight() / 2), l66Var.getMeasuredWidth() + gm.L(11.0f), (l66Var.getMeasuredHeight() / 2) + i7);
        int i8 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        yc ycVar = this.f;
        if (i8 > 0) {
            ycVar.layout(((i5 - gm.L(11.0f)) - this.M) - ycVar.getMeasuredWidth(), i7 - (ycVar.getMeasuredHeight() / 2), (i5 - gm.L(11.0f)) - this.M, (ycVar.getMeasuredHeight() / 2) + i7);
        } else {
            int L2 = gm.L(11.0f);
            int L3 = gm.L(4.66f);
            int measuredWidth2 = l66Var.getMeasuredWidth() + gm.L(11.0f);
            ycVar.layout(L3 + l66Var.getMeasuredWidth() + L2, i7 - (ycVar.getMeasuredHeight() / 2), ycVar.getMeasuredWidth() + gm.L(4.66f) + measuredWidth2, (ycVar.getMeasuredHeight() / 2) + i7);
        }
        if (this.w != 0 && ycVar.getLeft() != this.w) {
            ycVar.setTranslationX((-ycVar.getLeft()) + this.w);
            ycVar.animate().translationX(0.0f).setDuration(320L).setInterpolator(d53.h).start();
        }
        this.w = ycVar.getLeft();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.d.measure(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), 1073741824));
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
        ofFloat.addUpdateListener(new fzb(this, (byte) 1));
        this.I.addListener(new sw9((byte) 11, this, z));
        this.I.setInterpolator(d53.h);
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
            if (imageView != null && (imageView.getDrawable() instanceof ezb)) {
                ((ezb) imageView.getDrawable()).b.setColor(cmb.v0(cmb.Ei, this.b));
                imageView.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

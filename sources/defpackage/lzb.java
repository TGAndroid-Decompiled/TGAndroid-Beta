package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lzb extends FrameLayout implements vlb {
    public boolean E;
    public boolean F;
    public int G;
    public SpannableStringBuilder H;
    public SpannableStringBuilder I;
    public int J;
    public boolean K;
    public boolean L;
    public float M;
    public ValueAnimator N;
    public long O;
    public boolean P;
    public boolean Q;
    public qa6 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final ylb b;
    public cba c;
    public final f7 d;
    public final FrameLayout.LayoutParams e;
    public final ho f;
    public final ec0 h;
    public final bf0 n;
    public ezb r;
    public final pc0 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public lzb(int i, ylb ylbVar, Context context) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = cmb.T8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i;
        this.b = ylbVar;
        f7 f7Var = new f7(this, context);
        this.d = f7Var;
        f7Var.setWillNotDraw(false);
        f7Var.setOrientation(1);
        addView(f7Var, qoe.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        rve.a(f7Var);
        ho hoVar = new ho(false, false, false);
        this.f = hoVar;
        hoVar.w(gm.L(11.0f));
        hoVar.x(gm.o());
        hoVar.u(cmb.v0(cmb.V8, ylbVar));
        hoVar.N = gm.q.x;
        hoVar.b = 17;
        ec0 ec0Var = new ec0(this, context, ylbVar);
        this.h = ec0Var;
        ec0Var.setWillNotDraw(false);
        ec0Var.setPadding(0, gm.L(4.0f), 0, 0);
        f7Var.addView(ec0Var, qoe.r(-1, -2, 17));
        bf0 bf0Var = new bf0(context);
        this.n = bf0Var;
        FrameLayout.LayoutParams e = qoe.e(34, 34, 17);
        this.e = e;
        ec0Var.addView(bf0Var, e);
        this.s = new pc0((ylb) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int v0 = cmb.v0(cmb.y6, ylbVar);
        int i2 = cmb.Ei;
        textView.setTextColor(on2.f(this.V, v0, cmb.v0(i2, ylbVar)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(gm.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7Var.addView(textView, qoe.t(-1, -2, 17, 4, 0, 4, 0));
        f7Var.setPadding(0, 0, 0, gm.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable b0 = cmb.b0(gm.L(2.33f), cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        imageView.setBackground(b0);
        anb.j(imageView, b0, M, null, ylbVar);
        addView(imageView, qoe.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-gm.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z) {
        float f;
        float f2;
        int L;
        int L2;
        if (this.E == z) {
            return;
        }
        this.E = z;
        if (z) {
            f = 36.0f;
        } else {
            f = 3.0f;
        }
        this.n.setRoundRadius(gm.L(f));
        if (z) {
            f2 = 7.0f;
        } else {
            f2 = 4.0f;
        }
        this.h.setPadding(0, gm.L(f2), 0, 0);
        if (z) {
            L = gm.L(28.0f);
        } else {
            L = gm.L(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        if (z) {
            L2 = gm.L(28.0f);
        } else {
            L2 = gm.L(30.0f);
        }
        layoutParams.height = L2;
    }

    public final void a(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        setLayout(false);
        long j2 = this.O;
        long j3 = tL_forumTopic.id;
        if (j2 == j3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Q = false;
        this.O = j3;
        this.P = false;
        String str = tL_forumTopic.title;
        TextView textView = this.w;
        textView.setText(str);
        textView.setVisibility(0);
        int i = tL_forumTopic.id;
        bf0 bf0Var = this.n;
        if (i == 1) {
            this.Q = true;
            bf0Var.b();
            bf0Var.setAnimatedEmojiDrawable(null);
            bf0Var.setImageResource(2131232150);
            bf0Var.setScaleX(0.66f);
            bf0Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            bf0Var.b();
            bf0Var.setAnimatedEmojiDrawable(vm.m(z8c.t0, tL_forumTopic.icon_emoji_id, null, 3));
            bf0Var.setScaleX(1.0f);
            bf0Var.setScaleY(1.0f);
        } else {
            bf0Var.setAnimatedEmojiDrawable(null);
            bf0Var.setImageDrawable(no4.f(tL_forumTopic));
            bf0Var.setScaleX(1.0f);
            bf0Var.setScaleY(1.0f);
        }
        setSelected(z);
        g();
        boolean o2 = oc7.r1(this.a).o2(j, tL_forumTopic.id, null);
        int i2 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_mentions_count > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tL_forumTopic.unread_reactions_count > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        d(i2, o2, z3, z4, z2);
        boolean z5 = tL_forumTopic.pinned;
        if (this.F != z5) {
            this.F = z5;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    public final void b(boolean z, boolean z2) {
        setLayout(z);
        this.Q = true;
        this.P = true;
        String M0 = jb6.M0(2131748008, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        bf0 bf0Var = this.n;
        bf0Var.b();
        bf0Var.setAnimatedEmojiDrawable(null);
        bf0Var.setImageResource(2131231070);
        bf0Var.setScaleX(1.0f);
        bf0Var.setScaleY(1.0f);
        setSelected(z2);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        setLayout(z2);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        if (z) {
            i = 2131753029;
        } else {
            i = 2131754253;
        }
        String M0 = jb6.M0(i, null);
        TextView textView = this.w;
        textView.setText(M0);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        bf0 bf0Var = this.n;
        bf0Var.b();
        bf0Var.setAnimatedEmojiDrawable(null);
        if (z) {
            ezb ezbVar = new ezb(getContext());
            ezbVar.b.setColor(cmb.v0(cmb.Ei, this.b));
            bf0Var.setImageDrawable(ezbVar);
            this.r = ezbVar;
        } else {
            bf0Var.setImageResource(2131232489);
            this.r = null;
        }
        bf0Var.setScaleX(1.0f);
        bf0Var.setScaleY(1.0f);
        setSelected(z3);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2;
        int i3;
        ho hoVar = this.f;
        if (z3) {
            this.G = cmb.Y5;
            SpannableStringBuilder spannableStringBuilder = this.I;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder("❤️");
                pn2 pn2Var = new pn2(2131231968, 0);
                pn2Var.I = 0.8f;
                pn2Var.J = 0.8f;
                pn2Var.H = 0.5f;
                pn2Var.r = -gm.L(3.0f);
                pn2Var.s = 0.0f;
                spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            hoVar.t(spannableStringBuilder, z4, true);
        } else if (z2) {
            if (z) {
                i3 = cmb.U8;
            } else {
                i3 = cmb.T8;
            }
            this.G = i3;
            SpannableStringBuilder spannableStringBuilder2 = this.H;
            if (spannableStringBuilder2 == null) {
                spannableStringBuilder2 = new SpannableStringBuilder("@");
                pn2 pn2Var2 = new pn2(2131231969, 0);
                pn2Var2.I = 0.8f;
                pn2Var2.J = 0.8f;
                pn2Var2.H = 0.5f;
                pn2Var2.r = -gm.L(3.0f);
                pn2Var2.s = 0.0f;
                spannableStringBuilder2.setSpan(pn2Var2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            hoVar.t(spannableStringBuilder2, z4, true);
        } else if (i > 0) {
            if (z) {
                i2 = cmb.U8;
            } else {
                i2 = cmb.T8;
            }
            this.G = i2;
            hoVar.t(jb6.E(i, ','), z4, true);
        } else {
            this.G = cmb.U8;
            hoVar.t("", z4, true);
        }
        if (z4 && (this.J < i || ((!this.K && z2) || (!this.L && z3)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new jzb(this, (byte) 1));
            this.N.addListener(new q7b(this, (byte) 10));
            b10.n(2.0f, this.N);
            this.N.setDuration(200L);
            this.N.start();
        }
        this.J = i;
        this.K = z2;
        this.L = z3;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = gm.L(38.0f);
        TextView textView = this.w;
        ta6 ta6Var = new ta6(L, textView);
        ta6Var.e = 0.75f;
        spannableStringBuilder.setSpan(ta6Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        bf0 bf0Var = this.n;
        bf0Var.b();
        bf0Var.setAnimatedEmojiDrawable(null);
        qa6 qa6Var = this.R;
        if (qa6Var == null) {
            ylb ylbVar = this.b;
            qa6 qa6Var2 = new qa6(ylbVar);
            this.R = qa6Var2;
            qa6Var2.j(38.0f);
            this.R.setCallback(bf0Var);
            int v0 = cmb.v0(cmb.y6, ylbVar);
            this.R.g(cmb.p1(0.15f, v0), cmb.p1(0.5f, v0), cmb.p1(0.6f, v0), cmb.p1(0.15f, v0));
            qa6Var = this.R;
            qa6Var.n = false;
        }
        bf0Var.setImageDrawable(qa6Var);
        bf0Var.setScaleX(1.0f);
        bf0Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        boolean z2;
        boolean z3;
        setLayout(true);
        this.P = false;
        this.Q = false;
        long n = pg3.n(tL_forumTopic.from_id);
        if (n == this.O) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.O = n;
        String k = pg3.k(z8c.t0, n);
        TextView textView = this.w;
        textView.setText(k);
        textView.setVisibility(0);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        bf0 bf0Var = this.n;
        pc0 pc0Var = this.s;
        int i2 = this.a;
        if (i >= 0) {
            TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(n));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
        } else {
            TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-n));
            pc0Var.p(L0);
            bf0Var.f(L0, pc0Var);
        }
        bf0Var.setScaleX(1.0f);
        bf0Var.setScaleY(1.0f);
        h();
        setSelected(z);
        int i3 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        d(i3, false, false, z3, z2);
        if (this.F) {
            this.F = false;
        }
    }

    public final void g() {
        float f;
        int i = cmb.y6;
        ylb ylbVar = this.b;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.Ei, ylbVar);
        if (this.P) {
            f = 1.0f;
        } else {
            f = this.V;
        }
        int f2 = on2.f(f, v0, v02);
        this.S = true;
        this.U = f2;
        boolean z = this.Q;
        this.T = z;
        bf0 bf0Var = this.n;
        if (!z) {
            bf0Var.setColorFilter(null);
        } else {
            bf0Var.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        }
        bf0Var.setEmojiColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        bf0Var.invalidate();
    }

    public final void h() {
        int i;
        float f = 1.0f;
        float f2 = (1.0f - this.V) * (-gm.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f2);
        if (this.V <= 0.0f) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        int i2 = cmb.y6;
        ylb ylbVar = this.b;
        int v0 = cmb.v0(i2, ylbVar);
        int v02 = cmb.v0(cmb.Ei, ylbVar);
        if (!this.P) {
            f = this.V;
        }
        this.w.setTextColor(on2.f(f, v0, v02));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(64.0f), 1073741824), i2);
    }

    public void setReorder(boolean z) {
        this.y = z;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z) {
        float f;
        if (this.W == z) {
            return;
        }
        this.W = z;
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.V;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new jzb(this, (byte) 0));
        this.a0.addListener(new sw9((byte) 12, this, z));
        this.a0.setInterpolator(d53.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    @Override
    public final void updateColors() {
        float f;
        try {
            TextView textView = this.w;
            float f2 = 1.0f;
            ylb ylbVar = this.b;
            if (textView != null) {
                int v0 = cmb.v0(cmb.y6, ylbVar);
                int v02 = cmb.v0(cmb.Ei, ylbVar);
                if (this.P) {
                    f = 1.0f;
                } else {
                    f = this.V;
                }
                textView.setTextColor(on2.f(f, v0, v02));
            }
            bf0 bf0Var = this.n;
            if (bf0Var != null) {
                int v03 = cmb.v0(cmb.y6, ylbVar);
                int v04 = cmb.v0(cmb.Ei, ylbVar);
                if (!this.P) {
                    f2 = this.V;
                }
                int f3 = on2.f(f2, v03, v04);
                if (!this.S || f3 != this.U || this.Q != this.T) {
                    g();
                }
            }
            ezb ezbVar = this.r;
            if (ezbVar != null) {
                ezbVar.b.setColor(cmb.v0(cmb.Ei, ylbVar));
                if (bf0Var != null) {
                    bf0Var.invalidate();
                }
            }
            if (this.R != null) {
                int v05 = cmb.v0(cmb.y6, ylbVar);
                this.R.g(cmb.p1(0.15f, v05), cmb.p1(0.5f, v05), cmb.p1(0.6f, v05), cmb.p1(0.15f, v05));
                this.R.n = false;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

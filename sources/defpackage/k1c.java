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
public final class k1c extends FrameLayout implements snb {
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
    public va6 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final vnb b;
    public tca c;
    public final g7 d;
    public final FrameLayout.LayoutParams e;
    public final hn f;
    public final gb0 h;
    public final de0 n;
    public d1c r;
    public final rb0 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public k1c(int i, vnb vnbVar, Context context) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = aob.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i;
        this.b = vnbVar;
        g7 g7Var = new g7(this, context);
        this.d = g7Var;
        g7Var.setWillNotDraw(false);
        g7Var.setOrientation(1);
        addView(g7Var, tre.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        iye.a(g7Var);
        hn hnVar = new hn(false, false, false);
        this.f = hnVar;
        hnVar.w(hl.L(11.0f));
        hnVar.x(hl.o());
        hnVar.u(aob.v0(aob.W8, vnbVar));
        hnVar.N = hl.q.x;
        hnVar.b = 17;
        gb0 gb0Var = new gb0(this, context, vnbVar);
        this.h = gb0Var;
        gb0Var.setWillNotDraw(false);
        gb0Var.setPadding(0, hl.L(4.0f), 0, 0);
        g7Var.addView(gb0Var, tre.r(-1, -2, 17));
        de0 de0Var = new de0(context);
        this.n = de0Var;
        FrameLayout.LayoutParams e = tre.e(34, 34, 17);
        this.e = e;
        gb0Var.addView(de0Var, e);
        this.s = new rb0((vnb) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int v0 = aob.v0(aob.z6, vnbVar);
        int i2 = aob.Fi;
        textView.setTextColor(vm2.f(this.V, v0, aob.v0(i2, vnbVar)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(hl.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g7Var.addView(textView, tre.t(-1, -2, 17, 4, 0, 4, 0));
        g7Var.setPadding(0, 0, 0, hl.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable b0 = aob.b0(hl.L(2.33f), aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        imageView.setBackground(b0);
        yob.j(imageView, b0, M, null, vnbVar);
        addView(imageView, tre.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-hl.L(3.0f));
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
        this.n.setRoundRadius(hl.L(f));
        if (z) {
            f2 = 7.0f;
        } else {
            f2 = 4.0f;
        }
        this.h.setPadding(0, hl.L(f2), 0, 0);
        if (z) {
            L = hl.L(28.0f);
        } else {
            L = hl.L(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        if (z) {
            L2 = hl.L(28.0f);
        } else {
            L2 = hl.L(30.0f);
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
        de0 de0Var = this.n;
        if (i == 1) {
            this.Q = true;
            de0Var.b();
            de0Var.setAnimatedEmojiDrawable(null);
            de0Var.setImageResource(2131232149);
            de0Var.setScaleX(0.66f);
            de0Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            de0Var.b();
            de0Var.setAnimatedEmojiDrawable(wl.m(yac.t0, tL_forumTopic.icon_emoji_id, null, 3));
            de0Var.setScaleX(1.0f);
            de0Var.setScaleY(1.0f);
        } else {
            de0Var.setAnimatedEmojiDrawable(null);
            de0Var.setImageDrawable(ro4.f(tL_forumTopic));
            de0Var.setScaleX(1.0f);
            de0Var.setScaleY(1.0f);
        }
        setSelected(z);
        g();
        boolean p2 = uc7.s1(this.a).p2(j, tL_forumTopic.id, null);
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
        d(i2, p2, z3, z4, z2);
        boolean z5 = tL_forumTopic.pinned;
        if (this.F != z5) {
            this.F = z5;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z6));
    }

    public final void b(boolean z, boolean z2) {
        setLayout(z);
        this.Q = true;
        this.P = true;
        String M0 = ob6.M0(2131748005, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        de0 de0Var = this.n;
        de0Var.b();
        de0Var.setAnimatedEmojiDrawable(null);
        de0Var.setImageResource(2131231069);
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
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
            i = 2131753057;
        } else {
            i = 2131754281;
        }
        String M0 = ob6.M0(i, null);
        TextView textView = this.w;
        textView.setText(M0);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        de0 de0Var = this.n;
        de0Var.b();
        de0Var.setAnimatedEmojiDrawable(null);
        if (z) {
            d1c d1cVar = new d1c(getContext());
            d1cVar.b.setColor(aob.v0(aob.Fi, this.b));
            de0Var.setImageDrawable(d1cVar);
            this.r = d1cVar;
        } else {
            de0Var.setImageResource(2131232488);
            this.r = null;
        }
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
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
        hn hnVar = this.f;
        if (z3) {
            this.G = aob.Z5;
            SpannableStringBuilder spannableStringBuilder = this.I;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder("❤️");
                wm2 wm2Var = new wm2(2131231967, 0);
                wm2Var.I = 0.8f;
                wm2Var.J = 0.8f;
                wm2Var.H = 0.5f;
                wm2Var.r = -hl.L(3.0f);
                wm2Var.s = 0.0f;
                spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            hnVar.t(spannableStringBuilder, z4, true);
        } else if (z2) {
            if (z) {
                i3 = aob.V8;
            } else {
                i3 = aob.U8;
            }
            this.G = i3;
            SpannableStringBuilder spannableStringBuilder2 = this.H;
            if (spannableStringBuilder2 == null) {
                spannableStringBuilder2 = new SpannableStringBuilder("@");
                wm2 wm2Var2 = new wm2(2131231968, 0);
                wm2Var2.I = 0.8f;
                wm2Var2.J = 0.8f;
                wm2Var2.H = 0.5f;
                wm2Var2.r = -hl.L(3.0f);
                wm2Var2.s = 0.0f;
                spannableStringBuilder2.setSpan(wm2Var2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            hnVar.t(spannableStringBuilder2, z4, true);
        } else if (i > 0) {
            if (z) {
                i2 = aob.V8;
            } else {
                i2 = aob.U8;
            }
            this.G = i2;
            hnVar.t(ob6.E(i, ','), z4, true);
        } else {
            this.G = aob.V8;
            hnVar.t("", z4, true);
        }
        if (z4 && (this.J < i || ((!this.K && z2) || (!this.L && z3)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new i1c(this, (byte) 1));
            this.N.addListener(new omb(this, (byte) 7));
            c00.o(2.0f, this.N);
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
        int L = hl.L(38.0f);
        TextView textView = this.w;
        ya6 ya6Var = new ya6(L, textView);
        ya6Var.e = 0.75f;
        spannableStringBuilder.setSpan(ya6Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        de0 de0Var = this.n;
        de0Var.b();
        de0Var.setAnimatedEmojiDrawable(null);
        va6 va6Var = this.R;
        if (va6Var == null) {
            vnb vnbVar = this.b;
            va6 va6Var2 = new va6(vnbVar);
            this.R = va6Var2;
            va6Var2.j(38.0f);
            this.R.setCallback(de0Var);
            int v0 = aob.v0(aob.z6, vnbVar);
            this.R.g(aob.p1(0.15f, v0), aob.p1(0.5f, v0), aob.p1(0.6f, v0), aob.p1(0.15f, v0));
            va6Var = this.R;
            va6Var.n = false;
        }
        de0Var.setImageDrawable(va6Var);
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
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
        long n = wf3.n(tL_forumTopic.from_id);
        if (n == this.O) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.O = n;
        String k = wf3.k(yac.t0, n);
        TextView textView = this.w;
        textView.setText(k);
        textView.setVisibility(0);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        de0 de0Var = this.n;
        rb0 rb0Var = this.s;
        int i2 = this.a;
        if (i >= 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
        } else {
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n));
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
        }
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
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
        int i = aob.z6;
        vnb vnbVar = this.b;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.Fi, vnbVar);
        if (this.P) {
            f = 1.0f;
        } else {
            f = this.V;
        }
        int f2 = vm2.f(f, v0, v02);
        this.S = true;
        this.U = f2;
        boolean z = this.Q;
        this.T = z;
        de0 de0Var = this.n;
        if (!z) {
            de0Var.setColorFilter(null);
        } else {
            de0Var.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        }
        de0Var.setEmojiColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        de0Var.invalidate();
    }

    public final void h() {
        int i;
        float f = 1.0f;
        float f2 = (1.0f - this.V) * (-hl.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f2);
        if (this.V <= 0.0f) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        int i2 = aob.z6;
        vnb vnbVar = this.b;
        int v0 = aob.v0(i2, vnbVar);
        int v02 = aob.v0(aob.Fi, vnbVar);
        if (!this.P) {
            f = this.V;
        }
        this.w.setTextColor(vm2.f(f, v0, v02));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(64.0f), 1073741824), i2);
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
        ofFloat.addUpdateListener(new i1c(this, (byte) 0));
        this.a0.addListener(new i1a((byte) 11, this, z));
        this.a0.setInterpolator(k43.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    @Override
    public final void updateColors() {
        float f;
        try {
            TextView textView = this.w;
            float f2 = 1.0f;
            vnb vnbVar = this.b;
            if (textView != null) {
                int v0 = aob.v0(aob.z6, vnbVar);
                int v02 = aob.v0(aob.Fi, vnbVar);
                if (this.P) {
                    f = 1.0f;
                } else {
                    f = this.V;
                }
                textView.setTextColor(vm2.f(f, v0, v02));
            }
            de0 de0Var = this.n;
            if (de0Var != null) {
                int v03 = aob.v0(aob.z6, vnbVar);
                int v04 = aob.v0(aob.Fi, vnbVar);
                if (!this.P) {
                    f2 = this.V;
                }
                int f3 = vm2.f(f2, v03, v04);
                if (!this.S || f3 != this.U || this.Q != this.T) {
                    g();
                }
            }
            d1c d1cVar = this.r;
            if (d1cVar != null) {
                d1cVar.b.setColor(aob.v0(aob.Fi, vnbVar));
                if (de0Var != null) {
                    de0Var.invalidate();
                }
            }
            if (this.R != null) {
                int v05 = aob.v0(aob.z6, vnbVar);
                this.R.g(aob.p1(0.15f, v05), aob.p1(0.5f, v05), aob.p1(0.6f, v05), aob.p1(0.15f, v05));
                this.R.n = false;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

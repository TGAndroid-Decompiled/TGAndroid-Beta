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
public final class jxb extends FrameLayout implements tjb {
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
    public r86 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final wjb b;
    public c9a c;
    public final f7 d;
    public final FrameLayout.LayoutParams e;
    public final gn f;
    public final eb0 h;
    public final be0 n;
    public cxb r;
    public final pb0 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public jxb(int i, wjb wjbVar, Context context) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = bkb.T8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i;
        this.b = wjbVar;
        f7 f7Var = new f7(this, context);
        this.d = f7Var;
        f7Var.setWillNotDraw(false);
        f7Var.setOrientation(1);
        addView(f7Var, nme.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        ote.a(f7Var);
        gn gnVar = new gn(false, false, false);
        this.f = gnVar;
        gnVar.w(gl.L(11.0f));
        gnVar.x(gl.o());
        gnVar.u(bkb.v0(bkb.V8, wjbVar));
        gnVar.N = gl.q.x;
        gnVar.b = 17;
        eb0 eb0Var = new eb0(this, context, wjbVar);
        this.h = eb0Var;
        eb0Var.setWillNotDraw(false);
        eb0Var.setPadding(0, gl.L(4.0f), 0, 0);
        f7Var.addView(eb0Var, nme.r(-1, -2, 17));
        be0 be0Var = new be0(context);
        this.n = be0Var;
        FrameLayout.LayoutParams e = nme.e(34, 34, 17);
        this.e = e;
        eb0Var.addView(be0Var, e);
        this.s = new pb0((wjb) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int v0 = bkb.v0(bkb.y6, wjbVar);
        int i2 = bkb.Ei;
        textView.setTextColor(bm2.f(this.V, v0, bkb.v0(i2, wjbVar)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7Var.addView(textView, nme.t(-1, -2, 17, 4, 0, 4, 0));
        f7Var.setPadding(0, 0, 0, gl.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable b0 = bkb.b0(gl.L(2.33f), bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, M, null, wjbVar);
        addView(imageView, nme.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-gl.L(3.0f));
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
        this.n.setRoundRadius(gl.L(f));
        if (z) {
            f2 = 7.0f;
        } else {
            f2 = 4.0f;
        }
        this.h.setPadding(0, gl.L(f2), 0, 0);
        if (z) {
            L = gl.L(28.0f);
        } else {
            L = gl.L(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        if (z) {
            L2 = gl.L(28.0f);
        } else {
            L2 = gl.L(30.0f);
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
        be0 be0Var = this.n;
        if (i == 1) {
            this.Q = true;
            be0Var.b();
            be0Var.setAnimatedEmojiDrawable(null);
            be0Var.setImageResource(2131232149);
            be0Var.setScaleX(0.66f);
            be0Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            be0Var.b();
            be0Var.setAnimatedEmojiDrawable(vl.m(y6c.t0, tL_forumTopic.icon_emoji_id, null, 3));
            be0Var.setScaleX(1.0f);
            be0Var.setScaleY(1.0f);
        } else {
            be0Var.setAnimatedEmojiDrawable(null);
            be0Var.setImageDrawable(mm4.f(tL_forumTopic));
            be0Var.setScaleX(1.0f);
            be0Var.setScaleY(1.0f);
        }
        setSelected(z);
        g();
        boolean n2 = na7.q1(this.a).n2(j, tL_forumTopic.id, null);
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
        d(i2, n2, z3, z4, z2);
        boolean z5 = tL_forumTopic.pinned;
        if (this.F != z5) {
            this.F = z5;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    public final void b(boolean z, boolean z2) {
        setLayout(z);
        this.Q = true;
        this.P = true;
        String M0 = k96.M0(2131748059, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        be0 be0Var = this.n;
        be0Var.b();
        be0Var.setAnimatedEmojiDrawable(null);
        be0Var.setImageResource(2131231069);
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
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
            i = 2131753061;
        } else {
            i = 2131754285;
        }
        String M0 = k96.M0(i, null);
        TextView textView = this.w;
        textView.setText(M0);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        be0 be0Var = this.n;
        be0Var.b();
        be0Var.setAnimatedEmojiDrawable(null);
        if (z) {
            cxb cxbVar = new cxb(getContext());
            cxbVar.b.setColor(bkb.v0(bkb.Ei, this.b));
            be0Var.setImageDrawable(cxbVar);
            this.r = cxbVar;
        } else {
            be0Var.setImageResource(2131232477);
            this.r = null;
        }
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
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
        gn gnVar = this.f;
        if (z3) {
            this.G = bkb.Y5;
            SpannableStringBuilder spannableStringBuilder = this.I;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder("❤️");
                cm2 cm2Var = new cm2(2131231967, 0);
                cm2Var.I = 0.8f;
                cm2Var.J = 0.8f;
                cm2Var.H = 0.5f;
                cm2Var.r = -gl.L(3.0f);
                cm2Var.s = 0.0f;
                spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            gnVar.t(spannableStringBuilder, z4, true);
        } else if (z2) {
            if (z) {
                i3 = bkb.U8;
            } else {
                i3 = bkb.T8;
            }
            this.G = i3;
            SpannableStringBuilder spannableStringBuilder2 = this.H;
            if (spannableStringBuilder2 == null) {
                spannableStringBuilder2 = new SpannableStringBuilder("@");
                cm2 cm2Var2 = new cm2(2131231968, 0);
                cm2Var2.I = 0.8f;
                cm2Var2.J = 0.8f;
                cm2Var2.H = 0.5f;
                cm2Var2.r = -gl.L(3.0f);
                cm2Var2.s = 0.0f;
                spannableStringBuilder2.setSpan(cm2Var2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            gnVar.t(spannableStringBuilder2, z4, true);
        } else if (i > 0) {
            if (z) {
                i2 = bkb.U8;
            } else {
                i2 = bkb.T8;
            }
            this.G = i2;
            gnVar.t(k96.E(i, ','), z4, true);
        } else {
            this.G = bkb.U8;
            gnVar.t("", z4, true);
        }
        if (z4 && (this.J < i || ((!this.K && z2) || (!this.L && z3)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new hxb(this, (byte) 1));
            this.N.addListener(new iab(this, (byte) 8));
            b00.n(2.0f, this.N);
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
        int L = gl.L(38.0f);
        TextView textView = this.w;
        u86 u86Var = new u86(L, textView);
        u86Var.e = 0.75f;
        spannableStringBuilder.setSpan(u86Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        be0 be0Var = this.n;
        be0Var.b();
        be0Var.setAnimatedEmojiDrawable(null);
        r86 r86Var = this.R;
        if (r86Var == null) {
            wjb wjbVar = this.b;
            r86 r86Var2 = new r86(wjbVar);
            this.R = r86Var2;
            r86Var2.j(38.0f);
            this.R.setCallback(be0Var);
            int v0 = bkb.v0(bkb.y6, wjbVar);
            this.R.g(bkb.p1(0.15f, v0), bkb.p1(0.5f, v0), bkb.p1(0.6f, v0), bkb.p1(0.15f, v0));
            r86Var = this.R;
            r86Var.n = false;
        }
        be0Var.setImageDrawable(r86Var);
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
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
        long n = cf3.n(tL_forumTopic.from_id);
        if (n == this.O) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.O = n;
        String k = cf3.k(y6c.t0, n);
        TextView textView = this.w;
        textView.setText(k);
        textView.setVisibility(0);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        be0 be0Var = this.n;
        pb0 pb0Var = this.s;
        int i2 = this.a;
        if (i >= 0) {
            TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(n));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
        } else {
            TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-n));
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
        }
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
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
        int i = bkb.y6;
        wjb wjbVar = this.b;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.Ei, wjbVar);
        if (this.P) {
            f = 1.0f;
        } else {
            f = this.V;
        }
        int f2 = bm2.f(f, v0, v02);
        this.S = true;
        this.U = f2;
        boolean z = this.Q;
        this.T = z;
        be0 be0Var = this.n;
        if (!z) {
            be0Var.setColorFilter(null);
        } else {
            be0Var.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        }
        be0Var.setEmojiColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        be0Var.invalidate();
    }

    public final void h() {
        int i;
        float f = 1.0f;
        float f2 = (1.0f - this.V) * (-gl.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f2);
        if (this.V <= 0.0f) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        int i2 = bkb.y6;
        wjb wjbVar = this.b;
        int v0 = bkb.v0(i2, wjbVar);
        int v02 = bkb.v0(bkb.Ei, wjbVar);
        if (!this.P) {
            f = this.V;
        }
        this.w.setTextColor(bm2.f(f, v0, v02));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(64.0f), 1073741824), i2);
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
        ofFloat.addUpdateListener(new hxb(this, (byte) 0));
        this.a0.addListener(new pu9((byte) 12, this, z));
        this.a0.setInterpolator(s33.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    @Override
    public final void updateColors() {
        float f;
        try {
            TextView textView = this.w;
            float f2 = 1.0f;
            wjb wjbVar = this.b;
            if (textView != null) {
                int v0 = bkb.v0(bkb.y6, wjbVar);
                int v02 = bkb.v0(bkb.Ei, wjbVar);
                if (this.P) {
                    f = 1.0f;
                } else {
                    f = this.V;
                }
                textView.setTextColor(bm2.f(f, v0, v02));
            }
            be0 be0Var = this.n;
            if (be0Var != null) {
                int v03 = bkb.v0(bkb.y6, wjbVar);
                int v04 = bkb.v0(bkb.Ei, wjbVar);
                if (!this.P) {
                    f2 = this.V;
                }
                int f3 = bm2.f(f2, v03, v04);
                if (!this.S || f3 != this.U || this.Q != this.T) {
                    g();
                }
            }
            cxb cxbVar = this.r;
            if (cxbVar != null) {
                cxbVar.b.setColor(bkb.v0(bkb.Ei, wjbVar));
                if (be0Var != null) {
                    be0Var.invalidate();
                }
            }
            if (this.R != null) {
                int v05 = bkb.v0(bkb.y6, wjbVar);
                this.R.g(bkb.p1(0.15f, v05), bkb.p1(0.5f, v05), bkb.p1(0.6f, v05), bkb.p1(0.15f, v05));
                this.R.n = false;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class bt5 extends nx0 {
    public static final int h2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public boolean K1;
    public boolean L1;
    public int M1;
    public final ws5 N1;
    public final e O1;
    public final os5 P1;
    public final TextView Q1;
    public AnimatorSet R1;
    public final View S1;
    public int T1;
    public boolean U1;
    public final boolean V1;
    public final boolean W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final long a2;
    public final boolean b2;
    public final long c2;
    public lf1 d2;
    public boolean e2;
    public boolean f2;
    public int g2;
    public final TLRPC.TL_chatInviteExported l1;
    public final HashMap m1;
    public final TLRPC.ChatFull n1;
    public int o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public int v1;
    public int w1;
    public int x1;
    public int y1;
    public int z1;

    public bt5(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final e eVar, final long j, boolean z, boolean z2) {
        super(context, false);
        float f;
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        boolean z3 = true;
        this.e2 = true;
        this.f2 = false;
        this.l1 = tL_chatInviteExported;
        this.m1 = hashMap;
        this.O1 = eVar;
        this.n1 = chatFull;
        this.a2 = j;
        this.V1 = z;
        this.b2 = z2;
        int i = aob.a7;
        s0(aob.v0(i, this.J0));
        L(i);
        this.g2 = this.H0;
        this.b0 = -1;
        if (hashMap == null) {
            this.m1 = new HashMap();
        }
        this.c2 = ConnectionsManager.getInstance(this.a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        ns5 ns5Var = new ns5(this, context);
        this.b = ns5Var;
        ns5Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 51);
        layoutParams.topMargin = hl.L(48.0f);
        View view = new View(context);
        this.S1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        os5 os5Var = new os5(this, context);
        this.P1 = os5Var;
        os5Var.s1();
        os5Var.setTag(14);
        getContext();
        x46 x46Var = new x46(1, false);
        os5Var.setLayoutManager(x46Var);
        ws5 ws5Var = new ws5(this);
        this.N1 = ws5Var;
        os5Var.setAdapter(ws5Var);
        os5Var.setVerticalScrollBarEnabled(false);
        os5Var.setClipToPadding(false);
        os5Var.setNestedScrollingEnabled(true);
        os5Var.setOnScrollListener(new ps5(this, x46Var));
        os5Var.setOnItemClickListener(new r69() {
            @Override
            public final void e(int r24, android.view.View r25) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.is5.e(int, android.view.View):void");
            }
        });
        TextView textView = new TextView(context);
        this.Q1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(hl.o());
        if (!z) {
            if (tL_chatInviteExported.expired) {
                textView.setText(ob6.M0(2131750840, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(ob6.M0(2131745741, null));
            } else {
                textView.setText(ob6.M0(2131748903, null));
            }
            this.W1 = true;
        } else {
            textView.setText(ob6.M0(2131748903, null));
            this.W1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
            z3 = false;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            pv3.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.b;
        if (!z3) {
            f = 0.0f;
        } else {
            f = 44.0f;
        }
        viewGroup.addView(os5Var, tre.d(-1, -1.0f, 51, 0.0f, f, 0.0f, 0.0f));
        this.b.addView(textView, tre.d(-1, z3 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        K0();
        F0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(uc7.s1(yac.t0).o1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(yac.t0).sendRequest(tL_users_getUsers, new w15(this, (byte) 4));
        }
        updateColors();
    }

    public static void H0(Context context, int i, long j, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, vnb vnbVar) {
        ?? r16;
        int i2;
        String str;
        nx0 h = uh9.h(1, vnbVar, context, false);
        nx0[] nx0VarArr = new nx0[1];
        ?? j2 = uh9.j(context, 1);
        j2.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(4.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        j2.addView(frameLayout, tre.t(-1, -2, 7, 0, 0, 0, 10));
        ?? de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(50.0f));
        rb0 rb0Var = new rb0((vnb) null);
        if (j >= 0) {
            r16 = 0;
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
        } else {
            r16 = 0;
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
        }
        frameLayout.addView(de0Var, tre.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(2131232776);
        int i3 = aob.h5;
        int v0 = aob.v0(i3, vnbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
        Drawable drawable2 = context.getResources().getDrawable(2131232775);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        yob.x(imageView, drawable, i3, vnbVar, mode);
        frameLayout.addView(imageView, tre.e(28, 28, 17));
        imageView.setTranslationX(hl.L(34.0f));
        imageView.setTranslationY(hl.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, tre.e(28, 28, 17));
        imageView2.setTranslationX(hl.L(34.0f));
        imageView2.setTranslationY(hl.L(35.0f));
        TextView textView = new TextView(context);
        qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
        uh9.q(textView, 17, null, 2131744628);
        TextView m = ik8.m(j2, textView, tre.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        int i4 = aob.B6;
        yob.X(m, i4, vnbVar);
        int i5 = tL_starsSubscriptionPricing.period;
        if (i5 == 2592000) {
            Object[] objArr = new Object[1];
            objArr[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            m.setText(nza.b1(r16, ob6.a0(null, null, 2131744640, objArr), 0.8f, null));
            i2 = i4;
        } else {
            boolean z = r16;
            String str2 = i5 == 300 ? "5min" : "min";
            Locale locale = Locale.US;
            i2 = i4;
            Object[] objArr2 = new Object[2];
            objArr2[z ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = str2;
            m.setText(nza.b1(z, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView m2 = ik8.m(j2, m, tre.t(-1, -2, 17, 20, 0, 20, 4), context);
        m2.setTextSize(1, 14.0f);
        m2.setGravity(17);
        yob.X(m2, i2, vnbVar);
        int i6 = tL_starsSubscriptionPricing.period;
        if (i6 == 2592000) {
            m2.setText(ob6.a0(null, null, 2131744715, di0.h().e((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * uc7.s1(i).k4.A3.i), "USD")));
        } else {
            m2.setText(String.format(Locale.US, "appx. %1$s per %2$s", di0.h().e((int) (uc7.s1(i).k4.A3.i * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i6 == 300 ? "5min" : "min"));
        }
        j2.addView(m2, tre.t(-1, -2, 17, 20, 0, 20, 4));
        ?? hjbVar = new hjb(context, vnbVar);
        ?? p66Var = new p66(context, vnbVar);
        p66Var.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        p66Var.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = aob.Xc;
        yob.X(p66Var, i7, vnbVar);
        yob.G(p66Var, i7, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setSingleLine(true);
        p66Var.setDisablePaddingsOffsetY(true);
        gc0 gc0Var = new gc0(24.0f, i, p66Var);
        TLRPC.User X12 = uc7.s1(i).X1(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z2 = X12 == null;
        String r = lbc.r(X12);
        gc0Var.e(X12);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) r));
        spannableStringBuilder.setSpan(gc0Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new qs5(nx0VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        p66Var.setText(spannableStringBuilder);
        if (z2) {
            str = null;
        } else {
            str = null;
            hjbVar.l(p66Var, ob6.M0(2131744716, null));
        }
        hjbVar.f(ob6.M0(2131744711, str), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(tL_chatInviteImporter.date * 1000)), ob6.D0().o0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        if (channelParticipant != null) {
            hjbVar.f(ob6.M0(channelParticipant.subscription_until_date > currentTime ? 2131744712 : 2131744714, null), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(channelParticipant.subscription_until_date * 1000)), ob6.D0().o0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        j2.addView(hjbVar, tre.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        p66 p66Var2 = new p66(context, vnbVar);
        yob.X(p66Var2, aob.z6, vnbVar);
        yob.G(p66Var2, i7, vnbVar);
        p66Var2.setTextSize(1, 14.0f);
        p66Var2.setText(hl.N2(ob6.M0(2131744583, null), -1, 0, new xf1(context, (byte) 4), null));
        p66Var2.setGravity(17);
        j2.addView(p66Var2, tre.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.i(ob6.M0(2131747558, null), false, true);
        j2.addView(c51Var, tre.o(-1, 48));
        c51Var.setOnClickListener(new g5(nx0VarArr, (byte) 2));
        h.O = j2;
        nx0VarArr[0] = h;
        h.T0 = false;
        h.J();
        nx0VarArr[0].show();
    }

    public static void I0(View view) {
        if (view instanceof mf5) {
            ((mf5) view).getTextView().setTextColor(aob.w0(null, aob.L6, false));
        } else if (view instanceof i56) {
            ((i56) view).f();
        } else if (view instanceof ilb) {
            yob.X(((ilb) view).getTextView(), aob.B6, null);
        } else if (view instanceof vac) {
            ((vac) view).i(0);
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void E0() {
        TextView textView = this.Q1;
        if (textView != null) {
            try {
                textView.setTextColor(aob.w0(null, aob.j5, false));
                textView.setLinkTextColor(aob.w0(null, aob.k5, false));
                textView.setHighlightColor(aob.w0(null, aob.l5, false));
                if (!this.W1) {
                    textView.setBackgroundColor(aob.w0(null, aob.d6, false));
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        os5 os5Var = this.P1;
        if (os5Var != null) {
            os5Var.setGlowColor(aob.w0(null, aob.A5, false));
        }
        View view = this.S1;
        if (view != null) {
            view.setBackgroundColor(aob.w0(null, aob.V5, false));
        }
    }

    public final void F0() {
        boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        final boolean z5;
        final ArrayList arrayList;
        if (!this.K1) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l1;
            int i = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.X1;
            if (i > arrayList2.size()) {
                z = true;
            } else {
                z = false;
            }
            int i2 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.Y1;
            if (i2 > arrayList3.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.Z1;
            if (z6 && tL_chatInviteExported.requested > arrayList4.size()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                z5 = false;
                z4 = false;
            } else if (z2) {
                z5 = false;
                z4 = true;
            } else if (z3) {
                z4 = false;
                z5 = true;
            } else {
                return;
            }
            if (z5) {
                arrayList = arrayList4;
            } else if (z4) {
                arrayList = arrayList3;
            } else {
                arrayList = arrayList2;
            }
            TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
            tL_messages_getChatInviteImporters.peer = uc7.s1(yac.t0).j1(-this.a2);
            tL_messages_getChatInviteImporters.requested = z5;
            tL_messages_getChatInviteImporters.subscription_expired = z4;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = uc7.s1(this.a).q1((TLRPC.User) this.m1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.K1 = true;
            ConnectionsManager.getInstance(yac.t0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final bt5 bt5Var = bt5.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z7 = z5;
                    final boolean z8 = z4;
                    final boolean z9 = z3;
                    final boolean z10 = z2;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.ms5.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void G0(boolean z) {
        Integer num;
        float f;
        View view = this.S1;
        Object tag = view.getTag();
        if (z) {
            if (tag != null) {
                num = null;
            } else {
                return;
            }
        } else if (tag == null) {
            num = 1;
        } else {
            return;
        }
        view.setTag(num);
        TextView textView = this.Q1;
        if (z) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.R1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.R1 = animatorSet2;
        Property property = View.ALPHA;
        float f2 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f));
        if (!this.W1) {
            AnimatorSet animatorSet3 = this.R1;
            if (z) {
                f2 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f2));
        }
        this.R1.setDuration(150L);
        this.R1.addListener(new gf4((byte) 8, this, z));
        this.R1.start();
    }

    public final void J0() {
        os5 os5Var = this.P1;
        int childCount = os5Var.getChildCount();
        View view = this.S1;
        TextView textView = this.Q1;
        if (childCount <= 0) {
            int paddingTop = os5Var.getPaddingTop();
            this.T1 = paddingTop;
            os5Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(this.T1);
            view.setTranslationY(this.T1);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = os5Var.getChildAt(0);
        n69 n69Var = (n69) os5Var.H(childAt);
        int top = childAt.getTop();
        if (top >= 0 && n69Var != null && n69Var.b() == 0) {
            G0(false);
            i = top;
        } else {
            G0(true);
        }
        if (this.T1 != i) {
            this.T1 = i;
            os5Var.setTopGlowOffset(i);
            if (textView != null) {
                textView.setTranslationY(this.T1);
            }
            view.setTranslationY(this.T1);
            this.b.invalidate();
        }
    }

    public final void K0() {
        int i;
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.M1 = 0;
        this.s1 = -1;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = -1;
        this.E1 = -1;
        this.F1 = -1;
        this.B1 = -1;
        this.C1 = -1;
        this.G1 = -1;
        this.H1 = -1;
        this.I1 = -1;
        this.J1 = -1;
        this.D1 = -1;
        this.o1 = -1;
        this.p1 = -1;
        this.y1 = -1;
        this.z1 = -1;
        this.A1 = -1;
        boolean z4 = true;
        if (!this.V1) {
            this.B1 = 0;
            this.M1 = 2;
            this.C1 = 1;
            i = 2;
        } else {
            i = 0;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i2 = i + 1;
            this.o1 = i;
            i += 2;
            this.M1 = i;
            this.p1 = i2;
        }
        this.q1 = i;
        this.M1 = i + 2;
        this.r1 = i + 1;
        int i3 = tL_chatInviteExported.usage;
        if (i3 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = this.X1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Z1;
        ArrayList arrayList3 = this.Y1;
        if (i3 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!arrayList.isEmpty()) {
            int i4 = this.M1;
            int i5 = i4 + 1;
            this.M1 = i5;
            this.v1 = i4;
            this.w1 = i5;
            int size2 = arrayList.size() + i5;
            this.M1 = size2;
            this.x1 = size2;
            z3 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i6 = this.M1;
            int i7 = i6 + 1;
            this.M1 = i7;
            this.y1 = i6;
            this.z1 = i7;
            int size3 = arrayList3.size() + i7;
            this.M1 = size3;
            this.A1 = size3;
            z3 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i8 = this.M1;
            int i9 = i8 + 1;
            this.M1 = i9;
            this.H1 = i8;
            this.I1 = i9;
            int size4 = arrayList2.size() + i9;
            this.M1 = size4;
            this.J1 = size4;
        } else {
            z4 = z3;
        }
        if ((z || z2) && !z4) {
            int i10 = this.M1;
            this.s1 = i10;
            this.D1 = i10 + 1;
            this.M1 = i10 + 3;
            this.E1 = i10 + 2;
        }
        this.N1.f();
    }

    @Override
    public final void p0() {
        int i;
        super.p0();
        try {
            int v0 = aob.v0(aob.a7, this.J0);
            if (this.s0 != null) {
                s0(v0);
            }
            if (this.G0 < 0 && (i = this.H0) == this.g2 && v0 != i) {
                this.H0 = v0;
                this.g2 = v0;
                y0(v0);
            }
            E0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f2 = false;
    }

    public final void updateColors() {
        TextView textView = this.Q1;
        if (textView != null) {
            textView.setTextColor(aob.w0(null, aob.j5, false));
            textView.setLinkTextColor(aob.w0(null, aob.k5, false));
            textView.setHighlightColor(aob.w0(null, aob.l5, false));
            if (!this.W1) {
                textView.setBackgroundColor(aob.w0(null, aob.d6, false));
            }
        }
        int w0 = aob.w0(null, aob.A5, false);
        os5 os5Var = this.P1;
        os5Var.setGlowColor(w0);
        this.S1.setBackgroundColor(aob.w0(null, aob.V5, false));
        s0(aob.w0(null, aob.a7, false));
        int hiddenChildCount = os5Var.getHiddenChildCount();
        for (int i = 0; i < os5Var.getChildCount(); i++) {
            I0(os5Var.getChildAt(i));
        }
        for (int i2 = 0; i2 < hiddenChildCount; i2++) {
            I0(os5Var.X(i2));
        }
        int cachedChildCount = os5Var.getCachedChildCount();
        for (int i3 = 0; i3 < cachedChildCount; i3++) {
            I0(os5Var.Q(i3));
        }
        int attachedScrapChildCount = os5Var.getAttachedScrapChildCount();
        for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
            I0(os5Var.P(i4));
        }
        this.b.invalidate();
    }
}

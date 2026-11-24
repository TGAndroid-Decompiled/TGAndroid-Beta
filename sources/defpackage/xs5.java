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
import org.telegram.ui.ActionBar.d;
public final class xs5 extends my0 {
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
    public final ss5 N1;
    public final d O1;
    public final ks5 P1;
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
    public kg1 d2;
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

    public xs5(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final d dVar, final long j, boolean z, boolean z2) {
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
        this.O1 = dVar;
        this.n1 = chatFull;
        this.a2 = j;
        this.V1 = z;
        this.b2 = z2;
        int i = cmb.Z6;
        s0(cmb.v0(i, this.J0));
        L(i);
        this.g2 = this.H0;
        this.b0 = -1;
        if (hashMap == null) {
            this.m1 = new HashMap();
        }
        this.c2 = ConnectionsManager.getInstance(this.a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        js5 js5Var = new js5(this, context);
        this.b = js5Var;
        js5Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1(), 51);
        layoutParams.topMargin = gm.L(48.0f);
        View view = new View(context);
        this.S1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        ks5 ks5Var = new ks5(this, context);
        this.P1 = ks5Var;
        ks5Var.r1();
        ks5Var.setTag(14);
        getContext();
        u46 u46Var = new u46(1, false);
        ks5Var.setLayoutManager(u46Var);
        ss5 ss5Var = new ss5(this);
        this.N1 = ss5Var;
        ks5Var.setAdapter(ss5Var);
        ks5Var.setVerticalScrollBarEnabled(false);
        ks5Var.setClipToPadding(false);
        ks5Var.setNestedScrollingEnabled(true);
        ks5Var.setOnScrollListener(new ls5(this, u46Var));
        ks5Var.setOnItemClickListener(new f59() {
            @Override
            public final void g(int r24, android.view.View r25) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fs5.g(int, android.view.View):void");
            }
        });
        TextView textView = new TextView(context);
        this.Q1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(gm.o());
        if (!z) {
            if (tL_chatInviteExported.expired) {
                textView.setText(jb6.M0(2131750812, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(jb6.M0(2131745747, null));
            } else {
                textView.setText(jb6.M0(2131748906, null));
            }
            this.W1 = true;
        } else {
            textView.setText(jb6.M0(2131748906, null));
            this.W1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
            z3 = false;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            gw3.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.b;
        if (!z3) {
            f = 0.0f;
        } else {
            f = 44.0f;
        }
        viewGroup.addView(ks5Var, qoe.d(-1, -1.0f, 51, 0.0f, f, 0.0f, 0.0f));
        this.b.addView(textView, qoe.d(-1, z3 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        J0();
        E0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(oc7.r1(z8c.t0).n1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_users_getUsers, new r15(this, (byte) 4));
        }
        updateColors();
    }

    public static void G0(Context context, int i, long j, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, ylb ylbVar) {
        ?? r16;
        int i2;
        String str;
        my0 h = hg9.h(1, ylbVar, context, false);
        my0[] my0VarArr = new my0[1];
        ?? i3 = hg9.i(context, 1);
        i3.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(4.0f));
        i3.setClipChildren(false);
        i3.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        i3.addView(frameLayout, qoe.t(-1, -2, 7, 0, 0, 0, 10));
        ?? bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(50.0f));
        pc0 pc0Var = new pc0((ylb) null);
        if (j >= 0) {
            r16 = 0;
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
        } else {
            r16 = 0;
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            pc0Var.p(L0);
            bf0Var.f(L0, pc0Var);
        }
        frameLayout.addView(bf0Var, qoe.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(2131232770);
        int i4 = cmb.g5;
        int v0 = cmb.v0(i4, ylbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
        Drawable drawable2 = context.getResources().getDrawable(2131232769);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        anb.x(imageView, drawable, i4, ylbVar, mode);
        frameLayout.addView(imageView, qoe.e(28, 28, 17));
        imageView.setTranslationX(gm.L(34.0f));
        imageView.setTranslationY(gm.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, qoe.e(28, 28, 17));
        imageView2.setTranslationX(gm.L(34.0f));
        imageView2.setTranslationY(gm.L(35.0f));
        TextView textView = new TextView(context);
        td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
        hg9.p(textView, 17, null, 2131744660);
        TextView m = wi8.m(i3, textView, qoe.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        int i5 = cmb.A6;
        anb.X(m, i5, ylbVar);
        int i6 = tL_starsSubscriptionPricing.period;
        if (i6 == 2592000) {
            Object[] objArr = new Object[1];
            objArr[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            m.setText(nxa.b1(r16, jb6.a0(null, null, 2131744672, objArr), 0.8f, null));
            i2 = i5;
        } else {
            boolean z = r16;
            String str2 = i6 == 300 ? "5min" : "min";
            Locale locale = Locale.US;
            i2 = i5;
            Object[] objArr2 = new Object[2];
            objArr2[z ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = str2;
            m.setText(nxa.b1(z, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView m2 = wi8.m(i3, m, qoe.t(-1, -2, 17, 20, 0, 20, 4), context);
        m2.setTextSize(1, 14.0f);
        m2.setGravity(17);
        anb.X(m2, i2, ylbVar);
        int i7 = tL_starsSubscriptionPricing.period;
        if (i7 == 2592000) {
            m2.setText(jb6.a0(null, null, 2131744747, cj0.h().e((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * oc7.r1(i).l4.s3.i), "USD")));
        } else {
            m2.setText(String.format(Locale.US, "appx. %1$s per %2$s", cj0.h().e((int) (oc7.r1(i).l4.s3.i * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i7 == 300 ? "5min" : "min"));
        }
        i3.addView(m2, qoe.t(-1, -2, 17, 20, 0, 20, 4));
        ?? mhbVar = new mhb(context, ylbVar);
        ?? l66Var = new l66(context, ylbVar);
        l66Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        l66Var.setEllipsize(TextUtils.TruncateAt.END);
        int i8 = cmb.Wc;
        anb.X(l66Var, i8, ylbVar);
        anb.G(l66Var, i8, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setSingleLine(true);
        l66Var.setDisablePaddingsOffsetY(true);
        ed0 ed0Var = new ed0(24.0f, i, l66Var);
        TLRPC.User W12 = oc7.r1(i).W1(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z2 = W12 == null;
        String r = m9c.r(W12);
        ed0Var.e(W12);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) r));
        spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new ms5(my0VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        l66Var.setText(spannableStringBuilder);
        if (z2) {
            str = null;
        } else {
            str = null;
            mhbVar.l(l66Var, jb6.M0(2131744748, null));
        }
        mhbVar.f(jb6.M0(2131744743, str), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(tL_chatInviteImporter.date * 1000)), jb6.D0().o0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        if (channelParticipant != null) {
            mhbVar.f(jb6.M0(channelParticipant.subscription_until_date > currentTime ? 2131744744 : 2131744746, null), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(channelParticipant.subscription_until_date * 1000)), jb6.D0().o0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        i3.addView(mhbVar, qoe.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        l66 l66Var2 = new l66(context, ylbVar);
        anb.X(l66Var2, cmb.y6, ylbVar);
        anb.G(l66Var2, i8, ylbVar);
        l66Var2.setTextSize(1, 14.0f);
        l66Var2.setText(gm.N2(jb6.M0(2131744615, null), -1, 0, new dh1(context, (byte) 4), null));
        l66Var2.setGravity(17);
        i3.addView(l66Var2, qoe.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.i(jb6.M0(2131747564, null), false, true);
        i3.addView(b61Var, qoe.o(-1, 48));
        b61Var.setOnClickListener(new f5(my0VarArr, (byte) 2));
        h.O = i3;
        my0VarArr[0] = h;
        h.T0 = false;
        h.J();
        my0VarArr[0].show();
    }

    public static void H0(View view) {
        if (view instanceof jf5) {
            ((jf5) view).getTextView().setTextColor(cmb.w0(null, cmb.K6, false));
        } else if (view instanceof f56) {
            ((f56) view).f();
        } else if (view instanceof njb) {
            anb.X(((njb) view).getTextView(), cmb.A6, null);
        } else if (view instanceof w8c) {
            ((w8c) view).i(0);
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void D0() {
        TextView textView = this.Q1;
        if (textView != null) {
            try {
                textView.setTextColor(cmb.w0(null, cmb.i5, false));
                textView.setLinkTextColor(cmb.w0(null, cmb.j5, false));
                textView.setHighlightColor(cmb.w0(null, cmb.k5, false));
                if (!this.W1) {
                    textView.setBackgroundColor(cmb.w0(null, cmb.c6, false));
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        ks5 ks5Var = this.P1;
        if (ks5Var != null) {
            ks5Var.setGlowColor(cmb.w0(null, cmb.z5, false));
        }
        View view = this.S1;
        if (view != null) {
            view.setBackgroundColor(cmb.w0(null, cmb.U5, false));
        }
    }

    public final void E0() {
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
            tL_messages_getChatInviteImporters.peer = oc7.r1(z8c.t0).i1(-this.a2);
            tL_messages_getChatInviteImporters.requested = z5;
            tL_messages_getChatInviteImporters.subscription_expired = z4;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = oc7.r1(this.a).p1((TLRPC.User) this.m1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.K1 = true;
            ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final xs5 xs5Var = xs5.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z7 = z5;
                    final boolean z8 = z4;
                    final boolean z9 = z3;
                    final boolean z10 = z2;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.is5.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void F0(boolean z) {
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
        this.R1.addListener(new jf4((byte) 8, this, z));
        this.R1.start();
    }

    public final void I0() {
        ks5 ks5Var = this.P1;
        int childCount = ks5Var.getChildCount();
        View view = this.S1;
        TextView textView = this.Q1;
        if (childCount <= 0) {
            int paddingTop = ks5Var.getPaddingTop();
            this.T1 = paddingTop;
            ks5Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(this.T1);
            view.setTranslationY(this.T1);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = ks5Var.getChildAt(0);
        b59 b59Var = (b59) ks5Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && b59Var != null && b59Var.b() == 0) {
            F0(false);
            i = top;
        } else {
            F0(true);
        }
        if (this.T1 != i) {
            this.T1 = i;
            ks5Var.setTopGlowOffset(i);
            if (textView != null) {
                textView.setTranslationY(this.T1);
            }
            view.setTranslationY(this.T1);
            this.b.invalidate();
        }
    }

    public final void J0() {
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
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (this.s0 != null) {
                s0(v0);
            }
            if (this.G0 < 0 && (i = this.H0) == this.g2 && v0 != i) {
                this.H0 = v0;
                this.g2 = v0;
                x0(v0);
            }
            D0();
        } catch (Exception e) {
            fc4.g(e, true);
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
            textView.setTextColor(cmb.w0(null, cmb.i5, false));
            textView.setLinkTextColor(cmb.w0(null, cmb.j5, false));
            textView.setHighlightColor(cmb.w0(null, cmb.k5, false));
            if (!this.W1) {
                textView.setBackgroundColor(cmb.w0(null, cmb.c6, false));
            }
        }
        int w0 = cmb.w0(null, cmb.z5, false);
        ks5 ks5Var = this.P1;
        ks5Var.setGlowColor(w0);
        this.S1.setBackgroundColor(cmb.w0(null, cmb.U5, false));
        s0(cmb.w0(null, cmb.Z6, false));
        int hiddenChildCount = ks5Var.getHiddenChildCount();
        for (int i = 0; i < ks5Var.getChildCount(); i++) {
            H0(ks5Var.getChildAt(i));
        }
        for (int i2 = 0; i2 < hiddenChildCount; i2++) {
            H0(ks5Var.W(i2));
        }
        int cachedChildCount = ks5Var.getCachedChildCount();
        for (int i3 = 0; i3 < cachedChildCount; i3++) {
            H0(ks5Var.P(i3));
        }
        int attachedScrapChildCount = ks5Var.getAttachedScrapChildCount();
        for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
            H0(ks5Var.O(i4));
        }
        this.b.invalidate();
    }
}

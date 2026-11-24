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
public final class zq5 extends fx0 {
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
    public final uq5 N1;
    public final d O1;
    public final mq5 P1;
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
    public cf1 d2;
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

    public zq5(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final d dVar, final long j, boolean z, boolean z2) {
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
        int i = bkb.Z6;
        s0(bkb.v0(i, this.J0));
        M(i);
        this.g2 = this.H0;
        this.b0 = -1;
        if (hashMap == null) {
            this.m1 = new HashMap();
        }
        this.c2 = ConnectionsManager.getInstance(this.a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        lq5 lq5Var = new lq5(this, context);
        this.b = lq5Var;
        lq5Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1(), 51);
        layoutParams.topMargin = gl.L(48.0f);
        View view = new View(context);
        this.S1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        mq5 mq5Var = new mq5(this, context);
        this.P1 = mq5Var;
        mq5Var.r1();
        mq5Var.setTag(14);
        getContext();
        t26 t26Var = new t26(1, false);
        mq5Var.setLayoutManager(t26Var);
        uq5 uq5Var = new uq5(this);
        this.N1 = uq5Var;
        mq5Var.setAdapter(uq5Var);
        mq5Var.setVerticalScrollBarEnabled(false);
        mq5Var.setClipToPadding(false);
        mq5Var.setNestedScrollingEnabled(true);
        mq5Var.setOnScrollListener(new nq5(this, t26Var));
        mq5Var.setOnItemClickListener(new c39() {
            @Override
            public final void d(int r24, android.view.View r25) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hq5.d(int, android.view.View):void");
            }
        });
        TextView textView = new TextView(context);
        this.Q1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(gl.o());
        if (!z) {
            if (tL_chatInviteExported.expired) {
                textView.setText(k96.M0(2131750863, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(k96.M0(2131745821, null));
            } else {
                textView.setText(k96.M0(2131748957, null));
            }
            this.W1 = true;
        } else {
            textView.setText(k96.M0(2131748957, null));
            this.W1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
            z3 = false;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            vu3.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.b;
        if (!z3) {
            f = 0.0f;
        } else {
            f = 44.0f;
        }
        viewGroup.addView(mq5Var, nme.d(-1, -1.0f, 51, 0.0f, f, 0.0f, 0.0f));
        this.b.addView(textView, nme.d(-1, z3 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        J0();
        E0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(na7.q1(y6c.t0).m1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_users_getUsers, new n35(this, (byte) 3));
        }
        updateColors();
    }

    public static void G0(Context context, int i, long j, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, wjb wjbVar) {
        ?? r16;
        Object obj;
        int i2;
        Object obj2;
        boolean z;
        String str;
        int i3;
        fx0 h = de9.h(1, wjbVar, context, false);
        fx0[] fx0VarArr = new fx0[1];
        ?? j2 = de9.j(context, 1);
        j2.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(4.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        j2.addView(frameLayout, nme.t(-1, -2, 7, 0, 0, 0, 10));
        ?? be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(50.0f));
        pb0 pb0Var = new pb0((wjb) null);
        if (j >= 0) {
            r16 = 0;
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
        } else {
            r16 = 0;
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
        }
        frameLayout.addView(be0Var, nme.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(2131232758);
        int i4 = bkb.g5;
        int v0 = bkb.v0(i4, wjbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
        Drawable drawable2 = context.getResources().getDrawable(2131232757);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        zkb.x(imageView, drawable, i4, wjbVar, mode);
        frameLayout.addView(imageView, nme.e(28, 28, 17));
        imageView.setTranslationX(gl.L(34.0f));
        imageView.setTranslationY(gl.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, nme.e(28, 28, 17));
        imageView2.setTranslationX(gl.L(34.0f));
        imageView2.setTranslationY(gl.L(35.0f));
        TextView textView = new TextView(context);
        tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
        de9.q(textView, 17, null, 2131744734);
        TextView m = ug8.m(j2, textView, nme.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        int i5 = bkb.A6;
        zkb.X(m, i5, wjbVar);
        int i6 = tL_starsSubscriptionPricing.period;
        if (i6 == 2592000) {
            Object[] objArr = new Object[1];
            objArr[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            m.setText(jva.a1(r16, k96.a0(null, null, 2131744746, objArr), 0.8f, null));
            i2 = i5;
        } else {
            boolean z2 = r16;
            if (i6 != 300) {
                obj = "min";
            } else {
                obj = "5min";
            }
            Locale locale = Locale.US;
            i2 = i5;
            Object[] objArr2 = new Object[2];
            objArr2[z2 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj;
            m.setText(jva.a1(z2, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView m2 = ug8.m(j2, m, nme.t(-1, -2, 17, 20, 0, 20, 4), context);
        m2.setTextSize(1, 14.0f);
        m2.setGravity(17);
        zkb.X(m2, i2, wjbVar);
        int i7 = tL_starsSubscriptionPricing.period;
        if (i7 == 2592000) {
            m2.setText(k96.a0(null, null, 2131744821, ci0.h().e((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * na7.q1(i).k4.s3.i), "USD")));
        } else {
            if (i7 != 300) {
                obj2 = "min";
            } else {
                obj2 = "5min";
            }
            m2.setText(String.format(Locale.US, "appx. %1$s per %2$s", ci0.h().e((int) (na7.q1(i).k4.s3.i * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj2));
        }
        j2.addView(m2, nme.t(-1, -2, 17, 20, 0, 20, 4));
        ?? mfbVar = new mfb(context, wjbVar);
        ?? l46Var = new l46(context, wjbVar);
        l46Var.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        l46Var.setEllipsize(TextUtils.TruncateAt.END);
        int i8 = bkb.Wc;
        zkb.X(l46Var, i8, wjbVar);
        zkb.G(l46Var, i8, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setSingleLine(true);
        l46Var.setDisablePaddingsOffsetY(true);
        ec0 ec0Var = new ec0(24.0f, i, l46Var);
        TLRPC.User V12 = na7.q1(i).V1(Long.valueOf(tL_chatInviteImporter.user_id));
        if (V12 == null) {
            z = true;
        } else {
            z = false;
        }
        String r = l7c.r(V12);
        ec0Var.e(V12);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) r));
        spannableStringBuilder.setSpan(ec0Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new oq5(fx0VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        l46Var.setText(spannableStringBuilder);
        if (!z) {
            str = null;
            mfbVar.l(l46Var, k96.M0(2131744822, null));
        } else {
            str = null;
        }
        mfbVar.f(k96.M0(2131744817, str), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(tL_chatInviteImporter.date * 1000)), k96.D0().o0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i3 = 2131744818;
            } else {
                i3 = 2131744820;
            }
            mfbVar.f(k96.M0(i3, null), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(channelParticipant.subscription_until_date * 1000)), k96.D0().o0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        j2.addView(mfbVar, nme.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        l46 l46Var2 = new l46(context, wjbVar);
        zkb.X(l46Var2, bkb.y6, wjbVar);
        zkb.G(l46Var2, i8, wjbVar);
        l46Var2.setTextSize(1, 14.0f);
        l46Var2.setText(gl.N2(k96.M0(2131744689, null), -1, 0, new vf1(context, (byte) 4), null));
        l46Var2.setGravity(17);
        j2.addView(l46Var2, nme.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.i(k96.M0(2131747638, null), false, true);
        j2.addView(u41Var, nme.o(-1, 48));
        u41Var.setOnClickListener(new f5(fx0VarArr, (byte) 2));
        h.O = j2;
        fx0VarArr[0] = h;
        h.T0 = false;
        h.K();
        fx0VarArr[0].show();
    }

    public static void H0(View view) {
        if (view instanceof ld5) {
            ((ld5) view).getTextView().setTextColor(bkb.w0(null, bkb.K6, false));
        } else if (view instanceof f36) {
            ((f36) view).f();
        } else if (view instanceof mhb) {
            zkb.X(((mhb) view).getTextView(), bkb.A6, null);
        } else if (view instanceof v6c) {
            ((v6c) view).i(0);
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D0() {
        TextView textView = this.Q1;
        if (textView != null) {
            try {
                textView.setTextColor(bkb.w0(null, bkb.i5, false));
                textView.setLinkTextColor(bkb.w0(null, bkb.j5, false));
                textView.setHighlightColor(bkb.w0(null, bkb.k5, false));
                if (!this.W1) {
                    textView.setBackgroundColor(bkb.w0(null, bkb.c6, false));
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        mq5 mq5Var = this.P1;
        if (mq5Var != null) {
            mq5Var.setGlowColor(bkb.w0(null, bkb.z5, false));
        }
        View view = this.S1;
        if (view != null) {
            view.setBackgroundColor(bkb.w0(null, bkb.U5, false));
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
            tL_messages_getChatInviteImporters.peer = na7.q1(y6c.t0).h1(-this.a2);
            tL_messages_getChatInviteImporters.requested = z5;
            tL_messages_getChatInviteImporters.subscription_expired = z4;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = na7.q1(this.a).o1((TLRPC.User) this.m1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.K1 = true;
            ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final zq5 zq5Var = zq5.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z7 = z5;
                    final boolean z8 = z4;
                    final boolean z9 = z3;
                    final boolean z10 = z2;
                    gl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.run():void");
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
        this.R1.addListener(new id4((byte) 8, this, z));
        this.R1.start();
    }

    public final void I0() {
        mq5 mq5Var = this.P1;
        int childCount = mq5Var.getChildCount();
        View view = this.S1;
        TextView textView = this.Q1;
        if (childCount <= 0) {
            int paddingTop = mq5Var.getPaddingTop();
            this.T1 = paddingTop;
            mq5Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(this.T1);
            view.setTranslationY(this.T1);
            this.b.invalidate();
            return;
        }
        int i = 0;
        View childAt = mq5Var.getChildAt(0);
        y29 y29Var = (y29) mq5Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && y29Var != null && y29Var.b() == 0) {
            F0(false);
            i = top;
        } else {
            F0(true);
        }
        if (this.T1 != i) {
            this.T1 = i;
            mq5Var.setTopGlowOffset(i);
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
            int v0 = bkb.v0(bkb.Z6, this.J0);
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
            fa4.g(e, true);
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
            textView.setTextColor(bkb.w0(null, bkb.i5, false));
            textView.setLinkTextColor(bkb.w0(null, bkb.j5, false));
            textView.setHighlightColor(bkb.w0(null, bkb.k5, false));
            if (!this.W1) {
                textView.setBackgroundColor(bkb.w0(null, bkb.c6, false));
            }
        }
        int w0 = bkb.w0(null, bkb.z5, false);
        mq5 mq5Var = this.P1;
        mq5Var.setGlowColor(w0);
        this.S1.setBackgroundColor(bkb.w0(null, bkb.U5, false));
        s0(bkb.w0(null, bkb.Z6, false));
        int hiddenChildCount = mq5Var.getHiddenChildCount();
        for (int i = 0; i < mq5Var.getChildCount(); i++) {
            H0(mq5Var.getChildAt(i));
        }
        for (int i2 = 0; i2 < hiddenChildCount; i2++) {
            H0(mq5Var.W(i2));
        }
        int cachedChildCount = mq5Var.getCachedChildCount();
        for (int i3 = 0; i3 < cachedChildCount; i3++) {
            H0(mq5Var.P(i3));
        }
        int attachedScrapChildCount = mq5Var.getAttachedScrapChildCount();
        for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
            H0(mq5Var.O(i4));
        }
        this.b.invalidate();
    }
}

package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class sxb extends d implements jm7, f02, aj6 {
    public static final HashSet s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public byte E;
    public c42 E0;
    public boolean F;
    public hxb F0;
    public uwb G;
    public FrameLayout G0;
    public boolean H;
    public y91 H0;
    public boolean I;
    public qd2 I0;
    public boolean J;
    public fxb J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public w49 L0;
    public y7c M;
    public nk3 M0;
    public boolean N;
    public nk3 N0;
    public dxb O;
    public boolean O0;
    public wwb P;
    public final po P0;
    public rxb Q;
    public xd9 Q0;
    public a8 R;
    public long R0;
    public a8 S;
    public k02 S0;
    public a8 T;
    public float T0;
    public a8 U;
    public boolean U0;
    public a8 V;
    public qk3 V0;
    public boolean W;
    public final boolean W0;
    public float X;
    public ImageView X0;
    public TL_stories.TL_premium_boostsStatus Y;
    public float Y0;
    public long Z;
    public ValueAnimator Z0;
    public final long a;
    public boolean a0;
    public boolean a1;
    public final ArrayList b;
    public final HashSet b0;
    public vgc b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public zwb d;
    public NumberTextView d0;
    public pxb d1;
    public bdb e;
    public r7 e0;
    public boolean e1;
    public z82 f;
    public r7 f0;
    public int f1;
    public r7 g0;
    public int g1;
    public wp4 h;
    public r7 h0;
    public int h1;
    public r7 i0;
    public final mr3 i1;
    public r7 j0;
    public final nz4 j1;
    public a8 k0;
    public final nz4 k1;
    public a8 l0;
    public final kz4 l1;
    public a8 m0;
    public final km0 m1;
    public uvb n;
    public r7 n0;
    public nfc n1;
    public RadialProgressView o0;
    public final ArrayList o1;
    public ct8 p0;
    public final RectF p1;
    public r7 q0;
    public final RectF q1;
    public final ixb r;
    public r7 r0;
    public int r1;
    public final qwb s;
    public nxb s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public txb w;
    public final boolean w0;
    public pi3 x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public sxb(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        this.r = new ixb(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new po(new int[]{nm7.u5});
        this.T0 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.o1 = arrayList;
        RectF rectF = new RectF();
        this.p1 = rectF;
        RectF rectF2 = new RectF();
        this.q1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j = this.arguments.getLong("chat_id", 0L);
        this.a = j;
        this.u0 = this.arguments.getBoolean("for_select", false);
        this.v0 = this.arguments.getBoolean("forward_to", false);
        this.y0 = this.arguments.getBoolean("bot_share_to", false);
        this.w0 = this.arguments.getBoolean("quote", false);
        this.x0 = this.arguments.getBoolean("reply_to", false);
        this.z0 = this.arguments.getString("voicechat", null);
        this.A0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().g4;
        this.W0 = !kt6.w("topics_end_reached_", j, getUserConfig().j(), false);
        kz4 kz4Var = new kz4();
        this.l1 = kz4Var;
        kz4Var.a(getThemedColor(cmb.c6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.i1 = new mr3(false);
            this.j1 = new nz4(null);
            nz4 nz4Var = new nz4(null);
            this.k1 = nz4Var;
            km0 km0Var = new km0(nz4Var, nz4Var, nz4Var);
            this.m1 = km0Var;
            km0Var.k = true;
            return;
        }
        this.i1 = null;
        this.j1 = null;
        this.k1 = null;
        this.m1 = new km0(kz4Var, kz4Var, kz4Var);
    }

    public static d F0(oc7 oc7Var, cf7 cf7Var, Bundle bundle) {
        long j = bundle.getLong("chat_id");
        if (j != 0) {
            TLRPC.Dialog R0 = oc7Var.R0(-j);
            if (R0 != null && R0.view_forum_as_messages) {
                return new yv1(bundle);
            }
            TLRPC.ChatFull M0 = oc7Var.M0(j);
            if (M0 == null) {
                M0 = cf7Var.C0(j, true, new CountDownLatch(1), false, false, 0);
            }
            if (M0 != null && M0.view_forum_as_messages) {
                return new yv1(bundle);
            }
        }
        return new sxb(bundle);
    }

    public static d G0(LaunchActivity launchActivity, Bundle bundle) {
        return F0(oc7.r1(launchActivity.P), cf7.Y(launchActivity.P), bundle);
    }

    public static void M0(defpackage.yv1 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxb.M0(yv1):void");
    }

    public static int w0(sxb sxbVar) {
        return sxbVar.currentAccount;
    }

    public final void A0(boolean z) {
        String str;
        oc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        TLRPC.ChatFull M0 = getMessagesController().M0(j);
        qd2 qd2Var = this.I0;
        if (qd2Var != null && ((str = this.z0) != null || this.A0)) {
            sic.l(L0, str, false, Boolean.valueOf(!qd2Var.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else if (this.z0 != null && z && M0 != null && M0.call == null && this.fragmentView != null && getParentActivity() != null) {
            ts2.u(null, 2131748670, c41.b0(this), 2131624080, 36);
            this.z0 = null;
        }
    }

    @Override
    public final ela B() {
        return this.d;
    }

    public final void B0() {
        boolean z;
        qwb qwbVar = this.s;
        vh6 vh6Var = qwbVar.a;
        LongSparseIntArray longSparseIntArray = qwbVar.c;
        long j = this.a;
        if (longSparseIntArray.get(j, 0) == 1 && (vh6Var.f(j) == null || ((ArrayList) vh6Var.f(j)).isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        this.K0 = z;
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((jxb) arrayList.get(0)).c != null && ((jxb) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        dxb dxbVar = this.O;
        if (dxbVar != null) {
            dxbVar.L0(dxbVar.w1());
        }
        U0(true);
    }

    public final void C0() {
        int i;
        float f;
        float f2;
        nk3 nk3Var = this.N0;
        float f3 = 0.0f;
        if (nk3Var != null) {
            int L = gm.L(14.0f);
            qk3 qk3Var = nk3Var.L1;
            if (qk3Var != null) {
                f = qk3Var.c(L);
            } else {
                f = 0.0f;
            }
            float f4 = f + 0.0f;
            qk3 qk3Var2 = this.V0;
            if (qk3Var2 != null) {
                float L2 = gm.L(7.0f);
                qk3 qk3Var3 = this.N0.L1;
                if (qk3Var3 != null) {
                    f2 = qk3Var3.getMetadata().c.a;
                } else {
                    f2 = 0.0f;
                }
                qk3Var2.setTranslationY(f4 - (f2 * L2));
                qk3 qk3Var4 = this.V0;
                int L3 = gm.L(14.0f);
                int L4 = gm.L(7.0f);
                qk3 qk3Var5 = this.N0.L1;
                if (qk3Var5 != null) {
                    f3 = qk3Var5.getMetadata().c.a;
                }
                f3 = qk3Var4.c(gm.U1(f3, L3, L4)) + f4;
            } else {
                f3 = f4;
            }
        } else {
            qk3 qk3Var6 = this.V0;
            if (qk3Var6 != null) {
                f3 = 0.0f + qk3Var6.c(gm.L(14.0f));
            }
        }
        int i2 = this.h1 + this.f1;
        if (this.W) {
            i = gm.L(51.0f);
        } else {
            i = 0;
        }
        this.O.setPadding(0, (int) f3, 0, i2 + i);
    }

    public final void D0() {
        this.b0.clear();
        this.actionBar.x();
        gm.V3(this.O);
        V0();
    }

    public final void E0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = jb6.J0(hashSet.size(), "DeleteTopics");
        he heVar = alertDialog$Builder.a;
        heVar.S = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            heVar.U = jb6.a0(null, null, 2131751435, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            heVar.U = jb6.M0(2131751434, null);
        }
        alertDialog$Builder.j(jb6.M0(2131751535, null), new lu(this, hashSet, arrayList, runnable, (byte) 24));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 2));
        heVar.show();
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, getResourceProvider());
        }
    }

    public final void H0(boolean z, boolean z2) {
        boolean z3 = true;
        this.h.e(!z, (this.fragmentBeginToShow && z2) ? false : false);
    }

    public final void I0(View view) {
        long j;
        if (getParentLayout() != null && !((ActionBarLayout) getParentLayout()).w() && (view instanceof pxb)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((pxb) view).O;
            oc7 messagesController = getMessagesController();
            long j2 = this.a;
            long j3 = -j2;
            boolean y2 = messagesController.y2(j3);
            if (tL_forumTopic == null) {
                j = 0;
            } else if (y2) {
                j = pg3.n(tL_forumTopic.from_id);
            } else {
                j = tL_forumTopic.id;
            }
            if (this.u0) {
                txb txbVar = this.w;
                if (txbVar != null) {
                    wxb wxbVar = txbVar.a;
                    Bundle bundle = new Bundle();
                    zxb zxbVar = wxbVar.a;
                    bundle.putLong("dialog_id", zxbVar.c);
                    bundle.putLong("topic_id", tL_forumTopic.id);
                    bundle.putBoolean("exception", true);
                    st8 st8Var = new st8(bundle, null);
                    st8Var.s = new uxb(wxbVar, tL_forumTopic, (byte) 0);
                    zxbVar.presentFragment(st8Var);
                }
                nk3 nk3Var = this.M0;
                if (nk3Var != null) {
                    nk3Var.k3(j3, j, true, this);
                }
            } else if (this.b0.size() > 0) {
                R0(view);
            } else {
                if (this.inPreviewMode && gm.O1()) {
                    for (d dVar : getParentLayout().getFragmentStack()) {
                        if (dVar instanceof nk3) {
                            nk3 nk3Var2 = (nk3) dVar;
                            if (nk3Var2.J3()) {
                                bf7 bf7Var = nk3Var2.r2;
                                if (bf7Var.a == j3 && bf7Var.b == j) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    this.R0 = j;
                    Z0(false, false);
                }
                no4.n(this, j2, tL_forumTopic, 0);
            }
        }
    }

    public final boolean J0(View view, float f) {
        if (this.u0 || getParentLayout() == null || ((ActionBarLayout) getParentLayout()).w()) {
            return false;
        }
        if (!this.actionBar.y() && !gm.O1() && (view instanceof pxb)) {
            pxb pxbVar = (pxb) view;
            if (pxbVar.Z(f)) {
                Q0(pxbVar);
                this.O.J0(true);
                this.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public final boolean K() {
        return false;
    }

    public final boolean K0(TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
        edit.putLong("dialog_join_requested_time_" + (-this.a), System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean V = sd2.V(f());
        int i = ew5.t1;
        ew5.E0(parentActivity, this, c41.b0(this), V);
        S0(true);
        return false;
    }

    public final void L0(boolean z) {
        int i;
        TLRPC.Chat f;
        TLRPC.ChatPhoto chatPhoto;
        if (z && (f = f()) != null && ((chatPhoto = f.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.u3(this.K);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().C() && z) {
            i = 2;
        } else {
            i = 1;
        }
        profileActivity.B3(i);
        presentFragment(profileActivity);
    }

    @Override
    public final long M() {
        return 0L;
    }

    public final void N0(int i) {
        int i2;
        int i3;
        if (this.N != i) {
            this.N = i;
            y7c y7cVar = this.M;
            if (i == 0) {
                i2 = cmb.rf;
            } else {
                i2 = cmb.p7;
            }
            y7cVar.setTextColorKey(i2);
            ImageView imageView = this.X0;
            if (i == 1) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            S0(false);
        }
    }

    public final void O0(boolean z) {
        if (gda.o() == 0) {
            return;
        }
        zwb zwbVar = this.d;
        if (zwbVar != null) {
            if (z) {
                zwbVar.setLayerType(2, null);
                zwbVar.setClipChildren(false);
                zwbVar.setClipToPadding(false);
            } else {
                zwbVar.setLayerType(0, null);
                zwbVar.setClipChildren(true);
                zwbVar.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f) {
        if (gda.o() != 0) {
            this.T0 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            dxb dxbVar = this.O;
            if (dxbVar != null) {
                float B = kt6.B(1.0f, this.T0, 0.05f, 1.0f);
                dxbVar.setPivotX(0.0f);
                dxbVar.setPivotY(0.0f);
                dxbVar.setScaleX(B);
                dxbVar.setScaleY(B);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(B);
                this.actionBar.setScaleY(B);
            }
        }
    }

    public final void Q0(hg3 hg3Var) {
        boolean z;
        long j;
        try {
            hg3Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r3 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232581, 1, getResourceProvider(), getParentActivity())};
        final TLRPC.TL_forumTopic tL_forumTopic = hg3Var.O;
        jd2 jd2Var = new jd2(getParentActivity(), this.currentAccount, r3[0].getSwipeBack(), false, new ywb(this, tL_forumTopic), getResourceProvider());
        int b = r3[0].b(jd2Var.f);
        jd2Var.o = true;
        long j2 = this.a;
        long j3 = -j2;
        jd2Var.e(j3, tL_forumTopic.id, null);
        if (sd2.y(15, f())) {
            a8 a8Var = new a8(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                a8Var.j(jb6.M0(2131751389, null), 2131232419, null);
            } else {
                a8Var.j(jb6.M0(2131751390, null), 2131232299, null);
            }
            a8Var.setMinimumWidth(160);
            z = false;
            a8Var.setOnClickListener(new View.OnClickListener(this) {
                public final sxb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    sxb sxbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            sxb sxbVar2 = this.b;
                            sxbVar2.D0 = true;
                            sxbVar2.O0 = true;
                            sxbVar2.s.t(sxbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, sxbVar2);
                            sxbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            sxbVar.O0 = true;
                            sxbVar.s.z(tL_forumTopic2.id, sxbVar.a, !tL_forumTopic2.closed);
                            sxbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            sxbVar.E0(hashSet, new lo4(sxbVar, (byte) 4));
                            return;
                    }
                }
            });
            r3[0].addView(a8Var);
        } else {
            z = false;
        }
        a8 a8Var2 = new a8(getParentActivity(), z, z);
        if (getMessagesController().o2(j3, tL_forumTopic.id, null)) {
            a8Var2.j(jb6.M0(2131743536, null), 2131232262, null);
        } else {
            a8Var2.j(jb6.M0(2131748071, null), 2131232418, null);
        }
        a8Var2.setMinimumWidth(160);
        a8Var2.setOnClickListener(new ph(this, tL_forumTopic, (Serializable) r3, b, (byte) 7));
        boolean z2 = false;
        r3[0].addView(a8Var2);
        if (sd2.i(this.currentAccount, f(), tL_forumTopic)) {
            a8 a8Var3 = new a8(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                a8Var3.j(jb6.M0(2131745817, null), 2131232412, null);
            } else {
                a8Var3.j(jb6.M0(2131751976, null), 2131232410, null);
            }
            a8Var3.setMinimumWidth(160);
            a8Var3.setOnClickListener(new View.OnClickListener(this) {
                public final sxb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    sxb sxbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            sxb sxbVar2 = this.b;
                            sxbVar2.D0 = true;
                            sxbVar2.O0 = true;
                            sxbVar2.s.t(sxbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, sxbVar2);
                            sxbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            sxbVar.O0 = true;
                            sxbVar.s.z(tL_forumTopic2.id, sxbVar.a, !tL_forumTopic2.closed);
                            sxbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            sxbVar.E0(hashSet, new lo4(sxbVar, (byte) 4));
                            return;
                    }
                }
            });
            z2 = false;
            r3[0].addView(a8Var3);
        }
        if (sd2.e(this.currentAccount, f(), tL_forumTopic)) {
            a8 a8Var4 = new a8(getParentActivity(), z2, true);
            a8Var4.j(jb6.J0(1, "DeleteTopics"), 2131232114, null);
            a8Var4.c(cmb.p7, cmb.o7);
            a8Var4.setMinimumWidth(160);
            a8Var4.setOnClickListener(new View.OnClickListener(this) {
                public final sxb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    sxb sxbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            sxb sxbVar2 = this.b;
                            sxbVar2.D0 = true;
                            sxbVar2.O0 = true;
                            sxbVar2.s.t(sxbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, sxbVar2);
                            sxbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            sxbVar.O0 = true;
                            sxbVar.s.z(tL_forumTopic2.id, sxbVar.a, !tL_forumTopic2.closed);
                            sxbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            sxbVar.E0(hashSet, new lo4(sxbVar, (byte) 4));
                            return;
                    }
                }
            });
            r3[0].addView(a8Var4);
        }
        boolean y2 = getMessagesController().y2(j3);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, qoe.c(-1.0f, -1));
        }
        yv1 yv1Var = new yv1(kt6.k(j2, "chat_id"));
        TLRPC.TL_forumTopic tL_forumTopic2 = hg3Var.O;
        if (y2) {
            j = pg3.n(tL_forumTopic2.from_id);
        } else {
            j = tL_forumTopic2.id;
        }
        no4.a(yv1Var, bf7.a(j3, j));
        presentFragmentAsPreviewWithMenu(yv1Var, r3[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxb.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxb.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(cmb.rf));
        this.h.updateColors();
        ct8 ct8Var = this.p0;
        int i = cmb.c6;
        ct8Var.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(getThemedColor(i));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(cmb.r8));
        }
        this.s0.setBackgroundColor(getThemedColor(i));
    }

    public final void U0(boolean z) {
        boolean z2;
        if (this.R == null) {
            return;
        }
        oc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        int i = 0;
        if (!sd2.r0(getMessagesController().L0(Long.valueOf(j))) && sd2.w(15, L0) && !this.t0 && !this.u0 && !this.K0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.L = z2;
        a8 a8Var = this.R;
        if (!z2) {
            i = 8;
        }
        a8Var.setVisibility(i);
        H0(!this.L, z);
    }

    public final void V0() {
        boolean z;
        if (sd2.y(15, f()) && !this.b0.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (this.c0 != z) {
            this.c0 = z;
            ixb ixbVar = this.r;
            ixbVar.l(0, ixbVar.b());
        }
    }

    public final void W0(float f) {
        this.X = f;
        X0();
        this.c1 = true;
        float f2 = 1.0f - f;
        this.f.getTitleTextView().setAlpha(f2);
        this.f.getSubtitleTextView().setAlpha(f2);
        vgc vgcVar = this.b1;
        if (vgcVar != null) {
            vgcVar.setTranslationY((-gm.L(16.0f)) * f2);
            this.b1.setAlpha(f);
        }
        this.s0.setTranslationY((-gm.L(16.0f)) * f2);
        this.s0.setAlpha(f);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f2);
        if (this.a1) {
            float A = td4.A(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(A);
            this.O.setScaleY(A);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z) {
        return false;
    }

    public final void X0() {
        int themedColor = getThemedColor(cmb.u8);
        a aVar = this.actionBar;
        int i = cmb.x8;
        aVar.H(on2.f(this.X, themedColor, getThemedColor(i)), false);
        this.actionBar.H(on2.f(this.X, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(on2.f(this.X, getThemedColor(cmb.s8), getThemedColor(cmb.y8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(on2.f(this.X, getThemedColor(cmb.r8), getThemedColor(cmb.c6)));
        }
    }

    public final void Y0() {
        c42 c42Var = this.E0;
        if (c42Var != null && c42Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            pn2 pn2Var = new pn2(2131231248, 0);
            pn2Var.c(gm.L(16.0f));
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 0);
            if (sd2.y(15, f())) {
                this.E0.e.setText(gm.G2(gm.S2(jb6.M0(2131747870, null)), spannableStringBuilder, "%s"));
                return;
            }
            String M0 = jb6.M0(2131750407, null);
            TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.a, 1L);
            if (f != null) {
                M0 = f.title;
            }
            this.E0.e.setText(gm.S2(jb6.a0("NoTopicsDescriptionUser", null, 2131747869, M0)));
        }
    }

    public final void Z0(boolean z, boolean z2) {
        uwb uwbVar;
        fxb fxbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z && this.O0) {
            z = true;
        }
        this.O0 = false;
        qwb qwbVar = this.s;
        long j = this.a;
        ArrayList l = qwbVar.l(j);
        if (l != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            fxb fxbVar2 = null;
            if (m9c.w(oc7.r1(this.currentAccount).W1(Long.valueOf(-j))) && this.v0) {
                arrayList.add(new jxb(3, null));
            }
            for (int i = 0; i < l.size(); i++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList.add(new jxb(0, (TLRPC.TL_forumTopic) l.get(i)));
                }
            }
            if (!arrayList.isEmpty() && !qwbVar.e(j) && this.W0) {
                arrayList.add(new jxb(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.L0.b(size + 4);
                z = false;
            }
            this.y = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                jxb jxbVar = (jxb) arrayList.get(i2);
                if (jxbVar != null && (tL_forumTopic = jxbVar.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            dxb dxbVar = this.O;
            if (dxbVar != null) {
                d69 itemAnimator = dxbVar.getItemAnimator();
                if (z) {
                    fxbVar = this.J0;
                } else {
                    fxbVar = null;
                }
                if (itemAnimator != fxbVar) {
                    dxb dxbVar2 = this.O;
                    if (z) {
                        fxbVar2 = this.J0;
                    }
                    dxbVar2.setItemAnimator(fxbVar2);
                }
            }
            ixb ixbVar = this.r;
            if (ixbVar != null) {
                ixbVar.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (uwbVar = this.G) != null) {
                uwbVar.g1(0, 0);
                this.D0 = false;
            }
        }
        B0();
        Y0();
    }

    @Override
    public final long a() {
        return -this.a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        byte b;
        boolean z4;
        SpannableStringBuilder spannableStringBuilder;
        float f;
        float f2;
        tk5 tk5Var;
        tk5 tk5Var2;
        nk3 nk3Var = this.N0;
        if (nk3Var != null && nk3Var.X) {
            i = gm.L(72.0f);
        } else {
            i = 0;
        }
        this.f1 = i;
        nk3 nk3Var2 = this.N0;
        if (nk3Var2 != null && nk3Var2.X) {
            i2 = gm.L(64.0f);
        } else {
            i2 = 0;
        }
        this.g1 = i2;
        zwb zwbVar = new zwb(this, context);
        this.d = zwbVar;
        this.fragmentView = zwbVar;
        anb.h(cmb.c6, getResourceProvider(), zwbVar);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        a aVar = this.actionBar;
        if ((!gm.O1() || ((tk5Var2 = this.parentLayout) != null && ((ActionBarLayout) tk5Var2).b)) && !this.inPreviewMode) {
            z = true;
        } else {
            z = false;
        }
        aVar.setOccupyStatusBar(z);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setActionBarMenuOnItemClick(new cxb(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final sxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var;
                byte b2 = r2;
                sxb sxbVar = this.b;
                switch (b2) {
                    case 0:
                        if (!sxbVar.t0) {
                            sxbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        sxbVar.getMessagesController().e2(-sxbVar.a, null, sxbVar.f());
                        sxbVar.S0(false);
                        return;
                    case 2:
                        sxbVar.finishPreviewFragment();
                        return;
                    case 3:
                        nk3 nk3Var3 = sxbVar.N0;
                        if (nk3Var3 != null && (r7Var = nk3Var3.k0) != null) {
                            r7Var.performClick();
                            return;
                        }
                        return;
                    default:
                        sxbVar.presentFragment(wvb.f0(sxbVar.a, 0L));
                        return;
                }
            }
        });
        r6 t = this.actionBar.t();
        if (this.N0 != null) {
            r7 a = t.a(0, 2131232503);
            this.q0 = a;
            a.setOnClickListener(new View.OnClickListener(this) {
                public final sxb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    r7 r7Var;
                    byte b2 = r2;
                    sxb sxbVar = this.b;
                    switch (b2) {
                        case 0:
                            if (!sxbVar.t0) {
                                sxbVar.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            sxbVar.getMessagesController().e2(-sxbVar.a, null, sxbVar.f());
                            sxbVar.S0(false);
                            return;
                        case 2:
                            sxbVar.finishPreviewFragment();
                            return;
                        case 3:
                            nk3 nk3Var3 = sxbVar.N0;
                            if (nk3Var3 != null && (r7Var = nk3Var3.k0) != null) {
                                r7Var.performClick();
                                return;
                            }
                            return;
                        default:
                            sxbVar.presentFragment(wvb.f0(sxbVar.a, 0L));
                            return;
                    }
                }
            });
        } else {
            r7 a2 = t.a(0, 2131232503);
            this.q0 = a2;
            a2.N();
            a2.K(new q20(this, (byte) 23));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(jb6.M0(2131745570, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            anb.X(searchField, cmb.F6, getResourceProvider());
            anb.D(searchField, cmb.Ij, getResourceProvider());
            anb.v(searchField, cmb.Me, getResourceProvider());
        }
        r7 b2 = t.b(0, 2131231248, null);
        this.r0 = b2;
        b2.setContentDescription(jb6.M0(2131754838, null));
        this.r0.e(1, 2131232119, jb6.M0(2131743691, null));
        this.S = this.r0.e(2, 2131232051, jb6.M0(2131754398, null));
        r7 r7Var = this.r0;
        this.U = r7Var.d(14, 0, new p09(2131623944, gm.L(24.0f), gm.L(24.0f)), jb6.M0(2131753550, null), true, false, r7Var.n0);
        this.R = this.r0.e(3, 2131232411, jb6.M0(2131751639, null));
        this.V = this.r0.e(15, 2131232339, jb6.M0(2131745963, null));
        this.T = this.r0.d(11, 2131232201, null, jb6.M0(2131748747, null), true, false, null);
        z82 z82Var = new z82(context, this, false, this.resourceProvider);
        this.f = z82Var;
        z82Var.getAvatarImageView().setRoundRadius(gm.L(16.0f));
        z82 z82Var2 = this.f;
        if ((!gm.O1() || ((tk5Var = this.parentLayout) != null && ((ActionBarLayout) tk5Var).b)) && !this.inPreviewMode) {
            z2 = true;
        } else {
            z2 = false;
        }
        z82Var2.setOccupyStatusBar(z2);
        z82 z82Var3 = this.f;
        long j = -this.a;
        if (j < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z82Var3.b = z3;
        z82Var3.setClipChildren(false);
        this.actionBar.addView(this.f, 0, qoe.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new g6(this, (byte) 17));
        }
        this.O = new dxb(this, context);
        zgc zgcVar = new zgc(this.d);
        ViewGroup viewGroup = this.d;
        km0 km0Var = this.m1;
        km0Var.h = zgcVar;
        km0Var.i = viewGroup;
        dxb dxbVar = this.O;
        nk3 nk3Var3 = this.N0;
        if (nk3Var3 != null) {
            viewGroup = (ViewGroup) nk3Var3.getFragmentView();
        }
        dxb dxbVar2 = this.O;
        Objects.requireNonNull(dxbVar2);
        this.n1 = new nfc(dxbVar, viewGroup, new ec5(dxbVar2, (byte) 2));
        this.O.E0(new lo4(this, (byte) 6));
        SpannableString spannableString = new SpannableString("#");
        mo4 d = no4.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, gm.L(2.0f), gm.L(16.0f), gm.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        pi3 pi3Var = new pi3(this, gm.G2(jb6.M0(2131754718, null), spannableString, "#"), gm.G2(jb6.M0(2131754720, null), spannableString, "#"));
        this.x = pi3Var;
        pi3Var.b();
        if (this.F) {
            b = 2;
        } else {
            b = 0;
        }
        this.E = b;
        pi3 pi3Var2 = this.x;
        if (b != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        pi3Var2.X = z4;
        fxb fxbVar = new fxb(this);
        this.O.setHideIfEmpty(false);
        fxbVar.m = false;
        fxbVar.C = false;
        dxb dxbVar3 = this.O;
        this.J0 = fxbVar;
        dxbVar3.setItemAnimator(fxbVar);
        this.O.setOnScrollListener(new gxb(this, (byte) 0));
        dxb dxbVar4 = this.O;
        dxbVar4.X1 = true;
        dxbVar4.Y1 = false;
        w49 w49Var = new w49(dxbVar4, true);
        this.L0 = w49Var;
        this.O.setItemsEnterAnimator(w49Var);
        this.O.setOnItemClickListener(new s19(this, (byte) 25));
        this.O.setOnItemLongClickListener(new swb(this));
        this.O.setOnScrollListener(new gxb(this, (byte) 1));
        dxb dxbVar5 = this.O;
        uwb uwbVar = new uwb(this);
        this.G = uwbVar;
        dxbVar5.setLayoutManager(uwbVar);
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new vwb(this));
        rxb rxbVar = new rxb(this);
        this.Q = rxbVar;
        wwb wwbVar = new wwb(this, rxbVar);
        this.P = wwbVar;
        wwbVar.h(this.O);
        this.d.addView(this.O, qoe.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -gm.L(100.0f);
        wp4 wp4Var = new wp4(this.resourceProvider, getParentActivity(), false);
        this.h = wp4Var;
        this.d.addView(wp4Var, wp4.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final sxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var2;
                byte b22 = r2;
                sxb sxbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!sxbVar.t0) {
                            sxbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        sxbVar.getMessagesController().e2(-sxbVar.a, null, sxbVar.f());
                        sxbVar.S0(false);
                        return;
                    case 2:
                        sxbVar.finishPreviewFragment();
                        return;
                    case 3:
                        nk3 nk3Var32 = sxbVar.N0;
                        if (nk3Var32 != null && (r7Var2 = nk3Var32.k0) != null) {
                            r7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        sxbVar.presentFragment(wvb.f0(sxbVar.a, 0L));
                        return;
                }
            }
        });
        this.h.c.setImageResource(2131231270);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        this.h.setContentDescription(jb6.M0(2131751639, null));
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(24);
        tk4Var.setVisibility(8);
        tk4Var.x = true;
        uvb uvbVar = new uvb(context, (byte) 1);
        TextView textView = new TextView(context);
        uvbVar.d = textView;
        if (jb6.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new pn2(2131230875, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131743944, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131743944, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new pn2(2131230873, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        anb.X(textView, cmb.x6, getResourceProvider());
        boolean z5 = jb6.a0;
        if (z5) {
            f = 72.0f;
        } else {
            f = 32.0f;
        }
        if (z5) {
            f2 = 32.0f;
        } else {
            f2 = 72.0f;
        }
        uvbVar.addView(textView, qoe.d(-2, -2.0f, 81, f, 0.0f, f2, 32.0f));
        this.n = uvbVar;
        textView.setAlpha(0.0f);
        c42 c42Var = new c42(this, context, tk4Var);
        this.E0 = c42Var;
        try {
            c42Var.b.getImageReceiver().M(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(jb6.M0(2131747872, null));
        Y0();
        this.n.addView(tk4Var);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new ct8(context, (byte) 17);
        y7c y7cVar = new y7c(context);
        this.M = y7cVar;
        this.p0.addView(y7cVar);
        this.d.addView(this.p0, qoe.e(-1, 51, 80));
        this.M.setOnClickListener(new xwb(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(gm.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, qoe.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131231988);
        this.X0.setContentDescription(jb6.M0(2131751978, null));
        ImageView imageView2 = this.X0;
        int i3 = cmb.Te;
        imageView2.setBackground(ulb.c(null, ulb.b(getThemedColor(i3))));
        anb.s(this.X0, i3, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, qoe.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final sxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var2;
                byte b22 = r2;
                sxb sxbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!sxbVar.t0) {
                            sxbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        sxbVar.getMessagesController().e2(-sxbVar.a, null, sxbVar.f());
                        sxbVar.S0(false);
                        return;
                    case 2:
                        sxbVar.finishPreviewFragment();
                        return;
                    case 3:
                        nk3 nk3Var32 = sxbVar.N0;
                        if (nk3Var32 != null && (r7Var2 = nk3Var32.k0) != null) {
                            r7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        sxbVar.presentFragment(wvb.f0(sxbVar.a, 0L));
                        return;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        bdb bdbVar = new bdb((byte) 2, context, this);
        this.e = bdbVar;
        if (this.N0 == null) {
            this.d.addView(bdbVar, qoe.e(-1, -1, 119));
        }
        nxb nxbVar = new nxb(this, context);
        this.s0 = nxbVar;
        nxbVar.setVisibility(8);
        this.e.addView(this.s0, qoe.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        nxb nxbVar2 = this.s0;
        int i4 = cmb.c6;
        anb.h(i4, getResourceProvider(), nxbVar2);
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().C0(this.a, true, null, true, false, 0);
        qk3 qk3Var = new qk3(context);
        this.V0 = qk3Var;
        qk3Var.setPadding(gm.L(11.0f), gm.L(21.0f), gm.L(11.0f), gm.L(21.0f));
        im0 c = km0Var.c(this.V0, qqd.n(this.resourceProvider), false);
        wi8.r(c, gm.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c);
        this.V0.setOnAnimatedHeightChangedListener(new lo4(this, (byte) 1));
        this.d.addView(this.V0, qoe.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat f3 = f();
        if (f3 != null) {
            k02 k02Var = new k02(this, f3);
            this.S0 = k02Var;
            this.V0.addView(k02Var.b(), qoe.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            k02 k02Var2 = this.S0;
            k02Var2.m = new swb(this);
            TLRPC.ChatFull chatFull = this.K;
            k02Var2.j = chatFull;
            if (chatFull != null) {
                k02Var2.c(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.i(4, this.G0);
            this.V0.h(this.G0);
            this.V0.j(this.G0, true, false);
            y91 y91Var = new y91(this, context, this);
            this.H0 = y91Var;
            this.G0.addView(y91Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c2 = qoe.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c2.topMargin = gm.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c2);
        }
        z0();
        xd9 xd9Var = new xd9((byte) 14, context, this);
        this.Q0 = xd9Var;
        xd9Var.setForeground(new ColorDrawable(on2.p(getThemedColor(i4), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final sxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var2;
                byte b22 = r2;
                sxb sxbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!sxbVar.t0) {
                            sxbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        sxbVar.getMessagesController().e2(-sxbVar.a, null, sxbVar.f());
                        sxbVar.S0(false);
                        return;
                    case 2:
                        sxbVar.finishPreviewFragment();
                        return;
                    case 3:
                        nk3 nk3Var32 = sxbVar.N0;
                        if (nk3Var32 != null && (r7Var2 = nk3Var32.k0) != null) {
                            r7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        sxbVar.presentFragment(wvb.f0(sxbVar.a, 0L));
                        return;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && gm.O1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar = (d) it.next();
                if (dVar instanceof nk3) {
                    nk3 nk3Var4 = (nk3) dVar;
                    if (nk3Var4.J3()) {
                        bf7 bf7Var = nk3Var4.r2;
                        if (bf7Var.a == j) {
                            this.R0 = bf7Var.b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Z0(false, false);
        }
        S0(false);
        T0();
        if (sd2.R(f())) {
            getMessagesController().F0().a(j, new eg9(this, (byte) 22));
        }
        View view = this.fragmentView;
        swb swbVar = new swb(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(view, swbVar);
        return this.fragmentView;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i3 = nm7.T;
        long j = this.a;
        if (i == i3) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j) {
                S0(false);
                k02 k02Var = this.S0;
                if (k02Var != null) {
                    k02Var.j = chatFull2;
                    k02Var.c(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                A0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i == nm7.z5) {
            S0(false);
        } else if (i == nm7.r3) {
            if (j == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i == nm7.u5) {
            if (j == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    z0();
                }
                B0();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = oc7.s5;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().g4.y(j, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.m0(0);
                }
            }
        } else if (i == nm7.r) {
            Z0(false, false);
        } else if (i == nm7.w2) {
            Long l = (Long) objArr[0];
            if (j == l.longValue()) {
                this.I0 = getMessagesController().f1(l.longValue(), false, null);
                y91 y91Var = this.H0;
                if (y91Var != null) {
                    y91Var.a(!this.fragmentBeginToShow);
                }
                A0(false);
            }
        } else if (i == nm7.f0) {
            Z0(false, false);
            S0(true);
        } else if (i != nm7.v5 && i == nm7.s) {
            removeSelfFromStack(true);
        }
        if (i == nm7.h0 && getParentActivity() != null && this.inPreviewMode && gm.O1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j) && !booleanValue) {
                if (this.R0 != longValue2) {
                    this.R0 = longValue2;
                    Z0(false, false);
                }
            } else if (this.R0 != 0) {
                this.R0 = 0L;
                Z0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat f() {
        return getMessagesController().L0(Long.valueOf(this.a));
    }

    @Override
    public final qd2 getGroupCall() {
        qd2 qd2Var = this.I0;
        if (qd2Var != null && (qd2Var.b instanceof TLRPC.TL_groupCall)) {
            return qd2Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        nxb nxbVar = this.s0;
        if (nxbVar != null && nxbVar.a0 != null) {
            int i = l55.h;
        }
        return arrayList;
    }

    @Override
    public final TLRPC.User h() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i;
        if (this.t0) {
            i = cmb.c6;
        } else {
            i = cmb.r8;
        }
        int themedColor = getThemedColor(i);
        if (this.actionBar.y()) {
            themedColor = getThemedColor(cmb.v8);
        }
        if (on2.h(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final nz4 j() {
        return this.j1;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.b0.isEmpty()) {
            if (z) {
                D0();
                return false;
            }
        } else if (this.t0) {
            if (z) {
                this.actionBar.B(this.q0.T(false));
            }
        } else {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.o(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        oc7 messagesController = getMessagesController();
        long j = this.a;
        messagesController.a3(0, j, true);
        long j2 = -j;
        this.e1 = getMessagesController().v4(j2);
        nm7.f(this.currentAccount).b(this, nm7.z5);
        nm7.f(this.currentAccount).b(this, nm7.r3);
        nm7.f(this.currentAccount).b(this, nm7.T);
        nm7.f(this.currentAccount).b(this, nm7.u5);
        nm7.f(this.currentAccount).b(this, 2);
        nm7.f(this.currentAccount).b(this, nm7.r);
        nm7.f(this.currentAccount).b(this, nm7.w2);
        nm7.f(this.currentAccount).b(this, nm7.f0);
        nm7.f(this.currentAccount).b(this, nm7.v5);
        nm7.f(this.currentAccount).b(this, nm7.s);
        nm7.f(this.currentAccount).b(this, nm7.h0);
        Z0(false, false);
        vz9.s(this.currentAccount);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j));
        if (sd2.T(L0)) {
            getMessagesController().d5(L0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = s1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().i1(j2);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.P0.e();
        nm7.f(this.currentAccount).n(this, nm7.z5);
        nm7.f(this.currentAccount).n(this, nm7.r3);
        nm7.f(this.currentAccount).n(this, nm7.T);
        nm7.f(this.currentAccount).n(this, nm7.u5);
        nm7.f(this.currentAccount).n(this, 2);
        nm7.f(this.currentAccount).n(this, nm7.r);
        nm7.f(this.currentAccount).n(this, nm7.w2);
        nm7.f(this.currentAccount).n(this, nm7.f0);
        nm7.f(this.currentAccount).n(this, nm7.v5);
        nm7.f(this.currentAccount).n(this, nm7.s);
        nm7.f(this.currentAccount).n(this, nm7.h0);
        oc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        if (sd2.T(L0)) {
            getMessagesController().d5(L0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.e1) {
            this.e1 = false;
            getMessagesController().f4(-j);
        }
        nk3 nk3Var = this.N0;
        if (nk3Var != null && nk3Var.H3 != null) {
            nk3Var.getActionBar().setSearchAvatarImageView(null);
            this.N0.H3.N = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().g4.r;
        long j = this.a;
        int i = 0;
        int i2 = longSparseIntArray.get(j, 0) - 1;
        if (i2 >= 0) {
            i = i2;
        }
        longSparseIntArray.put(j, i);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        qwb qwbVar = getMessagesController().g4;
        LongSparseIntArray longSparseIntArray = qwbVar.r;
        long j = this.a;
        longSparseIntArray.put(j, longSparseIntArray.get(j, 0) + 1);
        qwbVar.y(j, true);
        this.H = false;
        gm.V3(this.O);
        this.H = true;
        setBulletinDelegate(new s20(this, (byte) 21));
        if (this.inPreviewMode && !getMessagesController().s2(-j)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        if (gda.o() != 0 && this.U0) {
            P0(f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b;
        super.onThemeColorsChanged();
        kz4 kz4Var = this.l1;
        if (kz4Var != null) {
            kz4Var.a(getThemedColor(cmb.c6));
        }
        if (this.X0 != null && (b = ulb.b(getThemedColor(cmb.Te))) != this.r1) {
            this.r1 = b;
            cmb.F1(this.X0.getBackground(), b, true);
        }
        for (int i = 0; i < 2; i++) {
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(cmb.F8), true);
            this.actionBar.J(getThemedColor(cmb.D8), false, true);
            this.actionBar.J(getThemedColor(cmb.E8), true, true);
            this.actionBar.K(getThemedColor(cmb.H5), true);
        }
        xd9 xd9Var = this.Q0;
        if (xd9Var != null && (xd9Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(on2.p(getThemedColor(cmb.c6), 100));
        }
        T0();
        try {
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setActionModeColor(getThemedColor(cmb.c6));
            }
            pi3 pi3Var = this.x;
            if (pi3Var != null) {
                pi3Var.h();
            }
            if (this.actionBar != null && this.c1) {
                X0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(cmb.x8));
            }
            r7 r7Var = this.q0;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.q0.getSearchField().setCursorColor(getThemedColor(cmb.Me));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        dj3 dj3Var;
        xd9 xd9Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (xd9Var = this.Q0) != null) {
            if (xd9Var.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z) {
            A0(false);
        }
        this.P0.e();
        if (!z) {
            if (this.u0 && this.I) {
                removeSelfFromStack();
                nk3 nk3Var = this.M0;
                if (nk3Var != null) {
                    nk3Var.removeSelfFromStack();
                }
            } else if (this.J) {
                removeSelfFromStack();
                nk3 nk3Var2 = this.N0;
                if (nk3Var2 != null && (dj3Var = nk3Var2.H3) != null && dj3Var.c()) {
                    this.N0.H3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        xd9 xd9Var = this.Q0;
        if (xd9Var != null && xd9Var.getVisibility() == 0) {
            xd9 xd9Var2 = this.Q0;
            if (z) {
                xd9Var2.setAlpha(1.0f - f);
            } else {
                xd9Var2.setAlpha(f);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.P0.d();
    }

    @Override
    public final z82 p() {
        return this.f;
    }

    @Override
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.U0 = true;
            O0(true);
            return;
        }
        this.U0 = false;
        O0(false);
        P0(1.0f);
    }

    @Override
    public final void setPreviewOpenedProgress(float f) {
        z82 z82Var = this.f;
        if (z82Var != null) {
            z82Var.setAlpha(f);
            this.r0.setAlpha(f);
            r7 r7Var = this.q0;
            if (r7Var != null) {
                r7Var.setAlpha(f);
            }
            this.actionBar.getBackButton().setAlpha(f);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f) {
        z82 z82Var = this.f;
        if (z82Var != null) {
            z82Var.setAlpha(f);
            this.f.setTranslationX((1.0f - f) * gm.L(40.0f));
        }
    }

    @Override
    public final void u() {
        this.O.z0(0);
    }

    public final void x0(boolean z) {
        float f;
        boolean z2;
        dj3 dj3Var;
        this.t0 = z;
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Z0.cancel();
        }
        if (this.b1 == null) {
            vgc l = this.s0.l(8, false);
            this.b1 = l;
            if (this.N0 != null) {
                anb.h(cmb.c6, getResourceProvider(), l);
            }
            this.e.addView(this.b1, qoe.c(44.0f, -1));
        }
        float f2 = this.X;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.Z0 = ValueAnimator.ofFloat(f2, f);
        gm.T3(this.s0, false, 1.0f, true, true);
        nk3 nk3Var = this.N0;
        if (nk3Var != null && (dj3Var = nk3Var.H3) != null) {
            dj3Var.N = !z;
        }
        if (!z && this.s0.getVisibility() == 0 && this.s0.getAlpha() == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a1 = z2;
        this.Z0.addUpdateListener(new rha(this, (byte) 29));
        this.s0.setVisibility(0);
        if (!z) {
            this.r0.setVisibility(0);
        } else {
            gm.V2(getParentActivity(), this.classGuid);
            U0(false);
        }
        this.Z0.addListener(new bxb(this, z, (byte) 0));
        this.Z0.setDuration(200L);
        this.Z0.setInterpolator(d53.f);
        this.Z0.start();
        nm7.e().k(nm7.v4, Boolean.TRUE);
    }

    public final void y0() {
        mr3 mr3Var;
        View view;
        a aVar;
        float f;
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (mr3Var = this.i1) != null) {
            int L = gm.L(48.0f);
            int L2 = gm.L(48.0f) + ((int) this.V0.c(gm.L(14.0f)));
            nk3 nk3Var = this.N0;
            if (nk3Var != null) {
                view = nk3Var.fragmentView;
                aVar = nk3Var.getActionBar();
            } else {
                view = this.fragmentView;
                aVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.h1) - gm.L(8.0f);
            this.p1.set(0.0f, -L, view.getMeasuredWidth(), aVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.q1;
            rectF.set(0.0f, measuredHeight - gm.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (e86.e(262144)) {
                f = 0.0f;
            } else {
                f = -gm.L(48.0f);
            }
            rectF.inset(0.0f, f);
            if (this.N0 != null) {
                i = 2;
            } else {
                i = 1;
            }
            mr3Var.g(i, this.o1);
            mr3Var.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final nz4 z() {
        return this.k1;
    }

    public final void z0() {
        uwb uwbVar;
        qwb qwbVar = this.s;
        long j = this.a;
        if (!qwbVar.e(j) && (uwbVar = this.G) != null) {
            int M0 = uwbVar.M0();
            if (this.b.isEmpty() || M0 >= this.r.b() - 5) {
                qwbVar.o(j);
            }
            B0();
        }
    }

    @Override
    public final void F() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void J(int i, int i2, int i3, int i4, boolean z, boolean z2) {
    }
}

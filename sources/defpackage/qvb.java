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
public class qvb extends d implements gk7, sy1, zg6 {
    public static final HashSet s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public byte E;
    public q22 E0;
    public boolean F;
    public gvb F0;
    public tub G;
    public FrameLayout G0;
    public boolean H;
    public p81 H0;
    public boolean I;
    public fc2 I0;
    public boolean J;
    public evb J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public t29 L0;
    public y5c M;
    public cj3 M0;
    public boolean N;
    public cj3 N0;
    public cvb O;
    public boolean O0;
    public vub P;
    public final on P0;
    public pvb Q;
    public si9 Q0;
    public a8 R;
    public long R0;
    public a8 S;
    public xy1 S0;
    public a8 T;
    public float T0;
    public a8 U;
    public boolean U0;
    public a8 V;
    public fj3 V0;
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
    public vec b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public yub d;
    public NumberTextView d0;
    public nvb d1;
    public zab e;
    public r7 e0;
    public boolean e1;
    public o72 f;
    public r7 f0;
    public int f1;
    public r7 g0;
    public int g1;
    public un4 h;
    public r7 h0;
    public int h1;
    public r7 i0;
    public final cq3 i1;
    public r7 j0;
    public final lx4 j1;
    public a8 k0;
    public final lx4 k1;
    public a8 l0;
    public final ix4 l1;
    public a8 m0;
    public final kl0 m1;
    public ttb n;
    public r7 n0;
    public mdc n1;
    public RadialProgressView o0;
    public final ArrayList o1;
    public ar8 p0;
    public final RectF p1;
    public r7 q0;
    public final RectF q1;
    public final hvb r;
    public r7 r0;
    public int r1;
    public final pub s;
    public mvb s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public rvb w;
    public final boolean w0;
    public dh3 x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public qvb(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        this.r = new hvb(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new on(new int[]{kk7.s5});
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
        this.W0 = !ls6.v("topics_end_reached_", j, getUserConfig().j(), false);
        ix4 ix4Var = new ix4();
        this.l1 = ix4Var;
        ix4Var.a(getThemedColor(bkb.c6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.i1 = new cq3(false);
            this.j1 = new lx4(null);
            lx4 lx4Var = new lx4(null);
            this.k1 = lx4Var;
            kl0 kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
            this.m1 = kl0Var;
            kl0Var.k = true;
            return;
        }
        this.i1 = null;
        this.j1 = null;
        this.k1 = null;
        this.m1 = new kl0(ix4Var, ix4Var, ix4Var);
    }

    public static d E0(na7 na7Var, ad7 ad7Var, Bundle bundle) {
        long j = bundle.getLong("chat_id");
        if (j != 0) {
            TLRPC.Dialog Q0 = na7Var.Q0(-j);
            if (Q0 != null && Q0.view_forum_as_messages) {
                return new mu1(bundle);
            }
            TLRPC.ChatFull L0 = na7Var.L0(j);
            if (L0 == null) {
                L0 = ad7Var.C0(j, true, new CountDownLatch(1), false, false, 0);
            }
            if (L0 != null && L0.view_forum_as_messages) {
                return new mu1(bundle);
            }
        }
        return new qvb(bundle);
    }

    public static d F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(na7.q1(launchActivity.P), ad7.Y(launchActivity.P), bundle);
    }

    public static void L0(defpackage.mu1 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvb.L0(mu1):void");
    }

    public static int v0(qvb qvbVar) {
        return qvbVar.currentAccount;
    }

    @Override
    public final lx4 A() {
        return this.k1;
    }

    public final void A0() {
        boolean z;
        pub pubVar = this.s;
        vf6 vf6Var = pubVar.a;
        LongSparseIntArray longSparseIntArray = pubVar.c;
        long j = this.a;
        if (longSparseIntArray.get(j, 0) == 1 && (vf6Var.f(j) == null || ((ArrayList) vf6Var.f(j)).isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        this.K0 = z;
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((ivb) arrayList.get(0)).c != null && ((ivb) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        cvb cvbVar = this.O;
        if (cvbVar != null) {
            cvbVar.L0(cvbVar.w1());
        }
        T0(true);
    }

    public final void B0() {
        int i;
        float f;
        float f2;
        cj3 cj3Var = this.N0;
        float f3 = 0.0f;
        if (cj3Var != null) {
            int L = gl.L(14.0f);
            fj3 fj3Var = cj3Var.L1;
            if (fj3Var != null) {
                f = fj3Var.c(L);
            } else {
                f = 0.0f;
            }
            float f4 = f + 0.0f;
            fj3 fj3Var2 = this.V0;
            if (fj3Var2 != null) {
                float L2 = gl.L(7.0f);
                fj3 fj3Var3 = this.N0.L1;
                if (fj3Var3 != null) {
                    f2 = fj3Var3.getMetadata().c.a;
                } else {
                    f2 = 0.0f;
                }
                fj3Var2.setTranslationY(f4 - (f2 * L2));
                fj3 fj3Var4 = this.V0;
                int L3 = gl.L(14.0f);
                int L4 = gl.L(7.0f);
                fj3 fj3Var5 = this.N0.L1;
                if (fj3Var5 != null) {
                    f3 = fj3Var5.getMetadata().c.a;
                }
                f3 = fj3Var4.c(gl.U1(f3, L3, L4)) + f4;
            } else {
                f3 = f4;
            }
        } else {
            fj3 fj3Var6 = this.V0;
            if (fj3Var6 != null) {
                f3 = 0.0f + fj3Var6.c(gl.L(14.0f));
            }
        }
        int i2 = this.h1 + this.f1;
        if (this.W) {
            i = gl.L(51.0f);
        } else {
            i = 0;
        }
        this.O.setPadding(0, (int) f3, 0, i2 + i);
    }

    @Override
    public final cja C() {
        return this.d;
    }

    public final void C0() {
        this.b0.clear();
        this.actionBar.x();
        gl.V3(this.O);
        U0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = k96.J0(hashSet.size(), "DeleteTopics");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            hdVar.U = k96.a0(null, null, 2131751486, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            hdVar.U = k96.M0(2131751485, null);
        }
        alertDialog$Builder.j(k96.M0(2131751586, null), new lt(this, hashSet, arrayList, runnable, (byte) 24));
        alertDialog$Builder.g(k96.M0(2131752577, null), new sdb((byte) 26));
        hdVar.show();
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, getResourceProvider());
        }
    }

    public final void G0(boolean z, boolean z2) {
        boolean z3 = true;
        this.h.e(!z, (this.fragmentBeginToShow && z2) ? false : false);
    }

    public final void H0(View view) {
        long j;
        if (getParentLayout() != null && !((ActionBarLayout) getParentLayout()).w() && (view instanceof nvb)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((nvb) view).O;
            na7 messagesController = getMessagesController();
            long j2 = this.a;
            long j3 = -j2;
            boolean x2 = messagesController.x2(j3);
            if (tL_forumTopic == null) {
                j = 0;
            } else if (x2) {
                j = cf3.n(tL_forumTopic.from_id);
            } else {
                j = tL_forumTopic.id;
            }
            if (this.u0) {
                rvb rvbVar = this.w;
                if (rvbVar != null) {
                    tvb tvbVar = rvbVar.a;
                    Bundle bundle = new Bundle();
                    wvb wvbVar = tvbVar.a;
                    bundle.putLong("dialog_id", wvbVar.c);
                    bundle.putLong("topic_id", tL_forumTopic.id);
                    bundle.putBoolean("exception", true);
                    pr8 pr8Var = new pr8(bundle, null);
                    pr8Var.s = new kq8(tvbVar, tL_forumTopic, (byte) 29);
                    wvbVar.presentFragment(pr8Var);
                }
                cj3 cj3Var = this.M0;
                if (cj3Var != null) {
                    cj3Var.i3(j3, j, true, this);
                }
            } else if (this.b0.size() > 0) {
                Q0(view);
            } else {
                if (this.inPreviewMode && gl.O1()) {
                    for (d dVar : getParentLayout().getFragmentStack()) {
                        if (dVar instanceof cj3) {
                            cj3 cj3Var2 = (cj3) dVar;
                            if (cj3Var2.H3()) {
                                zc7 zc7Var = cj3Var2.r2;
                                if (zc7Var.a == j3 && zc7Var.b == j) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    this.R0 = j;
                    Y0(false, false);
                }
                mm4.n(this, j2, tL_forumTopic, 0);
            }
        }
    }

    public final boolean I0(View view, float f) {
        if (this.u0 || getParentLayout() == null || ((ActionBarLayout) getParentLayout()).w()) {
            return false;
        }
        if (!this.actionBar.y() && !gl.O1() && (view instanceof nvb)) {
            nvb nvbVar = (nvb) view;
            if (nvbVar.b0(f)) {
                P0(nvbVar);
                this.O.J0(true);
                this.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        Q0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean J0(TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
        edit.putLong("dialog_join_requested_time_" + (-this.a), System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean V = hc2.V(f());
        int i = fu5.t1;
        fu5.E0(parentActivity, this, u21.b0(this), V);
        R0(true);
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    public final void K0(boolean z) {
        int i;
        TLRPC.Chat f;
        TLRPC.ChatPhoto chatPhoto;
        if (z && (f = f()) != null && ((chatPhoto = f.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.q3(this.K);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().C() && z) {
            i = 2;
        } else {
            i = 1;
        }
        profileActivity.x3(i);
        presentFragment(profileActivity);
    }

    @Override
    public final long M() {
        return 0L;
    }

    public final void M0(int i) {
        int i2;
        int i3;
        if (this.N != i) {
            this.N = i;
            y5c y5cVar = this.M;
            if (i == 0) {
                i2 = bkb.rf;
            } else {
                i2 = bkb.p7;
            }
            y5cVar.setTextColorKey(i2);
            ImageView imageView = this.X0;
            if (i == 1) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            R0(false);
        }
    }

    public final void N0(boolean z) {
        if (gba.o() == 0) {
            return;
        }
        yub yubVar = this.d;
        if (yubVar != null) {
            if (z) {
                yubVar.setLayerType(2, null);
                yubVar.setClipChildren(false);
                yubVar.setClipToPadding(false);
            } else {
                yubVar.setLayerType(0, null);
                yubVar.setClipChildren(true);
                yubVar.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void O0(float f) {
        if (gba.o() != 0) {
            this.T0 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            cvb cvbVar = this.O;
            if (cvbVar != null) {
                float B = ls6.B(1.0f, this.T0, 0.05f, 1.0f);
                cvbVar.setPivotX(0.0f);
                cvbVar.setPivotY(0.0f);
                cvbVar.setScaleX(B);
                cvbVar.setScaleY(B);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(B);
                this.actionBar.setScaleY(B);
            }
        }
    }

    public final void P0(ue3 ue3Var) {
        boolean z;
        long j;
        try {
            ue3Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r3 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 1, getResourceProvider(), getParentActivity())};
        final TLRPC.TL_forumTopic tL_forumTopic = ue3Var.O;
        yb2 yb2Var = new yb2(getParentActivity(), this.currentAccount, r3[0].getSwipeBack(), false, new xub(this, tL_forumTopic), getResourceProvider());
        int b = r3[0].b(yb2Var.f);
        yb2Var.o = true;
        long j2 = this.a;
        long j3 = -j2;
        yb2Var.e(j3, tL_forumTopic.id, null);
        if (hc2.y(15, f())) {
            a8 a8Var = new a8(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                a8Var.j(k96.M0(2131751440, null), 2131232418, null);
            } else {
                a8Var.j(k96.M0(2131751441, null), 2131232298, null);
            }
            a8Var.setMinimumWidth(160);
            z = false;
            a8Var.setOnClickListener(new View.OnClickListener(this) {
                public final qvb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    qvb qvbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            qvb qvbVar2 = this.b;
                            qvbVar2.D0 = true;
                            qvbVar2.O0 = true;
                            qvbVar2.s.t(qvbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, qvbVar2);
                            qvbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            qvbVar.O0 = true;
                            qvbVar.s.z(tL_forumTopic2.id, qvbVar.a, !tL_forumTopic2.closed);
                            qvbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            qvbVar.D0(hashSet, new km4(qvbVar, (byte) 4));
                            return;
                    }
                }
            });
            r3[0].addView(a8Var);
        } else {
            z = false;
        }
        a8 a8Var2 = new a8(getParentActivity(), z, z);
        if (getMessagesController().n2(j3, tL_forumTopic.id, null)) {
            a8Var2.j(k96.M0(2131743610, null), 2131232261, null);
        } else {
            a8Var2.j(k96.M0(2131748122, null), 2131232417, null);
        }
        a8Var2.setMinimumWidth(160);
        a8Var2.setOnClickListener(new pg(this, tL_forumTopic, (Serializable) r3, b, (byte) 7));
        boolean z2 = false;
        r3[0].addView(a8Var2);
        if (hc2.i(this.currentAccount, f(), tL_forumTopic)) {
            a8 a8Var3 = new a8(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                a8Var3.j(k96.M0(2131745891, null), 2131232411, null);
            } else {
                a8Var3.j(k96.M0(2131752027, null), 2131232409, null);
            }
            a8Var3.setMinimumWidth(160);
            a8Var3.setOnClickListener(new View.OnClickListener(this) {
                public final qvb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    qvb qvbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            qvb qvbVar2 = this.b;
                            qvbVar2.D0 = true;
                            qvbVar2.O0 = true;
                            qvbVar2.s.t(qvbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, qvbVar2);
                            qvbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            qvbVar.O0 = true;
                            qvbVar.s.z(tL_forumTopic2.id, qvbVar.a, !tL_forumTopic2.closed);
                            qvbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            qvbVar.D0(hashSet, new km4(qvbVar, (byte) 4));
                            return;
                    }
                }
            });
            z2 = false;
            r3[0].addView(a8Var3);
        }
        if (hc2.e(this.currentAccount, f(), tL_forumTopic)) {
            a8 a8Var4 = new a8(getParentActivity(), z2, true);
            a8Var4.j(k96.J0(1, "DeleteTopics"), 2131232113, null);
            a8Var4.c(bkb.p7, bkb.o7);
            a8Var4.setMinimumWidth(160);
            a8Var4.setOnClickListener(new View.OnClickListener(this) {
                public final qvb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    qvb qvbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            qvb qvbVar2 = this.b;
                            qvbVar2.D0 = true;
                            qvbVar2.O0 = true;
                            qvbVar2.s.t(qvbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, qvbVar2);
                            qvbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            qvbVar.O0 = true;
                            qvbVar.s.z(tL_forumTopic2.id, qvbVar.a, !tL_forumTopic2.closed);
                            qvbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            qvbVar.D0(hashSet, new km4(qvbVar, (byte) 4));
                            return;
                    }
                }
            });
            r3[0].addView(a8Var4);
        }
        boolean x2 = getMessagesController().x2(j3);
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
            this.parentLayout.getOverlayContainerView().addView(this.Q0, nme.c(-1.0f, -1));
        }
        mu1 mu1Var = new mu1(ls6.k(j2, "chat_id"));
        TLRPC.TL_forumTopic tL_forumTopic2 = ue3Var.O;
        if (x2) {
            j = cf3.n(tL_forumTopic2.from_id);
        } else {
            j = tL_forumTopic2.id;
        }
        mm4.a(mu1Var, zc7.a(j3, j));
        presentFragmentAsPreviewWithMenu(mu1Var, r3[0]);
    }

    public final void Q0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvb.Q0(android.view.View):void");
    }

    public final void R0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvb.R0(boolean):void");
    }

    public final void S0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(bkb.rf));
        this.h.updateColors();
        ar8 ar8Var = this.p0;
        int i = bkb.c6;
        ar8Var.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(getThemedColor(i));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(bkb.r8));
        }
        this.s0.setBackgroundColor(getThemedColor(i));
    }

    public final void T0(boolean z) {
        boolean z2;
        if (this.R == null) {
            return;
        }
        na7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        int i = 0;
        if (!hc2.r0(getMessagesController().K0(Long.valueOf(j))) && hc2.w(15, K0) && !this.t0 && !this.u0 && !this.K0) {
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
        G0(!this.L, z);
    }

    public final void U0() {
        boolean z;
        if (hc2.y(15, f()) && !this.b0.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (this.c0 != z) {
            this.c0 = z;
            hvb hvbVar = this.r;
            hvbVar.l(0, hvbVar.b());
        }
    }

    public final void V0(float f) {
        this.X = f;
        W0();
        this.c1 = true;
        float f2 = 1.0f - f;
        this.f.getTitleTextView().setAlpha(f2);
        this.f.getSubtitleTextView().setAlpha(f2);
        vec vecVar = this.b1;
        if (vecVar != null) {
            vecVar.setTranslationY((-gl.L(16.0f)) * f2);
            this.b1.setAlpha(f);
        }
        this.s0.setTranslationY((-gl.L(16.0f)) * f2);
        this.s0.setAlpha(f);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f2);
        if (this.a1) {
            float A = tb4.A(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(A);
            this.O.setScaleY(A);
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        return false;
    }

    public final void W0() {
        int themedColor = getThemedColor(bkb.u8);
        a aVar = this.actionBar;
        int i = bkb.x8;
        aVar.H(bm2.f(this.X, themedColor, getThemedColor(i)), false);
        this.actionBar.H(bm2.f(this.X, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(bm2.f(this.X, getThemedColor(bkb.s8), getThemedColor(bkb.y8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(bm2.f(this.X, getThemedColor(bkb.r8), getThemedColor(bkb.c6)));
        }
    }

    public final void X0() {
        q22 q22Var = this.E0;
        if (q22Var != null && q22Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            cm2 cm2Var = new cm2(2131231247, 0);
            cm2Var.c(gl.L(16.0f));
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
            if (hc2.y(15, f())) {
                this.E0.e.setText(gl.G2(gl.S2(k96.M0(2131747944, null)), spannableStringBuilder, "%s"));
                return;
            }
            String M0 = k96.M0(2131750458, null);
            TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.a, 1L);
            if (f != null) {
                M0 = f.title;
            }
            this.E0.e.setText(gl.S2(k96.a0("NoTopicsDescriptionUser", null, 2131747943, M0)));
        }
    }

    public final void Y0(boolean z, boolean z2) {
        tub tubVar;
        evb evbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z && this.O0) {
            z = true;
        }
        this.O0 = false;
        pub pubVar = this.s;
        long j = this.a;
        ArrayList l = pubVar.l(j);
        if (l != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            evb evbVar2 = null;
            if (l7c.w(na7.q1(this.currentAccount).V1(Long.valueOf(-j))) && this.v0) {
                arrayList.add(new ivb(3, null));
            }
            for (int i = 0; i < l.size(); i++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList.add(new ivb(0, (TLRPC.TL_forumTopic) l.get(i)));
                }
            }
            if (!arrayList.isEmpty() && !pubVar.e(j) && this.W0) {
                arrayList.add(new ivb(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.L0.b(size + 4);
                z = false;
            }
            this.y = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ivb ivbVar = (ivb) arrayList.get(i2);
                if (ivbVar != null && (tL_forumTopic = ivbVar.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            cvb cvbVar = this.O;
            if (cvbVar != null) {
                b49 itemAnimator = cvbVar.getItemAnimator();
                if (z) {
                    evbVar = this.J0;
                } else {
                    evbVar = null;
                }
                if (itemAnimator != evbVar) {
                    cvb cvbVar2 = this.O;
                    if (z) {
                        evbVar2 = this.J0;
                    }
                    cvbVar2.setItemAnimator(evbVar2);
                }
            }
            hvb hvbVar = this.r;
            if (hvbVar != null) {
                hvbVar.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (tubVar = this.G) != null) {
                tubVar.g1(0, 0);
                this.D0 = false;
            }
        }
        A0();
        X0();
    }

    @Override
    public final long a() {
        return -this.a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
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
        ui5 ui5Var;
        ui5 ui5Var2;
        cj3 cj3Var = this.N0;
        if (cj3Var != null && cj3Var.X) {
            i = gl.L(72.0f);
        } else {
            i = 0;
        }
        this.f1 = i;
        cj3 cj3Var2 = this.N0;
        if (cj3Var2 != null && cj3Var2.X) {
            i2 = gl.L(64.0f);
        } else {
            i2 = 0;
        }
        this.g1 = i2;
        yub yubVar = new yub(this, context);
        this.d = yubVar;
        this.fragmentView = yubVar;
        zkb.h(bkb.c6, getResourceProvider(), yubVar);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        a aVar = this.actionBar;
        if ((!gl.O1() || ((ui5Var2 = this.parentLayout) != null && ((ActionBarLayout) ui5Var2).b)) && !this.inPreviewMode) {
            z = true;
        } else {
            z = false;
        }
        aVar.setOccupyStatusBar(z);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setActionBarMenuOnItemClick(new bvb(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final qvb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var;
                byte b2 = r2;
                qvb qvbVar = this.b;
                switch (b2) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        return;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        return;
                    case 3:
                        cj3 cj3Var3 = qvbVar.N0;
                        if (cj3Var3 != null && (r7Var = cj3Var3.k0) != null) {
                            r7Var.performClick();
                            return;
                        }
                        return;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        return;
                }
            }
        });
        r6 t = this.actionBar.t();
        if (this.N0 != null) {
            r7 a = t.a(0, 2131232491);
            this.q0 = a;
            a.setOnClickListener(new View.OnClickListener(this) {
                public final qvb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    r7 r7Var;
                    byte b2 = r2;
                    qvb qvbVar = this.b;
                    switch (b2) {
                        case 0:
                            if (!qvbVar.t0) {
                                qvbVar.K0(false);
                                return;
                            }
                            return;
                        case 1:
                            qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                            qvbVar.R0(false);
                            return;
                        case 2:
                            qvbVar.finishPreviewFragment();
                            return;
                        case 3:
                            cj3 cj3Var3 = qvbVar.N0;
                            if (cj3Var3 != null && (r7Var = cj3Var3.k0) != null) {
                                r7Var.performClick();
                                return;
                            }
                            return;
                        default:
                            qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                            return;
                    }
                }
            });
        } else {
            r7 a2 = t.a(0, 2131232491);
            this.q0 = a2;
            a2.N();
            a2.K(new q10(this, (byte) 23));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(k96.M0(2131745644, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            zkb.X(searchField, bkb.F6, getResourceProvider());
            zkb.D(searchField, bkb.Ij, getResourceProvider());
            zkb.v(searchField, bkb.Me, getResourceProvider());
        }
        r7 b2 = t.b(0, 2131231247, null);
        this.r0 = b2;
        b2.setContentDescription(k96.M0(2131754838, null));
        this.r0.e(1, 2131232118, k96.M0(2131743765, null));
        this.S = this.r0.e(2, 2131232050, k96.M0(2131754398, null));
        r7 r7Var = this.r0;
        this.U = r7Var.d(14, 0, new oy8(2131623944, gl.L(24.0f), gl.L(24.0f)), k96.M0(2131753582, null), true, false, r7Var.n0);
        this.R = this.r0.e(3, 2131232410, k96.M0(2131751690, null));
        this.V = this.r0.e(15, 2131232338, k96.M0(2131746037, null));
        this.T = this.r0.d(11, 2131232200, null, k96.M0(2131748798, null), true, false, null);
        o72 o72Var = new o72(context, this, false, this.resourceProvider);
        this.f = o72Var;
        o72Var.getAvatarImageView().setRoundRadius(gl.L(16.0f));
        o72 o72Var2 = this.f;
        if ((!gl.O1() || ((ui5Var = this.parentLayout) != null && ((ActionBarLayout) ui5Var).b)) && !this.inPreviewMode) {
            z2 = true;
        } else {
            z2 = false;
        }
        o72Var2.setOccupyStatusBar(z2);
        o72 o72Var3 = this.f;
        long j = -this.a;
        if (j < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        o72Var3.b = z3;
        o72Var3.setClipChildren(false);
        this.actionBar.addView(this.f, 0, nme.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new g6(this, (byte) 17));
        }
        this.O = new cvb(this, context);
        zec zecVar = new zec(this.d);
        ViewGroup viewGroup = this.d;
        kl0 kl0Var = this.m1;
        kl0Var.h = zecVar;
        kl0Var.i = viewGroup;
        cvb cvbVar = this.O;
        cj3 cj3Var3 = this.N0;
        if (cj3Var3 != null) {
            viewGroup = (ViewGroup) cj3Var3.getFragmentView();
        }
        cvb cvbVar2 = this.O;
        Objects.requireNonNull(cvbVar2);
        this.n1 = new mdc(cvbVar, viewGroup, new ga5(cvbVar2, (byte) 2));
        this.O.E0(new km4(this, (byte) 6));
        SpannableString spannableString = new SpannableString("#");
        lm4 d = mm4.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, gl.L(2.0f), gl.L(16.0f), gl.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        dh3 dh3Var = new dh3(this, gl.G2(k96.M0(2131754718, null), spannableString, "#"), gl.G2(k96.M0(2131754720, null), spannableString, "#"));
        this.x = dh3Var;
        dh3Var.b();
        if (this.F) {
            b = 2;
        } else {
            b = 0;
        }
        this.E = b;
        dh3 dh3Var2 = this.x;
        if (b != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        dh3Var2.X = z4;
        evb evbVar = new evb(this);
        this.O.setHideIfEmpty(false);
        evbVar.m = false;
        evbVar.C = false;
        cvb cvbVar3 = this.O;
        this.J0 = evbVar;
        cvbVar3.setItemAnimator(evbVar);
        this.O.setOnScrollListener(new fvb(this, (byte) 0));
        cvb cvbVar4 = this.O;
        cvbVar4.X1 = true;
        cvbVar4.Y1 = false;
        t29 t29Var = new t29(cvbVar4, true);
        this.L0 = t29Var;
        this.O.setItemsEnterAnimator(t29Var);
        this.O.setOnItemClickListener(new f09(this, (byte) 24));
        this.O.setOnItemLongClickListener(new rub(this));
        this.O.setOnScrollListener(new fvb(this, (byte) 1));
        cvb cvbVar5 = this.O;
        tub tubVar = new tub(this);
        this.G = tubVar;
        cvbVar5.setLayoutManager(tubVar);
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new uub(this));
        pvb pvbVar = new pvb(this);
        this.Q = pvbVar;
        vub vubVar = new vub(this, pvbVar);
        this.P = vubVar;
        vubVar.h(this.O);
        this.d.addView(this.O, nme.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -gl.L(100.0f);
        un4 un4Var = new un4(this.resourceProvider, getParentActivity(), false);
        this.h = un4Var;
        this.d.addView(un4Var, un4.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final qvb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var2;
                byte b22 = r2;
                qvb qvbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        return;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        return;
                    case 3:
                        cj3 cj3Var32 = qvbVar.N0;
                        if (cj3Var32 != null && (r7Var2 = cj3Var32.k0) != null) {
                            r7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        return;
                }
            }
        });
        this.h.c.setImageResource(2131231269);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        this.h.setContentDescription(k96.M0(2131751690, null));
        pi4 pi4Var = new pi4(context, null);
        pi4Var.setViewType(24);
        pi4Var.setVisibility(8);
        pi4Var.x = true;
        ttb ttbVar = new ttb(context, (byte) 1);
        TextView textView = new TextView(context);
        ttbVar.d = textView;
        if (k96.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new cm2(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) k96.M0(2131744018, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131744018, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new cm2(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        zkb.X(textView, bkb.x6, getResourceProvider());
        boolean z5 = k96.a0;
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
        ttbVar.addView(textView, nme.d(-2, -2.0f, 81, f, 0.0f, f2, 32.0f));
        this.n = ttbVar;
        textView.setAlpha(0.0f);
        q22 q22Var = new q22(this, context, pi4Var);
        this.E0 = q22Var;
        try {
            q22Var.b.getImageReceiver().M(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(k96.M0(2131747946, null));
        X0();
        this.n.addView(pi4Var);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new ar8(context, (byte) 17);
        y5c y5cVar = new y5c(context);
        this.M = y5cVar;
        this.p0.addView(y5cVar);
        this.d.addView(this.p0, nme.e(-1, 51, 80));
        this.M.setOnClickListener(new wub(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(gl.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, nme.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131231987);
        this.X0.setContentDescription(k96.M0(2131752029, null));
        ImageView imageView2 = this.X0;
        int i3 = bkb.Te;
        imageView2.setBackground(sjb.c(null, sjb.b(getThemedColor(i3))));
        zkb.s(this.X0, i3, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, nme.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final qvb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var2;
                byte b22 = r2;
                qvb qvbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        return;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        return;
                    case 3:
                        cj3 cj3Var32 = qvbVar.N0;
                        if (cj3Var32 != null && (r7Var2 = cj3Var32.k0) != null) {
                            r7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        return;
                }
            }
        });
        this.X0.setVisibility(8);
        R0(false);
        zab zabVar = new zab((byte) 2, context, this);
        this.e = zabVar;
        if (this.N0 == null) {
            this.d.addView(zabVar, nme.e(-1, -1, 119));
        }
        mvb mvbVar = new mvb(this, context);
        this.s0 = mvbVar;
        mvbVar.setVisibility(8);
        this.e.addView(this.s0, nme.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        mvb mvbVar2 = this.s0;
        int i4 = bkb.c6;
        zkb.h(i4, getResourceProvider(), mvbVar2);
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().C0(this.a, true, null, true, false, 0);
        fj3 fj3Var = new fj3(context);
        this.V0 = fj3Var;
        fj3Var.setPadding(gl.L(11.0f), gl.L(21.0f), gl.L(11.0f), gl.L(21.0f));
        il0 c = kl0Var.c(this.V0, nod.n(this.resourceProvider), false);
        ug8.r(c, gl.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c);
        this.V0.setOnAnimatedHeightChangedListener(new km4(this, (byte) 1));
        this.d.addView(this.V0, nme.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat f3 = f();
        if (f3 != null) {
            xy1 xy1Var = new xy1(this, f3);
            this.S0 = xy1Var;
            this.V0.addView(xy1Var.b(), nme.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            xy1 xy1Var2 = this.S0;
            xy1Var2.m = new rub(this);
            TLRPC.ChatFull chatFull = this.K;
            xy1Var2.j = chatFull;
            if (chatFull != null) {
                xy1Var2.c(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.i(4, this.G0);
            this.V0.h(this.G0);
            this.V0.j(this.G0, true, false);
            p81 p81Var = new p81(this, context, this);
            this.H0 = p81Var;
            this.G0.addView(p81Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c2 = nme.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c2.topMargin = gl.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c2);
        }
        y0();
        si9 si9Var = new si9((byte) 13, context, this);
        this.Q0 = si9Var;
        si9Var.setForeground(new ColorDrawable(bm2.o(getThemedColor(i4), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final qvb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                r7 r7Var2;
                byte b22 = r2;
                qvb qvbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        return;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        return;
                    case 3:
                        cj3 cj3Var32 = qvbVar.N0;
                        if (cj3Var32 != null && (r7Var2 = cj3Var32.k0) != null) {
                            r7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        return;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && gl.O1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar = (d) it.next();
                if (dVar instanceof cj3) {
                    cj3 cj3Var4 = (cj3) dVar;
                    if (cj3Var4.H3()) {
                        zc7 zc7Var = cj3Var4.r2;
                        if (zc7Var.a == j) {
                            this.R0 = zc7Var.b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Y0(false, false);
        }
        R0(false);
        S0();
        if (hc2.R(f())) {
            getMessagesController().E0().a(j, new ae9(this, (byte) 22));
        }
        View view = this.fragmentView;
        rub rubVar = new rub(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(view, rubVar);
        return this.fragmentView;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i3 = kk7.S;
        long j = this.a;
        if (i == i3) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j) {
                R0(false);
                xy1 xy1Var = this.S0;
                if (xy1Var != null) {
                    xy1Var.j = chatFull2;
                    xy1Var.c(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i == kk7.x5) {
            R0(false);
        } else if (i == kk7.q3) {
            if (j == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i == kk7.s5) {
            if (j == ((Long) objArr[0]).longValue()) {
                Y0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    y0();
                }
                A0();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = na7.q5;
            if (intValue == 8192) {
                R0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().g4.y(j, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Y0(true, false);
                if (!canScrollVertically) {
                    this.G.m0(0);
                }
            }
        } else if (i == kk7.r) {
            Y0(false, false);
        } else if (i == kk7.v2) {
            Long l = (Long) objArr[0];
            if (j == l.longValue()) {
                this.I0 = getMessagesController().e1(l.longValue(), false, null);
                p81 p81Var = this.H0;
                if (p81Var != null) {
                    p81Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i == kk7.e0) {
            Y0(false, false);
            R0(true);
        } else if (i != kk7.t5 && i == kk7.s) {
            removeSelfFromStack(true);
        }
        if (i == kk7.g0 && getParentActivity() != null && this.inPreviewMode && gl.O1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j) && !booleanValue) {
                if (this.R0 != longValue2) {
                    this.R0 = longValue2;
                    Y0(false, false);
                }
            } else if (this.R0 != 0) {
                this.R0 = 0L;
                Y0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat f() {
        return getMessagesController().K0(Long.valueOf(this.a));
    }

    @Override
    public final fc2 getGroupCall() {
        fc2 fc2Var = this.I0;
        if (fc2Var != null && (fc2Var.b instanceof TLRPC.TL_groupCall)) {
            return fc2Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        mvb mvbVar = this.s0;
        if (mvbVar != null && mvbVar.a0 != null) {
            int i = l35.h;
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
            i = bkb.c6;
        } else {
            i = bkb.r8;
        }
        int themedColor = getThemedColor(i);
        if (this.actionBar.y()) {
            themedColor = getThemedColor(bkb.v8);
        }
        if (bm2.h(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final lx4 j() {
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
                C0();
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
            aVar.n(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        na7 messagesController = getMessagesController();
        long j = this.a;
        messagesController.Y2(0, j, true);
        long j2 = -j;
        this.e1 = getMessagesController().t4(j2);
        kk7.f(this.currentAccount).b(this, kk7.x5);
        kk7.f(this.currentAccount).b(this, kk7.q3);
        kk7.f(this.currentAccount).b(this, kk7.S);
        kk7.f(this.currentAccount).b(this, kk7.s5);
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.r);
        kk7.f(this.currentAccount).b(this, kk7.v2);
        kk7.f(this.currentAccount).b(this, kk7.e0);
        kk7.f(this.currentAccount).b(this, kk7.t5);
        kk7.f(this.currentAccount).b(this, kk7.s);
        kk7.f(this.currentAccount).b(this, kk7.g0);
        Y0(false, false);
        tx9.s(this.currentAccount);
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j));
        if (hc2.T(K0)) {
            getMessagesController().b5(K0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = s1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().h1(j2);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.P0.e();
        kk7.f(this.currentAccount).n(this, kk7.x5);
        kk7.f(this.currentAccount).n(this, kk7.q3);
        kk7.f(this.currentAccount).n(this, kk7.S);
        kk7.f(this.currentAccount).n(this, kk7.s5);
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.r);
        kk7.f(this.currentAccount).n(this, kk7.v2);
        kk7.f(this.currentAccount).n(this, kk7.e0);
        kk7.f(this.currentAccount).n(this, kk7.t5);
        kk7.f(this.currentAccount).n(this, kk7.s);
        kk7.f(this.currentAccount).n(this, kk7.g0);
        na7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        if (hc2.T(K0)) {
            getMessagesController().b5(K0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.e1) {
            this.e1 = false;
            getMessagesController().d4(-j);
        }
        cj3 cj3Var = this.N0;
        if (cj3Var != null && cj3Var.H3 != null) {
            cj3Var.getActionBar().setSearchAvatarImageView(null);
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
        pub pubVar = getMessagesController().g4;
        LongSparseIntArray longSparseIntArray = pubVar.r;
        long j = this.a;
        longSparseIntArray.put(j, longSparseIntArray.get(j, 0) + 1);
        pubVar.y(j, true);
        this.H = false;
        gl.V3(this.O);
        this.H = true;
        setBulletinDelegate(new s10(this, (byte) 21));
        if (this.inPreviewMode && !getMessagesController().r2(-j)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        if (gba.o() != 0 && this.U0) {
            O0(f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b;
        super.onThemeColorsChanged();
        ix4 ix4Var = this.l1;
        if (ix4Var != null) {
            ix4Var.a(getThemedColor(bkb.c6));
        }
        if (this.X0 != null && (b = sjb.b(getThemedColor(bkb.Te))) != this.r1) {
            this.r1 = b;
            bkb.F1(this.X0.getBackground(), b, true);
        }
        for (int i = 0; i < 2; i++) {
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(bkb.F8), true);
            this.actionBar.J(getThemedColor(bkb.D8), false, true);
            this.actionBar.J(getThemedColor(bkb.E8), true, true);
            this.actionBar.K(getThemedColor(bkb.H5), true);
        }
        si9 si9Var = this.Q0;
        if (si9Var != null && (si9Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(bm2.o(getThemedColor(bkb.c6), 100));
        }
        S0();
        try {
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setActionModeColor(getThemedColor(bkb.c6));
            }
            dh3 dh3Var = this.x;
            if (dh3Var != null) {
                dh3Var.h();
            }
            if (this.actionBar != null && this.c1) {
                W0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(bkb.x8));
            }
            r7 r7Var = this.q0;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.q0.getSearchField().setCursorColor(getThemedColor(bkb.Me));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        rh3 rh3Var;
        si9 si9Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (si9Var = this.Q0) != null) {
            if (si9Var.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z) {
            z0(false);
        }
        this.P0.e();
        if (!z) {
            if (this.u0 && this.I) {
                removeSelfFromStack();
                cj3 cj3Var = this.M0;
                if (cj3Var != null) {
                    cj3Var.removeSelfFromStack();
                }
            } else if (this.J) {
                removeSelfFromStack();
                cj3 cj3Var2 = this.N0;
                if (cj3Var2 != null && (rh3Var = cj3Var2.H3) != null && rh3Var.c()) {
                    this.N0.H3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        si9 si9Var = this.Q0;
        if (si9Var != null && si9Var.getVisibility() == 0) {
            si9 si9Var2 = this.Q0;
            if (z) {
                si9Var2.setAlpha(1.0f - f);
            } else {
                si9Var2.setAlpha(f);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.P0.d();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.U0 = true;
            N0(true);
            return;
        }
        this.U0 = false;
        N0(false);
        O0(1.0f);
    }

    @Override
    public final o72 q() {
        return this.f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f) {
        o72 o72Var = this.f;
        if (o72Var != null) {
            o72Var.setAlpha(f);
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
        o72 o72Var = this.f;
        if (o72Var != null) {
            o72Var.setAlpha(f);
            this.f.setTranslationX((1.0f - f) * gl.L(40.0f));
        }
    }

    @Override
    public final void v() {
        this.O.z0(0);
    }

    public final void w0(boolean z) {
        float f;
        boolean z2;
        rh3 rh3Var;
        this.t0 = z;
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Z0.cancel();
        }
        if (this.b1 == null) {
            vec l = this.s0.l(8, false);
            this.b1 = l;
            if (this.N0 != null) {
                zkb.h(bkb.c6, getResourceProvider(), l);
            }
            this.e.addView(this.b1, nme.c(44.0f, -1));
        }
        float f2 = this.X;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.Z0 = ValueAnimator.ofFloat(f2, f);
        gl.T3(this.s0, false, 1.0f, true, true);
        cj3 cj3Var = this.N0;
        if (cj3Var != null && (rh3Var = cj3Var.H3) != null) {
            rh3Var.N = !z;
        }
        if (!z && this.s0.getVisibility() == 0 && this.s0.getAlpha() == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a1 = z2;
        this.Z0.addUpdateListener(new gja(this, (byte) 27));
        this.s0.setVisibility(0);
        if (!z) {
            this.r0.setVisibility(0);
        } else {
            gl.V2(getParentActivity(), this.classGuid);
            T0(false);
        }
        this.Z0.addListener(new avb(this, z, (byte) 0));
        this.Z0.setDuration(200L);
        this.Z0.setInterpolator(s33.f);
        this.Z0.start();
        kk7.e().k(kk7.t4, Boolean.TRUE);
    }

    public final void x0() {
        cq3 cq3Var;
        View view;
        a aVar;
        float f;
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (cq3Var = this.i1) != null) {
            int L = gl.L(48.0f);
            int L2 = gl.L(48.0f) + ((int) this.V0.c(gl.L(14.0f)));
            cj3 cj3Var = this.N0;
            if (cj3Var != null) {
                view = cj3Var.fragmentView;
                aVar = cj3Var.getActionBar();
            } else {
                view = this.fragmentView;
                aVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.h1) - gl.L(8.0f);
            this.p1.set(0.0f, -L, view.getMeasuredWidth(), aVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.q1;
            rectF.set(0.0f, measuredHeight - gl.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (e66.e(262144)) {
                f = 0.0f;
            } else {
                f = -gl.L(48.0f);
            }
            rectF.inset(0.0f, f);
            if (this.N0 != null) {
                i = 2;
            } else {
                i = 1;
            }
            cq3Var.g(i, this.o1);
            cq3Var.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void y0() {
        tub tubVar;
        pub pubVar = this.s;
        long j = this.a;
        if (!pubVar.e(j) && (tubVar = this.G) != null) {
            int M0 = tubVar.M0();
            if (this.b.isEmpty() || M0 >= this.r.b() - 5) {
                pubVar.o(j);
            }
            A0();
        }
    }

    public final void z0(boolean z) {
        String str;
        na7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        TLRPC.ChatFull L0 = getMessagesController().L0(j);
        fc2 fc2Var = this.I0;
        if (fc2Var != null && ((str = this.z0) != null || this.A0)) {
            rgc.l(K0, str, false, Boolean.valueOf(!fc2Var.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else if (this.z0 != null && z && L0 != null && L0.call == null && this.fragmentView != null && getParentActivity() != null) {
            ir2.v(null, 2131748721, u21.b0(this), 2131624080, 36);
            this.z0 = null;
        }
    }

    @Override
    public final void s() {
    }

    @Override
    public final void J(int i, int i2, int i3, int i4, boolean z, boolean z2) {
    }
}

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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class tzb extends e implements fn7, kz1, ej6 {
    public static final HashSet s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public byte E;
    public h32 E0;
    public boolean F;
    public izb F0;
    public uyb G;
    public FrameLayout G0;
    public boolean H;
    public y81 H0;
    public boolean I;
    public vc2 I0;
    public boolean J;
    public gzb J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public i69 L0;
    public y9c M;
    public uj3 M0;
    public boolean N;
    public uj3 N0;
    public ezb O;
    public boolean O0;
    public wyb P;
    public final pn P0;
    public szb Q;
    public nf9 Q0;
    public b8 R;
    public long R0;
    public b8 S;
    public pz1 S0;
    public b8 T;
    public float T0;
    public b8 U;
    public boolean U0;
    public b8 V;
    public xj3 V0;
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
    public uic b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public zyb d;
    public NumberTextView d0;
    public qzb d1;
    public h8b e;
    public s7 e0;
    public boolean e1;
    public f82 f;
    public s7 f0;
    public int f1;
    public s7 g0;
    public int g1;
    public zp4 h;
    public s7 h0;
    public int h1;
    public s7 i0;
    public final tq3 i1;
    public s7 j0;
    public final rz4 j1;
    public b8 k0;
    public final rz4 k1;
    public b8 l0;
    public final oz4 l1;
    public b8 m0;
    public final ll0 m1;
    public uxb n;
    public s7 n0;
    public lhc n1;
    public RadialProgressView o0;
    public final ArrayList o1;
    public ir8 p0;
    public final RectF p1;
    public s7 q0;
    public final RectF q1;
    public final jzb r;
    public s7 r0;
    public int r1;
    public final qyb s;
    public ozb s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public uzb w;
    public final boolean w0;
    public xh3 x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public tzb(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        this.r = new jzb(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new pn(new int[]{jn7.t5});
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
        this.W0 = !qu6.v("topics_end_reached_", j, getUserConfig().j(), false);
        oz4 oz4Var = new oz4();
        this.l1 = oz4Var;
        oz4Var.a(getThemedColor(aob.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.i1 = new tq3(false);
            this.j1 = new rz4(null);
            rz4 rz4Var = new rz4(null);
            this.k1 = rz4Var;
            ll0 ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
            this.m1 = ll0Var;
            ll0Var.k = true;
            return;
        }
        this.i1 = null;
        this.j1 = null;
        this.k1 = null;
        this.m1 = new ll0(oz4Var, oz4Var, oz4Var);
    }

    public static e F0(uc7 uc7Var, jf7 jf7Var, Bundle bundle) {
        long j = bundle.getLong("chat_id");
        if (j != 0) {
            TLRPC.Dialog S0 = uc7Var.S0(-j);
            if (S0 != null && S0.view_forum_as_messages) {
                return new zu1(bundle);
            }
            TLRPC.ChatFull N0 = uc7Var.N0(j);
            if (N0 == null) {
                N0 = jf7Var.C0(j, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new zu1(bundle);
            }
        }
        return new tzb(bundle);
    }

    public static e G0(LaunchActivity launchActivity, Bundle bundle) {
        return F0(uc7.s1(launchActivity.P), jf7.Y(launchActivity.P), bundle);
    }

    public static void M0(defpackage.zu1 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzb.M0(zu1):void");
    }

    public static int p0(tzb tzbVar) {
        return tzbVar.currentAccount;
    }

    @Override
    public final rz4 A() {
        return this.k1;
    }

    public final void A0(boolean z) {
        String str;
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        TLRPC.ChatFull N0 = getMessagesController().N0(j);
        vc2 vc2Var = this.I0;
        if (vc2Var != null && ((str = this.z0) != null || this.A0)) {
            xkc.l(M0, str, false, Boolean.valueOf(!vc2Var.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else if (this.z0 != null && z && N0 != null && N0.call == null && this.fragmentView != null && getParentActivity() != null) {
            bs2.v(null, 2131748667, d31.b0(this), 2131624080, 36);
            this.z0 = null;
        }
    }

    public final void B0() {
        boolean z;
        qyb qybVar = this.s;
        zh6 zh6Var = qybVar.a;
        LongSparseIntArray longSparseIntArray = qybVar.c;
        long j = this.a;
        if (longSparseIntArray.get(j, 0) == 1 && (zh6Var.f(j) == null || ((ArrayList) zh6Var.f(j)).isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        this.K0 = z;
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((kzb) arrayList.get(0)).c != null && ((kzb) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        ezb ezbVar = this.O;
        if (ezbVar != null) {
            ezbVar.M0(ezbVar.x1());
        }
        U0(true);
    }

    @Override
    public final wma C() {
        return this.d;
    }

    public final void C0() {
        int i;
        float f;
        float f2;
        uj3 uj3Var = this.N0;
        float f3 = 0.0f;
        if (uj3Var != null) {
            int L = hl.L(14.0f);
            xj3 xj3Var = uj3Var.L1;
            if (xj3Var != null) {
                f = xj3Var.c(L);
            } else {
                f = 0.0f;
            }
            float f4 = f + 0.0f;
            xj3 xj3Var2 = this.V0;
            if (xj3Var2 != null) {
                float L2 = hl.L(7.0f);
                xj3 xj3Var3 = this.N0.L1;
                if (xj3Var3 != null) {
                    f2 = xj3Var3.getMetadata().c.a;
                } else {
                    f2 = 0.0f;
                }
                xj3Var2.setTranslationY(f4 - (f2 * L2));
                xj3 xj3Var4 = this.V0;
                int L3 = hl.L(14.0f);
                int L4 = hl.L(7.0f);
                xj3 xj3Var5 = this.N0.L1;
                if (xj3Var5 != null) {
                    f3 = xj3Var5.getMetadata().c.a;
                }
                f3 = xj3Var4.c(hl.U1(f3, L3, L4)) + f4;
            } else {
                f3 = f4;
            }
        } else {
            xj3 xj3Var6 = this.V0;
            if (xj3Var6 != null) {
                f3 = 0.0f + xj3Var6.c(hl.L(14.0f));
            }
        }
        int i2 = this.h1 + this.f1;
        if (this.W) {
            i = hl.L(51.0f);
        } else {
            i = 0;
        }
        this.O.setPadding(0, (int) f3, 0, i2 + i);
    }

    public final void D0() {
        this.b0.clear();
        this.actionBar.y();
        hl.V3(this.O);
        V0();
    }

    public final void E0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = ob6.J0(hashSet.size(), "DeleteTopics");
        id idVar = alertDialog$Builder.a;
        idVar.S = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            idVar.U = ob6.a0(null, null, 2131751463, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            idVar.U = ob6.M0(2131751462, null);
        }
        alertDialog$Builder.j(ob6.M0(2131751563, null), new pt(this, hashSet, arrayList, runnable, (byte) 26));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new grb((byte) 3));
        idVar.show();
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, getResourceProvider());
        }
    }

    public final void H0(boolean z, boolean z2) {
        boolean z3 = true;
        this.h.e(!z, (this.fragmentBeginToShow && z2) ? false : false);
    }

    public final void I0(View view) {
        long j;
        if (getParentLayout() != null && !((ActionBarLayout) getParentLayout()).w() && (view instanceof qzb)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((qzb) view).O;
            uc7 messagesController = getMessagesController();
            long j2 = this.a;
            long j3 = -j2;
            boolean B2 = messagesController.B2(j3);
            if (tL_forumTopic == null) {
                j = 0;
            } else if (B2) {
                j = wf3.n(tL_forumTopic.from_id);
            } else {
                j = tL_forumTopic.id;
            }
            if (this.u0) {
                uzb uzbVar = this.w;
                if (uzbVar != null) {
                    wzb wzbVar = uzbVar.a;
                    Bundle bundle = new Bundle();
                    zzb zzbVar = wzbVar.a;
                    bundle.putLong("dialog_id", zzbVar.c);
                    bundle.putLong("topic_id", tL_forumTopic.id);
                    bundle.putBoolean("exception", true);
                    zu8 zu8Var = new zu8(bundle, null);
                    zu8Var.s = new yw9(wzbVar, tL_forumTopic, (byte) 15);
                    zzbVar.presentFragment(zu8Var);
                }
                uj3 uj3Var = this.M0;
                if (uj3Var != null) {
                    uj3Var.k3(j3, j, true, this);
                }
            } else if (this.b0.size() > 0) {
                R0(view);
            } else {
                if (this.inPreviewMode && hl.O1()) {
                    for (e eVar : getParentLayout().getFragmentStack()) {
                        if (eVar instanceof uj3) {
                            uj3 uj3Var2 = (uj3) eVar;
                            if (uj3Var2.J3()) {
                                if7 if7Var = uj3Var2.r2;
                                if (if7Var.a == j3 && if7Var.b == j) {
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
                ro4.n(this, j2, tL_forumTopic, 0);
            }
        }
    }

    public final boolean J0(View view, float f) {
        if (this.u0 || getParentLayout() == null || ((ActionBarLayout) getParentLayout()).w()) {
            return false;
        }
        if (!this.actionBar.z() && !hl.O1() && (view instanceof qzb)) {
            qzb qzbVar = (qzb) view;
            if (qzbVar.a0(f)) {
                Q0(qzbVar);
                this.O.K0(true);
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
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).W3.edit();
        edit.putLong("dialog_join_requested_time_" + (-this.a), System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean V = xc2.V(e());
        int i = jw5.t1;
        jw5.F0(parentActivity, this, d31.b0(this), V);
        S0(true);
        return false;
    }

    public final void L0(boolean z) {
        int i;
        TLRPC.Chat e;
        TLRPC.ChatPhoto chatPhoto;
        if (z && (e = e()) != null && ((chatPhoto = e.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.r3(this.K);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().C() && z) {
            i = 2;
        } else {
            i = 1;
        }
        profileActivity.y3(i);
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
            y9c y9cVar = this.M;
            if (i == 0) {
                i2 = aob.sf;
            } else {
                i2 = aob.q7;
            }
            y9cVar.setTextColorKey(i2);
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
        if (xea.o() == 0) {
            return;
        }
        zyb zybVar = this.d;
        if (zybVar != null) {
            if (z) {
                zybVar.setLayerType(2, null);
                zybVar.setClipChildren(false);
                zybVar.setClipToPadding(false);
            } else {
                zybVar.setLayerType(0, null);
                zybVar.setClipChildren(true);
                zybVar.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f) {
        if (xea.o() != 0) {
            this.T0 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            ezb ezbVar = this.O;
            if (ezbVar != null) {
                float B = qu6.B(1.0f, this.T0, 0.05f, 1.0f);
                ezbVar.setPivotX(0.0f);
                ezbVar.setPivotY(0.0f);
                ezbVar.setScaleX(B);
                ezbVar.setScaleY(B);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(B);
                this.actionBar.setScaleY(B);
            }
        }
    }

    public final void Q0(of3 of3Var) {
        boolean z;
        long j;
        try {
            of3Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r3 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232580, 1, getResourceProvider(), getParentActivity())};
        final TLRPC.TL_forumTopic tL_forumTopic = of3Var.O;
        oc2 oc2Var = new oc2(getParentActivity(), this.currentAccount, r3[0].getSwipeBack(), false, new yyb(this, tL_forumTopic), getResourceProvider());
        int b = r3[0].b(oc2Var.f);
        oc2Var.o = true;
        long j2 = this.a;
        long j3 = -j2;
        oc2Var.e(j3, tL_forumTopic.id, null);
        if (xc2.y(15, e())) {
            b8 b8Var = new b8(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                b8Var.j(ob6.M0(2131751417, null), 2131232418, null);
            } else {
                b8Var.j(ob6.M0(2131751418, null), 2131232298, null);
            }
            b8Var.setMinimumWidth(160);
            z = false;
            b8Var.setOnClickListener(new View.OnClickListener(this) {
                public final tzb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    tzb tzbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            tzb tzbVar2 = this.b;
                            tzbVar2.D0 = true;
                            tzbVar2.O0 = true;
                            tzbVar2.s.t(tzbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, tzbVar2);
                            tzbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            tzbVar.O0 = true;
                            tzbVar.s.z(tL_forumTopic2.id, tzbVar.a, !tL_forumTopic2.closed);
                            tzbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            tzbVar.E0(hashSet, new po4(tzbVar, (byte) 5));
                            return;
                    }
                }
            });
            r3[0].addView(b8Var);
        } else {
            z = false;
        }
        b8 b8Var2 = new b8(getParentActivity(), z, z);
        if (getMessagesController().p2(j3, tL_forumTopic.id, null)) {
            b8Var2.j(ob6.M0(2131743504, null), 2131232261, null);
        } else {
            b8Var2.j(ob6.M0(2131748068, null), 2131232417, null);
        }
        b8Var2.setMinimumWidth(160);
        b8Var2.setOnClickListener(new jf(this, tL_forumTopic, (Serializable) r3, b, (byte) 7));
        boolean z2 = false;
        r3[0].addView(b8Var2);
        if (xc2.i(this.currentAccount, e(), tL_forumTopic)) {
            b8 b8Var3 = new b8(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                b8Var3.j(ob6.M0(2131745811, null), 2131232411, null);
            } else {
                b8Var3.j(ob6.M0(2131752004, null), 2131232409, null);
            }
            b8Var3.setMinimumWidth(160);
            b8Var3.setOnClickListener(new View.OnClickListener(this) {
                public final tzb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    tzb tzbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            tzb tzbVar2 = this.b;
                            tzbVar2.D0 = true;
                            tzbVar2.O0 = true;
                            tzbVar2.s.t(tzbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, tzbVar2);
                            tzbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            tzbVar.O0 = true;
                            tzbVar.s.z(tL_forumTopic2.id, tzbVar.a, !tL_forumTopic2.closed);
                            tzbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            tzbVar.E0(hashSet, new po4(tzbVar, (byte) 5));
                            return;
                    }
                }
            });
            z2 = false;
            r3[0].addView(b8Var3);
        }
        if (xc2.e(this.currentAccount, e(), tL_forumTopic)) {
            b8 b8Var4 = new b8(getParentActivity(), z2, true);
            b8Var4.j(ob6.J0(1, "DeleteTopics"), 2131232113, null);
            b8Var4.c(aob.q7, aob.p7);
            b8Var4.setMinimumWidth(160);
            b8Var4.setOnClickListener(new View.OnClickListener(this) {
                public final tzb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b2 = r3;
                    tzb tzbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            tzb tzbVar2 = this.b;
                            tzbVar2.D0 = true;
                            tzbVar2.O0 = true;
                            tzbVar2.s.t(tzbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, tzbVar2);
                            tzbVar2.finishPreviewFragment();
                            return;
                        case 1:
                            tzbVar.O0 = true;
                            tzbVar.s.z(tL_forumTopic2.id, tzbVar.a, !tL_forumTopic2.closed);
                            tzbVar.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            tzbVar.E0(hashSet, new po4(tzbVar, (byte) 5));
                            return;
                    }
                }
            });
            r3[0].addView(b8Var4);
        }
        boolean B2 = getMessagesController().B2(j3);
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
            this.parentLayout.getOverlayContainerView().addView(this.Q0, tre.c(-1.0f, -1));
        }
        zu1 zu1Var = new zu1(qu6.k(j2, "chat_id"));
        TLRPC.TL_forumTopic tL_forumTopic2 = of3Var.O;
        if (B2) {
            j = wf3.n(tL_forumTopic2.from_id);
        } else {
            j = tL_forumTopic2.id;
        }
        ro4.a(zu1Var, if7.a(j3, j));
        presentFragmentAsPreviewWithMenu(zu1Var, r3[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzb.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzb.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(aob.sf));
        this.h.updateColors();
        ir8 ir8Var = this.p0;
        int i = aob.d6;
        ir8Var.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(getThemedColor(i));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(aob.s8));
        }
        this.s0.setBackgroundColor(getThemedColor(i));
    }

    public final void U0(boolean z) {
        boolean z2;
        if (this.R == null) {
            return;
        }
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        int i = 0;
        if (!xc2.r0(getMessagesController().M0(Long.valueOf(j))) && xc2.w(15, M0) && !this.t0 && !this.u0 && !this.K0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.L = z2;
        b8 b8Var = this.R;
        if (!z2) {
            i = 8;
        }
        b8Var.setVisibility(i);
        H0(!this.L, z);
    }

    public final void V0() {
        boolean z;
        if (xc2.y(15, e()) && !this.b0.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (this.c0 != z) {
            this.c0 = z;
            jzb jzbVar = this.r;
            jzbVar.l(0, jzbVar.b());
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        return false;
    }

    public final void W0(float f) {
        this.X = f;
        X0();
        this.c1 = true;
        float f2 = 1.0f - f;
        this.f.getTitleTextView().setAlpha(f2);
        this.f.getSubtitleTextView().setAlpha(f2);
        uic uicVar = this.b1;
        if (uicVar != null) {
            uicVar.setTranslationY((-hl.L(16.0f)) * f2);
            this.b1.setAlpha(f);
        }
        this.s0.setTranslationY((-hl.L(16.0f)) * f2);
        this.s0.setAlpha(f);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f2);
        if (this.a1) {
            float A = qd4.A(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(A);
            this.O.setScaleY(A);
        }
    }

    public final void X0() {
        int themedColor = getThemedColor(aob.v8);
        a aVar = this.actionBar;
        int i = aob.y8;
        aVar.H(vm2.f(this.X, themedColor, getThemedColor(i)), false);
        this.actionBar.H(vm2.f(this.X, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(vm2.f(this.X, getThemedColor(aob.t8), getThemedColor(aob.z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(vm2.f(this.X, getThemedColor(aob.s8), getThemedColor(aob.d6)));
        }
    }

    public final void Y0() {
        h32 h32Var = this.E0;
        if (h32Var != null && h32Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            wm2 wm2Var = new wm2(2131231247, 0);
            wm2Var.c(hl.L(16.0f));
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
            if (xc2.y(15, e())) {
                this.E0.e.setText(hl.G2(hl.S2(ob6.M0(2131747867, null)), spannableStringBuilder, "%s"));
                return;
            }
            String M0 = ob6.M0(2131750435, null);
            TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.a, 1L);
            if (f != null) {
                M0 = f.title;
            }
            this.E0.e.setText(hl.S2(ob6.a0("NoTopicsDescriptionUser", null, 2131747866, M0)));
        }
    }

    public final void Z0(boolean z, boolean z2) {
        uyb uybVar;
        gzb gzbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z && this.O0) {
            z = true;
        }
        this.O0 = false;
        qyb qybVar = this.s;
        long j = this.a;
        ArrayList l = qybVar.l(j);
        if (l != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            gzb gzbVar2 = null;
            if (lbc.w(uc7.s1(this.currentAccount).X1(Long.valueOf(-j))) && this.v0) {
                arrayList.add(new kzb(3, null));
            }
            for (int i = 0; i < l.size(); i++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList.add(new kzb(0, (TLRPC.TL_forumTopic) l.get(i)));
                }
            }
            if (!arrayList.isEmpty() && !qybVar.e(j) && this.W0) {
                arrayList.add(new kzb(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.L0.b(size + 4);
                z = false;
            }
            this.y = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                kzb kzbVar = (kzb) arrayList.get(i2);
                if (kzbVar != null && (tL_forumTopic = kzbVar.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            ezb ezbVar = this.O;
            if (ezbVar != null) {
                o79 itemAnimator = ezbVar.getItemAnimator();
                if (z) {
                    gzbVar = this.J0;
                } else {
                    gzbVar = null;
                }
                if (itemAnimator != gzbVar) {
                    ezb ezbVar2 = this.O;
                    if (z) {
                        gzbVar2 = this.J0;
                    }
                    ezbVar2.setItemAnimator(gzbVar2);
                }
            }
            jzb jzbVar = this.r;
            if (jzbVar != null) {
                jzbVar.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (uybVar = this.G) != null) {
                uybVar.g1(0, 0);
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
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public final long c() {
        return 0L;
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
        wk5 wk5Var;
        wk5 wk5Var2;
        uj3 uj3Var = this.N0;
        if (uj3Var != null && uj3Var.X) {
            i = hl.L(72.0f);
        } else {
            i = 0;
        }
        this.f1 = i;
        uj3 uj3Var2 = this.N0;
        if (uj3Var2 != null && uj3Var2.X) {
            i2 = hl.L(64.0f);
        } else {
            i2 = 0;
        }
        this.g1 = i2;
        zyb zybVar = new zyb(this, context);
        this.d = zybVar;
        this.fragmentView = zybVar;
        yob.h(aob.d6, getResourceProvider(), zybVar);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        a aVar = this.actionBar;
        if ((!hl.O1() || ((wk5Var2 = this.parentLayout) != null && ((ActionBarLayout) wk5Var2).b)) && !this.inPreviewMode) {
            z = true;
        } else {
            z = false;
        }
        aVar.setOccupyStatusBar(z);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setActionBarMenuOnItemClick(new dzb(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final tzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s7 s7Var;
                byte b2 = r2;
                tzb tzbVar = this.b;
                switch (b2) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        return;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        return;
                    case 3:
                        uj3 uj3Var3 = tzbVar.N0;
                        if (uj3Var3 != null && (s7Var = uj3Var3.k0) != null) {
                            s7Var.performClick();
                            return;
                        }
                        return;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        return;
                }
            }
        });
        s6 u = this.actionBar.u();
        if (this.N0 != null) {
            s7 a = u.a(0, 2131232502);
            this.q0 = a;
            a.setOnClickListener(new View.OnClickListener(this) {
                public final tzb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    s7 s7Var;
                    byte b2 = r2;
                    tzb tzbVar = this.b;
                    switch (b2) {
                        case 0:
                            if (!tzbVar.t0) {
                                tzbVar.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                            tzbVar.S0(false);
                            return;
                        case 2:
                            tzbVar.finishPreviewFragment();
                            return;
                        case 3:
                            uj3 uj3Var3 = tzbVar.N0;
                            if (uj3Var3 != null && (s7Var = uj3Var3.k0) != null) {
                                s7Var.performClick();
                                return;
                            }
                            return;
                        default:
                            tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                            return;
                    }
                }
            });
        } else {
            s7 a2 = u.a(0, 2131232502);
            this.q0 = a2;
            a2.N();
            a2.K(new r10(this, (byte) 24));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(ob6.M0(2131745564, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            yob.X(searchField, aob.G6, getResourceProvider());
            yob.D(searchField, aob.Jj, getResourceProvider());
            yob.v(searchField, aob.Ne, getResourceProvider());
        }
        s7 b2 = u.b(0, 2131231247, null);
        this.r0 = b2;
        b2.setContentDescription(ob6.M0(2131754834, null));
        this.r0.e(1, 2131232118, ob6.M0(2131743659, null));
        this.S = this.r0.e(2, 2131232050, ob6.M0(2131754394, null));
        s7 s7Var = this.r0;
        this.U = s7Var.d(14, 0, new b29(2131623944, hl.L(24.0f), hl.L(24.0f)), ob6.M0(2131753578, null), true, false, s7Var.n0);
        this.R = this.r0.e(3, 2131232410, ob6.M0(2131751667, null));
        this.V = this.r0.e(15, 2131232338, ob6.M0(2131745957, null));
        this.T = this.r0.d(11, 2131232200, null, ob6.M0(2131748744, null), true, false, null);
        f82 f82Var = new f82(context, this, false, this.resourceProvider);
        this.f = f82Var;
        f82Var.getAvatarImageView().setRoundRadius(hl.L(16.0f));
        f82 f82Var2 = this.f;
        if ((!hl.O1() || ((wk5Var = this.parentLayout) != null && ((ActionBarLayout) wk5Var).b)) && !this.inPreviewMode) {
            z2 = true;
        } else {
            z2 = false;
        }
        f82Var2.setOccupyStatusBar(z2);
        f82 f82Var3 = this.f;
        long j = -this.a;
        if (j < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f82Var3.b = z3;
        f82Var3.setClipChildren(false);
        this.actionBar.addView(this.f, 0, tre.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new h6(this, (byte) 17));
        }
        this.O = new ezb(this, context);
        yic yicVar = new yic(this.d);
        ViewGroup viewGroup = this.d;
        ll0 ll0Var = this.m1;
        ll0Var.h = yicVar;
        ll0Var.i = viewGroup;
        ezb ezbVar = this.O;
        uj3 uj3Var3 = this.N0;
        if (uj3Var3 != null) {
            viewGroup = (ViewGroup) uj3Var3.getFragmentView();
        }
        ezb ezbVar2 = this.O;
        Objects.requireNonNull(ezbVar2);
        this.n1 = new lhc(ezbVar, viewGroup, new hc5(ezbVar2, (byte) 2));
        this.O.F0(new po4(this, (byte) 6));
        SpannableString spannableString = new SpannableString("#");
        qo4 d = ro4.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, hl.L(2.0f), hl.L(16.0f), hl.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        xh3 xh3Var = new xh3(this, hl.G2(ob6.M0(2131754714, null), spannableString, "#"), hl.G2(ob6.M0(2131754716, null), spannableString, "#"));
        this.x = xh3Var;
        xh3Var.b();
        if (this.F) {
            b = 2;
        } else {
            b = 0;
        }
        this.E = b;
        xh3 xh3Var2 = this.x;
        if (b != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        xh3Var2.X = z4;
        gzb gzbVar = new gzb(this);
        this.O.setHideIfEmpty(false);
        gzbVar.m = false;
        gzbVar.C = false;
        ezb ezbVar3 = this.O;
        this.J0 = gzbVar;
        ezbVar3.setItemAnimator(gzbVar);
        this.O.setOnScrollListener(new hzb(this, (byte) 0));
        ezb ezbVar4 = this.O;
        ezbVar4.X1 = true;
        ezbVar4.Y1 = false;
        i69 i69Var = new i69(ezbVar4, true);
        this.L0 = i69Var;
        this.O.setItemsEnterAnimator(i69Var);
        this.O.setOnItemClickListener(new t39(this, (byte) 24));
        this.O.setOnItemLongClickListener(new syb(this));
        this.O.setOnScrollListener(new hzb(this, (byte) 1));
        ezb ezbVar5 = this.O;
        uyb uybVar = new uyb(this);
        this.G = uybVar;
        ezbVar5.setLayoutManager(uybVar);
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new vyb(this));
        szb szbVar = new szb(this);
        this.Q = szbVar;
        wyb wybVar = new wyb(this, szbVar);
        this.P = wybVar;
        wybVar.h(this.O);
        this.d.addView(this.O, tre.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -hl.L(100.0f);
        zp4 zp4Var = new zp4(this.resourceProvider, getParentActivity(), false);
        this.h = zp4Var;
        this.d.addView(zp4Var, zp4.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final tzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s7 s7Var2;
                byte b22 = r2;
                tzb tzbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        return;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        return;
                    case 3:
                        uj3 uj3Var32 = tzbVar.N0;
                        if (uj3Var32 != null && (s7Var2 = uj3Var32.k0) != null) {
                            s7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        return;
                }
            }
        });
        this.h.c.setImageResource(2131231269);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        this.h.setContentDescription(ob6.M0(2131751667, null));
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(24);
        tk4Var.setVisibility(8);
        tk4Var.x = true;
        uxb uxbVar = new uxb(context, (byte) 1);
        TextView textView = new TextView(context);
        uxbVar.d = textView;
        if (ob6.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new wm2(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131743912, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131743912, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new wm2(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        yob.X(textView, aob.y6, getResourceProvider());
        boolean z5 = ob6.a0;
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
        uxbVar.addView(textView, tre.d(-2, -2.0f, 81, f, 0.0f, f2, 32.0f));
        this.n = uxbVar;
        textView.setAlpha(0.0f);
        h32 h32Var = new h32(this, context, tk4Var);
        this.E0 = h32Var;
        try {
            h32Var.b.getImageReceiver().M(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(ob6.M0(2131747869, null));
        Y0();
        this.n.addView(tk4Var);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new ir8(context, (byte) 18);
        y9c y9cVar = new y9c(context);
        this.M = y9cVar;
        this.p0.addView(y9cVar);
        this.d.addView(this.p0, tre.e(-1, 51, 80));
        this.M.setOnClickListener(new xyb(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(hl.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, tre.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131231987);
        this.X0.setContentDescription(ob6.M0(2131752006, null));
        ImageView imageView2 = this.X0;
        int i3 = aob.Ue;
        imageView2.setBackground(rnb.c(null, rnb.b(getThemedColor(i3))));
        yob.s(this.X0, i3, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, tre.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final tzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s7 s7Var2;
                byte b22 = r2;
                tzb tzbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        return;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        return;
                    case 3:
                        uj3 uj3Var32 = tzbVar.N0;
                        if (uj3Var32 != null && (s7Var2 = uj3Var32.k0) != null) {
                            s7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        return;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        h8b h8bVar = new h8b((byte) 4, context, this);
        this.e = h8bVar;
        if (this.N0 == null) {
            this.d.addView(h8bVar, tre.e(-1, -1, 119));
        }
        ozb ozbVar = new ozb(this, context);
        this.s0 = ozbVar;
        ozbVar.setVisibility(8);
        this.e.addView(this.s0, tre.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        ozb ozbVar2 = this.s0;
        int i4 = aob.d6;
        yob.h(i4, getResourceProvider(), ozbVar2);
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().C0(this.a, true, null, true, false, 0);
        xj3 xj3Var = new xj3(context);
        this.V0 = xj3Var;
        xj3Var.setPadding(hl.L(11.0f), hl.L(21.0f), hl.L(11.0f), hl.L(21.0f));
        jl0 c = ll0Var.c(this.V0, dtd.n(this.resourceProvider), false);
        ik8.r(c, hl.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c);
        this.V0.setOnAnimatedHeightChangedListener(new po4(this, (byte) 1));
        this.d.addView(this.V0, tre.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat e = e();
        if (e != null) {
            pz1 pz1Var = new pz1(this, e);
            this.S0 = pz1Var;
            this.V0.addView(pz1Var.b(), tre.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            pz1 pz1Var2 = this.S0;
            pz1Var2.m = new syb(this);
            TLRPC.ChatFull chatFull = this.K;
            pz1Var2.j = chatFull;
            if (chatFull != null) {
                pz1Var2.c(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.i(4, this.G0);
            this.V0.h(this.G0);
            this.V0.j(this.G0, true, false);
            y81 y81Var = new y81(this, context, this);
            this.H0 = y81Var;
            this.G0.addView(y81Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c2 = tre.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c2.topMargin = hl.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c2);
        }
        z0();
        nf9 nf9Var = new nf9((byte) 14, context, this);
        this.Q0 = nf9Var;
        nf9Var.setForeground(new ColorDrawable(vm2.o(getThemedColor(i4), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final tzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                s7 s7Var2;
                byte b22 = r2;
                tzb tzbVar = this.b;
                switch (b22) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        return;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        return;
                    case 3:
                        uj3 uj3Var32 = tzbVar.N0;
                        if (uj3Var32 != null && (s7Var2 = uj3Var32.k0) != null) {
                            s7Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        return;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && hl.O1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar instanceof uj3) {
                    uj3 uj3Var4 = (uj3) eVar;
                    if (uj3Var4.J3()) {
                        if7 if7Var = uj3Var4.r2;
                        if (if7Var.a == j) {
                            this.R0 = if7Var.b;
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
        if (xc2.R(e())) {
            getMessagesController().G0().a(j, new sh9(this, (byte) 22));
        }
        View view = this.fragmentView;
        syb sybVar = new syb(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view, sybVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i3 = jn7.T;
        long j = this.a;
        if (i == i3) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j) {
                S0(false);
                pz1 pz1Var = this.S0;
                if (pz1Var != null) {
                    pz1Var.j = chatFull2;
                    pz1Var.c(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                A0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i == jn7.y5) {
            S0(false);
        } else if (i == jn7.r3) {
            if (j == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i == jn7.t5) {
            if (j == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    z0();
                }
                B0();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = uc7.r5;
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
        } else if (i == jn7.r) {
            Z0(false, false);
        } else if (i == jn7.w2) {
            Long l = (Long) objArr[0];
            if (j == l.longValue()) {
                this.I0 = getMessagesController().g1(l.longValue(), false, null);
                y81 y81Var = this.H0;
                if (y81Var != null) {
                    y81Var.a(!this.fragmentBeginToShow);
                }
                A0(false);
            }
        } else if (i == jn7.f0) {
            Z0(false, false);
            S0(true);
        } else if (i != jn7.u5 && i == jn7.s) {
            removeSelfFromStack(true);
        }
        if (i == jn7.h0 && getParentActivity() != null && this.inPreviewMode && hl.O1()) {
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
    public final TLRPC.Chat e() {
        return getMessagesController().M0(Long.valueOf(this.a));
    }

    @Override
    public final vc2 getGroupCall() {
        vc2 vc2Var = this.I0;
        if (vc2Var != null && (vc2Var.b instanceof TLRPC.TL_groupCall)) {
            return vc2Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ozb ozbVar = this.s0;
        if (ozbVar != null && ozbVar.a0 != null) {
            int i = p55.h;
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
            i = aob.d6;
        } else {
            i = aob.s8;
        }
        int themedColor = getThemedColor(i);
        if (this.actionBar.z()) {
            themedColor = getThemedColor(aob.w8);
        }
        if (vm2.h(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final rz4 j() {
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
                this.actionBar.C(this.q0.T(false));
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
        uc7 messagesController = getMessagesController();
        long j = this.a;
        messagesController.e3(0, j, true);
        long j2 = -j;
        this.e1 = getMessagesController().B4(j2);
        jn7.f(this.currentAccount).b(this, jn7.y5);
        jn7.f(this.currentAccount).b(this, jn7.r3);
        jn7.f(this.currentAccount).b(this, jn7.T);
        jn7.f(this.currentAccount).b(this, jn7.t5);
        jn7.f(this.currentAccount).b(this, 2);
        jn7.f(this.currentAccount).b(this, jn7.r);
        jn7.f(this.currentAccount).b(this, jn7.w2);
        jn7.f(this.currentAccount).b(this, jn7.f0);
        jn7.f(this.currentAccount).b(this, jn7.u5);
        jn7.f(this.currentAccount).b(this, jn7.s);
        jn7.f(this.currentAccount).b(this, jn7.h0);
        Z0(false, false);
        n1a.s(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j));
        if (xc2.T(M0)) {
            getMessagesController().j5(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = s1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().j1(j2);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.P0.e();
        jn7.f(this.currentAccount).n(this, jn7.y5);
        jn7.f(this.currentAccount).n(this, jn7.r3);
        jn7.f(this.currentAccount).n(this, jn7.T);
        jn7.f(this.currentAccount).n(this, jn7.t5);
        jn7.f(this.currentAccount).n(this, 2);
        jn7.f(this.currentAccount).n(this, jn7.r);
        jn7.f(this.currentAccount).n(this, jn7.w2);
        jn7.f(this.currentAccount).n(this, jn7.f0);
        jn7.f(this.currentAccount).n(this, jn7.u5);
        jn7.f(this.currentAccount).n(this, jn7.s);
        jn7.f(this.currentAccount).n(this, jn7.h0);
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        if (xc2.T(M0)) {
            getMessagesController().j5(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.e1) {
            this.e1 = false;
            getMessagesController().l4(-j);
        }
        uj3 uj3Var = this.N0;
        if (uj3Var != null && uj3Var.H3 != null) {
            uj3Var.getActionBar().setSearchAvatarImageView(null);
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
        qyb qybVar = getMessagesController().g4;
        LongSparseIntArray longSparseIntArray = qybVar.r;
        long j = this.a;
        longSparseIntArray.put(j, longSparseIntArray.get(j, 0) + 1);
        qybVar.y(j, true);
        this.H = false;
        hl.V3(this.O);
        this.H = true;
        setBulletinDelegate(new t10(this, (byte) 22));
        if (this.inPreviewMode && !getMessagesController().v2(-j)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        if (xea.o() != 0 && this.U0) {
            P0(f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b;
        super.onThemeColorsChanged();
        oz4 oz4Var = this.l1;
        if (oz4Var != null) {
            oz4Var.a(getThemedColor(aob.d6));
        }
        if (this.X0 != null && (b = rnb.b(getThemedColor(aob.Ue))) != this.r1) {
            this.r1 = b;
            aob.F1(this.X0.getBackground(), b, true);
        }
        for (int i = 0; i < 2; i++) {
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(aob.G8), true);
            this.actionBar.J(getThemedColor(aob.E8), false, true);
            this.actionBar.J(getThemedColor(aob.F8), true, true);
            this.actionBar.K(getThemedColor(aob.I5), true);
        }
        nf9 nf9Var = this.Q0;
        if (nf9Var != null && (nf9Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(vm2.o(getThemedColor(aob.d6), 100));
        }
        T0();
        try {
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setActionModeColor(getThemedColor(aob.d6));
            }
            xh3 xh3Var = this.x;
            if (xh3Var != null) {
                xh3Var.h();
            }
            if (this.actionBar != null && this.c1) {
                X0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(aob.y8));
            }
            s7 s7Var = this.q0;
            if (s7Var != null && s7Var.getSearchField() != null) {
                this.q0.getSearchField().setCursorColor(getThemedColor(aob.Ne));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        li3 li3Var;
        nf9 nf9Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (nf9Var = this.Q0) != null) {
            if (nf9Var.getParent() != null) {
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
                uj3 uj3Var = this.M0;
                if (uj3Var != null) {
                    uj3Var.removeSelfFromStack();
                }
            } else if (this.J) {
                removeSelfFromStack();
                uj3 uj3Var2 = this.N0;
                if (uj3Var2 != null && (li3Var = uj3Var2.H3) != null && li3Var.c()) {
                    this.N0.H3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        nf9 nf9Var = this.Q0;
        if (nf9Var != null && nf9Var.getVisibility() == 0) {
            nf9 nf9Var2 = this.Q0;
            if (z) {
                nf9Var2.setAlpha(1.0f - f);
            } else {
                nf9Var2.setAlpha(f);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.P0.d();
    }

    @Override
    public final f82 p() {
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
        f82 f82Var = this.f;
        if (f82Var != null) {
            f82Var.setAlpha(f);
            this.r0.setAlpha(f);
            s7 s7Var = this.q0;
            if (s7Var != null) {
                s7Var.setAlpha(f);
            }
            this.actionBar.getBackButton().setAlpha(f);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f) {
        f82 f82Var = this.f;
        if (f82Var != null) {
            f82Var.setAlpha(f);
            this.f.setTranslationX((1.0f - f) * hl.L(40.0f));
        }
    }

    @Override
    public final void v() {
        this.O.A0(0);
    }

    public final void x0(boolean z) {
        float f;
        boolean z2;
        li3 li3Var;
        this.t0 = z;
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Z0.cancel();
        }
        if (this.b1 == null) {
            uic l = this.s0.l(8, false);
            this.b1 = l;
            if (this.N0 != null) {
                yob.h(aob.d6, getResourceProvider(), l);
            }
            this.e.addView(this.b1, tre.c(44.0f, -1));
        }
        float f2 = this.X;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.Z0 = ValueAnimator.ofFloat(f2, f);
        hl.T3(this.s0, false, 1.0f, true, true);
        uj3 uj3Var = this.N0;
        if (uj3Var != null && (li3Var = uj3Var.H3) != null) {
            li3Var.N = !z;
        }
        if (!z && this.s0.getVisibility() == 0 && this.s0.getAlpha() == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a1 = z2;
        this.Z0.addUpdateListener(new ija(this, (byte) 29));
        this.s0.setVisibility(0);
        if (!z) {
            this.r0.setVisibility(0);
        } else {
            hl.V2(getParentActivity(), this.classGuid);
            U0(false);
        }
        this.Z0.addListener(new czb(this, z, (byte) 0));
        this.Z0.setDuration(200L);
        this.Z0.setInterpolator(k43.f);
        this.Z0.start();
        jn7.e().k(jn7.u4, Boolean.TRUE);
    }

    public final void y0() {
        tq3 tq3Var;
        View view;
        a aVar;
        float f;
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (tq3Var = this.i1) != null) {
            int L = hl.L(48.0f);
            int L2 = hl.L(48.0f) + ((int) this.V0.c(hl.L(14.0f)));
            uj3 uj3Var = this.N0;
            if (uj3Var != null) {
                view = uj3Var.fragmentView;
                aVar = uj3Var.getActionBar();
            } else {
                view = this.fragmentView;
                aVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.h1) - hl.L(8.0f);
            this.p1.set(0.0f, -L, view.getMeasuredWidth(), aVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.q1;
            rectF.set(0.0f, measuredHeight - hl.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (i86.e(262144)) {
                f = 0.0f;
            } else {
                f = -hl.L(48.0f);
            }
            rectF.inset(0.0f, f);
            if (this.N0 != null) {
                i = 2;
            } else {
                i = 1;
            }
            tq3Var.g(i, this.o1);
            tq3Var.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void z0() {
        uyb uybVar;
        qyb qybVar = this.s;
        long j = this.a;
        if (!qybVar.e(j) && (uybVar = this.G) != null) {
            int M0 = uybVar.M0();
            if (this.b.isEmpty() || M0 >= this.r.b() - 5) {
                qybVar.o(j);
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

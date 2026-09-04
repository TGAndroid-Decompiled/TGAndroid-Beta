package ji;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.cc1;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
import org.telegram.ui.lu0;
import org.telegram.ui.mk;
public final class c2 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public kz A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public boolean E;
    public int E0;
    public final int[] F;
    public int F0;
    public int[] G;
    public boolean G0;
    public int[] H;
    public fi.g2 H0;
    public float I;
    public int I0;
    public co J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public o1 N0;
    public u1 O;
    public cj0 O0;
    public v3 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public h1 R0;
    public FrameLayout S;
    public int S0;
    public ImageView T;
    public int T0;
    public LinearLayout U;
    public int U0;
    public ImageView V;
    public boolean V0;
    public ImageView W;
    public FrameLayout X;
    public FrameLayout Y;
    public FrameLayout Z;
    public final CharSequence f13806a;
    public LinearLayout f13807a0;
    public final TL_iv.RichMessage f13808b;
    public bh f13809b0;
    public int f13810c;
    public ImageView f13811c0;
    public int d;
    public v1 f13812d0;
    public boolean f13813e;
    public LinearLayout f13814e0;
    public final String f13815f;
    public final ArrayList f13816f0;
    public ImageView f13817g0;
    public CharSequence h;
    public cc1 f13818h0;
    public LinearLayout f13819i0;
    public w1 f13820j0;
    public int f13821k0;
    public final ArrayList f13822l0;
    public LinearLayout m0;
    public CharSequence f13823n;
    public LinearLayout f13824n0;
    public LinearLayout f13825o0;
    public y1 f13826p0;
    public y1 f13827q0;
    public MessageObject f13828r;
    public y1 f13829r0;
    public ih.g f13830s;
    public y1 f13831s0;
    public y1 f13832t0;
    public y1 f13833u0;
    public mk v;
    public FrameLayout f13834v0;
    public final Rect f13835w;
    public aj0 f13836w0;
    public dh.d f13837x;
    public n70 f13838x0;
    public RectF f13839y;
    public x1 f13840y0;
    public m.p3 f13841z0;

    public c2(Editable editable) {
        super(null);
        this.f13810c = -1;
        this.d = -1;
        this.f13835w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f13816f0 = new ArrayList();
        this.f13821k0 = Integer.MAX_VALUE;
        this.f13822l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new i1(this, 0);
        this.f13806a = editable;
    }

    public static void U(c2 c2Var) {
        i3 i3Var = c2Var.P.f14259n3;
        if (i3Var != null && i3Var.y()) {
            c2Var.n0();
            return;
        }
        Activity parentActivity = c2Var.getParentActivity();
        new x(c2Var.currentAccount, parentActivity, new bi.o1(c2Var, 27), c2Var.getResourceProvider()).show();
    }

    public static void V(c2 c2Var) {
        if (!UserConfig.getInstance(c2Var.currentAccount).isPremium()) {
            c2Var.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) c2Var, 43, true));
        }
    }

    public static boolean W(c2 c2Var, View view) {
        int i10;
        co coVar = c2Var.J;
        if (coVar != null && c2Var.f13828r == null && !coVar.c() && c2Var.P.j3() && !c2Var.P.l3()) {
            if (!c2Var.P.L3()) {
                c2Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Y2 = c2Var.P.Y2();
            if (!Y2.isEmpty()) {
                cj0 cj0Var = c2Var.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    c2Var.O0 = null;
                }
                cj0 cj0Var2 = new cj0(c2Var.getParentActivity(), c2Var.getResourceProvider());
                c2Var.O0 = cj0Var2;
                cj0Var2.setOnDismissListener(new bi.r4(c2Var, 5));
                long a2 = c2Var.J.a();
                MessageObject messageObject = c2Var.J.f35352n5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19890id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(c2Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(c2Var.currentAccount).getPeer(UserConfig.getInstance(c2Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Y2;
                richMessage.photos = c2Var.P.A2();
                tL_message.rich_message.documents = c2Var.P.x2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(c2Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                c2Var.O0.q(org.telegram.messenger.w1.l(messageObject2));
                c2Var.f13840y0.setScaleX(1.0f);
                c2Var.f13840y0.setScaleY(1.0f);
                vg r10 = c2Var.O0.r(c2Var.f13840y0, true, new j1(c2Var, 10));
                if (r10 != null) {
                    r10.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), c2Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh))));
                    cj0 cj0Var3 = c2Var.O0;
                    int dp = AndroidUtilities.dp(44.0f);
                    cj0Var3.m0 = true;
                    cj0Var3.Y = dp;
                }
                n70 H = n70.H(c2Var, c2Var.f13840y0);
                boolean isUserSelf = UserObject.isUserSelf(c2Var.J.i());
                if (c2Var.J.D6()) {
                    int i11 = R.drawable.msg_calendar2;
                    if (isUserSelf) {
                        i10 = R.string.SetReminder;
                    } else {
                        i10 = R.string.ScheduleMessage;
                    }
                    H.c(i11, LocaleController.getString(i10), new bi.g(c2Var, a2, 11), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new i1(c2Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new i1(c2Var, 6), false);
                }
                H.Y();
                c2Var.O0.p(H);
                c2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void X(c2 c2Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(c2Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, c2Var.J);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(c2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j3, messageObject2, messageObject3, z10, i10, i11, sendMessageChatArguments, 0L, j10, 0L);
        }
    }

    public static void Y(final c2 c2Var, Context context, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        n70 n70Var;
        boolean z17;
        float f7;
        float f10;
        boolean z18;
        boolean z19;
        boolean z20;
        float f11;
        float f12;
        boolean z21;
        boolean z22;
        float f13;
        n70 n70Var2 = c2Var.f13838x0;
        if (n70Var2 != null) {
            n70Var2.u();
            c2Var.f13838x0 = null;
        }
        if (!MessagesController.getInstance(c2Var.currentAccount).richEditorAllowed() && !UserConfig.getInstance(c2Var.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a P2 = c2Var.P.P2();
        final n70 I = n70.I(c2Var, view);
        I.Q = true;
        n70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(I, 1), false);
        J.k();
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(c2Var) {
            public final c2 f14073b;

            {
                this.f14073b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20401a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f20401a.setTextSize(1, SharedConfig.fontSize + 2);
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(c2Var) {
            public final c2 f14073b;

            {
                this.f14073b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20401a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f20401a.setTextSize(1, SharedConfig.fontSize + 1);
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(c2Var) {
            public final c2 f14073b;

            {
                this.f14073b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20401a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f20401a.setTextSize(1, SharedConfig.fontSize);
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(c2Var) {
            public final c2 f14073b;

            {
                this.f14073b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20401a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f20401a.setTextSize(1, SharedConfig.fontSize - 1);
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(c2Var) {
            public final c2 f14073b;

            {
                this.f14073b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20401a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f20401a.setTextSize(1, SharedConfig.fontSize - 2);
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(c2Var) {
            public final c2 f14073b;

            {
                this.f14073b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f14073b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20401a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f20401a.setTextSize(1, SharedConfig.fontSize - 3);
        if (P2 != null && v3.B3(P2.f13732b)) {
            n70Var = J;
            z17 = true;
        } else {
            n70Var = J;
            z17 = false;
        }
        a2 a2Var = new a2(context, R.drawable.iv_h);
        a2Var.a(z10);
        int i10 = org.telegram.ui.ActionBar.j6.G8;
        a2Var.d = i10;
        I.j(z17, 0, a2Var, LocaleController.getString(R.string.ArticleHeading), new fi.m2(I, n70Var, 2));
        I.y().f20401a.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f1 y3 = I.y();
        float f14 = 9.0f;
        if (LocaleController.isRTL) {
            f7 = 18.0f;
        } else {
            f7 = 9.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (LocaleController.isRTL) {
            f10 = 9.0f;
        } else {
            f10 = 18.0f;
        }
        y3.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new m1(c2Var, P2, 3));
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new m1(c2Var, P2, 4));
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        a2 a2Var2 = new a2(context, R.drawable.iv_pullquote);
        a2Var2.a(z10);
        a2Var2.d = i10;
        I.j(z20, 0, a2Var2, LocaleController.getString(R.string.ArticlePullquote), new m1(c2Var, P2, 0));
        org.telegram.ui.ActionBar.f1 y10 = I.y();
        if (LocaleController.isRTL) {
            f11 = 18.0f;
        } else {
            f11 = 9.0f;
        }
        int dp2 = AndroidUtilities.dp(f11);
        if (LocaleController.isRTL) {
            f12 = 9.0f;
        } else {
            f12 = 18.0f;
        }
        y10.setPadding(dp2, 0, AndroidUtilities.dp(f12), 0);
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new m1(c2Var, P2, 1));
        if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        a2 a2Var3 = new a2(context, R.drawable.iv_footer);
        a2Var3.a(z10);
        a2Var3.d = i10;
        I.j(z22, 0, a2Var3, LocaleController.getString(R.string.ArticleFooter), new m1(c2Var, P2, 2));
        org.telegram.ui.ActionBar.f1 y11 = I.y();
        if (LocaleController.isRTL) {
            f13 = 18.0f;
        } else {
            f13 = 9.0f;
        }
        int dp3 = AndroidUtilities.dp(f13);
        if (!LocaleController.isRTL) {
            f14 = 18.0f;
        }
        y11.setPadding(dp3, 0, AndroidUtilities.dp(f14), 0);
        I.Z();
        c2Var.f13838x0 = I;
    }

    public static void Z(c2 c2Var, boolean z10, boolean z11) {
        float f7;
        int i10;
        if (c2Var.J0 != z10 || !z11) {
            c2Var.J0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            if (z11) {
                c2Var.f13836w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(pr.h).start();
            } else {
                c2Var.f13836w0.animate().cancel();
                c2Var.f13836w0.setScaleX(f7);
                c2Var.f13836w0.setScaleY(f7);
            }
            aj0 aj0Var = c2Var.f13836w0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.f20898q7;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            }
            aj0Var.setColorFilter(new PorterDuffColorFilter(c2Var.getThemedColor(i10), PorterDuff.Mode.SRC_IN));
            xi0 animatedDrawable = c2Var.f13836w0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f32553b0 > 34) {
                        animatedDrawable.L(0, false, false);
                    }
                    animatedDrawable.N(33);
                } else {
                    animatedDrawable.N(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public static h1 a0(c2 c2Var) {
        h1 focusedEditTextOrNull = c2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            c2Var.R0 = focusedEditTextOrNull;
            c2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        h1 h1Var = c2Var.R0;
        if (h1Var != null) {
            return h1Var;
        }
        return c2Var.P.O2();
    }

    public static int b0(c2 c2Var, h1 h1Var) {
        if (h1Var == c2Var.R0 && c2Var.P.getFocusedEditTextOrNull() != h1Var) {
            return Math.min(c2Var.S0, h1Var.length());
        }
        return Math.max(0, h1Var.getSelectionEnd());
    }

    public static String g0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            return null;
                        }
                        return LocaleController.getString(R.string.AccDescrIVDetails);
                    }
                    return LocaleController.getString(R.string.AccDescrIVFormula);
                }
                return LocaleController.getString(R.string.AccDescrIVTable);
            }
            return LocaleController.getString(R.string.AccDescrIVListStyle);
        }
        return LocaleController.getString(R.string.AccDescrIVTextStyle);
    }

    public static String i0(int i10) {
        if (i10 == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i10 == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i10 == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i10 == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i10 == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i10 == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i10 == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i10 == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i10 == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.f6 f6Var) {
        final org.telegram.ui.ActionBar.f3 i10 = wl.i(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i10.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        linearLayout.addView(imageView, w7.x5.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 49, 25, 16, 25, 0), context);
        h.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        linearLayout.addView(h, w7.x5.t(-1, -2, 49, 25, 11, 25, 0));
        di.d g10 = wl.g(24, context, f6Var, true);
        g10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(g10, w7.x5.t(-1, 48, 49, 14, 31, 14, 0));
        di.d g11 = wl.g(24, context, f6Var, false);
        g11.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(g11, w7.x5.t(-1, 48, 49, 14, 2, 14, 6));
        i10.show();
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        i10.dismiss();
                        runnable2.run();
                        return;
                    default:
                        i10.dismiss();
                        runnable2.run();
                        return;
                }
            }
        });
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        i10.dismiss();
                        runnable.run();
                        return;
                    default:
                        i10.dismiss();
                        runnable.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        boolean z10;
        int i10 = 0;
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((y1) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        float f7;
        if (this.f13840y0 == null) {
            return;
        }
        boolean L3 = this.P.L3();
        this.f13840y0.setEnabled(L3);
        ViewPropertyAnimator animate = this.f13840y0.animate();
        if (L3) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(150L).start();
    }

    public final void C0() {
        x1 x1Var = this.f13840y0;
        if (x1Var == null) {
            return;
        }
        x1Var.setLocked(m0());
    }

    public final y1 c0(int i10, int i11, boolean z10) {
        int i12;
        y1 y1Var = new y1(this.f13814e0.getContext(), i10, getResourceProvider());
        if (z10) {
            y1Var.e();
            this.N.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i11));
        y1Var.setContentDescription(g0(i11));
        this.f13816f0.add(y1Var);
        LinearLayout linearLayout = this.f13814e0;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(y1Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
        return y1Var;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new u1(this, context);
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.F0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        fi.g2 g2Var = new fi.g2(this, 1);
        this.H0 = g2Var;
        this.O.f29219r.add(g2Var);
        v3 v3Var = new v3(context, this.currentAccount, getResourceProvider(), new z2.b(this));
        this.P = v3Var;
        v3Var.setFileRefParentObject(this.f13828r);
        this.O.addView(this.P, w7.x5.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), w7.x5.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f13808b;
        if (richMessage != null) {
            v3 v3Var2 = this.P;
            ArrayList arrayList2 = v3Var2.f14256l3;
            v3Var2.f14254k3 = richMessage;
            v3.V2(arrayList2, richMessage.blocks, v3Var2.f14257m3);
            v3Var2.U3();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                v3Var2.u4((a) arrayList2.get(i13));
            }
            v3Var2.Y2.N(false);
        } else {
            String str = this.f13815f;
            if (str != null) {
                v3 v3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f13823n;
                HashMap hashMap = v3Var3.f14257m3;
                ArrayList arrayList3 = v3Var3.f14256l3;
                if (!TextUtils.isEmpty(charSequence)) {
                    v3.V2(arrayList3, f5.b(charSequence), hashMap);
                }
                arrayList3.addAll(v3Var3.v4(d4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    v3.V2(arrayList3, f5.b(charSequence2), hashMap);
                }
                v3Var3.U3();
                v3Var3.Y2.N(false);
            } else {
                CharSequence charSequence3 = this.f13806a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        g2 g2Var2 = this.P.J3;
        if (g2Var2 != null) {
            g2Var2.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = org.telegram.ui.ActionBar.j6.f20663d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i14), org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i14))}));
        this.O.addView(this.Q, w7.x5.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14)}));
        this.O.addView(this.R, w7.x5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, w7.x5.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i14);
        int themedColor2 = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.j6.f20753i6;
        imageView3.setBackground(new b2(org.telegram.ui.ActionBar.j6.Z(themedColor, org.telegram.ui.ActionBar.j6.v(themedColor2, getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.T;
        int i16 = org.telegram.ui.ActionBar.j6.G6;
        int themedColor3 = getThemedColor(i16);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        w7.z5.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.T.setOnClickListener(new j1(this, 1));
        this.S.addView(this.T, w7.x5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.S.addView(this.U, w7.x5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        this.V.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, -1));
        this.V.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.z5.a(this.V);
        this.V.setContentDescription(LocaleController.getString(R.string.Undo));
        this.V.setOnClickListener(new j1(this, 2));
        this.U.addView(this.V, w7.x5.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        this.W.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, -1));
        this.W.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.z5.a(this.W);
        this.W.setContentDescription(LocaleController.getString(R.string.Redo));
        this.W.setOnClickListener(new j1(this, 3));
        this.U.addView(this.W, w7.x5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, w7.x5.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, w7.x5.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f13807a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f13807a0.setClipChildren(false);
        this.f13807a0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Z.addView(this.f13807a0, w7.x5.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f13811c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.f13811c0.setScaleType(scaleType);
        this.f13811c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f13811c0.setBackground(new b2(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i14), org.telegram.ui.ActionBar.j6.v(getThemedColor(i14), getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.f13807a0.addView(this.f13811c0, w7.x5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.z5.a(this.f13811c0);
        this.f13811c0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f13811c0.setOnClickListener(new j1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        frameLayout5.addView(frameLayout6, w7.x5.e(-2, 44, 81));
        v1 v1Var = new v1(context, 0);
        this.f13812d0 = v1Var;
        v1Var.setClipToOutline(true);
        this.f13812d0.setOutlineProvider(new bi.z1(3));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f13814e0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f13814e0.setOrientation(0);
        this.f13812d0.addView(this.f13814e0);
        frameLayout6.addView(this.f13812d0, w7.x5.c(-1.0f, -1));
        bh bhVar = new bh(context, 24);
        this.f13809b0 = bhVar;
        bhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.f13809b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f13809b0.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f13809b0.j(zg.f33152e, false);
        this.f13814e0.addView(this.f13809b0, w7.x5.q(38, 38, 16));
        w7.z5.a(this.f13809b0);
        this.f13809b0.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.f13809b0.setOnClickListener(new j1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new bi.u1(13, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new j1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new j1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new j1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f13817g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f13817g0.setScaleType(scaleType);
        this.f13817g0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f13817g0.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f13814e0.addView(this.f13817g0, w7.x5.t(38, 38, 16, 2, 0, 0, 0));
        w7.z5.a(this.f13817g0);
        this.f13817g0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f13817g0.setOnClickListener(new j1(this, 9));
        this.f13807a0.addView(frameLayout5, w7.x5.l(1.0f, 0, 44));
        cc1 cc1Var = new cc1(this, context, 2);
        this.f13818h0 = cc1Var;
        cc1Var.setOrientation(0);
        this.f13818h0.setClipToPadding(false);
        this.f13818h0.setClipChildren(false);
        this.f13818h0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f13818h0, w7.x5.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f13834v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f13834v0.setClipToPadding(false);
        this.f13834v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f13834v0, w7.x5.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f13836w0 = imageView9;
        imageView9.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        xi0 animatedDrawable = this.f13836w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.f13836w0.setScaleType(scaleType);
        this.f13836w0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f13836w0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f13834v0.addView(this.f13836w0, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f13818h0.addView(frameLayout8, w7.x5.c(44.0f, -2));
        w1 w1Var = new w1(this, context);
        this.f13820j0 = w1Var;
        w1Var.setHorizontalScrollBarEnabled(false);
        this.f13820j0.setClipToOutline(true);
        this.f13820j0.setOutlineProvider(new bi.z1(4));
        frameLayout8.addView(this.f13820j0, w7.x5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f13819i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f13819i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f13820j0.addView(this.f13819i0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        y1 y1Var = new y1(context, R.drawable.iv_quote, getResourceProvider());
        this.f13833u0 = y1Var;
        y1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f13833u0.setOnClickListener(new j1(this, 11));
        LinearLayout linearLayout5 = this.f13819i0;
        y1 y1Var2 = this.f13833u0;
        if (linearLayout5.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout5.addView(y1Var2, w7.x5.t(38, 38, 16, i10, 0, 0, 0));
        y1 y1Var3 = new y1(context, R.drawable.iv_button, getResourceProvider());
        this.f13829r0 = y1Var3;
        y1Var3.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f13829r0.setOnClickListener(new j1(this, 12));
        LinearLayout linearLayout6 = this.f13819i0;
        y1 y1Var4 = this.f13829r0;
        if (linearLayout6.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout6.addView(y1Var4, w7.x5.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f13824n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f13824n0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f13824n0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f13818h0.addView(this.f13824n0, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var5 = new y1(context, R.drawable.media_link_24, getResourceProvider());
        this.f13827q0 = y1Var5;
        y1Var5.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.f13827q0.setOnClickListener(new j1(this, 13));
        this.f13824n0.addView(this.f13827q0, w7.x5.q(38, 38, 16));
        y1 y1Var6 = new y1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f13831s0 = y1Var6;
        y1Var6.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f13831s0.setOnClickListener(new j1(this, 14));
        this.f13824n0.addView(this.f13831s0, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f13825o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f13825o0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f13825o0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f13818h0.addView(this.f13825o0, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var7 = new y1(context, R.drawable.iv_math, getResourceProvider());
        this.f13832t0 = y1Var7;
        y1Var7.e();
        arrayList.add(this.f13832t0);
        this.f13832t0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f13832t0.setOnClickListener(new j1(this, 15));
        this.f13825o0.addView(this.f13832t0, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.m0.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f13818h0.addView(this.m0, 0, w7.x5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        y1 y1Var8 = new y1(context, 0, getResourceProvider());
        this.f13826p0 = y1Var8;
        y1Var8.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.f13826p0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f13826p0.setOnClickListener(new j1(this, 16));
        this.m0.addView(this.f13826p0, w7.x5.q(38, 38, 16));
        if (this.f13828r != null) {
            i12 = R.drawable.input_done;
        } else if (l0()) {
            i12 = R.drawable.input_schedule;
        } else {
            i12 = R.drawable.send_plane_24;
        }
        x1 x1Var = new x1((Object) this, context, i12, getResourceProvider(), 0);
        this.f13840y0 = x1Var;
        x1Var.setBackground(new b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(org.telegram.ui.ActionBar.j6.Yd))));
        w7.z5.a(this.f13840y0);
        this.f13807a0.addView(this.f13840y0, w7.x5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f13840y0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f13840y0.setOnClickListener(new j1(this, 0));
        this.f13840y0.setOnLongClickListener(new di.n5(this, 3));
        C0();
        this.O.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        A0();
        if (this.f13813e) {
            this.P.B2();
            this.f13813e = false;
        }
        u1 u1Var = this.O;
        this.fragmentView = u1Var;
        return u1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z10) {
        int i12;
        y1 y1Var = new y1(context, i10, getResourceProvider());
        if (z10) {
            y1Var.e();
            this.N.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i11));
        y1Var.setContentDescription(i0(i11));
        y1Var.setOnClickListener(new di.o4(this, i11, 2));
        this.f13822l0.add(y1Var);
        LinearLayout linearLayout = this.f13819i0;
        if (linearLayout.getChildCount() > 0) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        linearLayout.addView(y1Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            C0();
            A0();
        }
    }

    public final void e0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f7);
        this.P0 = ofFloat;
        ofFloat.addUpdateListener(new k1(this, 0));
        this.P0.setInterpolator(pr.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        kz kzVar = this.A0;
        if (kzVar != null && (layoutParams = (FrameLayout.LayoutParams) kzVar.getLayoutParams()) != null) {
            int j02 = j0();
            u1 u1Var = this.O;
            if (u1Var == null) {
                max = j0();
            } else {
                max = Math.max(j0(), ((u1Var.getMeasuredHeight() - this.O.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.T0);
            }
            int round = Math.round(((max - j02) * this.Q0) + j02);
            if (layoutParams.height != round) {
                layoutParams.height = round;
                this.A0.setLayoutParams(layoutParams);
            }
        }
    }

    public final void h0() {
        FrameLayout.LayoutParams layoutParams;
        kz kzVar = this.A0;
        if (kzVar != null && (layoutParams = (FrameLayout.LayoutParams) kzVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.T0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.A0.setLayoutParams(layoutParams);
            }
        }
        f0();
        int max = Math.max(Math.max(this.D0, this.T0), this.U0);
        this.P.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        v3 v3Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        v3Var.O3 = i12;
        v3Var.P3 = i13;
        v3Var.Q3 = i14;
        int i15 = -max;
        this.Y.setTranslationY(i15);
        this.R.setTranslationY(i15 + this.T0);
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        v3 v3Var = this.P;
        if (v3Var != null && v3Var.f14259n3.y()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final int j0() {
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.F0;
        } else {
            i10 = this.E0;
        }
        if (i10 <= 0) {
            return AndroidUtilities.dp(200.0f);
        }
        return i10;
    }

    public final void k0(boolean z10) {
        if (this.C0) {
            this.C0 = false;
            kz kzVar = this.A0;
            if (kzVar != null) {
                kzVar.t(false);
                this.A0.B();
            }
        }
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        this.Q0 = 0.0f;
        this.R0 = null;
        kz kzVar2 = this.A0;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            h0();
        }
        bh bhVar = this.f13809b0;
        if (bhVar != null) {
            bhVar.j(zg.f33152e, z10);
        }
    }

    public final boolean l0() {
        co coVar;
        if (this.f13828r == null && (coVar = this.J) != null && coVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            v3 v3Var = this.P;
            if (f5.f(v3Var.f14256l3, v3Var.f14257m3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n0() {
        m3 g22 = this.P.g2();
        if (g22 != null) {
            TL_iv.RichMessage a2 = g22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(getParentActivity(), getResourceProvider());
            f0Var.n0(a2);
            f0Var.f25829k0 = new bi.o1(g22, 25);
            f0Var.show();
        }
    }

    public final void o0(int i10, int i11) {
        v3 v3Var = this.P;
        v3Var.f14242c4 = v3Var.P2();
        vi viVar = new vi(getParentActivity(), this, false, false, true, getResourceProvider());
        viVar.Z1 = new r1(this, viVar);
        viVar.f31291j0.setIncludeVideosInGallery(true);
        viVar.f31291j0.f0();
        viVar.J1(1, true);
        viVar.h1(i10);
        viVar.f31324t2 = new q1(this, viVar);
        viVar.Y = new q1(this, viVar);
        viVar.X = new s1(this, viVar);
        viVar.r1();
        if (i11 != 0) {
            viVar.A1(i11);
        }
        viVar.setFocusable(true);
        viVar.show();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1 && i10 == 21) {
            if (intent != null && intent.getData() != null) {
                v3 v3Var = this.P;
                Uri data = intent.getData();
                if (data == null) {
                    v3Var.getClass();
                } else if (v3Var.getContext() != null) {
                    Utilities.globalQueue.postRunnable(new fi.j4(26, v3Var, data));
                }
            }
        } else if (i11 == -1 && (i10 == 1 || i10 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.P.d2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.C0;
        if (z11) {
            if (z11) {
                this.C0 = false;
                kz kzVar = this.A0;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.A0.B();
                }
                e0(false);
                return false;
            }
        } else if (this.B0) {
            k0(true);
            return false;
        } else if (!this.P.E2()) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f7;
        if (!z10 && !this.V0) {
            q0();
            this.V0 = true;
        }
        if (!AndroidUtilities.isTablet() && this.f13830s != null && this.v != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ih.g gVar = this.f13830s;
            this.f13837x = gVar.f12333f;
            gVar.f12332e = false;
            gVar.invalidate();
            this.v.setAlpha(0.0f);
            this.v.f23805z1.setVisibility(4);
            v0();
            float f10 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            this.I = f7;
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            this.E = true;
            this.O.invalidate();
            ofFloat.addUpdateListener(new k1(this, 1));
            ofFloat.addListener(new bi.t(8, this, runnable));
            if (!z10) {
                FrameLayout frameLayout = this.S;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.S;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.Z, property, 0.0f), ObjectAnimator.ofFloat(this.Z, property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.S;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.S;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Z, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(pr.h);
            this.O.post(new lu0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        fi.g2 g2Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.V0) {
            q0();
            this.V0 = true;
        }
        o1 o1Var = this.N0;
        if (o1Var != null) {
            this.N0 = null;
            AndroidUtilities.runOnUIThread(o1Var);
        }
        cj0 cj0Var = this.O0;
        if (cj0Var != null) {
            cj0Var.i();
            this.O0 = null;
        }
        v3 v3Var = this.P;
        if (v3Var != null) {
            v3Var.F2();
        }
        m.p3 p3Var = this.f13841z0;
        if (p3Var != null) {
            p3Var.a();
        }
        super.onFragmentDestroy();
        kz kzVar = this.A0;
        if (kzVar != null) {
            kzVar.D();
        }
        u1 u1Var = this.O;
        if (u1Var != null && (g2Var = this.H0) != null) {
            u1Var.f29219r.remove(g2Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        h0();
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        boolean z10;
        n70 n70Var;
        i0.c f7 = l1Var.f44711a.f(3);
        int i10 = l1Var.f44711a.f(8).d;
        this.U0 = i10;
        int i11 = i10 - f7.d;
        boolean z11 = this.G0;
        if (i11 > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G0 = z10;
        if (z10 && i11 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.F0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.F0).commit();
            } else {
                this.E0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.E0).commit();
            }
        }
        if (this.G0 && !z11 && this.B0 && !this.C0) {
            k0(false);
        }
        if (!this.G0 && z11 && (n70Var = this.f13838x0) != null) {
            n70Var.u();
            this.f13838x0 = null;
        }
        onInsets(f7.f11425a, f7.f11426b, f7.f11427c, f7.d);
        return r0.l1.f44710b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        v3 v3Var;
        int i10;
        v3 v3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.f13810c) >= 0 && (v3Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f13810c = -1;
            if (!v3Var2.X1(i10, i11)) {
                v3Var2.post(new o2(v3Var2, i10, i11, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f13808b != null || this.f13815f != null) && (v3Var = this.P) != null && !v3Var.Z2()) {
                v3Var.post(new b(v3Var, 5));
            }
        }
    }

    public final boolean q0() {
        TL_iv.RichMessage i22;
        Runnable runnable;
        if (this.J == null || this.f13828r != null || !this.P.q2()) {
            return false;
        }
        if (this.M) {
            i22 = null;
        } else {
            i22 = this.P.i2();
        }
        if (i22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        mk mkVar = this.J.Y;
        if (i22 != null && !this.M) {
            v3 v3Var = this.P;
            if (v3Var.j3() && !f5.f(v3Var.f14256l3, v3Var.f14257m3) && mkVar != null) {
                SpannableStringBuilder k10 = f5.k(this.P.f14256l3);
                co coVar = mkVar.O2;
                if (mkVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, mkVar.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class);
                if (z5VarArr != null) {
                    for (org.telegram.ui.Components.z5 z5Var : z5VarArr) {
                        z5Var.applyFontMetrics(mkVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.q5.g());
                    }
                }
                si0.a(spannableStringBuilder);
                if (coVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(mkVar.Q).saveDraft(coVar.a(), coVar.B7(coVar.f35352n5), charSequenceArr[0], MediaDataController.getInstance(mkVar.Q).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                mkVar.setRichDraftPreview(null);
                if (mkVar.E0.getText() != null) {
                    mkVar.E0.getText().clear();
                }
                mkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        co coVar2 = this.J;
        mediaDataController.saveDraft(a2, coVar2.B7(coVar2.f35352n5), "", null, null, null, null, 0L, false, false, i22);
        TL_iv.RichMessage richMessage = i22;
        if (mkVar == null) {
            return true;
        }
        mkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            v3 v3Var = this.P;
            Objects.requireNonNull(v3Var);
            p0(parentActivity, new b(v3Var, 0), new i1(this, 4), getResourceProvider());
        } else if (l0()) {
            org.telegram.ui.Components.e5.M(getParentActivity(), this.J.a(), new xa.c(this, 23), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    public final void s0(final int i10, final int i11, final boolean z10) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            v3 v3Var = this.P;
            Objects.requireNonNull(v3Var);
            p0(parentActivity, new b(v3Var, 0), new i1(this, 4), getResourceProvider());
        } else if (this.J != null && this.P.j3() && !this.P.l3()) {
            if (!this.P.L3()) {
                B0();
            } else if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
                mk mkVar = this.J.Y;
                if (mkVar != null) {
                    this.M = true;
                    Runnable runnable = this.K;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mkVar.R0(f5.k(this.P.f14256l3), z10, i10, i11);
                    finishFragment();
                }
            } else {
                this.M = true;
                final ArrayList Y2 = this.P.Y2();
                if (Y2.isEmpty()) {
                    return;
                }
                final ArrayList A2 = this.P.A2();
                final ArrayList x22 = this.P.x2();
                final ArrayList a2 = e5.a(this.currentAccount, Y2);
                final long a10 = this.J.a();
                co coVar = this.J;
                final MessageObject messageObject = coVar.f35352n5;
                final MessageObject messageObject2 = coVar.X3;
                final long N8 = coVar.N8();
                final SendMessageChatArguments C8 = this.J.C8();
                final MessageObject messageObject3 = this.f13828r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        c2.X(c2.this, messageObject3, Y2, A2, x22, a2, a10, messageObject, messageObject2, z10, i10, i11, C8, N8);
                    }
                };
                Runnable runnable2 = this.K;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (i10 != 0 && messageObject3 == null) {
                    this.N0 = r02;
                    finishFragment();
                    return;
                }
                r02.run();
                finishFragment();
            }
        }
    }

    public final void t0(boolean z10) {
        ArrayList arrayList = this.f13822l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            if (((Integer) y1Var.getTag()).intValue() == 1) {
                y1Var.setEnabled(z10);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        y1 y1Var = this.f13827q0;
        if (y1Var != null) {
            y1Var.setEnabled(z10);
        }
        y1 y1Var2 = this.f13829r0;
        if (y1Var2 != null) {
            y1Var2.setEnabled(z11);
        }
        y1 y1Var3 = this.f13831s0;
        if (y1Var3 != null) {
            y1Var3.setEnabled(z10);
        }
        y1 y1Var4 = this.f13832t0;
        if (y1Var4 != null) {
            y1Var4.setEnabled(z10);
        }
    }

    public final void v0() {
        ih.g gVar = this.f13830s;
        int[] iArr = this.F;
        gVar.getLocationInWindow(iArr);
        if (this.f13839y == null) {
            this.f13839y = new RectF();
        }
        RectF rectF = new RectF(this.f13837x.getBounds());
        this.f13839y = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.G == null) {
            this.G = new int[2];
        }
        this.v.getLocationInWindow(this.G);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.H[0] = this.P.getPaddingLeft();
        this.H[1] = this.P.getPaddingTop();
        int[] iArr2 = this.H;
        iArr2[0] = (int) (iArr2[0] - (this.v.E0.getX() - AndroidUtilities.dp(16.0f)));
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: ji.c2.w0():void");
    }

    public final void x0(int i10, boolean z10) {
        int i11;
        float f7;
        float f10;
        float f11;
        float dp;
        int i12;
        float f12;
        float f13;
        float f14;
        float dp2;
        float f15;
        float f16;
        float f17;
        float f18;
        float dp3;
        float f19;
        float f20;
        float f21;
        float dp4;
        float f22;
        if (this.K0 == i10) {
            return;
        }
        this.K0 = i10;
        int i13 = 0;
        float f23 = 0.0f;
        float f24 = 0.8f;
        if (z10) {
            this.f13807a0.setVisibility(0);
            ViewPropertyAnimator animate = this.f13807a0.animate();
            if (this.K0 == 0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f16);
            if (this.K0 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f17);
            if (this.K0 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
            if (this.K0 == 0) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(dp3).setDuration(420L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new i1(this, 1)).start();
            this.f13818h0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f13818h0.animate();
            if (this.K0 == 1) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f19);
            if (this.K0 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f20);
            if (this.K0 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f21);
            if (this.K0 == 1) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(30.0f);
            }
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(prVar).withEndAction(new i1(this, 2)).start();
            this.f13834v0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f13834v0.animate();
            if (this.K0 == 2) {
                f23 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f23);
            if (this.K0 == 2) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f22);
            if (this.K0 == 2) {
                f24 = 1.0f;
            }
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(prVar).withEndAction(new i1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f13807a0;
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.f13807a0;
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        linearLayout2.setAlpha(f7);
        LinearLayout linearLayout3 = this.f13807a0;
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        linearLayout3.setScaleX(f10);
        LinearLayout linearLayout4 = this.f13807a0;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout4.setScaleY(f11);
        LinearLayout linearLayout5 = this.f13807a0;
        if (i10 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout5.setTranslationY(dp);
        cc1 cc1Var = this.f13818h0;
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        cc1Var.setVisibility(i12);
        cc1 cc1Var2 = this.f13818h0;
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        cc1Var2.setAlpha(f12);
        cc1 cc1Var3 = this.f13818h0;
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        cc1Var3.setScaleX(f13);
        cc1 cc1Var4 = this.f13818h0;
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        cc1Var4.setScaleY(f14);
        cc1 cc1Var5 = this.f13818h0;
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        cc1Var5.setTranslationY(dp2);
        FrameLayout frameLayout = this.f13834v0;
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        FrameLayout frameLayout2 = this.f13834v0;
        if (i10 == 2) {
            f23 = 1.0f;
        }
        frameLayout2.setAlpha(f23);
        FrameLayout frameLayout3 = this.f13834v0;
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        frameLayout3.setScaleX(f15);
        FrameLayout frameLayout4 = this.f13834v0;
        if (i10 == 2) {
            f24 = 1.0f;
        }
        frameLayout4.setScaleY(f24);
    }

    public final void y0() {
        boolean z10;
        boolean z11;
        boolean g10;
        boolean z12;
        boolean h;
        boolean z13;
        int max;
        int max2;
        boolean z14;
        boolean z15;
        boolean z16;
        h1 h1Var;
        int max3;
        boolean z17;
        boolean z18;
        q9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.f13822l0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.y()) {
            y1 y1Var = this.f13833u0;
            boolean z19 = false;
            if (y1Var != null) {
                v3 v3Var = this.P;
                int[] A4 = v3Var.A4();
                if (A4 != null && v3Var.G3(A4[0], A4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                y1Var.setSelected(z18);
            }
            if (this.P.K3()) {
                q9 textSelectionHelper2 = this.P.getTextSelectionHelper();
                int i10 = textSelectionHelper2.f22500u0;
                int i11 = textSelectionHelper2.f22501v0;
                int i12 = textSelectionHelper2.f22504y0;
                int i13 = textSelectionHelper2.f22502w0;
                int i14 = textSelectionHelper2.f22505z0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    y1 y1Var2 = (y1) obj;
                    y1Var2.setSelected(this.P.J3(((Integer) y1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
                }
                if (i11 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    h1Var = this.P.M4(i10, i11);
                } else {
                    h1Var = null;
                }
                int max4 = Math.max(0, Math.min(i13, i14));
                if (h1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i13, i14), h1Var.length()));
                }
                y1 y1Var3 = this.f13827q0;
                if (y1Var3 != null) {
                    if (h1Var != null && max4 < max3 && i6.h(h1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    y1Var3.setSelected(z17);
                }
                y1 y1Var4 = this.f13831s0;
                if (y1Var4 != null) {
                    if (h1Var != null && max4 < max3 && i6.g(h1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    y1Var4.setSelected(z19);
                }
                t0(true);
                u0(z16, this.P.k2());
            } else if (this.P.v3()) {
                q9 textSelectionHelper3 = this.P.getTextSelectionHelper();
                h1 r22 = this.P.r2(textSelectionHelper3.f22500u0);
                int i16 = textSelectionHelper3.f22502w0;
                int i17 = textSelectionHelper3.f22505z0;
                if (r22 == null) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i16, i17), r22.length()));
                }
                if (r22 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0, Math.min(Math.max(i16, i17), r22.length()));
                }
                int size2 = arrayList.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList.get(i18);
                    i18++;
                    y1 y1Var5 = (y1) obj2;
                    int intValue = ((Integer) y1Var5.getTag()).intValue();
                    if (r22 != null && max < max2 && (intValue & r22.getCurrentStyle(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    y1Var5.setSelected(z15);
                }
                y1 y1Var6 = this.f13827q0;
                if (y1Var6 != null) {
                    if (r22 != null && max < max2 && i6.h(r22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    y1Var6.setSelected(z14);
                }
                y1 y1Var7 = this.f13831s0;
                if (y1Var7 != null) {
                    if (r22 != null && max < max2 && i6.g(r22.getText(), max, max2)) {
                        z19 = true;
                    }
                    y1Var7.setSelected(z19);
                }
                t0(true);
                u0(true, this.P.k2());
            } else {
                int i19 = textSelectionHelper.f22500u0;
                int i20 = textSelectionHelper.f22503x0;
                int i21 = textSelectionHelper.f22502w0;
                int i22 = textSelectionHelper.f22505z0;
                if (i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.f14264p4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i23 = 0;
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    y1 y1Var8 = (y1) arrayList.get(i23);
                    int intValue2 = ((Integer) y1Var8.getTag()).intValue();
                    if (z10 && this.P.I3(intValue2, i19, i21, i20, i22)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    y1Var8.setSelected(z13);
                    i23 = i24;
                }
                t0(!this.P.H3());
                y1 y1Var9 = this.f13827q0;
                if (y1Var9 != null) {
                    if (z10) {
                        Editable G4 = this.P.G4(i19, i21, i20, i22);
                        if (G4 == null) {
                            h = false;
                        } else {
                            h = i6.h(G4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (h) {
                            z12 = true;
                            y1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    y1Var9.setSelected(z12);
                }
                y1 y1Var10 = this.f13831s0;
                if (y1Var10 != null) {
                    if (z10) {
                        Editable G42 = this.P.G4(i19, i21, i20, i22);
                        if (G42 == null) {
                            g10 = false;
                        } else {
                            g10 = i6.g(G42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (g10) {
                            z11 = true;
                            y1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    y1Var10.setSelected(z11);
                }
                if (z10 && i19 == i20) {
                    z19 = true;
                }
                u0(z19, this.P.k2());
            }
        }
    }

    public final void z0() {
        boolean z10;
        float f7;
        boolean q22 = this.P.q2();
        g2 g2Var = this.P.J3;
        if (g2Var != null && !g2Var.f13917c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.V;
        float f10 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(q22);
            ImageView imageView2 = this.V;
            if (q22) {
                f7 = 1.0f;
            } else {
                f7 = 0.35f;
            }
            imageView2.setAlpha(f7);
        }
        ImageView imageView3 = this.W;
        if (imageView3 != null) {
            imageView3.setEnabled(z10);
            ImageView imageView4 = this.W;
            if (z10) {
                f10 = 1.0f;
            }
            imageView4.setAlpha(f10);
        }
    }

    public c2(String str) {
        super(null);
        this.f13810c = -1;
        this.d = -1;
        this.f13835w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f13816f0 = new ArrayList();
        this.f13821k0 = Integer.MAX_VALUE;
        this.f13822l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new i1(this, 0);
        this.f13815f = str;
    }

    public c2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f13810c = -1;
        this.d = -1;
        this.f13835w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f13816f0 = new ArrayList();
        this.f13821k0 = Integer.MAX_VALUE;
        this.f13822l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new i1(this, 0);
        this.f13808b = richMessage;
    }
}

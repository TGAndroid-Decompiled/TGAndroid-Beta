package hi;

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
import bi.va;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.cj0;
import org.telegram.ui.eo;
import org.telegram.ui.gc1;
import org.telegram.ui.mu0;
import org.telegram.ui.ok;
public final class g2 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public rz A0;
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
    public di.j2 H0;
    public float I;
    public int I0;
    public eo J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public r1 N0;
    public x1 O;
    public cj0 O0;
    public z3 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public k1 R0;
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
    public final CharSequence f9579a;
    public LinearLayout f9580a0;
    public final TL_iv.RichMessage f9581b;
    public dh f9582b0;
    public int f9583c;
    public ImageView f9584c0;
    public int d;
    public z1 f9585d0;
    public boolean e;
    public LinearLayout f9586e0;
    public final String f9587f;
    public final ArrayList f9588f0;
    public ImageView f9589g0;
    public CharSequence h;
    public gc1 f9590h0;
    public LinearLayout f9591i0;
    public a2 f9592j0;
    public int f9593k0;
    public final ArrayList f9594l0;
    public LinearLayout m0;
    public CharSequence f9595n;
    public LinearLayout f9596n0;
    public LinearLayout f9597o0;
    public c2 f9598p0;
    public c2 f9599q0;
    public MessageObject f9600r;
    public c2 f9601r0;
    public gh.g f9602s;
    public c2 f9603s0;
    public c2 f9604t0;
    public c2 f9605u0;
    public ok v;
    public FrameLayout f9606v0;
    public final Rect f9607w;
    public kj0 f9608w0;
    public bh.d f9609x;
    public w70 f9610x0;
    public RectF f9611y;
    public b2 f9612y0;
    public m.r3 f9613z0;

    public g2(Editable editable) {
        super(null);
        this.f9583c = -1;
        this.d = -1;
        this.f9607w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f9588f0 = new ArrayList();
        this.f9593k0 = Integer.MAX_VALUE;
        this.f9594l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new l1(this, 0);
        this.f9579a = editable;
    }

    public static void U(g2 g2Var) {
        m3 m3Var = g2Var.P.f10011n3;
        if (m3Var != null && m3Var.y()) {
            g2Var.n0();
            return;
        }
        Activity parentActivity = g2Var.getParentActivity();
        new y(g2Var.currentAccount, parentActivity, new ai.b(g2Var, 23), g2Var.getResourceProvider()).show();
    }

    public static void V(g2 g2Var) {
        if (!UserConfig.getInstance(g2Var.currentAccount).isPremium()) {
            g2Var.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) g2Var, 43, true));
        }
    }

    public static boolean W(g2 g2Var, View view) {
        int i10;
        eo eoVar = g2Var.J;
        if (eoVar != null && g2Var.f9600r == null && !eoVar.c() && g2Var.P.j3() && !g2Var.P.l3()) {
            if (!g2Var.P.L3()) {
                g2Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Y2 = g2Var.P.Y2();
            if (!Y2.isEmpty()) {
                cj0 cj0Var = g2Var.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    g2Var.O0 = null;
                }
                cj0 cj0Var2 = new cj0(g2Var.getParentActivity(), g2Var.getResourceProvider());
                g2Var.O0 = cj0Var2;
                cj0Var2.setOnDismissListener(new gg.o(g2Var, 3));
                long a2 = g2Var.J.a();
                MessageObject messageObject = g2Var.J.f32421n5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f17216id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(g2Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(g2Var.currentAccount).getPeer(UserConfig.getInstance(g2Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Y2;
                richMessage.photos = g2Var.P.A2();
                tL_message.rich_message.documents = g2Var.P.x2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(g2Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                g2Var.O0.q(org.telegram.messenger.a2.l(messageObject2));
                g2Var.f9612y0.setScaleX(1.0f);
                g2Var.f9612y0.setScaleY(1.0f);
                xg r10 = g2Var.O0.r(g2Var.f9612y0, true, new m1(g2Var, 10));
                if (r10 != null) {
                    r10.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), g2Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh))));
                    cj0 cj0Var3 = g2Var.O0;
                    int dp = AndroidUtilities.dp(44.0f);
                    cj0Var3.m0 = true;
                    cj0Var3.Y = dp;
                }
                w70 H = w70.H(g2Var, g2Var.f9612y0);
                boolean isUserSelf = UserObject.isUserSelf(g2Var.J.i());
                if (g2Var.J.D6()) {
                    int i11 = R.drawable.msg_calendar2;
                    if (isUserSelf) {
                        i10 = R.string.SetReminder;
                    } else {
                        i10 = R.string.ScheduleMessage;
                    }
                    H.c(i11, LocaleController.getString(i10), new va(g2Var, a2, 6), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new l1(g2Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new l1(g2Var, 6), false);
                }
                H.Y();
                g2Var.O0.p(H);
                g2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void X(g2 g2Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(g2Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, g2Var.J);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(g2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j3, messageObject2, messageObject3, z10, i10, i11, sendMessageChatArguments, 0L, j10, 0L);
        }
    }

    public static void Y(final g2 g2Var, Context context, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        w70 w70Var;
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
        w70 w70Var2 = g2Var.f9610x0;
        if (w70Var2 != null) {
            w70Var2.u();
            g2Var.f9610x0 = null;
        }
        if (!MessagesController.getInstance(g2Var.currentAccount).richEditorAllowed() && !UserConfig.getInstance(g2Var.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a P2 = g2Var.P.P2();
        final w70 I = w70.I(g2Var, view);
        I.Q = true;
        w70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new i(I, 1), false);
        J.k();
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(g2Var) {
            public final g2 f9794b;

            {
                this.f9794b = g2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f17723a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f17723a.setTextSize(1, SharedConfig.fontSize + 2);
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(g2Var) {
            public final g2 f9794b;

            {
                this.f9794b = g2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f17723a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f17723a.setTextSize(1, SharedConfig.fontSize + 1);
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(g2Var) {
            public final g2 f9794b;

            {
                this.f9794b = g2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f17723a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f17723a.setTextSize(1, SharedConfig.fontSize);
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(g2Var) {
            public final g2 f9794b;

            {
                this.f9794b = g2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f17723a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f17723a.setTextSize(1, SharedConfig.fontSize - 1);
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(g2Var) {
            public final g2 f9794b;

            {
                this.f9794b = g2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f17723a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f17723a.setTextSize(1, SharedConfig.fontSize - 2);
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(g2Var) {
            public final g2 f9794b;

            {
                this.f9794b = g2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f9794b.P.U4(P2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f17723a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f17723a.setTextSize(1, SharedConfig.fontSize - 3);
        if (P2 != null && z3.B3(P2.f9421b)) {
            w70Var = J;
            z17 = true;
        } else {
            w70Var = J;
            z17 = false;
        }
        e2 e2Var = new e2(context, R.drawable.iv_h);
        e2Var.a(z10);
        int i10 = org.telegram.ui.ActionBar.j6.G8;
        e2Var.d = i10;
        I.j(z17, 0, e2Var, LocaleController.getString(R.string.ArticleHeading), new di.p2(I, w70Var, 2));
        I.y().f17723a.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.g1 y3 = I.y();
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
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new p1(g2Var, P2, 3));
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new p1(g2Var, P2, 4));
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        e2 e2Var2 = new e2(context, R.drawable.iv_pullquote);
        e2Var2.a(z10);
        e2Var2.d = i10;
        I.j(z20, 0, e2Var2, LocaleController.getString(R.string.ArticlePullquote), new p1(g2Var, P2, 0));
        org.telegram.ui.ActionBar.g1 y10 = I.y();
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
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new p1(g2Var, P2, 1));
        if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        e2 e2Var3 = new e2(context, R.drawable.iv_footer);
        e2Var3.a(z10);
        e2Var3.d = i10;
        I.j(z22, 0, e2Var3, LocaleController.getString(R.string.ArticleFooter), new p1(g2Var, P2, 2));
        org.telegram.ui.ActionBar.g1 y11 = I.y();
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
        g2Var.f9610x0 = I;
    }

    public static void Z(g2 g2Var, boolean z10, boolean z11) {
        float f7;
        int i10;
        if (g2Var.J0 != z10 || !z11) {
            g2Var.J0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            if (z11) {
                g2Var.f9608w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(wr.h).start();
            } else {
                g2Var.f9608w0.animate().cancel();
                g2Var.f9608w0.setScaleX(f7);
                g2Var.f9608w0.setScaleY(f7);
            }
            kj0 kj0Var = g2Var.f9608w0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.f18162q7;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.G6;
            }
            kj0Var.setColorFilter(new PorterDuffColorFilter(g2Var.getThemedColor(i10), PorterDuff.Mode.SRC_IN));
            hj0 animatedDrawable = g2Var.f9608w0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f23648b0 > 34) {
                        animatedDrawable.N(0, false, false);
                    }
                    animatedDrawable.P(33);
                } else {
                    animatedDrawable.P(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public static k1 a0(g2 g2Var) {
        k1 focusedEditTextOrNull = g2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            g2Var.R0 = focusedEditTextOrNull;
            g2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        k1 k1Var = g2Var.R0;
        if (k1Var != null) {
            return k1Var;
        }
        return g2Var.P.O2();
    }

    public static int b0(g2 g2Var, k1 k1Var) {
        if (k1Var == g2Var.R0 && g2Var.P.getFocusedEditTextOrNull() != k1Var) {
            return Math.min(g2Var.S0, k1Var.length());
        }
        return Math.max(0, k1Var.getSelectionEnd());
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
        final org.telegram.ui.ActionBar.h3 i10 = em.i(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i10.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        linearLayout.addView(imageView, w7.a6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-1, -2, 49, 25, 16, 25, 0), context);
        g10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        g10.setTextSize(1, 14.0f);
        g10.setGravity(17);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        linearLayout.addView(g10, w7.a6.t(-1, -2, 49, 25, 11, 25, 0));
        bi.d g11 = em.g(24, context, f6Var, true);
        g11.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(g11, w7.a6.t(-1, 48, 49, 14, 31, 14, 0));
        bi.d g12 = em.g(24, context, f6Var, false);
        g12.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(g12, w7.a6.t(-1, 48, 49, 14, 2, 14, 6));
        i10.show();
        g11.setOnClickListener(new View.OnClickListener() {
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
        g12.setOnClickListener(new View.OnClickListener() {
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
            ((c2) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        float f7;
        if (this.f9612y0 == null) {
            return;
        }
        boolean L3 = this.P.L3();
        this.f9612y0.setEnabled(L3);
        ViewPropertyAnimator animate = this.f9612y0.animate();
        if (L3) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(150L).start();
    }

    public final void C0() {
        b2 b2Var = this.f9612y0;
        if (b2Var == null) {
            return;
        }
        b2Var.setLocked(m0());
    }

    public final c2 c0(int i10, int i11, boolean z10) {
        int i12;
        c2 c2Var = new c2(this.f9586e0.getContext(), i10, getResourceProvider());
        if (z10) {
            c2Var.d();
            this.N.add(c2Var);
        }
        c2Var.setTag(Integer.valueOf(i11));
        c2Var.setContentDescription(g0(i11));
        this.f9588f0.add(c2Var);
        LinearLayout linearLayout = this.f9586e0;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(c2Var, w7.a6.t(38, 38, 16, i12, 0, 0, 0));
        return c2Var;
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
        this.O = new x1(this, context);
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.F0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        di.j2 j2Var = new di.j2(this, 1);
        this.H0 = j2Var;
        this.O.f21643r.add(j2Var);
        z3 z3Var = new z3(context, this.currentAccount, getResourceProvider(), new xa.c(this, 24));
        this.P = z3Var;
        z3Var.setFileRefParentObject(this.f9600r);
        this.O.addView(this.P, w7.a6.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), w7.a6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f9581b;
        if (richMessage != null) {
            z3 z3Var2 = this.P;
            ArrayList arrayList2 = z3Var2.f10008l3;
            z3Var2.f10006k3 = richMessage;
            z3.V2(arrayList2, richMessage.blocks, z3Var2.f10009m3);
            z3Var2.U3();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                z3Var2.u4((a) arrayList2.get(i13));
            }
            z3Var2.Y2.N(false);
        } else {
            String str = this.f9587f;
            if (str != null) {
                z3 z3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f9595n;
                HashMap hashMap = z3Var3.f10009m3;
                ArrayList arrayList3 = z3Var3.f10008l3;
                if (!TextUtils.isEmpty(charSequence)) {
                    z3.V2(arrayList3, f5.b(charSequence), hashMap);
                }
                arrayList3.addAll(z3Var3.v4(g4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    z3.V2(arrayList3, f5.b(charSequence2), hashMap);
                }
                z3Var3.U3();
                z3Var3.Y2.N(false);
            } else {
                CharSequence charSequence3 = this.f9579a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        k2 k2Var = this.P.J3;
        if (k2Var != null) {
            k2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = org.telegram.ui.ActionBar.j6.f17928d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i14), org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i14))}));
        this.O.addView(this.Q, w7.a6.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14)}));
        this.O.addView(this.R, w7.a6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, w7.a6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i14);
        int themedColor2 = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.j6.f18017i6;
        imageView3.setBackground(new f2(org.telegram.ui.ActionBar.j6.Z(themedColor, org.telegram.ui.ActionBar.j6.v(themedColor2, getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.T;
        int i16 = org.telegram.ui.ActionBar.j6.G6;
        int themedColor3 = getThemedColor(i16);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        w7.c6.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.T.setOnClickListener(new m1(this, 1));
        this.S.addView(this.T, w7.a6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.S.addView(this.U, w7.a6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        this.V.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, -1));
        this.V.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.c6.a(this.V);
        this.V.setContentDescription(LocaleController.getString(R.string.Undo));
        this.V.setOnClickListener(new m1(this, 2));
        this.U.addView(this.V, w7.a6.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        this.W.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 1, -1));
        this.W.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.c6.a(this.W);
        this.W.setContentDescription(LocaleController.getString(R.string.Redo));
        this.W.setOnClickListener(new m1(this, 3));
        this.U.addView(this.W, w7.a6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, w7.a6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, w7.a6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f9580a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f9580a0.setClipChildren(false);
        this.f9580a0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Z.addView(this.f9580a0, w7.a6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f9584c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.k0(context));
        this.f9584c0.setScaleType(scaleType);
        this.f9584c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f9584c0.setBackground(new f2(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i14), org.telegram.ui.ActionBar.j6.v(getThemedColor(i14), getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.f9580a0.addView(this.f9584c0, w7.a6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.c6.a(this.f9584c0);
        this.f9584c0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f9584c0.setOnClickListener(new m1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        frameLayout5.addView(frameLayout6, w7.a6.e(-2, 44, 81));
        z1 z1Var = new z1(context, 0);
        this.f9585d0 = z1Var;
        z1Var.setClipToOutline(true);
        this.f9585d0.setOutlineProvider(new bi.g(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f9586e0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f9586e0.setOrientation(0);
        this.f9585d0.addView(this.f9586e0);
        frameLayout6.addView(this.f9585d0, w7.a6.c(-1.0f, -1));
        dh dhVar = new dh(context, 24);
        this.f9582b0 = dhVar;
        dhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.f9582b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f9582b0.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f9582b0.j(bh.e, false);
        this.f9586e0.addView(this.f9582b0, w7.a6.q(38, 38, 16));
        w7.c6.a(this.f9582b0);
        this.f9582b0.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.f9582b0.setOnClickListener(new m1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new bi.n3(9, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new m1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new m1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new m1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f9589g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f9589g0.setScaleType(scaleType);
        this.f9589g0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f9589g0.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f9586e0.addView(this.f9589g0, w7.a6.t(38, 38, 16, 2, 0, 0, 0));
        w7.c6.a(this.f9589g0);
        this.f9589g0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f9589g0.setOnClickListener(new m1(this, 9));
        this.f9580a0.addView(frameLayout5, w7.a6.l(1.0f, 0, 44));
        gc1 gc1Var = new gc1(this, context, 2);
        this.f9590h0 = gc1Var;
        gc1Var.setOrientation(0);
        this.f9590h0.setClipToPadding(false);
        this.f9590h0.setClipChildren(false);
        this.f9590h0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f9590h0, w7.a6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f9606v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f9606v0.setClipToPadding(false);
        this.f9606v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f9606v0, w7.a6.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f9608w0 = imageView9;
        imageView9.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        hj0 animatedDrawable = this.f9608w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f9608w0.setScaleType(scaleType);
        this.f9608w0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f9608w0.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f9606v0.addView(this.f9608w0, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f9590h0.addView(frameLayout8, w7.a6.c(44.0f, -2));
        a2 a2Var = new a2(this, context);
        this.f9592j0 = a2Var;
        a2Var.setHorizontalScrollBarEnabled(false);
        this.f9592j0.setClipToOutline(true);
        this.f9592j0.setOutlineProvider(new bi.g(3));
        frameLayout8.addView(this.f9592j0, w7.a6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f9591i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f9591i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f9592j0.addView(this.f9591i0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        c2 c2Var = new c2(context, R.drawable.iv_quote, getResourceProvider());
        this.f9605u0 = c2Var;
        c2Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f9605u0.setOnClickListener(new m1(this, 11));
        LinearLayout linearLayout5 = this.f9591i0;
        c2 c2Var2 = this.f9605u0;
        if (linearLayout5.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout5.addView(c2Var2, w7.a6.t(38, 38, 16, i10, 0, 0, 0));
        c2 c2Var3 = new c2(context, R.drawable.iv_button, getResourceProvider());
        this.f9601r0 = c2Var3;
        c2Var3.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f9601r0.setOnClickListener(new m1(this, 12));
        LinearLayout linearLayout6 = this.f9591i0;
        c2 c2Var4 = this.f9601r0;
        if (linearLayout6.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout6.addView(c2Var4, w7.a6.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f9596n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f9596n0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f9596n0.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f9590h0.addView(this.f9596n0, w7.a6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        c2 c2Var5 = new c2(context, R.drawable.media_link_24, getResourceProvider());
        this.f9599q0 = c2Var5;
        c2Var5.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.f9599q0.setOnClickListener(new m1(this, 13));
        this.f9596n0.addView(this.f9599q0, w7.a6.q(38, 38, 16));
        c2 c2Var6 = new c2(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f9603s0 = c2Var6;
        c2Var6.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f9603s0.setOnClickListener(new m1(this, 14));
        this.f9596n0.addView(this.f9603s0, w7.a6.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f9597o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f9597o0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f9597o0.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f9590h0.addView(this.f9597o0, w7.a6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        c2 c2Var7 = new c2(context, R.drawable.iv_math, getResourceProvider());
        this.f9604t0 = c2Var7;
        c2Var7.d();
        arrayList.add(this.f9604t0);
        this.f9604t0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f9604t0.setOnClickListener(new m1(this, 15));
        this.f9597o0.addView(this.f9604t0, w7.a6.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.m0.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f9590h0.addView(this.m0, 0, w7.a6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        c2 c2Var8 = new c2(context, 0, getResourceProvider());
        this.f9598p0 = c2Var8;
        c2Var8.setImageDrawable(new org.telegram.ui.Components.k0(context));
        this.f9598p0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f9598p0.setOnClickListener(new m1(this, 16));
        this.m0.addView(this.f9598p0, w7.a6.q(38, 38, 16));
        if (this.f9600r != null) {
            i12 = R.drawable.input_done;
        } else if (l0()) {
            i12 = R.drawable.input_schedule;
        } else {
            i12 = R.drawable.send_plane_24;
        }
        b2 b2Var = new b2((Object) this, context, i12, getResourceProvider(), 0);
        this.f9612y0 = b2Var;
        b2Var.setBackground(new f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(org.telegram.ui.ActionBar.j6.Yd))));
        w7.c6.a(this.f9612y0);
        this.f9580a0.addView(this.f9612y0, w7.a6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f9612y0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f9612y0.setOnClickListener(new m1(this, 0));
        this.f9612y0.setOnLongClickListener(new bi.l6(this, 3));
        C0();
        this.O.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new j(this, 1));
        A0();
        if (this.e) {
            this.P.B2();
            this.e = false;
        }
        x1 x1Var = this.O;
        this.fragmentView = x1Var;
        return x1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z10) {
        int i12;
        c2 c2Var = new c2(context, i10, getResourceProvider());
        if (z10) {
            c2Var.d();
            this.N.add(c2Var);
        }
        c2Var.setTag(Integer.valueOf(i11));
        c2Var.setContentDescription(i0(i11));
        c2Var.setOnClickListener(new bi.j5(this, i11, 2));
        this.f9594l0.add(c2Var);
        LinearLayout linearLayout = this.f9591i0;
        if (linearLayout.getChildCount() > 0) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        linearLayout.addView(c2Var, w7.a6.t(38, 38, 16, i12, 0, 0, 0));
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
        ofFloat.addUpdateListener(new n1(this, 0));
        this.P0.setInterpolator(wr.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        rz rzVar = this.A0;
        if (rzVar != null && (layoutParams = (FrameLayout.LayoutParams) rzVar.getLayoutParams()) != null) {
            int j02 = j0();
            x1 x1Var = this.O;
            if (x1Var == null) {
                max = j0();
            } else {
                max = Math.max(j0(), ((x1Var.getMeasuredHeight() - this.O.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.T0);
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
        rz rzVar = this.A0;
        if (rzVar != null && (layoutParams = (FrameLayout.LayoutParams) rzVar.getLayoutParams()) != null) {
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
        z3 z3Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        z3Var.O3 = i12;
        z3Var.P3 = i13;
        z3Var.Q3 = i14;
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
        z3 z3Var = this.P;
        if (z3Var != null && z3Var.f10011n3.y()) {
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
            rz rzVar = this.A0;
            if (rzVar != null) {
                rzVar.t(false);
                this.A0.A();
            }
        }
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        this.Q0 = 0.0f;
        this.R0 = null;
        rz rzVar2 = this.A0;
        if (rzVar2 != null) {
            rzVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            h0();
        }
        dh dhVar = this.f9582b0;
        if (dhVar != null) {
            dhVar.j(bh.e, z10);
        }
    }

    public final boolean l0() {
        eo eoVar;
        if (this.f9600r == null && (eoVar = this.J) != null && eoVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            z3 z3Var = this.P;
            if (f5.f(z3Var.f10008l3, z3Var.f10009m3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n0() {
        q3 g22 = this.P.g2();
        if (g22 != null) {
            TL_iv.RichMessage a2 = g22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(getParentActivity(), getResourceProvider());
            g0Var.n0(a2);
            g0Var.f23121k0 = new ai.b(g22, 21);
            g0Var.show();
        }
    }

    public final void o0(int i10, int i11) {
        z3 z3Var = this.P;
        z3Var.f9994c4 = z3Var.P2();
        yi yiVar = new yi(getParentActivity(), this, false, false, true, getResourceProvider());
        yiVar.Z1 = new u1(this, yiVar);
        yiVar.f29378j0.setIncludeVideosInGallery(true);
        yiVar.f29378j0.f0();
        yiVar.J1(1, true);
        yiVar.h1(i10);
        yiVar.f29411t2 = new t1(this, yiVar);
        yiVar.Y = new t1(this, yiVar);
        yiVar.X = new v1(this, yiVar);
        yiVar.r1();
        if (i11 != 0) {
            yiVar.A1(i11);
        }
        yiVar.setFocusable(true);
        yiVar.show();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1 && i10 == 21) {
            if (intent != null && intent.getData() != null) {
                z3 z3Var = this.P;
                Uri data = intent.getData();
                if (data == null) {
                    z3Var.getClass();
                } else if (z3Var.getContext() != null) {
                    Utilities.globalQueue.postRunnable(new fg.s1(12, z3Var, data));
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
                rz rzVar = this.A0;
                if (rzVar != null) {
                    rzVar.t(false);
                    this.A0.A();
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
        if (!AndroidUtilities.isTablet() && this.f9602s != null && this.v != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            gh.g gVar = this.f9602s;
            this.f9609x = gVar.f9136f;
            gVar.e = false;
            gVar.invalidate();
            this.v.setAlpha(0.0f);
            this.v.f20959z1.setVisibility(4);
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
            ofFloat.addUpdateListener(new n1(this, 1));
            ofFloat.addListener(new bi.u3(6, this, runnable));
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
            animatorSet.setInterpolator(wr.h);
            this.O.post(new mu0(animatorSet, 4));
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
        di.j2 j2Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.V0) {
            q0();
            this.V0 = true;
        }
        r1 r1Var = this.N0;
        if (r1Var != null) {
            this.N0 = null;
            AndroidUtilities.runOnUIThread(r1Var);
        }
        cj0 cj0Var = this.O0;
        if (cj0Var != null) {
            cj0Var.i();
            this.O0 = null;
        }
        z3 z3Var = this.P;
        if (z3Var != null) {
            z3Var.F2();
        }
        m.r3 r3Var = this.f9613z0;
        if (r3Var != null) {
            r3Var.a();
        }
        super.onFragmentDestroy();
        rz rzVar = this.A0;
        if (rzVar != null) {
            rzVar.D();
        }
        x1 x1Var = this.O;
        if (x1Var != null && (j2Var = this.H0) != null) {
            x1Var.f21643r.remove(j2Var);
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
        w70 w70Var;
        i0.c f7 = l1Var.f41074a.f(3);
        int i10 = l1Var.f41074a.f(8).d;
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
        if (!this.G0 && z11 && (w70Var = this.f9610x0) != null) {
            w70Var.u();
            this.f9610x0 = null;
        }
        onInsets(f7.f10074a, f7.f10075b, f7.f10076c, f7.d);
        return r0.l1.f41073b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        z3 z3Var;
        int i10;
        z3 z3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.f9583c) >= 0 && (z3Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f9583c = -1;
            if (!z3Var2.X1(i10, i11)) {
                z3Var2.post(new s2(z3Var2, i10, i11, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f9581b != null || this.f9587f != null) && (z3Var = this.P) != null && !z3Var.Z2()) {
                z3Var.post(new b(z3Var, 5));
            }
        }
    }

    public final boolean q0() {
        TL_iv.RichMessage i22;
        Runnable runnable;
        if (this.J == null || this.f9600r != null || !this.P.q2()) {
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
        ok okVar = this.J.Y;
        if (i22 != null && !this.M) {
            z3 z3Var = this.P;
            if (z3Var.j3() && !f5.f(z3Var.f10008l3, z3Var.f10009m3) && okVar != null) {
                SpannableStringBuilder k10 = f5.k(this.P.f10008l3);
                eo eoVar = okVar.O2;
                if (okVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, okVar.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.y5.class);
                if (y5VarArr != null) {
                    for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                        y5Var.applyFontMetrics(okVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.p5.g());
                    }
                }
                org.telegram.ui.Components.cj0.a(spannableStringBuilder);
                if (eoVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(okVar.Q).saveDraft(eoVar.a(), eoVar.B7(eoVar.f32421n5), charSequenceArr[0], MediaDataController.getInstance(okVar.Q).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                okVar.setRichDraftPreview(null);
                if (okVar.E0.getText() != null) {
                    okVar.E0.getText().clear();
                }
                okVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        eo eoVar2 = this.J;
        mediaDataController.saveDraft(a2, eoVar2.B7(eoVar2.f32421n5), "", null, null, null, null, 0L, false, false, i22);
        TL_iv.RichMessage richMessage = i22;
        if (okVar == null) {
            return true;
        }
        okVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            z3 z3Var = this.P;
            Objects.requireNonNull(z3Var);
            p0(parentActivity, new b(z3Var, 0), new l1(this, 4), getResourceProvider());
        } else if (l0()) {
            org.telegram.ui.Components.d5.M(getParentActivity(), this.J.a(), new a4.m(this, 21), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    public final void s0(final int i10, final int i11, final boolean z10) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            z3 z3Var = this.P;
            Objects.requireNonNull(z3Var);
            p0(parentActivity, new b(z3Var, 0), new l1(this, 4), getResourceProvider());
        } else if (this.J != null && this.P.j3() && !this.P.l3()) {
            if (!this.P.L3()) {
                B0();
            } else if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
                ok okVar = this.J.Y;
                if (okVar != null) {
                    this.M = true;
                    Runnable runnable = this.K;
                    if (runnable != null) {
                        runnable.run();
                    }
                    okVar.R0(f5.k(this.P.f10008l3), z10, i10, i11);
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
                eo eoVar = this.J;
                final MessageObject messageObject = eoVar.f32421n5;
                final MessageObject messageObject2 = eoVar.X3;
                final long N8 = eoVar.N8();
                final SendMessageChatArguments C8 = this.J.C8();
                final MessageObject messageObject3 = this.f9600r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        g2.X(g2.this, messageObject3, Y2, A2, x22, a2, a10, messageObject, messageObject2, z10, i10, i11, C8, N8);
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
        ArrayList arrayList = this.f9594l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c2 c2Var = (c2) obj;
            if (((Integer) c2Var.getTag()).intValue() == 1) {
                c2Var.setEnabled(z10);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        c2 c2Var = this.f9599q0;
        if (c2Var != null) {
            c2Var.setEnabled(z10);
        }
        c2 c2Var2 = this.f9601r0;
        if (c2Var2 != null) {
            c2Var2.setEnabled(z11);
        }
        c2 c2Var3 = this.f9603s0;
        if (c2Var3 != null) {
            c2Var3.setEnabled(z10);
        }
        c2 c2Var4 = this.f9604t0;
        if (c2Var4 != null) {
            c2Var4.setEnabled(z10);
        }
    }

    public final void v0() {
        gh.g gVar = this.f9602s;
        int[] iArr = this.F;
        gVar.getLocationInWindow(iArr);
        if (this.f9611y == null) {
            this.f9611y = new RectF();
        }
        RectF rectF = new RectF(this.f9609x.getBounds());
        this.f9611y = rectF;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.g2.w0():void");
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
            this.f9580a0.setVisibility(0);
            ViewPropertyAnimator animate = this.f9580a0.animate();
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
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).withEndAction(new l1(this, 1)).start();
            this.f9590h0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f9590h0.animate();
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
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(wrVar).withEndAction(new l1(this, 2)).start();
            this.f9606v0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f9606v0.animate();
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(wrVar).withEndAction(new l1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f9580a0;
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.f9580a0;
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        linearLayout2.setAlpha(f7);
        LinearLayout linearLayout3 = this.f9580a0;
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        linearLayout3.setScaleX(f10);
        LinearLayout linearLayout4 = this.f9580a0;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout4.setScaleY(f11);
        LinearLayout linearLayout5 = this.f9580a0;
        if (i10 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout5.setTranslationY(dp);
        gc1 gc1Var = this.f9590h0;
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        gc1Var.setVisibility(i12);
        gc1 gc1Var2 = this.f9590h0;
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        gc1Var2.setAlpha(f12);
        gc1 gc1Var3 = this.f9590h0;
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        gc1Var3.setScaleX(f13);
        gc1 gc1Var4 = this.f9590h0;
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        gc1Var4.setScaleY(f14);
        gc1 gc1Var5 = this.f9590h0;
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        gc1Var5.setTranslationY(dp2);
        FrameLayout frameLayout = this.f9606v0;
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        FrameLayout frameLayout2 = this.f9606v0;
        if (i10 == 2) {
            f23 = 1.0f;
        }
        frameLayout2.setAlpha(f23);
        FrameLayout frameLayout3 = this.f9606v0;
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        frameLayout3.setScaleX(f15);
        FrameLayout frameLayout4 = this.f9606v0;
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
        k1 k1Var;
        int max3;
        boolean z17;
        boolean z18;
        s9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.f9594l0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.y()) {
            c2 c2Var = this.f9605u0;
            boolean z19 = false;
            if (c2Var != null) {
                z3 z3Var = this.P;
                int[] A4 = z3Var.A4();
                if (A4 != null && z3Var.G3(A4[0], A4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                c2Var.setSelected(z18);
            }
            if (this.P.K3()) {
                s9 textSelectionHelper2 = this.P.getTextSelectionHelper();
                int i10 = textSelectionHelper2.f20047u0;
                int i11 = textSelectionHelper2.f20048v0;
                int i12 = textSelectionHelper2.f20051y0;
                int i13 = textSelectionHelper2.f20049w0;
                int i14 = textSelectionHelper2.f20052z0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    c2 c2Var2 = (c2) obj;
                    c2Var2.setSelected(this.P.J3(((Integer) c2Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
                }
                if (i11 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    k1Var = this.P.M4(i10, i11);
                } else {
                    k1Var = null;
                }
                int max4 = Math.max(0, Math.min(i13, i14));
                if (k1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i13, i14), k1Var.length()));
                }
                c2 c2Var3 = this.f9599q0;
                if (c2Var3 != null) {
                    if (k1Var != null && max4 < max3 && i6.h(k1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    c2Var3.setSelected(z17);
                }
                c2 c2Var4 = this.f9603s0;
                if (c2Var4 != null) {
                    if (k1Var != null && max4 < max3 && i6.g(k1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    c2Var4.setSelected(z19);
                }
                t0(true);
                u0(z16, this.P.k2());
            } else if (this.P.v3()) {
                s9 textSelectionHelper3 = this.P.getTextSelectionHelper();
                k1 r22 = this.P.r2(textSelectionHelper3.f20047u0);
                int i16 = textSelectionHelper3.f20049w0;
                int i17 = textSelectionHelper3.f20052z0;
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
                    c2 c2Var5 = (c2) obj2;
                    int intValue = ((Integer) c2Var5.getTag()).intValue();
                    if (r22 != null && max < max2 && (intValue & r22.getCurrentStyle(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    c2Var5.setSelected(z15);
                }
                c2 c2Var6 = this.f9599q0;
                if (c2Var6 != null) {
                    if (r22 != null && max < max2 && i6.h(r22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c2Var6.setSelected(z14);
                }
                c2 c2Var7 = this.f9603s0;
                if (c2Var7 != null) {
                    if (r22 != null && max < max2 && i6.g(r22.getText(), max, max2)) {
                        z19 = true;
                    }
                    c2Var7.setSelected(z19);
                }
                t0(true);
                u0(true, this.P.k2());
            } else {
                int i19 = textSelectionHelper.f20047u0;
                int i20 = textSelectionHelper.f20050x0;
                int i21 = textSelectionHelper.f20049w0;
                int i22 = textSelectionHelper.f20052z0;
                if (i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.f10016p4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i23 = 0;
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    c2 c2Var8 = (c2) arrayList.get(i23);
                    int intValue2 = ((Integer) c2Var8.getTag()).intValue();
                    if (z10 && this.P.I3(intValue2, i19, i21, i20, i22)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c2Var8.setSelected(z13);
                    i23 = i24;
                }
                t0(!this.P.H3());
                c2 c2Var9 = this.f9599q0;
                if (c2Var9 != null) {
                    if (z10) {
                        Editable G4 = this.P.G4(i19, i21, i20, i22);
                        if (G4 == null) {
                            h = false;
                        } else {
                            h = i6.h(G4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (h) {
                            z12 = true;
                            c2Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    c2Var9.setSelected(z12);
                }
                c2 c2Var10 = this.f9603s0;
                if (c2Var10 != null) {
                    if (z10) {
                        Editable G42 = this.P.G4(i19, i21, i20, i22);
                        if (G42 == null) {
                            g10 = false;
                        } else {
                            g10 = i6.g(G42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (g10) {
                            z11 = true;
                            c2Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    c2Var10.setSelected(z11);
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
        k2 k2Var = this.P.J3;
        if (k2Var != null && !k2Var.f9699c.isEmpty()) {
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

    public g2(String str) {
        super(null);
        this.f9583c = -1;
        this.d = -1;
        this.f9607w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f9588f0 = new ArrayList();
        this.f9593k0 = Integer.MAX_VALUE;
        this.f9594l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new l1(this, 0);
        this.f9587f = str;
    }

    public g2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f9583c = -1;
        this.d = -1;
        this.f9607w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f9588f0 = new ArrayList();
        this.f9593k0 = Integer.MAX_VALUE;
        this.f9594l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new l1(this, 0);
        this.f9581b = richMessage;
    }
}

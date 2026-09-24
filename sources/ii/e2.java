package ii;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zg;
import org.telegram.ui.eu0;
import org.telegram.ui.jk;
import org.telegram.ui.ub1;
import org.telegram.ui.vi0;
import org.telegram.ui.wn;
public final class e2 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public lz A0;
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
    public ei.g2 H0;
    public float I;
    public int I0;
    public wn J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public p1 N0;
    public w1 O;
    public vi0 O0;
    public x3 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public i1 R0;
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
    public final CharSequence f11307a;
    public LinearLayout f11308a0;
    public final TL_iv.RichMessage f11309b;
    public bh f11310b0;
    public int f11311c;
    public ImageView f11312c0;
    public int d;
    public x1 f11313d0;
    public boolean e;
    public LinearLayout f11314e0;
    public final String f11315f;
    public final ArrayList f11316f0;
    public ImageView f11317g0;
    public CharSequence h;
    public ub1 f11318h0;
    public LinearLayout f11319i0;
    public y1 f11320j0;
    public int f11321k0;
    public final ArrayList f11322l0;
    public LinearLayout m0;
    public CharSequence f11323n;
    public LinearLayout f11324n0;
    public LinearLayout f11325o0;
    public a2 f11326p0;
    public a2 f11327q0;
    public MessageObject f11328r;
    public a2 f11329r0;
    public hh.g f11330s;
    public a2 f11331s0;
    public a2 f11332t0;
    public a2 f11333u0;
    public jk v;
    public FrameLayout f11334v0;
    public final Rect f11335w;
    public lj0 f11336w0;
    public ch.d f11337x;
    public y70 f11338x0;
    public RectF f11339y;
    public z1 f11340y0;
    public m.p3 f11341z0;

    public e2(Editable editable) {
        super(null);
        this.f11311c = -1;
        this.d = -1;
        this.f11335w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f11316f0 = new ArrayList();
        this.f11321k0 = Integer.MAX_VALUE;
        this.f11322l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new j1(this, 0);
        this.f11307a = editable;
    }

    public static void U(e2 e2Var) {
        k3 k3Var = e2Var.P.f11738n3;
        if (k3Var != null && k3Var.y()) {
            e2Var.n0();
            return;
        }
        Activity parentActivity = e2Var.getParentActivity();
        new x(e2Var.currentAccount, parentActivity, new q1(e2Var, 0), e2Var.getResourceProvider()).show();
    }

    public static void V(e2 e2Var) {
        if (!UserConfig.getInstance(e2Var.currentAccount).isPremium()) {
            e2Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) e2Var, 43, true));
        }
    }

    public static boolean W(e2 e2Var, View view) {
        int i10;
        wn wnVar = e2Var.J;
        if (wnVar != null && e2Var.f11328r == null && !wnVar.c() && e2Var.P.k3() && !e2Var.P.m3()) {
            if (!e2Var.P.M3()) {
                e2Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Z2 = e2Var.P.Z2();
            if (!Z2.isEmpty()) {
                vi0 vi0Var = e2Var.O0;
                if (vi0Var != null) {
                    vi0Var.h(false);
                    e2Var.O0 = null;
                }
                vi0 vi0Var2 = new vi0(e2Var.getParentActivity(), e2Var.getResourceProvider());
                e2Var.O0 = vi0Var2;
                vi0Var2.setOnDismissListener(new ai.f5(e2Var, 5));
                long a2 = e2Var.J.a();
                MessageObject messageObject = e2Var.J.f39559n5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f18342id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(e2Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(e2Var.currentAccount).getPeer(UserConfig.getInstance(e2Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Z2;
                richMessage.photos = e2Var.P.B2();
                tL_message.rich_message.documents = e2Var.P.y2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(e2Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                e2Var.O0.q(org.telegram.messenger.f0.k(messageObject2));
                e2Var.f11340y0.setScaleX(1.0f);
                e2Var.f11340y0.setScaleY(1.0f);
                vg r10 = e2Var.O0.r(e2Var.f11340y0, true, new k1(e2Var, 10));
                if (r10 != null) {
                    r10.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), e2Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh))));
                    vi0 vi0Var3 = e2Var.O0;
                    int dp = AndroidUtilities.dp(44.0f);
                    vi0Var3.m0 = true;
                    vi0Var3.Y = dp;
                }
                y70 H = y70.H(e2Var, e2Var.f11340y0);
                boolean isUserSelf = UserObject.isUserSelf(e2Var.J.i());
                if (e2Var.J.D6()) {
                    int i11 = R.drawable.msg_calendar2;
                    if (isUserSelf) {
                        i10 = R.string.SetReminder;
                    } else {
                        i10 = R.string.ScheduleMessage;
                    }
                    H.c(i11, LocaleController.getString(i10), new ai.j(e2Var, a2, 11), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new j1(e2Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new j1(e2Var, 6), false);
                }
                H.Y();
                e2Var.O0.p(H);
                e2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void X(e2 e2Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(e2Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, e2Var.J);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(e2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j3, messageObject2, messageObject3, z10, i10, i11, sendMessageChatArguments, 0L, j10, 0L);
        }
    }

    public static void Y(final e2 e2Var, Context context, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        y70 y70Var;
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
        y70 y70Var2 = e2Var.f11338x0;
        if (y70Var2 != null) {
            y70Var2.u();
            e2Var.f11338x0 = null;
        }
        if (!MessagesController.getInstance(e2Var.currentAccount).richEditorAllowed() && !UserConfig.getInstance(e2Var.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a Q2 = e2Var.P.Q2();
        final y70 I = y70.I(e2Var, view);
        I.Q = true;
        y70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(I, 1), false);
        J.k();
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(e2Var) {
            public final e2 f11523b;

            {
                this.f11523b = e2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18818a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18818a.setTextSize(1, SharedConfig.fontSize + 2);
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(e2Var) {
            public final e2 f11523b;

            {
                this.f11523b = e2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18818a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18818a.setTextSize(1, SharedConfig.fontSize + 1);
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(e2Var) {
            public final e2 f11523b;

            {
                this.f11523b = e2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18818a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18818a.setTextSize(1, SharedConfig.fontSize);
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(e2Var) {
            public final e2 f11523b;

            {
                this.f11523b = e2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18818a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18818a.setTextSize(1, SharedConfig.fontSize - 1);
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(e2Var) {
            public final e2 f11523b;

            {
                this.f11523b = e2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18818a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18818a.setTextSize(1, SharedConfig.fontSize - 2);
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(e2Var) {
            public final e2 f11523b;

            {
                this.f11523b = e2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11523b.P.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18818a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18818a.setTextSize(1, SharedConfig.fontSize - 3);
        if (Q2 != null && x3.C3(Q2.f11191b)) {
            y70Var = J;
            z17 = true;
        } else {
            y70Var = J;
            z17 = false;
        }
        c2 c2Var = new c2(context, R.drawable.iv_h);
        c2Var.a(z10);
        int i10 = org.telegram.ui.ActionBar.h6.G8;
        c2Var.d = i10;
        I.j(z17, 0, c2Var, LocaleController.getString(R.string.ArticleHeading), new ei.m2(I, y70Var, 2));
        I.y().f18818a.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.e1 y3 = I.y();
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
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new n1(e2Var, Q2, 3));
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new n1(e2Var, Q2, 4));
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        c2 c2Var2 = new c2(context, R.drawable.iv_pullquote);
        c2Var2.a(z10);
        c2Var2.d = i10;
        I.j(z20, 0, c2Var2, LocaleController.getString(R.string.ArticlePullquote), new n1(e2Var, Q2, 0));
        org.telegram.ui.ActionBar.e1 y10 = I.y();
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
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new n1(e2Var, Q2, 1));
        if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        c2 c2Var3 = new c2(context, R.drawable.iv_footer);
        c2Var3.a(z10);
        c2Var3.d = i10;
        I.j(z22, 0, c2Var3, LocaleController.getString(R.string.ArticleFooter), new n1(e2Var, Q2, 2));
        org.telegram.ui.ActionBar.e1 y11 = I.y();
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
        e2Var.f11338x0 = I;
    }

    public static void Z(e2 e2Var, boolean z10, boolean z11) {
        float f7;
        int i10;
        if (e2Var.J0 != z10 || !z11) {
            e2Var.J0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            if (z11) {
                e2Var.f11336w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(rr.h).start();
            } else {
                e2Var.f11336w0.animate().cancel();
                e2Var.f11336w0.setScaleX(f7);
                e2Var.f11336w0.setScaleY(f7);
            }
            lj0 lj0Var = e2Var.f11336w0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.h6.f19284q7;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.G6;
            }
            lj0Var.setColorFilter(new PorterDuffColorFilter(e2Var.getThemedColor(i10), PorterDuff.Mode.SRC_IN));
            ij0 animatedDrawable = e2Var.f11336w0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f25042a0 > 34) {
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

    public static i1 a0(e2 e2Var) {
        i1 focusedEditTextOrNull = e2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            e2Var.R0 = focusedEditTextOrNull;
            e2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        i1 i1Var = e2Var.R0;
        if (i1Var != null) {
            return i1Var;
        }
        return e2Var.P.P2();
    }

    public static int b0(e2 e2Var, i1 i1Var) {
        if (i1Var == e2Var.R0 && e2Var.P.getFocusedEditTextOrNull() != i1Var) {
            return Math.min(e2Var.S0, i1Var.length());
        }
        return Math.max(0, i1Var.getSelectionEnd());
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

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.d6 d6Var) {
        final org.telegram.ui.ActionBar.e3 j3 = ok.j(1, context, d6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j3.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
        linearLayout.addView(imageView, w7.y5.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.y5.t(-1, -2, 49, 25, 16, 25, 0), context);
        h.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        h.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        linearLayout.addView(h, w7.y5.t(-1, -2, 49, 25, 11, 25, 0));
        ci.d g10 = ok.g(24, context, d6Var, true);
        g10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(g10, w7.y5.t(-1, 48, 49, 14, 31, 14, 0));
        ci.d g11 = ok.g(24, context, d6Var, false);
        g11.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(g11, w7.y5.t(-1, 48, 49, 14, 2, 14, 6));
        j3.show();
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j3.dismiss();
                        runnable2.run();
                        return;
                    default:
                        j3.dismiss();
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
                        j3.dismiss();
                        runnable.run();
                        return;
                    default:
                        j3.dismiss();
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
            ((a2) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        float f7;
        if (this.f11340y0 == null) {
            return;
        }
        boolean M3 = this.P.M3();
        this.f11340y0.setEnabled(M3);
        ViewPropertyAnimator animate = this.f11340y0.animate();
        if (M3) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        ok.r(animate, f7, 150L);
    }

    public final void C0() {
        z1 z1Var = this.f11340y0;
        if (z1Var == null) {
            return;
        }
        z1Var.setLocked(m0());
    }

    public final a2 c0(int i10, int i11, boolean z10) {
        int i12;
        a2 a2Var = new a2(this.f11314e0.getContext(), i10, getResourceProvider());
        if (z10) {
            a2Var.d();
            this.N.add(a2Var);
        }
        a2Var.setTag(Integer.valueOf(i11));
        a2Var.setContentDescription(g0(i11));
        this.f11316f0.add(a2Var);
        LinearLayout linearLayout = this.f11314e0;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(a2Var, w7.y5.t(38, 38, 16, i12, 0, 0, 0));
        return a2Var;
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
        this.O = new w1(this, context);
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.F0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        ei.g2 g2Var = new ei.g2(this, 1);
        this.H0 = g2Var;
        this.O.f22799r.add(g2Var);
        x3 x3Var = new x3(context, this.currentAccount, getResourceProvider(), new a6.i(this, 26));
        this.P = x3Var;
        x3Var.setFileRefParentObject(this.f11328r);
        this.O.addView(this.P, w7.y5.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), w7.y5.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f11309b;
        if (richMessage != null) {
            x3 x3Var2 = this.P;
            ArrayList arrayList2 = x3Var2.f11735l3;
            x3Var2.f11733k3 = richMessage;
            x3.W2(arrayList2, richMessage.blocks, x3Var2.f11736m3);
            x3Var2.V3();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                x3Var2.v4((a) arrayList2.get(i13));
            }
            x3Var2.Y2.N(false);
        } else {
            String str = this.f11315f;
            if (str != null) {
                x3 x3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f11323n;
                HashMap hashMap = x3Var3.f11736m3;
                ArrayList arrayList3 = x3Var3.f11735l3;
                if (!TextUtils.isEmpty(charSequence)) {
                    x3.W2(arrayList3, d5.b(charSequence), hashMap);
                }
                arrayList3.addAll(x3Var3.w4(e4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    x3.W2(arrayList3, d5.b(charSequence2), hashMap);
                }
                x3Var3.V3();
                x3Var3.Y2.N(false);
            } else {
                CharSequence charSequence3 = this.f11307a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        i2 i2Var = this.P.J3;
        if (i2Var != null) {
            i2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = org.telegram.ui.ActionBar.h6.f19045d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i14), org.telegram.ui.ActionBar.h6.l1(0.0f, getThemedColor(i14))}));
        this.O.addView(this.Q, w7.y5.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14)}));
        this.O.addView(this.R, w7.y5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, w7.y5.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i14);
        int themedColor2 = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.h6.f19134i6;
        imageView3.setBackground(new d2(org.telegram.ui.ActionBar.h6.Z(themedColor, org.telegram.ui.ActionBar.h6.v(themedColor2, getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.T;
        int i16 = org.telegram.ui.ActionBar.h6.G6;
        int themedColor3 = getThemedColor(i16);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        w7.a6.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.T.setOnClickListener(new k1(this, 1));
        this.S.addView(this.T, w7.y5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.S.addView(this.U, w7.y5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        this.V.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i15), 1, -1));
        this.V.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.a6.a(this.V);
        this.V.setContentDescription(LocaleController.getString(R.string.Undo));
        this.V.setOnClickListener(new k1(this, 2));
        this.U.addView(this.V, w7.y5.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        this.W.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i15), 1, -1));
        this.W.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.a6.a(this.W);
        this.W.setContentDescription(LocaleController.getString(R.string.Redo));
        this.W.setOnClickListener(new k1(this, 3));
        this.U.addView(this.W, w7.y5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, w7.y5.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, w7.y5.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f11308a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f11308a0.setClipChildren(false);
        this.f11308a0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Z.addView(this.f11308a0, w7.y5.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f11312c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.f11312c0.setScaleType(scaleType);
        this.f11312c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11312c0.setBackground(new d2(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i14), org.telegram.ui.ActionBar.h6.v(getThemedColor(i14), getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.f11308a0.addView(this.f11312c0, w7.y5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.a6.a(this.f11312c0);
        this.f11312c0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f11312c0.setOnClickListener(new k1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        frameLayout5.addView(frameLayout6, w7.y5.e(-2, 44, 81));
        x1 x1Var = new x1(context, 0);
        this.f11313d0 = x1Var;
        x1Var.setClipToOutline(true);
        this.f11313d0.setOutlineProvider(new ai.k2(3));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f11314e0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11314e0.setOrientation(0);
        this.f11313d0.addView(this.f11314e0);
        frameLayout6.addView(this.f11313d0, w7.y5.c(-1.0f, -1));
        bh bhVar = new bh(context, 24);
        this.f11310b0 = bhVar;
        bhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.f11310b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11310b0.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f11310b0.j(zg.e, false);
        this.f11314e0.addView(this.f11310b0, w7.y5.q(38, 38, 16));
        w7.a6.a(this.f11310b0);
        this.f11310b0.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.f11310b0.setOnClickListener(new k1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new ai.f2(13, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new k1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new k1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new k1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f11317g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f11317g0.setScaleType(scaleType);
        this.f11317g0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11317g0.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f11314e0.addView(this.f11317g0, w7.y5.t(38, 38, 16, 2, 0, 0, 0));
        w7.a6.a(this.f11317g0);
        this.f11317g0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f11317g0.setOnClickListener(new k1(this, 9));
        this.f11308a0.addView(frameLayout5, w7.y5.l(1.0f, 0, 44));
        ub1 ub1Var = new ub1(this, context, 2);
        this.f11318h0 = ub1Var;
        ub1Var.setOrientation(0);
        this.f11318h0.setClipToPadding(false);
        this.f11318h0.setClipChildren(false);
        this.f11318h0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f11318h0, w7.y5.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f11334v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f11334v0.setClipToPadding(false);
        this.f11334v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f11334v0, w7.y5.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f11336w0 = imageView9;
        imageView9.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        ij0 animatedDrawable = this.f11336w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f11336w0.setScaleType(scaleType);
        this.f11336w0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11336w0.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11334v0.addView(this.f11336w0, w7.y5.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11318h0.addView(frameLayout8, w7.y5.c(44.0f, -2));
        y1 y1Var = new y1(this, context);
        this.f11320j0 = y1Var;
        y1Var.setHorizontalScrollBarEnabled(false);
        this.f11320j0.setClipToOutline(true);
        this.f11320j0.setOutlineProvider(new ai.k2(4));
        frameLayout8.addView(this.f11320j0, w7.y5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f11319i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f11319i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11320j0.addView(this.f11319i0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        a2 a2Var = new a2(context, R.drawable.iv_quote, getResourceProvider());
        this.f11333u0 = a2Var;
        a2Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f11333u0.setOnClickListener(new k1(this, 11));
        LinearLayout linearLayout5 = this.f11319i0;
        a2 a2Var2 = this.f11333u0;
        if (linearLayout5.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout5.addView(a2Var2, w7.y5.t(38, 38, 16, i10, 0, 0, 0));
        a2 a2Var3 = new a2(context, R.drawable.iv_button, getResourceProvider());
        this.f11329r0 = a2Var3;
        a2Var3.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f11329r0.setOnClickListener(new k1(this, 12));
        LinearLayout linearLayout6 = this.f11319i0;
        a2 a2Var4 = this.f11329r0;
        if (linearLayout6.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout6.addView(a2Var4, w7.y5.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f11324n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f11324n0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11324n0.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11318h0.addView(this.f11324n0, w7.y5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        a2 a2Var5 = new a2(context, R.drawable.media_link_24, getResourceProvider());
        this.f11327q0 = a2Var5;
        a2Var5.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.f11327q0.setOnClickListener(new k1(this, 13));
        this.f11324n0.addView(this.f11327q0, w7.y5.q(38, 38, 16));
        a2 a2Var6 = new a2(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f11331s0 = a2Var6;
        a2Var6.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f11331s0.setOnClickListener(new k1(this, 14));
        this.f11324n0.addView(this.f11331s0, w7.y5.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f11325o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f11325o0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11325o0.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11318h0.addView(this.f11325o0, w7.y5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        a2 a2Var7 = new a2(context, R.drawable.iv_math, getResourceProvider());
        this.f11332t0 = a2Var7;
        a2Var7.d();
        arrayList.add(this.f11332t0);
        this.f11332t0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f11332t0.setOnClickListener(new k1(this, 15));
        this.f11325o0.addView(this.f11332t0, w7.y5.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.m0.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11318h0.addView(this.m0, 0, w7.y5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        a2 a2Var8 = new a2(context, 0, getResourceProvider());
        this.f11326p0 = a2Var8;
        a2Var8.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.f11326p0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f11326p0.setOnClickListener(new k1(this, 16));
        this.m0.addView(this.f11326p0, w7.y5.q(38, 38, 16));
        if (this.f11328r != null) {
            i12 = R.drawable.input_done;
        } else if (l0()) {
            i12 = R.drawable.input_schedule;
        } else {
            i12 = R.drawable.send_plane_24;
        }
        z1 z1Var = new z1((Object) this, context, i12, getResourceProvider(), 0);
        this.f11340y0 = z1Var;
        z1Var.setBackground(new d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), getThemedColor(org.telegram.ui.ActionBar.h6.Yd))));
        w7.a6.a(this.f11340y0);
        this.f11308a0.addView(this.f11340y0, w7.y5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f11340y0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f11340y0.setOnClickListener(new k1(this, 0));
        this.f11340y0.setOnLongClickListener(new ci.m5(this, 3));
        C0();
        this.O.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        A0();
        if (this.e) {
            this.P.C2();
            this.e = false;
        }
        w1 w1Var = this.O;
        this.fragmentView = w1Var;
        return w1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z10) {
        int i12;
        a2 a2Var = new a2(context, i10, getResourceProvider());
        if (z10) {
            a2Var.d();
            this.N.add(a2Var);
        }
        a2Var.setTag(Integer.valueOf(i11));
        a2Var.setContentDescription(i0(i11));
        a2Var.setOnClickListener(new ci.n4(this, i11, 2));
        this.f11322l0.add(a2Var);
        LinearLayout linearLayout = this.f11319i0;
        if (linearLayout.getChildCount() > 0) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        linearLayout.addView(a2Var, w7.y5.t(38, 38, 16, i12, 0, 0, 0));
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
        ofFloat.addUpdateListener(new l1(this, 0));
        this.P0.setInterpolator(rr.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        lz lzVar = this.A0;
        if (lzVar != null && (layoutParams = (FrameLayout.LayoutParams) lzVar.getLayoutParams()) != null) {
            int j02 = j0();
            w1 w1Var = this.O;
            if (w1Var == null) {
                max = j0();
            } else {
                max = Math.max(j0(), ((w1Var.getMeasuredHeight() - this.O.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.T0);
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
        lz lzVar = this.A0;
        if (lzVar != null && (layoutParams = (FrameLayout.LayoutParams) lzVar.getLayoutParams()) != null) {
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
        x3 x3Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        x3Var.O3 = i12;
        x3Var.P3 = i13;
        x3Var.Q3 = i14;
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
        x3 x3Var = this.P;
        if (x3Var != null && x3Var.f11738n3.y()) {
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
            lz lzVar = this.A0;
            if (lzVar != null) {
                lzVar.t(false);
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
        lz lzVar2 = this.A0;
        if (lzVar2 != null) {
            lzVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            h0();
        }
        bh bhVar = this.f11310b0;
        if (bhVar != null) {
            bhVar.j(zg.e, z10);
        }
    }

    public final boolean l0() {
        wn wnVar;
        if (this.f11328r == null && (wnVar = this.J) != null && wnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            x3 x3Var = this.P;
            if (d5.f(x3Var.f11735l3, x3Var.f11736m3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n0() {
        o3 h22 = this.P.h2();
        if (h22 != null) {
            TL_iv.RichMessage a2 = h22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
            e0Var.n0(a2);
            e0Var.f23760k0 = new ai.y1(h22, 28);
            e0Var.show();
        }
    }

    public final void o0(int i10, int i11) {
        x3 x3Var = this.P;
        x3Var.f11721c4 = x3Var.Q2();
        wi wiVar = new wi(getParentActivity(), this, false, false, true, getResourceProvider());
        wiVar.Z1 = new t1(this, wiVar);
        wiVar.f29997j0.setIncludeVideosInGallery(true);
        wiVar.f29997j0.f0();
        wiVar.J1(1, true);
        wiVar.h1(i10);
        wiVar.f30030t2 = new s1(this, wiVar);
        wiVar.Y = new s1(this, wiVar);
        wiVar.X = new u1(this, wiVar);
        wiVar.r1();
        if (i11 != 0) {
            wiVar.A1(i11);
        }
        wiVar.setFocusable(true);
        wiVar.show();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1 && i10 == 21) {
            if (intent != null && intent.getData() != null) {
                x3 x3Var = this.P;
                Uri data = intent.getData();
                if (data == null) {
                    x3Var.getClass();
                } else if (x3Var.getContext() != null) {
                    Utilities.globalQueue.postRunnable(new gg.x1(13, x3Var, data));
                }
            }
        } else if (i11 == -1 && (i10 == 1 || i10 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.P.e2(intent.getData());
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
                lz lzVar = this.A0;
                if (lzVar != null) {
                    lzVar.t(false);
                    this.A0.A();
                }
                e0(false);
                return false;
            }
        } else if (this.B0) {
            k0(true);
            return false;
        } else if (!this.P.F2()) {
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
        if (!AndroidUtilities.isTablet() && this.f11330s != null && this.v != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            hh.g gVar = this.f11330s;
            this.f11337x = gVar.f10510f;
            gVar.e = false;
            gVar.invalidate();
            this.v.setAlpha(0.0f);
            this.v.A1.setVisibility(4);
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
            ofFloat.addUpdateListener(new l1(this, 1));
            ofFloat.addListener(new ai.z(8, this, runnable));
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
            animatorSet.setInterpolator(rr.h);
            this.O.post(new eu0(animatorSet, 4));
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
        ei.g2 g2Var;
        NotificationCenter.ObserversGroup observersGroup;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.V0) {
            q0();
            this.V0 = true;
        }
        p1 p1Var = this.N0;
        if (p1Var != null) {
            this.N0 = null;
            AndroidUtilities.runOnUIThread(p1Var);
        }
        vi0 vi0Var = this.O0;
        if (vi0Var != null) {
            vi0Var.i();
            this.O0 = null;
        }
        x3 x3Var = this.P;
        if (x3Var != null) {
            x3Var.G2();
        }
        m.p3 p3Var = this.f11341z0;
        if (p3Var != null) {
            p3Var.a();
        }
        super.onFragmentDestroy();
        lz lzVar = this.A0;
        if (lzVar != null && (observersGroup = lzVar.I2) != null) {
            observersGroup.removeAllObservers();
            lzVar.I2 = null;
        }
        w1 w1Var = this.O;
        if (w1Var != null && (g2Var = this.H0) != null) {
            w1Var.f22799r.remove(g2Var);
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
        y70 y70Var;
        i0.b f7 = l1Var.f42126a.f(3);
        int i10 = l1Var.f42126a.f(8).d;
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
        if (!this.G0 && z11 && (y70Var = this.f11338x0) != null) {
            y70Var.u();
            this.f11338x0 = null;
        }
        onInsets(f7.f10576a, f7.f10577b, f7.f10578c, f7.d);
        return r0.l1.f42125b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        x3 x3Var;
        int i10;
        x3 x3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.f11311c) >= 0 && (x3Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f11311c = -1;
            if (!x3Var2.Y1(i10, i11)) {
                x3Var2.post(new q2(x3Var2, i10, i11, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f11309b != null || this.f11315f != null) && (x3Var = this.P) != null && !x3Var.a3()) {
                x3Var.post(new b(x3Var, 5));
            }
        }
    }

    public final boolean q0() {
        TL_iv.RichMessage j22;
        Runnable runnable;
        if (this.J == null || this.f11328r != null || !this.P.r2()) {
            return false;
        }
        if (this.M) {
            j22 = null;
        } else {
            j22 = this.P.j2();
        }
        if (j22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        jk jkVar = this.J.Y;
        if (j22 != null && !this.M) {
            x3 x3Var = this.P;
            if (x3Var.k3() && !d5.f(x3Var.f11735l3, x3Var.f11736m3) && jkVar != null) {
                SpannableStringBuilder k10 = d5.k(this.P.f11735l3);
                wn wnVar = jkVar.P2;
                if (jkVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, jkVar.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class);
                if (z5VarArr != null) {
                    for (org.telegram.ui.Components.z5 z5Var : z5VarArr) {
                        z5Var.applyFontMetrics(jkVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.q5.g());
                    }
                }
                dj0.a(spannableStringBuilder);
                if (wnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(jkVar.Q).saveDraft(wnVar.a(), wnVar.B7(wnVar.f39559n5), charSequenceArr[0], MediaDataController.getInstance(jkVar.Q).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                jkVar.setRichDraftPreview(null);
                if (jkVar.E0.getText() != null) {
                    jkVar.E0.getText().clear();
                }
                jkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        wn wnVar2 = this.J;
        mediaDataController.saveDraft(a2, wnVar2.B7(wnVar2.f39559n5), "", null, null, null, null, 0L, false, false, j22);
        TL_iv.RichMessage richMessage = j22;
        if (jkVar == null) {
            return true;
        }
        jkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            x3 x3Var = this.P;
            Objects.requireNonNull(x3Var);
            p0(parentActivity, new b(x3Var, 0), new j1(this, 4), getResourceProvider());
        } else if (l0()) {
            org.telegram.ui.Components.e5.M(getParentActivity(), this.J.a(), new a6.m(this, 27), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    public final void s0(final int i10, final int i11, final boolean z10) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            x3 x3Var = this.P;
            Objects.requireNonNull(x3Var);
            p0(parentActivity, new b(x3Var, 0), new j1(this, 4), getResourceProvider());
        } else if (this.J != null && this.P.k3() && !this.P.m3()) {
            if (!this.P.M3()) {
                B0();
            } else if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
                jk jkVar = this.J.Y;
                if (jkVar != null) {
                    this.M = true;
                    Runnable runnable = this.K;
                    if (runnable != null) {
                        runnable.run();
                    }
                    jkVar.R0(d5.k(this.P.f11735l3), z10, i10, i11);
                    finishFragment();
                }
            } else {
                this.M = true;
                final ArrayList Z2 = this.P.Z2();
                if (Z2.isEmpty()) {
                    return;
                }
                final ArrayList B2 = this.P.B2();
                final ArrayList y22 = this.P.y2();
                final ArrayList a2 = c5.a(this.currentAccount, Z2);
                final long a10 = this.J.a();
                wn wnVar = this.J;
                final MessageObject messageObject = wnVar.f39559n5;
                final MessageObject messageObject2 = wnVar.X3;
                final long N8 = wnVar.N8();
                final SendMessageChatArguments C8 = this.J.C8();
                final MessageObject messageObject3 = this.f11328r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        e2.X(e2.this, messageObject3, Z2, B2, y22, a2, a10, messageObject, messageObject2, z10, i10, i11, C8, N8);
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
        ArrayList arrayList = this.f11322l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            if (((Integer) a2Var.getTag()).intValue() == 1) {
                a2Var.setEnabled(z10);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        a2 a2Var = this.f11327q0;
        if (a2Var != null) {
            a2Var.setEnabled(z10);
        }
        a2 a2Var2 = this.f11329r0;
        if (a2Var2 != null) {
            a2Var2.setEnabled(z11);
        }
        a2 a2Var3 = this.f11331s0;
        if (a2Var3 != null) {
            a2Var3.setEnabled(z10);
        }
        a2 a2Var4 = this.f11332t0;
        if (a2Var4 != null) {
            a2Var4.setEnabled(z10);
        }
    }

    public final void v0() {
        hh.g gVar = this.f11330s;
        int[] iArr = this.F;
        gVar.getLocationInWindow(iArr);
        if (this.f11339y == null) {
            this.f11339y = new RectF();
        }
        RectF rectF = new RectF(this.f11337x.getBounds());
        this.f11339y = rectF;
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
        throw new UnsupportedOperationException("Method not decompiled: ii.e2.w0():void");
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
            this.f11308a0.setVisibility(0);
            ViewPropertyAnimator animate = this.f11308a0.animate();
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
            rr rrVar = rr.h;
            duration.setInterpolator(rrVar).withEndAction(new j1(this, 1)).start();
            this.f11318h0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f11318h0.animate();
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
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(rrVar).withEndAction(new j1(this, 2)).start();
            this.f11334v0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f11334v0.animate();
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(rrVar).withEndAction(new j1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f11308a0;
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.f11308a0;
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        linearLayout2.setAlpha(f7);
        LinearLayout linearLayout3 = this.f11308a0;
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        linearLayout3.setScaleX(f10);
        LinearLayout linearLayout4 = this.f11308a0;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout4.setScaleY(f11);
        LinearLayout linearLayout5 = this.f11308a0;
        if (i10 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout5.setTranslationY(dp);
        ub1 ub1Var = this.f11318h0;
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ub1Var.setVisibility(i12);
        ub1 ub1Var2 = this.f11318h0;
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        ub1Var2.setAlpha(f12);
        ub1 ub1Var3 = this.f11318h0;
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        ub1Var3.setScaleX(f13);
        ub1 ub1Var4 = this.f11318h0;
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        ub1Var4.setScaleY(f14);
        ub1 ub1Var5 = this.f11318h0;
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        ub1Var5.setTranslationY(dp2);
        FrameLayout frameLayout = this.f11334v0;
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        FrameLayout frameLayout2 = this.f11334v0;
        if (i10 == 2) {
            f23 = 1.0f;
        }
        frameLayout2.setAlpha(f23);
        FrameLayout frameLayout3 = this.f11334v0;
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        frameLayout3.setScaleX(f15);
        FrameLayout frameLayout4 = this.f11334v0;
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
        i1 i1Var;
        int max3;
        boolean z17;
        boolean z18;
        q9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.f11322l0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.y()) {
            a2 a2Var = this.f11333u0;
            boolean z19 = false;
            if (a2Var != null) {
                x3 x3Var = this.P;
                int[] B4 = x3Var.B4();
                if (B4 != null && x3Var.H3(B4[0], B4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                a2Var.setSelected(z18);
            }
            if (this.P.L3()) {
                q9 textSelectionHelper2 = this.P.getTextSelectionHelper();
                int i10 = textSelectionHelper2.f20836u0;
                int i11 = textSelectionHelper2.f20837v0;
                int i12 = textSelectionHelper2.f20840y0;
                int i13 = textSelectionHelper2.f20838w0;
                int i14 = textSelectionHelper2.f20841z0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    a2 a2Var2 = (a2) obj;
                    a2Var2.setSelected(this.P.K3(((Integer) a2Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
                }
                if (i11 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    i1Var = this.P.N4(i10, i11);
                } else {
                    i1Var = null;
                }
                int max4 = Math.max(0, Math.min(i13, i14));
                if (i1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i13, i14), i1Var.length()));
                }
                a2 a2Var3 = this.f11327q0;
                if (a2Var3 != null) {
                    if (i1Var != null && max4 < max3 && g6.h(i1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    a2Var3.setSelected(z17);
                }
                a2 a2Var4 = this.f11331s0;
                if (a2Var4 != null) {
                    if (i1Var != null && max4 < max3 && g6.g(i1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    a2Var4.setSelected(z19);
                }
                t0(true);
                u0(z16, this.P.l2());
            } else if (this.P.w3()) {
                q9 textSelectionHelper3 = this.P.getTextSelectionHelper();
                i1 s22 = this.P.s2(textSelectionHelper3.f20836u0);
                int i16 = textSelectionHelper3.f20838w0;
                int i17 = textSelectionHelper3.f20841z0;
                if (s22 == null) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i16, i17), s22.length()));
                }
                if (s22 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0, Math.min(Math.max(i16, i17), s22.length()));
                }
                int size2 = arrayList.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList.get(i18);
                    i18++;
                    a2 a2Var5 = (a2) obj2;
                    int intValue = ((Integer) a2Var5.getTag()).intValue();
                    if (s22 != null && max < max2 && (intValue & s22.getCurrentStyle(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    a2Var5.setSelected(z15);
                }
                a2 a2Var6 = this.f11327q0;
                if (a2Var6 != null) {
                    if (s22 != null && max < max2 && g6.h(s22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    a2Var6.setSelected(z14);
                }
                a2 a2Var7 = this.f11331s0;
                if (a2Var7 != null) {
                    if (s22 != null && max < max2 && g6.g(s22.getText(), max, max2)) {
                        z19 = true;
                    }
                    a2Var7.setSelected(z19);
                }
                t0(true);
                u0(true, this.P.l2());
            } else {
                int i19 = textSelectionHelper.f20836u0;
                int i20 = textSelectionHelper.f20839x0;
                int i21 = textSelectionHelper.f20838w0;
                int i22 = textSelectionHelper.f20841z0;
                if (i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.f11743p4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i23 = 0;
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    a2 a2Var8 = (a2) arrayList.get(i23);
                    int intValue2 = ((Integer) a2Var8.getTag()).intValue();
                    if (z10 && this.P.J3(intValue2, i19, i21, i20, i22)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    a2Var8.setSelected(z13);
                    i23 = i24;
                }
                t0(!this.P.I3());
                a2 a2Var9 = this.f11327q0;
                if (a2Var9 != null) {
                    if (z10) {
                        Editable H4 = this.P.H4(i19, i21, i20, i22);
                        if (H4 == null) {
                            h = false;
                        } else {
                            h = g6.h(H4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (h) {
                            z12 = true;
                            a2Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    a2Var9.setSelected(z12);
                }
                a2 a2Var10 = this.f11331s0;
                if (a2Var10 != null) {
                    if (z10) {
                        Editable H42 = this.P.H4(i19, i21, i20, i22);
                        if (H42 == null) {
                            g10 = false;
                        } else {
                            g10 = g6.g(H42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (g10) {
                            z11 = true;
                            a2Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    a2Var10.setSelected(z11);
                }
                if (z10 && i19 == i20) {
                    z19 = true;
                }
                u0(z19, this.P.l2());
            }
        }
    }

    public final void z0() {
        boolean z10;
        float f7;
        boolean r22 = this.P.r2();
        i2 i2Var = this.P.J3;
        if (i2Var != null && !i2Var.f11425c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.V;
        float f10 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(r22);
            ImageView imageView2 = this.V;
            if (r22) {
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

    public e2(String str) {
        super(null);
        this.f11311c = -1;
        this.d = -1;
        this.f11335w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f11316f0 = new ArrayList();
        this.f11321k0 = Integer.MAX_VALUE;
        this.f11322l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new j1(this, 0);
        this.f11315f = str;
    }

    public e2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f11311c = -1;
        this.d = -1;
        this.f11335w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f11316f0 = new ArrayList();
        this.f11321k0 = Integer.MAX_VALUE;
        this.f11322l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new j1(this, 0);
        this.f11309b = richMessage;
    }
}

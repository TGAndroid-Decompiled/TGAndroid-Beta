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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.bo;
import org.telegram.ui.dc1;
import org.telegram.ui.dj0;
import org.telegram.ui.nk;
import org.telegram.ui.ou0;
public final class d2 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public ei.g2 H0;
    public float I;
    public int I0;
    public bo J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public p1 N0;
    public v1 O;
    public dj0 O0;
    public w3 P;
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
    public final CharSequence f11298a;
    public LinearLayout f11299a0;
    public final TL_iv.RichMessage f11300b;
    public zg f11301b0;
    public int f11302c;
    public ImageView f11303c0;
    public int d;
    public w1 f11304d0;
    public boolean e;
    public LinearLayout f11305e0;
    public final String f11306f;
    public final ArrayList f11307f0;
    public ImageView f11308g0;
    public CharSequence h;
    public dc1 f11309h0;
    public LinearLayout f11310i0;
    public x1 f11311j0;
    public int f11312k0;
    public final ArrayList f11313l0;
    public LinearLayout m0;
    public CharSequence f11314n;
    public LinearLayout f11315n0;
    public LinearLayout f11316o0;
    public z1 f11317p0;
    public z1 f11318q0;
    public MessageObject f11319r;
    public z1 f11320r0;
    public hh.g f11321s;
    public z1 f11322s0;
    public z1 f11323t0;
    public z1 f11324u0;
    public nk v;
    public FrameLayout f11325v0;
    public final Rect f11326w;
    public bj0 f11327w0;
    public ch.d f11328x;
    public n70 f11329x0;
    public RectF f11330y;
    public y1 f11331y0;
    public m.p3 f11332z0;

    public d2(Editable editable) {
        super(null);
        this.f11302c = -1;
        this.d = -1;
        this.f11326w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f11307f0 = new ArrayList();
        this.f11312k0 = Integer.MAX_VALUE;
        this.f11313l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new j1(this, 0);
        this.f11298a = editable;
    }

    public static void U(d2 d2Var) {
        j3 j3Var = d2Var.P.f11724n3;
        if (j3Var != null && j3Var.y()) {
            d2Var.n0();
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        new x(d2Var.currentAccount, parentActivity, new ai.y1(d2Var, 27), d2Var.getResourceProvider()).show();
    }

    public static void V(d2 d2Var) {
        if (!UserConfig.getInstance(d2Var.currentAccount).isPremium()) {
            d2Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) d2Var, 43, true));
        }
    }

    public static boolean W(d2 d2Var, View view) {
        int i10;
        bo boVar = d2Var.J;
        if (boVar != null && d2Var.f11319r == null && !boVar.c() && d2Var.P.l3() && !d2Var.P.n3()) {
            if (!d2Var.P.N3()) {
                d2Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> a32 = d2Var.P.a3();
            if (!a32.isEmpty()) {
                dj0 dj0Var = d2Var.O0;
                if (dj0Var != null) {
                    dj0Var.h(false);
                    d2Var.O0 = null;
                }
                dj0 dj0Var2 = new dj0(d2Var.getParentActivity(), d2Var.getResourceProvider());
                d2Var.O0 = dj0Var2;
                dj0Var2.setOnDismissListener(new ai.g5(d2Var, 5));
                long a2 = d2Var.J.a();
                MessageObject messageObject = d2Var.J.f32385n5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f18142id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(d2Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(d2Var.currentAccount).getPeer(UserConfig.getInstance(d2Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = a32;
                richMessage.photos = d2Var.P.C2();
                tL_message.rich_message.documents = d2Var.P.z2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(d2Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                d2Var.O0.q(org.telegram.messenger.w1.l(messageObject2));
                d2Var.f11331y0.setScaleX(1.0f);
                d2Var.f11331y0.setScaleY(1.0f);
                tg r10 = d2Var.O0.r(d2Var.f11331y0, true, new k1(d2Var, 10));
                if (r10 != null) {
                    r10.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), d2Var.getThemedColor(j6.Oh))));
                    dj0 dj0Var3 = d2Var.O0;
                    int dp = AndroidUtilities.dp(44.0f);
                    dj0Var3.m0 = true;
                    dj0Var3.Y = dp;
                }
                n70 H = n70.H(d2Var, d2Var.f11331y0);
                boolean isUserSelf = UserObject.isUserSelf(d2Var.J.i());
                if (d2Var.J.D6()) {
                    int i11 = R.drawable.msg_calendar2;
                    if (isUserSelf) {
                        i10 = R.string.SetReminder;
                    } else {
                        i10 = R.string.ScheduleMessage;
                    }
                    H.c(i11, LocaleController.getString(i10), new ai.j(d2Var, a2, 11), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new j1(d2Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new j1(d2Var, 6), false);
                }
                H.Y();
                d2Var.O0.p(H);
                d2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void X(d2 d2Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(d2Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, d2Var.J);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(d2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j3, messageObject2, messageObject3, z10, i10, i11, sendMessageChatArguments, 0L, j10, 0L);
        }
    }

    public static void Y(final d2 d2Var, Context context, View view) {
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
        n70 n70Var2 = d2Var.f11329x0;
        if (n70Var2 != null) {
            n70Var2.u();
            d2Var.f11329x0 = null;
        }
        if (!MessagesController.getInstance(d2Var.currentAccount).richEditorAllowed() && !UserConfig.getInstance(d2Var.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a R2 = d2Var.P.R2();
        final n70 I = n70.I(d2Var, view);
        I.Q = true;
        n70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(I, 1), false);
        J.k();
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(d2Var) {
            public final d2 f11530b;

            {
                this.f11530b = d2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18653a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18653a.setTextSize(1, SharedConfig.fontSize + 2);
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(d2Var) {
            public final d2 f11530b;

            {
                this.f11530b = d2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18653a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18653a.setTextSize(1, SharedConfig.fontSize + 1);
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(d2Var) {
            public final d2 f11530b;

            {
                this.f11530b = d2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18653a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18653a.setTextSize(1, SharedConfig.fontSize);
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(d2Var) {
            public final d2 f11530b;

            {
                this.f11530b = d2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18653a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18653a.setTextSize(1, SharedConfig.fontSize - 1);
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(d2Var) {
            public final d2 f11530b;

            {
                this.f11530b = d2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18653a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18653a.setTextSize(1, SharedConfig.fontSize - 2);
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(d2Var) {
            public final d2 f11530b;

            {
                this.f11530b = d2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f11530b.P.W4(R2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f18653a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f18653a.setTextSize(1, SharedConfig.fontSize - 3);
        if (R2 != null && w3.D3(R2.f11204b)) {
            n70Var = J;
            z17 = true;
        } else {
            n70Var = J;
            z17 = false;
        }
        b2 b2Var = new b2(context, R.drawable.iv_h);
        b2Var.a(z10);
        int i10 = j6.G8;
        b2Var.d = i10;
        I.j(z17, 0, b2Var, LocaleController.getString(R.string.ArticleHeading), new ei.m2(I, n70Var, 2));
        I.y().f18653a.setTypeface(AndroidUtilities.bold());
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
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new n1(d2Var, R2, 3));
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new n1(d2Var, R2, 4));
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        b2 b2Var2 = new b2(context, R.drawable.iv_pullquote);
        b2Var2.a(z10);
        b2Var2.d = i10;
        I.j(z20, 0, b2Var2, LocaleController.getString(R.string.ArticlePullquote), new n1(d2Var, R2, 0));
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
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new n1(d2Var, R2, 1));
        if (R2 != null && (R2.f11204b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        b2 b2Var3 = new b2(context, R.drawable.iv_footer);
        b2Var3.a(z10);
        b2Var3.d = i10;
        I.j(z22, 0, b2Var3, LocaleController.getString(R.string.ArticleFooter), new n1(d2Var, R2, 2));
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
        d2Var.f11329x0 = I;
    }

    public static void Z(d2 d2Var, boolean z10, boolean z11) {
        float f7;
        int i10;
        if (d2Var.J0 != z10 || !z11) {
            d2Var.J0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            if (z11) {
                d2Var.f11327w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(qr.h).start();
            } else {
                d2Var.f11327w0.animate().cancel();
                d2Var.f11327w0.setScaleX(f7);
                d2Var.f11327w0.setScaleY(f7);
            }
            bj0 bj0Var = d2Var.f11327w0;
            if (z10) {
                i10 = j6.f19101q7;
            } else {
                i10 = j6.G6;
            }
            bj0Var.setColorFilter(new PorterDuffColorFilter(d2Var.getThemedColor(i10), PorterDuff.Mode.SRC_IN));
            yi0 animatedDrawable = d2Var.f11327w0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f30222a0 > 34) {
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

    public static i1 a0(d2 d2Var) {
        i1 focusedEditTextOrNull = d2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            d2Var.R0 = focusedEditTextOrNull;
            d2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        i1 i1Var = d2Var.R0;
        if (i1Var != null) {
            return i1Var;
        }
        return d2Var.P.Q2();
    }

    public static int b0(d2 d2Var, i1 i1Var) {
        if (i1Var == d2Var.R0 && d2Var.P.getFocusedEditTextOrNull() != i1Var) {
            return Math.min(d2Var.S0, i1Var.length());
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

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.f6 f6Var) {
        final org.telegram.ui.ActionBar.g3 i10 = wl.i(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i10.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(j6.K(AndroidUtilities.dp(80.0f), j6.v0(j6.Oh, f6Var)));
        linearLayout.addView(imageView, w7.x5.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 49, 25, 16, 25, 0), context);
        h.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        h.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(h, w7.x5.t(-1, -2, 49, 25, 11, 25, 0));
        ci.d g10 = wl.g(24, context, f6Var, true);
        g10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(g10, w7.x5.t(-1, 48, 49, 14, 31, 14, 0));
        ci.d g11 = wl.g(24, context, f6Var, false);
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
            ((z1) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        float f7;
        if (this.f11331y0 == null) {
            return;
        }
        boolean N3 = this.P.N3();
        this.f11331y0.setEnabled(N3);
        ViewPropertyAnimator animate = this.f11331y0.animate();
        if (N3) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(150L).start();
    }

    public final void C0() {
        y1 y1Var = this.f11331y0;
        if (y1Var == null) {
            return;
        }
        y1Var.setLocked(m0());
    }

    public final z1 c0(int i10, int i11, boolean z10) {
        int i12;
        z1 z1Var = new z1(this.f11305e0.getContext(), i10, getResourceProvider());
        if (z10) {
            z1Var.d();
            this.N.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(g0(i11));
        this.f11307f0.add(z1Var);
        LinearLayout linearLayout = this.f11305e0;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(z1Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
        return z1Var;
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
        this.O = new v1(this, context);
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
        this.O.f27435r.add(g2Var);
        w3 w3Var = new w3(context, this.currentAccount, getResourceProvider(), new a6.i(this, 27));
        this.P = w3Var;
        w3Var.setFileRefParentObject(this.f11319r);
        this.O.addView(this.P, w7.x5.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), w7.x5.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f11300b;
        if (richMessage != null) {
            w3 w3Var2 = this.P;
            ArrayList arrayList2 = w3Var2.f11721l3;
            w3Var2.f11719k3 = richMessage;
            w3.X2(arrayList2, richMessage.blocks, w3Var2.f11722m3);
            w3Var2.W3();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                w3Var2.w4((a) arrayList2.get(i13));
            }
            w3Var2.Y2.N(false);
        } else {
            String str = this.f11306f;
            if (str != null) {
                w3 w3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f11314n;
                HashMap hashMap = w3Var3.f11722m3;
                ArrayList arrayList3 = w3Var3.f11721l3;
                if (!TextUtils.isEmpty(charSequence)) {
                    w3.X2(arrayList3, c5.b(charSequence), hashMap);
                }
                arrayList3.addAll(w3Var3.x4(d4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    w3.X2(arrayList3, c5.b(charSequence2), hashMap);
                }
                w3Var3.W3();
                w3Var3.Y2.N(false);
            } else {
                CharSequence charSequence3 = this.f11298a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        h2 h2Var = this.P.J3;
        if (h2Var != null) {
            h2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = j6.f18863d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i14), j6.l1(0.0f, getThemedColor(i14))}));
        this.O.addView(this.Q, w7.x5.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{j6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14)}));
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
        int i15 = j6.f18953i6;
        imageView3.setBackground(new c2(j6.Z(themedColor, j6.v(themedColor2, getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.T;
        int i16 = j6.G6;
        int themedColor3 = getThemedColor(i16);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        w7.z5.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.T.setOnClickListener(new k1(this, 1));
        this.S.addView(this.T, w7.x5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.S.addView(this.U, w7.x5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.V.setScaleType(scaleType);
        this.V.setBackground(j6.f0(getThemedColor(i15), 1, -1));
        this.V.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.z5.a(this.V);
        this.V.setContentDescription(LocaleController.getString(R.string.Undo));
        this.V.setOnClickListener(new k1(this, 2));
        this.U.addView(this.V, w7.x5.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.W.setScaleType(scaleType);
        this.W.setBackground(j6.f0(getThemedColor(i15), 1, -1));
        this.W.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        w7.z5.a(this.W);
        this.W.setContentDescription(LocaleController.getString(R.string.Redo));
        this.W.setOnClickListener(new k1(this, 3));
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
        this.f11299a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f11299a0.setClipChildren(false);
        this.f11299a0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Z.addView(this.f11299a0, w7.x5.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f11303c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.f11303c0.setScaleType(scaleType);
        this.f11303c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11303c0.setBackground(new c2(j6.Z(getThemedColor(i14), j6.v(getThemedColor(i14), getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.f11299a0.addView(this.f11303c0, w7.x5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.z5.a(this.f11303c0);
        this.f11303c0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f11303c0.setOnClickListener(new k1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        frameLayout5.addView(frameLayout6, w7.x5.e(-2, 44, 81));
        w1 w1Var = new w1(context, 0);
        this.f11304d0 = w1Var;
        w1Var.setClipToOutline(true);
        this.f11304d0.setOutlineProvider(new ai.k2(3));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f11305e0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11305e0.setOrientation(0);
        this.f11304d0.addView(this.f11305e0);
        frameLayout6.addView(this.f11304d0, w7.x5.c(-1.0f, -1));
        zg zgVar = new zg(context, 24);
        this.f11301b0 = zgVar;
        zgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.f11301b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11301b0.setBackground(j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f11301b0.j(xg.e, false);
        this.f11305e0.addView(this.f11301b0, w7.x5.q(38, 38, 16));
        w7.z5.a(this.f11301b0);
        this.f11301b0.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.f11301b0.setOnClickListener(new k1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new ai.f2(13, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new k1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new k1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new k1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f11308g0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f11308g0.setScaleType(scaleType);
        this.f11308g0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11308g0.setBackground(j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f11305e0.addView(this.f11308g0, w7.x5.t(38, 38, 16, 2, 0, 0, 0));
        w7.z5.a(this.f11308g0);
        this.f11308g0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f11308g0.setOnClickListener(new k1(this, 9));
        this.f11299a0.addView(frameLayout5, w7.x5.l(1.0f, 0, 44));
        dc1 dc1Var = new dc1(this, context, 2);
        this.f11309h0 = dc1Var;
        dc1Var.setOrientation(0);
        this.f11309h0.setClipToPadding(false);
        this.f11309h0.setClipChildren(false);
        this.f11309h0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f11309h0, w7.x5.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f11325v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f11325v0.setClipToPadding(false);
        this.f11325v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.Y.addView(this.f11325v0, w7.x5.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f11327w0 = imageView9;
        imageView9.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        yi0 animatedDrawable = this.f11327w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f11327w0.setScaleType(scaleType);
        this.f11327w0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f11327w0.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11325v0.addView(this.f11327w0, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11309h0.addView(frameLayout8, w7.x5.c(44.0f, -2));
        x1 x1Var = new x1(this, context);
        this.f11311j0 = x1Var;
        x1Var.setHorizontalScrollBarEnabled(false);
        this.f11311j0.setClipToOutline(true);
        this.f11311j0.setOutlineProvider(new ai.k2(4));
        frameLayout8.addView(this.f11311j0, w7.x5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f11310i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f11310i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11311j0.addView(this.f11310i0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        z1 z1Var = new z1(context, R.drawable.iv_quote, getResourceProvider());
        this.f11324u0 = z1Var;
        z1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f11324u0.setOnClickListener(new k1(this, 11));
        LinearLayout linearLayout5 = this.f11310i0;
        z1 z1Var2 = this.f11324u0;
        if (linearLayout5.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout5.addView(z1Var2, w7.x5.t(38, 38, 16, i10, 0, 0, 0));
        z1 z1Var3 = new z1(context, R.drawable.iv_button, getResourceProvider());
        this.f11320r0 = z1Var3;
        z1Var3.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f11320r0.setOnClickListener(new k1(this, 12));
        LinearLayout linearLayout6 = this.f11310i0;
        z1 z1Var4 = this.f11320r0;
        if (linearLayout6.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout6.addView(z1Var4, w7.x5.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f11315n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f11315n0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11315n0.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11309h0.addView(this.f11315n0, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        z1 z1Var5 = new z1(context, R.drawable.media_link_24, getResourceProvider());
        this.f11318q0 = z1Var5;
        z1Var5.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.f11318q0.setOnClickListener(new k1(this, 13));
        this.f11315n0.addView(this.f11318q0, w7.x5.q(38, 38, 16));
        z1 z1Var6 = new z1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f11322s0 = z1Var6;
        z1Var6.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f11322s0.setOnClickListener(new k1(this, 14));
        this.f11315n0.addView(this.f11322s0, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f11316o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f11316o0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f11316o0.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11309h0.addView(this.f11316o0, w7.x5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        z1 z1Var7 = new z1(context, R.drawable.iv_math, getResourceProvider());
        this.f11323t0 = z1Var7;
        z1Var7.d();
        arrayList.add(this.f11323t0);
        this.f11323t0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f11323t0.setOnClickListener(new k1(this, 15));
        this.f11316o0.addView(this.f11323t0, w7.x5.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.m0.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f11309h0.addView(this.m0, 0, w7.x5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        z1 z1Var8 = new z1(context, 0, getResourceProvider());
        this.f11317p0 = z1Var8;
        z1Var8.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.f11317p0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f11317p0.setOnClickListener(new k1(this, 16));
        this.m0.addView(this.f11317p0, w7.x5.q(38, 38, 16));
        if (this.f11319r != null) {
            i12 = R.drawable.input_done;
        } else if (l0()) {
            i12 = R.drawable.input_schedule;
        } else {
            i12 = R.drawable.send_plane_24;
        }
        y1 y1Var = new y1((Object) this, context, i12, getResourceProvider(), 0);
        this.f11331y0 = y1Var;
        y1Var.setBackground(new c2(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(j6.Yd))));
        w7.z5.a(this.f11331y0);
        this.f11299a0.addView(this.f11331y0, w7.x5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f11331y0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f11331y0.setOnClickListener(new k1(this, 0));
        this.f11331y0.setOnLongClickListener(new ci.n5(this, 3));
        C0();
        this.O.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        A0();
        if (this.e) {
            this.P.D2();
            this.e = false;
        }
        v1 v1Var = this.O;
        this.fragmentView = v1Var;
        return v1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z10) {
        int i12;
        z1 z1Var = new z1(context, i10, getResourceProvider());
        if (z10) {
            z1Var.d();
            this.N.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(i0(i11));
        z1Var.setOnClickListener(new ci.o4(this, i11, 2));
        this.f11313l0.add(z1Var);
        LinearLayout linearLayout = this.f11310i0;
        if (linearLayout.getChildCount() > 0) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        linearLayout.addView(z1Var, w7.x5.t(38, 38, 16, i12, 0, 0, 0));
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
        this.P0.setInterpolator(qr.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        kz kzVar = this.A0;
        if (kzVar != null && (layoutParams = (FrameLayout.LayoutParams) kzVar.getLayoutParams()) != null) {
            int j02 = j0();
            v1 v1Var = this.O;
            if (v1Var == null) {
                max = j0();
            } else {
                max = Math.max(j0(), ((v1Var.getMeasuredHeight() - this.O.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.T0);
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
        w3 w3Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        w3Var.O3 = i12;
        w3Var.P3 = i13;
        w3Var.Q3 = i14;
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
        w3 w3Var = this.P;
        if (w3Var != null && w3Var.f11724n3.y()) {
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
        zg zgVar = this.f11301b0;
        if (zgVar != null) {
            zgVar.j(xg.e, z10);
        }
    }

    public final boolean l0() {
        bo boVar;
        if (this.f11319r == null && (boVar = this.J) != null && boVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            w3 w3Var = this.P;
            if (c5.f(w3Var.f11721l3, w3Var.f11722m3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n0() {
        n3 i22 = this.P.i2();
        if (i22 != null) {
            TL_iv.RichMessage a2 = i22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
            e0Var.n0(a2);
            e0Var.f23428k0 = new ai.y1(i22, 25);
            e0Var.show();
        }
    }

    public final void o0(int i10, int i11) {
        w3 w3Var = this.P;
        w3Var.f11707c4 = w3Var.R2();
        vi viVar = new vi(getParentActivity(), this, false, false, true, getResourceProvider());
        viVar.Z1 = new s1(this, viVar);
        viVar.f28757j0.setIncludeVideosInGallery(true);
        viVar.f28757j0.f0();
        viVar.J1(1, true);
        viVar.h1(i10);
        viVar.f28790t2 = new r1(this, viVar);
        viVar.Y = new r1(this, viVar);
        viVar.X = new t1(this, viVar);
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
                w3 w3Var = this.P;
                Uri data = intent.getData();
                if (data == null) {
                    w3Var.getClass();
                } else if (w3Var.getContext() != null) {
                    Utilities.globalQueue.postRunnable(new gg.x1(13, w3Var, data));
                }
            }
        } else if (i11 == -1 && (i10 == 1 || i10 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.P.f2(intent.getData());
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
                    this.A0.A();
                }
                e0(false);
                return false;
            }
        } else if (this.B0) {
            k0(true);
            return false;
        } else if (!this.P.G2()) {
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
        if (!AndroidUtilities.isTablet() && this.f11321s != null && this.v != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            hh.g gVar = this.f11321s;
            this.f11328x = gVar.f10527f;
            gVar.e = false;
            gVar.invalidate();
            this.v.setAlpha(0.0f);
            this.v.f21887z1.setVisibility(4);
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
            animatorSet.setInterpolator(qr.h);
            this.O.post(new ou0(animatorSet, 4));
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
        dj0 dj0Var = this.O0;
        if (dj0Var != null) {
            dj0Var.i();
            this.O0 = null;
        }
        w3 w3Var = this.P;
        if (w3Var != null) {
            w3Var.H2();
        }
        m.p3 p3Var = this.f11332z0;
        if (p3Var != null) {
            p3Var.a();
        }
        super.onFragmentDestroy();
        kz kzVar = this.A0;
        if (kzVar != null && (observersGroup = kzVar.I2) != null) {
            observersGroup.removeAllObservers();
            kzVar.I2 = null;
        }
        v1 v1Var = this.O;
        if (v1Var != null && (g2Var = this.H0) != null) {
            v1Var.f27435r.remove(g2Var);
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
        i0.b f7 = l1Var.f41882a.f(3);
        int i10 = l1Var.f41882a.f(8).d;
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
        if (!this.G0 && z11 && (n70Var = this.f11329x0) != null) {
            n70Var.u();
            this.f11329x0 = null;
        }
        onInsets(f7.f10591a, f7.f10592b, f7.f10593c, f7.d);
        return r0.l1.f41881b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        w3 w3Var;
        int i10;
        w3 w3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.f11302c) >= 0 && (w3Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f11302c = -1;
            if (!w3Var2.Z1(i10, i11)) {
                w3Var2.post(new p2(w3Var2, i10, i11, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f11300b != null || this.f11306f != null) && (w3Var = this.P) != null && !w3Var.b3()) {
                w3Var.post(new b(w3Var, 5));
            }
        }
    }

    public final boolean q0() {
        TL_iv.RichMessage k22;
        Runnable runnable;
        if (this.J == null || this.f11319r != null || !this.P.s2()) {
            return false;
        }
        if (this.M) {
            k22 = null;
        } else {
            k22 = this.P.k2();
        }
        if (k22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        nk nkVar = this.J.Y;
        if (k22 != null && !this.M) {
            w3 w3Var = this.P;
            if (w3Var.l3() && !c5.f(w3Var.f11721l3, w3Var.f11722m3) && nkVar != null) {
                SpannableStringBuilder k10 = c5.k(this.P.f11721l3);
                bo boVar = nkVar.O2;
                if (nkVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, nkVar.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.x5.class);
                if (x5VarArr != null) {
                    for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                        x5Var.applyFontMetrics(nkVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.o5.g());
                    }
                }
                ti0.a(spannableStringBuilder);
                if (boVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(nkVar.Q).saveDraft(boVar.a(), boVar.B7(boVar.f32385n5), charSequenceArr[0], MediaDataController.getInstance(nkVar.Q).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                nkVar.setRichDraftPreview(null);
                if (nkVar.E0.getText() != null) {
                    nkVar.E0.getText().clear();
                }
                nkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        bo boVar2 = this.J;
        mediaDataController.saveDraft(a2, boVar2.B7(boVar2.f32385n5), "", null, null, null, null, 0L, false, false, k22);
        TL_iv.RichMessage richMessage = k22;
        if (nkVar == null) {
            return true;
        }
        nkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            w3 w3Var = this.P;
            Objects.requireNonNull(w3Var);
            p0(parentActivity, new b(w3Var, 0), new j1(this, 4), getResourceProvider());
        } else if (l0()) {
            org.telegram.ui.Components.c5.M(getParentActivity(), this.J.a(), new a6.m(this, 27), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    public final void s0(final int i10, final int i11, final boolean z10) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            w3 w3Var = this.P;
            Objects.requireNonNull(w3Var);
            p0(parentActivity, new b(w3Var, 0), new j1(this, 4), getResourceProvider());
        } else if (this.J != null && this.P.l3() && !this.P.n3()) {
            if (!this.P.N3()) {
                B0();
            } else if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
                nk nkVar = this.J.Y;
                if (nkVar != null) {
                    this.M = true;
                    Runnable runnable = this.K;
                    if (runnable != null) {
                        runnable.run();
                    }
                    nkVar.S0(c5.k(this.P.f11721l3), z10, i10, i11);
                    finishFragment();
                }
            } else {
                this.M = true;
                final ArrayList a32 = this.P.a3();
                if (a32.isEmpty()) {
                    return;
                }
                final ArrayList C2 = this.P.C2();
                final ArrayList z22 = this.P.z2();
                final ArrayList a2 = b5.a(this.currentAccount, a32);
                final long a10 = this.J.a();
                bo boVar = this.J;
                final MessageObject messageObject = boVar.f32385n5;
                final MessageObject messageObject2 = boVar.X3;
                final long N8 = boVar.N8();
                final SendMessageChatArguments C8 = this.J.C8();
                final MessageObject messageObject3 = this.f11319r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        d2.X(d2.this, messageObject3, a32, C2, z22, a2, a10, messageObject, messageObject2, z10, i10, i11, C8, N8);
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
        ArrayList arrayList = this.f11313l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z1 z1Var = (z1) obj;
            if (((Integer) z1Var.getTag()).intValue() == 1) {
                z1Var.setEnabled(z10);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        z1 z1Var = this.f11318q0;
        if (z1Var != null) {
            z1Var.setEnabled(z10);
        }
        z1 z1Var2 = this.f11320r0;
        if (z1Var2 != null) {
            z1Var2.setEnabled(z11);
        }
        z1 z1Var3 = this.f11322s0;
        if (z1Var3 != null) {
            z1Var3.setEnabled(z10);
        }
        z1 z1Var4 = this.f11323t0;
        if (z1Var4 != null) {
            z1Var4.setEnabled(z10);
        }
    }

    public final void v0() {
        hh.g gVar = this.f11321s;
        int[] iArr = this.F;
        gVar.getLocationInWindow(iArr);
        if (this.f11330y == null) {
            this.f11330y = new RectF();
        }
        RectF rectF = new RectF(this.f11328x.getBounds());
        this.f11330y = rectF;
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
        throw new UnsupportedOperationException("Method not decompiled: ii.d2.w0():void");
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
            this.f11299a0.setVisibility(0);
            ViewPropertyAnimator animate = this.f11299a0.animate();
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
            qr qrVar = qr.h;
            duration.setInterpolator(qrVar).withEndAction(new j1(this, 1)).start();
            this.f11309h0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f11309h0.animate();
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
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(qrVar).withEndAction(new j1(this, 2)).start();
            this.f11325v0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f11325v0.animate();
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
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(qrVar).withEndAction(new j1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f11299a0;
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.f11299a0;
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        linearLayout2.setAlpha(f7);
        LinearLayout linearLayout3 = this.f11299a0;
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        linearLayout3.setScaleX(f10);
        LinearLayout linearLayout4 = this.f11299a0;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout4.setScaleY(f11);
        LinearLayout linearLayout5 = this.f11299a0;
        if (i10 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout5.setTranslationY(dp);
        dc1 dc1Var = this.f11309h0;
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        dc1Var.setVisibility(i12);
        dc1 dc1Var2 = this.f11309h0;
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        dc1Var2.setAlpha(f12);
        dc1 dc1Var3 = this.f11309h0;
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        dc1Var3.setScaleX(f13);
        dc1 dc1Var4 = this.f11309h0;
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        dc1Var4.setScaleY(f14);
        dc1 dc1Var5 = this.f11309h0;
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        dc1Var5.setTranslationY(dp2);
        FrameLayout frameLayout = this.f11325v0;
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        FrameLayout frameLayout2 = this.f11325v0;
        if (i10 == 2) {
            f23 = 1.0f;
        }
        frameLayout2.setAlpha(f23);
        FrameLayout frameLayout3 = this.f11325v0;
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        frameLayout3.setScaleX(f15);
        FrameLayout frameLayout4 = this.f11325v0;
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
        ArrayList arrayList = this.f11313l0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.y()) {
            z1 z1Var = this.f11324u0;
            boolean z19 = false;
            if (z1Var != null) {
                w3 w3Var = this.P;
                int[] C4 = w3Var.C4();
                if (C4 != null && w3Var.I3(C4[0], C4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z1Var.setSelected(z18);
            }
            if (this.P.M3()) {
                q9 textSelectionHelper2 = this.P.getTextSelectionHelper();
                int i10 = textSelectionHelper2.f20629u0;
                int i11 = textSelectionHelper2.f20630v0;
                int i12 = textSelectionHelper2.f20633y0;
                int i13 = textSelectionHelper2.f20631w0;
                int i14 = textSelectionHelper2.f20634z0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    z1 z1Var2 = (z1) obj;
                    z1Var2.setSelected(this.P.L3(((Integer) z1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
                }
                if (i11 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    i1Var = this.P.O4(i10, i11);
                } else {
                    i1Var = null;
                }
                int max4 = Math.max(0, Math.min(i13, i14));
                if (i1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i13, i14), i1Var.length()));
                }
                z1 z1Var3 = this.f11318q0;
                if (z1Var3 != null) {
                    if (i1Var != null && max4 < max3 && f6.h(i1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z1Var3.setSelected(z17);
                }
                z1 z1Var4 = this.f11322s0;
                if (z1Var4 != null) {
                    if (i1Var != null && max4 < max3 && f6.g(i1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    z1Var4.setSelected(z19);
                }
                t0(true);
                u0(z16, this.P.m2());
            } else if (this.P.x3()) {
                q9 textSelectionHelper3 = this.P.getTextSelectionHelper();
                i1 t22 = this.P.t2(textSelectionHelper3.f20629u0);
                int i16 = textSelectionHelper3.f20631w0;
                int i17 = textSelectionHelper3.f20634z0;
                if (t22 == null) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i16, i17), t22.length()));
                }
                if (t22 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0, Math.min(Math.max(i16, i17), t22.length()));
                }
                int size2 = arrayList.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList.get(i18);
                    i18++;
                    z1 z1Var5 = (z1) obj2;
                    int intValue = ((Integer) z1Var5.getTag()).intValue();
                    if (t22 != null && max < max2 && (intValue & t22.getCurrentStyle(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z1Var5.setSelected(z15);
                }
                z1 z1Var6 = this.f11318q0;
                if (z1Var6 != null) {
                    if (t22 != null && max < max2 && f6.h(t22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z1Var6.setSelected(z14);
                }
                z1 z1Var7 = this.f11322s0;
                if (z1Var7 != null) {
                    if (t22 != null && max < max2 && f6.g(t22.getText(), max, max2)) {
                        z19 = true;
                    }
                    z1Var7.setSelected(z19);
                }
                t0(true);
                u0(true, this.P.m2());
            } else {
                int i19 = textSelectionHelper.f20629u0;
                int i20 = textSelectionHelper.f20632x0;
                int i21 = textSelectionHelper.f20631w0;
                int i22 = textSelectionHelper.f20634z0;
                if (i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.f11729p4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i23 = 0;
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    z1 z1Var8 = (z1) arrayList.get(i23);
                    int intValue2 = ((Integer) z1Var8.getTag()).intValue();
                    if (z10 && this.P.K3(intValue2, i19, i21, i20, i22)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z1Var8.setSelected(z13);
                    i23 = i24;
                }
                t0(!this.P.J3());
                z1 z1Var9 = this.f11318q0;
                if (z1Var9 != null) {
                    if (z10) {
                        Editable I4 = this.P.I4(i19, i21, i20, i22);
                        if (I4 == null) {
                            h = false;
                        } else {
                            h = f6.h(I4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (h) {
                            z12 = true;
                            z1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    z1Var9.setSelected(z12);
                }
                z1 z1Var10 = this.f11322s0;
                if (z1Var10 != null) {
                    if (z10) {
                        Editable I42 = this.P.I4(i19, i21, i20, i22);
                        if (I42 == null) {
                            g10 = false;
                        } else {
                            g10 = f6.g(I42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (g10) {
                            z11 = true;
                            z1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    z1Var10.setSelected(z11);
                }
                if (z10 && i19 == i20) {
                    z19 = true;
                }
                u0(z19, this.P.m2());
            }
        }
    }

    public final void z0() {
        boolean z10;
        float f7;
        boolean s22 = this.P.s2();
        h2 h2Var = this.P.J3;
        if (h2Var != null && !h2Var.f11409c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.V;
        float f10 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(s22);
            ImageView imageView2 = this.V;
            if (s22) {
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

    public d2(String str) {
        super(null);
        this.f11302c = -1;
        this.d = -1;
        this.f11326w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f11307f0 = new ArrayList();
        this.f11312k0 = Integer.MAX_VALUE;
        this.f11313l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new j1(this, 0);
        this.f11306f = str;
    }

    public d2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f11302c = -1;
        this.d = -1;
        this.f11326w = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f11307f0 = new ArrayList();
        this.f11312k0 = Integer.MAX_VALUE;
        this.f11313l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new j1(this, 0);
        this.f11300b = richMessage;
    }
}

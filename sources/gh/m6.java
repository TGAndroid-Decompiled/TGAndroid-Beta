package gh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.oa;
import hh.u7;
import java.util.ArrayList;
import java.util.Arrays;
import lh.q6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

public class m6 extends qa implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean T;
    public final int U;
    public final long V;
    public final boolean W;
    public final boolean X;
    public final TL_stars.StarGift Y;
    public GiftAuctionController.Auction Z;

    public final ag.p f7438a0;

    public final String f7439b0;

    public final Runnable f7440c0;

    public final g6 f7441d0;

    public final LinearLayout f7442e0;

    public final long f7443f0;

    public final org.telegram.ui.Cells.v0 f7444g0;

    public final TLRPC.MessageAction f7445h0;

    public final MessageObject f7446i0;

    public final lh.d f7447j0;

    public final FrameLayout f7448k0;

    public boolean f7449l0;
    public boolean m0;

    public boolean f7450n0;

    public final h6 f7451o0;

    public b51 f7452p0;

    public int f7453q0;

    public final cq[] f7454r0;

    public boolean f7455s0;

    public m6(Context context, int i10, final TL_stars.StarGift starGift, final ag.p pVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        float f10;
        Integer numValueOf;
        lg.f fVar;
        super(context, null, true, false, false, false, false, 2, null);
        this.m0 = false;
        this.f7450n0 = false;
        this.f7453q0 = -2;
        new AnimationNotificationsLocker();
        this.f7454r0 = new cq[1];
        this.f7455s0 = false;
        boolean z12 = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.T = z12;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-10.0f);
        if (z12) {
            this.f7449l0 = true;
        }
        this.U = i10;
        this.V = j10;
        this.Y = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.Z = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.f22607id, this);
        }
        this.f7438a0 = pVar;
        this.f7440c0 = runnable;
        this.W = z10;
        this.X = z11;
        if (z10) {
            this.m0 = true;
        } else if (z11) {
            this.m0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            this.f7439b0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f7439b0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, this.resourcesProvider, false);
        this.f7444g0 = v0Var;
        v0Var.setDelegate(new f6());
        g6 g6Var = new g6(this, context);
        this.f7441d0 = g6Var;
        Drawable drawableE = q6.e(null, i10, j10, org.telegram.ui.ActionBar.g6.I.q());
        g6Var.V(drawableE);
        og.c cVar = new og.c();
        if (drawableE instanceof ColorDrawable) {
            numValueOf = Integer.valueOf(((ColorDrawable) drawableE).getColor());
        } else if (drawableE instanceof nb0) {
            nb0 nb0Var = (nb0) drawableE;
            if (nb0Var.f30935q < 0) {
                numValueOf = -16777216;
            } else {
                int[] iArr = nb0Var.f30917a;
                if (iArr == null || iArr.length <= 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(iArr[0]);
                }
            }
        } else {
            numValueOf = null;
        }
        cVar.a(numValueOf != null ? numValueOf.intValue() : getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        lg.f fVar2 = new lg.f(cVar);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        int i11 = org.telegram.ui.ActionBar.g6.f23124h5;
        fVar2.n(new mg.b(i11, c6Var));
        fVar2.p(AndroidUtilities.dp(20.0f));
        fVar2.o(AndroidUtilities.dp(f10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f7442e0 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            fVar = fVar2;
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f7445h0 = tL_messageActionStarGift;
        } else {
            fVar = fVar2;
            if (pVar != null && pVar.f586b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = pVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = pVar.a();
                long jE = pVar.e();
                tL_messageActionGiftCode.amount = jE;
                if (pVar.h != null) {
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * jE);
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f7445h0 = tL_messageActionGiftCode;
            } else {
                if (pVar == null || pVar.f585a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = pVar.d();
                tL_messageActionGiftPremium.currency = pVar.a();
                long jE2 = pVar.e();
                tL_messageActionGiftPremium.amount = jE2;
                if (pVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * jE2);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.f7445h0 = tL_messageActionGiftPremium;
            }
        }
        TLRPC.MessageAction messageAction = this.f7445h0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z13 = this.m0;
            tL_messageActionStarGift2.can_upgrade = z13 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (z12 == 0 && z13) ? starGift.upgrade_stars : 0L;
            tL_messageActionStarGift2.convert_stars = z13 ? 0L : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f22401id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j10);
        tL_messageService.action = this.f7445h0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j10) : 0L;
        this.f7443f0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.f7446i0 = messageObject;
        v0Var.U(messageObject, true);
        linearLayout.addView(v0Var, h7.z5.t(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        g6Var.addView(linearLayout, h7.z5.e(-1, -1, 119));
        h6 h6Var = new h6(this, context, (zu0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.f7451o0 = h6Var;
        org.telegram.ui.Cells.b3 b3Var = h6Var.f24196b;
        b3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        b3Var.M = true;
        h6Var.setShowLimitWhenNear(50);
        this.L = b3Var;
        h6Var.setShowLimitOnFocus(true);
        h6Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(h6Var, 3);
        b3Var.getEditText().setImeOptions(6);
        b3Var.getEditText().setOnEditorActionListener(new m.u2(gVar, 1));
        int i12 = this.backgroundPaddingLeft;
        h6Var.setPadding(i12, 0, i12, 0);
        i6 i6Var = new i6();
        i6Var.C = false;
        i6Var.f5819m = false;
        i6Var.n(350L);
        i6Var.o(er.h);
        i6Var.D = 40L;
        this.d.setItemAnimator(i6Var);
        this.f7452p0.N(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        int i13 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i13, 0, i13, 0);
        this.containerView.addView(linearLayout2, h7.z5.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h7.z5.z(-1.0f), h7.z5.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float fClamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, this.resourcesProvider)));
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, h7.z5.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f7448k0 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f7448k0 = frameLayout2;
            frameLayout2.addView(frameLayout, h7.z5.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView textViewH = pa.h(frameLayout, textView, h7.z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        textViewH.setTextSize(1, 13.0f);
        textViewH.setGravity(21);
        textViewH.setTypeface(AndroidUtilities.bold());
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            textViewH.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(textViewH, h7.z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View j6Var = new j6(context, starGift, fClamp);
        j6Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        frameLayout.addView(j6Var, h7.z5.e(-1, -1, 119));
        k6 k6Var = new k6(context, fClamp);
        k6Var.setWillNotDraw(false);
        frameLayout.addView(k6Var, h7.z5.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        k6Var.addView(textView2, h7.z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        k6Var.addView(textView3, h7.z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        lh.d dVar = new lh.d(context, this.resourcesProvider, true);
        this.f7447j0 = dVar;
        dVar.e();
        Z(false);
        linearLayout2.addView(dVar, h7.z5.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new x(this, j10, context, runnable, starGift));
        org.telegram.ui.j jVar = this.f31852c;
        this.M = true;
        jVar.k1(true);
        this.f7452p0.N(false);
        this.f31852c.h1(this.f7452p0.f26945x.size(), AndroidUtilities.dp(200.0f));
        zk0 zk0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.f7448k0 == null) ? 40 : 0)));
        this.d.i(new l6(this));
        this.d.setOnItemClickListener(new pk0() {
            @Override
            public final void a(int i16, View view2) {
                TL_stars.StarGift starGift2;
                m6 m6Var = this.f7234a;
                TL_stars.StarGift starGift3 = m6Var.Y;
                boolean z14 = m6Var.T;
                org.telegram.ui.Cells.v0 v0Var2 = m6Var.f7444g0;
                TLRPC.MessageAction messageAction2 = m6Var.f7445h0;
                MessageObject messageObject2 = m6Var.f7446i0;
                b51 b51Var = m6Var.f7452p0;
                if (!m6Var.M) {
                    i16--;
                }
                n41 n41VarG = b51Var.G(i16);
                if (n41VarG == null) {
                    return;
                }
                int i17 = n41VarG.d;
                if (i17 == 1) {
                    boolean z15 = !m6Var.f7449l0;
                    m6Var.f7449l0 = z15;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z15;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    m6Var.f7452p0.N(true);
                    return;
                }
                if (i17 == 2) {
                    if (z10 || z11) {
                        int i18 = -m6Var.f7453q0;
                        m6Var.f7453q0 = i18;
                        AndroidUtilities.shakeViewSpring(view2, i18);
                        return;
                    }
                    boolean z16 = m6Var.m0;
                    m6Var.m0 = !z16;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z16 || (z14 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z14 || z16) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z16 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    m6Var.f7452p0.N(true);
                    m6Var.Z(true);
                    return;
                }
                if (i17 == 3) {
                    boolean z17 = m6Var.f7450n0;
                    m6Var.f7450n0 = !z17;
                    boolean z18 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    ag.p pVar2 = pVar;
                    if (z18) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z17) {
                            tL_messageActionGiftPremium2.currency = pVar2.a();
                            long jE3 = pVar2.e();
                            tL_messageActionGiftPremium2.amount = jE3;
                            if (pVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * jE3);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = pVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z17) {
                            tL_messageActionGiftCode2.currency = pVar2.a();
                            long jE4 = pVar2.e();
                            tL_messageActionGiftCode2.amount = jE4;
                            if (pVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * jE4);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = pVar2.g();
                        }
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    m6Var.f7452p0.N(true);
                    m6Var.Z(true);
                }
            }
        });
        this.f31853e.setTitle(z());
    }

    public static void P(m6 m6Var, TLRPC.User user, Boolean bool, String str) {
        int i10 = 1;
        if (bool.booleanValue()) {
            Runnable runnable = m6Var.f7440c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(m6Var.f7451o0);
            m6Var.dismiss();
            AndroidUtilities.runOnUIThread(new d6(i10, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            pa.r(R.string.UnknownErrorCode, new Object[]{str}, new mc(m6Var.topBulletinContainer, m6Var.resourcesProvider), R.raw.error, 36);
        }
        m6Var.f7447j0.setLoading(false);
    }

    public static void Q(m6 m6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = m6Var.f7440c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(m6Var.f7451o0);
            m6Var.dismiss();
            AndroidUtilities.runOnUIThread(new d6(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            pa.r(R.string.UnknownErrorCode, new Object[]{str}, new mc(m6Var.topBulletinContainer, m6Var.resourcesProvider), R.raw.error, 36);
        }
        m6Var.f7447j0.setLoading(false);
    }

    public static void S(final m6 m6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        int i10 = m6Var.U;
        h6 h6Var = m6Var.f7451o0;
        lh.d dVar = m6Var.f7447j0;
        if (dVar.J) {
            return;
        }
        int i11 = 5;
        if (m6Var.Z != null) {
            v vVar = new v(context, m6Var.resourcesProvider, new u(j10, m6Var.f7449l0, m6Var.W()), m6Var.Z);
            vVar.show();
            vVar.f7574j0 = runnable;
            AndroidUtilities.hideKeyboard(h6Var);
            m6Var.dismiss();
            if (m6Var.f7455s0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new b6(m6Var, i11), 500L);
            return;
        }
        final int i12 = 1;
        dVar.setLoading(true);
        org.telegram.ui.Cells.b3 b3Var = h6Var.f24196b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var.k(true);
        } else if (b3Var.v) {
            b3Var.d();
        }
        final int i13 = 0;
        if (starGift != null) {
            u7.y(i10, false).i(m6Var.Y, m6Var.f7449l0, m6Var.m0, m6Var.V, m6Var.W(), new z5(m6Var, i12));
            return;
        }
        ag.p pVar = m6Var.f7438a0;
        final TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(m6Var.V));
        if (user == null) {
            dVar.setLoading(false);
            return;
        }
        if (m6Var.f7450n0) {
            tLObject = pVar.f587c;
            TLObject tLObject2 = pVar.d;
            if (tLObject == null && tLObject2 == null) {
                tLObject = pVar.f586b;
                if (tLObject == null && (tLObject = pVar.f585a) == null) {
                    dVar.setLoading(false);
                    return;
                }
            } else if (tLObject == null) {
                tLObject = tLObject2 != null ? tLObject2 : null;
            }
        } else {
            tLObject = pVar.f586b;
            if (tLObject == null) {
                dVar.setLoading(false);
                return;
            }
        }
        if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
            if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                u7.y(i10, false).g(m6Var.V, tL_premiumGiftCodeOption, m6Var.W(), new Utilities.Callback2(m6Var) {

                    public final m6 f7140b;

                    {
                        this.f7140b = m6Var;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        Boolean bool = (Boolean) obj;
                        String str = (String) obj2;
                        switch (i12) {
                            case 0:
                                m6.P(this.f7140b, user, bool, str);
                                break;
                            default:
                                m6.Q(this.f7140b, user, bool, str);
                                break;
                        }
                    }
                });
                return;
            } else {
                cg.q0.k(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, m6Var.W(), new ag.r2(m6Var, 2), new d1(3, m6Var, user), new ag.n0(m6Var, 12));
                return;
            }
        }
        if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
            if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                u7.y(i10, false).g(m6Var.V, tL_premiumGiftOption, m6Var.W(), new Utilities.Callback2(m6Var) {

                    public final m6 f7140b;

                    {
                        this.f7140b = m6Var;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        Boolean bool = (Boolean) obj;
                        String str = (String) obj2;
                        switch (i13) {
                            case 0:
                                m6.P(this.f7140b, user, bool, str);
                                break;
                            default:
                                m6.Q(this.f7140b, user, bool, str);
                                break;
                        }
                    }
                });
                return;
            }
            if (BuildVars.useInvoiceBilling()) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null) {
                    Uri uri = Uri.parse(tL_premiumGiftOption.bot_url);
                    if (uri.getHost().equals("t.me")) {
                        if (uri.getPath().startsWith("/$") || uri.getPath().startsWith("/invoice/")) {
                            launchActivity.U0 = new b6(m6Var, i13);
                        } else {
                            launchActivity.T0 = true;
                        }
                    }
                    we.e.s(launchActivity, pVar.f585a.bot_url);
                    m6Var.dismiss();
                    return;
                }
                return;
            }
            if (!BillingController.getInstance().isReady() || pVar.h == null) {
                return;
            }
            TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
            tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(i10).getInputUser(user);
            n2.i iVarA = pVar.h.a();
            tL_inputStorePaymentGiftPremium.currency = iVarA.f18152c;
            tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
            BillingController.getInstance().addResultListener(pVar.f585a.store_product, new c6(m6Var, i13));
            TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
            tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new cg.y(m6Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, i11));
        }
    }

    public static void U(m6 m6Var) {
        new hh.i5(m6Var.getContext(), m6Var.U, m6Var.V, m6Var.resourcesProvider, null).V1(m6Var.Y.f22607id, m6Var.f7439b0);
    }

    public final TLRPC.TL_textWithEntities W() {
        if (MessagesController.getInstance(this.U).getSendPaidMessagesStars(this.V) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f7445h0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    public mc X() {
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return null;
        }
        return mc.a0(n2VarU);
    }

    public final void Y(boolean z10) {
        int i10 = this.U;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.V;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f22527id), userFull);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f31855n;
        if (n2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) n2Var.getParentActivity()).O().getFragmentStack());
            org.telegram.ui.ActionBar.b5 parentLayout = n2Var.getParentLayout();
            int size = arrayList.size();
            rn rnVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var2 instanceof rn) {
                    rnVar = (rn) n2Var2;
                    if (rnVar.a() != j10) {
                        n2Var2.removeSelfFromStack();
                    }
                } else if (n2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == n2Var2) {
                        n2Var2.finishFragment();
                    } else {
                        n2Var2.removeSelfFromStack();
                    }
                }
            }
            if (rnVar == null || rnVar.a() != j10) {
                ((ActionBarLayout) parentLayout).Q(new rn(com.google.android.recaptcha.internal.a.h(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z10) {
        GiftAuctionController.Auction auction = this.Z;
        int i10 = this.U;
        lh.d dVar = this.f7447j0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.Z.isUpcoming(currentTime)) {
                int i11 = this.Z.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Z.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(null, z10);
                return;
            } else {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z10);
                return;
            }
        }
        TL_stars.StarGift starGift = this.Y;
        cq[] cqVarArr = this.f7454r0;
        if (starGift != null) {
            long j10 = u7.y(i10, false).p().amount;
            long j11 = starGift.stars + (this.m0 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.f7451o0.getText()) ? 0L : this.f7443f0);
            dVar.g(oa.V0(false, LocaleController.formatPluralStringComma(this.T ? "Gift2SendSelf" : "Gift2Send", (int) j11), cqVarArr), z10, true);
            if (!u7.y(i10, false).f10154e || j11 <= j10) {
                dVar.f(null, z10);
                return;
            } else {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j10), z10);
                return;
            }
        }
        ag.p pVar = this.f7438a0;
        if (pVar != null) {
            if (this.f7450n0) {
                dVar.g(oa.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(pVar.g(), ',')), 1.0f, cqVarArr), z10, true);
                cqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, pVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Z(true);
            b51 b51Var = this.f7452p0;
            if (b51Var == null || this.f7438a0 == null) {
                return;
            }
            b51Var.N(true);
        }
    }

    @Override
    public final void dismiss() {
        h6 h6Var = this.f7451o0;
        org.telegram.ui.Cells.b3 b3Var = h6Var.f24196b;
        org.telegram.ui.Cells.b3 b3Var2 = h6Var.f24196b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
            return;
        }
        if (b3Var2.v) {
            b3Var2.d();
            return;
        }
        b3Var2.r();
        if (this.Z != null) {
            GiftAuctionController.getInstance(this.U).unsubscribeFromGiftAuction(this.Z.giftId, this);
        }
        this.f7455s0 = true;
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onBackPressed() {
        h6 h6Var = this.f7451o0;
        org.telegram.ui.Cells.b3 b3Var = h6Var.f24196b;
        org.telegram.ui.Cells.b3 b3Var2 = h6Var.f24196b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
        } else if (b3Var2.v) {
            b3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.Z = auction;
    }

    @Override
    public final void show() {
        h6 h6Var = this.f7451o0;
        if (h6Var != null) {
            h6Var.f24196b.s();
        }
        super.show();
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.U, 0, true, new z5(this, 0), this.resourcesProvider);
        this.f7452p0 = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(this.T ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }
}

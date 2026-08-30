package kh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import lh.ja;
import lh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
public class e6 extends sa implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean U;
    public final int V;
    public final long W;
    public final boolean X;
    public final boolean Y;
    public final TL_stars.StarGift Z;
    public GiftAuctionController.Auction f10565a0;
    public final eg.n f10566b0;
    public final String f10567c0;
    public final Runnable f10568d0;
    public final y5 f10569e0;
    public final LinearLayout f10570f0;
    public final long f10571g0;
    public final org.telegram.ui.Cells.v0 f10572h0;
    public final TLRPC.MessageAction f10573i0;
    public final MessageObject f10574j0;
    public final ph.d f10575k0;
    public final FrameLayout f10576l0;
    public boolean m0;
    public boolean f10577n0;
    public boolean f10578o0;
    public final z5 f10579p0;
    public w51 f10580q0;
    public int f10581r0;
    public final mq[] f10582s0;
    public boolean f10583t0;

    public e6(Context context, int i10, final TL_stars.StarGift starGift, final eg.n nVar, long j10, Runnable runnable, final boolean z4, final boolean z10) {
        super(context, null, true, false, false, false, false, 2, null);
        float f10;
        boolean z11;
        Integer num;
        pg.d dVar;
        LinearLayout linearLayout;
        this.f10577n0 = false;
        this.f10578o0 = false;
        this.f10581r0 = -2;
        new AnimationNotificationsLocker();
        this.f10582s0 = new mq[1];
        this.f10583t0 = false;
        boolean z12 = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.U = z12;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-10.0f);
        if (z12) {
            this.m0 = true;
        }
        this.V = i10;
        this.W = j10;
        this.Z = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.f10565a0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.f19409id, this);
        }
        this.f10566b0 = nVar;
        this.f10568d0 = runnable;
        this.X = z4;
        this.Y = z10;
        if (z4) {
            this.f10577n0 = true;
        } else if (z10) {
            this.f10577n0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            this.f10567c0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
            z11 = z12;
        } else {
            z11 = z12;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f10567c0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, this.resourcesProvider, false);
        this.f10572h0 = v0Var;
        v0Var.setDelegate(new Object());
        y5 y5Var = new y5(this, context);
        this.f10569e0 = y5Var;
        Drawable e = ph.l5.e(null, i10, j10, j6.I.q());
        y5Var.V(e);
        sg.c cVar = new sg.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof dc0) {
                dc0 dc0Var = (dc0) e;
                if (dc0Var.f24247q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = dc0Var.f24230a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(j6.f19977h5));
        pg.d dVar2 = new pg.d(cVar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        int i11 = j6.f19977h5;
        dVar2.n(new qg.b(i11, f6Var));
        dVar2.p(AndroidUtilities.dp(20.0f));
        dVar2.o(AndroidUtilities.dp(f10));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f10570f0 = linearLayout2;
        linearLayout2.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            dVar = dVar2;
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f10573i0 = tL_messageActionStarGift;
            linearLayout = linearLayout2;
        } else {
            dVar = dVar2;
            if (nVar != null && nVar.f5363b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = nVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = nVar.a();
                long e6 = nVar.e();
                tL_messageActionGiftCode.amount = e6;
                if (nVar.h != null) {
                    linearLayout = linearLayout2;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e6);
                } else {
                    linearLayout = linearLayout2;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f10573i0 = tL_messageActionGiftCode;
            } else {
                linearLayout = linearLayout2;
                if (nVar != null && nVar.f5362a != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = nVar.d();
                    tL_messageActionGiftPremium.currency = nVar.a();
                    long e10 = nVar.e();
                    tL_messageActionGiftPremium.amount = e10;
                    if (nVar.h != null) {
                        tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e10);
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.f10573i0 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f10573i0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z13 = this.f10577n0;
            tL_messageActionStarGift2.can_upgrade = z13 || (z11 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z11 && z13) ? starGift.upgrade_stars : 0L;
            tL_messageActionStarGift2.convert_stars = z13 ? 0L : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f19205id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j10);
        tL_messageService.action = this.f10573i0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j10) : 0L;
        this.f10571g0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.f10574j0 = messageObject;
        v0Var.U(messageObject, true);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(v0Var, k7.b6.t(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        y5Var.addView(linearLayout3, k7.b6.e(-1, -1, 119));
        z5 z5Var = new z5(this, context, (qv0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, dVar, i10);
        this.f10579p0 = z5Var;
        org.telegram.ui.Cells.d3 d3Var = z5Var.f21050b;
        d3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        d3Var.N = true;
        z5Var.setShowLimitWhenNear(50);
        this.M = d3Var;
        z5Var.setShowLimitOnFocus(true);
        z5Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(z5Var, 3);
        d3Var.getEditText().setImeOptions(6);
        d3Var.getEditText().setOnEditorActionListener(new m.u2(gVar, 1));
        int i12 = this.backgroundPaddingLeft;
        z5Var.setPadding(i12, 0, i12, 0);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5818m = false;
        lVar.n(350L);
        lVar.o(nr.h);
        lVar.D = 40L;
        this.d.setItemAnimator(lVar);
        this.f10580q0.N(false);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout4.setBackgroundColor(j6.v0(i11, this.resourcesProvider));
        int i13 = this.backgroundPaddingLeft;
        linearLayout4.setPadding(i13, 0, i13, 0);
        this.containerView.addView(linearLayout4, k7.b6.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(j6.v0(j6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout4.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(j6.b0(AndroidUtilities.dp(6.0f), j6.v0(j6.f19852a7, this.resourcesProvider)));
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f10576l0 = frameLayout2;
            frameLayout2.addView(frameLayout, k7.b6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(j6.v0(i11, this.resourcesProvider));
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout4.addView(frameLayout, k7.b6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f10576l0 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i14 = j6.G6;
        textView.setTextColor(j6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView i15 = yh.i(frameLayout, textView, k7.b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        i15.setTextSize(1, 13.0f);
        i15.setGravity(21);
        i15.setTypeface(AndroidUtilities.bold());
        i15.setTextColor(j6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            i15.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(i15, k7.b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View b6Var = new b6(context, starGift, clamp);
        b6Var.setBackground(j6.b0(AndroidUtilities.dp(6.0f), j6.v0(j6.Oh, this.resourcesProvider)));
        frameLayout.addView(b6Var, k7.b6.e(-1, -1, 119));
        c6 c6Var = new c6(context, clamp);
        c6Var.setWillNotDraw(false);
        frameLayout.addView(c6Var, k7.b6.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        c6Var.addView(textView2, k7.b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        c6Var.addView(textView3, k7.b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ph.d dVar3 = new ph.d(context, this.resourcesProvider, true);
        this.f10575k0 = dVar3;
        dVar3.e();
        Z(false);
        linearLayout4.addView(dVar3, k7.b6.t(-1, 48, 119, 10, 10, 10, 10));
        dVar3.setOnClickListener(new u(this, j10, context, runnable, starGift));
        org.telegram.ui.k kVar = this.f28676c;
        this.N = true;
        kVar.k1(true);
        this.f10580q0.N(false);
        this.f28676c.h1(this.f10580q0.f30243x.size(), AndroidUtilities.dp(200.0f));
        sl0 sl0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.f10576l0 == null) ? 40 : 0)));
        this.d.i(new d6(this));
        this.d.setOnItemClickListener(new il0() {
            @Override
            public final void f(int i17, View view2) {
                boolean z14;
                long j11;
                TL_stars.StarGift starGift2;
                e6 e6Var = e6.this;
                TL_stars.StarGift starGift3 = e6Var.Z;
                boolean z15 = e6Var.U;
                org.telegram.ui.Cells.v0 v0Var2 = e6Var.f10572h0;
                TLRPC.MessageAction messageAction2 = e6Var.f10573i0;
                MessageObject messageObject2 = e6Var.f10574j0;
                w51 w51Var = e6Var.f10580q0;
                if (!e6Var.N) {
                    i17--;
                }
                i51 G = w51Var.G(i17);
                if (G != null) {
                    int i18 = G.d;
                    if (i18 == 1) {
                        boolean z16 = !e6Var.m0;
                        e6Var.m0 = z16;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z16;
                        }
                        messageObject2.updateMessageText();
                        v0Var2.U(messageObject2, true);
                        e6Var.f10580q0.N(true);
                    } else if (i18 == 2) {
                        if (!z4 && !z10) {
                            boolean z17 = e6Var.f10577n0;
                            e6Var.f10577n0 = !z17;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z17 && (!z15 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z14;
                                long j12 = 0;
                                if (z15 || z17) {
                                    j11 = 0;
                                } else {
                                    j11 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j11;
                                if (z17) {
                                    j12 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j12;
                            }
                            messageObject2.updateMessageText();
                            v0Var2.U(messageObject2, true);
                            e6Var.f10580q0.N(true);
                            e6Var.Z(true);
                            return;
                        }
                        int i19 = -e6Var.f10581r0;
                        e6Var.f10581r0 = i19;
                        AndroidUtilities.shakeViewSpring(view2, i19);
                    } else if (i18 == 3) {
                        boolean z18 = e6Var.f10578o0;
                        e6Var.f10578o0 = !z18;
                        boolean z19 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        eg.n nVar2 = nVar;
                        if (z19) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z18) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = nVar2.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = nVar2.a();
                                long e11 = nVar2.e();
                                tL_messageActionGiftPremium2.amount = e11;
                                if (nVar2.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e11);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z18) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = nVar2.g();
                            } else {
                                tL_messageActionGiftCode2.currency = nVar2.a();
                                long e12 = nVar2.e();
                                tL_messageActionGiftCode2.amount = e12;
                                if (nVar2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e12);
                                }
                            }
                        }
                        messageObject2.updateMessageText();
                        v0Var2.U(messageObject2, true);
                        e6Var.f10580q0.N(true);
                        e6Var.Z(true);
                    }
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void P(e6 e6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = e6Var.f10568d0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(e6Var.f10579p0);
            e6Var.dismiss();
            AndroidUtilities.runOnUIThread(new v5(1, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            yh.s(R.string.UnknownErrorCode, new Object[]{str}, new qc(e6Var.topBulletinContainer, e6Var.resourcesProvider), R.raw.error, 36);
        }
        e6Var.f10575k0.setLoading(false);
    }

    public static void Q(e6 e6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = e6Var.f10568d0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(e6Var.f10579p0);
            e6Var.dismiss();
            AndroidUtilities.runOnUIThread(new v5(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            yh.s(R.string.UnknownErrorCode, new Object[]{str}, new qc(e6Var.topBulletinContainer, e6Var.resourcesProvider), R.raw.error, 36);
        }
        e6Var.f10575k0.setLoading(false);
    }

    public static void S(kh.e6 r17, long r18, android.content.Context r20, java.lang.Runnable r21, org.telegram.tgnet.tl.TL_stars.StarGift r22) {
        throw new UnsupportedOperationException("Method not decompiled: kh.e6.S(kh.e6, long, android.content.Context, java.lang.Runnable, org.telegram.tgnet.tl.TL_stars$StarGift):void");
    }

    public static void U(e6 e6Var) {
        new lh.g5(e6Var.getContext(), e6Var.V, e6Var.W, e6Var.resourcesProvider, null).V1(e6Var.Z.f19409id, e6Var.f10567c0);
    }

    public final TLRPC.TL_textWithEntities W() {
        if (MessagesController.getInstance(this.V).getSendPaidMessagesStars(this.W) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f10573i0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
            return null;
        }
        return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
    }

    public qc X() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return qc.a0(U);
    }

    public final void Y(boolean z4) {
        int i10 = this.V;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.W;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f19331id), userFull);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f28678n;
        if (p2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) p2Var.getParentActivity()).O().getFragmentStack());
            org.telegram.ui.ActionBar.e5 parentLayout = p2Var.getParentLayout();
            int size = arrayList.size();
            xn xnVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var2 instanceof xn) {
                    xnVar = (xn) p2Var2;
                    if (xnVar.a() != j10) {
                        p2Var2.removeSelfFromStack();
                    }
                } else if (p2Var2 instanceof ProfileActivity) {
                    if (z4 && parentLayout.getLastFragment() == p2Var2) {
                        p2Var2.finishFragment();
                    } else {
                        p2Var2.removeSelfFromStack();
                    }
                }
            }
            if (xnVar == null || xnVar.a() != j10) {
                ((ActionBarLayout) parentLayout).Q(new xn(a2.g(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z4) {
        long j10;
        long j11;
        String str;
        GiftAuctionController.Auction auction = this.f10565a0;
        int i10 = this.V;
        ph.d dVar = this.f10575k0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.f10565a0.isUpcoming(currentTime)) {
                int i11 = this.f10565a0.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z4, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z4);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f10565a0.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z4, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z4);
                return;
            }
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z4, true);
            dVar.f(null, z4);
            return;
        }
        TL_stars.StarGift starGift = this.Z;
        mq[] mqVarArr = this.f10582s0;
        if (starGift != null) {
            long j12 = t7.y(i10, false).p().amount;
            long j13 = starGift.stars;
            if (this.f10577n0) {
                j10 = starGift.upgrade_stars;
            } else {
                j10 = 0;
            }
            long j14 = j13 + j10;
            if (TextUtils.isEmpty(this.f10579p0.getText())) {
                j11 = 0;
            } else {
                j11 = this.f10571g0;
            }
            long j15 = j14 + j11;
            if (this.U) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.g(ja.V0(false, LocaleController.formatPluralStringComma(str, (int) j15), mqVarArr), z4, true);
            if (t7.y(i10, false).e && j15 > j12) {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j12), z4);
                return;
            } else {
                dVar.f(null, z4);
                return;
            }
        }
        eg.n nVar = this.f10566b0;
        if (nVar != null) {
            if (this.f10578o0) {
                dVar.g(ja.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(nVar.g(), ',')), 1.0f, mqVarArr), z4, true);
                mqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, nVar.c())), z4, true);
            }
            dVar.f(null, z4);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Z(true);
            w51 w51Var = this.f10580q0;
            if (w51Var != null && this.f10566b0 != null) {
                w51Var.N(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        z5 z5Var = this.f10579p0;
        org.telegram.ui.Cells.d3 d3Var = z5Var.f21050b;
        org.telegram.ui.Cells.d3 d3Var2 = z5Var.f21050b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
        } else if (d3Var2.v) {
            d3Var2.d();
        } else {
            d3Var2.r();
            if (this.f10565a0 != null) {
                GiftAuctionController.getInstance(this.V).unsubscribeFromGiftAuction(this.f10565a0.giftId, this);
            }
            this.f10583t0 = true;
            super.dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.V).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onBackPressed() {
        z5 z5Var = this.f10579p0;
        org.telegram.ui.Cells.d3 d3Var = z5Var.f21050b;
        org.telegram.ui.Cells.d3 d3Var2 = z5Var.f21050b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
        } else if (d3Var2.v) {
            d3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.V).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f10565a0 = auction;
    }

    @Override
    public final void show() {
        z5 z5Var = this.f10579p0;
        if (z5Var != null) {
            z5Var.f21050b.s();
        }
        super.show();
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.V, 0, true, new s5(this, 0), this.resourcesProvider);
        this.f10580q0 = w51Var;
        w51Var.f30240r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.U) {
            i10 = R.string.Gift2TitleSelf2;
        } else {
            i10 = R.string.Gift2Title;
        }
        return LocaleController.getString(i10);
    }
}

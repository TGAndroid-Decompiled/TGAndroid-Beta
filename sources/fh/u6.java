package fh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.oa;
import gh.v7;
import java.util.ArrayList;
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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public class u6 extends sa implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean T;
    public final int U;
    public final long V;
    public final boolean W;
    public final boolean X;
    public final TL_stars.StarGift Y;
    public GiftAuctionController.Auction Z;
    public final zf.k f6790a0;
    public final String f6791b0;
    public final Runnable f6792c0;
    public final o6 f6793d0;
    public final LinearLayout f6794e0;
    public final long f6795f0;
    public final org.telegram.ui.Cells.w0 f6796g0;
    public final TLRPC.MessageAction f6797h0;
    public final MessageObject f6798i0;
    public final kh.d f6799j0;
    public final FrameLayout f6800k0;
    public boolean f6801l0;
    public boolean m0;
    public boolean f6802n0;
    public final p6 f6803o0;
    public z41 f6804p0;
    public int f6805q0;
    public final eq[] f6806r0;
    public boolean f6807s0;

    public u6(Context context, int i9, final TL_stars.StarGift starGift, final zf.k kVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, false, false, false, 2, null);
        float f10;
        boolean z12;
        Integer num;
        kg.f fVar;
        LinearLayout linearLayout;
        this.m0 = false;
        this.f6802n0 = false;
        this.f6805q0 = -2;
        new AnimationNotificationsLocker();
        this.f6806r0 = new eq[1];
        this.f6807s0 = false;
        boolean z13 = j10 == UserConfig.getInstance(i9).getClientUserId();
        this.T = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.f6801l0 = true;
        }
        this.U = i9;
        this.V = j10;
        this.Y = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.Z = GiftAuctionController.getInstance(i9).subscribeToGiftAuction(starGift.f22607id, this);
        }
        this.f6790a0 = kVar;
        this.f6792c0 = runnable;
        this.W = z10;
        this.X = z11;
        if (z10) {
            this.m0 = true;
        } else if (z11) {
            this.m0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            this.f6791b0 = UserObject.getForcedFirstName(MessagesController.getInstance(i9).getUser(Long.valueOf(j10)));
            z12 = z13;
        } else {
            z12 = z13;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            this.f6791b0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, this.resourcesProvider, false);
        this.f6796g0 = w0Var;
        w0Var.setDelegate(new Object());
        o6 o6Var = new o6(this, context);
        this.f6793d0 = o6Var;
        Drawable e10 = kh.r6.e(null, i9, j10, org.telegram.ui.ActionBar.f6.I.q());
        o6Var.V(e10);
        ng.c cVar = new ng.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof jb0) {
                jb0 jb0Var = (jb0) e10;
                if (jb0Var.f29704q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = jb0Var.f29686a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
        kg.f fVar2 = new kg.f(cVar);
        org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
        int i10 = org.telegram.ui.ActionBar.f6.f23072h5;
        fVar2.n(new lg.b(i10, b6Var));
        fVar2.p(AndroidUtilities.dp(20.0f));
        fVar2.o(AndroidUtilities.dp(f10));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f6794e0 = linearLayout2;
        linearLayout2.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            fVar = fVar2;
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f6797h0 = tL_messageActionStarGift;
            linearLayout = linearLayout2;
        } else {
            fVar = fVar2;
            if (kVar != null && kVar.f50559b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = kVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = kVar.a();
                long e11 = kVar.e();
                tL_messageActionGiftCode.amount = e11;
                if (kVar.h != null) {
                    linearLayout = linearLayout2;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e11);
                } else {
                    linearLayout = linearLayout2;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f6797h0 = tL_messageActionGiftCode;
            } else {
                linearLayout = linearLayout2;
                if (kVar != null && kVar.f50558a != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = kVar.d();
                    tL_messageActionGiftPremium.currency = kVar.a();
                    long e12 = kVar.e();
                    tL_messageActionGiftPremium.amount = e12;
                    if (kVar.h != null) {
                        tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e12);
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.f6797h0 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f6797h0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z14 = this.m0;
            tL_messageActionStarGift2.can_upgrade = z14 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z14) ? starGift.upgrade_stars : 0L;
            tL_messageActionStarGift2.convert_stars = z14 ? 0L : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f22401id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i9).getPeer(UserConfig.getInstance(i9).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i9).getPeer(j10);
        tL_messageService.action = this.f6797h0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i9).getSendPaidMessagesStars(j10) : 0L;
        this.f6795f0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i9, tL_messageService, false, false);
        this.f6798i0 = messageObject;
        w0Var.T(messageObject, true);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(w0Var, g7.e6.t(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        o6Var.addView(linearLayout3, g7.e6.e(-1, -1, 119));
        p6 p6Var = new p6(this, context, (xu0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i9).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i9);
        this.f6803o0 = p6Var;
        org.telegram.ui.Cells.d3 d3Var = p6Var.f24373b;
        d3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.i3());
        d3Var.M = true;
        p6Var.setShowLimitWhenNear(50);
        this.L = d3Var;
        p6Var.setShowLimitOnFocus(true);
        p6Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(p6Var, 3);
        d3Var.getEditText().setImeOptions(6);
        d3Var.getEditText().setOnEditorActionListener(new m.u2(gVar, 1));
        int i11 = this.backgroundPaddingLeft;
        p6Var.setPadding(i11, 0, i11, 0);
        f2.n nVar = new f2.n();
        nVar.C = false;
        nVar.f5532m = false;
        nVar.n(350L);
        nVar.o(gr.h);
        nVar.D = 40L;
        this.d.setItemAnimator(nVar);
        this.f6804p0.N(false);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout4.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        int i12 = this.backgroundPaddingLeft;
        linearLayout4.setPadding(i12, 0, i12, 0);
        this.containerView.addView(linearLayout4, g7.e6.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout4.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, this.resourcesProvider)));
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f6800k0 = frameLayout2;
            frameLayout2.addView(frameLayout, g7.e6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout4.addView(frameLayout, g7.e6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f6800k0 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        g10.setTextSize(1, 13.0f);
        g10.setGravity(21);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        if (starGift != null) {
            g10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(g10, g7.e6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View r6Var = new r6(context, starGift, clamp);
        r6Var.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider)));
        frameLayout.addView(r6Var, g7.e6.e(-1, -1, 119));
        s6 s6Var = new s6(context, clamp);
        s6Var.setWillNotDraw(false);
        frameLayout.addView(s6Var, g7.e6.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        s6Var.addView(textView2, g7.e6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        s6Var.addView(textView3, g7.e6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        kh.d dVar = new kh.d(context, this.resourcesProvider, true);
        this.f6799j0 = dVar;
        dVar.e();
        Y(false);
        linearLayout4.addView(dVar, g7.e6.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new z(this, j10, context, runnable, starGift));
        of.y yVar = this.f32407c;
        this.M = true;
        yVar.k1(true);
        this.f6804p0.N(false);
        this.f32407c.h1(this.f6804p0.f35191x.size(), AndroidUtilities.dp(200.0f));
        wk0 wk0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.f6800k0 == null) ? 40 : 0)));
        this.d.i(new t6(this));
        this.d.setOnItemClickListener(new mk0() {
            @Override
            public final void a(int i15, View view2) {
                boolean z15;
                long j11;
                TL_stars.StarGift starGift2;
                u6 u6Var = u6.this;
                TL_stars.StarGift starGift3 = u6Var.Y;
                boolean z16 = u6Var.T;
                org.telegram.ui.Cells.w0 w0Var2 = u6Var.f6796g0;
                TLRPC.MessageAction messageAction2 = u6Var.f6797h0;
                MessageObject messageObject2 = u6Var.f6798i0;
                z41 z41Var = u6Var.f6804p0;
                if (!u6Var.M) {
                    i15--;
                }
                l41 G = z41Var.G(i15);
                if (G != null) {
                    int i16 = G.d;
                    if (i16 == 1) {
                        boolean z17 = !u6Var.f6801l0;
                        u6Var.f6801l0 = z17;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z17;
                        }
                        messageObject2.updateMessageText();
                        w0Var2.T(messageObject2, true);
                        u6Var.f6804p0.N(true);
                    } else if (i16 == 2) {
                        if (!z10 && !z11) {
                            boolean z18 = u6Var.m0;
                            u6Var.m0 = !z18;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z18 && (!z16 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z15;
                                long j12 = 0;
                                if (z16 || z18) {
                                    j11 = 0;
                                } else {
                                    j11 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j11;
                                if (z18) {
                                    j12 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j12;
                            }
                            messageObject2.updateMessageText();
                            w0Var2.T(messageObject2, true);
                            u6Var.f6804p0.N(true);
                            u6Var.Y(true);
                            return;
                        }
                        int i17 = -u6Var.f6805q0;
                        u6Var.f6805q0 = i17;
                        AndroidUtilities.shakeViewSpring(view2, i17);
                    } else if (i16 == 3) {
                        boolean z19 = u6Var.f6802n0;
                        u6Var.f6802n0 = !z19;
                        boolean z20 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        zf.k kVar2 = kVar;
                        if (z20) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z19) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = kVar2.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = kVar2.a();
                                long e13 = kVar2.e();
                                tL_messageActionGiftPremium2.amount = e13;
                                if (kVar2.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e13);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z19) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = kVar2.g();
                            } else {
                                tL_messageActionGiftCode2.currency = kVar2.a();
                                long e14 = kVar2.e();
                                tL_messageActionGiftCode2.amount = e14;
                                if (kVar2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e14);
                                }
                            }
                        }
                        messageObject2.updateMessageText();
                        w0Var2.T(messageObject2, true);
                        u6Var.f6804p0.N(true);
                        u6Var.Y(true);
                    }
                }
            }
        });
        this.f32408e.setTitle(y());
    }

    public static void O(u6 u6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = u6Var.f6792c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(u6Var.f6803o0);
            u6Var.dismiss();
            AndroidUtilities.runOnUIThread(new l6(1, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, new oc(u6Var.topBulletinContainer, u6Var.resourcesProvider), R.raw.error, 36);
        }
        u6Var.f6799j0.setLoading(false);
    }

    public static void P(u6 u6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = u6Var.f6792c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(u6Var.f6803o0);
            u6Var.dismiss();
            AndroidUtilities.runOnUIThread(new l6(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, new oc(u6Var.topBulletinContainer, u6Var.resourcesProvider), R.raw.error, 36);
        }
        u6Var.f6799j0.setLoading(false);
    }

    public static void R(fh.u6 r17, long r18, android.content.Context r20, java.lang.Runnable r21, org.telegram.tgnet.tl.TL_stars.StarGift r22) {
        throw new UnsupportedOperationException("Method not decompiled: fh.u6.R(fh.u6, long, android.content.Context, java.lang.Runnable, org.telegram.tgnet.tl.TL_stars$StarGift):void");
    }

    public static void T(u6 u6Var) {
        new gh.k5(u6Var.getContext(), u6Var.U, u6Var.V, u6Var.resourcesProvider, null).V1(u6Var.Y.f22607id, u6Var.f6791b0);
    }

    public final TLRPC.TL_textWithEntities V() {
        if (MessagesController.getInstance(this.U).getSendPaidMessagesStars(this.V) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f6797h0;
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

    public oc W() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return oc.a0(U);
    }

    public final void X(boolean z10) {
        int i9 = this.U;
        MessagesController messagesController = MessagesController.getInstance(i9);
        long j10 = this.V;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(j10);
        int i10 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i9).putUser(user, true);
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f22527id), userFull);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f32410n;
        if (o2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) o2Var.getParentActivity()).O().getFragmentStack());
            org.telegram.ui.ActionBar.b5 parentLayout = o2Var.getParentLayout();
            int size = arrayList.size();
            qn qnVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                if (o2Var2 instanceof qn) {
                    qnVar = (qn) o2Var2;
                    if (qnVar.a() != j10) {
                        o2Var2.removeSelfFromStack();
                    }
                } else if (o2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == o2Var2) {
                        o2Var2.finishFragment();
                    } else {
                        o2Var2.removeSelfFromStack();
                    }
                }
            }
            if (qnVar == null || qnVar.a() != j10) {
                ((ActionBarLayout) parentLayout).Q(new qn(e2.c.g(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Y(boolean z10) {
        long j10;
        long j11;
        String str;
        GiftAuctionController.Auction auction = this.Z;
        int i9 = this.U;
        kh.d dVar = this.f6799j0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
            if (this.Z.isUpcoming(currentTime)) {
                int i10 = this.Z.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i10)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Z.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
            dVar.f(null, z10);
            return;
        }
        TL_stars.StarGift starGift = this.Y;
        eq[] eqVarArr = this.f6806r0;
        if (starGift != null) {
            long j12 = v7.y(i9, false).p().amount;
            long j13 = starGift.stars;
            if (this.m0) {
                j10 = starGift.upgrade_stars;
            } else {
                j10 = 0;
            }
            long j14 = j13 + j10;
            if (TextUtils.isEmpty(this.f6803o0.getText())) {
                j11 = 0;
            } else {
                j11 = this.f6795f0;
            }
            long j15 = j14 + j11;
            if (this.T) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.g(oa.V0(false, LocaleController.formatPluralStringComma(str, (int) j15), eqVarArr), z10, true);
            if (v7.y(i9, false).f9048e && j15 > j12) {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j12), z10);
                return;
            } else {
                dVar.f(null, z10);
                return;
            }
        }
        zf.k kVar = this.f6790a0;
        if (kVar != null) {
            if (this.f6802n0) {
                dVar.g(oa.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, eqVarArr), z10, true);
                eqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starBalanceUpdated) {
            Y(true);
            z41 z41Var = this.f6804p0;
            if (z41Var != null && this.f6790a0 != null) {
                z41Var.N(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        p6 p6Var = this.f6803o0;
        org.telegram.ui.Cells.d3 d3Var = p6Var.f24373b;
        org.telegram.ui.Cells.d3 d3Var2 = p6Var.f24373b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
        } else if (d3Var2.v) {
            d3Var2.d();
        } else {
            d3Var2.r();
            if (this.Z != null) {
                GiftAuctionController.getInstance(this.U).unsubscribeFromGiftAuction(this.Z.giftId, this);
            }
            this.f6807s0 = true;
            super.dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onBackPressed() {
        p6 p6Var = this.f6803o0;
        org.telegram.ui.Cells.d3 d3Var = p6Var.f24373b;
        org.telegram.ui.Cells.d3 d3Var2 = p6Var.f24373b;
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
        p6 p6Var = this.f6803o0;
        if (p6Var != null) {
            p6Var.f24373b.s();
        }
        super.show();
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.U, 0, true, new h6(this, 0), this.resourcesProvider);
        this.f6804p0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        int i9;
        if (this.T) {
            i9 = R.string.Gift2TitleSelf2;
        } else {
            i9 = R.string.Gift2Title;
        }
        return LocaleController.getString(i9);
    }
}

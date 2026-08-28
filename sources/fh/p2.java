package fh;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.da;
import gh.e8;
import gh.n7;
import gh.oa;
import gh.v7;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zy;
import org.telegram.ui.LaunchActivity;
public final class p2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final int f6678r0 = 0;
    public final int T;
    public z41 U;
    public List V;
    public final Utilities.Callback W;
    public TLRPC.DisallowedGiftsSettings X;
    public final long Y;
    public final boolean Z;
    public final String f6679a0;
    public final da f6680b0;
    public final r1 f6681c0;
    public final FrameLayout f6682d0;
    public final LinearLayout f6683e0;
    public final zy f6684f0;
    public final w1 f6685g0;
    public final s1 f6686h0;
    public final t1 f6687i0;
    public final ArrayList f6688j0;
    public final n7 f6689k0;
    public int f6690l0;
    public int m0;
    public int f6691n0;
    public int f6692o0;
    public boolean f6693p0;
    public boolean f6694q0;

    public p2(final android.content.Context r28, final int r29, final long r30, java.util.List r32, final org.telegram.messenger.Utilities.Callback r33) {
        throw new UnsupportedOperationException("Method not decompiled: fh.p2.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.Utilities$Callback):void");
    }

    public static void O(final p2 p2Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, g1 g1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            g1Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getContext(), 0, p2Var.resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f22702a.P = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.c2 o6 = alertDialog$Builder.o();
            final vt vtVar = o6.f22778n;
            if (vtVar != null) {
                vtVar.setOnLinkPressListener(new k80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        p2 p2Var2 = p2.this;
                        p2Var2.getClass();
                        o6.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        p2Var2.dismiss();
                        clickableSpan.onClick(vtVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new oc(p2Var.container, p2Var.resourcesProvider).d0(tL_error, false);
        }
    }

    public static void P(p2 p2Var, Context context, int i9, Utilities.Callback callback, long j10, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        l41 G = p2Var.U.G(i10 - 1);
        if (G != null && G.G(e2.class)) {
            Object obj = G.G;
            int i11 = 0;
            if (obj instanceof zf.k) {
                new x1(p2Var, context, i9, (zf.k) obj, p2Var.Y, new c1(p2Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                n7 n7Var = p2Var.f6689k0;
                if (n7Var != null && p2Var.f6692o0 == p2Var.m0) {
                    ArrayList arrayList = n7Var.f8625l;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f22607id == starGift.f22607id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        y1 y1Var = new y1(p2Var, p2Var.getContext(), i9, UserConfig.getInstance(i9).getClientUserId(), p2Var.resourcesProvider);
                        y1Var.j2(savedStarGift, null);
                        y1Var.Z1(j10, new d1(p2Var, y1Var, j10, callback, 0));
                    }
                } else if (G.f30344q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f23653a = true;
                        obj3.f23656e = true;
                        z1 z1Var = new z1(j10, starGift.title, starGift.f22607id, p2Var.resourcesProvider, p2Var.container.getViewTreeObserver(), new Object());
                        z1Var.f6485e = new f1(0, p2Var, callback);
                        U.showAsSheet(z1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i9).getOrRequestAuction(starGift.f22607id, new y(context, p2Var.resourcesProvider, i9, j10, new c1(p2Var, callback, 1)));
                } else if (starGift.sold_out) {
                    org.telegram.ui.ActionBar.b6 b6Var = p2Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.f3 j11 = ll.j(context, b6Var, false, false);
                        LinearLayout f10 = ll.f(context, 1);
                        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        f10.setClipChildren(false);
                        f10.setClipToPadding(false);
                        o9 o9Var = new o9(context);
                        oa.a1(o9Var.getImageReceiver(), starGift, 160);
                        f10.addView(o9Var, g7.e6.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView h = j3.r0.h(f10, textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
                        h.setTextSize(1, 14.0f);
                        h.setTypeface(AndroidUtilities.bold());
                        h.setGravity(17);
                        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var));
                        h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        f10.addView(h, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
                        wy0 wy0Var = new wy0(context, b6Var);
                        if (starGift.first_sale_date != 0) {
                            wy0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            wy0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        wy0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), oa.X0(false, j3.r0.n(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            oa.E0(wy0Var, i9, starGift, b6Var);
                        }
                        f10.addView(wy0Var, g7.e6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        kh.d dVar = new kh.d(context, b6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        f10.addView(dVar, g7.e6.n(-1, 48));
                        j11.customView = f10;
                        org.telegram.ui.ActionBar.f3[] f3VarArr = {j11};
                        f3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new e8(f3VarArr, 2));
                        f3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            f3VarArr[0].makeAttached(U2);
                        }
                        f3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new oc(p2Var.container, p2Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    g1 g1Var = new g1(p2Var, context, i9, starGift, callback, 0);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i9).getCurrentTime()) {
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(p2Var.getContext(), 3, null);
                        c2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f22607id;
                        ConnectionsManager.getInstance(i9).sendRequest(checkcansendgift, new h1(p2Var, c2Var, g1Var, callback, 0));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i9).isPremium()) {
                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            zf.k1 k1Var = new zf.k1(U3, i9, null, null, starGift, p2Var.resourcesProvider);
                            o9 o9Var2 = new o9(p2Var.getContext());
                            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(160.0f), 4, o9Var2, false);
                            o9Var2.setImageDrawable(i5Var);
                            o9Var2.addOnAttachStateChangeListener(new q1(i5Var));
                            i5Var.i(starGift.getDocument(), false);
                            k1Var.f50589x0 = o9Var2;
                            k1Var.show();
                            i5Var.f();
                        }
                    } else {
                        g1Var.run();
                    }
                }
            }
        }
    }

    public final void T(ArrayList arrayList, z41 z41Var) {
        long j10;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        TL_stars.StarGift starGift;
        boolean z13;
        boolean z14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z15;
        boolean z16;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f10;
        float f11;
        float f12;
        float f13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        r1 r1Var = this.f6681c0;
        long j11 = this.Y;
        long j12 = 0;
        boolean z17 = this.Z;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.X) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(l41.k(r1Var));
            arrayList.add(l41.k(this.f6682d0));
            ArrayList arrayList3 = this.f6688j0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList3.get(i9);
                    i9++;
                    int i10 = e2.f6424a;
                    long j13 = j12;
                    l41 J = l41.J(e2.class);
                    J.f30348u = 1;
                    J.G = (zf.k) obj;
                    arrayList.add(J);
                    j12 = j13;
                }
                j10 = j12;
            } else {
                j10 = 0;
                l41 o6 = l41.o(1, 34);
                o6.f30348u = 1;
                arrayList.add(o6);
                l41 o9 = l41.o(2, 34);
                o9.f30348u = 1;
                arrayList.add(o9);
                l41 o10 = l41.o(3, 34);
                o10.f30348u = 1;
                arrayList.add(o10);
            }
            z10 = true;
        }
        int i11 = this.T;
        v7 y10 = v7.y(i11, false);
        if (this.f6693p0) {
            arrayList2 = y10.J;
        } else {
            arrayList2 = y10.I;
        }
        if (this.X != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new mh.m1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i12 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i12 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new i1(0)).collect(Collectors.toCollection(new Object()));
        }
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        n7 n7Var = this.f6689k0;
        if (j11 != clientUserId && n7Var != null) {
            ArrayList arrayList4 = n7Var.f8625l;
            int size2 = arrayList4.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList4.get(i13);
                i13++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z18 = MessagesController.getInstance(i11).stargiftsBlocked;
        float f14 = 300.0f;
        if (!z18 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.X) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && n7Var != null && !n7Var.f8625l.isEmpty()))) {
            if (!z10) {
                arrayList.add(l41.k(r1Var));
            } else {
                arrayList.add(l41.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(l41.k(this.f6683e0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.X;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i14)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.m0 = -1;
            this.f6690l0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f6690l0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.X;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.m0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f6691n0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i15 = this.f6692o0;
            j1 j1Var = new j1(this, 0);
            int i16 = n2.f6640a;
            l41 J2 = l41.J(n2.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f30352z = i15;
            J2.H = j1Var;
            arrayList.add(J2);
            if (this.f6692o0 == this.f6691n0 && !z17 && i12 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f6694q0) {
                this.f6694q0 = z12;
                ViewPropertyAnimator animate = this.f6686h0.animate();
                float f15 = 0.0f;
                float f16 = 1.0f;
                if (!z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (!z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(380L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate2 = this.f6687i0.animate();
                if (z12) {
                    f15 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!z12) {
                    f16 = 0.85f;
                }
                scaleX2.scaleY(f16).setDuration(380L).setInterpolator(grVar).start();
            }
            if (n7Var != null && this.f6692o0 == this.m0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = n7Var.f8625l;
                int size3 = arrayList6.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList6.get(i17);
                    i17++;
                    TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift2);
                    }
                }
            }
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList2.get(i19);
                int i20 = this.f6692o0;
                if (i20 == this.f6690l0 || i20 == this.m0 || (i20 == this.f6691n0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i20 != this.f6691n0) {
                        if (i20 == this.m0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        l41 a2 = e2.a(i20, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i18++;
                    } else {
                        starGift = starGift3;
                    }
                    int i21 = this.f6692o0;
                    if (i21 == this.m0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.X) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(e2.a(i21, starGift, z13, z14, true, false, false));
                    i18++;
                }
            }
            int i22 = this.f6692o0;
            int i23 = this.m0;
            if (i22 == i23 && n7Var != null && !n7Var.f8623j) {
                n7Var.a();
                l41 o11 = l41.o(4, 34);
                o11.f30348u = 1;
                arrayList.add(o11);
                l41 o12 = l41.o(5, 34);
                o12.f30348u = 1;
                arrayList.add(o12);
                l41 o13 = l41.o(6, 34);
                o13.f30348u = 1;
                arrayList.add(o13);
            } else if (i22 != i23 && y10.C) {
                l41 o14 = l41.o(4, 34);
                o14.f30348u = 1;
                arrayList.add(o14);
                l41 o15 = l41.o(5, 34);
                o15.f30348u = 1;
                arrayList.add(o15);
                l41 o16 = l41.o(6, 34);
                o16.f30348u = 1;
                arrayList.add(o16);
            }
            if (i18 >= 9) {
                f14 = 40.0f;
            }
            arrayList.add(l41.C(AndroidUtilities.dp(f14)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.X;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(l41.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void U(boolean z10) {
        this.f6693p0 = z10;
        this.U.N(false);
    }

    public final void V() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f6688j0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.V) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.V.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.V.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.V.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                            if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                                break;
                            }
                        } else {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                    }
                    zf.k kVar = new zf.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        b9.c cVar = new b9.c();
                        cVar.f1663c = "inapp";
                        cVar.f1662b = kVar.h();
                        arrayList2.add(cVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((zf.k) obj).f50563g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new a1.c(this, 28));
            }
        }
        if (arrayList.isEmpty()) {
            bg.u0.j(this.T, null, new j1(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i9 == NotificationCenter.billingProductDetailsUpdated) {
            V();
        } else if (i9 == NotificationCenter.starGiftsLoaded) {
            z41 z41Var2 = this.U;
            if (z41Var2 != null) {
                z41Var2.N(true);
            }
        } else if (i9 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.Y;
                if (longValue == j10 && j10 > 0) {
                    int i11 = this.T;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i11).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.X = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            oc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    z41 z41Var3 = this.U;
                    if (z41Var3 != null) {
                        z41Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f6688j0;
                if (arrayList == null || arrayList.isEmpty()) {
                    V();
                    z41 z41Var4 = this.U;
                    if (z41Var4 != null) {
                        z41Var4.N(true);
                    }
                }
            }
        } else if (i9 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new oc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                z41 z41Var5 = this.U;
                if (z41Var5 != null) {
                    z41Var5.N(true);
                }
            }
        } else if (i9 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f6689k0 && (z41Var = this.U) != null) {
            z41Var.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i9 = this.T;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void show() {
        int i9 = this.T;
        if (MessagesController.getInstance(i9).isFrozen()) {
            org.telegram.ui.b.b(i9);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.X;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                oc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.Y)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.T, 0, true, new bh.c(this, 8), this.resourcesProvider);
        this.U = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        if (this.Z) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f6679a0), null, false);
    }

    public p2(LaunchActivity launchActivity, int i9, long j10) {
        this(launchActivity, i9, j10, null, null);
    }
}

package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import dg.j3;
import dg.n3;
import dg.q3;
import gg.d1;
import gg.r;
import gg.v2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import k7.b6;
import kh.o3;
import kh.p3;
import kh.p5;
import kh.q5;
import kh.r5;
import kh.s3;
import lh.f4;
import lh.g5;
import lh.ja;
import lh.l7;
import lh.y9;
import nh.d4;
import nh.d8;
import nh.i9;
import nh.v7;
import nh.w3;
import nh.x3;
import nh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class n implements View.OnClickListener {
    public final int f2472a;
    public final Object f2473b;
    public final Object f2474c;

    public n(int i10, Object obj, Object obj2) {
        this.f2472a = i10;
        this.f2473b = obj;
        this.f2474c = obj2;
    }

    @Override
    public final void onClick(View view) {
        n3 j10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        x3 x3Var;
        lh.f1 f1Var = null;
        int i10 = 0;
        switch (this.f2472a) {
            case 0:
                e0 e0Var = (e0) this.f2473b;
                Context context = (Context) this.f2474c;
                if (!e0Var.f2363n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(e0Var.f2363n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    e0Var.f2363n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    p pVar = new p(e0Var, context, createBitmap);
                    e0Var.f2363n.f().addView(pVar, b6.c(-1.0f, -1));
                    y yVar = e0Var.f2363n;
                    Objects.requireNonNull(yVar);
                    pVar.setColorListener(new o(yVar, 0));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(nr.f27346f);
                    duration.addUpdateListener(new dg.o1(pVar, 3));
                    duration.start();
                    e0Var.f2363n.a();
                    e0Var.dismiss();
                    return;
                }
                return;
            case 1:
                q3 q3Var = (q3) this.f2473b;
                ll llVar = (ll) this.f2474c;
                n3[] n3VarArr = q3Var.E;
                if (n3VarArr != null && n3VarArr.length != 0 && q3Var.F != null && (j10 = q3Var.j(q3Var.f4752k0, q3Var.f4753l0)) != null) {
                    llVar.run(j10);
                    return;
                }
                return;
            case 2:
                qn.d0((xn) this.f2474c, 41026, new h0((dh.f) this.f2473b, 4), null);
                return;
            case 3:
                eg.v0.V((eg.v0) this.f2473b, (Context) this.f2474c);
                return;
            case 4:
                gg.w1 w1Var = (gg.w1) this.f2473b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f2474c;
                ArrayList arrayList = w1Var.U;
                if (!arrayList.isEmpty()) {
                    gg.f1 f1Var2 = w1Var.X;
                    if (!f1Var2.K) {
                        f1Var2.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        gg.p0.a(chat.f19184id, arrayList2, new gg.c1(w1Var, chat, arrayList2, hashSet, 1), new h0(w1Var, 8));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                v2 v2Var = (v2) this.f2473b;
                ArrayList arrayList3 = (ArrayList) this.f2474c;
                HashSet hashSet2 = v2Var.f6780e0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    v2Var.f6786k0.remove(l10);
                }
                v2Var.W();
                v2Var.W.b(true, hashSet2, new gg.g2(v2Var, 5), null);
                v2Var.i0(true, true);
                v2Var.X();
                return;
            case 6:
                v2.S((v2) this.f2473b, (TLRPC.User) this.f2474c, view);
                return;
            case 7:
                final hg.e eVar = (hg.e) this.f2473b;
                final ig.a aVar = (ig.a) this.f2474c;
                if (eVar.d) {
                    if (!aVar.f7488a.K) {
                        aVar.b(true);
                        String str = eVar.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        d1 d1Var = (d1) eVar;
                                        AndroidUtilities.runOnUIThread(new ef.e(d1Var, 13), 200L);
                                        d1Var.f6606r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        r.c((TLRPC.TL_error) obj3, eVar2.f7087n, eVar2.f7085c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        d1 d1Var = (d1) eVar;
                                        AndroidUtilities.runOnUIThread(new ef.e(d1Var, 13), 200L);
                                        d1Var.f6606r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        r.c((TLRPC.TL_error) obj3, eVar2.f7087n, eVar2.f7085c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new gg.f0(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((gg.d1) eVar).f6606r.dismiss();
                return;
            case 8:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f2474c;
                ig.g gVar = ((ig.h) this.f2473b).f7519s;
                if (gVar != null) {
                    gg.b1 b1Var = ((gg.r0) gVar).f6740a;
                    b1Var.Z.remove(chat2);
                    b1Var.a0(true, true);
                    return;
                }
                return;
            case 9:
                ((h0) this.f2473b).run((TLRPC.TL_payments_checkedGiftCode) this.f2474c);
                return;
            case 10:
                ((h0) this.f2473b).run((TLRPC.Chat) this.f2474c);
                return;
            case 11:
                kh.d.P((kh.d) this.f2473b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f2474c);
                return;
            case 12:
                s3 s3Var = (s3) this.f2473b;
                j3 j3Var = (j3) this.f2474c;
                HashSet hashSet3 = s3Var.W;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = s3Var.V.f12772l;
                        int size3 = arrayList5.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size3) {
                                Object obj3 = arrayList5.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i12 = savedStarGift.msg_id;
                                if (i12 != 0) {
                                    if (i12 == longValue) {
                                    }
                                }
                                if (savedStarGift.saved_id == longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList4.add(savedStarGift);
                        }
                    }
                    j3Var.run(arrayList4);
                    s3Var.dismiss();
                    return;
                }
                return;
            case 13:
                l7 l7Var = ((p3) this.f2473b).f10749c.V;
                l7Var.e = !l7Var.e;
                ((o3) this.f2474c).run();
                l7Var.i(true);
                return;
            case 14:
                r5 r5Var = (r5) this.f2473b;
                r5Var.getClass();
                if (((y9) this.f2474c).f13409f > 0) {
                    r5Var.presentFragment(new ja());
                    return;
                }
                return;
            case 15:
                q5.P((q5) this.f2473b, (p5) this.f2474c);
                return;
            case 16:
                lh.q.X((lh.q) this.f2473b, (Context) this.f2474c, view);
                return;
            case 17:
                lh.n0 n0Var = (lh.n0) this.f2473b;
                Context context2 = (Context) this.f2474c;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = lh.n0.f12810t0;
                    if (i13 < 6) {
                        strArr[i13] = LocaleController.formatPluralString("GiftOfferHours", iArr[i13] / 3600, new Object[0]);
                        if (iArr[i13] == n0Var.f12821k0) {
                            i14 = i13;
                        }
                        i13++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        h0 h0Var = new h0(n0Var, 18);
                        Pattern pattern = z4.f31230a;
                        uf.s1 b10 = uf.s1.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = j6.w0(null, j6.f20012j5, false);
                            int w03 = j6.w0(null, j6.f19977h5, false);
                            j6.w0(null, j6.Ji, false);
                            j6.w0(null, j6.Ni, false);
                            j6.w0(null, j6.E8, false);
                            j6.w0(null, j6.G8, false);
                            j6.w0(null, j6.f19996i6, false);
                            j6.w0(null, j6.Sh, false);
                            j6.w0(null, j6.Oh, false);
                            j6.w0(null, j6.Qh, false);
                            g3 g3Var = new g3(context2, null, false, false);
                            g3Var.fixNavigationBar();
                            g3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            wc0 wc0Var = new wc0(context2, null);
                            wc0Var.setAllItemsCount(6);
                            wc0Var.setItemCount(Math.min(6, 8));
                            wc0Var.setTextColor(w02);
                            wc0Var.setGravity(17);
                            wc0Var.setMinValue(0);
                            wc0Var.setMaxValue(5);
                            wc0Var.setValue(i14);
                            linearLayout.addView(wc0Var, b6.l(1.0f, 0, 432));
                            wc0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            r4 r4Var = new r4(context2, wc0Var);
                            r4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context2);
                            TextView textView = new TextView(context2);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new oh.d(10));
                            r4Var.addView(frameLayout, b6.t(-1, -2, 51, 22, 0, 0, 4));
                            r4Var.addView(linearLayout, b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ph.d dVar = new ph.d(context2, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.i2(r1, 1));
                            r4Var.addView(dVar, b6.t(-1, 48, 0, 16, 12, 16, 12));
                            g3Var.customView = r4Var;
                            g3Var.show();
                            g3Var.setOnDismissListener(new gg.g(6, h0Var, wc0Var));
                            g3Var.setBackgroundColor(w03);
                            g3Var.fixNavigationBar(w03);
                            g3[] g3VarArr = {g3Var};
                            return;
                        }
                        return;
                    }
                }
            case 18:
                lh.w0 w0Var = (lh.w0) this.f2473b;
                kh.a1 a1Var = (kh.a1) this.f2474c;
                ph.d dVar2 = w0Var.f13271f;
                if (dVar2.T && !dVar2.K) {
                    AndroidUtilities.hideKeyboard(w0Var.f13270c);
                    dVar2.setLoading(true);
                    a1Var.run(w0Var.B);
                    return;
                }
                return;
            case 19:
                lh.j1 j1Var = (lh.j1) this.f2473b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) this.f2474c;
                lh.c1 c1Var = j1Var.f12647l0;
                int i15 = j1Var.f12660z0;
                if (i15 == 2) {
                    c1Var.setPreviewingAttributes(arrayList6);
                    j1Var.S(1);
                    return;
                } else if (i15 == 1) {
                    lh.f1 f1Var3 = new lh.f1(c1Var.getUpgradeBackdropAttribute(), c1Var.getUpgradePatternAttribute(), c1Var.getUpgradeImageViewAttribute());
                    j1Var.f12653s0 = f1Var3;
                    c1Var.setPreviewAttributes(f1Var3);
                    j1Var.S(2);
                    return;
                } else {
                    return;
                }
            case 20:
                lh.f1 f1Var4 = (lh.f1) this.f2474c;
                lh.j1 j1Var2 = ((lh.d1) this.f2473b).K;
                int i16 = j1Var2.f12660z0;
                lh.c1 c1Var2 = j1Var2.f12647l0;
                if (i16 == 1) {
                    j1Var2.f12653s0 = new lh.f1(c1Var2.getUpgradeBackdropAttribute(), c1Var2.getUpgradePatternAttribute(), c1Var2.getUpgradeImageViewAttribute());
                    j1Var2.S(2);
                }
                int i17 = j1Var2.f12642g0.f12578r;
                lh.f1 f1Var5 = j1Var2.f12653s0;
                if (f1Var5 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var5.f12393a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var5.f12395c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = f1Var5.f12394b;
                    if (i17 == 1) {
                        f1Var = new lh.f1(f1Var4.f12393a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        f1Var = new lh.f1(stargiftattributebackdrop, f1Var4.f12394b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        f1Var = new lh.f1(stargiftattributebackdrop, stargiftattributepattern, f1Var4.f12395c);
                    }
                }
                j1Var2.f12653s0 = f1Var;
                c1Var2.setPreviewAttributes(f1Var);
                j1Var2.U();
                return;
            case 21:
                af.g.u(((g5) this.f2473b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.f2474c).fragment_listed_url);
                return;
            case 22:
                ((g5) this.f2473b).n2((CharSequence) this.f2474c);
                return;
            case 23:
                f4 f4Var = (f4) this.f2473b;
                f6 f6Var = (f6) this.f2474c;
                if (f4Var.B.getAlpha() >= 1.0f && !f4Var.f12411e0 && !f4Var.f12414g0 && f4Var.f12405a0 != null) {
                    new lh.j1(f4Var.getContext(), f6Var, f4Var.T, f4Var.W, f4Var.f12405a0, true).show();
                    return;
                }
                return;
            case 24:
                af.g.s((Context) this.f2474c, ((TL_stars.StarsTransaction) this.f2473b).transaction_url);
                return;
            case 25:
                nh.e1 e1Var = (nh.e1) this.f2473b;
                Context context3 = (Context) this.f2474c;
                if (e1Var != null) {
                    int i18 = e1Var.e;
                    if (i18 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            launchActivity.K0(i18);
                        } else {
                            return;
                        }
                    }
                    p2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i18).getStoriesController().u(e1Var.f15294c, e1Var.f15293b);
                        if (u10 == null) {
                            u10 = e1Var.f15292a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i18, context3, u10, null);
                            AndroidUtilities.runOnUIThread(new n0(15), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                d4 d4Var = (d4) this.f2473b;
                v7 v7Var = (v7) this.f2474c;
                i9 i9Var = d4Var.G0;
                if (v7Var.f15996b != null) {
                    Bundle bundle = new Bundle();
                    if (v7Var.f15996b.longValue() >= 0) {
                        bundle.putLong("user_id", v7Var.f15996b.longValue());
                    } else {
                        bundle.putLong("chat_id", -v7Var.f15996b.longValue());
                    }
                    if (v7Var.e && (num = v7Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        i9Var.H(new xn(bundle));
                        return;
                    }
                    i9Var.H(new ProfileActivity(bundle, null));
                    return;
                }
                ic Q = new qc(d4Var.Z0, d4Var.f15257y0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f25666a = 3;
                Q.k(true);
                return;
            case 27:
                d4 d4Var2 = (d4) this.f2473b;
                ((z8) d4Var2.N1).h(new eg.o1(d4Var2.G0.f15461f, 14, false));
                ((g3) this.f2474c).dismiss();
                return;
            case 28:
                d4 d4Var3 = ((w3) this.f2473b).f16027l;
                mv alert = ((d8) this.f2474c).getAlert();
                if (alert != null && (x3Var = d4Var3.N1) != null) {
                    ((z8) x3Var).h(alert);
                    d4Var3.f15228q1.a();
                    return;
                }
                return;
            default:
                ((VideoAds) this.f2473b).lambda$show$2((VideoAds.CloseDrawable) this.f2474c, view);
                return;
        }
    }

    public n(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f2472a = 24;
        this.f2474c = context;
        this.f2473b = starsTransaction;
    }
}

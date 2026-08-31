package dg;

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
import eg.h3;
import eg.l3;
import eg.o3;
import eh.m;
import hg.d1;
import hg.r;
import hg.v2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import k7.c6;
import lh.p3;
import lh.p5;
import lh.q5;
import lh.r5;
import lh.s3;
import mh.f4;
import mh.g5;
import mh.ja;
import mh.l7;
import mh.y9;
import oh.d8;
import oh.i9;
import oh.v7;
import oh.y3;
import oh.z3;
import oh.z8;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.Components.i2;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class n implements View.OnClickListener {
    public final int f4616a;
    public final Object f4617b;
    public final Object f4618c;

    public n(int i10, Object obj, Object obj2) {
        this.f4616a = i10;
        this.f4617b = obj;
        this.f4618c = obj2;
    }

    @Override
    public final void onClick(View view) {
        l3 j10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        z3 z3Var;
        mh.e1 e1Var = null;
        int i10 = 0;
        switch (this.f4616a) {
            case 0:
                e0 e0Var = (e0) this.f4617b;
                Context context = (Context) this.f4618c;
                if (!e0Var.f4506n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(e0Var.f4506n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    e0Var.f4506n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    p pVar = new p(e0Var, context, createBitmap);
                    e0Var.f4506n.f().addView(pVar, c6.c(-1.0f, -1));
                    y yVar = e0Var.f4506n;
                    Objects.requireNonNull(yVar);
                    pVar.setColorListener(new o(yVar, 0));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(pr.f30183f);
                    duration.addUpdateListener(new eg.m1(pVar, 3));
                    duration.start();
                    e0Var.f4506n.a();
                    e0Var.dismiss();
                    return;
                }
                return;
            case 1:
                o3 o3Var = (o3) this.f4617b;
                ml mlVar = (ml) this.f4618c;
                l3[] l3VarArr = o3Var.E;
                if (l3VarArr != null && l3VarArr.length != 0 && o3Var.F != null && (j10 = o3Var.j(o3Var.f5415k0, o3Var.f5416l0)) != null) {
                    mlVar.run(j10);
                    return;
                }
                return;
            case 2:
                sn.d0((xn) this.f4618c, 41026, new h0((eh.f) this.f4617b, 4), null);
                return;
            case 3:
                fg.v0.V((fg.v0) this.f4617b, (Context) this.f4618c);
                return;
            case 4:
                hg.w1 w1Var = (hg.w1) this.f4617b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f4618c;
                ArrayList arrayList = w1Var.U;
                if (!arrayList.isEmpty()) {
                    hg.f1 f1Var = w1Var.X;
                    if (!f1Var.K) {
                        f1Var.setLoading(true);
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
                        hg.p0.a(chat.f20843id, arrayList2, new hg.c1(w1Var, chat, arrayList2, hashSet, 1), new h0(w1Var, 8));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                v2 v2Var = (v2) this.f4617b;
                ArrayList arrayList3 = (ArrayList) this.f4618c;
                HashSet hashSet2 = v2Var.f7636e0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    v2Var.f7642k0.remove(l10);
                }
                v2Var.W();
                v2Var.W.b(true, hashSet2, new hg.g2(v2Var, 5), null);
                v2Var.i0(true, true);
                v2Var.X();
                return;
            case 6:
                v2.S((v2) this.f4617b, (TLRPC.User) this.f4618c, view);
                return;
            case 7:
                final ig.e eVar = (ig.e) this.f4617b;
                final jg.a aVar = (jg.a) this.f4618c;
                if (eVar.d) {
                    if (!aVar.f10006a.K) {
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
                                        AndroidUtilities.runOnUIThread(new m(d1Var, 15), 200L);
                                        d1Var.f7448r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        r.c((TLRPC.TL_error) obj3, eVar2.f8083n, eVar2.f8080c, new c(eVar2, 1));
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
                                        AndroidUtilities.runOnUIThread(new m(d1Var, 15), 200L);
                                        d1Var.f7448r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        r.c((TLRPC.TL_error) obj3, eVar2.f8083n, eVar2.f8080c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new hg.f0(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((hg.d1) eVar).f7448r.dismiss();
                return;
            case 8:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f4618c;
                jg.g gVar = ((jg.h) this.f4617b).f10040s;
                if (gVar != null) {
                    hg.b1 b1Var = ((hg.r0) gVar).f7593a;
                    b1Var.Z.remove(chat2);
                    b1Var.a0(true, true);
                    return;
                }
                return;
            case 9:
                ((h0) this.f4617b).run((TLRPC.TL_payments_checkedGiftCode) this.f4618c);
                return;
            case 10:
                ((h0) this.f4617b).run((TLRPC.Chat) this.f4618c);
                return;
            case 11:
                lh.d.P((lh.d) this.f4617b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f4618c);
                return;
            case 12:
                s3 s3Var = (s3) this.f4617b;
                h3 h3Var = (h3) this.f4618c;
                HashSet hashSet3 = s3Var.W;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = s3Var.V.f14405l;
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
                    h3Var.run(arrayList4);
                    s3Var.dismiss();
                    return;
                }
                return;
            case 13:
                l7 l7Var = ((p3) this.f4617b).f12893c.V;
                l7Var.f14399e = !l7Var.f14399e;
                ((lh.o3) this.f4618c).run();
                l7Var.i(true);
                return;
            case 14:
                r5 r5Var = (r5) this.f4617b;
                r5Var.getClass();
                if (((y9) this.f4618c).f15114f > 0) {
                    r5Var.presentFragment(new ja());
                    return;
                }
                return;
            case 15:
                q5.P((q5) this.f4617b, (p5) this.f4618c);
                return;
            case 16:
                mh.p.X((mh.p) this.f4617b, (Context) this.f4618c, view);
                return;
            case 17:
                mh.m0 m0Var = (mh.m0) this.f4617b;
                Context context2 = (Context) this.f4618c;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = mh.m0.f14421t0;
                    if (i13 < 6) {
                        strArr[i13] = LocaleController.formatPluralString("GiftOfferHours", iArr[i13] / 3600, new Object[0]);
                        if (iArr[i13] == m0Var.f14432k0) {
                            i14 = i13;
                        }
                        i13++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        h0 h0Var = new h0(m0Var, 18);
                        Pattern pattern = z4.f33718a;
                        vf.s1 b10 = vf.s1.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = k6.w0(null, k6.f21766j5, false);
                            int w03 = k6.w0(null, k6.f21731h5, false);
                            k6.w0(null, k6.Ji, false);
                            k6.w0(null, k6.Ni, false);
                            k6.w0(null, k6.E8, false);
                            k6.w0(null, k6.G8, false);
                            k6.w0(null, k6.f21750i6, false);
                            k6.w0(null, k6.Sh, false);
                            k6.w0(null, k6.Oh, false);
                            k6.w0(null, k6.Qh, false);
                            org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, null, false, false);
                            h3Var2.fixNavigationBar();
                            h3Var2.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            yc0 yc0Var = new yc0(context2, null);
                            yc0Var.setAllItemsCount(6);
                            yc0Var.setItemCount(Math.min(6, 8));
                            yc0Var.setTextColor(w02);
                            yc0Var.setGravity(17);
                            yc0Var.setMinValue(0);
                            yc0Var.setMaxValue(5);
                            yc0Var.setValue(i14);
                            linearLayout.addView(yc0Var, c6.l(1.0f, 0, 432));
                            yc0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            r4 r4Var = new r4(context2, yc0Var);
                            r4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context2);
                            TextView textView = new TextView(context2);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new s2(9));
                            r4Var.addView(frameLayout, c6.t(-1, -2, 51, 22, 0, 0, 4));
                            r4Var.addView(linearLayout, c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            qh.d dVar = new qh.d(context2, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new i2(r1, 1));
                            r4Var.addView(dVar, c6.t(-1, 48, 0, 16, 12, 16, 12));
                            h3Var2.customView = r4Var;
                            h3Var2.show();
                            h3Var2.setOnDismissListener(new hg.g(6, h0Var, yc0Var));
                            h3Var2.setBackgroundColor(w03);
                            h3Var2.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var2};
                            return;
                        }
                        return;
                    }
                }
            case 18:
                mh.v0 v0Var = (mh.v0) this.f4617b;
                lh.a1 a1Var = (lh.a1) this.f4618c;
                qh.d dVar2 = v0Var.f14916f;
                if (dVar2.T && !dVar2.K) {
                    AndroidUtilities.hideKeyboard(v0Var.f14914c);
                    dVar2.setLoading(true);
                    a1Var.run(v0Var.B);
                    return;
                }
                return;
            case 19:
                mh.i1 i1Var = (mh.i1) this.f4617b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) this.f4618c;
                mh.b1 b1Var2 = i1Var.f14211l0;
                int i15 = i1Var.f14224z0;
                if (i15 == 2) {
                    b1Var2.setPreviewingAttributes(arrayList6);
                    i1Var.S(1);
                    return;
                } else if (i15 == 1) {
                    mh.e1 e1Var2 = new mh.e1(b1Var2.getUpgradeBackdropAttribute(), b1Var2.getUpgradePatternAttribute(), b1Var2.getUpgradeImageViewAttribute());
                    i1Var.f14217s0 = e1Var2;
                    b1Var2.setPreviewAttributes(e1Var2);
                    i1Var.S(2);
                    return;
                } else {
                    return;
                }
            case 20:
                mh.e1 e1Var3 = (mh.e1) this.f4618c;
                mh.i1 i1Var2 = ((mh.c1) this.f4617b).K;
                int i16 = i1Var2.f14224z0;
                mh.b1 b1Var3 = i1Var2.f14211l0;
                if (i16 == 1) {
                    i1Var2.f14217s0 = new mh.e1(b1Var3.getUpgradeBackdropAttribute(), b1Var3.getUpgradePatternAttribute(), b1Var3.getUpgradeImageViewAttribute());
                    i1Var2.S(2);
                }
                int i17 = i1Var2.f14206g0.f14154r;
                mh.e1 e1Var4 = i1Var2.f14217s0;
                if (e1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = e1Var4.f13930a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = e1Var4.f13932c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = e1Var4.f13931b;
                    if (i17 == 1) {
                        e1Var = new mh.e1(e1Var3.f13930a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        e1Var = new mh.e1(stargiftattributebackdrop, e1Var3.f13931b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        e1Var = new mh.e1(stargiftattributebackdrop, stargiftattributepattern, e1Var3.f13932c);
                    }
                }
                i1Var2.f14217s0 = e1Var;
                b1Var3.setPreviewAttributes(e1Var);
                i1Var2.U();
                return;
            case 21:
                af.g.u(((g5) this.f4617b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.f4618c).fragment_listed_url);
                return;
            case 22:
                ((g5) this.f4617b).n2((CharSequence) this.f4618c);
                return;
            case 23:
                f4 f4Var = (f4) this.f4617b;
                g6 g6Var = (g6) this.f4618c;
                if (f4Var.B.getAlpha() >= 1.0f && !f4Var.f14022e0 && !f4Var.f14025g0 && f4Var.f14015a0 != null) {
                    new mh.i1(f4Var.getContext(), g6Var, f4Var.T, f4Var.W, f4Var.f14015a0, true).show();
                    return;
                }
                return;
            case 24:
                af.g.s((Context) this.f4618c, ((TL_stars.StarsTransaction) this.f4617b).transaction_url);
                return;
            case 25:
                oh.e1 e1Var5 = (oh.e1) this.f4617b;
                Context context3 = (Context) this.f4618c;
                if (e1Var5 != null) {
                    int i18 = e1Var5.f17005e;
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
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i18).getStoriesController().u(e1Var5.f17004c, e1Var5.f17003b);
                        if (u10 == null) {
                            u10 = e1Var5.f17002a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i18, context3, u10, null);
                            AndroidUtilities.runOnUIThread(new ag.f(17), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                oh.f4 f4Var2 = (oh.f4) this.f4617b;
                v7 v7Var = (v7) this.f4618c;
                i9 i9Var = f4Var2.G0;
                if (v7Var.f17858b != null) {
                    Bundle bundle = new Bundle();
                    if (v7Var.f17858b.longValue() >= 0) {
                        bundle.putLong("user_id", v7Var.f17858b.longValue());
                    } else {
                        bundle.putLong("chat_id", -v7Var.f17858b.longValue());
                    }
                    if (v7Var.f17860e && (num = v7Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        i9Var.H(new xn(bundle));
                        return;
                    }
                    i9Var.H(new ProfileActivity(bundle, null));
                    return;
                }
                ic Q = new qc(f4Var2.Z0, f4Var2.f17127y0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f27738a = 3;
                Q.k(true);
                return;
            case 27:
                oh.f4 f4Var3 = (oh.f4) this.f4617b;
                ((z8) f4Var3.N1).h(new fg.n1(f4Var3.G0.f17266f, 14, false));
                ((org.telegram.ui.ActionBar.h3) this.f4618c).dismiss();
                return;
            case 28:
                oh.f4 f4Var4 = ((y3) this.f4617b).f17950l;
                ov alert = ((d8) this.f4618c).getAlert();
                if (alert != null && (z3Var = f4Var4.N1) != null) {
                    ((z8) z3Var).h(alert);
                    f4Var4.f17098q1.a();
                    return;
                }
                return;
            default:
                ((VideoAds) this.f4617b).lambda$show$2((VideoAds.CloseDrawable) this.f4618c, view);
                return;
        }
    }

    public n(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f4616a = 24;
        this.f4618c = context;
        this.f4617b = starsTransaction;
    }
}

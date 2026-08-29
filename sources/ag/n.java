package ag;

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
import bg.n3;
import bg.r3;
import bg.u3;
import cg.m2;
import eg.e1;
import eg.s;
import eg.w2;
import i7.f6;
import ih.o3;
import ih.p3;
import ih.p5;
import ih.q5;
import ih.r5;
import ih.s3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import jh.g4;
import jh.h5;
import jh.ia;
import jh.k7;
import jh.x9;
import lh.d4;
import lh.d8;
import lh.i9;
import lh.v7;
import lh.w3;
import lh.x3;
import lh.z8;
import nh.yb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;
public final class n implements View.OnClickListener {
    public final int f589a;
    public final Object f590b;
    public final Object f591c;

    public n(int i10, Object obj, Object obj2) {
        this.f589a = i10;
        this.f590b = obj;
        this.f591c = obj2;
    }

    @Override
    public final void onClick(View view) {
        r3 j10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        x3 x3Var;
        jh.f1 f1Var = null;
        int i10 = 0;
        switch (this.f589a) {
            case 0:
                f0 f0Var = (f0) this.f590b;
                Context context = (Context) this.f591c;
                if (!f0Var.f467n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(f0Var.f467n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    f0Var.f467n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    q qVar = new q(f0Var, context, createBitmap);
                    f0Var.f467n.f().addView(qVar, f6.c(-1.0f, -1));
                    z zVar = f0Var.f467n;
                    Objects.requireNonNull(zVar);
                    qVar.setColorListener(new p(zVar, 0));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(jr.f29800f);
                    duration.addUpdateListener(new bg.q1(qVar, 3));
                    duration.start();
                    f0Var.f467n.a();
                    f0Var.dismiss();
                    return;
                }
                return;
            case 1:
                u3 u3Var = (u3) this.f590b;
                yb ybVar = (yb) this.f591c;
                r3[] r3VarArr = u3Var.D;
                if (r3VarArr != null && r3VarArr.length != 0 && u3Var.E != null && (j10 = u3Var.j(u3Var.f2564j0, u3Var.f2565k0)) != null) {
                    ybVar.run(j10);
                    return;
                }
                return;
            case 2:
                on.d0((tn) this.f591c, 41026, new i0((bh.f) this.f590b, 4), null);
                return;
            case 3:
                cg.v0.V((cg.v0) this.f590b, (Context) this.f591c);
                return;
            case 4:
                eg.x1 x1Var = (eg.x1) this.f590b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f591c;
                ArrayList arrayList = x1Var.T;
                if (!arrayList.isEmpty()) {
                    eg.g1 g1Var = x1Var.W;
                    if (!g1Var.J) {
                        g1Var.setLoading(true);
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
                        eg.q0.a(chat.f22392id, arrayList2, new eg.d1(x1Var, chat, arrayList2, hashSet, 1), new i0(x1Var, 8));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                w2 w2Var = (w2) this.f590b;
                ArrayList arrayList3 = (ArrayList) this.f591c;
                HashSet hashSet2 = w2Var.f6165d0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    w2Var.f6171j0.remove(l10);
                }
                w2Var.W();
                w2Var.V.b(true, hashSet2, new eg.h2(w2Var, 5), null);
                w2Var.i0(true, true);
                w2Var.X();
                return;
            case 6:
                w2.S((w2) this.f590b, (TLRPC.User) this.f591c, view);
                return;
            case 7:
                final fg.e eVar = (fg.e) this.f590b;
                final gg.a aVar = (gg.a) this.f591c;
                if (eVar.d) {
                    if (!aVar.f7276a.J) {
                        aVar.b(true);
                        String str = eVar.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r6 = (Void) obj3;
                                        aVar.b(false);
                                        e1 e1Var = (e1) eVar;
                                        AndroidUtilities.runOnUIThread(new m2(e1Var, 11), 200L);
                                        e1Var.f5980r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        s.c((TLRPC.TL_error) obj3, eVar2.f6741n, eVar2.f6738c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r6 = (Void) obj3;
                                        aVar.b(false);
                                        e1 e1Var = (e1) eVar;
                                        AndroidUtilities.runOnUIThread(new m2(e1Var, 11), 200L);
                                        e1Var.f5980r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        s.c((TLRPC.TL_error) obj3, eVar2.f6741n, eVar2.f6738c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new eg.g0(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((eg.e1) eVar).f5980r.dismiss();
                return;
            case 8:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f591c;
                gg.g gVar = ((gg.h) this.f590b).f7310s;
                if (gVar != null) {
                    eg.c1 c1Var = ((eg.s0) gVar).f6124a;
                    c1Var.Y.remove(chat2);
                    c1Var.a0(true, true);
                    return;
                }
                return;
            case 9:
                ((i0) this.f590b).run((TLRPC.TL_payments_checkedGiftCode) this.f591c);
                return;
            case 10:
                ((i0) this.f590b).run((TLRPC.Chat) this.f591c);
                return;
            case 11:
                ih.d.P((ih.d) this.f590b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f591c);
                return;
            case 12:
                s3 s3Var = (s3) this.f590b;
                n3 n3Var = (n3) this.f591c;
                HashSet hashSet3 = s3Var.V;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = s3Var.U.f12387l;
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
                    n3Var.run(arrayList4);
                    s3Var.dismiss();
                    return;
                }
                return;
            case 13:
                k7 k7Var = ((p3) this.f590b).f9326c.U;
                k7Var.f12381e = !k7Var.f12381e;
                ((o3) this.f591c).run();
                k7Var.i(true);
                return;
            case 14:
                r5 r5Var = (r5) this.f590b;
                r5Var.getClass();
                if (((x9) this.f591c).f13089f > 0) {
                    r5Var.presentFragment(new ia());
                    return;
                }
                return;
            case 15:
                q5.P((q5) this.f590b, (p5) this.f591c);
                return;
            case 16:
                jh.q.X((jh.q) this.f590b, (Context) this.f591c, view);
                return;
            case 17:
                jh.n0 n0Var = (jh.n0) this.f590b;
                Context context2 = (Context) this.f591c;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = jh.n0.f12481s0;
                    if (i13 < 6) {
                        strArr[i13] = LocaleController.formatPluralString("GiftOfferHours", iArr[i13] / 3600, new Object[0]);
                        if (iArr[i13] == n0Var.f12491j0) {
                            i14 = i13;
                        }
                        i13++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        i0 i0Var = new i0(n0Var, 18);
                        Pattern pattern = c5.f27308a;
                        sf.v1 b10 = sf.v1.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = g6.w0(null, g6.f23169j5, false);
                            int w03 = g6.w0(null, g6.f23133h5, false);
                            g6.w0(null, g6.Ji, false);
                            g6.w0(null, g6.Ni, false);
                            g6.w0(null, g6.E8, false);
                            g6.w0(null, g6.G8, false);
                            g6.w0(null, g6.f23152i6, false);
                            g6.w0(null, g6.Sh, false);
                            g6.w0(null, g6.Oh, false);
                            g6.w0(null, g6.Qh, false);
                            f3 f3Var = new f3(context2, null, false, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            qc0 qc0Var = new qc0(context2, null);
                            qc0Var.setAllItemsCount(6);
                            qc0Var.setItemCount(Math.min(6, 8));
                            qc0Var.setTextColor(w02);
                            qc0Var.setGravity(17);
                            qc0Var.setMinValue(0);
                            qc0Var.setMaxValue(5);
                            qc0Var.setValue(i14);
                            linearLayout.addView(qc0Var, f6.l(1.0f, 0, 432));
                            qc0Var.setFormatter(new org.telegram.ui.Components.u(strArr, 7));
                            u4 u4Var = new u4(context2, qc0Var);
                            u4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context2);
                            TextView textView = new TextView(context2);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new mh.d(10));
                            u4Var.addView(frameLayout, f6.t(-1, -2, 51, 22, 0, 0, 4));
                            u4Var.addView(linearLayout, f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            nh.d dVar = new nh.d(context2, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.k2(r1, 1));
                            u4Var.addView(dVar, f6.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = u4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new eg.g(6, i0Var, qc0Var));
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                            f3[] f3VarArr = {f3Var};
                            return;
                        }
                        return;
                    }
                }
            case 18:
                jh.w0 w0Var = (jh.w0) this.f590b;
                ih.b1 b1Var = (ih.b1) this.f591c;
                nh.d dVar2 = w0Var.f13005f;
                if (dVar2.S && !dVar2.J) {
                    AndroidUtilities.hideKeyboard(w0Var.f13003c);
                    dVar2.setLoading(true);
                    b1Var.run(w0Var.A);
                    return;
                }
                return;
            case 19:
                jh.j1 j1Var = (jh.j1) this.f590b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) this.f591c;
                jh.c1 c1Var2 = j1Var.f12293k0;
                int i15 = j1Var.f12306y0;
                if (i15 == 2) {
                    c1Var2.setPreviewingAttributes(arrayList6);
                    j1Var.S(1);
                    return;
                } else if (i15 == 1) {
                    jh.f1 f1Var2 = new jh.f1(c1Var2.getUpgradeBackdropAttribute(), c1Var2.getUpgradePatternAttribute(), c1Var2.getUpgradeImageViewAttribute());
                    j1Var.f12299r0 = f1Var2;
                    c1Var2.setPreviewAttributes(f1Var2);
                    j1Var.S(2);
                    return;
                } else {
                    return;
                }
            case 20:
                jh.f1 f1Var3 = (jh.f1) this.f591c;
                jh.j1 j1Var2 = ((jh.d1) this.f590b).J;
                int i16 = j1Var2.f12306y0;
                jh.c1 c1Var3 = j1Var2.f12293k0;
                if (i16 == 1) {
                    j1Var2.f12299r0 = new jh.f1(c1Var3.getUpgradeBackdropAttribute(), c1Var3.getUpgradePatternAttribute(), c1Var3.getUpgradeImageViewAttribute());
                    j1Var2.S(2);
                }
                int i17 = j1Var2.f12288f0.f12235r;
                jh.f1 f1Var4 = j1Var2.f12299r0;
                if (f1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var4.f12043a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var4.f12045c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = f1Var4.f12044b;
                    if (i17 == 1) {
                        f1Var = new jh.f1(f1Var3.f12043a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        f1Var = new jh.f1(stargiftattributebackdrop, f1Var3.f12044b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        f1Var = new jh.f1(stargiftattributebackdrop, stargiftattributepattern, f1Var3.f12045c);
                    }
                }
                j1Var2.f12299r0 = f1Var;
                c1Var3.setPreviewAttributes(f1Var);
                j1Var2.U();
                return;
            case 21:
                ye.d.u(((h5) this.f590b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.f591c).fragment_listed_url);
                return;
            case 22:
                ((h5) this.f590b).n2((CharSequence) this.f591c);
                return;
            case 23:
                g4 g4Var = (g4) this.f590b;
                c6 c6Var = (c6) this.f591c;
                if (g4Var.A.getAlpha() >= 1.0f && !g4Var.f12104d0 && !g4Var.f12108f0 && g4Var.W != null) {
                    new jh.j1(g4Var.getContext(), c6Var, g4Var.S, g4Var.V, g4Var.W, true).show();
                    return;
                }
                return;
            case 24:
                ye.d.s((Context) this.f591c, ((TL_stars.StarsTransaction) this.f590b).transaction_url);
                return;
            case 25:
                lh.d1 d1Var = (lh.d1) this.f590b;
                Context context3 = (Context) this.f591c;
                if (d1Var != null) {
                    int i18 = d1Var.f15456e;
                    if (i18 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            launchActivity.K0(i18);
                        } else {
                            return;
                        }
                    }
                    o2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.f15455c, d1Var.f15454b);
                        if (u10 == null) {
                            u10 = d1Var.f15453a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i18, context3, u10, null);
                            AndroidUtilities.runOnUIThread(new o0(15), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                d4 d4Var = (d4) this.f590b;
                v7 v7Var = (v7) this.f591c;
                i9 i9Var = d4Var.F0;
                if (v7Var.f16324b != null) {
                    Bundle bundle = new Bundle();
                    if (v7Var.f16324b.longValue() >= 0) {
                        bundle.putLong("user_id", v7Var.f16324b.longValue());
                    } else {
                        bundle.putLong("chat_id", -v7Var.f16324b.longValue());
                    }
                    if (v7Var.f16326e && (num = v7Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        i9Var.H(new tn(bundle));
                        return;
                    }
                    i9Var.H(new ProfileActivity(bundle, null));
                    return;
                }
                mc Q = new tc(d4Var.Y0, d4Var.f15539x0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f30645a = 3;
                Q.k(true);
                return;
            case 27:
                d4 d4Var2 = (d4) this.f590b;
                ((z8) d4Var2.M1).h(new cg.p1(d4Var2.F0.f15756f, 14, false));
                ((f3) this.f591c).dismiss();
                return;
            case 28:
                d4 d4Var3 = ((w3) this.f590b).f16362l;
                jv alert = ((d8) this.f591c).getAlert();
                if (alert != null && (x3Var = d4Var3.M1) != null) {
                    ((z8) x3Var).h(alert);
                    d4Var3.f15510p1.a();
                    return;
                }
                return;
            default:
                nh.n3 n3Var2 = (nh.n3) this.f590b;
                n3Var2.e((MediaController.AlbumEntry) this.f591c, false);
                n3Var2.B.n();
                return;
        }
    }

    public n(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f589a = 24;
        this.f591c = context;
        this.f590b = starsTransaction;
    }
}

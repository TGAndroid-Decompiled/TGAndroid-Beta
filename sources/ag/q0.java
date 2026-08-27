package ag;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import cg.f1;
import cg.r;
import gh.u3;
import gh.v3;
import gh.w5;
import gh.x5;
import gh.y5;
import h7.z5;
import hh.da;
import hh.g4;
import hh.i5;
import hh.m7;
import hh.oa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import jh.d8;
import jh.e4;
import jh.i9;
import jh.v7;
import jh.x3;
import jh.y3;
import jh.z8;
import lh.j8;
import lh.k7;
import lh.s8;
import lh.sb;
import lh.t9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

public final class q0 implements View.OnClickListener {

    public final int f620a;

    public final Object f621b;

    public final Object f622c;

    public q0(int i10, Object obj, Object obj2) {
        this.f620a = i10;
        this.f621b = obj;
        this.f622c = obj2;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        y3 y3Var;
        int i10 = this.f620a;
        int i11 = 5;
        int i12 = 3;
        hh.g1 g1Var = null;
        CharSequence charSequenceCoerceToText = null;
        g1Var = null;
        final int i13 = 0;
        Object obj = this.f622c;
        Object obj2 = this.f621b;
        switch (i10) {
            case 0:
                i1.V((i1) obj2, (Context) obj);
                break;
            case 1:
                cg.z1 z1Var = (cg.z1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ArrayList arrayList = z1Var.T;
                if (!arrayList.isEmpty()) {
                    cg.h1 h1Var = z1Var.W;
                    if (!h1Var.J) {
                        h1Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = 0;
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i14 < size) {
                            Object obj3 = arrayList.get(i14);
                            i14++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj3;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        cg.q0.a(chat.f22380id, arrayList2, new cg.e1(z1Var, chat, arrayList2, hashSet, 1), new n0(z1Var, i12));
                        break;
                    }
                }
                break;
            case 2:
                cg.y2 y2Var = (cg.y2) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                HashSet hashSet2 = y2Var.f2871d0;
                int size2 = arrayList3.size();
                while (i13 < size2) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    Long l10 = (Long) obj4;
                    l10.getClass();
                    hashSet2.remove(l10);
                    y2Var.f2877j0.remove(l10);
                }
                y2Var.W();
                y2Var.V.b(true, hashSet2, new cg.j2(y2Var, i11), null);
                y2Var.i0(true, true);
                y2Var.X();
                break;
            case 3:
                cg.y2.S((cg.y2) obj2, (TLRPC.User) obj, view);
                break;
            case 4:
                final dg.e eVar = (dg.e) obj2;
                final eg.a aVar = (eg.a) obj;
                if (!eVar.d) {
                    ((cg.f1) eVar).f2680r.dismiss();
                    break;
                } else if (!aVar.f5382a.J) {
                    final int i15 = 1;
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj5) {
                            switch (i13) {
                                case 0:
                                    aVar.b(false);
                                    f1 f1Var = (f1) eVar;
                                    AndroidUtilities.runOnUIThread(new af.e(f1Var, 24), 200L);
                                    f1Var.f2680r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    r.c((TLRPC.TL_error) obj5, eVar2.f4946n, eVar2.f4943c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj5) {
                            switch (i15) {
                                case 0:
                                    aVar.b(false);
                                    f1 f1Var = (f1) eVar;
                                    AndroidUtilities.runOnUIThread(new af.e(f1Var, 24), 200L);
                                    f1Var.f2680r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    r.c((TLRPC.TL_error) obj5, eVar2.f4946n, eVar2.f4943c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new cg.f0(callback2, callback, i13), 2);
                    break;
                }
                break;
            case 5:
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                eg.g gVar = ((eg.h) obj2).f5417s;
                if (gVar != null) {
                    cg.d1 d1Var = ((cg.s0) gVar).f2816a;
                    d1Var.Y.remove(chat2);
                    d1Var.a0(true, true);
                }
                break;
            case 6:
                ((n0) obj2).run((TLRPC.TL_payments_checkedGiftCode) obj);
                break;
            case 7:
                ((n0) obj2).run((TLRPC.Chat) obj);
                break;
            case 8:
                gh.d.P((gh.d) obj2, (TL_stars.TL_StarGiftAuctionAcquiredGift) obj);
                break;
            case 9:
                gh.y3 y3Var2 = (gh.y3) obj2;
                gh.q2 q2Var = (gh.q2) obj;
                HashSet hashSet3 = y3Var2.V;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long jLongValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = y3Var2.U.f9753l;
                        int size3 = arrayList5.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                Object obj5 = arrayList5.get(i16);
                                i16++;
                                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj5;
                                int i17 = savedStarGift2.msg_id;
                                if ((i17 != 0 && i17 == jLongValue) || savedStarGift2.saved_id == jLongValue) {
                                    savedStarGift = savedStarGift2;
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList4.add(savedStarGift);
                        }
                    }
                    q2Var.run(arrayList4);
                    y3Var2.dismiss();
                    break;
                }
                break;
            case 10:
                m7 m7Var = ((v3) obj2).f7592c.U;
                m7Var.f9747e = !m7Var.f9747e;
                ((u3) obj).run();
                m7Var.i(true);
                break;
            case 11:
                y5 y5Var = (y5) obj2;
                y5Var.getClass();
                if (((da) obj).f9146f > 0) {
                    y5Var.presentFragment(new oa());
                    break;
                }
                break;
            case 12:
                x5.P((x5) obj2, (w5) obj);
                break;
            case 13:
                hh.r.X((hh.r) obj2, (Context) obj, view);
                break;
            case 14:
                hh.o0 o0Var = (hh.o0) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    int[] iArr = hh.o0.f9796s0;
                    if (i18 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        n0 n0Var = new n0(o0Var, 13);
                        Pattern pattern = y4.f34802a;
                        qf.t1 t1VarB = qf.t1.b(UserConfig.selectedAccount);
                        t1VarB.g();
                        if (!t1VarB.d.isEmpty()) {
                            int iW0 = g6.w0(null, g6.f23161j5, false);
                            int iW1 = g6.w0(null, g6.f23124h5, false);
                            g6.w0(null, g6.Ji, false);
                            g6.w0(null, g6.Ni, false);
                            g6.w0(null, g6.E8, false);
                            g6.w0(null, g6.G8, false);
                            g6.w0(null, g6.f23144i6, false);
                            g6.w0(null, g6.Sh, false);
                            g6.w0(null, g6.Oh, false);
                            g6.w0(null, g6.Qh, false);
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, null, false, false);
                            e3Var.fixNavigationBar();
                            e3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            fc0 fc0Var = new fc0(context, null);
                            fc0Var.setAllItemsCount(6);
                            fc0Var.setItemCount(Math.min(6, 8));
                            fc0Var.setTextColor(iW0);
                            fc0Var.setGravity(17);
                            fc0Var.setMinValue(0);
                            fc0Var.setMaxValue(5);
                            fc0Var.setValue(i19);
                            linearLayout.addView(fc0Var, z5.l(1.0f, 0, 432));
                            fc0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            q4 q4Var = new q4(context, fc0Var);
                            q4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(iW0);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new kh.e(10));
                            q4Var.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
                            q4Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            lh.d dVar = new lh.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.h2(e3VarArr, 1));
                            q4Var.addView(dVar, z5.t(-1, 48, 0, 16, 12, 16, 12));
                            e3Var.customView = q4Var;
                            e3Var.show();
                            e3Var.setOnDismissListener(new cg.g(8, n0Var, fc0Var));
                            e3Var.setBackgroundColor(iW1);
                            e3Var.fixNavigationBar(iW1);
                            org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
                            break;
                        }
                    } else {
                        strArr[i18] = LocaleController.formatPluralString("GiftOfferHours", iArr[i18] / 3600, new Object[0]);
                        if (iArr[i18] == o0Var.f9806j0) {
                            i19 = i18;
                        }
                        i18++;
                    }
                }
                break;
            case 15:
                hh.x0 x0Var = (hh.x0) obj2;
                gh.d1 d1Var2 = (gh.d1) obj;
                lh.d dVar2 = x0Var.f10318f;
                if (dVar2.S && !dVar2.J) {
                    AndroidUtilities.hideKeyboard(x0Var.f10316c);
                    dVar2.setLoading(true);
                    d1Var2.run(x0Var.A);
                    break;
                }
                break;
            case 16:
                hh.l1 l1Var = (hh.l1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) obj;
                hh.d1 d1Var3 = l1Var.f9648k0;
                int i20 = l1Var.f9661y0;
                if (i20 == 2) {
                    d1Var3.setPreviewingAttributes(arrayList6);
                    l1Var.S(1);
                } else if (i20 == 1) {
                    hh.g1 g1Var2 = new hh.g1(d1Var3.getUpgradeBackdropAttribute(), d1Var3.getUpgradePatternAttribute(), d1Var3.getUpgradeImageViewAttribute());
                    l1Var.f9654r0 = g1Var2;
                    d1Var3.setPreviewAttributes(g1Var2);
                    l1Var.S(2);
                }
                break;
            case 17:
                hh.g1 g1Var3 = (hh.g1) obj;
                hh.l1 l1Var2 = ((hh.e1) obj2).J;
                int i21 = l1Var2.f9661y0;
                hh.d1 d1Var4 = l1Var2.f9648k0;
                if (i21 == 1) {
                    l1Var2.f9654r0 = new hh.g1(d1Var4.getUpgradeBackdropAttribute(), d1Var4.getUpgradePatternAttribute(), d1Var4.getUpgradeImageViewAttribute());
                    l1Var2.S(2);
                }
                int i22 = l1Var2.f9643f0.f9573r;
                hh.g1 g1Var4 = l1Var2.f9654r0;
                if (g1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g1Var4.f9291a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = g1Var4.f9293c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = g1Var4.f9292b;
                    if (i22 == 1) {
                        g1Var = new hh.g1(g1Var3.f9291a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i22 == 2) {
                        g1Var = new hh.g1(stargiftattributebackdrop, g1Var3.f9292b, stargiftattributemodel);
                    } else if (i22 == 0) {
                        g1Var = new hh.g1(stargiftattributebackdrop, stargiftattributepattern, g1Var3.f9293c);
                    }
                }
                l1Var2.f9654r0 = g1Var;
                d1Var4.setPreviewAttributes(g1Var);
                l1Var2.U();
                break;
            case 18:
                we.e.u(((i5) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                break;
            case 19:
                ((i5) obj2).n2((CharSequence) obj);
                break;
            case 20:
                g4 g4Var = (g4) obj2;
                c6 c6Var = (c6) obj;
                if (g4Var.A.getAlpha() >= 1.0f && !g4Var.f9307d0 && !g4Var.f9311f0 && g4Var.W != null) {
                    new hh.l1(g4Var.getContext(), c6Var, g4Var.S, g4Var.V, g4Var.W, true).show();
                    break;
                }
                break;
            case 21:
                we.e.s((Context) obj, ((TL_stars.StarsTransaction) obj2).transaction_url);
                break;
            case 22:
                jh.d1 d1Var5 = (jh.d1) obj2;
                Context context2 = (Context) obj;
                if (d1Var5 != null) {
                    int i23 = d1Var5.f13177e;
                    if (i23 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            launchActivity.K0(i23);
                        }
                    }
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        TL_stories.StoryItem storyItemU = MessagesController.getInstance(i23).getStoriesController().u(d1Var5.f13176c, d1Var5.f13175b);
                        if (storyItemU == null) {
                            storyItemU = d1Var5.f13174a;
                        }
                        if (storyItemU != null) {
                            n2VarU.getOrCreateStoryViewer().B(i23, context2, storyItemU, null);
                            AndroidUtilities.runOnUIThread(new l3(11), 200L);
                            break;
                        }
                    }
                }
                break;
            case 23:
                e4 e4Var = (e4) obj2;
                v7 v7Var = (v7) obj;
                i9 i9Var = e4Var.F0;
                if (v7Var.f14059b == null) {
                    ec ecVarQ = new mc(e4Var.Y0, e4Var.f13290x0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    ecVarQ.f28013a = 3;
                    ecVarQ.k(true);
                } else {
                    Bundle bundle = new Bundle();
                    if (v7Var.f14059b.longValue() >= 0) {
                        bundle.putLong("user_id", v7Var.f14059b.longValue());
                    } else {
                        bundle.putLong("chat_id", -v7Var.f14059b.longValue());
                    }
                    if (v7Var.f14061e && (num = v7Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        i9Var.H(new rn(bundle));
                    } else {
                        i9Var.H(new ProfileActivity(bundle, null));
                    }
                }
                break;
            case 24:
                e4 e4Var2 = (e4) obj2;
                ((z8) e4Var2.M1).h(new g2(e4Var2.F0.f13478f, 14, false));
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                break;
            case 25:
                e4 e4Var3 = ((x3) obj2).f14128l;
                cv alert = ((d8) obj).getAlert();
                if (alert != null && (y3Var = e4Var3.M1) != null) {
                    ((z8) y3Var).h(alert);
                    e4Var3.f13261p1.a();
                    break;
                }
                break;
            case 26:
                lh.p3 p3Var = (lh.p3) obj2;
                p3Var.e((MediaController.AlbumEntry) obj, false);
                p3Var.B.n();
                break;
            case 27:
                j8 j8Var = (j8) obj2;
                k7 k7Var = (k7) obj;
                org.telegram.ui.Cells.g3 g3Var = j8Var.U;
                try {
                    charSequenceCoerceToText = ((ClipboardManager) j8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(j8Var.getContext());
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (charSequenceCoerceToText != null) {
                    g3Var.f24370b.setText(charSequenceCoerceToText.toString());
                    org.telegram.ui.Cells.e3 e3Var2 = g3Var.f24370b;
                    e3Var2.setSelection(0, e3Var2.getText().length());
                }
                k7Var.run();
                break;
            case 28:
                sb sbVar = (sb) obj2;
                new s8((Context) obj, sbVar.f16749c, true, sbVar.f16804t0, new t9(sbVar, 20), sbVar.f16742a).show();
                break;
            default:
                nh.k.x0((nh.k) obj2, (Context) obj);
                break;
        }
    }

    public q0(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f620a = 21;
        this.f622c = context;
        this.f621b = starsTransaction;
    }
}

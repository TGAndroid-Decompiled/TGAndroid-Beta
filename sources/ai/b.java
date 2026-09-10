package ai;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import bi.aa;
import bi.ad;
import bi.ce;
import bi.e8;
import bi.gb;
import bi.h0;
import bi.i0;
import bi.j0;
import bi.m3;
import bi.p4;
import bi.q9;
import bi.r7;
import bi.r9;
import bi.sc;
import bi.v0;
import fg.s1;
import gg.a1;
import gg.a2;
import gg.h2;
import gg.y0;
import hi.g2;
import hi.g6;
import hi.k2;
import hi.q3;
import hi.z3;
import java.util.ArrayList;
import og.h1;
import og.k1;
import og.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.eo;
import org.telegram.ui.gy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.wy;
import pg.n0;
public final class b implements Utilities.Callback {
    public final int f421a;
    public final Object f422b;

    public b(Object obj, int i10) {
        this.f421a = i10;
        this.f422b = obj;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f7;
        j61 j61Var;
        boolean z10;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        j61 j61Var2;
        Editable editable;
        hi.a aVar;
        int i11;
        String str;
        switch (this.f421a) {
            case 0:
                g0 g0Var = (g0) this.f422b;
                String str2 = (String) obj;
                ArrayList arrayList = g0Var.h;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                    g0Var.i(true);
                }
                AndroidUtilities.runOnUIThread(new a1.e(5, g0Var, str2), 120L);
                return;
            case 1:
                ((bi.o) this.f422b).x(((Integer) obj).intValue());
                return;
            case 2:
                j0 j0Var = (j0) this.f422b;
                j0Var.f2917j0.f2835n.P = ((Float) obj).floatValue();
                i0 i0Var = j0Var.f2917j0;
                h0 h0Var = i0Var.d;
                if (h0Var != null) {
                    h0Var.setVolume(i0Var.f2835n.P);
                    return;
                }
                return;
            case 3:
                v0 v0Var = (v0) this.f422b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = v0Var.f3773c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(v0Var.f3773c);
                    return;
                }
                return;
            case 4:
                m3 m3Var = (m3) this.f422b;
                m3Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new a1.e(12, m3Var, (Runnable) obj), 80L);
                return;
            case 5:
                ((p4) this.f422b).f3383s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(r1.f18592w).start();
                return;
            case 6:
                ad adVar = (ad) ((r7) this.f422b);
                ce ceVar = adVar.A2;
                ceVar.X0.q((MessageObject) obj);
                r9 r9Var = ceVar.K1;
                int i12 = 0;
                if (r9Var != null && ceVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(r9Var.f3607y);
                    boolean z13 = !isEmpty;
                    ((pg0) ceVar.f2461j1.f3652c).a(!ceVar.X0.k(), false);
                    ceVar.f2461j1.setVisibility(0);
                    ViewPropertyAnimator animate = ceVar.f2461j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new j(5, adVar, z13)).start();
                }
                if (ceVar.A0.j()) {
                    ArrayList arrayList2 = ceVar.A0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            r9 r9Var2 = ((i0) obj2).f2835n;
                            if (r9Var2 != null && r9Var2.K) {
                                if (!TextUtils.isEmpty(ceVar.K1.f3607y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                ceVar.l0(i10, true, true);
                return;
            case 7:
                q9 q9Var = (q9) obj;
                h71 h71Var = ((e8) this.f422b).f2647n;
                if (h71Var != null) {
                    h71Var.setHDRInfo(q9Var);
                    return;
                }
                return;
            case 8:
                aa aaVar = (aa) this.f422b;
                n0 n0Var = (n0) obj;
                if (n0Var == null) {
                    aaVar.U();
                    return;
                }
                aaVar.f2335o0 = n0Var.e;
                aaVar.f2334n0 = n0Var.f40170f;
                return;
            case 9:
                ((gb) this.f422b).f2758n.W.H = ((Integer) obj).intValue();
                return;
            case 10:
                ((sc) this.f422b).g((Utilities.Callback) obj);
                return;
            case 11:
                di.x xVar = (di.x) this.f422b;
                ArrayList arrayList3 = xVar.f6991b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                r61 r61Var = xVar.f6990a;
                if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                    j61Var.N(true);
                    return;
                }
                return;
            case 12:
                ei.f fVar = (ei.f) this.f422b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = fVar.h;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fVar.h = arrayList4;
                r61 r61Var2 = fVar.e;
                if (r61Var2 != null) {
                    r61Var2.Y2.N(z10);
                    return;
                }
                return;
            case 13:
                ((fg.m) this.f422b).L((TLRPC.User) obj);
                return;
            case 14:
                TLRPC.User user2 = (TLRPC.User) obj;
                ao0 ao0Var = (ao0) ((fg.h0) this.f422b);
                gy gyVar = ao0Var.K0;
                if (user2 != null) {
                    wy wyVar = gyVar.J0;
                    if (wyVar != null) {
                        wyVar.K3();
                    }
                    MessagesController.getInstance(gyVar.H0).openApp(user2, 0);
                    ao0Var.R(user2.f17342id, user2);
                    return;
                }
                return;
            case 15:
                gg.n nVar = (gg.n) this.f422b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nVar.F != z11) {
                    nVar.F = z11;
                    if (!z11) {
                        nVar.f25171a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((gg.n0) this.f422b).f8964s, (e2.h) new gg.g0(0));
                return;
            case 17:
                y0 y0Var = (y0) this.f422b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                y0Var.G = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = y0Var.G.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                y0Var.H = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = y0Var.getMessagesController().getUser(Long.valueOf(y0Var.H.bot_id));
                }
                y0Var.M = user;
                TL_account.TL_connectedBot tL_connectedBot2 = y0Var.H;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                y0Var.J = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = y0Var.H;
                if (tL_connectedBot3 != null) {
                    z12 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z12 = true;
                }
                y0Var.I = z12;
                gg.e0 e0Var = y0Var.v;
                if (e0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    e0Var.i(tL_businessBotRecipients);
                }
                r61 r61Var3 = y0Var.f9092c;
                if (r61Var3 != null && (j61Var2 = r61Var3.Y2) != null) {
                    j61Var2.N(true);
                }
                y0Var.Y(true);
                y0Var.T = true;
                return;
            case 18:
                a1 a1Var = (a1) this.f422b;
                a1Var.f8809w = a1Var.e[((Integer) obj).intValue()];
                a1Var.V(true);
                return;
            case 19:
                h2 h2Var = (h2) this.f422b;
                h2Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", h2Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                eo eoVar = new eo(bundle);
                eoVar.C9 = true;
                h2Var.presentFragment(eoVar);
                return;
            case 20:
                AndroidUtilities.hideKeyboard((a2) this.f422b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 21:
                q3 q3Var = (q3) this.f422b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i13 = q3Var.f9800b;
                int i14 = q3Var.f9799a;
                z3 z3Var = q3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList6 = z3Var.f10008l3;
                    ArrayList arrayList7 = z3Var.f10008l3;
                    if (i14 < arrayList6.size() && i13 < arrayList7.size()) {
                        k2 k2Var = z3Var.J3;
                        if (k2Var != null) {
                            k2Var.d();
                        }
                        hi.m3 m3Var2 = z3Var.f10011n3;
                        if (m3Var2 != null) {
                            m3Var2.f(false);
                        }
                        hi.a aVar2 = (hi.a) arrayList7.get(i14);
                        hi.a aVar3 = (hi.a) arrayList7.get(i13);
                        CharSequence charSequence = "";
                        if (!z3.z3(aVar2.f9421b)) {
                            editable = "";
                        } else {
                            editable = z3Var.L4(aVar2);
                        }
                        if (z3.z3(aVar3.f9421b)) {
                            charSequence = z3Var.L4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(q3Var.f9801c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(q3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList8 = new ArrayList();
                        z3.V2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            g6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new hi.a(pageblockparagraph, aVar2.f9422c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                hi.a aVar4 = (hi.a) arrayList8.get(0);
                                if (z3.z3(aVar4.f9421b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) g6.A(aVar4.f9421b));
                                    g6.d(aVar4.f9421b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    g6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new hi.a(pageblockparagraph2, aVar2.f9422c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                hi.a aVar5 = (hi.a) hc.b.i(1, arrayList8);
                                if (z3.z3(aVar5.f9421b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(g6.A(aVar5.f9421b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    g6.d(aVar5.f9421b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    g6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new hi.a(pageblockparagraph3, aVar3.f9422c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = z3Var.f10006k3;
                        if (richMessage2 == null) {
                            z3Var.f10006k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                z3Var.f10006k3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                            z3Var.u4((hi.a) arrayList8.get(i15));
                        }
                        while (i13 >= i14) {
                            arrayList7.remove(i13);
                            i13--;
                        }
                        arrayList7.addAll(i14, arrayList8);
                        z3Var.r4();
                        z3Var.Y2.N(false);
                        k2 k2Var2 = z3Var.J3;
                        if (k2Var2 != null) {
                            k2Var2.h();
                        }
                        z3Var.f10001h3.onContentChanged();
                        if (arrayList8.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (hi.a) hc.b.i(1, arrayList8);
                        }
                        z3Var.post(new s1(15, q3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ((hi.n) this.f422b).f9749a.f9835r.T1((TL_iv.RichMessage) obj);
                return;
            case 23:
                ((g2) this.f422b).P.T1((TL_iv.RichMessage) obj);
                return;
            case 24:
                z3 z3Var2 = (z3) this.f422b;
                String str3 = (String) obj;
                z3Var2.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str3;
                    z3Var2.Q1(pageblockmath);
                    return;
                }
                return;
            case 25:
                og.g0 g0Var2 = (og.g0) this.f422b;
                k1 k1Var = (k1) obj;
                h1 h1Var = g0Var2.f14364a;
                if (k1Var != null) {
                    float currentWeight = h1Var.getCurrentWeight();
                    k1Var.f14408f = currentWeight;
                    double d = g0Var2.f14376p;
                    if (d > 0.0d) {
                        k1Var.f14408f = (float) ((d / g0Var2.f14377q) * currentWeight);
                    }
                    if (k1Var.f14405a.o() == 4) {
                        k1Var.f14412k *= k1Var.f14408f;
                    }
                }
                og.v0 painting = h1Var.getPainting();
                if (painting.L == null) {
                    painting.f14515f.f(new q0(painting, k1Var, 1));
                    return;
                }
                return;
            case 26:
                oh.i iVar = (oh.i) this.f422b;
                if (((oh.b) obj) == oh.b.d && ((i11 = iVar.f14597s) == 2 || i11 == 3)) {
                    iVar.f14597s = 1;
                }
                iVar.h.run();
                return;
            case 27:
                AndroidUtilities.hideKeyboard((fu) this.f422b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 28:
                org.telegram.ui.web.y0 y0Var2 = ((BotWebViewContainer$WebViewProxy) this.f422b).f37846b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                y0Var2.d(sb2.toString());
                return;
            default:
                org.telegram.ui.web.h1 h1Var2 = (org.telegram.ui.web.h1) this.f422b;
                h1Var2.e = (ArrayList) obj;
                l61 l61Var = h1Var2.f25171a;
                if (l61Var.G) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
        }
    }
}

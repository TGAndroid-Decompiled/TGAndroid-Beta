package nh;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.u51;
import org.telegram.ui.fy;
import org.telegram.ui.ox;
import org.telegram.ui.tn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public final class b0 implements Utilities.Callback {
    public final int f17407a;
    public final Object f17408b;

    public b0(Object obj, int i10) {
        this.f17407a = i10;
        this.f17408b = obj;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f9;
        String str;
        k51 k51Var;
        k51 k51Var2;
        boolean z10;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        k51 k51Var3;
        Editable editable;
        th.a aVar;
        switch (this.f17407a) {
            case 0:
                e0 e0Var = (e0) this.f17408b;
                e0Var.f17566f0.f17515n.P = ((Float) obj).floatValue();
                d0 d0Var = e0Var.f17566f0;
                cg.v2 v2Var = d0Var.d;
                if (v2Var != null) {
                    v2Var.setVolume(d0Var.f17515n.P);
                    return;
                }
                return;
            case 1:
                r0 r0Var = (r0) this.f17408b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f18497c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f18497c);
                    return;
                }
                return;
            case 2:
                p2 p2Var = (p2) this.f17408b;
                p2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new lh.r3(27, p2Var, (Runnable) obj), 80L);
                return;
            case 3:
                ((n3) this.f17408b).f18179s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f23735w).start();
                return;
            case 4:
                ja jaVar = (ja) ((t5) this.f17408b);
                gb gbVar = jaVar.f17975w2;
                gbVar.T0.q((MessageObject) obj);
                o7 o7Var = gbVar.G1;
                int i11 = 0;
                if (o7Var != null && gbVar.K1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(o7Var.f18303y);
                    boolean z13 = !isEmpty;
                    ((cg0) gbVar.f17756f1.f3158c).a(!gbVar.T0.k(), false);
                    gbVar.f17756f1.setVisibility(0);
                    ViewPropertyAnimator animate = gbVar.f17756f1.animate();
                    if (!isEmpty) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    animate.alpha(f9).withEndAction(new hh.f(11, jaVar, z13)).start();
                }
                if (gbVar.f17808w0.j()) {
                    ArrayList arrayList = gbVar.f17808w0.h;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            o7 o7Var2 = ((d0) obj2).f17515n;
                            if (o7Var2 != null && o7Var2.K) {
                                if (!TextUtils.isEmpty(gbVar.G1.f18303y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                gbVar.l0(i10, true, true);
                return;
            case 5:
                n7 n7Var = (n7) obj;
                l61 l61Var = ((f6) this.f17408b).f17661n;
                if (l61Var != null) {
                    l61Var.setHDRInfo(n7Var);
                    return;
                }
                return;
            case 6:
                y7 y7Var = (y7) this.f17408b;
                bg.h1 h1Var = (bg.h1) obj;
                if (h1Var == null) {
                    y7Var.U();
                    return;
                }
                y7Var.f18900k0 = h1Var.f2285e;
                y7Var.f18899j0 = h1Var.f2286f;
                return;
            case 7:
                ((u8) this.f17408b).f18726n.S.D = ((Integer) obj).intValue();
                return;
            case 8:
                ((ca) this.f17408b).g((Utilities.Callback) obj);
                return;
            case 9:
                AndroidUtilities.hideKeyboard((st) this.f17408b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 10:
                org.telegram.ui.web.w0 w0Var = ((BotWebViewContainer$WebViewProxy) this.f17408b).f43965b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb2.append(str);
                sb2.append(")");
                w0Var.d(sb2.toString());
                return;
            case 11:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f17408b;
                d1Var.f43999e = (ArrayList) obj;
                o51 o51Var = d1Var.f31601a;
                if (o51Var.C) {
                    o51Var.U2.N(true);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f17408b;
                w1Var.f44238n = ((ArrayList) obj).size();
                o51 o51Var2 = w1Var.f31601a;
                if (o51Var2 != null && (k51Var = o51Var2.U2) != null && o51Var2.C) {
                    k51Var.N(true);
                    return;
                }
                return;
            case 13:
                ph.r rVar = (ph.r) this.f17408b;
                ArrayList arrayList2 = rVar.f46013b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                u51 u51Var = rVar.f46012a;
                if (u51Var != null && (k51Var2 = u51Var.U2) != null) {
                    k51Var2.N(true);
                    return;
                }
                return;
            case 14:
                qh.g gVar = (qh.g) this.f17408b;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = gVar.h;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                gVar.h = arrayList3;
                u51 u51Var2 = gVar.f46703e;
                if (u51Var2 != null) {
                    u51Var2.U2.N(z10);
                    return;
                }
                return;
            case 15:
                ((rf.l) this.f17408b).L((TLRPC.User) obj);
                return;
            case 16:
                TLRPC.User user2 = (TLRPC.User) obj;
                mn0 mn0Var = (mn0) ((rf.a0) this.f17408b);
                ox oxVar = mn0Var.G0;
                if (user2 != null) {
                    fy fyVar = oxVar.F0;
                    if (fyVar != null) {
                        fyVar.K3();
                    }
                    MessagesController.getInstance(oxVar.D0).openApp(user2, 0);
                    mn0Var.R(user2.f22539id, user2);
                    return;
                }
                return;
            case 17:
                sf.l lVar = (sf.l) this.f17408b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (lVar.B != z11) {
                    lVar.B = z11;
                    if (!z11) {
                        lVar.f31601a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((sf.d0) this.f17408b).f47776s, (f5.d) new l4.x0(16));
                return;
            case 19:
                sf.l0 l0Var = (sf.l0) this.f17408b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                l0Var.C = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = l0Var.C.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                l0Var.D = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = l0Var.getMessagesController().getUser(Long.valueOf(l0Var.D.bot_id));
                }
                l0Var.I = user;
                TL_account.TL_connectedBot tL_connectedBot2 = l0Var.D;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                l0Var.F = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = l0Var.D;
                if (tL_connectedBot3 != null) {
                    z12 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z12 = true;
                }
                l0Var.E = z12;
                sf.w wVar = l0Var.v;
                if (wVar != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    wVar.i(tL_businessBotRecipients);
                }
                u51 u51Var3 = l0Var.f47862c;
                if (u51Var3 != null && (k51Var3 = u51Var3.U2) != null) {
                    k51Var3.N(true);
                }
                l0Var.Y(true);
                l0Var.P = true;
                return;
            case 20:
                sf.n0 n0Var = (sf.n0) this.f17408b;
                n0Var.f47901w = n0Var.f47896e[((Integer) obj).intValue()];
                n0Var.V(true);
                return;
            case 21:
                sf.n1 n1Var = (sf.n1) this.f17408b;
                n1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", n1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                tn tnVar = new tn(bundle);
                tnVar.f43046y9 = true;
                n1Var.presentFragment(tnVar);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((sf.h1) this.f17408b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 23:
                th.g3 g3Var = (th.g3) this.f17408b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = g3Var.f48454b;
                int i13 = g3Var.f48453a;
                th.p3 p3Var = g3Var.f48456e;
                if (richMessage != null) {
                    ArrayList arrayList5 = p3Var.f48646h3;
                    ArrayList arrayList6 = p3Var.f48646h3;
                    if (i13 < arrayList5.size() && i12 < arrayList6.size()) {
                        th.b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        th.d3 d3Var = p3Var.f48650j3;
                        if (d3Var != null) {
                            d3Var.f(false);
                        }
                        th.a aVar2 = (th.a) arrayList6.get(i13);
                        th.a aVar3 = (th.a) arrayList6.get(i12);
                        CharSequence charSequence = "";
                        if (!th.p3.A3(aVar2.f48328b)) {
                            editable = "";
                        } else {
                            editable = p3Var.M4(aVar2);
                        }
                        if (th.p3.A3(aVar3.f48328b)) {
                            charSequence = p3Var.M4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(g3Var.f48455c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(g3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList7 = new ArrayList();
                        th.p3.W2(arrayList7, richMessage.blocks, null);
                        if (arrayList7.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            th.t5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList7.add(new th.a(pageblockparagraph, aVar2.f48329c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                th.a aVar4 = (th.a) arrayList7.get(0);
                                if (th.p3.A3(aVar4.f48328b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) th.t5.A(aVar4.f48328b));
                                    th.t5.d(aVar4.f48328b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    th.t5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList7.add(0, new th.a(pageblockparagraph2, aVar2.f48329c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                th.a aVar5 = (th.a) j7.l1.i(1, arrayList7);
                                if (th.p3.A3(aVar5.f48328b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(th.t5.A(aVar5.f48328b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    th.t5.d(aVar5.f48328b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    th.t5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList7.add(new th.a(pageblockparagraph3, aVar3.f48329c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = p3Var.f48644g3;
                        if (richMessage2 == null) {
                            p3Var.f48644g3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList8 = richMessage.photos;
                            if (arrayList8 != null) {
                                richMessage2.photos.addAll(arrayList8);
                            }
                            ArrayList<TLRPC.Document> arrayList9 = richMessage.documents;
                            if (arrayList9 != null) {
                                p3Var.f48644g3.documents.addAll(arrayList9);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            p3Var.v4((th.a) arrayList7.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList6.remove(i12);
                            i12--;
                        }
                        arrayList6.addAll(i13, arrayList7);
                        p3Var.s4();
                        p3Var.U2.N(false);
                        th.b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.f48638d3.onContentChanged();
                        if (arrayList7.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (th.a) j7.l1.i(1, arrayList7);
                        }
                        p3Var.post(new sf.o1(8, g3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((th.k) this.f17408b).f48528a.f48623r.U1((TL_iv.RichMessage) obj);
                return;
            case 25:
                ((th.x1) this.f17408b).L.U1((TL_iv.RichMessage) obj);
                return;
            default:
                th.p3 p3Var2 = (th.p3) this.f17408b;
                String str2 = (String) obj;
                p3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    p3Var2.R1(pageblockmath);
                    return;
                }
                return;
        }
    }
}

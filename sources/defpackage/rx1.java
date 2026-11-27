package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;
public final class rx1 implements pcc {
    public final byte a;
    public final Object b;
    public final Object c;

    public rx1(c cVar, z25 z25Var, ctc ctcVar) {
        this.a = (byte) 28;
        this.b = z25Var;
        this.c = ctcVar;
    }

    @Override
    public final void a(Object obj) {
        r47 threadMessage;
        final boolean z;
        String str;
        String a;
        float f;
        boolean z2;
        ArrayList<TLRPC.Document> arrayList;
        int i;
        String G;
        byte b = this.a;
        c5a c5aVar = null;
        TLRPC.User user = null;
        boolean z3 = false;
        int i2 = 0;
        final boolean z4 = true;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((sx1) obj3).a;
                long j = chatActivityEnterView.F3;
                r47 r47Var = chatActivityEnterView.I3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                p7a b2 = p7a.b((String) obj2, j, r47Var, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                zu1 zu1Var = chatActivityEnterView.E3;
                if (zu1Var != null) {
                    c5aVar = zu1Var.X6();
                }
                b2.K = c5aVar;
                b2.O = chatActivityEnterView.o7;
                b2.Q = l.longValue();
                b2.R = chatActivityEnterView.getSendMonoForumPeerId();
                b2.T = chatActivityEnterView.getSendMessageSuggestionParams();
                r7a.B(chatActivityEnterView.R).q0(b2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                bx1 bx1Var = chatActivityEnterView.K0;
                chatActivityEnterView.o7 = 0L;
                bx1Var.setEffect(0L);
                return;
            case 1:
                n12 n12Var = (n12) obj3;
                g12 g12Var = (g12) obj2;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i3 = n12Var.G3;
                tL_messages_toggleBotInAttachMenu.bot = uc7.s1(i3).o1(g12Var.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new ql(n12Var, g12Var, (byte) 18), 66);
                return;
            case 2:
                n12 n12Var2 = (n12) obj3;
                ((zu1) obj2).y5 = (b77) obj;
                boolean q1 = n12Var2.q1(true, 0, 0, n12Var2.K2, n12Var2.b1());
                ox1 ox1Var = n12Var2.b2;
                if (ox1Var != null) {
                    ox1Var.f(!q1);
                    n12Var2.b2 = null;
                    return;
                }
                return;
            case 3:
                ((j22) obj3).getWebViewContainer().D((String) obj2, (String) obj, false);
                return;
            case 4:
                x12 x12Var = (x12) obj3;
                uc7 uc7Var = (uc7) obj2;
                Long l2 = (Long) obj;
                x12Var.j0 = false;
                if (l2 != null) {
                    user = uc7Var.X1(l2);
                }
                x12Var.i0 = user;
                if (user == null) {
                    z3 = true;
                }
                x12Var.k0 = z3;
                if (user != null) {
                    x12Var.R();
                    return;
                }
                return;
            case 5:
                a19 a19Var = (a19) obj2;
                Long l3 = (Long) obj;
                b19 f2 = b19.f(yac.t0);
                n12 n12Var3 = ((f72) obj3).b;
                long W0 = n12Var3.W0();
                int i4 = f2.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = uc7.s1(i4).j1(W0);
                tL_messages_sendQuickReplyMessages.shortcut_id = a19Var.a;
                jf7 Y = jf7.Y(i4);
                Y.a.c(new vp8(f2, Y, a19Var, tL_messages_sendQuickReplyMessages, (byte) 7));
                n12Var3.dismiss();
                return;
            case 6:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                pi9 pi9Var = ((v72) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    pi9Var.g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str2;
                pi9Var.O1(pageblockmath2);
                return;
            case 7:
                g82 g82Var = (g82) obj3;
                hh7 hh7Var = g82Var.f;
                hh7Var.r(((TLRPC.WallPaper) obj2).settings.intensity, ((avc) obj).a);
                hh7Var.s(hh7Var.f());
                View view = g82Var.b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                qn2 qn2Var = (qn2) obj3;
                qn2Var.getClass();
                qn2Var.Z(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                return;
            case 9:
                qn2 qn2Var2 = (qn2) obj3;
                qn2Var2.getClass();
                qn2Var2.Y((String) obj2, ((Boolean) obj).booleanValue());
                return;
            case 10:
                xo2 xo2Var = (xo2) obj3;
                xo2Var.G0((TLRPC.Chat) obj2, xo2Var.o1, ((Boolean) obj).booleanValue());
                return;
            case 11:
                rw2 rw2Var = (rw2) obj3;
                e eVar = (e) obj2;
                Long l4 = (Long) obj;
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                eVar.presentFragment(new ProfileActivity(bundle, null));
                rw2Var.d();
                return;
            case 12:
                nw2 nw2Var = (nw2) obj3;
                Boolean bool2 = (Boolean) obj;
                ((pcc) obj2).a(bool2);
                if (bool2.booleanValue()) {
                    nw2Var.a.d();
                    return;
                }
                return;
            case 13:
                uj3 uj3Var = (uj3) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    uj3Var.showDialog(new so7(activity, !jve.a(), new dh3(activity, (byte) 0)));
                    return;
                }
                return;
            case 14:
                final ao3 ao3Var = (ao3) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                co3 co3Var = ao3Var.b;
                if (!co3Var.h && !co3Var.g) {
                    int i5 = co3Var.v;
                    int[] iArr = co3.F;
                    if (i5 >= 0 && i5 < 4 && num.intValue() >= iArr[co3Var.v]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (num.intValue() < iArr[0] || num.intValue() - co3Var.y >= 100 || num.intValue() - co3Var.z < 100) {
                        z4 = false;
                    }
                    co3Var.y = num.intValue();
                    if (!z && !z4) {
                        co3Var.r = false;
                        return;
                    } else {
                        DictationLid.i(0, new ln3() {
                            @Override
                            public final void a(float[] fArr, long j2, int i6) {
                                String str3;
                                pm3 pm3Var;
                                ao3 ao3Var2 = ao3.this;
                                boolean z5 = z4;
                                boolean z6 = z;
                                co3 co3Var2 = ao3Var2.b;
                                co3Var2.r = false;
                                if (fArr != null) {
                                    co3Var2.z = i6;
                                    int i7 = 0;
                                    while (true) {
                                        int[] iArr2 = co3.F;
                                        if (i7 < 4) {
                                            if (iArr2[i7] > i6) {
                                                break;
                                            }
                                            i7++;
                                        } else {
                                            i7 = 4;
                                            break;
                                        }
                                    }
                                    co3Var2.v = i7;
                                    StringBuilder sb = new StringBuilder("tinyasr: tinylid ");
                                    if (z5 && !z6) {
                                        str3 = "after a pause";
                                    } else {
                                        str3 = "at a step";
                                    }
                                    bs2.x(sb, str3, "Dictation");
                                    if (!co3Var2.h && !co3Var2.g) {
                                        if (DictationAsr.E()) {
                                            co3Var2.c.d(DictationLid.d, fArr, i6);
                                        }
                                        mn3 l5 = DictationLid.l(DictationLid.h(i6), fArr);
                                        Log.d("Dictation", "tinyasr: tinylid " + i6 + " ms speech in " + j2 + " ms: " + l5 + " (route " + co3Var2.l + ")");
                                        if (l5 != null) {
                                            String str4 = l5.a;
                                            if (l5.c) {
                                                pm3 pm3Var2 = co3Var2.l;
                                                nm3 M = DictationAsr.M(str4, pm3Var2, false, false);
                                                if (M == null) {
                                                    pm3Var = null;
                                                } else {
                                                    pm3Var = new pm3(M, str4, (ArrayList) pm3Var2.d, (byte) 0);
                                                }
                                                if (pm3Var != null) {
                                                    nm3 nm3Var = (nm3) pm3Var.b;
                                                    pm3 pm3Var3 = co3Var2.l;
                                                    if (nm3Var == ((nm3) pm3Var3.b) && ((String) pm3Var.c).equals((String) pm3Var3.c)) {
                                                        co3Var2.s = true;
                                                        DictationLid.j(str4);
                                                        co3Var2.k(str4);
                                                    } else if (!co3Var2.s || l5.b >= 0.8f) {
                                                        co3Var2.s = true;
                                                        DictationLid.j(str4);
                                                        co3Var2.k(str4);
                                                        Log.d("Dictation", "tinyasr: switching to " + pm3Var);
                                                        co3Var2.i(pm3Var);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }, co3Var.a(), bArr);
                        return;
                    }
                }
                co3Var.r = false;
                return;
            case 15:
                xw3 xw3Var = (xw3) obj3;
                vwc vwcVar = (vwc) obj;
                uw3 uw3Var = ((uw3[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                if (vwcVar == null) {
                    str = "🌤";
                } else {
                    str = vwcVar.c;
                }
                sb.append(str);
                sb.append(" ");
                if (vwcVar == null) {
                    if (wwc.a()) {
                        a = "24°C";
                    } else {
                        a = "72°F";
                    }
                } else {
                    a = vwcVar.a();
                }
                sb.append(a);
                CharSequence m = pv3.m(sb.toString(), xw3Var.b.getFontMetricsInt(), false, null, 0);
                TextPaint textPaint = uw3Var.o.b;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m, textPaint, hl.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                uw3Var.k = staticLayout;
                float f3 = 0.0f;
                if (staticLayout.getLineCount() > 0) {
                    f = uw3Var.k.getLineWidth(0);
                } else {
                    f = 0.0f;
                }
                uw3Var.l = f;
                if (uw3Var.k.getLineCount() > 0) {
                    f3 = uw3Var.k.getLineLeft(0);
                }
                uw3Var.m = f3;
                uw3Var.b = hl.N(17.6f) + uw3Var.l;
                uw3Var.c = hl.N(36.0f);
                xw3Var.invalidate();
                xw3Var.requestLayout();
                return;
            case 16:
                jy3 jy3Var = (jy3) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    hl.c3(new iy3(jy3Var, (byte) 1));
                    return;
                }
                return;
            case 17:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                vx3 vx3Var = (vx3) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                vx3Var.run();
                return;
            case 18:
                n14 n14Var = (n14) obj3;
                o14 o14Var = n14Var.a;
                o24 o24Var = o14Var.G;
                ls6 d0 = ls6.d0(o24Var.d1);
                String[] strArr = o24Var.X0;
                String str3 = o14Var.w;
                fu2 fu2Var = new fu2(n14Var, (String) obj2, (Runnable) obj, (byte) 9);
                if (!xea.E && !yac.h(o24Var.d1).p()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                d0.X(strArr, str3, false, fu2Var, z2, false, true, false, 25);
                return;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                o14 o14Var2 = ((n14) obj3).a;
                if (ConnectionsManager.getInstance(o14Var2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    o14Var2.F(runnable, arrayList2, false);
                    return;
                }
            case 20:
                i24 i24Var = (i24) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i2 < size) {
                    Object obj4 = arrayList3.get(i2);
                    i2++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet m0 = ls6.d0(i24Var.x.R.d1).m0(ls6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (m0 != null) {
                            arrayList = m0.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        i24Var.n.add(new h14(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 21:
                d48 d48Var = (d48) obj2;
                Integer num2 = (Integer) obj;
                nf4 nf4Var = ((kf4) obj3).e;
                if (!nf4Var.getUserConfig().p()) {
                    nf4Var.showDialog(new xk8((e) nf4Var, 35, true));
                    return;
                }
                int intValue = num2.intValue();
                nf4Var.F = intValue;
                d48Var.a(intValue, true);
                cf4 cf4Var = nf4Var.J;
                if (cf4Var != null) {
                    if (!nf4Var.getUserConfig().p()) {
                        i = -1;
                    } else {
                        i = nf4Var.F;
                    }
                    cf4Var.d(i, true);
                }
                nf4Var.k0(true);
                return;
            case 22:
                qn4 qn4Var = (qn4) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                e eVar2 = (e) obj;
                if (qn4Var.V1 == null && !(qn4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    v21 I = d31.b0(eVar2).I(2131623990, hl.S2(ob6.a0(null, null, 2131750638, qn4Var.a2)), ob6.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    return;
                }
                d31 b0 = d31.b0(eVar2);
                SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, 2131750586, qn4Var.a2));
                if (arrayList4.size() <= 0) {
                    G = ob6.G(qn4Var.c2.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = ob6.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                v21 I2 = b0.I(2131624026, S2, G);
                I2.j = 5000;
                I2.j();
                return;
            case 23:
                yx4 yx4Var = (yx4) obj3;
                pcc pccVar = (pcc) obj2;
                Boolean bool3 = (Boolean) obj;
                if (pccVar != null) {
                    pccVar.a(bool3);
                }
                if (bool3.booleanValue()) {
                    yx4Var.O0 = true;
                }
                yx4Var.dismiss();
                return;
            case 24:
                da7 da7Var = (da7) obj2;
                if (((Object[]) obj)[1] == ((axa) obj3)) {
                    da7Var.run();
                    return;
                }
                return;
            case 25:
                c35 c35Var = (c35) obj3;
                try {
                    ((pcc) obj2).a((String) obj);
                    c35Var.close();
                    return;
                } catch (Throwable th) {
                    c35Var.close();
                    throw th;
                }
            case 26:
                ((c35) obj3).close();
                ((btc) obj2).a((String) obj);
                return;
            case 27:
                ((c) obj3).q.put((TL_wallet.walletTransaction) obj, (pcc) obj2);
                return;
            case 28:
                z25 z25Var = (z25) obj3;
                ctc ctcVar = (ctc) obj2;
                String str4 = (String) obj;
                if (str4 != null) {
                    z25Var.close();
                    c.m("prepare disable backup, failed to save secret phrase to local storage: ".concat(str4));
                    ctcVar.a(null, str4);
                    return;
                }
                c.P("prepare disable backup: done!");
                ctcVar.a(z25Var, null);
                return;
            default:
                c cVar = (c) obj3;
                dtc dtcVar = (dtc) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    c.m("disableBackupWithoutUpdatingPhrase: ".concat(str5));
                    dtcVar.a(str5);
                    return;
                }
                c.P("sending disableBackup to server");
                i18.a(cVar.a, new sb((byte) 6), null, null, null, new qo0(cVar, dtcVar, (byte) 3), true, true, new c34((rj4) null, (g25) null));
                return;
        }
    }

    public rx1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;
public final class pz1 implements p8c {
    public final byte a;
    public final Object b;
    public final Object c;

    public pz1(c cVar, v05 v05Var, poc pocVar) {
        this.a = (byte) 27;
        this.b = v05Var;
        this.c = pocVar;
    }

    @Override
    public final void a(Object obj) {
        final boolean z;
        String str;
        String a;
        float f;
        boolean z2;
        ArrayList<TLRPC.Document> arrayList;
        int i;
        String G;
        byte b = this.a;
        TLRPC.User user = null;
        boolean z3 = false;
        int i2 = 0;
        final boolean z4 = true;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x02 x02Var = (x02) obj3;
                q02 q02Var = (q02) obj2;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i3 = x02Var.G3;
                tL_messages_toggleBotInAttachMenu.bot = na7.q1(i3).m1(q02Var.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new pl(x02Var, q02Var, (byte) 19), 66);
                return;
            case 1:
                x02 x02Var2 = (x02) obj3;
                ((mu1) obj2).y5 = (u47) obj;
                boolean p1 = x02Var2.p1(true, 0, 0, x02Var2.K2, x02Var2.a1());
                bx1 bx1Var = x02Var2.b2;
                if (bx1Var != null) {
                    bx1Var.f(!p1);
                    x02Var2.b2 = null;
                    return;
                }
                return;
            case 2:
                ((s12) obj3).getWebViewContainer().D((String) obj2, (String) obj, false);
                return;
            case 3:
                h12 h12Var = (h12) obj3;
                na7 na7Var = (na7) obj2;
                Long l = (Long) obj;
                h12Var.j0 = false;
                if (l != null) {
                    user = na7Var.V1(l);
                }
                h12Var.i0 = user;
                if (user == null) {
                    z3 = true;
                }
                h12Var.k0 = z3;
                if (user != null) {
                    h12Var.S();
                    return;
                }
                return;
            case 4:
                nx8 nx8Var = (nx8) obj2;
                Long l2 = (Long) obj;
                ox8 f2 = ox8.f(y6c.t0);
                x02 x02Var3 = ((p62) obj3).b;
                long V0 = x02Var3.V0();
                int i4 = f2.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = na7.q1(i4).h1(V0);
                tL_messages_sendQuickReplyMessages.shortcut_id = nx8Var.a;
                ad7 Y = ad7.Y(i4);
                Y.a.c(new bm8(f2, Y, nx8Var, tL_messages_sendQuickReplyMessages, (byte) 6));
                x02Var3.dismiss();
                return;
            case 5:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                ye9 ye9Var = ((e72) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    ye9Var.g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str2;
                ye9Var.N1(pageblockmath2);
                return;
            case 6:
                p72 p72Var = (p72) obj3;
                ye7 ye7Var = p72Var.f;
                ye7Var.r(((TLRPC.WallPaper) obj2).settings.intensity, ((mqc) obj).a);
                ye7Var.s(ye7Var.f());
                View view = p72Var.b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                xm2 xm2Var = (xm2) obj3;
                xm2Var.getClass();
                xm2Var.Z(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                return;
            case 8:
                xm2 xm2Var2 = (xm2) obj3;
                xm2Var2.getClass();
                xm2Var2.Y((String) obj2, ((Boolean) obj).booleanValue());
                return;
            case 9:
                eo2 eo2Var = (eo2) obj3;
                eo2Var.F0((TLRPC.Chat) obj2, eo2Var.o1, ((Boolean) obj).booleanValue());
                return;
            case 10:
                xv2 xv2Var = (xv2) obj3;
                d dVar = (d) obj2;
                Long l3 = (Long) obj;
                Bundle bundle = new Bundle();
                if (l3.longValue() >= 0) {
                    bundle.putLong("user_id", l3.longValue());
                } else {
                    bundle.putLong("chat_id", -l3.longValue());
                }
                dVar.presentFragment(new ProfileActivity(bundle, null));
                xv2Var.d();
                return;
            case 11:
                tv2 tv2Var = (tv2) obj3;
                Boolean bool2 = (Boolean) obj;
                ((p8c) obj2).a(bool2);
                if (bool2.booleanValue()) {
                    tv2Var.a.d();
                    return;
                }
                return;
            case 12:
                cj3 cj3Var = (cj3) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    cj3Var.showDialog(new tl7(activity, !rqe.a(), new jg3(activity, (byte) 0)));
                    return;
                }
                return;
            case 13:
                final jn3 jn3Var = (jn3) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                ln3 ln3Var = jn3Var.b;
                if (!ln3Var.h && !ln3Var.g) {
                    int i5 = ln3Var.v;
                    int[] iArr = ln3.F;
                    if (i5 >= 0 && i5 < 4 && num.intValue() >= iArr[ln3Var.v]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (num.intValue() < iArr[0] || num.intValue() - ln3Var.y >= 100 || num.intValue() - ln3Var.z < 100) {
                        z4 = false;
                    }
                    ln3Var.y = num.intValue();
                    if (!z && !z4) {
                        ln3Var.r = false;
                        return;
                    } else {
                        DictationLid.h(0, new um3() {
                            @Override
                            public final void a(float[] fArr, long j, int i6) {
                                String str3;
                                xl3 X;
                                ln3 ln3Var2 = jn3.this.b;
                                ln3Var2.r = false;
                                if (fArr != null) {
                                    ln3Var2.z = i6;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < 4) {
                                            if (ln3.F[i7] > i6) {
                                                break;
                                            }
                                            i7++;
                                        } else {
                                            i7 = 4;
                                            break;
                                        }
                                    }
                                    ln3Var2.v = i7;
                                    StringBuilder sb = new StringBuilder("tinyasr: tinylid ");
                                    if (z4 && !z) {
                                        str3 = "after a pause";
                                    } else {
                                        str3 = "at a step";
                                    }
                                    ir2.x(sb, str3, "Dictation");
                                    if (!ln3Var2.h && !ln3Var2.g) {
                                        vm3 k = DictationLid.k(DictationLid.g(i6), fArr);
                                        Log.d("Dictation", "tinyasr: tinylid " + i6 + " ms speech in " + j + " ms: " + k + " (route " + ln3Var2.l + ")");
                                        if (k != null) {
                                            String str4 = k.a;
                                            if (k.c && (X = DictationAsr.X(str4, ln3Var2.l, false)) != null) {
                                                vl3 vl3Var = (vl3) X.b;
                                                xl3 xl3Var = ln3Var2.l;
                                                if (vl3Var == ((vl3) xl3Var.b) && ((String) X.c).equals((String) xl3Var.c)) {
                                                    ln3Var2.s = true;
                                                    DictationLid.i(str4);
                                                    ln3Var2.k(str4);
                                                } else if (!ln3Var2.s || k.b >= 0.8f) {
                                                    ln3Var2.s = true;
                                                    DictationLid.i(str4);
                                                    ln3Var2.k(str4);
                                                    Log.d("Dictation", "tinyasr: switching to " + X);
                                                    ln3Var2.i(X);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }, ln3Var.a(), bArr);
                        return;
                    }
                }
                ln3Var.r = false;
                return;
            case 14:
                cw3 cw3Var = (cw3) obj3;
                fsc fscVar = (fsc) obj;
                zv3 zv3Var = ((zv3[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                if (fscVar == null) {
                    str = "🌤";
                } else {
                    str = fscVar.c;
                }
                sb.append(str);
                sb.append(" ");
                if (fscVar == null) {
                    if (gsc.a()) {
                        a = "24°C";
                    } else {
                        a = "72°F";
                    }
                } else {
                    a = fscVar.a();
                }
                sb.append(a);
                CharSequence m = vu3.m(sb.toString(), cw3Var.b.getFontMetricsInt(), false, null, 0);
                TextPaint textPaint = zv3Var.o.b;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m, textPaint, gl.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                zv3Var.k = staticLayout;
                float f3 = 0.0f;
                if (staticLayout.getLineCount() > 0) {
                    f = zv3Var.k.getLineWidth(0);
                } else {
                    f = 0.0f;
                }
                zv3Var.l = f;
                if (zv3Var.k.getLineCount() > 0) {
                    f3 = zv3Var.k.getLineLeft(0);
                }
                zv3Var.m = f3;
                zv3Var.b = gl.N(17.6f) + zv3Var.l;
                zv3Var.c = gl.N(36.0f);
                cw3Var.invalidate();
                cw3Var.requestLayout();
                return;
            case 15:
                ox3 ox3Var = (ox3) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    gl.d3(new nx3(ox3Var, (byte) 1));
                    return;
                }
                return;
            case 16:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                eu3 eu3Var = (eu3) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                eu3Var.run();
                return;
            case 17:
                s04 s04Var = (s04) obj3;
                t04 t04Var = s04Var.a;
                t14 t14Var = t04Var.G;
                hq6 d0 = hq6.d0(t14Var.d1);
                String[] strArr = t14Var.X0;
                String str3 = t04Var.w;
                lt2 lt2Var = new lt2(s04Var, (String) obj2, (Runnable) obj, (byte) 9);
                if (!gba.E && !y6c.h(t14Var.d1).p()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                d0.X(strArr, str3, false, lt2Var, z2, false, true, false, 25);
                return;
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                t04 t04Var2 = ((s04) obj3).a;
                if (ConnectionsManager.getInstance(t04Var2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    t04Var2.F(runnable, arrayList2, false);
                    return;
                }
            case 19:
                n14 n14Var = (n14) obj3;
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
                        TLRPC.TL_messages_stickerSet m0 = hq6.d0(n14Var.x.R.d1).m0(hq6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (m0 != null) {
                            arrayList = m0.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        n14Var.n.add(new m04(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 20:
                w08 w08Var = (w08) obj2;
                Integer num2 = (Integer) obj;
                pd4 pd4Var = ((md4) obj3).e;
                if (!pd4Var.getUserConfig().p()) {
                    pd4Var.showDialog(new jh8((d) pd4Var, 35, true));
                    return;
                }
                int intValue = num2.intValue();
                pd4Var.F = intValue;
                w08Var.a(intValue, true);
                ed4 ed4Var = pd4Var.J;
                if (ed4Var != null) {
                    if (!pd4Var.getUserConfig().p()) {
                        i = -1;
                    } else {
                        i = pd4Var.F;
                    }
                    ed4Var.d(i, true);
                }
                pd4Var.k0(true);
                return;
            case 21:
                ll4 ll4Var = (ll4) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                d dVar2 = (d) obj;
                if (ll4Var.V1 == null && !(ll4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    m21 I = u21.b0(dVar2).I(2131623990, gl.T2(k96.a0(null, null, 2131750661, ll4Var.a2)), k96.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    return;
                }
                u21 b0 = u21.b0(dVar2);
                SpannableStringBuilder T2 = gl.T2(k96.a0(null, null, 2131750609, ll4Var.a2));
                if (arrayList4.size() <= 0) {
                    G = k96.G(ll4Var.c2.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = k96.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                m21 I2 = b0.I(2131624026, T2, G);
                I2.j = 5000;
                I2.j();
                return;
            case 22:
                tv4 tv4Var = (tv4) obj3;
                p8c p8cVar = (p8c) obj2;
                Boolean bool3 = (Boolean) obj;
                if (p8cVar != null) {
                    p8cVar.a(bool3);
                }
                if (bool3.booleanValue()) {
                    tv4Var.O0 = true;
                }
                tv4Var.dismiss();
                return;
            case 23:
                o77 o77Var = (o77) obj2;
                if (((Object[]) obj)[1] == ((xsa) obj3)) {
                    o77Var.run();
                    return;
                }
                return;
            case 24:
                y05 y05Var = (y05) obj3;
                try {
                    ((p8c) obj2).a((String) obj);
                    y05Var.close();
                    return;
                } catch (Throwable th) {
                    y05Var.close();
                    throw th;
                }
            case 25:
                ((y05) obj3).close();
                ((ooc) obj2).a((String) obj);
                return;
            case 26:
                ((c) obj3).q.put((TL_wallet.walletTransaction) obj, (p8c) obj2);
                return;
            case 27:
                v05 v05Var = (v05) obj3;
                poc pocVar = (poc) obj2;
                String str4 = (String) obj;
                if (str4 != null) {
                    v05Var.close();
                    c.m("prepare disable backup, failed to save secret phrase to local storage: ".concat(str4));
                    pocVar.a(null, str4);
                    return;
                }
                c.O("prepare disable backup: done!");
                pocVar.a(v05Var, null);
                return;
            case 28:
                c cVar = (c) obj3;
                qoc qocVar = (qoc) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    c.m("disableBackupWithoutUpdatingPhrase: ".concat(str5));
                    qocVar.a(str5);
                    return;
                }
                c.O("sending disableBackup to server");
                cy7.a(cVar.a, new pb((byte) 6), null, null, null, new qo0(cVar, qocVar, (byte) 3), true, true, new h24((iu4) null, (c05) null));
                return;
            default:
                gl.d3(new jf4((r25) obj3, (hj3) obj2, (String) obj, (byte) 9));
                return;
        }
    }

    public pz1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

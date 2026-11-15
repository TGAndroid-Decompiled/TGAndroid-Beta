package ji;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.he;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.zg;
public final class a implements Runnable {
    public final int f17421a;
    public final e f17422b;

    public a(e eVar, int i7) {
        this.f17421a = i7;
        this.f17422b = eVar;
    }

    @Override
    public final void run() {
        e eVar;
        androidx.activity.n nVar;
        int i7;
        int i10 = this.f17421a;
        e eVar2 = this.f17422b;
        switch (i10) {
            case 0:
                if (!eVar2.R && eVar2.W <= 0.0f && (eVar = ((m) eVar2.f17453a.d).K) != null) {
                    g0.E2(eVar);
                    return;
                }
                return;
            default:
                if (eVar2.f17477f0 == 0) {
                    eVar2.f17477f0 = -1;
                    eVar2.invalidate();
                    try {
                        eVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    m mVar = (m) eVar2.f17453a.d;
                    String trim = mVar.f17586n.trim();
                    if (!trim.isEmpty() && mVar.f17573c == 4) {
                        gf gfVar = mVar.f17571b;
                        f fVar = new f(mVar, 0);
                        e eVar3 = mVar.K;
                        ChatActivityEnterView chatActivityEnterView = gfVar.f34928a;
                        e6 e6Var = chatActivityEnterView.E4;
                        an anVar = chatActivityEnterView.f32319x3;
                        he heVar = chatActivityEnterView.K0;
                        if (heVar != null && heVar.getWidth() > 0) {
                            bg0 bg0Var = chatActivityEnterView.M0;
                            if (bg0Var != null) {
                                bg0Var.h(false);
                            }
                            g0.r(chatActivityEnterView.X5);
                            bf bfVar = new bf(chatActivityEnterView, chatActivityEnterView.getContext(), e6Var, eVar3);
                            chatActivityEnterView.M0 = bfVar;
                            bfVar.setOnDismissListener(new wc(chatActivityEnterView, 0));
                            if (eVar3 != null) {
                                nVar = new androidx.activity.n(eVar3);
                            } else {
                                nVar = null;
                            }
                            boolean z10 = true;
                            boolean[] zArr = new boolean[1];
                            if (nVar != null) {
                                bg0 bg0Var2 = chatActivityEnterView.M0;
                                ?? obj = new Object();
                                obj.f990c = zArr;
                                obj.d = nVar;
                                obj.f989b = new float[4];
                                bg0Var2.m0 = obj;
                                bg0Var2.f45730n0 = nVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = np.s1(chatActivityEnterView.R).z1(chatActivityEnterView.f32327y3);
                            tL_message.from_id = np.s1(chatActivityEnterView.R).z1(m10.i(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            gj.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(si.b0(chatActivityEnterView.R).W(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            gj gjVar = chatActivityEnterView.B3;
                            if (gjVar != null && !gjVar.f23836p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                gj gjVar2 = chatActivityEnterView.C3;
                                if (gjVar2 != null) {
                                    tL_messageReplyHeader.flags = 2 | tL_messageReplyHeader.flags;
                                    tL_messageReplyHeader.reply_to_top_id = gjVar2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.B3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            gj gjVar3 = new gj(chatActivityEnterView.R, tL_message, false, false);
                            gj gjVar4 = chatActivityEnterView.B3;
                            if (gjVar4 != null && !gjVar4.f23836p) {
                                gjVar3.C = gjVar4;
                            }
                            gjVar3.B0 = true;
                            gjVar3.W2 = Boolean.TRUE;
                            gjVar3.D = 0;
                            gjVar3.n0(null);
                            gjVar3.f23865w1 = true;
                            chatActivityEnterView.M0.r(k5.j(gjVar3));
                            yc ycVar = new yc(chatActivityEnterView, zArr, fVar, trim);
                            chatActivityEnterView.M0.s(heVar, true, new e0(ycVar, 6));
                            if (chatActivityEnterView.f32327y3 >= 0) {
                                chatActivityEnterView.M0.c(anVar);
                                chatActivityEnterView.M0.p(chatActivityEnterView.f32251n6);
                            }
                            m60 F = m60.F(chatActivityEnterView, e6Var, heVar);
                            if (anVar == null || !q10.B(anVar.j())) {
                                z10 = false;
                            }
                            if (anVar != null && anVar.S6()) {
                                if (z10) {
                                    i7 = 2131745514;
                                } else {
                                    i7 = 2131745859;
                                }
                                F.c(2131232078, hd.M0(i7, null), new zg(26, chatActivityEnterView, ycVar), false);
                            }
                            if (!z10 && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                F.c(2131231508, hd.M0(2131745583, null), new dg(ycVar, 18), false);
                            }
                            F.Y();
                            chatActivityEnterView.M0.q(F);
                            chatActivityEnterView.M0.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

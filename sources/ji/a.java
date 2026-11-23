package ji;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.n0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ah;
import org.telegram.ui.bn;
import org.telegram.ui.dg0;
public final class a implements Runnable {
    public final int f17900a;
    public final e f17901b;

    public a(e eVar, int i7) {
        this.f17900a = i7;
        this.f17901b = eVar;
    }

    @Override
    public final void run() {
        e eVar;
        androidx.activity.n nVar;
        int i7;
        int i10 = this.f17900a;
        e eVar2 = this.f17901b;
        switch (i10) {
            case 0:
                if (!eVar2.R && eVar2.W <= 0.0f && (eVar = ((n) eVar2.f17929a.d).K) != null) {
                    g0.E2(eVar);
                    return;
                }
                return;
            default:
                if (eVar2.f17953f0 == 0) {
                    eVar2.f17953f0 = -1;
                    eVar2.invalidate();
                    try {
                        eVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    n nVar2 = (n) eVar2.f17929a.d;
                    String trim = nVar2.f18075n.trim();
                    if (!trim.isEmpty() && nVar2.f18062c == 4) {
                        qf qfVar = nVar2.f18060b;
                        i iVar = new i(nVar2, 3);
                        e eVar3 = nVar2.K;
                        ChatActivityEnterView chatActivityEnterView = qfVar.f38823a;
                        i6 i6Var = chatActivityEnterView.M4;
                        bn bnVar = chatActivityEnterView.F3;
                        se seVar = chatActivityEnterView.K0;
                        if (seVar != null && seVar.getWidth() > 0) {
                            dg0 dg0Var = chatActivityEnterView.M0;
                            if (dg0Var != null) {
                                dg0Var.h(false);
                            }
                            g0.r(chatActivityEnterView.f32684f6);
                            mf mfVar = new mf(chatActivityEnterView, chatActivityEnterView.getContext(), i6Var, eVar3);
                            chatActivityEnterView.M0 = mfVar;
                            mfVar.setOnDismissListener(new gd(chatActivityEnterView, 0));
                            if (eVar3 != null) {
                                nVar = new androidx.activity.n(eVar3);
                            } else {
                                nVar = null;
                            }
                            boolean z10 = true;
                            boolean[] zArr = new boolean[1];
                            if (nVar != null) {
                                dg0 dg0Var2 = chatActivityEnterView.M0;
                                ?? obj = new Object();
                                obj.f989c = zArr;
                                obj.d = nVar;
                                obj.f988b = new float[4];
                                dg0Var2.m0 = obj;
                                dg0Var2.f47109n0 = nVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = mp.u1(chatActivityEnterView.R).B1(chatActivityEnterView.G3);
                            tL_message.from_id = mp.u1(chatActivityEnterView.R).B1(i10.i(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            fj.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(ri.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            fj fjVar = chatActivityEnterView.J3;
                            if (fjVar != null && !fjVar.f24092p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                fj fjVar2 = chatActivityEnterView.K3;
                                if (fjVar2 != null) {
                                    tL_messageReplyHeader.flags = 2 | tL_messageReplyHeader.flags;
                                    tL_messageReplyHeader.reply_to_top_id = fjVar2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.J3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            fj fjVar3 = new fj(chatActivityEnterView.R, tL_message, false, false);
                            fj fjVar4 = chatActivityEnterView.J3;
                            if (fjVar4 != null && !fjVar4.f24092p) {
                                fjVar3.C = fjVar4;
                            }
                            fjVar3.B0 = true;
                            fjVar3.W2 = Boolean.TRUE;
                            fjVar3.D = 0;
                            fjVar3.n0(null);
                            fjVar3.f24121w1 = true;
                            chatActivityEnterView.M0.r(f3.i(fjVar3));
                            hd hdVar = new hd(chatActivityEnterView, zArr, iVar, trim);
                            chatActivityEnterView.M0.s(seVar, true, new n0(hdVar, 6));
                            if (chatActivityEnterView.G3 >= 0) {
                                chatActivityEnterView.M0.c(bnVar);
                                chatActivityEnterView.M0.p(chatActivityEnterView.P6);
                            }
                            x60 G = x60.G(chatActivityEnterView, i6Var, seVar);
                            if (bnVar == null || !n10.C(bnVar.j())) {
                                z10 = false;
                            }
                            if (bnVar != null && bnVar.S6()) {
                                if (z10) {
                                    i7 = 2131745318;
                                } else {
                                    i7 = 2131745663;
                                }
                                G.c(2131232082, org.telegram.messenger.gd.N0(i7, null), new ah(26, chatActivityEnterView, hdVar), false);
                            }
                            if (!z10 && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.c(2131231512, org.telegram.messenger.gd.N0(2131745387, null), new ng(hdVar, 18), false);
                            }
                            G.Z();
                            chatActivityEnterView.M0.q(G);
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

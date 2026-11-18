package ji;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.n0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.ci;
import org.telegram.ui.fg0;
public final class a implements Runnable {
    public final int f17804a;
    public final e f17805b;

    public a(e eVar, int i7) {
        this.f17804a = i7;
        this.f17805b = eVar;
    }

    @Override
    public final void run() {
        e eVar;
        androidx.activity.n nVar;
        int i7;
        int i10 = this.f17804a;
        e eVar2 = this.f17805b;
        switch (i10) {
            case 0:
                if (!eVar2.R && eVar2.W <= 0.0f && (eVar = ((m) eVar2.f17835a.d).K) != null) {
                    g0.E2(eVar);
                    return;
                }
                return;
            default:
                if (eVar2.f17859f0 == 0) {
                    eVar2.f17859f0 = -1;
                    eVar2.invalidate();
                    try {
                        eVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    m mVar = (m) eVar2.f17835a.d;
                    String trim = mVar.f17976n.trim();
                    if (!trim.isEmpty() && mVar.f17963c == 4) {
                        pf pfVar = mVar.f17961b;
                        f fVar = new f(mVar, 0);
                        e eVar3 = mVar.K;
                        ChatActivityEnterView chatActivityEnterView = pfVar.f38384a;
                        i6 i6Var = chatActivityEnterView.K4;
                        bn bnVar = chatActivityEnterView.D3;
                        re reVar = chatActivityEnterView.K0;
                        if (reVar != null && reVar.getWidth() > 0) {
                            fg0 fg0Var = chatActivityEnterView.M0;
                            if (fg0Var != null) {
                                fg0Var.h(false);
                            }
                            g0.r(chatActivityEnterView.f32571d6);
                            lf lfVar = new lf(chatActivityEnterView, chatActivityEnterView.getContext(), i6Var, eVar3);
                            chatActivityEnterView.M0 = lfVar;
                            lfVar.setOnDismissListener(new gd(chatActivityEnterView, 0));
                            if (eVar3 != null) {
                                nVar = new androidx.activity.n(eVar3);
                            } else {
                                nVar = null;
                            }
                            boolean z10 = true;
                            boolean[] zArr = new boolean[1];
                            if (nVar != null) {
                                fg0 fg0Var2 = chatActivityEnterView.M0;
                                ?? obj = new Object();
                                obj.f989c = zArr;
                                obj.d = nVar;
                                obj.f988b = new float[4];
                                fg0Var2.m0 = obj;
                                fg0Var2.f47636n0 = nVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = mp.u1(chatActivityEnterView.R).B1(chatActivityEnterView.E3);
                            tL_message.from_id = mp.u1(chatActivityEnterView.R).B1(j10.i(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            fj.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(ri.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            fj fjVar = chatActivityEnterView.H3;
                            if (fjVar != null && !fjVar.f23984p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                fj fjVar2 = chatActivityEnterView.I3;
                                if (fjVar2 != null) {
                                    tL_messageReplyHeader.flags = 2 | tL_messageReplyHeader.flags;
                                    tL_messageReplyHeader.reply_to_top_id = fjVar2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.H3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            fj fjVar3 = new fj(chatActivityEnterView.R, tL_message, false, false);
                            fj fjVar4 = chatActivityEnterView.H3;
                            if (fjVar4 != null && !fjVar4.f23984p) {
                                fjVar3.C = fjVar4;
                            }
                            fjVar3.B0 = true;
                            fjVar3.W2 = Boolean.TRUE;
                            fjVar3.D = 0;
                            fjVar3.n0(null);
                            fjVar3.f24013w1 = true;
                            chatActivityEnterView.M0.r(f3.i(fjVar3));
                            hd hdVar = new hd(chatActivityEnterView, zArr, fVar, trim);
                            chatActivityEnterView.M0.s(reVar, true, new n0(hdVar, 6));
                            if (chatActivityEnterView.E3 >= 0) {
                                chatActivityEnterView.M0.c(bnVar);
                                chatActivityEnterView.M0.p(chatActivityEnterView.N6);
                            }
                            y60 G = y60.G(chatActivityEnterView, i6Var, reVar);
                            if (bnVar == null || !o10.C(bnVar.j())) {
                                z10 = false;
                            }
                            if (bnVar != null && bnVar.S6()) {
                                if (z10) {
                                    i7 = 2131745319;
                                } else {
                                    i7 = 2131745664;
                                }
                                G.c(2131232079, org.telegram.messenger.gd.M0(i7, null), new ci(22, chatActivityEnterView, hdVar), false);
                            }
                            if (!z10 && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.c(2131231509, org.telegram.messenger.gd.M0(2131745388, null), new lg(hdVar, 18), false);
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

package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class g6a extends q59 {
    public final ylb c;
    public final List d;
    public final oc7 e;
    public final int f;
    public final TLRPC.Peer h;

    public g6a(ylb ylbVar, List list, oc7 oc7Var, int i, TLRPC.Peer peer) {
        this.c = ylbVar;
        this.d = list;
        this.e = oc7Var;
        this.f = i;
        this.h = peer;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        long j;
        String str;
        k6a k6aVar = (k6a) u69Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j2 = peer.channel_id;
        if (j2 != 0) {
            j = -j2;
        } else {
            j = 0;
        }
        if (j == 0) {
            long j3 = peer.user_id;
            if (j3 != 0) {
                j = j3;
            }
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TLRPC.Peer peer2 = this.h;
        boolean z = true;
        oc7 oc7Var = this.e;
        if (i2 < 0) {
            TLRPC.Chat L0 = oc7Var.L0(Long.valueOf(-j));
            if (L0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = L0.title;
                    TextView textView = k6aVar.b;
                    sb.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f - gm.L(100.0f), TextUtils.TruncateAt.END));
                    sb.append(" d");
                    SpannableString spannableString = new SpannableString(sb.toString());
                    pn2 pn2Var = new pn2(2131232251, 0);
                    pn2Var.n = 1;
                    pn2Var.c(gm.L(14.0f));
                    pn2Var.a(cmb.B6);
                    spannableString.setSpan(pn2Var, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    k6aVar.b.setEllipsize(TextUtils.TruncateAt.END);
                    k6aVar.b.setText(L0.title);
                }
                TextView textView2 = k6aVar.c;
                if (sd2.T(L0) && !L0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(jb6.G(L0.participants_count, str, new Object[0]));
                k6aVar.a.setAvatar(L0);
            }
            dka dkaVar = k6aVar.a;
            if (peer2 == null ? i != 0 : peer2.channel_id != peer.channel_id) {
                z = false;
            }
            dkaVar.a(z, false);
            return;
        }
        TLRPC.User W1 = oc7Var.W1(Long.valueOf(j));
        if (W1 != null) {
            k6aVar.b.setText(m9c.r(W1));
            k6aVar.c.setText(jb6.M0(2131743033, null));
            k6aVar.a.setAvatar(W1);
        }
        dka dkaVar2 = k6aVar.a;
        if (peer2 == null ? i != 0 : peer2.user_id != peer.user_id) {
            z = false;
        }
        dkaVar2.a(z, false);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new k6a(viewGroup.getContext(), this.c));
    }
}

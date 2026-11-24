package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class e4a extends n39 {
    public final wjb c;
    public final List d;
    public final na7 e;
    public final int f;
    public final TLRPC.Peer h;

    public e4a(wjb wjbVar, List list, na7 na7Var, int i, TLRPC.Peer peer) {
        this.c = wjbVar;
        this.d = list;
        this.e = na7Var;
        this.f = i;
        this.h = peer;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        long j;
        String str;
        i4a i4aVar = (i4a) s49Var.a;
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
        na7 na7Var = this.e;
        if (i2 < 0) {
            TLRPC.Chat K0 = na7Var.K0(Long.valueOf(-j));
            if (K0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = K0.title;
                    TextView textView = i4aVar.b;
                    sb.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f - gl.L(100.0f), TextUtils.TruncateAt.END));
                    sb.append(" d");
                    SpannableString spannableString = new SpannableString(sb.toString());
                    cm2 cm2Var = new cm2(2131232250, 0);
                    cm2Var.n = 1;
                    cm2Var.c(gl.L(14.0f));
                    cm2Var.a(bkb.B6);
                    spannableString.setSpan(cm2Var, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    i4aVar.b.setEllipsize(TextUtils.TruncateAt.END);
                    i4aVar.b.setText(K0.title);
                }
                TextView textView2 = i4aVar.c;
                if (hc2.T(K0) && !K0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(k96.G(K0.participants_count, str, new Object[0]));
                i4aVar.a.setAvatar(K0);
            }
            bia biaVar = i4aVar.a;
            if (peer2 == null ? i != 0 : peer2.channel_id != peer.channel_id) {
                z = false;
            }
            biaVar.a(z, false);
            return;
        }
        TLRPC.User V1 = na7Var.V1(Long.valueOf(j));
        if (V1 != null) {
            i4aVar.b.setText(l7c.q(V1));
            i4aVar.c.setText(k96.M0(2131743107, null));
            i4aVar.a.setAvatar(V1);
        }
        bia biaVar2 = i4aVar.a;
        if (peer2 == null ? i != 0 : peer2.user_id != peer.user_id) {
            z = false;
        }
        biaVar2.a(z, false);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new i4a(viewGroup.getContext(), this.c));
    }
}

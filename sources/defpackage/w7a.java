package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class w7a extends c79 {
    public final vnb c;
    public final List d;
    public final uc7 e;
    public final int f;
    public final TLRPC.Peer h;

    public w7a(vnb vnbVar, List list, uc7 uc7Var, int i, TLRPC.Peer peer) {
        this.c = vnbVar;
        this.d = list;
        this.e = uc7Var;
        this.f = i;
        this.h = peer;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        long j;
        String str;
        a8a a8aVar = (a8a) f89Var.a;
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
        uc7 uc7Var = this.e;
        if (i2 < 0) {
            TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(-j));
            if (M0 != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = M0.title;
                    TextView textView = a8aVar.b;
                    sb.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f - hl.L(100.0f), TextUtils.TruncateAt.END));
                    sb.append(" d");
                    SpannableString spannableString = new SpannableString(sb.toString());
                    wm2 wm2Var = new wm2(2131232250, 0);
                    wm2Var.n = 1;
                    wm2Var.c(hl.L(14.0f));
                    wm2Var.a(aob.C6);
                    spannableString.setSpan(wm2Var, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    a8aVar.b.setEllipsize(TextUtils.TruncateAt.END);
                    a8aVar.b.setText(M0.title);
                }
                TextView textView2 = a8aVar.c;
                if (xc2.T(M0) && !M0.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(ob6.G(M0.participants_count, str, new Object[0]));
                a8aVar.a.setAvatar(M0);
            }
            wla wlaVar = a8aVar.a;
            if (peer2 == null ? i != 0 : peer2.channel_id != peer.channel_id) {
                z = false;
            }
            wlaVar.a(z, false);
            return;
        }
        TLRPC.User X1 = uc7Var.X1(Long.valueOf(j));
        if (X1 != null) {
            a8aVar.b.setText(lbc.r(X1));
            a8aVar.c.setText(ob6.M0(2131743001, null));
            a8aVar.a.setAvatar(X1);
        }
        wla wlaVar2 = a8aVar.a;
        if (peer2 == null ? i != 0 : peer2.user_id != peer.user_id) {
            z = false;
        }
        wlaVar2.a(z, false);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        return new f89(new a8a(viewGroup.getContext(), this.c));
    }
}

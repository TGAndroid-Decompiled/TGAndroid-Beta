package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xzb extends la {
    public final zzb d;

    public xzb(zzb zzbVar) {
        this.d = zzbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 1 || i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.d.size();
    }

    @Override
    public final int d(int i) {
        return ((yzb) this.d.d.get(i)).a;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        long j;
        String M0;
        zzb zzbVar = this.d;
        ArrayList arrayList = zzbVar.d;
        if (((yzb) arrayList.get(i)).a == 2) {
            xxb xxbVar = (xxb) f89Var.a;
            long j2 = zzbVar.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((yzb) arrayList.get(i)).c;
            de0 de0Var = xxbVar.b;
            boolean z = false;
            ro4.q(de0Var, tL_forumTopic, false, false, null);
            if (de0Var != null && de0Var.getImageReceiver() != null && (de0Var.getImageReceiver().t() instanceof qo4)) {
                ((qo4) de0Var.getImageReceiver().t()).a(aob.w0(null, aob.c9, false));
            }
            xxbVar.c.setText(tL_forumTopic.title);
            TextView textView = xxbVar.d;
            uc7 s1 = uc7.s1(yac.t0);
            if (s1.getMessagesController().p2(j2, tL_forumTopic.id, null)) {
                int i2 = s1.W3.getInt("notifyuntil_" + ip7.p(j2, j, false), 0);
                if (i2 >= s1.getConnectionsManager().getCurrentTime()) {
                    M0 = ob6.a0("NotificationsMutedForHint", null, 2131747627, ob6.c0(i2));
                } else {
                    M0 = ob6.M0(2131747628, null);
                }
            } else {
                M0 = ob6.M0(2131747583, null);
            }
            textView.setText(M0);
            if (i == arrayList.size() - 1 || ((yzb) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            xxbVar.a = z;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        skb skbVar;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        skb skbVar2 = new skb(viewGroup.getContext());
                        skbVar2.k(ob6.M0(2131747642, null), false);
                        skbVar2.g(-1, aob.p7);
                        yob.h(aob.d6, null, skbVar2);
                        skbVar = skbVar2;
                    }
                    return qu6.h(view, view, -1, -2);
                }
                skbVar = new rca(viewGroup.getContext(), (uh9) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                de0 de0Var = new de0(context);
                frameLayout.b = de0Var;
                frameLayout.addView(de0Var, tre.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.c = textView;
                qd4.w(textView, aob.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, tre.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                yob.X(textView2, aob.y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, tre.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                yob.h(aob.d6, null, frameLayout);
                skbVar = frameLayout;
            }
        } else {
            skb skbVar3 = new skb(viewGroup.getContext());
            skbVar3.o(2131232104, ob6.M0(2131747650, null), true);
            skbVar3.g(aob.v6, aob.u6);
            yob.h(aob.d6, null, skbVar3);
            skbVar = skbVar3;
        }
        view = skbVar;
        return qu6.h(view, view, -1, -2);
    }
}

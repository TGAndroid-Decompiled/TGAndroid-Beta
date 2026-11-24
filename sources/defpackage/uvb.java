package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uvb extends ka {
    public final wvb d;

    public uvb(wvb wvbVar) {
        this.d = wvbVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
        return ((vvb) this.d.d.get(i)).a;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        long j;
        String M0;
        wvb wvbVar = this.d;
        ArrayList arrayList = wvbVar.d;
        if (((vvb) arrayList.get(i)).a == 2) {
            wtb wtbVar = (wtb) s49Var.a;
            long j2 = wvbVar.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((vvb) arrayList.get(i)).c;
            be0 be0Var = wtbVar.b;
            boolean z = false;
            mm4.q(be0Var, tL_forumTopic, false, false, null);
            if (be0Var != null && be0Var.getImageReceiver() != null && (be0Var.getImageReceiver().t() instanceof lm4)) {
                ((lm4) be0Var.getImageReceiver().t()).a(bkb.w0(null, bkb.b9, false));
            }
            wtbVar.c.setText(tL_forumTopic.title);
            TextView textView = wtbVar.d;
            na7 q1 = na7.q1(y6c.t0);
            if (q1.getMessagesController().n2(j2, tL_forumTopic.id, null)) {
                int i2 = q1.W3.getInt("notifyuntil_" + im7.p(j2, j, false), 0);
                if (i2 >= q1.getConnectionsManager().getCurrentTime()) {
                    M0 = k96.a0("NotificationsMutedForHint", null, 2131747707, k96.c0(i2));
                } else {
                    M0 = k96.M0(2131747708, null);
                }
            } else {
                M0 = k96.M0(2131747663, null);
            }
            textView.setText(M0);
            if (i == arrayList.size() - 1 || ((vvb) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            wtbVar.a = z;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wgb wgbVar;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        wgb wgbVar2 = new wgb(viewGroup.getContext());
                        wgbVar2.k(k96.M0(2131747722, null), false);
                        wgbVar2.g(-1, bkb.o7);
                        zkb.h(bkb.c6, null, wgbVar2);
                        wgbVar = wgbVar2;
                    }
                    return ls6.h(view, view, -1, -2);
                }
                wgbVar = new b9a(viewGroup.getContext(), (de9) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                be0 be0Var = new be0(context);
                frameLayout.b = be0Var;
                frameLayout.addView(be0Var, nme.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.c = textView;
                tb4.w(textView, bkb.F6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, nme.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                zkb.X(textView2, bkb.x6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, nme.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                zkb.h(bkb.c6, null, frameLayout);
                wgbVar = frameLayout;
            }
        } else {
            wgb wgbVar3 = new wgb(viewGroup.getContext());
            wgbVar3.o(2131232104, k96.M0(2131747730, null), true);
            wgbVar3.g(bkb.u6, bkb.t6);
            zkb.h(bkb.c6, null, wgbVar3);
            wgbVar = wgbVar3;
        }
        view = wgbVar;
        return ls6.h(view, view, -1, -2);
    }
}

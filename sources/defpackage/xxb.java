package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xxb extends ka {
    public final zxb d;

    public xxb(zxb zxbVar) {
        this.d = zxbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        return ((yxb) this.d.d.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        long j;
        String M0;
        zxb zxbVar = this.d;
        ArrayList arrayList = zxbVar.d;
        if (((yxb) arrayList.get(i)).a == 2) {
            xvb xvbVar = (xvb) u69Var.a;
            long j2 = zxbVar.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((yxb) arrayList.get(i)).c;
            bf0 bf0Var = xvbVar.b;
            boolean z = false;
            no4.q(bf0Var, tL_forumTopic, false, false, null);
            if (bf0Var != null && bf0Var.getImageReceiver() != null && (bf0Var.getImageReceiver().t() instanceof mo4)) {
                ((mo4) bf0Var.getImageReceiver().t()).a(cmb.w0(null, cmb.b9, false));
            }
            xvbVar.c.setText(tL_forumTopic.title);
            TextView textView = xvbVar.d;
            oc7 r1 = oc7.r1(z8c.t0);
            if (r1.getMessagesController().o2(j2, tL_forumTopic.id, null)) {
                int i2 = r1.W3.getInt("notifyuntil_" + lo7.p(j2, j, false), 0);
                if (i2 >= r1.getConnectionsManager().getCurrentTime()) {
                    M0 = jb6.a0("NotificationsMutedForHint", null, 2131747633, jb6.c0(i2));
                } else {
                    M0 = jb6.M0(2131747634, null);
                }
            } else {
                M0 = jb6.M0(2131747589, null);
            }
            textView.setText(M0);
            if (i == arrayList.size() - 1 || ((yxb) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            xvbVar.a = z;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        xib xibVar;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        xib xibVar2 = new xib(viewGroup.getContext());
                        xibVar2.k(jb6.M0(2131747648, null), false);
                        xibVar2.g(-1, cmb.o7);
                        anb.h(cmb.c6, null, xibVar2);
                        xibVar = xibVar2;
                    }
                    return kt6.h(view, view, -1, -2);
                }
                xibVar = new bba(viewGroup.getContext(), (hg9) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                bf0 bf0Var = new bf0(context);
                frameLayout.b = bf0Var;
                frameLayout.addView(bf0Var, qoe.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.c = textView;
                td4.x(textView, cmb.F6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, qoe.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                anb.X(textView2, cmb.x6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, qoe.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                anb.h(cmb.c6, null, frameLayout);
                xibVar = frameLayout;
            }
        } else {
            xib xibVar3 = new xib(viewGroup.getContext());
            xibVar3.o(2131232105, jb6.M0(2131747656, null), true);
            xibVar3.g(cmb.u6, cmb.t6);
            anb.h(cmb.c6, null, xibVar3);
            xibVar = xibVar3;
        }
        view = xibVar;
        return kt6.h(view, view, -1, -2);
    }
}

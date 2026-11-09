package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.qj0;
public final class w7 extends org.telegram.ui.ActionBar.v2 implements ls {
    public final int f13058i1;
    public ArrayList f13059j1;
    public final TLRPC.InputPeer f13060k1;
    public final qj0 l1;
    public final v7 f13061m1;
    public final TextView n1;

    public w7(Context context, final int i7, boolean z9, TLRPC.InputPeer inputPeer, final c20 c20Var, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        int i10;
        N();
        qp.s1(i7).P1().U();
        this.f13058i1 = i7;
        this.f13059j1 = qp.s1(i7).P1().T;
        this.f13060k1 = inputPeer;
        this.f28624b = new t7(this, context, g6Var);
        qj0 qj0Var = new qj0(context, g6Var);
        this.l1 = qj0Var;
        int i11 = this.f28654t0;
        qj0Var.setPadding(i11, 0, i11, 0);
        v7 v7Var = new v7(this);
        this.f13061m1 = v7Var;
        qj0Var.setAdapter(v7Var);
        qj0Var.setLayoutManager(new v4.b0());
        this.f28624b.addView(qj0Var, c8.ha.e(-1, -1, 119));
        qj0Var.setOnItemClickListener(new cj0() {
            @Override
            public final void c(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                w7 w7Var = w7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) w7Var.f13059j1.get(i12 - 2);
                int i13 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                c20 c20Var2 = c20Var;
                if (i13 == 0 && inputPeer2.chat_id == 0) {
                    c20Var2.a(inputPeer2);
                    w7Var.dismiss();
                    return;
                }
                Context context2 = w7Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context2, g6Var2);
                u1Var.r(200L);
                qp.s1(i7).P1().k(org.telegram.messenger.m5.n(inputPeer2), new bi.v3(u1Var, c20Var2, inputPeer2, 5), true, g6Var2);
                w7Var.dismiss();
            }
        });
        qj0Var.setOnScrollListener(new u7(this));
        TextView textView = new TextView(getContext());
        this.n1 = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.f28654t0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.f28654t0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, textView, g6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z9) {
            i10 = 2131744517;
        } else {
            i10 = 2131744518;
        }
        textView.setText(id.M0(i10, null));
        this.f28624b.addView(textView, c8.ha.c(-2.0f, -1));
    }

    @Override
    public final boolean G() {
        if (I0() > ((int) (org.telegram.messenger.g0.f22563q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float I0() {
        int R;
        float measuredHeight = this.f28624b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            qj0 qj0Var = this.l1;
            if (i7 < qj0Var.getChildCount()) {
                View childAt = qj0Var.getChildAt(i7);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(org.telegram.messenger.g0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i7++;
            } else {
                return measuredHeight;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24982c3) {
            this.f13059j1 = qp.s1(this.f13058i1).P1().T;
            this.f13061m1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f13058i1).c(this, qs.f24982c3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f13058i1).n(this, qs.f24982c3);
    }
}

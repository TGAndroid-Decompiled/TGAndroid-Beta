package hi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;
public final class u7 extends org.telegram.ui.ActionBar.w2 implements gs {
    public final int f15498m1;
    public ArrayList n1;
    public final TLRPC.InputPeer f15499o1;
    public final ek0 f15500p1;
    public final t7 f15501q1;
    public final TextView f15502r1;

    public u7(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final y10 y10Var, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        int i10;
        O();
        np.u1(i7).R1().U();
        this.f15498m1 = i7;
        this.n1 = np.u1(i7).R1().T;
        this.f15499o1 = inputPeer;
        this.f30142b = new r7(this, context, h6Var);
        ek0 ek0Var = new ek0(context, h6Var);
        this.f15500p1 = ek0Var;
        int i11 = this.f30177u0;
        ek0Var.setPadding(i11, 0, i11, 0);
        t7 t7Var = new t7(this);
        this.f15501q1 = t7Var;
        ek0Var.setAdapter(t7Var);
        ek0Var.setLayoutManager(new v4.b0());
        this.f30142b.addView(ek0Var, c8.na.e(-1, -1, 119));
        ek0Var.setOnItemClickListener(new qj0() {
            @Override
            public final void c(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                u7 u7Var = u7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) u7Var.n1.get(i12 - 2);
                int i13 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                y10 y10Var2 = y10Var;
                if (i13 == 0 && inputPeer2.chat_id == 0) {
                    y10Var2.a(inputPeer2);
                    u7Var.dismiss();
                    return;
                }
                Context context2 = u7Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context2, h6Var2);
                t1Var.r(200L);
                np.u1(i7).R1().k(org.telegram.messenger.n5.n(inputPeer2), new bi.j(t1Var, y10Var2, inputPeer2, 10), true, h6Var2);
                u7Var.dismiss();
            }
        });
        ek0Var.setOnScrollListener(new s7(this));
        TextView textView = new TextView(getContext());
        this.f15502r1 = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.f30177u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.f30177u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, textView, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z10) {
            i10 = 2131744276;
        } else {
            i10 = 2131744277;
        }
        textView.setText(hd.N0(i10, null));
        this.f30142b.addView(textView, c8.na.c(-2.0f, -1));
    }

    @Override
    public final boolean G() {
        if (J0() > ((int) (org.telegram.messenger.g0.f24010q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float J0() {
        int R;
        float measuredHeight = this.f30142b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f15500p1;
            if (i7 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i7);
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
        if (i7 == ls.f25265e3) {
            this.n1 = np.u1(this.f15498m1).R1().T;
            this.f15501q1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.f15498m1).c(this, ls.f25265e3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.f15498m1).n(this, ls.f25265e3);
    }
}

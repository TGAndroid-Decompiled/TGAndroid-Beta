package hi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.uj0;
public final class u7 extends org.telegram.ui.ActionBar.u2 implements is {
    public final int f15192m1;
    public ArrayList n1;
    public final TLRPC.InputPeer f15193o1;
    public final uj0 f15194p1;
    public final t7 f15195q1;
    public final TextView f15196r1;

    public u7(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final z10 z10Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        int i10;
        O();
        np.s1(i7).P1().U();
        this.f15192m1 = i7;
        this.n1 = np.s1(i7).P1().T;
        this.f15193o1 = inputPeer;
        this.f29682b = new r7(this, context, e6Var);
        uj0 uj0Var = new uj0(context, e6Var);
        this.f15194p1 = uj0Var;
        int i11 = this.f29717u0;
        uj0Var.setPadding(i11, 0, i11, 0);
        t7 t7Var = new t7(this);
        this.f15195q1 = t7Var;
        uj0Var.setAdapter(t7Var);
        uj0Var.setLayoutManager(new v4.b0());
        this.f29682b.addView(uj0Var, c8.ja.e(-1, -1, 119));
        uj0Var.setOnItemClickListener(new gj0() {
            @Override
            public final void b(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                u7 u7Var = u7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) u7Var.n1.get(i12 - 2);
                int i13 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                z10 z10Var2 = z10Var;
                if (i13 == 0 && inputPeer2.chat_id == 0) {
                    z10Var2.a(inputPeer2);
                    u7Var.dismiss();
                    return;
                }
                Context context2 = u7Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context2, e6Var2);
                t1Var.r(200L);
                np.s1(i7).P1().k(org.telegram.messenger.m5.n(inputPeer2), new bi.j(t1Var, z10Var2, inputPeer2, 7), true, e6Var2);
                u7Var.dismiss();
            }
        });
        uj0Var.setOnScrollListener(new s7(this));
        TextView textView = new TextView(getContext());
        this.f15196r1 = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.f29717u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.f29717u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, textView, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z10) {
            i10 = 2131744517;
        } else {
            i10 = 2131744518;
        }
        textView.setText(hd.M0(i10, null));
        this.f29682b.addView(textView, c8.ja.c(-2.0f, -1));
    }

    @Override
    public final boolean H() {
        if (I0() > ((int) (org.telegram.messenger.g0.f23611q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float I0() {
        int R;
        float measuredHeight = this.f29682b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.f15194p1;
            if (i7 < uj0Var.getChildCount()) {
                View childAt = uj0Var.getChildAt(i7);
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
        if (i7 == ns.f25479c3) {
            this.n1 = np.s1(this.f15192m1).P1().T;
            this.f15195q1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f15192m1).c(this, ns.f25479c3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f15192m1).n(this, ns.f25479c3);
    }
}

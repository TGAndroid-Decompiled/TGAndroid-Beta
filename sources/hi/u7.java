package hi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.oj0;
public final class u7 extends org.telegram.ui.ActionBar.x2 implements fs {
    public final int f15542m1;
    public ArrayList n1;
    public final TLRPC.InputPeer f15543o1;
    public final ck0 f15544p1;
    public final t7 f15545q1;
    public final TextView f15546r1;

    public u7(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final x10 x10Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        int i10;
        O();
        mp.u1(i7).R1().U();
        this.f15542m1 = i7;
        this.n1 = mp.u1(i7).R1().T;
        this.f15543o1 = inputPeer;
        this.f30192b = new r7(this, context, i6Var);
        ck0 ck0Var = new ck0(context, i6Var);
        this.f15544p1 = ck0Var;
        int i11 = this.f30227u0;
        ck0Var.setPadding(i11, 0, i11, 0);
        t7 t7Var = new t7(this);
        this.f15545q1 = t7Var;
        ck0Var.setAdapter(t7Var);
        ck0Var.setLayoutManager(new v4.c0());
        this.f30192b.addView(ck0Var, c8.ma.e(-1, -1, 119));
        ck0Var.setOnItemClickListener(new oj0() {
            @Override
            public final void c(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                u7 u7Var = u7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) u7Var.n1.get(i12 - 2);
                int i13 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                x10 x10Var2 = x10Var;
                if (i13 == 0 && inputPeer2.chat_id == 0) {
                    x10Var2.a(inputPeer2);
                    u7Var.dismiss();
                    return;
                }
                Context context2 = u7Var.getContext();
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context2, i6Var2);
                u1Var.r(200L);
                mp.u1(i7).R1().k(org.telegram.messenger.n5.n(inputPeer2), new bi.j(u1Var, x10Var2, inputPeer2, 10), true, i6Var2);
                u7Var.dismiss();
            }
        });
        ck0Var.setOnScrollListener(new s7(this));
        TextView textView = new TextView(getContext());
        this.f15546r1 = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.f30227u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.f30227u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, textView, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z10) {
            i10 = 2131744282;
        } else {
            i10 = 2131744283;
        }
        textView.setText(gd.M0(i10, null));
        this.f30192b.addView(textView, c8.ma.c(-2.0f, -1));
    }

    @Override
    public final boolean G() {
        if (J0() > ((int) (org.telegram.messenger.g0.f24121q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float J0() {
        int R;
        float measuredHeight = this.f30192b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            ck0 ck0Var = this.f15544p1;
            if (i7 < ck0Var.getChildCount()) {
                View childAt = ck0Var.getChildAt(i7);
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
        if (i7 == ks.f25109e3) {
            this.n1 = mp.u1(this.f15542m1).R1().T;
            this.f15545q1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f15542m1).c(this, ks.f25109e3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f15542m1).n(this, ks.f25109e3);
    }
}

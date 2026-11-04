package gi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.tj0;
public final class v7 extends org.telegram.ui.ActionBar.t2 implements cs {
    public final int f13690j1;
    public ArrayList k1;
    public final TLRPC.InputPeer f13691l1;
    public final tj0 m1;
    public final u7 f13692n1;
    public final TextView f13693o1;

    public v7(Context context, final int i3, boolean z10, TLRPC.InputPeer inputPeer, final u10 u10Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        int i10;
        N();
        hp.s1(i3).P1().U();
        this.f13690j1 = i3;
        this.k1 = hp.s1(i3).P1().T;
        this.f13691l1 = inputPeer;
        this.f28586b = new s7(this, context, e6Var);
        tj0 tj0Var = new tj0(context, e6Var);
        this.m1 = tj0Var;
        int i11 = this.f28618u0;
        tj0Var.setPadding(i11, 0, i11, 0);
        u7 u7Var = new u7(this);
        this.f13692n1 = u7Var;
        tj0Var.setAdapter(u7Var);
        tj0Var.setLayoutManager(new u4.b0());
        this.f28586b.addView(tj0Var, mf.e(-1, -1, 119));
        tj0Var.setOnItemClickListener(new fj0() {
            @Override
            public final void f(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                v7 v7Var = v7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) v7Var.k1.get(i12 - 2);
                int i13 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                u10 u10Var2 = u10Var;
                if (i13 == 0 && inputPeer2.chat_id == 0) {
                    u10Var2.a(inputPeer2);
                    v7Var.dismiss();
                    return;
                }
                Context context2 = v7Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context2, e6Var2);
                s1Var.r(200L);
                hp.s1(i3).P1().k(org.telegram.messenger.m5.n(inputPeer2), new ai.m(s1Var, u10Var2, inputPeer2, 7), true, e6Var2);
                v7Var.dismiss();
            }
        });
        tj0Var.setOnScrollListener(new t7(this));
        TextView textView = new TextView(getContext());
        this.f13693o1 = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.f28618u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.f28618u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, textView, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z10) {
            i10 = 2131744527;
        } else {
            i10 = 2131744528;
        }
        textView.setText(bd.M0(i10, null));
        this.f28586b.addView(textView, mf.c(-2.0f, -1));
    }

    @Override
    public final boolean G() {
        if (I0() > ((int) (org.telegram.messenger.g0.f22608q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float I0() {
        int R;
        float measuredHeight = this.f28586b.getMeasuredHeight();
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.m1;
            if (i3 < tj0Var.getChildCount()) {
                View childAt = tj0Var.getChildAt(i3);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(org.telegram.messenger.g0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i3++;
            } else {
                return measuredHeight;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23210c3) {
            this.k1 = hp.s1(this.f13690j1).P1().T;
            this.f13692n1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f13690j1).c(this, hs.f23210c3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f13690j1).n(this, hs.f23210c3);
    }
}

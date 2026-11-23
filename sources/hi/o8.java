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
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;
public final class o8 extends org.telegram.ui.ActionBar.w2 implements fs {
    public final int f15163m1;
    public ArrayList n1;
    public final TLRPC.InputPeer f15164o1;
    public final ek0 f15165p1;
    public final n8 f15166q1;
    public final TextView f15167r1;

    public o8(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final w10 w10Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        int i10;
        O();
        mp.u1(i7).R1().U();
        this.f15163m1 = i7;
        this.n1 = mp.u1(i7).R1().T;
        this.f15164o1 = inputPeer;
        this.f30226b = new l8(this, context, i6Var);
        ek0 ek0Var = new ek0(context, i6Var);
        this.f15165p1 = ek0Var;
        int i11 = this.f30261u0;
        ek0Var.setPadding(i11, 0, i11, 0);
        n8 n8Var = new n8(this);
        this.f15166q1 = n8Var;
        ek0Var.setAdapter(n8Var);
        ek0Var.setLayoutManager(new v4.c0());
        this.f30226b.addView(ek0Var, c8.na.e(-1, -1, 119));
        ek0Var.setOnItemClickListener(new qj0() {
            @Override
            public final void b(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                o8 o8Var = o8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) o8Var.n1.get(i12 - 2);
                int i13 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                w10 w10Var2 = w10Var;
                if (i13 == 0 && inputPeer2.chat_id == 0) {
                    w10Var2.a(inputPeer2);
                    o8Var.dismiss();
                    return;
                }
                Context context2 = o8Var.getContext();
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context2, i6Var2);
                t1Var.r(200L);
                mp.u1(i7).R1().k(org.telegram.messenger.n5.n(inputPeer2), new bi.j(t1Var, w10Var2, inputPeer2, 10), true, i6Var2);
                o8Var.dismiss();
            }
        });
        ek0Var.setOnScrollListener(new m8(this));
        TextView textView = new TextView(getContext());
        this.f15167r1 = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.f30261u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.f30261u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, textView, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z10) {
            i10 = 2131744273;
        } else {
            i10 = 2131744274;
        }
        textView.setText(gd.N0(i10, null));
        this.f30226b.addView(textView, c8.na.c(-2.0f, -1));
    }

    @Override
    public final boolean F() {
        if (J0() > ((int) (org.telegram.messenger.g0.f24226q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float J0() {
        int R;
        float measuredHeight = this.f30226b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f15165p1;
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
        if (i7 == ks.f25206e3) {
            this.n1 = mp.u1(this.f15163m1).R1().T;
            this.f15166q1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f15163m1).c(this, ks.f25206e3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f15163m1).n(this, ks.f25206e3);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e9b extends nx0 implements fn7 {
    public final int l1;
    public ArrayList m1;
    public final TLRPC.InputPeer n1;
    public final d79 o1;
    public final d9b p1;
    public final TextView q1;

    public e9b(Context context, final int i, boolean z, TLRPC.InputPeer inputPeer, final pcc pccVar, final vnb vnbVar) {
        super(1, vnbVar, context, false);
        int i2;
        J();
        uc7.s1(i).O1().T();
        this.l1 = i;
        this.m1 = uc7.s1(i).O1().T;
        this.n1 = inputPeer;
        this.b = new b9b(this, context, vnbVar);
        d79 d79Var = new d79(context, vnbVar);
        this.o1 = d79Var;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, 0);
        d9b d9bVar = new d9b(this);
        this.p1 = d9bVar;
        d79Var.setAdapter(d9bVar);
        d79Var.setLayoutManager(new x46());
        this.b.addView(d79Var, tre.e(-1, -1, 119));
        d79Var.setOnItemClickListener(new r69() {
            @Override
            public final void e(int i4, View view) {
                if (i4 <= 1) {
                    return;
                }
                e9b e9bVar = e9b.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) e9bVar.m1.get(i4 - 2);
                int i5 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                pcc pccVar2 = pccVar;
                if (i5 == 0 && inputPeer2.chat_id == 0) {
                    pccVar2.a(inputPeer2);
                    e9bVar.dismiss();
                    return;
                }
                Context context2 = e9bVar.getContext();
                vnb vnbVar2 = vnbVar;
                id idVar = new id(3, vnbVar2, context2);
                idVar.q(200L);
                uc7.s1(i).O1().j(wf3.m(inputPeer2), new v58(idVar, pccVar2, inputPeer2, (byte) 11), true, vnbVar2);
                e9bVar.dismiss();
            }
        });
        d79Var.setOnScrollListener(new c9b(this));
        TextView textView = new TextView(getContext());
        this.q1 = textView;
        yob.X(textView, aob.G6, vnbVar);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(hl.L(22.0f) + this.u0, hl.L(2.0f), hl.L(22.0f) + this.u0, hl.L(14.0f));
        yob.h(aob.h5, vnbVar, textView);
        textView.setTypeface(hl.o());
        if (z) {
            i2 = 2131744171;
        } else {
            i2 = 2131744172;
        }
        textView.setText(ob6.M0(i2, null));
        this.b.addView(textView, tre.c(-2.0f, -1));
    }

    @Override
    public final boolean D() {
        if (E0() > ((int) (hl.q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float E0() {
        int S;
        float measuredHeight = this.b.getMeasuredHeight();
        int i = 0;
        while (true) {
            d79 d79Var = this.o1;
            if (i < d79Var.getChildCount()) {
                View childAt = d79Var.getChildAt(i);
                if (childAt != null && (S = RecyclerView.S(childAt)) != -1 && S > 0) {
                    measuredHeight = Math.min(hl.R1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i++;
            } else {
                return measuredHeight;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.e3) {
            this.m1 = uc7.s1(this.l1).O1().T;
            this.p1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.l1).b(this, jn7.e3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.l1).n(this, jn7.e3);
    }
}

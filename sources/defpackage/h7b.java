package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h7b extends my0 implements jm7 {
    public final int l1;
    public ArrayList m1;
    public final TLRPC.InputPeer n1;
    public final r59 o1;
    public final g7b p1;
    public final TextView q1;

    public h7b(Context context, final int i, boolean z, TLRPC.InputPeer inputPeer, final qac qacVar, final ylb ylbVar) {
        super(1, ylbVar, context, false);
        int i2;
        J();
        oc7.r1(i).N1().T();
        this.l1 = i;
        this.m1 = oc7.r1(i).N1().T;
        this.n1 = inputPeer;
        this.b = new e7b(this, context, ylbVar);
        r59 r59Var = new r59(context, ylbVar);
        this.o1 = r59Var;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, 0);
        g7b g7bVar = new g7b(this);
        this.p1 = g7bVar;
        r59Var.setAdapter(g7bVar);
        r59Var.setLayoutManager(new u46());
        this.b.addView(r59Var, qoe.e(-1, -1, 119));
        r59Var.setOnItemClickListener(new f59() {
            @Override
            public final void g(int i4, View view) {
                if (i4 <= 1) {
                    return;
                }
                h7b h7bVar = h7b.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) h7bVar.m1.get(i4 - 2);
                int i5 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                qac qacVar2 = qacVar;
                if (i5 == 0 && inputPeer2.chat_id == 0) {
                    qacVar2.a(inputPeer2);
                    h7bVar.dismiss();
                    return;
                }
                Context context2 = h7bVar.getContext();
                ylb ylbVar2 = ylbVar;
                he heVar = new he(3, ylbVar2, context2);
                heVar.q(200L);
                oc7.r1(i).N1().j(pg3.m(inputPeer2), new i48(heVar, qacVar2, inputPeer2, (byte) 11), true, ylbVar2);
                h7bVar.dismiss();
            }
        });
        r59Var.setOnScrollListener(new f7b(this));
        TextView textView = new TextView(getContext());
        this.q1 = textView;
        anb.X(textView, cmb.F6, ylbVar);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(gm.L(22.0f) + this.u0, gm.L(2.0f), gm.L(22.0f) + this.u0, gm.L(14.0f));
        anb.h(cmb.g5, ylbVar, textView);
        textView.setTypeface(gm.o());
        if (z) {
            i2 = 2131744203;
        } else {
            i2 = 2131744204;
        }
        textView.setText(jb6.M0(i2, null));
        this.b.addView(textView, qoe.c(-2.0f, -1));
    }

    @Override
    public final boolean C() {
        if (D0() > ((int) (gm.q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float D0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i = 0;
        while (true) {
            r59 r59Var = this.o1;
            if (i < r59Var.getChildCount()) {
                View childAt = r59Var.getChildAt(i);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(gm.R1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i++;
            } else {
                return measuredHeight;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.e3) {
            this.m1 = oc7.r1(this.l1).N1().T;
            this.p1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.l1).b(this, nm7.e3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.l1).n(this, nm7.e3);
    }
}

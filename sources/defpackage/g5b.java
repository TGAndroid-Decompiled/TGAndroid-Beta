package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g5b extends fx0 implements gk7 {
    public final int l1;
    public ArrayList m1;
    public final TLRPC.InputPeer n1;
    public final o39 o1;
    public final f5b p1;
    public final TextView q1;

    public g5b(Context context, final int i, boolean z, TLRPC.InputPeer inputPeer, final p8c p8cVar, final wjb wjbVar) {
        super(1, wjbVar, context, false);
        int i2;
        K();
        na7.q1(i).M1().T();
        this.l1 = i;
        this.m1 = na7.q1(i).M1().T;
        this.n1 = inputPeer;
        this.b = new d5b(this, context, wjbVar);
        o39 o39Var = new o39(context, wjbVar);
        this.o1 = o39Var;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, 0);
        f5b f5bVar = new f5b(this);
        this.p1 = f5bVar;
        o39Var.setAdapter(f5bVar);
        o39Var.setLayoutManager(new t26());
        this.b.addView(o39Var, nme.e(-1, -1, 119));
        o39Var.setOnItemClickListener(new c39() {
            @Override
            public final void d(int i4, View view) {
                if (i4 <= 1) {
                    return;
                }
                g5b g5bVar = g5b.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) g5bVar.m1.get(i4 - 2);
                int i5 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                p8c p8cVar2 = p8cVar;
                if (i5 == 0 && inputPeer2.chat_id == 0) {
                    p8cVar2.a(inputPeer2);
                    g5bVar.dismiss();
                    return;
                }
                Context context2 = g5bVar.getContext();
                wjb wjbVar2 = wjbVar;
                hd hdVar = new hd(3, wjbVar2, context2);
                hdVar.q(200L);
                na7.q1(i).M1().j(cf3.m(inputPeer2), new f28(hdVar, p8cVar2, inputPeer2, (byte) 11), true, wjbVar2);
                g5bVar.dismiss();
            }
        });
        o39Var.setOnScrollListener(new e5b(this));
        TextView textView = new TextView(getContext());
        this.q1 = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(gl.L(22.0f) + this.u0, gl.L(2.0f), gl.L(22.0f) + this.u0, gl.L(14.0f));
        zkb.h(bkb.g5, wjbVar, textView);
        textView.setTypeface(gl.o());
        if (z) {
            i2 = 2131744277;
        } else {
            i2 = 2131744278;
        }
        textView.setText(k96.M0(i2, null));
        this.b.addView(textView, nme.c(-2.0f, -1));
    }

    public final float D0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i = 0;
        while (true) {
            o39 o39Var = this.o1;
            if (i < o39Var.getChildCount()) {
                View childAt = o39Var.getChildAt(i);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(gl.R1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i++;
            } else {
                return measuredHeight;
            }
        }
    }

    @Override
    public final boolean E() {
        if (D0() > ((int) (gl.q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.d3) {
            this.m1 = na7.q1(this.l1).M1().T;
            this.p1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.l1).b(this, kk7.d3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.l1).n(this, kk7.d3);
    }
}

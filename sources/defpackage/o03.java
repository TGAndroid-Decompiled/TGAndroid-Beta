package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class o03 extends fy0 {
    public final vt5 S1;
    public final ArrayList T1;
    public final boolean U1;
    public final boolean V1;
    public final boolean W1;
    public boolean X1;
    public TLRPC.Peer Y1;
    public TLRPC.InputPeer Z1;
    public final d a2;
    public final long b2;

    public o03(d dVar, ArrayList arrayList, long j, vt5 vt5Var) {
        super(dVar, false);
        boolean z;
        String a0;
        boolean z2;
        String a02;
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-j));
        this.a2 = dVar;
        this.b2 = j;
        this.u1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.T1 = arrayList2;
        this.S1 = vt5Var;
        boolean W = hc2.W(K0);
        this.W1 = W;
        this.Y1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        this.U1 = z;
        this.V1 = hc2.w(14, K0);
        Context context = this.b.getContext();
        this.b.addView(new sb((byte) 9, context, this), nme.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        if (W) {
            a0 = k96.a0(null, null, 2131743213, new Object[0]);
        } else {
            a0 = k96.a0(null, null, 2131743082, new Object[0]);
        }
        textView.setText(a0);
        zkb.X(textView, bkb.Ii, null);
        int L = gl.L(8.0f);
        int i = bkb.Ei;
        int w0 = bkb.w0(null, i, false);
        int i2 = bkb.c6;
        int o = bm2.o(bkb.w0(null, i2, false), 120);
        ff0 i0 = bkb.i0(L, L, L, L, w0, o, o);
        vkb M = zkb.M(i);
        vkb g = zkb.g(i2, 120);
        textView.setBackground(i0);
        zkb.j(textView, i0, M, g, null);
        this.b.addView(textView, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        if (W) {
            z2 = false;
            a02 = k96.a0(null, null, 2131743220, new Object[0]);
        } else {
            z2 = false;
            a02 = k96.a0(null, null, 2131743099, new Object[0]);
        }
        textView2.setText(a02);
        textView2.setLetterSpacing(0.025f);
        zkb.X(textView2, i, null);
        int L2 = gl.L(8.0f);
        int o2 = bm2.o(bkb.w0(null, i, z2), 120);
        ff0 i02 = bkb.i0(L2, L2, L2, L2, 0, o2, o2);
        vkb g2 = zkb.g(i, 120);
        textView2.setBackground(i02);
        zkb.j(textView2, i02, null, g2, null);
        this.b.addView(textView2, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final o03 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                o03 o03Var = this.b;
                switch (b) {
                    case 0:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.dismiss();
                        return;
                    default:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.X1 = true;
                        o03Var.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final o03 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                o03 o03Var = this.b;
                switch (b) {
                    case 0:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.dismiss();
                        return;
                    default:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.X1 = true;
                        o03Var.dismiss();
                        return;
                }
            }
        });
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, gl.L(120.0f));
        this.n1.setOnItemClickListener(new u(this, (byte) 18));
        K();
        W0();
    }

    @Override
    public final n39 G0(o39 o39Var) {
        return new n03(this);
    }

    @Override
    public final void I() {
        super.I();
        TLRPC.InputPeer inputPeer = this.Z1;
        if (inputPeer != null) {
            boolean z = true;
            if (this.T1.size() <= 1) {
                z = false;
            }
            this.S1.a(inputPeer, z, this.X1, false);
        }
    }

    @Override
    public final CharSequence J0() {
        if (this.W1) {
            return k96.M0(2131744666, null);
        }
        return k96.M0(2131744663, null);
    }
}

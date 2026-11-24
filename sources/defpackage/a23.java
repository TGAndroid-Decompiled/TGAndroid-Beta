package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class a23 extends mz0 {
    public final uv5 S1;
    public final ArrayList T1;
    public final boolean U1;
    public final boolean V1;
    public final boolean W1;
    public boolean X1;
    public TLRPC.Peer Y1;
    public TLRPC.InputPeer Z1;
    public final d a2;
    public final long b2;

    public a23(d dVar, ArrayList arrayList, long j, uv5 uv5Var) {
        super(dVar, false);
        boolean z;
        String a0;
        boolean z2;
        String a02;
        TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-j));
        this.a2 = dVar;
        this.b2 = j;
        this.u1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.T1 = arrayList2;
        this.S1 = uv5Var;
        boolean W = sd2.W(L0);
        this.W1 = W;
        this.Y1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        this.U1 = z;
        this.V1 = sd2.w(14, L0);
        Context context = this.b.getContext();
        this.b.addView(new sb((byte) 10, context, this), qoe.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        if (W) {
            a0 = jb6.a0(null, null, 2131743139, new Object[0]);
        } else {
            a0 = jb6.a0(null, null, 2131743008, new Object[0]);
        }
        textView.setText(a0);
        anb.X(textView, cmb.Ii, null);
        int L = gm.L(8.0f);
        int i = cmb.Ei;
        int w0 = cmb.w0(null, i, false);
        int i2 = cmb.c6;
        int p = on2.p(cmb.w0(null, i2, false), 120);
        fg0 i0 = cmb.i0(L, L, L, L, w0, p, p);
        wmb M = anb.M(i);
        wmb g = anb.g(i2, 120);
        textView.setBackground(i0);
        anb.j(textView, i0, M, g, null);
        this.b.addView(textView, qoe.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        if (W) {
            z2 = false;
            a02 = jb6.a0(null, null, 2131743146, new Object[0]);
        } else {
            z2 = false;
            a02 = jb6.a0(null, null, 2131743025, new Object[0]);
        }
        textView2.setText(a02);
        textView2.setLetterSpacing(0.025f);
        anb.X(textView2, i, null);
        int L2 = gm.L(8.0f);
        int p2 = on2.p(cmb.w0(null, i, z2), 120);
        fg0 i02 = cmb.i0(L2, L2, L2, L2, 0, p2, p2);
        wmb g2 = anb.g(i, 120);
        textView2.setBackground(i02);
        anb.j(textView2, i02, null, g2, null);
        this.b.addView(textView2, qoe.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final a23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                a23 a23Var = this.b;
                switch (b) {
                    case 0:
                        a23Var.Z1 = oc7.r1(a23Var.a).i1(k47.B1(a23Var.Y1));
                        a23Var.dismiss();
                        return;
                    default:
                        a23Var.Z1 = oc7.r1(a23Var.a).i1(k47.B1(a23Var.Y1));
                        a23Var.X1 = true;
                        a23Var.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final a23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                a23 a23Var = this.b;
                switch (b) {
                    case 0:
                        a23Var.Z1 = oc7.r1(a23Var.a).i1(k47.B1(a23Var.Y1));
                        a23Var.dismiss();
                        return;
                    default:
                        a23Var.Z1 = oc7.r1(a23Var.a).i1(k47.B1(a23Var.Y1));
                        a23Var.X1 = true;
                        a23Var.dismiss();
                        return;
                }
            }
        });
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, gm.L(120.0f));
        this.n1.setOnItemClickListener(new u(this, (byte) 19));
        J();
        W0();
    }

    @Override
    public final q59 G0(r59 r59Var) {
        return new z13(this);
    }

    @Override
    public final void H() {
        super.H();
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
            return jb6.M0(2131744592, null);
        }
        return jb6.M0(2131744589, null);
    }
}

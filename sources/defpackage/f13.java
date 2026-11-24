package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class f13 extends fy0 {
    public final boolean S1;
    public final vt5 T1;
    public TLRPC.InputPeer U1;
    public final boolean V1;
    public String W1;
    public String X1;
    public SpannableStringBuilder Y1;
    public l5c Z1;
    public final boolean a2;
    public t1 b2;

    public f13(d dVar, TLRPC.Peer peer, long j, boolean z, vt5 vt5Var) {
        super(dVar, false);
        boolean z2;
        int i;
        this.S1 = false;
        this.u1 = 0.26f;
        this.T1 = vt5Var;
        this.V1 = z;
        Context context = this.b.getContext();
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-j));
        if (K0 != null && K0.creator) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131743214, null));
        zkb.X(textView, bkb.Ii, this.J0);
        int L = gl.L(8.0f);
        int i2 = bkb.Ei;
        int v0 = bkb.v0(i2, this.J0);
        int i3 = bkb.c6;
        int o = bm2.o(bkb.w0(null, i3, false), 120);
        ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
        vkb M = zkb.M(i2);
        vkb g = zkb.g(i3, 120);
        wjb wjbVar = this.J0;
        textView.setBackground(i0);
        zkb.j(textView, i0, M, g, wjbVar);
        ViewGroup viewGroup = this.b;
        if (z2) {
            i = 52;
        } else {
            i = 0;
        }
        viewGroup.addView(textView, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, i + 12));
        textView.setOnClickListener(new kb1(this, peer, (byte) 24));
        if (z2) {
            u41 u41Var = new u41(this.J0, context, false);
            u41Var.setColor(bkb.w0(null, bkb.q7, false));
            u41Var.d.x(gl.o());
            u41Var.i(k96.M0(2131748608, null), false, true);
            u41Var.setOnClickListener(new yn0(this, context, u41Var, j, (byte) 1));
            this.b.addView(u41Var, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        o39 o39Var = this.n1;
        int i4 = this.u0;
        o39Var.setPadding(i4, 0, i4, gl.L((z2 ? 52 : 0) + 72));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        K();
        W0();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = na7.q1(this.a).h1(j);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.a).sendRequest(getgroupcallstreamrtmpurl, new uf(this, (byte) 16));
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new w72(this, (byte) 15), this.J0);
        this.Z1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final void I() {
        TLRPC.InputPeer inputPeer;
        super.I();
        vt5 vt5Var = this.T1;
        if (vt5Var != null && (inputPeer = this.U1) != null) {
            vt5Var.a(inputPeer, this.V1, false, true);
        }
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131744197, null);
    }

    public f13(Context context, int i, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, nu9 nu9Var, f53 f53Var) {
        int i2;
        TLRPC.Chat K0;
        f13 fy0Var = new fy0(context, null, false, false, f53Var);
        fy0Var.S1 = true;
        fy0Var.u1 = 0.126f;
        fy0Var.T1 = null;
        fy0Var.V1 = false;
        long m = cf3.m(getgroupcallstreamrtmpurl.peer);
        boolean z = nu9Var != null && (m >= 0 || ((K0 = na7.q1(i).K0(Long.valueOf(-m))) != null && K0.creator));
        if (nu9Var != null) {
            fy0Var.a2 = true;
            u41 u41Var = new u41(f53Var, context, true);
            u41Var.i(k96.M0(2131748610, null), false, true);
            fy0Var.b.addView(u41Var, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z ? 52 : 0) + 12));
            u41Var.setOnClickListener(new x91(fy0Var, nu9Var, u41Var));
            if (z) {
                u41 u41Var2 = new u41(f53Var, context, false);
                u41Var2.setColor(bkb.w0(null, bkb.q7, false));
                u41Var2.d.x(gl.o());
                u41Var2.i(k96.M0(2131748608, null), false, true);
                fy0Var = this;
                u41Var2.setOnClickListener(new xg(this, context, f53Var, i, u41Var2, getgroupcallstreamrtmpurl, (byte) 3));
                fy0Var.b.addView(u41Var2, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        fy0Var.n1.setItemAnimator(gb3Var);
        o39 o39Var = fy0Var.n1;
        int i3 = fy0Var.u0;
        if (fy0Var.a2) {
            i2 = gl.L(z ? 124.0f : 72.0f);
        } else {
            i2 = 0;
        }
        o39Var.setPadding(i3, 0, i3, i2);
        fy0Var.K();
        fy0Var.W0();
        fy0Var.W1 = groupcallstreamrtmpurl.url;
        fy0Var.X1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fy0Var.X1);
        fy0Var.Y1 = spannableStringBuilder;
        ?? obj = new Object();
        obj.a |= 256;
        obj.b = 0;
        obj.c = spannableStringBuilder.length();
        fy0Var.Y1.setSpan(new wib(obj, 0), 0, fy0Var.Y1.length(), 0);
        fy0Var.Z1.O(false);
    }
}

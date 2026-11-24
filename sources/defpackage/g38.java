package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g38 extends fx0 {
    public final TextView l1;
    public final ry8 m1;
    public final oy8 n1;
    public final f36 o1;
    public final long p1;
    public boolean q1;
    public TLRPC.TL_chatInviteExported r1;
    public int s1;
    public int t1;
    public int u1;

    public g38(Context context, qa5 qa5Var, TLRPC.ChatFull chatFull, long j, boolean z) {
        super(context, false);
        int i;
        boolean z2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.p1 = j;
        this.r0 = true;
        this.w0 = false;
        this.v0 = false;
        M(bkb.c6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i2 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i2, this.J0), 1, -1);
        vkb M = zkb.M(i2);
        wjb wjbVar = this.J0;
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        zkb.s(imageView, bkb.zj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231312);
        imageView.setOnClickListener(new fr7(this, (byte) 8));
        int L = gl.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, nme.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        f36 f36Var = new f36(context, qa5Var, this, true, z);
        this.o1 = f36Var;
        f36Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.m1 = imageView2;
        oy8 oy8Var = new oy8(2131624188, gl.L(90.0f), gl.L(90.0f), false, null);
        this.n1 = oy8Var;
        oy8Var.K(42);
        imageView2.setAnimation(oy8Var);
        f36Var.d(0, null, false);
        f36Var.b(true);
        f36Var.setDelegate(new im6(this, (byte) 26));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131748957, null));
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        zkb.X(textView, bkb.F6, null);
        TextView textView2 = new TextView(context);
        if (z) {
            i = 2131748718;
        } else {
            i = 2131748719;
        }
        textView2.setText(k96.M0(i, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        zkb.X(textView2, bkb.i5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.l1 = textView3;
        textView3.setText(k96.M0(2131748503, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(gl.o());
        textView3.setTextSize(1, 14.0f);
        int i3 = bkb.Ei;
        zkb.X(textView3, i3, null);
        int L2 = gl.L(8.0f);
        int o = bm2.o(bkb.w0(null, i3, false), 120);
        ff0 i0 = bkb.i0(L2, L2, L2, L2, 0, o, o);
        vkb g = zkb.g(i3, 120);
        textView3.setBackground(i0);
        zkb.j(textView3, i0, null, g, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new hu4(this, chatFull, qa5Var, (byte) 14));
        linearLayout.addView((View) imageView2, nme.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, nme.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, nme.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(f36Var, nme.o(-1, -2));
        linearLayout.addView(textView3, nme.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(j));
        if (K0 != null && hc2.t0(K0)) {
            f36Var.setLink("https://t.me/" + hc2.K(K0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            f36Var.setLink(tL_chatInviteExported.link);
        } else {
            z2 = false;
            D0(false);
            imageView2.setBackground(bkb.K(gl.L(90.0f), bkb.w0(null, i3, z2)));
            int L3 = gl.L(8.0f);
            int o2 = bm2.o(bkb.w0(null, i3, z2), 120);
            textView3.setBackground(bkb.i0(L3, L3, L3, L3, 0, o2, o2));
            int w0 = bkb.w0(null, bkb.Ii, z2);
            oy8Var.L(w0, "Top");
            oy8Var.L(w0, "Bottom");
            oy8Var.L(w0, "Center");
            f36Var.f();
            int w02 = bkb.w0(null, bkb.g5, z2);
            this.t1 = w02;
            s0(w02);
            this.s1 = w0;
        }
        z2 = false;
        imageView2.setBackground(bkb.K(gl.L(90.0f), bkb.w0(null, i3, z2)));
        int L32 = gl.L(8.0f);
        int o22 = bm2.o(bkb.w0(null, i3, z2), 120);
        textView3.setBackground(bkb.i0(L32, L32, L32, L32, 0, o22, o22));
        int w03 = bkb.w0(null, bkb.Ii, z2);
        oy8Var.L(w03, "Top");
        oy8Var.L(w03, "Bottom");
        oy8Var.L(w03, "Center");
        f36Var.f();
        int w022 = bkb.w0(null, bkb.g5, z2);
        this.t1 = w022;
        s0(w022);
        this.s1 = w03;
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.Ii));
    }

    public final void D0(boolean z) {
        if (this.q1) {
            return;
        }
        this.q1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = na7.q1(this.a).h1(-this.p1);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_exportChatInvite, new i81((byte) 9, this, z));
    }

    public final void E0(TLRPC.ChatFull chatFull, qa5 qa5Var) {
        yh6 yh6Var = new yh6(chatFull.id, 0, 0L);
        yh6Var.l0(chatFull, chatFull.exported_invite);
        qa5Var.presentFragment(yh6Var);
        super.dismiss();
    }

    @Override
    public final ArrayList S() {
        return new ArrayList();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            ry8 ry8Var = this.m1;
            if (ry8Var != null) {
                bkb.A1(bkb.w0(null, bkb.Ei, false), ry8Var.getBackground());
            }
            int o = bm2.o(bkb.w0(null, bkb.Ei, false), 120);
            TextView textView = this.l1;
            if (textView != null && o != this.u1) {
                this.u1 = o;
                bkb.F1(textView.getBackground(), o, true);
            }
            int w0 = bkb.w0(null, bkb.Ii, false);
            oy8 oy8Var = this.n1;
            if (oy8Var != null && w0 != this.s1) {
                this.s1 = w0;
                oy8Var.L(w0, "Top");
                oy8Var.L(w0, "Bottom");
                oy8Var.L(w0, "Center");
            }
            int w02 = bkb.w0(null, bkb.g5, false);
            if (w02 != this.t1) {
                this.t1 = w02;
                s0(w02);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        gl.e3(new oq7(this, (byte) 18), 50L);
    }
}

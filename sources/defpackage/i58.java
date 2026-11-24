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
public final class i58 extends my0 {
    public final TextView l1;
    public final s09 m1;
    public final p09 n1;
    public final f56 o1;
    public final long p1;
    public boolean q1;
    public TLRPC.TL_chatInviteExported r1;
    public int s1;
    public int t1;
    public int u1;

    public i58(Context context, oc5 oc5Var, TLRPC.ChatFull chatFull, long j, boolean z) {
        super(context, false);
        int i;
        boolean z2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.p1 = j;
        this.r0 = true;
        this.w0 = false;
        this.v0 = false;
        L(cmb.c6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i2 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i2, this.J0), 1, -1);
        wmb M = anb.M(i2);
        ylb ylbVar = this.J0;
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        anb.s(imageView, cmb.zj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231313);
        imageView.setOnClickListener(new m67(this, (byte) 11));
        int L = gm.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, qoe.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        f56 f56Var = new f56(context, oc5Var, this, true, z);
        this.o1 = f56Var;
        f56Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.m1 = imageView2;
        p09 p09Var = new p09(2131624187, gm.L(90.0f), gm.L(90.0f), false, null);
        this.n1 = p09Var;
        p09Var.K(42);
        imageView2.setAnimation(p09Var);
        f56Var.d(0, null, false);
        f56Var.b(true);
        f56Var.setDelegate(new cj6(this, (byte) 29));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131748906, null));
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        anb.X(textView, cmb.F6, null);
        TextView textView2 = new TextView(context);
        if (z) {
            i = 2131748667;
        } else {
            i = 2131748668;
        }
        textView2.setText(jb6.M0(i, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        anb.X(textView2, cmb.i5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.l1 = textView3;
        textView3.setText(jb6.M0(2131748452, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(gm.o());
        textView3.setTextSize(1, 14.0f);
        int i3 = cmb.Ei;
        anb.X(textView3, i3, null);
        int L2 = gm.L(8.0f);
        int p = on2.p(cmb.w0(null, i3, false), 120);
        fg0 i0 = cmb.i0(L2, L2, L2, L2, 0, p, p);
        wmb g = anb.g(i3, 120);
        textView3.setBackground(i0);
        anb.j(textView3, i0, null, g, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new jw4(this, chatFull, oc5Var, (byte) 14));
        linearLayout.addView((View) imageView2, qoe.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, qoe.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, qoe.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(f56Var, qoe.o(-1, -2));
        linearLayout.addView(textView3, qoe.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(j));
        if (L0 != null && sd2.t0(L0)) {
            f56Var.setLink("https://t.me/" + sd2.K(L0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            f56Var.setLink(tL_chatInviteExported.link);
        } else {
            z2 = false;
            D0(false);
            imageView2.setBackground(cmb.K(gm.L(90.0f), cmb.w0(null, i3, z2)));
            int L3 = gm.L(8.0f);
            int p2 = on2.p(cmb.w0(null, i3, z2), 120);
            textView3.setBackground(cmb.i0(L3, L3, L3, L3, 0, p2, p2));
            int w0 = cmb.w0(null, cmb.Ii, z2);
            p09Var.L(w0, "Top");
            p09Var.L(w0, "Bottom");
            p09Var.L(w0, "Center");
            f56Var.f();
            int w02 = cmb.w0(null, cmb.g5, z2);
            this.t1 = w02;
            s0(w02);
            this.s1 = w0;
        }
        z2 = false;
        imageView2.setBackground(cmb.K(gm.L(90.0f), cmb.w0(null, i3, z2)));
        int L32 = gm.L(8.0f);
        int p22 = on2.p(cmb.w0(null, i3, z2), 120);
        textView3.setBackground(cmb.i0(L32, L32, L32, L32, 0, p22, p22));
        int w03 = cmb.w0(null, cmb.Ii, z2);
        p09Var.L(w03, "Top");
        p09Var.L(w03, "Bottom");
        p09Var.L(w03, "Center");
        f56Var.f();
        int w022 = cmb.w0(null, cmb.g5, z2);
        this.t1 = w022;
        s0(w022);
        this.s1 = w03;
    }

    public final void D0(boolean z) {
        if (this.q1) {
            return;
        }
        this.q1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = oc7.r1(this.a).i1(-this.p1);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_exportChatInvite, new r91((byte) 9, this, z));
    }

    public final void E0(TLRPC.ChatFull chatFull, oc5 oc5Var) {
        ak6 ak6Var = new ak6(chatFull.id, 0, 0L);
        ak6Var.m0(chatFull, chatFull.exported_invite);
        oc5Var.presentFragment(ak6Var);
        super.dismiss();
    }

    @Override
    public final ArrayList R() {
        return new ArrayList();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            s09 s09Var = this.m1;
            if (s09Var != null) {
                cmb.A1(cmb.w0(null, cmb.Ei, false), s09Var.getBackground());
            }
            int p = on2.p(cmb.w0(null, cmb.Ei, false), 120);
            TextView textView = this.l1;
            if (textView != null && p != this.u1) {
                this.u1 = p;
                cmb.F1(textView.getBackground(), p, true);
            }
            int w0 = cmb.w0(null, cmb.Ii, false);
            p09 p09Var = this.n1;
            if (p09Var != null && w0 != this.s1) {
                this.s1 = w0;
                p09Var.L(w0, "Top");
                p09Var.L(w0, "Bottom");
                p09Var.L(w0, "Center");
            }
            int w02 = cmb.w0(null, cmb.g5, false);
            if (w02 != this.t1) {
                this.t1 = w02;
                s0(w02);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        gm.d3(new kl7(this, (byte) 25), 50L);
    }

    @Override
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.m6));
        hashSet.add(Integer.valueOf(cmb.Ii));
    }
}

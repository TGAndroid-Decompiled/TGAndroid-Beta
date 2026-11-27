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
public final class w68 extends nx0 {
    public final TextView l1;
    public final e29 m1;
    public final b29 n1;
    public final i56 o1;
    public final long p1;
    public boolean q1;
    public TLRPC.TL_chatInviteExported r1;
    public int s1;
    public int t1;
    public int u1;

    public w68(Context context, rc5 rc5Var, TLRPC.ChatFull chatFull, long j, boolean z) {
        super(context, false);
        int i;
        boolean z2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.p1 = j;
        this.r0 = true;
        this.w0 = false;
        this.v0 = false;
        L(aob.d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i2 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i2, this.J0), 1, -1);
        uob M = yob.M(i2);
        vnb vnbVar = this.J0;
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        yob.s(imageView, aob.Aj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231312);
        imageView.setOnClickListener(new am7(this, (byte) 10));
        int L = hl.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, tre.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        i56 i56Var = new i56(context, rc5Var, this, true, z);
        this.o1 = i56Var;
        i56Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.m1 = imageView2;
        b29 b29Var = new b29(2131624187, hl.L(90.0f), hl.L(90.0f), false, null);
        this.n1 = b29Var;
        b29Var.K(42);
        imageView2.setAnimation(b29Var);
        i56Var.d(0, null, false);
        i56Var.b(true);
        i56Var.setDelegate(new jz7(this, (byte) 2));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131748903, null));
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        yob.X(textView, aob.G6, null);
        TextView textView2 = new TextView(context);
        if (z) {
            i = 2131748664;
        } else {
            i = 2131748665;
        }
        textView2.setText(ob6.M0(i, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        yob.X(textView2, aob.j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.l1 = textView3;
        textView3.setText(ob6.M0(2131748449, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(hl.o());
        textView3.setTextSize(1, 14.0f);
        int i3 = aob.Fi;
        yob.X(textView3, i3, null);
        int L2 = hl.L(8.0f);
        int o = vm2.o(aob.w0(null, i3, false), 120);
        hf0 i0 = aob.i0(L2, L2, L2, L2, 0, o, o);
        uob g = yob.g(i3, 120);
        textView3.setBackground(i0);
        yob.j(textView3, i0, null, g, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new lw4(this, chatFull, rc5Var, (byte) 15));
        linearLayout.addView((View) imageView2, tre.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, tre.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, tre.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(i56Var, tre.o(-1, -2));
        linearLayout.addView(textView3, tre.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(j));
        if (M0 != null && xc2.t0(M0)) {
            i56Var.setLink("https://t.me/" + xc2.K(M0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            i56Var.setLink(tL_chatInviteExported.link);
        } else {
            z2 = false;
            E0(false);
            imageView2.setBackground(aob.K(hl.L(90.0f), aob.w0(null, i3, z2)));
            int L3 = hl.L(8.0f);
            int o2 = vm2.o(aob.w0(null, i3, z2), 120);
            textView3.setBackground(aob.i0(L3, L3, L3, L3, 0, o2, o2));
            int w0 = aob.w0(null, aob.Ji, z2);
            b29Var.L(w0, "Top");
            b29Var.L(w0, "Bottom");
            b29Var.L(w0, "Center");
            i56Var.f();
            int w02 = aob.w0(null, aob.h5, z2);
            this.t1 = w02;
            s0(w02);
            this.s1 = w0;
        }
        z2 = false;
        imageView2.setBackground(aob.K(hl.L(90.0f), aob.w0(null, i3, z2)));
        int L32 = hl.L(8.0f);
        int o22 = vm2.o(aob.w0(null, i3, z2), 120);
        textView3.setBackground(aob.i0(L32, L32, L32, L32, 0, o22, o22));
        int w03 = aob.w0(null, aob.Ji, z2);
        b29Var.L(w03, "Top");
        b29Var.L(w03, "Bottom");
        b29Var.L(w03, "Center");
        i56Var.f();
        int w022 = aob.w0(null, aob.h5, z2);
        this.t1 = w022;
        s0(w022);
        this.s1 = w03;
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.n6));
        hashSet.add(Integer.valueOf(aob.Ji));
    }

    public final void E0(boolean z) {
        if (this.q1) {
            return;
        }
        this.q1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = uc7.s1(this.a).j1(-this.p1);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_exportChatInvite, new q81((byte) 9, this, z));
    }

    public final void F0(TLRPC.ChatFull chatFull, rc5 rc5Var) {
        ck6 ck6Var = new ck6(chatFull.id, 0, 0L);
        ck6Var.l0(chatFull, chatFull.exported_invite);
        rc5Var.presentFragment(ck6Var);
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
            e29 e29Var = this.m1;
            if (e29Var != null) {
                aob.A1(aob.w0(null, aob.Fi, false), e29Var.getBackground());
            }
            int o = vm2.o(aob.w0(null, aob.Fi, false), 120);
            TextView textView = this.l1;
            if (textView != null && o != this.u1) {
                this.u1 = o;
                aob.F1(textView.getBackground(), o, true);
            }
            int w0 = aob.w0(null, aob.Ji, false);
            b29 b29Var = this.n1;
            if (b29Var != null && w0 != this.s1) {
                this.s1 = w0;
                b29Var.L(w0, "Top");
                b29Var.L(w0, "Bottom");
                b29Var.L(w0, "Center");
            }
            int w02 = aob.w0(null, aob.h5, false);
            if (w02 != this.t1) {
                this.t1 = w02;
                s0(w02);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        hl.d3(new x38(this, (byte) 3), 50L);
    }
}

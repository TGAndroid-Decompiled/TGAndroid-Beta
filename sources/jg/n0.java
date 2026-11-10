package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xp;
public final class n0 extends FrameLayout implements c6 {
    public final h6 f16860a;
    public final k9 f16861b;
    public final TextView f16862c;
    public xp d;
    public o0 f16863e;

    public n0(Context context, h6 h6Var) {
        super(context);
        this.f16860a = h6Var;
        k9 k9Var = new k9(context);
        this.f16861b = k9Var;
        addView(k9Var, ha.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f16862c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.f16863e = o0Var;
        k9 k9Var = this.f16861b;
        k9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.f16872c;
        TextView textView = this.f16862c;
        h6 h6Var = this.f16860a;
        float f10 = 16.0f;
        if (i7 == 7) {
            xp N = m6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.f40377e = L;
            N.f40378f = L2;
            m6.B1(this.d, m6.w0(m6.Ci, h6Var), false);
            m6.B1(this.d, m6.w0(m6.Gi, h6Var), true);
            k9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        xp N2 = m6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f16870a);
        this.d = N2;
        int i10 = m6.Ci;
        m6.B1(N2, m6.w0(i10, h6Var), false);
        xp xpVar = this.d;
        int i11 = m6.Gi;
        m6.B1(xpVar, m6.w0(i11, h6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f16874f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (p10.i(p10.f24474s0).f().f27109id == user.f27109id) {
                    xp N3 = m6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.f40377e = L3;
                    N3.f40378f = L4;
                    m6.B1(N3, m6.w0(i10, h6Var), false);
                    m6.B1(N3, m6.w0(i11, h6Var), true);
                    k9Var.setImageDrawable(N3);
                } else {
                    k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                    k9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                if (t3.Y(chat)) {
                    f10 = 10.0f;
                }
                imageReceiver.J0(org.telegram.messenger.g0.L(f10));
                k9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            k9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        o0 o0Var;
        boolean z9 = getBackground() instanceof ShapeDrawable;
        h6 h6Var = this.f16860a;
        if (z9) {
            m6.C1(m6.w0(m6.Qi, h6Var), getBackground());
            invalidate();
        } else {
            setBackground(m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(m6.Qi, h6Var)));
        }
        TextView textView = this.f16862c;
        if (textView != null) {
            textView.setTextColor(m6.w0(m6.G6, h6Var));
        }
        xp xpVar = this.d;
        if (xpVar != null && (o0Var = this.f16863e) != null) {
            if (o0Var.d == 7) {
                m6.B1(xpVar, m6.w0(m6.Ci, h6Var), false);
                m6.B1(this.d, m6.w0(m6.Gi, h6Var), true);
                return;
            }
            m6.B1(xpVar, m6.w0(m6.Ci, h6Var), false);
            m6.B1(this.d, m6.w0(m6.Gi, h6Var), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

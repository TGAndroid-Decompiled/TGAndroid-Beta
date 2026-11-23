package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.k10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;
public final class n0 extends FrameLayout implements b6 {
    public final h6 f17587a;
    public final q9 f17588b;
    public final TextView f17589c;
    public oq d;
    public o0 f17590e;

    public n0(Context context, h6 h6Var) {
        super(context);
        this.f17587a = h6Var;
        q9 q9Var = new q9(context);
        this.f17588b = q9Var;
        addView(q9Var, na.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f17589c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, na.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.f17590e = o0Var;
        q9 q9Var = this.f17588b;
        q9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.f17598c;
        TextView textView = this.f17589c;
        h6 h6Var = this.f17587a;
        float f10 = 16.0f;
        if (i7 == 7) {
            oq N = m6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.f38303e = L;
            N.f38304f = L2;
            m6.B1(this.d, m6.w0(m6.Fi, h6Var), false);
            m6.B1(this.d, m6.w0(m6.Ji, h6Var), true);
            q9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        oq N2 = m6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f17596a);
        this.d = N2;
        int i10 = m6.Fi;
        m6.B1(N2, m6.w0(i10, h6Var), false);
        oq oqVar = this.d;
        int i11 = m6.Ji;
        m6.B1(oqVar, m6.w0(i11, h6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f17600f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (k10.i(k10.f24932t0).f().f28547id == user.f28547id) {
                    oq N3 = m6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.f38303e = L3;
                    N3.f38304f = L4;
                    m6.B1(N3, m6.w0(i10, h6Var), false);
                    m6.B1(N3, m6.w0(i11, h6Var), true);
                    q9Var.setImageDrawable(N3);
                } else {
                    q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                    q9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                if (v3.Y(chat)) {
                    f10 = 10.0f;
                }
                imageReceiver.J0(org.telegram.messenger.g0.L(f10));
                q9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            q9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        o0 o0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        h6 h6Var = this.f17587a;
        if (z10) {
            m6.C1(m6.w0(m6.Ti, h6Var), getBackground());
            invalidate();
        } else {
            setBackground(m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(m6.Ti, h6Var)));
        }
        TextView textView = this.f17589c;
        if (textView != null) {
            textView.setTextColor(m6.w0(m6.G6, h6Var));
        }
        oq oqVar = this.d;
        if (oqVar != null && (o0Var = this.f17590e) != null) {
            if (o0Var.d == 7) {
                m6.B1(oqVar, m6.w0(m6.Fi, h6Var), false);
                m6.B1(this.d, m6.w0(m6.Ji, h6Var), true);
                return;
            }
            m6.B1(oqVar, m6.w0(m6.Fi, h6Var), false);
            m6.B1(this.d, m6.w0(m6.Ji, h6Var), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

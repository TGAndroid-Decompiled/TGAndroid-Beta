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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xp;
public final class n0 extends FrameLayout implements a6 {
    public final f6 f16860a;
    public final l9 f16861b;
    public final TextView f16862c;
    public xp d;
    public o0 f16863e;

    public n0(Context context, f6 f6Var) {
        super(context);
        this.f16860a = f6Var;
        l9 l9Var = new l9(context);
        this.f16861b = l9Var;
        addView(l9Var, ha.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f16862c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.f16863e = o0Var;
        l9 l9Var = this.f16861b;
        l9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.f16872c;
        TextView textView = this.f16862c;
        f6 f6Var = this.f16860a;
        float f10 = 16.0f;
        if (i7 == 7) {
            xp N = k6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.f40355e = L;
            N.f40356f = L2;
            k6.B1(this.d, k6.w0(k6.Ci, f6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, f6Var), true);
            l9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        xp N2 = k6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f16870a);
        this.d = N2;
        int i10 = k6.Ci;
        k6.B1(N2, k6.w0(i10, f6Var), false);
        xp xpVar = this.d;
        int i11 = k6.Gi;
        k6.B1(xpVar, k6.w0(i11, f6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f16874f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (p10.i(p10.f24470s0).f().f27105id == user.f27105id) {
                    xp N3 = k6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.f40355e = L3;
                    N3.f40356f = L4;
                    k6.B1(N3, k6.w0(i10, f6Var), false);
                    k6.B1(N3, k6.w0(i11, f6Var), true);
                    l9Var.setImageDrawable(N3);
                } else {
                    l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                    l9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                if (t3.Y(chat)) {
                    f10 = 10.0f;
                }
                imageReceiver.J0(org.telegram.messenger.g0.L(f10));
                l9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            l9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        o0 o0Var;
        boolean z9 = getBackground() instanceof ShapeDrawable;
        f6 f6Var = this.f16860a;
        if (z9) {
            k6.C1(k6.w0(k6.Qi, f6Var), getBackground());
            invalidate();
        } else {
            setBackground(k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Qi, f6Var)));
        }
        TextView textView = this.f16862c;
        if (textView != null) {
            textView.setTextColor(k6.w0(k6.G6, f6Var));
        }
        xp xpVar = this.d;
        if (xpVar != null && (o0Var = this.f16863e) != null) {
            if (o0Var.d == 7) {
                k6.B1(xpVar, k6.w0(k6.Ci, f6Var), false);
                k6.B1(this.d, k6.w0(k6.Gi, f6Var), true);
                return;
            }
            k6.B1(xpVar, k6.w0(k6.Ci, f6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, f6Var), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

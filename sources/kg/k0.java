package kg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.h10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xp;
public final class k0 extends FrameLayout implements z5 {
    public final e6 f17071a;
    public final k9 f17072b;
    public final TextView f17073c;
    public xp d;
    public l0 f17074e;

    public k0(Context context, e6 e6Var) {
        super(context);
        this.f17071a = e6Var;
        k9 k9Var = new k9(context);
        this.f17072b = k9Var;
        addView(k9Var, mf.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f17073c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, mf.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(l0 l0Var) {
        this.f17074e = l0Var;
        k9 k9Var = this.f17072b;
        k9Var.getImageReceiver().f();
        int i3 = l0Var.d;
        String str = l0Var.f17082c;
        TextView textView = this.f17073c;
        e6 e6Var = this.f17071a;
        float f10 = 16.0f;
        if (i3 == 7) {
            xp N = k6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.f40441e = L;
            N.f40442f = L2;
            k6.B1(this.d, k6.w0(k6.Ci, e6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, e6Var), true);
            k9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        xp N2 = k6.N(org.telegram.messenger.g0.L(32.0f), l0Var.f17080a);
        this.d = N2;
        int i10 = k6.Ci;
        k6.B1(N2, k6.w0(i10, e6Var), false);
        xp xpVar = this.d;
        int i11 = k6.Gi;
        k6.B1(xpVar, k6.w0(i11, e6Var), true);
        if (l0Var.d == 4) {
            TLObject tLObject = l0Var.f17084f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (h10.i(h10.f22829t0).f().f27150id == user.f27150id) {
                    xp N3 = k6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.f40441e = L3;
                    N3.f40442f = L4;
                    k6.B1(N3, k6.w0(i10, e6Var), false);
                    k6.B1(N3, k6.w0(i11, e6Var), true);
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
        l0 l0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        e6 e6Var = this.f17071a;
        if (z10) {
            k6.C1(k6.w0(k6.Qi, e6Var), getBackground());
            invalidate();
        } else {
            setBackground(k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Qi, e6Var)));
        }
        TextView textView = this.f17073c;
        if (textView != null) {
            textView.setTextColor(k6.w0(k6.G6, e6Var));
        }
        xp xpVar = this.d;
        if (xpVar != null && (l0Var = this.f17074e) != null) {
            if (l0Var.d == 7) {
                k6.B1(xpVar, k6.w0(k6.Ci, e6Var), false);
                k6.B1(this.d, k6.w0(k6.Gi, e6Var), true);
                return;
            }
            k6.B1(xpVar, k6.w0(k6.Ci, e6Var), false);
            k6.B1(this.d, k6.w0(k6.Gi, e6Var), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

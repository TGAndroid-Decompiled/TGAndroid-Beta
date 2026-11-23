package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
public final class n0 extends FrameLayout implements c6 {
    public final i6 f17689a;
    public final p9 f17690b;
    public final TextView f17691c;
    public lq d;
    public o0 f17692e;

    public n0(Context context, i6 i6Var) {
        super(context);
        this.f17689a = i6Var;
        p9 p9Var = new p9(context);
        this.f17690b = p9Var;
        addView(p9Var, na.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f17691c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, na.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.f17692e = o0Var;
        p9 p9Var = this.f17690b;
        p9Var.getImageReceiver().f();
        int i7 = o0Var.d;
        String str = o0Var.f17700c;
        TextView textView = this.f17691c;
        i6 i6Var = this.f17689a;
        float f10 = 16.0f;
        if (i7 == 7) {
            lq N = n6.N(org.telegram.messenger.g0.L(32.0f), 2131230995);
            this.d = N;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N.f37198e = L;
            N.f37199f = L2;
            n6.B1(this.d, n6.w0(n6.Fi, i6Var), false);
            n6.B1(this.d, n6.w0(n6.Ji, i6Var), true);
            p9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        lq N2 = n6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f17698a);
        this.d = N2;
        int i10 = n6.Fi;
        n6.B1(N2, n6.w0(i10, i6Var), false);
        lq lqVar = this.d;
        int i11 = n6.Ji;
        n6.B1(lqVar, n6.w0(i11, i6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f17702f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (i10.i(i10.f24637t0).f().f28641id == user.f28641id) {
                    lq N3 = n6.N(org.telegram.messenger.g0.L(32.0f), 2131231002);
                    int L3 = org.telegram.messenger.g0.L(16.0f);
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    N3.f37198e = L3;
                    N3.f37199f = L4;
                    n6.B1(N3, n6.w0(i10, i6Var), false);
                    n6.B1(N3, n6.w0(i11, i6Var), true);
                    p9Var.setImageDrawable(N3);
                } else {
                    p9Var.getImageReceiver().K0(org.telegram.messenger.g0.L(16.0f));
                    p9Var.getImageReceiver().j0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                if (v3.Y(chat)) {
                    f10 = 10.0f;
                }
                imageReceiver.K0(org.telegram.messenger.g0.L(f10));
                p9Var.getImageReceiver().j0(chat, this.d, null);
            }
        } else {
            p9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        o0 o0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        i6 i6Var = this.f17689a;
        if (z10) {
            n6.C1(n6.w0(n6.Ti, i6Var), getBackground());
            invalidate();
        } else {
            setBackground(n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(n6.Ti, i6Var)));
        }
        TextView textView = this.f17691c;
        if (textView != null) {
            textView.setTextColor(n6.w0(n6.G6, i6Var));
        }
        lq lqVar = this.d;
        if (lqVar != null && (o0Var = this.f17692e) != null) {
            if (o0Var.d == 7) {
                n6.B1(lqVar, n6.w0(n6.Fi, i6Var), false);
                n6.B1(this.d, n6.w0(n6.Ji, i6Var), true);
                return;
            }
            n6.B1(lqVar, n6.w0(n6.Fi, i6Var), false);
            n6.B1(this.d, n6.w0(n6.Ji, i6Var), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

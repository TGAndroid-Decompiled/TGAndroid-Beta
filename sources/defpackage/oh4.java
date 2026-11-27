package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh4 extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final TextView c;
    public zm2 d;
    public ph4 e;

    public oh4(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        de0 de0Var = new de0(context);
        this.b = de0Var;
        addView(de0Var, tre.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, tre.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(ph4 ph4Var) {
        this.e = ph4Var;
        de0 de0Var = this.b;
        de0Var.getImageReceiver().f();
        byte b = ph4Var.d;
        String str = ph4Var.c;
        TextView textView = this.c;
        vnb vnbVar = this.a;
        float f = 16.0f;
        if (b == 7) {
            zm2 M = aob.M(hl.L(32.0f), 2131230995);
            this.d = M;
            int L = hl.L(16.0f);
            int L2 = hl.L(16.0f);
            M.e = L;
            M.f = L2;
            aob.z1(this.d, aob.v0(aob.Fi, vnbVar), false);
            aob.z1(this.d, aob.v0(aob.Ji, vnbVar), true);
            de0Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        zm2 M2 = aob.M(hl.L(32.0f), ph4Var.a);
        this.d = M2;
        int i = aob.Fi;
        aob.z1(M2, aob.v0(i, vnbVar), false);
        zm2 zm2Var = this.d;
        int i2 = aob.Ji;
        aob.z1(zm2Var, aob.v0(i2, vnbVar), true);
        if (ph4Var.d == 4) {
            TLObject tLObject = ph4Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (yac.h(yac.t0).f().id == user.id) {
                    zm2 M3 = aob.M(hl.L(32.0f), 2131231002);
                    int L3 = hl.L(16.0f);
                    int L4 = hl.L(16.0f);
                    M3.e = L3;
                    M3.f = L4;
                    aob.z1(M3, aob.v0(i, vnbVar), false);
                    aob.z1(M3, aob.v0(i2, vnbVar), true);
                    de0Var.setImageDrawable(M3);
                } else {
                    de0Var.getImageReceiver().q0(hl.L(16.0f));
                    de0Var.getImageReceiver().U(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = de0Var.getImageReceiver();
                if (xc2.Y(chat)) {
                    f = 10.0f;
                }
                imageReceiver.q0(hl.L(f));
                de0Var.getImageReceiver().U(chat, this.d, null);
            }
        } else {
            de0Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        ph4 ph4Var;
        boolean z = getBackground() instanceof ShapeDrawable;
        vnb vnbVar = this.a;
        if (z) {
            aob.A1(aob.v0(aob.Ti, vnbVar), getBackground());
            invalidate();
        } else {
            setBackground(aob.b0(hl.L(28.0f), aob.v0(aob.Ti, vnbVar)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(aob.v0(aob.G6, vnbVar));
        }
        zm2 zm2Var = this.d;
        if (zm2Var != null && (ph4Var = this.e) != null) {
            if (ph4Var.d == 7) {
                aob.z1(zm2Var, aob.v0(aob.Fi, vnbVar), false);
                aob.z1(this.d, aob.v0(aob.Ji, vnbVar), true);
                return;
            }
            aob.z1(zm2Var, aob.v0(aob.Fi, vnbVar), false);
            aob.z1(this.d, aob.v0(aob.Ji, vnbVar), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

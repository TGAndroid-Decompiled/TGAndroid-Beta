package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh4 extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final TextView c;
    public sn2 d;
    public sh4 e;

    public rh4(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        addView(bf0Var, qoe.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, qoe.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(sh4 sh4Var) {
        this.e = sh4Var;
        bf0 bf0Var = this.b;
        bf0Var.getImageReceiver().f();
        byte b = sh4Var.d;
        String str = sh4Var.c;
        TextView textView = this.c;
        ylb ylbVar = this.a;
        float f = 16.0f;
        if (b == 7) {
            sn2 M = cmb.M(gm.L(32.0f), 2131230996);
            this.d = M;
            int L = gm.L(16.0f);
            int L2 = gm.L(16.0f);
            M.e = L;
            M.f = L2;
            cmb.z1(this.d, cmb.v0(cmb.Ei, ylbVar), false);
            cmb.z1(this.d, cmb.v0(cmb.Ii, ylbVar), true);
            bf0Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        sn2 M2 = cmb.M(gm.L(32.0f), sh4Var.a);
        this.d = M2;
        int i = cmb.Ei;
        cmb.z1(M2, cmb.v0(i, ylbVar), false);
        sn2 sn2Var = this.d;
        int i2 = cmb.Ii;
        cmb.z1(sn2Var, cmb.v0(i2, ylbVar), true);
        if (sh4Var.d == 4) {
            TLObject tLObject = sh4Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (z8c.h(z8c.t0).f().id == user.id) {
                    sn2 M3 = cmb.M(gm.L(32.0f), 2131231003);
                    int L3 = gm.L(16.0f);
                    int L4 = gm.L(16.0f);
                    M3.e = L3;
                    M3.f = L4;
                    cmb.z1(M3, cmb.v0(i, ylbVar), false);
                    cmb.z1(M3, cmb.v0(i2, ylbVar), true);
                    bf0Var.setImageDrawable(M3);
                } else {
                    bf0Var.getImageReceiver().q0(gm.L(16.0f));
                    bf0Var.getImageReceiver().U(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = bf0Var.getImageReceiver();
                if (sd2.Y(chat)) {
                    f = 10.0f;
                }
                imageReceiver.q0(gm.L(f));
                bf0Var.getImageReceiver().U(chat, this.d, null);
            }
        } else {
            bf0Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        sh4 sh4Var;
        boolean z = getBackground() instanceof ShapeDrawable;
        ylb ylbVar = this.a;
        if (z) {
            cmb.A1(cmb.v0(cmb.Si, ylbVar), getBackground());
            invalidate();
        } else {
            setBackground(cmb.b0(gm.L(28.0f), cmb.v0(cmb.Si, ylbVar)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(cmb.v0(cmb.F6, ylbVar));
        }
        sn2 sn2Var = this.d;
        if (sn2Var != null && (sh4Var = this.e) != null) {
            if (sh4Var.d == 7) {
                cmb.z1(sn2Var, cmb.v0(cmb.Ei, ylbVar), false);
                cmb.z1(this.d, cmb.v0(cmb.Ii, ylbVar), true);
                return;
            }
            cmb.z1(sn2Var, cmb.v0(cmb.Ei, ylbVar), false);
            cmb.z1(this.d, cmb.v0(cmb.Ii, ylbVar), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

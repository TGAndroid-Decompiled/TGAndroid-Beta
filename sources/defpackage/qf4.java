package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qf4 extends FrameLayout implements tjb {
    public final wjb a;
    public final be0 b;
    public final TextView c;
    public fm2 d;
    public rf4 e;

    public qf4(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        be0 be0Var = new be0(context);
        this.b = be0Var;
        addView(be0Var, nme.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, nme.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(rf4 rf4Var) {
        this.e = rf4Var;
        be0 be0Var = this.b;
        be0Var.getImageReceiver().f();
        byte b = rf4Var.d;
        String str = rf4Var.c;
        TextView textView = this.c;
        wjb wjbVar = this.a;
        float f = 16.0f;
        if (b == 7) {
            fm2 M = bkb.M(gl.L(32.0f), 2131230995);
            this.d = M;
            int L = gl.L(16.0f);
            int L2 = gl.L(16.0f);
            M.e = L;
            M.f = L2;
            bkb.z1(this.d, bkb.v0(bkb.Ei, wjbVar), false);
            bkb.z1(this.d, bkb.v0(bkb.Ii, wjbVar), true);
            be0Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        fm2 M2 = bkb.M(gl.L(32.0f), rf4Var.a);
        this.d = M2;
        int i = bkb.Ei;
        bkb.z1(M2, bkb.v0(i, wjbVar), false);
        fm2 fm2Var = this.d;
        int i2 = bkb.Ii;
        bkb.z1(fm2Var, bkb.v0(i2, wjbVar), true);
        if (rf4Var.d == 4) {
            TLObject tLObject = rf4Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (y6c.h(y6c.t0).f().id == user.id) {
                    fm2 M3 = bkb.M(gl.L(32.0f), 2131231002);
                    int L3 = gl.L(16.0f);
                    int L4 = gl.L(16.0f);
                    M3.e = L3;
                    M3.f = L4;
                    bkb.z1(M3, bkb.v0(i, wjbVar), false);
                    bkb.z1(M3, bkb.v0(i2, wjbVar), true);
                    be0Var.setImageDrawable(M3);
                } else {
                    be0Var.getImageReceiver().q0(gl.L(16.0f));
                    be0Var.getImageReceiver().U(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = be0Var.getImageReceiver();
                if (hc2.Y(chat)) {
                    f = 10.0f;
                }
                imageReceiver.q0(gl.L(f));
                be0Var.getImageReceiver().U(chat, this.d, null);
            }
        } else {
            be0Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        rf4 rf4Var;
        boolean z = getBackground() instanceof ShapeDrawable;
        wjb wjbVar = this.a;
        if (z) {
            bkb.A1(bkb.v0(bkb.Si, wjbVar), getBackground());
            invalidate();
        } else {
            setBackground(bkb.b0(gl.L(28.0f), bkb.v0(bkb.Si, wjbVar)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(bkb.v0(bkb.F6, wjbVar));
        }
        fm2 fm2Var = this.d;
        if (fm2Var != null && (rf4Var = this.e) != null) {
            if (rf4Var.d == 7) {
                bkb.z1(fm2Var, bkb.v0(bkb.Ei, wjbVar), false);
                bkb.z1(this.d, bkb.v0(bkb.Ii, wjbVar), true);
                return;
            }
            bkb.z1(fm2Var, bkb.v0(bkb.Ei, wjbVar), false);
            bkb.z1(this.d, bkb.v0(bkb.Ii, wjbVar), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

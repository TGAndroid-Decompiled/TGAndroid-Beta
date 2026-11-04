package ei;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
public final class t0 extends FrameLayout {
    public final q0 f11032a;
    public final org.telegram.ui.Components.k9 f11033b;
    public final org.telegram.ui.Components.u8 f11034c;
    public final ImageView d;
    public final r0 f11035e;
    public v0 f11036f;

    public t0(Context context) {
        super(context);
        pf.a(this);
        q0 q0Var = new q0(this, context);
        this.f11032a = q0Var;
        q0Var.setOrientation(0);
        addView(q0Var, mf.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f11034c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f11033b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        q0Var.addView(k9Var, mf.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        q0Var.addView(imageView, mf.t(18, 18, 19, 0, 0, 3, 0));
        r0 r0Var = new r0(context);
        this.f11035e = r0Var;
        r0Var.setLines(1);
        r0Var.setSingleLine();
        r0Var.setTextColor(-1);
        r0Var.setTextSize(1, 14.0f);
        r0Var.setTypeface(org.telegram.messenger.g0.o());
        q0Var.addView(r0Var, mf.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(v0 v0Var) {
        this.f11036f = v0Var;
        int i3 = (v0Var.f11106b > 0L ? 1 : (v0Var.f11106b == 0L ? 0 : -1));
        org.telegram.ui.Components.k9 k9Var = this.f11033b;
        org.telegram.ui.Components.u8 u8Var = this.f11034c;
        if (i3 >= 0) {
            TLRPC.User a22 = hp.s1(h10.f22829t0).a2(Long.valueOf(v0Var.f11106b));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
        } else {
            TLRPC.Chat M0 = hp.s1(h10.f22829t0).M0(Long.valueOf(-v0Var.f11106b));
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
        }
        int i10 = v0Var.f11108e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new l0(getContext(), v0Var.f11108e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f11035e.setText(org.telegram.messenger.m5.l(h10.f22829t0, v0Var.f11106b));
        this.f11032a.invalidate();
    }
}

package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class lm1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final String c;

    public lm1(yv1 yv1Var, String str, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V8(this.c);
                return;
            case 1:
                yv1 yv1Var = this.b;
                String str = this.c;
                yv1Var.getClass();
                if (str != null && str.length() != 0) {
                    yv1Var.getMessagesController().G4(str, yv1Var.f);
                    return;
                } else {
                    yv1Var.getSendMessagesHelper().q0(y5a.b("/start", yv1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    return;
                }
            case 2:
                this.b.Ba(this.c);
                return;
            case 3:
                l11.u(this.b.getParentActivity(), "tel:".concat(this.c));
                return;
            case 4:
                yv1 yv1Var2 = this.b;
                gm.g(this.c);
                c41.b0(yv1Var2).i(jb6.M0(2131747028, null)).j();
                return;
            case 5:
                this.b.W8(this.c);
                return;
            case 6:
                l11.u(this.b.getParentActivity(), "tel:".concat(this.c));
                return;
            case 7:
                yv1 yv1Var3 = this.b;
                gm.g(this.c);
                c41.b0(yv1Var3).i(jb6.M0(2131747028, null)).j();
                return;
            case 8:
                this.b.sa(this.c, false);
                return;
            case 9:
                yv1 yv1Var4 = this.b;
                String str2 = this.c;
                yv1Var4.getClass();
                yv1Var4.presentFragment(new rrc(str2));
                return;
            case 10:
                yv1 yv1Var5 = this.b;
                String str3 = this.c;
                String str4 = yv1Var5.getMessagesController().l4.G1.f;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "https://tonviewer.com/";
                } else if (!str4.endsWith("/")) {
                    str4 = str4.concat("/");
                }
                Activity parentActivity = yv1Var5.getParentActivity();
                l11.w(parentActivity, str4 + Uri.encode(str3), false);
                return;
            default:
                l11.u(this.b.getParentActivity(), "https://fragment.com/username/".concat(this.c));
                return;
        }
    }
}

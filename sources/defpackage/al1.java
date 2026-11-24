package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class al1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final String c;

    public al1(mu1 mu1Var, String str, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G8(this.c);
                return;
            case 1:
                this.b.H8(this.c);
                return;
            case 2:
                this.b.J8(this.c);
                return;
            case 3:
                mu1 mu1Var = this.b;
                String str = this.c;
                mu1Var.getClass();
                if (str != null && str.length() != 0) {
                    mu1Var.getMessagesController().D4(str, mu1Var.f);
                    return;
                } else {
                    mu1Var.getSendMessagesHelper().q0(x3a.b("/start", mu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    return;
                }
            case 4:
                this.b.pa(this.c);
                return;
            case 5:
                mu1 mu1Var2 = this.b;
                String str2 = this.c;
                mu1Var2.getClass();
                mu1Var2.presentFragment(new qpc(str2));
                return;
            case 6:
                mu1 mu1Var3 = this.b;
                String str3 = this.c;
                String str4 = mu1Var3.getMessagesController().k4.G1.f;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "https://tonviewer.com/";
                } else if (!str4.endsWith("/")) {
                    str4 = str4.concat("/");
                }
                Activity parentActivity = mu1Var3.getParentActivity();
                d01.v(parentActivity, str4 + Uri.encode(str3), false);
                return;
            case 7:
                this.b.ga(this.c, false);
                return;
            case 8:
                d01.t(this.b.getParentActivity(), "tel:".concat(this.c));
                return;
            case 9:
                mu1 mu1Var4 = this.b;
                gl.g(this.c);
                u21.b0(mu1Var4).i(k96.M0(2131747102, null)).j();
                return;
            case 10:
                this.b.K8(this.c);
                return;
            case 11:
                d01.t(this.b.getParentActivity(), "tel:".concat(this.c));
                return;
            case 12:
                mu1 mu1Var5 = this.b;
                gl.g(this.c);
                u21.b0(mu1Var5).i(k96.M0(2131747102, null)).j();
                return;
            default:
                d01.t(this.b.getParentActivity(), "https://fragment.com/username/".concat(this.c));
                return;
        }
    }
}

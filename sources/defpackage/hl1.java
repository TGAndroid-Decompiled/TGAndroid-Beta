package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class hl1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final String c;

    public hl1(zu1 zu1Var, String str, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                zu1 zu1Var = this.b;
                String str = this.c;
                zu1Var.getClass();
                if (str != null && str.length() != 0) {
                    zu1Var.getMessagesController().M4(str, zu1Var.f);
                    return;
                } else {
                    zu1Var.getSendMessagesHelper().q0(p7a.b("/start", zu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    return;
                }
            case 1:
                this.b.Ca(this.c);
                return;
            case 2:
                this.b.W8(this.c);
                return;
            case 3:
                this.b.ta(this.c, false);
                return;
            case 4:
                zu1 zu1Var2 = this.b;
                String str2 = this.c;
                zu1Var2.getClass();
                zu1Var2.presentFragment(new euc(str2));
                return;
            case 5:
                zu1 zu1Var3 = this.b;
                String str3 = this.c;
                String str4 = zu1Var3.getMessagesController().l4.O1.f;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "https://tonviewer.com/";
                } else if (!str4.endsWith("/")) {
                    str4 = str4.concat("/");
                }
                Activity parentActivity = zu1Var3.getParentActivity();
                m01.w(parentActivity, str4 + Uri.encode(str3), false);
                return;
            case 6:
                m01.u(this.b.getParentActivity(), "tel:".concat(this.c));
                return;
            case 7:
                zu1 zu1Var4 = this.b;
                hl.g(this.c);
                d31.b0(zu1Var4).i(ob6.M0(2131747022, null)).j();
                return;
            case 8:
                this.b.X8(this.c);
                return;
            case 9:
                m01.u(this.b.getParentActivity(), "tel:".concat(this.c));
                return;
            case 10:
                zu1 zu1Var5 = this.b;
                hl.g(this.c);
                d31.b0(zu1Var5).i(ob6.M0(2131747022, null)).j();
                return;
            default:
                m01.u(this.b.getParentActivity(), "https://fragment.com/username/".concat(this.c));
                return;
        }
    }
}

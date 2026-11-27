package defpackage;

import android.view.View;
import android.widget.Toast;
public final class jba implements View.OnClickListener {
    public final byte a;
    public final tba b;

    public jba(tba tbaVar, byte b) {
        this.a = b;
        this.b = tbaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        tba tbaVar = this.b;
        switch (b) {
            case 0:
                m01.u(tbaVar.getParentActivity(), tbaVar.getMessagesController().k4.w2.f);
                tbaVar.getMessagesController().v4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                tbaVar.getClass();
                tbaVar.presentFragment(new v8(3));
                return;
            case 2:
                tbaVar.getMessagesController().v4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                tbaVar.getClass();
                tbaVar.presentFragment(new o7c(8, null));
                return;
            case 4:
                tbaVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                tbaVar.c0();
                return;
            default:
                int i = tbaVar.R + 1;
                tbaVar.R = i;
                if (i < 2) {
                    boolean z = f11.a;
                    try {
                        Toast.makeText(tbaVar.getParentActivity(), ob6.M0(2131751590, null), 0).show();
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                tbaVar.presentFragment(new n9c());
                return;
        }
    }
}

package defpackage;

import android.view.View;
import android.widget.Toast;
public final class jba implements View.OnClickListener {
    public final byte a;
    public final uba b;

    public jba(uba ubaVar, byte b) {
        this.a = b;
        this.b = ubaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        uba ubaVar = this.b;
        switch (b) {
            case 0:
                m01.u(ubaVar.getParentActivity(), ubaVar.getMessagesController().l4.w2.f);
                ubaVar.getMessagesController().v4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                ubaVar.getClass();
                ubaVar.presentFragment(new v8(3));
                return;
            case 2:
                ubaVar.getMessagesController().v4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                ubaVar.getClass();
                ubaVar.presentFragment(new o7c(8, null));
                return;
            case 4:
                ubaVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                ubaVar.c0();
                return;
            default:
                int i = ubaVar.R + 1;
                ubaVar.R = i;
                if (i < 2) {
                    boolean z = f11.a;
                    try {
                        Toast.makeText(ubaVar.getParentActivity(), ob6.M0(2131751590, null), 0).show();
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                ubaVar.presentFragment(new n9c());
                return;
        }
    }
}

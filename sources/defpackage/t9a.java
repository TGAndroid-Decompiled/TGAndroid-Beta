package defpackage;

import android.view.View;
import android.widget.Toast;
public final class t9a implements View.OnClickListener {
    public final byte a;
    public final daa b;

    public t9a(daa daaVar, byte b) {
        this.a = b;
        this.b = daaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        daa daaVar = this.b;
        switch (b) {
            case 0:
                l11.u(daaVar.getParentActivity(), daaVar.getMessagesController().l4.o2.f);
                daaVar.getMessagesController().p4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                daaVar.getClass();
                daaVar.presentFragment(new u8(3));
                return;
            case 2:
                daaVar.getMessagesController().p4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                daaVar.getClass();
                daaVar.presentFragment(new p5c(8, null));
                return;
            case 4:
                daaVar.getMessagesController().p4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                daaVar.d0();
                return;
            default:
                int i = daaVar.R + 1;
                daaVar.R = i;
                if (i < 2) {
                    boolean z = e21.a;
                    try {
                        Toast.makeText(daaVar.getParentActivity(), jb6.M0(2131751562, null), 0).show();
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                daaVar.presentFragment(new n7c());
                return;
        }
    }
}

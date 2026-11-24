package defpackage;

import android.view.View;
import android.widget.Toast;
public final class s7a implements View.OnClickListener {
    public final byte a;
    public final d8a b;

    public s7a(d8a d8aVar, byte b) {
        this.a = b;
        this.b = d8aVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        d8a d8aVar = this.b;
        switch (b) {
            case 0:
                d01.t(d8aVar.getParentActivity(), d8aVar.getMessagesController().k4.o2.f);
                d8aVar.getMessagesController().n4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                d8aVar.getClass();
                d8aVar.presentFragment(new u8(3));
                return;
            case 2:
                d8aVar.getMessagesController().n4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                d8aVar.getClass();
                d8aVar.presentFragment(new p3c(8, null));
                return;
            case 4:
                d8aVar.getMessagesController().n4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                d8aVar.c0();
                return;
            default:
                int i = d8aVar.R + 1;
                d8aVar.R = i;
                if (i < 2) {
                    boolean z = w01.a;
                    try {
                        Toast.makeText(d8aVar.getParentActivity(), k96.M0(2131751613, null), 0).show();
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                d8aVar.presentFragment(new n5c());
                return;
        }
    }
}

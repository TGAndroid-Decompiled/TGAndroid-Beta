package defpackage;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class me implements View.OnClickListener {
    public final byte a;
    public final TLRPC.User b;
    public final d c;
    public final AlertDialog$Builder d;

    public me(TLRPC.User user, d dVar, AlertDialog$Builder alertDialog$Builder, byte b) {
        this.a = b;
        this.b = user;
        this.c = dVar;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        AlertDialog$Builder alertDialog$Builder = this.d;
        d dVar = this.c;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                if (dVar.getMessagesController().A(bundle, dVar, null, null)) {
                    dVar.presentFragment(new ProfileActivity(bundle, null));
                }
                alertDialog$Builder.a.M0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                if (dVar.getMessagesController().A(bundle2, dVar, null, null)) {
                    dVar.presentFragment(new ProfileActivity(bundle2, null));
                }
                alertDialog$Builder.a.M0.run();
                return;
        }
    }
}

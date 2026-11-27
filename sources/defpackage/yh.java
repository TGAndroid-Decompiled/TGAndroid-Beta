package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yh extends f8c {
    public final AlertDialog$Builder e;

    public yh(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (rmb) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.a.M0.run();
        super.onClick(view);
    }
}

package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class sgb extends FrameLayout {
    public TextView a;
    public rgb b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        rgb rgbVar = this.b;
        int i = this.d;
        oz5 oz5Var = (oz5) rgbVar;
        oz5Var.getClass();
        y6c.h(i).a0 = null;
        y6c.h(i).u(false);
        LaunchActivity launchActivity = oz5Var.a;
        ArrayList arrayList = launchActivity.e0;
        if (!arrayList.isEmpty()) {
            ((d) b00.f(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(gl.G).withEndAction(new tp5(oz5Var, (byte) 8)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ce2((byte) 0));
    }

    public void setDelegate(rgb rgbVar) {
        this.b = rgbVar;
    }
}

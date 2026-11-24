package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.ActionBar.d;
public final class dg implements ed {
    public final byte a;
    public final String b;
    public final d c;

    public dg(byte b, String str, d dVar) {
        this.a = b;
        this.b = str;
        this.c = dVar;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        d dVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", qu2.r(dVar.getCurrentAccount()).s(1));
                    dVar.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                try {
                    dVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}

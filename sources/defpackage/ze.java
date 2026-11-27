package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.ActionBar.e;
public final class ze implements fd {
    public final byte a;
    public final String b;
    public final e c;

    public ze(byte b, String str, e eVar) {
        this.a = b;
        this.b = str;
        this.c = eVar;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        e eVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", lv2.r(eVar.getCurrentAccount()).s(1));
                    eVar.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                try {
                    eVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}

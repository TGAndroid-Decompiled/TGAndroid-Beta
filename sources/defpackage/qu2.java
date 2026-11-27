package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import java.io.OutputStreamWriter;
import org.telegram.messenger.GcmPushListenerService;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SmsReceiver;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
public final class qu2 implements Runnable {
    public final byte a;
    public final String b;

    public qu2(uzc uzcVar, String str) {
        this.a = (byte) 9;
        this.b = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Uri parse = Uri.parse(this.b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                a.b.getContentResolver().update(parse, contentValues, null, null);
                return;
            case 1:
                ea4.h(this.b).d(0L);
                return;
            case 2:
                String str = this.b;
                try {
                    OutputStreamWriter outputStreamWriter = cc4.j().a;
                    outputStreamWriter.write(cc4.j().b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    cc4.j().a.flush();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 3:
                String str2 = this.b;
                try {
                    OutputStreamWriter outputStreamWriter2 = cc4.j().a;
                    outputStreamWriter2.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    cc4.j().a.flush();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 4:
                String str3 = this.b;
                try {
                    OutputStreamWriter outputStreamWriter3 = cc4.j().a;
                    outputStreamWriter3.write(cc4.j().b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    cc4.j().a.flush();
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    if (hl.D1(e3)) {
                        LaunchActivity.F(1);
                        return;
                    }
                    return;
                }
            case 5:
                String str4 = this.b;
                int i = GcmPushListenerService.n;
                if (f11.a) {
                    cc4.b("Refreshed FCM token: " + str4);
                }
                a.v();
                PushListenerController.sendRegistrationToServer(2, str4);
                return;
            case 6:
                String str5 = this.b;
                p35 p35Var = tne.b;
                if (p35Var != null && str5.equals(p35Var.d)) {
                    tne.b.c("STORAGE_CANCELED");
                    tne.b.e();
                    return;
                }
                return;
            case 7:
                String str6 = this.b;
                int i2 = SmsReceiver.a;
                jn7.e().k(261, str6);
                return;
            case 8:
                hl.g(this.b);
                return;
            default:
                throw null;
        }
    }

    public qu2(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}

package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.io.OutputStreamWriter;
import org.telegram.ui.LaunchActivity;
public final class l4 implements Runnable {
    public final int f23831a;
    public final String f23832b;

    public l4(String str, int i7) {
        this.f23831a = i7;
        this.f23832b = str;
    }

    @Override
    public final void run() {
        switch (this.f23831a) {
            case 0:
                Uri parse = Uri.parse(this.f23832b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                t0.f25555b.getContentResolver().update(parse, contentValues, null, null);
                return;
            case 1:
                String str = this.f23832b;
                try {
                    OutputStreamWriter outputStreamWriter = a8.j().f21400a;
                    outputStreamWriter.write(a8.j().f21401b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    a8.j().f21400a.flush();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 2:
                String str2 = this.f23832b;
                try {
                    OutputStreamWriter outputStreamWriter2 = a8.j().f21400a;
                    outputStreamWriter2.write(a8.j().f21401b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    a8.j().f21400a.flush();
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 3:
                String str3 = this.f23832b;
                try {
                    OutputStreamWriter outputStreamWriter3 = a8.j().f21400a;
                    outputStreamWriter3.write(a8.j().f21401b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    a8.j().f21400a.flush();
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    if (g0.F1(e12)) {
                        LaunchActivity.D(1);
                        return;
                    }
                    return;
                }
            case 4:
                String str4 = this.f23832b;
                int i7 = GcmPushListenerService.f21173n;
                if (r2.f25191a) {
                    a8.b("Refreshed FCM token: " + str4);
                }
                t0.w();
                PushListenerController.sendRegistrationToServer(2, str4);
                return;
            default:
                String str5 = this.f23832b;
                int i10 = SmsReceiver.f21329a;
                qs.e().k(257, str5);
                return;
        }
    }
}

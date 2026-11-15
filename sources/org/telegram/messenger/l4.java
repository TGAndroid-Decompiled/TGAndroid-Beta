package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.io.OutputStreamWriter;
import org.telegram.ui.LaunchActivity;
public final class l4 implements Runnable {
    public final int f24808a;
    public final String f24809b;

    public l4(String str, int i7) {
        this.f24808a = i7;
        this.f24809b = str;
    }

    @Override
    public final void run() {
        switch (this.f24808a) {
            case 0:
                Uri parse = Uri.parse(this.f24809b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                t0.f26609b.getContentResolver().update(parse, contentValues, null, null);
                return;
            case 1:
                String str = this.f24809b;
                try {
                    OutputStreamWriter outputStreamWriter = a8.j().f22475a;
                    outputStreamWriter.write(a8.j().f22476b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    a8.j().f22475a.flush();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 2:
                String str2 = this.f24809b;
                try {
                    OutputStreamWriter outputStreamWriter2 = a8.j().f22475a;
                    outputStreamWriter2.write(a8.j().f22476b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    a8.j().f22475a.flush();
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 3:
                String str3 = this.f24809b;
                try {
                    OutputStreamWriter outputStreamWriter3 = a8.j().f22475a;
                    outputStreamWriter3.write(a8.j().f22476b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    a8.j().f22475a.flush();
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
                String str4 = this.f24809b;
                int i7 = GcmPushListenerService.f22255n;
                if (r2.f26206a) {
                    a8.b("Refreshed FCM token: " + str4);
                }
                t0.w();
                PushListenerController.sendRegistrationToServer(2, str4);
                return;
            default:
                String str5 = this.f24809b;
                int i10 = SmsReceiver.f22412a;
                ns.e().k(257, str5);
                return;
        }
    }
}

package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.io.OutputStreamWriter;
import org.telegram.ui.LaunchActivity;
public final class l4 implements Runnable {
    public final int f23848a;
    public final String f23849b;

    public l4(String str, int i7) {
        this.f23848a = i7;
        this.f23849b = str;
    }

    @Override
    public final void run() {
        switch (this.f23848a) {
            case 0:
                Uri parse = Uri.parse(this.f23849b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                t0.f25570b.getContentResolver().update(parse, contentValues, null, null);
                return;
            case 1:
                String str = this.f23849b;
                try {
                    OutputStreamWriter outputStreamWriter = a8.j().f21403a;
                    outputStreamWriter.write(a8.j().f21404b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    a8.j().f21403a.flush();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 2:
                String str2 = this.f23849b;
                try {
                    OutputStreamWriter outputStreamWriter2 = a8.j().f21403a;
                    outputStreamWriter2.write(a8.j().f21404b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    a8.j().f21403a.flush();
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 3:
                String str3 = this.f23849b;
                try {
                    OutputStreamWriter outputStreamWriter3 = a8.j().f21403a;
                    outputStreamWriter3.write(a8.j().f21404b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    a8.j().f21403a.flush();
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
                String str4 = this.f23849b;
                int i7 = GcmPushListenerService.f21181n;
                if (r2.f25216a) {
                    a8.b("Refreshed FCM token: " + str4);
                }
                t0.w();
                PushListenerController.sendRegistrationToServer(2, str4);
                return;
            default:
                String str5 = this.f23849b;
                int i10 = SmsReceiver.f21337a;
                qs.e().k(257, str5);
                return;
        }
    }
}

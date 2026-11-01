package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.io.OutputStreamWriter;
import org.telegram.ui.LaunchActivity;
public final class o4 implements Runnable {
    public final int f17383a;
    public final String f17384b;

    public o4(String str, int i10) {
        this.f17383a = i10;
        this.f17384b = str;
    }

    @Override
    public final void run() {
        switch (this.f17383a) {
            case 0:
                Uri parse = Uri.parse(this.f17384b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                w0.f18945b.getContentResolver().update(parse, contentValues, null, null);
                return;
            case 1:
                String str = this.f17384b;
                try {
                    OutputStreamWriter outputStreamWriter = f8.j().f15709a;
                    outputStreamWriter.write(f8.j().f15710b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    f8.j().f15709a.flush();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 2:
                String str2 = this.f17384b;
                try {
                    OutputStreamWriter outputStreamWriter2 = f8.j().f15709a;
                    outputStreamWriter2.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    f8.j().f15709a.flush();
                    return;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
            case 3:
                String str3 = this.f17384b;
                try {
                    OutputStreamWriter outputStreamWriter3 = f8.j().f15709a;
                    outputStreamWriter3.write(f8.j().f15710b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    f8.j().f15709a.flush();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (i0.F1(e10)) {
                        LaunchActivity.D(1);
                        return;
                    }
                    return;
                }
            case 4:
                String str4 = this.f17384b;
                int i10 = GcmPushListenerService.f14365n;
                if (v2.f18578a) {
                    f8.b("Refreshed FCM token: " + str4);
                }
                w0.w();
                PushListenerController.sendRegistrationToServer(2, str4);
                return;
            default:
                String str5 = this.f17384b;
                int i11 = SmsReceiver.f14518a;
                at.e().k(257, str5);
                return;
        }
    }
}

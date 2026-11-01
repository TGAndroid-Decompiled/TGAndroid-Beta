package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SmsReceiver extends BroadcastReceiver {
    public static final int f14518a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        if (intent != null) {
            try {
                String str = "";
                SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("sms_hash", null);
                if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                    synchronized (i0.f16162k) {
                        z10 = i0.f16160j;
                    }
                    if (z10) {
                        str = (String) intent.getExtras().get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                    } else {
                        return;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    Matcher matcher = Pattern.compile("[0-9\\-]+").matcher(str);
                    if (matcher.find()) {
                        String replace = matcher.group(0).replace("-", "");
                        if (replace.length() >= 3) {
                            if (string != null) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putString("sms_hash_code", string + "|" + replace).commit();
                            }
                            i0.g3(new o4(replace, 5));
                        }
                    }
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
    }
}

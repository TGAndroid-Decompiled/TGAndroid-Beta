package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import org.telegram.PhoneFormat.PhoneFormat;

public class CallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String stripExceptNumbers = PhoneFormat.stripExceptNumbers(intent.getStringExtra("incoming_number"));
            SharedConfig.getPreferences().edit().putString("last_call_phone_number", stripExceptNumbers).putLong("last_call_time", System.currentTimeMillis()).apply();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceiveCall, stripExceptNumbers);
        }
    }

    public static String getLastReceivedCall() {
        String string = SharedConfig.getPreferences().getString("last_call_phone_number", null);
        if (string == null) {
            return null;
        }
        if (System.currentTimeMillis() - SharedConfig.getPreferences().getLong("last_call_time", 0L) < 54000000) {
            return string;
        }
        return null;
    }

    public static void checkLastReceivedCall() {
        String lastReceivedCall = getLastReceivedCall();
        if (lastReceivedCall != null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceiveCall, lastReceivedCall);
        }
    }

    public static void clearLastCall() {
        SharedConfig.getPreferences().edit().remove("last_call_phone_number").remove("last_call_time").apply();
    }
}

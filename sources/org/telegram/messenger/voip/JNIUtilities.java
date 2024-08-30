package org.telegram.messenger.voip;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import org.telegram.messenger.ApplicationLoader;

public class JNIUtilities {
    public static String[] getCarrierInfo() {
        String str;
        String str2;
        int defaultDataSubscriptionId;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 24) {
            defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            telephonyManager = telephonyManager.createForSubscriptionId(defaultDataSubscriptionId);
        }
        if (TextUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (networkOperator == null || networkOperator.length() <= 3) {
            str = "";
            str2 = "";
        } else {
            str = networkOperator.substring(0, 3);
            str2 = networkOperator.substring(3);
        }
        return new String[]{telephonyManager.getNetworkOperatorName(), telephonyManager.getNetworkCountryIso().toUpperCase(), str, str2};
    }

    public static java.lang.String getCurrentNetworkInterfaceName() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.JNIUtilities.getCurrentNetworkInterfaceName():java.lang.String");
    }

    public static java.lang.String[] getLocalNetworkAddressesAndInterfaceName() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.JNIUtilities.getLocalNetworkAddressesAndInterfaceName():java.lang.String[]");
    }

    public static int getMaxVideoResolution() {
        return 320;
    }

    public static String getSupportedVideoCodecs() {
        return "";
    }

    public static int[] getWifiInfo() {
        try {
            WifiInfo connectionInfo = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo();
            return new int[]{connectionInfo.getRssi(), connectionInfo.getLinkSpeed()};
        } catch (Exception unused) {
            return null;
        }
    }
}

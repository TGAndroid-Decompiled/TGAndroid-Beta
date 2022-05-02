package org.telegram.messenger.voip;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

public class JNIUtilities {
    public static int getMaxVideoResolution() {
        return 320;
    }

    public static String getSupportedVideoCodecs() {
        return "";
    }

    @TargetApi(R.styleable.MapAttrs_zOrderOnTop)
    public static String getCurrentNetworkInterfaceName() {
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) ApplicationLoader.applicationContext.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return null;
        }
        return linkProperties.getInterfaceName();
    }

    public static String[] getLocalNetworkAddressesAndInterfaceName() {
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) ApplicationLoader.applicationContext.getSystemService("connectivity");
        String str = null;
        if (Build.VERSION.SDK_INT >= 23) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
                return null;
            }
            String str2 = null;
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                InetAddress address = linkAddress.getAddress();
                if (address instanceof Inet4Address) {
                    if (!address.isLinkLocalAddress()) {
                        str = address.getHostAddress();
                    }
                } else if ((address instanceof Inet6Address) && !address.isLinkLocalAddress() && (address.getAddress()[0] & 240) != 240) {
                    str2 = address.getHostAddress();
                }
            }
            return new String[]{linkProperties.getInterfaceName(), str, str2};
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return null;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!nextElement.isLoopback() && nextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    String str3 = null;
                    String str4 = null;
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (nextElement2 instanceof Inet4Address) {
                            if (!nextElement2.isLinkLocalAddress()) {
                                str3 = nextElement2.getHostAddress();
                            }
                        } else if ((nextElement2 instanceof Inet6Address) && !nextElement2.isLinkLocalAddress() && (nextElement2.getAddress()[0] & 240) != 240) {
                            str4 = nextElement2.getHostAddress();
                        }
                    }
                    return new String[]{nextElement.getName(), str3, str4};
                }
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String[] getCarrierInfo() {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 24) {
            telephonyManager = telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId());
        }
        if (TextUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        String str2 = "";
        if (networkOperator == null || networkOperator.length() <= 3) {
            str = str2;
        } else {
            str2 = networkOperator.substring(0, 3);
            str = networkOperator.substring(3);
        }
        return new String[]{telephonyManager.getNetworkOperatorName(), telephonyManager.getNetworkCountryIso().toUpperCase(), str2, str};
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

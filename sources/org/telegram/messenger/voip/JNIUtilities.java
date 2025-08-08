package org.telegram.messenger.voip;

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
import java.util.Iterator;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public class JNIUtilities {
    public static int getMaxVideoResolution() {
        return 320;
    }

    public static String getCurrentNetworkInterfaceName() {
        Network activeNetwork;
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) ApplicationLoader.applicationContext.getSystemService("connectivity");
        activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return null;
        }
        return linkProperties.getInterfaceName();
    }

    public static String[] getLocalNetworkAddressesAndInterfaceName() {
        Network activeNetwork;
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) ApplicationLoader.applicationContext.getSystemService("connectivity");
        String str = null;
        if (Build.VERSION.SDK_INT >= 23) {
            activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
                return null;
            }
            Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            String str2 = null;
            while (it.hasNext()) {
                InetAddress address = it.next().getAddress();
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
        if (networkOperator != null && networkOperator.length() > 3) {
            str = networkOperator.substring(0, 3);
            str2 = networkOperator.substring(3);
        } else {
            str = "";
            str2 = "";
        }
        return new String[]{telephonyManager.getNetworkOperatorName(), telephonyManager.getNetworkCountryIso().toUpperCase(), str, str2};
    }

    public static int[] getWifiInfo() {
        try {
            WifiInfo connectionInfo = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo();
            return new int[]{connectionInfo.getRssi(), connectionInfo.getLinkSpeed()};
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getSupportedVideoCodecs() {
        return "";
    }
}

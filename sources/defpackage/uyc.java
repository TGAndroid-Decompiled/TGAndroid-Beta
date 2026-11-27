package defpackage;

import java.net.URI;
import java.security.SecureRandom;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
public final class uyc {
    public final sae a;
    public short b;

    public uyc() {
        ?? obj = new Object();
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
        this.a = obj;
    }

    public final ryc a(String str) {
        String str2;
        boolean z;
        String str3;
        int i;
        SocketFactory socketFactory;
        Matcher matcher;
        Matcher matcher2;
        short s = this.b;
        if (str != null) {
            if (s >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (s >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = ig7.a;
                        String host = create.getHost();
                        if (host == null) {
                            String rawAuthority = create.getRawAuthority();
                            if (rawAuthority != null && (matcher2 = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(rawAuthority)) != null && matcher2.matches()) {
                                host = matcher2.group(2);
                            } else {
                                host = null;
                            }
                            if (host == null) {
                                String uri = create.toString();
                                if (uri != null && (matcher = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(uri)) != null && matcher.matches()) {
                                    host = matcher.group(2);
                                } else {
                                    str2 = null;
                                    int port = create.getPort();
                                    String rawPath = create.getRawPath();
                                    String rawQuery = create.getRawQuery();
                                    if (scheme == null && scheme.length() != 0) {
                                        if (!"wss".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                                            if (!"ws".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                                                lq5.j("Bad scheme: ".concat(scheme));
                                                return null;
                                            }
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (str2 != null && str2.length() != 0) {
                                            if (rawPath == null || rawPath.length() == 0) {
                                                str3 = "/";
                                            } else {
                                                if (!rawPath.startsWith("/")) {
                                                    rawPath = "/".concat(rawPath);
                                                }
                                                str3 = rawPath;
                                            }
                                            if (port >= 0) {
                                                i = port;
                                            } else if (z) {
                                                i = 443;
                                            } else {
                                                i = 80;
                                            }
                                            this.a.getClass();
                                            if (z) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            xna xnaVar = new xna(socketFactory, new ra(str2, i), s, null, null);
                                            xnaVar.d = 1;
                                            xnaVar.e = (short) 250;
                                            xnaVar.f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = qd4.y(str3, "?", rawQuery);
                                            }
                                            return new ryc(z, userInfo, str2, str3, xnaVar);
                                        }
                                        lq5.j("The host part is empty.");
                                        return null;
                                    }
                                    lq5.j("The scheme part is empty.");
                                    return null;
                                }
                            }
                        }
                        str2 = host;
                        int port2 = create.getPort();
                        String rawPath2 = create.getRawPath();
                        String rawQuery2 = create.getRawQuery();
                        if (scheme == null) {
                        }
                        lq5.j("The scheme part is empty.");
                        return null;
                    }
                    lq5.j("The given timeout value is negative.");
                    return null;
                }
                lq5.j("The given URI is null.");
                return null;
            }
            lq5.j("The given timeout value is negative.");
            return null;
        }
        lq5.j("The given URI is null.");
        return null;
    }
}

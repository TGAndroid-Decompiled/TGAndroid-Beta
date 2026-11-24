package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
public final class t9b extends SSLSocketFactory {
    public final SSLSocketFactory a = HttpsURLConnection.getDefaultSSLSocketFactory();
    public final boolean b;
    public final boolean c;

    public t9b() {
        String[] strArr;
        try {
            strArr = SSLContext.getDefault().getSupportedSSLParameters().getProtocols();
        } catch (NoSuchAlgorithmException unused) {
            strArr = new String[0];
        }
        boolean z = false;
        boolean z2 = false;
        for (String str : strArr) {
            if (str.equals("TLSv1.1")) {
                z = true;
            } else if (str.equals("TLSv1.2")) {
                z2 = true;
            }
        }
        this.b = z;
        this.c = z2;
    }

    public final Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getEnabledProtocols()));
        if (this.b) {
            hashSet.add("TLSv1.1");
        }
        if (this.c) {
            hashSet.add("TLSv1.2");
        }
        sSLSocket.setEnabledProtocols((String[]) hashSet.toArray(new String[0]));
        return sSLSocket;
    }

    @Override
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a(this.a.createSocket(socket, str, i, z));
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override
    public final Socket createSocket(String str, int i) {
        return a(this.a.createSocket(str, i));
    }

    @Override
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a(this.a.createSocket(str, i, inetAddress, i2));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a(this.a.createSocket(inetAddress, i));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a(this.a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}

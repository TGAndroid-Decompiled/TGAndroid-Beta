package hc;

import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
public final class c extends SSLSocketFactory {
    public final SSLSocketFactory f7044a = HttpsURLConnection.getDefaultSSLSocketFactory();
    public final boolean f7045b;
    public final boolean f7046c;

    public c() {
        String[] strArr;
        try {
            strArr = SSLContext.getDefault().getSupportedSSLParameters().getProtocols();
        } catch (NoSuchAlgorithmException unused) {
            strArr = new String[0];
        }
        boolean z4 = false;
        boolean z10 = false;
        for (String str : strArr) {
            if (str.equals("TLSv1.1")) {
                z4 = true;
            } else if (str.equals("TLSv1.2")) {
                z10 = true;
            }
        }
        this.f7045b = z4;
        this.f7046c = z10;
    }

    public final Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getEnabledProtocols()));
        if (this.f7045b) {
            hashSet.add("TLSv1.1");
        }
        if (this.f7046c) {
            hashSet.add("TLSv1.2");
        }
        sSLSocket.setEnabledProtocols((String[]) hashSet.toArray(new String[0]));
        return sSLSocket;
    }

    @Override
    public final Socket createSocket(Socket socket, String str, int i10, boolean z4) {
        return a(this.f7044a.createSocket(socket, str, i10, z4));
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        return this.f7044a.getDefaultCipherSuites();
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return this.f7044a.getSupportedCipherSuites();
    }

    @Override
    public final Socket createSocket(String str, int i10) {
        return a(this.f7044a.createSocket(str, i10));
    }

    @Override
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return a(this.f7044a.createSocket(str, i10, inetAddress, i11));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        return a(this.f7044a.createSocket(inetAddress, i10));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return a(this.f7044a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}

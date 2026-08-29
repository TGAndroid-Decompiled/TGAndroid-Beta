package fc;

import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
public final class d extends SSLSocketFactory {
    public final SSLSocketFactory f6708a = HttpsURLConnection.getDefaultSSLSocketFactory();
    public final boolean f6709b;
    public final boolean f6710c;

    public d() {
        String[] strArr;
        try {
            strArr = SSLContext.getDefault().getSupportedSSLParameters().getProtocols();
        } catch (NoSuchAlgorithmException unused) {
            strArr = new String[0];
        }
        boolean z10 = false;
        boolean z11 = false;
        for (String str : strArr) {
            if (str.equals("TLSv1.1")) {
                z10 = true;
            } else if (str.equals("TLSv1.2")) {
                z11 = true;
            }
        }
        this.f6709b = z10;
        this.f6710c = z11;
    }

    public final Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getEnabledProtocols()));
        if (this.f6709b) {
            hashSet.add("TLSv1.1");
        }
        if (this.f6710c) {
            hashSet.add("TLSv1.2");
        }
        sSLSocket.setEnabledProtocols((String[]) hashSet.toArray(new String[0]));
        return sSLSocket;
    }

    @Override
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        return a(this.f6708a.createSocket(socket, str, i10, z10));
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        return this.f6708a.getDefaultCipherSuites();
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return this.f6708a.getSupportedCipherSuites();
    }

    @Override
    public final Socket createSocket(String str, int i10) {
        return a(this.f6708a.createSocket(str, i10));
    }

    @Override
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return a(this.f6708a.createSocket(str, i10, inetAddress, i11));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        return a(this.f6708a.createSocket(inetAddress, i10));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return a(this.f6708a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}

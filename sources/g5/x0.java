package g5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
public final class x0 extends g {
    public final int f6962a;
    public final byte[] f6963b;
    public final DatagramPacket f6964c;
    public Uri d;
    public DatagramSocket f6965e;
    public MulticastSocket f6966f;
    public InetAddress h;
    public boolean f6967n;
    public int f6968r;

    public x0() {
        super(true);
        this.f6962a = 8000;
        byte[] bArr = new byte[2000];
        this.f6963b = bArr;
        this.f6964c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f6966f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f6966f = null;
        }
        DatagramSocket datagramSocket = this.f6965e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f6965e = null;
        }
        this.h = null;
        this.f6968r = 0;
        if (this.f6967n) {
            this.f6967n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(p pVar) {
        Uri uri = pVar.f6885a;
        this.d = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.d.getPort();
        transferInitializing(pVar);
        try {
            this.h = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.h, port);
            if (this.h.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f6966f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f6965e = this.f6966f;
            } else {
                this.f6965e = new DatagramSocket(inetSocketAddress);
            }
            this.f6965e.setSoTimeout(this.f6962a);
            this.f6967n = true;
            transferStarted(pVar);
            return -1L;
        } catch (IOException e6) {
            throw new n(e6, 2001);
        } catch (SecurityException e10) {
            throw new n(e10, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f6968r;
        DatagramPacket datagramPacket = this.f6964c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f6965e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f6968r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e6) {
                throw new n(e6, 2002);
            } catch (IOException e10) {
                throw new n(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f6968r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f6963b, length2 - i13, bArr, i10, min);
        this.f6968r -= min;
        return min;
    }
}

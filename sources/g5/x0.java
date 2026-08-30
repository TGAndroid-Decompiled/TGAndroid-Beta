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
    public final int f6469a;
    public final byte[] f6470b;
    public final DatagramPacket f6471c;
    public Uri d;
    public DatagramSocket e;
    public MulticastSocket f6472f;
    public InetAddress h;
    public boolean f6473n;
    public int f6474r;

    public x0() {
        super(true);
        this.f6469a = 8000;
        byte[] bArr = new byte[2000];
        this.f6470b = bArr;
        this.f6471c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f6472f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f6472f = null;
        }
        DatagramSocket datagramSocket = this.e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.e = null;
        }
        this.h = null;
        this.f6474r = 0;
        if (this.f6473n) {
            this.f6473n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(p pVar) {
        Uri uri = pVar.f6401a;
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
                this.f6472f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.e = this.f6472f;
            } else {
                this.e = new DatagramSocket(inetSocketAddress);
            }
            this.e.setSoTimeout(this.f6469a);
            this.f6473n = true;
            transferStarted(pVar);
            return -1L;
        } catch (IOException e) {
            throw new n(e, 2001);
        } catch (SecurityException e6) {
            throw new n(e6, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f6474r;
        DatagramPacket datagramPacket = this.f6471c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f6474r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new n(e, 2002);
            } catch (IOException e6) {
                throw new n(e6, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f6474r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f6470b, length2 - i13, bArr, i10, min);
        this.f6474r -= min;
        return min;
    }
}

package j2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
public final class e0 extends c {
    public final int f17159a;
    public final byte[] f17160b;
    public final DatagramPacket f17161c;
    public Uri d;
    public DatagramSocket f17162e;
    public MulticastSocket f17163f;
    public InetAddress h;
    public boolean f17164n;
    public int f17165r;

    public e0() {
        super(true);
        this.f17159a = 8000;
        byte[] bArr = new byte[2000];
        this.f17160b = bArr;
        this.f17161c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f17163f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f17163f = null;
        }
        DatagramSocket datagramSocket = this.f17162e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f17162e = null;
        }
        this.h = null;
        this.f17165r = 0;
        if (this.f17164n) {
            this.f17164n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f17185a;
        this.d = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.d.getPort();
        transferInitializing(mVar);
        try {
            this.h = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.h, port);
            if (this.h.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f17163f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f17162e = this.f17163f;
            } else {
                this.f17162e = new DatagramSocket(inetSocketAddress);
            }
            this.f17162e.setSoTimeout(this.f17159a);
            this.f17164n = true;
            transferStarted(mVar);
            return -1L;
        } catch (IOException e10) {
            throw new j(e10, 2001);
        } catch (SecurityException e11) {
            throw new j(e11, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f17165r;
        DatagramPacket datagramPacket = this.f17161c;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f17162e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f17165r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e10) {
                throw new j(e10, 2002);
            } catch (IOException e11) {
                throw new j(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f17165r;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f17160b, length2 - i12, bArr, i7, min);
        this.f17165r -= min;
        return min;
    }
}

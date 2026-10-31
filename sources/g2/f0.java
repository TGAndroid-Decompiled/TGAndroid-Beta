package g2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
public final class f0 extends c {
    public final int f7292a;
    public final byte[] f7293b;
    public final DatagramPacket f7294c;
    public Uri d;
    public DatagramSocket e;
    public MulticastSocket f7295f;
    public InetAddress h;
    public boolean f7296n;
    public int f7297r;

    public f0() {
        super(true);
        this.f7292a = 8000;
        byte[] bArr = new byte[2000];
        this.f7293b = bArr;
        this.f7294c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f7295f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f7295f = null;
        }
        DatagramSocket datagramSocket = this.e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.e = null;
        }
        this.h = null;
        this.f7297r = 0;
        if (this.f7296n) {
            this.f7296n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(n nVar) {
        Uri uri = nVar.f7314a;
        this.d = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.d.getPort();
        transferInitializing(nVar);
        try {
            this.h = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.h, port);
            if (this.h.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f7295f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.e = this.f7295f;
            } else {
                this.e = new DatagramSocket(inetSocketAddress);
            }
            this.e.setSoTimeout(this.f7292a);
            this.f7296n = true;
            transferStarted(nVar);
            return -1L;
        } catch (IOException e) {
            throw new k(e, 2001);
        } catch (SecurityException e7) {
            throw new k(e7, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f7297r;
        DatagramPacket datagramPacket = this.f7294c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f7297r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new k(e, 2002);
            } catch (IOException e7) {
                throw new k(e7, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f7297r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f7293b, length2 - i13, bArr, i10, min);
        this.f7297r -= min;
        return min;
    }
}

package i2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
public final class f0 extends c {
    public final int f14538a;
    public final byte[] f14539b;
    public final DatagramPacket f14540c;
    public Uri d;
    public DatagramSocket f14541e;
    public MulticastSocket f14542f;
    public InetAddress h;
    public boolean f14543n;
    public int f14544r;

    public f0() {
        super(true);
        this.f14538a = 8000;
        byte[] bArr = new byte[2000];
        this.f14539b = bArr;
        this.f14540c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f14542f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f14542f = null;
        }
        DatagramSocket datagramSocket = this.f14541e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14541e = null;
        }
        this.h = null;
        this.f14544r = 0;
        if (this.f14543n) {
            this.f14543n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(n nVar) {
        Uri uri = nVar.f14564a;
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
                this.f14542f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f14541e = this.f14542f;
            } else {
                this.f14541e = new DatagramSocket(inetSocketAddress);
            }
            this.f14541e.setSoTimeout(this.f14538a);
            this.f14543n = true;
            transferStarted(nVar);
            return -1L;
        } catch (IOException e10) {
            throw new k(e10, 2001);
        } catch (SecurityException e11) {
            throw new k(e11, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f14544r;
        DatagramPacket datagramPacket = this.f14540c;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f14541e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f14544r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e10) {
                throw new k(e10, 2002);
            } catch (IOException e11) {
                throw new k(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f14544r;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f14539b, length2 - i12, bArr, i3, min);
        this.f14544r -= min;
        return min;
    }
}

package g2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
public final class e0 extends c {
    public final int f8485a;
    public final byte[] f8486b;
    public final DatagramPacket f8487c;
    public Uri d;
    public DatagramSocket e;
    public MulticastSocket f8488f;
    public InetAddress h;
    public boolean f8489n;
    public int f8490r;

    public e0() {
        super(true);
        this.f8485a = 8000;
        byte[] bArr = new byte[2000];
        this.f8486b = bArr;
        this.f8487c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f8488f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f8488f = null;
        }
        DatagramSocket datagramSocket = this.e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.e = null;
        }
        this.h = null;
        this.f8490r = 0;
        if (this.f8489n) {
            this.f8489n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f8508a;
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
                this.f8488f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.e = this.f8488f;
            } else {
                this.e = new DatagramSocket(inetSocketAddress);
            }
            this.e.setSoTimeout(this.f8485a);
            this.f8489n = true;
            transferStarted(mVar);
            return -1L;
        } catch (IOException e) {
            throw new j(e, 2001);
        } catch (SecurityException e7) {
            throw new j(e7, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f8490r;
        DatagramPacket datagramPacket = this.f8487c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f8490r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new j(e, 2002);
            } catch (IOException e7) {
                throw new j(e7, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f8490r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f8486b, length2 - i13, bArr, i10, min);
        this.f8490r -= min;
        return min;
    }
}

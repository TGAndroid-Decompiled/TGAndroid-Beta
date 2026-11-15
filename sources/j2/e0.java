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
    public final int f16777a;
    public final byte[] f16778b;
    public final DatagramPacket f16779c;
    public Uri d;
    public DatagramSocket f16780e;
    public MulticastSocket f16781f;
    public InetAddress h;
    public boolean f16782n;
    public int f16783r;

    public e0() {
        super(true);
        this.f16777a = 8000;
        byte[] bArr = new byte[2000];
        this.f16778b = bArr;
        this.f16779c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f16781f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f16781f = null;
        }
        DatagramSocket datagramSocket = this.f16780e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f16780e = null;
        }
        this.h = null;
        this.f16783r = 0;
        if (this.f16782n) {
            this.f16782n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f16803a;
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
                this.f16781f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f16780e = this.f16781f;
            } else {
                this.f16780e = new DatagramSocket(inetSocketAddress);
            }
            this.f16780e.setSoTimeout(this.f16777a);
            this.f16782n = true;
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
        int i11 = this.f16783r;
        DatagramPacket datagramPacket = this.f16779c;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f16780e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f16783r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e10) {
                throw new j(e10, 2002);
            } catch (IOException e11) {
                throw new j(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f16783r;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f16778b, length2 - i12, bArr, i7, min);
        this.f16783r -= min;
        return min;
    }
}

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
    public final int f9352a;
    public final byte[] f9353b;
    public final DatagramPacket f9354c;
    public Uri d;
    public DatagramSocket e;
    public MulticastSocket f9355f;
    public InetAddress h;
    public boolean f9356n;
    public int f9357r;

    public e0() {
        super(true);
        this.f9352a = 8000;
        byte[] bArr = new byte[2000];
        this.f9353b = bArr;
        this.f9354c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f9355f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f9355f = null;
        }
        DatagramSocket datagramSocket = this.e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.e = null;
        }
        this.h = null;
        this.f9357r = 0;
        if (this.f9356n) {
            this.f9356n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f9375a;
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
                this.f9355f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.e = this.f9355f;
            } else {
                this.e = new DatagramSocket(inetSocketAddress);
            }
            this.e.setSoTimeout(this.f9352a);
            this.f9356n = true;
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
        int i12 = this.f9357r;
        DatagramPacket datagramPacket = this.f9354c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f9357r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new j(e, 2002);
            } catch (IOException e7) {
                throw new j(e7, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f9357r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f9353b, length2 - i13, bArr, i10, min);
        this.f9357r -= min;
        return min;
    }
}

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
    public final int f10168a;
    public final byte[] f10169b;
    public final DatagramPacket f10170c;
    public Uri d;
    public DatagramSocket f10171e;
    public MulticastSocket f10172f;
    public InetAddress h;
    public boolean f10173n;
    public int f10174r;

    public e0() {
        super(true);
        this.f10168a = 8000;
        byte[] bArr = new byte[2000];
        this.f10169b = bArr;
        this.f10170c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f10172f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10172f = null;
        }
        DatagramSocket datagramSocket = this.f10171e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10171e = null;
        }
        this.h = null;
        this.f10174r = 0;
        if (this.f10173n) {
            this.f10173n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f10194a;
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
                this.f10172f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f10171e = this.f10172f;
            } else {
                this.f10171e = new DatagramSocket(inetSocketAddress);
            }
            this.f10171e.setSoTimeout(this.f10168a);
            this.f10173n = true;
            transferStarted(mVar);
            return -1L;
        } catch (IOException e7) {
            throw new j(e7, 2001);
        } catch (SecurityException e10) {
            throw new j(e10, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f10174r;
        DatagramPacket datagramPacket = this.f10170c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f10171e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f10174r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e7) {
                throw new j(e7, 2002);
            } catch (IOException e10) {
                throw new j(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f10174r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f10169b, length2 - i13, bArr, i10, min);
        this.f10174r -= min;
        return min;
    }
}

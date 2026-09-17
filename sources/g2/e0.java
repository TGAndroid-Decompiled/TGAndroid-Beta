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
    public final int f10332a;
    public final byte[] f10333b;
    public final DatagramPacket f10334c;
    public Uri d;
    public DatagramSocket f10335e;
    public MulticastSocket f10336f;
    public InetAddress h;
    public boolean f10337n;
    public int f10338r;

    public e0() {
        super(true);
        this.f10332a = 8000;
        byte[] bArr = new byte[2000];
        this.f10333b = bArr;
        this.f10334c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f10336f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10336f = null;
        }
        DatagramSocket datagramSocket = this.f10335e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10335e = null;
        }
        this.h = null;
        this.f10338r = 0;
        if (this.f10337n) {
            this.f10337n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f10358a;
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
                this.f10336f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f10335e = this.f10336f;
            } else {
                this.f10335e = new DatagramSocket(inetSocketAddress);
            }
            this.f10335e.setSoTimeout(this.f10332a);
            this.f10337n = true;
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
        int i12 = this.f10338r;
        DatagramPacket datagramPacket = this.f10334c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f10335e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f10338r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e7) {
                throw new j(e7, 2002);
            } catch (IOException e10) {
                throw new j(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f10338r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f10333b, length2 - i13, bArr, i10, min);
        this.f10338r -= min;
        return min;
    }
}

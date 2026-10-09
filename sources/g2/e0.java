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
    public final int f10241a;
    public final byte[] f10242b;
    public final DatagramPacket f10243c;
    public Uri d;
    public DatagramSocket f10244e;
    public MulticastSocket f10245f;
    public InetAddress h;
    public boolean f10246n;
    public int f10247r;

    public e0() {
        super(true);
        this.f10241a = 8000;
        byte[] bArr = new byte[2000];
        this.f10242b = bArr;
        this.f10243c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f10245f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10245f = null;
        }
        DatagramSocket datagramSocket = this.f10244e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10244e = null;
        }
        this.h = null;
        this.f10247r = 0;
        if (this.f10246n) {
            this.f10246n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f10267a;
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
                this.f10245f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f10244e = this.f10245f;
            } else {
                this.f10244e = new DatagramSocket(inetSocketAddress);
            }
            this.f10244e.setSoTimeout(this.f10241a);
            this.f10246n = true;
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
        int i12 = this.f10247r;
        DatagramPacket datagramPacket = this.f10243c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f10244e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f10247r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e7) {
                throw new j(e7, 2002);
            } catch (IOException e10) {
                throw new j(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f10247r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f10242b, length2 - i13, bArr, i10, min);
        this.f10247r -= min;
        return min;
    }
}

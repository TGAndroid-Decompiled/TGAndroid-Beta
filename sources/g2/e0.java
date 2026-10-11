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
    public final int f10240a;
    public final byte[] f10241b;
    public final DatagramPacket f10242c;
    public Uri d;
    public DatagramSocket f10243e;
    public MulticastSocket f10244f;
    public InetAddress h;
    public boolean f10245n;
    public int f10246r;

    public e0() {
        super(true);
        this.f10240a = 8000;
        byte[] bArr = new byte[2000];
        this.f10241b = bArr;
        this.f10242c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f10244f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10244f = null;
        }
        DatagramSocket datagramSocket = this.f10243e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10243e = null;
        }
        this.h = null;
        this.f10246r = 0;
        if (this.f10245n) {
            this.f10245n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f10266a;
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
                this.f10244f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f10243e = this.f10244f;
            } else {
                this.f10243e = new DatagramSocket(inetSocketAddress);
            }
            this.f10243e.setSoTimeout(this.f10240a);
            this.f10245n = true;
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
        int i12 = this.f10246r;
        DatagramPacket datagramPacket = this.f10242c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f10243e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f10246r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e7) {
                throw new j(e7, 2002);
            } catch (IOException e10) {
                throw new j(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f10246r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f10241b, length2 - i13, bArr, i10, min);
        this.f10246r -= min;
        return min;
    }
}

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
    public final int f10239a;
    public final byte[] f10240b;
    public final DatagramPacket f10241c;
    public Uri d;
    public DatagramSocket f10242e;
    public MulticastSocket f10243f;
    public InetAddress h;
    public boolean f10244n;
    public int f10245r;

    public e0() {
        super(true);
        this.f10239a = 8000;
        byte[] bArr = new byte[2000];
        this.f10240b = bArr;
        this.f10241c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f10243f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10243f = null;
        }
        DatagramSocket datagramSocket = this.f10242e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10242e = null;
        }
        this.h = null;
        this.f10245r = 0;
        if (this.f10244n) {
            this.f10244n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f10265a;
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
                this.f10243f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f10242e = this.f10243f;
            } else {
                this.f10242e = new DatagramSocket(inetSocketAddress);
            }
            this.f10242e.setSoTimeout(this.f10239a);
            this.f10244n = true;
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
        int i12 = this.f10245r;
        DatagramPacket datagramPacket = this.f10241c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f10242e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f10245r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e7) {
                throw new j(e7, 2002);
            } catch (IOException e10) {
                throw new j(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f10245r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f10240b, length2 - i13, bArr, i10, min);
        this.f10245r -= min;
        return min;
    }
}

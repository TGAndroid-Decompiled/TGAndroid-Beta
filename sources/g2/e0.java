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
    public final int f12235a;
    public final byte[] f12236b;
    public final DatagramPacket f12237c;
    public Uri d;
    public DatagramSocket e;
    public MulticastSocket f12238f;
    public InetAddress h;
    public boolean f12239n;
    public int f12240r;

    public e0() {
        super(true);
        this.f12235a = 8000;
        byte[] bArr = new byte[2000];
        this.f12236b = bArr;
        this.f12237c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f12238f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f12238f = null;
        }
        DatagramSocket datagramSocket = this.e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.e = null;
        }
        this.h = null;
        this.f12240r = 0;
        if (this.f12239n) {
            this.f12239n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f12257a;
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
                this.f12238f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.e = this.f12238f;
            } else {
                this.e = new DatagramSocket(inetSocketAddress);
            }
            this.e.setSoTimeout(this.f12235a);
            this.f12239n = true;
            transferStarted(mVar);
            return -1L;
        } catch (IOException e) {
            throw new j(e, 2001);
        } catch (SecurityException e10) {
            throw new j(e10, 2006);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f12240r;
        DatagramPacket datagramPacket = this.f12237c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f12240r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new j(e, 2002);
            } catch (IOException e10) {
                throw new j(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f12240r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f12236b, length2 - i13, bArr, i10, min);
        this.f12240r -= min;
        return min;
    }
}

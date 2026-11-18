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
    public final int f17162a;
    public final byte[] f17163b;
    public final DatagramPacket f17164c;
    public Uri d;
    public DatagramSocket f17165e;
    public MulticastSocket f17166f;
    public InetAddress h;
    public boolean f17167n;
    public int f17168r;

    public e0() {
        super(true);
        this.f17162a = 8000;
        byte[] bArr = new byte[2000];
        this.f17163b = bArr;
        this.f17164c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f17166f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f17166f = null;
        }
        DatagramSocket datagramSocket = this.f17165e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f17165e = null;
        }
        this.h = null;
        this.f17168r = 0;
        if (this.f17167n) {
            this.f17167n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f17188a;
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
                this.f17166f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f17165e = this.f17166f;
            } else {
                this.f17165e = new DatagramSocket(inetSocketAddress);
            }
            this.f17165e.setSoTimeout(this.f17162a);
            this.f17167n = true;
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
        int i11 = this.f17168r;
        DatagramPacket datagramPacket = this.f17164c;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f17165e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f17168r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e10) {
                throw new j(e10, 2002);
            } catch (IOException e11) {
                throw new j(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f17168r;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f17163b, length2 - i12, bArr, i7, min);
        this.f17168r -= min;
        return min;
    }
}

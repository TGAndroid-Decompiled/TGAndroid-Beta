package j2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
public final class f0 extends c {
    public final int f16423a;
    public final byte[] f16424b;
    public final DatagramPacket f16425c;
    public Uri d;
    public DatagramSocket f16426e;
    public MulticastSocket f16427f;
    public InetAddress h;
    public boolean f16428n;
    public int f16429r;

    public f0() {
        super(true);
        this.f16423a = 8000;
        byte[] bArr = new byte[2000];
        this.f16424b = bArr;
        this.f16425c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f16427f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f16427f = null;
        }
        DatagramSocket datagramSocket = this.f16426e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f16426e = null;
        }
        this.h = null;
        this.f16429r = 0;
        if (this.f16428n) {
            this.f16428n = false;
            transferEnded();
        }
    }

    @Override
    public final Uri getUri() {
        return this.d;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f16446a;
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
                this.f16427f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.f16426e = this.f16427f;
            } else {
                this.f16426e = new DatagramSocket(inetSocketAddress);
            }
            this.f16426e.setSoTimeout(this.f16423a);
            this.f16428n = true;
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
        int i11 = this.f16429r;
        DatagramPacket datagramPacket = this.f16425c;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f16426e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f16429r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e10) {
                throw new j(e10, 2002);
            } catch (IOException e11) {
                throw new j(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f16429r;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f16424b, length2 - i12, bArr, i7, min);
        this.f16429r -= min;
        return min;
    }
}

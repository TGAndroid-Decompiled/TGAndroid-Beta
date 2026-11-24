package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Wallet.c;
public final class p15 {
    public final int a;
    public final String b;
    public final c c;
    public boolean d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public int j;
    public buc k;
    public long l;
    public int i = -1;
    public final m15 m = new Runnable(this) {
        public final p15 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            p15 p15Var = this.b;
            switch (b) {
                case 0:
                    p15Var.e();
                    return;
                case 1:
                    if (p15Var.d) {
                        p15Var.d("URL expired; renewing connection");
                        p15Var.a();
                        p15Var.e();
                        return;
                    }
                    return;
                default:
                    p15Var.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final m15 n = new Runnable(this) {
        public final p15 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            p15 p15Var = this.b;
            switch (b) {
                case 0:
                    p15Var.e();
                    return;
                case 1:
                    if (p15Var.d) {
                        p15Var.d("URL expired; renewing connection");
                        p15Var.a();
                        p15Var.e();
                        return;
                    }
                    return;
                default:
                    p15Var.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final m15 o = new Runnable(this) {
        public final p15 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            p15 p15Var = this.b;
            switch (b) {
                case 0:
                    p15Var.e();
                    return;
                case 1:
                    if (p15Var.d) {
                        p15Var.d("URL expired; renewing connection");
                        p15Var.a();
                        p15Var.e();
                        return;
                    }
                    return;
                default:
                    p15Var.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final ez3 p = new ez3(this, (byte) 10);

    public p15(int i, String str, c cVar) {
        this.a = i;
        this.b = str;
        this.c = cVar;
    }

    public static String b(cuc cucVar) {
        String str;
        ng5 ng5Var;
        switch (cucVar.a) {
            case 1:
                str = "NOT_IN_CREATED_STATE";
                break;
            case 2:
                str = "SOCKET_INPUT_STREAM_FAILURE";
                break;
            case 3:
                str = "SOCKET_OUTPUT_STREAM_FAILURE";
                break;
            case 4:
                str = "OPENING_HAHDSHAKE_REQUEST_FAILURE";
                break;
            case 5:
                str = "OPENING_HANDSHAKE_RESPONSE_FAILURE";
                break;
            case 6:
                str = "STATUS_LINE_EMPTY";
                break;
            case 7:
                str = "STATUS_LINE_BAD_FORMAT";
                break;
            case 8:
                str = "NOT_SWITCHING_PROTOCOLS";
                break;
            case 9:
                str = "HTTP_HEADER_FAILURE";
                break;
            case 10:
                str = "NO_UPGRADE_HEADER";
                break;
            case 11:
                str = "NO_WEBSOCKET_IN_UPGRADE_HEADER";
                break;
            case 12:
                str = "NO_CONNECTION_HEADER";
                break;
            case 13:
                str = "NO_UPGRADE_IN_CONNECTION_HEADER";
                break;
            case 14:
                str = "NO_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 15:
                str = "UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 16:
                str = "EXTENSION_PARSE_ERROR";
                break;
            case 17:
                str = "UNSUPPORTED_EXTENSION";
                break;
            case 18:
                str = "EXTENSIONS_CONFLICT";
                break;
            case 19:
                str = "UNSUPPORTED_PROTOCOL";
                break;
            case 20:
                str = "INSUFFICENT_DATA";
                break;
            case 21:
                str = "INVALID_PAYLOAD_LENGTH";
                break;
            case 22:
                str = "TOO_LONG_PAYLOAD";
                break;
            case 23:
                str = "INSUFFICIENT_MEMORY_FOR_PAYLOAD";
                break;
            case 24:
                str = "INTERRUPTED_IN_READING";
                break;
            case 25:
                str = "IO_ERROR_IN_READING";
                break;
            case 26:
                str = "IO_ERROR_IN_WRITING";
                break;
            case 27:
                str = "FLUSH_ERROR";
                break;
            case 28:
                str = "NON_ZERO_RESERVED_BITS";
                break;
            case 29:
                str = "UNEXPECTED_RESERVED_BIT";
                break;
            case 30:
                str = "FRAME_MASKED";
                break;
            case 31:
                str = "UNKNOWN_OPCODE";
                break;
            case 32:
                str = "FRAGMENTED_CONTROL_FRAME";
                break;
            case 33:
                str = "UNEXPECTED_CONTINUATION_FRAME";
                break;
            case 34:
                str = "CONTINUATION_NOT_CLOSED";
                break;
            case 35:
                str = "TOO_LONG_CONTROL_FRAME_PAYLOAD";
                break;
            case 36:
                str = "MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 37:
                str = "TEXT_MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 38:
                str = "UNEXPECTED_ERROR_IN_READING_THREAD";
                break;
            case 39:
                str = "UNEXPECTED_ERROR_IN_WRITING_THREAD";
                break;
            case 40:
                str = "PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER";
                break;
            case 41:
                str = "PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS";
                break;
            case 42:
                str = "COMPRESSION_ERROR";
                break;
            case 43:
                str = "DECOMPRESSION_ERROR";
                break;
            case 44:
                str = "SOCKET_CONNECT_ERROR";
                break;
            case 45:
                str = "PROXY_HANDSHAKE_ERROR";
                break;
            case 46:
                str = "SOCKET_OVERLAY_ERROR";
                break;
            case 47:
                str = "SSL_HANDSHAKE_ERROR";
                break;
            case 48:
                str = "NO_MORE_FRAME";
                break;
            case 49:
                str = "HOSTNAME_UNVERIFIED";
                break;
            default:
                str = "null";
                break;
        }
        if ((cucVar instanceof nq7) && (ng5Var = ((nq7) cucVar).b) != null) {
            StringBuilder k = b00.k(str, ", HTTP ");
            k.append(ng5Var.b);
            return k.toString();
        }
        return str;
    }

    public final void a() {
        boolean z;
        StringBuilder sb = new StringBuilder("disconnecting; socket=");
        if (this.k != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", subscribed=");
        sb.append(this.e);
        sb.append(", URL request=");
        sb.append(this.i);
        d(sb.toString());
        this.h++;
        this.e = false;
        gl.r(this.m);
        gl.r(this.n);
        gl.r(this.o);
        gl.r(this.p);
        if (this.i >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.i, true);
            this.i = -1;
        }
        buc bucVar = this.k;
        this.k = null;
        if (bucVar != null) {
            bucVar.c();
        }
    }

    public final boolean c(buc bucVar, int i) {
        if (this.d && this.k == bucVar && this.h == i) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        fa4.b("[gram-wallet-streaming] account=" + this.a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        gl.r(this.m);
        final int i = this.h + 1;
        this.h = i;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.j);
        gl.d3(this.o, 30000L);
        this.i = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new hc((byte) 0), new i8c() {
            @Override
            public final void a(Object obj, Object obj2) {
                Object valueOf;
                p15 p15Var = p15.this;
                int i2 = i;
                long j = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (p15Var.d && p15Var.h == i2) {
                    StringBuilder sb = new StringBuilder("URL response after ");
                    sb.append(SystemClock.elapsedRealtime() - j);
                    sb.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb.append(valueOf);
                    p15Var.d(sb.toString());
                    p15Var.i = -1;
                    gl.r(p15Var.o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(p15Var.a).getCurrentTime()) * 1000;
                        p15Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            p15Var.f("received expired streaming URL");
                            return;
                        }
                        gl.d3(p15Var.n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        p15Var.d("opening websocket; attempt=" + i2);
                        try {
                            euc eucVar = new euc();
                            eucVar.b = (short) 10000;
                            buc a = eucVar.a(str);
                            p15Var.k = a;
                            o15 o15Var = new o15(p15Var, i2, elapsedRealtime2);
                            xf4 xf4Var = a.d;
                            synchronized (((ArrayList) xf4Var.c)) {
                                ((ArrayList) xf4Var.c).add(o15Var);
                                xf4Var.a = true;
                            }
                            gl.d3(p15Var.o, 30000L);
                            buc bucVar = p15Var.k;
                            bucVar.getClass();
                            int i3 = 0;
                            xr2 xr2Var = new xr2("ConnectThread", bucVar, 3, (byte) 0);
                            xf4 xf4Var2 = bucVar.d;
                            if (xf4Var2 != null) {
                                ArrayList arrayList = (ArrayList) xf4Var2.u();
                                int size = arrayList.size();
                                while (i3 < size) {
                                    Object obj3 = arrayList.get(i3);
                                    i3++;
                                    o15 o15Var2 = (o15) obj3;
                                    try {
                                        try {
                                            o15Var2.getClass();
                                        } catch (Throwable unused) {
                                            o15Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            xr2Var.start();
                            return;
                        } catch (Exception e) {
                            p15Var.f("could not open websocket: ".concat(e.getClass().getSimpleName()));
                            return;
                        }
                    }
                    p15Var.f("could not obtain streaming URL");
                    return;
                }
                p15Var.d("ignoring stale URL response; attempt=" + i2);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        a();
        int i = this.j;
        this.j = i + 1;
        long min = Math.min(30000L, 1000 << Math.min(i, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        gl.d3(this.m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        buc bucVar = this.k;
        bucVar.getClass();
        ?? obj = new Object();
        obj.a = true;
        obj.e = 1;
        if (str != null && str.length() != 0) {
            obj.c(yd7.a(str));
        } else {
            obj.g = null;
        }
        bucVar.g(obj);
    }

    public final void h() {
        if (!this.d) {
            return;
        }
        d("stopping");
        this.d = false;
        a();
    }
}

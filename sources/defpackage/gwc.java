package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
public final class gwc {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static gwc a(int i, String str) {
        ?? obj = new Object();
        obj.a = true;
        obj.e = 8;
        byte[] bArr = {3, (byte) (i & 255)};
        if (str != null && str.length() != 0) {
            byte[] a = ag7.a(str);
            byte[] bArr2 = new byte[a.length + 2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            System.arraycopy(a, 0, bArr2, 2, a.length);
            obj.c(bArr2);
            return obj;
        }
        obj.c(bArr);
        return obj;
    }

    public final int b() {
        byte[] bArr = this.g;
        if (bArr != null && bArr.length >= 2) {
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        return 1005;
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.g = bArr;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        StringBuilder s = td4.s("WebSocketFrame(FIN=");
        String str5 = "0";
        if (!this.a) {
            str = "0";
        } else {
            str = "1";
        }
        s.append(str);
        s.append(",RSV1=");
        if (!this.b) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        s.append(str2);
        s.append(",RSV2=");
        if (!this.c) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        s.append(str3);
        s.append(",RSV3=");
        if (this.d) {
            str5 = "1";
        }
        s.append(str5);
        s.append(",Opcode=");
        int i = this.e;
        SecureRandom secureRandom = ag7.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    switch (i) {
                        case 8:
                            str4 = "CLOSE";
                            break;
                        case 9:
                            str4 = "PING";
                            break;
                        case 10:
                            str4 = "PONG";
                            break;
                        default:
                            if (1 <= i && i <= 7) {
                                str4 = String.format("DATA(0x%X)", Integer.valueOf(i));
                                break;
                            } else if (8 <= i && i <= 15) {
                                str4 = String.format("CONTROL(0x%X)", Integer.valueOf(i));
                                break;
                            } else {
                                str4 = String.format("0x%X", Integer.valueOf(i));
                                break;
                            }
                            break;
                    }
                } else {
                    str4 = "BINARY";
                }
            } else {
                str4 = "TEXT";
            }
        } else {
            str4 = "CONTINUATION";
        }
        s.append(str4);
        s.append(",Length=");
        byte[] bArr = this.g;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        s.append(length);
        int i2 = this.e;
        String str6 = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    s.append(",CloseCode=");
                    s.append(b());
                    s.append(",Reason=");
                    byte[] bArr2 = this.g;
                    if (bArr2 != null && bArr2.length >= 3) {
                        try {
                            str6 = new String(bArr2, 2, bArr2.length - 2, "UTF-8");
                        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                        }
                    }
                    if (str6 == null) {
                        s.append("null");
                    } else {
                        wi8.z("\"", str6, "\"", s);
                    }
                }
            } else {
                s.append(",Payload=");
                if (this.g == null) {
                    s.append("null");
                } else if (this.b) {
                    s.append("compressed");
                } else {
                    int i3 = 0;
                    while (true) {
                        byte[] bArr3 = this.g;
                        if (i3 < bArr3.length) {
                            s.append(String.format("%02X ", Integer.valueOf(bArr3[i3] & 255)));
                            i3++;
                        } else if (bArr3.length != 0) {
                            s.setLength(s.length() - 1);
                        }
                    }
                }
            }
        } else {
            s.append(",Payload=");
            if (this.g == null) {
                s.append("null");
            } else if (this.b) {
                s.append("compressed");
            } else {
                s.append("\"");
                byte[] bArr4 = this.g;
                if (bArr4 != null) {
                    try {
                        str6 = new String(bArr4, 0, bArr4.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                    }
                }
                s.append(str6);
                s.append("\"");
            }
        }
        s.append(")");
        return s.toString();
    }
}

package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
public final class fuc {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static fuc a(int i, String str) {
        ?? obj = new Object();
        obj.a = true;
        obj.e = 8;
        byte[] bArr = {3, (byte) (i & 255)};
        if (str != null && str.length() != 0) {
            byte[] a = yd7.a(str);
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
        StringBuilder r = tb4.r("WebSocketFrame(FIN=");
        String str5 = "0";
        if (!this.a) {
            str = "0";
        } else {
            str = "1";
        }
        r.append(str);
        r.append(",RSV1=");
        if (!this.b) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        r.append(str2);
        r.append(",RSV2=");
        if (!this.c) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        r.append(str3);
        r.append(",RSV3=");
        if (this.d) {
            str5 = "1";
        }
        r.append(str5);
        r.append(",Opcode=");
        int i = this.e;
        SecureRandom secureRandom = yd7.a;
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
        r.append(str4);
        r.append(",Length=");
        byte[] bArr = this.g;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        r.append(length);
        int i2 = this.e;
        String str6 = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    r.append(",CloseCode=");
                    r.append(b());
                    r.append(",Reason=");
                    byte[] bArr2 = this.g;
                    if (bArr2 != null && bArr2.length >= 3) {
                        try {
                            str6 = new String(bArr2, 2, bArr2.length - 2, "UTF-8");
                        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                        }
                    }
                    if (str6 == null) {
                        r.append("null");
                    } else {
                        ug8.z("\"", str6, "\"", r);
                    }
                }
            } else {
                r.append(",Payload=");
                if (this.g == null) {
                    r.append("null");
                } else if (this.b) {
                    r.append("compressed");
                } else {
                    int i3 = 0;
                    while (true) {
                        byte[] bArr3 = this.g;
                        if (i3 < bArr3.length) {
                            r.append(String.format("%02X ", Integer.valueOf(bArr3[i3] & 255)));
                            i3++;
                        } else if (bArr3.length != 0) {
                            r.setLength(r.length() - 1);
                        }
                    }
                }
            }
        } else {
            r.append(",Payload=");
            if (this.g == null) {
                r.append("null");
            } else if (this.b) {
                r.append("compressed");
            } else {
                r.append("\"");
                byte[] bArr4 = this.g;
                if (bArr4 != null) {
                    try {
                        str6 = new String(bArr4, 0, bArr4.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                    }
                }
                r.append(str6);
                r.append("\"");
            }
        }
        r.append(")");
        return r.toString();
    }
}

package oc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
public final class x {
    public boolean f21029a;
    public boolean f21030b;
    public boolean f21031c;
    public boolean d;
    public int f21032e;
    public boolean f21033f;
    public byte[] f21034g;

    public static x a(int i3, String str) {
        ?? obj = new Object();
        obj.f21029a = true;
        obj.f21032e = 8;
        byte[] bArr = {(byte) ((i3 >> 8) & 255), (byte) (i3 & 255)};
        if (str != null && str.length() != 0) {
            byte[] a10 = k.a(str);
            byte[] bArr2 = new byte[a10.length + 2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            System.arraycopy(a10, 0, bArr2, 2, a10.length);
            obj.c(bArr2);
            return obj;
        }
        obj.c(bArr);
        return obj;
    }

    public final int b() {
        byte[] bArr = this.f21034g;
        if (bArr != null && bArr.length >= 2) {
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        return 1005;
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.f21034g = bArr;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("WebSocketFrame(FIN=");
        String str5 = "0";
        if (!this.f21029a) {
            str = "0";
        } else {
            str = "1";
        }
        l10.append(str);
        l10.append(",RSV1=");
        if (!this.f21030b) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        l10.append(str2);
        l10.append(",RSV2=");
        if (!this.f21031c) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        l10.append(str3);
        l10.append(",RSV3=");
        if (this.d) {
            str5 = "1";
        }
        l10.append(str5);
        l10.append(",Opcode=");
        int i3 = this.f21032e;
        SecureRandom secureRandom = k.f20982a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    switch (i3) {
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
                            if (1 <= i3 && i3 <= 7) {
                                str4 = String.format("DATA(0x%X)", Integer.valueOf(i3));
                                break;
                            } else if (8 <= i3 && i3 <= 15) {
                                str4 = String.format("CONTROL(0x%X)", Integer.valueOf(i3));
                                break;
                            } else {
                                str4 = String.format("0x%X", Integer.valueOf(i3));
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
        l10.append(str4);
        l10.append(",Length=");
        byte[] bArr = this.f21034g;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        l10.append(length);
        int i10 = this.f21032e;
        String str6 = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    l10.append(",CloseCode=");
                    l10.append(b());
                    l10.append(",Reason=");
                    byte[] bArr2 = this.f21034g;
                    if (bArr2 != null && bArr2.length >= 3) {
                        try {
                            str6 = new String(bArr2, 2, bArr2.length - 2, "UTF-8");
                        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                        }
                    }
                    if (str6 == null) {
                        l10.append("null");
                    } else {
                        l10.append("\"");
                        l10.append(str6);
                        l10.append("\"");
                    }
                }
            } else {
                l10.append(",Payload=");
                if (this.f21034g == null) {
                    l10.append("null");
                } else if (this.f21030b) {
                    l10.append("compressed");
                } else {
                    int i11 = 0;
                    while (true) {
                        byte[] bArr3 = this.f21034g;
                        if (i11 < bArr3.length) {
                            l10.append(String.format("%02X ", Integer.valueOf(bArr3[i11] & 255)));
                            i11++;
                        } else if (bArr3.length != 0) {
                            l10.setLength(l10.length() - 1);
                        }
                    }
                }
            }
        } else {
            l10.append(",Payload=");
            if (this.f21034g == null) {
                l10.append("null");
            } else if (this.f21030b) {
                l10.append("compressed");
            } else {
                l10.append("\"");
                byte[] bArr4 = this.f21034g;
                if (bArr4 != null) {
                    try {
                        str6 = new String(bArr4, 0, bArr4.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                    }
                }
                l10.append(str6);
                l10.append("\"");
            }
        }
        l10.append(")");
        return l10.toString();
    }
}

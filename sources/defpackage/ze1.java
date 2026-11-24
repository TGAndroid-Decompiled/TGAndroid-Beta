package defpackage;

import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class ze1 extends cf1 {
    public final yw7 h = new yw7();
    public final ye1 i = new ye1();
    public int j = -1;
    public final int k;
    public final xe1[] l;
    public xe1 m;
    public List n;
    public List o;
    public ye1 p;
    public int q;

    public ze1(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = jl2.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new xe1[8];
        int i2 = 0;
        while (true) {
            xe1[] xe1VarArr = this.l;
            if (i2 < 8) {
                xe1VarArr[i2] = new xe1();
                i2++;
            } else {
                this.m = xe1VarArr[0];
                return;
            }
        }
    }

    @Override
    public final sz4 f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new sz4(list);
    }

    @Override
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override
    public final void g(af1 af1Var) {
        boolean z;
        ye1 ye1Var;
        ByteBuffer byteBuffer = af1Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        yw7 yw7Var = this.h;
        yw7Var.L(limit, array);
        while (yw7Var.a() >= 3) {
            int A = yw7Var.A();
            int i = A & 3;
            boolean z2 = false;
            if ((A & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte A2 = (byte) yw7Var.A();
            byte A3 = (byte) yw7Var.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (A2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            ncd.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = A2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        ye1Var = new ye1(i2, i4);
                        this.p = ye1Var;
                        byte[] bArr = ye1Var.b;
                        ye1Var.e = 1;
                        bArr[0] = A3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        jte.f(z2);
                        ye1 ye1Var2 = this.p;
                        if (ye1Var2 == null) {
                            ncd.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = ye1Var2.b;
                            int i5 = ye1Var2.e;
                            int i6 = i5 + 1;
                            ye1Var2.e = i6;
                            bArr2[i5] = A2;
                            ye1Var2.e = i5 + 2;
                            bArr2[i6] = A3;
                            ye1Var = ye1Var2;
                        }
                    }
                    if (ye1Var.e == (ye1Var.d << 1) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override
    public final boolean i() {
        if (this.n != this.o) {
            return true;
        }
        return false;
    }

    public final void j() {
        boolean z;
        int i;
        int i2;
        xe1 xe1Var;
        ye1 ye1Var = this.p;
        if (ye1Var == null) {
            return;
        }
        if (ye1Var.e != (ye1Var.d << 1) - 1) {
            ncd.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d << 1) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        ye1 ye1Var2 = this.p;
        byte[] bArr = ye1Var2.b;
        int i3 = ye1Var2.e;
        ye1 ye1Var3 = this.i;
        ye1Var3.j(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (ye1Var3.b() > 0) {
                int i4 = 3;
                int f = ye1Var3.f(3);
                int f2 = ye1Var3.f(5);
                int i5 = 2;
                if (f == 7) {
                    ye1Var3.n(2);
                    f = ye1Var3.f(6);
                    if (f < 7) {
                        b10.o(f, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (f2 == 0) {
                    if (f != 0) {
                        ncd.f("Cea708Decoder", "serviceNumber is non-zero (" + f + ") when blockSize is 0");
                    }
                } else if (f != this.k) {
                    ye1Var3.o(f2);
                } else {
                    int i6 = (ye1Var3.c << 3) + ye1Var3.d + (f2 << 3);
                    while ((ye1Var3.c << i4) + ye1Var3.d < i6) {
                        int f3 = ye1Var3.f(8);
                        if (f3 != 16) {
                            if (f3 <= 31) {
                                if (f3 != 0) {
                                    if (f3 != i4) {
                                        if (f3 != 8) {
                                            switch (f3) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (f3 >= 17 && f3 <= 23) {
                                                        ncd.f("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + f3);
                                                        ye1Var3.n(8);
                                                        break;
                                                    } else if (f3 >= 24 && f3 <= 31) {
                                                        ncd.f("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + f3);
                                                        ye1Var3.n(16);
                                                        break;
                                                    } else {
                                                        b10.o(f3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.m.b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.n = k();
                                    }
                                }
                                i2 = i4;
                                i = i5;
                            } else if (f3 <= 127) {
                                xe1 xe1Var2 = this.m;
                                if (f3 == 127) {
                                    xe1Var2.a((char) 9835);
                                } else {
                                    xe1Var2.a((char) (f3 & 255));
                                }
                                i2 = i4;
                                i = i5;
                                z2 = true;
                            } else {
                                if (f3 <= 159) {
                                    xe1[] xe1VarArr = this.l;
                                    switch (f3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i7 = f3 - 128;
                                            if (this.q != i7) {
                                                this.q = i7;
                                                this.m = xe1VarArr[i7];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (ye1Var3.e()) {
                                                    xe1 xe1Var3 = xe1VarArr[8 - i8];
                                                    xe1Var3.a.clear();
                                                    xe1Var3.b.clear();
                                                    xe1Var3.o = -1;
                                                    xe1Var3.p = -1;
                                                    xe1Var3.q = -1;
                                                    xe1Var3.s = -1;
                                                    xe1Var3.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (ye1Var3.e()) {
                                                    xe1VarArr[8 - i9].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (ye1Var3.e()) {
                                                    xe1VarArr[8 - i10].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (ye1Var3.e()) {
                                                    xe1VarArr[8 - i11].d = !xe1Var.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (ye1Var3.e()) {
                                                    xe1VarArr[8 - i12].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            ye1Var3.n(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            l();
                                            z = true;
                                            break;
                                        case 144:
                                            int i13 = i5;
                                            if (!this.m.c) {
                                                ye1Var3.n(16);
                                            } else {
                                                ye1Var3.f(4);
                                                ye1Var3.f(i13);
                                                ye1Var3.f(i13);
                                                boolean e = ye1Var3.e();
                                                boolean e2 = ye1Var3.e();
                                                ye1Var3.f(3);
                                                ye1Var3.f(3);
                                                this.m.e(e, e2);
                                            }
                                            z = true;
                                            break;
                                        case 145:
                                            if (!this.m.c) {
                                                ye1Var3.n(24);
                                            } else {
                                                int c = xe1.c(ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2));
                                                int c2 = xe1.c(ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2));
                                                ye1Var3.n(2);
                                                xe1.c(ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2), 0);
                                                this.m.f(c, c2);
                                            }
                                            z = true;
                                            break;
                                        case 146:
                                            if (!this.m.c) {
                                                ye1Var3.n(16);
                                            } else {
                                                ye1Var3.n(4);
                                                int f4 = ye1Var3.f(4);
                                                ye1Var3.n(2);
                                                ye1Var3.f(6);
                                                xe1 xe1Var4 = this.m;
                                                if (xe1Var4.u != f4) {
                                                    xe1Var4.a('\n');
                                                }
                                                xe1Var4.u = f4;
                                            }
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            b10.o(f3, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (!this.m.c) {
                                                ye1Var3.n(32);
                                            } else {
                                                int c3 = xe1.c(ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2));
                                                ye1Var3.f(2);
                                                xe1.c(ye1Var3.f(2), ye1Var3.f(2), ye1Var3.f(2), 0);
                                                ye1Var3.e();
                                                ye1Var3.e();
                                                ye1Var3.f(2);
                                                ye1Var3.f(2);
                                                int f5 = ye1Var3.f(2);
                                                ye1Var3.n(8);
                                                xe1 xe1Var5 = this.m;
                                                xe1Var5.n = c3;
                                                xe1Var5.k = f5;
                                            }
                                            z = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i14 = f3 - 152;
                                            xe1 xe1Var6 = xe1VarArr[i14];
                                            ye1Var3.n(i5);
                                            boolean e3 = ye1Var3.e();
                                            ye1Var3.n(i5);
                                            int f6 = ye1Var3.f(i4);
                                            boolean e4 = ye1Var3.e();
                                            int f7 = ye1Var3.f(7);
                                            int f8 = ye1Var3.f(8);
                                            int f9 = ye1Var3.f(4);
                                            int f10 = ye1Var3.f(4);
                                            ye1Var3.n(i5);
                                            ye1Var3.n(6);
                                            ye1Var3.n(i5);
                                            int f11 = ye1Var3.f(3);
                                            int f12 = ye1Var3.f(3);
                                            ArrayList arrayList = xe1Var6.a;
                                            xe1Var6.c = true;
                                            xe1Var6.d = e3;
                                            xe1Var6.e = f6;
                                            xe1Var6.f = e4;
                                            xe1Var6.g = f7;
                                            xe1Var6.h = f8;
                                            xe1Var6.i = f9;
                                            int i15 = f10 + 1;
                                            if (xe1Var6.j != i15) {
                                                xe1Var6.j = i15;
                                                while (true) {
                                                    if (arrayList.size() >= xe1Var6.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (f11 != 0 && xe1Var6.l != f11) {
                                                xe1Var6.l = f11;
                                                int i16 = f11 - 1;
                                                int i17 = xe1.B[i16];
                                                boolean z3 = xe1.A[i16];
                                                int i18 = xe1.y[i16];
                                                int i19 = xe1.z[i16];
                                                int i20 = xe1.x[i16];
                                                xe1Var6.n = i17;
                                                xe1Var6.k = i20;
                                            }
                                            if (f12 != 0 && xe1Var6.m != f12) {
                                                xe1Var6.m = f12;
                                                int i21 = f12 - 1;
                                                int i22 = xe1.D[i21];
                                                int i23 = xe1.C[i21];
                                                xe1Var6.e(false, false);
                                                xe1Var6.f(xe1.v, xe1.E[i21]);
                                            }
                                            if (this.q != i14) {
                                                this.q = i14;
                                                this.m = xe1VarArr[i14];
                                            }
                                            z = true;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (f3 <= 255) {
                                        this.m.a((char) (f3 & 255));
                                    } else {
                                        b10.o(f3, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        i2 = 3;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                i2 = 3;
                            }
                        } else {
                            z = true;
                            int f13 = ye1Var3.f(8);
                            if (f13 <= 31) {
                                if (f13 > 7) {
                                    if (f13 <= 15) {
                                        ye1Var3.n(8);
                                    } else if (f13 <= 23) {
                                        ye1Var3.n(16);
                                    } else if (f13 <= 31) {
                                        ye1Var3.n(24);
                                    }
                                }
                            } else if (f13 <= 127) {
                                if (f13 != 32) {
                                    if (f13 != 33) {
                                        if (f13 != 37) {
                                            if (f13 != 42) {
                                                if (f13 != 44) {
                                                    if (f13 != 63) {
                                                        if (f13 != 57) {
                                                            if (f13 != 58) {
                                                                if (f13 != 60) {
                                                                    if (f13 != 61) {
                                                                        switch (f13) {
                                                                            case 48:
                                                                                this.m.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.m.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.m.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.m.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.m.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.m.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (f13) {
                                                                                    case 118:
                                                                                        this.m.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.m.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.m.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.m.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.m.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.m.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.m.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.m.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.m.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.m.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        b10.o(f13, "Invalid G2 character: ", "Cea708Decoder");
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.m.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.m.a((char) 339);
                                                                }
                                                            } else {
                                                                this.m.a((char) 353);
                                                            }
                                                        } else {
                                                            this.m.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.m.a((char) 376);
                                                    }
                                                } else {
                                                    this.m.a((char) 338);
                                                }
                                            } else {
                                                this.m.a((char) 352);
                                            }
                                        } else {
                                            this.m.a((char) 8230);
                                        }
                                    } else {
                                        this.m.a((char) 160);
                                    }
                                } else {
                                    this.m.a(' ');
                                }
                                z2 = z;
                            } else if (f13 <= 159) {
                                if (f13 <= 135) {
                                    ye1Var3.n(32);
                                } else if (f13 <= 143) {
                                    ye1Var3.n(40);
                                } else if (f13 <= 159) {
                                    i = 2;
                                    ye1Var3.n(2);
                                    i2 = 3;
                                    ye1Var3.n(ye1Var3.f(6) << 3);
                                }
                            } else {
                                i = 2;
                                i2 = 3;
                                if (f13 <= 255) {
                                    if (f13 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        b10.o(f13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    b10.o(f13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            }
                            i = 2;
                            i2 = 3;
                        }
                        i5 = i;
                        i4 = i2;
                    }
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    public final java.util.List k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze1.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}

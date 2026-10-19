package a4;

import android.text.SpannableStringBuilder;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v7.u6;
public final class h extends k {
    public final x h = new x();
    public final g f262i = new g();
    public int f263j = -1;
    public final int f264k;
    public final f[] f265l;
    public f f266m;
    public List f267n;
    public List f268o;
    public g f269p;
    public int f270q;

    public h(int i10, List list) {
        this.f264k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = e2.g.f8228a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f265l = new f[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f265l[i11] = new f();
        }
        this.f266m = this.f265l[0];
    }

    @Override
    public final l f() {
        List list = this.f267n;
        this.f268o = list;
        list.getClass();
        return new l(list, 0);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f267n = null;
        this.f268o = null;
        this.f270q = 0;
        this.f266m = this.f265l[0];
        l();
        this.f269p = null;
    }

    @Override
    public final void g(i iVar) {
        boolean z10;
        ByteBuffer byteBuffer = iVar.f11636c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.h;
        xVar.L(limit, array);
        while (xVar.a() >= 3) {
            int A = xVar.A();
            int i10 = A & 3;
            boolean z11 = false;
            if ((A & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte A2 = (byte) xVar.A();
            byte A3 = (byte) xVar.A();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        j();
                        int i11 = (A2 & 192) >> 6;
                        int i12 = this.f263j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            e2.a.l("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f263j + " current=" + i11);
                        }
                        this.f263j = i11;
                        int i13 = A2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        g gVar = new g(i11, i13);
                        this.f269p = gVar;
                        byte[] bArr = gVar.f260b;
                        gVar.e = 1;
                        bArr[0] = A3;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        u6.g(z11);
                        g gVar2 = this.f269p;
                        if (gVar2 == null) {
                            e2.a.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = gVar2.f260b;
                            int i14 = gVar2.e;
                            int i15 = i14 + 1;
                            gVar2.e = i15;
                            bArr2[i14] = A2;
                            gVar2.e = i14 + 2;
                            bArr2[i15] = A3;
                        }
                    }
                    g gVar3 = this.f269p;
                    if (gVar3.e == (gVar3.d * 2) - 1) {
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
        if (this.f267n != this.f268o) {
            return true;
        }
        return false;
    }

    public final void j() {
        char c10;
        int i10;
        boolean z10;
        f fVar;
        g gVar = this.f269p;
        if (gVar == null) {
            return;
        }
        int i11 = 2;
        if (gVar.e != (gVar.d * 2) - 1) {
            e2.a.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f269p.d * 2) - 1) + ", but current index is " + this.f269p.e + " (sequence number " + this.f269p.f261c + ");");
        }
        g gVar2 = this.f269p;
        byte[] bArr = gVar2.f260b;
        int i12 = gVar2.e;
        g gVar3 = this.f262i;
        gVar3.k(i12, bArr);
        boolean z11 = false;
        while (true) {
            if (gVar3.b() > 0) {
                int i13 = 3;
                int g10 = gVar3.g(3);
                int g11 = gVar3.g(5);
                if (g10 == 7) {
                    gVar3.o(i11);
                    g10 = gVar3.g(6);
                    if (g10 < 7) {
                        a1.g.x(g10, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (g11 == 0) {
                    if (g10 != 0) {
                        e2.a.l("Cea708Decoder", "serviceNumber is non-zero (" + g10 + ") when blockSize is 0");
                    }
                } else if (g10 != this.f264k) {
                    gVar3.p(g11);
                } else {
                    int e = (g11 * 8) + gVar3.e();
                    while (gVar3.e() < e) {
                        int g12 = gVar3.g(8);
                        if (g12 != 16) {
                            if (g12 <= 31) {
                                if (g12 != 0) {
                                    if (g12 != i13) {
                                        if (g12 != 8) {
                                            switch (g12) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f266m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (g12 >= 17 && g12 <= 23) {
                                                        e2.a.l("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + g12);
                                                        gVar3.o(8);
                                                        break;
                                                    } else if (g12 >= 24 && g12 <= 31) {
                                                        e2.a.l("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + g12);
                                                        gVar3.o(16);
                                                        break;
                                                    } else {
                                                        a1.g.x(g12, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f266m.f242b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f267n = k();
                                    }
                                }
                                i10 = i11;
                            } else if (g12 <= 127) {
                                if (g12 == 127) {
                                    this.f266m.a((char) 9835);
                                } else {
                                    this.f266m.a((char) (g12 & 255));
                                }
                                i10 = i11;
                                z11 = true;
                            } else {
                                if (g12 <= 159) {
                                    f[] fVarArr = this.f265l;
                                    switch (g12) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z10 = true;
                                            int i14 = g12 - 128;
                                            if (this.f270q != i14) {
                                                this.f270q = i14;
                                                this.f266m = fVarArr[i14];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (gVar3.f()) {
                                                    f fVar2 = fVarArr[8 - i15];
                                                    fVar2.f241a.clear();
                                                    fVar2.f242b.clear();
                                                    fVar2.f252o = -1;
                                                    fVar2.f253p = -1;
                                                    fVar2.f254q = -1;
                                                    fVar2.f256s = -1;
                                                    fVar2.f258u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i16].d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i17].d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i18].d = !fVar.d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i19].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            gVar3.o(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            z10 = true;
                                            break;
                                        case 143:
                                            l();
                                            z10 = true;
                                            break;
                                        case 144:
                                            int i20 = i11;
                                            if (!this.f266m.f243c) {
                                                gVar3.o(16);
                                                z10 = true;
                                                i13 = 3;
                                                break;
                                            } else {
                                                gVar3.g(4);
                                                gVar3.g(i20);
                                                gVar3.g(i20);
                                                boolean f7 = gVar3.f();
                                                boolean f10 = gVar3.f();
                                                i13 = 3;
                                                gVar3.g(3);
                                                gVar3.g(3);
                                                this.f266m.e(f7, f10);
                                                z10 = true;
                                            }
                                        case 145:
                                            if (!this.f266m.f243c) {
                                                gVar3.o(24);
                                            } else {
                                                int c11 = f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), gVar3.g(2));
                                                int c12 = f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), gVar3.g(2));
                                                gVar3.o(2);
                                                f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), 0);
                                                this.f266m.f(c11, c12);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 146:
                                            if (!this.f266m.f243c) {
                                                gVar3.o(16);
                                            } else {
                                                gVar3.o(4);
                                                int g13 = gVar3.g(4);
                                                gVar3.o(2);
                                                gVar3.g(6);
                                                f fVar3 = this.f266m;
                                                if (fVar3.f258u != g13) {
                                                    fVar3.a('\n');
                                                }
                                                fVar3.f258u = g13;
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            a1.g.x(g12, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = true;
                                            break;
                                        case 151:
                                            if (!this.f266m.f243c) {
                                                gVar3.o(32);
                                            } else {
                                                int c13 = f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), gVar3.g(2));
                                                gVar3.g(2);
                                                f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), 0);
                                                gVar3.f();
                                                gVar3.f();
                                                gVar3.g(2);
                                                gVar3.g(2);
                                                int g14 = gVar3.g(2);
                                                gVar3.o(8);
                                                f fVar4 = this.f266m;
                                                fVar4.f251n = c13;
                                                fVar4.f248k = g14;
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i21 = g12 - 152;
                                            f fVar5 = fVarArr[i21];
                                            gVar3.o(i11);
                                            boolean f11 = gVar3.f();
                                            gVar3.o(i11);
                                            int g15 = gVar3.g(i13);
                                            boolean f12 = gVar3.f();
                                            int g16 = gVar3.g(7);
                                            int g17 = gVar3.g(8);
                                            int g18 = gVar3.g(4);
                                            int g19 = gVar3.g(4);
                                            gVar3.o(i11);
                                            gVar3.o(6);
                                            gVar3.o(i11);
                                            int g20 = gVar3.g(3);
                                            int g21 = gVar3.g(3);
                                            ArrayList arrayList = fVar5.f241a;
                                            fVar5.f243c = true;
                                            fVar5.d = f11;
                                            fVar5.e = g15;
                                            fVar5.f244f = f12;
                                            fVar5.f245g = g16;
                                            fVar5.h = g17;
                                            fVar5.f246i = g18;
                                            int i22 = g19 + 1;
                                            if (fVar5.f247j != i22) {
                                                fVar5.f247j = i22;
                                                while (true) {
                                                    if (arrayList.size() >= fVar5.f247j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g20 != 0 && fVar5.f249l != g20) {
                                                fVar5.f249l = g20;
                                                int i23 = g20 - 1;
                                                int i24 = f.B[i23];
                                                boolean z12 = f.A[i23];
                                                int i25 = f.f239y[i23];
                                                int i26 = f.f240z[i23];
                                                int i27 = f.f238x[i23];
                                                fVar5.f251n = i24;
                                                fVar5.f248k = i27;
                                            }
                                            if (g21 != 0 && fVar5.f250m != g21) {
                                                fVar5.f250m = g21;
                                                int i28 = g21 - 1;
                                                int i29 = f.D[i28];
                                                int i30 = f.C[i28];
                                                fVar5.e(false, false);
                                                fVar5.f(f.v, f.E[i28]);
                                            }
                                            if (this.f270q != i21) {
                                                this.f270q = i21;
                                                this.f266m = fVarArr[i21];
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                    }
                                } else {
                                    z10 = true;
                                    if (g12 <= 255) {
                                        this.f266m.a((char) (g12 & 255));
                                    } else {
                                        a1.g.x(g12, "Invalid base command: ", "Cea708Decoder");
                                        i10 = 2;
                                        c10 = 7;
                                    }
                                }
                                z11 = z10;
                                i10 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                        } else {
                            int g22 = gVar3.g(8);
                            if (g22 <= 31) {
                                c10 = 7;
                                if (g22 > 7) {
                                    if (g22 <= 15) {
                                        gVar3.o(8);
                                    } else if (g22 <= 23) {
                                        gVar3.o(16);
                                    } else if (g22 <= 31) {
                                        gVar3.o(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (g22 <= 127) {
                                    if (g22 != 32) {
                                        if (g22 != 33) {
                                            if (g22 != 37) {
                                                if (g22 != 42) {
                                                    if (g22 != 44) {
                                                        if (g22 != 63) {
                                                            if (g22 != 57) {
                                                                if (g22 != 58) {
                                                                    if (g22 != 60) {
                                                                        if (g22 != 61) {
                                                                            switch (g22) {
                                                                                case 48:
                                                                                    this.f266m.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f266m.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f266m.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f266m.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f266m.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f266m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (g22) {
                                                                                        case 118:
                                                                                            this.f266m.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f266m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f266m.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f266m.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f266m.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f266m.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f266m.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f266m.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f266m.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f266m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            a1.g.x(g22, "Invalid G2 character: ", "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f266m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f266m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f266m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f266m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f266m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f266m.a((char) 338);
                                                    }
                                                } else {
                                                    this.f266m.a((char) 352);
                                                }
                                            } else {
                                                this.f266m.a((char) 8230);
                                            }
                                        } else {
                                            this.f266m.a((char) 160);
                                        }
                                    } else {
                                        this.f266m.a(' ');
                                    }
                                    i10 = 2;
                                    z11 = true;
                                } else if (g22 <= 159) {
                                    if (g22 <= 135) {
                                        gVar3.o(32);
                                    } else if (g22 <= 143) {
                                        gVar3.o(40);
                                    } else if (g22 <= 159) {
                                        i10 = 2;
                                        gVar3.o(2);
                                        gVar3.o(gVar3.g(6) * 8);
                                    }
                                } else {
                                    i10 = 2;
                                    if (g22 <= 255) {
                                        if (g22 == 160) {
                                            this.f266m.a((char) 13252);
                                        } else {
                                            a1.g.x(g22, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f266m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        a1.g.x(g22, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                }
                            }
                            i10 = 2;
                        }
                        i11 = i10;
                    }
                }
            }
        }
        if (z11) {
            this.f267n = k();
        }
        this.f269p = null;
    }

    public final java.util.List k() {
        throw new UnsupportedOperationException("Method not decompiled: a4.h.k():java.util.List");
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f265l[i10].d();
        }
    }
}

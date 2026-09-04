package a4;

import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.vision.e2;
import e2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class i extends l {
    public final v h = new v();
    public final h f265i = new h();
    public int f266j = -1;
    public final int f267k;
    public final g[] f268l;
    public g f269m;
    public List f270n;
    public List f271o;
    public h f272p;
    public int f273q;

    public i(int i10, List list) {
        this.f267k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = e2.e.f8747a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f268l = new g[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f268l[i11] = new g();
        }
        this.f269m = this.f268l[0];
    }

    @Override
    public final m f() {
        List list = this.f270n;
        this.f271o = list;
        list.getClass();
        return new m(list, 0);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f270n = null;
        this.f271o = null;
        this.f273q = 0;
        this.f269m = this.f268l[0];
        l();
        this.f272p = null;
    }

    @Override
    public final void g(j jVar) {
        boolean z10;
        ByteBuffer byteBuffer = jVar.f10847e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.h;
        vVar.H(limit, array);
        while (vVar.a() >= 3) {
            int x10 = vVar.x();
            int i10 = x10 & 3;
            boolean z11 = false;
            if ((x10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte x11 = (byte) vVar.x();
            byte x12 = (byte) vVar.x();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        j();
                        int i11 = (x11 & 192) >> 6;
                        int i12 = this.f266j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            e2.a.n("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f266j + " current=" + i11);
                        }
                        this.f266j = i11;
                        int i13 = x11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        h hVar = new h(i11, i13);
                        this.f272p = hVar;
                        byte[] bArr = hVar.f262b;
                        hVar.f264e = 1;
                        bArr[0] = x12;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        e2.d.b(z11);
                        h hVar2 = this.f272p;
                        if (hVar2 == null) {
                            e2.a.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = hVar2.f262b;
                            int i14 = hVar2.f264e;
                            int i15 = i14 + 1;
                            hVar2.f264e = i15;
                            bArr2[i14] = x11;
                            hVar2.f264e = i14 + 2;
                            bArr2[i15] = x12;
                        }
                    }
                    h hVar3 = this.f272p;
                    if (hVar3.f264e == (hVar3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override
    public final boolean i() {
        if (this.f270n != this.f271o) {
            return true;
        }
        return false;
    }

    public final void j() {
        g gVar;
        h hVar = this.f272p;
        if (hVar == null) {
            return;
        }
        int i10 = 2;
        if (hVar.f264e != (hVar.d * 2) - 1) {
            e2.a.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f272p.d * 2) - 1) + ", but current index is " + this.f272p.f264e + " (sequence number " + this.f272p.f263c + ");");
        }
        h hVar2 = this.f272p;
        byte[] bArr = hVar2.f262b;
        int i11 = hVar2.f264e;
        h hVar3 = this.f265i;
        hVar3.o(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (hVar3.b() > 0) {
                int i12 = 3;
                int i13 = hVar3.i(3);
                int i14 = hVar3.i(5);
                if (i13 == 7) {
                    hVar3.t(i10);
                    i13 = hVar3.i(6);
                    if (i13 < 7) {
                        e2.n(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        e2.a.n("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f267k) {
                    hVar3.u(i14);
                } else {
                    int g10 = (i14 * 8) + hVar3.g();
                    while (hVar3.g() < g10) {
                        int i15 = hVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 != i12) {
                                        if (i15 != 8) {
                                            switch (i15) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f269m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i15 >= 17 && i15 <= 23) {
                                                        e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                        hVar3.t(8);
                                                        break;
                                                    } else if (i15 >= 24 && i15 <= 31) {
                                                        e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        hVar3.t(16);
                                                        break;
                                                    } else {
                                                        e2.n(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f269m.f243b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f270n = k();
                                    }
                                }
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f269m.a((char) 9835);
                                } else {
                                    this.f269m.a((char) (i15 & 255));
                                }
                                z10 = true;
                            } else {
                                if (i15 <= 159) {
                                    g[] gVarArr = this.f268l;
                                    switch (i15) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i16 = i15 - 128;
                                            if (this.f273q != i16) {
                                                this.f273q = i16;
                                                this.f269m = gVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (hVar3.h()) {
                                                    g gVar2 = gVarArr[8 - i17];
                                                    gVar2.f242a.clear();
                                                    gVar2.f243b.clear();
                                                    gVar2.f254o = -1;
                                                    gVar2.f255p = -1;
                                                    gVar2.f256q = -1;
                                                    gVar2.f258s = -1;
                                                    gVar2.f260u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (hVar3.h()) {
                                                    gVarArr[8 - i18].d = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (hVar3.h()) {
                                                    gVarArr[8 - i19].d = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (hVar3.h()) {
                                                    gVarArr[8 - i20].d = !gVar.d;
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (hVar3.h()) {
                                                    gVarArr[8 - i21].d();
                                                }
                                            }
                                            break;
                                        case 141:
                                            hVar3.t(8);
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            l();
                                            break;
                                        case 144:
                                            if (!this.f269m.f244c) {
                                                hVar3.t(16);
                                                i12 = 3;
                                                break;
                                            } else {
                                                hVar3.i(4);
                                                hVar3.i(2);
                                                hVar3.i(2);
                                                boolean h = hVar3.h();
                                                boolean h10 = hVar3.h();
                                                i12 = 3;
                                                hVar3.i(3);
                                                hVar3.i(3);
                                                this.f269m.e(h, h10);
                                            }
                                        case 145:
                                            if (!this.f269m.f244c) {
                                                hVar3.t(24);
                                            } else {
                                                int c10 = g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), hVar3.i(2));
                                                int c11 = g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), hVar3.i(2));
                                                hVar3.t(2);
                                                g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), 0);
                                                this.f269m.f(c10, c11);
                                            }
                                            i12 = 3;
                                            break;
                                        case 146:
                                            if (!this.f269m.f244c) {
                                                hVar3.t(16);
                                            } else {
                                                hVar3.t(4);
                                                int i22 = hVar3.i(4);
                                                hVar3.t(2);
                                                hVar3.i(6);
                                                g gVar3 = this.f269m;
                                                if (gVar3.f260u != i22) {
                                                    gVar3.a('\n');
                                                }
                                                gVar3.f260u = i22;
                                            }
                                            i12 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            e2.n(i15, "Invalid C1 command: ", "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (!this.f269m.f244c) {
                                                hVar3.t(32);
                                            } else {
                                                int c12 = g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), hVar3.i(2));
                                                hVar3.i(2);
                                                g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), 0);
                                                hVar3.h();
                                                hVar3.h();
                                                hVar3.i(2);
                                                hVar3.i(2);
                                                int i23 = hVar3.i(2);
                                                hVar3.t(8);
                                                g gVar4 = this.f269m;
                                                gVar4.f253n = c12;
                                                gVar4.f250k = i23;
                                            }
                                            i12 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = i15 - 152;
                                            g gVar5 = gVarArr[i24];
                                            hVar3.t(i10);
                                            boolean h11 = hVar3.h();
                                            hVar3.t(i10);
                                            int i25 = hVar3.i(i12);
                                            boolean h12 = hVar3.h();
                                            int i26 = hVar3.i(7);
                                            int i27 = hVar3.i(8);
                                            int i28 = hVar3.i(4);
                                            int i29 = hVar3.i(4);
                                            hVar3.t(i10);
                                            hVar3.t(6);
                                            hVar3.t(i10);
                                            int i30 = hVar3.i(3);
                                            int i31 = hVar3.i(3);
                                            ArrayList arrayList = gVar5.f242a;
                                            gVar5.f244c = true;
                                            gVar5.d = h11;
                                            gVar5.f245e = i25;
                                            gVar5.f246f = h12;
                                            gVar5.f247g = i26;
                                            gVar5.h = i27;
                                            gVar5.f248i = i28;
                                            int i32 = i29 + 1;
                                            if (gVar5.f249j != i32) {
                                                gVar5.f249j = i32;
                                                while (true) {
                                                    if (arrayList.size() >= gVar5.f249j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && gVar5.f251l != i30) {
                                                gVar5.f251l = i30;
                                                int i33 = i30 - 1;
                                                int i34 = g.B[i33];
                                                boolean z11 = g.A[i33];
                                                int i35 = g.f240y[i33];
                                                int i36 = g.f241z[i33];
                                                int i37 = g.f239x[i33];
                                                gVar5.f253n = i34;
                                                gVar5.f250k = i37;
                                            }
                                            if (i31 != 0 && gVar5.f252m != i31) {
                                                gVar5.f252m = i31;
                                                int i38 = i31 - 1;
                                                int i39 = g.D[i38];
                                                int i40 = g.C[i38];
                                                gVar5.e(false, false);
                                                gVar5.f(g.v, g.E[i38]);
                                            }
                                            if (this.f273q != i24) {
                                                this.f273q = i24;
                                                this.f269m = gVarArr[i24];
                                            }
                                            i12 = 3;
                                            break;
                                    }
                                } else if (i15 <= 255) {
                                    this.f269m.a((char) (i15 & 255));
                                } else {
                                    e2.n(i15, "Invalid base command: ", "Cea708Decoder");
                                }
                                z10 = true;
                            }
                        } else {
                            int i41 = hVar3.i(8);
                            if (i41 <= 31) {
                                if (i41 > 7) {
                                    if (i41 <= 15) {
                                        hVar3.t(8);
                                    } else if (i41 <= 23) {
                                        hVar3.t(16);
                                    } else if (i41 <= 31) {
                                        hVar3.t(24);
                                    }
                                }
                            } else if (i41 <= 127) {
                                if (i41 != 32) {
                                    if (i41 != 33) {
                                        if (i41 != 37) {
                                            if (i41 != 42) {
                                                if (i41 != 44) {
                                                    if (i41 != 63) {
                                                        if (i41 != 57) {
                                                            if (i41 != 58) {
                                                                if (i41 != 60) {
                                                                    if (i41 != 61) {
                                                                        switch (i41) {
                                                                            case 48:
                                                                                this.f269m.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f269m.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.f269m.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f269m.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f269m.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f269m.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i41) {
                                                                                    case 118:
                                                                                        this.f269m.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f269m.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f269m.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f269m.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f269m.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f269m.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f269m.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f269m.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f269m.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f269m.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        e2.n(i41, "Invalid G2 character: ", "Cea708Decoder");
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f269m.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f269m.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f269m.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f269m.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f269m.a((char) 376);
                                                    }
                                                } else {
                                                    this.f269m.a((char) 338);
                                                }
                                            } else {
                                                this.f269m.a((char) 352);
                                            }
                                        } else {
                                            this.f269m.a((char) 8230);
                                        }
                                    } else {
                                        this.f269m.a((char) 160);
                                    }
                                } else {
                                    this.f269m.a(' ');
                                }
                                z10 = true;
                            } else if (i41 <= 159) {
                                if (i41 <= 135) {
                                    hVar3.t(32);
                                } else if (i41 <= 143) {
                                    hVar3.t(40);
                                } else if (i41 <= 159) {
                                    hVar3.t(2);
                                    hVar3.t(hVar3.i(6) * 8);
                                }
                            } else if (i41 <= 255) {
                                if (i41 == 160) {
                                    this.f269m.a((char) 13252);
                                } else {
                                    e2.n(i41, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f269m.a('_');
                                }
                                z10 = true;
                            } else {
                                e2.n(i41, "Invalid extended command: ", "Cea708Decoder");
                            }
                        }
                        i10 = 2;
                    }
                }
            }
        }
        if (z10) {
            this.f270n = k();
        }
        this.f272p = null;
    }

    public final java.util.List k() {
        throw new UnsupportedOperationException("Method not decompiled: a4.i.k():java.util.List");
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f268l[i10].d();
        }
    }
}

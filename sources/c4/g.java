package c4;

import android.text.SpannableStringBuilder;
import b8.zb;
import g2.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class g extends j {
    public final y h = new y();
    public final f f4193i = new f();
    public int f4194j = -1;
    public final int f4195k;
    public final e[] f4196l;
    public e f4197m;
    public List f4198n;
    public List f4199o;
    public f f4200p;
    public int f4201q;

    public g(int i3, List list) {
        this.f4195k = i3 == -1 ? 1 : i3;
        if (list != null) {
            byte[] bArr = g2.h.f11846a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f4196l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f4196l[i10] = new e();
        }
        this.f4197m = this.f4196l[0];
    }

    @Override
    public final android.support.v4.media.c f() {
        List list = this.f4198n;
        this.f4199o = list;
        list.getClass();
        return new android.support.v4.media.c(list, 6);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f4198n = null;
        this.f4199o = null;
        this.f4201q = 0;
        this.f4197m = this.f4196l[0];
        l();
        this.f4200p = null;
    }

    @Override
    public final void g(h hVar) {
        boolean z10;
        ByteBuffer byteBuffer = hVar.f16157c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.h;
        yVar.L(limit, array);
        while (yVar.a() >= 3) {
            int A = yVar.A();
            int i3 = A & 3;
            boolean z11 = false;
            if ((A & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte A2 = (byte) yVar.A();
            byte A3 = (byte) yVar.A();
            if (i3 == 2 || i3 == 3) {
                if (z10) {
                    if (i3 == 3) {
                        j();
                        int i10 = (A2 & 192) >> 6;
                        int i11 = this.f4194j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            g2.a.l("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f4194j + " current=" + i10);
                        }
                        this.f4194j = i10;
                        int i12 = A2 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        f fVar = new f(i10, i12);
                        this.f4200p = fVar;
                        fVar.f4192e = 1;
                        ((byte[]) fVar.f4190b)[0] = A3;
                    } else {
                        if (i3 == 2) {
                            z11 = true;
                        }
                        zb.f(z11);
                        f fVar2 = this.f4200p;
                        if (fVar2 == null) {
                            g2.a.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = (byte[]) fVar2.f4190b;
                            int i13 = fVar2.f4192e;
                            int i14 = i13 + 1;
                            fVar2.f4192e = i14;
                            bArr[i13] = A2;
                            fVar2.f4192e = i13 + 2;
                            bArr[i14] = A3;
                        }
                    }
                    f fVar3 = this.f4200p;
                    if (fVar3.f4192e == (fVar3.d * 2) - 1) {
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
        if (this.f4198n != this.f4199o) {
            return true;
        }
        return false;
    }

    public final void j() {
        char c2;
        int i3;
        boolean z10;
        e eVar;
        f fVar = this.f4200p;
        if (fVar == null) {
            return;
        }
        int i10 = 2;
        if (fVar.f4192e != (fVar.d * 2) - 1) {
            g2.a.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f4200p.d * 2) - 1) + ", but current index is " + this.f4200p.f4192e + " (sequence number " + this.f4200p.f4191c + ");");
        }
        f fVar2 = this.f4200p;
        int i11 = fVar2.f4192e;
        f fVar3 = this.f4193i;
        fVar3.H(i11, (byte[]) fVar2.f4190b);
        boolean z11 = false;
        while (true) {
            if (fVar3.b() > 0) {
                int i12 = 3;
                int j10 = fVar3.j(3);
                int j11 = fVar3.j(5);
                if (j10 == 7) {
                    fVar3.L(i10);
                    j10 = fVar3.j(6);
                    if (j10 < 7) {
                        com.google.android.recaptcha.internal.a.o(j10, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (j11 == 0) {
                    if (j10 != 0) {
                        g2.a.l("Cea708Decoder", "serviceNumber is non-zero (" + j10 + ") when blockSize is 0");
                    }
                } else if (j10 != this.f4195k) {
                    fVar3.M(j11);
                } else {
                    int f10 = (j11 * 8) + fVar3.f();
                    while (fVar3.f() < f10) {
                        int j12 = fVar3.j(8);
                        if (j12 != 16) {
                            if (j12 <= 31) {
                                if (j12 != 0) {
                                    if (j12 != i12) {
                                        if (j12 != 8) {
                                            switch (j12) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f4197m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (j12 >= 17 && j12 <= 23) {
                                                        g2.a.l("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + j12);
                                                        fVar3.L(8);
                                                        break;
                                                    } else if (j12 >= 24 && j12 <= 31) {
                                                        g2.a.l("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + j12);
                                                        fVar3.L(16);
                                                        break;
                                                    } else {
                                                        com.google.android.recaptcha.internal.a.o(j12, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f4197m.f4171b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f4198n = k();
                                    }
                                }
                                i3 = i10;
                            } else if (j12 <= 127) {
                                if (j12 == 127) {
                                    this.f4197m.a((char) 9835);
                                } else {
                                    this.f4197m.a((char) (j12 & 255));
                                }
                                i3 = i10;
                                z11 = true;
                            } else {
                                if (j12 <= 159) {
                                    e[] eVarArr = this.f4196l;
                                    switch (j12) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z10 = true;
                                            int i13 = j12 - 128;
                                            if (this.f4201q != i13) {
                                                this.f4201q = i13;
                                                this.f4197m = eVarArr[i13];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (fVar3.i()) {
                                                    e eVar2 = eVarArr[8 - i14];
                                                    eVar2.f4170a.clear();
                                                    eVar2.f4171b.clear();
                                                    eVar2.f4182o = -1;
                                                    eVar2.f4183p = -1;
                                                    eVar2.f4184q = -1;
                                                    eVar2.f4186s = -1;
                                                    eVar2.f4188u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i15].d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i16].d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i17].d = !eVar.d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i18].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            fVar3.L(8);
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
                                            int i19 = i10;
                                            if (!this.f4197m.f4172c) {
                                                fVar3.L(16);
                                                z10 = true;
                                                i12 = 3;
                                                break;
                                            } else {
                                                fVar3.j(4);
                                                fVar3.j(i19);
                                                fVar3.j(i19);
                                                boolean i20 = fVar3.i();
                                                boolean i21 = fVar3.i();
                                                i12 = 3;
                                                fVar3.j(3);
                                                fVar3.j(3);
                                                this.f4197m.e(i20, i21);
                                                z10 = true;
                                            }
                                        case 145:
                                            if (!this.f4197m.f4172c) {
                                                fVar3.L(24);
                                            } else {
                                                int c10 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                int c11 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                fVar3.L(2);
                                                e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), 0);
                                                this.f4197m.f(c10, c11);
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 146:
                                            if (!this.f4197m.f4172c) {
                                                fVar3.L(16);
                                            } else {
                                                fVar3.L(4);
                                                int j13 = fVar3.j(4);
                                                fVar3.L(2);
                                                fVar3.j(6);
                                                e eVar3 = this.f4197m;
                                                if (eVar3.f4188u != j13) {
                                                    eVar3.a('\n');
                                                }
                                                eVar3.f4188u = j13;
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            com.google.android.recaptcha.internal.a.o(j12, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = true;
                                            break;
                                        case 151:
                                            if (!this.f4197m.f4172c) {
                                                fVar3.L(32);
                                            } else {
                                                int c12 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                fVar3.j(2);
                                                e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), 0);
                                                fVar3.i();
                                                fVar3.i();
                                                fVar3.j(2);
                                                fVar3.j(2);
                                                int j14 = fVar3.j(2);
                                                fVar3.L(8);
                                                e eVar4 = this.f4197m;
                                                eVar4.f4181n = c12;
                                                eVar4.f4178k = j14;
                                            }
                                            z10 = true;
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
                                            int i22 = j12 - 152;
                                            e eVar5 = eVarArr[i22];
                                            fVar3.L(i10);
                                            boolean i23 = fVar3.i();
                                            fVar3.L(i10);
                                            int j15 = fVar3.j(i12);
                                            boolean i24 = fVar3.i();
                                            int j16 = fVar3.j(7);
                                            int j17 = fVar3.j(8);
                                            int j18 = fVar3.j(4);
                                            int j19 = fVar3.j(4);
                                            fVar3.L(i10);
                                            fVar3.L(6);
                                            fVar3.L(i10);
                                            int j20 = fVar3.j(3);
                                            int j21 = fVar3.j(3);
                                            ArrayList arrayList = eVar5.f4170a;
                                            eVar5.f4172c = true;
                                            eVar5.d = i23;
                                            eVar5.f4173e = j15;
                                            eVar5.f4174f = i24;
                                            eVar5.f4175g = j16;
                                            eVar5.h = j17;
                                            eVar5.f4176i = j18;
                                            int i25 = j19 + 1;
                                            if (eVar5.f4177j != i25) {
                                                eVar5.f4177j = i25;
                                                while (true) {
                                                    if (arrayList.size() >= eVar5.f4177j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (j20 != 0 && eVar5.f4179l != j20) {
                                                eVar5.f4179l = j20;
                                                int i26 = j20 - 1;
                                                int i27 = e.B[i26];
                                                boolean z12 = e.A[i26];
                                                int i28 = e.f4168y[i26];
                                                int i29 = e.f4169z[i26];
                                                int i30 = e.f4167x[i26];
                                                eVar5.f4181n = i27;
                                                eVar5.f4178k = i30;
                                            }
                                            if (j21 != 0 && eVar5.f4180m != j21) {
                                                eVar5.f4180m = j21;
                                                int i31 = j21 - 1;
                                                int i32 = e.D[i31];
                                                int i33 = e.C[i31];
                                                eVar5.e(false, false);
                                                eVar5.f(e.v, e.E[i31]);
                                            }
                                            if (this.f4201q != i22) {
                                                this.f4201q = i22;
                                                this.f4197m = eVarArr[i22];
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                    }
                                } else {
                                    z10 = true;
                                    if (j12 <= 255) {
                                        this.f4197m.a((char) (j12 & 255));
                                    } else {
                                        com.google.android.recaptcha.internal.a.o(j12, "Invalid base command: ", "Cea708Decoder");
                                        i3 = 2;
                                        c2 = 7;
                                    }
                                }
                                z11 = z10;
                                i3 = 2;
                                c2 = 7;
                            }
                            c2 = 7;
                        } else {
                            int j22 = fVar3.j(8);
                            if (j22 <= 31) {
                                c2 = 7;
                                if (j22 > 7) {
                                    if (j22 <= 15) {
                                        fVar3.L(8);
                                    } else if (j22 <= 23) {
                                        fVar3.L(16);
                                    } else if (j22 <= 31) {
                                        fVar3.L(24);
                                    }
                                }
                            } else {
                                c2 = 7;
                                if (j22 <= 127) {
                                    if (j22 != 32) {
                                        if (j22 != 33) {
                                            if (j22 != 37) {
                                                if (j22 != 42) {
                                                    if (j22 != 44) {
                                                        if (j22 != 63) {
                                                            if (j22 != 57) {
                                                                if (j22 != 58) {
                                                                    if (j22 != 60) {
                                                                        if (j22 != 61) {
                                                                            switch (j22) {
                                                                                case 48:
                                                                                    this.f4197m.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f4197m.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f4197m.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f4197m.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f4197m.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f4197m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (j22) {
                                                                                        case 118:
                                                                                            this.f4197m.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f4197m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f4197m.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f4197m.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f4197m.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f4197m.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f4197m.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f4197m.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f4197m.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f4197m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            com.google.android.recaptcha.internal.a.o(j22, "Invalid G2 character: ", "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f4197m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f4197m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f4197m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f4197m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f4197m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f4197m.a((char) 338);
                                                    }
                                                } else {
                                                    this.f4197m.a((char) 352);
                                                }
                                            } else {
                                                this.f4197m.a((char) 8230);
                                            }
                                        } else {
                                            this.f4197m.a((char) 160);
                                        }
                                    } else {
                                        this.f4197m.a(' ');
                                    }
                                    i3 = 2;
                                    z11 = true;
                                } else if (j22 <= 159) {
                                    if (j22 <= 135) {
                                        fVar3.L(32);
                                    } else if (j22 <= 143) {
                                        fVar3.L(40);
                                    } else if (j22 <= 159) {
                                        i3 = 2;
                                        fVar3.L(2);
                                        fVar3.L(fVar3.j(6) * 8);
                                    }
                                } else {
                                    i3 = 2;
                                    if (j22 <= 255) {
                                        if (j22 == 160) {
                                            this.f4197m.a((char) 13252);
                                        } else {
                                            com.google.android.recaptcha.internal.a.o(j22, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f4197m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        com.google.android.recaptcha.internal.a.o(j22, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                }
                            }
                            i3 = 2;
                        }
                        i10 = i3;
                    }
                }
            }
        }
        if (z11) {
            this.f4198n = k();
        }
        this.f4200p = null;
    }

    public final java.util.List k() {
        throw new UnsupportedOperationException("Method not decompiled: c4.g.k():java.util.List");
    }

    public final void l() {
        for (int i3 = 0; i3 < 8; i3++) {
            this.f4196l[i3].d();
        }
    }
}

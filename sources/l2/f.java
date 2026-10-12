package l2;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a0;
import b2.x0;
import c3.h0;
import c3.t;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.z;
import l.d0;
import l.w;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l0;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.hc1;
import p4.v;
import tc.u;
import y8.e0;
import zh.r3;
public final class f implements w, l.i, k1.f, fp0, ne.f, bh.h, i91, s, n5.b, OnCompleteListener, yq0 {
    public final int f14502a;
    public final Object f14503b;

    public f(Object obj, int i10) {
        this.f14502a = i10;
        this.f14503b = obj;
    }

    public static void r(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override
    public void X(float f7, boolean z10) {
        int i10 = this.f14502a;
        Object obj = this.f14503b;
        switch (i10) {
            case 4:
                ng.h hVar = (ng.h) obj;
                float f10 = hVar.f16369b;
                float y3 = k3.y(hVar.f16370c, f10, f7, f10);
                hVar.d = y3;
                if (z10) {
                    u6 u6Var = hVar.e;
                    u6Var.getClass();
                    u6Var.c(null, y3);
                }
                hVar.invalidate();
                return;
            default:
                hc1 hc1Var = (hc1) ((l0) obj);
                int i11 = (int) (g6.f20132q * 100.0f);
                int i12 = (int) (f7 * 100.0f);
                g6.f20132q = f7;
                if (i11 != i12) {
                    ThemeActivity themeActivity = hc1Var.e.e;
                    wl0 wl0Var = (wl0) themeActivity.f32842b.K(themeActivity.f32849f0);
                    if (wl0Var != null) {
                        ((e9) wl0Var.f44838a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (g6.f20132q * 100.0f))));
                    }
                    g6.E(true);
                    return;
                }
                return;
        }
    }

    @Override
    public Object a(td.p pVar, md.c cVar) {
        return ((z) this.f14503b).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        r7.z zVar = (r7.z) ((r7.k) obj).u();
        r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
        Parcel N0 = zVar.N0();
        r7.d.c(N0, (g8.e) this.f14503b);
        r7.d.d(N0, fVar);
        N0.writeString(null);
        zVar.R0(N0, 63);
    }

    public void b(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        byte[] bArr;
        int i21;
        u3.f fVar = (u3.f) this.f14503b;
        u3.g gVar = fVar.f46158b;
        SparseArray sparseArray = fVar.f46160c;
        x xVar = fVar.f46173k;
        x xVar2 = fVar.f46169i;
        int i22 = 2;
        int i23 = 0;
        int i24 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        fVar.h(i10);
                                        byte[] bArr2 = new byte[i11];
                                        fVar.f46186y.f46148x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw x0.a(null, "Unexpected id: " + i10);
                                }
                                fVar.h(i10);
                                byte[] bArr3 = new byte[i11];
                                fVar.f46186y.f46137l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(xVar.f8411a, (byte) 0);
                            pVar.readFully(xVar.f8411a, 4 - i11, i11);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        fVar.h(i10);
                        fVar.f46186y.f46136k = new h0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i10);
                    byte[] bArr5 = new byte[i11];
                    fVar.f46186y.f46135j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                fVar.h(i10);
                u3.e eVar = fVar.f46186y;
                int i25 = eVar.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (fVar.O == 2) {
                u3.e eVar2 = (u3.e) sparseArray.get(fVar.U);
                int i26 = fVar.X;
                x xVar3 = fVar.f46178p;
                if (i26 == 4 && "V_VP9".equals(eVar2.f46130c)) {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.f8411a, 0, i11);
                    return;
                }
                pVar.r(i11);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f46190c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        u3.e eVar3 = (u3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.r(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f46127a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i27 = (xVar2.f8411a[2] & 6) >> 1;
            byte b10 = 255;
            if (i27 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i11 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i28 = (xVar2.f8411a[3] & 255) + 1;
                fVar.S = i28;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i28];
                } else if (iArr2.length < i28) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i28)];
                }
                fVar.T = iArr2;
                if (i27 == 2) {
                    int i29 = fVar.S;
                    Arrays.fill(iArr2, 0, i29, ((i11 - fVar.V) - 4) / i29);
                } else if (i27 == 1) {
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 4;
                    while (true) {
                        i18 = fVar.S - 1;
                        if (i30 >= i18) {
                            break;
                        }
                        fVar.T[i30] = 0;
                        while (true) {
                            i19 = i32 + 1;
                            fVar.l(pVar, i19);
                            int i33 = xVar2.f8411a[i32] & 255;
                            int[] iArr3 = fVar.T;
                            i20 = iArr3[i30] + i33;
                            iArr3[i30] = i20;
                            if (i33 != 255) {
                                break;
                            }
                            i32 = i19;
                        }
                        i31 += i20;
                        i30++;
                        i32 = i19;
                    }
                    fVar.T[i18] = ((i11 - fVar.V) - i32) - i31;
                } else if (i27 == 3) {
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 4;
                    while (true) {
                        int i37 = fVar.S - i24;
                        if (i34 < i37) {
                            fVar.T[i34] = i23;
                            int i38 = i36 + 1;
                            fVar.l(pVar, i38);
                            if (xVar2.f8411a[i36] != 0) {
                                int i39 = i23;
                                while (true) {
                                    if (i39 < 8) {
                                        int i40 = i24 << (7 - i39);
                                        i15 = i22;
                                        if ((xVar2.f8411a[i36] & i40) != 0) {
                                            int i41 = i38 + i39;
                                            fVar.l(pVar, i41);
                                            i16 = i24;
                                            j10 = xVar2.f8411a[i36] & b10 & (~i40);
                                            while (i38 < i41) {
                                                j10 = (j10 << 8) | (xVar2.f8411a[i38] & b10);
                                                i38++;
                                                i41 = i41;
                                                b10 = 255;
                                            }
                                            i17 = i41;
                                            if (i34 > 0) {
                                                j10 -= (1 << ((i39 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i39++;
                                            i22 = i15;
                                            b10 = 255;
                                        }
                                    } else {
                                        i15 = i22;
                                        i16 = i24;
                                        j10 = 0;
                                        i17 = i38;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i42 = (int) j10;
                                int[] iArr4 = fVar.T;
                                if (i34 != 0) {
                                    i42 += iArr4[i34 - 1];
                                }
                                iArr4[i34] = i42;
                                i35 += i42;
                                i34++;
                                i23 = i39;
                                i22 = i15;
                                i24 = i16;
                                i36 = i17;
                                b10 = 255;
                            } else {
                                throw x0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i12 = i22;
                            i13 = i23;
                            i14 = i24;
                            fVar.T[i37] = ((i11 - fVar.V) - i36) - i35;
                            break;
                        }
                    }
                    throw x0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw x0.a(null, "Unexpected lacing value: " + i27);
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            int i43 = xVar2.f8411a[i14] & 255;
            fVar.P = fVar.n(i43 | (bArr[i13] << 8)) + fVar.M;
            if (eVar3.e != i14 && (i10 != 163 || (xVar2.f8411a[i12] & 128) != 128)) {
                i21 = i13;
            } else {
                i21 = 1;
            }
            fVar.W = i21;
            fVar.O = i12;
            fVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i44 = fVar.R;
                if (i44 < fVar.S) {
                    fVar.i(eVar3, ((fVar.R * eVar3.f46132f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i44], false), 0);
                    fVar.R++;
                } else {
                    fVar.O = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i45 = fVar.R;
                if (i45 < fVar.S) {
                    int[] iArr5 = fVar.T;
                    iArr5[i45] = fVar.o(pVar, eVar3, iArr5[i45], true);
                    fVar.R++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof d0) {
            ((d0) kVar).f14392z.k().c(false);
        }
        w wVar = ((m.h) this.f14503b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    public boolean e(int i10) {
        c91 c91Var = ((k91) this.f14503b).L;
        if (c91Var == null) {
            return false;
        }
        return c91Var.c(i10);
    }

    public void g(int i10, long j10) {
        u3.f fVar = (u3.f) this.f14503b;
        if (i10 != 240) {
            if (i10 != 241) {
                if (i10 != 20529) {
                    if (i10 != 20530) {
                        boolean z10 = false;
                        switch (i10) {
                            case 131:
                                int i11 = (int) j10;
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 != 17) {
                                            if (i11 != 33) {
                                                fVar.h(i10);
                                                fVar.f46186y.e = -1;
                                                return;
                                            }
                                            fVar.h(i10);
                                            fVar.f46186y.e = 5;
                                            return;
                                        }
                                        fVar.h(i10);
                                        fVar.f46186y.e = 3;
                                        return;
                                    }
                                    fVar.h(i10);
                                    fVar.f46186y.e = 1;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f46186y.e = 2;
                                return;
                            case 136:
                                fVar.h(i10);
                                u3.e eVar = fVar.f46186y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar.Y = z10;
                                return;
                            case 155:
                                fVar.Q = fVar.n(j10);
                                return;
                            case 159:
                                fVar.h(i10);
                                fVar.f46186y.Q = (int) j10;
                                return;
                            case 176:
                                fVar.h(i10);
                                fVar.f46186y.f46139n = (int) j10;
                                return;
                            case 179:
                                if (!fVar.f46187z) {
                                    fVar.g(i10);
                                    fVar.E = fVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i10);
                                fVar.f46186y.f46140o = (int) j10;
                                return;
                            case 215:
                                fVar.h(i10);
                                fVar.f46186y.d = (int) j10;
                                return;
                            case 231:
                                fVar.M = fVar.n(j10);
                                return;
                            case 238:
                                fVar.X = (int) j10;
                                return;
                            case 247:
                                if (!fVar.f46187z) {
                                    fVar.g(i10);
                                    fVar.F = (int) j10;
                                    return;
                                }
                                return;
                            case 251:
                                fVar.Y = true;
                                return;
                            case 16871:
                                fVar.h(i10);
                                fVar.f46186y.h = (int) j10;
                                return;
                            case 16980:
                                if (j10 != 3) {
                                    throw x0.a(null, "ContentCompAlgo " + j10 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j10 < 1 || j10 > 2) {
                                    throw x0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j10 != 1) {
                                    throw x0.a(null, "EBMLReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j10 != 5) {
                                    throw x0.a(null, "ContentEncAlgo " + j10 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j10 != 1) {
                                    throw x0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j10 + fVar.f46181s;
                                return;
                            case 21432:
                                int i12 = (int) j10;
                                fVar.h(i10);
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 3) {
                                            if (i12 == 15) {
                                                fVar.f46186y.f46149y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f46186y.f46149y = 1;
                                        return;
                                    }
                                    fVar.f46186y.f46149y = 2;
                                    return;
                                }
                                fVar.f46186y.f46149y = 0;
                                return;
                            case 21680:
                                fVar.h(i10);
                                fVar.f46186y.f46142q = (int) j10;
                                return;
                            case 21682:
                                fVar.h(i10);
                                fVar.f46186y.f46144s = (int) j10;
                                return;
                            case 21690:
                                fVar.h(i10);
                                fVar.f46186y.f46143r = (int) j10;
                                return;
                            case 21930:
                                fVar.h(i10);
                                u3.e eVar2 = fVar.f46186y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i10);
                                u3.e eVar3 = fVar.f46186y;
                                eVar3.f46150z = true;
                                eVar3.f46141p = (int) j10;
                                return;
                            case 21998:
                                fVar.h(i10);
                                fVar.f46186y.f46133g = (int) j10;
                                return;
                            case 22186:
                                fVar.h(i10);
                                fVar.f46186y.T = j10;
                                return;
                            case 22203:
                                fVar.h(i10);
                                fVar.f46186y.U = j10;
                                return;
                            case 25188:
                                fVar.h(i10);
                                fVar.f46186y.R = (int) j10;
                                return;
                            case 30114:
                                fVar.Z = j10;
                                return;
                            case 30321:
                                fVar.h(i10);
                                int i13 = (int) j10;
                                if (i13 != 0) {
                                    if (i13 != 1) {
                                        if (i13 != 2) {
                                            if (i13 == 3) {
                                                fVar.f46186y.f46145t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f46186y.f46145t = 2;
                                        return;
                                    }
                                    fVar.f46186y.f46145t = 1;
                                    return;
                                }
                                fVar.f46186y.f46145t = 0;
                                return;
                            case 2352003:
                                fVar.h(i10);
                                fVar.f46186y.f46132f = (int) j10;
                                return;
                            case 2807729:
                                fVar.f46182t = j10;
                                return;
                            default:
                                switch (i10) {
                                    case 21945:
                                        fVar.h(i10);
                                        int i14 = (int) j10;
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                fVar.f46186y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f46186y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i10);
                                        int g10 = b2.o.g((int) j10);
                                        if (g10 != -1) {
                                            fVar.f46186y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i10);
                                        fVar.f46186y.f46150z = true;
                                        int f7 = b2.o.f((int) j10);
                                        if (f7 != -1) {
                                            fVar.f46186y.A = f7;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i10);
                                        fVar.f46186y.D = (int) j10;
                                        return;
                                    case 21949:
                                        fVar.h(i10);
                                        fVar.f46186y.E = (int) j10;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j10 != 1) {
                        throw x0.a(null, "ContentEncodingScope " + j10 + " not supported");
                    }
                } else if (j10 != 0) {
                    throw x0.a(null, "ContentEncodingOrder " + j10 + " not supported");
                }
            } else if (!fVar.f46187z) {
                fVar.g(i10);
                if (fVar.G == -1) {
                    fVar.G = j10;
                }
            }
        } else if (!fVar.f46187z) {
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
            }
        }
    }

    @Override
    public Object mo27get() {
        return new s5.i((Context) ((hd.a) this.f14503b).mo27get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f14502a) {
            case 4:
                ng.h hVar = (ng.h) this.f14503b;
                float f7 = hVar.f16369b;
                return String.valueOf(Math.round((hVar.f16368a.getProgress() * (hVar.f16370c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override
    public ee.b getData() {
        return ((z) this.f14503b).f13830c;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    public void j(float f7) {
        k91 k91Var = (k91) this.f14503b;
        if (f7 == 1.0f) {
            View[] viewArr = k91Var.e;
            View[] viewArr2 = k91Var.e;
            if (viewArr[1] != null) {
                k91Var.F();
                k91Var.h.put(k91Var.f26642f[1], viewArr2[1]);
                k91Var.removeView(viewArr2[1]);
                k91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            k91Var.z(k91Var.f26640b);
            return;
        }
        View[] viewArr3 = k91Var.e;
        View[] viewArr4 = k91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (k91Var.f26648y) {
            k91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            k91Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            k91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            k91Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        k91Var.w(false);
    }

    public void k(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f14503b;
        if (pVar == eVar.f43028y && mVar != null) {
            v vVar = eVar.f43027x.f43120a;
            String d = mVar.d();
            p4.w wVar = new p4.w(vVar, d, eVar.b(vVar, d), false);
            wVar.i(mVar);
            if (eVar.d != wVar) {
                eVar.h(eVar, wVar, eVar.f43028y, 3, eVar.f43027x, collection);
                eVar.f43027x = null;
                eVar.f43028y = null;
            }
        } else if (pVar == eVar.e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public int k0() {
        switch (this.f14502a) {
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void m0(bh.a aVar) {
        aVar.a(((jr0) this.f14503b).getThemedColor(g6.f19901d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void n(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.f14503b;
        m.h hVar = toolbar.f1168a.J;
        if (hVar != null && hVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f14821c).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).f1539a.t();
        }
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f14503b;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.L0(e0Var, false, null);
    }

    @Override
    public boolean p(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.f14503b).getClass();
        return false;
    }

    @Override
    public boolean q(l.k kVar) {
        m.h hVar = (m.h) this.f14503b;
        if (kVar == hVar.f15114c) {
            return false;
        }
        ((d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.e;
        if (wVar == null) {
            return false;
        }
        return wVar.q(kVar);
    }

    public void s(int i10, long j10, long j11) {
        u3.f fVar = (u3.f) this.f14503b;
        fVar.f46172j0.getClass();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 183) {
                    if (i10 != 187) {
                        if (i10 != 19899) {
                            if (i10 != 20533) {
                                if (i10 != 21968) {
                                    if (i10 != 408125543) {
                                        if (i10 != 475249515) {
                                            if (i10 == 524531317 && !fVar.f46187z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f46172j0.K(new t(fVar.v));
                                                fVar.f46187z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f46187z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = fVar.f46181s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw x0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f46181s = j10;
                                    fVar.f46180r = j11;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f46186y.f46150z = true;
                                return;
                            }
                            fVar.h(i10);
                            fVar.f46186y.f46134i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f46187z) {
                        fVar.g(i10);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f46187z) {
                    fVar.g(i10);
                    fVar.F = -1;
                    fVar.G = -1L;
                    fVar.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f46139n = -1;
            obj.f46140o = -1;
            obj.f46141p = -1;
            obj.f46142q = -1;
            obj.f46143r = -1;
            obj.f46144s = 0;
            obj.f46145t = -1;
            obj.f46146u = 0.0f;
            obj.v = 0.0f;
            obj.f46147w = 0.0f;
            obj.f46148x = null;
            obj.f46149y = -1;
            obj.f46150z = false;
            obj.A = -1;
            obj.B = -1;
            obj.C = -1;
            obj.D = 1000;
            obj.E = 200;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.O = -1.0f;
            obj.Q = 1;
            obj.R = -1;
            obj.S = 8000;
            obj.T = 0L;
            obj.U = 0L;
            obj.W = false;
            obj.Y = true;
            obj.Z = "eng";
            fVar.f46186y = obj;
            obj.f46126a = fVar.f46184w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    @Override
    public void s0() {
        sc k10 = ((r3) this.f14503b).getBulletinFactory().k(false);
        k10.f29112t = true;
        k10.j();
    }

    @Override
    public void t() {
        ((p9) this.f14503b).f28248a.invalidate();
    }

    public void u(int i10, String str) {
        u3.f fVar = (u3.f) this.f14503b;
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 != 2274716) {
                        return;
                    }
                    fVar.h(i10);
                    fVar.f46186y.Z = str;
                    return;
                }
                fVar.h(i10);
                fVar.f46186y.f46128b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw x0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f46184w = str.equals("webm");
                return;
            }
        }
        fVar.h(i10);
        fVar.f46186y.f46130c = str;
    }

    @Override
    public void v(Canvas canvas) {
        jr0 jr0Var = (jr0) this.f14503b;
        canvas.drawColor(jr0Var.getThemedColor(g6.f19901d6));
        if (SharedConfig.chatBlurEnabled()) {
            jr0Var.O0.b(canvas, -2);
        }
    }

    public void w(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((u) this.f14503b).f45609c) {
            }
            throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
        }
    }

    @Override
    public void z() {
        int i10 = this.f14502a;
    }

    public f(TextView textView) {
        this.f14502a = 14;
        this.f14503b = new q1.g(textView);
    }

    public f(int i10, int i11) {
        this.f14502a = 10;
        this.f14503b = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    private final void l() {
    }

    private final void o() {
    }

    @Override
    public void U() {
    }

    @Override
    public void c() {
    }

    @Override
    public void m() {
    }

    @Override
    public void f(boolean z10) {
    }
}

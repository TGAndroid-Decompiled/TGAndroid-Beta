package ka;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.RecyclerView;
import b2.j;
import b2.r0;
import c3.g0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.n;
import e2.d0;
import e8.i;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.concurrent.Callable;
import m.k;
import mg.h;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.a71;
import org.telegram.ui.kv0;
import org.telegram.ui.vt0;
import p4.m;
import p4.p;
import p4.u;
import p4.v;
import pg.t1;
import pg.u0;
import qg.v1;
import s4.h1;
import s4.o0;
import s4.p0;
import v7.h5;
import y2.l;
public class c implements k, so0, l1, v1, r2.k, o, h1, s, s0, w2.d, Continuation, y2.g, a71 {
    public final int f13553a;
    public Object f13554b;

    public c(int i10, boolean z10) {
        this.f13553a = i10;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public int C(View view) {
        return o0.v(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public androidx.lifecycle.p0 D(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f13554b) {
            if (cVar.f44152a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public n4.a H() {
        return new n4.a(((AudioAttributes.Builder) this.f13554b).build());
    }

    @Override
    public boolean I1() {
        return false;
    }

    public String J(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            e eVar = (e) this.f13554b;
            f fVar = new f(stringWriter, eVar.f13558a, eVar.f13559b, eVar.f13560c, eVar.d);
            fVar.h(obj);
            fVar.j();
            fVar.f13562b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void K(int i10, long j3) {
        u3.d dVar = (u3.d) this.f13554b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        dVar.d(i10);
                        dVar.f43926x.e = (int) j3;
                        return;
                    case 136:
                        dVar.d(i10);
                        u3.c cVar = dVar.f43926x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar.X = z10;
                        return;
                    case 155:
                        dVar.L = dVar.l(j3);
                        return;
                    case 159:
                        dVar.d(i10);
                        dVar.f43926x.Q = (int) j3;
                        return;
                    case 176:
                        dVar.d(i10);
                        dVar.f43926x.f43884n = (int) j3;
                        return;
                    case 179:
                        dVar.b(i10);
                        dVar.F.c(dVar.l(j3));
                        return;
                    case 186:
                        dVar.d(i10);
                        dVar.f43926x.f43885o = (int) j3;
                        return;
                    case 215:
                        dVar.d(i10);
                        dVar.f43926x.d = (int) j3;
                        return;
                    case 231:
                        dVar.E = dVar.l(j3);
                        return;
                    case 238:
                        dVar.S = (int) j3;
                        return;
                    case 241:
                        if (!dVar.H) {
                            dVar.b(i10);
                            dVar.G.c(j3);
                            dVar.H = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.T = true;
                        return;
                    case 16871:
                        dVar.d(i10);
                        dVar.f43926x.h = (int) j3;
                        return;
                    case 16980:
                        if (j3 != 3) {
                            throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j3 < 1 || j3 > 2) {
                            throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j3 != 5) {
                            throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.A = j3 + dVar.f43922s;
                        return;
                    case 21432:
                        int i11 = (int) j3;
                        dVar.d(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f43926x.f43894y = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f43926x.f43894y = 1;
                                return;
                            }
                            dVar.f43926x.f43894y = 2;
                            return;
                        }
                        dVar.f43926x.f43894y = 0;
                        return;
                    case 21680:
                        dVar.d(i10);
                        dVar.f43926x.f43887q = (int) j3;
                        return;
                    case 21682:
                        dVar.d(i10);
                        dVar.f43926x.f43889s = (int) j3;
                        return;
                    case 21690:
                        dVar.d(i10);
                        dVar.f43926x.f43888r = (int) j3;
                        return;
                    case 21930:
                        dVar.d(i10);
                        u3.c cVar2 = dVar.f43926x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar2.W = z10;
                        return;
                    case 21938:
                        dVar.d(i10);
                        u3.c cVar3 = dVar.f43926x;
                        cVar3.f43895z = true;
                        cVar3.f43886p = (int) j3;
                        return;
                    case 21998:
                        dVar.d(i10);
                        dVar.f43926x.f43878g = (int) j3;
                        return;
                    case 22186:
                        dVar.d(i10);
                        dVar.f43926x.T = j3;
                        return;
                    case 22203:
                        dVar.d(i10);
                        dVar.f43926x.U = j3;
                        return;
                    case 25188:
                        dVar.d(i10);
                        dVar.f43926x.R = (int) j3;
                        return;
                    case 30114:
                        dVar.U = j3;
                        return;
                    case 30321:
                        dVar.d(i10);
                        int i12 = (int) j3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f43926x.f43890t = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f43926x.f43890t = 2;
                                return;
                            }
                            dVar.f43926x.f43890t = 1;
                            return;
                        }
                        dVar.f43926x.f43890t = 0;
                        return;
                    case 2352003:
                        dVar.d(i10);
                        dVar.f43926x.f43877f = (int) j3;
                        return;
                    case 2807729:
                        dVar.f43923t = j3;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.d(i10);
                                int i13 = (int) j3;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f43926x.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f43926x.C = 2;
                                return;
                            case 21946:
                                dVar.d(i10);
                                int g10 = j.g((int) j3);
                                if (g10 != -1) {
                                    dVar.f43926x.B = g10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i10);
                                dVar.f43926x.f43895z = true;
                                int f7 = j.f((int) j3);
                                if (f7 != -1) {
                                    dVar.f43926x.A = f7;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i10);
                                dVar.f43926x.D = (int) j3;
                                return;
                            case 21949:
                                dVar.d(i10);
                                dVar.f43926x.E = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j3 != 1) {
                throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
            }
        } else if (j3 == 0) {
        } else {
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void P0(int i10, u1 u1Var) {
        ia iaVar = (ia) this.f13554b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f20473s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ia iaVar = (ia) this.f13554b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f20473s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    public void U(p pVar, m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f13554b;
        if (pVar == eVar.f40837y && mVar != null) {
            u uVar = eVar.f40836x.f40928a;
            String d = mVar.d();
            v vVar = new v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f40837y, 3, eVar.f40836x, collection);
                eVar.f40836x = null;
                eVar.f40837y = null;
            }
        } else if (pVar == eVar.e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public void W(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f13554b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public boolean W0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        h hVar = (h) this.f13554b;
        float f10 = hVar.f15072b;
        float z11 = e2.z(hVar.f15073c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            r6 r6Var = hVar.e;
            r6Var.getClass();
            r6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public kv0 Y1() {
        return null;
    }

    @Override
    public void Z(float f7) {
        vt0 vt0Var = (vt0) this.f13554b;
        u0.e(vt0Var.P1).k(String.valueOf(pg.m.f41167a.indexOf(vt0Var.W0.getCurrentBrush())), f7);
        t1 t1Var = vt0Var.K1;
        t1Var.f41265c = f7;
        vt0Var.s0(t1Var, null);
    }

    @Override
    public androidx.lifecycle.p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13553a) {
            case 21:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar);
                k7.a.c(I0, (s6.a) this.f13554b);
                I0.writeStrongBinder(null);
                eVar.J0(I0, 2);
                return;
            default:
                v8.e eVar2 = (v8.e) this.f13554b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    i iVar = (i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8027a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f8035a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    h5.a(Status.h, Boolean.FALSE, aVar.f8026b);
                    return;
                }
        }
    }

    public void b(int i10, int i11, c3.p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        u3.d dVar = (u3.d) this.f13554b;
        u3.e eVar = dVar.f43904b;
        SparseArray sparseArray = dVar.f43906c;
        e2.v vVar = dVar.f43914k;
        e2.v vVar2 = dVar.f43912i;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.d(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f43926x.f43893x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw b2.s0.a(null, "Unexpected id: " + i10);
                                }
                                dVar.d(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f43926x.f43882l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(vVar.f7918a, (byte) 0);
                            pVar.readFully(vVar.f7918a, 4 - i11, i11);
                            vVar.J(0);
                            dVar.f43928z = (int) vVar.z();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        dVar.d(i10);
                        dVar.f43926x.f43881k = new g0(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.d(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f43926x.f43880j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.d(i10);
                u3.c cVar = dVar.f43926x;
                int i19 = cVar.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.J == 2) {
                u3.c cVar2 = (u3.c) sparseArray.get(dVar.P);
                int i20 = dVar.S;
                e2.v vVar3 = dVar.f43919p;
                if (i20 == 4 && "V_VP9".equals(cVar2.f43876c)) {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.f7918a, 0, i11);
                    return;
                }
                pVar.r(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.f43931c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.r(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i21 = (vVar2.f7918a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i22 = (vVar2.f7918a[3] & 255) + 1;
                dVar.N = i22;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.O = iArr2;
                if (i21 == 2) {
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, ((i11 - dVar.Q) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        dVar.O[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            dVar.j(pVar, i14);
                            int i27 = vVar2.f7918a[i26] & 255;
                            int[] iArr3 = dVar.O;
                            i15 = iArr3[i24] + i27;
                            iArr3[i24] = i15;
                            if (i27 != 255) {
                                break;
                            }
                            i26 = i14;
                        }
                        i25 += i15;
                        i24++;
                        i26 = i14;
                    }
                    dVar.O[i13] = ((i11 - dVar.Q) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = dVar.N - i17;
                        if (i28 < i31) {
                            dVar.O[i28] = i18;
                            int i32 = i30 + 1;
                            dVar.j(pVar, i32);
                            if (vVar2.f7918a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((vVar2.f7918a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            dVar.j(pVar, i12);
                                            j3 = vVar2.f7918a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j3 = (j3 << 8) | (vVar2.f7918a[i32] & b10);
                                                i32++;
                                                b10 = 255;
                                            }
                                            if (i28 > 0) {
                                                j3 -= (1 << ((i33 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i33++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j3 = 0;
                                        i12 = i32;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j3;
                                int[] iArr4 = dVar.O;
                                if (i28 != 0) {
                                    i35 += iArr4[i28 - 1];
                                }
                                iArr4[i28] = i35;
                                i29 += i35;
                                i28++;
                                i30 = i12;
                                b10 = 255;
                                i17 = 1;
                                i18 = 0;
                            } else {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            c10 = 1;
                            c11 = 0;
                            dVar.O[i31] = ((i11 - dVar.Q) - i30) - i29;
                            break;
                        }
                    }
                    throw b2.s0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw b2.s0.a(null, "Unexpected lacing value: " + i21);
                }
            }
            c10 = 1;
            c11 = 0;
            int i36 = vVar2.f7918a[c10] & 255;
            dVar.K = dVar.l(i36 | (bArr[c11] << 8)) + dVar.E;
            if (cVar3.e != 2 && (i10 != 163 || (vVar2.f7918a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            dVar.R = i16;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.M;
                if (i37 < dVar.N) {
                    dVar.e(cVar3, ((dVar.M * cVar3.f43877f) / 1000) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i37], false), 0);
                    dVar.M++;
                } else {
                    dVar.J = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = dVar.M;
                if (i38 < dVar.N) {
                    int[] iArr5 = dVar.O;
                    iArr5[i38] = dVar.n(pVar, cVar3, iArr5[i38], true);
                    dVar.M++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ia iaVar = (ia) this.f13554b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f20473s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public int c(View view) {
        return o0.z(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).topMargin;
    }

    public c c0(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.f13554b).setUsage(i10);
        return this;
    }

    @Override
    public boolean c1(int i10, u1 u1Var) {
        if (i10 == ((ia) this.f13554b).f20473s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void d(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f13554b);
    }

    @Override
    public boolean e() {
        return ((ia) this.f13554b).a();
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int g() {
        return ((o0) this.f13554b).G();
    }

    public void g0(int i10) {
        c0(i10);
    }

    @Override
    public float get() {
        vt0 vt0Var = (vt0) this.f13554b;
        int i10 = vt0Var.P1;
        pg.m currentBrush = vt0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f41277i;
        }
        return u0.e(i10).f(String.valueOf(pg.m.f41167a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        h hVar = (h) this.f13554b;
        float f7 = hVar.f15072b;
        return String.valueOf(Math.round((hVar.f15071a.getProgress() * (hVar.f15073c - f7)) + f7));
    }

    @Override
    public String h(u1 u1Var) {
        return null;
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    public Object j0() {
        if (n7.a.f15367b == null) {
            n7.a.f15367b = new Exception();
        }
        synchronized (n7.a.f15366a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public k4.d l(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f13554b).f14040a.x(iOException);
        return l.e;
    }

    @Override
    public boolean l0() {
        return e();
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public boolean o0(z5 z5Var) {
        return false;
    }

    @Override
    public void q(y2.i iVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f13554b;
        synchronized (z2.b.f48395b) {
            z10 = z2.b.f48396c;
        }
        if (!z10) {
            dVar.f14040a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f13554b).call();
    }

    public String toString() {
        switch (this.f13553a) {
            case 17:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.f13554b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public r2.l v(n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 >= 31 || ((context = (Context) this.f13554b) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int h = r0.h(((b2.s) nVar.f7322c).f3303r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
            return new z0(14, new r2.b(h, 0), new r2.b(h, 1)).v(nVar);
        }
        return new rb.a(20).v(nVar);
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public int x() {
        o0 o0Var = (o0) this.f13554b;
        return o0Var.f43107n - o0Var.C();
    }

    @Override
    public View y(int i10) {
        return ((o0) this.f13554b).q(i10);
    }

    @Override
    public r9 z2() {
        return null;
    }

    public c(Object obj, int i10) {
        this.f13553a = i10;
        this.f13554b = obj;
    }

    public c(s6.g gVar, s6.a aVar) {
        this.f13553a = 21;
        this.f13554b = aVar;
    }

    public c(v1.c[] initializers) {
        this.f13553a = 23;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f13554b = initializers;
    }

    public c(ArrayList arrayList) {
        this.f13553a = 18;
        this.f13554b = DesugarCollections.unmodifiableList(arrayList);
    }

    public c(EditText editText) {
        this.f13553a = 13;
        this.f13554b = new z0(editText);
    }

    public c(int i10) {
        this.f13553a = i10;
        switch (i10) {
            case 7:
                this.f13554b = new SparseArray();
                return;
            case 25:
                this.f13554b = new qb.b(28);
                return;
            default:
                this.f13554b = new AudioAttributes.Builder();
                return;
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void C1(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void F0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void K1(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void X0(u1 u1Var) {
    }

    @Override
    public void Z0(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(u1 u1Var) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void m2(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void y0(u1 u1Var) {
    }

    @Override
    public void z(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var, boolean z10) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(u1 u1Var, long j3) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void u1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void y2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G(y2.i iVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(y2.i iVar, long j3, long j10, int i10) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}

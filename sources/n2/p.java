package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h3.t1;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mh.l4;
import mh.m2;
import of.f1;
import of.u1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.x4;
import qh.b2;
import qh.c1;
import qh.d1;
import qh.g0;
import qh.i2;
import qh.j3;
import qh.o3;
import qh.u2;
import qh.v4;
import qh.w0;
public final class p implements m4.h, OnCompleteListener, o0.a, u1, x4, ig.g, h61, l71, com.google.android.gms.common.api.internal.s, g0, c1, r4.f {
    public final int f18342a;
    public Object f18343b;

    public p(Object obj, int i9) {
        this.f18342a = i9;
        this.f18343b = obj;
    }

    @Override
    public boolean A(d1 d1Var) {
        return false;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        e0 e0Var = (e0) this.f18343b;
        e0Var.k0(i9, i10, z10);
        e0Var.dismiss();
    }

    @Override
    public void B1(Editable editable) {
        ((qh.x4) this.f18343b).h();
    }

    @Override
    public long C(long j10, long j11) {
        return 1L;
    }

    @Override
    public n9 D() {
        j3 j3Var = ((w0) this.f18343b).O;
        if (j3Var == null) {
            return null;
        }
        return j3Var.f46464a.getTextSelectionHelper();
    }

    public void F(float f10) {
        n71 n71Var = (n71) this.f18343b;
        if (f10 == 1.0f) {
            View[] viewArr = n71Var.f31035e;
            View[] viewArr2 = n71Var.f31035e;
            if (viewArr[1] != null) {
                n71Var.F();
                n71Var.h.put(n71Var.f31036f[1], viewArr2[1]);
                n71Var.removeView(viewArr2[1]);
                n71Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            n71Var.z(n71Var.f31033b);
            return;
        }
        View[] viewArr3 = n71Var.f31035e;
        View[] viewArr4 = n71Var.f31035e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (n71Var.f31042y) {
            n71Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            n71Var.E(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            n71Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            n71Var.E(view3, view3.getMeasuredWidth() * f10);
        }
        n71Var.w(false);
    }

    @Override
    public void G(CharSequence charSequence) {
        j3 j3Var = ((w0) this.f18343b).O;
        if (j3Var != null) {
            j3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                j3Var.f46464a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public m9 H() {
        return (w0) this.f18343b;
    }

    @Override
    public void H0(ArrayList arrayList) {
        switch (this.f18342a) {
            case 6:
                f1 f1Var = (f1) this.f18343b;
                String str = f1Var.V;
                if (str != null) {
                    f1Var.U(str, f1Var.Y, f1Var.Z, f1Var.X, f1Var.W);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public qh.a I() {
        return ((w0) this.f18343b).f46834a;
    }

    @Override
    public boolean K() {
        w0 w0Var = (w0) this.f18343b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            qh.a aVar = w0Var.f46834a;
            if (j3Var.f46464a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public byte L() {
        int read = ((com.google.firebase.messaging.d) this.f18343b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void L0(d1 d1Var) {
        qh.a aVar;
        qh.x4 x4Var = (qh.x4) this.f18343b;
        v4 v4Var = x4Var.f46832s;
        if (v4Var != null && (aVar = x4Var.f46834a) != null) {
            o3 o3Var = ((u2) v4Var).f46740a;
            ArrayList arrayList = o3Var.f46573h3;
            long j10 = aVar.f46285t;
            if (j10 != 0) {
                int i9 = -1;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((qh.a) arrayList.get(i10)).f46276k.contains(Long.valueOf(j10))) {
                        i9 = i10;
                    }
                }
                if (i9 >= 0) {
                    b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    qh.a aVar2 = new qh.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f46276k;
                    ArrayList arrayList3 = aVar2.f46276k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        aa.d.u(1, arrayList3);
                    }
                    arrayList.add(i9 + 1, aVar2);
                    o3Var.s4();
                    o3Var.U2.N(false);
                    b2 b2Var2 = o3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o3Var.post(new i2(o3Var, aVar2, 26));
                }
            }
        }
    }

    public int M() {
        return ((L() & 255) << 24) | ((L() & 255) << 16) | ((L() & 255) << 8) | (L() & 255);
    }

    public int N() {
        return ((L() & Byte.MAX_VALUE) << 21) | ((L() & Byte.MAX_VALUE) << 14) | ((L() & Byte.MAX_VALUE) << 7) | (L() & Byte.MAX_VALUE);
    }

    @Override
    public void N0() {
        w0 w0Var = (w0) this.f18343b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            qh.a aVar = w0Var.f46834a;
            o3.O1(j3Var.f46464a);
        }
    }

    @Override
    public a0.h O() {
        switch (this.f18342a) {
            case 6:
                return null;
            default:
                return null;
        }
    }

    public void P(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f18343b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void Q(int i9, int i10) {
        w0 w0Var = (w0) this.f18343b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            qh.a aVar = w0Var.f46834a;
            b2 b2Var = j3Var.f46464a.F3;
            if (b2Var != null) {
                b2Var.f(i9, i10);
            }
        }
    }

    public Object R() {
        if (x6.a.f48995b == null) {
            x6.a.f48995b = new Exception();
        }
        synchronized (x6.a.f48994a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public void S() {
        o5.h hVar = (o5.h) this.f18343b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f18990i.iterator();
            while (it2.hasNext()) {
                ((o5.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public void T() {
        w0 w0Var = (w0) this.f18343b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            qh.a aVar = w0Var.f46834a;
            o3 o3Var = j3Var.f46464a;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            o3Var.f46565d3.onContentChanged();
        }
    }

    @Override
    public boolean T1(boolean z10) {
        return false;
    }

    @Override
    public boolean U1(d1 d1Var) {
        return false;
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f18342a) {
            case 14:
                q5.r rVar = new q5.r(1, (TaskCompletionSource) obj2);
                q5.i iVar = (q5.i) ((q5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.u.d(M0, rVar);
                M0.writeStringArray((String[]) this.f18343b);
                iVar.R0(M0, 6);
                return;
            case 19:
                r6.f fVar = new r6.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i9 = a7.b.f104a;
                obtain.writeStrongBinder(fVar);
                a7.b.b(obtain, (GetCredentialRequest) this.f18343b);
                a7.b.b(obtain, gVar);
                ((r6.b) ((r6.d) ((r6.e) obj).u())).E0(obtain, 1);
                return;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                z5.a aVar = (z5.a) ((z5.c) obj).u();
                Parcel G0 = aVar.G0();
                u6.a.c(G0, (x5.o) this.f18343b);
                try {
                    aVar.f1549b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    G0.recycle();
                    throw th;
                }
        }
    }

    @Override
    public int b(long j10) {
        return -1;
    }

    public void c(HashMap hashMap) {
        if (((SparseArray) this.f18343b) == null) {
            this.f18343b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f18343b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f18343b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(d1 d1Var) {
        switch (this.f18342a) {
            case 16:
                j3 j3Var = ((w0) this.f18343b).O;
                if (j3Var != null) {
                    o3 o3Var = j3Var.f46464a;
                    o3.M1(o3Var, d1Var);
                    o3Var.f46565d3.f1(d1Var, true);
                    return;
                }
                return;
            default:
                v4 v4Var = ((qh.x4) this.f18343b).f46832s;
                if (v4Var != null) {
                    o3 o3Var2 = ((u2) v4Var).f46740a;
                    o3.M1(o3Var2, d1Var);
                    o3Var2.f46565d3.f1(d1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(int i9) {
        switch (this.f18342a) {
            case 6:
                ((f1) this.f18343b).l();
                return;
            default:
                AndroidUtilities.runOnUIThread(new m2(this, 26));
                return;
        }
    }

    @Override
    public void g() {
        w0 w0Var = (w0) this.f18343b;
        j3 j3Var = w0Var.O;
        if (j3Var != null) {
            o3.P1(j3Var.f46464a, w0Var.f46834a);
        }
    }

    @Override
    public long h(int i9) {
        return 0L;
    }

    @Override
    public long i(long j10, long j11) {
        return 0L;
    }

    @Override
    public long j(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public void k(Canvas canvas) {
        switch (this.f18342a) {
            case 8:
                ki kiVar = (ki) this.f18343b;
                canvas.drawColor(kiVar.getThemedColor(f6.f23001d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kiVar.f30177y2.b(canvas, -3);
                    return;
                }
                return;
            default:
                rp0 rp0Var = (rp0) this.f18343b;
                canvas.drawColor(rp0Var.getThemedColor(f6.f23001d6));
                if (SharedConfig.chatBlurEnabled()) {
                    rp0Var.K0.b(canvas, -3);
                    return;
                }
                return;
        }
    }

    @Override
    public void k1(d1 d1Var, int i9, int i10) {
        v4 v4Var;
        n9 textSelectionHelper;
        qh.x4 x4Var = (qh.x4) this.f18343b;
        if (!x4Var.f46833w && i9 != i10 && (v4Var = x4Var.f46832s) != null && (textSelectionHelper = ((u2) v4Var).f46740a.getTextSelectionHelper()) != null) {
            d1Var.post(new l4(this, d1Var, i10, textSelectionHelper, i9, 5));
        }
    }

    @Override
    public n4.j l(long j10) {
        return (n4.j) this.f18343b;
    }

    @Override
    public List m(long j10) {
        return (List) this.f18343b;
    }

    public void n(int i9, int i10, m3.l lVar) {
        char c10;
        char c11;
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        s3.d dVar = (s3.d) this.f18343b;
        s3.e eVar = dVar.f47336b;
        SparseArray sparseArray = dVar.f47338c;
        d5.y yVar = dVar.f47342i;
        d5.y yVar2 = dVar.f47341g;
        int i16 = 1;
        int i17 = 0;
        if (i9 != 161 && i9 != 163) {
            if (i9 != 165) {
                if (i9 != 16877) {
                    if (i9 != 16981) {
                        if (i9 != 18402) {
                            if (i9 != 21419) {
                                if (i9 != 25506) {
                                    if (i9 == 30322) {
                                        dVar.d(i9);
                                        byte[] bArr2 = new byte[i10];
                                        dVar.f47354u.v = bArr2;
                                        lVar.readFully(bArr2, 0, i10);
                                        return;
                                    }
                                    throw t1.a("Unexpected id: " + i9, null);
                                }
                                dVar.d(i9);
                                byte[] bArr3 = new byte[i10];
                                dVar.f47354u.f47313k = bArr3;
                                lVar.readFully(bArr3, 0, i10);
                                return;
                            }
                            Arrays.fill(yVar.f4410a, (byte) 0);
                            lVar.readFully(yVar.f4410a, 4 - i10, i10);
                            yVar.C(0);
                            dVar.f47355w = (int) yVar.s();
                            return;
                        }
                        byte[] bArr4 = new byte[i10];
                        lVar.readFully(bArr4, 0, i10);
                        dVar.d(i9);
                        dVar.f47354u.f47312j = new m3.v(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.d(i9);
                    byte[] bArr5 = new byte[i10];
                    dVar.f47354u.f47311i = bArr5;
                    lVar.readFully(bArr5, 0, i10);
                    return;
                }
                dVar.d(i9);
                s3.c cVar = dVar.f47354u;
                int i18 = cVar.f47310g;
                if (i18 != 1685485123 && i18 != 1685480259) {
                    lVar.u(i10);
                    return;
                }
                byte[] bArr6 = new byte[i10];
                cVar.N = bArr6;
                lVar.readFully(bArr6, 0, i10);
                return;
            } else if (dVar.G == 2) {
                s3.c cVar2 = (s3.c) sparseArray.get(dVar.M);
                int i19 = dVar.P;
                d5.y yVar3 = dVar.f47347n;
                if (i19 == 4 && "V_VP9".equals(cVar2.f47306b)) {
                    yVar3.z(i10);
                    lVar.readFully(yVar3.f4410a, 0, i10);
                    return;
                }
                lVar.u(i10);
                return;
            } else {
                return;
            }
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.f47361c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            yVar2.z(0);
        }
        s3.c cVar3 = (s3.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.u(i10 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.i(lVar, 3);
            int i20 = (yVar2.f4410a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i10 - dVar.N) - 3;
            } else {
                dVar.i(lVar, 4);
                int i21 = (yVar2.f4410a[3] & 255) + 1;
                dVar.K = i21;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.L = iArr2;
                if (i20 == 2) {
                    int i22 = dVar.K;
                    Arrays.fill(iArr2, 0, i22, ((i10 - dVar.N) - 4) / i22);
                } else if (i20 == 1) {
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 4;
                    while (true) {
                        i12 = dVar.K - 1;
                        if (i23 >= i12) {
                            break;
                        }
                        dVar.L[i23] = 0;
                        while (true) {
                            i13 = i25 + 1;
                            dVar.i(lVar, i13);
                            int i26 = yVar2.f4410a[i25] & 255;
                            int[] iArr3 = dVar.L;
                            i14 = iArr3[i23] + i26;
                            iArr3[i23] = i14;
                            if (i26 != 255) {
                                break;
                            }
                            i25 = i13;
                        }
                        i24 += i14;
                        i23++;
                        i25 = i13;
                    }
                    dVar.L[i12] = ((i10 - dVar.N) - i25) - i24;
                } else if (i20 == 3) {
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 4;
                    while (true) {
                        int i30 = dVar.K - i16;
                        if (i27 < i30) {
                            dVar.L[i27] = i17;
                            int i31 = i29 + 1;
                            dVar.i(lVar, i31);
                            if (yVar2.f4410a[i29] != 0) {
                                int i32 = 0;
                                while (true) {
                                    if (i32 < 8) {
                                        int i33 = 1 << (7 - i32);
                                        if ((yVar2.f4410a[i29] & i33) != 0) {
                                            i11 = i31 + i32;
                                            dVar.i(lVar, i11);
                                            j10 = yVar2.f4410a[i29] & b10 & (~i33);
                                            while (i31 < i11) {
                                                j10 = (j10 << 8) | (yVar2.f4410a[i31] & b10);
                                                i31++;
                                                b10 = 255;
                                            }
                                            if (i27 > 0) {
                                                j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i32++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j10 = 0;
                                        i11 = i31;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i34 = (int) j10;
                                int[] iArr4 = dVar.L;
                                if (i27 != 0) {
                                    i34 += iArr4[i27 - 1];
                                }
                                iArr4[i27] = i34;
                                i28 += i34;
                                i27++;
                                i29 = i11;
                                b10 = 255;
                                i16 = 1;
                                i17 = 0;
                            } else {
                                throw t1.a("No valid varint length mask found", null);
                            }
                        } else {
                            c10 = 1;
                            c11 = 0;
                            dVar.L[i30] = ((i10 - dVar.N) - i29) - i28;
                            break;
                        }
                    }
                    throw t1.a("EBML lacing sample size out of range.", null);
                } else {
                    throw t1.a("Unexpected lacing value: " + i20, null);
                }
            }
            c10 = 1;
            c11 = 0;
            int i35 = yVar2.f4410a[c10] & 255;
            dVar.H = dVar.k(i35 | (bArr[c11] << 8)) + dVar.B;
            if (cVar3.d != 2 && (i9 != 163 || (yVar2.f4410a[2] & 128) != 128)) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            dVar.O = i15;
            dVar.G = 2;
            dVar.J = 0;
        }
        if (i9 == 163) {
            while (true) {
                int i36 = dVar.J;
                if (i36 < dVar.K) {
                    dVar.e(cVar3, ((dVar.J * cVar3.f47308e) / 1000) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i36], false), 0);
                    dVar.J++;
                } else {
                    dVar.G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.J;
                if (i37 < dVar.K) {
                    int[] iArr5 = dVar.L;
                    iArr5[i37] = dVar.l(lVar, cVar3, iArr5[i37], true);
                    dVar.J++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean o(int i9) {
        e71 e71Var = ((n71) this.f18343b).H;
        if (e71Var == null) {
            return false;
        }
        return e71Var.c(i9);
    }

    @Override
    public void onComplete(Task task) {
        n5.c.h((n5.c) ((n5.j) this.f18343b).f18497c, "joinApplication", task);
    }

    @Override
    public void onError(k61 k61Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i9) {
        f50 f50Var;
        VideoEditedInfo videoEditedInfo;
        e50 e50Var = (e50) this.f18343b;
        k61 k61Var = e50Var.D0.K;
        if (k61Var != null && k61Var.z() && i9 == 4 && (videoEditedInfo = (f50Var = e50Var.D0).J) != null) {
            k61 k61Var2 = f50Var.K;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            k61Var2.L(j10);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public boolean p0(int i9) {
        switch (this.f18342a) {
            case 6:
                return true;
            default:
                return true;
        }
    }

    @Override
    public long q(long j10, long j11) {
        return 0L;
    }

    @Override
    public int r() {
        return 1;
    }

    @Override
    public Cursor s(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f18343b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    public lb.d t(com.google.firebase.messaging.l r24) {
        throw new UnsupportedOperationException("Method not decompiled: n2.p.t(com.google.firebase.messaging.l):lb.d");
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            s9.d dVar = (s9.d) this.f18343b;
            s9.e eVar = new s9.e(stringWriter, dVar.f47494a, dVar.f47495b, dVar.f47496c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f47498b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public boolean v() {
        return true;
    }

    public void w(int i9, long j10) {
        s3.d dVar = (s3.d) this.f18343b;
        if (i9 != 20529) {
            if (i9 != 20530) {
                boolean z10 = false;
                int i10 = 3;
                switch (i9) {
                    case 131:
                        dVar.d(i9);
                        dVar.f47354u.d = (int) j10;
                        return;
                    case 136:
                        dVar.d(i9);
                        s3.c cVar = dVar.f47354u;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        cVar.V = z10;
                        return;
                    case 155:
                        dVar.I = dVar.k(j10);
                        return;
                    case 159:
                        dVar.d(i9);
                        dVar.f47354u.O = (int) j10;
                        return;
                    case 176:
                        dVar.d(i9);
                        dVar.f47354u.f47315m = (int) j10;
                        return;
                    case 179:
                        dVar.a(i9);
                        dVar.C.c(dVar.k(j10));
                        return;
                    case 186:
                        dVar.d(i9);
                        dVar.f47354u.f47316n = (int) j10;
                        return;
                    case 215:
                        dVar.d(i9);
                        dVar.f47354u.f47307c = (int) j10;
                        return;
                    case 231:
                        dVar.B = dVar.k(j10);
                        return;
                    case 238:
                        dVar.P = (int) j10;
                        return;
                    case 241:
                        if (!dVar.E) {
                            dVar.a(i9);
                            dVar.D.c(j10);
                            dVar.E = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.Q = true;
                        return;
                    case 16871:
                        dVar.d(i9);
                        dVar.f47354u.f47310g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw t1.a("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw t1.a("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw t1.a("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw t1.a("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw t1.a("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        dVar.f47356x = j10 + dVar.f47350q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        dVar.d(i9);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f47354u.f47324w = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f47354u.f47324w = 1;
                                return;
                            }
                            dVar.f47354u.f47324w = 2;
                            return;
                        }
                        dVar.f47354u.f47324w = 0;
                        return;
                    case 21680:
                        dVar.d(i9);
                        dVar.f47354u.f47317o = (int) j10;
                        return;
                    case 21682:
                        dVar.d(i9);
                        dVar.f47354u.f47319q = (int) j10;
                        return;
                    case 21690:
                        dVar.d(i9);
                        dVar.f47354u.f47318p = (int) j10;
                        return;
                    case 21930:
                        dVar.d(i9);
                        s3.c cVar2 = dVar.f47354u;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        cVar2.U = z10;
                        return;
                    case 21998:
                        dVar.d(i9);
                        dVar.f47354u.f47309f = (int) j10;
                        return;
                    case 22186:
                        dVar.d(i9);
                        dVar.f47354u.R = j10;
                        return;
                    case 22203:
                        dVar.d(i9);
                        dVar.f47354u.S = j10;
                        return;
                    case 25188:
                        dVar.d(i9);
                        dVar.f47354u.P = (int) j10;
                        return;
                    case 30114:
                        dVar.R = j10;
                        return;
                    case 30321:
                        dVar.d(i9);
                        int i12 = (int) j10;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f47354u.f47320r = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f47354u.f47320r = 2;
                                return;
                            }
                            dVar.f47354u.f47320r = 1;
                            return;
                        }
                        dVar.f47354u.f47320r = 0;
                        return;
                    case 2352003:
                        dVar.d(i9);
                        dVar.f47354u.f47308e = (int) j10;
                        return;
                    case 2807729:
                        dVar.f47351r = j10;
                        return;
                    default:
                        switch (i9) {
                            case 21945:
                                dVar.d(i9);
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f47354u.A = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f47354u.A = 2;
                                return;
                            case 21946:
                                dVar.d(i9);
                                int i14 = (int) j10;
                                String str = e5.b.f4868f;
                                if (i14 != 1) {
                                    if (i14 != 16) {
                                        if (i14 != 18) {
                                            if (i14 != 6 && i14 != 7) {
                                                i10 = -1;
                                            }
                                        } else {
                                            i10 = 7;
                                        }
                                    } else {
                                        i10 = 6;
                                    }
                                }
                                if (i10 != -1) {
                                    dVar.f47354u.f47327z = i10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i9);
                                dVar.f47354u.f47325x = true;
                                int a2 = e5.b.a((int) j10);
                                if (a2 != -1) {
                                    dVar.f47354u.f47326y = a2;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i9);
                                dVar.f47354u.B = (int) j10;
                                return;
                            case 21949:
                                dVar.d(i9);
                                dVar.f47354u.C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw t1.a("ContentEncodingScope " + j10 + " not supported", null);
            }
        } else if (j10 == 0) {
        } else {
            throw t1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
    }

    @Override
    public long x() {
        return 0L;
    }

    @Override
    public void x0(g.x xVar) {
        switch (this.f18342a) {
            case 8:
                xVar.a(((ki) this.f18343b).getThemedColor(f6.f23001d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((rp0) this.f18343b).getThemedColor(f6.f23001d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public a0.h y() {
        switch (this.f18342a) {
            case 6:
                return null;
            default:
                return null;
        }
    }

    @Override
    public long z(long j10) {
        return 1L;
    }

    public p(k5.i iVar) {
        this.f18342a = 0;
        this.f18343b = (com.google.android.gms.internal.play_billing.r) iVar.f14659b;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public p(q5.s sVar, String[] strArr) {
        this.f18342a = 14;
        this.f18343b = strArr;
    }

    public p(int i9) {
        this.f18342a = i9;
        switch (i9) {
            case 12:
                this.f18343b = new m5.c0(nb.a.h, 6);
                return;
            case 15:
                return;
            default:
                this.f18343b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public p(Context context, Uri uri) {
        this.f18342a = 3;
        this.f18343b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void J0() {
    }

    private final void J(ArrayList arrayList) {
    }

    @Override
    public void h1(CharSequence charSequence) {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void E(int i9, int i10) {
    }

    @Override
    public long f(long j10, long j11) {
        return j11;
    }

    @Override
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}

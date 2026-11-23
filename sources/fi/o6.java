package fi;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f20;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class o6 implements gs {
    public long E;
    public gj F;
    public f20 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public gj L;
    public TL_bots.botPreviewMedia M;
    public final p6 N;
    public final boolean f12324b;
    public final hi.d7 f12325c;
    public boolean d;
    public String f12326e;
    public final String f12327f;
    public float h;
    public float f12328n;
    public float f12329r;
    public boolean f12330s;
    public boolean f12331w;
    public int f12332x;
    public long f12333y = -1;
    public final long f12323a = Utilities.f22772b.nextLong();

    public o6(p6 p6Var, hi.d7 d7Var) {
        this.N = p6Var;
        this.f12325c = d7Var;
        this.f12324b = d7Var.f14378g;
        File file = d7Var.N0;
        if (file != null) {
            this.f12327f = file.getAbsolutePath();
        }
        boolean z10 = d7Var.f14407w;
        this.I = z10;
        this.J = z10;
        long j3 = d7Var.J0;
        if (j3 != 0) {
            this.K = j3;
        } else if (d7Var.f14378g) {
            this.K = d7Var.f14373e;
        } else {
            TLRPC.InputPeer inputPeer = d7Var.f14406v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = org.telegram.messenger.n5.n(inputPeer);
            } else {
                this.K = k10.i(p6Var.f12377a).f24951n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.J;
        hi.d7 d7Var = this.f12325c;
        p6 p6Var = this.N;
        if (z10) {
            p6Var.f12396w.b(d7Var);
            ((ArrayList) p6Var.f12378b.f(this.K)).remove(this);
        }
        this.f12331w = true;
        if (d7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(p6Var.f12377a).b(this.f12326e, false);
        if (this.f12332x >= 0) {
            ConnectionsManager.getInstance(p6Var.f12377a).cancelRequest(this.f12332x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        gi.q qVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        gi.q qVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        p6 p6Var = this.N;
        int i7 = p6Var.f12377a;
        ls.f(i7).n(this, ls.U1);
        ls.f(i7).n(this, ls.V1);
        ls.f(i7).n(this, ls.W1);
        ls.f(i7).n(this, ls.f25253c2);
        ls.f(i7).n(this, ls.f25240a2);
        ls.f(i7).n(this, ls.f25247b2);
        boolean z10 = this.J;
        long j3 = this.K;
        if (!z10 && (arrayList = (ArrayList) p6Var.f12378b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) p6Var.f12379c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                p6Var.d = 0;
            } else {
                p6Var.d++;
            }
        }
        boolean z11 = this.f12324b;
        hi.d7 d7Var = this.f12325c;
        if (z11 && (hashMap = (HashMap) p6Var.f12380e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(d7Var.f14376f));
        }
        if (this.M != null) {
            h6 A = p6Var.A(4, -1, this.K, false);
            if (d7Var != null && d7Var.f14378g) {
                if (A instanceof z5) {
                    ((z5) A).G(d7Var.L0, this.M);
                }
                String str = d7Var.K0;
                TLRPC.InputMedia inputMedia = d7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = gi.q.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    z5 z5Var = (z5) longSparseArray4.get(j3);
                    int i10 = z5Var.f12036c;
                    ArrayList arrayList3 = z5Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(z5Var.E, str)) {
                            z5Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            e6 e6Var = z5Var.f12048q;
                            org.telegram.messenger.g0.r(e6Var);
                            org.telegram.messenger.g0.g3(e6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = gi.q.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (qVar2 = (gi.q) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = qVar2.f13663f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        z5 z5Var2 = (z5) arrayList4.get(i11);
                        if (z5Var2.f12036c == i7 && TextUtils.equals(z5Var2.E, str)) {
                            z5Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof z5) {
                    ((z5) A).I(this.M);
                }
                String str2 = d7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = gi.q.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    z5 z5Var3 = (z5) longSparseArray2.get(j3);
                    int i12 = z5Var3.f12036c;
                    ArrayList arrayList5 = z5Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(z5Var3.E, str2)) {
                            z5Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            e6 e6Var2 = z5Var3.f12048q;
                            org.telegram.messenger.g0.r(e6Var2);
                            org.telegram.messenger.g0.g3(e6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = gi.q.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (qVar = (gi.q) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = qVar.f13663f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        z5 z5Var4 = (z5) arrayList6.get(i13);
                        if (z5Var4.f12036c == i7 && TextUtils.equals(z5Var4.E, str2)) {
                            z5Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        ls.f(i7).k(ls.f25388y5, new Object[0]);
        if (d7Var != null && !d7Var.h && !this.d) {
            d7Var.i(false);
            this.d = true;
        }
        ls.e().k(ls.E5, this.f12326e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        hi.d7 d7Var = this.f12325c;
        if (d7Var.f14366b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f12325c.f14369c0;
            int i7 = np.I8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f28410id = document.f28404id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((d7Var.f14378g || (d7Var.f14390n && d7Var.f14402t != null)) && !d7Var.f14383j && d7Var.f14393o0 == null) {
            c(null);
            return;
        }
        hi.o8 o8Var = this.f12325c.E0;
        if (o8Var != null && o8Var.f15150a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        ls.f(this.N.f12377a).b(this, ls.U1);
        ls.f(this.N.f12377a).b(this, ls.V1);
        ls.f(this.N.f12377a).b(this, ls.W1);
        ls.f(this.N.f12377a).b(this, ls.f25253c2);
        ls.f(this.N.f12377a).b(this, ls.f25240a2);
        ls.f(this.N.f12377a).b(this, ls.f25247b2);
        boolean E = this.f12325c.E();
        this.f12330s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28419id = 1;
            String absolutePath = hi.d7.x(this.N.f12377a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f12326e = absolutePath;
            this.F = new gj(this.N.f12377a, tL_message, null, false, false);
            this.f12325c.s(new n6(this, 1));
        } else {
            File w10 = hi.d7.w(this.N.f12377a, "jpg");
            this.f12326e = w10.getAbsolutePath();
            Utilities.f22777i.c(new a6(6, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f26895b, StoryUploadingService.class);
        intent.putExtra("path", this.f12326e);
        intent.putExtra("currentAccount", this.N.f12377a);
        try {
            org.telegram.messenger.t0.f26895b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p6 p6Var = this.N;
        int i11 = p6Var.f12377a;
        if (i7 == ls.f25240a2) {
            if (objArr[0] == this.F) {
                this.f12326e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = ls.f25247b2;
        int i13 = ls.D5;
        if (i7 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f12328n = floatValue;
                this.h = (this.f12329r * 0.7f) + (floatValue * 0.3f);
                ls.f(i11).k(i13, this.f12326e, Float.valueOf(this.h));
                if (this.f12333y < 0 && this.f12328n * ((float) this.E) >= 1000.0f) {
                    this.f12333y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f12328n));
                if (longValue2 > 0 && this.f12333y < 0) {
                    this.f12333y = longValue2;
                }
            }
        } else if (i7 == ls.f25253c2) {
            if (objArr[0] == this.F) {
                if (!this.f12324b) {
                    hi.d7 d7Var = this.f12325c;
                    d7Var.f14407w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    d7Var.f14409x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    p6Var.f12396w.d(d7Var);
                }
                b();
            }
        } else if (i7 == ls.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f12326e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == ls.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f12326e;
            if (str5 != null && str4.equals(str5)) {
                ls.e().k(ls.S4, 1, hd.N0(2131744211, null));
                b();
            }
        } else if (i7 == ls.W1 && ((String) objArr[0]).equals(this.f12326e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f12329r = min;
            this.h = (min * 0.7f) + (this.f12328n * 0.3f);
            ls.f(i11).k(i13, this.f12326e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        hi.d7 d7Var = this.f12325c;
        d7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.f12377a);
        String str = this.f12326e;
        boolean z10 = !d7Var.K;
        long j3 = 0;
        if (this.f12330s) {
            f20 f20Var = this.G;
            if (f20Var != null) {
                j3 = f20Var.f23806q;
            }
            j3 = Math.max(1, (int) j3);
        }
        if (d7Var.K) {
            i7 = 33554432;
        } else {
            i7 = 16777216;
        }
        G.g0(str, false, z10, j3, i7, true);
    }
}

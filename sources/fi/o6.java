package fi;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class o6 implements fs {
    public long E;
    public fj F;
    public e20 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public fj L;
    public TL_bots.botPreviewMedia M;
    public final p6 N;
    public final boolean f12371b;
    public final hi.c7 f12372c;
    public boolean d;
    public String f12373e;
    public final String f12374f;
    public float h;
    public float f12375n;
    public float f12376r;
    public boolean f12377s;
    public boolean f12378w;
    public int f12379x;
    public long f12380y = -1;
    public final long f12370a = Utilities.f22805b.nextLong();

    public o6(p6 p6Var, hi.c7 c7Var) {
        this.N = p6Var;
        this.f12372c = c7Var;
        this.f12371b = c7Var.f14351g;
        File file = c7Var.N0;
        if (file != null) {
            this.f12374f = file.getAbsolutePath();
        }
        boolean z10 = c7Var.f14380w;
        this.I = z10;
        this.J = z10;
        long j3 = c7Var.J0;
        if (j3 != 0) {
            this.K = j3;
        } else if (c7Var.f14351g) {
            this.K = c7Var.f14346e;
        } else {
            TLRPC.InputPeer inputPeer = c7Var.f14379v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = org.telegram.messenger.n5.n(inputPeer);
            } else {
                this.K = j10.i(p6Var.f12422a).f24817n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.J;
        hi.c7 c7Var = this.f12372c;
        p6 p6Var = this.N;
        if (z10) {
            p6Var.f12441w.b(c7Var);
            ((ArrayList) p6Var.f12423b.f(this.K)).remove(this);
        }
        this.f12378w = true;
        if (c7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(p6Var.f12422a).b(this.f12373e, false);
        if (this.f12379x >= 0) {
            ConnectionsManager.getInstance(p6Var.f12422a).cancelRequest(this.f12379x, true);
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
        int i7 = p6Var.f12422a;
        ks.f(i7).n(this, ks.U1);
        ks.f(i7).n(this, ks.V1);
        ks.f(i7).n(this, ks.W1);
        ks.f(i7).n(this, ks.f25123c2);
        ks.f(i7).n(this, ks.f25110a2);
        ks.f(i7).n(this, ks.f25117b2);
        boolean z10 = this.J;
        long j3 = this.K;
        if (!z10 && (arrayList = (ArrayList) p6Var.f12423b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) p6Var.f12424c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                p6Var.d = 0;
            } else {
                p6Var.d++;
            }
        }
        boolean z11 = this.f12371b;
        hi.c7 c7Var = this.f12372c;
        if (z11 && (hashMap = (HashMap) p6Var.f12425e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(c7Var.f14349f));
        }
        if (this.M != null) {
            h6 A = p6Var.A(4, -1, this.K, false);
            if (c7Var != null && c7Var.f14351g) {
                if (A instanceof a6) {
                    ((a6) A).G(c7Var.L0, this.M);
                }
                String str = c7Var.K0;
                TLRPC.InputMedia inputMedia = c7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = gi.q.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    a6 a6Var = (a6) longSparseArray4.get(j3);
                    int i10 = a6Var.f12082c;
                    ArrayList arrayList3 = a6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(a6Var.E, str)) {
                            a6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            e6 e6Var = a6Var.f12094q;
                            org.telegram.messenger.g0.r(e6Var);
                            org.telegram.messenger.g0.g3(e6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = gi.q.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (qVar2 = (gi.q) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = qVar2.f13697f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        a6 a6Var2 = (a6) arrayList4.get(i11);
                        if (a6Var2.f12082c == i7 && TextUtils.equals(a6Var2.E, str)) {
                            a6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof a6) {
                    ((a6) A).I(this.M);
                }
                String str2 = c7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = gi.q.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    a6 a6Var3 = (a6) longSparseArray2.get(j3);
                    int i12 = a6Var3.f12082c;
                    ArrayList arrayList5 = a6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(a6Var3.E, str2)) {
                            a6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            e6 e6Var2 = a6Var3.f12094q;
                            org.telegram.messenger.g0.r(e6Var2);
                            org.telegram.messenger.g0.g3(e6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = gi.q.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (qVar = (gi.q) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = qVar.f13697f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        a6 a6Var4 = (a6) arrayList6.get(i13);
                        if (a6Var4.f12082c == i7 && TextUtils.equals(a6Var4.E, str2)) {
                            a6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        ks.f(i7).k(ks.f25258y5, new Object[0]);
        if (c7Var != null && !c7Var.h && !this.d) {
            c7Var.i(false);
            this.d = true;
        }
        ks.e().k(ks.E5, this.f12373e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        hi.c7 c7Var = this.f12372c;
        if (c7Var.f14339b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f12372c.f14342c0;
            int i7 = mp.I8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f28443id = document.f28437id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((c7Var.f14351g || (c7Var.f14363n && c7Var.f14375t != null)) && !c7Var.f14356j && c7Var.f14366o0 == null) {
            c(null);
            return;
        }
        hi.n8 n8Var = this.f12372c.E0;
        if (n8Var != null && n8Var.f15125a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        ks.f(this.N.f12422a).b(this, ks.U1);
        ks.f(this.N.f12422a).b(this, ks.V1);
        ks.f(this.N.f12422a).b(this, ks.W1);
        ks.f(this.N.f12422a).b(this, ks.f25123c2);
        ks.f(this.N.f12422a).b(this, ks.f25110a2);
        ks.f(this.N.f12422a).b(this, ks.f25117b2);
        boolean E = this.f12372c.E();
        this.f12377s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28452id = 1;
            String absolutePath = hi.c7.x(this.N.f12422a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f12373e = absolutePath;
            this.F = new fj(this.N.f12422a, tL_message, null, false, false);
            this.f12372c.s(new n6(this, 1));
        } else {
            File w10 = hi.c7.w(this.N.f12422a, "jpg");
            this.f12373e = w10.getAbsolutePath();
            Utilities.f22810i.c(new l4(8, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f26941b, StoryUploadingService.class);
        intent.putExtra("path", this.f12373e);
        intent.putExtra("currentAccount", this.N.f12422a);
        try {
            org.telegram.messenger.t0.f26941b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p6 p6Var = this.N;
        int i11 = p6Var.f12422a;
        if (i7 == ks.f25110a2) {
            if (objArr[0] == this.F) {
                this.f12373e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = ks.f25117b2;
        int i13 = ks.D5;
        if (i7 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f12375n = floatValue;
                this.h = (this.f12376r * 0.7f) + (floatValue * 0.3f);
                ks.f(i11).k(i13, this.f12373e, Float.valueOf(this.h));
                if (this.f12380y < 0 && this.f12375n * ((float) this.E) >= 1000.0f) {
                    this.f12380y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f12375n));
                if (longValue2 > 0 && this.f12380y < 0) {
                    this.f12380y = longValue2;
                }
            }
        } else if (i7 == ks.f25123c2) {
            if (objArr[0] == this.F) {
                if (!this.f12371b) {
                    hi.c7 c7Var = this.f12372c;
                    c7Var.f14380w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    c7Var.f14382x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    p6Var.f12441w.d(c7Var);
                }
                b();
            }
        } else if (i7 == ks.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f12373e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == ks.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f12373e;
            if (str5 != null && str4.equals(str5)) {
                ks.e().k(ks.S4, 1, gd.N0(2131744211, null));
                b();
            }
        } else if (i7 == ks.W1 && ((String) objArr[0]).equals(this.f12373e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f12376r = min;
            this.h = (min * 0.7f) + (this.f12375n * 0.3f);
            ks.f(i11).k(i13, this.f12373e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        hi.c7 c7Var = this.f12372c;
        c7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.f12422a);
        String str = this.f12373e;
        boolean z10 = !c7Var.K;
        long j3 = 0;
        if (this.f12377s) {
            e20 e20Var = this.G;
            if (e20Var != null) {
                j3 = e20Var.f23678q;
            }
            j3 = Math.max(1, (int) j3);
        }
        if (c7Var.K) {
            i7 = 33554432;
        } else {
            i7 = 16777216;
        }
        G.g0(str, false, z10, j3, i7, true);
    }
}

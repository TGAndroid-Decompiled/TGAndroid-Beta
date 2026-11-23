package fi;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class o6 implements fs {
    public long E;
    public fj F;
    public d20 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public fj L;
    public TL_bots.botPreviewMedia M;
    public final p6 N;
    public final boolean f12336b;
    public final hi.x7 f12337c;
    public boolean d;
    public String f12338e;
    public final String f12339f;
    public float h;
    public float f12340n;
    public float f12341r;
    public boolean f12342s;
    public boolean f12343w;
    public int f12344x;
    public long f12345y = -1;
    public final long f12335a = Utilities.f22875b.nextLong();

    public o6(p6 p6Var, hi.x7 x7Var) {
        this.N = p6Var;
        this.f12337c = x7Var;
        this.f12336b = x7Var.f15749g;
        File file = x7Var.N0;
        if (file != null) {
            this.f12339f = file.getAbsolutePath();
        }
        boolean z10 = x7Var.f15778w;
        this.I = z10;
        this.J = z10;
        long j3 = x7Var.J0;
        if (j3 != 0) {
            this.K = j3;
        } else if (x7Var.f15749g) {
            this.K = x7Var.f15744e;
        } else {
            TLRPC.InputPeer inputPeer = x7Var.f15777v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = org.telegram.messenger.n5.n(inputPeer);
            } else {
                this.K = i10.i(p6Var.f12387a).f24656n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.J;
        hi.x7 x7Var = this.f12337c;
        p6 p6Var = this.N;
        if (z10) {
            p6Var.f12406w.b(x7Var);
            ((ArrayList) p6Var.f12388b.f(this.K)).remove(this);
        }
        this.f12343w = true;
        if (x7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(p6Var.f12387a).b(this.f12338e, false);
        if (this.f12344x >= 0) {
            ConnectionsManager.getInstance(p6Var.f12387a).cancelRequest(this.f12344x, true);
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
        int i7 = p6Var.f12387a;
        ks.f(i7).n(this, ks.U1);
        ks.f(i7).n(this, ks.V1);
        ks.f(i7).n(this, ks.W1);
        ks.f(i7).n(this, ks.f25194c2);
        ks.f(i7).n(this, ks.f25181a2);
        ks.f(i7).n(this, ks.f25188b2);
        boolean z10 = this.J;
        long j3 = this.K;
        if (!z10 && (arrayList = (ArrayList) p6Var.f12388b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) p6Var.f12389c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                p6Var.d = 0;
            } else {
                p6Var.d++;
            }
        }
        boolean z11 = this.f12336b;
        hi.x7 x7Var = this.f12337c;
        if (z11 && (hashMap = (HashMap) p6Var.f12390e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(x7Var.f15747f));
        }
        if (this.M != null) {
            h6 A = p6Var.A(4, -1, this.K, false);
            if (x7Var != null && x7Var.f15749g) {
                if (A instanceof a6) {
                    ((a6) A).G(x7Var.L0, this.M);
                }
                String str = x7Var.K0;
                TLRPC.InputMedia inputMedia = x7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = gi.q.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    a6 a6Var = (a6) longSparseArray4.get(j3);
                    int i10 = a6Var.f12047c;
                    ArrayList arrayList3 = a6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(a6Var.E, str)) {
                            a6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            e6 e6Var = a6Var.f12059q;
                            org.telegram.messenger.g0.r(e6Var);
                            org.telegram.messenger.g0.g3(e6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = gi.q.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (qVar2 = (gi.q) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = qVar2.f13663f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        a6 a6Var2 = (a6) arrayList4.get(i11);
                        if (a6Var2.f12047c == i7 && TextUtils.equals(a6Var2.E, str)) {
                            a6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof a6) {
                    ((a6) A).I(this.M);
                }
                String str2 = x7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = gi.q.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    a6 a6Var3 = (a6) longSparseArray2.get(j3);
                    int i12 = a6Var3.f12047c;
                    ArrayList arrayList5 = a6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(a6Var3.E, str2)) {
                            a6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            e6 e6Var2 = a6Var3.f12059q;
                            org.telegram.messenger.g0.r(e6Var2);
                            org.telegram.messenger.g0.g3(e6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = gi.q.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (qVar = (gi.q) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = qVar.f13663f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        a6 a6Var4 = (a6) arrayList6.get(i13);
                        if (a6Var4.f12047c == i7 && TextUtils.equals(a6Var4.E, str2)) {
                            a6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        ks.f(i7).k(ks.f25329y5, new Object[0]);
        if (x7Var != null && !x7Var.h && !this.d) {
            x7Var.i(false);
            this.d = true;
        }
        ks.e().k(ks.E5, this.f12338e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        hi.x7 x7Var = this.f12337c;
        if (x7Var.f15737b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f12337c.f15740c0;
            int i7 = mp.I8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f28504id = document.f28498id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((x7Var.f15749g || (x7Var.f15761n && x7Var.f15773t != null)) && !x7Var.f15754j && x7Var.f15764o0 == null) {
            c(null);
            return;
        }
        hi.i9 i9Var = this.f12337c.E0;
        if (i9Var != null && i9Var.f14701a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        ks.f(this.N.f12387a).b(this, ks.U1);
        ks.f(this.N.f12387a).b(this, ks.V1);
        ks.f(this.N.f12387a).b(this, ks.W1);
        ks.f(this.N.f12387a).b(this, ks.f25194c2);
        ks.f(this.N.f12387a).b(this, ks.f25181a2);
        ks.f(this.N.f12387a).b(this, ks.f25188b2);
        boolean E = this.f12337c.E();
        this.f12342s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28513id = 1;
            String absolutePath = hi.x7.x(this.N.f12387a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f12338e = absolutePath;
            this.F = new fj(this.N.f12387a, tL_message, null, false, false);
            this.f12337c.s(new n6(this, 1));
        } else {
            File w10 = hi.x7.w(this.N.f12387a, "jpg");
            this.f12338e = w10.getAbsolutePath();
            Utilities.f22880i.c(new l4(8, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f27013b, StoryUploadingService.class);
        intent.putExtra("path", this.f12338e);
        intent.putExtra("currentAccount", this.N.f12387a);
        try {
            org.telegram.messenger.t0.f27013b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p6 p6Var = this.N;
        int i11 = p6Var.f12387a;
        if (i7 == ks.f25181a2) {
            if (objArr[0] == this.F) {
                this.f12338e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = ks.f25188b2;
        int i13 = ks.D5;
        if (i7 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f12340n = floatValue;
                this.h = (this.f12341r * 0.7f) + (floatValue * 0.3f);
                ks.f(i11).k(i13, this.f12338e, Float.valueOf(this.h));
                if (this.f12345y < 0 && this.f12340n * ((float) this.E) >= 1000.0f) {
                    this.f12345y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f12340n));
                if (longValue2 > 0 && this.f12345y < 0) {
                    this.f12345y = longValue2;
                }
            }
        } else if (i7 == ks.f25194c2) {
            if (objArr[0] == this.F) {
                if (!this.f12336b) {
                    hi.x7 x7Var = this.f12337c;
                    x7Var.f15778w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    x7Var.f15780x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    p6Var.f12406w.d(x7Var);
                }
                b();
            }
        } else if (i7 == ks.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f12338e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == ks.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f12338e;
            if (str5 != null && str4.equals(str5)) {
                ks.e().k(ks.S4, 1, gd.N0(2131744208, null));
                b();
            }
        } else if (i7 == ks.W1 && ((String) objArr[0]).equals(this.f12338e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f12341r = min;
            this.h = (min * 0.7f) + (this.f12340n * 0.3f);
            ks.f(i11).k(i13, this.f12338e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        hi.x7 x7Var = this.f12337c;
        x7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.f12387a);
        String str = this.f12338e;
        boolean z10 = !x7Var.K;
        long j3 = 0;
        if (this.f12342s) {
            d20 d20Var = this.G;
            if (d20Var != null) {
                j3 = d20Var.f23603q;
            }
            j3 = Math.max(1, (int) j3);
        }
        if (x7Var.K) {
            i7 = 33554432;
        } else {
            i7 = 16777216;
        }
        G.g0(str, false, z10, j3, i7, true);
    }
}

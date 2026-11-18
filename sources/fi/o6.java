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
    public final boolean f12332b;
    public final hi.d7 f12333c;
    public boolean d;
    public String f12334e;
    public final String f12335f;
    public float h;
    public float f12336n;
    public float f12337r;
    public boolean f12338s;
    public boolean f12339w;
    public int f12340x;
    public long f12341y = -1;
    public final long f12331a = Utilities.f22780b.nextLong();

    public o6(p6 p6Var, hi.d7 d7Var) {
        this.N = p6Var;
        this.f12333c = d7Var;
        this.f12332b = d7Var.f14404g;
        File file = d7Var.N0;
        if (file != null) {
            this.f12335f = file.getAbsolutePath();
        }
        boolean z10 = d7Var.f14433w;
        this.I = z10;
        this.J = z10;
        long j3 = d7Var.J0;
        if (j3 != 0) {
            this.K = j3;
        } else if (d7Var.f14404g) {
            this.K = d7Var.f14399e;
        } else {
            TLRPC.InputPeer inputPeer = d7Var.f14432v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = org.telegram.messenger.n5.n(inputPeer);
            } else {
                this.K = j10.i(p6Var.f12385a).f24792n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.J;
        hi.d7 d7Var = this.f12333c;
        p6 p6Var = this.N;
        if (z10) {
            p6Var.f12404w.b(d7Var);
            ((ArrayList) p6Var.f12386b.f(this.K)).remove(this);
        }
        this.f12339w = true;
        if (d7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(p6Var.f12385a).b(this.f12334e, false);
        if (this.f12340x >= 0) {
            ConnectionsManager.getInstance(p6Var.f12385a).cancelRequest(this.f12340x, true);
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
        int i7 = p6Var.f12385a;
        ks.f(i7).n(this, ks.U1);
        ks.f(i7).n(this, ks.V1);
        ks.f(i7).n(this, ks.W1);
        ks.f(i7).n(this, ks.f25097c2);
        ks.f(i7).n(this, ks.f25085a2);
        ks.f(i7).n(this, ks.f25091b2);
        boolean z10 = this.J;
        long j3 = this.K;
        if (!z10 && (arrayList = (ArrayList) p6Var.f12386b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) p6Var.f12387c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                p6Var.d = 0;
            } else {
                p6Var.d++;
            }
        }
        boolean z11 = this.f12332b;
        hi.d7 d7Var = this.f12333c;
        if (z11 && (hashMap = (HashMap) p6Var.f12388e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(d7Var.f14402f));
        }
        if (this.M != null) {
            h6 A = p6Var.A(4, -1, this.K, false);
            if (d7Var != null && d7Var.f14404g) {
                if (A instanceof z5) {
                    ((z5) A).G(d7Var.L0, this.M);
                }
                String str = d7Var.K0;
                TLRPC.InputMedia inputMedia = d7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = gi.q.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    z5 z5Var = (z5) longSparseArray4.get(j3);
                    int i10 = z5Var.f12044c;
                    ArrayList arrayList3 = z5Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(z5Var.E, str)) {
                            z5Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            e6 e6Var = z5Var.f12056q;
                            org.telegram.messenger.g0.r(e6Var);
                            org.telegram.messenger.g0.g3(e6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = gi.q.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (qVar2 = (gi.q) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = qVar2.f13671f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        z5 z5Var2 = (z5) arrayList4.get(i11);
                        if (z5Var2.f12044c == i7 && TextUtils.equals(z5Var2.E, str)) {
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
                    int i12 = z5Var3.f12044c;
                    ArrayList arrayList5 = z5Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(z5Var3.E, str2)) {
                            z5Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            e6 e6Var2 = z5Var3.f12056q;
                            org.telegram.messenger.g0.r(e6Var2);
                            org.telegram.messenger.g0.g3(e6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = gi.q.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (qVar = (gi.q) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = qVar.f13671f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        z5 z5Var4 = (z5) arrayList6.get(i13);
                        if (z5Var4.f12044c == i7 && TextUtils.equals(z5Var4.E, str2)) {
                            z5Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        ks.f(i7).k(ks.f25225x5, new Object[0]);
        if (d7Var != null && !d7Var.h && !this.d) {
            d7Var.i(false);
            this.d = true;
        }
        ks.e().k(ks.D5, this.f12334e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        hi.d7 d7Var = this.f12333c;
        if (d7Var.f14392b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f12333c.f14395c0;
            int i7 = mp.I8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f28417id = document.f28411id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((d7Var.f14404g || (d7Var.f14416n && d7Var.f14428t != null)) && !d7Var.f14409j && d7Var.f14419o0 == null) {
            c(null);
            return;
        }
        hi.o8 o8Var = this.f12333c.E0;
        if (o8Var != null && o8Var.f15195a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        ks.f(this.N.f12385a).b(this, ks.U1);
        ks.f(this.N.f12385a).b(this, ks.V1);
        ks.f(this.N.f12385a).b(this, ks.W1);
        ks.f(this.N.f12385a).b(this, ks.f25097c2);
        ks.f(this.N.f12385a).b(this, ks.f25085a2);
        ks.f(this.N.f12385a).b(this, ks.f25091b2);
        boolean E = this.f12333c.E();
        this.f12338s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28426id = 1;
            String absolutePath = hi.d7.x(this.N.f12385a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f12334e = absolutePath;
            this.F = new fj(this.N.f12385a, tL_message, null, false, false);
            this.f12333c.s(new n6(this, 1));
        } else {
            File w10 = hi.d7.w(this.N.f12385a, "jpg");
            this.f12334e = w10.getAbsolutePath();
            Utilities.f22785i.c(new a6(6, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f26915b, StoryUploadingService.class);
        intent.putExtra("path", this.f12334e);
        intent.putExtra("currentAccount", this.N.f12385a);
        try {
            org.telegram.messenger.t0.f26915b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p6 p6Var = this.N;
        int i11 = p6Var.f12385a;
        if (i7 == ks.f25085a2) {
            if (objArr[0] == this.F) {
                this.f12334e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = ks.f25091b2;
        int i13 = ks.C5;
        if (i7 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f12336n = floatValue;
                this.h = (this.f12337r * 0.7f) + (floatValue * 0.3f);
                ks.f(i11).k(i13, this.f12334e, Float.valueOf(this.h));
                if (this.f12341y < 0 && this.f12336n * ((float) this.E) >= 1000.0f) {
                    this.f12341y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f12336n));
                if (longValue2 > 0 && this.f12341y < 0) {
                    this.f12341y = longValue2;
                }
            }
        } else if (i7 == ks.f25097c2) {
            if (objArr[0] == this.F) {
                if (!this.f12332b) {
                    hi.d7 d7Var = this.f12333c;
                    d7Var.f14433w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    d7Var.f14435x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    p6Var.f12404w.d(d7Var);
                }
                b();
            }
        } else if (i7 == ks.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f12334e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == ks.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f12334e;
            if (str5 != null && str4.equals(str5)) {
                ks.e().k(ks.R4, 1, gd.M0(2131744217, null));
                b();
            }
        } else if (i7 == ks.W1 && ((String) objArr[0]).equals(this.f12334e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f12337r = min;
            this.h = (min * 0.7f) + (this.f12336n * 0.3f);
            ks.f(i11).k(i13, this.f12334e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        hi.d7 d7Var = this.f12333c;
        d7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.f12385a);
        String str = this.f12334e;
        boolean z10 = !d7Var.K;
        long j3 = 0;
        if (this.f12338s) {
            e20 e20Var = this.G;
            if (e20Var != null) {
                j3 = e20Var.f23653q;
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

package di;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class x6 implements ls {
    public long D;
    public ij E;
    public j20 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public ij K;
    public TL_bots.botPreviewMedia L;
    public final y6 M;
    public final boolean f9929b;
    public final fi.e7 f9930c;
    public boolean d;
    public String f9931e;
    public final String f9932f;
    public float h;
    public float f9933n;
    public float f9934r;
    public boolean f9935s;
    public boolean f9936w;
    public int f9937x;
    public long f9938y = -1;
    public final long f9928a = Utilities.f21334b.nextLong();

    public x6(y6 y6Var, fi.e7 e7Var) {
        this.M = y6Var;
        this.f9930c = e7Var;
        this.f9929b = e7Var.f11892g;
        File file = e7Var.N0;
        if (file != null) {
            this.f9932f = file.getAbsolutePath();
        }
        boolean z9 = e7Var.f11921w;
        this.H = z9;
        this.I = z9;
        long j3 = e7Var.J0;
        if (j3 != 0) {
            this.J = j3;
        } else if (e7Var.f11892g) {
            this.J = e7Var.f11887e;
        } else {
            TLRPC.InputPeer inputPeer = e7Var.f11920v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = org.telegram.messenger.m5.n(inputPeer);
            } else {
                this.J = p10.i(y6Var.f9963a).f24489n;
            }
        }
    }

    public final void a() {
        boolean z9 = this.I;
        fi.e7 e7Var = this.f9930c;
        y6 y6Var = this.M;
        if (z9) {
            y6Var.f9982w.b(e7Var);
            ((ArrayList) y6Var.f9964b.f(this.J)).remove(this);
        }
        this.f9936w = true;
        if (e7Var.E()) {
            MediaController.B().i(this.E);
        }
        org.telegram.messenger.w7.G(y6Var.f9963a).b(this.f9931e, false);
        if (this.f9937x >= 0) {
            ConnectionsManager.getInstance(y6Var.f9963a).cancelRequest(this.f9937x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ei.r rVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ei.r rVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        y6 y6Var = this.M;
        int i7 = y6Var.f9963a;
        qs.f(i7).n(this, qs.U1);
        qs.f(i7).n(this, qs.V1);
        qs.f(i7).n(this, qs.W1);
        qs.f(i7).n(this, qs.f24981c2);
        qs.f(i7).n(this, qs.f24969a2);
        qs.f(i7).n(this, qs.f24975b2);
        boolean z9 = this.I;
        long j3 = this.J;
        if (!z9 && (arrayList = (ArrayList) y6Var.f9964b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) y6Var.f9965c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                y6Var.d = 0;
            } else {
                y6Var.d++;
            }
        }
        boolean z10 = this.f9929b;
        fi.e7 e7Var = this.f9930c;
        if (z10 && (hashMap = (HashMap) y6Var.f9966e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(e7Var.f11890f));
        }
        if (this.L != null) {
            q6 A = y6Var.A(4, -1, this.J, false);
            if (e7Var != null && e7Var.f11892g) {
                if (A instanceof j6) {
                    ((j6) A).G(e7Var.L0, this.L);
                }
                String str = e7Var.K0;
                TLRPC.InputMedia inputMedia = e7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ei.r.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    j6 j6Var = (j6) longSparseArray4.get(j3);
                    int i10 = j6Var.f9639c;
                    ArrayList arrayList3 = j6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(j6Var.E, str)) {
                            j6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            n6 n6Var = j6Var.f9651q;
                            org.telegram.messenger.g0.r(n6Var);
                            org.telegram.messenger.g0.h3(n6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ei.r.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (rVar2 = (ei.r) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = rVar2.f10848f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        j6 j6Var2 = (j6) arrayList4.get(i11);
                        if (j6Var2.f9639c == i7 && TextUtils.equals(j6Var2.E, str)) {
                            j6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof j6) {
                    ((j6) A).I(this.L);
                }
                String str2 = e7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ei.r.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    j6 j6Var3 = (j6) longSparseArray2.get(j3);
                    int i12 = j6Var3.f9639c;
                    ArrayList arrayList5 = j6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(j6Var3.E, str2)) {
                            j6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            n6 n6Var2 = j6Var3.f9651q;
                            org.telegram.messenger.g0.r(n6Var2);
                            org.telegram.messenger.g0.h3(n6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ei.r.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (rVar = (ei.r) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = rVar.f10848f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        j6 j6Var4 = (j6) arrayList6.get(i13);
                        if (j6Var4.f9639c == i7 && TextUtils.equals(j6Var4.E, str2)) {
                            j6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        qs.f(i7).k(qs.f25095v5, new Object[0]);
        if (e7Var != null && !e7Var.h && !this.d) {
            e7Var.i(false);
            this.d = true;
        }
        qs.e().k(qs.B5, this.f9931e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: di.x6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z9;
        fi.e7 e7Var = this.f9930c;
        if (e7Var.f11880b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f9930c.f11883c0;
            int i7 = qp.C8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f26968id = document.f26962id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((e7Var.f11892g || (e7Var.f11904n && e7Var.f11916t != null)) && !e7Var.f11897j && e7Var.f11907o0 == null) {
            c(null);
            return;
        }
        fi.q8 q8Var = this.f9930c.E0;
        if (q8Var != null && q8Var.f12678a == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.G = z9;
        qs.f(this.M.f9963a).b(this, qs.U1);
        qs.f(this.M.f9963a).b(this, qs.V1);
        qs.f(this.M.f9963a).b(this, qs.W1);
        qs.f(this.M.f9963a).b(this, qs.f24981c2);
        qs.f(this.M.f9963a).b(this, qs.f24969a2);
        qs.f(this.M.f9963a).b(this, qs.f24975b2);
        boolean E = this.f9930c.E();
        this.f9935s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f26977id = 1;
            String absolutePath = fi.e7.x(this.M.f9963a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f9931e = absolutePath;
            this.E = new ij(this.M.f9963a, tL_message, null, false, false);
            this.f9930c.s(new w6(this, 1));
        } else {
            File w10 = fi.e7.w(this.M.f9963a, "jpg");
            this.f9931e = w10.getAbsolutePath();
            Utilities.f21339i.c(new z0(13, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f25566b, StoryUploadingService.class);
        intent.putExtra("path", this.f9931e);
        intent.putExtra("currentAccount", this.M.f9963a);
        try {
            org.telegram.messenger.t0.f25566b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        y6 y6Var = this.M;
        int i11 = y6Var.f9963a;
        if (i7 == qs.f24969a2) {
            if (objArr[0] == this.E) {
                this.f9931e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = qs.f24975b2;
        int i13 = qs.A5;
        if (i7 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f9933n = floatValue;
                this.h = (this.f9934r * 0.7f) + (floatValue * 0.3f);
                qs.f(i11).k(i13, this.f9931e, Float.valueOf(this.h));
                if (this.f9938y < 0 && this.f9933n * ((float) this.D) >= 1000.0f) {
                    this.f9938y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f9933n));
                if (longValue2 > 0 && this.f9938y < 0) {
                    this.f9938y = longValue2;
                }
            }
        } else if (i7 == qs.f24981c2) {
            if (objArr[0] == this.E) {
                if (!this.f9929b) {
                    fi.e7 e7Var = this.f9930c;
                    e7Var.f11921w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    e7Var.f11923x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    y6Var.f9982w.d(e7Var);
                }
                b();
            }
        } else if (i7 == qs.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f9931e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == qs.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f9931e;
            if (str5 != null && str4.equals(str5)) {
                qs.e().k(qs.P4, 1, id.M0(2131744455, null));
                b();
            }
        } else if (i7 == qs.W1 && ((String) objArr[0]).equals(this.f9931e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f9934r = min;
            this.h = (min * 0.7f) + (this.f9933n * 0.3f);
            qs.f(i11).k(i13, this.f9931e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        fi.e7 e7Var = this.f9930c;
        e7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.M.f9963a);
        String str = this.f9931e;
        boolean z9 = !e7Var.K;
        long j3 = 0;
        if (this.f9935s) {
            j20 j20Var = this.F;
            if (j20Var != null) {
                j3 = j20Var.f23487q;
            }
            j3 = Math.max(1, (int) j3);
        }
        if (e7Var.K) {
            i7 = 33554432;
        } else {
            i7 = 16777216;
        }
        G.g0(str, false, z9, j3, i7, true);
    }
}

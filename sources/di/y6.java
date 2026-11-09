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
public final class y6 implements ls {
    public long D;
    public ij E;
    public j20 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public ij K;
    public TL_bots.botPreviewMedia L;
    public final z6 M;
    public final boolean f9959b;
    public final fi.e7 f9960c;
    public boolean d;
    public String f9961e;
    public final String f9962f;
    public float h;
    public float f9963n;
    public float f9964r;
    public boolean f9965s;
    public boolean f9966w;
    public int f9967x;
    public long f9968y = -1;
    public final long f9958a = Utilities.f21334b.nextLong();

    public y6(z6 z6Var, fi.e7 e7Var) {
        this.M = z6Var;
        this.f9960c = e7Var;
        this.f9959b = e7Var.f11892g;
        File file = e7Var.N0;
        if (file != null) {
            this.f9962f = file.getAbsolutePath();
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
                this.J = p10.i(z6Var.f9992a).f24489n;
            }
        }
    }

    public final void a() {
        boolean z9 = this.I;
        fi.e7 e7Var = this.f9960c;
        z6 z6Var = this.M;
        if (z9) {
            z6Var.f10011w.b(e7Var);
            ((ArrayList) z6Var.f9993b.f(this.J)).remove(this);
        }
        this.f9966w = true;
        if (e7Var.E()) {
            MediaController.B().i(this.E);
        }
        org.telegram.messenger.w7.G(z6Var.f9992a).b(this.f9961e, false);
        if (this.f9967x >= 0) {
            ConnectionsManager.getInstance(z6Var.f9992a).cancelRequest(this.f9967x, true);
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
        z6 z6Var = this.M;
        int i7 = z6Var.f9992a;
        qs.f(i7).n(this, qs.U1);
        qs.f(i7).n(this, qs.V1);
        qs.f(i7).n(this, qs.W1);
        qs.f(i7).n(this, qs.f24981c2);
        qs.f(i7).n(this, qs.f24969a2);
        qs.f(i7).n(this, qs.f24975b2);
        boolean z9 = this.I;
        long j3 = this.J;
        if (!z9 && (arrayList = (ArrayList) z6Var.f9993b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) z6Var.f9994c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                z6Var.d = 0;
            } else {
                z6Var.d++;
            }
        }
        boolean z10 = this.f9959b;
        fi.e7 e7Var = this.f9960c;
        if (z10 && (hashMap = (HashMap) z6Var.f9995e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(e7Var.f11890f));
        }
        if (this.L != null) {
            r6 A = z6Var.A(4, -1, this.J, false);
            if (e7Var != null && e7Var.f11892g) {
                if (A instanceof k6) {
                    ((k6) A).G(e7Var.L0, this.L);
                }
                String str = e7Var.K0;
                TLRPC.InputMedia inputMedia = e7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ei.r.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    k6 k6Var = (k6) longSparseArray4.get(j3);
                    int i10 = k6Var.f9690c;
                    ArrayList arrayList3 = k6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(k6Var.E, str)) {
                            k6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            o6 o6Var = k6Var.f9702q;
                            org.telegram.messenger.g0.r(o6Var);
                            org.telegram.messenger.g0.h3(o6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ei.r.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (rVar2 = (ei.r) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = rVar2.f10848f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        k6 k6Var2 = (k6) arrayList4.get(i11);
                        if (k6Var2.f9690c == i7 && TextUtils.equals(k6Var2.E, str)) {
                            k6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof k6) {
                    ((k6) A).I(this.L);
                }
                String str2 = e7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ei.r.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    k6 k6Var3 = (k6) longSparseArray2.get(j3);
                    int i12 = k6Var3.f9690c;
                    ArrayList arrayList5 = k6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(k6Var3.E, str2)) {
                            k6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            o6 o6Var2 = k6Var3.f9702q;
                            org.telegram.messenger.g0.r(o6Var2);
                            org.telegram.messenger.g0.h3(o6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ei.r.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (rVar = (ei.r) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = rVar.f10848f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        k6 k6Var4 = (k6) arrayList6.get(i13);
                        if (k6Var4.f9690c == i7 && TextUtils.equals(k6Var4.E, str2)) {
                            k6Var4.I(botpreviewmedia2);
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
        qs.e().k(qs.B5, this.f9961e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: di.y6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z9;
        fi.e7 e7Var = this.f9960c;
        if (e7Var.f11880b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f9960c.f11883c0;
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
        fi.q8 q8Var = this.f9960c.E0;
        if (q8Var != null && q8Var.f12678a == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.G = z9;
        qs.f(this.M.f9992a).b(this, qs.U1);
        qs.f(this.M.f9992a).b(this, qs.V1);
        qs.f(this.M.f9992a).b(this, qs.W1);
        qs.f(this.M.f9992a).b(this, qs.f24981c2);
        qs.f(this.M.f9992a).b(this, qs.f24969a2);
        qs.f(this.M.f9992a).b(this, qs.f24975b2);
        boolean E = this.f9960c.E();
        this.f9965s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f26977id = 1;
            String absolutePath = fi.e7.x(this.M.f9992a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f9961e = absolutePath;
            this.E = new ij(this.M.f9992a, tL_message, null, false, false);
            this.f9960c.s(new x6(this, 1));
        } else {
            File w10 = fi.e7.w(this.M.f9992a, "jpg");
            this.f9961e = w10.getAbsolutePath();
            Utilities.f21339i.c(new z0(13, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f25566b, StoryUploadingService.class);
        intent.putExtra("path", this.f9961e);
        intent.putExtra("currentAccount", this.M.f9992a);
        try {
            org.telegram.messenger.t0.f25566b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z6 z6Var = this.M;
        int i11 = z6Var.f9992a;
        if (i7 == qs.f24969a2) {
            if (objArr[0] == this.E) {
                this.f9961e = (String) objArr[1];
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
                this.f9963n = floatValue;
                this.h = (this.f9964r * 0.7f) + (floatValue * 0.3f);
                qs.f(i11).k(i13, this.f9961e, Float.valueOf(this.h));
                if (this.f9968y < 0 && this.f9963n * ((float) this.D) >= 1000.0f) {
                    this.f9968y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f9963n));
                if (longValue2 > 0 && this.f9968y < 0) {
                    this.f9968y = longValue2;
                }
            }
        } else if (i7 == qs.f24981c2) {
            if (objArr[0] == this.E) {
                if (!this.f9959b) {
                    fi.e7 e7Var = this.f9960c;
                    e7Var.f11921w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    e7Var.f11923x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    z6Var.f10011w.d(e7Var);
                }
                b();
            }
        } else if (i7 == qs.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f9961e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == qs.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f9961e;
            if (str5 != null && str4.equals(str5)) {
                qs.e().k(qs.P4, 1, id.M0(2131744452, null));
                b();
            }
        } else if (i7 == qs.W1 && ((String) objArr[0]).equals(this.f9961e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f9964r = min;
            this.h = (min * 0.7f) + (this.f9963n * 0.3f);
            qs.f(i11).k(i13, this.f9961e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        fi.e7 e7Var = this.f9960c;
        e7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.M.f9992a);
        String str = this.f9961e;
        boolean z9 = !e7Var.K;
        long j3 = 0;
        if (this.f9965s) {
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

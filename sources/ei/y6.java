package ei;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class y6 implements cs {
    public long E;
    public zi F;
    public b20 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public zi L;
    public TL_bots.botPreviewMedia M;
    public final z6 N;
    public final boolean f11235b;
    public final gi.f7 f11236c;
    public boolean d;
    public String f11237e;
    public final String f11238f;
    public float h;
    public float f11239n;
    public float f11240r;
    public boolean f11241s;
    public boolean f11242w;
    public int f11243x;
    public long f11244y = -1;
    public final long f11234a = Utilities.f21385b.nextLong();

    public y6(z6 z6Var, gi.f7 f7Var) {
        this.N = z6Var;
        this.f11236c = f7Var;
        this.f11235b = f7Var.f12718g;
        File file = f7Var.N0;
        if (file != null) {
            this.f11238f = file.getAbsolutePath();
        }
        boolean z10 = f7Var.f12747w;
        this.I = z10;
        this.J = z10;
        long j10 = f7Var.J0;
        if (j10 != 0) {
            this.K = j10;
        } else if (f7Var.f12718g) {
            this.K = f7Var.f12713e;
        } else {
            TLRPC.InputPeer inputPeer = f7Var.f12746v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = org.telegram.messenger.m5.n(inputPeer);
            } else {
                this.K = h10.i(z6Var.f11274a).f22848n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.J;
        gi.f7 f7Var = this.f11236c;
        z6 z6Var = this.N;
        if (z10) {
            z6Var.f11293w.b(f7Var);
            ((ArrayList) z6Var.f11275b.f(this.K)).remove(this);
        }
        this.f11242w = true;
        if (f7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(z6Var.f11274a).b(this.f11237e, false);
        if (this.f11243x >= 0) {
            ConnectionsManager.getInstance(z6Var.f11274a).cancelRequest(this.f11243x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        fi.q qVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        fi.q qVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        z6 z6Var = this.N;
        int i3 = z6Var.f11274a;
        hs.f(i3).n(this, hs.U1);
        hs.f(i3).n(this, hs.V1);
        hs.f(i3).n(this, hs.W1);
        hs.f(i3).n(this, hs.c2);
        hs.f(i3).n(this, hs.f23198a2);
        hs.f(i3).n(this, hs.f23204b2);
        boolean z10 = this.J;
        long j10 = this.K;
        if (!z10 && (arrayList = (ArrayList) z6Var.f11275b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) z6Var.f11276c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                z6Var.d = 0;
            } else {
                z6Var.d++;
            }
        }
        boolean z11 = this.f11235b;
        gi.f7 f7Var = this.f11236c;
        if (z11 && (hashMap = (HashMap) z6Var.f11277e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(f7Var.f12716f));
        }
        if (this.M != null) {
            r6 A = z6Var.A(4, -1, this.K, false);
            if (f7Var != null && f7Var.f12718g) {
                if (A instanceof k6) {
                    ((k6) A).G(f7Var.L0, this.M);
                }
                String str = f7Var.K0;
                TLRPC.InputMedia inputMedia = f7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = fi.q.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i3)) != null) {
                    k6 k6Var = (k6) longSparseArray4.get(j10);
                    int i10 = k6Var.f10872c;
                    ArrayList arrayList3 = k6Var.G;
                    if (i10 == i3) {
                        if (TextUtils.equals(k6Var.E, str)) {
                            k6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            o6 o6Var = k6Var.f10884q;
                            org.telegram.messenger.g0.r(o6Var);
                            org.telegram.messenger.g0.h3(o6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = fi.q.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i3)) != null && (qVar2 = (fi.q) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = qVar2.f11635f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        k6 k6Var2 = (k6) arrayList4.get(i11);
                        if (k6Var2.f10872c == i3 && TextUtils.equals(k6Var2.E, str)) {
                            k6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof k6) {
                    ((k6) A).I(this.M);
                }
                String str2 = f7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = fi.q.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i3)) != null) {
                    k6 k6Var3 = (k6) longSparseArray2.get(j10);
                    int i12 = k6Var3.f10872c;
                    ArrayList arrayList5 = k6Var3.G;
                    if (i12 == i3) {
                        if (TextUtils.equals(k6Var3.E, str2)) {
                            k6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            o6 o6Var2 = k6Var3.f10884q;
                            org.telegram.messenger.g0.r(o6Var2);
                            org.telegram.messenger.g0.h3(o6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = fi.q.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i3)) != null && (qVar = (fi.q) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = qVar.f11635f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        k6 k6Var4 = (k6) arrayList6.get(i13);
                        if (k6Var4.f10872c == i3 && TextUtils.equals(k6Var4.E, str2)) {
                            k6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        hs.f(i3).k(hs.f23324v5, new Object[0]);
        if (f7Var != null && !f7Var.h && !this.d) {
            f7Var.i(false);
            this.d = true;
        }
        hs.e().k(hs.B5, this.f11237e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: ei.y6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        gi.f7 f7Var = this.f11236c;
        if (f7Var.f12706b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f11236c.f12709c0;
            int i3 = hp.C8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f27013id = document.f27007id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((f7Var.f12718g || (f7Var.f12730n && f7Var.f12742t != null)) && !f7Var.f12723j && f7Var.f12733o0 == null) {
            c(null);
            return;
        }
        gi.r8 r8Var = this.f11236c.E0;
        if (r8Var != null && r8Var.f13526a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        hs.f(this.N.f11274a).b(this, hs.U1);
        hs.f(this.N.f11274a).b(this, hs.V1);
        hs.f(this.N.f11274a).b(this, hs.W1);
        hs.f(this.N.f11274a).b(this, hs.c2);
        hs.f(this.N.f11274a).b(this, hs.f23198a2);
        hs.f(this.N.f11274a).b(this, hs.f23204b2);
        boolean E = this.f11236c.E();
        this.f11241s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f27022id = 1;
            String absolutePath = gi.f7.x(this.N.f11274a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f11237e = absolutePath;
            this.F = new zi(this.N.f11274a, tL_message, null, false, false);
            this.f11236c.s(new x6(this, 1));
        } else {
            File w10 = gi.f7.w(this.N.f11274a, "jpg");
            this.f11237e = w10.getAbsolutePath();
            Utilities.f21390i.c(new b0(16, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f25457b, StoryUploadingService.class);
        intent.putExtra("path", this.f11237e);
        intent.putExtra("currentAccount", this.N.f11274a);
        try {
            org.telegram.messenger.t0.f25457b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        z6 z6Var = this.N;
        int i11 = z6Var.f11274a;
        if (i3 == hs.f23198a2) {
            if (objArr[0] == this.F) {
                this.f11237e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = hs.f23204b2;
        int i13 = hs.A5;
        if (i3 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f11239n = floatValue;
                this.h = (this.f11240r * 0.7f) + (floatValue * 0.3f);
                hs.f(i11).k(i13, this.f11237e, Float.valueOf(this.h));
                if (this.f11244y < 0 && this.f11239n * ((float) this.E) >= 1000.0f) {
                    this.f11244y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f11239n));
                if (longValue2 > 0 && this.f11244y < 0) {
                    this.f11244y = longValue2;
                }
            }
        } else if (i3 == hs.c2) {
            if (objArr[0] == this.F) {
                if (!this.f11235b) {
                    gi.f7 f7Var = this.f11236c;
                    f7Var.f12747w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    f7Var.f12749x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    z6Var.f11293w.d(f7Var);
                }
                b();
            }
        } else if (i3 == hs.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f11237e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i3 == hs.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f11237e;
            if (str5 != null && str4.equals(str5)) {
                hs.e().k(hs.P4, 1, bd.M0(2131744462, null));
                b();
            }
        } else if (i3 == hs.W1 && ((String) objArr[0]).equals(this.f11237e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f11240r = min;
            this.h = (min * 0.7f) + (this.f11239n * 0.3f);
            hs.f(i11).k(i13, this.f11237e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i3;
        gi.f7 f7Var = this.f11236c;
        f7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.f11274a);
        String str = this.f11237e;
        boolean z10 = !f7Var.K;
        long j10 = 0;
        if (this.f11241s) {
            b20 b20Var = this.G;
            if (b20Var != null) {
                j10 = b20Var.f21724q;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (f7Var.K) {
            i3 = 33554432;
        } else {
            i3 = 16777216;
        }
        G.h0(str, false, z10, j10, i3, true);
    }
}

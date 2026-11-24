package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class f2b implements gk7 {
    public long E;
    public k27 F;
    public oac G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public k27 L;
    public TL_bots.botPreviewMedia M;
    public final g2b N;
    public final boolean b;
    public final f4b c;
    public boolean d;
    public String e;
    public final String f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public boolean w;
    public int x;
    public long y = -1;
    public final long a = Utilities.b.nextLong();

    public f2b(g2b g2bVar, f4b f4bVar) {
        this.N = g2bVar;
        this.c = f4bVar;
        this.b = f4bVar.g;
        File file = f4bVar.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z = f4bVar.w;
        this.I = z;
        this.J = z;
        long j = f4bVar.J0;
        if (j != 0) {
            this.K = j;
        } else if (f4bVar.g) {
            this.K = f4bVar.e;
        } else {
            TLRPC.InputPeer inputPeer = f4bVar.v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = cf3.m(inputPeer);
            } else {
                this.K = y6c.h(g2bVar.a).n;
            }
        }
    }

    public final void a() {
        g2b g2bVar = this.N;
        int i = g2bVar.a;
        boolean z = this.J;
        f4b f4bVar = this.c;
        if (z) {
            g2bVar.w.b(f4bVar);
            ((ArrayList) g2bVar.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (f4bVar.D()) {
            MediaController.w().d(this.F);
        }
        ba4.G(i).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        kr0 kr0Var;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        kr0 kr0Var2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        g2b g2bVar = this.N;
        int i = g2bVar.a;
        kk7.f(i).n(this, kk7.T1);
        kk7.f(i).n(this, kk7.U1);
        kk7.f(i).n(this, kk7.V1);
        kk7.f(i).n(this, kk7.b2);
        kk7.f(i).n(this, kk7.Z1);
        kk7.f(i).n(this, kk7.a2);
        boolean z = this.J;
        long j = this.K;
        if (!z && (arrayList = (ArrayList) g2bVar.b.f(j)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) g2bVar.c.f(j);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                g2bVar.d = 0;
            } else {
                g2bVar.d++;
            }
        }
        boolean z2 = this.b;
        f4b f4bVar = this.c;
        if (z2 && (hashMap = (HashMap) g2bVar.e.f(j)) != null) {
            hashMap.remove(Integer.valueOf(f4bVar.f));
        }
        if (this.M != null) {
            y1b z3 = g2bVar.z(4, -1, this.K, false);
            if (f4bVar != null && f4bVar.g) {
                if (z3 instanceof s1b) {
                    ((s1b) z3).G(f4bVar.L0, this.M);
                }
                String str = f4bVar.K0;
                TLRPC.InputMedia inputMedia = f4bVar.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = kr0.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i)) != null) {
                    s1b s1bVar = (s1b) longSparseArray4.get(j);
                    int i2 = s1bVar.c;
                    ArrayList arrayList3 = s1bVar.G;
                    if (i2 == i) {
                        if (TextUtils.equals(s1bVar.E, str)) {
                            s1bVar.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            v1b v1bVar = s1bVar.q;
                            gl.r(v1bVar);
                            gl.d3(v1bVar);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = kr0.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i)) != null && (kr0Var2 = (kr0) longSparseArray3.get(j)) != null) {
                    ArrayList arrayList4 = kr0Var2.f;
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        s1b s1bVar2 = (s1b) arrayList4.get(i3);
                        if (s1bVar2.c == i && TextUtils.equals(s1bVar2.E, str)) {
                            s1bVar2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (z3 instanceof s1b) {
                    ((s1b) z3).I(this.M);
                }
                String str2 = f4bVar.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = kr0.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i)) != null) {
                    s1b s1bVar3 = (s1b) longSparseArray2.get(j);
                    int i4 = s1bVar3.c;
                    ArrayList arrayList5 = s1bVar3.G;
                    if (i4 == i) {
                        if (TextUtils.equals(s1bVar3.E, str2)) {
                            s1bVar3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            v1b v1bVar2 = s1bVar3.q;
                            gl.r(v1bVar2);
                            gl.d3(v1bVar2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = kr0.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i)) != null && (kr0Var = (kr0) longSparseArray.get(j)) != null) {
                    ArrayList arrayList6 = kr0Var.f;
                    for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                        s1b s1bVar4 = (s1b) arrayList6.get(i5);
                        if (s1bVar4.c == i && TextUtils.equals(s1bVar4.E, str2)) {
                            s1bVar4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        kk7.f(i).k(kk7.x5, new Object[0]);
        if (f4bVar != null && !f4bVar.h && !this.d) {
            f4bVar.i(false);
            this.d = true;
        }
        kk7.e().k(kk7.D5, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2b.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z;
        f4b f4bVar = this.c;
        if (f4bVar.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i = na7.q5;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((f4bVar.g || (f4bVar.n && f4bVar.t != null)) && !f4bVar.j && f4bVar.o0 == null) {
            c(null);
            return;
        }
        w5b w5bVar = this.c.E0;
        if (w5bVar != null && w5bVar.a == 1) {
            z = true;
        } else {
            z = false;
        }
        this.H = z;
        kk7.f(this.N.a).a(this, kk7.T1);
        kk7.f(this.N.a).a(this, kk7.U1);
        kk7.f(this.N.a).a(this, kk7.V1);
        kk7.f(this.N.a).a(this, kk7.b2);
        kk7.f(this.N.a).a(this, kk7.Z1);
        kk7.f(this.N.a).a(this, kk7.a2);
        boolean D = this.c.D();
        this.s = D;
        if (D) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = f4b.w(this.N.a, "mp4").getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new k27(this.N.a, tL_message, null, false, false);
            this.c.s(new e2b(this, (byte) 1));
        } else {
            File w = f4b.w(this.N.a, "jpg");
            this.e = w.getAbsolutePath();
            Utilities.i.c(new iya(this, w, (byte) 12));
        }
        Intent intent = new Intent(a.b, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.N.a);
        try {
            a.b.startService(intent);
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        g2b g2bVar = this.N;
        int i3 = g2bVar.a;
        if (i == kk7.Z1) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i4 = kk7.a2;
        int i5 = kk7.C5;
        if (i == i4) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                kk7.f(i3).k(i5, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * ((float) this.E) >= 1000.0f) {
                    this.y = longValue;
                }
                ba4.G(i3).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 > 0 && this.y < 0) {
                    this.y = longValue2;
                }
            }
        } else if (i == kk7.b2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    f4b f4bVar = this.c;
                    f4bVar.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    f4bVar.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    g2bVar.w.d(f4bVar);
                }
                b();
            }
        } else if (i == kk7.T1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i == kk7.U1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 != null && str4.equals(str5)) {
                kk7.e().k(kk7.R4, 1, k96.M0(2131744212, null));
                b();
            }
        } else if (i == kk7.V1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            kk7.f(i3).k(i5, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i;
        f4b f4bVar = this.c;
        f4bVar.getClass();
        ba4 G = ba4.G(this.N.a);
        String str = this.e;
        boolean z = !f4bVar.K;
        long j = 0;
        if (this.s) {
            oac oacVar = this.G;
            if (oacVar != null) {
                j = oacVar.q;
            }
            j = Math.max(1, (int) j);
        }
        if (f4bVar.K) {
            i = 33554432;
        } else {
            i = 16777216;
        }
        G.g0(str, false, z, j, i, true);
    }
}

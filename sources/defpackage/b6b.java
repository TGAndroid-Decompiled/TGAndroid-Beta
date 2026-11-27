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
public final class b6b implements fn7 {
    public long E;
    public r47 F;
    public oec G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public r47 L;
    public TL_bots.botPreviewMedia M;
    public final c6b N;
    public final boolean b;
    public final c8b c;
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

    public b6b(c6b c6bVar, c8b c8bVar) {
        this.N = c6bVar;
        this.c = c8bVar;
        this.b = c8bVar.g;
        File file = c8bVar.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z = c8bVar.w;
        this.I = z;
        this.J = z;
        long j = c8bVar.J0;
        if (j != 0) {
            this.K = j;
        } else if (c8bVar.g) {
            this.K = c8bVar.e;
        } else {
            TLRPC.InputPeer inputPeer = c8bVar.v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = wf3.m(inputPeer);
            } else {
                this.K = yac.h(c6bVar.a).n;
            }
        }
    }

    public final void a() {
        c6b c6bVar = this.N;
        int i = c6bVar.a;
        boolean z = this.J;
        c8b c8bVar = this.c;
        if (z) {
            c6bVar.w.b(c8bVar);
            ((ArrayList) c6bVar.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (c8bVar.D()) {
            MediaController.z().d(this.F);
        }
        xb4.G(i).b(this.e, false);
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
        c6b c6bVar = this.N;
        int i = c6bVar.a;
        jn7.f(i).n(this, jn7.U1);
        jn7.f(i).n(this, jn7.V1);
        jn7.f(i).n(this, jn7.W1);
        jn7.f(i).n(this, jn7.c2);
        jn7.f(i).n(this, jn7.a2);
        jn7.f(i).n(this, jn7.b2);
        boolean z = this.J;
        long j = this.K;
        if (!z && (arrayList = (ArrayList) c6bVar.b.f(j)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) c6bVar.c.f(j);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                c6bVar.d = 0;
            } else {
                c6bVar.d++;
            }
        }
        boolean z2 = this.b;
        c8b c8bVar = this.c;
        if (z2 && (hashMap = (HashMap) c6bVar.e.f(j)) != null) {
            hashMap.remove(Integer.valueOf(c8bVar.f));
        }
        if (this.M != null) {
            v5b z3 = c6bVar.z(4, -1, this.K, false);
            if (c8bVar != null && c8bVar.g) {
                if (z3 instanceof p5b) {
                    ((p5b) z3).G(c8bVar.L0, this.M);
                }
                String str = c8bVar.K0;
                TLRPC.InputMedia inputMedia = c8bVar.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = kr0.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i)) != null) {
                    p5b p5bVar = (p5b) longSparseArray4.get(j);
                    int i2 = p5bVar.c;
                    ArrayList arrayList3 = p5bVar.G;
                    if (i2 == i) {
                        if (TextUtils.equals(p5bVar.E, str)) {
                            p5bVar.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            s5b s5bVar = p5bVar.q;
                            hl.r(s5bVar);
                            hl.c3(s5bVar);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = kr0.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i)) != null && (kr0Var2 = (kr0) longSparseArray3.get(j)) != null) {
                    ArrayList arrayList4 = kr0Var2.f;
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        p5b p5bVar2 = (p5b) arrayList4.get(i3);
                        if (p5bVar2.c == i && TextUtils.equals(p5bVar2.E, str)) {
                            p5bVar2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (z3 instanceof p5b) {
                    ((p5b) z3).I(this.M);
                }
                String str2 = c8bVar.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = kr0.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i)) != null) {
                    p5b p5bVar3 = (p5b) longSparseArray2.get(j);
                    int i4 = p5bVar3.c;
                    ArrayList arrayList5 = p5bVar3.G;
                    if (i4 == i) {
                        if (TextUtils.equals(p5bVar3.E, str2)) {
                            p5bVar3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            s5b s5bVar2 = p5bVar3.q;
                            hl.r(s5bVar2);
                            hl.c3(s5bVar2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = kr0.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i)) != null && (kr0Var = (kr0) longSparseArray.get(j)) != null) {
                    ArrayList arrayList6 = kr0Var.f;
                    for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                        p5b p5bVar4 = (p5b) arrayList6.get(i5);
                        if (p5bVar4.c == i && TextUtils.equals(p5bVar4.E, str2)) {
                            p5bVar4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        jn7.f(i).k(jn7.y5, new Object[0]);
        if (c8bVar != null && !c8bVar.h && !this.d) {
            c8bVar.i(false);
            this.d = true;
        }
        jn7.e().k(jn7.E5, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6b.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z;
        c8b c8bVar = this.c;
        if (c8bVar.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i = uc7.s5;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((c8bVar.g || (c8bVar.n && c8bVar.t != null)) && !c8bVar.j && c8bVar.o0 == null) {
            c(null);
            return;
        }
        u9b u9bVar = this.c.E0;
        if (u9bVar != null && u9bVar.a == 1) {
            z = true;
        } else {
            z = false;
        }
        this.H = z;
        jn7.f(this.N.a).a(this, jn7.U1);
        jn7.f(this.N.a).a(this, jn7.V1);
        jn7.f(this.N.a).a(this, jn7.W1);
        jn7.f(this.N.a).a(this, jn7.c2);
        jn7.f(this.N.a).a(this, jn7.a2);
        jn7.f(this.N.a).a(this, jn7.b2);
        boolean D = this.c.D();
        this.s = D;
        if (D) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = c8b.w(this.N.a, "mp4").getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new r47(this.N.a, tL_message, null, false, false);
            this.c.s(new a6b(this, (byte) 1));
        } else {
            File w = c8b.w(this.N.a, "jpg");
            this.e = w.getAbsolutePath();
            Utilities.i.c(new n3b(this, w, (byte) 10));
        }
        Intent intent = new Intent(a.b, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.N.a);
        try {
            a.b.startService(intent);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        c6b c6bVar = this.N;
        int i3 = c6bVar.a;
        if (i == jn7.a2) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i4 = jn7.b2;
        int i5 = jn7.D5;
        if (i == i4) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                jn7.f(i3).k(i5, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * ((float) this.E) >= 1000.0f) {
                    this.y = longValue;
                }
                xb4.G(i3).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 > 0 && this.y < 0) {
                    this.y = longValue2;
                }
            }
        } else if (i == jn7.c2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    c8b c8bVar = this.c;
                    c8bVar.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    c8bVar.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    c6bVar.w.d(c8bVar);
                }
                b();
            }
        } else if (i == jn7.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i == jn7.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 != null && str4.equals(str5)) {
                jn7.e().k(jn7.S4, 1, ob6.M0(2131744106, null));
                b();
            }
        } else if (i == jn7.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            jn7.f(i3).k(i5, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i;
        c8b c8bVar = this.c;
        c8bVar.getClass();
        xb4 G = xb4.G(this.N.a);
        String str = this.e;
        boolean z = !c8bVar.K;
        long j = 0;
        if (this.s) {
            oec oecVar = this.G;
            if (oecVar != null) {
                j = oecVar.q;
            }
            j = Math.max(1, (int) j);
        }
        if (c8bVar.K) {
            i = 33554432;
        } else {
            i = 16777216;
        }
        G.g0(str, false, z, j, i, true);
    }
}

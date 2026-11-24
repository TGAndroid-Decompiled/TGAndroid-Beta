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
public final class g4b implements jm7 {
    public long E;
    public k47 F;
    public rcc G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public k47 L;
    public TL_bots.botPreviewMedia M;
    public final h4b N;
    public final boolean b;
    public final g6b c;
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

    public g4b(h4b h4bVar, g6b g6bVar) {
        this.N = h4bVar;
        this.c = g6bVar;
        this.b = g6bVar.g;
        File file = g6bVar.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z = g6bVar.w;
        this.I = z;
        this.J = z;
        long j = g6bVar.J0;
        if (j != 0) {
            this.K = j;
        } else if (g6bVar.g) {
            this.K = g6bVar.e;
        } else {
            TLRPC.InputPeer inputPeer = g6bVar.v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = pg3.m(inputPeer);
            } else {
                this.K = z8c.h(h4bVar.a).n;
            }
        }
    }

    public final void a() {
        h4b h4bVar = this.N;
        int i = h4bVar.a;
        boolean z = this.J;
        g6b g6bVar = this.c;
        if (z) {
            h4bVar.w.b(g6bVar);
            ((ArrayList) h4bVar.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (g6bVar.D()) {
            MediaController.w().d(this.F);
        }
        bc4.G(i).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ks0 ks0Var;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ks0 ks0Var2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        h4b h4bVar = this.N;
        int i = h4bVar.a;
        nm7.f(i).n(this, nm7.U1);
        nm7.f(i).n(this, nm7.V1);
        nm7.f(i).n(this, nm7.W1);
        nm7.f(i).n(this, nm7.c2);
        nm7.f(i).n(this, nm7.a2);
        nm7.f(i).n(this, nm7.b2);
        boolean z = this.J;
        long j = this.K;
        if (!z && (arrayList = (ArrayList) h4bVar.b.f(j)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) h4bVar.c.f(j);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                h4bVar.d = 0;
            } else {
                h4bVar.d++;
            }
        }
        boolean z2 = this.b;
        g6b g6bVar = this.c;
        if (z2 && (hashMap = (HashMap) h4bVar.e.f(j)) != null) {
            hashMap.remove(Integer.valueOf(g6bVar.f));
        }
        if (this.M != null) {
            z3b z3 = h4bVar.z(4, -1, this.K, false);
            if (g6bVar != null && g6bVar.g) {
                if (z3 instanceof t3b) {
                    ((t3b) z3).G(g6bVar.L0, this.M);
                }
                String str = g6bVar.K0;
                TLRPC.InputMedia inputMedia = g6bVar.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = ks0.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i)) != null) {
                    t3b t3bVar = (t3b) longSparseArray4.get(j);
                    int i2 = t3bVar.c;
                    ArrayList arrayList3 = t3bVar.G;
                    if (i2 == i) {
                        if (TextUtils.equals(t3bVar.E, str)) {
                            t3bVar.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            w3b w3bVar = t3bVar.q;
                            gm.r(w3bVar);
                            gm.c3(w3bVar);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ks0.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i)) != null && (ks0Var2 = (ks0) longSparseArray3.get(j)) != null) {
                    ArrayList arrayList4 = ks0Var2.f;
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        t3b t3bVar2 = (t3b) arrayList4.get(i3);
                        if (t3bVar2.c == i && TextUtils.equals(t3bVar2.E, str)) {
                            t3bVar2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (z3 instanceof t3b) {
                    ((t3b) z3).I(this.M);
                }
                String str2 = g6bVar.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = ks0.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i)) != null) {
                    t3b t3bVar3 = (t3b) longSparseArray2.get(j);
                    int i4 = t3bVar3.c;
                    ArrayList arrayList5 = t3bVar3.G;
                    if (i4 == i) {
                        if (TextUtils.equals(t3bVar3.E, str2)) {
                            t3bVar3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            w3b w3bVar2 = t3bVar3.q;
                            gm.r(w3bVar2);
                            gm.c3(w3bVar2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ks0.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i)) != null && (ks0Var = (ks0) longSparseArray.get(j)) != null) {
                    ArrayList arrayList6 = ks0Var.f;
                    for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                        t3b t3bVar4 = (t3b) arrayList6.get(i5);
                        if (t3bVar4.c == i && TextUtils.equals(t3bVar4.E, str2)) {
                            t3bVar4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        nm7.f(i).k(nm7.z5, new Object[0]);
        if (g6bVar != null && !g6bVar.h && !this.d) {
            g6bVar.i(false);
            this.d = true;
        }
        nm7.e().k(nm7.F5, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4b.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z;
        g6b g6bVar = this.c;
        if (g6bVar.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i = oc7.s5;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((g6bVar.g || (g6bVar.n && g6bVar.t != null)) && !g6bVar.j && g6bVar.o0 == null) {
            c(null);
            return;
        }
        y7b y7bVar = this.c.E0;
        if (y7bVar != null && y7bVar.a == 1) {
            z = true;
        } else {
            z = false;
        }
        this.H = z;
        nm7.f(this.N.a).a(this, nm7.U1);
        nm7.f(this.N.a).a(this, nm7.V1);
        nm7.f(this.N.a).a(this, nm7.W1);
        nm7.f(this.N.a).a(this, nm7.c2);
        nm7.f(this.N.a).a(this, nm7.a2);
        nm7.f(this.N.a).a(this, nm7.b2);
        boolean D = this.c.D();
        this.s = D;
        if (D) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = g6b.w(this.N.a, "mp4").getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new k47(this.N.a, tL_message, null, false, false);
            this.c.s(new f4b(this, (byte) 1));
        } else {
            File w = g6b.w(this.N.a, "jpg");
            this.e = w.getAbsolutePath();
            Utilities.i.c(new uva(this, w, (byte) 14));
        }
        Intent intent = new Intent(a.b, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.N.a);
        try {
            a.b.startService(intent);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        h4b h4bVar = this.N;
        int i3 = h4bVar.a;
        if (i == nm7.a2) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i4 = nm7.b2;
        int i5 = nm7.E5;
        if (i == i4) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                nm7.f(i3).k(i5, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * ((float) this.E) >= 1000.0f) {
                    this.y = longValue;
                }
                bc4.G(i3).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 > 0 && this.y < 0) {
                    this.y = longValue2;
                }
            }
        } else if (i == nm7.c2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    g6b g6bVar = this.c;
                    g6bVar.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    g6bVar.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    h4bVar.w.d(g6bVar);
                }
                b();
            }
        } else if (i == nm7.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i == nm7.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 != null && str4.equals(str5)) {
                nm7.e().k(nm7.T4, 1, jb6.M0(2131744138, null));
                b();
            }
        } else if (i == nm7.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            nm7.f(i3).k(i5, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i;
        g6b g6bVar = this.c;
        g6bVar.getClass();
        bc4 G = bc4.G(this.N.a);
        String str = this.e;
        boolean z = !g6bVar.K;
        long j = 0;
        if (this.s) {
            rcc rccVar = this.G;
            if (rccVar != null) {
                j = rccVar.q;
            }
            j = Math.max(1, (int) j);
        }
        if (g6bVar.K) {
            i = 33554432;
        } else {
            i = 16777216;
        }
        G.g0(str, false, z, j, i, true);
    }
}

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
    public final boolean f12374b;
    public final hi.c7 f12375c;
    public boolean d;
    public String f12376e;
    public final String f12377f;
    public float h;
    public float f12378n;
    public float f12379r;
    public boolean f12380s;
    public boolean f12381w;
    public int f12382x;
    public long f12383y = -1;
    public final long f12373a = Utilities.f22808b.nextLong();

    public o6(p6 p6Var, hi.c7 c7Var) {
        this.N = p6Var;
        this.f12375c = c7Var;
        this.f12374b = c7Var.f14354g;
        File file = c7Var.N0;
        if (file != null) {
            this.f12377f = file.getAbsolutePath();
        }
        boolean z10 = c7Var.f14383w;
        this.I = z10;
        this.J = z10;
        long j3 = c7Var.J0;
        if (j3 != 0) {
            this.K = j3;
        } else if (c7Var.f14354g) {
            this.K = c7Var.f14349e;
        } else {
            TLRPC.InputPeer inputPeer = c7Var.f14382v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = org.telegram.messenger.n5.n(inputPeer);
            } else {
                this.K = k10.i(p6Var.f12425a).f24987n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.J;
        hi.c7 c7Var = this.f12375c;
        p6 p6Var = this.N;
        if (z10) {
            p6Var.f12444w.b(c7Var);
            ((ArrayList) p6Var.f12426b.f(this.K)).remove(this);
        }
        this.f12381w = true;
        if (c7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(p6Var.f12425a).b(this.f12376e, false);
        if (this.f12382x >= 0) {
            ConnectionsManager.getInstance(p6Var.f12425a).cancelRequest(this.f12382x, true);
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
        int i7 = p6Var.f12425a;
        ls.f(i7).n(this, ls.U1);
        ls.f(i7).n(this, ls.V1);
        ls.f(i7).n(this, ls.W1);
        ls.f(i7).n(this, ls.f25289c2);
        ls.f(i7).n(this, ls.f25276a2);
        ls.f(i7).n(this, ls.f25283b2);
        boolean z10 = this.J;
        long j3 = this.K;
        if (!z10 && (arrayList = (ArrayList) p6Var.f12426b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) p6Var.f12427c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                p6Var.d = 0;
            } else {
                p6Var.d++;
            }
        }
        boolean z11 = this.f12374b;
        hi.c7 c7Var = this.f12375c;
        if (z11 && (hashMap = (HashMap) p6Var.f12428e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(c7Var.f14352f));
        }
        if (this.M != null) {
            h6 A = p6Var.A(4, -1, this.K, false);
            if (c7Var != null && c7Var.f14354g) {
                if (A instanceof a6) {
                    ((a6) A).G(c7Var.L0, this.M);
                }
                String str = c7Var.K0;
                TLRPC.InputMedia inputMedia = c7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = gi.q.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    a6 a6Var = (a6) longSparseArray4.get(j3);
                    int i10 = a6Var.f12085c;
                    ArrayList arrayList3 = a6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(a6Var.E, str)) {
                            a6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            e6 e6Var = a6Var.f12097q;
                            org.telegram.messenger.g0.r(e6Var);
                            org.telegram.messenger.g0.g3(e6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = gi.q.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (qVar2 = (gi.q) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = qVar2.f13700f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        a6 a6Var2 = (a6) arrayList4.get(i11);
                        if (a6Var2.f12085c == i7 && TextUtils.equals(a6Var2.E, str)) {
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
                    int i12 = a6Var3.f12085c;
                    ArrayList arrayList5 = a6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(a6Var3.E, str2)) {
                            a6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            e6 e6Var2 = a6Var3.f12097q;
                            org.telegram.messenger.g0.r(e6Var2);
                            org.telegram.messenger.g0.g3(e6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = gi.q.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (qVar = (gi.q) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = qVar.f13700f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        a6 a6Var4 = (a6) arrayList6.get(i13);
                        if (a6Var4.f12085c == i7 && TextUtils.equals(a6Var4.E, str2)) {
                            a6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        ls.f(i7).k(ls.f25424y5, new Object[0]);
        if (c7Var != null && !c7Var.h && !this.d) {
            c7Var.i(false);
            this.d = true;
        }
        ls.e().k(ls.E5, this.f12376e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        hi.c7 c7Var = this.f12375c;
        if (c7Var.f14342b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f12375c.f14345c0;
            int i7 = np.I8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f28446id = document.f28440id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((c7Var.f14354g || (c7Var.f14366n && c7Var.f14378t != null)) && !c7Var.f14359j && c7Var.f14369o0 == null) {
            c(null);
            return;
        }
        hi.n8 n8Var = this.f12375c.E0;
        if (n8Var != null && n8Var.f15128a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        ls.f(this.N.f12425a).b(this, ls.U1);
        ls.f(this.N.f12425a).b(this, ls.V1);
        ls.f(this.N.f12425a).b(this, ls.W1);
        ls.f(this.N.f12425a).b(this, ls.f25289c2);
        ls.f(this.N.f12425a).b(this, ls.f25276a2);
        ls.f(this.N.f12425a).b(this, ls.f25283b2);
        boolean E = this.f12375c.E();
        this.f12380s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28455id = 1;
            String absolutePath = hi.c7.x(this.N.f12425a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f12376e = absolutePath;
            this.F = new gj(this.N.f12425a, tL_message, null, false, false);
            this.f12375c.s(new n6(this, 1));
        } else {
            File w10 = hi.c7.w(this.N.f12425a, "jpg");
            this.f12376e = w10.getAbsolutePath();
            Utilities.f22813i.c(new l4(8, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f26931b, StoryUploadingService.class);
        intent.putExtra("path", this.f12376e);
        intent.putExtra("currentAccount", this.N.f12425a);
        try {
            org.telegram.messenger.t0.f26931b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p6 p6Var = this.N;
        int i11 = p6Var.f12425a;
        if (i7 == ls.f25276a2) {
            if (objArr[0] == this.F) {
                this.f12376e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = ls.f25283b2;
        int i13 = ls.D5;
        if (i7 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f12378n = floatValue;
                this.h = (this.f12379r * 0.7f) + (floatValue * 0.3f);
                ls.f(i11).k(i13, this.f12376e, Float.valueOf(this.h));
                if (this.f12383y < 0 && this.f12378n * ((float) this.E) >= 1000.0f) {
                    this.f12383y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f12378n));
                if (longValue2 > 0 && this.f12383y < 0) {
                    this.f12383y = longValue2;
                }
            }
        } else if (i7 == ls.f25289c2) {
            if (objArr[0] == this.F) {
                if (!this.f12374b) {
                    hi.c7 c7Var = this.f12375c;
                    c7Var.f14383w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    c7Var.f14385x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    p6Var.f12444w.d(c7Var);
                }
                b();
            }
        } else if (i7 == ls.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f12376e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == ls.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f12376e;
            if (str5 != null && str4.equals(str5)) {
                ls.e().k(ls.S4, 1, hd.N0(2131744209, null));
                b();
            }
        } else if (i7 == ls.W1 && ((String) objArr[0]).equals(this.f12376e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f12379r = min;
            this.h = (min * 0.7f) + (this.f12378n * 0.3f);
            ls.f(i11).k(i13, this.f12376e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        hi.c7 c7Var = this.f12375c;
        c7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.f12425a);
        String str = this.f12376e;
        boolean z10 = !c7Var.K;
        long j3 = 0;
        if (this.f12380s) {
            f20 f20Var = this.G;
            if (f20Var != null) {
                j3 = f20Var.f23842q;
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

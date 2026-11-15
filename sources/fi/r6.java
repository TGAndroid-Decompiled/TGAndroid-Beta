package fi;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class r6 implements is {
    public long E;
    public gj F;
    public g20 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public gj L;
    public TL_bots.botPreviewMedia M;
    public final s6 N;
    public final boolean f12273b;
    public final hi.d7 f12274c;
    public boolean d;
    public String f12275e;
    public final String f12276f;
    public float h;
    public float f12277n;
    public float f12278r;
    public boolean f12279s;
    public boolean f12280w;
    public int f12281x;
    public long f12282y = -1;
    public final long f12272a = Utilities.f22414b.nextLong();

    public r6(s6 s6Var, hi.d7 d7Var) {
        this.N = s6Var;
        this.f12274c = d7Var;
        this.f12273b = d7Var.f14139g;
        File file = d7Var.N0;
        if (file != null) {
            this.f12276f = file.getAbsolutePath();
        }
        boolean z10 = d7Var.f14168w;
        this.I = z10;
        this.J = z10;
        long j3 = d7Var.J0;
        if (j3 != 0) {
            this.K = j3;
        } else if (d7Var.f14139g) {
            this.K = d7Var.f14134e;
        } else {
            TLRPC.InputPeer inputPeer = d7Var.f14167v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.K = org.telegram.messenger.m5.n(inputPeer);
            } else {
                this.K = m10.i(s6Var.f12319a).f24953n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.J;
        hi.d7 d7Var = this.f12274c;
        s6 s6Var = this.N;
        if (z10) {
            s6Var.f12338w.b(d7Var);
            ((ArrayList) s6Var.f12320b.f(this.K)).remove(this);
        }
        this.f12280w = true;
        if (d7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(s6Var.f12319a).b(this.f12275e, false);
        if (this.f12281x >= 0) {
            ConnectionsManager.getInstance(s6Var.f12319a).cancelRequest(this.f12281x, true);
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
        s6 s6Var = this.N;
        int i7 = s6Var.f12319a;
        ns.f(i7).n(this, ns.U1);
        ns.f(i7).n(this, ns.V1);
        ns.f(i7).n(this, ns.W1);
        ns.f(i7).n(this, ns.f25477c2);
        ns.f(i7).n(this, ns.f25465a2);
        ns.f(i7).n(this, ns.f25471b2);
        boolean z10 = this.J;
        long j3 = this.K;
        if (!z10 && (arrayList = (ArrayList) s6Var.f12320b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) s6Var.f12321c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                s6Var.d = 0;
            } else {
                s6Var.d++;
            }
        }
        boolean z11 = this.f12273b;
        hi.d7 d7Var = this.f12274c;
        if (z11 && (hashMap = (HashMap) s6Var.f12322e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(d7Var.f14137f));
        }
        if (this.M != null) {
            k6 A = s6Var.A(4, -1, this.K, false);
            if (d7Var != null && d7Var.f14139g) {
                if (A instanceof c6) {
                    ((c6) A).G(d7Var.L0, this.M);
                }
                String str = d7Var.K0;
                TLRPC.InputMedia inputMedia = d7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = gi.q.G;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    c6 c6Var = (c6) longSparseArray4.get(j3);
                    int i10 = c6Var.f11940c;
                    ArrayList arrayList3 = c6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(c6Var.E, str)) {
                            c6Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            h6 h6Var = c6Var.f11952q;
                            org.telegram.messenger.g0.r(h6Var);
                            org.telegram.messenger.g0.h3(h6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = gi.q.F;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i7)) != null && (qVar2 = (gi.q) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = qVar2.f13356f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        c6 c6Var2 = (c6) arrayList4.get(i11);
                        if (c6Var2.f11940c == i7 && TextUtils.equals(c6Var2.E, str)) {
                            c6Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof c6) {
                    ((c6) A).I(this.M);
                }
                String str2 = d7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = gi.q.G;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    c6 c6Var3 = (c6) longSparseArray2.get(j3);
                    int i12 = c6Var3.f11940c;
                    ArrayList arrayList5 = c6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(c6Var3.E, str2)) {
                            c6Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            h6 h6Var2 = c6Var3.f11952q;
                            org.telegram.messenger.g0.r(h6Var2);
                            org.telegram.messenger.g0.h3(h6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = gi.q.F;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i7)) != null && (qVar = (gi.q) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = qVar.f13356f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        c6 c6Var4 = (c6) arrayList6.get(i13);
                        if (c6Var4.f11940c == i7 && TextUtils.equals(c6Var4.E, str2)) {
                            c6Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        ns.f(i7).k(ns.f25591v5, new Object[0]);
        if (d7Var != null && !d7Var.h && !this.d) {
            d7Var.i(false);
            this.d = true;
        }
        ns.e().k(ns.B5, this.f12275e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r6.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        hi.d7 d7Var = this.f12274c;
        if (d7Var.f14127b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f12274c.f14130c0;
            int i7 = np.D8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f28063id = document.f28057id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((d7Var.f14139g || (d7Var.f14151n && d7Var.f14163t != null)) && !d7Var.f14144j && d7Var.f14154o0 == null) {
            c(null);
            return;
        }
        hi.o8 o8Var = this.f12274c.E0;
        if (o8Var != null && o8Var.f14823a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        ns.f(this.N.f12319a).b(this, ns.U1);
        ns.f(this.N.f12319a).b(this, ns.V1);
        ns.f(this.N.f12319a).b(this, ns.W1);
        ns.f(this.N.f12319a).b(this, ns.f25477c2);
        ns.f(this.N.f12319a).b(this, ns.f25465a2);
        ns.f(this.N.f12319a).b(this, ns.f25471b2);
        boolean E = this.f12274c.E();
        this.f12279s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28072id = 1;
            String absolutePath = hi.d7.x(this.N.f12319a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.f12275e = absolutePath;
            this.F = new gj(this.N.f12319a, tL_message, null, false, false);
            this.f12274c.s(new q6(this, 1));
        } else {
            File w10 = hi.d7.w(this.N.f12319a, "jpg");
            this.f12275e = w10.getAbsolutePath();
            Utilities.f22419i.c(new f6(4, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f26600b, StoryUploadingService.class);
        intent.putExtra("path", this.f12275e);
        intent.putExtra("currentAccount", this.N.f12319a);
        try {
            org.telegram.messenger.t0.f26600b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        s6 s6Var = this.N;
        int i11 = s6Var.f12319a;
        if (i7 == ns.f25465a2) {
            if (objArr[0] == this.F) {
                this.f12275e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = ns.f25471b2;
        int i13 = ns.A5;
        if (i7 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f12277n = floatValue;
                this.h = (this.f12278r * 0.7f) + (floatValue * 0.3f);
                ns.f(i11).k(i13, this.f12275e, Float.valueOf(this.h));
                if (this.f12282y < 0 && this.f12277n * ((float) this.E) >= 1000.0f) {
                    this.f12282y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f12277n));
                if (longValue2 > 0 && this.f12282y < 0) {
                    this.f12282y = longValue2;
                }
            }
        } else if (i7 == ns.f25477c2) {
            if (objArr[0] == this.F) {
                if (!this.f12273b) {
                    hi.d7 d7Var = this.f12274c;
                    d7Var.f14168w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    d7Var.f14170x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    s6Var.f12338w.d(d7Var);
                }
                b();
            }
        } else if (i7 == ns.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.f12275e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i7 == ns.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.f12275e;
            if (str5 != null && str4.equals(str5)) {
                ns.e().k(ns.P4, 1, hd.M0(2131744452, null));
                b();
            }
        } else if (i7 == ns.W1 && ((String) objArr[0]).equals(this.f12275e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f12278r = min;
            this.h = (min * 0.7f) + (this.f12277n * 0.3f);
            ns.f(i11).k(i13, this.f12275e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i7;
        hi.d7 d7Var = this.f12274c;
        d7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.f12319a);
        String str = this.f12275e;
        boolean z10 = !d7Var.K;
        long j3 = 0;
        if (this.f12279s) {
            g20 g20Var = this.G;
            if (g20Var != null) {
                j3 = g20Var.f23648q;
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

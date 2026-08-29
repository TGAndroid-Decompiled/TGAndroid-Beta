package b4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import eg.n;
import f5.d0;
import f5.m;
import h7.h5;
import j3.g1;
import j3.h0;
import j3.h1;
import j3.k0;
import j3.t0;
import j3.u0;
import java.util.ArrayList;
public final class f extends j3.e implements Handler.Callback {
    public final d f1923a;
    public final h0 f1924b;
    public final Handler f1925c;
    public final e d;
    public h5 f1926e;
    public boolean f1927f;
    public boolean h;
    public long f1928n;
    public c f1929r;
    public long f1930s;

    public f(h0 h0Var, Looper looper) {
        super(5);
        Handler handler;
        this.f1924b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.f6579a;
            handler = new Handler(looper, this);
        }
        this.f1925c = handler;
        this.f1923a = d.f1921a;
        this.d = new e();
        this.f1930s = -9223372036854775807L;
    }

    public final void a(c cVar, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.f1919a;
            if (i10 < bVarArr.length) {
                t0 wrappedMetadataFormat = bVarArr[i10].getWrappedMetadataFormat();
                if (wrappedMetadataFormat != null) {
                    d dVar = this.f1923a;
                    if (dVar.b(wrappedMetadataFormat)) {
                        h5 a2 = dVar.a(wrappedMetadataFormat);
                        byte[] wrappedMetadataBytes = bVarArr[i10].getWrappedMetadataBytes();
                        wrappedMetadataBytes.getClass();
                        e eVar = this.d;
                        eVar.clear();
                        eVar.b(wrappedMetadataBytes.length);
                        eVar.f16828b.put(wrappedMetadataBytes);
                        eVar.c();
                        c a10 = a2.a(eVar);
                        if (a10 != null) {
                            a(a10, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(bVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final long b(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        if (this.f1930s != -9223372036854775807L) {
            z11 = true;
        }
        f5.a.i(z11);
        return j10 - this.f1930s;
    }

    public final void c(c cVar) {
        h0 h0Var = this.f1924b;
        k0 k0Var = h0Var.f10477a;
        h1 h1Var = k0Var.f10580h0;
        m mVar = k0Var.f10587l;
        g1 a2 = h1Var.a();
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.f1919a;
            if (i10 >= bVarArr.length) {
                break;
            }
            bVarArr[i10].populateMediaMetadata(a2);
            i10++;
        }
        k0Var.f10580h0 = new h1(a2);
        h1 R = k0Var.R();
        if (!R.equals(k0Var.O)) {
            k0Var.O = R;
            mVar.c(14, new n(h0Var, 13));
        }
        mVar.c(28, new n(cVar, 14));
        mVar.b();
    }

    @Override
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            c((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean isEnded() {
        return this.h;
    }

    @Override
    public final boolean isReady() {
        return true;
    }

    @Override
    public final void onDisabled() {
        this.f1929r = null;
        this.f1926e = null;
        this.f1930s = -9223372036854775807L;
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        this.f1929r = null;
        this.f1927f = false;
        this.h = false;
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        this.f1926e = this.f1923a.a(t0VarArr[0]);
        c cVar = this.f1929r;
        if (cVar != null) {
            long j12 = cVar.f1920b;
            long j13 = (this.f1930s + j12) - j11;
            if (j12 != j13) {
                cVar = new c(j13, cVar.f1919a);
            }
            this.f1929r = cVar;
        }
        this.f1930s = j11;
    }

    @Override
    public final void render(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f1927f && this.f1929r == null) {
                e eVar = this.d;
                eVar.clear();
                u0 formatHolder = getFormatHolder();
                int readSource = readSource(formatHolder, eVar, 0);
                if (readSource == -4) {
                    if (eVar.isEndOfStream()) {
                        this.f1927f = true;
                    } else {
                        eVar.f1922n = this.f1928n;
                        eVar.c();
                        h5 h5Var = this.f1926e;
                        int i10 = d0.f6579a;
                        c a2 = h5Var.a(eVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.f1919a.length);
                            a(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f1929r = new c(b(eVar.d), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (readSource == -5) {
                    t0 t0Var = formatHolder.f10815b;
                    t0Var.getClass();
                    this.f1928n = t0Var.F;
                }
            }
            c cVar = this.f1929r;
            if (cVar != null && cVar.f1920b <= b(j10)) {
                c cVar2 = this.f1929r;
                Handler handler = this.f1925c;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    c(cVar2);
                }
                this.f1929r = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f1927f && this.f1929r == null) {
                this.h = true;
            }
        }
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        int i10;
        if (this.f1923a.b(t0Var)) {
            if (t0Var.W == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return com.google.android.recaptcha.internal.a.b(i10, 0, 0);
        }
        return com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }
}

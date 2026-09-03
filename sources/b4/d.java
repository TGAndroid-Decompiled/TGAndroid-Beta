package b4;
public final class d implements r3.k {
    public final int f1347a;
    public final h5.w d;
    public final h5.v e;
    public r3.m f1350f;
    public long f1351g;
    public boolean f1353j;
    public boolean f1354k;
    public boolean f1355l;
    public final e f1348b = new e(null, true);
    public final h5.w f1349c = new h5.w(2048);
    public int f1352i = -1;
    public long h = -1;

    public d(int i10) {
        this.f1347a = i10;
        h5.w wVar = new h5.w(10);
        this.d = wVar;
        byte[] bArr = wVar.f6987a;
        this.e = new h5.v(bArr, bArr.length);
    }

    public final int a(r3.l lVar) {
        int i10 = 0;
        while (true) {
            h5.w wVar = this.d;
            lVar.b(0, 10, wVar.f6987a);
            wVar.F(0);
            if (wVar.w() != 4801587) {
                break;
            }
            wVar.G(3);
            int t6 = wVar.t();
            i10 += t6 + 10;
            lVar.i(t6);
        }
        lVar.m();
        lVar.i(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override
    public final void d(long j10, long j11) {
        this.f1354k = false;
        this.f1348b.b();
        this.f1351g = j11;
    }

    @Override
    public final void e(r3.m mVar) {
        this.f1350f = mVar;
        this.f1348b.c(mVar, new h0(0, 1));
        mVar.j1();
    }

    @Override
    public final int h(r3.l r20, org.telegram.ui.Components.jb r21) {
        throw new UnsupportedOperationException("Method not decompiled: b4.d.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(r3.l lVar) {
        int a2 = a(lVar);
        int i10 = a2;
        int i11 = 0;
        int i12 = 0;
        do {
            h5.w wVar = this.d;
            r3.h hVar = (r3.h) lVar;
            hVar.f(wVar.f6987a, 0, 2, false);
            wVar.F(0);
            if ((wVar.z() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.f(wVar.f6987a, 0, 4, false);
                h5.v vVar = this.e;
                vVar.p(14);
                int i13 = vVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f43247f = 0;
                    hVar.a(i10, false);
                } else {
                    hVar.a(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f43247f = 0;
                hVar.a(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override
    public final void release() {
    }
}

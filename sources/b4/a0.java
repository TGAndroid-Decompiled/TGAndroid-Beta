package b4;

import android.util.SparseArray;
public final class a0 implements r3.k {
    public boolean e;
    public boolean f1325f;
    public boolean f1326g;
    public long h;
    public x f1327i;
    public r3.m f1328j;
    public boolean f1329k;
    public final h5.c0 f1322a = new h5.c0(0);
    public final h5.w f1324c = new h5.w(4096);
    public final SparseArray f1323b = new SparseArray();
    public final y d = new y(0);

    @Override
    public final void d(long j10, long j11) {
        boolean z4;
        h5.c0 c0Var = this.f1322a;
        boolean z10 = true;
        if (c0Var.d() == -9223372036854775807L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            long c3 = c0Var.c();
            z4 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j11) ? false : false;
        }
        if (z4) {
            c0Var.f(j11);
        }
        x xVar = this.f1327i;
        if (xVar != null) {
            xVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f1323b;
            if (i10 < sparseArray.size()) {
                z zVar = (z) sparseArray.valueAt(i10);
                zVar.f1563f = false;
                zVar.f1560a.b();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void e(r3.m mVar) {
        this.f1328j = mVar;
    }

    @Override
    public final int h(r3.l r28, org.telegram.ui.Components.jb r29) {
        throw new UnsupportedOperationException("Method not decompiled: b4.a0.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(r3.l lVar) {
        byte[] bArr = new byte[14];
        r3.h hVar = (r3.h) lVar;
        hVar.f(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.a(bArr[13] & 7, false);
            hVar.f(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void release() {
    }
}

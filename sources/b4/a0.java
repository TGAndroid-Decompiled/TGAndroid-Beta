package b4;

import android.util.SparseArray;
public final class a0 implements r3.k {
    public boolean f1416e;
    public boolean f1417f;
    public boolean f1418g;
    public long h;
    public x f1419i;
    public r3.m f1420j;
    public boolean f1421k;
    public final h5.c0 f1413a = new h5.c0(0);
    public final h5.w f1415c = new h5.w(4096);
    public final SparseArray f1414b = new SparseArray();
    public final y d = new y(0);

    @Override
    public final void d(long j10, long j11) {
        boolean z4;
        h5.c0 c0Var = this.f1413a;
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
        x xVar = this.f1419i;
        if (xVar != null) {
            xVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f1414b;
            if (i10 < sparseArray.size()) {
                z zVar = (z) sparseArray.valueAt(i10);
                zVar.f1679f = false;
                zVar.f1675a.b();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void e(r3.m mVar) {
        this.f1420j = mVar;
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

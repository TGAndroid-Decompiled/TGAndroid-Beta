package defpackage;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class e61 implements Runnable {
    public final byte a;
    public final z61 b;

    public e61(z61 z61Var, byte b) {
        this.a = b;
        this.b = z61Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                z61 z61Var = this.b;
                z61Var.resumeDelayedFragmentAnimation();
                z61Var.L = false;
                z61Var.A0(true);
                z61Var.y0();
                return;
            case 1:
                z61 z61Var2 = this.b;
                z61Var2.getFileLoader().d.c();
                d71 d71Var = new d71(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                z61Var2.j0(xb4.j(4), 6, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(0), 0, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(100), 0, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(2), 1, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(101), 1, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(1), 4, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(6), 6, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(3), 2, longSparseArray, d71Var);
                z61Var2.j0(xb4.j(5), 2, longSparseArray, d71Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < longSparseArray.size(); i++) {
                    t61 t61Var = (t61) longSparseArray.valueAt(i);
                    arrayList.add(t61Var);
                    if (z61Var2.getMessagesController().b2(((t61) arrayList.get(i)).a) == null) {
                        long j = t61Var.a;
                        if (j > 0) {
                            arrayList2.add(Long.valueOf(j));
                        } else {
                            arrayList3.add(Long.valueOf(j));
                        }
                    }
                }
                Collections.sort(d71Var.d, new ta((byte) 14));
                Collections.sort(d71Var.e, new ta((byte) 14));
                Collections.sort(d71Var.f, new ta((byte) 14));
                Collections.sort(d71Var.g, new ta((byte) 14));
                Collections.sort(d71Var.h, new ta((byte) 14));
                z61Var2.getMessagesStorage().a.c(new g61(z61Var2, arrayList2, arrayList3, arrayList, d71Var, (byte) 0));
                return;
            default:
                z61 z61Var3 = this.b;
                z61Var3.f = z61.m0(xb4.j(4), 5);
                if (!z61.i0) {
                    z61Var3.n = z61.m0(xb4.j(4), 4);
                    if (!z61.i0) {
                        long m0 = z61.m0(xb4.j(0), 0);
                        z61Var3.y = m0;
                        z61Var3.y = z61.m0(xb4.j(100), 0) + m0;
                        if (!z61.i0) {
                            long m02 = z61.m0(xb4.j(2), 0);
                            z61Var3.E = m02;
                            z61Var3.E = z61.m0(xb4.j(101), 0) + m02;
                            if (!z61.i0) {
                                z61Var3.F = z61.m0(hl.O0(), 1);
                                boolean z = f11.a;
                                if (!z61.i0) {
                                    long m03 = z61.m0(xb4.j(3), 1);
                                    z61Var3.r = m03;
                                    z61Var3.r = z61.m0(xb4.j(5), 1) + m03;
                                    if (!z61.i0) {
                                        long m04 = z61.m0(xb4.j(3), 2);
                                        z61Var3.x = m04;
                                        z61Var3.x = z61.m0(xb4.j(5), 2) + m04;
                                        if (!z61.i0) {
                                            z61Var3.G = z61.m0(new File(xb4.j(4), "acache"), 0);
                                            if (!z61.i0) {
                                                z61Var3.h = z61.m0(xb4.j(4), 3);
                                                if (!z61.i0) {
                                                    z61Var3.G += z61Var3.h;
                                                    z61Var3.s = z61.m0(xb4.j(1), 0);
                                                    z61Var3.w = z61.m0(xb4.j(6), 0);
                                                    if (!z61.i0) {
                                                        long j2 = z61Var3.f + z61Var3.n + z61Var3.E + z61Var3.F + z61Var3.s + z61Var3.y + z61Var3.r + z61Var3.x + z61Var3.w + z61Var3.G;
                                                        z61.k0 = Long.valueOf(j2);
                                                        z61Var3.H = j2;
                                                        z61.j0 = System.currentTimeMillis();
                                                        ArrayList c1 = hl.c1();
                                                        File file = (File) c1.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(xea.e0)) {
                                                            int size = c1.size();
                                                            for (int i2 = 0; i2 < size; i2++) {
                                                                File file2 = (File) c1.get(i2);
                                                                if (file2.getAbsolutePath().startsWith(xea.e0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            z61Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            z61Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                        }
                                                        hl.c3(new e61(z61Var3, (byte) 0));
                                                        ic4 ic4Var = z61Var3.getFileLoader().d;
                                                        ic4Var.d();
                                                        ic4Var.a.c(new e61(z61Var3, (byte) 1));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

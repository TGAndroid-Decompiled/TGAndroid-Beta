package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.CancellationSignal;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class s54 implements Runnable {
    public final byte a;
    public final Object b;

    public s54(t54 t54Var, SurfaceTexture surfaceTexture) {
        this.a = (byte) 0;
        this.b = t54Var;
    }

    private final void a() {
        ql4 ql4Var = (ql4) this.b;
        synchronized (ql4Var.c) {
            if (ql4Var.h == null) {
                return;
            }
            try {
                bm4 d = ql4Var.d();
                int i = d.e;
                if (i == 2) {
                    synchronized (ql4Var.c) {
                    }
                }
                if (i == 0) {
                    int i2 = mxb.a;
                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    Context context = ql4Var.a;
                    bm4[] bm4VarArr = {d};
                    vwe vweVar = s3c.a;
                    wve.a("TypefaceCompat.createFromFontInfo");
                    try {
                        Typeface b = s3c.a.b(context, bm4VarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer d2 = ywe.d(ql4Var.a, d.a);
                        if (d2 != null && b != null) {
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                wtc wtcVar = new wtc(b, ape.a(d2));
                                Trace.endSection();
                                synchronized (ql4Var.c) {
                                    afe afeVar = ql4Var.h;
                                    if (afeVar != null) {
                                        afeVar.b(wtcVar);
                                    }
                                }
                                ql4Var.a();
                                return;
                            } catch (Throwable th) {
                                int i3 = mxb.a;
                                throw th;
                            }
                        }
                        throw new RuntimeException("Unable to open file.");
                    } finally {
                        Trace.endSection();
                    }
                }
                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
            } catch (Throwable th2) {
                synchronized (ql4Var.c) {
                    afe afeVar2 = ql4Var.h;
                    if (afeVar2 != null) {
                        afeVar2.a(th2);
                    }
                    ql4Var.a();
                }
            }
        }
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                y54 y54Var = ((t54) this.b).a;
                y54Var.q1(null);
                y54Var.f1(0, 0);
                return;
            case 1:
                yc8 yc8Var = (yc8) this.b;
                try {
                    synchronized (yc8Var) {
                    }
                    yc8Var.a.d(yc8Var.c, yc8Var.d);
                    yc8Var.a(true);
                    return;
                } catch (j54 e) {
                    lad.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    sdb.b(e);
                    return;
                }
            case 2:
                new zma(((wb5) this.b).getContext()).show();
                return;
            case 3:
                v74 v74Var = (v74) this.b;
                LongSparseArray longSparseArray = v74Var.c;
                while (longSparseArray.size() > 0) {
                    long keyAt = longSparseArray.keyAt(0);
                    HashMap hashMap = (HashMap) longSparseArray.valueAt(0);
                    longSparseArray.removeAt(0);
                    ArrayList arrayList = new ArrayList(hashMap.keySet());
                    v74Var.d.addAll(arrayList);
                    s0c s0cVar = new s0c(v74Var, keyAt, arrayList, hashMap, (byte) 4);
                    if (arrayList.isEmpty()) {
                        s0cVar.a(new ArrayList());
                    } else {
                        ad7 Y = ad7.Y(v74Var.a);
                        Y.a.c(new mg3(Y, arrayList, s0cVar, (byte) 20));
                    }
                }
                longSparseArray.clear();
                return;
            case 4:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.b);
                return;
            case 5:
                la4 la4Var = (la4) this.b;
                la4Var.c();
                try {
                    la4Var.c.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
                    la4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 6:
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.b;
                ArrayList arrayList2 = bkb.F;
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.TL_theme tL_theme2 = ((akb) arrayList2.get(i3)).G;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && (document = tL_theme.document) != null) {
                            document2.file_reference = document.file_reference;
                            bkb.w1(true, false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 7:
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) ((ub4) this.b).b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 8:
                ((mc4) this.b).i0(true);
                return;
            case 9:
                ((kc4) this.b).a.getBackground().setState(new int[0]);
                return;
            case 10:
                he4 he4Var = (he4) ((ge4) this.b).g;
                ArrayList arrayList3 = he4Var.h;
                if (!y6c.h(y6c.t0).p()) {
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        if (((de4) arrayList3.get(i4)).e && i4 != 0) {
                            s20 s20Var = he4Var.J;
                            he4 he4Var2 = (he4) s20Var.e;
                            ArrayList arrayList4 = he4Var2.h;
                            SparseIntArray sparseIntArray = he4Var2.l0;
                            int size2 = arrayList4.size();
                            if (i4 >= 0 && i4 < size2) {
                                ArrayList R0 = na7.q1(y6c.t0).R0();
                                int i5 = sparseIntArray.get(i4);
                                int i6 = ((de4) arrayList4.get(i4)).a;
                                for (int i7 = i4 - 1; i7 >= 0; i7--) {
                                    sparseIntArray.put(i7 + 1, sparseIntArray.get(i7));
                                }
                                t97 t97Var = (t97) R0.remove(i4);
                                t97Var.f = 0;
                                R0.add(0, t97Var);
                                sparseIntArray.put(0, i5);
                                arrayList4.add(0, (de4) arrayList4.remove(i4));
                                ((de4) arrayList4.get(0)).a = i6;
                                for (int i8 = 0; i8 <= i4; i8++) {
                                    ((de4) arrayList4.get(i8)).a = i8;
                                    ((t97) R0.get(i8)).f = i8;
                                }
                                for (int i9 = 0; i9 <= i4; i9++) {
                                    if (he4Var2.L == i9) {
                                        if (i9 == i4) {
                                            i2 = 0;
                                        } else {
                                            i2 = i9 + 1;
                                        }
                                        he4Var2.M = i2;
                                        he4Var2.L = i2;
                                    }
                                    if (he4Var2.r0 == i9) {
                                        if (i9 == i4) {
                                            i = 0;
                                        } else {
                                            i = i9 + 1;
                                        }
                                        he4Var2.s0 = i;
                                        he4Var2.r0 = i;
                                    }
                                }
                                s20Var.j(i4, 0);
                                ce4 ce4Var = he4Var2.K;
                                int i10 = ((de4) arrayList4.get(i4)).a;
                                ti3 ti3Var = (ti3) ce4Var;
                                int i11 = 0;
                                while (true) {
                                    bj3[] bj3VarArr = ti3Var.b.f0;
                                    if (i11 < bj3VarArr.length) {
                                        bj3 bj3Var = bj3VarArr[i11];
                                        int i12 = bj3Var.h;
                                        if (i12 == i10) {
                                            bj3Var.h = i6;
                                        } else if (i12 == i6) {
                                            bj3Var.h = i10;
                                        }
                                        i11++;
                                    } else {
                                        he4Var2.m();
                                        he4Var2.E = true;
                                        he4Var2.G.setItemAnimator(he4Var2.t0);
                                    }
                                }
                            }
                            he4Var.G.w0(0);
                            qi3 qi3Var = (qi3) he4Var;
                            cj3 cj3Var = qi3Var.H0;
                            if (!cj3Var.getMessagesController().E3()) {
                                try {
                                    qi3Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                m21 J = u21.b0(cj3Var).J(2131624018, gl.T2(k96.a0(null, null, 2131748752, k96.M0(2131750795, null))), k96.M0(2131746842, null), 5000, false, new li3(qi3Var, (byte) 1));
                                J.k(true);
                                cj3Var.q3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                af4 af4Var = (af4) this.b;
                gl.r(af4Var.o0);
                af4Var.a.a(false, true);
                return;
            case 12:
                af4 af4Var2 = ((oe4) this.b).a;
                af4Var2.h(af4Var2.F, af4Var2.G, af4Var2.I, af4Var2.H, af4Var2.E, af4Var2.K, af4Var2.x, false);
                return;
            case 13:
                ((FiltersSetupActivity) ((fu) this.b).g3).getMessagesController().j3();
                return;
            case 14:
                ff4 ff4Var = (ff4) this.b;
                ff4Var.s.a();
                ff4Var.n.invalidate();
                ff4Var.I.f0(true);
                return;
            case 15:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((ge4) this.b).g;
                if (!y6c.h(y6c.t0).p()) {
                    ArrayList R02 = filtersSetupActivity.getMessagesController().R0();
                    int i13 = 0;
                    while (true) {
                        if (i13 < R02.size()) {
                            if (((t97) R02.get(i13)).d() && i13 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList5 = filtersSetupActivity2.getMessagesController().G0;
                                if (i13 >= 0 && i13 < arrayList5.size()) {
                                    arrayList5.add(0, (t97) arrayList5.remove(i13));
                                    for (int i14 = 0; i14 <= i13; i14++) {
                                        ((t97) arrayList5.get(i14)).f = i14;
                                    }
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.f0(true);
                                }
                                filtersSetupActivity.a.w0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                u21.b0(filtersSetupActivity).J(2131624018, gl.T2(k96.a0("LimitReachedReorderFolder", null, 2131748752, k96.M0(2131750795, null))), k96.M0(2131746842, null), 5000, false, new df4(filtersSetupActivity, (byte) 2)).j();
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                filtersSetupActivity.e0(null);
                return;
            case 16:
                ((CancellationSignal) this.b).cancel();
                return;
            case 17:
                qh4 qh4Var = (qh4) this.b;
                if (!qh4Var.c) {
                    qh4Var.setLayerType(0, null);
                    return;
                }
                return;
            case 18:
                ((lj4) this.b).invalidate();
                return;
            case 19:
                sj4 sj4Var = (sj4) ((u23) this.b).b;
                sj4Var.h.invalidate();
                sj4Var.i.requestLayout();
                return;
            case 20:
                ek4 ek4Var = (ek4) ((ld) this.b).b;
                ek4Var.k();
                ek4Var.j();
                return;
            case 21:
                ek4 ek4Var2 = ((ak4) this.b).b;
                ek4Var2.c.dismiss();
                ek4Var2.f.removeAllViews();
                return;
            case 22:
                ((ak4) this.b).b.c.dismiss();
                return;
            case 23:
                a();
                return;
            case 24:
                Iterator it = ((go4) this.b).n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                throw ls6.l(it);
            case 25:
                ((or4) this.b).b(null);
                return;
            case 26:
                ((rr4) this.b).E();
                return;
            case 27:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 28:
                pt4 pt4Var = ((ot4) this.b).r;
                xh8 xh8Var = new xh8(pt4Var.r1, pt4Var.a, null, null, null, pt4Var.J0);
                xh8Var.E2 = true;
                xh8Var.X1 = true;
                pt4Var.r1.showDialog(xh8Var);
                return;
            default:
                vt4 vt4Var = (vt4) this.b;
                Drawable drawable = vt4Var.Q;
                if (drawable != null && !vt4Var.S) {
                    drawable.setAlpha(255);
                }
                vt4Var.a.setAlpha(1.0f);
                if (vt4Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) vt4Var.getParent()).removeView(vt4Var);
                }
                Runnable runnable = vt4Var.R;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public s54(i64 i64Var, yc8 yc8Var) {
        this.a = (byte) 1;
        this.b = yc8Var;
    }

    public s54(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}

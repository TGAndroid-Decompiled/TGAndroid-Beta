package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class r61 extends d implements gk7 {
    public static volatile boolean i0 = false;
    public static long j0;
    public static Long k0;
    public static Long l0;
    public static Long m0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public d61 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public fm0 T;
    public fm0 U;
    public int[] V;
    public float[] W;
    public o61 X;
    public f61 Y;
    public j61 Z;
    public p61 a;
    public je3 a0;
    public fu b;
    public long b0;
    public hd c;
    public dha c0;
    public final boolean[] d;
    public a8 d0;
    public long e;
    public v61 e0;
    public long f;
    public final ArrayList f0;
    public final ArrayList g0;
    public long h;
    public boolean h0;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;
    public long y;

    public r61() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f = -1L;
        this.h = -1L;
        this.n = -1L;
        this.r = -1L;
        this.s = -1L;
        this.w = -1L;
        this.x = -1L;
        this.y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = true;
        this.M = true;
        this.S = -1;
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
    }

    public static pha Y(r61 r61Var) {
        return r61Var.simpleActionBar;
    }

    public static pha Z(r61 r61Var) {
        return r61Var.simpleActionBar;
    }

    public static pha a0(r61 r61Var) {
        return r61Var.simpleActionBar;
    }

    public static pha b0(r61 r61Var) {
        return r61Var.simpleActionBar;
    }

    public static void c0(p8c p8cVar) {
        Long l = k0;
        if (l != null) {
            p8cVar.a(l);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new mn0(p8cVar, (byte) 3));
    }

    public static void d0(java.lang.String r12, int r13, int[] r14, defpackage.a61 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r61.d0(java.lang.String, int, int[], a61):void");
    }

    public static int i0(int r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r61.i0(int, java.lang.String):int");
    }

    public static String k0(float f) {
        if (f < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void l0(w72 w72Var) {
        Long l;
        Long l2 = l0;
        if (l2 != null && (l = m0) != null) {
            w72Var.a(l2, l);
        } else {
            Utilities.f.c(new nv0(w72Var, (byte) 10));
        }
    }

    public static long m0(File file, int i) {
        if (file != null && !i0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i, false);
            }
            if (file.isFile()) {
                return file.length();
            }
            return 0L;
        }
        return 0L;
    }

    public static boolean s0(int i, String str) {
        if (str != null && ba4.j(i) != null) {
            return str.contains(ba4.j(i).getAbsolutePath());
        }
        return false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.M6));
        hashSet.add(Integer.valueOf(bkb.L6));
        hashSet.add(Integer.valueOf(bkb.Lj));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setTitle(k96.M0(2131744579, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 13));
        this.simpleActionBar.q().b(1, 0, k96.M0(2131752637, null), null, 0, null).getTextView().setTextColor(bkb.w0(null, bkb.Ei, false));
        a8 e = this.simpleActionBar.t().a(2, 2131231247).e(3, 2131232113, k96.M0(2131752064, null));
        this.d0 = e;
        int i = bkb.o7;
        e.setIconColor(bkb.w0(null, i, false));
        this.d0.setTextColor(bkb.w0(null, bkb.p7, false));
        this.d0.h(0.12f, i);
        boolean z = w01.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) k96.M0(2131752064, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new p61(this, context, (byte) 0);
        dha dhaVar = new dha(context);
        this.c0 = dhaVar;
        dhaVar.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        this.c0.setGeometry(new lj9(this, (byte) 12));
        dha dhaVar2 = this.c0;
        this.fragmentView = dhaVar2;
        zkb.h(bkb.Z6, null, dhaVar2);
        fu fuVar = new fu((byte) 3, context, this);
        this.b = fuVar;
        fuVar.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        fu fuVar2 = this.b;
        dha dhaVar3 = this.c0;
        dhaVar3.getClass();
        fuVar2.setLayoutManager(new xe2((Object) dhaVar3, (byte) 5));
        this.c0.v(this.b, new w51(this, (byte) 3));
        this.b.setAdapter(this.a);
        c61 c61Var = new c61(this);
        c61Var.n(350L);
        s33 s33Var = s33.h;
        c61Var.o(s33Var);
        c61Var.C = false;
        c61Var.m = false;
        this.b.setItemAnimator(c61Var);
        this.b.setOnItemClickListener(new w51(this, (byte) 4));
        this.b.j(new y(this, (byte) 11));
        View view = new View(context);
        this.P = view;
        dhaVar2.addView(view, nme.e(-1, 0, 48));
        this.T = new fm0(0, new w51(this, (byte) 5), s33Var, 380L, false);
        this.U = new fm0(1, new w51(this, (byte) 0), s33Var, 380L, false);
        y0();
        getBaseSimpleGlass().f(dhaVar2, this.b, this.simpleActionBar, this.resourceProvider);
        d61 d61Var = new d61(this, context, this, this.glassEngine, this.c0);
        this.N = d61Var;
        d61Var.E = true;
        FrameLayout frameLayout = d61Var.c;
        gl.B2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        il0 c = getBaseSimpleGlass().c.c(this.O, null, false);
        c.p(nod.l(this.resourceProvider));
        c.q(gl.L(9.66f));
        c.r(gl.L(18.0f));
        frameLayout.setBackground(c);
        dha dhaVar4 = this.c0;
        d61 d61Var2 = this.N;
        wec viewPager = d61Var2.getViewPager();
        d61 d61Var3 = this.N;
        Objects.requireNonNull(d61Var3);
        dhaVar4.y(d61Var2, viewPager, new sg0(d61Var3, (byte) 20));
        this.c0.z(this.O);
        this.O.setLayoutParams(nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new qx4(this));
        this.N.setCacheModel(this.e0);
        sg0 sg0Var = new sg0(dhaVar2, (byte) 19);
        getBaseSimpleGlass().o = new cg0(this, sg0Var, (byte) 3);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        t0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.N4) {
            try {
                hd hdVar = this.c;
                if (hdVar != null) {
                    hdVar.dismiss();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = ad7.Y(this.currentAccount).Q();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) k96.M0(2131752064, null));
                    this.d0.setText(spannableStringBuilder);
                }
                z0(true);
            }
        }
    }

    public final void e0(l61 l61Var, f15[] f15VarArr, v61 v61Var) {
        m61 m61Var;
        HashSet hashSet;
        long j;
        char c;
        long j2;
        f15 f15Var;
        hd hdVar = new hd(3, null, getParentActivity());
        hdVar.j0 = false;
        hdVar.q(500L);
        HashSet hashSet2 = new HashSet();
        long j3 = this.H;
        int i = 0;
        while (i < 8) {
            if ((f15VarArr != null && ((f15Var = f15VarArr[i]) == null || !f15Var.b)) || (m61Var = (m61) l61Var.d.get(i)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(m61Var.b);
                hashSet = hashSet2;
                long j4 = l61Var.c;
                long j5 = m61Var.a;
                l61Var.c = j4 - j5;
                this.H -= j5;
                this.J += j5;
                l61Var.d.delete(i);
                if (i == 0) {
                    this.y -= m61Var.a;
                } else if (i == 1) {
                    this.E -= m61Var.a;
                } else if (i == 2) {
                    this.r -= m61Var.a;
                } else if (i == 3) {
                    this.x -= m61Var.a;
                } else if (i == 4) {
                    this.s -= m61Var.a;
                } else if (i == 5) {
                    this.G -= m61Var.a;
                } else {
                    char c2 = 7;
                    if (i == 7) {
                        int i2 = 0;
                        while (i2 < m61Var.b.size()) {
                            u61 u61Var = (u61) m61Var.b.get(i2);
                            String absolutePath = ((u61) m61Var.b.get(i2)).a.getAbsolutePath();
                            if (s0(6, absolutePath)) {
                                c = c2;
                            } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                                c = 0;
                            } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                                c = 1;
                            } else {
                                c = 6;
                            }
                            int i3 = i2;
                            if (c == c2) {
                                j2 = j3;
                                this.w -= u61Var.c;
                            } else {
                                j2 = j3;
                                if (c == 0) {
                                    this.y -= u61Var.c;
                                } else if (c == 1) {
                                    this.E -= u61Var.c;
                                } else {
                                    this.f -= u61Var.c;
                                }
                            }
                            i2 = i3 + 1;
                            j3 = j2;
                            c2 = 7;
                        }
                    } else {
                        j = j3;
                        this.f -= m61Var.a;
                        i++;
                        hashSet2 = hashSet;
                        j3 = j;
                    }
                }
            }
            j = j3;
            i++;
            hashSet2 = hashSet;
            j3 = j;
        }
        HashSet hashSet3 = hashSet2;
        long j6 = j3;
        if (l61Var.d.size() == 0) {
            this.e0.b.remove(l61Var);
        }
        z0(true);
        if (v61Var != null) {
            Iterator it = v61Var.j.iterator();
            while (it.hasNext()) {
                u61 u61Var2 = (u61) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(u61Var2)) {
                    long j7 = this.H;
                    long j8 = u61Var2.c;
                    this.H = j7 - j8;
                    this.J += j8;
                    hashSet4.add(u61Var2);
                    l61Var.b(u61Var2);
                    byte b = u61Var2.d;
                    if (b == 0) {
                        this.y -= u61Var2.c;
                    } else if (b == 1) {
                        this.E -= u61Var2.c;
                    } else if (b == 2) {
                        this.r -= u61Var2.c;
                    } else if (b == 3) {
                        this.x -= u61Var2.c;
                    } else if (b == 4) {
                        this.s -= u61Var2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            u61 u61Var3 = (u61) it2.next();
            v61 v61Var2 = this.e0;
            if (v61Var2.j.remove(u61Var3)) {
                v61Var2.k -= u61Var3.c;
            }
            ArrayList e = v61Var2.e(u61Var3.d);
            if (e != null) {
                e.remove(u61Var3);
            }
        }
        m21 Q = u21.b0(this).Q(2131624052, 36, k96.a0(null, null, 2131752633, gl.i0(j6 - this.H, false, false)));
        Q.r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        la4 la4Var = getFileLoader().d;
        la4Var.getClass();
        la4Var.h(new eu3(la4Var, arrayList, (byte) 25));
        getFileLoader().c();
        getFileLoader().getClass();
        ba4.K.c(new fv0(this, arrayList, hdVar, (byte) 8));
    }

    public final void f0(defpackage.p r25, defpackage.h61 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r61.f0(p, h61):void");
    }

    public final void g0(boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131748579, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) k96.M0(2131748581, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        ls6.s("LocalDatabaseClearText2", null, 2131748580, new Object[]{gl.i0(this.e, false, false)}, spannableStringBuilder);
        hdVar.U = spannableStringBuilder;
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131752637, null), new l41((byte) 1, this, z));
        showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        t00 t00Var = new t00(this, (byte) 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, fja.class, h1b.class, ld5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.b, 0, new Class[]{h1b.class}, new String[]{"paintFill"}, (Drawable[]) null, (alb) null, bkb.Jj));
        int i = bkb.x6;
        arrayList.add(new blb(this.b, 0, new Class[]{h1b.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, bkb.g5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Xj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Zj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ak));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.bk));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ck));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.dk));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ek));
        return arrayList;
    }

    public final void h0() {
        if (this.e0.j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131752086, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131752083, null);
            alertDialog$Builder.j(k96.M0(2131752089, null), new w51(this, (byte) 2));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.h0) {
            return super.isLightStatusBar();
        }
        if (gl.B(bkb.w0(null, bkb.Z6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        dha dhaVar;
        if (this.N == null || motionEvent == null || (dhaVar = this.c0) == null || !dhaVar.c() || this.c0.o(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0) {
            return true;
        }
        return false;
    }

    public final void j0(File file, int i, LongSparseArray longSparseArray, v61 v61Var) {
        File[] listFiles;
        int i2;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!i0) {
                    if (file2.isDirectory()) {
                        j0(file2, i, longSparseArray, v61Var);
                    } else if (!file2.getName().equals(".nomedia")) {
                        ka4 e = getFileLoader().d.e(file2, null);
                        String lowerCase = file2.getName().toLowerCase();
                        if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                            i2 = i;
                        } else {
                            i2 = 3;
                        }
                        u61 u61Var = new u61(file2);
                        long length = file2.length();
                        u61Var.c = length;
                        byte b = i2;
                        if (e != null) {
                            u61Var.b = e.a;
                            u61Var.g = e.b;
                            int i3 = e.c;
                            u61Var.h = i3;
                            b = i2;
                            if (i3 == 23) {
                                b = i2;
                                if (length > 0) {
                                    b = 7;
                                }
                            }
                        }
                        u61Var.d = b;
                        long j = u61Var.b;
                        if (j != 0) {
                            l61 l61Var = (l61) longSparseArray.get(j, null);
                            l61 l61Var2 = l61Var;
                            if (l61Var == null) {
                                l61 l61Var3 = new l61(u61Var.b);
                                longSparseArray.put(u61Var.b, l61Var3);
                                l61Var2 = l61Var3;
                            }
                            l61Var2.a(u61Var, b);
                        }
                        if (b != 6) {
                            v61Var.e(b).add(u61Var);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean n0() {
        int i;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i2 >= arrayList.size()) {
                break;
            }
            n61 n61Var = (n61) arrayList.get(i2);
            if (n61Var.a == 11 && !n61Var.i && (i = n61Var.f) >= 0) {
                zArr2[i] = true;
            }
            i2++;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (!zArr2[i3] && !zArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(hd hdVar) {
        ba4.G(this.currentAccount).i();
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        v61 v61Var = this.e0;
        if (v61Var != null && !v61Var.j.isEmpty()) {
            if (z) {
                this.e0.d();
                d61 d61Var = this.N;
                if (d61Var != null) {
                    d61Var.f(false);
                    this.N.e();
                }
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0 = false;
        getNotificationCenter().b(this, kk7.N4);
        this.e = ad7.Y(this.currentAccount).Q();
        Utilities.e.c(new x51(this, (byte) 2));
        this.b0 = System.currentTimeMillis();
        z0(false);
        x0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.N4);
        try {
            hd hdVar = this.c;
            if (hdVar != null) {
                hdVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        t0(i2, i4);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ya0 ya0Var;
        if (i == 4) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (ya0Var = FilesMigrationService.e) != null) {
                ya0Var.D0();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.a.f();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a8 a8Var = this.d0;
            if (a8Var != null) {
                a8Var.setIconColor(bkb.w0(null, bkb.o7, false));
            }
            je3 je3Var = this.a0;
            if (je3Var != null) {
                je3Var.s0(bkb.w0(null, bkb.g5, false));
            }
            try {
                a8 a8Var2 = this.d0;
                if (a8Var2 != null) {
                    a8Var2.setTextColor(bkb.w0(null, bkb.p7, false));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.h0) {
            this.h0 = true;
            kk7.e().k(kk7.t4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void p0(boolean z, long j, h61 h61Var) {
        if (z) {
            fl5.z().f();
        }
        try {
            hd hdVar = this.c;
            if (hdVar != null) {
                hdVar.dismiss();
                this.c = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        getMediaDataController().A0.b();
        gl.d3(new et(this, j, (byte) 5), 150L);
        hq6.d0(this.currentAccount).w(true);
        la4 la4Var = getFileLoader().d;
        la4Var.d();
        la4Var.a.c(new x51(this, (byte) 1));
        h61Var.run();
    }

    public final void q0(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        hd hdVar = new hd(3, null, getParentActivity());
        this.c = hdVar;
        hdVar.j0 = false;
        hdVar.q(500L);
        na7 q1 = na7.q1(this.currentAccount);
        q1.G1.b();
        q1.C1.b();
        q1.D1.b();
        q1.E1.b();
        q1.F1.b();
        if (z) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new vb7(messagesStorage, (byte) 12));
            return;
        }
        ad7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.a.c(new vb7(messagesStorage2, (byte) 16));
    }

    public final void r0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        y0();
        this.fragmentView.invalidate();
    }

    public final void t0(int i, int i2) {
        this.Q = i;
        this.R = i2;
        fu fuVar = this.b;
        if (fuVar != null) {
            int x = b00.x(48.0f, i, -gl.L(8.0f));
            int x2 = b00.x(48.0f, i2, -gl.L(8.0f));
            gl.v3(fuVar, 0, x, 0, x2);
            fuVar.setPadding(0, ((a.getCurrentActionBarHeight() / 2) + i) - x, 0, i2 - x2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = gl.L(44.0f) + a.getCurrentActionBarHeight() + i;
                this.P.setLayoutParams(layoutParams);
                y0();
            }
            if (this.c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                this.c0.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                dha dhaVar = this.c0;
                dhaVar.C();
                dhaVar.requestLayout();
                dhaVar.invalidate();
            }
        }
    }

    public final long u0(int i) {
        switch (i) {
            case 0:
                return this.y;
            case 1:
                return this.E;
            case 2:
                return this.r;
            case 3:
                return this.x;
            case 4:
                return this.s;
            case 5:
                return this.w;
            case 6:
                return this.G;
            case 7:
                return this.f;
            case 8:
                return this.n;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(View view) {
        int i;
        int i2;
        int i3;
        boolean n0 = n0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (n0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                n61 n61Var = (n61) arrayList.get(i4);
                if (n61Var.a != 11 || n61Var.i || (i3 = n61Var.f) < 0 || !zArr[i3]) {
                }
            }
            pw0.APP_ERROR.a();
            if (view != null) {
                gl.A3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                n61 n61Var2 = (n61) arrayList.get(i5);
                if (n61Var2.a == 11 && !n61Var2.i && (i2 = n61Var2.f) >= 0) {
                    zArr2[i2] = true;
                }
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (!zArr2[i6]) {
                    zArr[i6] = !n0;
                }
            }
        } else {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                n61 n61Var3 = (n61) arrayList.get(i7);
                if (n61Var3.a == 11 && n61Var3.i && (i = n61Var3.f) >= 0) {
                    zArr[i] = !n0;
                }
            }
        }
        for (int i8 = 0; i8 < this.b.getChildCount(); i8++) {
            View childAt = this.b.getChildAt(i8);
            if (childAt instanceof ag2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    n61 n61Var4 = (n61) arrayList.get(R);
                    if (n61Var4.a == 11) {
                        int i9 = n61Var4.f;
                        if (i9 < 0) {
                            ((ag2) childAt).c(!n0, true);
                        } else {
                            ((ag2) childAt).c(zArr[i9], true);
                        }
                    }
                }
            }
        }
        x0();
    }

    public final void w0() {
        String G;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        int size = this.e0.j.size();
        d61 d61Var = this.N;
        boolean z4 = false;
        if (size > 0) {
            if (d61Var != null) {
                boolean isEmpty = this.e0.l.isEmpty();
                v61 v61Var = this.e0;
                if (!isEmpty) {
                    ArrayList arrayList = v61Var.b;
                    int size2 = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        l61 l61Var = (l61) obj;
                        if (this.e0.l.contains(Long.valueOf(l61Var.a))) {
                            i += l61Var.b;
                        }
                    }
                    int size3 = this.e0.j.size() - i;
                    v61 v61Var2 = this.e0;
                    if (size3 > 0) {
                        G = tb4.y(k96.G(v61Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size())), ", ", k96.G(size3, "Files", Integer.valueOf(size3)));
                    } else {
                        G = k96.G(v61Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size()));
                    }
                } else {
                    G = k96.G(v61Var.j.size(), "Files", Integer.valueOf(this.e0.j.size()));
                }
                String i02 = gl.i0(this.e0.k, false, false);
                pha phaVar = this.simpleActionBar;
                boolean z5 = k96.a0;
                phaVar.q();
                hn hnVar = phaVar.f;
                if (!z5 && phaVar.y() && phaVar.H) {
                    z = true;
                } else {
                    z = false;
                }
                hnVar.c(i02, z, true);
                pha phaVar2 = this.simpleActionBar;
                boolean z6 = k96.a0;
                phaVar2.q();
                if (phaVar2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        hn hnVar2 = new hn(phaVar2.getContext(), true, true, true);
                        phaVar2.h = hnVar2;
                        hnVar2.setTextSize(gl.L(14.0f));
                        phaVar2.h.setTextColor(phaVar2.f0);
                        phaVar2.h.setGravity(19);
                        phaVar2.h.setEllipsizeByGradient(true);
                        phaVar2.h.b(0.35f, 320L, s33.h);
                        phaVar2.addView(phaVar2.h, phaVar2.indexOfChild(phaVar2.b), nme.e(-1, 18, 51));
                        phaVar2.k();
                    }
                    this.N.f(true);
                    return;
                }
                hn hnVar3 = phaVar2.h;
                if (hnVar3 != null && hnVar3.getTag() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hn hnVar4 = phaVar2.h;
                if (!z6 && phaVar2.y() && phaVar2.H) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                hnVar4.c(G, z3, true);
                hn hnVar5 = phaVar2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                hnVar5.setTag(num);
                hn hnVar6 = phaVar2.h;
                if (hnVar6 != null && hnVar6.getTag() != null) {
                    z4 = true;
                }
                if (z2 != z4) {
                    phaVar2.requestLayout();
                }
                this.N.f(true);
                return;
            }
            return;
        }
        d61Var.f(false);
    }

    public final void x0() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        o61 o61Var = this.X;
        long j10 = 0;
        boolean z = false;
        if (o61Var != null) {
            if (!this.L) {
                if (this.H > 0) {
                    q51[] q51VarArr = new q51[11];
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.g0;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        n61 n61Var = (n61) arrayList.get(i);
                        if (n61Var.a == 11) {
                            int i2 = n61Var.f;
                            boolean[] zArr = this.d;
                            if (i2 < 0) {
                                if (this.M) {
                                    long j11 = n61Var.g;
                                    boolean z2 = zArr[10];
                                    ?? obj = new Object();
                                    obj.c = j11;
                                    obj.b = z2;
                                    q51VarArr[10] = obj;
                                }
                            } else {
                                long j12 = n61Var.g;
                                boolean z3 = zArr[i2];
                                ?? obj2 = new Object();
                                obj2.c = j12;
                                obj2.b = z3;
                                q51VarArr[i2] = obj2;
                            }
                        }
                        i++;
                    }
                    if (System.currentTimeMillis() - this.b0 < 80) {
                        this.X.n.e(true, 0.0f);
                    }
                    this.X.e(this.H, true, q51VarArr);
                } else {
                    o61Var.e(0L, true, new q51[0]);
                }
            } else {
                o61Var.e(-1L, true, new q51[0]);
            }
        }
        j61 j61Var = this.Z;
        if (j61Var != null && !this.L) {
            r61 r61Var = j61Var.d;
            boolean[] zArr2 = r61Var.d;
            if (zArr2[0]) {
                j = r61Var.y;
            } else {
                j = 0;
            }
            if (zArr2[1]) {
                j2 = r61Var.E;
            } else {
                j2 = 0;
            }
            long j13 = j + j2;
            if (zArr2[2]) {
                j3 = r61Var.r;
            } else {
                j3 = 0;
            }
            long j14 = j13 + j3;
            if (zArr2[3]) {
                j4 = r61Var.x;
            } else {
                j4 = 0;
            }
            long j15 = j14 + j4;
            if (zArr2[4]) {
                j5 = r61Var.s;
            } else {
                j5 = 0;
            }
            long j16 = j15 + j5;
            if (zArr2[5]) {
                j6 = r61Var.w;
            } else {
                j6 = 0;
            }
            long j17 = j16 + j6;
            if (zArr2[6]) {
                j7 = r61Var.G;
            } else {
                j7 = 0;
            }
            long j18 = j17 + j7;
            if (zArr2[7]) {
                j8 = r61Var.f;
            } else {
                j8 = 0;
            }
            long j19 = j18 + j8;
            if (zArr2[8]) {
                j9 = r61Var.n;
            } else {
                j9 = 0;
            }
            long j20 = j19 + j9;
            if (zArr2[9]) {
                j10 = r61Var.F;
            }
            long j21 = j20 + j10;
            ArrayList arrayList2 = r61Var.g0;
            int i3 = 0;
            while (true) {
                if (i3 < arrayList2.size()) {
                    n61 n61Var2 = (n61) arrayList2.get(i3);
                    if (n61Var2.a == 11) {
                        int i4 = n61Var2.f;
                        if (i4 < 0) {
                            i4 = zArr2.length - 1;
                        }
                        if (!zArr2[i4]) {
                            break;
                        }
                    }
                    i3++;
                } else {
                    z = true;
                    break;
                }
            }
            j61Var.a(j21, z);
        }
    }

    public final void y0() {
        float f;
        View view = this.P;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.T;
        float f2 = 0.0f;
        if (fm0Var == null) {
            f = 0.0f;
        } else {
            f = fm0Var.e;
        }
        fm0 fm0Var2 = this.U;
        if (fm0Var2 != null) {
            f2 = fm0Var2.e;
        }
        view.setTranslationY(((-(1.0f - f)) * a.getCurrentActionBarHeight()) - ((1.0f - f2) * gl.L(44.0f)));
    }

    public final void z0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r61.z0(boolean):void");
    }
}

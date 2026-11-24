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
public final class y71 extends d implements jm7 {
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
    public k71 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public fn0 T;
    public fn0 U;
    public int[] V;
    public float[] W;
    public v71 X;
    public m71 Y;
    public q71 Z;
    public w71 a;
    public wf3 a0;
    public fv b;
    public long b0;
    public he c;
    public fja c0;
    public final boolean[] d;
    public a8 d0;
    public long e;
    public c81 e0;
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

    public y71() {
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

    public static rja Z(y71 y71Var) {
        return y71Var.simpleActionBar;
    }

    public static rja a0(y71 y71Var) {
        return y71Var.simpleActionBar;
    }

    public static rja b0(y71 y71Var) {
        return y71Var.simpleActionBar;
    }

    public static rja c0(y71 y71Var) {
        return y71Var.simpleActionBar;
    }

    public static void d0(qac qacVar) {
        Long l = k0;
        if (l != null) {
            qacVar.a(l);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new mo0(qacVar, (byte) 3));
    }

    public static void e0(java.lang.String r12, int r13, int[] r14, defpackage.h71 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y71.e0(java.lang.String, int, int[], h71):void");
    }

    public static int j0(int r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y71.j0(int, java.lang.String):int");
    }

    public static String l0(float f) {
        if (f < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void m0(h92 h92Var) {
        Long l;
        Long l2 = l0;
        if (l2 != null && (l = m0) != null) {
            h92Var.a(l2, l);
        } else {
            Utilities.f.c(new yt0(h92Var, (byte) 13));
        }
    }

    public static long n0(File file, int i) {
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

    public static boolean t0(int i, String str) {
        if (str != null && bc4.j(i) != null) {
            return str.contains(bc4.j(i).getAbsolutePath());
        }
        return false;
    }

    public final void A0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y71.A0(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.M6));
        hashSet.add(Integer.valueOf(cmb.L6));
        hashSet.add(Integer.valueOf(cmb.Lj));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setTitle(jb6.M0(2131744505, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 14));
        this.simpleActionBar.q().b(1, 0, jb6.M0(2131752602, null), null, 0, null).getTextView().setTextColor(cmb.w0(null, cmb.Ei, false));
        a8 e = this.simpleActionBar.t().a(2, 2131231248).e(3, 2131232114, jb6.M0(2131752013, null));
        this.d0 = e;
        int i = cmb.o7;
        e.setIconColor(cmb.w0(null, i, false));
        this.d0.setTextColor(cmb.w0(null, cmb.p7, false));
        this.d0.h(0.12f, i);
        boolean z = e21.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131752013, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new w71(this, context, (byte) 0);
        fja fjaVar = new fja(context);
        this.c0 = fjaVar;
        fjaVar.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        this.c0.setGeometry(new nl9(this, (byte) 12));
        fja fjaVar2 = this.c0;
        this.fragmentView = fjaVar2;
        anb.h(cmb.Z6, null, fjaVar2);
        fv fvVar = new fv((byte) 3, context, this);
        this.b = fvVar;
        fvVar.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        fv fvVar2 = this.b;
        fja fjaVar3 = this.c0;
        fjaVar3.getClass();
        fvVar2.setLayoutManager(new jg2((Object) fjaVar3, (byte) 5));
        this.c0.v(this.b, new d71(this, (byte) 3));
        this.b.setAdapter(this.a);
        j71 j71Var = new j71(this);
        j71Var.n(350L);
        d53 d53Var = d53.h;
        j71Var.o(d53Var);
        j71Var.C = false;
        j71Var.m = false;
        this.b.setItemAnimator(j71Var);
        this.b.setOnItemClickListener(new d71(this, (byte) 4));
        this.b.j(new y(this, (byte) 12));
        View view = new View(context);
        this.P = view;
        fjaVar2.addView(view, qoe.e(-1, 0, 48));
        this.T = new fn0(0, new d71(this, (byte) 5), d53Var, 380L, false);
        this.U = new fn0(1, new d71(this, (byte) 0), d53Var, 380L, false);
        z0();
        getBaseSimpleGlass().f(fjaVar2, this.b, this.simpleActionBar, this.resourceProvider);
        k71 k71Var = new k71(this, context, this, this.glassEngine, this.c0);
        this.N = k71Var;
        k71Var.E = true;
        FrameLayout frameLayout = k71Var.c;
        gm.B2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        im0 c = getBaseSimpleGlass().c.c(this.O, null, false);
        c.p(qqd.l(this.resourceProvider));
        c.q(gm.L(9.66f));
        c.r(gm.L(18.0f));
        frameLayout.setBackground(c);
        fja fjaVar4 = this.c0;
        k71 k71Var2 = this.N;
        wgc viewPager = k71Var2.getViewPager();
        k71 k71Var3 = this.N;
        Objects.requireNonNull(k71Var3);
        fjaVar4.y(k71Var2, viewPager, new xg0(k71Var3, (byte) 23));
        this.c0.z(this.O);
        this.O.setLayoutParams(qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new sz4(this));
        this.N.setCacheModel(this.e0);
        xg0 xg0Var = new xg0(fjaVar2, (byte) 22);
        getBaseSimpleGlass().o = new dh0(this, xg0Var, (byte) 3);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        u0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.P4) {
            try {
                he heVar = this.c;
                if (heVar != null) {
                    heVar.dismiss();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = cf7.Y(this.currentAccount).Q();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131752013, null));
                    this.d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    public final void f0(s71 s71Var, f35[] f35VarArr, c81 c81Var) {
        t71 t71Var;
        HashSet hashSet;
        long j;
        char c;
        long j2;
        f35 f35Var;
        he heVar = new he(3, null, getParentActivity());
        heVar.j0 = false;
        heVar.q(500L);
        HashSet hashSet2 = new HashSet();
        long j3 = this.H;
        int i = 0;
        while (i < 8) {
            if ((f35VarArr != null && ((f35Var = f35VarArr[i]) == null || !f35Var.b)) || (t71Var = (t71) s71Var.d.get(i)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(t71Var.b);
                hashSet = hashSet2;
                long j4 = s71Var.c;
                long j5 = t71Var.a;
                s71Var.c = j4 - j5;
                this.H -= j5;
                this.J += j5;
                s71Var.d.delete(i);
                if (i == 0) {
                    this.y -= t71Var.a;
                } else if (i == 1) {
                    this.E -= t71Var.a;
                } else if (i == 2) {
                    this.r -= t71Var.a;
                } else if (i == 3) {
                    this.x -= t71Var.a;
                } else if (i == 4) {
                    this.s -= t71Var.a;
                } else if (i == 5) {
                    this.G -= t71Var.a;
                } else {
                    char c2 = 7;
                    if (i == 7) {
                        int i2 = 0;
                        while (i2 < t71Var.b.size()) {
                            b81 b81Var = (b81) t71Var.b.get(i2);
                            String absolutePath = ((b81) t71Var.b.get(i2)).a.getAbsolutePath();
                            if (t0(6, absolutePath)) {
                                c = c2;
                            } else if (t0(0, absolutePath) || t0(100, absolutePath)) {
                                c = 0;
                            } else if (t0(2, absolutePath) || t0(101, absolutePath)) {
                                c = 1;
                            } else {
                                c = 6;
                            }
                            int i3 = i2;
                            if (c == c2) {
                                j2 = j3;
                                this.w -= b81Var.c;
                            } else {
                                j2 = j3;
                                if (c == 0) {
                                    this.y -= b81Var.c;
                                } else if (c == 1) {
                                    this.E -= b81Var.c;
                                } else {
                                    this.f -= b81Var.c;
                                }
                            }
                            i2 = i3 + 1;
                            j3 = j2;
                            c2 = 7;
                        }
                    } else {
                        j = j3;
                        this.f -= t71Var.a;
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
        if (s71Var.d.size() == 0) {
            this.e0.b.remove(s71Var);
        }
        A0(true);
        if (c81Var != null) {
            Iterator it = c81Var.j.iterator();
            while (it.hasNext()) {
                b81 b81Var2 = (b81) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(b81Var2)) {
                    long j7 = this.H;
                    long j8 = b81Var2.c;
                    this.H = j7 - j8;
                    this.J += j8;
                    hashSet4.add(b81Var2);
                    s71Var.b(b81Var2);
                    byte b = b81Var2.d;
                    if (b == 0) {
                        this.y -= b81Var2.c;
                    } else if (b == 1) {
                        this.E -= b81Var2.c;
                    } else if (b == 2) {
                        this.r -= b81Var2.c;
                    } else if (b == 3) {
                        this.x -= b81Var2.c;
                    } else if (b == 4) {
                        this.s -= b81Var2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            b81 b81Var3 = (b81) it2.next();
            c81 c81Var2 = this.e0;
            if (c81Var2.j.remove(b81Var3)) {
                c81Var2.k -= b81Var3.c;
            }
            ArrayList e = c81Var2.e(b81Var3.d);
            if (e != null) {
                e.remove(b81Var3);
            }
        }
        u31 Q = c41.b0(this).Q(2131624052, 36, jb6.a0(null, null, 2131752598, gm.i0(j6 - this.H, false, false)));
        Q.s = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        lc4 lc4Var = getFileLoader().d;
        lc4Var.getClass();
        lc4Var.h(new pv3(lc4Var, arrayList, (byte) 26));
        getFileLoader().c();
        getFileLoader().getClass();
        bc4.K.c(new tv0(this, arrayList, heVar, (byte) 9));
    }

    public final void g0(defpackage.p r25, defpackage.o71 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y71.g0(p, o71):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        t10 t10Var = new t10(this, (byte) 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{vkb.class, hla.class, j3b.class, jf5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.b, 0, new Class[]{j3b.class}, new String[]{"paintFill"}, (Drawable[]) null, (bnb) null, cmb.Jj));
        int i = cmb.x6;
        arrayList.add(new cnb(this.b, 0, new Class[]{j3b.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.g5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Xj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Zj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ak));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.bk));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ck));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.dk));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ek));
        return arrayList;
    }

    public final void h0(boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131748528, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131748530, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        kt6.t("LocalDatabaseClearText2", null, 2131748529, new Object[]{gm.i0(this.e, false, false)}, spannableStringBuilder);
        heVar.U = spannableStringBuilder;
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131752602, null), new s51((byte) 1, this, z));
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    public final void i0() {
        if (this.e0.j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131752035, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131752032, null);
            alertDialog$Builder.j(jb6.M0(2131752038, null), new d71(this, (byte) 2));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.h0) {
            return super.isLightStatusBar();
        }
        if (gm.B(cmb.w0(null, cmb.Z6, false)) <= 0.721f) {
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
        fja fjaVar;
        if (this.N == null || motionEvent == null || (fjaVar = this.c0) == null || !fjaVar.c() || this.c0.o(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0) {
            return true;
        }
        return false;
    }

    public final void k0(File file, int i, LongSparseArray longSparseArray, c81 c81Var) {
        File[] listFiles;
        int i2;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!i0) {
                    if (file2.isDirectory()) {
                        k0(file2, i, longSparseArray, c81Var);
                    } else if (!file2.getName().equals(".nomedia")) {
                        kc4 e = getFileLoader().d.e(file2, null);
                        String lowerCase = file2.getName().toLowerCase();
                        if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                            i2 = i;
                        } else {
                            i2 = 3;
                        }
                        b81 b81Var = new b81(file2);
                        long length = file2.length();
                        b81Var.c = length;
                        byte b = i2;
                        if (e != null) {
                            b81Var.b = e.a;
                            b81Var.g = e.b;
                            int i3 = e.c;
                            b81Var.h = i3;
                            b = i2;
                            if (i3 == 23) {
                                b = i2;
                                if (length > 0) {
                                    b = 7;
                                }
                            }
                        }
                        b81Var.d = b;
                        long j = b81Var.b;
                        if (j != 0) {
                            s71 s71Var = (s71) longSparseArray.get(j, null);
                            s71 s71Var2 = s71Var;
                            if (s71Var == null) {
                                s71 s71Var3 = new s71(b81Var.b);
                                longSparseArray.put(b81Var.b, s71Var3);
                                s71Var2 = s71Var3;
                            }
                            s71Var2.a(b81Var, b);
                        }
                        if (b != 6) {
                            c81Var.e(b).add(b81Var);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
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
            u71 u71Var = (u71) arrayList.get(i2);
            if (u71Var.a == 11 && !u71Var.i && (i = u71Var.f) >= 0) {
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
    public final boolean onBackPressed(boolean z) {
        c81 c81Var = this.e0;
        if (c81Var != null && !c81Var.j.isEmpty()) {
            if (z) {
                this.e0.d();
                k71 k71Var = this.N;
                if (k71Var != null) {
                    k71Var.f(false);
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
        getNotificationCenter().b(this, nm7.P4);
        this.e = cf7.Y(this.currentAccount).Q();
        Utilities.e.c(new e71(this, (byte) 2));
        this.b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.P4);
        try {
            he heVar = this.c;
            if (heVar != null) {
                heVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        u0(i2, i4);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        yb0 yb0Var;
        if (i == 4) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (yb0Var = FilesMigrationService.e) != null) {
                yb0Var.D0();
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
                a8Var.setIconColor(cmb.w0(null, cmb.o7, false));
            }
            wf3 wf3Var = this.a0;
            if (wf3Var != null) {
                wf3Var.s0(cmb.w0(null, cmb.g5, false));
            }
            try {
                a8 a8Var2 = this.d0;
                if (a8Var2 != null) {
                    a8Var2.setTextColor(cmb.w0(null, cmb.p7, false));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.h0) {
            this.h0 = true;
            nm7.e().k(nm7.v4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void p0(he heVar) {
        bc4.G(this.currentAccount).i();
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q0(boolean z, long j, o71 o71Var) {
        if (z) {
            fn5.z().f();
        }
        try {
            he heVar = this.c;
            if (heVar != null) {
                heVar.dismiss();
                this.c = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        getMediaDataController().A0.b();
        gm.d3(new fu(this, j, (byte) 5), 150L);
        hs6.d0(this.currentAccount).w(true);
        lc4 lc4Var = getFileLoader().d;
        lc4Var.d();
        lc4Var.a.c(new e71(this, (byte) 1));
        o71Var.run();
    }

    public final void r0(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        he heVar = new he(3, null, getParentActivity());
        this.c = heVar;
        heVar.j0 = false;
        heVar.q(500L);
        oc7 r1 = oc7.r1(this.currentAccount);
        r1.G1.b();
        r1.C1.b();
        r1.D1.b();
        r1.E1.b();
        r1.F1.b();
        if (z) {
            cf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new xd7(messagesStorage, (byte) 12));
            return;
        }
        cf7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.a.c(new xd7(messagesStorage2, (byte) 16));
    }

    public final void s0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        z0();
        this.fragmentView.invalidate();
    }

    public final void u0(int i, int i2) {
        this.Q = i;
        this.R = i2;
        fv fvVar = this.b;
        if (fvVar != null) {
            int x = b10.x(48.0f, i, -gm.L(8.0f));
            int x2 = b10.x(48.0f, i2, -gm.L(8.0f));
            gm.v3(fvVar, 0, x, 0, x2);
            fvVar.setPadding(0, ((a.getCurrentActionBarHeight() / 2) + i) - x, 0, i2 - x2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = gm.L(44.0f) + a.getCurrentActionBarHeight() + i;
                this.P.setLayoutParams(layoutParams);
                z0();
            }
            if (this.c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                this.c0.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                fja fjaVar = this.c0;
                fjaVar.C();
                fjaVar.requestLayout();
                fjaVar.invalidate();
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final long v0(int i) {
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

    public final void w0(View view) {
        int i;
        int i2;
        int i3;
        boolean o0 = o0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (o0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                u71 u71Var = (u71) arrayList.get(i4);
                if (u71Var.a != 11 || u71Var.i || (i3 = u71Var.f) < 0 || !zArr[i3]) {
                }
            }
            xx0.APP_ERROR.a();
            if (view != null) {
                gm.A3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                u71 u71Var2 = (u71) arrayList.get(i5);
                if (u71Var2.a == 11 && !u71Var2.i && (i2 = u71Var2.f) >= 0) {
                    zArr2[i2] = true;
                }
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (!zArr2[i6]) {
                    zArr[i6] = !o0;
                }
            }
        } else {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                u71 u71Var3 = (u71) arrayList.get(i7);
                if (u71Var3.a == 11 && u71Var3.i && (i = u71Var3.f) >= 0) {
                    zArr[i] = !o0;
                }
            }
        }
        for (int i8 = 0; i8 < this.b.getChildCount(); i8++) {
            View childAt = this.b.getChildAt(i8);
            if (childAt instanceof oh2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u71 u71Var4 = (u71) arrayList.get(R);
                    if (u71Var4.a == 11) {
                        int i9 = u71Var4.f;
                        if (i9 < 0) {
                            ((oh2) childAt).c(!o0, true);
                        } else {
                            ((oh2) childAt).c(zArr[i9], true);
                        }
                    }
                }
            }
        }
        y0();
    }

    public final void x0() {
        String G;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        int size = this.e0.j.size();
        k71 k71Var = this.N;
        boolean z4 = false;
        if (size > 0) {
            if (k71Var != null) {
                boolean isEmpty = this.e0.l.isEmpty();
                c81 c81Var = this.e0;
                if (!isEmpty) {
                    ArrayList arrayList = c81Var.b;
                    int size2 = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        s71 s71Var = (s71) obj;
                        if (this.e0.l.contains(Long.valueOf(s71Var.a))) {
                            i += s71Var.b;
                        }
                    }
                    int size3 = this.e0.j.size() - i;
                    c81 c81Var2 = this.e0;
                    if (size3 > 0) {
                        G = kt6.o(jb6.G(c81Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size())), ", ", jb6.G(size3, "Files", Integer.valueOf(size3)));
                    } else {
                        G = jb6.G(c81Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size()));
                    }
                } else {
                    G = jb6.G(c81Var.j.size(), "Files", Integer.valueOf(this.e0.j.size()));
                }
                String i02 = gm.i0(this.e0.k, false, false);
                rja rjaVar = this.simpleActionBar;
                boolean z5 = jb6.a0;
                rjaVar.q();
                io ioVar = rjaVar.f;
                if (!z5 && rjaVar.y() && rjaVar.H) {
                    z = true;
                } else {
                    z = false;
                }
                ioVar.c(i02, z, true);
                rja rjaVar2 = this.simpleActionBar;
                boolean z6 = jb6.a0;
                rjaVar2.q();
                if (rjaVar2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        io ioVar2 = new io(rjaVar2.getContext(), true, true, true);
                        rjaVar2.h = ioVar2;
                        ioVar2.setTextSize(gm.L(14.0f));
                        rjaVar2.h.setTextColor(rjaVar2.f0);
                        rjaVar2.h.setGravity(19);
                        rjaVar2.h.setEllipsizeByGradient(true);
                        rjaVar2.h.b(0.35f, 320L, d53.h);
                        rjaVar2.addView(rjaVar2.h, rjaVar2.indexOfChild(rjaVar2.b), qoe.e(-1, 18, 51));
                        rjaVar2.l();
                    }
                    this.N.f(true);
                    return;
                }
                io ioVar3 = rjaVar2.h;
                if (ioVar3 != null && ioVar3.getTag() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io ioVar4 = rjaVar2.h;
                if (!z6 && rjaVar2.y() && rjaVar2.H) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ioVar4.c(G, z3, true);
                io ioVar5 = rjaVar2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                ioVar5.setTag(num);
                io ioVar6 = rjaVar2.h;
                if (ioVar6 != null && ioVar6.getTag() != null) {
                    z4 = true;
                }
                if (z2 != z4) {
                    rjaVar2.requestLayout();
                }
                this.N.f(true);
                return;
            }
            return;
        }
        k71Var.f(false);
    }

    public final void y0() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        v71 v71Var = this.X;
        long j10 = 0;
        boolean z = false;
        if (v71Var != null) {
            if (!this.L) {
                if (this.H > 0) {
                    x61[] x61VarArr = new x61[11];
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.g0;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        u71 u71Var = (u71) arrayList.get(i);
                        if (u71Var.a == 11) {
                            int i2 = u71Var.f;
                            boolean[] zArr = this.d;
                            if (i2 < 0) {
                                if (this.M) {
                                    long j11 = u71Var.g;
                                    boolean z2 = zArr[10];
                                    ?? obj = new Object();
                                    obj.c = j11;
                                    obj.b = z2;
                                    x61VarArr[10] = obj;
                                }
                            } else {
                                long j12 = u71Var.g;
                                boolean z3 = zArr[i2];
                                ?? obj2 = new Object();
                                obj2.c = j12;
                                obj2.b = z3;
                                x61VarArr[i2] = obj2;
                            }
                        }
                        i++;
                    }
                    if (System.currentTimeMillis() - this.b0 < 80) {
                        this.X.n.e(true, 0.0f);
                    }
                    this.X.e(this.H, true, x61VarArr);
                } else {
                    v71Var.e(0L, true, new x61[0]);
                }
            } else {
                v71Var.e(-1L, true, new x61[0]);
            }
        }
        q71 q71Var = this.Z;
        if (q71Var != null && !this.L) {
            y71 y71Var = q71Var.d;
            boolean[] zArr2 = y71Var.d;
            if (zArr2[0]) {
                j = y71Var.y;
            } else {
                j = 0;
            }
            if (zArr2[1]) {
                j2 = y71Var.E;
            } else {
                j2 = 0;
            }
            long j13 = j + j2;
            if (zArr2[2]) {
                j3 = y71Var.r;
            } else {
                j3 = 0;
            }
            long j14 = j13 + j3;
            if (zArr2[3]) {
                j4 = y71Var.x;
            } else {
                j4 = 0;
            }
            long j15 = j14 + j4;
            if (zArr2[4]) {
                j5 = y71Var.s;
            } else {
                j5 = 0;
            }
            long j16 = j15 + j5;
            if (zArr2[5]) {
                j6 = y71Var.w;
            } else {
                j6 = 0;
            }
            long j17 = j16 + j6;
            if (zArr2[6]) {
                j7 = y71Var.G;
            } else {
                j7 = 0;
            }
            long j18 = j17 + j7;
            if (zArr2[7]) {
                j8 = y71Var.f;
            } else {
                j8 = 0;
            }
            long j19 = j18 + j8;
            if (zArr2[8]) {
                j9 = y71Var.n;
            } else {
                j9 = 0;
            }
            long j20 = j19 + j9;
            if (zArr2[9]) {
                j10 = y71Var.F;
            }
            long j21 = j20 + j10;
            ArrayList arrayList2 = y71Var.g0;
            int i3 = 0;
            while (true) {
                if (i3 < arrayList2.size()) {
                    u71 u71Var2 = (u71) arrayList2.get(i3);
                    if (u71Var2.a == 11) {
                        int i4 = u71Var2.f;
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
            q71Var.a(j21, z);
        }
    }

    public final void z0() {
        float f;
        View view = this.P;
        if (view == null) {
            return;
        }
        fn0 fn0Var = this.T;
        float f2 = 0.0f;
        if (fn0Var == null) {
            f = 0.0f;
        } else {
            f = fn0Var.e;
        }
        fn0 fn0Var2 = this.U;
        if (fn0Var2 != null) {
            f2 = fn0Var2.e;
        }
        view.setTranslationY(((-(1.0f - f)) * a.getCurrentActionBarHeight()) - ((1.0f - f2) * gm.L(44.0f)));
    }
}

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
import org.telegram.ui.ActionBar.e;
public final class z61 extends e implements fn7 {
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
    public l61 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public fm0 T;
    public fm0 U;
    public int[] V;
    public float[] W;
    public w61 X;
    public n61 Y;
    public r61 Z;
    public x61 a;
    public df3 a0;
    public gu b;
    public long b0;
    public id c;
    public wka c0;
    public final boolean[] d;
    public b8 d0;
    public long e;
    public d71 e0;
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

    public z61() {
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

    public static jla Y(z61 z61Var) {
        return z61Var.simpleActionBar;
    }

    public static jla Z(z61 z61Var) {
        return z61Var.simpleActionBar;
    }

    public static jla a0(z61 z61Var) {
        return z61Var.simpleActionBar;
    }

    public static jla b0(z61 z61Var) {
        return z61Var.simpleActionBar;
    }

    public static void c0(pcc pccVar) {
        Long l = k0;
        if (l != null) {
            pccVar.a(l);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.f.c(new jn0(pccVar, (byte) 3));
    }

    public static void d0(java.lang.String r12, int r13, int[] r14, defpackage.i61 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z61.d0(java.lang.String, int, int[], i61):void");
    }

    public static int i0(int r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z61.i0(int, java.lang.String):int");
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

    public static void l0(n82 n82Var) {
        Long l;
        Long l2 = l0;
        if (l2 != null && (l = m0) != null) {
            n82Var.a(l2, l);
        } else {
            Utilities.f.c(new fv0(n82Var, (byte) 12));
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
        if (str != null && xb4.j(i) != null) {
            return str.contains(xb4.j(i).getAbsolutePath());
        }
        return false;
    }

    public final void A0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z61.A0(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.N6));
        hashSet.add(Integer.valueOf(aob.M6));
        hashSet.add(Integer.valueOf(aob.Mj));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setTitle(ob6.M0(2131744473, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 14));
        this.simpleActionBar.r().b(1, 0, ob6.M0(2131752630, null), null, 0, null).getTextView().setTextColor(aob.w0(null, aob.Fi, false));
        b8 e = this.simpleActionBar.v().a(2, 2131231247).e(3, 2131232113, ob6.M0(2131752041, null));
        this.d0 = e;
        int i = aob.p7;
        e.setIconColor(aob.w0(null, i, false));
        this.d0.setTextColor(aob.w0(null, aob.q7, false));
        this.d0.h(0.12f, i);
        boolean z = f11.a;
        if (this.d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131752041, null));
            this.d0.setText(spannableStringBuilder);
        }
        this.a = new x61(this, context, (byte) 0);
        wka wkaVar = new wka(context);
        this.c0 = wkaVar;
        wkaVar.setDebugLoggingEnabled(true);
        this.c0.setCommonInsetsManagedExternally(true);
        this.c0.setGeometry(new zm9(this, (byte) 12));
        wka wkaVar2 = this.c0;
        this.fragmentView = wkaVar2;
        yob.h(aob.a7, null, wkaVar2);
        gu guVar = new gu((byte) 3, context, this);
        this.b = guVar;
        guVar.s1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        gu guVar2 = this.b;
        wka wkaVar3 = this.c0;
        wkaVar3.getClass();
        guVar2.setLayoutManager(new of2((Object) wkaVar3, (byte) 5));
        this.c0.v(this.b, new f61(this, (byte) 2));
        this.b.setAdapter(this.a);
        k61 k61Var = new k61(this);
        k61Var.n(350L);
        k43 k43Var = k43.h;
        k61Var.o(k43Var);
        k61Var.C = false;
        k61Var.m = false;
        this.b.setItemAnimator(k61Var);
        this.b.setOnItemClickListener(new f61(this, (byte) 3));
        this.b.j(new y(this, (byte) 11));
        View view = new View(context);
        this.P = view;
        wkaVar2.addView(view, tre.e(-1, 0, 48));
        this.T = new fm0(0, new f61(this, (byte) 4), k43Var, 380L, false);
        this.U = new fm0(1, new f61(this, (byte) 5), k43Var, 380L, false);
        z0();
        getBaseSimpleGlass().h(wkaVar2, this.b, this.simpleActionBar, this.resourceProvider);
        l61 l61Var = new l61(this, context, this, this.glassEngine, this.c0);
        this.N = l61Var;
        l61Var.E = true;
        FrameLayout frameLayout = l61Var.c;
        hl.B2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        jl0 c = getBaseSimpleGlass().c.c(this.O, null, false);
        c.p(dtd.l(this.resourceProvider));
        c.q(hl.L(9.66f));
        c.r(hl.L(18.0f));
        frameLayout.setBackground(c);
        wka wkaVar4 = this.c0;
        l61 l61Var2 = this.N;
        vic viewPager = l61Var2.getViewPager();
        l61 l61Var3 = this.N;
        Objects.requireNonNull(l61Var3);
        wkaVar4.y(l61Var2, viewPager, new tg0(l61Var3, (byte) 21));
        this.c0.z(this.O);
        this.O.setLayoutParams(tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new wz4(this));
        this.N.setCacheModel(this.e0);
        tg0 tg0Var = new tg0(wkaVar2, (byte) 20);
        getBaseSimpleGlass().o = new dg0(this, tg0Var, (byte) 3);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        t0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.O4) {
            try {
                id idVar = this.c;
                if (idVar != null) {
                    idVar.dismiss();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.c = null;
            if (this.a != null) {
                this.e = jf7.Y(this.currentAccount).Q();
                if (this.d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131752041, null));
                    this.d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    public final void e0(t61 t61Var, j35[] j35VarArr, d71 d71Var) {
        u61 u61Var;
        HashSet hashSet;
        long j;
        char c;
        long j2;
        j35 j35Var;
        id idVar = new id(3, null, getParentActivity());
        idVar.j0 = false;
        idVar.q(500L);
        HashSet hashSet2 = new HashSet();
        long j3 = this.H;
        int i = 0;
        while (i < 8) {
            if ((j35VarArr != null && ((j35Var = j35VarArr[i]) == null || !j35Var.b)) || (u61Var = (u61) t61Var.d.get(i)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(u61Var.b);
                hashSet = hashSet2;
                long j4 = t61Var.c;
                long j5 = u61Var.a;
                t61Var.c = j4 - j5;
                this.H -= j5;
                this.J += j5;
                t61Var.d.delete(i);
                if (i == 0) {
                    this.y -= u61Var.a;
                } else if (i == 1) {
                    this.E -= u61Var.a;
                } else if (i == 2) {
                    this.r -= u61Var.a;
                } else if (i == 3) {
                    this.x -= u61Var.a;
                } else if (i == 4) {
                    this.s -= u61Var.a;
                } else if (i == 5) {
                    this.G -= u61Var.a;
                } else {
                    char c2 = 7;
                    if (i == 7) {
                        int i2 = 0;
                        while (i2 < u61Var.b.size()) {
                            c71 c71Var = (c71) u61Var.b.get(i2);
                            String absolutePath = ((c71) u61Var.b.get(i2)).a.getAbsolutePath();
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
                                this.w -= c71Var.c;
                            } else {
                                j2 = j3;
                                if (c == 0) {
                                    this.y -= c71Var.c;
                                } else if (c == 1) {
                                    this.E -= c71Var.c;
                                } else {
                                    this.f -= c71Var.c;
                                }
                            }
                            i2 = i3 + 1;
                            j3 = j2;
                            c2 = 7;
                        }
                    } else {
                        j = j3;
                        this.f -= u61Var.a;
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
        if (t61Var.d.size() == 0) {
            this.e0.b.remove(t61Var);
        }
        A0(true);
        if (d71Var != null) {
            Iterator it = d71Var.j.iterator();
            while (it.hasNext()) {
                c71 c71Var2 = (c71) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(c71Var2)) {
                    long j7 = this.H;
                    long j8 = c71Var2.c;
                    this.H = j7 - j8;
                    this.J += j8;
                    hashSet4.add(c71Var2);
                    t61Var.b(c71Var2);
                    byte b = c71Var2.d;
                    if (b == 0) {
                        this.y -= c71Var2.c;
                    } else if (b == 1) {
                        this.E -= c71Var2.c;
                    } else if (b == 2) {
                        this.r -= c71Var2.c;
                    } else if (b == 3) {
                        this.x -= c71Var2.c;
                    } else if (b == 4) {
                        this.s -= c71Var2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            c71 c71Var3 = (c71) it2.next();
            d71 d71Var2 = this.e0;
            if (d71Var2.j.remove(c71Var3)) {
                d71Var2.k -= c71Var3.c;
            }
            ArrayList e = d71Var2.e(c71Var3.d);
            if (e != null) {
                e.remove(c71Var3);
            }
        }
        v21 Q = d31.b0(this).Q(2131624052, 36, ob6.a0(null, null, 2131752626, hl.i0(j6 - this.H, false, false)));
        Q.s = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        ic4 ic4Var = getFileLoader().d;
        ic4Var.getClass();
        ic4Var.h(new vx3(ic4Var, arrayList, (byte) 22));
        getFileLoader().c();
        getFileLoader().getClass();
        xb4.K.c(new tu0(this, arrayList, idVar, (byte) 9));
    }

    public final void f0(defpackage.p r25, defpackage.p61 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z61.f0(p, p61):void");
    }

    public final void g0(boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131748525, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ob6.M0(2131748527, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        qu6.s("LocalDatabaseClearText2", null, 2131748526, new Object[]{hl.i0(this.e, false, false)}, spannableStringBuilder);
        idVar.U = spannableStringBuilder;
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131752630, null), new t41((byte) 1, this, z));
        showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        u00 u00Var = new u00(this, (byte) 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, zma.class, e5b.class, mf5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.b, 0, new Class[]{e5b.class}, new String[]{"paintFill"}, (Drawable[]) null, (zob) null, aob.Kj));
        int i = aob.y6;
        arrayList.add(new apb(this.b, 0, new Class[]{e5b.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.h5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Yj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Zj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ak));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.bk));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ck));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.dk));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ek));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.fk));
        return arrayList;
    }

    public final void h0() {
        if (this.e0.j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131752063, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131752060, null);
            alertDialog$Builder.j(ob6.M0(2131752066, null), new f61(this, (byte) 0));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.h0) {
            return super.isLightStatusBar();
        }
        if (hl.B(aob.w0(null, aob.a7, false)) <= 0.721f) {
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
        wka wkaVar;
        if (this.N == null || motionEvent == null || (wkaVar = this.c0) == null || !wkaVar.c() || this.c0.o(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().b == 0) {
            return true;
        }
        return false;
    }

    public final void j0(File file, int i, LongSparseArray longSparseArray, d71 d71Var) {
        File[] listFiles;
        int i2;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!i0) {
                    if (file2.isDirectory()) {
                        j0(file2, i, longSparseArray, d71Var);
                    } else if (!file2.getName().equals(".nomedia")) {
                        hc4 e = getFileLoader().d.e(file2, null);
                        String lowerCase = file2.getName().toLowerCase();
                        if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                            i2 = i;
                        } else {
                            i2 = 3;
                        }
                        c71 c71Var = new c71(file2);
                        long length = file2.length();
                        c71Var.c = length;
                        byte b = i2;
                        if (e != null) {
                            c71Var.b = e.a;
                            c71Var.g = e.b;
                            int i3 = e.c;
                            c71Var.h = i3;
                            b = i2;
                            if (i3 == 23) {
                                b = i2;
                                if (length > 0) {
                                    b = 7;
                                }
                            }
                        }
                        c71Var.d = b;
                        long j = c71Var.b;
                        if (j != 0) {
                            t61 t61Var = (t61) longSparseArray.get(j, null);
                            t61 t61Var2 = t61Var;
                            if (t61Var == null) {
                                t61 t61Var3 = new t61(c71Var.b);
                                longSparseArray.put(c71Var.b, t61Var3);
                                t61Var2 = t61Var3;
                            }
                            t61Var2.a(c71Var, b);
                        }
                        if (b != 6) {
                            d71Var.e(b).add(c71Var);
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
            v61 v61Var = (v61) arrayList.get(i2);
            if (v61Var.a == 11 && !v61Var.i && (i = v61Var.f) >= 0) {
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

    public final void o0(id idVar) {
        xb4.G(this.currentAccount).i();
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        d71 d71Var = this.e0;
        if (d71Var != null && !d71Var.j.isEmpty()) {
            if (z) {
                this.e0.d();
                l61 l61Var = this.N;
                if (l61Var != null) {
                    l61Var.f(false);
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
        getNotificationCenter().b(this, jn7.O4);
        this.e = jf7.Y(this.currentAccount).Q();
        Utilities.e.c(new e61(this, (byte) 2));
        this.b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.O4);
        try {
            id idVar = this.c;
            if (idVar != null) {
                idVar.dismiss();
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
        ab0 ab0Var;
        if (i == 4) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (ab0Var = FilesMigrationService.e) != null) {
                ab0Var.E0();
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
            b8 b8Var = this.d0;
            if (b8Var != null) {
                b8Var.setIconColor(aob.w0(null, aob.p7, false));
            }
            df3 df3Var = this.a0;
            if (df3Var != null) {
                df3Var.s0(aob.w0(null, aob.h5, false));
            }
            try {
                b8 b8Var2 = this.d0;
                if (b8Var2 != null) {
                    b8Var2.setTextColor(aob.w0(null, aob.q7, false));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.h0) {
            this.h0 = true;
            jn7.e().k(jn7.u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void p0(boolean z, long j, p61 p61Var) {
        if (z) {
            in5.z().f();
        }
        try {
            id idVar = this.c;
            if (idVar != null) {
                idVar.dismiss();
                this.c = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        getMediaDataController().A0.b();
        hl.d3(new kt(this, j, (byte) 5), 150L);
        ls6.d0(this.currentAccount).w(true);
        ic4 ic4Var = getFileLoader().d;
        ic4Var.d();
        ic4Var.a.c(new e61(this, (byte) 1));
        p61Var.run();
    }

    public final void q0(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        id idVar = new id(3, null, getParentActivity());
        this.c = idVar;
        idVar.j0 = false;
        idVar.q(500L);
        uc7 s1 = uc7.s1(this.currentAccount);
        s1.G1.b();
        s1.C1.b();
        s1.D1.b();
        s1.E1.b();
        s1.F1.b();
        if (z) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new be7(messagesStorage, (byte) 15));
            return;
        }
        jf7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.a.c(new be7(messagesStorage2, (byte) 18));
    }

    public final void r0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        z0();
        this.fragmentView.invalidate();
    }

    public final void t0(int i, int i2) {
        this.Q = i;
        this.R = i2;
        gu guVar = this.b;
        if (guVar != null) {
            int y = c00.y(48.0f, i, -hl.L(8.0f));
            int y2 = c00.y(48.0f, i2, -hl.L(8.0f));
            hl.v3(guVar, 0, y, 0, y2);
            guVar.setPadding(0, ((a.getCurrentActionBarHeight() / 2) + i) - y, 0, i2 - y2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = hl.L(44.0f) + a.getCurrentActionBarHeight() + i;
                this.P.setLayoutParams(layoutParams);
                z0();
            }
            if (this.c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                this.c0.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                wka wkaVar = this.c0;
                wkaVar.C();
                wkaVar.requestLayout();
                wkaVar.invalidate();
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

    public final void w0(View view) {
        int i;
        int i2;
        int i3;
        boolean n0 = n0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (n0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                v61 v61Var = (v61) arrayList.get(i4);
                if (v61Var.a != 11 || v61Var.i || (i3 = v61Var.f) < 0 || !zArr[i3]) {
                }
            }
            yw0.APP_ERROR.a();
            if (view != null) {
                hl.A3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                v61 v61Var2 = (v61) arrayList.get(i5);
                if (v61Var2.a == 11 && !v61Var2.i && (i2 = v61Var2.f) >= 0) {
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
                v61 v61Var3 = (v61) arrayList.get(i7);
                if (v61Var3.a == 11 && v61Var3.i && (i = v61Var3.f) >= 0) {
                    zArr[i] = !n0;
                }
            }
        }
        for (int i8 = 0; i8 < this.b.getChildCount(); i8++) {
            View childAt = this.b.getChildAt(i8);
            if (childAt instanceof sg2) {
                this.b.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0) {
                    v61 v61Var4 = (v61) arrayList.get(S);
                    if (v61Var4.a == 11) {
                        int i9 = v61Var4.f;
                        if (i9 < 0) {
                            ((sg2) childAt).c(!n0, true);
                        } else {
                            ((sg2) childAt).c(zArr[i9], true);
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
        l61 l61Var = this.N;
        boolean z4 = false;
        if (size > 0) {
            if (l61Var != null) {
                boolean isEmpty = this.e0.l.isEmpty();
                d71 d71Var = this.e0;
                if (!isEmpty) {
                    ArrayList arrayList = d71Var.b;
                    int size2 = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        t61 t61Var = (t61) obj;
                        if (this.e0.l.contains(Long.valueOf(t61Var.a))) {
                            i += t61Var.b;
                        }
                    }
                    int size3 = this.e0.j.size() - i;
                    d71 d71Var2 = this.e0;
                    if (size3 > 0) {
                        G = qd4.y(ob6.G(d71Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size())), ", ", ob6.G(size3, "Files", Integer.valueOf(size3)));
                    } else {
                        G = ob6.G(d71Var2.l.size(), "Chats", Integer.valueOf(this.e0.l.size()));
                    }
                } else {
                    G = ob6.G(d71Var.j.size(), "Files", Integer.valueOf(this.e0.j.size()));
                }
                String i02 = hl.i0(this.e0.k, false, false);
                jla jlaVar = this.simpleActionBar;
                boolean z5 = ob6.a0;
                jlaVar.r();
                in inVar = jlaVar.f;
                if (!z5 && jlaVar.A() && jlaVar.M) {
                    z = true;
                } else {
                    z = false;
                }
                inVar.c(i02, z, true);
                jla jlaVar2 = this.simpleActionBar;
                boolean z6 = ob6.a0;
                jlaVar2.r();
                if (jlaVar2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        in inVar2 = new in(jlaVar2.getContext(), true, true, true);
                        jlaVar2.h = inVar2;
                        inVar2.setTextSize(hl.L(14.0f));
                        jlaVar2.h.setTextColor(jlaVar2.l0);
                        jlaVar2.h.setGravity(19);
                        jlaVar2.h.setEllipsizeByGradient(true);
                        jlaVar2.h.b(0.35f, 320L, k43.h);
                        jlaVar2.addView(jlaVar2.h, jlaVar2.indexOfChild(jlaVar2.b), tre.e(-1, 18, 51));
                        jlaVar2.l();
                    }
                    this.N.f(true);
                    return;
                }
                in inVar3 = jlaVar2.h;
                if (inVar3 != null && inVar3.getTag() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                in inVar4 = jlaVar2.h;
                if (!z6 && jlaVar2.A() && jlaVar2.M) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                inVar4.c(G, z3, true);
                in inVar5 = jlaVar2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                inVar5.setTag(num);
                in inVar6 = jlaVar2.h;
                if (inVar6 != null && inVar6.getTag() != null) {
                    z4 = true;
                }
                if (z2 != z4) {
                    jlaVar2.requestLayout();
                }
                this.N.f(true);
                return;
            }
            return;
        }
        l61Var.f(false);
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
        w61 w61Var = this.X;
        long j10 = 0;
        boolean z = false;
        if (w61Var != null) {
            if (!this.L) {
                if (this.H > 0) {
                    y51[] y51VarArr = new y51[11];
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.g0;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        v61 v61Var = (v61) arrayList.get(i);
                        if (v61Var.a == 11) {
                            int i2 = v61Var.f;
                            boolean[] zArr = this.d;
                            if (i2 < 0) {
                                if (this.M) {
                                    long j11 = v61Var.g;
                                    boolean z2 = zArr[10];
                                    ?? obj = new Object();
                                    obj.c = j11;
                                    obj.b = z2;
                                    y51VarArr[10] = obj;
                                }
                            } else {
                                long j12 = v61Var.g;
                                boolean z3 = zArr[i2];
                                ?? obj2 = new Object();
                                obj2.c = j12;
                                obj2.b = z3;
                                y51VarArr[i2] = obj2;
                            }
                        }
                        i++;
                    }
                    if (System.currentTimeMillis() - this.b0 < 80) {
                        this.X.n.e(true, 0.0f);
                    }
                    this.X.e(this.H, true, y51VarArr);
                } else {
                    w61Var.e(0L, true, new y51[0]);
                }
            } else {
                w61Var.e(-1L, true, new y51[0]);
            }
        }
        r61 r61Var = this.Z;
        if (r61Var != null && !this.L) {
            z61 z61Var = r61Var.d;
            boolean[] zArr2 = z61Var.d;
            if (zArr2[0]) {
                j = z61Var.y;
            } else {
                j = 0;
            }
            if (zArr2[1]) {
                j2 = z61Var.E;
            } else {
                j2 = 0;
            }
            long j13 = j + j2;
            if (zArr2[2]) {
                j3 = z61Var.r;
            } else {
                j3 = 0;
            }
            long j14 = j13 + j3;
            if (zArr2[3]) {
                j4 = z61Var.x;
            } else {
                j4 = 0;
            }
            long j15 = j14 + j4;
            if (zArr2[4]) {
                j5 = z61Var.s;
            } else {
                j5 = 0;
            }
            long j16 = j15 + j5;
            if (zArr2[5]) {
                j6 = z61Var.w;
            } else {
                j6 = 0;
            }
            long j17 = j16 + j6;
            if (zArr2[6]) {
                j7 = z61Var.G;
            } else {
                j7 = 0;
            }
            long j18 = j17 + j7;
            if (zArr2[7]) {
                j8 = z61Var.f;
            } else {
                j8 = 0;
            }
            long j19 = j18 + j8;
            if (zArr2[8]) {
                j9 = z61Var.n;
            } else {
                j9 = 0;
            }
            long j20 = j19 + j9;
            if (zArr2[9]) {
                j10 = z61Var.F;
            }
            long j21 = j20 + j10;
            ArrayList arrayList2 = z61Var.g0;
            int i3 = 0;
            while (true) {
                if (i3 < arrayList2.size()) {
                    v61 v61Var2 = (v61) arrayList2.get(i3);
                    if (v61Var2.a == 11) {
                        int i4 = v61Var2.f;
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
            r61Var.a(j21, z);
        }
    }

    public final void z0() {
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
        view.setTranslationY(((-(1.0f - f)) * a.getCurrentActionBarHeight()) - ((1.0f - f2) * hl.L(44.0f)));
    }
}

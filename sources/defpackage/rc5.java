package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public class rc5 extends e implements fn7, s84, View.OnClickListener, i1d {
    public zp4 E;
    public boolean F;
    public gb0 G;
    public final long H;
    public final long I;
    public TLRPC.ChatFull J;
    public zh6 K;
    public final int L;
    public String M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public boolean T;
    public boolean U;
    public final int V;
    public final boolean W;
    public final boolean X;
    public zc5 Y;
    public zc5 Z;
    public final byte a;
    public zh6 a0;
    public final t84 b;
    public ArrayList b0;
    public final fm0 c;
    public zc5 c0;
    public vl4 d;
    public int d0;
    public a81 e;
    public w68 e0;
    public rq4 f;
    public boolean f0;
    public final HashSet g0;
    public ic5 h;
    public boolean h0;
    public boolean i0;
    public ArrayList j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public d79 n;
    public int n0;
    public int o0;
    public final Rect p0;
    public final tq3 q0;
    public x46 r;
    public final rz4 r0;
    public z2b s;
    public lhc s0;
    public final ArrayList t0;
    public final RectF u0;
    public final RectF v0;
    public pc5 w;
    public mc5 x;
    public lc5 y;

    public rc5(Bundle bundle) {
        super(bundle);
        byte b;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            b = 48;
        } else {
            b = 0;
        }
        this.a = b;
        k43 k43Var = k43.h;
        this.b = new t84(3, this, k43Var, 350L);
        this.c = new fm0(4, this, k43Var, 350L, false);
        this.a0 = new zh6();
        this.b0 = new ArrayList();
        this.g0 = new HashSet();
        this.m0 = -4;
        this.p0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.t0 = arrayList;
        RectF rectF = new RectF();
        this.u0 = rectF;
        RectF rectF2 = new RectF();
        this.v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i3 = bundle.getInt("chatType", 0);
        this.N = i3;
        this.O = bundle.getBoolean("forImport", false);
        boolean z = bundle.getBoolean("isAlwaysShare", false);
        this.P = z;
        boolean z2 = bundle.getBoolean("isNeverShare", false);
        this.Q = z2;
        boolean z3 = bundle.getBoolean("isCall", false);
        this.R = z3;
        boolean z4 = bundle.getBoolean("addToGroup", false);
        this.S = z4;
        this.V = bundle.getInt("chatAddType", 0);
        this.W = bundle.getBoolean("allowPremium", false);
        this.X = bundle.getBoolean("allowMiniapps", false);
        this.H = bundle.getLong("chatId");
        this.I = bundle.getLong("channelId");
        if (!z && !z2 && !z4) {
            if (z3) {
                this.L = getMessagesController().l4.E3.f() - 1;
            } else {
                if (i3 == 0) {
                    i = getMessagesController().Q2;
                } else {
                    i = getMessagesController().P2;
                }
                this.L = i;
            }
        } else {
            this.L = 0;
        }
        if (i2 >= 31) {
            this.q0 = new tq3(false);
            this.r0 = new rz4(null);
            return;
        }
        this.q0 = null;
        this.r0 = null;
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.Si));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.n6));
        hashSet.add(Integer.valueOf(aob.Ri));
        hashSet.add(Integer.valueOf(aob.Qi));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final a createActionBar(Context context) {
        a createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        this.U = false;
        this.T = false;
        this.b0.clear();
        this.a0.b();
        this.c0 = null;
        boolean z = this.S;
        int i3 = this.N;
        if (i3 == 2) {
            this.F = true;
        } else {
            this.F = !z;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.M);
        boolean z2 = this.Q;
        boolean z3 = this.P;
        boolean z4 = this.R;
        if (!isEmpty) {
            this.actionBar.setTitle(this.M);
        } else if (i3 == 2) {
            this.actionBar.setTitle(ob6.M0(2131752507, null));
        } else if (z4) {
            this.actionBar.setTitle(ob6.M0(2131748042, null));
        } else if (z) {
            int i4 = (this.I > 0L ? 1 : (this.I == 0L ? 0 : -1));
            a aVar = this.actionBar;
            if (i4 != 0) {
                aVar.setTitle(ob6.M0(2131752507, null));
            } else {
                aVar.setTitle(ob6.M0(2131749254, null));
            }
        } else {
            int i5 = this.V;
            if (z3) {
                a aVar2 = this.actionBar;
                if (i5 == 2) {
                    aVar2.setTitle(ob6.M0(2131750770, null));
                } else if (i5 == 1) {
                    aVar2.setTitle(ob6.M0(2131754262, null));
                } else {
                    aVar2.setTitle(ob6.M0(2131754260, null));
                }
            } else if (z2) {
                a aVar3 = this.actionBar;
                if (i5 == 2) {
                    aVar3.setTitle(ob6.M0(2131750694, null));
                } else if (i5 == 1) {
                    aVar3.setTitle(ob6.M0(2131748046, null));
                } else {
                    aVar3.setTitle(ob6.M0(2131748044, null));
                }
            } else {
                a aVar4 = this.actionBar;
                if (i3 == 0) {
                    i = 2131748027;
                } else {
                    i = 2131748043;
                }
                aVar4.setTitle(ob6.M0(i, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 24));
        this.f = new rq4(context, this.resourceProvider);
        zc zcVar = new zc((byte) 25, context, this);
        this.fragmentView = zcVar;
        zcVar.setFocusableInTouchMode(true);
        zcVar.setDescendantFocusability(131072);
        ic5 ic5Var = new ic5(this, context, this.currentAccount);
        this.h = ic5Var;
        ic5Var.setDelegate(new ec5(this, (byte) 0));
        this.h.getSpansContainer().setOnClickListener(new fc5(this, (byte) 1));
        ic5 ic5Var2 = this.h;
        this.a0 = ic5Var2.b;
        this.b0 = ic5Var2.c;
        w0();
        this.f.r.setOnEditorActionListener(new j(this, (byte) 12));
        this.f.r.setOnKeyListener(new jc5(this, (byte) 0));
        this.f.r.addTextChangedListener(new c7(this, (byte) 25));
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            s0(arrayList, this.k0, this.l0);
        }
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(6);
        tk4Var.x = false;
        z2b z2bVar = new z2b(context, tk4Var, 1, null);
        this.s = z2bVar;
        z2bVar.addView(tk4Var);
        this.s.e(true, false);
        this.s.d.setText(ob6.M0(2131747898, null));
        this.r = new x46(1, false);
        d79 d79Var = new d79(context, null);
        this.n = d79Var;
        d79Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        d79 d79Var2 = this.n;
        pc5 pc5Var = new pc5(this, context);
        this.w = pc5Var;
        d79Var2.setAdapter(pc5Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        d79 d79Var3 = this.n;
        if (ob6.a0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        d79Var3.setVerticalScrollbarPosition(i2);
        d79 d79Var4 = this.n;
        float f = -this.a;
        zcVar.addView(d79Var4, tre.d(-1, -1.0f, 119, 0.0f, f, 0.0f, f));
        zcVar.addView(this.s);
        this.n.setOnItemClickListener(new l0(this, context, (byte) 13));
        this.n.setOnScrollListener(new to2(this, (byte) 17));
        d79 d79Var5 = this.n;
        d79Var5.X1 = true;
        d79Var5.Y1 = false;
        zp4 zp4Var = new zp4(this.resourceProvider, context, false);
        this.E = zp4Var;
        if (!z2 && !z3 && !z) {
            gd0 gd0Var = new gd0(false);
            gd0Var.l = (short) 180;
            gd0Var.invalidateSelf();
            this.E.c.setImageDrawable(gd0Var);
        } else {
            zp4Var.c.setImageResource(2131231198);
        }
        if (!z4) {
            zcVar.addView(this.E, zp4.b());
        }
        this.E.setOnClickListener(new fc5(this, (byte) 2));
        this.E.e(this.F, false);
        this.E.setContentDescription(ob6.M0(2131747981, null));
        if (z4) {
            this.G = new gb0(this, context);
            View view = new View(context);
            yob.h(aob.d7, this.resourceProvider, view);
            this.G.addView(view, tre.d(-1, 1.0f / hl.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(hl.L(14.0f), hl.L(14.0f), hl.L(14.0f), hl.L(14.0f));
            this.G.addView(linearLayout, tre.e(-1, -2, 87));
            c51 c51Var = new c51(this.resourceProvider, context, true);
            c51Var.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new wm2(2131232638, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131749235, null));
            c51Var.i(spannableStringBuilder, false, true);
            linearLayout.addView(c51Var, tre.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            c51Var.setOnClickListener(new fc5(this, (byte) 3));
            c51 c51Var2 = new c51(this.resourceProvider, context, true);
            c51Var2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new wm2(2131232640, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131749236, null));
            c51Var2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(c51Var2, tre.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            c51Var2.setOnClickListener(new fc5(this, (byte) 4));
            zcVar.addView(this.G, tre.e(-1, -2, 87));
            h0();
        }
        x0();
        vl4 vl4Var = new vl4(this, context);
        this.d = vl4Var;
        zcVar.addView(vl4Var, tre.e(-1, 0, 48));
        zcVar.addView(this.actionBar);
        zcVar.addView(this.f, tre.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        zcVar.addView(this.h);
        d79 d79Var6 = this.n;
        Objects.requireNonNull(d79Var6);
        this.s0 = new lhc(d79Var6, zcVar, new hc5(d79Var6, (byte) 0));
        this.n.F0(new gc5(this, (byte) 3));
        a81 a81Var = new a81(context, this.parentLayout);
        this.e = a81Var;
        ((fm0) a81Var.c).a(false, false);
        zcVar.addView(this.e, tre.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        View view2 = this.fragmentView;
        ec5 ec5Var = new ec5(this, (byte) 3);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view2, ec5Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.N) {
            pc5 pc5Var = this.w;
            if (pc5Var != null) {
                pc5Var.f();
            }
        } else if (i == 2) {
            if (this.n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.n.getChildCount();
                int i3 = uc7.s5;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.n.getChildAt(i4);
                        if (childAt instanceof bd5) {
                            ((bd5) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i == jn7.R) {
            removeSelfFromStack();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        tq3 tq3Var;
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (tq3Var = this.q0) != null) {
            int L = hl.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + hl.L(48.0f) + this.d0;
            RectF rectF = this.u0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f = -L;
            rectF.inset(0.0f, f);
            if (this.G != null) {
                RectF rectF2 = this.v0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f);
            }
            if (this.G != null && this.c.e > 0.0f) {
                i = 2;
            } else {
                i = 1;
            }
            tq3Var.g(i, this.t0);
            tq3Var.e(this.s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean g0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc5.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.n, 4, new Class[]{bd5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.Ri));
        arrayList.add(new apb(this.n, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.i7));
        arrayList.add(new apb(this.n, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.j7));
        arrayList.add(new apb(this.n, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        arrayList.add(new apb(this.h.getSpansContainer(), 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ti));
        arrayList.add(new apb(this.h.getSpansContainer(), 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ui));
        arrayList.add(new apb(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.y6));
        if (this.e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    public final void h0() {
        int i;
        gb0 gb0Var = this.G;
        if (gb0Var == null) {
            return;
        }
        float f = this.c.e;
        gb0Var.setTranslationY((1.0f - f) * hl.L(12.0f));
        this.G.setAlpha(f);
        gb0 gb0Var2 = this.G;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        gb0Var2.setVisibility(i);
    }

    public final void i0() {
        zp4 zp4Var = this.E;
        if (zp4Var != null) {
            zp4Var.setTranslationY(-Math.max(this.n0, this.o0));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.n.a1()) {
            this.n.setClipBounds(null);
            return;
        }
        int i = this.n0;
        byte b = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + hl.L(b + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int x = qu6.x(b, this.n.getMeasuredHeight(), (int) ((hl.L(76.0f) + i) * this.c.e));
        Rect rect = this.p0;
        rect.set(0, measuredHeight, measuredWidth, x);
        this.n.setClipBounds(rect);
    }

    public final void k0() {
        int i;
        byte b;
        if (this.R) {
            i = hl.L(76.0f);
        } else {
            i = 0;
        }
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + hl.L(b + 48) + ((int) this.b.f), 0, hl.L(this.a) + this.n0 + i);
        this.s.setPadding(0, 0, 0, this.n0);
    }

    public final void l0() {
        String M0;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        int childCount = this.n.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.n.getChildAt(i);
            if (childAt instanceof bd5) {
                bd5 bd5Var = (bd5) childAt;
                Object object = bd5Var.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    if (object instanceof String) {
                        String str = (String) object;
                        if ("premium".equalsIgnoreCase(str)) {
                            if (this.Y != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bd5Var.c(z2, true);
                            bd5Var.setCheckBoxEnabled(true);
                        } else if ("miniapps".equalsIgnoreCase(str)) {
                            if (this.Z != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bd5Var.c(z, true);
                            bd5Var.setCheckBoxEnabled(true);
                        }
                    }
                    j = 0;
                }
                if (j != 0) {
                    zh6 zh6Var = this.K;
                    if (zh6Var != null && zh6Var.h(j) >= 0) {
                        bd5Var.c(true, false);
                        bd5Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.a0.h(j) >= 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bd5Var.c(z3, true);
                        bd5Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof p55) {
                this.n.getClass();
                if (RecyclerView.S(childAt) == this.w.w) {
                    p55 p55Var = (p55) childAt;
                    if (this.Y == null && this.a0.i()) {
                        M0 = "";
                    } else {
                        M0 = ob6.M0(2131751422, null);
                    }
                    p55Var.a(M0, new fc5(this, (byte) 0));
                }
            }
        }
    }

    public final void m0(Canvas canvas, RectF rectF, Paint paint) {
        rz4 rz4Var;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && xea.f() && (rz4Var = this.r0) != null) {
            rz4Var.e(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    public final HashSet n0() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.a0.m(); i++) {
            hashSet.add(Long.valueOf(this.a0.j(i)));
        }
        return hashSet;
    }

    @Override
    public final void o(l2d l2dVar) {
        this.o0 = l2dVar.a.f(8).d;
        i0();
    }

    public final void o0(Context context, View view, int i) {
        long j;
        String str;
        v21 K;
        boolean z;
        pc5 pc5Var = this.w;
        if (i == pc5Var.x) {
            int i2 = this.currentAccount;
            vnb vnbVar = this.resourceProvider;
            gc5 gc5Var = new gc5(this, (byte) 0);
            id idVar = new id(3, null, context);
            idVar.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i2).sendRequest(createconferencecall, new eu0(i2, idVar, context, vnbVar, gc5Var, (byte) 1));
            return;
        }
        long j2 = this.I;
        if (i == 0 && pc5Var.G != 0 && !pc5Var.n) {
            TLRPC.ChatFull chatFull = this.J;
            if (j2 != 0) {
                z = true;
            } else {
                z = false;
            }
            w68 w68Var = new w68(context, this, chatFull, this.H, z);
            this.e0 = w68Var;
            showDialog(w68Var);
        } else if (view instanceof bd5) {
            bd5 bd5Var = (bd5) view;
            if (bd5Var.r) {
                zc5 zc5Var = this.Y;
                if (zc5Var == null) {
                    zc5 zc5Var2 = new zc5(this.f.r.getContext(), "premium");
                    this.Y = zc5Var2;
                    this.h.a(zc5Var2);
                    this.Y.setOnClickListener(this);
                } else {
                    this.h.c(zc5Var);
                    this.Y = null;
                }
                l0();
            } else if (bd5Var.s) {
                zc5 zc5Var3 = this.Z;
                if (zc5Var3 == null) {
                    zc5 zc5Var4 = new zc5(this.f.r.getContext(), "miniapps");
                    this.Z = zc5Var4;
                    this.h.a(zc5Var4);
                    this.Z.setOnClickListener(this);
                } else {
                    this.h.c(zc5Var3);
                    this.Z = null;
                }
                l0();
            } else {
                Object object = bd5Var.getObject();
                boolean z2 = object instanceof TLRPC.User;
                if (z2) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    return;
                }
                zh6 zh6Var = this.K;
                if (zh6Var == null || zh6Var.h(j) < 0) {
                    if (bd5Var.P) {
                        int i3 = -this.m0;
                        this.m0 = i3;
                        hl.A3(i3, bd5Var, null);
                        yw0.APP_ERROR.a();
                        if (j >= 0) {
                            str = lbc.r(uc7.s1(this.currentAccount).X1(Long.valueOf(j)));
                        } else {
                            str = "";
                        }
                        if (uc7.s1(this.currentAccount).M3()) {
                            K = d31.b0(this).Q(2131624211, 36, hl.S2(ob6.a0(null, null, 2131743415, str)));
                        } else {
                            K = d31.b0(this).K(2131624211, hl.S2(ob6.a0(null, null, 2131743415, str)), ob6.M0(2131743414, null), new gc5(this, (byte) 2));
                        }
                        K.j();
                        return;
                    }
                    zc5 zc5Var5 = (zc5) this.a0.f(j);
                    if (zc5Var5 != null) {
                        this.h.c(zc5Var5);
                    } else {
                        int i4 = this.L;
                        if (i4 == 0 || this.a0.m() != i4) {
                            if (this.N == 0 && this.a0.m() == getMessagesController().O2) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                                String M0 = ob6.M0(2131689472, null);
                                id idVar2 = alertDialog$Builder.a;
                                idVar2.S = M0;
                                idVar2.U = ob6.M0(2131745022, null);
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                showDialog(idVar2);
                                return;
                            }
                            if (z2) {
                                TLRPC.User user = (TLRPC.User) object;
                                if (this.S && user.bot) {
                                    if (j2 == 0) {
                                        if (user.bot_nochats) {
                                            try {
                                                d31.b0(this).t(ob6.M0(2131753101, null), null).j();
                                                return;
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                                return;
                                            }
                                        }
                                    } else {
                                        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j2));
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                                        boolean w = xc2.w(4, M02);
                                        id idVar3 = alertDialog$Builder2.a;
                                        if (w) {
                                            idVar3.S = ob6.M0(2131754454, null);
                                            idVar3.U = ob6.M0(2131754453, null);
                                            alertDialog$Builder2.j(ob6.M0(2131754459, null), new u34(this, user, (byte) 6));
                                            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                        } else {
                                            idVar3.U = ob6.M0(2131752547, null);
                                            alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                                        }
                                        showDialog(idVar3);
                                        return;
                                    }
                                }
                                getMessagesController().i4(user, !this.U, false);
                            } else if (object instanceof TLRPC.Chat) {
                                getMessagesController().a4((TLRPC.Chat) object, !this.U);
                            }
                            zc5 zc5Var6 = new zc5(this.f.r.getContext(), object);
                            this.h.a(zc5Var6);
                            zc5Var6.setOnClickListener(this);
                        } else {
                            return;
                        }
                    }
                    x0();
                    if (!this.U && !this.T) {
                        l0();
                    } else {
                        hl.E3(this.f.r);
                    }
                    if (this.f.r.length() > 0) {
                        this.f.r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!g0(z)) {
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onClick(View view) {
        zc5 zc5Var = (zc5) view;
        if (zc5Var.E) {
            this.c0 = null;
            this.h.c(zc5Var);
            x0();
            l0();
            return;
        }
        zc5 zc5Var2 = this.c0;
        if (zc5Var2 != null) {
            zc5Var2.a();
        }
        this.c0 = zc5Var;
        zc5Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.N);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, jn7.R);
        getUserConfig().s();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.N);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            rq4 rq4Var = this.f;
            if (rq4Var != null) {
                rq4Var.updateColors();
            }
            zp4 zp4Var = this.E;
            if (zp4Var != null) {
                zp4Var.updateColors();
            }
            y0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.a0.m(); i2++) {
            arrayList.add(getMessagesController().X1(Long.valueOf(this.a0.j(i2))));
        }
        lc5 lc5Var = this.y;
        if (lc5Var != null) {
            lc5Var.f(i, arrayList);
        }
        finishFragment();
    }

    public final boolean r0() {
        boolean z;
        int L;
        int L2;
        boolean i = this.a0.i();
        boolean z2 = this.S;
        int i2 = this.N;
        boolean z3 = false;
        if (!i || i2 == 2 || !z2) {
            long j = this.H;
            if (z2) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String G = ob6.G(this.a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = G;
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < this.a0.m(); i3++) {
                        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.a0.j(i3)));
                        if (X1 != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append("**");
                            sb.append(lv2.m(0, X1.first_name, X1.last_name));
                            sb.append("**");
                        }
                    }
                    uc7 messagesController = getMessagesController();
                    if (j == 0) {
                        j = this.I;
                    }
                    TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
                    String str = "";
                    if (this.a0.m() > 5) {
                        int m = this.a0.m();
                        if (M0 != null) {
                            str = M0.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.G(m, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.a0.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new y7c(hl.o()), indexOf, format.length() + indexOf, 33);
                        }
                        idVar.U = spannableStringBuilder;
                    } else {
                        if (M0 != null) {
                            str = M0.title;
                        }
                        idVar.U = hl.S2(ob6.a0(null, null, 2131754392, sb, str));
                    }
                    sg2[] sg2VarArr = new sg2[1];
                    if (!xc2.T(M0)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        sg2 sg2Var = new sg2(1, this.resourceProvider, getParentActivity());
                        sg2VarArr[0] = sg2Var;
                        sg2Var.setBackground(aob.L0(false));
                        sg2VarArr[0].setMultiline(true);
                        if (this.a0.m() == 1) {
                            sg2VarArr[0].e(hl.S2(ob6.a0(null, null, 2131754386, lbc.k(getMessagesController().X1(Long.valueOf(this.a0.j(0))), true))), "", true, false, false);
                        } else {
                            sg2VarArr[0].e(ob6.M0(2131754391, null), "", true, false, false);
                        }
                        sg2 sg2Var2 = sg2VarArr[0];
                        if (ob6.a0) {
                            L = hl.L(16.0f);
                        } else {
                            L = hl.L(8.0f);
                        }
                        if (ob6.a0) {
                            L2 = hl.L(8.0f);
                        } else {
                            L2 = hl.L(16.0f);
                        }
                        sg2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(sg2VarArr[0], tre.o(-1, -2));
                        sg2VarArr[0].setOnClickListener(new je(sg2VarArr, (byte) 3));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.j(ob6.M0(2131754479, null), new u34(this, sg2VarArr, (byte) 7));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar);
                    return true;
                }
            } else if (i2 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i4 = 0; i4 < this.a0.m(); i4++) {
                    arrayList.add(getMessagesController().q1(getMessagesController().X1(Long.valueOf(this.a0.j(i4)))));
                }
                uc7 messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.h1(j);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new p87(messagesController2, tL_channels_inviteToChannel, j, (byte) 7));
                }
                getNotificationCenter().k(jn7.s, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new zu1(bundle), true);
                return true;
            } else if (this.F) {
                if (z2) {
                    p0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < this.a0.m(); i5++) {
                    arrayList2.add(Long.valueOf(this.a0.j(i5)));
                }
                if (!this.P && !this.Q) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i6 = 0; i6 < size; i6++) {
                        jArr[i6] = ((Long) arrayList2.get(i6)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i2);
                    bundle2.putBoolean("forImport", this.O);
                    presentFragment(new xc5(bundle2));
                    return true;
                }
                mc5 mc5Var = this.x;
                if (mc5Var != null) {
                    if (this.Y != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.Z != null) {
                        z3 = true;
                    }
                    mc5Var.a(arrayList2, z, z3);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void s0(ArrayList arrayList, boolean z, boolean z2) {
        Object X1;
        HashSet hashSet = this.g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.h0 = z;
        this.i0 = z2;
        ic5 ic5Var = this.h;
        if (ic5Var == null) {
            this.j0 = arrayList;
            this.k0 = z;
            this.l0 = z2;
            return;
        }
        zc5 zc5Var = this.Y;
        if (z) {
            if (zc5Var == null) {
                zc5 zc5Var2 = new zc5(getParentActivity(), "premium");
                this.Y = zc5Var2;
                this.h.a(zc5Var2);
                this.Y.setOnClickListener(this);
            }
        } else if (zc5Var != null) {
            ic5Var.c(zc5Var);
            this.Y = null;
        }
        zc5 zc5Var3 = this.Z;
        if (z2) {
            if (zc5Var3 == null) {
                zc5 zc5Var4 = new zc5(getParentActivity(), "miniApps");
                this.Z = zc5Var4;
                this.h.a(zc5Var4);
                this.Z.setOnClickListener(this);
            }
        } else if (zc5Var3 != null) {
            this.h.c(zc5Var3);
            this.Z = null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            long longValue = l.longValue();
            if (longValue < 0) {
                X1 = getMessagesController().M0(Long.valueOf(-longValue));
            } else {
                X1 = getMessagesController().X1(l);
            }
            if (X1 != null) {
                zc5 zc5Var5 = new zc5(getParentActivity(), X1);
                this.h.a(zc5Var5);
                zc5Var5.setOnClickListener(this);
            }
        }
        uq4 uq4Var = this.h.d;
        AnimatorSet animatorSet = uq4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            uq4Var.a.setupEndValues();
            uq4Var.a.cancel();
        }
        hl.V3(this.n);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 3) {
            int paddingTop = this.n.getPaddingTop();
            k0();
            rq4 rq4Var = this.f;
            t84 t84Var2 = this.b;
            rq4Var.setTranslationY(t84Var2.f);
            j0();
            this.e.setTranslationY(hl.L(48.0f) + t84Var2.f);
            this.d.invalidate();
            int paddingTop2 = this.n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((fm0) this.e.c).f) {
                this.n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i == 4) {
            h0();
            j0();
        }
    }

    public final void t0(int i) {
        if (this.isPaused) {
            return;
        }
        hl.K(this.n, new hl3(this, i, (byte) 15));
    }

    public final void u0() {
        if (this.G == null) {
            return;
        }
        this.c.a(!this.a0.i(), true);
    }

    public final void w0() {
        pc5 pc5Var;
        m7 m7Var = this.f.r;
        if (m7Var == null) {
            return;
        }
        if (this.N == 2) {
            m7Var.setHint(ob6.M0(2131754389, null));
        } else if (!this.S && ((pc5Var = this.w) == null || pc5Var.H != 0)) {
            if (!this.P && !this.Q) {
                if (this.R) {
                    m7Var.setHint(ob6.M0(2131748041, null));
                    return;
                } else {
                    m7Var.setHint(ob6.M0(2131745323, null));
                    return;
                }
            }
            m7Var.setHint(ob6.M0(2131745496, null));
        } else {
            m7Var.setHint(ob6.M0(2131745497, null));
        }
    }

    public final void x0() {
        boolean z = this.P;
        int i = this.N;
        boolean z2 = this.S;
        if (!z && !this.Q && !z2) {
            if (i == 2) {
                this.actionBar.setSubtitle(ob6.G(this.a0.m(), "Members", new Object[0]));
            } else {
                boolean i2 = this.a0.i();
                int i3 = this.L;
                if (i2) {
                    this.actionBar.setSubtitle(ob6.a0(null, null, 2131748373, ob6.G(i3 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(ob6.J0(this.a0.m(), "MembersCountSelected"), Integer.valueOf(this.a0.m()), Integer.valueOf(i3)));
                }
            }
        }
        if (i != 2 && z2) {
            if (this.F && this.b0.isEmpty()) {
                this.E.e(false, true);
                this.F = false;
            } else if (!this.F && !this.b0.isEmpty()) {
                this.E.e(true, true);
                this.F = true;
            }
        }
    }

    public final void y0() {
        try {
            d79 d79Var = this.n;
            if (d79Var != null) {
                d79Var.y1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            ic5 ic5Var = this.h;
            if (ic5Var != null && ic5Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i = 0; i < spansContainer.getChildCount(); i++) {
                    View childAt = spansContainer.getChildAt(i);
                    if (childAt instanceof zc5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void P() {
    }

    @Override
    public final void w() {
    }

    public void q0(HashSet hashSet) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}

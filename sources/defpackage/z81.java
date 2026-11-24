package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class z81 extends d implements gk7, zg6 {
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public fj3 I;
    public FrameLayout J;
    public p81 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public wtc O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public jo0 a;
    public t26 b;
    public q5c c;
    public View d;
    public cu6 e;
    public un4 f;
    public pi4 h;
    public n81 n;
    public boolean r;
    public boolean s;
    public xha w;
    public final ArrayList x;
    public boolean y;

    public z81(Bundle bundle) {
        super(bundle);
        this.r = true;
        this.x = new ArrayList();
        this.H = new ArrayList();
    }

    public static void j0(d dVar) {
        dVar.presentFragment(new t81(ir2.l("isCall", true), dVar.getCurrentAccount(), dVar));
    }

    public static void l0(final Context context, int i, TLRPC.InputGroupCall inputGroupCall, String str, final wjb wjbVar, boolean z, final boolean z2) {
        String str2;
        int i2;
        int i3 = bkb.g5;
        int v0 = bkb.v0(i3, wjbVar);
        final fx0 fx0Var = new fx0(1, wjbVar, context, false);
        fx0Var.s0(v0);
        fx0Var.L(v0);
        fx0Var.t0(i3);
        fx0Var.M(i3);
        final String[] strArr = {str};
        LinearLayout j = de9.j(context, 1);
        j.setPadding(0, 0, 0, gl.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j.addView(frameLayout, nme.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232771);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, nme.e(-1, -1, 17));
        int L = gl.L(80.0f);
        int i4 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i4, wjbVar));
        vkb M = zkb.M(i4);
        frameLayout2.setBackground(K);
        zkb.j(frameLayout2, K, M, null, wjbVar);
        frameLayout.addView(frameLayout2, nme.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231247);
        int i5 = bkb.x6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView2, i5, wjbVar, mode);
        int i6 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i6, wjbVar), 1, -1);
        vkb M2 = zkb.M(i6);
        imageView2.setBackground(f0);
        zkb.j(imageView2, f0, null, M2, wjbVar);
        if (z2) {
            frameLayout.addView(imageView2, nme.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i7 = bkb.F6;
        l46 a = hve.a(context, 20.0f, i7, true, wjbVar);
        a.setText(k96.M0(2131749280, null));
        a.setGravity(17);
        j.addView(a, nme.t(-1, -2, 17, 32, 16, 32, 8));
        l46 a2 = hve.a(context, 14.0f, i7, false, wjbVar);
        a2.setText(k96.M0(2131749281, null));
        a2.setGravity(17);
        a2.setMaxWidth(je5.a(a2.getText(), a2.getPaint()));
        j.addView(a2, nme.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ote.b(frameLayout3, 0.01f, 1.2f);
        int i8 = bkb.Z6;
        ff0 Z = bkb.Z(bkb.v0(i8, wjbVar), bkb.v(bkb.v0(i8, wjbVar), bkb.v0(i6, wjbVar)), 12, 12);
        vkb M3 = zkb.M(i8);
        vkb p = zkb.p(i8, i6);
        frameLayout3.setBackground(Z);
        zkb.j(frameLayout3, Z, M3, p, wjbVar);
        j.addView(frameLayout3, nme.t(-1, -2, 7, 16, 0, 16, 0));
        l46 a3 = hve.a(context, 13.0f, i7, false, wjbVar);
        a3.setPadding(gl.L(16.0f), gl.L(14.0f), 0, gl.L(14.0f));
        a3.setText(str2);
        frameLayout3.addView(a3, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231247));
        imageView3.setContentDescription(k96.M0(2131754838, null));
        imageView3.setScaleType(scaleType);
        zkb.s(imageView3, bkb.q5, wjbVar, mode);
        frameLayout3.addView(imageView3, nme.e(40, 48, 21));
        LinearLayout j2 = de9.j(context, 0);
        j.addView(j2, nme.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) k96.M0(2131749288, null));
        spannableStringBuilder.setSpan(new cm2(2131232109, 0), 0, 1, 33);
        u41Var.i(spannableStringBuilder, false, true);
        j2.addView(u41Var, nme.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        u41 u41Var2 = new u41(wjbVar, context, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) k96.M0(2131749282, null));
        spannableStringBuilder2.setSpan(new cm2(2131232369, 0), 0, 1, 33);
        u41Var2.i(spannableStringBuilder2, false, true);
        j2.addView(u41Var2, nme.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        fx0[] fx0VarArr = new fx0[1];
        if (z) {
            q81 q81Var = new q81(context, wjbVar);
            q81Var.setGravity(17);
            zkb.X(q81Var, bkb.y6, wjbVar);
            q81Var.setText(" " + k96.M0(2131749287, null) + " ");
            q81Var.setTextSize(14.0f);
            j.addView(q81Var, nme.t(190, -2, 1, 28, 12, 28, 8));
            i2 = i;
            va7 va7Var = new va7(str, i2, fx0VarArr, (byte) 9);
            l46 a4 = hve.a(context, 14.0f, i7, false, wjbVar);
            a4.setText(gl.D2(gl.N2(k96.M0(2131749286, null), -1, 0, va7Var, null), true));
            a4.setGravity(17);
            a4.setMaxWidth(je5.a(a4.getText(), a4.getPaint()));
            j.addView(a4, nme.t(-1, -2, 17, 32, 8, 32, 12));
            ote.b(a4, 0.05f, 1.2f);
            a4.setOnClickListener(new j1(va7Var, (byte) 28));
        } else {
            i2 = i;
        }
        fx0Var.O = j;
        fx0Var.show();
        fx0VarArr[0] = fx0Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r4;
                wjb wjbVar2 = wjbVar;
                fx0 fx0Var2 = fx0Var;
                String[] strArr2 = strArr;
                switch (b) {
                    case 0:
                        gl.g(strArr2[0]);
                        new u21(fx0Var2.F, wjbVar2).i(k96.M0(2131748729, null)).j();
                        return;
                    default:
                        gl.g(strArr2[0]);
                        new u21(fx0Var2.F, wjbVar2).i(k96.M0(2131748729, null)).j();
                        return;
                }
            }
        });
        u41Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r4;
                wjb wjbVar2 = wjbVar;
                fx0 fx0Var2 = fx0Var;
                String[] strArr2 = strArr;
                switch (b) {
                    case 0:
                        gl.g(strArr2[0]);
                        new u21(fx0Var2.F, wjbVar2).i(k96.M0(2131748729, null)).j();
                        return;
                    default:
                        gl.g(strArr2[0]);
                        new u21(fx0Var2.F, wjbVar2).i(k96.M0(2131748729, null)).j();
                        return;
                }
            }
        });
        final qt qtVar = new qt(inputGroupCall, i2, strArr, frameLayout3, a3, fx0Var, wjbVar, (byte) 2);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                fx0 fx0Var2 = fx0.this;
                ww0 ww0Var = fx0Var2.c;
                wjb wjbVar2 = wjbVar;
                cs5 G = cs5.G(ww0Var, wjbVar2, frameLayout3);
                String M0 = k96.M0(2131751755, null);
                String[] strArr2 = strArr;
                G.b(2131232108, M0, new fv0(strArr2, fx0Var2, wjbVar2, (byte) 13), false);
                G.b(2131232325, k96.M0(2131750456, null), new q21(context, strArr2, (byte) 5), false);
                G.l(2131232113, qtVar, k96.M0(2131745830, null), z2, true);
                G.a0();
            }
        });
        u41Var2.setOnClickListener(new og(context, str, strArr, wjbVar, fx0Var, (byte) 3));
        if (z2) {
            imageView2.setOnClickListener(new ee(fx0Var, wjbVar, imageView2, qtVar, (byte) 7));
        }
    }

    @Override
    public final lx4 A() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        return true;
    }

    public final void Z(ArrayList arrayList, v81 v81Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean e0 = e0(arrayList);
        ArrayList arrayList2 = this.H;
        if (e0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id));
            }
            wf2 wf2Var = v81Var.e;
            if (wf2Var != null) {
                wf2Var.a(false, true);
            }
            n0();
            return;
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i2)).id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        wf2 wf2Var2 = v81Var.e;
        if (wf2Var2 != null) {
            wf2Var2.a(true, true);
        }
        n0();
    }

    public final void a0() {
        this.f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.q7));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.o6));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.z9));
        hashSet.add(Integer.valueOf(bkb.Yl));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.b7));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0() {
        q5c q5cVar = this.c;
        io5 io5Var = this.mSystemInsets;
        dg0.e(q5cVar, io5Var.b, io5Var.d, a.getCurrentActionBarHeight() + ((int) this.I.c(gl.L(7.0f))), this.P);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + a.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.I.c(gl.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (dg0.d(this.mSystemInsets.b) - gl.L(14.0f)) - gl.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.S + this.P);
    }

    public final void c0(int i, int i2) {
        if (this.y) {
            return;
        }
        this.y = true;
        jo0 jo0Var = this.a;
        if (jo0Var != null && !this.E) {
            jo0Var.d();
        }
        q5c q5cVar = this.c;
        if (q5cVar != null) {
            q5cVar.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i2;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new tf(this, (byte) 10), 2), this.classGuid);
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        if (!this.s) {
            this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        }
        this.simpleActionBar.setTitle(k96.M0(2131752584, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 15));
        xha a = this.simpleActionBar.t().a(10, 2131231247);
        this.w = a;
        a.setContentDescription(k96.M0(2131754838, null));
        a8 e = this.w.e(3, 2131232113, k96.M0(2131751577, null));
        int i2 = bkb.o7;
        e.d(getThemedColor(i2), getThemedColor(i2));
        q5c q5cVar = new q5c(this, new f(this, (byte) 21), new m81(this), new m81(this));
        this.c = q5cVar;
        q5cVar.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        n81 n81Var = new n81((byte) 0, context, this);
        this.n = n81Var;
        this.fragmentView = n81Var;
        pi4 pi4Var = new pi4(context, null);
        this.h = pi4Var;
        pi4Var.setViewType(8);
        zkb.h(bkb.Z6, null, this.h);
        this.h.x = false;
        this.a = new jo0(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        q5c q5cVar2 = this.c;
        t26 t26Var = new t26(1, false);
        this.b = t26Var;
        q5cVar2.setLayoutManager(t26Var);
        q5c q5cVar3 = this.c;
        if (k96.a0) {
            i = 1;
        } else {
            i = 2;
        }
        q5cVar3.setVerticalScrollbarPosition(i);
        cu6 cu6Var = new cu6(this.c, this.b);
        this.e = cu6Var;
        qw4 qw4Var = this.glassEngine;
        Objects.requireNonNull(qw4Var);
        cu6Var.n = new sg0(qw4Var, (byte) 24);
        this.n.addView(this.c, nme.e(-1, -1, 3));
        this.n.addView(this.a, nme.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, nme.e(-1, 0, 48));
        this.c.setOnScrollListener(new o81(this));
        boolean z = this.y;
        jo0 jo0Var = this.a;
        if (z) {
            jo0Var.d();
        } else {
            jo0Var.e();
        }
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.f = un4Var;
        un4Var.c.setImageResource(2131231092);
        this.f.setContentDescription(k96.M0(2131752622, null));
        this.f.setOnClickListener(new d81(this, (byte) 1));
        this.n.addView(this.f, un4.b());
        fj3 fj3Var = new fj3(context);
        this.I = fj3Var;
        fj3Var.setPadding(gl.L(11.0f), gl.L(7.0f) + gl.L(14.0f), gl.L(11.0f), gl.L(7.0f) + gl.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new e81(this, (byte) 1));
        fj3 fj3Var2 = this.I;
        il0 c = getBaseSimpleGlass().c.c(this.I, null, false);
        c.p(nod.n(this.resourceProvider));
        c.r(gl.L(24.0f));
        c.q(gl.L(7.0f));
        fj3Var2.setBlurredBackground(c);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.j(this.J, true, false);
        p81 p81Var = new p81(this, context, this, this.n, this.resourceProvider);
        this.K = p81Var;
        this.J.addView(p81Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, nme.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new s10(this, (byte) 3));
        if (this.s) {
            View view2 = this.fragmentView;
            m81 m81Var = new m81(this);
            WeakHashMap weakHashMap = jdc.a;
            bdc.i(view2, m81Var);
        }
        return this.fragmentView;
    }

    public final void d0(boolean z) {
        wf2 wf2Var;
        this.simpleActionBar.w();
        this.H.clear();
        int childCount = this.c.getChildCount();
        int i = 0;
        while (true) {
            q5c q5cVar = this.c;
            if (i < childCount) {
                View childAt = q5cVar.getChildAt(i);
                if ((childAt instanceof v81) && (wf2Var = ((v81) childAt).e) != null) {
                    wf2Var.a(false, z);
                }
                i++;
            } else {
                q5cVar.g3.O(true);
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final boolean e0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void f0(org.telegram.tgnet.TLObject r18, org.telegram.tgnet.TLRPC.TL_error r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.f0(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public final void g0(hd hdVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        hdVar.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().b4(groupcall.users, false);
            getMessagesController().V3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new q03(getParentActivity(), hashSet));
            } else {
                rgc.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
            }
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                showDialog(new q03(getParentActivity(), hashSet));
            } else {
                u21.b0(this).g0(tL_error, false);
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.c, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, bkb.g6));
        un4 un4Var = this.f;
        if (un4Var != null) {
            arrayList.add(new blb(un4Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.N9));
            arrayList.add(new blb(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.O9));
            arrayList.add(new blb(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.P9));
        }
        return arrayList;
    }

    public final void h0(hd hdVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        hdVar.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().b4(groupcall.users, false);
            getMessagesController().V3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new q03(getParentActivity(), hashSet));
            } else {
                rgc.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
            }
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                showDialog(new q03(getParentActivity(), hashSet));
            } else {
                u21.b0(this).g0(tL_error, false);
            }
        }
    }

    public final void i0(c4c c4cVar, View view) {
        int i = c4cVar.d;
        if (i == 2) {
            k0(true);
            m21 J = u21.b0(this).J(2131623990, gl.S2(k96.M0(2131749266, null)), k96.M0(2131743646, null), 5000, true, new e81(this, (byte) 0));
            J.j = 5000;
            J.j();
        } else if (i == 1) {
            j0(this);
        } else {
            Object obj = c4cVar.H;
            boolean z = obj instanceof w81;
            int i2 = kk7.s;
            if (z) {
                w81 w81Var = (w81) obj;
                ArrayList arrayList = w81Var.c;
                if (this.simpleActionBar.x()) {
                    Z(arrayList, (v81) view);
                } else if (w81Var.a != 0 && !arrayList.isEmpty()) {
                    boolean z2 = w81Var.e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = w81Var.b;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
                    hd hdVar = new hd(3, null, getParentActivity());
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = getMessagesController().k4.w3.f();
                    hdVar.setOnCancelListener(new g81(this, getConnectionsManager().sendRequest(getgroupcall, new f81(this, hdVar, hashSet, tL_inputGroupCallInviteMessage, z2, (byte) 0)), (byte) 0));
                    hdVar.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", k27.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
                    getNotificationCenter().k(i2, new Object[0]);
                    presentFragment(new mu1(bundle), this.r);
                }
            } else if (view instanceof y81) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((y81) view).c.id);
                getNotificationCenter().k(i2, new Object[0]);
                presentFragment(new mu1(bundle2), this.r);
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final lx4 j() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void k0(boolean z) {
        if (z == getUserConfig().X) {
            return;
        }
        y6c userConfig = getUserConfig();
        if (userConfig.X != z) {
            userConfig.X = z;
            userConfig.u(false);
        }
        this.c.g3.O(true);
        kk7.f(this.currentAccount).k(kk7.Q5, new Object[0]);
    }

    public final void m0(boolean z) {
        int i;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        hd hdVar = alertDialog$Builder.a;
        if (z) {
            hdVar.S = k96.M0(2131751577, null);
            hdVar.U = k96.M0(2131751576, null);
        } else {
            hdVar.S = k96.M0(2131751547, null);
            hdVar.U = k96.M0(2131751487, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        ag2 ag2Var = new ag2(getParentActivity(), 1);
        ag2Var.setBackground(bkb.L0(false));
        ag2Var.e(k96.M0(2131751546, null), "", false, false, false);
        if (k96.a0) {
            i = gl.L(8.0f);
        } else {
            i = 0;
        }
        if (k96.a0) {
            L = 0;
        } else {
            L = gl.L(8.0f);
        }
        ag2Var.setPadding(i, 0, L, 0);
        frameLayout.addView(ag2Var, nme.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        ag2Var.setOnClickListener(new ge(zArr, (byte) 6));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.j(k96.M0(2131751586, null), new ch(this, z, zArr, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    public final void n0() {
        boolean z;
        boolean x = this.simpleActionBar.x();
        ArrayList arrayList = this.H;
        if (x) {
            z = true;
            if (arrayList.isEmpty()) {
                d0(true);
                return;
            }
        } else {
            pha phaVar = this.simpleActionBar;
            if (phaVar.e == null) {
                phaVar.q().c(2, 2131232113, gl.L(54.0f), k96.M0(2131751586, null));
            }
            this.simpleActionBar.J();
            z = false;
        }
        this.simpleActionBar.E(arrayList.size(), z);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.simpleActionBar.x()) {
            if (z) {
                d0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        int i;
        super.onFragmentCreate();
        int i2 = 0;
        c0(0, 50);
        na7 messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        wtc wtcVar = this.O;
        if (wtcVar != null) {
            wtcVar.a();
            this.O = null;
        }
        kk7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        wtc wtcVar2 = new wtc(notificationCenter, this);
        wtcVar2.b(1);
        wtcVar2.b(kk7.v);
        wtcVar2.b(kk7.z2);
        wtcVar2.b(kk7.S);
        wtcVar2.b(kk7.v2);
        this.O = wtcVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.r = bundle.getBoolean("needFinishFragment", true);
            this.s = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.s) {
            i = gl.L(72.0f);
        } else {
            i = 0;
        }
        this.P = i;
        if (this.s) {
            i2 = gl.L(64.0f);
        }
        this.Q = i2;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        wtc wtcVar = this.O;
        if (wtcVar != null) {
            wtcVar.a();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.S = i4;
        b0();
        a0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i != 101 && i != 102 && i != 103) {
            return;
        }
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (iArr[i2] != 0) {
                    z = false;
                    break;
                }
                i2++;
            } else {
                z = true;
                break;
            }
        }
        TLRPC.UserFull userFull = null;
        if (iArr.length > 0 && z) {
            if (i == 103) {
                rgc.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().W1(this.L.id);
            }
            TLRPC.User user = this.L;
            if (i == 102) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i != 102 && (userFull == null || !userFull.video_calls_available)) {
                z3 = false;
            } else {
                z3 = true;
            }
            rgc.m(user, z2, z3, getParentActivity(), null, getAccountInstance());
            return;
        }
        rgc.h(getParentActivity(), null, i);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q5c q5cVar = this.c;
        if (q5cVar != null) {
            q5cVar.g3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q5c q5cVar = this.c;
            if (q5cVar != null) {
                int childCount = q5cVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.c.getChildAt(i);
                    if (childAt instanceof v81) {
                        ((v81) childAt).d.A(0);
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.b.K0() < 15) {
            this.c.z0(0);
            return;
        }
        cu6 cu6Var = this.e;
        cu6Var.b = 1;
        cu6Var.k(0, 0, false, false);
    }

    public z81() {
        this(null);
    }
}

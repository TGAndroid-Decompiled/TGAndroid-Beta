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
import org.telegram.ui.ActionBar.e;
public final class i91 extends e implements fn7, ej6 {
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public xj3 I;
    public FrameLayout J;
    public y81 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public u8a O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public jo0 a;
    public x46 b;
    public q9c c;
    public View d;
    public hw6 e;
    public zp4 f;
    public tk4 h;
    public w81 n;
    public boolean r;
    public boolean s;
    public sla w;
    public final ArrayList x;
    public boolean y;

    public i91(Bundle bundle) {
        super(bundle);
        this.r = true;
        this.x = new ArrayList();
        this.H = new ArrayList();
    }

    public static void j0(e eVar) {
        eVar.presentFragment(new c91(bs2.l("isCall", true), eVar.getCurrentAccount(), eVar));
    }

    public static void l0(final Context context, int i, TLRPC.InputGroupCall inputGroupCall, String str, final vnb vnbVar, boolean z, final boolean z2) {
        String str2;
        int i2;
        final byte b;
        int i3 = aob.h5;
        int v0 = aob.v0(i3, vnbVar);
        final nx0 nx0Var = new nx0(1, vnbVar, context, false);
        nx0Var.s0(v0);
        nx0Var.K(v0);
        nx0Var.t0(i3);
        nx0Var.L(i3);
        final String[] strArr = {str};
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(0, 0, 0, hl.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j.addView(frameLayout, tre.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232789);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, tre.e(-1, -1, 17));
        int L = hl.L(80.0f);
        int i4 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i4, vnbVar));
        uob M = yob.M(i4);
        frameLayout2.setBackground(K);
        yob.j(frameLayout2, K, M, null, vnbVar);
        frameLayout.addView(frameLayout2, tre.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231247);
        int i5 = aob.y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView2, i5, vnbVar, mode);
        int i6 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i6, vnbVar), 1, -1);
        uob M2 = yob.M(i6);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M2, vnbVar);
        if (z2) {
            frameLayout.addView(imageView2, tre.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i7 = aob.G6;
        p66 a = zze.a(context, 20.0f, i7, true, vnbVar);
        a.setText(ob6.M0(2131749226, null));
        a.setGravity(17);
        j.addView(a, tre.t(-1, -2, 17, 32, 16, 32, 8));
        p66 a2 = zze.a(context, 14.0f, i7, false, vnbVar);
        a2.setText(ob6.M0(2131749227, null));
        a2.setGravity(17);
        a2.setMaxWidth(kg5.a(a2.getText(), a2.getPaint()));
        j.addView(a2, tre.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        iye.b(frameLayout3, 0.01f, 1.2f);
        int i8 = aob.a7;
        hf0 Z = aob.Z(aob.v0(i8, vnbVar), aob.v(aob.v0(i8, vnbVar), aob.v0(i6, vnbVar)), 12, 12);
        uob M3 = yob.M(i8);
        uob p = yob.p(i8, i6);
        frameLayout3.setBackground(Z);
        yob.j(frameLayout3, Z, M3, p, vnbVar);
        j.addView(frameLayout3, tre.t(-1, -2, 7, 16, 0, 16, 0));
        p66 a3 = zze.a(context, 13.0f, i7, false, vnbVar);
        a3.setPadding(hl.L(16.0f), hl.L(14.0f), 0, hl.L(14.0f));
        a3.setText(str2);
        frameLayout3.addView(a3, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231247));
        imageView3.setContentDescription(ob6.M0(2131754834, null));
        imageView3.setScaleType(scaleType);
        yob.s(imageView3, aob.r5, vnbVar, mode);
        frameLayout3.addView(imageView3, tre.e(40, 48, 21));
        LinearLayout j2 = uh9.j(context, 0);
        j.addView(j2, tre.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        c51 c51Var = new c51(vnbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) ob6.M0(2131749234, null));
        spannableStringBuilder.setSpan(new wm2(2131232109, 0), 0, 1, 33);
        c51Var.i(spannableStringBuilder, false, true);
        j2.addView(c51Var, tre.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        c51 c51Var2 = new c51(vnbVar, context, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131749228, null));
        spannableStringBuilder2.setSpan(new wm2(2131232369, 0), 0, 1, 33);
        c51Var2.i(spannableStringBuilder2, false, true);
        j2.addView(c51Var2, tre.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        nx0[] nx0VarArr = new nx0[1];
        if (z) {
            z81 z81Var = new z81(context, vnbVar);
            z81Var.setGravity(17);
            yob.X(z81Var, aob.z6, vnbVar);
            z81Var.setText(" " + ob6.M0(2131749233, null) + " ");
            z81Var.setTextSize(14.0f);
            j.addView(z81Var, tre.t(190, -2, 1, 28, 12, 28, 8));
            i2 = i;
            ze7 ze7Var = new ze7(str, i2, nx0VarArr, (byte) 9);
            p66 a4 = zze.a(context, 14.0f, i7, false, vnbVar);
            a4.setText(hl.D2(hl.N2(ob6.M0(2131749232, null), -1, 0, ze7Var, null), true));
            a4.setGravity(17);
            a4.setMaxWidth(kg5.a(a4.getText(), a4.getPaint()));
            j.addView(a4, tre.t(-1, -2, 17, 32, 8, 32, 12));
            iye.b(a4, 0.05f, 1.2f);
            b = 0;
            a4.setOnClickListener(new r81(ze7Var, (byte) 0));
        } else {
            i2 = i;
            b = 0;
        }
        nx0Var.O = j;
        nx0Var.show();
        nx0VarArr[b] = nx0Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b2 = b;
                vnb vnbVar2 = vnbVar;
                nx0 nx0Var2 = nx0Var;
                String[] strArr2 = strArr;
                switch (b2) {
                    case 0:
                        hl.g(strArr2[0]);
                        new d31(nx0Var2.F, vnbVar2).i(ob6.M0(2131748675, null)).j();
                        return;
                    default:
                        hl.g(strArr2[0]);
                        new d31(nx0Var2.F, vnbVar2).i(ob6.M0(2131748675, null)).j();
                        return;
                }
            }
        });
        c51Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b2 = b;
                vnb vnbVar2 = vnbVar;
                nx0 nx0Var2 = nx0Var;
                String[] strArr2 = strArr;
                switch (b2) {
                    case 0:
                        hl.g(strArr2[0]);
                        new d31(nx0Var2.F, vnbVar2).i(ob6.M0(2131748675, null)).j();
                        return;
                    default:
                        hl.g(strArr2[0]);
                        new d31(nx0Var2.F, vnbVar2).i(ob6.M0(2131748675, null)).j();
                        return;
                }
            }
        });
        final st stVar = new st(inputGroupCall, i2, strArr, frameLayout3, a3, nx0Var, vnbVar, (byte) 3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                nx0 nx0Var2 = nx0.this;
                ex0 ex0Var = nx0Var2.c;
                vnb vnbVar2 = vnbVar;
                fu5 G = fu5.G(ex0Var, vnbVar2, frameLayout3);
                String M0 = ob6.M0(2131751732, null);
                String[] strArr2 = strArr;
                G.b(2131232108, M0, new tu0(strArr2, nx0Var2, vnbVar2, (byte) 14), false);
                G.b(2131232325, ob6.M0(2131750433, null), new z21(context, strArr2, (byte) 5), false);
                G.l(2131232113, stVar, ob6.M0(2131745750, null), z2, true);
                G.a0();
            }
        });
        c51Var2.setOnClickListener(new nh(context, str, strArr, vnbVar, nx0Var, (byte) 3));
        if (z2) {
            imageView2.setOnClickListener(new cg(nx0Var, vnbVar, imageView2, stVar, (byte) 7));
        }
    }

    @Override
    public final rz4 A() {
        return getBaseSimpleGlass().d();
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        return true;
    }

    public final void Z(ArrayList arrayList, e91 e91Var) {
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
            og2 og2Var = e91Var.e;
            if (og2Var != null) {
                og2Var.a(false, true);
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
        og2 og2Var2 = e91Var.e;
        if (og2Var2 != null) {
            og2Var2.a(true, true);
        }
        n0();
    }

    public final void a0() {
        this.f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.r7));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.p6));
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.A9));
        hashSet.add(Integer.valueOf(aob.Zl));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.c7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0() {
        q9c q9cVar = this.c;
        mq5 mq5Var = this.mSystemInsets;
        eg0.g(q9cVar, mq5Var.b, mq5Var.d, a.getCurrentActionBarHeight() + ((int) this.I.c(hl.L(7.0f))), this.P);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + a.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.I.c(hl.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (eg0.f(this.mSystemInsets.b) - hl.L(14.0f)) - hl.L(7.0f);
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
        q9c q9cVar = this.c;
        if (q9cVar != null) {
            q9cVar.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i2;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new ye(this, (byte) 10), 2), this.classGuid);
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        if (!this.s) {
            this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        }
        this.simpleActionBar.setTitle(ob6.M0(2131752577, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 16));
        sla a = this.simpleActionBar.v().a(10, 2131231247);
        this.w = a;
        a.setContentDescription(ob6.M0(2131754834, null));
        this.w.e(4, 2131232058, ob6.M0(2131749076, null));
        this.w.Q(4, getMessagesController().w());
        b8 e = this.w.e(3, 2131232113, ob6.M0(2131751554, null));
        int i2 = aob.p7;
        e.d(getThemedColor(i2), getThemedColor(i2));
        q9c q9cVar = new q9c(this, new c(this, (byte) 21), new v81(this), new v81(this));
        this.c = q9cVar;
        q9cVar.setCaptureSectionsDecoratorAllowed(true);
        this.c.s1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        w81 w81Var = new w81((byte) 0, context, this);
        this.n = w81Var;
        this.fragmentView = w81Var;
        tk4 tk4Var = new tk4(context, null);
        this.h = tk4Var;
        tk4Var.setViewType(8);
        yob.h(aob.a7, null, this.h);
        this.h.x = false;
        this.a = new jo0(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        q9c q9cVar2 = this.c;
        x46 x46Var = new x46(1, false);
        this.b = x46Var;
        q9cVar2.setLayoutManager(x46Var);
        q9c q9cVar3 = this.c;
        if (ob6.a0) {
            i = 1;
        } else {
            i = 2;
        }
        q9cVar3.setVerticalScrollbarPosition(i);
        hw6 hw6Var = new hw6(this.c, this.b);
        this.e = hw6Var;
        vy4 vy4Var = this.glassEngine;
        Objects.requireNonNull(vy4Var);
        hw6Var.n = new tg0(vy4Var, (byte) 26);
        this.n.addView(this.c, tre.e(-1, -1, 3));
        this.n.addView(this.a, tre.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, tre.e(-1, 0, 48));
        this.c.setOnScrollListener(new x81(this));
        boolean z = this.y;
        jo0 jo0Var = this.a;
        if (z) {
            jo0Var.d();
        } else {
            jo0Var.e();
        }
        zp4 zp4Var = new zp4(this.resourceProvider, context, false);
        this.f = zp4Var;
        zp4Var.c.setImageResource(2131231092);
        this.f.setContentDescription(ob6.M0(2131752615, null));
        this.f.setOnClickListener(new k81(this, (byte) 1));
        this.n.addView(this.f, zp4.b());
        xj3 xj3Var = new xj3(context);
        this.I = xj3Var;
        xj3Var.setPadding(hl.L(11.0f), hl.L(7.0f) + hl.L(14.0f), hl.L(11.0f), hl.L(7.0f) + hl.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new l81(this, (byte) 1));
        xj3 xj3Var2 = this.I;
        jl0 c = getBaseSimpleGlass().c.c(this.I, null, false);
        c.p(dtd.n(this.resourceProvider));
        c.r(hl.L(24.0f));
        c.q(hl.L(7.0f));
        xj3Var2.setBlurredBackground(c);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.j(this.J, true, false);
        y81 y81Var = new y81(this, context, this, this.n, this.resourceProvider);
        this.K = y81Var;
        this.J.addView(y81Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, tre.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new t10(this, (byte) 3));
        if (this.s) {
            View view2 = this.fragmentView;
            v81 v81Var = new v81(this);
            WeakHashMap weakHashMap = ihc.a;
            ahc.i(view2, v81Var);
        }
        return this.fragmentView;
    }

    public final void d0(boolean z) {
        og2 og2Var;
        this.simpleActionBar.y();
        this.H.clear();
        int childCount = this.c.getChildCount();
        int i = 0;
        while (true) {
            q9c q9cVar = this.c;
            if (i < childCount) {
                View childAt = q9cVar.getChildAt(i);
                if ((childAt instanceof e91) && (og2Var = ((e91) childAt).e) != null) {
                    og2Var.a(false, z);
                }
                i++;
            } else {
                q9cVar.g3.O(true);
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i91.didReceivedNotification(int, int, java.lang.Object[]):void");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i91.f0(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public final void g0(id idVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        idVar.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().j4(groupcall.users, false);
            getMessagesController().c4(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new j13(getParentActivity(), hashSet));
            } else {
                xkc.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
            }
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                showDialog(new j13(getParentActivity(), hashSet));
            } else {
                d31.b0(this).g0(tL_error, false);
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.c, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, aob.h6));
        zp4 zp4Var = this.f;
        if (zp4Var != null) {
            arrayList.add(new apb(zp4Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.O9));
            arrayList.add(new apb(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.P9));
            arrayList.add(new apb(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Q9));
        }
        return arrayList;
    }

    public final void h0(id idVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        idVar.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().j4(groupcall.users, false);
            getMessagesController().c4(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new j13(getParentActivity(), hashSet));
            } else {
                xkc.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
            }
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                showDialog(new j13(getParentActivity(), hashSet));
            } else {
                d31.b0(this).g0(tL_error, false);
            }
        }
    }

    public final void i0(b8c b8cVar, View view) {
        int i = b8cVar.d;
        if (i == 2) {
            k0(true);
            v21 J = d31.b0(this).J(2131623990, hl.S2(ob6.M0(2131749212, null)), ob6.M0(2131743540, null), 5000, true, new l81(this, (byte) 0));
            J.j = 5000;
            J.j();
        } else if (i == 1) {
            j0(this);
        } else {
            Object obj = b8cVar.H;
            boolean z = obj instanceof f91;
            int i2 = jn7.s;
            if (z) {
                f91 f91Var = (f91) obj;
                ArrayList arrayList = f91Var.c;
                if (this.simpleActionBar.z()) {
                    Z(arrayList, (e91) view);
                } else if (f91Var.a != 0 && !arrayList.isEmpty()) {
                    boolean z2 = f91Var.e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = f91Var.b;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
                    id idVar = new id(3, null, getParentActivity());
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = getMessagesController().k4.E3.f();
                    idVar.setOnCancelListener(new n81(this, getConnectionsManager().sendRequest(getgroupcall, new m81(this, idVar, hashSet, tL_inputGroupCallInviteMessage, z2, (byte) 0)), (byte) 0));
                    idVar.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", r47.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
                    getNotificationCenter().k(i2, new Object[0]);
                    presentFragment(new zu1(bundle), this.r);
                }
            } else if (view instanceof h91) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((h91) view).c.id);
                getNotificationCenter().k(i2, new Object[0]);
                presentFragment(new zu1(bundle2), this.r);
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final rz4 j() {
        return getBaseSimpleGlass().c();
    }

    public final void k0(boolean z) {
        if (z == getUserConfig().X) {
            return;
        }
        yac userConfig = getUserConfig();
        if (userConfig.X != z) {
            userConfig.X = z;
            userConfig.u(false);
        }
        this.c.g3.O(true);
        sla slaVar = this.w;
        if (slaVar != null) {
            slaVar.Q(4, getMessagesController().w());
        }
        jn7.f(this.currentAccount).k(jn7.R5, new Object[0]);
    }

    public final void m0(boolean z) {
        int i;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        id idVar = alertDialog$Builder.a;
        if (z) {
            idVar.S = ob6.M0(2131751554, null);
            idVar.U = ob6.M0(2131751553, null);
        } else {
            idVar.S = ob6.M0(2131751524, null);
            idVar.U = ob6.M0(2131751464, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        sg2 sg2Var = new sg2(getParentActivity(), 1);
        sg2Var.setBackground(aob.L0(false));
        sg2Var.e(ob6.M0(2131751523, null), "", false, false, false);
        if (ob6.a0) {
            i = hl.L(8.0f);
        } else {
            i = 0;
        }
        if (ob6.a0) {
            L = 0;
        } else {
            L = hl.L(8.0f);
        }
        sg2Var.setPadding(i, 0, L, 0);
        frameLayout.addView(sg2Var, tre.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        sg2Var.setOnClickListener(new de(zArr, (byte) 6));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.j(ob6.M0(2131751563, null), new bh(this, z, zArr, (byte) 2));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    public final void n0() {
        boolean z;
        boolean z2 = this.simpleActionBar.z();
        ArrayList arrayList = this.H;
        if (z2) {
            z = true;
            if (arrayList.isEmpty()) {
                d0(true);
                return;
            }
        } else {
            jla jlaVar = this.simpleActionBar;
            if (jlaVar.e == null) {
                jlaVar.r().c(2, 2131232113, hl.L(54.0f), ob6.M0(2131751563, null));
            }
            this.simpleActionBar.L();
            z = false;
        }
        this.simpleActionBar.H(arrayList.size(), z);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.simpleActionBar.z()) {
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
        uc7 messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        u8a u8aVar = this.O;
        if (u8aVar != null) {
            u8aVar.a();
            this.O = null;
        }
        jn7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar2 = new u8a(notificationCenter, this);
        u8aVar2.b(1);
        u8aVar2.b(jn7.v);
        u8aVar2.b(jn7.A2);
        u8aVar2.b(jn7.T);
        u8aVar2.b(jn7.w2);
        this.O = u8aVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.r = bundle.getBoolean("needFinishFragment", true);
            this.s = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.s) {
            i = hl.L(72.0f);
        } else {
            i = 0;
        }
        this.P = i;
        if (this.s) {
            i2 = hl.L(64.0f);
        }
        this.Q = i2;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        u8a u8aVar = this.O;
        if (u8aVar != null) {
            u8aVar.a();
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
                xkc.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().Y1(this.L.id);
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
            xkc.m(user, z2, z3, getParentActivity(), null, getAccountInstance());
            return;
        }
        xkc.h(getParentActivity(), null, i);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q9c q9cVar = this.c;
        if (q9cVar != null) {
            q9cVar.g3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q9c q9cVar = this.c;
            if (q9cVar != null) {
                int childCount = q9cVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.c.getChildAt(i);
                    if (childAt instanceof e91) {
                        ((e91) childAt).d.D(0);
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
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
            this.c.A0(0);
            return;
        }
        hw6 hw6Var = this.e;
        hw6Var.b = 1;
        hw6Var.k(0, 0, false, false);
    }

    public i91() {
        this(null);
    }

    @Override
    public final void F() {
    }
}

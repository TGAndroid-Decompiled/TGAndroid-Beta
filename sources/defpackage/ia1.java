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
public final class ia1 extends d implements jm7, aj6 {
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public qk3 I;
    public FrameLayout J;
    public y91 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public e7a O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public jp0 a;
    public u46 b;
    public q7c c;
    public View d;
    public cw6 e;
    public wp4 f;
    public tk4 h;
    public w91 n;
    public boolean r;
    public boolean s;
    public zja w;
    public final ArrayList x;
    public boolean y;

    public ia1(Bundle bundle) {
        super(bundle);
        this.r = true;
        this.x = new ArrayList();
        this.H = new ArrayList();
    }

    public static void l0(final Context context, int i, TLRPC.InputGroupCall inputGroupCall, String str, final ylb ylbVar, boolean z, final boolean z2) {
        String str2;
        int i2;
        final byte b;
        int i3 = cmb.g5;
        int v0 = cmb.v0(i3, ylbVar);
        final my0 my0Var = new my0(1, ylbVar, context, false);
        my0Var.s0(v0);
        my0Var.K(v0);
        my0Var.t0(i3);
        my0Var.L(i3);
        final String[] strArr = {str};
        LinearLayout i4 = hg9.i(context, 1);
        i4.setPadding(0, 0, 0, gm.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        i4.addView(frameLayout, qoe.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232783);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, qoe.e(-1, -1, 17));
        int L = gm.L(80.0f);
        int i5 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i5, ylbVar));
        wmb M = anb.M(i5);
        frameLayout2.setBackground(K);
        anb.j(frameLayout2, K, M, null, ylbVar);
        frameLayout.addView(frameLayout2, qoe.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231248);
        int i6 = cmb.x6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView2, i6, ylbVar, mode);
        int i7 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i7, ylbVar), 1, -1);
        wmb M2 = anb.M(i7);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M2, ylbVar);
        if (z2) {
            frameLayout.addView(imageView2, qoe.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i8 = cmb.F6;
        l66 a = jxe.a(context, 20.0f, i8, true, ylbVar);
        a.setText(jb6.M0(2131749229, null));
        a.setGravity(17);
        i4.addView(a, qoe.t(-1, -2, 17, 32, 16, 32, 8));
        l66 a2 = jxe.a(context, 14.0f, i8, false, ylbVar);
        a2.setText(jb6.M0(2131749230, null));
        a2.setGravity(17);
        a2.setMaxWidth(hg5.a(a2.getText(), a2.getPaint()));
        i4.addView(a2, qoe.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        rve.b(frameLayout3, 0.01f, 1.2f);
        int i9 = cmb.Z6;
        fg0 Z = cmb.Z(cmb.v0(i9, ylbVar), cmb.v(cmb.v0(i9, ylbVar), cmb.v0(i7, ylbVar)), 12, 12);
        wmb M3 = anb.M(i9);
        wmb p = anb.p(i9, i7);
        frameLayout3.setBackground(Z);
        anb.j(frameLayout3, Z, M3, p, ylbVar);
        i4.addView(frameLayout3, qoe.t(-1, -2, 7, 16, 0, 16, 0));
        l66 a3 = jxe.a(context, 13.0f, i8, false, ylbVar);
        a3.setPadding(gm.L(16.0f), gm.L(14.0f), 0, gm.L(14.0f));
        a3.setText(str2);
        frameLayout3.addView(a3, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(2131231248));
        imageView3.setContentDescription(jb6.M0(2131754838, null));
        imageView3.setScaleType(scaleType);
        anb.s(imageView3, cmb.q5, ylbVar, mode);
        frameLayout3.addView(imageView3, qoe.e(40, 48, 21));
        LinearLayout i10 = hg9.i(context, 0);
        i4.addView(i10, qoe.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        b61 b61Var = new b61(ylbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) jb6.M0(2131749237, null));
        spannableStringBuilder.setSpan(new pn2(2131232110, 0), 0, 1, 33);
        b61Var.i(spannableStringBuilder, false, true);
        i10.addView(b61Var, qoe.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        b61 b61Var2 = new b61(ylbVar, context, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131749231, null));
        spannableStringBuilder2.setSpan(new pn2(2131232370, 0), 0, 1, 33);
        b61Var2.i(spannableStringBuilder2, false, true);
        i10.addView(b61Var2, qoe.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        my0[] my0VarArr = new my0[1];
        if (z) {
            z91 z91Var = new z91(context, ylbVar);
            z91Var.setGravity(17);
            anb.X(z91Var, cmb.y6, ylbVar);
            z91Var.setText(" " + jb6.M0(2131749236, null) + " ");
            z91Var.setTextSize(14.0f);
            i4.addView(z91Var, qoe.t(190, -2, 1, 28, 12, 28, 8));
            i2 = i;
            wc7 wc7Var = new wc7(str, i2, my0VarArr, (byte) 9);
            l66 a4 = jxe.a(context, 14.0f, i8, false, ylbVar);
            a4.setText(gm.D2(gm.N2(jb6.M0(2131749235, null), -1, 0, wc7Var, null), true));
            a4.setGravity(17);
            a4.setMaxWidth(hg5.a(a4.getText(), a4.getPaint()));
            i4.addView(a4, qoe.t(-1, -2, 17, 32, 8, 32, 12));
            rve.b(a4, 0.05f, 1.2f);
            b = 1;
            a4.setOnClickListener(new k81(wc7Var, (byte) 1));
        } else {
            i2 = i;
            b = 1;
        }
        my0Var.O = i4;
        my0Var.show();
        my0VarArr[0] = my0Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b2 = r4;
                ylb ylbVar2 = ylbVar;
                my0 my0Var2 = my0Var;
                String[] strArr2 = strArr;
                switch (b2) {
                    case 0:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        return;
                    default:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        return;
                }
            }
        });
        b61Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b2 = b;
                ylb ylbVar2 = ylbVar;
                my0 my0Var2 = my0Var;
                String[] strArr2 = strArr;
                switch (b2) {
                    case 0:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        return;
                    default:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        return;
                }
            }
        });
        final qu quVar = new qu(inputGroupCall, i2, strArr, frameLayout3, a3, my0Var, ylbVar, (byte) 2);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                my0 my0Var2 = my0.this;
                dy0 dy0Var = my0Var2.c;
                ylb ylbVar2 = ylbVar;
                bu5 G = bu5.G(dy0Var, ylbVar2, frameLayout3);
                String M0 = jb6.M0(2131751704, null);
                String[] strArr2 = strArr;
                G.b(2131232109, M0, new tv0(strArr2, my0Var2, ylbVar2, (byte) 14), false);
                G.b(2131232326, jb6.M0(2131750405, null), new y31(context, strArr2, (byte) 6), false);
                G.l(2131232114, quVar, jb6.M0(2131745756, null), z2, true);
                G.a0();
            }
        });
        b61Var2.setOnClickListener(new oh(context, str, strArr, ylbVar, my0Var, (byte) 3));
        if (z2) {
            imageView2.setOnClickListener(new ef(my0Var, ylbVar, imageView2, quVar, (byte) 7));
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z) {
        return true;
    }

    public final void a0(ArrayList arrayList, ea1 ea1Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean f0 = f0(arrayList);
        ArrayList arrayList2 = this.H;
        if (f0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id));
            }
            jh2 jh2Var = ea1Var.e;
            if (jh2Var != null) {
                jh2Var.a(false, true);
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
        jh2 jh2Var2 = ea1Var.e;
        if (jh2Var2 != null) {
            jh2Var2.a(true, true);
        }
        n0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.q7));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.o6));
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.z9));
        hashSet.add(Integer.valueOf(cmb.Yl));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.b7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void b0() {
        this.f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    public final void c0() {
        q7c q7cVar = this.c;
        iq5 iq5Var = this.mSystemInsets;
        eh0.e(q7cVar, iq5Var.b, iq5Var.d, a.getCurrentActionBarHeight() + ((int) this.I.c(gm.L(7.0f))), this.P);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + a.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.I.c(gm.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (eh0.d(this.mSystemInsets.b) - gm.L(14.0f)) - gm.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.S + this.P);
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        if (!this.s) {
            this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        }
        this.simpleActionBar.setTitle(jb6.M0(2131752549, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 16));
        zja a = this.simpleActionBar.t().a(10, 2131231248);
        this.w = a;
        a.setContentDescription(jb6.M0(2131754838, null));
        a8 e = this.w.e(3, 2131232114, jb6.M0(2131751526, null));
        int i2 = cmb.o7;
        e.d(getThemedColor(i2), getThemedColor(i2));
        q7c q7cVar = new q7c(this, new f(this, (byte) 21), new v91(this), new v91(this));
        this.c = q7cVar;
        q7cVar.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        w91 w91Var = new w91((byte) 0, context, this);
        this.n = w91Var;
        this.fragmentView = w91Var;
        tk4 tk4Var = new tk4(context, null);
        this.h = tk4Var;
        tk4Var.setViewType(8);
        anb.h(cmb.Z6, null, this.h);
        this.h.x = false;
        this.a = new jp0(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        q7c q7cVar2 = this.c;
        u46 u46Var = new u46(1, false);
        this.b = u46Var;
        q7cVar2.setLayoutManager(u46Var);
        q7c q7cVar3 = this.c;
        if (jb6.a0) {
            i = 1;
        } else {
            i = 2;
        }
        q7cVar3.setVerticalScrollbarPosition(i);
        cw6 cw6Var = new cw6(this.c, this.b);
        this.e = cw6Var;
        sy4 sy4Var = this.glassEngine;
        Objects.requireNonNull(sy4Var);
        cw6Var.n = new xg0(sy4Var, (byte) 27);
        this.n.addView(this.c, qoe.e(-1, -1, 3));
        this.n.addView(this.a, qoe.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, qoe.e(-1, 0, 48));
        this.c.setOnScrollListener(new x91(this));
        boolean z = this.y;
        jp0 jp0Var = this.a;
        if (z) {
            jp0Var.d();
        } else {
            jp0Var.e();
        }
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.f = wp4Var;
        wp4Var.c.setImageResource(2131231093);
        this.f.setContentDescription(jb6.M0(2131752587, null));
        this.f.setOnClickListener(new m91(this, (byte) 1));
        this.n.addView(this.f, wp4.b());
        qk3 qk3Var = new qk3(context);
        this.I = qk3Var;
        qk3Var.setPadding(gm.L(11.0f), gm.L(7.0f) + gm.L(14.0f), gm.L(11.0f), gm.L(7.0f) + gm.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new n91(this, (byte) 1));
        qk3 qk3Var2 = this.I;
        im0 c = getBaseSimpleGlass().c.c(this.I, null, false);
        c.p(qqd.n(this.resourceProvider));
        c.r(gm.L(24.0f));
        c.q(gm.L(7.0f));
        qk3Var2.setBlurredBackground(c);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.j(this.J, true, false);
        y91 y91Var = new y91(this, context, this, this.n, this.resourceProvider);
        this.K = y91Var;
        this.J.addView(y91Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, qoe.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new s20(this, (byte) 3));
        if (this.s) {
            View view2 = this.fragmentView;
            v91 v91Var = new v91(this);
            WeakHashMap weakHashMap = kfc.a;
            cfc.i(view2, v91Var);
        }
        return this.fragmentView;
    }

    public final void d0(int i, int i2) {
        if (this.y) {
            return;
        }
        this.y = true;
        jp0 jp0Var = this.a;
        if (jp0Var != null && !this.E) {
            jp0Var.d();
        }
        q7c q7cVar = this.c;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i2;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new tg(this, (byte) 10), 2), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(boolean z) {
        jh2 jh2Var;
        this.simpleActionBar.w();
        this.H.clear();
        int childCount = this.c.getChildCount();
        int i = 0;
        while (true) {
            q7c q7cVar = this.c;
            if (i < childCount) {
                View childAt = q7cVar.getChildAt(i);
                if ((childAt instanceof ea1) && (jh2Var = ((ea1) childAt).e) != null) {
                    jh2Var.a(false, z);
                }
                i++;
            } else {
                q7cVar.g3.O(true);
                return;
            }
        }
    }

    public final boolean f0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void g0(org.telegram.tgnet.TLObject r18, org.telegram.tgnet.TLRPC.TL_error r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.g0(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.c, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
        wp4 wp4Var = this.f;
        if (wp4Var != null) {
            arrayList.add(new cnb(wp4Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.N9));
            arrayList.add(new cnb(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.O9));
            arrayList.add(new cnb(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.P9));
        }
        return arrayList;
    }

    public final void h0(he heVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        heVar.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().d4(groupcall.users, false);
            getMessagesController().X3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new c23(getParentActivity(), hashSet));
            } else {
                sic.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
            }
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                showDialog(new c23(getParentActivity(), hashSet));
            } else {
                c41.b0(this).g0(tL_error, false);
            }
        }
    }

    public final void i0(he heVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        heVar.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().d4(groupcall.users, false);
            getMessagesController().X3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new c23(getParentActivity(), hashSet));
            } else {
                sic.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
            }
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                showDialog(new c23(getParentActivity(), hashSet));
            } else {
                c41.b0(this).g0(tL_error, false);
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final nz4 j() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void j0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        if (i == 2) {
            k0(true);
            u31 J = c41.b0(this).J(2131623990, gm.S2(jb6.M0(2131749215, null)), jb6.M0(2131743572, null), 5000, true, new n91(this, (byte) 0));
            J.j = 5000;
            J.j();
        } else if (i == 1) {
            presentFragment(new ca1(ts2.l("isCall", true), getCurrentAccount(), this));
        } else {
            Object obj = c6cVar.H;
            boolean z = obj instanceof fa1;
            int i2 = nm7.s;
            if (z) {
                fa1 fa1Var = (fa1) obj;
                ArrayList arrayList = fa1Var.c;
                if (this.simpleActionBar.x()) {
                    a0(arrayList, (ea1) view);
                } else if (fa1Var.a != 0 && !arrayList.isEmpty()) {
                    boolean z2 = fa1Var.e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = fa1Var.b;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
                    he heVar = new he(3, null, getParentActivity());
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = getMessagesController().l4.w3.f();
                    heVar.setOnCancelListener(new p91(this, getConnectionsManager().sendRequest(getgroupcall, new o91(this, heVar, hashSet, tL_inputGroupCallInviteMessage, z2, (byte) 0)), (byte) 0));
                    heVar.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", k47.B0((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
                    getNotificationCenter().k(i2, new Object[0]);
                    presentFragment(new yv1(bundle), this.r);
                }
            } else if (view instanceof ha1) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((ha1) view).c.id);
                getNotificationCenter().k(i2, new Object[0]);
                presentFragment(new yv1(bundle2), this.r);
            }
        }
    }

    public final void k0(boolean z) {
        if (z == getUserConfig().X) {
            return;
        }
        z8c userConfig = getUserConfig();
        if (userConfig.X != z) {
            userConfig.X = z;
            userConfig.u(false);
        }
        this.c.g3.O(true);
        nm7.f(this.currentAccount).k(nm7.S5, new Object[0]);
    }

    public final void m0(boolean z) {
        int i;
        int L;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        he heVar = alertDialog$Builder.a;
        if (z) {
            heVar.S = jb6.M0(2131751526, null);
            heVar.U = jb6.M0(2131751525, null);
        } else {
            heVar.S = jb6.M0(2131751496, null);
            heVar.U = jb6.M0(2131751436, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        oh2 oh2Var = new oh2(getParentActivity(), 1);
        oh2Var.setBackground(cmb.L0(false));
        oh2Var.e(jb6.M0(2131751495, null), "", false, false, false);
        if (jb6.a0) {
            i = gm.L(8.0f);
        } else {
            i = 0;
        }
        if (jb6.a0) {
            L = 0;
        } else {
            L = gm.L(8.0f);
        }
        oh2Var.setPadding(i, 0, L, 0);
        frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        oh2Var.setOnClickListener(new gf(zArr, (byte) 6));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.j(jb6.M0(2131751535, null), new ci(this, z, zArr, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    public final void n0() {
        boolean z;
        boolean x = this.simpleActionBar.x();
        ArrayList arrayList = this.H;
        if (x) {
            z = true;
            if (arrayList.isEmpty()) {
                e0(true);
                return;
            }
        } else {
            rja rjaVar = this.simpleActionBar;
            if (rjaVar.e == null) {
                rjaVar.q().c(2, 2131232114, gm.L(54.0f), jb6.M0(2131751535, null));
            }
            this.simpleActionBar.J();
            z = false;
        }
        this.simpleActionBar.F(arrayList.size(), z);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.simpleActionBar.x()) {
            if (z) {
                e0(true);
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
        d0(0, 50);
        oc7 messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        e7a e7aVar = this.O;
        if (e7aVar != null) {
            e7aVar.a();
            this.O = null;
        }
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar2 = new e7a(notificationCenter, this);
        e7aVar2.b(1);
        e7aVar2.b(nm7.v);
        e7aVar2.b(nm7.A2);
        e7aVar2.b(nm7.T);
        e7aVar2.b(nm7.w2);
        this.O = e7aVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.r = bundle.getBoolean("needFinishFragment", true);
            this.s = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.s) {
            i = gm.L(72.0f);
        } else {
            i = 0;
        }
        this.P = i;
        if (this.s) {
            i2 = gm.L(64.0f);
        }
        this.Q = i2;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        e7a e7aVar = this.O;
        if (e7aVar != null) {
            e7aVar.a();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.S = i4;
        c0();
        b0();
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
                sic.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().X1(this.L.id);
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
            sic.m(user, z2, z3, getParentActivity(), null, getAccountInstance());
            return;
        }
        sic.h(getParentActivity(), null, i);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q7c q7cVar = this.c;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q7c q7cVar = this.c;
            if (q7cVar != null) {
                int childCount = q7cVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.c.getChildAt(i);
                    if (childAt instanceof ea1) {
                        ((ea1) childAt).d.y(0);
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void u() {
        if (this.b.K0() < 15) {
            this.c.z0(0);
            return;
        }
        cw6 cw6Var = this.e;
        cw6Var.b = 1;
        cw6Var.l(0, 0, false, false);
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
    public final nz4 z() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public ia1() {
        this(null);
    }

    @Override
    public final void F() {
    }
}

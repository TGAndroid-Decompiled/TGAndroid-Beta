package kg;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ha;
import di.u2;
import fi.k2;
import fi.q3;
import fi.w3;
import fi.y1;
import fi.y5;
import fi.z1;
import hi.l2;
import java.util.ArrayList;
import m.s2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.x31;
import org.telegram.ui.ks;
public final class m extends n41 implements ls {
    public String D;
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public boolean K;
    public u2 L;
    public b5 f17429f;
    public j h;
    public i f17430n;
    public w5 f17431r;
    public l f17432s;
    public l f17433w;
    public TLRPC.Document f17435y;
    public final g f17428e = new g(this, 1);
    public boolean f17434x = true;

    public m() {
        ui mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.f25855y0;
        mediaDataController.n1();
        this.f17435y = document;
        this.K = l0();
    }

    public static void d0(m mVar) {
        m mVar2;
        ks.p().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.L != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            u2 u2Var = new u2(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.L = u2Var;
            u2Var.T3 = new g6.d0(mVar2, 9);
        }
        mVar2.L.f32932a2.i0();
        mVar2.L.y1(1, false);
        u2 u2Var2 = mVar2.L;
        u2Var2.O3 = true;
        u2Var2.W0(new hi.u1(mVar2, 6));
        mVar2.L.e1();
        u2 u2Var3 = mVar2.L;
        u2Var3.f32979p1 = null;
        if (mVar2.visibleDialog != null) {
            u2Var3.show();
        } else {
            mVar2.showDialog(u2Var3);
        }
    }

    public static void e0(m mVar) {
        i iVar = mVar.f17430n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f17434x) {
            i iVar2 = mVar.f17430n;
            ui b02 = ui.b0(mVar.currentAccount);
            TLRPC.Document document = b02.f25855y0;
            b02.n1();
            g gVar = new g(mVar, 2);
            if (document == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.f37048n.getImageReceiver().f21195g1 = new nn(iVar2, gVar);
            rz f10 = t5.f(document, k6.Zc, 1.0f, null);
            if (f10 != null) {
                iVar2.f37048n.p(hc.b(document), pn.b(document), f10, document);
            } else {
                iVar2.f37048n.l(hc.b(document), pn.b(document), hc.c(w7.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            iVar2.f37048n.setOnClickListener(new mn(iVar2, document, 1));
        }
    }

    public static void g0(m mVar) {
        if (!(mVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.h.getParent()).getTop();
        int measuredHeight = mVar.h.getMeasuredHeight() - org.telegram.messenger.g0.L(36.0f);
        float i7 = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f17430n.setScaleX(i7);
        mVar.f17430n.setScaleY(i7);
        mVar.f17430n.setAlpha(Utilities.i(i7 * 2.0f, 1.0f, 0.0f));
        mVar.h.invalidate();
    }

    public static int h0(m mVar) {
        return mVar.classGuid;
    }

    public static int i0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void Z(ArrayList arrayList, l41 l41Var) {
        arrayList.add(x31.k(this.h));
        arrayList.add(x31.u(id.M0(2131752724, null)));
        arrayList.add(x31.k(this.f17432s));
        arrayList.add(x31.k(this.f17433w));
        if (this.f17434x) {
            arrayList.add(x31.f(id.M0(2131752720, null), id.M0(2131752719, null), 1));
        } else if (this.D != null) {
            String M0 = id.M0(2131752720, null);
            String str = this.D;
            x31 x31Var = new x31(3);
            x31Var.d = 1;
            x31Var.f40180l = M0;
            x31Var.G = str;
            arrayList.add(x31Var);
        } else {
            String M02 = id.M0(2131752720, null);
            TLRPC.Document document = this.f17435y;
            x31 x31Var2 = new x31(3);
            x31Var2.d = 1;
            x31Var2.f40180l = M02;
            x31Var2.G = document;
            arrayList.add(x31Var2);
        }
        arrayList.add(x31.C(id.M0(2131752723, null)));
        boolean l02 = l0();
        this.K = !l02;
        if (!l02) {
            arrayList.add(x31.C(null));
            x31 e10 = x31.e(2, id.M0(2131752721, null));
            e10.f40186r = true;
            arrayList.add(e10);
        }
        x31 x31Var3 = new x31(8);
        x31Var3.f40180l = null;
        arrayList.add(x31Var3);
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131752725, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        View[] viewPages;
        int i7 = x31Var.d;
        if (i7 == 1) {
            k2 k2Var = new k2(getParentActivity(), getResourceProvider(), true, true);
            k2Var.f12263v1 = new ab.g(19, this, view);
            k2Var.f12264w1 = new g(this, 0);
            for (View view2 : k2Var.f12255m1.getViewPages()) {
                if (view2 instanceof z1) {
                    y1 y1Var = ((z1) view2).f13236c;
                    if (y1Var.H == null) {
                        y1Var.D(null);
                    }
                }
            }
            showDialog(k2Var);
        } else if (i7 == 2) {
            this.f17432s.setText("");
            this.f17433w.setText("");
            org.telegram.messenger.g0.v1(this.f17432s.d);
            org.telegram.messenger.g0.v1(this.f17433w.d);
            this.f17434x = true;
            this.f17430n.d("", "");
            i iVar = this.f17430n;
            ui b02 = ui.b0(this.currentAccount);
            TLRPC.Document document = b02.f25855y0;
            b02.n1();
            this.f17435y = document;
            iVar.setSticker(document);
            g gVar = this.f17428e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
            j0(true);
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.f17430n = new pn(context, this.currentAccount, this.f17435y, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(16.0f);
        i iVar = this.f17430n;
        j jVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i7 = k6.f27788a;
        this.f17431r = new w5(iVar, jVar2, L, themedPaint);
        this.f17430n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(y5.e(null, this.currentAccount, getUserConfig().e(), k6.I.q()));
        this.h.addView(kVar, ha.e(-1, -1, 119));
        this.h.addView(this.f17430n, ha.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, id.M0(2131752718, null), getMessagesController().F5, this.resourceProvider, 0);
        this.f17432s = lVar;
        lVar.f29415r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f17432s;
        int i10 = k6.f27852d6;
        r6.i(i10, lVar2, getResourceProvider());
        this.f17432s.setDivider(true);
        l lVar3 = this.f17432s;
        lVar3.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(lVar3, 4);
        i3 i3Var = lVar3.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new s2(fVar, 2));
        l lVar4 = new l(this, context, id.M0(2131752722, null), getMessagesController().G5, this.resourceProvider, 1);
        this.f17433w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        r6.i(i10, this.f17433w, getResourceProvider());
        this.f17433w.setDivider(true);
        l lVar5 = this.f17433w;
        lVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(lVar5, 4);
        i3 i3Var2 = lVar5.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new s2(fVar2, 2));
        this.f17430n.d("", "");
        super.createView(context);
        this.f36244b.setBackground(null);
        this.f36243a.r1();
        this.f36243a.setSectionsDrawBackground(true);
        this.f36243a.f37190f3.f35528r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 12));
        this.f17429f = this.simpleActionBar.n(id.M0(2131745949, null));
        j0(false);
        this.f36243a.addOnLayoutChangeListener(new l2(this, 1));
        this.f36243a.j(new ai.b(this, 20));
        w3 w3Var = this.f36243a;
        w3Var.f37192h3 = true;
        w3Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new q3(this.fragmentView, false, new ii.c(this, 3));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.E0) {
            n0();
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f36243a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        if (this.f17429f != null) {
            this.f17429f.a(k0(), z9);
            w3 w3Var = this.f36243a;
            if (w3Var != null && w3Var.f37190f3 != null && this.K != (!l0())) {
                w3 w3Var2 = this.f36243a;
                if (w3Var2 != null && w3Var2.getChildCount() > 0) {
                    View view = null;
                    int i7 = Integer.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f36243a.getChildCount(); i11++) {
                        int R = RecyclerView.R(this.f36243a.getChildAt(i11));
                        View childAt = this.f36243a.getChildAt(i11);
                        if (R != -1 && childAt.getTop() < i7) {
                            i7 = childAt.getTop();
                            i10 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f36245c = i10;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f36245c == 0 && top > org.telegram.messenger.g0.L(88.0f)) {
                            this.d = org.telegram.messenger.g0.L(88.0f);
                        }
                        this.f36243a.f37189e3.h1(i10, view.getTop() - this.f36243a.getPaddingTop());
                    }
                }
                this.f36243a.f37190f3.O(true);
                int i12 = this.f36245c;
                if (i12 >= 0) {
                    w3 w3Var3 = this.f36243a;
                    w3Var3.f37189e3.h1(i12, this.d - w3Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean k0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f17432s.getText().toString();
        String str = this.G;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f17433w.getText().toString();
            String str3 = this.H;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z9 = this.f17434x;
                if (!z9 && (document = this.f17435y) != null) {
                    j3 = document.f26962id;
                } else {
                    j3 = 0;
                }
                if (j3 == this.I) {
                    if (z9 || this.E == null) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean l0() {
        l lVar = this.f17432s;
        if (lVar != null && this.f17433w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f17433w.getText()) || !this.f17434x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void m0() {
        TLRPC.Document document;
        b5 b5Var = this.f17429f;
        if (b5Var.f27358y.f55487f) {
            return;
        }
        b5Var.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!l0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f17432s.getText().toString();
            updatebusinessintro.intro.description = this.f17433w.getText().toString();
            if (!this.f17434x && (this.f17435y != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    qp messagesController = getMessagesController();
                    TLRPC.Document document2 = this.f17435y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f26968id = document2.f26962id;
                        tL_inputDocument.access_hash = document2.access_hash;
                        byte[] bArr = document2.file_reference;
                        tL_inputDocument.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputDocument.file_reference = new byte[0];
                        }
                    }
                    tL_inputBusinessIntro2.sticker = tL_inputDocument;
                }
            }
            if (b22 != null) {
                b22.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                b22.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f17434x && (document = this.f17435y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (b22 != null) {
            b22.flags2 &= -17;
            b22.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new bi.j0(this, 16));
        getMessagesStorage().j2(b22, false);
    }

    public final void n0() {
        long j3;
        boolean z9;
        l41 l41Var;
        if (this.J) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = b22.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.f17432s;
            String str = tL_businessIntro.title;
            this.G = str;
            lVar.setText(str);
            l lVar2 = this.f17433w;
            String str2 = b22.business_intro.description;
            this.H = str2;
            lVar2.setText(str2);
            this.f17435y = b22.business_intro.sticker;
        } else {
            l lVar3 = this.f17432s;
            this.G = "";
            lVar3.setText("");
            l lVar4 = this.f17433w;
            this.H = "";
            lVar4.setText("");
            this.E = null;
            this.f17435y = null;
        }
        TLRPC.Document document = this.f17435y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f26962id;
        }
        this.I = j3;
        if (document == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17434x = z9;
        i iVar = this.f17430n;
        if (iVar != null) {
            iVar.d(this.f17432s.getText().toString(), this.f17433w.getText().toString());
            i iVar2 = this.f17430n;
            TLRPC.Document document2 = this.f17435y;
            if (document2 == null || this.f17434x) {
                ui b02 = ui.b0(this.currentAccount);
                TLRPC.Document document3 = b02.f25855y0;
                b02.n1();
                document2 = document3;
            }
            iVar2.setSticker(document2);
        }
        if (this.f17434x) {
            g gVar = this.f17428e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
        }
        w3 w3Var = this.f36243a;
        if (w3Var != null && (l41Var = w3Var.f37190f3) != null) {
            l41Var.O(true);
        }
        this.J = true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (k0()) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = id.M0(2131743838, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131752717, null);
                alertDialog$Builder.k(id.M0(2131754216, null), new org.telegram.ui.ActionBar.r1(this) {
                    public final m f17395b;

                    {
                        this.f17395b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f17395b.m0();
                                return;
                            default:
                                this.f17395b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(id.M0(2131747581, null), new org.telegram.ui.ActionBar.r1(this) {
                    public final m f17395b;

                    {
                        this.f17395b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f17395b.m0();
                                return;
                            default:
                                this.f17395b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.E0);
        ui.b0(this.currentAccount).B(0);
        ui.b0(this.currentAccount).V0(0, false, true, false);
        ui.b0(this.currentAccount).V0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

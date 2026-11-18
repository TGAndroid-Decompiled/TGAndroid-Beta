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
import bi.d6;
import c8.ma;
import fi.n2;
import hi.e7;
import hi.j2;
import hi.p3;
import hi.t6;
import hi.w5;
import java.util.ArrayList;
import m.r2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ns;
public final class n extends b51 implements fs {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public n2 M;
    public d5 f18390f;
    public j h;
    public i f18391n;
    public y5 f18392r;
    public l f18393s;
    public l f18394w;
    public TLRPC.Document f18396y;
    public final g f18389e = new g(this, 1);
    public boolean f18395x = true;

    public n() {
        ri mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.f26656z0;
        mediaDataController.q1();
        this.f18396y = document;
        this.L = l0();
    }

    public static void d0(n nVar) {
        n nVar2;
        ns.p().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.M != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            n2 n2Var = new n2(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.M = n2Var;
            n2Var.X3 = new h9.g1(nVar2, 6);
        }
        nVar2.M.f39670e2.i0();
        nVar2.M.z1(1, false);
        n2 n2Var2 = nVar2.M;
        n2Var2.S3 = true;
        n2Var2.X0(new e7(nVar2, 8));
        nVar2.M.f1();
        n2 n2Var3 = nVar2.M;
        n2Var3.f39719t1 = null;
        if (nVar2.visibleDialog != null) {
            n2Var3.show();
        } else {
            nVar2.showDialog(n2Var3);
        }
    }

    public static void e0(n nVar) {
        i iVar = nVar.f18391n;
        if (iVar != null && iVar.isAttachedToWindow() && nVar.f18395x) {
            i iVar2 = nVar.f18391n;
            ri d02 = ri.d0(nVar.currentAccount);
            TLRPC.Document document = d02.f26656z0;
            d02.q1();
            g gVar = new g(nVar, 2);
            if (document == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.f35540n.getImageReceiver().f22642h1 = new eo(iVar2, gVar);
            lz f10 = u5.f(document, n6.f29385cd, 1.0f, null);
            if (f10 != null) {
                iVar2.f35540n.p(fc.b(document), go.b(document), f10, document);
            } else {
                iVar2.f35540n.l(fc.b(document), go.b(document), fc.c(w7.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            iVar2.f35540n.setOnClickListener(new co(iVar2, document, 1));
        }
    }

    public static void g0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - org.telegram.messenger.g0.L(36.0f);
        float i7 = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f18391n.setScaleX(i7);
        nVar.f18391n.setScaleY(i7);
        nVar.f18391n.setAlpha(Utilities.i(i7 * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int h0(n nVar) {
        return nVar.classGuid;
    }

    public static int i0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void Z(ArrayList arrayList, z41 z41Var) {
        arrayList.add(l41.k(this.h));
        arrayList.add(l41.u(gd.M0(2131752713, null)));
        arrayList.add(l41.k(this.f18393s));
        arrayList.add(l41.k(this.f18394w));
        if (this.f18395x) {
            arrayList.add(l41.f(gd.M0(2131752709, null), gd.M0(2131752708, null), 1));
        } else if (this.E != null) {
            String M0 = gd.M0(2131752709, null);
            String str = this.E;
            l41 l41Var = new l41(3);
            l41Var.d = 1;
            l41Var.f37018m = M0;
            l41Var.H = str;
            arrayList.add(l41Var);
        } else {
            String M02 = gd.M0(2131752709, null);
            TLRPC.Document document = this.f18396y;
            l41 l41Var2 = new l41(3);
            l41Var2.d = 1;
            l41Var2.f37018m = M02;
            l41Var2.H = document;
            arrayList.add(l41Var2);
        }
        arrayList.add(l41.C(gd.M0(2131752712, null)));
        boolean l02 = l0();
        this.L = !l02;
        if (!l02) {
            arrayList.add(l41.C(null));
            l41 e10 = l41.e(2, gd.M0(2131752710, null));
            e10.f37024s = true;
            arrayList.add(e10);
        }
        l41 l41Var3 = new l41(8);
        l41Var3.f37018m = null;
        arrayList.add(l41Var3);
    }

    @Override
    public final CharSequence a0() {
        return gd.M0(2131752714, null);
    }

    @Override
    public final void b0(l41 l41Var, View view) {
        View[] viewPages;
        int i7 = l41Var.d;
        if (i7 == 1) {
            j2 j2Var = new j2(getParentActivity(), getResourceProvider(), true, true);
            j2Var.f14808z1 = new ab.g(21, this, view);
            j2Var.A1 = new g(this, 0);
            for (View view2 : j2Var.f14799q1.getViewPages()) {
                if (view2 instanceof hi.z1) {
                    hi.y1 y1Var = ((hi.z1) view2).f15803c;
                    if (y1Var.I == null) {
                        y1Var.D(null);
                    }
                }
            }
            showDialog(j2Var);
        } else if (i7 == 2) {
            this.f18393s.setText("");
            this.f18394w.setText("");
            org.telegram.messenger.g0.v1(this.f18393s.d);
            org.telegram.messenger.g0.v1(this.f18394w.d);
            this.f18395x = true;
            this.f18391n.d("", "");
            i iVar = this.f18391n;
            ri d02 = ri.d0(this.currentAccount);
            TLRPC.Document document = d02.f26656z0;
            d02.q1();
            this.f18396y = document;
            iVar.setSticker(document);
            g gVar = this.f18389e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.h3(gVar, 5000L);
            j0(true);
        }
    }

    @Override
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.f18391n = new go(context, this.currentAccount, this.f18396y, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(16.0f);
        i iVar = this.f18391n;
        j jVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i7 = n6.f29331a;
        this.f18392r = new y5(iVar, jVar2, L, themedPaint);
        this.f18391n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(w5.e(null, this.currentAccount, getUserConfig().e(), n6.I.q()));
        this.h.addView(kVar, ma.e(-1, -1, 119));
        this.h.addView(this.f18391n, ma.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, gd.M0(2131752707, null), getMessagesController().I5, this.resourceProvider, 0);
        this.f18393s = lVar;
        lVar.f30912r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f18393s;
        int i10 = n6.f29396d6;
        u6.h(i10, lVar2, getResourceProvider());
        this.f18393s.setDivider(true);
        l lVar3 = this.f18393s;
        lVar3.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(lVar3, 5);
        i3 i3Var = lVar3.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new r2(fVar, 2));
        l lVar4 = new l(this, context, gd.M0(2131752711, null), getMessagesController().J5, this.resourceProvider, 1);
        this.f18394w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        u6.h(i10, this.f18394w, getResourceProvider());
        this.f18394w.setDivider(true);
        l lVar5 = this.f18394w;
        lVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(lVar5, 5);
        i3 i3Var2 = lVar5.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new r2(fVar2, 2));
        this.f18391n.d("", "");
        super.createView(context);
        this.f33531b.setBackground(null);
        this.f33530a.r1();
        this.f33530a.setSectionsDrawBackground(true);
        this.f33530a.f34607g3.f42809r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 7));
        this.f18390f = this.simpleActionBar.s(gd.M0(2131745751, null));
        j0(false);
        this.f33530a.addOnLayoutChangeListener(new m(this, 0));
        this.f33530a.j(new bi.q1(this, 18));
        d6 d6Var = this.f33530a;
        d6Var.f34609i3 = true;
        d6Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new p3(this.fragmentView, false, new t6(this, 7));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.E0) {
            n0();
        }
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f33530a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (this.f18390f != null) {
            this.f18390f.a(k0(), z10);
            d6 d6Var = this.f33530a;
            if (d6Var != null && d6Var.f34607g3 != null && this.L != (!l0())) {
                d6 d6Var2 = this.f33530a;
                if (d6Var2 != null && d6Var2.getChildCount() > 0) {
                    View view = null;
                    int i7 = Integer.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f33530a.getChildCount(); i11++) {
                        int R = RecyclerView.R(this.f33530a.getChildAt(i11));
                        View childAt = this.f33530a.getChildAt(i11);
                        if (R != -1 && childAt.getTop() < i7) {
                            i7 = childAt.getTop();
                            i10 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f33532c = i10;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f33532c == 0 && top > org.telegram.messenger.g0.L(88.0f)) {
                            this.d = org.telegram.messenger.g0.L(88.0f);
                        }
                        this.f33530a.f34606f3.h1(i10, view.getTop() - this.f33530a.getPaddingTop());
                    }
                }
                this.f33530a.f34607g3.O(true);
                int i12 = this.f33532c;
                if (i12 >= 0) {
                    d6 d6Var3 = this.f33530a;
                    d6Var3.f34606f3.h1(i12, this.d - d6Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean k0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f18393s.getText().toString();
        String str = this.H;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f18394w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f18395x;
                if (!z10 && (document = this.f18396y) != null) {
                    j3 = document.f28411id;
                } else {
                    j3 = 0;
                }
                if (j3 == this.J) {
                    if (z10 || this.F == null) {
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
        l lVar = this.f18393s;
        if (lVar != null && this.f18394w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f18394w.getText()) || !this.f18395x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void m0() {
        TLRPC.Document document;
        d5 d5Var = this.f18390f;
        if (d5Var.f28873y.f57658f) {
            return;
        }
        d5Var.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!l0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f18393s.getText().toString();
            updatebusinessintro.intro.description = this.f18394w.getText().toString();
            if (!this.f18395x && (this.f18396y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    mp messagesController = getMessagesController();
                    TLRPC.Document document2 = this.f18396y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f28417id = document2.f28411id;
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
            if (d2 != null) {
                d2.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                d2.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f18395x && (document = this.f18396y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (d2 != null) {
            d2.flags2 &= -17;
            d2.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ai.e1(this, 18));
        getMessagesStorage().j2(d2, false);
    }

    public final void n0() {
        long j3;
        boolean z10;
        z41 z41Var;
        if (this.K) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = d2.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.f18393s;
            String str = tL_businessIntro.title;
            this.H = str;
            lVar.setText(str);
            l lVar2 = this.f18394w;
            String str2 = d2.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.f18396y = d2.business_intro.sticker;
        } else {
            l lVar3 = this.f18393s;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.f18394w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.f18396y = null;
        }
        TLRPC.Document document = this.f18396y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28411id;
        }
        this.J = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18395x = z10;
        i iVar = this.f18391n;
        if (iVar != null) {
            iVar.d(this.f18393s.getText().toString(), this.f18394w.getText().toString());
            i iVar2 = this.f18391n;
            TLRPC.Document document2 = this.f18396y;
            if (document2 == null || this.f18395x) {
                ri d02 = ri.d0(this.currentAccount);
                TLRPC.Document document3 = d02.f26656z0;
                d02.q1();
                document2 = document3;
            }
            iVar2.setSticker(document2);
        }
        if (this.f18395x) {
            g gVar = this.f18389e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.h3(gVar, 5000L);
        }
        d6 d6Var = this.f33530a;
        if (d6Var != null && (z41Var = d6Var.f34607g3) != null) {
            z41Var.O(true);
        }
        this.K = true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (k0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = gd.M0(2131743598, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131752706, null);
                alertDialog$Builder.k(gd.M0(2131754214, null), new org.telegram.ui.ActionBar.r1(this) {
                    public final n f18330b;

                    {
                        this.f18330b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f18330b.m0();
                                return;
                            default:
                                this.f18330b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(gd.M0(2131747387, null), new org.telegram.ui.ActionBar.r1(this) {
                    public final n f18330b;

                    {
                        this.f18330b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f18330b.m0();
                                return;
                            default:
                                this.f18330b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.E0);
        ri.d0(this.currentAccount).D(0);
        ri.d0(this.currentAccount).Y0(0, false, true, false);
        ri.d0(this.currentAccount).Y0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

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
import bi.v3;
import bi.x4;
import c8.ja;
import fi.p2;
import hi.g7;
import hi.i2;
import hi.p3;
import hi.q4;
import hi.x5;
import java.util.ArrayList;
import m.r2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.pz;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ns;
public final class n extends r41 implements is {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public p2 M;
    public z4 f17998f;
    public j h;
    public i f17999n;
    public v5 f18000r;
    public l f18001s;
    public l f18002w;
    public TLRPC.Document f18004y;
    public final g f17997e = new g(this, 1);
    public boolean f18003x = true;

    public n() {
        si mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.f26516z0;
        mediaDataController.n1();
        this.f18004y = document;
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
            p2 p2Var = new p2(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.M = p2Var;
            p2Var.X3 = new hi.l0(nVar2, 6);
        }
        nVar2.M.f36447e2.i0();
        nVar2.M.y1(1, false);
        p2 p2Var2 = nVar2.M;
        p2Var2.S3 = true;
        p2Var2.W0(new q4(nVar2, 8));
        nVar2.M.e1();
        p2 p2Var3 = nVar2.M;
        p2Var3.f36496t1 = null;
        if (nVar2.visibleDialog != null) {
            p2Var3.show();
        } else {
            nVar2.showDialog(p2Var3);
        }
    }

    public static void e0(n nVar) {
        i iVar = nVar.f17999n;
        if (iVar != null && iVar.isAttachedToWindow() && nVar.f18003x) {
            i iVar2 = nVar.f17999n;
            si b02 = si.b0(nVar.currentAccount);
            TLRPC.Document document = b02.f26516z0;
            b02.n1();
            g gVar = new g(nVar, 2);
            if (document == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.f41736n.getImageReceiver().f22276h1 = new vn(iVar2, gVar);
            pz f10 = t5.f(document, j6.f28838cd, 1.0f, null);
            if (f10 != null) {
                iVar2.f41736n.p(gc.b(document), xn.b(document), f10, document);
            } else {
                iVar2.f41736n.l(gc.b(document), xn.b(document), gc.c(w7.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            iVar2.f41736n.setOnClickListener(new un(iVar2, document, 1));
        }
    }

    public static void g0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - org.telegram.messenger.g0.L(36.0f);
        float i7 = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f17999n.setScaleX(i7);
        nVar.f17999n.setScaleY(i7);
        nVar.f17999n.setAlpha(Utilities.i(i7 * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int h0(n nVar) {
        return nVar.classGuid;
    }

    public static int i0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        arrayList.add(b41.k(this.h));
        arrayList.add(b41.u(hd.M0(2131752724, null)));
        arrayList.add(b41.k(this.f18001s));
        arrayList.add(b41.k(this.f18002w));
        if (this.f18003x) {
            arrayList.add(b41.f(hd.M0(2131752720, null), hd.M0(2131752719, null), 1));
        } else if (this.E != null) {
            String M0 = hd.M0(2131752720, null);
            String str = this.E;
            b41 b41Var = new b41(3);
            b41Var.d = 1;
            b41Var.f33181l = M0;
            b41Var.G = str;
            arrayList.add(b41Var);
        } else {
            String M02 = hd.M0(2131752720, null);
            TLRPC.Document document = this.f18004y;
            b41 b41Var2 = new b41(3);
            b41Var2.d = 1;
            b41Var2.f33181l = M02;
            b41Var2.G = document;
            arrayList.add(b41Var2);
        }
        arrayList.add(b41.C(hd.M0(2131752723, null)));
        boolean l02 = l0();
        this.L = !l02;
        if (!l02) {
            arrayList.add(b41.C(null));
            b41 e10 = b41.e(2, hd.M0(2131752721, null));
            e10.f33187r = true;
            arrayList.add(e10);
        }
        b41 b41Var3 = new b41(8);
        b41Var3.f33181l = null;
        arrayList.add(b41Var3);
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131752725, null);
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        View[] viewPages;
        int i7 = b41Var.d;
        if (i7 == 1) {
            i2 i2Var = new i2(getParentActivity(), getResourceProvider(), true, true);
            i2Var.f14415z1 = new ab.g(23, this, view);
            i2Var.A1 = new g(this, 0);
            for (View view2 : i2Var.f14406q1.getViewPages()) {
                if (view2 instanceof hi.y1) {
                    hi.x1 x1Var = ((hi.y1) view2).f15409c;
                    if (x1Var.I == null) {
                        x1Var.D(null);
                    }
                }
            }
            showDialog(i2Var);
        } else if (i7 == 2) {
            this.f18001s.setText("");
            this.f18002w.setText("");
            org.telegram.messenger.g0.v1(this.f18001s.d);
            org.telegram.messenger.g0.v1(this.f18002w.d);
            this.f18003x = true;
            this.f17999n.d("", "");
            i iVar = this.f17999n;
            si b02 = si.b0(this.currentAccount);
            TLRPC.Document document = b02.f26516z0;
            b02.n1();
            this.f18004y = document;
            iVar.setSticker(document);
            g gVar = this.f17997e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
            j0(true);
        }
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.f17999n = new xn(context, this.currentAccount, this.f18004y, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(16.0f);
        i iVar = this.f17999n;
        j jVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i7 = j6.f28784a;
        this.f18000r = new v5(iVar, jVar2, L, themedPaint);
        this.f17999n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(x5.e(null, this.currentAccount, getUserConfig().e(), j6.I.q()));
        this.h.addView(kVar, ja.e(-1, -1, 119));
        this.h.addView(this.f17999n, ja.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, hd.M0(2131752718, null), getMessagesController().G5, this.resourceProvider, 0);
        this.f18001s = lVar;
        lVar.f30550r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f18001s;
        int i10 = j6.f28849d6;
        q6.h(i10, lVar2, getResourceProvider());
        this.f18001s.setDivider(true);
        l lVar3 = this.f18001s;
        lVar3.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(lVar3, 5);
        i3 i3Var = lVar3.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new r2(fVar, 2));
        l lVar4 = new l(this, context, hd.M0(2131752722, null), getMessagesController().H5, this.resourceProvider, 1);
        this.f18002w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        q6.h(i10, this.f18002w, getResourceProvider());
        this.f18002w.setDivider(true);
        l lVar5 = this.f18002w;
        lVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(lVar5, 5);
        i3 i3Var2 = lVar5.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new r2(fVar2, 2));
        this.f17999n.d("", "");
        super.createView(context);
        this.f38883b.setBackground(null);
        this.f38882a.r1();
        this.f38882a.setSectionsDrawBackground(true);
        this.f38882a.f39895g3.f38201r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 5));
        this.f17998f = this.simpleActionBar.q(hd.M0(2131745946, null));
        j0(false);
        this.f38882a.addOnLayoutChangeListener(new m(this, 0));
        this.f38882a.j(new bi.z4(this, 17));
        v3 v3Var = this.f38882a;
        v3Var.f39897i3 = true;
        v3Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new p3(this.fragmentView, false, new g7(this, 6));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.E0) {
            n0();
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f38882a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (this.f17998f != null) {
            this.f17998f.a(k0(), z10);
            v3 v3Var = this.f38882a;
            if (v3Var != null && v3Var.f39895g3 != null && this.L != (!l0())) {
                v3 v3Var2 = this.f38882a;
                if (v3Var2 != null && v3Var2.getChildCount() > 0) {
                    View view = null;
                    int i7 = Integer.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f38882a.getChildCount(); i11++) {
                        int R = RecyclerView.R(this.f38882a.getChildAt(i11));
                        View childAt = this.f38882a.getChildAt(i11);
                        if (R != -1 && childAt.getTop() < i7) {
                            i7 = childAt.getTop();
                            i10 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f38884c = i10;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f38884c == 0 && top > org.telegram.messenger.g0.L(88.0f)) {
                            this.d = org.telegram.messenger.g0.L(88.0f);
                        }
                        this.f38882a.f39894f3.h1(i10, view.getTop() - this.f38882a.getPaddingTop());
                    }
                }
                this.f38882a.f39895g3.O(true);
                int i12 = this.f38884c;
                if (i12 >= 0) {
                    v3 v3Var3 = this.f38882a;
                    v3Var3.f39894f3.h1(i12, this.d - v3Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean k0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f18001s.getText().toString();
        String str = this.H;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f18002w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f18003x;
                if (!z10 && (document = this.f18004y) != null) {
                    j3 = document.f28057id;
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
        l lVar = this.f18001s;
        if (lVar != null && this.f18002w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f18002w.getText()) || !this.f18003x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void m0() {
        TLRPC.Document document;
        z4 z4Var = this.f17998f;
        if (z4Var.f29950y.f57082f) {
            return;
        }
        z4Var.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!l0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f18001s.getText().toString();
            updatebusinessintro.intro.description = this.f18002w.getText().toString();
            if (!this.f18003x && (this.f18004y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    np messagesController = getMessagesController();
                    TLRPC.Document document2 = this.f18004y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f28063id = document2.f28057id;
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
                if (!this.f18003x && (document = this.f18004y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (b22 != null) {
            b22.flags2 &= -17;
            b22.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ai.d1(this, 16));
        getMessagesStorage().j2(b22, false);
    }

    public final void n0() {
        long j3;
        boolean z10;
        p41 p41Var;
        if (this.K) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = b22.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.f18001s;
            String str = tL_businessIntro.title;
            this.H = str;
            lVar.setText(str);
            l lVar2 = this.f18002w;
            String str2 = b22.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.f18004y = b22.business_intro.sticker;
        } else {
            l lVar3 = this.f18001s;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.f18002w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.f18004y = null;
        }
        TLRPC.Document document = this.f18004y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28057id;
        }
        this.J = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18003x = z10;
        i iVar = this.f17999n;
        if (iVar != null) {
            iVar.d(this.f18001s.getText().toString(), this.f18002w.getText().toString());
            i iVar2 = this.f17999n;
            TLRPC.Document document2 = this.f18004y;
            if (document2 == null || this.f18003x) {
                si b02 = si.b0(this.currentAccount);
                TLRPC.Document document3 = b02.f26516z0;
                b02.n1();
                document2 = document3;
            }
            iVar2.setSticker(document2);
        }
        if (this.f18003x) {
            g gVar = this.f17997e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
        }
        v3 v3Var = this.f38882a;
        if (v3Var != null && (p41Var = v3Var.f39895g3) != null) {
            p41Var.O(true);
        }
        this.K = true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (k0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743835, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131752717, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n f17954b;

                    {
                        this.f17954b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f17954b.m0();
                                return;
                            default:
                                this.f17954b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(hd.M0(2131747580, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n f17954b;

                    {
                        this.f17954b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f17954b.m0();
                                return;
                            default:
                                this.f17954b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
        si.b0(this.currentAccount).B(0);
        si.b0(this.currentAccount).V0(0, false, true, false);
        si.b0(this.currentAccount).V0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

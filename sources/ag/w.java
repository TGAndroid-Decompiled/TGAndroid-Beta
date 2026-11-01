package ag;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.d00;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.messenger.v5;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.kt;
import vh.k4;
import w7.b6;
public final class w extends s51 implements vs {
    public String D;
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public boolean K;
    public v L;
    public l5 f761f;
    public q h;
    public p f762n;
    public g6 f763r;
    public s f764s;
    public s f765w;
    public TLRPC.Document f767y;
    public final n e = new n(this, 1);
    public boolean f766x = true;

    public w() {
        vi mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.f18689y0;
        mediaDataController.n1();
        this.f767y = document;
        this.K = l0();
    }

    public static void d0(w wVar) {
        w wVar2;
        kt.p().T = null;
        if (wVar.getParentActivity() == null) {
            return;
        }
        if (wVar.getParentActivity() == null || wVar.getParentActivity() == null || wVar.L != null) {
            wVar2 = wVar;
        } else {
            wVar2 = wVar;
            v vVar = new v(wVar2, wVar.getParentActivity(), wVar, wVar.resourceProvider, 0);
            wVar2.L = vVar;
            vVar.T3 = new za.c(wVar2, 2);
        }
        wVar2.L.a2.g0();
        wVar2.L.x1(1, false);
        v vVar2 = wVar2.L;
        vVar2.O3 = true;
        vVar2.V0(new a(wVar2, 1));
        wVar2.L.d1();
        v vVar3 = wVar2.L;
        vVar3.f24799p1 = null;
        if (wVar2.visibleDialog != null) {
            vVar3.show();
        } else {
            wVar2.showDialog(vVar3);
        }
    }

    public static void e0(w wVar) {
        p pVar = wVar.f762n;
        if (pVar != null && pVar.isAttachedToWindow() && wVar.f766x) {
            p pVar2 = wVar.f762n;
            vi b02 = vi.b0(wVar.currentAccount);
            TLRPC.Document document = b02.f18689y0;
            b02.n1();
            n nVar = new n(wVar, 2);
            if (document == null) {
                pVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = pVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            pVar2.f32609n.getImageReceiver().f14383g1 = new vn(pVar2, nVar);
            d00 f7 = v5.f(document, t6.Zc, 1.0f, null);
            if (f7 != null) {
                pVar2.f32609n.p(jc.b(document), xn.b(document), f7, document);
            } else {
                pVar2.f32609n.l(jc.b(document), xn.b(document), jc.c(b8.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            pVar2.f32609n.setOnClickListener(new un(pVar2, document, 1));
        }
    }

    public static void g0(w wVar) {
        if (!(wVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) wVar.h.getParent()).getTop();
        int measuredHeight = wVar.h.getMeasuredHeight() - org.telegram.messenger.i0.L(36.0f);
        float i10 = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        wVar.f762n.setScaleX(i10);
        wVar.f762n.setScaleY(i10);
        wVar.f762n.setAlpha(Utilities.i(i10 * 2.0f, 1.0f, 0.0f));
        wVar.h.invalidate();
    }

    public static int h0(w wVar) {
        return wVar.classGuid;
    }

    public static int i0(w wVar) {
        return wVar.classGuid;
    }

    @Override
    public final void Z(ArrayList arrayList, q51 q51Var) {
        arrayList.add(b51.k(this.h));
        arrayList.add(b51.u(dd.L0(2131752724, null)));
        arrayList.add(b51.k(this.f764s));
        arrayList.add(b51.k(this.f765w));
        if (this.f766x) {
            arrayList.add(b51.f(dd.L0(2131752720, null), dd.L0(2131752719, null), 1));
        } else if (this.D != null) {
            String L0 = dd.L0(2131752720, null);
            String str = this.D;
            b51 b51Var = new b51(3);
            b51Var.d = 1;
            b51Var.f24643l = L0;
            b51Var.G = str;
            arrayList.add(b51Var);
        } else {
            String L02 = dd.L0(2131752720, null);
            TLRPC.Document document = this.f767y;
            b51 b51Var2 = new b51(3);
            b51Var2.d = 1;
            b51Var2.f24643l = L02;
            b51Var2.G = document;
            arrayList.add(b51Var2);
        }
        arrayList.add(b51.C(dd.L0(2131752723, null)));
        boolean l02 = l0();
        this.K = !l02;
        if (!l02) {
            arrayList.add(b51.C(null));
            b51 e = b51.e(2, dd.L0(2131752721, null));
            e.f24649r = true;
            arrayList.add(e);
        }
        b51 b51Var3 = new b51(8);
        b51Var3.f24643l = null;
        arrayList.add(b51Var3);
    }

    @Override
    public final CharSequence a0() {
        return dd.L0(2131752725, null);
    }

    @Override
    public final void b0(b51 b51Var, View view) {
        View[] viewPages;
        int i10 = b51Var.d;
        if (i10 == 1) {
            vh.u1 u1Var = new vh.u1(getParentActivity(), getResourceProvider(), true, true);
            u1Var.f52013v1 = new m(0, this, view);
            u1Var.f52014w1 = new n(this, 0);
            for (View view2 : u1Var.f52004m1.getViewPages()) {
                if (view2 instanceof vh.l1) {
                    vh.k1 k1Var = ((vh.l1) view2).f51461c;
                    if (k1Var.H == null) {
                        k1Var.D(null);
                    }
                }
            }
            showDialog(u1Var);
        } else if (i10 == 2) {
            this.f764s.setText("");
            this.f765w.setText("");
            org.telegram.messenger.i0.v1(this.f764s.d);
            org.telegram.messenger.i0.v1(this.f765w.d);
            this.f766x = true;
            this.f762n.d("", "");
            p pVar = this.f762n;
            vi b02 = vi.b0(this.currentAccount);
            TLRPC.Document document = b02.f18689y0;
            b02.n1();
            this.f767y = document;
            pVar.setSticker(document);
            n nVar = this.e;
            org.telegram.messenger.i0.r(nVar);
            org.telegram.messenger.i0.h3(nVar, 5000L);
            j0(true);
        }
    }

    @Override
    public final boolean c0(b51 b51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.f762n = new xn(context, this.currentAccount, this.f767y, getResourceProvider());
        q qVar = new q(this, context);
        this.h = qVar;
        qVar.setWillNotDraw(false);
        int L = org.telegram.messenger.i0.L(16.0f);
        p pVar = this.f762n;
        q qVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i10 = t6.f20866a;
        this.f763r = new g6(pVar, qVar2, L, themedPaint);
        this.f762n.setBackground(new ColorDrawable(0));
        r rVar = new r(context, 0);
        rVar.setScaleType(ImageView.ScaleType.MATRIX);
        rVar.setImageDrawable(k4.e(null, this.currentAccount, getUserConfig().e(), t6.I.q()));
        this.h.addView(rVar, b6.e(-1, -1, 119));
        this.h.addView(this.f762n, b6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        s sVar = new s(this, context, dd.L0(2131752718, null), getMessagesController().G5, this.resourceProvider, 0);
        this.f764s = sVar;
        sVar.f22296r = true;
        sVar.setShowLimitOnFocus(true);
        s sVar2 = this.f764s;
        int i11 = t6.f20930d6;
        a7.i(i11, sVar2, getResourceProvider());
        this.f764s.setDivider(true);
        s sVar3 = this.f764s;
        sVar3.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(sVar3, 4);
        org.telegram.ui.Cells.k3 k3Var = sVar3.d;
        k3Var.setImeOptions(6);
        k3Var.setOnEditorActionListener(new m.s2(fVar, 2));
        s sVar4 = new s(this, context, dd.L0(2131752722, null), getMessagesController().H5, this.resourceProvider, 1);
        this.f765w = sVar4;
        sVar4.setShowLimitOnFocus(true);
        a7.i(i11, this.f765w, getResourceProvider());
        this.f765w.setDivider(true);
        s sVar5 = this.f765w;
        sVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(sVar5, 4);
        org.telegram.ui.Cells.k3 k3Var2 = sVar5.d;
        k3Var2.setImeOptions(6);
        k3Var2.setOnEditorActionListener(new m.s2(fVar2, 2));
        this.f762n.d("", "");
        super.createView(context);
        this.f30218b.setBackground(null);
        this.f30217a.r1();
        this.f30217a.setSectionsDrawBackground(true);
        this.f30217a.f31183f3.f29638r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 1));
        this.f761f = this.simpleActionBar.n(dd.L0(2131745963, null));
        j0(false);
        this.f30217a.addOnLayoutChangeListener(new t(this, 0));
        this.f30217a.j(new u(this, 0));
        ii iiVar = this.f30217a;
        iiVar.f31185h3 = true;
        iiVar.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new vh.r2(this.fragmentView, false, new l(this, 0));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.E0) {
            n0();
        }
    }

    @Override
    public final uk0 getListViewForSimpleGlass() {
        return this.f30217a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (this.f761f != null) {
            this.f761f.a(k0(), z10);
            ii iiVar = this.f30217a;
            if (iiVar != null && iiVar.f31183f3 != null && this.K != (!l0())) {
                ii iiVar2 = this.f30217a;
                if (iiVar2 != null && iiVar2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f30217a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f30217a.getChildAt(i12));
                        View childAt = this.f30217a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f30219c = i11;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f30219c == 0 && top > org.telegram.messenger.i0.L(88.0f)) {
                            this.d = org.telegram.messenger.i0.L(88.0f);
                        }
                        this.f30217a.f31182e3.h1(i11, view.getTop() - this.f30217a.getPaddingTop());
                    }
                }
                this.f30217a.f31183f3.O(true);
                int i13 = this.f30219c;
                if (i13 >= 0) {
                    ii iiVar3 = this.f30217a;
                    iiVar3.f31182e3.h1(i13, this.d - iiVar3.getPaddingTop());
                }
            }
        }
    }

    public final boolean k0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f764s.getText().toString();
        String str = this.G;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f765w.getText().toString();
            String str3 = this.H;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f766x;
                if (!z10 && (document = this.f767y) != null) {
                    j10 = document.f19800id;
                } else {
                    j10 = 0;
                }
                if (j10 == this.I) {
                    if (z10 || this.E == null) {
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
        s sVar = this.f764s;
        if (sVar != null && this.f765w != null) {
            if (!TextUtils.isEmpty(sVar.getText()) || !TextUtils.isEmpty(this.f765w.getText()) || !this.f766x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void m0() {
        TLRPC.Document document;
        l5 l5Var = this.f761f;
        if (l5Var.f20548y.f7022f) {
            return;
        }
        l5Var.b(true);
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!l0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f764s.getText().toString();
            updatebusinessintro.intro.description = this.f765w.getText().toString();
            if (!this.f766x && (this.f767y != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    wp messagesController = getMessagesController();
                    TLRPC.Document document2 = this.f767y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f19806id = document2.f19800id;
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
            if (a2 != null) {
                a2.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                a2.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f766x && (document = this.f767y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (a2 != null) {
            a2.flags2 &= -17;
            a2.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new c(this, 2));
        getMessagesStorage().j2(a2, false);
    }

    public final void n0() {
        long j10;
        boolean z10;
        q51 q51Var;
        if (this.J) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = a2.business_intro;
        if (tL_businessIntro != null) {
            s sVar = this.f764s;
            String str = tL_businessIntro.title;
            this.G = str;
            sVar.setText(str);
            s sVar2 = this.f765w;
            String str2 = a2.business_intro.description;
            this.H = str2;
            sVar2.setText(str2);
            this.f767y = a2.business_intro.sticker;
        } else {
            s sVar3 = this.f764s;
            this.G = "";
            sVar3.setText("");
            s sVar4 = this.f765w;
            this.H = "";
            sVar4.setText("");
            this.E = null;
            this.f767y = null;
        }
        TLRPC.Document document = this.f767y;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19800id;
        }
        this.I = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f766x = z10;
        p pVar = this.f762n;
        if (pVar != null) {
            pVar.d(this.f764s.getText().toString(), this.f765w.getText().toString());
            p pVar2 = this.f762n;
            TLRPC.Document document2 = this.f767y;
            if (document2 == null || this.f766x) {
                vi b02 = vi.b0(this.currentAccount);
                TLRPC.Document document3 = b02.f18689y0;
                b02.n1();
                document2 = document3;
            }
            pVar2.setSticker(document2);
        }
        if (this.f766x) {
            n nVar = this.e;
            org.telegram.messenger.i0.r(nVar);
            org.telegram.messenger.i0.h3(nVar, 5000L);
        }
        ii iiVar = this.f30217a;
        if (iiVar != null && (q51Var = iiVar.f31183f3) != null) {
            q51Var.O(true);
        }
        this.J = true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (k0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = dd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = dd.L0(2131752717, null);
                alertDialog$Builder.k(dd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final w f660b;

                    {
                        this.f660b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                        switch (r2) {
                            case 0:
                                this.f660b.m0();
                                return;
                            default:
                                this.f660b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(dd.L0(2131747596, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final w f660b;

                    {
                        this.f660b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                        switch (r2) {
                            case 0:
                                this.f660b.m0();
                                return;
                            default:
                                this.f660b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(x1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.E0);
        vi.b0(this.currentAccount).B(0);
        vi.b0(this.currentAccount).V0(0, false, true, false);
        vi.b0(this.currentAccount).V0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

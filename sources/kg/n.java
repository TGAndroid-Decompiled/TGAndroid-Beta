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
import bi.i6;
import c8.na;
import fi.n2;
import hi.e7;
import hi.i2;
import hi.o3;
import hi.w5;
import java.util.ArrayList;
import m.r2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.u5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.o41;
import org.telegram.ui.ns;
public final class n extends e51 implements gs {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public n2 M;
    public c5 f18386f;
    public j h;
    public i f18387n;
    public x5 f18388r;
    public l f18389s;
    public l f18390w;
    public TLRPC.Document f18392y;
    public final g f18385e = new g(this, 1);
    public boolean f18391x = true;

    public n() {
        si mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.f26832z0;
        mediaDataController.q1();
        this.f18392y = document;
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
        nVar2.M.f40363e2.i0();
        nVar2.M.z1(1, false);
        n2 n2Var2 = nVar2.M;
        n2Var2.S3 = true;
        n2Var2.X0(new e7(nVar2, 8));
        nVar2.M.f1();
        n2 n2Var3 = nVar2.M;
        n2Var3.f40412t1 = null;
        if (nVar2.visibleDialog != null) {
            n2Var3.show();
        } else {
            nVar2.showDialog(n2Var3);
        }
    }

    public static void e0(n nVar) {
        i iVar = nVar.f18387n;
        if (iVar != null && iVar.isAttachedToWindow() && nVar.f18391x) {
            i iVar2 = nVar.f18387n;
            si d02 = si.d0(nVar.currentAccount);
            TLRPC.Document document = d02.f26832z0;
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
            iVar2.f36249n.getImageReceiver().f22634h1 = new go(iVar2, gVar);
            mz f10 = u5.f(document, m6.f29336cd, 1.0f, null);
            if (f10 != null) {
                iVar2.f36249n.p(gc.b(document), io.b(document), f10, document);
            } else {
                iVar2.f36249n.l(gc.b(document), io.b(document), gc.c(w7.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            iVar2.f36249n.setOnClickListener(new fo(iVar2, document, 1));
        }
    }

    public static void g0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - org.telegram.messenger.g0.L(36.0f);
        float i7 = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f18387n.setScaleX(i7);
        nVar.f18387n.setScaleY(i7);
        nVar.f18387n.setAlpha(Utilities.i(i7 * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int h0(n nVar) {
        return nVar.classGuid;
    }

    public static int i0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        arrayList.add(o41.k(this.h));
        arrayList.add(o41.u(hd.N0(2131752712, null)));
        arrayList.add(o41.k(this.f18389s));
        arrayList.add(o41.k(this.f18390w));
        if (this.f18391x) {
            arrayList.add(o41.f(hd.N0(2131752708, null), hd.N0(2131752707, null), 1));
        } else if (this.E != null) {
            String N0 = hd.N0(2131752708, null);
            String str = this.E;
            o41 o41Var = new o41(3);
            o41Var.d = 1;
            o41Var.f38058m = N0;
            o41Var.H = str;
            arrayList.add(o41Var);
        } else {
            String N02 = hd.N0(2131752708, null);
            TLRPC.Document document = this.f18392y;
            o41 o41Var2 = new o41(3);
            o41Var2.d = 1;
            o41Var2.f38058m = N02;
            o41Var2.H = document;
            arrayList.add(o41Var2);
        }
        arrayList.add(o41.C(hd.N0(2131752711, null)));
        boolean l02 = l0();
        this.L = !l02;
        if (!l02) {
            arrayList.add(o41.C(null));
            o41 e10 = o41.e(2, hd.N0(2131752709, null));
            e10.f38064s = true;
            arrayList.add(e10);
        }
        o41 o41Var3 = new o41(8);
        o41Var3.f38058m = null;
        arrayList.add(o41Var3);
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131752713, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        View[] viewPages;
        int i7 = o41Var.d;
        if (i7 == 1) {
            i2 i2Var = new i2(getParentActivity(), getResourceProvider(), true, true);
            i2Var.f14716z1 = new ab.g(21, this, view);
            i2Var.A1 = new g(this, 0);
            for (View view2 : i2Var.f14707q1.getViewPages()) {
                if (view2 instanceof hi.y1) {
                    hi.x1 x1Var = ((hi.y1) view2).f15710c;
                    if (x1Var.I == null) {
                        x1Var.D(null);
                    }
                }
            }
            showDialog(i2Var);
        } else if (i7 == 2) {
            this.f18389s.setText("");
            this.f18390w.setText("");
            org.telegram.messenger.g0.v1(this.f18389s.d);
            org.telegram.messenger.g0.v1(this.f18390w.d);
            this.f18391x = true;
            this.f18387n.d("", "");
            i iVar = this.f18387n;
            si d02 = si.d0(this.currentAccount);
            TLRPC.Document document = d02.f26832z0;
            d02.q1();
            this.f18392y = document;
            iVar.setSticker(document);
            g gVar = this.f18385e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.h3(gVar, 5000L);
            j0(true);
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.f18387n = new io(context, this.currentAccount, this.f18392y, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(16.0f);
        i iVar = this.f18387n;
        j jVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i7 = m6.f29282a;
        this.f18388r = new x5(iVar, jVar2, L, themedPaint);
        this.f18387n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(w5.e(null, this.currentAccount, getUserConfig().e(), m6.I.q()));
        this.h.addView(kVar, na.e(-1, -1, 119));
        this.h.addView(this.f18387n, na.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, hd.N0(2131752706, null), getMessagesController().I5, this.resourceProvider, 0);
        this.f18389s = lVar;
        lVar.f30972r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f18389s;
        int i10 = m6.f29347d6;
        t6.h(i10, lVar2, getResourceProvider());
        this.f18389s.setDivider(true);
        l lVar3 = this.f18389s;
        lVar3.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(lVar3, 5);
        j3 j3Var = lVar3.d;
        j3Var.setImeOptions(6);
        j3Var.setOnEditorActionListener(new r2(fVar, 2));
        l lVar4 = new l(this, context, hd.N0(2131752710, null), getMessagesController().J5, this.resourceProvider, 1);
        this.f18390w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        t6.h(i10, this.f18390w, getResourceProvider());
        this.f18390w.setDivider(true);
        l lVar5 = this.f18390w;
        lVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(lVar5, 5);
        j3 j3Var2 = lVar5.d;
        j3Var2.setImeOptions(6);
        j3Var2.setOnEditorActionListener(new r2(fVar2, 2));
        this.f18387n.d("", "");
        super.createView(context);
        this.f34672b.setBackground(null);
        this.f34671a.r1();
        this.f34671a.setSectionsDrawBackground(true);
        this.f34671a.f35742g3.f34026r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 7));
        this.f18386f = this.simpleActionBar.s(hd.N0(2131745750, null));
        j0(false);
        this.f34671a.addOnLayoutChangeListener(new m(this, 0));
        this.f34671a.j(new bi.v1(this, 18));
        i6 i6Var = this.f34671a;
        i6Var.f35744i3 = true;
        i6Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new o3(this.fragmentView, false, new hi.t6(this, 7));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.E0) {
            n0();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34671a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (this.f18386f != null) {
            this.f18386f.a(k0(), z10);
            i6 i6Var = this.f34671a;
            if (i6Var != null && i6Var.f35742g3 != null && this.L != (!l0())) {
                i6 i6Var2 = this.f34671a;
                if (i6Var2 != null && i6Var2.getChildCount() > 0) {
                    View view = null;
                    int i7 = Integer.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f34671a.getChildCount(); i11++) {
                        int R = RecyclerView.R(this.f34671a.getChildAt(i11));
                        View childAt = this.f34671a.getChildAt(i11);
                        if (R != -1 && childAt.getTop() < i7) {
                            i7 = childAt.getTop();
                            i10 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f34673c = i10;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f34673c == 0 && top > org.telegram.messenger.g0.L(88.0f)) {
                            this.d = org.telegram.messenger.g0.L(88.0f);
                        }
                        this.f34671a.f35741f3.h1(i10, view.getTop() - this.f34671a.getPaddingTop());
                    }
                }
                this.f34671a.f35742g3.O(true);
                int i12 = this.f34673c;
                if (i12 >= 0) {
                    i6 i6Var3 = this.f34671a;
                    i6Var3.f35741f3.h1(i12, this.d - i6Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean k0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f18389s.getText().toString();
        String str = this.H;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f18390w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f18391x;
                if (!z10 && (document = this.f18392y) != null) {
                    j3 = document.f28404id;
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
        l lVar = this.f18389s;
        if (lVar != null && this.f18390w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f18390w.getText()) || !this.f18391x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void m0() {
        TLRPC.Document document;
        c5 c5Var = this.f18386f;
        if (c5Var.f28825y.f57666f) {
            return;
        }
        c5Var.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!l0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f18389s.getText().toString();
            updatebusinessintro.intro.description = this.f18390w.getText().toString();
            if (!this.f18391x && (this.f18392y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    np messagesController = getMessagesController();
                    TLRPC.Document document2 = this.f18392y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f28410id = document2.f28404id;
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
                if (!this.f18391x && (document = this.f18392y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (d2 != null) {
            d2.flags2 &= -17;
            d2.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ai.a1(this, 18));
        getMessagesStorage().j2(d2, false);
    }

    public final void n0() {
        long j3;
        boolean z10;
        c51 c51Var;
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
            l lVar = this.f18389s;
            String str = tL_businessIntro.title;
            this.H = str;
            lVar.setText(str);
            l lVar2 = this.f18390w;
            String str2 = d2.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.f18392y = d2.business_intro.sticker;
        } else {
            l lVar3 = this.f18389s;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.f18390w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.f18392y = null;
        }
        TLRPC.Document document = this.f18392y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28404id;
        }
        this.J = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18391x = z10;
        i iVar = this.f18387n;
        if (iVar != null) {
            iVar.d(this.f18389s.getText().toString(), this.f18390w.getText().toString());
            i iVar2 = this.f18387n;
            TLRPC.Document document2 = this.f18392y;
            if (document2 == null || this.f18391x) {
                si d02 = si.d0(this.currentAccount);
                TLRPC.Document document3 = d02.f26832z0;
                d02.q1();
                document2 = document3;
            }
            iVar2.setSticker(document2);
        }
        if (this.f18391x) {
            g gVar = this.f18385e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.h3(gVar, 5000L);
        }
        i6 i6Var = this.f34671a;
        if (i6Var != null && (c51Var = i6Var.f35742g3) != null) {
            c51Var.O(true);
        }
        this.K = true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (k0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = hd.N0(2131743592, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131752705, null);
                alertDialog$Builder.k(hd.N0(2131754213, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n f18323b;

                    {
                        this.f18323b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f18323b.m0();
                                return;
                            default:
                                this.f18323b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(hd.N0(2131747386, null), new org.telegram.ui.ActionBar.q1(this) {
                    public final n f18323b;

                    {
                        this.f18323b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                        switch (r2) {
                            case 0:
                                this.f18323b.m0();
                                return;
                            default:
                                this.f18323b.finishFragment();
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
        getNotificationCenter().c(this, ls.E0);
        si.d0(this.currentAccount).D(0);
        si.d0(this.currentAccount).Y0(0, false, true, false);
        si.d0(this.currentAccount).Y0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

package lg;

import ai.g5;
import ai.h4;
import ai.j5;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import ei.x2;
import gi.i2;
import gi.j8;
import gi.p3;
import gi.q4;
import gi.y5;
import ii.l2;
import java.util.ArrayList;
import m.r2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.is;
public final class m extends h41 implements cs {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public x2 M;
    public b5 f18358f;
    public j h;
    public i f18359n;
    public v5 f18360r;
    public l f18361s;
    public l f18362w;
    public TLRPC.Document f18364y;
    public final g f18357e = new g(this, 1);
    public boolean f18363x = true;

    public m() {
        li mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.f24066z0;
        mediaDataController.n1();
        this.f18364y = document;
        this.L = l0();
    }

    public static void d0(m mVar) {
        m mVar2;
        is.p().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.M != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            x2 x2Var = new x2(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.M = x2Var;
            x2Var.U3 = new hi.d(mVar2, 8);
        }
        mVar2.M.f32215b2.i0();
        mVar2.M.y1(1, false);
        x2 x2Var2 = mVar2.M;
        x2Var2.P3 = true;
        x2Var2.W0(new q4(mVar2, 16));
        mVar2.M.e1();
        x2 x2Var3 = mVar2.M;
        x2Var3.f32262q1 = null;
        if (mVar2.visibleDialog != null) {
            x2Var3.show();
        } else {
            mVar2.showDialog(x2Var3);
        }
    }

    public static void e0(m mVar) {
        i iVar = mVar.f18359n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f18363x) {
            i iVar2 = mVar.f18359n;
            li b02 = li.b0(mVar.currentAccount);
            TLRPC.Document document = b02.f24066z0;
            b02.n1();
            g gVar = new g(mVar, 2);
            if (document == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.f36864n.getImageReceiver().f21247h1 = new mn(iVar2, gVar);
            jz f10 = t5.f(document, k6.Zc, 1.0f, null);
            if (f10 != null) {
                iVar2.f36864n.p(ac.b(document), on.b(document), f10, document);
            } else {
                iVar2.f36864n.l(ac.b(document), on.b(document), ac.c(w7.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            iVar2.f36864n.setOnClickListener(new ln(iVar2, document, 1));
        }
    }

    public static void g0(m mVar) {
        if (!(mVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.h.getParent()).getTop();
        int measuredHeight = mVar.h.getMeasuredHeight() - org.telegram.messenger.g0.L(36.0f);
        float i3 = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f18359n.setScaleX(i3);
        mVar.f18359n.setScaleY(i3);
        mVar.f18359n.setAlpha(Utilities.i(i3 * 2.0f, 1.0f, 0.0f));
        mVar.h.invalidate();
    }

    public static int h0(m mVar) {
        return mVar.classGuid;
    }

    public static int i0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        arrayList.add(r31.k(this.h));
        arrayList.add(r31.u(bd.M0(2131752724, null)));
        arrayList.add(r31.k(this.f18361s));
        arrayList.add(r31.k(this.f18362w));
        if (this.f18363x) {
            arrayList.add(r31.f(bd.M0(2131752720, null), bd.M0(2131752719, null), 1));
        } else if (this.E != null) {
            String M0 = bd.M0(2131752720, null);
            String str = this.E;
            r31 r31Var = new r31(3);
            r31Var.d = 1;
            r31Var.f37627l = M0;
            r31Var.G = str;
            arrayList.add(r31Var);
        } else {
            String M02 = bd.M0(2131752720, null);
            TLRPC.Document document = this.f18364y;
            r31 r31Var2 = new r31(3);
            r31Var2.d = 1;
            r31Var2.f37627l = M02;
            r31Var2.G = document;
            arrayList.add(r31Var2);
        }
        arrayList.add(r31.C(bd.M0(2131752723, null)));
        boolean l02 = l0();
        this.L = !l02;
        if (!l02) {
            arrayList.add(r31.C(null));
            r31 e10 = r31.e(2, bd.M0(2131752721, null));
            e10.f37633r = true;
            arrayList.add(e10);
        }
        r31 r31Var3 = new r31(8);
        r31Var3.f37627l = null;
        arrayList.add(r31Var3);
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131752725, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        View[] viewPages;
        int i3 = r31Var.d;
        if (i3 == 1) {
            i2 i2Var = new i2(getParentActivity(), getResourceProvider(), true, true);
            i2Var.f12962w1 = new ai.n(25, this, view);
            i2Var.f12963x1 = new g(this, 0);
            for (View view2 : i2Var.f12953n1.getViewPages()) {
                if (view2 instanceof gi.y1) {
                    gi.x1 x1Var = ((gi.y1) view2).f13915c;
                    if (x1Var.I == null) {
                        x1Var.D(null);
                    }
                }
            }
            showDialog(i2Var);
        } else if (i3 == 2) {
            this.f18361s.setText("");
            this.f18362w.setText("");
            org.telegram.messenger.g0.v1(this.f18361s.d);
            org.telegram.messenger.g0.v1(this.f18362w.d);
            this.f18363x = true;
            this.f18359n.d("", "");
            i iVar = this.f18359n;
            li b02 = li.b0(this.currentAccount);
            TLRPC.Document document = b02.f24066z0;
            b02.n1();
            this.f18364y = document;
            iVar.setSticker(document);
            g gVar = this.f18357e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
            j0(true);
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.f18359n = new on(context, this.currentAccount, this.f18364y, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(16.0f);
        i iVar = this.f18359n;
        j jVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i3 = k6.f27816a;
        this.f18360r = new v5(iVar, jVar2, L, themedPaint);
        this.f18359n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(y5.e(null, this.currentAccount, getUserConfig().e(), k6.I.q()));
        this.h.addView(kVar, mf.e(-1, -1, 119));
        this.h.addView(this.f18359n, mf.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, bd.M0(2131752718, null), getMessagesController().F5, this.resourceProvider, 0);
        this.f18361s = lVar;
        lVar.f29489r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f18361s;
        int i10 = k6.f27878d6;
        r6.i(i10, lVar2, getResourceProvider());
        this.f18361s.setDivider(true);
        l lVar3 = this.f18361s;
        lVar3.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(lVar3, 4);
        i3 i3Var = lVar3.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new r2(fVar, 2));
        l lVar4 = new l(this, context, bd.M0(2131752722, null), getMessagesController().G5, this.resourceProvider, 1);
        this.f18362w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        r6.i(i10, this.f18362w, getResourceProvider());
        this.f18362w.setDivider(true);
        l lVar5 = this.f18362w;
        lVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(lVar5, 4);
        i3 i3Var2 = lVar5.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new r2(fVar2, 2));
        this.f18359n.d("", "");
        super.createView(context);
        this.f34299b.setBackground(null);
        this.f34298a.r1();
        this.f34298a.setSectionsDrawBackground(true);
        this.f34298a.f35594g3.f33698r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 13));
        this.f18358f = this.simpleActionBar.n(bd.M0(2131745956, null));
        j0(false);
        this.f34298a.addOnLayoutChangeListener(new l2(this, 1));
        this.f34298a.j(new j5(this, 23));
        h4 h4Var = this.f34298a;
        h4Var.i3 = true;
        h4Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new p3(this.fragmentView, false, new j8(this, 6));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.E0) {
            n0();
        }
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f34298a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (this.f18358f != null) {
            this.f18358f.a(k0(), z10);
            h4 h4Var = this.f34298a;
            if (h4Var != null && h4Var.f35594g3 != null && this.L != (!l0())) {
                h4 h4Var2 = this.f34298a;
                if (h4Var2 != null && h4Var2.getChildCount() > 0) {
                    View view = null;
                    int i3 = Integer.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f34298a.getChildCount(); i11++) {
                        int R = RecyclerView.R(this.f34298a.getChildAt(i11));
                        View childAt = this.f34298a.getChildAt(i11);
                        if (R != -1 && childAt.getTop() < i3) {
                            i3 = childAt.getTop();
                            i10 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f34300c = i10;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f34300c == 0 && top > org.telegram.messenger.g0.L(88.0f)) {
                            this.d = org.telegram.messenger.g0.L(88.0f);
                        }
                        this.f34298a.f35593f3.h1(i10, view.getTop() - this.f34298a.getPaddingTop());
                    }
                }
                this.f34298a.f35594g3.O(true);
                int i12 = this.f34300c;
                if (i12 >= 0) {
                    h4 h4Var3 = this.f34298a;
                    h4Var3.f35593f3.h1(i12, this.d - h4Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean k0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f18361s.getText().toString();
        String str = this.H;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f18362w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f18363x;
                if (!z10 && (document = this.f18364y) != null) {
                    j10 = document.f27007id;
                } else {
                    j10 = 0;
                }
                if (j10 == this.J) {
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
        l lVar = this.f18361s;
        if (lVar != null && this.f18362w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f18362w.getText()) || !this.f18363x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void m0() {
        TLRPC.Document document;
        b5 b5Var = this.f18358f;
        if (b5Var.f27421y.f53841f) {
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
            tL_inputBusinessIntro.title = this.f18361s.getText().toString();
            updatebusinessintro.intro.description = this.f18362w.getText().toString();
            if (!this.f18363x && (this.f18364y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    hp messagesController = getMessagesController();
                    TLRPC.Document document2 = this.f18364y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f27013id = document2.f27007id;
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
                if (!this.f18363x && (document = this.f18364y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (b22 != null) {
            b22.flags2 &= -17;
            b22.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ci.d0(this, 16));
        getMessagesStorage().j2(b22, false);
    }

    public final void n0() {
        long j10;
        boolean z10;
        f41 f41Var;
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
            l lVar = this.f18361s;
            String str = tL_businessIntro.title;
            this.H = str;
            lVar.setText(str);
            l lVar2 = this.f18362w;
            String str2 = b22.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.f18364y = b22.business_intro.sticker;
        } else {
            l lVar3 = this.f18361s;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.f18362w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.f18364y = null;
        }
        TLRPC.Document document = this.f18364y;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f27007id;
        }
        this.J = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18363x = z10;
        i iVar = this.f18359n;
        if (iVar != null) {
            iVar.d(this.f18361s.getText().toString(), this.f18362w.getText().toString());
            i iVar2 = this.f18359n;
            TLRPC.Document document2 = this.f18364y;
            if (document2 == null || this.f18363x) {
                li b02 = li.b0(this.currentAccount);
                TLRPC.Document document3 = b02.f24066z0;
                b02.n1();
                document2 = document3;
            }
            iVar2.setSticker(document2);
        }
        if (this.f18363x) {
            g gVar = this.f18357e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
        }
        h4 h4Var = this.f34298a;
        if (h4Var != null && (f41Var = h4Var.f35594g3) != null) {
            f41Var.O(true);
        }
        this.K = true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (k0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = bd.M0(2131743845, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131752717, null);
                alertDialog$Builder.k(bd.M0(2131754216, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final m f18319b;

                    {
                        this.f18319b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                        switch (r2) {
                            case 0:
                                this.f18319b.m0();
                                return;
                            default:
                                this.f18319b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(bd.M0(2131747588, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final m f18319b;

                    {
                        this.f18319b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                        switch (r2) {
                            case 0:
                                this.f18319b.m0();
                                return;
                            default:
                                this.f18319b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(s1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.E0);
        li.b0(this.currentAccount).B(0);
        li.b0(this.currentAccount).V0(0, false, true, false);
        li.b0(this.currentAccount).V0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

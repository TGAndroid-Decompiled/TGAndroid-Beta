package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f51 extends n7c implements jm7 {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public e51 M;
    public uja f;
    public b51 h;
    public a51 n;
    public slb r;
    public d51 s;
    public d51 w;
    public TLRPC.Document y;
    public final y41 e = new y41(this, (byte) 1);
    public boolean x = true;

    public f51() {
        hs6 mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.z0;
        mediaDataController.o1();
        this.y = document;
        this.L = i0();
    }

    public static int e0(f51 f51Var) {
        return f51Var.classGuid;
    }

    public static int f0(f51 f51Var) {
        return f51Var.classGuid;
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        arrayList.add(c6c.k(this.h));
        arrayList.add(c6c.u(jb6.M0(2131752677, null)));
        arrayList.add(c6c.k(this.s));
        arrayList.add(c6c.k(this.w));
        if (this.x) {
            arrayList.add(c6c.f(jb6.M0(2131752673, null), jb6.M0(2131752672, null), 1));
        } else if (this.E != null) {
            String M0 = jb6.M0(2131752673, null);
            String str = this.E;
            c6c c6cVar = new c6c(3);
            c6cVar.d = 1;
            c6cVar.m = M0;
            c6cVar.H = str;
            arrayList.add(c6cVar);
        } else {
            String M02 = jb6.M0(2131752673, null);
            TLRPC.Document document = this.y;
            c6c c6cVar2 = new c6c(3);
            c6cVar2.d = 1;
            c6cVar2.m = M02;
            c6cVar2.H = document;
            arrayList.add(c6cVar2);
        }
        arrayList.add(c6c.C(jb6.M0(2131752676, null)));
        boolean i0 = i0();
        this.L = !i0;
        if (!i0) {
            arrayList.add(c6c.C(null));
            c6c e = c6c.e(2, jb6.M0(2131752674, null));
            e.s = true;
            arrayList.add(e);
        }
        c6c c6cVar3 = new c6c(8);
        c6cVar3.m = null;
        arrayList.add(c6cVar3);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        View[] viewPages;
        int i = c6cVar.d;
        if (i == 1) {
            px3 px3Var = new px3(getResourceProvider(), getParentActivity(), true, true);
            px3Var.y1 = new g11(this, view, (byte) 1);
            px3Var.z1 = new y41(this, (byte) 0);
            for (View view2 : px3Var.p1.getViewPages()) {
                if (view2 instanceof ex3) {
                    dx3 dx3Var = ((ex3) view2).c;
                    if (dx3Var.I == null) {
                        dx3Var.D(null);
                    }
                }
            }
            showDialog(px3Var);
        } else if (i == 2) {
            this.s.setText("");
            this.w.setText("");
            gm.t1(this.s.d);
            gm.t1(this.w.d);
            this.x = true;
            this.n.c("", "");
            a51 a51Var = this.n;
            hs6 d0 = hs6.d0(this.currentAccount);
            TLRPC.Document document = d0.z0;
            d0.o1();
            this.y = document;
            a51Var.setSticker(document);
            y41 y41Var = this.e;
            gm.r(y41Var);
            gm.d3(y41Var, 5000L);
            g0(true);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        gm.V2(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.n = new ua2(context, this.currentAccount, this.y, getResourceProvider());
        b51 b51Var = new b51(this, context);
        this.h = b51Var;
        b51Var.setWillNotDraw(false);
        int L = gm.L(16.0f);
        a51 a51Var = this.n;
        b51 b51Var2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i = cmb.a;
        this.r = new slb(a51Var, b51Var2, L, themedPaint);
        this.n.setBackground(new ColorDrawable(0));
        c51 c51Var = new c51(context, (byte) 0);
        c51Var.setScaleType(ImageView.ScaleType.MATRIX);
        c51Var.setImageDrawable(cl8.d(null, this.currentAccount, getUserConfig().e(), cmb.I.o()));
        this.h.addView(c51Var, qoe.e(-1, -1, 119));
        this.h.addView(this.n, qoe.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        d51 d51Var = new d51(this, context, jb6.M0(2131752671, null), getMessagesController().l4.k2.f(), this.resourceProvider, (byte) 0);
        this.s = d51Var;
        d51Var.r = true;
        d51Var.setShowLimitOnFocus(true);
        d51 d51Var2 = this.s;
        int i2 = cmb.c6;
        anb.h(i2, getResourceProvider(), d51Var2);
        this.s.setDivider(true);
        d51 d51Var3 = this.s;
        d51Var3.getClass();
        d51Var3.d(new c82(d51Var3, (byte) 1));
        d51 d51Var4 = new d51(this, context, jb6.M0(2131752675, null), getMessagesController().l4.l2.f(), this.resourceProvider, (byte) 1);
        this.w = d51Var4;
        d51Var4.setShowLimitOnFocus(true);
        anb.h(i2, getResourceProvider(), this.w);
        this.w.setDivider(true);
        d51 d51Var5 = this.w;
        d51Var5.getClass();
        d51Var5.d(new c82(d51Var5, (byte) 1));
        this.n.c("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 12));
        this.f = this.simpleActionBar.s(jb6.M0(2131745680, null));
        g0(false);
        this.a.addOnLayoutChangeListener(new ix0(this, (byte) 1));
        this.a.j(new y(this, (byte) 11));
        va vaVar = this.a;
        vaVar.i3 = true;
        vaVar.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        l0();
        new mx5(this.fragmentView, false, new mf2(this, (byte) 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.E0) {
            l0();
        }
    }

    public final void g0(boolean z) {
        if (this.f != null) {
            this.f.a(h0(), z);
            va vaVar = this.a;
            if (vaVar != null && vaVar.g3 != null && this.L != (!i0())) {
                va vaVar2 = this.a;
                if (vaVar2 != null && vaVar2.getChildCount() > 0) {
                    View view = null;
                    int i = Integer.MAX_VALUE;
                    int i2 = -1;
                    for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
                        int R = RecyclerView.R(this.a.getChildAt(i3));
                        View childAt = this.a.getChildAt(i3);
                        if (R != -1 && childAt.getTop() < i) {
                            i = childAt.getTop();
                            i2 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.c = i2;
                        int top = view.getTop();
                        this.d = top;
                        if (this.c == 0 && top > gm.L(88.0f)) {
                            this.d = gm.L(88.0f);
                        }
                        this.a.f3.g1(i2, view.getTop() - this.a.getPaddingTop());
                    }
                }
                this.a.g3.O(true);
                int i4 = this.c;
                if (i4 >= 0) {
                    va vaVar3 = this.a;
                    vaVar3.f3.g1(i4, this.d - vaVar3.getPaddingTop());
                }
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    public final boolean h0() {
        long j;
        TLRPC.Document document;
        String charSequence = this.s.getText().toString();
        String str = this.H;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z = this.x;
                if (!z && (document = this.y) != null) {
                    j = document.id;
                } else {
                    j = 0;
                }
                if (j == this.J) {
                    if (z || this.F == null) {
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

    public final boolean i0() {
        d51 d51Var = this.s;
        if (d51Var != null && this.w != null) {
            if (!TextUtils.isEmpty(d51Var.getText()) || !TextUtils.isEmpty(this.w.getText()) || !this.x) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        f51 f51Var;
        hx2.e().T = null;
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity() != null && getParentActivity() != null && this.M == null) {
            f51Var = this;
            e51 e51Var = new e51(f51Var, getParentActivity(), this, this.resourceProvider, (byte) 0);
            f51Var.M = e51Var;
            e51Var.W3 = new k6d(f51Var, (byte) 14);
        } else {
            f51Var = this;
        }
        f51Var.M.d2.h0();
        f51Var.M.t1(1, false);
        e51 e51Var2 = f51Var.M;
        e51Var2.R3 = true;
        e51Var2.Q0(new f(f51Var, (byte) 20));
        f51Var.M.Z0();
        e51 e51Var3 = f51Var.M;
        e51Var3.s1 = null;
        if (f51Var.visibleDialog != null) {
            e51Var3.show();
        } else {
            f51Var.showDialog(e51Var3);
        }
    }

    public final void k0() {
        TLRPC.Document document;
        uja ujaVar = this.f;
        if (ujaVar.y.f) {
            return;
        }
        ujaVar.b(true);
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!i0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.s.getText().toString();
            updatebusinessintro.intro.description = this.w.getText().toString();
            if (!this.x && (this.y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    oc7 messagesController = getMessagesController();
                    TLRPC.Document document2 = this.y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.id = document2.id;
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
            if (X1 != null) {
                X1.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                X1.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.x && (document = this.y) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (X1 != null) {
            X1.flags2 &= -17;
            X1.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new tg(this, (byte) 9));
        getMessagesStorage().g2(X1, false);
    }

    public final void l0() {
        TLRPC.Document document;
        long j;
        boolean z;
        l7c l7cVar;
        if (this.K) {
            return;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (X1 == null) {
            getMessagesController().k3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = X1.business_intro;
        d51 d51Var = this.s;
        if (tL_businessIntro != null) {
            String str = tL_businessIntro.title;
            this.H = str;
            d51Var.setText(str);
            d51 d51Var2 = this.w;
            String str2 = X1.business_intro.description;
            this.I = str2;
            d51Var2.setText(str2);
            document = X1.business_intro.sticker;
            this.y = document;
        } else {
            this.H = "";
            d51Var.setText("");
            d51 d51Var3 = this.w;
            this.I = "";
            d51Var3.setText("");
            document = null;
            this.F = null;
            this.y = null;
        }
        if (document == null) {
            j = 0;
        } else {
            j = document.id;
        }
        this.J = j;
        if (document == null) {
            z = true;
        } else {
            z = false;
        }
        this.x = z;
        a51 a51Var = this.n;
        if (a51Var != null) {
            a51Var.c(this.s.getText().toString(), this.w.getText().toString());
            a51 a51Var2 = this.n;
            TLRPC.Document document2 = this.y;
            if (document2 == null || this.x) {
                hs6 d0 = hs6.d0(this.currentAccount);
                TLRPC.Document document3 = d0.z0;
                d0.o1();
                document2 = document3;
            }
            a51Var2.setSticker(document2);
        }
        if (this.x) {
            y41 y41Var = this.e;
            gm.r(y41Var);
            gm.d3(y41Var, 5000L);
        }
        va vaVar = this.a;
        if (vaVar != null && (l7cVar = vaVar.g3) != null) {
            l7cVar.O(true);
        }
        this.K = true;
    }

    public final void m0() {
        if (!(this.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) this.h.getParent()).getTop();
        int measuredHeight = this.h.getMeasuredHeight() - gm.L(36.0f);
        float i = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        this.n.setScaleX(i);
        this.n.setScaleY(i);
        this.n.setAlpha(Utilities.i(i * 2.0f, 1.0f, 0.0f));
        this.h.invalidate();
    }

    public final void n0() {
        a51 a51Var = this.n;
        if (a51Var != null && a51Var.isAttachedToWindow() && this.x) {
            a51 a51Var2 = this.n;
            hs6 d0 = hs6.d0(this.currentAccount);
            TLRPC.Document document = d0.z0;
            d0.o1();
            y41 y41Var = new y41(this, (byte) 2);
            if (document == null) {
                a51Var2.getClass();
                return;
            }
            AnimatorSet animatorSet = a51Var2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            a51Var2.n.getImageReceiver().h1 = new sa2(a51Var2, y41Var);
            meb f = eq3.f(document, cmb.bd, 1.0f, null);
            if (f != null) {
                a51Var2.n.p(gn5.b(document), ua2.a(document), f, document);
            } else {
                a51Var2.n.h(gn5.b(document), ua2.a(document), gn5.c(bc4.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            a51Var2.n.setOnClickListener(new rc1(a51Var2, document, (byte) 17));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (h0()) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131743522, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131752670, null);
                alertDialog$Builder.j(jb6.M0(2131754181, null), new ee(this) {
                    public final f51 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar2, int i) {
                        byte b = r2;
                        f51 f51Var = this.b;
                        switch (b) {
                            case 0:
                                f51Var.k0();
                                return;
                            default:
                                f51Var.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.g(jb6.M0(2131747313, null), new ee(this) {
                    public final f51 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar2, int i) {
                        byte b = r2;
                        f51 f51Var = this.b;
                        switch (b) {
                            case 0:
                                f51Var.k0();
                                return;
                            default:
                                f51Var.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(heVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.E0);
        hs6.d0(this.currentAccount).D(0);
        hs6.d0(this.currentAccount).X0(false, true, false, 0);
        hs6.d0(this.currentAccount).X0(false, true, false, 2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

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
public final class g41 extends n9c implements fn7 {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public f41 M;
    public nla f;
    public c41 h;
    public b41 n;
    public pnb r;
    public e41 s;
    public e41 w;
    public TLRPC.Document y;
    public final z31 e = new z31(this, (byte) 1);
    public boolean x = true;

    public g41() {
        ls6 mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.z0;
        mediaDataController.o1();
        this.y = document;
        this.L = h0();
    }

    public static int c0(g41 g41Var) {
        return g41Var.classGuid;
    }

    public static int d0(g41 g41Var) {
        return g41Var.classGuid;
    }

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        arrayList.add(b8c.k(this.h));
        arrayList.add(b8c.u(ob6.M0(2131752705, null)));
        arrayList.add(b8c.k(this.s));
        arrayList.add(b8c.k(this.w));
        if (this.x) {
            arrayList.add(b8c.f(ob6.M0(2131752701, null), ob6.M0(2131752700, null), 1));
        } else if (this.E != null) {
            String M0 = ob6.M0(2131752701, null);
            String str = this.E;
            b8c b8cVar = new b8c(3);
            b8cVar.d = 1;
            b8cVar.m = M0;
            b8cVar.H = str;
            arrayList.add(b8cVar);
        } else {
            String M02 = ob6.M0(2131752701, null);
            TLRPC.Document document = this.y;
            b8c b8cVar2 = new b8c(3);
            b8cVar2.d = 1;
            b8cVar2.m = M02;
            b8cVar2.H = document;
            arrayList.add(b8cVar2);
        }
        arrayList.add(b8c.C(ob6.M0(2131752704, null)));
        boolean h0 = h0();
        this.L = !h0;
        if (!h0) {
            arrayList.add(b8c.C(null));
            b8c e = b8c.e(2, ob6.M0(2131752702, null));
            e.s = true;
            arrayList.add(e);
        }
        b8c b8cVar3 = new b8c(8);
        b8cVar3.m = null;
        arrayList.add(b8cVar3);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        View[] viewPages;
        int i = b8cVar.d;
        if (i == 1) {
            zw3 zw3Var = new zw3(getResourceProvider(), getParentActivity(), true, true);
            zw3Var.y1 = new h01(this, view, (byte) 1);
            zw3Var.z1 = new z31(this, (byte) 0);
            for (View view2 : zw3Var.p1.getViewPages()) {
                if (view2 instanceof ow3) {
                    nw3 nw3Var = ((ow3) view2).c;
                    if (nw3Var.I == null) {
                        nw3Var.D(null);
                    }
                }
            }
            showDialog(zw3Var);
        } else if (i == 2) {
            this.s.setText("");
            this.w.setText("");
            hl.t1(this.s.d);
            hl.t1(this.w.d);
            this.x = true;
            this.n.c("", "");
            b41 b41Var = this.n;
            ls6 d0 = ls6.d0(this.currentAccount);
            TLRPC.Document document = d0.z0;
            d0.o1();
            this.y = document;
            b41Var.setSticker(document);
            z31 z31Var = this.e;
            hl.r(z31Var);
            hl.d3(z31Var, 5000L);
            f0(true);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        hl.V2(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.n = new y92(context, this.currentAccount, this.y, getResourceProvider());
        c41 c41Var = new c41(this, context);
        this.h = c41Var;
        c41Var.setWillNotDraw(false);
        int L = hl.L(16.0f);
        b41 b41Var = this.n;
        c41 c41Var2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i = aob.a;
        this.r = new pnb(b41Var, c41Var2, L, themedPaint);
        this.n.setBackground(new ColorDrawable(0));
        d41 d41Var = new d41(context, (byte) 0);
        d41Var.setScaleType(ImageView.ScaleType.MATRIX);
        d41Var.setImageDrawable(mm8.d(null, this.currentAccount, getUserConfig().e(), aob.I.o()));
        this.h.addView(d41Var, tre.e(-1, -1, 119));
        this.h.addView(this.n, tre.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        e41 e41Var = new e41(this, context, ob6.M0(2131752699, null), getMessagesController().l4.s2.f(), this.resourceProvider, (byte) 0);
        this.s = e41Var;
        e41Var.r = true;
        e41Var.setShowLimitOnFocus(true);
        e41 e41Var2 = this.s;
        int i2 = aob.d6;
        yob.h(i2, getResourceProvider(), e41Var2);
        this.s.setDivider(true);
        e41 e41Var3 = this.s;
        e41Var3.getClass();
        i72 i72Var = new i72(e41Var3, (byte) 1);
        yt3 yt3Var = e41Var3.d;
        yt3Var.setImeOptions(6);
        yt3Var.setOnEditorActionListener(new vx1(i72Var, (byte) 2));
        e41 e41Var4 = new e41(this, context, ob6.M0(2131752703, null), getMessagesController().l4.t2.f(), this.resourceProvider, (byte) 1);
        this.w = e41Var4;
        e41Var4.setShowLimitOnFocus(true);
        yob.h(i2, getResourceProvider(), this.w);
        this.w.setDivider(true);
        e41 e41Var5 = this.w;
        e41Var5.getClass();
        i72 i72Var2 = new i72(e41Var5, (byte) 1);
        yt3 yt3Var2 = e41Var5.d;
        yt3Var2.setImeOptions(6);
        yt3Var2.setOnEditorActionListener(new vx1(i72Var2, (byte) 2));
        this.n.c("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 12));
        this.f = this.simpleActionBar.u(ob6.M0(2131745674, null));
        f0(false);
        this.a.addOnLayoutChangeListener(new jw0(this, (byte) 1));
        this.a.j(new y(this, (byte) 10));
        wa waVar = this.a;
        waVar.i3 = true;
        waVar.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        k0();
        new rx5(this.fragmentView, false, new te2(this, (byte) 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.E0) {
            k0();
        }
    }

    public final void f0(boolean z) {
        if (this.f != null) {
            this.f.a(g0(), z);
            wa waVar = this.a;
            if (waVar != null && waVar.g3 != null && this.L != (!h0())) {
                wa waVar2 = this.a;
                if (waVar2 != null && waVar2.getChildCount() > 0) {
                    View view = null;
                    int i = Integer.MAX_VALUE;
                    int i2 = -1;
                    for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
                        int S = RecyclerView.S(this.a.getChildAt(i3));
                        View childAt = this.a.getChildAt(i3);
                        if (S != -1 && childAt.getTop() < i) {
                            i = childAt.getTop();
                            i2 = S;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.c = i2;
                        int top = view.getTop();
                        this.d = top;
                        if (this.c == 0 && top > hl.L(88.0f)) {
                            this.d = hl.L(88.0f);
                        }
                        this.a.f3.g1(i2, view.getTop() - this.a.getPaddingTop());
                    }
                }
                this.a.g3.O(true);
                int i4 = this.c;
                if (i4 >= 0) {
                    wa waVar3 = this.a;
                    waVar3.f3.g1(i4, this.d - waVar3.getPaddingTop());
                }
            }
        }
    }

    public final boolean g0() {
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

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    public final boolean h0() {
        e41 e41Var = this.s;
        if (e41Var != null && this.w != null) {
            if (!TextUtils.isEmpty(e41Var.getText()) || !TextUtils.isEmpty(this.w.getText()) || !this.x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void i0() {
        g41 g41Var;
        rw2.e().T = null;
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity() != null && getParentActivity() != null && this.M == null) {
            g41Var = this;
            f41 f41Var = new f41(g41Var, getParentActivity(), this, this.resourceProvider, (byte) 0);
            g41Var.M = f41Var;
            f41Var.W3 = new z8d(g41Var, (byte) 14);
        } else {
            g41Var = this;
        }
        g41Var.M.d2.g0();
        g41Var.M.u1(1, false);
        f41 f41Var2 = g41Var.M;
        f41Var2.R3 = true;
        f41Var2.R0(new c(g41Var, (byte) 20));
        g41Var.M.a1();
        f41 f41Var3 = g41Var.M;
        f41Var3.s1 = null;
        if (g41Var.visibleDialog != null) {
            f41Var3.show();
        } else {
            g41Var.showDialog(f41Var3);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.Document document;
        nla nlaVar = this.f;
        if (nlaVar.y.f) {
            return;
        }
        nlaVar.b(true);
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!h0()) {
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
                    uc7 messagesController = getMessagesController();
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
            if (Y1 != null) {
                Y1.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                Y1.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.x && (document = this.y) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (Y1 != null) {
            Y1.flags2 &= -17;
            Y1.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ye(this, (byte) 9));
        getMessagesStorage().l2(Y1, false);
    }

    public final void k0() {
        TLRPC.Document document;
        long j;
        boolean z;
        l9c l9cVar;
        if (this.K) {
            return;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 == null) {
            getMessagesController().o3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = Y1.business_intro;
        e41 e41Var = this.s;
        if (tL_businessIntro != null) {
            String str = tL_businessIntro.title;
            this.H = str;
            e41Var.setText(str);
            e41 e41Var2 = this.w;
            String str2 = Y1.business_intro.description;
            this.I = str2;
            e41Var2.setText(str2);
            document = Y1.business_intro.sticker;
            this.y = document;
        } else {
            this.H = "";
            e41Var.setText("");
            e41 e41Var3 = this.w;
            this.I = "";
            e41Var3.setText("");
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
        b41 b41Var = this.n;
        if (b41Var != null) {
            b41Var.c(this.s.getText().toString(), this.w.getText().toString());
            b41 b41Var2 = this.n;
            TLRPC.Document document2 = this.y;
            if (document2 == null || this.x) {
                ls6 d0 = ls6.d0(this.currentAccount);
                TLRPC.Document document3 = d0.z0;
                d0.o1();
                document2 = document3;
            }
            b41Var2.setSticker(document2);
        }
        if (this.x) {
            z31 z31Var = this.e;
            hl.r(z31Var);
            hl.d3(z31Var, 5000L);
        }
        wa waVar = this.a;
        if (waVar != null && (l9cVar = waVar.g3) != null) {
            l9cVar.O(true);
        }
        this.K = true;
    }

    public final void l0() {
        if (!(this.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) this.h.getParent()).getTop();
        int measuredHeight = this.h.getMeasuredHeight() - hl.L(36.0f);
        float i = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        this.n.setScaleX(i);
        this.n.setScaleY(i);
        this.n.setAlpha(Utilities.i(i * 2.0f, 1.0f, 0.0f));
        this.h.invalidate();
    }

    public final void m0() {
        b41 b41Var = this.n;
        if (b41Var != null && b41Var.isAttachedToWindow() && this.x) {
            b41 b41Var2 = this.n;
            ls6 d0 = ls6.d0(this.currentAccount);
            TLRPC.Document document = d0.z0;
            d0.o1();
            z31 z31Var = new z31(this, (byte) 2);
            if (document == null) {
                b41Var2.getClass();
                return;
            }
            AnimatorSet animatorSet = b41Var2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            b41Var2.n.getImageReceiver().h1 = new w92(b41Var2, z31Var);
            ggb f = lp3.f(document, aob.cd, 1.0f, null);
            if (f != null) {
                b41Var2.n.p(jn5.b(document), y92.a(document), f, document);
            } else {
                b41Var2.n.h(jn5.b(document), y92.a(document), jn5.c(xb4.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            b41Var2.n.setOnClickListener(new sb1(b41Var2, document, (byte) 18));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (g0()) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131743490, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752698, null);
                alertDialog$Builder.j(ob6.M0(2131754209, null), new fd(this) {
                    public final g41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void w(id idVar2, int i) {
                        byte b = r2;
                        g41 g41Var = this.b;
                        switch (b) {
                            case 0:
                                g41Var.j0();
                                return;
                            default:
                                g41Var.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.g(ob6.M0(2131747307, null), new fd(this) {
                    public final g41 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void w(id idVar2, int i) {
                        byte b = r2;
                        g41 g41Var = this.b;
                        switch (b) {
                            case 0:
                                g41Var.j0();
                                return;
                            default:
                                g41Var.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(idVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.E0);
        ls6.d0(this.currentAccount).D(0);
        ls6.d0(this.currentAccount).X0(false, true, false, 0);
        ls6.d0(this.currentAccount).X0(false, true, false, 2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

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
public final class y31 extends n5c implements gk7 {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public x31 M;
    public sha f;
    public u31 h;
    public t31 n;
    public qjb r;
    public w31 s;
    public w31 w;
    public TLRPC.Document y;
    public final r31 e = new r31(this, (byte) 1);
    public boolean x = true;

    public y31() {
        hq6 mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.z0;
        mediaDataController.o1();
        this.y = document;
        this.L = h0();
    }

    public static int d0(y31 y31Var) {
        return y31Var.classGuid;
    }

    public static int e0(y31 y31Var) {
        return y31Var.classGuid;
    }

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        arrayList.add(c4c.k(this.h));
        arrayList.add(c4c.u(k96.M0(2131752712, null)));
        arrayList.add(c4c.k(this.s));
        arrayList.add(c4c.k(this.w));
        if (this.x) {
            arrayList.add(c4c.f(k96.M0(2131752708, null), k96.M0(2131752707, null), 1));
        } else if (this.E != null) {
            String M0 = k96.M0(2131752708, null);
            String str = this.E;
            c4c c4cVar = new c4c(3);
            c4cVar.d = 1;
            c4cVar.m = M0;
            c4cVar.H = str;
            arrayList.add(c4cVar);
        } else {
            String M02 = k96.M0(2131752708, null);
            TLRPC.Document document = this.y;
            c4c c4cVar2 = new c4c(3);
            c4cVar2.d = 1;
            c4cVar2.m = M02;
            c4cVar2.H = document;
            arrayList.add(c4cVar2);
        }
        arrayList.add(c4c.C(k96.M0(2131752711, null)));
        boolean h0 = h0();
        this.L = !h0;
        if (!h0) {
            arrayList.add(c4c.C(null));
            c4c e = c4c.e(2, k96.M0(2131752709, null));
            e.s = true;
            arrayList.add(e);
        }
        c4c c4cVar3 = new c4c(8);
        c4cVar3.m = null;
        arrayList.add(c4cVar3);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        View[] viewPages;
        int i = c4cVar.d;
        if (i == 1) {
            ew3 ew3Var = new ew3(getResourceProvider(), getParentActivity(), true, true);
            ew3Var.y1 = new q31(this, view, (byte) 0);
            ew3Var.z1 = new r31(this, (byte) 0);
            for (View view2 : ew3Var.p1.getViewPages()) {
                if (view2 instanceof tv3) {
                    sv3 sv3Var = ((tv3) view2).c;
                    if (sv3Var.I == null) {
                        sv3Var.D(null);
                    }
                }
            }
            showDialog(ew3Var);
        } else if (i == 2) {
            this.s.setText("");
            this.w.setText("");
            gl.t1(this.s.d);
            gl.t1(this.w.d);
            this.x = true;
            this.n.c("", "");
            t31 t31Var = this.n;
            hq6 d0 = hq6.d0(this.currentAccount);
            TLRPC.Document document = d0.z0;
            d0.o1();
            this.y = document;
            t31Var.setSticker(document);
            r31 r31Var = this.e;
            gl.r(r31Var);
            gl.e3(r31Var, 5000L);
            f0(true);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        gl.W2(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.n = new i92(context, this.currentAccount, this.y, getResourceProvider());
        u31 u31Var = new u31(this, context);
        this.h = u31Var;
        u31Var.setWillNotDraw(false);
        int L = gl.L(16.0f);
        t31 t31Var = this.n;
        u31 u31Var2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i = bkb.a;
        this.r = new qjb(t31Var, u31Var2, L, themedPaint);
        this.n.setBackground(new ColorDrawable(0));
        v31 v31Var = new v31(context, (byte) 0);
        v31Var.setScaleType(ImageView.ScaleType.MATRIX);
        v31Var.setImageDrawable(zi8.d(null, this.currentAccount, getUserConfig().e(), bkb.I.o()));
        this.h.addView(v31Var, nme.e(-1, -1, 119));
        this.h.addView(this.n, nme.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        w31 w31Var = new w31(this, context, k96.M0(2131752706, null), getMessagesController().k4.k2.f(), this.resourceProvider, (byte) 0);
        this.s = w31Var;
        w31Var.r = true;
        w31Var.setShowLimitOnFocus(true);
        w31 w31Var2 = this.s;
        int i2 = bkb.c6;
        zkb.h(i2, getResourceProvider(), w31Var2);
        this.s.setDivider(true);
        w31 w31Var3 = this.s;
        w31Var3.getClass();
        r62 r62Var = new r62(w31Var3, (byte) 1);
        ht3 ht3Var = w31Var3.d;
        ht3Var.setImeOptions(6);
        ht3Var.setOnEditorActionListener(new gx1(r62Var, (byte) 2));
        w31 w31Var4 = new w31(this, context, k96.M0(2131752710, null), getMessagesController().k4.l2.f(), this.resourceProvider, (byte) 1);
        this.w = w31Var4;
        w31Var4.setShowLimitOnFocus(true);
        zkb.h(i2, getResourceProvider(), this.w);
        this.w.setDivider(true);
        w31 w31Var5 = this.w;
        w31Var5.getClass();
        r62 r62Var2 = new r62(w31Var5, (byte) 1);
        ht3 ht3Var2 = w31Var5.d;
        ht3Var2.setImeOptions(6);
        ht3Var2.setOnEditorActionListener(new gx1(r62Var2, (byte) 2));
        this.n.c("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 11));
        this.f = this.simpleActionBar.s(k96.M0(2131745754, null));
        f0(false);
        this.a.addOnLayoutChangeListener(new aw0(this, (byte) 1));
        this.a.j(new y(this, (byte) 10));
        va vaVar = this.a;
        vaVar.i3 = true;
        vaVar.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        k0();
        new mv5(this.fragmentView, false, new be2(this, (byte) 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.D0) {
            k0();
        }
    }

    public final void f0(boolean z) {
        if (this.f != null) {
            this.f.a(g0(), z);
            va vaVar = this.a;
            if (vaVar != null && vaVar.g3 != null && this.L != (!h0())) {
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
                        if (this.c == 0 && top > gl.L(88.0f)) {
                            this.d = gl.L(88.0f);
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
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    public final boolean h0() {
        w31 w31Var = this.s;
        if (w31Var != null && this.w != null) {
            if (!TextUtils.isEmpty(w31Var.getText()) || !TextUtils.isEmpty(this.w.getText()) || !this.x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void i0() {
        y31 y31Var;
        xv2.e().T = null;
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity() != null && getParentActivity() != null && this.M == null) {
            y31Var = this;
            x31 x31Var = new x31(y31Var, getParentActivity(), this, this.resourceProvider, (byte) 0);
            y31Var.M = x31Var;
            x31Var.W3 = new i4d(y31Var);
        } else {
            y31Var = this;
        }
        y31Var.M.d2.h0();
        y31Var.M.t1(1, false);
        x31 x31Var2 = y31Var.M;
        x31Var2.R3 = true;
        x31Var2.Q0(new f(y31Var, (byte) 20));
        y31Var.M.Z0();
        x31 x31Var3 = y31Var.M;
        x31Var3.s1 = null;
        if (y31Var.visibleDialog != null) {
            x31Var3.show();
        } else {
            y31Var.showDialog(x31Var3);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.Document document;
        sha shaVar = this.f;
        if (shaVar.y.f) {
            return;
        }
        shaVar.b(true);
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
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
                    na7 messagesController = getMessagesController();
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
            if (W1 != null) {
                W1.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                W1.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.x && (document = this.y) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (W1 != null) {
            W1.flags2 &= -17;
            W1.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new uf(this, (byte) 9));
        getMessagesStorage().g2(W1, false);
    }

    public final void k0() {
        TLRPC.Document document;
        long j;
        boolean z;
        l5c l5cVar;
        if (this.K) {
            return;
        }
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        if (W1 == null) {
            getMessagesController().h3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = W1.business_intro;
        w31 w31Var = this.s;
        if (tL_businessIntro != null) {
            String str = tL_businessIntro.title;
            this.H = str;
            w31Var.setText(str);
            w31 w31Var2 = this.w;
            String str2 = W1.business_intro.description;
            this.I = str2;
            w31Var2.setText(str2);
            document = W1.business_intro.sticker;
            this.y = document;
        } else {
            this.H = "";
            w31Var.setText("");
            w31 w31Var3 = this.w;
            this.I = "";
            w31Var3.setText("");
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
        t31 t31Var = this.n;
        if (t31Var != null) {
            t31Var.c(this.s.getText().toString(), this.w.getText().toString());
            t31 t31Var2 = this.n;
            TLRPC.Document document2 = this.y;
            if (document2 == null || this.x) {
                hq6 d0 = hq6.d0(this.currentAccount);
                TLRPC.Document document3 = d0.z0;
                d0.o1();
                document2 = document3;
            }
            t31Var2.setSticker(document2);
        }
        if (this.x) {
            r31 r31Var = this.e;
            gl.r(r31Var);
            gl.e3(r31Var, 5000L);
        }
        va vaVar = this.a;
        if (vaVar != null && (l5cVar = vaVar.g3) != null) {
            l5cVar.O(true);
        }
        this.K = true;
    }

    public final void l0() {
        if (!(this.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) this.h.getParent()).getTop();
        int measuredHeight = this.h.getMeasuredHeight() - gl.L(36.0f);
        float i = Utilities.i((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        this.n.setScaleX(i);
        this.n.setScaleY(i);
        this.n.setAlpha(Utilities.i(i * 2.0f, 1.0f, 0.0f));
        this.h.invalidate();
    }

    public final void m0() {
        t31 t31Var = this.n;
        if (t31Var != null && t31Var.isAttachedToWindow() && this.x) {
            t31 t31Var2 = this.n;
            hq6 d0 = hq6.d0(this.currentAccount);
            TLRPC.Document document = d0.z0;
            d0.o1();
            r31 r31Var = new r31(this, (byte) 2);
            if (document == null) {
                t31Var2.getClass();
                return;
            }
            AnimatorSet animatorSet = t31Var2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            t31Var2.n.getImageReceiver().h1 = new g92(t31Var2, r31Var);
            kcb f = uo3.f(document, bkb.bd, 1.0f, null);
            if (f != null) {
                t31Var2.n.p(gl5.b(document), i92.a(document), f, document);
            } else {
                t31Var2.n.h(gl5.b(document), i92.a(document), gl5.c(ba4.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            t31Var2.n.setOnClickListener(new kb1(t31Var2, document, (byte) 16));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (g0()) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131743596, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131752705, null);
                alertDialog$Builder.j(k96.M0(2131754213, null), new ed(this) {
                    public final y31 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void u(hd hdVar2, int i) {
                        byte b = r2;
                        y31 y31Var = this.b;
                        switch (b) {
                            case 0:
                                y31Var.j0();
                                return;
                            default:
                                y31Var.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.g(k96.M0(2131747387, null), new ed(this) {
                    public final y31 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void u(hd hdVar2, int i) {
                        byte b = r2;
                        y31 y31Var = this.b;
                        switch (b) {
                            case 0:
                                y31Var.j0();
                                return;
                            default:
                                y31Var.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(hdVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.D0);
        hq6.d0(this.currentAccount).D(0);
        hq6.d0(this.currentAccount).X0(false, true, false, 0);
        hq6.d0(this.currentAccount).X0(false, true, false, 2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.D0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

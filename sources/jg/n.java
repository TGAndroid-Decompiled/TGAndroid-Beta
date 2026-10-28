package jg;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import di.a3;
import fi.l2;
import fi.o6;
import fi.z3;
import hi.x2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vo;
import org.telegram.ui.ht;
public final class n extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public a3 L;
    public u5 f15779f;
    public k h;
    public j f15780n;
    public l6 f15781r;
    public m f15782s;
    public m v;
    public String f15785y;
    public final g e = new g(this, 1);
    public boolean f15783w = true;
    public TLRPC.Document f15784x = getMediaDataController().getGreetingsSticker();
    public boolean K = h0();

    public static void Z(n nVar) {
        n nVar2;
        ht.o().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            a3 a3Var = new a3(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = a3Var;
            a3Var.f32982c2 = new i(nVar2);
        }
        nVar2.L.f33002j0.g0();
        nVar2.L.R1(1, false);
        a3 a3Var2 = nVar2.L;
        a3Var2.X1 = true;
        a3Var2.o1(new hi.e2(nVar2, 6));
        nVar2.L.w1();
        a3 a3Var3 = nVar2.L;
        a3Var3.f33025r = null;
        if (nVar2.visibleDialog != null) {
            a3Var3.show();
        } else {
            nVar2.showDialog(a3Var3);
        }
    }

    public static void a0(n nVar) {
        j jVar = nVar.f15780n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.f15783w) {
            j jVar2 = nVar.f15780n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(nVar.currentAccount).getGreetingsSticker();
            g gVar = new g(nVar, 2);
            if (greetingsSticker == null) {
                jVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = jVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            jVar2.f33806n.getImageReceiver().setDelegate(new to(jVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, y6.f23509lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f33806n.n(ImageLocation.getForDocument(greetingsSticker), vo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f33806n.j(ImageLocation.getForDocument(greetingsSticker), vo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f33806n.setOnClickListener(new ro(jVar2, greetingsSticker, 1));
        }
    }

    public static void c0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f15780n.setScaleX(clamp);
        nVar.f15780n.setScaleY(clamp);
        nVar.f15780n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    public static int e0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void V(ArrayList arrayList, k71 k71Var) {
        arrayList.add(u61.k(this.h));
        ic.a.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(u61.k(this.f15782s));
        arrayList.add(u61.k(this.v));
        if (this.f15783w) {
            arrayList.add(u61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f15785y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f15785y;
            u61 u61Var = new u61(3);
            u61Var.d = 1;
            u61Var.f33249l = string;
            u61Var.G = str;
            arrayList.add(u61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f15784x;
            u61 u61Var2 = new u61(3);
            u61Var2.d = 1;
            u61Var2.f33249l = string2;
            u61Var2.G = document;
            arrayList.add(u61Var2);
        }
        arrayList.add(u61.C(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean h02 = h0();
        this.K = !h02;
        if (!h02) {
            arrayList.add(u61.C(null));
            u61 e = u61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f33255r = true;
            arrayList.add(e);
        }
        u61 u61Var3 = new u61(8);
        u61Var3.f33249l = null;
        arrayList.add(u61Var3);
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void X(u61 u61Var, View view) {
        View[] viewPages;
        int i10 = u61Var.d;
        if (i10 == 1) {
            l2 l2Var = new l2(getParentActivity(), getResourceProvider(), true, true);
            l2Var.E = new ai.f0(21, this, view);
            l2Var.F = new g(this, 0);
            for (View view2 : l2Var.f11157f.getViewPages()) {
                if (view2 instanceof fi.z1) {
                    fi.y1 y1Var = ((fi.z1) view2).f12050c;
                    if (y1Var.H == null) {
                        y1Var.D(null);
                    }
                }
            }
            showDialog(l2Var);
        } else if (i10 == 2) {
            this.f15782s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f15782s.d);
            AndroidUtilities.hideKeyboard(this.v.d);
            this.f15783w = true;
            this.f15780n.d("", "");
            j jVar = this.f15780n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f15784x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            f0(true);
        }
    }

    @Override
    public final boolean Y(u61 u61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f15780n = new vo(context, this.currentAccount, this.f15784x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        int dp = AndroidUtilities.dp(16.0f);
        j jVar = this.f15780n;
        k kVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i10 = y6.f23293a;
        this.f15781r = new l6(jVar, kVar2, dp, themedPaint);
        this.f15780n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(o6.e(null, this.currentAccount, getUserConfig().getClientUserId(), y6.I.q()));
        this.h.addView(lVar, kb1.i(-1, -1, 119));
        this.h.addView(this.f15780n, kb1.h(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f15782s = mVar;
        mVar.f24152r = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.f15782s;
        int i11 = y6.f23357d6;
        f7.i(i11, mVar2, getResourceProvider());
        this.f15782s.setDivider(true);
        m mVar3 = this.f15782s;
        mVar3.getClass();
        mVar3.d(new org.telegram.ui.Cells.g(mVar3, 4));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        f7.i(i11, this.v, getResourceProvider());
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        mVar5.d(new org.telegram.ui.Cells.g(mVar5, 4));
        this.f15780n.d("", "");
        super.createView(context);
        this.f30765b.setBackground(null);
        this.f30764a.u1();
        this.f30764a.setSectionsDrawBackground(true);
        this.f30764a.f32504g3.f29878r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 12));
        this.f15779f = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        f0(false);
        this.f30764a.addOnLayoutChangeListener(new x2(this, 1));
        this.f30764a.j(new ai.b(this, 17));
        m71 m71Var = this.f30764a;
        m71Var.f32506i3 = true;
        m71Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        j0();
        new z3(this.fragmentView, false, new ig.o(this, 2));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            j0();
        }
    }

    public final void f0(boolean z10) {
        if (this.f15779f != null) {
            this.f15779f.a(g0(), z10);
            m71 m71Var = this.f30764a;
            if (m71Var != null && m71Var.f32504g3 != null && this.K != (!h0())) {
                m71 m71Var2 = this.f30764a;
                if (m71Var2 != null && m71Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f30764a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f30764a.getChildAt(i12));
                        View childAt = this.f30764a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f30766c = i11;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f30766c == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.d = AndroidUtilities.dp(88.0f);
                        }
                        this.f30764a.f32503f3.h1(i11, view.getTop() - this.f30764a.getPaddingTop());
                    }
                }
                this.f30764a.f32504g3.O(true);
                int i13 = this.f30766c;
                if (i13 >= 0) {
                    m71 m71Var3 = this.f30764a;
                    m71Var3.f32503f3.h1(i13, this.d - m71Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean g0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f15782s.getText().toString();
        String str = this.G;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.v.getText().toString();
            String str3 = this.H;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f15783w;
                if (!z10 && (document = this.f15784x) != null) {
                    j10 = document.f22034id;
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

    @Override
    public final nm0 getListViewForSimpleGlass() {
        return this.f30764a;
    }

    public final boolean h0() {
        m mVar = this.f15782s;
        if (mVar != null && this.v != null) {
            if (!TextUtils.isEmpty(mVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f15783w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void i0() {
        TLRPC.Document document;
        u5 u5Var = this.f15779f;
        if (u5Var.f23140x.f19326f) {
            return;
        }
        u5Var.b(true);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!h0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f15782s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f15783w && (this.f15784x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f15784x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f15783w && (document = this.f15784x) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new bi.i0(this, 17));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        long j10;
        boolean z10;
        k71 k71Var;
        if (this.J) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            m mVar = this.f15782s;
            String str = tL_businessIntro.title;
            this.G = str;
            mVar.setText(str);
            m mVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            mVar2.setText(str2);
            this.f15784x = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.f15782s;
            this.G = "";
            mVar3.setText("");
            m mVar4 = this.v;
            this.H = "";
            mVar4.setText("");
            this.E = null;
            this.f15784x = null;
        }
        TLRPC.Document document = this.f15784x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22034id;
        }
        this.I = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15783w = z10;
        j jVar = this.f15780n;
        if (jVar != null) {
            jVar.d(this.f15782s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f15780n;
            TLRPC.Document document2 = this.f15784x;
            if (document2 == null || this.f15783w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f15783w) {
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        m71 m71Var = this.f30764a;
        if (m71Var != null && (k71Var = m71Var.f32504g3) != null) {
            k71Var.O(true);
        }
        this.J = true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (g0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final n f15719b;

                    {
                        this.f15719b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f15719b.i0();
                                return;
                            default:
                                this.f15719b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) {
                    public final n f15719b;

                    {
                        this.f15719b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f15719b.i0();
                                return;
                            default:
                                this.f15719b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f22369a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

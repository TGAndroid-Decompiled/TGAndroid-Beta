package hg;

import ai.h4;
import ai.o8;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ci.b7;
import ci.r2;
import ei.u2;
import java.util.ArrayList;
import m.t2;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yo;
import org.telegram.ui.Components.zo;
import org.telegram.ui.ut;
import w7.w5;
public final class n extends k71 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public h4 L;
    public is f11317e;
    public org.telegram.ui.ActionBar.u0 f11318f;
    public k h;
    public j f11319n;
    public t5 f11320r;
    public m f11321s;
    public m v;
    public String f11324y;
    public final h d = new h(this, 1);
    public boolean f11322w = true;
    public TLRPC.Document f11323x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        ut.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            h4 h4Var = new h4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = h4Var;
            h4Var.f24329c2 = new a6.i(nVar2, 23);
        }
        nVar2.L.f24350j0.f0();
        nVar2.L.N1(1, false);
        h4 h4Var2 = nVar2.L;
        h4Var2.X1 = true;
        h4Var2.k1(new bi.v(nVar2, 22));
        nVar2.L.t1();
        h4 h4Var3 = nVar2.L;
        h4Var3.f24373r = null;
        if (nVar2.visibleDialog != null) {
            h4Var3.show();
        } else {
            nVar2.showDialog(h4Var3);
        }
    }

    public static void Z(n nVar) {
        j jVar = nVar.f11319n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.f11322w) {
            j jVar2 = nVar.f11319n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(nVar.currentAccount).getGreetingsSticker();
            h hVar = new h(nVar, 2);
            if (greetingsSticker == null) {
                jVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = jVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            jVar2.f24702n.getImageReceiver().setDelegate(new zo(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, h6.f20712lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f24702n.n(ImageLocation.getForDocument(greetingsSticker), bp.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f24702n.j(ImageLocation.getForDocument(greetingsSticker), bp.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f24702n.setOnClickListener(new yo(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f11319n.setScaleX(clamp);
        nVar.f11319n.setScaleY(clamp);
        nVar.f11319n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int c0(n nVar) {
        return nVar.classGuid;
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, h71 h71Var) {
        arrayList.add(u61.k(this.h));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(u61.k(this.f11321s));
        arrayList.add(u61.k(this.v));
        if (this.f11322w) {
            arrayList.add(u61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f11324y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f11324y;
            u61 u61Var = new u61(3);
            u61Var.d = 1;
            u61Var.f31071l = string;
            u61Var.G = str;
            arrayList.add(u61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f11323x;
            u61 u61Var2 = new u61(3);
            u61Var2.d = 1;
            u61Var2.f31071l = string2;
            u61Var2.G = document;
            arrayList.add(u61Var2);
        }
        arrayList.add(u61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(u61.B(null));
            u61 e7 = u61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e7.f31077r = true;
            arrayList.add(e7);
        }
        u61 u61Var3 = new u61(8);
        u61Var3.f31071l = null;
        arrayList.add(u61Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(u61 u61Var, View view) {
        View[] viewPages;
        int i10 = u61Var.d;
        if (i10 == 1) {
            r2 r2Var = new r2(getParentActivity(), getResourceProvider(), true, true);
            r2Var.f5889y = new ah.b(13, this, view);
            r2Var.E = new h(this, 0);
            for (View view2 : r2Var.f5883f.getViewPages()) {
                if (view2 instanceof ci.d2) {
                    ci.c2 c2Var = ((ci.d2) view2).f4894c;
                    if (c2Var.H == null) {
                        c2Var.D(null);
                    }
                }
            }
            showDialog(r2Var);
        } else if (i10 == 2) {
            this.f11321s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f11321s.f22081b);
            AndroidUtilities.hideKeyboard(this.v.f22081b);
            this.f11322w = true;
            this.f11319n.d("", "");
            j jVar = this.f11319n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f11323x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(u61 u61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f11319n = new bp(context, this.currentAccount, this.f11323x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        this.f11320r = new t5(this.f11319n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f11319n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), h6.I.q()));
        this.h.addView(lVar, w5.e(-1, -1, 119));
        this.h.addView(this.f11319n, w5.a(-2.0f, 42.0f, 18.0f, 42.0f, 18.0f, -2, 17));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f11321s = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.f11321s;
        int i10 = h6.f20560d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.f11321s.setDivider(true);
        m mVar3 = this.f11321s;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        h3 h3Var = mVar3.f22081b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new t2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        h3 h3Var2 = mVar5.f22081b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new t2(gVar2, 2));
        this.f11319n.d("", "");
        super.createView(context);
        this.f27776a.p1();
        j71 j71Var = this.f27776a;
        j71Var.W2.f26679r = false;
        this.actionBar.setAdaptiveBackground(j71Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = h6.f20895v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f11317e = new is(mutate, new lq(h6.x0(null, i11, false)));
        this.f11318f = this.actionBar.p().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11317e);
        e0(false);
        this.f27776a.addOnLayoutChangeListener(new u2(this, 1));
        this.f27776a.j(new ai.r(this, 8));
        j71 j71Var2 = this.f27776a;
        j71Var2.Y2 = true;
        j71Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new ci.h4(this.fragmentView, false, new ai.y1(this, 22));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11318f != null) {
            boolean f02 = f0();
            this.f11318f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f11318f.animate();
                if (f02) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (f02) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (f02) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.u0 u0Var = this.f11318f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f11318f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f11318f;
                if (f02) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            j71 j71Var = this.f27776a;
            if (j71Var != null && j71Var.W2 != null && this.K != (!g0())) {
                j71 j71Var2 = this.f27776a;
                if (j71Var2 != null && j71Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f27776a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f27776a.getChildAt(i12));
                        View childAt = this.f27776a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f27777b = i11;
                        int top = view.getTop();
                        this.f27778c = top;
                        if (this.f27777b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f27778c = AndroidUtilities.dp(88.0f);
                        }
                        this.f27776a.V2.h1(i11, view.getTop() - this.f27776a.getPaddingTop());
                    }
                }
                this.f27776a.W2.N(true);
                int i13 = this.f27777b;
                if (i13 >= 0) {
                    j71 j71Var3 = this.f27776a;
                    j71Var3.V2.h1(i13, this.f27778c - j71Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f11321s.getText().toString();
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
                boolean z10 = this.f11322w;
                if (!z10 && (document = this.f11323x) != null) {
                    j3 = document.f19809id;
                } else {
                    j3 = 0;
                }
                if (j3 == this.I) {
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

    public final boolean g0() {
        m mVar = this.f11321s;
        if (mVar != null && this.v != null) {
            if (!TextUtils.isEmpty(mVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f11322w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        is isVar = this.f11317e;
        if (isVar.f27268c > 0.0f) {
            return;
        }
        isVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f11321s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f11322w && (this.f11323x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f11323x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f11322w && (document = this.f11323x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new o8(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j3;
        boolean z10;
        h71 h71Var;
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
            m mVar = this.f11321s;
            String str = tL_businessIntro.title;
            this.G = str;
            mVar.setText(str);
            m mVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            mVar2.setText(str2);
            this.f11323x = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.f11321s;
            this.G = "";
            mVar3.setText("");
            m mVar4 = this.v;
            this.H = "";
            mVar4.setText("");
            this.E = null;
            this.f11323x = null;
        }
        TLRPC.Document document = this.f11323x;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19809id;
        }
        this.I = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11322w = z10;
        j jVar = this.f11319n;
        if (jVar != null) {
            jVar.d(this.f11321s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f11319n;
            TLRPC.Document document2 = this.f11323x;
            if (document2 == null || this.f11322w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f11322w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        j71 j71Var = this.f27776a;
        if (j71Var != null && (h71Var = j71Var.W2) != null) {
            h71Var.N(true);
        }
        this.J = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (f0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
                    public final n f11264b;

                    {
                        this.f11264b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11264b.h0();
                                return;
                            default:
                                this.f11264b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) {
                    public final n f11264b;

                    {
                        this.f11264b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11264b.h0();
                                return;
                            default:
                                this.f11264b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20142a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f27776a.setPadding(0, 0, 0, i13);
        this.f27776a.setClipToPadding(false);
    }
}

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
import m.s2;
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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xo;
import org.telegram.ui.Components.zo;
import org.telegram.ui.qt;
import w7.x5;
public final class n extends g71 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public h4 L;
    public hs f11318e;
    public org.telegram.ui.ActionBar.u0 f11319f;
    public k h;
    public j f11320n;
    public t5 f11321r;
    public m f11322s;
    public m v;
    public String f11325y;
    public final h d = new h(this, 1);
    public boolean f11323w = true;
    public TLRPC.Document f11324x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        qt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            h4 h4Var = new h4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = h4Var;
            h4Var.f33280c2 = new a6.i(nVar2, 24);
        }
        nVar2.L.f33301j0.f0();
        nVar2.L.N1(1, false);
        h4 h4Var2 = nVar2.L;
        h4Var2.X1 = true;
        h4Var2.k1(new bi.v(nVar2, 22));
        nVar2.L.t1();
        h4 h4Var3 = nVar2.L;
        h4Var3.f33324r = null;
        if (nVar2.visibleDialog != null) {
            h4Var3.show();
        } else {
            nVar2.showDialog(h4Var3);
        }
    }

    public static void Z(n nVar) {
        j jVar = nVar.f11320n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.f11323w) {
            j jVar2 = nVar.f11320n;
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
            jVar2.f33662n.getImageReceiver().setDelegate(new xo(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, h6.f20974lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f33662n.n(ImageLocation.getForDocument(greetingsSticker), zo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f33662n.j(ImageLocation.getForDocument(greetingsSticker), zo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f33662n.setOnClickListener(new wo(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f11320n.setScaleX(clamp);
        nVar.f11320n.setScaleY(clamp);
        nVar.f11320n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int c0(n nVar) {
        return nVar.classGuid;
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, d71 d71Var) {
        arrayList.add(q61.k(this.h));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(q61.k(this.f11322s));
        arrayList.add(q61.k(this.v));
        if (this.f11323w) {
            arrayList.add(q61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f11325y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f11325y;
            q61 q61Var = new q61(3);
            q61Var.d = 1;
            q61Var.f30167l = string;
            q61Var.G = str;
            arrayList.add(q61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f11324x;
            q61 q61Var2 = new q61(3);
            q61Var2.d = 1;
            q61Var2.f30167l = string2;
            q61Var2.G = document;
            arrayList.add(q61Var2);
        }
        arrayList.add(q61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(q61.B(null));
            q61 e7 = q61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e7.f30173r = true;
            arrayList.add(e7);
        }
        q61 q61Var3 = new q61(8);
        q61Var3.f30167l = null;
        arrayList.add(q61Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(q61 q61Var, View view) {
        View[] viewPages;
        int i10 = q61Var.d;
        if (i10 == 1) {
            r2 r2Var = new r2(getParentActivity(), getResourceProvider(), true, true);
            r2Var.f5890y = new ah.b(13, this, view);
            r2Var.E = new h(this, 0);
            for (View view2 : r2Var.f5884f.getViewPages()) {
                if (view2 instanceof ci.d2) {
                    ci.c2 c2Var = ((ci.d2) view2).f4895c;
                    if (c2Var.H == null) {
                        c2Var.D(null);
                    }
                }
            }
            showDialog(r2Var);
        } else if (i10 == 2) {
            this.f11322s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f11322s.f22325b);
            AndroidUtilities.hideKeyboard(this.v.f22325b);
            this.f11323w = true;
            this.f11320n.d("", "");
            j jVar = this.f11320n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f11324x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(q61 q61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f11320n = new zo(context, this.currentAccount, this.f11324x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        this.f11321r = new t5(this.f11320n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f11320n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), h6.I.q()));
        this.h.addView(lVar, x5.e(-1, -1, 119));
        this.h.addView(this.f11320n, x5.a(-2.0f, 42.0f, 18.0f, 42.0f, 18.0f, -2, 17));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f11322s = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.f11322s;
        int i10 = h6.f20822d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.f11322s.setDivider(true);
        m mVar3 = this.f11322s;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        h3 h3Var = mVar3.f22325b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new s2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        h3 h3Var2 = mVar5.f22325b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.f11320n.d("", "");
        super.createView(context);
        this.f26675a.p1();
        f71 f71Var = this.f26675a;
        f71Var.W2.f25649r = false;
        this.actionBar.setAdaptiveBackground(f71Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = h6.f21156v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f11318e = new hs(mutate, new jq(h6.x0(null, i11, false)));
        this.f11319f = this.actionBar.o().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11318e);
        e0(false);
        this.f26675a.addOnLayoutChangeListener(new u2(this, 1));
        this.f26675a.j(new ai.r(this, 8));
        f71 f71Var2 = this.f26675a;
        f71Var2.Y2 = true;
        f71Var2.setClipChildren(false);
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
        if (this.f11319f != null) {
            boolean f02 = f0();
            this.f11319f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f11319f.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f11319f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f11319f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f11319f;
                if (f02) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            f71 f71Var = this.f26675a;
            if (f71Var != null && f71Var.W2 != null && this.K != (!g0())) {
                f71 f71Var2 = this.f26675a;
                if (f71Var2 != null && f71Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f26675a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f26675a.getChildAt(i12));
                        View childAt = this.f26675a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f26676b = i11;
                        int top = view.getTop();
                        this.f26677c = top;
                        if (this.f26676b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f26677c = AndroidUtilities.dp(88.0f);
                        }
                        this.f26675a.V2.h1(i11, view.getTop() - this.f26675a.getPaddingTop());
                    }
                }
                this.f26675a.W2.N(true);
                int i13 = this.f26676b;
                if (i13 >= 0) {
                    f71 f71Var3 = this.f26675a;
                    f71Var3.V2.h1(i13, this.f26677c - f71Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f11322s.getText().toString();
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
                boolean z10 = this.f11323w;
                if (!z10 && (document = this.f11324x) != null) {
                    j3 = document.f20074id;
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
        m mVar = this.f11322s;
        if (mVar != null && this.v != null) {
            if (!TextUtils.isEmpty(mVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f11323w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        hs hsVar = this.f11318e;
        if (hsVar.f27225c > 0.0f) {
            return;
        }
        hsVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f11322s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f11323w && (this.f11324x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f11324x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f11323w && (document = this.f11324x) != null) {
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
        d71 d71Var;
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
            m mVar = this.f11322s;
            String str = tL_businessIntro.title;
            this.G = str;
            mVar.setText(str);
            m mVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            mVar2.setText(str2);
            this.f11324x = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.f11322s;
            this.G = "";
            mVar3.setText("");
            m mVar4 = this.v;
            this.H = "";
            mVar4.setText("");
            this.E = null;
            this.f11324x = null;
        }
        TLRPC.Document document = this.f11324x;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20074id;
        }
        this.I = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11323w = z10;
        j jVar = this.f11320n;
        if (jVar != null) {
            jVar.d(this.f11322s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f11320n;
            TLRPC.Document document2 = this.f11324x;
            if (document2 == null || this.f11323w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f11323w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        f71 f71Var = this.f26675a;
        if (f71Var != null && (d71Var = f71Var.W2) != null) {
            d71Var.N(true);
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
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
                    public final n f11265b;

                    {
                        this.f11265b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11265b.h0();
                                return;
                            default:
                                this.f11265b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) {
                    public final n f11265b;

                    {
                        this.f11265b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11265b.h0();
                                return;
                            default:
                                this.f11265b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20404a);
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
        this.f26675a.setPadding(0, 0, 0, i13);
        this.f26675a.setClipToPadding(false);
    }
}

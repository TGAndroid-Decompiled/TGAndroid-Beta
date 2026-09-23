package hg;

import ai.g4;
import ai.n8;
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
import ci.i4;
import ci.s2;
import ei.u2;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.pt;
import w7.x5;
public final class n extends y51 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public g4 L;
    public qr e;
    public org.telegram.ui.ActionBar.v0 f10345f;
    public k h;
    public j f10346n;
    public u5 f10347r;
    public m f10348s;
    public m v;
    public String f10351y;
    public final h d = new h(this, 1);
    public boolean f10349w = true;
    public TLRPC.Document f10350x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        pt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            g4 g4Var = new g4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = g4Var;
            g4Var.Z1 = new a4.m(nVar2, 17);
        }
        nVar2.L.f29677j0.f0();
        nVar2.L.J1(1, false);
        g4 g4Var2 = nVar2.L;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(nVar2, 22));
        nVar2.L.r1();
        g4 g4Var3 = nVar2.L;
        g4Var3.f29700r = null;
        if (nVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            nVar2.showDialog(g4Var3);
        }
    }

    public static void Z(n nVar) {
        j jVar = nVar.f10346n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.f10349w) {
            j jVar2 = nVar.f10346n;
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
            jVar2.f25637n.getImageReceiver().setDelegate(new io(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, h6.f18940lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f25637n.n(ImageLocation.getForDocument(greetingsSticker), ko.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f25637n.j(ImageLocation.getForDocument(greetingsSticker), ko.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f25637n.setOnClickListener(new ho(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f10346n.setScaleX(clamp);
        nVar.f10346n.setScaleY(clamp);
        nVar.f10346n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int c0(n nVar) {
        return nVar.classGuid;
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, v51 v51Var) {
        arrayList.add(h51.k(this.h));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(h51.k(this.f10348s));
        arrayList.add(h51.k(this.v));
        if (this.f10349w) {
            arrayList.add(h51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f10351y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f10351y;
            h51 h51Var = new h51(3);
            h51Var.d = 1;
            h51Var.f24507l = string;
            h51Var.G = str;
            arrayList.add(h51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f10350x;
            h51 h51Var2 = new h51(3);
            h51Var2.d = 1;
            h51Var2.f24507l = string2;
            h51Var2.G = document;
            arrayList.add(h51Var2);
        }
        arrayList.add(h51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(h51.B(null));
            h51 e = h51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f24513r = true;
            arrayList.add(e);
        }
        h51 h51Var3 = new h51(8);
        h51Var3.f24507l = null;
        arrayList.add(h51Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(h51 h51Var, View view) {
        View[] viewPages;
        int i10 = h51Var.d;
        if (i10 == 1) {
            s2 s2Var = new s2(getParentActivity(), getResourceProvider(), true, true);
            s2Var.f5480y = new ah.b(13, this, view);
            s2Var.E = new h(this, 0);
            for (View view2 : s2Var.f5474f.getViewPages()) {
                if (view2 instanceof ci.e2) {
                    ci.d2 d2Var = ((ci.e2) view2).f4595c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
            }
            showDialog(s2Var);
        } else if (i10 == 2) {
            this.f10348s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f10348s.f20177b);
            AndroidUtilities.hideKeyboard(this.v.f20177b);
            this.f10349w = true;
            this.f10346n.d("", "");
            j jVar = this.f10346n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f10350x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(h51 h51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f10346n = new ko(context, this.currentAccount, this.f10350x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        this.f10347r = new u5(this.f10346n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f10346n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), h6.I.q()));
        this.h.addView(lVar, x5.e(-1, -1, 119));
        this.h.addView(this.f10346n, x5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f10348s = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.f10348s;
        int i10 = h6.f18789d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.f10348s.setDivider(true);
        m mVar3 = this.f10348s;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        g3 g3Var = mVar3.f20177b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        g3 g3Var2 = mVar5.f20177b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        this.f10346n.d("", "");
        super.createView(context);
        this.f30163a.p1();
        x51 x51Var = this.f30163a;
        x51Var.Y2.f28662r = false;
        this.actionBar.setAdaptiveBackground(x51Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = h6.f19120v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new qr(mutate, new up(h6.w0(null, i11, false)));
        this.f10345f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f30163a.addOnLayoutChangeListener(new u2(this, 1));
        this.f30163a.j(new ai.r(this, 8));
        x51 x51Var2 = this.f30163a;
        x51Var2.f23290a3 = true;
        x51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new i4(this.fragmentView, false, new ai.y1(this, 22));
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
        if (this.f10345f != null) {
            boolean f02 = f0();
            this.f10345f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f10345f.animate();
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
                org.telegram.ui.ActionBar.v0 v0Var = this.f10345f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.v0 v0Var2 = this.f10345f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.v0 v0Var3 = this.f10345f;
                if (f02) {
                    f13 = 1.0f;
                }
                v0Var3.setScaleY(f13);
            }
            x51 x51Var = this.f30163a;
            if (x51Var != null && x51Var.Y2 != null && this.K != (!g0())) {
                x51 x51Var2 = this.f30163a;
                if (x51Var2 != null && x51Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f30163a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f30163a.getChildAt(i12));
                        View childAt = this.f30163a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f30164b = i11;
                        int top = view.getTop();
                        this.f30165c = top;
                        if (this.f30164b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f30165c = AndroidUtilities.dp(88.0f);
                        }
                        this.f30163a.X2.h1(i11, view.getTop() - this.f30163a.getPaddingTop());
                    }
                }
                this.f30163a.Y2.N(true);
                int i13 = this.f30164b;
                if (i13 >= 0) {
                    x51 x51Var3 = this.f30163a;
                    x51Var3.X2.h1(i13, this.f30165c - x51Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f10348s.getText().toString();
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
                boolean z10 = this.f10349w;
                if (!z10 && (document = this.f10350x) != null) {
                    j3 = document.f18089id;
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
        m mVar = this.f10348s;
        if (mVar != null && this.v != null) {
            if (!TextUtils.isEmpty(mVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f10349w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        qr qrVar = this.e;
        if (qrVar.f27437c > 0.0f) {
            return;
        }
        qrVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f10348s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f10349w && (this.f10350x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f10350x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f10349w && (document = this.f10350x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new n8(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j3;
        boolean z10;
        v51 v51Var;
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
            m mVar = this.f10348s;
            String str = tL_businessIntro.title;
            this.G = str;
            mVar.setText(str);
            m mVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            mVar2.setText(str2);
            this.f10350x = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.f10348s;
            this.G = "";
            mVar3.setText("");
            m mVar4 = this.v;
            this.H = "";
            mVar4.setText("");
            this.E = null;
            this.f10350x = null;
        }
        TLRPC.Document document = this.f10350x;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18089id;
        }
        this.I = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10349w = z10;
        j jVar = this.f10346n;
        if (jVar != null) {
            jVar.d(this.f10348s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f10346n;
            TLRPC.Document document2 = this.f10350x;
            if (document2 == null || this.f10349w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f10349w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        x51 x51Var = this.f30163a;
        if (x51Var != null && (v51Var = x51Var.Y2) != null) {
            v51Var.N(true);
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
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final n f10295b;

                    {
                        this.f10295b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10295b.h0();
                                return;
                            default:
                                this.f10295b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final n f10295b;

                    {
                        this.f10295b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10295b.h0();
                                return;
                            default:
                                this.f10295b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f18409a);
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
        this.f30163a.setPadding(0, 0, 0, i13);
        this.f30163a.setClipToPadding(false);
    }
}

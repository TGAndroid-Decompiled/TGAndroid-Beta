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
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.y51;
import org.telegram.ui.nt;
import w7.y5;
public final class n extends p61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public g4 L;
    public sr e;
    public org.telegram.ui.ActionBar.u0 f10359f;
    public k h;
    public j f10360n;
    public t5 f10361r;
    public m f10362s;
    public m v;
    public String f10365y;
    public final h d = new h(this, 1);
    public boolean f10363w = true;
    public TLRPC.Document f10364x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        nt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            g4 g4Var = new g4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = g4Var;
            g4Var.Z1 = new a4.m(nVar2, 18);
        }
        nVar2.L.f30282j0.f0();
        nVar2.L.J1(1, false);
        g4 g4Var2 = nVar2.L;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(nVar2, 22));
        nVar2.L.r1();
        g4 g4Var3 = nVar2.L;
        g4Var3.f30305r = null;
        if (nVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            nVar2.showDialog(g4Var3);
        }
    }

    public static void Z(n nVar) {
        j jVar = nVar.f10360n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.f10363w) {
            j jVar2 = nVar.f10360n;
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
            jVar2.f26338n.getImageReceiver().setDelegate(new ko(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, h6.f19227lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f26338n.n(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f26338n.j(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f26338n.setOnClickListener(new jo(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f10360n.setScaleX(clamp);
        nVar.f10360n.setScaleY(clamp);
        nVar.f10360n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int c0(n nVar) {
        return nVar.classGuid;
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, m61 m61Var) {
        arrayList.add(y51.k(this.h));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(y51.k(this.f10362s));
        arrayList.add(y51.k(this.v));
        if (this.f10363w) {
            arrayList.add(y51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f10365y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f10365y;
            y51 y51Var = new y51(3);
            y51Var.d = 1;
            y51Var.f30637l = string;
            y51Var.G = str;
            arrayList.add(y51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f10364x;
            y51 y51Var2 = new y51(3);
            y51Var2.d = 1;
            y51Var2.f30637l = string2;
            y51Var2.G = document;
            arrayList.add(y51Var2);
        }
        arrayList.add(y51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(y51.B(null));
            y51 e = y51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f30643r = true;
            arrayList.add(e);
        }
        y51 y51Var3 = new y51(8);
        y51Var3.f30637l = null;
        arrayList.add(y51Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(y51 y51Var, View view) {
        View[] viewPages;
        int i10 = y51Var.d;
        if (i10 == 1) {
            s2 s2Var = new s2(getParentActivity(), getResourceProvider(), true, true);
            s2Var.f5489y = new ah.b(13, this, view);
            s2Var.E = new h(this, 0);
            for (View view2 : s2Var.f5483f.getViewPages()) {
                if (view2 instanceof ci.e2) {
                    ci.d2 d2Var = ((ci.e2) view2).f4602c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
            }
            showDialog(s2Var);
        } else if (i10 == 2) {
            this.f10362s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f10362s.f20508b);
            AndroidUtilities.hideKeyboard(this.v.f20508b);
            this.f10363w = true;
            this.f10360n.d("", "");
            j jVar = this.f10360n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f10364x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(y51 y51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f10360n = new mo(context, this.currentAccount, this.f10364x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        this.f10361r = new t5(this.f10360n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f10360n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), h6.I.q()));
        this.h.addView(lVar, y5.e(-1, -1, 119));
        this.h.addView(this.f10360n, y5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f10362s = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.f10362s;
        int i10 = h6.f19076d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.f10362s.setDivider(true);
        m mVar3 = this.f10362s;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        h3 h3Var = mVar3.f20508b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        h3 h3Var2 = mVar5.f20508b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        this.f10360n.d("", "");
        super.createView(context);
        this.f27258a.s1();
        o61 o61Var = this.f27258a;
        o61Var.f28778f3.f26223r = false;
        this.actionBar.setAdaptiveBackground(o61Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = h6.f19409v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new sr(mutate, new wp(h6.w0(null, i11, false)));
        this.f10359f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f27258a.addOnLayoutChangeListener(new u2(this, 1));
        this.f27258a.j(new ai.r(this, 8));
        o61 o61Var2 = this.f27258a;
        o61Var2.f28780h3 = true;
        o61Var2.setClipChildren(false);
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
        if (this.f10359f != null) {
            boolean f02 = f0();
            this.f10359f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f10359f.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f10359f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f10359f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f10359f;
                if (f02) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            o61 o61Var = this.f27258a;
            if (o61Var != null && o61Var.f28778f3 != null && this.K != (!g0())) {
                o61 o61Var2 = this.f27258a;
                if (o61Var2 != null && o61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f27258a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f27258a.getChildAt(i12));
                        View childAt = this.f27258a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f27259b = i11;
                        int top = view.getTop();
                        this.f27260c = top;
                        if (this.f27259b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f27260c = AndroidUtilities.dp(88.0f);
                        }
                        this.f27258a.f28777e3.h1(i11, view.getTop() - this.f27258a.getPaddingTop());
                    }
                }
                this.f27258a.f28778f3.N(true);
                int i13 = this.f27259b;
                if (i13 >= 0) {
                    o61 o61Var3 = this.f27258a;
                    o61Var3.f28777e3.h1(i13, this.f27260c - o61Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f10362s.getText().toString();
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
                boolean z10 = this.f10363w;
                if (!z10 && (document = this.f10364x) != null) {
                    j3 = document.f18358id;
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
        m mVar = this.f10362s;
        if (mVar != null && this.v != null) {
            if (!TextUtils.isEmpty(mVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f10363w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        sr srVar = this.e;
        if (srVar.f28333c > 0.0f) {
            return;
        }
        srVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f10362s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f10363w && (this.f10364x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f10364x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f10363w && (document = this.f10364x) != null) {
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
        m61 m61Var;
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
            m mVar = this.f10362s;
            String str = tL_businessIntro.title;
            this.G = str;
            mVar.setText(str);
            m mVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            mVar2.setText(str2);
            this.f10364x = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.f10362s;
            this.G = "";
            mVar3.setText("");
            m mVar4 = this.v;
            this.H = "";
            mVar4.setText("");
            this.E = null;
            this.f10364x = null;
        }
        TLRPC.Document document = this.f10364x;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18358id;
        }
        this.I = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10363w = z10;
        j jVar = this.f10360n;
        if (jVar != null) {
            jVar.d(this.f10362s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f10360n;
            TLRPC.Document document2 = this.f10364x;
            if (document2 == null || this.f10363w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f10363w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        o61 o61Var = this.f27258a;
        if (o61Var != null && (m61Var = o61Var.f28778f3) != null) {
            m61Var.N(true);
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
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
                    public final n f10309b;

                    {
                        this.f10309b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10309b.h0();
                                return;
                            default:
                                this.f10309b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) {
                    public final n f10309b;

                    {
                        this.f10309b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10309b.h0();
                                return;
                            default:
                                this.f10309b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f18678a);
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
        this.f27258a.setPadding(0, 0, 0, i13);
        this.f27258a.setClipToPadding(false);
    }
}

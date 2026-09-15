package hg;

import ai.g4;
import ai.m8;
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
import ci.d7;
import ci.j4;
import ci.t2;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.z51;
import org.telegram.ui.st;
import w7.x5;
public final class m extends z51 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public g4 M;
    public pr f10349f;
    public org.telegram.ui.ActionBar.v0 h;
    public j f10350n;
    public i f10351r;
    public v5 f10352s;
    public l v;
    public l f10353w;
    public final g e = new g(this, 1);
    public boolean f10354x = true;
    public TLRPC.Document f10355y = getMediaDataController().getGreetingsSticker();
    public boolean L = g0();

    public static void Y(m mVar) {
        m mVar2;
        st.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.M != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            g4 g4Var = new g4(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.M = g4Var;
            g4Var.Z1 = new a4.m(mVar2, 17);
        }
        mVar2.M.f28762j0.f0();
        mVar2.M.J1(1, false);
        g4 g4Var2 = mVar2.M;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(mVar2, 22));
        mVar2.M.r1();
        g4 g4Var3 = mVar2.M;
        g4Var3.f28785r = null;
        if (mVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            mVar2.showDialog(g4Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.f10351r;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f10354x) {
            i iVar2 = mVar.f10351r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(mVar.currentAccount).getGreetingsSticker();
            g gVar = new g(mVar, 2);
            if (greetingsSticker == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.f25387n.getImageReceiver().setDelegate(new ho(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, i6.f18988lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f25387n.n(ImageLocation.getForDocument(greetingsSticker), jo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f25387n.j(ImageLocation.getForDocument(greetingsSticker), jo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f25387n.setOnClickListener(new go(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.f10350n.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.f10350n.getParent()).getTop();
        int measuredHeight = mVar.f10350n.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f10351r.setScaleX(clamp);
        mVar.f10351r.setScaleY(clamp);
        mVar.f10351r.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.f10350n.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, w51 w51Var) {
        arrayList.add(i51.k(this.f10350n));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(i51.k(this.v));
        arrayList.add(i51.k(this.f10353w));
        if (this.f10354x) {
            arrayList.add(i51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.E != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.E;
            i51 i51Var = new i51(3);
            i51Var.d = 1;
            i51Var.f24894l = string;
            i51Var.G = str;
            arrayList.add(i51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f10355y;
            i51 i51Var2 = new i51(3);
            i51Var2.d = 1;
            i51Var2.f24894l = string2;
            i51Var2.G = document;
            arrayList.add(i51Var2);
        }
        arrayList.add(i51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.L = !g02;
        if (!g02) {
            arrayList.add(i51.B(null));
            i51 e = i51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f24900r = true;
            arrayList.add(e);
        }
        i51 i51Var3 = new i51(8);
        i51Var3.f24894l = null;
        arrayList.add(i51Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(i51 i51Var, View view) {
        View[] viewPages;
        int i10 = i51Var.d;
        if (i10 == 1) {
            t2 t2Var = new t2(getParentActivity(), getResourceProvider(), true, true);
            t2Var.f5550y = new ah.b(13, this, view);
            t2Var.E = new g(this, 0);
            for (View view2 : t2Var.f5544f.getViewPages()) {
                if (view2 instanceof ci.e2) {
                    ci.d2 d2Var = ((ci.e2) view2).f4584c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
            }
            showDialog(t2Var);
        } else if (i10 == 2) {
            this.v.setText("");
            this.f10353w.setText("");
            AndroidUtilities.hideKeyboard(this.v.f20229b);
            AndroidUtilities.hideKeyboard(this.f10353w.f20229b);
            this.f10354x = true;
            this.f10351r.d("", "");
            i iVar = this.f10351r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f10355y = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(i51 i51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f10351r = new jo(context, this.currentAccount, this.f10355y, getResourceProvider());
        j jVar = new j(this, context);
        this.f10350n = jVar;
        jVar.setWillNotDraw(false);
        this.f10352s = new v5(this.f10351r, this.f10350n, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f10351r.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(d7.e(null, this.currentAccount, getUserConfig().getClientUserId(), i6.I.q()));
        this.f10350n.addView(kVar, x5.e(-1, -1, 119));
        this.f10350n.addView(this.f10351r, x5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.v = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.v;
        int i10 = i6.f18836d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar3 = this.v;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        g3 g3Var = lVar3.f20229b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new s2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.f10353w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.f10353w.setBackgroundColor(getThemedColor(i10));
        this.f10353w.setDivider(true);
        l lVar5 = this.f10353w;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        g3 g3Var2 = lVar5.f20229b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.f10351r.d("", "");
        super.createView(context);
        this.f30485a.p1();
        y51 y51Var = this.f30485a;
        y51Var.Y2.f29613r = false;
        this.actionBar.setAdaptiveBackground(y51Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = i6.f19168v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f10349f = new pr(mutate, new tp(i6.w0(null, i11, false)));
        this.h = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10349f);
        e0(false);
        this.f30485a.addOnLayoutChangeListener(new u2(this, 1));
        this.f30485a.j(new ai.r(this, 9));
        y51 y51Var2 = this.f30485a;
        y51Var2.f23558a3 = true;
        y51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new j4(this.fragmentView, false, new ai.y1(this, 19));
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
        if (this.h != null) {
            boolean f02 = f0();
            this.h.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.h.animate();
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
                org.telegram.ui.ActionBar.v0 v0Var = this.h;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.v0 v0Var2 = this.h;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.v0 v0Var3 = this.h;
                if (f02) {
                    f13 = 1.0f;
                }
                v0Var3.setScaleY(f13);
            }
            y51 y51Var = this.f30485a;
            if (y51Var != null && y51Var.Y2 != null && this.L != (!g0())) {
                y51 y51Var2 = this.f30485a;
                if (y51Var2 != null && y51Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f30485a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f30485a.getChildAt(i12));
                        View childAt = this.f30485a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f30487c = i11;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f30487c == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.d = AndroidUtilities.dp(88.0f);
                        }
                        this.f30485a.X2.h1(i11, view.getTop() - this.f30485a.getPaddingTop());
                    }
                }
                this.f30485a.Y2.N(true);
                int i13 = this.f30487c;
                if (i13 >= 0) {
                    y51 y51Var3 = this.f30485a;
                    y51Var3.X2.h1(i13, this.d - y51Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.v.getText().toString();
        String str = this.H;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f10353w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f10354x;
                if (!z10 && (document = this.f10355y) != null) {
                    j3 = document.f18118id;
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

    public final boolean g0() {
        l lVar = this.v;
        if (lVar != null && this.f10353w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f10353w.getText()) || !this.f10354x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        pr prVar = this.f10349f;
        if (prVar.f27132c > 0.0f) {
            return;
        }
        prVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.v.getText().toString();
            updatebusinessintro.intro.description = this.f10353w.getText().toString();
            if (!this.f10354x && (this.f10355y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f10355y);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f10354x && (document = this.f10355y) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new m8(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j3;
        boolean z10;
        w51 w51Var;
        if (this.K) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.v;
            String str = tL_businessIntro.title;
            this.H = str;
            lVar.setText(str);
            l lVar2 = this.f10353w;
            String str2 = userFull.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.f10355y = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.v;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.f10353w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.f10355y = null;
        }
        TLRPC.Document document = this.f10355y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18118id;
        }
        this.J = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10354x = z10;
        i iVar = this.f10351r;
        if (iVar != null) {
            iVar.d(this.v.getText().toString(), this.f10353w.getText().toString());
            i iVar2 = this.f10351r;
            TLRPC.Document document2 = this.f10355y;
            if (document2 == null || this.f10354x) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f10354x) {
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        y51 y51Var = this.f30485a;
        if (y51Var != null && (w51Var = y51Var.Y2) != null) {
            w51Var.N(true);
        }
        this.K = true;
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
                alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f10301b;

                    {
                        this.f10301b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10301b.h0();
                                return;
                            default:
                                this.f10301b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f10301b;

                    {
                        this.f10301b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10301b.h0();
                                return;
                            default:
                                this.f10301b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f18437a);
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
        this.f30485a.setPadding(0, 0, 0, i13);
        this.f30485a.setClipToPadding(false);
    }
}

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x51;
import org.telegram.ui.st;
import w7.y5;
public final class m extends o61 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public g4 M;
    public pr f10354f;
    public org.telegram.ui.ActionBar.v0 h;
    public j f10355n;
    public i f10356r;
    public v5 f10357s;
    public l v;
    public l f10358w;
    public final g e = new g(this, 1);
    public boolean f10359x = true;
    public TLRPC.Document f10360y = getMediaDataController().getGreetingsSticker();
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
            g4Var.Z1 = new a4.m(mVar2, 18);
        }
        mVar2.M.f29033j0.f0();
        mVar2.M.J1(1, false);
        g4 g4Var2 = mVar2.M;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(mVar2, 22));
        mVar2.M.r1();
        g4 g4Var3 = mVar2.M;
        g4Var3.f29056r = null;
        if (mVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            mVar2.showDialog(g4Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.f10356r;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f10359x) {
            i iVar2 = mVar.f10356r;
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
            iVar2.f25393n.getImageReceiver().setDelegate(new ho(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, j6.f19214lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f25393n.n(ImageLocation.getForDocument(greetingsSticker), jo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f25393n.j(ImageLocation.getForDocument(greetingsSticker), jo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f25393n.setOnClickListener(new go(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.f10355n.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.f10355n.getParent()).getTop();
        int measuredHeight = mVar.f10355n.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f10356r.setScaleX(clamp);
        mVar.f10356r.setScaleY(clamp);
        mVar.f10356r.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.f10355n.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, l61 l61Var) {
        arrayList.add(x51.k(this.f10355n));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(x51.k(this.v));
        arrayList.add(x51.k(this.f10358w));
        if (this.f10359x) {
            arrayList.add(x51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.E != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.E;
            x51 x51Var = new x51(3);
            x51Var.d = 1;
            x51Var.f30248l = string;
            x51Var.G = str;
            arrayList.add(x51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f10360y;
            x51 x51Var2 = new x51(3);
            x51Var2.d = 1;
            x51Var2.f30248l = string2;
            x51Var2.G = document;
            arrayList.add(x51Var2);
        }
        arrayList.add(x51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.L = !g02;
        if (!g02) {
            arrayList.add(x51.B(null));
            x51 e = x51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f30254r = true;
            arrayList.add(e);
        }
        x51 x51Var3 = new x51(8);
        x51Var3.f30248l = null;
        arrayList.add(x51Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(x51 x51Var, View view) {
        View[] viewPages;
        int i10 = x51Var.d;
        if (i10 == 1) {
            t2 t2Var = new t2(getParentActivity(), getResourceProvider(), true, true);
            t2Var.f5555y = new ah.b(13, this, view);
            t2Var.E = new g(this, 0);
            for (View view2 : t2Var.f5549f.getViewPages()) {
                if (view2 instanceof ci.e2) {
                    ci.d2 d2Var = ((ci.e2) view2).f4589c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
            }
            showDialog(t2Var);
        } else if (i10 == 2) {
            this.v.setText("");
            this.f10358w.setText("");
            AndroidUtilities.hideKeyboard(this.v.f20455b);
            AndroidUtilities.hideKeyboard(this.f10358w.f20455b);
            this.f10359x = true;
            this.f10356r.d("", "");
            i iVar = this.f10356r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f10360y = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(x51 x51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f10356r = new jo(context, this.currentAccount, this.f10360y, getResourceProvider());
        j jVar = new j(this, context);
        this.f10355n = jVar;
        jVar.setWillNotDraw(false);
        this.f10357s = new v5(this.f10356r, this.f10355n, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f10356r.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(d7.e(null, this.currentAccount, getUserConfig().getClientUserId(), j6.I.q()));
        this.f10355n.addView(kVar, y5.e(-1, -1, 119));
        this.f10355n.addView(this.f10356r, y5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.v = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.v;
        int i10 = j6.f19062d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar3 = this.v;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        h3 h3Var = lVar3.f20455b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new s2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.f10358w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.f10358w.setBackgroundColor(getThemedColor(i10));
        this.f10358w.setDivider(true);
        l lVar5 = this.f10358w;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        h3 h3Var2 = lVar5.f20455b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.f10356r.d("", "");
        super.createView(context);
        this.f26891a.q1();
        n61 n61Var = this.f26891a;
        n61Var.Y2.f26042r = false;
        this.actionBar.setAdaptiveBackground(n61Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = j6.f19395v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f10354f = new pr(mutate, new tp(j6.w0(null, i11, false)));
        this.h = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10354f);
        e0(false);
        this.f26891a.addOnLayoutChangeListener(new u2(this, 1));
        this.f26891a.j(new ai.r(this, 9));
        n61 n61Var2 = this.f26891a;
        n61Var2.f28334a3 = true;
        n61Var2.setClipChildren(false);
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
            n61 n61Var = this.f26891a;
            if (n61Var != null && n61Var.Y2 != null && this.L != (!g0())) {
                n61 n61Var2 = this.f26891a;
                if (n61Var2 != null && n61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f26891a.getChildCount(); i12++) {
                        int S = RecyclerView.S(this.f26891a.getChildAt(i12));
                        View childAt = this.f26891a.getChildAt(i12);
                        if (S != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = S;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f26893c = i11;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f26893c == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.d = AndroidUtilities.dp(88.0f);
                        }
                        this.f26891a.X2.h1(i11, view.getTop() - this.f26891a.getPaddingTop());
                    }
                }
                this.f26891a.Y2.N(true);
                int i13 = this.f26893c;
                if (i13 >= 0) {
                    n61 n61Var3 = this.f26891a;
                    n61Var3.X2.h1(i13, this.d - n61Var3.getPaddingTop());
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
            String charSequence2 = this.f10358w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f10359x;
                if (!z10 && (document = this.f10360y) != null) {
                    j3 = document.f18302id;
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
        if (lVar != null && this.f10358w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f10358w.getText()) || !this.f10359x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        pr prVar = this.f10354f;
        if (prVar.f27307c > 0.0f) {
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
            updatebusinessintro.intro.description = this.f10358w.getText().toString();
            if (!this.f10359x && (this.f10360y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f10360y);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f10359x && (document = this.f10360y) != null) {
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
        l61 l61Var;
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
            l lVar2 = this.f10358w;
            String str2 = userFull.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.f10360y = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.v;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.f10358w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.f10360y = null;
        }
        TLRPC.Document document = this.f10360y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f18302id;
        }
        this.J = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10359x = z10;
        i iVar = this.f10356r;
        if (iVar != null) {
            iVar.d(this.v.getText().toString(), this.f10358w.getText().toString());
            i iVar2 = this.f10356r;
            TLRPC.Document document2 = this.f10360y;
            if (document2 == null || this.f10359x) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f10359x) {
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        n61 n61Var = this.f26891a;
        if (n61Var != null && (l61Var = n61Var.Y2) != null) {
            l61Var.N(true);
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
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f10306b;

                    {
                        this.f10306b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10306b.h0();
                                return;
                            default:
                                this.f10306b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f10306b;

                    {
                        this.f10306b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f10306b.h0();
                                return;
                            default:
                                this.f10306b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f18622a);
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
        this.f26891a.setPadding(0, 0, 0, i13);
        this.f26891a.setClipToPadding(false);
    }
}

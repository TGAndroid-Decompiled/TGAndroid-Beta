package gg;

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
import bi.b5;
import bi.cb;
import bi.e8;
import bi.f3;
import bi.p2;
import bi.q2;
import di.x2;
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
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.zp;
import org.telegram.ui.tt;
import w7.a6;
public final class n extends m61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public m L;
    public vr e;
    public org.telegram.ui.ActionBar.w0 f8955f;
    public j h;
    public i f8956n;
    public w5 f8957r;
    public l f8958s;
    public l v;
    public String f8961y;
    public final g d = new g(this, 1);
    public boolean f8959w = true;
    public TLRPC.Document f8960x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        tt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            m mVar = new m(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 0);
            nVar2.L = mVar;
            mVar.Z1 = new pb.c(nVar2, 21);
        }
        nVar2.L.f29378j0.f0();
        nVar2.L.J1(1, false);
        m mVar2 = nVar2.L;
        mVar2.U1 = true;
        mVar2.i1(new ai.c0(nVar2, 22));
        nVar2.L.r1();
        m mVar3 = nVar2.L;
        mVar3.f29401r = null;
        if (nVar2.visibleDialog != null) {
            mVar3.show();
        } else {
            nVar2.showDialog(mVar3);
        }
    }

    public static void Z(n nVar) {
        i iVar = nVar.f8956n;
        if (iVar != null && iVar.isAttachedToWindow() && nVar.f8959w) {
            i iVar2 = nVar.f8956n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(nVar.currentAccount).getGreetingsSticker();
            g gVar = new g(nVar, 2);
            if (greetingsSticker == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.f25852n.getImageReceiver().setDelegate(new mo(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, j6.f18079lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f25852n.n(ImageLocation.getForDocument(greetingsSticker), oo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f25852n.j(ImageLocation.getForDocument(greetingsSticker), oo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f25852n.setOnClickListener(new lo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f8956n.setScaleX(clamp);
        nVar.f8956n.setScaleY(clamp);
        nVar.f8956n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int c0(n nVar) {
        return nVar.classGuid;
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, j61 j61Var) {
        arrayList.add(v51.k(this.h));
        com.google.android.gms.internal.vision.e2.m(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(v51.k(this.f8958s));
        arrayList.add(v51.k(this.v));
        if (this.f8959w) {
            arrayList.add(v51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f8961y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f8961y;
            v51 v51Var = new v51(3);
            v51Var.d = 1;
            v51Var.f27829l = string;
            v51Var.G = str;
            arrayList.add(v51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f8960x;
            v51 v51Var2 = new v51(3);
            v51Var2.d = 1;
            v51Var2.f27829l = string2;
            v51Var2.G = document;
            arrayList.add(v51Var2);
        }
        arrayList.add(v51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(v51.B(null));
            v51 e = v51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f27835r = true;
            arrayList.add(e);
        }
        v51 v51Var3 = new v51(8);
        v51Var3.f27829l = null;
        arrayList.add(v51Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(v51 v51Var, View view) {
        View[] viewPages;
        int i10 = v51Var.d;
        if (i10 == 1) {
            f3 f3Var = new f3(getParentActivity(), getResourceProvider(), true, true);
            f3Var.f2699y = new cb(9, this, view);
            f3Var.E = new g(this, 0);
            for (View view2 : f3Var.f2693f.getViewPages()) {
                if (view2 instanceof q2) {
                    p2 p2Var = ((q2) view2).f3443c;
                    if (p2Var.H == null) {
                        p2Var.D(null);
                    }
                }
            }
            showDialog(f3Var);
        } else if (i10 == 2) {
            this.f8958s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f8958s.f19293b);
            AndroidUtilities.hideKeyboard(this.v.f19293b);
            this.f8959w = true;
            this.f8956n.d("", "");
            i iVar = this.f8956n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f8960x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(v51 v51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f8956n = new oo(context, this.currentAccount, this.f8960x, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        this.f8957r = new w5(this.f8956n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f8956n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(e8.e(null, this.currentAccount, getUserConfig().getClientUserId(), j6.I.q()));
        this.h.addView(kVar, a6.e(-1, -1, 119));
        this.h.addView(this.f8956n, a6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f8958s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f8958s;
        int i10 = j6.f17928d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.f8958s.setDivider(true);
        l lVar3 = this.f8958s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        g3 g3Var = lVar3.f19293b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new s2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar5 = this.v;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        g3 g3Var2 = lVar5.f19293b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.f8956n.d("", "");
        super.createView(context);
        this.f25171a.o1();
        l61 l61Var = this.f25171a;
        l61Var.Y2.f24250r = false;
        this.actionBar.setAdaptiveBackground(l61Var);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new vr(mutate, new zp(j6.w0(null, i11, false)));
        this.f8955f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f25171a.addOnLayoutChangeListener(new x2(this, 1));
        this.f25171a.j(new bi.a2(this, 7));
        l61 l61Var2 = this.f25171a;
        l61Var2.f26604a3 = true;
        l61Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new b5(this.fragmentView, false, new ai.b(this, 15));
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
        if (this.f8955f != null) {
            boolean f02 = f0();
            this.f8955f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f8955f.animate();
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
                org.telegram.ui.ActionBar.w0 w0Var = this.f8955f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                w0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f8955f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f8955f;
                if (f02) {
                    f13 = 1.0f;
                }
                w0Var3.setScaleY(f13);
            }
            l61 l61Var = this.f25171a;
            if (l61Var != null && l61Var.Y2 != null && this.K != (!g0())) {
                l61 l61Var2 = this.f25171a;
                if (l61Var2 != null && l61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f25171a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f25171a.getChildAt(i12));
                        View childAt = this.f25171a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f25172b = i11;
                        int top = view.getTop();
                        this.f25173c = top;
                        if (this.f25172b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f25173c = AndroidUtilities.dp(88.0f);
                        }
                        this.f25171a.X2.h1(i11, view.getTop() - this.f25171a.getPaddingTop());
                    }
                }
                this.f25171a.Y2.N(true);
                int i13 = this.f25172b;
                if (i13 >= 0) {
                    l61 l61Var3 = this.f25171a;
                    l61Var3.X2.h1(i13, this.f25173c - l61Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f8958s.getText().toString();
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
                boolean z10 = this.f8959w;
                if (!z10 && (document = this.f8960x) != null) {
                    j3 = document.f17201id;
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
        l lVar = this.f8958s;
        if (lVar != null && this.v != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f8959w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        vr vrVar = this.e;
        if (vrVar.f28591c > 0.0f) {
            return;
        }
        vrVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f8958s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f8959w && (this.f8960x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f8960x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f8959w && (document = this.f8960x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new bi.c2(this, 9));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j3;
        boolean z10;
        j61 j61Var;
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
            l lVar = this.f8958s;
            String str = tL_businessIntro.title;
            this.G = str;
            lVar.setText(str);
            l lVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            lVar2.setText(str2);
            this.f8960x = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.f8958s;
            this.G = "";
            lVar3.setText("");
            l lVar4 = this.v;
            this.H = "";
            lVar4.setText("");
            this.E = null;
            this.f8960x = null;
        }
        TLRPC.Document document = this.f8960x;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f17201id;
        }
        this.I = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8959w = z10;
        i iVar = this.f8956n;
        if (iVar != null) {
            iVar.d(this.f8958s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.f8956n;
            TLRPC.Document document2 = this.f8960x;
            if (document2 == null || this.f8959w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f8959w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        l61 l61Var = this.f25171a;
        if (l61Var != null && (j61Var = l61Var.Y2) != null) {
            j61Var.N(true);
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
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
                    public final n f8900b;

                    {
                        this.f8900b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f8900b.h0();
                                return;
                            default:
                                this.f8900b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.c2(this) {
                    public final n f8900b;

                    {
                        this.f8900b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f8900b.h0();
                                return;
                            default:
                                this.f8900b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f17528a);
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
        this.f25171a.setPadding(0, 0, 0, i13);
        this.f25171a.setClipToPadding(false);
    }
}

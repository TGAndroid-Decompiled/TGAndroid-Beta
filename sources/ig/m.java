package ig;

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
import bi.w3;
import bi.z7;
import di.a7;
import di.h4;
import di.r2;
import fi.u2;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.z61;
import org.telegram.ui.xt;
import w7.a6;
public final class m extends c71 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public w3 L;
    public ds e;
    public org.telegram.ui.ActionBar.u0 f11570f;
    public j h;
    public i f11571n;
    public t5 f11572r;
    public l f11573s;
    public l v;
    public String f11576y;
    public final g d = new g(this, 1);
    public boolean f11574w = true;
    public TLRPC.Document f11575x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(m mVar) {
        m mVar2;
        xt.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.L != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            w3 w3Var = new w3(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.L = w3Var;
            w3Var.f29993c2 = new ya.c(mVar2, 26);
        }
        mVar2.L.f30013j0.f0();
        mVar2.L.N1(1, false);
        w3 w3Var2 = mVar2.L;
        w3Var2.X1 = true;
        w3Var2.k1(new ci.u(mVar2, 22));
        mVar2.L.t1();
        w3 w3Var3 = mVar2.L;
        w3Var3.f30036r = null;
        if (mVar2.visibleDialog != null) {
            w3Var3.show();
        } else {
            mVar2.showDialog(w3Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.f11571n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f11574w) {
            i iVar2 = mVar.f11571n;
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
            iVar2.f30923n.getImageReceiver().setDelegate(new uo(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, g6.f20051lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f30923n.n(ImageLocation.getForDocument(greetingsSticker), wo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f30923n.j(ImageLocation.getForDocument(greetingsSticker), wo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f30923n.setOnClickListener(new to(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.h.getParent()).getTop();
        int measuredHeight = mVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f11571n.setScaleX(clamp);
        mVar.f11571n.setScaleY(clamp);
        mVar.f11571n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.h.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, z61 z61Var) {
        arrayList.add(l61.k(this.h));
        i2.d.o(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(l61.k(this.f11573s));
        arrayList.add(l61.k(this.v));
        if (this.f11574w) {
            arrayList.add(l61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f11576y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f11576y;
            l61 l61Var = new l61(3);
            l61Var.d = 1;
            l61Var.f26954l = string;
            l61Var.G = str;
            arrayList.add(l61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f11575x;
            l61 l61Var2 = new l61(3);
            l61Var2.d = 1;
            l61Var2.f26954l = string2;
            l61Var2.G = document;
            arrayList.add(l61Var2);
        }
        arrayList.add(l61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(l61.B(null));
            l61 e = l61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f26960r = true;
            arrayList.add(e);
        }
        l61 l61Var3 = new l61(8);
        l61Var3.f26954l = null;
        arrayList.add(l61Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        View[] viewPages;
        int i10 = l61Var.d;
        if (i10 == 1) {
            r2 r2Var = new r2(getParentActivity(), getResourceProvider(), true, true);
            r2Var.f7696y = new ah.h0(14, this, view);
            r2Var.E = new g(this, 0);
            for (View view2 : r2Var.f7690f.getViewPages()) {
                if (view2 instanceof di.d2) {
                    di.c2 c2Var = ((di.d2) view2).f6781c;
                    if (c2Var.H == null) {
                        c2Var.D(null);
                    }
                }
            }
            showDialog(r2Var);
        } else if (i10 == 2) {
            this.f11573s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f11573s.f21368b);
            AndroidUtilities.hideKeyboard(this.v.f21368b);
            this.f11574w = true;
            this.f11571n.d("", "");
            i iVar = this.f11571n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f11575x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f11571n = new wo(context, this.currentAccount, this.f11575x, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        this.f11572r = new t5(this.f11571n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f11571n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(a7.e(null, this.currentAccount, getUserConfig().getClientUserId(), g6.I.q()));
        this.h.addView(kVar, a6.e(-1, -1, 119));
        this.h.addView(this.f11571n, a6.a(-2.0f, 42.0f, 18.0f, 42.0f, 18.0f, -2, 17));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f11573s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f11573s;
        int i10 = g6.f19901d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.f11573s.setDivider(true);
        l lVar3 = this.f11573s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        h3 h3Var = lVar3.f21368b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new s2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar5 = this.v;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        h3 h3Var2 = lVar5.f21368b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.f11571n.d("", "");
        super.createView(context);
        this.f23964a.p1();
        b71 b71Var = this.f23964a;
        b71Var.W2.f31780r = false;
        this.actionBar.setAdaptiveBackground(b71Var);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = g6.f20235v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new ds(mutate, new gq(g6.x0(null, i11, false)));
        this.f11570f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f23964a.addOnLayoutChangeListener(new u2(this, 1));
        this.f23964a.j(new ah.d0(this, 9));
        b71 b71Var2 = this.f23964a;
        b71Var2.Y2 = true;
        b71Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new h4(this.fragmentView, false, new bi.o1(this, 22));
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
        if (this.f11570f != null) {
            boolean f02 = f0();
            this.f11570f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f11570f.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f11570f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f11570f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f11570f;
                if (f02) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            b71 b71Var = this.f23964a;
            if (b71Var != null && b71Var.W2 != null && this.K != (!g0())) {
                b71 b71Var2 = this.f23964a;
                if (b71Var2 != null && b71Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f23964a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f23964a.getChildAt(i12));
                        View childAt = this.f23964a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f23965b = i11;
                        int top = view.getTop();
                        this.f23966c = top;
                        if (this.f23965b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f23966c = AndroidUtilities.dp(88.0f);
                        }
                        this.f23964a.V2.h1(i11, view.getTop() - this.f23964a.getPaddingTop());
                    }
                }
                this.f23964a.W2.N(true);
                int i13 = this.f23965b;
                if (i13 >= 0) {
                    b71 b71Var3 = this.f23964a;
                    b71Var3.V2.h1(i13, this.f23966c - b71Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f11573s.getText().toString();
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
                boolean z10 = this.f11574w;
                if (!z10 && (document = this.f11575x) != null) {
                    j10 = document.f19222id;
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

    public final boolean g0() {
        l lVar = this.f11573s;
        if (lVar != null && this.v != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f11574w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        ds dsVar = this.e;
        if (dsVar.f24480c > 0.0f) {
            return;
        }
        dsVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f11573s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f11574w && (this.f11575x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f11575x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f11574w && (document = this.f11575x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new z7(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j10;
        boolean z10;
        z61 z61Var;
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
            l lVar = this.f11573s;
            String str = tL_businessIntro.title;
            this.G = str;
            lVar.setText(str);
            l lVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            lVar2.setText(str2);
            this.f11575x = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.f11573s;
            this.G = "";
            lVar3.setText("");
            l lVar4 = this.v;
            this.H = "";
            lVar4.setText("");
            this.E = null;
            this.f11575x = null;
        }
        TLRPC.Document document = this.f11575x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19222id;
        }
        this.I = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11574w = z10;
        i iVar = this.f11571n;
        if (iVar != null) {
            iVar.d(this.f11573s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.f11571n;
            TLRPC.Document document2 = this.f11575x;
            if (document2 == null || this.f11574w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f11574w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        b71 b71Var = this.f23964a;
        if (b71Var != null && (z61Var = b71Var.W2) != null) {
            z61Var.N(true);
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
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
                    public final m f11519b;

                    {
                        this.f11519b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11519b.h0();
                                return;
                            default:
                                this.f11519b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) {
                    public final m f11519b;

                    {
                        this.f11519b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11519b.h0();
                                return;
                            default:
                                this.f11519b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f19548a);
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
        this.f23964a.setPadding(0, 0, 0, i13);
        this.f23964a.setClipToPadding(false);
    }
}

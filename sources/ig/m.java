package ig;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
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
import ci.a3;
import ei.b4;
import ei.n2;
import ei.r6;
import gi.o2;
import java.util.ArrayList;
import m.t2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.yr;
import org.telegram.ui.ht;
import w7.z5;
public final class m extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public String G;
    public TLRPC.InputDocument H;
    public boolean I;
    public String J;
    public String K;
    public long L;
    public boolean M;
    public a3 O;
    public yr e;
    public Drawable f12991f;
    public int h;
    public cq f12992n;
    public org.telegram.ui.ActionBar.u0 f12993r;
    public j f12994s;
    public i v;
    public x5 f12995w;
    public l f12996x;
    public l f12997y;
    public final g d = new g(this, 1);
    public boolean E = true;
    public TLRPC.Document F = getMediaDataController().getGreetingsSticker();
    public boolean N = g0();

    public static void Y(m mVar) {
        m mVar2;
        ht.o().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.O != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            a3 a3Var = new a3(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.O = a3Var;
            a3Var.f30138c2 = new ya.c(mVar2, 24);
        }
        mVar2.O.f30158j0.f0();
        mVar2.O.R1(1, false);
        a3 a3Var2 = mVar2.O;
        a3Var2.X1 = true;
        a3Var2.n1(new hg.o(mVar2, 3));
        mVar2.O.w1();
        a3 a3Var3 = mVar2.O;
        a3Var3.f30181r = null;
        if (mVar2.visibleDialog != null) {
            a3Var3.show();
        } else {
            mVar2.showDialog(a3Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.v;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.E) {
            i iVar2 = mVar.v;
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
            iVar2.f30247n.getImageReceiver().setDelegate(new po(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, k6.f21334lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f30247n.n(ImageLocation.getForDocument(greetingsSticker), ro.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f30247n.j(ImageLocation.getForDocument(greetingsSticker), ro.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f30247n.setOnClickListener(new oo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.f12994s.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.f12994s.getParent()).getTop();
        int measuredHeight = mVar.f12994s.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.v.setScaleX(clamp);
        mVar.v.setScaleY(clamp);
        mVar.v.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.f12994s.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, a71 a71Var) {
        arrayList.add(l61.k(this.f12994s));
        i2.o1.q(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(l61.k(this.f12996x));
        arrayList.add(l61.k(this.f12997y));
        if (this.E) {
            arrayList.add(l61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.G != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.G;
            l61 l61Var = new l61(3);
            l61Var.d = 1;
            l61Var.f28227l = string;
            l61Var.G = str;
            arrayList.add(l61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.F;
            l61 l61Var2 = new l61(3);
            l61Var2.d = 1;
            l61Var2.f28227l = string2;
            l61Var2.G = document;
            arrayList.add(l61Var2);
        }
        arrayList.add(l61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.N = !g02;
        if (!g02) {
            arrayList.add(l61.B(null));
            l61 e = l61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f28233r = true;
            arrayList.add(e);
        }
        l61 l61Var3 = new l61(8);
        l61Var3.f28227l = null;
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
            n2 n2Var = new n2(getParentActivity(), getResourceProvider(), true, true);
            n2Var.E = new ah.h0(16, this, view);
            n2Var.F = new g(this, 0);
            for (View view2 : n2Var.f9512f.getViewPages()) {
                if (view2 instanceof ei.b2) {
                    ei.a2 a2Var = ((ei.b2) view2).f8779c;
                    if (a2Var.H == null) {
                        a2Var.D(null);
                    }
                }
            }
            showDialog(n2Var);
        } else if (i10 == 2) {
            this.f12996x.setText("");
            this.f12997y.setText("");
            AndroidUtilities.hideKeyboard(this.f12996x.d);
            AndroidUtilities.hideKeyboard(this.f12997y.d);
            this.E = true;
            this.v.d("", "");
            i iVar = this.v;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.F = greetingsSticker;
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
        this.v = new ro(context, this.currentAccount, this.F, getResourceProvider());
        j jVar = new j(this, context);
        this.f12994s = jVar;
        jVar.setWillNotDraw(false);
        int dp = AndroidUtilities.dp(16.0f);
        i iVar = this.v;
        j jVar2 = this.f12994s;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i10 = k6.f21119a;
        this.f12995w = new x5(iVar, jVar2, dp, themedPaint);
        this.v.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(r6.e(null, this.currentAccount, getUserConfig().getClientUserId(), k6.I.q()));
        this.f12994s.addView(kVar, z5.e(-1, -1, 119));
        this.f12994s.addView(this.v, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f12996x = lVar;
        lVar.f22456r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f12996x;
        int i11 = k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i11, lVar2, getResourceProvider());
        this.f12996x.setDivider(true);
        l lVar3 = this.f12996x;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        f3 f3Var = lVar3.d;
        f3Var.setImeOptions(6);
        f3Var.setOnEditorActionListener(new t2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.f12997y = lVar4;
        lVar4.setShowLimitOnFocus(true);
        org.telegram.ui.ActionBar.r6.i(i11, this.f12997y, getResourceProvider());
        this.f12997y.setDivider(true);
        l lVar5 = this.f12997y;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        f3 f3Var2 = lVar5.d;
        f3Var2.setImeOptions(6);
        f3Var2.setOnEditorActionListener(new t2(gVar2, 2));
        this.v.d("", "");
        super.createView(context);
        this.f25615a.t1();
        c71 c71Var = this.f25615a;
        c71Var.Z2.f24646r = false;
        this.actionBar.setAdaptiveBackground(c71Var);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = k6.f21519v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f12991f = mutate;
        this.h = k6.x0(null, i12, false);
        this.f12992n = new cq(k6.x0(null, i12, false));
        this.e = new yr(mutate, this.f12992n);
        this.f12993r = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f25615a.addOnLayoutChangeListener(new o2(this, 1));
        this.f25615a.j(new ah.d0(this, 13));
        c71 c71Var2 = this.f25615a;
        c71Var2.f27320b3 = true;
        c71Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new b4(this.fragmentView, false, new ai.r0(this, 28));
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
        if (this.f12993r != null) {
            boolean f02 = f0();
            this.f12993r.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f12993r.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f12993r;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f12993r;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f12993r;
                if (f02) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            c71 c71Var = this.f25615a;
            if (c71Var != null && c71Var.Z2 != null && this.N != (!g0())) {
                c71 c71Var2 = this.f25615a;
                if (c71Var2 != null && c71Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f25615a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f25615a.getChildAt(i12));
                        View childAt = this.f25615a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f25616b = i11;
                        int top = view.getTop();
                        this.f25617c = top;
                        if (this.f25616b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f25617c = AndroidUtilities.dp(88.0f);
                        }
                        this.f25615a.Y2.h1(i11, view.getTop() - this.f25615a.getPaddingTop());
                    }
                }
                this.f25615a.Z2.N(true);
                int i13 = this.f25616b;
                if (i13 >= 0) {
                    c71 c71Var3 = this.f25615a;
                    c71Var3.Y2.h1(i13, this.f25617c - c71Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f12996x.getText().toString();
        String str = this.J;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.f12997y.getText().toString();
            String str3 = this.K;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.E;
                if (!z10 && (document = this.F) != null) {
                    j10 = document.f20350id;
                } else {
                    j10 = 0;
                }
                if (j10 == this.L) {
                    if (z10 || this.H == null) {
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
        l lVar = this.f12996x;
        if (lVar != null && this.f12997y != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f12997y.getText()) || !this.E) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        yr yrVar = this.e;
        if (yrVar.f33027c > 0.0f) {
            return;
        }
        yrVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f12996x.getText().toString();
            updatebusinessintro.intro.description = this.f12997y.getText().toString();
            if (!this.E && (this.F != null || this.H != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.H;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.F);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.E && (document = this.F) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ai.h(this, 18));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j10;
        boolean z10;
        a71 a71Var;
        if (this.M) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.f12996x;
            String str = tL_businessIntro.title;
            this.J = str;
            lVar.setText(str);
            l lVar2 = this.f12997y;
            String str2 = userFull.business_intro.description;
            this.K = str2;
            lVar2.setText(str2);
            this.F = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.f12996x;
            this.J = "";
            lVar3.setText("");
            l lVar4 = this.f12997y;
            this.K = "";
            lVar4.setText("");
            this.H = null;
            this.F = null;
        }
        TLRPC.Document document = this.F;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20350id;
        }
        this.L = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        i iVar = this.v;
        if (iVar != null) {
            iVar.d(this.f12996x.getText().toString(), this.f12997y.getText().toString());
            i iVar2 = this.v;
            TLRPC.Document document2 = this.F;
            if (document2 == null || this.E) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.E) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        c71 c71Var = this.f25615a;
        if (c71Var != null && (a71Var = c71Var.Z2) != null) {
            a71Var.N(true);
        }
        this.M = true;
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
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
                    public final m f12940b;

                    {
                        this.f12940b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12940b.h0();
                                return;
                            default:
                                this.f12940b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) {
                    public final m f12940b;

                    {
                        this.f12940b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12940b.h0();
                                return;
                            default:
                                this.f12940b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20679a);
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
        this.f25615a.setPadding(0, 0, 0, i13);
        this.f25615a.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int x02 = k6.x0(null, k6.f21519v8, false);
            Drawable drawable = this.f12991f;
            if (drawable != null && x02 != this.h) {
                this.h = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            cq cqVar = this.f12992n;
            if (cqVar != null) {
                cqVar.b(x02);
            }
            yr yrVar = this.e;
            if (yrVar != null) {
                yrVar.invalidateSelf();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

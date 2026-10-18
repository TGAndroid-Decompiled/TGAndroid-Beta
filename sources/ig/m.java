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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.gt;
import w7.z5;
public final class m extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public a3 L;
    public as e;
    public org.telegram.ui.ActionBar.u0 f12956f;
    public j h;
    public i f12957n;
    public u5 f12958r;
    public l f12959s;
    public l v;
    public String f12962y;
    public final g d = new g(this, 1);
    public boolean f12960w = true;
    public TLRPC.Document f12961x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(m mVar) {
        m mVar2;
        gt.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.L != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            a3 a3Var = new a3(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.L = a3Var;
            a3Var.f30566c2 = new ya.d(mVar2, 24);
        }
        mVar2.L.f30586j0.f0();
        mVar2.L.N1(1, false);
        a3 a3Var2 = mVar2.L;
        a3Var2.X1 = true;
        a3Var2.k1(new hg.o(mVar2, 3));
        mVar2.L.t1();
        a3 a3Var3 = mVar2.L;
        a3Var3.f30609r = null;
        if (mVar2.visibleDialog != null) {
            a3Var3.show();
        } else {
            mVar2.showDialog(a3Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.f12957n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f12960w) {
            i iVar2 = mVar.f12957n;
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
            iVar2.f30682n.getImageReceiver().setDelegate(new ro(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, h6.f21136lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f30682n.n(ImageLocation.getForDocument(greetingsSticker), to.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f30682n.j(ImageLocation.getForDocument(greetingsSticker), to.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f30682n.setOnClickListener(new qo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.h.getParent()).getTop();
        int measuredHeight = mVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f12957n.setScaleX(clamp);
        mVar.f12957n.setScaleY(clamp);
        mVar.f12957n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.h.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, s61 s61Var) {
        arrayList.add(f61.k(this.h));
        i2.d.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(f61.k(this.f12959s));
        arrayList.add(f61.k(this.v));
        if (this.f12960w) {
            arrayList.add(f61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f12962y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f12962y;
            f61 f61Var = new f61(3);
            f61Var.d = 1;
            f61Var.f26140l = string;
            f61Var.G = str;
            arrayList.add(f61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f12961x;
            f61 f61Var2 = new f61(3);
            f61Var2.d = 1;
            f61Var2.f26140l = string2;
            f61Var2.G = document;
            arrayList.add(f61Var2);
        }
        arrayList.add(f61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(f61.B(null));
            f61 e = f61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f26146r = true;
            arrayList.add(e);
        }
        f61 f61Var3 = new f61(8);
        f61Var3.f26140l = null;
        arrayList.add(f61Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(f61 f61Var, View view) {
        View[] viewPages;
        int i10 = f61Var.d;
        if (i10 == 1) {
            n2 n2Var = new n2(getParentActivity(), getResourceProvider(), true, true);
            n2Var.f9508y = new ah.h0(16, this, view);
            n2Var.E = new g(this, 0);
            for (View view2 : n2Var.f9502f.getViewPages()) {
                if (view2 instanceof ei.b2) {
                    ei.a2 a2Var = ((ei.b2) view2).f8771c;
                    if (a2Var.H == null) {
                        a2Var.D(null);
                    }
                }
            }
            showDialog(n2Var);
        } else if (i10 == 2) {
            this.f12959s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f12959s.f22398b);
            AndroidUtilities.hideKeyboard(this.v.f22398b);
            this.f12960w = true;
            this.f12957n.d("", "");
            i iVar = this.f12957n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f12961x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(f61 f61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f12957n = new to(context, this.currentAccount, this.f12961x, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        this.f12958r = new u5(this.f12957n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f12957n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(r6.e(null, this.currentAccount, getUserConfig().getClientUserId(), h6.I.q()));
        this.h.addView(kVar, z5.e(-1, -1, 119));
        this.h.addView(this.f12957n, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f12959s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f12959s;
        int i10 = h6.f20986d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.f12959s.setDivider(true);
        l lVar3 = this.f12959s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        g3 g3Var = lVar3.f22398b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new t2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar5 = this.v;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        g3 g3Var2 = lVar5.f22398b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new t2(gVar2, 2));
        this.f12957n.d("", "");
        super.createView(context);
        this.f31190a.p1();
        u61 u61Var = this.f31190a;
        u61Var.W2.f30201r = false;
        this.actionBar.setAdaptiveBackground(u61Var);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = h6.f21321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new as(mutate, new dq(h6.x0(null, i11, false)));
        this.f12956f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f31190a.addOnLayoutChangeListener(new o2(this, 1));
        this.f31190a.j(new ah.d0(this, 13));
        u61 u61Var2 = this.f31190a;
        u61Var2.Y2 = true;
        u61Var2.setClipChildren(false);
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
        if (this.f12956f != null) {
            boolean f02 = f0();
            this.f12956f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f12956f.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f12956f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f12956f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f12956f;
                if (f02) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            u61 u61Var = this.f31190a;
            if (u61Var != null && u61Var.W2 != null && this.K != (!g0())) {
                u61 u61Var2 = this.f31190a;
                if (u61Var2 != null && u61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f31190a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f31190a.getChildAt(i12));
                        View childAt = this.f31190a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f31191b = i11;
                        int top = view.getTop();
                        this.f31192c = top;
                        if (this.f31191b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f31192c = AndroidUtilities.dp(88.0f);
                        }
                        this.f31190a.V2.h1(i11, view.getTop() - this.f31190a.getPaddingTop());
                    }
                }
                this.f31190a.W2.N(true);
                int i13 = this.f31191b;
                if (i13 >= 0) {
                    u61 u61Var3 = this.f31190a;
                    u61Var3.V2.h1(i13, this.f31192c - u61Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f12959s.getText().toString();
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
                boolean z10 = this.f12960w;
                if (!z10 && (document = this.f12961x) != null) {
                    j10 = document.f20278id;
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
        l lVar = this.f12959s;
        if (lVar != null && this.v != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f12960w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        as asVar = this.e;
        if (asVar.f24703c > 0.0f) {
            return;
        }
        asVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f12959s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f12960w && (this.f12961x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f12961x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f12960w && (document = this.f12961x) != null) {
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
        s61 s61Var;
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
            l lVar = this.f12959s;
            String str = tL_businessIntro.title;
            this.G = str;
            lVar.setText(str);
            l lVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            lVar2.setText(str2);
            this.f12961x = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.f12959s;
            this.G = "";
            lVar3.setText("");
            l lVar4 = this.v;
            this.H = "";
            lVar4.setText("");
            this.E = null;
            this.f12961x = null;
        }
        TLRPC.Document document = this.f12961x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20278id;
        }
        this.I = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12960w = z10;
        i iVar = this.f12957n;
        if (iVar != null) {
            iVar.d(this.f12959s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.f12957n;
            TLRPC.Document document2 = this.f12961x;
            if (document2 == null || this.f12960w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f12960w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        u61 u61Var = this.f31190a;
        if (u61Var != null && (s61Var = u61Var.W2) != null) {
            s61Var.N(true);
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
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f12908b;

                    {
                        this.f12908b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12908b.h0();
                                return;
                            default:
                                this.f12908b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f12908b;

                    {
                        this.f12908b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12908b.h0();
                                return;
                            default:
                                this.f12908b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20601a);
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
        this.f31190a.setPadding(0, 0, 0, i13);
        this.f31190a.setClipToPadding(false);
    }
}

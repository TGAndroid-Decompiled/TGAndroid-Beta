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
import bi.t3;
import bi.v7;
import di.d7;
import di.j4;
import di.t2;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.st;
import w7.x5;
public final class m extends y51 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public t3 L;
    public or f12142e;
    public org.telegram.ui.ActionBar.v0 f12143f;
    public j h;
    public i f12144n;
    public v5 f12145r;
    public l f12146s;
    public l v;
    public String f12149y;
    public final g d = new g(this, 1);
    public boolean f12147w = true;
    public TLRPC.Document f12148x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(m mVar) {
        m mVar2;
        st.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.L != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            t3 t3Var = new t3(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.L = t3Var;
            t3Var.Z1 = new a4.m(mVar2, 26);
        }
        mVar2.L.f31291j0.f0();
        mVar2.L.J1(1, false);
        t3 t3Var2 = mVar2.L;
        t3Var2.U1 = true;
        t3Var2.i1(new ci.u(mVar2, 22));
        mVar2.L.r1();
        t3 t3Var3 = mVar2.L;
        t3Var3.f31314r = null;
        if (mVar2.visibleDialog != null) {
            t3Var3.show();
        } else {
            mVar2.showDialog(t3Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.f12144n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f12147w) {
            i iVar2 = mVar.f12144n;
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
            iVar2.f27202n.getImageReceiver().setDelegate(new go(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, j6.f20815lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f27202n.n(ImageLocation.getForDocument(greetingsSticker), io.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f27202n.j(ImageLocation.getForDocument(greetingsSticker), io.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f27202n.setOnClickListener(new fo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.h.getParent()).getTop();
        int measuredHeight = mVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f12144n.setScaleX(clamp);
        mVar.f12144n.setScaleY(clamp);
        mVar.f12144n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.h.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, v51 v51Var) {
        arrayList.add(h51.k(this.h));
        i2.g.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(h51.k(this.f12146s));
        arrayList.add(h51.k(this.v));
        if (this.f12147w) {
            arrayList.add(h51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f12149y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f12149y;
            h51 h51Var = new h51(3);
            h51Var.d = 1;
            h51Var.f26594l = string;
            h51Var.G = str;
            arrayList.add(h51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f12148x;
            h51 h51Var2 = new h51(3);
            h51Var2.d = 1;
            h51Var2.f26594l = string2;
            h51Var2.G = document;
            arrayList.add(h51Var2);
        }
        arrayList.add(h51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(h51.B(null));
            h51 e7 = h51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e7.f26600r = true;
            arrayList.add(e7);
        }
        h51 h51Var3 = new h51(8);
        h51Var3.f26594l = null;
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
            t2 t2Var = new t2(getParentActivity(), getResourceProvider(), true, true);
            t2Var.f8176y = new ah.i0(14, this, view);
            t2Var.E = new g(this, 0);
            for (View view2 : t2Var.f8170f.getViewPages()) {
                if (view2 instanceof di.e2) {
                    di.d2 d2Var = ((di.e2) view2).f7155c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
            }
            showDialog(t2Var);
        } else if (i10 == 2) {
            this.f12146s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f12146s.f22074b);
            AndroidUtilities.hideKeyboard(this.v.f22074b);
            this.f12147w = true;
            this.f12144n.d("", "");
            i iVar = this.f12144n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f12148x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
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
        this.f12144n = new io(context, this.currentAccount, this.f12148x, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        this.f12145r = new v5(this.f12144n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f12144n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(d7.e(null, this.currentAccount, getUserConfig().getClientUserId(), j6.I.q()));
        this.h.addView(kVar, x5.e(-1, -1, 119));
        this.h.addView(this.f12144n, x5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f12146s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f12146s;
        int i10 = j6.f20663d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.f12146s.setDivider(true);
        l lVar3 = this.f12146s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        g3 g3Var = lVar3.f22074b;
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
        g3 g3Var2 = lVar5.f22074b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.f12144n.d("", "");
        super.createView(context);
        this.f32849a.o1();
        x51 x51Var = this.f32849a;
        x51Var.Y2.f31135r = false;
        this.actionBar.setAdaptiveBackground(x51Var);
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = j6.f20992v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f12142e = new or(mutate, new sp(j6.w0(null, i11, false)));
        this.f12143f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12142e);
        e0(false);
        this.f32849a.addOnLayoutChangeListener(new u2(this, 1));
        this.f32849a.j(new ah.e0(this, 10));
        x51 x51Var2 = this.f32849a;
        x51Var2.f25279a3 = true;
        x51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new j4(this.fragmentView, false, new bi.o1(this, 19));
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
        if (this.f12143f != null) {
            boolean f02 = f0();
            this.f12143f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f12143f.animate();
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
                org.telegram.ui.ActionBar.v0 v0Var = this.f12143f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.v0 v0Var2 = this.f12143f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.v0 v0Var3 = this.f12143f;
                if (f02) {
                    f13 = 1.0f;
                }
                v0Var3.setScaleY(f13);
            }
            x51 x51Var = this.f32849a;
            if (x51Var != null && x51Var.Y2 != null && this.K != (!g0())) {
                x51 x51Var2 = this.f32849a;
                if (x51Var2 != null && x51Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f32849a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f32849a.getChildAt(i12));
                        View childAt = this.f32849a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f32850b = i11;
                        int top = view.getTop();
                        this.f32851c = top;
                        if (this.f32850b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f32851c = AndroidUtilities.dp(88.0f);
                        }
                        this.f32849a.X2.h1(i11, view.getTop() - this.f32849a.getPaddingTop());
                    }
                }
                this.f32849a.Y2.N(true);
                int i13 = this.f32850b;
                if (i13 >= 0) {
                    x51 x51Var3 = this.f32849a;
                    x51Var3.X2.h1(i13, this.f32851c - x51Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f12146s.getText().toString();
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
                boolean z10 = this.f12147w;
                if (!z10 && (document = this.f12148x) != null) {
                    j3 = document.f19875id;
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
        l lVar = this.f12146s;
        if (lVar != null && this.v != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f12147w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        or orVar = this.f12142e;
        if (orVar.f29171c > 0.0f) {
            return;
        }
        orVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f12146s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f12147w && (this.f12148x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f12148x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f12147w && (document = this.f12148x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new v7(this, 12));
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
            l lVar = this.f12146s;
            String str = tL_businessIntro.title;
            this.G = str;
            lVar.setText(str);
            l lVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            lVar2.setText(str2);
            this.f12148x = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.f12146s;
            this.G = "";
            lVar3.setText("");
            l lVar4 = this.v;
            this.H = "";
            lVar4.setText("");
            this.E = null;
            this.f12148x = null;
        }
        TLRPC.Document document = this.f12148x;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f19875id;
        }
        this.I = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12147w = z10;
        i iVar = this.f12144n;
        if (iVar != null) {
            iVar.d(this.f12146s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.f12144n;
            TLRPC.Document document2 = this.f12148x;
            if (document2 == null || this.f12147w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f12147w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        x51 x51Var = this.f32849a;
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
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f12087b;

                    {
                        this.f12087b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12087b.h0();
                                return;
                            default:
                                this.f12087b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f12087b;

                    {
                        this.f12087b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12087b.h0();
                                return;
                            default:
                                this.f12087b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20198a);
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
        this.f32849a.setPadding(0, 0, 0, i13);
        this.f32849a.setClipToPadding(false);
    }
}

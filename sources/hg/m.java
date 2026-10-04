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
import ei.v2;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x61;
import org.telegram.ui.rt;
import w7.z5;
public final class m extends x61 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public g4 M;
    public sr f11263f;
    public org.telegram.ui.ActionBar.v0 h;
    public j f11264n;
    public i f11265r;
    public u5 f11266s;
    public l v;
    public l f11267w;
    public final g f11262e = new g(this, 1);
    public boolean f11268x = true;
    public TLRPC.Document f11269y = getMediaDataController().getGreetingsSticker();
    public boolean L = g0();

    public static void X(m mVar) {
        m mVar2;
        rt.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.M != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            g4 g4Var = new g4(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.M = g4Var;
            g4Var.Z1 = new a6.m(mVar2, 22);
        }
        mVar2.M.f32825j0.f0();
        mVar2.M.G1(1, false);
        g4 g4Var2 = mVar2.M;
        g4Var2.U1 = true;
        g4Var2.g1(new bi.v(mVar2, 22));
        mVar2.M.o1();
        g4 g4Var3 = mVar2.M;
        g4Var3.f32848r = null;
        if (mVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            mVar2.showDialog(g4Var3);
        }
    }

    public static void Y(m mVar) {
        i iVar = mVar.f11265r;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f11268x) {
            i iVar2 = mVar.f11265r;
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
            iVar2.f28667n.getImageReceiver().setDelegate(new ko(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, i6.f20971lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f28667n.n(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f28667n.j(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f28667n.setOnClickListener(new jo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.f11264n.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.f11264n.getParent()).getTop();
        int measuredHeight = mVar.f11264n.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f11265r.setScaleX(clamp);
        mVar.f11265r.setScaleY(clamp);
        mVar.f11265r.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.f11264n.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void S(ArrayList arrayList, u61 u61Var) {
        arrayList.add(g61.k(this.f11264n));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(g61.k(this.v));
        arrayList.add(g61.k(this.f11267w));
        if (this.f11268x) {
            arrayList.add(g61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.E != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.E;
            g61 g61Var = new g61(3);
            g61Var.d = 1;
            g61Var.f26669l = string;
            g61Var.G = str;
            arrayList.add(g61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f11269y;
            g61 g61Var2 = new g61(3);
            g61Var2.d = 1;
            g61Var2.f26669l = string2;
            g61Var2.G = document;
            arrayList.add(g61Var2);
        }
        arrayList.add(g61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.L = !g02;
        if (!g02) {
            arrayList.add(g61.B(null));
            g61 e7 = g61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e7.f26675r = true;
            arrayList.add(e7);
        }
        g61 g61Var3 = new g61(8);
        g61Var3.f26669l = null;
        arrayList.add(g61Var3);
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void U(g61 g61Var, View view) {
        View[] viewPages;
        int i10 = g61Var.d;
        if (i10 == 1) {
            s2 s2Var = new s2(getParentActivity(), getResourceProvider(), true, true);
            s2Var.f5899y = new ah.b(13, this, view);
            s2Var.E = new g(this, 0);
            for (View view2 : s2Var.f5893f.getViewPages()) {
                if (view2 instanceof ci.e2) {
                    ci.d2 d2Var = ((ci.e2) view2).f4974c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
            }
            showDialog(s2Var);
        } else if (i10 == 2) {
            this.v.setText("");
            this.f11267w.setText("");
            AndroidUtilities.hideKeyboard(this.v.f22307b);
            AndroidUtilities.hideKeyboard(this.f11267w.f22307b);
            this.f11268x = true;
            this.f11265r.d("", "");
            i iVar = this.f11265r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f11269y = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.f11262e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean W(g61 g61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f11265r = new mo(context, this.currentAccount, this.f11269y, getResourceProvider());
        j jVar = new j(this, context);
        this.f11264n = jVar;
        jVar.setWillNotDraw(false);
        this.f11266s = new u5(this.f11265r, this.f11264n, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f11265r.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), i6.I.q()));
        this.f11264n.addView(kVar, z5.e(-1, -1, 119));
        this.f11264n.addView(this.f11265r, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.v = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.v;
        int i10 = i6.f20818d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar3 = this.v;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        h3 h3Var = lVar3.f22307b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.f11267w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.f11267w.setBackgroundColor(getThemedColor(i10));
        this.f11267w.setDivider(true);
        l lVar5 = this.f11267w;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        h3 h3Var2 = lVar5.f22307b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        this.f11265r.d("", "");
        super.createView(context);
        this.f32725a.s1();
        w61 w61Var = this.f32725a;
        w61Var.f25245f3.f31307r = false;
        this.actionBar.setAdaptiveBackground(w61Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = i6.f21155v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f11263f = new sr(mutate, new wp(i6.w0(null, i11, false)));
        this.h = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11263f);
        e0(false);
        this.f32725a.addOnLayoutChangeListener(new v2(this, 1));
        this.f32725a.j(new ai.r(this, 9));
        w61 w61Var2 = this.f32725a;
        w61Var2.f25247h3 = true;
        w61Var2.setClipChildren(false);
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
            w61 w61Var = this.f32725a;
            if (w61Var != null && w61Var.f25245f3 != null && this.L != (!g0())) {
                w61 w61Var2 = this.f32725a;
                if (w61Var2 != null && w61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f32725a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f32725a.getChildAt(i12));
                        View childAt = this.f32725a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f32727c = i11;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f32727c == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.d = AndroidUtilities.dp(88.0f);
                        }
                        this.f32725a.f25244e3.h1(i11, view.getTop() - this.f32725a.getPaddingTop());
                    }
                }
                this.f32725a.f25245f3.N(true);
                int i13 = this.f32727c;
                if (i13 >= 0) {
                    w61 w61Var3 = this.f32725a;
                    w61Var3.f25244e3.h1(i13, this.d - w61Var3.getPaddingTop());
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
            String charSequence2 = this.f11267w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f11268x;
                if (!z10 && (document = this.f11269y) != null) {
                    j3 = document.f20044id;
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
        if (lVar != null && this.f11267w != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.f11267w.getText()) || !this.f11268x) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        sr srVar = this.f11263f;
        if (srVar.f30864c > 0.0f) {
            return;
        }
        srVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.v.getText().toString();
            updatebusinessintro.intro.description = this.f11267w.getText().toString();
            if (!this.f11268x && (this.f11269y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f11269y);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f11268x && (document = this.f11269y) != null) {
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
        u61 u61Var;
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
            l lVar2 = this.f11267w;
            String str2 = userFull.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.f11269y = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.v;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.f11267w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.f11269y = null;
        }
        TLRPC.Document document = this.f11269y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20044id;
        }
        this.J = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11268x = z10;
        i iVar = this.f11265r;
        if (iVar != null) {
            iVar.d(this.v.getText().toString(), this.f11267w.getText().toString());
            i iVar2 = this.f11265r;
            TLRPC.Document document2 = this.f11269y;
            if (document2 == null || this.f11268x) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f11268x) {
            g gVar = this.f11262e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        w61 w61Var = this.f32725a;
        if (w61Var != null && (u61Var = w61Var.f25245f3) != null) {
            u61Var.N(true);
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
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f11210b;

                    {
                        this.f11210b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11210b.h0();
                                return;
                            default:
                                this.f11210b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f11210b;

                    {
                        this.f11210b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11210b.h0();
                                return;
                            default:
                                this.f11210b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20368a);
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
        this.f32725a.setPadding(0, 0, 0, i13);
        this.f32725a.setClipToPadding(false);
    }
}

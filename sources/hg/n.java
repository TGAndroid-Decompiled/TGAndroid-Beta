package hg;

import ai.h4;
import ai.o8;
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
import ci.r2;
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
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xo;
import org.telegram.ui.Components.zo;
import org.telegram.ui.rt;
import w7.x5;
public final class n extends f71 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public h4 L;
    public gs f11319e;
    public org.telegram.ui.ActionBar.v0 f11320f;
    public k h;
    public j f11321n;
    public v5 f11322r;
    public m f11323s;
    public m v;
    public String f11326y;
    public final h d = new h(this, 1);
    public boolean f11324w = true;
    public TLRPC.Document f11325x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        rt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            h4 h4Var = new h4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = h4Var;
            h4Var.f33219c2 = new a6.i(nVar2, 24);
        }
        nVar2.L.f33240j0.f0();
        nVar2.L.N1(1, false);
        h4 h4Var2 = nVar2.L;
        h4Var2.X1 = true;
        h4Var2.k1(new bi.v(nVar2, 22));
        nVar2.L.t1();
        h4 h4Var3 = nVar2.L;
        h4Var3.f33263r = null;
        if (nVar2.visibleDialog != null) {
            h4Var3.show();
        } else {
            nVar2.showDialog(h4Var3);
        }
    }

    public static void Z(n nVar) {
        j jVar = nVar.f11321n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.f11324w) {
            j jVar2 = nVar.f11321n;
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
            jVar2.f33610n.getImageReceiver().setDelegate(new xo(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, i6.f20949lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f33610n.n(ImageLocation.getForDocument(greetingsSticker), zo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f33610n.j(ImageLocation.getForDocument(greetingsSticker), zo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f33610n.setOnClickListener(new wo(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (!(nVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.h.getParent()).getTop();
        int measuredHeight = nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f11321n.setScaleX(clamp);
        nVar.f11321n.setScaleY(clamp);
        nVar.f11321n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.h.invalidate();
    }

    public static int c0(n nVar) {
        return nVar.classGuid;
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, c71 c71Var) {
        arrayList.add(p61.k(this.h));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(p61.k(this.f11323s));
        arrayList.add(p61.k(this.v));
        if (this.f11324w) {
            arrayList.add(p61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f11326y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f11326y;
            p61 p61Var = new p61(3);
            p61Var.d = 1;
            p61Var.f29734l = string;
            p61Var.G = str;
            arrayList.add(p61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f11325x;
            p61 p61Var2 = new p61(3);
            p61Var2.d = 1;
            p61Var2.f29734l = string2;
            p61Var2.G = document;
            arrayList.add(p61Var2);
        }
        arrayList.add(p61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(p61.B(null));
            p61 e7 = p61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e7.f29740r = true;
            arrayList.add(e7);
        }
        p61 p61Var3 = new p61(8);
        p61Var3.f29734l = null;
        arrayList.add(p61Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(p61 p61Var, View view) {
        View[] viewPages;
        int i10 = p61Var.d;
        if (i10 == 1) {
            r2 r2Var = new r2(getParentActivity(), getResourceProvider(), true, true);
            r2Var.f5891y = new ah.b(13, this, view);
            r2Var.E = new h(this, 0);
            for (View view2 : r2Var.f5885f.getViewPages()) {
                if (view2 instanceof ci.d2) {
                    ci.c2 c2Var = ((ci.d2) view2).f4896c;
                    if (c2Var.H == null) {
                        c2Var.D(null);
                    }
                }
            }
            showDialog(r2Var);
        } else if (i10 == 2) {
            this.f11323s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f11323s.f22297b);
            AndroidUtilities.hideKeyboard(this.v.f22297b);
            this.f11324w = true;
            this.f11321n.d("", "");
            j jVar = this.f11321n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f11325x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(p61 p61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f11321n = new zo(context, this.currentAccount, this.f11325x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        this.f11322r = new v5(this.f11321n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f11321n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), i6.I.q()));
        this.h.addView(lVar, x5.e(-1, -1, 119));
        this.h.addView(this.f11321n, x5.a(-2.0f, 42.0f, 18.0f, 42.0f, 18.0f, -2, 17));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f11323s = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.f11323s;
        int i10 = i6.f20797d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.f11323s.setDivider(true);
        m mVar3 = this.f11323s;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        h3 h3Var = mVar3.f22297b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new s2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        h3 h3Var2 = mVar5.f22297b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.f11321n.d("", "");
        super.createView(context);
        this.f26290a.p1();
        e71 e71Var = this.f26290a;
        e71Var.W2.f25280r = false;
        this.actionBar.setAdaptiveBackground(e71Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = i6.f21130v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f11319e = new gs(mutate, new jq(i6.x0(null, i11, false)));
        this.f11320f = this.actionBar.o().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11319e);
        e0(false);
        this.f26290a.addOnLayoutChangeListener(new u2(this, 1));
        this.f26290a.j(new ai.r(this, 8));
        e71 e71Var2 = this.f26290a;
        e71Var2.Y2 = true;
        e71Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new ci.h4(this.fragmentView, false, new ai.y1(this, 22));
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
        if (this.f11320f != null) {
            boolean f02 = f0();
            this.f11320f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f11320f.animate();
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
                org.telegram.ui.ActionBar.v0 v0Var = this.f11320f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.v0 v0Var2 = this.f11320f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.v0 v0Var3 = this.f11320f;
                if (f02) {
                    f13 = 1.0f;
                }
                v0Var3.setScaleY(f13);
            }
            e71 e71Var = this.f26290a;
            if (e71Var != null && e71Var.W2 != null && this.K != (!g0())) {
                e71 e71Var2 = this.f26290a;
                if (e71Var2 != null && e71Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f26290a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f26290a.getChildAt(i12));
                        View childAt = this.f26290a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f26291b = i11;
                        int top = view.getTop();
                        this.f26292c = top;
                        if (this.f26291b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f26292c = AndroidUtilities.dp(88.0f);
                        }
                        this.f26290a.V2.h1(i11, view.getTop() - this.f26290a.getPaddingTop());
                    }
                }
                this.f26290a.W2.N(true);
                int i13 = this.f26291b;
                if (i13 >= 0) {
                    e71 e71Var3 = this.f26290a;
                    e71Var3.V2.h1(i13, this.f26292c - e71Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j3;
        TLRPC.Document document;
        String charSequence = this.f11323s.getText().toString();
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
                boolean z10 = this.f11324w;
                if (!z10 && (document = this.f11325x) != null) {
                    j3 = document.f20044id;
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
        m mVar = this.f11323s;
        if (mVar != null && this.v != null) {
            if (!TextUtils.isEmpty(mVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f11324w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        gs gsVar = this.f11319e;
        if (gsVar.f26867c > 0.0f) {
            return;
        }
        gsVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f11323s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f11324w && (this.f11325x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f11325x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f11324w && (document = this.f11325x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new o8(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j3;
        boolean z10;
        c71 c71Var;
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
            m mVar = this.f11323s;
            String str = tL_businessIntro.title;
            this.G = str;
            mVar.setText(str);
            m mVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            mVar2.setText(str2);
            this.f11325x = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.f11323s;
            this.G = "";
            mVar3.setText("");
            m mVar4 = this.v;
            this.H = "";
            mVar4.setText("");
            this.E = null;
            this.f11325x = null;
        }
        TLRPC.Document document = this.f11325x;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20044id;
        }
        this.I = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11324w = z10;
        j jVar = this.f11321n;
        if (jVar != null) {
            jVar.d(this.f11323s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f11321n;
            TLRPC.Document document2 = this.f11325x;
            if (document2 == null || this.f11324w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f11324w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        e71 e71Var = this.f26290a;
        if (e71Var != null && (c71Var = e71Var.W2) != null) {
            c71Var.N(true);
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
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final n f11266b;

                    {
                        this.f11266b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11266b.h0();
                                return;
                            default:
                                this.f11266b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final n f11266b;

                    {
                        this.f11266b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11266b.h0();
                                return;
                            default:
                                this.f11266b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20374a);
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
        this.f26290a.setPadding(0, 0, 0, i13);
        this.f26290a.setClipToPadding(false);
    }
}

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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.rt;
import w7.z5;
public final class n extends z61 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public g4 M;
    public sr f11268f;
    public org.telegram.ui.ActionBar.v0 h;
    public k f11269n;
    public j f11270r;
    public u5 f11271s;
    public m v;
    public m f11272w;
    public final h f11267e = new h(this, 1);
    public boolean f11273x = true;
    public TLRPC.Document f11274y = getMediaDataController().getGreetingsSticker();
    public boolean L = g0();

    public static void X(n nVar) {
        n nVar2;
        rt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.M != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            g4 g4Var = new g4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.M = g4Var;
            g4Var.Z1 = new a6.m(nVar2, 22);
        }
        nVar2.M.f32922j0.f0();
        nVar2.M.I1(1, false);
        g4 g4Var2 = nVar2.M;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(nVar2, 22));
        nVar2.M.q1();
        g4 g4Var3 = nVar2.M;
        g4Var3.f32945r = null;
        if (nVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            nVar2.showDialog(g4Var3);
        }
    }

    public static void Y(n nVar) {
        j jVar = nVar.f11270r;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.f11273x) {
            j jVar2 = nVar.f11270r;
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
            jVar2.f28751n.getImageReceiver().setDelegate(new ko(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, i6.f20980lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f28751n.n(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f28751n.j(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f28751n.setOnClickListener(new jo(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (!(nVar.f11269n.getParent() instanceof View)) {
            return;
        }
        int top = ((View) nVar.f11269n.getParent()).getTop();
        int measuredHeight = nVar.f11269n.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        nVar.f11270r.setScaleX(clamp);
        nVar.f11270r.setScaleY(clamp);
        nVar.f11270r.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        nVar.f11269n.invalidate();
    }

    public static int c0(n nVar) {
        return nVar.classGuid;
    }

    public static int d0(n nVar) {
        return nVar.classGuid;
    }

    @Override
    public final void S(ArrayList arrayList, w61 w61Var) {
        arrayList.add(h61.k(this.f11269n));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(h61.k(this.v));
        arrayList.add(h61.k(this.f11272w));
        if (this.f11273x) {
            arrayList.add(h61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.E != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.E;
            h61 h61Var = new h61(3);
            h61Var.d = 1;
            h61Var.f27093l = string;
            h61Var.G = str;
            arrayList.add(h61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f11274y;
            h61 h61Var2 = new h61(3);
            h61Var2.d = 1;
            h61Var2.f27093l = string2;
            h61Var2.G = document;
            arrayList.add(h61Var2);
        }
        arrayList.add(h61.C(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.L = !g02;
        if (!g02) {
            arrayList.add(h61.C(null));
            h61 e7 = h61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e7.f27099r = true;
            arrayList.add(e7);
        }
        h61 h61Var3 = new h61(8);
        h61Var3.f27093l = null;
        arrayList.add(h61Var3);
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void U(h61 h61Var, View view) {
        View[] viewPages;
        int i10 = h61Var.d;
        if (i10 == 1) {
            s2 s2Var = new s2(getParentActivity(), getResourceProvider(), true, true);
            s2Var.f5900y = new ah.b(13, this, view);
            s2Var.E = new h(this, 0);
            for (View view2 : s2Var.f5894f.getViewPages()) {
                if (view2 instanceof ci.e2) {
                    ci.d2 d2Var = ((ci.e2) view2).f4975c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
            }
            showDialog(s2Var);
        } else if (i10 == 2) {
            this.v.setText("");
            this.f11272w.setText("");
            AndroidUtilities.hideKeyboard(this.v.f22315b);
            AndroidUtilities.hideKeyboard(this.f11272w.f22315b);
            this.f11273x = true;
            this.f11270r.d("", "");
            j jVar = this.f11270r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f11274y = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.f11267e;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean W(h61 h61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f11270r = new mo(context, this.currentAccount, this.f11274y, getResourceProvider());
        k kVar = new k(this, context);
        this.f11269n = kVar;
        kVar.setWillNotDraw(false);
        this.f11271s = new u5(this.f11270r, this.f11269n, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f11270r.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), i6.I.q()));
        this.f11269n.addView(lVar, z5.e(-1, -1, 119));
        this.f11269n.addView(this.f11270r, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.v = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.v;
        int i10 = i6.f20827d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar3 = this.v;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        h3 h3Var = mVar3.f22315b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.f11272w = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.f11272w.setBackgroundColor(getThemedColor(i10));
        this.f11272w.setDivider(true);
        m mVar5 = this.f11272w;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        h3 h3Var2 = mVar5.f22315b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        this.f11270r.d("", "");
        super.createView(context);
        this.f33439b.setBackground(null);
        this.f33438a.r1();
        this.f33438a.setSectionsDrawBackground(true);
        this.f33438a.f26034f3.f32531r = false;
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = i6.f21164v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f11268f = new sr(mutate, new wp(i6.w0(null, i11, false)));
        this.h = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11268f);
        e0(false);
        this.f33438a.addOnLayoutChangeListener(new v2(this, 1));
        this.f33438a.j(new ai.r(this, 9));
        y61 y61Var = this.f33438a;
        y61Var.f26036h3 = true;
        y61Var.setClipChildren(false);
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
            y61 y61Var = this.f33438a;
            if (y61Var != null && y61Var.f26034f3 != null && this.L != (!g0())) {
                y61 y61Var2 = this.f33438a;
                if (y61Var2 != null && y61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f33438a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f33438a.getChildAt(i12));
                        View childAt = this.f33438a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f33440c = i11;
                        int top = view.getTop();
                        this.d = top;
                        if (this.f33440c == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.d = AndroidUtilities.dp(88.0f);
                        }
                        this.f33438a.f26033e3.h1(i11, view.getTop() - this.f33438a.getPaddingTop());
                    }
                }
                this.f33438a.f26034f3.N(true);
                int i13 = this.f33440c;
                if (i13 >= 0) {
                    y61 y61Var3 = this.f33438a;
                    y61Var3.f26033e3.h1(i13, this.d - y61Var3.getPaddingTop());
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
            String charSequence2 = this.f11272w.getText().toString();
            String str3 = this.I;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f11273x;
                if (!z10 && (document = this.f11274y) != null) {
                    j3 = document.f20053id;
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
        m mVar = this.v;
        if (mVar != null && this.f11272w != null) {
            if (!TextUtils.isEmpty(mVar.getText()) || !TextUtils.isEmpty(this.f11272w.getText()) || !this.f11273x) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.f33438a;
    }

    public final void h0() {
        TLRPC.Document document;
        sr srVar = this.f11268f;
        if (srVar.f30935c > 0.0f) {
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
            updatebusinessintro.intro.description = this.f11272w.getText().toString();
            if (!this.f11273x && (this.f11274y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f11274y);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f11273x && (document = this.f11274y) != null) {
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
        w61 w61Var;
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
            m mVar = this.v;
            String str = tL_businessIntro.title;
            this.H = str;
            mVar.setText(str);
            m mVar2 = this.f11272w;
            String str2 = userFull.business_intro.description;
            this.I = str2;
            mVar2.setText(str2);
            this.f11274y = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.v;
            this.H = "";
            mVar3.setText("");
            m mVar4 = this.f11272w;
            this.I = "";
            mVar4.setText("");
            this.F = null;
            this.f11274y = null;
        }
        TLRPC.Document document = this.f11274y;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f20053id;
        }
        this.J = j3;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11273x = z10;
        j jVar = this.f11270r;
        if (jVar != null) {
            jVar.d(this.v.getText().toString(), this.f11272w.getText().toString());
            j jVar2 = this.f11270r;
            TLRPC.Document document2 = this.f11274y;
            if (document2 == null || this.f11273x) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f11273x) {
            h hVar = this.f11267e;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        y61 y61Var = this.f33438a;
        if (y61Var != null && (w61Var = y61Var.f26034f3) != null) {
            w61Var.N(true);
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
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final n f11214b;

                    {
                        this.f11214b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11214b.h0();
                                return;
                            default:
                                this.f11214b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final n f11214b;

                    {
                        this.f11214b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f11214b.h0();
                                return;
                            default:
                                this.f11214b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20377a);
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
}

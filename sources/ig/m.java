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
import ci.b3;
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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.et;
import w7.z5;
public final class m extends w61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public b3 L;
    public as e;
    public org.telegram.ui.ActionBar.u0 f12958f;
    public j h;
    public i f12959n;
    public u5 f12960r;
    public l f12961s;
    public l v;
    public String f12964y;
    public final g d = new g(this, 1);
    public boolean f12962w = true;
    public TLRPC.Document f12963x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(m mVar) {
        m mVar2;
        et.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.L != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            b3 b3Var = new b3(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.L = b3Var;
            b3Var.f30528c2 = new ya.d(mVar2, 24);
        }
        mVar2.L.f30548j0.f0();
        mVar2.L.N1(1, false);
        b3 b3Var2 = mVar2.L;
        b3Var2.X1 = true;
        b3Var2.k1(new hg.o(mVar2, 3));
        mVar2.L.t1();
        b3 b3Var3 = mVar2.L;
        b3Var3.f30571r = null;
        if (mVar2.visibleDialog != null) {
            b3Var3.show();
        } else {
            mVar2.showDialog(b3Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.f12959n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.f12962w) {
            i iVar2 = mVar.f12959n;
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
            iVar2.f30644n.getImageReceiver().setDelegate(new ro(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, h6.f21139lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f30644n.n(ImageLocation.getForDocument(greetingsSticker), to.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f30644n.j(ImageLocation.getForDocument(greetingsSticker), to.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f30644n.setOnClickListener(new qo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (!(mVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) mVar.h.getParent()).getTop();
        int measuredHeight = mVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        mVar.f12959n.setScaleX(clamp);
        mVar.f12959n.setScaleY(clamp);
        mVar.f12959n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        mVar.h.invalidate();
    }

    public static int c0(m mVar) {
        return mVar.classGuid;
    }

    public static int d0(m mVar) {
        return mVar.classGuid;
    }

    @Override
    public final void U(ArrayList arrayList, t61 t61Var) {
        arrayList.add(g61.k(this.h));
        i2.e.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(g61.k(this.f12961s));
        arrayList.add(g61.k(this.v));
        if (this.f12962w) {
            arrayList.add(g61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f12964y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f12964y;
            g61 g61Var = new g61(3);
            g61Var.d = 1;
            g61Var.f26499l = string;
            g61Var.G = str;
            arrayList.add(g61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f12963x;
            g61 g61Var2 = new g61(3);
            g61Var2.d = 1;
            g61Var2.f26499l = string2;
            g61Var2.G = document;
            arrayList.add(g61Var2);
        }
        arrayList.add(g61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(g61.B(null));
            g61 e = g61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f26505r = true;
            arrayList.add(e);
        }
        g61 g61Var3 = new g61(8);
        g61Var3.f26499l = null;
        arrayList.add(g61Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(g61 g61Var, View view) {
        View[] viewPages;
        int i10 = g61Var.d;
        if (i10 == 1) {
            n2 n2Var = new n2(getParentActivity(), getResourceProvider(), true, true);
            n2Var.f9509y = new ah.h0(16, this, view);
            n2Var.E = new g(this, 0);
            for (View view2 : n2Var.f9503f.getViewPages()) {
                if (view2 instanceof ei.b2) {
                    ei.a2 a2Var = ((ei.b2) view2).f8772c;
                    if (a2Var.H == null) {
                        a2Var.D(null);
                    }
                }
            }
            showDialog(n2Var);
        } else if (i10 == 2) {
            this.f12961s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f12961s.f22401b);
            AndroidUtilities.hideKeyboard(this.v.f22401b);
            this.f12962w = true;
            this.f12959n.d("", "");
            i iVar = this.f12959n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f12963x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(g61 g61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f12959n = new to(context, this.currentAccount, this.f12963x, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        this.f12960r = new u5(this.f12959n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f12959n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(r6.e(null, this.currentAccount, getUserConfig().getClientUserId(), h6.I.q()));
        this.h.addView(kVar, z5.e(-1, -1, 119));
        this.h.addView(this.f12959n, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f12961s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.f12961s;
        int i10 = h6.f20989d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.f12961s.setDivider(true);
        l lVar3 = this.f12961s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        g3 g3Var = lVar3.f22401b;
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
        g3 g3Var2 = lVar5.f22401b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new t2(gVar2, 2));
        this.f12959n.d("", "");
        super.createView(context);
        this.f32027a.p1();
        v61 v61Var = this.f32027a;
        v61Var.W2.f30438r = false;
        this.actionBar.setAdaptiveBackground(v61Var);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = h6.f21324v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new as(mutate, new dq(h6.x0(null, i11, false)));
        this.f12958f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f32027a.addOnLayoutChangeListener(new o2(this, 1));
        this.f32027a.j(new ah.d0(this, 13));
        v61 v61Var2 = this.f32027a;
        v61Var2.Y2 = true;
        v61Var2.setClipChildren(false);
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
        if (this.f12958f != null) {
            boolean f02 = f0();
            this.f12958f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f12958f.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f12958f;
                if (f02) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f12958f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f12958f;
                if (f02) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            v61 v61Var = this.f32027a;
            if (v61Var != null && v61Var.W2 != null && this.K != (!g0())) {
                v61 v61Var2 = this.f32027a;
                if (v61Var2 != null && v61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f32027a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f32027a.getChildAt(i12));
                        View childAt = this.f32027a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f32028b = i11;
                        int top = view.getTop();
                        this.f32029c = top;
                        if (this.f32028b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f32029c = AndroidUtilities.dp(88.0f);
                        }
                        this.f32027a.V2.h1(i11, view.getTop() - this.f32027a.getPaddingTop());
                    }
                }
                this.f32027a.W2.N(true);
                int i13 = this.f32028b;
                if (i13 >= 0) {
                    v61 v61Var3 = this.f32027a;
                    v61Var3.V2.h1(i13, this.f32029c - v61Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f12961s.getText().toString();
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
                boolean z10 = this.f12962w;
                if (!z10 && (document = this.f12963x) != null) {
                    j10 = document.f20281id;
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
        l lVar = this.f12961s;
        if (lVar != null && this.v != null) {
            if (!TextUtils.isEmpty(lVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f12962w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        as asVar = this.e;
        if (asVar.f24691c > 0.0f) {
            return;
        }
        asVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f12961s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f12962w && (this.f12963x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f12963x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f12962w && (document = this.f12963x) != null) {
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
        t61 t61Var;
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
            l lVar = this.f12961s;
            String str = tL_businessIntro.title;
            this.G = str;
            lVar.setText(str);
            l lVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            lVar2.setText(str2);
            this.f12963x = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.f12961s;
            this.G = "";
            lVar3.setText("");
            l lVar4 = this.v;
            this.H = "";
            lVar4.setText("");
            this.E = null;
            this.f12963x = null;
        }
        TLRPC.Document document = this.f12963x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20281id;
        }
        this.I = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12962w = z10;
        i iVar = this.f12959n;
        if (iVar != null) {
            iVar.d(this.f12961s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.f12959n;
            TLRPC.Document document2 = this.f12963x;
            if (document2 == null || this.f12962w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f12962w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        v61 v61Var = this.f32027a;
        if (v61Var != null && (t61Var = v61Var.W2) != null) {
            t61Var.N(true);
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
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f12910b;

                    {
                        this.f12910b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12910b.h0();
                                return;
                            default:
                                this.f12910b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final m f12910b;

                    {
                        this.f12910b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f12910b.h0();
                                return;
                            default:
                                this.f12910b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20604a);
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
        this.f32027a.setPadding(0, 0, 0, i13);
        this.f32027a.setClipToPadding(false);
    }
}

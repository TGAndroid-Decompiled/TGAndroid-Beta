package ji;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yc;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
import org.telegram.ui.mk;
public final class r extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public h1 F;
    public int G;
    public n70 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public cj0 O;
    public final d P;
    public final int f14132n;
    public final v3 f14133r;
    public final a4 f14134s;
    public m.p3 v;
    public kz f14135w;
    public boolean f14136x;
    public boolean f14137y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f14132n = i10;
        this.h = true;
        this.f28756f = true;
        v3 v3Var = new v3(context, i10, f6Var, new n4.y(this, f6Var, false, 21));
        this.f14133r = v3Var;
        v3Var.setAdaptiveLinkDialogs(false);
        v3Var.setAllowTapAboveContent(false);
        addView(v3Var, w7.x5.e(-1, -1, 119));
        addView(v3Var.getOverlayView(), w7.x5.e(-1, -1, 119));
        v3Var.y4();
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        a4 a4Var = new a4(context, mVar);
        this.f14134s = a4Var;
        a4Var.setBackVisible(false);
        a4Var.setTopGradientVisible(false);
        Y();
        addView(a4Var, w7.x5.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void K(r rVar) {
        boolean z10;
        int i10 = 0;
        if (!rVar.f14133r.j3() && !rVar.f14136x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            vi viVar = rVar.f28753b;
            if (!viVar.R && viVar.S0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (rVar.K != i10) {
            rVar.K = i10;
            rVar.S();
        }
    }

    public static void L(r rVar) {
        v3 v3Var = rVar.f14133r;
        if (rVar.f14136x) {
            h1 O2 = v3Var.O2();
            if (O2 != null) {
                O2.r();
                AndroidUtilities.showKeyboard(O2);
            }
            rVar.R(true);
            return;
        }
        vi viVar = rVar.f28753b;
        if (rVar.f14135w == null) {
            kz kzVar = new kz(viVar.f31279f0, true, false, false, rVar.getContext(), true, null, viVar.f31316r1, true, rVar.f28752a, false, false);
            rVar.f14135w = kzVar;
            kzVar.setVisibility(8);
            kz kzVar2 = rVar.f14135w;
            kzVar2.f28001x2 = false;
            kzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.f14135w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.f14135w.setDelegate(new p(rVar));
            rVar.addView(rVar.f14135w, w7.x5.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.f14135w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.f14135w.setLayoutParams(layoutParams);
        rVar.f14135w.setTranslationY(0.0f);
        rVar.f14135w.setVisibility(0);
        rVar.f14136x = true;
        rVar.E = emojiPanelHeight;
        h1 O22 = v3Var.O2();
        if (O22 != null) {
            AndroidUtilities.hideKeyboard(O22);
        }
        a4 a4Var = rVar.f14134s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(true);
        }
        rVar.V(false);
        rVar.requestLayout();
    }

    public static h1 M(r rVar) {
        v3 v3Var = rVar.f14133r;
        h1 focusedEditTextOrNull = v3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        h1 h1Var = rVar.F;
        if (h1Var != null) {
            return h1Var;
        }
        return v3Var.O2();
    }

    public static int N(r rVar, h1 h1Var) {
        if (h1Var == rVar.F && rVar.f14133r.getFocusedEditTextOrNull() != h1Var) {
            return Math.min(rVar.G, h1Var.length());
        }
        return Math.max(0, h1Var.getSelectionEnd());
    }

    public static void O(r rVar, int i10, int i11) {
        vi viVar = rVar.f28753b;
        if (viVar.f31279f0 == null) {
            return;
        }
        vi viVar2 = new vi(rVar.getContext(), viVar.f31279f0, false, false, true, rVar.f28752a);
        viVar2.Z1 = new n(rVar, viVar2);
        viVar2.f31291j0.f0();
        viVar2.J1(1, true);
        viVar2.h1(i10);
        viVar2.f31324t2 = new e(rVar, viVar2);
        viVar2.Y = new e(rVar, viVar2);
        viVar2.X = new o(rVar, viVar2);
        viVar2.r1();
        if (i11 != 0) {
            viVar2.A1(i11);
        }
        viVar2.setFocusable(true);
        viVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        String str2;
        org.telegram.ui.ActionBar.f3 i10 = wl.i(1, context, f6Var, true);
        LinearLayout f7 = wl.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f7.addView(horizontalScrollView, w7.x5.t(-1, -2, 49, 12, 2, 12, 0));
        di.d g10 = wl.g(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, g10, zArr2, new ii.a(strArr, 2), imageView, f6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22074b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var)));
        i3Var.setText(strArr[0]);
        g3Var.addTextChangedListener(new q(strArr, kVar));
        f7.addView(i3Var, w7.x5.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(LocaleController.getString(R.string.Done));
        f7.addView(g10, w7.x5.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i10.customView = f7;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.g3 g3Var2 = org.telegram.ui.Cells.i3.this.f22074b;
                g3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(g3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        callback.run(strArr2[0]);
                    }
                }
            }
        });
        i10.show();
        int i11 = org.telegram.ui.ActionBar.j6.f20607a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        g10.setOnClickListener(new bi.l0(g10, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new ig.t0(i3Var, 6), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f28753b.f31316r1.R();
        if (R <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            R = globalEmojiSettings.getInt(str, AndroidUtilities.dp(200.0f));
        }
        if (R <= 0) {
            R = AndroidUtilities.dp(200.0f);
        }
        return R + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void D(ni niVar) {
        this.f28753b.X0.setTitle("");
        this.f14133r.Y2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override
    public final void G() {
        this.f14133r.x0(0);
    }

    @Override
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        mk mkVar;
        int i12 = this.f14132n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        v3 v3Var = this.f14133r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && f5.f(v3Var.f14256l3, v3Var.f14257m3)) {
            c2.p0(getContext(), new b(v3Var, 0), new d(this, 2), this.f28752a);
            return false;
        }
        if (v3Var.j3() && !v3Var.l3()) {
            if (!v3Var.L3()) {
                a4 a4Var = this.f14134s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(v3Var.L3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                vi viVar = this.f28753b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.n2 n2Var = viVar.f31279f0;
                    if ((n2Var instanceof co) && (mkVar = ((co) n2Var).Y) != null) {
                        mkVar.R0(f5.k(v3Var.f14256l3), z10, i10, i11);
                        viVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Y2 = v3Var.Y2();
                    if (!Y2.isEmpty()) {
                        ArrayList A2 = v3Var.A2();
                        ArrayList x22 = v3Var.x2();
                        ArrayList a2 = e5.a(i12, Y2);
                        org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31279f0;
                        if (n2Var2 instanceof co) {
                            co coVar = (co) n2Var2;
                            MessageObject messageObject3 = coVar.f35352n5;
                            MessageObject messageObject4 = coVar.X3;
                            j10 = coVar.N8();
                            sendMessageChatArguments = coVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(viVar.J1), Y2, A2, x22, a2, false, viVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        viVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean J() {
        return !this.f14133r.j3();
    }

    public final void P(n70 n70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, n70 n70Var2) {
        boolean z10;
        if (aVar != null && aVar.f13732b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n70Var.j(z10, i10, null, str, new androidx.car.app.utils.b(this, aVar, pageBlock, n70Var2, 19));
        n70Var.y().f20401a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        n70Var.y().f20401a.setTextSize(1, i11);
    }

    public final boolean Q() {
        v3 v3Var = this.f14133r;
        if (v3Var != null && v3Var.j3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28752a);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                public final r f13985b;

                {
                    this.f13985b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f13985b.f28753b.dismiss();
                            return;
                        default:
                            r rVar = this.f13985b;
                            rVar.T();
                            rVar.f28753b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.a2(this) {
                public final r f13985b;

                {
                    this.f13985b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f13985b.f28753b.dismiss();
                            return;
                        default:
                            r rVar = this.f13985b;
                            rVar.T();
                            rVar.f28753b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-2);
            alertDialog$Builder.o();
            return false;
        }
        return true;
    }

    public final void R(boolean z10) {
        if (this.f14137y) {
            this.f14137y = false;
            kz kzVar = this.f14135w;
            if (kzVar != null) {
                kzVar.t(false);
                if (!z10) {
                    this.f14135w.B();
                }
            }
        }
        this.F = null;
        kz kzVar2 = this.f14135w;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.f14135w.setVisibility(8);
        }
        this.f14136x = false;
        this.E = 0;
        a4 a4Var = this.f14134s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        int i10;
        int i11;
        float f7;
        int i12;
        float f10;
        float f11;
        if (this.f14137y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        kz kzVar = this.f14135w;
        float f12 = 0.0f;
        vi viVar = this.f28753b;
        if (kzVar != null) {
            if (this.f14136x) {
                float f13 = this.E - i10;
                if (this.f14137y) {
                    f11 = -viVar.f31298l2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            kzVar.setTranslationY(f10);
        }
        a4 a4Var = this.f14134s;
        if (a4Var != null) {
            boolean z10 = this.f14136x;
            if (z10) {
                f7 = i10;
            } else {
                if (!this.L && this.E <= 0) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                f7 = i11;
            }
            if (!z10 || this.f14137y) {
                f7 += viVar.f31298l2;
            }
            a4Var.getBottomContainer().animate().cancel();
            a4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f14136x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f14137y) {
                f12 += viVar.f31298l2;
            }
            a4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = a4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(pr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28753b.f31279f0;
        if (n2Var instanceof co) {
            co coVar = (co) n2Var;
            v3 v3Var = this.f14133r;
            if (!v3Var.q2()) {
                return false;
            }
            TL_iv.RichMessage i22 = v3Var.i2();
            AccountInstance.getInstance(this.f14132n).getMediaDataController().saveDraft(coVar.a(), coVar.B7(coVar.f35352n5), "", null, null, null, null, 0L, false, false, i22);
            mk mkVar = coVar.Y;
            if (mkVar != null) {
                mkVar.setRichDraftPreview(i22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void V(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (!this.f14133r.j3() && !this.f14136x) {
            z11 = false;
        } else {
            z11 = true;
        }
        vi viVar = this.f28753b;
        xh xhVar = viVar.f31337x1;
        if (viVar.f31327u2 != z11) {
            viVar.f31327u2 = z11;
            if (viVar.S0) {
                xhVar.animate().cancel();
                if (!z11) {
                    xhVar.setVisibility(0);
                }
                float f7 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = xhVar.animate();
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f10).setDuration(180L).withEndAction(new qh(viVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f7 = 0.0f;
                    }
                    xhVar.setAlpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    xhVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    xhVar.setVisibility(i10);
                }
            }
        }
        if (!z11 && !viVar.R && viVar.S0) {
            i11 = AndroidUtilities.dp(62.0f);
        }
        this.K = i11;
        S();
        if (this.J == z11) {
            this.J = !z11;
            requestLayout();
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: ji.r.W():void");
    }

    public final void X() {
        boolean z10;
        float f7;
        a4 a4Var = this.f14134s;
        if (a4Var != null) {
            v3 v3Var = this.f14133r;
            boolean q22 = v3Var.q2();
            g2 g2Var = v3Var.J3;
            if (g2Var != null && !g2Var.f13917c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = a4Var.f13771r;
            ImageView imageView2 = a4Var.f13770n;
            imageView2.setEnabled(q22);
            float f10 = 0.35f;
            if (q22) {
                f7 = 1.0f;
            } else {
                f7 = 0.35f;
            }
            imageView2.setAlpha(f7);
            imageView.setEnabled(z10);
            if (z10) {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void Y() {
        boolean z10;
        a4 a4Var = this.f14134s;
        if (a4Var != null) {
            int i10 = this.f14132n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            vg sendButton = a4Var.getSendButton();
            if (z10) {
                v3 v3Var = this.f14133r;
                if (f5.f(v3Var.f14256l3, v3Var.f14257m3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            a4Var.setPremiumLocked(z10);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: ji.r.Z():void");
    }

    public final void a0() {
        int i10;
        a4 a4Var = this.f14134s;
        if (a4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        v3 v3Var = this.f14133r;
        if (v3Var.getChildCount() <= 0) {
            i10 = v3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < v3Var.getChildCount(); i12++) {
                View childAt = v3Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = v3Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        a4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            Y();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        v3 v3Var = this.f14133r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f28753b.f31279f0 instanceof co) && v3Var.q2() && T()) {
                org.telegram.messenger.w1.o(R.string.RichEditorDraftSaved, new yc(this.f14134s, this.f28752a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!v3Var.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        kz kzVar;
        v3 v3Var = this.f14133r;
        i3 i3Var = v3Var.f14259n3;
        ca caVar = v3Var.f14261o3;
        if (!i3Var.y() || !caVar.onTouchEvent(motionEvent)) {
            if (this.f14137y && (kzVar = this.f14135w) != null) {
                height = (int) kzVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f14136x && motionEvent.getY() < dp) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && caVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && v3Var.h3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        v3 v3Var = this.f14133r;
        if (v3Var.getChildCount() <= 0) {
            int paddingTop = v3Var.getPaddingTop();
            this.I = paddingTop;
            v3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i11 = 0; i11 < v3Var.getChildCount(); i11++) {
            View childAt = v3Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z10 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        v3Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i12 < AndroidUtilities.dp(7.0f) || !z10) {
            i12 = dp;
        }
        this.I = i12;
        return i12;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f14133r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public q9 getTextSelectionHelper() {
        return this.f14133r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z10 = this.f14137y;
        if (z10) {
            if (z10) {
                this.f14137y = false;
                kz kzVar = this.f14135w;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.f14135w.B();
                }
                S();
                return false;
            }
        } else if (this.f14136x) {
            R(false);
            return false;
        } else if (!this.f14133r.E2() && !Q()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(float f7) {
        S();
    }

    @Override
    public final void m() {
        cj0 cj0Var = this.O;
        if (cj0Var != null) {
            cj0Var.i();
            this.O = null;
        }
        m.p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.a();
        }
        v3 v3Var = this.f14133r;
        if (v3Var != null) {
            v3Var.u2();
        }
        kz kzVar = this.f14135w;
        if (kzVar != null) {
            kzVar.D();
        }
    }

    @Override
    public final boolean n() {
        v3 v3Var = this.f14133r;
        if (v3Var != null) {
            v3Var.u2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f14132n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f14132n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean p() {
        if (!Q()) {
            return false;
        }
        return true;
    }

    @Override
    public final void r() {
        m.p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.a();
        }
        if (this.f14136x) {
            R(false);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28753b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z10;
        if (this.f28753b.f31316r1.R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        S();
        a0();
    }

    @Override
    public final void w(int i10, boolean z10) {
        this.L = z10;
        S();
        if (z10 && this.f14136x && !this.f14137y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: ji.r.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}

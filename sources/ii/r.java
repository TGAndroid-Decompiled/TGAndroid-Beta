package ii;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xh;
import org.telegram.ui.bo;
import org.telegram.ui.dj0;
import org.telegram.ui.nk;
public final class r extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public i1 F;
    public int G;
    public n70 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public dj0 O;
    public final d P;
    public final int f11590n;
    public final w3 f11591r;
    public final b4 f11592s;
    public m.p3 v;
    public kz f11593w;
    public boolean f11594x;
    public boolean f11595y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f11590n = i10;
        this.h = true;
        this.f26462f = true;
        w3 w3Var = new w3(context, i10, f6Var, new of.b(22, this, f6Var));
        this.f11591r = w3Var;
        w3Var.setAdaptiveLinkDialogs(false);
        w3Var.setAllowTapAboveContent(false);
        addView(w3Var, w7.x5.e(-1, -1, 119));
        addView(w3Var.getOverlayView(), w7.x5.e(-1, -1, 119));
        w3Var.A4();
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        b4 b4Var = new b4(context, mVar);
        this.f11592s = b4Var;
        b4Var.setBackVisible(false);
        b4Var.setTopGradientVisible(false);
        Y();
        addView(b4Var, w7.x5.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void K(r rVar) {
        boolean z10;
        int i10 = 0;
        if (!rVar.f11591r.l3() && !rVar.f11594x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            vi viVar = rVar.f26460b;
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
        w3 w3Var = rVar.f11591r;
        if (rVar.f11594x) {
            i1 Q2 = w3Var.Q2();
            if (Q2 != null) {
                Q2.r();
                AndroidUtilities.showKeyboard(Q2);
            }
            rVar.R(true);
            return;
        }
        vi viVar = rVar.f26460b;
        if (rVar.f11593w == null) {
            kz kzVar = new kz(viVar.f28742f0, true, false, false, rVar.getContext(), true, null, viVar.f28779r1, true, rVar.f26459a, false, false);
            rVar.f11593w = kzVar;
            kzVar.setVisibility(8);
            kz kzVar2 = rVar.f11593w;
            kzVar2.f25777w2 = false;
            kzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.f11593w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.f11593w.setDelegate(new p(rVar));
            rVar.addView(rVar.f11593w, w7.x5.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.f11593w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.f11593w.setLayoutParams(layoutParams);
        rVar.f11593w.setTranslationY(0.0f);
        rVar.f11593w.setVisibility(0);
        rVar.f11594x = true;
        rVar.E = emojiPanelHeight;
        i1 Q22 = w3Var.Q2();
        if (Q22 != null) {
            AndroidUtilities.hideKeyboard(Q22);
        }
        b4 b4Var = rVar.f11592s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(true);
        }
        rVar.V(false);
        rVar.requestLayout();
    }

    public static i1 M(r rVar) {
        w3 w3Var = rVar.f11591r;
        i1 focusedEditTextOrNull = w3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        i1 i1Var = rVar.F;
        if (i1Var != null) {
            return i1Var;
        }
        return w3Var.Q2();
    }

    public static int N(r rVar, i1 i1Var) {
        if (i1Var == rVar.F && rVar.f11591r.getFocusedEditTextOrNull() != i1Var) {
            return Math.min(rVar.G, i1Var.length());
        }
        return Math.max(0, i1Var.getSelectionEnd());
    }

    public static void O(r rVar, int i10, int i11) {
        vi viVar = rVar.f26460b;
        if (viVar.f28742f0 == null) {
            return;
        }
        vi viVar2 = new vi(rVar.getContext(), viVar.f28742f0, false, false, true, rVar.f26459a);
        viVar2.Z1 = new n(rVar, viVar2);
        viVar2.f28754j0.f0();
        viVar2.J1(1, true);
        viVar2.h1(i10);
        viVar2.f28787t2 = new e(rVar, viVar2);
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
        org.telegram.ui.ActionBar.g3 i10 = wl.i(1, context, f6Var, true);
        LinearLayout f7 = wl.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(j6.b0(AndroidUtilities.dp(8.0f), j6.l1(0.05f, j6.v0(j6.G6, f6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f7.addView(horizontalScrollView, w7.x5.t(-1, -2, 49, 12, 2, 12, 0));
        ci.d g10 = wl.g(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, g10, zArr2, new hi.a(strArr, 2), imageView, f6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f20239b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(j6.b0(AndroidUtilities.dp(24.0f), j6.v0(j6.f18862d6, f6Var)));
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
                org.telegram.ui.Cells.g3 g3Var2 = org.telegram.ui.Cells.i3.this.f20239b;
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
        int i11 = j6.f18806a7;
        i10.setBackgroundColor(j6.v0(i11, f6Var));
        i10.fixNavigationBar(j6.v0(i11, f6Var));
        g10.setOnClickListener(new ai.s0(g10, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new i2.g0(i3Var, 1), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f26460b.f28779r1.R();
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
    public final void E(ni niVar) {
        this.f26460b.X0.setTitle("");
        this.f11591r.Y2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override
    public final void G() {
        this.f11591r.y0(0);
    }

    @Override
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        nk nkVar;
        int i12 = this.f11590n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        w3 w3Var = this.f11591r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && c5.f(w3Var.f11721l3, w3Var.f11722m3)) {
            d2.p0(getContext(), new b(w3Var, 0), new d(this, 2), this.f26459a);
            return false;
        }
        if (w3Var.l3() && !w3Var.n3()) {
            if (!w3Var.N3()) {
                b4 b4Var = this.f11592s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(w3Var.N3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                vi viVar = this.f26460b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.o2 o2Var = viVar.f28742f0;
                    if ((o2Var instanceof bo) && (nkVar = ((bo) o2Var).Y) != null) {
                        nkVar.R0(c5.k(w3Var.f11721l3), z10, i10, i11);
                        viVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList a32 = w3Var.a3();
                    if (!a32.isEmpty()) {
                        ArrayList C2 = w3Var.C2();
                        ArrayList z22 = w3Var.z2();
                        ArrayList a2 = b5.a(i12, a32);
                        org.telegram.ui.ActionBar.o2 o2Var2 = viVar.f28742f0;
                        if (o2Var2 instanceof bo) {
                            bo boVar = (bo) o2Var2;
                            MessageObject messageObject3 = boVar.f32381n5;
                            MessageObject messageObject4 = boVar.X3;
                            j10 = boVar.N8();
                            sendMessageChatArguments = boVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(viVar.J1), a32, C2, z22, a2, false, viVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
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
        return !this.f11591r.l3();
    }

    public final void P(n70 n70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, n70 n70Var2) {
        boolean z10;
        if (aVar != null && aVar.f11204b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n70Var.j(z10, i10, null, str, new ai.i5(this, aVar, pageBlock, n70Var2, 18));
        n70Var.y().f18652a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        n70Var.y().f18652a.setTextSize(1, i11);
    }

    public final boolean Q() {
        w3 w3Var = this.f11591r;
        if (w3Var != null && w3Var.l3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26459a);
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                public final r f11450b;

                {
                    this.f11450b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f11450b.f26460b.dismiss();
                            return;
                        default:
                            r rVar = this.f11450b;
                            rVar.T();
                            rVar.f26460b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.b2(this) {
                public final r f11450b;

                {
                    this.f11450b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f11450b.f26460b.dismiss();
                            return;
                        default:
                            r rVar = this.f11450b;
                            rVar.T();
                            rVar.f26460b.dismiss();
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
        if (this.f11595y) {
            this.f11595y = false;
            kz kzVar = this.f11593w;
            if (kzVar != null) {
                kzVar.t(false);
                if (!z10) {
                    this.f11593w.A();
                }
            }
        }
        this.F = null;
        kz kzVar2 = this.f11593w;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.f11593w.setVisibility(8);
        }
        this.f11594x = false;
        this.E = 0;
        b4 b4Var = this.f11592s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(false);
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
        if (this.f11595y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        kz kzVar = this.f11593w;
        float f12 = 0.0f;
        vi viVar = this.f26460b;
        if (kzVar != null) {
            if (this.f11594x) {
                float f13 = this.E - i10;
                if (this.f11595y) {
                    f11 = -viVar.f28761l2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            kzVar.setTranslationY(f10);
        }
        b4 b4Var = this.f11592s;
        if (b4Var != null) {
            boolean z10 = this.f11594x;
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
            if (!z10 || this.f11595y) {
                f7 += viVar.f28761l2;
            }
            b4Var.getBottomContainer().animate().cancel();
            b4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f11594x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f11595y) {
                f12 += viVar.f28761l2;
            }
            b4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = b4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(qr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f26460b.f28742f0;
        if (o2Var instanceof bo) {
            bo boVar = (bo) o2Var;
            w3 w3Var = this.f11591r;
            if (!w3Var.s2()) {
                return false;
            }
            TL_iv.RichMessage k22 = w3Var.k2();
            AccountInstance.getInstance(this.f11590n).getMediaDataController().saveDraft(boVar.a(), boVar.B7(boVar.f32381n5), "", null, null, null, null, 0L, false, false, k22);
            nk nkVar = boVar.Y;
            if (nkVar != null) {
                nkVar.setRichDraftPreview(k22);
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
        if (!this.f11591r.l3() && !this.f11594x) {
            z11 = false;
        } else {
            z11 = true;
        }
        vi viVar = this.f26460b;
        xh xhVar = viVar.f28800x1;
        if (viVar.f28790u2 != z11) {
            viVar.f28790u2 = z11;
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
                    alpha.translationY(f10).setDuration(180L).withEndAction(new ph(viVar, z11, 3)).start();
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
        throw new UnsupportedOperationException("Method not decompiled: ii.r.W():void");
    }

    public final void X() {
        boolean z10;
        float f7;
        b4 b4Var = this.f11592s;
        if (b4Var != null) {
            w3 w3Var = this.f11591r;
            boolean s22 = w3Var.s2();
            h2 h2Var = w3Var.J3;
            if (h2Var != null && !h2Var.f11409c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = b4Var.f11266r;
            ImageView imageView2 = b4Var.f11265n;
            imageView2.setEnabled(s22);
            float f10 = 0.35f;
            if (s22) {
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
        b4 b4Var = this.f11592s;
        if (b4Var != null) {
            int i10 = this.f11590n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            tg sendButton = b4Var.getSendButton();
            if (z10) {
                w3 w3Var = this.f11591r;
                if (c5.f(w3Var.f11721l3, w3Var.f11722m3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            b4Var.setPremiumLocked(z10);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.Z():void");
    }

    public final void a0() {
        int i10;
        b4 b4Var = this.f11592s;
        if (b4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        w3 w3Var = this.f11591r;
        if (w3Var.getChildCount() <= 0) {
            i10 = w3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < w3Var.getChildCount(); i12++) {
                View childAt = w3Var.getChildAt(i12);
                if (RecyclerView.S(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = w3Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        b4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
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
        w3 w3Var = this.f11591r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f26460b.f28742f0 instanceof bo) && w3Var.s2() && T()) {
                org.telegram.messenger.w1.o(R.string.RichEditorDraftSaved, new vc(this.f11592s, this.f26459a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!w3Var.i3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        kz kzVar;
        w3 w3Var = this.f11591r;
        j3 j3Var = w3Var.f11724n3;
        ca caVar = w3Var.f11726o3;
        if (!j3Var.y() || !caVar.onTouchEvent(motionEvent)) {
            if (this.f11595y && (kzVar = this.f11593w) != null) {
                height = (int) kzVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f11594x && motionEvent.getY() < dp) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && caVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && w3Var.j3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        w3 w3Var = this.f11591r;
        if (w3Var.getChildCount() <= 0) {
            int paddingTop = w3Var.getPaddingTop();
            this.I = paddingTop;
            w3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
            View childAt = w3Var.getChildAt(i11);
            int S = RecyclerView.S(childAt);
            if (S == 0) {
                z10 = true;
            }
            if (S >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        w3Var.setTopGlowOffset(Math.max(0, i10));
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
        return (this.f11591r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public q9 getTextSelectionHelper() {
        return this.f11591r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z10 = this.f11595y;
        if (z10) {
            if (z10) {
                this.f11595y = false;
                kz kzVar = this.f11593w;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.f11593w.A();
                }
                S();
                return false;
            }
        } else if (this.f11594x) {
            R(false);
            return false;
        } else if (!this.f11591r.G2() && !Q()) {
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
        dj0 dj0Var = this.O;
        if (dj0Var != null) {
            dj0Var.i();
            this.O = null;
        }
        m.p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.a();
        }
        w3 w3Var = this.f11591r;
        if (w3Var != null) {
            w3Var.w2();
        }
        kz kzVar = this.f11593w;
        if (kzVar != null) {
            kzVar.B();
        }
    }

    @Override
    public final boolean n() {
        w3 w3Var = this.f11591r;
        if (w3Var != null) {
            w3Var.w2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f11590n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f11590n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
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
        if (this.f11594x) {
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
        this.f26460b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z10;
        if (this.f26460b.f28779r1.R() > AndroidUtilities.dp(20.0f)) {
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
        if (z10 && this.f11594x && !this.f11595y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}

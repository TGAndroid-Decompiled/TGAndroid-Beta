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
import org.telegram.messenger.ok;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.z70;
import org.telegram.ui.jk;
import org.telegram.ui.vi0;
import org.telegram.ui.wn;
public final class r extends oi implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public i1 F;
    public int G;
    public z70 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public vi0 O;
    public final d P;
    public final int f11571n;
    public final x3 f11572r;
    public final c4 f11573s;
    public m.p3 v;
    public mz f11574w;
    public boolean f11575x;
    public boolean f11576y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f11571n = i10;
        this.h = true;
        this.f27045f = true;
        x3 x3Var = new x3(context, i10, d6Var, new of.b(22, this, d6Var));
        this.f11572r = x3Var;
        x3Var.setAdaptiveLinkDialogs(false);
        x3Var.setAllowTapAboveContent(false);
        addView(x3Var, w7.y5.e(-1, -1, 119));
        addView(x3Var.getOverlayView(), w7.y5.e(-1, -1, 119));
        x3Var.z4();
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        c4 c4Var = new c4(context, mVar);
        this.f11573s = c4Var;
        c4Var.setBackVisible(false);
        c4Var.setTopGradientVisible(false);
        Y();
        addView(c4Var, w7.y5.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void K(r rVar) {
        boolean z10;
        int i10 = 0;
        if (!rVar.f11572r.k3() && !rVar.f11575x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            wi wiVar = rVar.f27043b;
            if (!wiVar.R && wiVar.S0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (rVar.K != i10) {
            rVar.K = i10;
            rVar.S();
        }
    }

    public static void L(r rVar) {
        x3 x3Var = rVar.f11572r;
        if (rVar.f11575x) {
            i1 P2 = x3Var.P2();
            if (P2 != null) {
                P2.r();
                AndroidUtilities.showKeyboard(P2);
            }
            rVar.R(true);
            return;
        }
        wi wiVar = rVar.f27043b;
        if (rVar.f11574w == null) {
            mz mzVar = new mz(wiVar.f30020f0, true, false, false, rVar.getContext(), true, null, wiVar.f30057r1, true, rVar.f27042a, false, false);
            rVar.f11574w = mzVar;
            mzVar.setVisibility(8);
            mz mzVar2 = rVar.f11574w;
            mzVar2.f26612w2 = false;
            mzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.f11574w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.f11574w.setDelegate(new p(rVar));
            rVar.addView(rVar.f11574w, w7.y5.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.f11574w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.f11574w.setLayoutParams(layoutParams);
        rVar.f11574w.setTranslationY(0.0f);
        rVar.f11574w.setVisibility(0);
        rVar.f11575x = true;
        rVar.E = emojiPanelHeight;
        i1 P22 = x3Var.P2();
        if (P22 != null) {
            AndroidUtilities.hideKeyboard(P22);
        }
        c4 c4Var = rVar.f11573s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(true);
        }
        rVar.V(false);
        rVar.requestLayout();
    }

    public static i1 M(r rVar) {
        x3 x3Var = rVar.f11572r;
        i1 focusedEditTextOrNull = x3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        i1 i1Var = rVar.F;
        if (i1Var != null) {
            return i1Var;
        }
        return x3Var.P2();
    }

    public static int N(r rVar, i1 i1Var) {
        if (i1Var == rVar.F && rVar.f11572r.getFocusedEditTextOrNull() != i1Var) {
            return Math.min(rVar.G, i1Var.length());
        }
        return Math.max(0, i1Var.getSelectionEnd());
    }

    public static void O(r rVar, int i10, int i11) {
        wi wiVar = rVar.f27043b;
        if (wiVar.f30020f0 == null) {
            return;
        }
        wi wiVar2 = new wi(rVar.getContext(), wiVar.f30020f0, false, false, true, rVar.f27042a);
        wiVar2.Z1 = new n(rVar, wiVar2);
        wiVar2.f30032j0.f0();
        wiVar2.J1(1, true);
        wiVar2.h1(i10);
        wiVar2.f30065t2 = new e(rVar, wiVar2);
        wiVar2.Y = new e(rVar, wiVar2);
        wiVar2.X = new o(rVar, wiVar2);
        wiVar2.r1();
        if (i11 != 0) {
            wiVar2.A1(i11);
        }
        wiVar2.setFocusable(true);
        wiVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        String str2;
        org.telegram.ui.ActionBar.e3 j3 = ok.j(1, context, d6Var, true);
        LinearLayout f7 = ok.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.l1(0.05f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f7.addView(horizontalScrollView, w7.y5.t(-1, -2, 49, 12, 2, 12, 0));
        ci.d g10 = ok.g(24, context, d6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, g10, zArr2, new hi.a(strArr, 2), imageView, d6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, d6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f20491b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new q(strArr, kVar));
        f7.addView(j3Var, w7.y5.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(LocaleController.getString(R.string.Done));
        f7.addView(g10, w7.y5.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        j3.customView = f7;
        j3.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.h3 h3Var2 = org.telegram.ui.Cells.j3.this.f20491b;
                h3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(h3Var2);
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
        j3.show();
        int i10 = org.telegram.ui.ActionBar.h6.f19003a7;
        j3.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        j3.fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        g10.setOnClickListener(new ai.s0(g10, zArr, callback, strArr, j3, 4));
        AndroidUtilities.runOnUIThread(new i2.h0(j3Var, 1), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f27043b.f30057r1.R();
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
    public final void E(oi oiVar) {
        this.f27043b.X0.setTitle("");
        this.f11572r.Y2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override
    public final void G() {
        this.f11572r.x0(0);
    }

    @Override
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        jk jkVar;
        int i12 = this.f11571n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        x3 x3Var = this.f11572r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && d5.f(x3Var.f11735l3, x3Var.f11736m3)) {
            e2.p0(getContext(), new b(x3Var, 0), new d(this, 2), this.f27042a);
            return false;
        }
        if (x3Var.k3() && !x3Var.m3()) {
            if (!x3Var.M3()) {
                c4 c4Var = this.f11573s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(x3Var.M3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                wi wiVar = this.f27043b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30020f0;
                    if ((m2Var instanceof wn) && (jkVar = ((wn) m2Var).Y) != null) {
                        jkVar.R0(d5.k(x3Var.f11735l3), z10, i10, i11);
                        wiVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Z2 = x3Var.Z2();
                    if (!Z2.isEmpty()) {
                        ArrayList B2 = x3Var.B2();
                        ArrayList y22 = x3Var.y2();
                        ArrayList a2 = c5.a(i12, Z2);
                        org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30020f0;
                        if (m2Var2 instanceof wn) {
                            wn wnVar = (wn) m2Var2;
                            MessageObject messageObject3 = wnVar.f39573n5;
                            MessageObject messageObject4 = wnVar.X3;
                            j10 = wnVar.N8();
                            sendMessageChatArguments = wnVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(wiVar.J1), Z2, B2, y22, a2, false, wiVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        wiVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean J() {
        return !this.f11572r.k3();
    }

    public final void P(z70 z70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, z70 z70Var2) {
        boolean z10;
        if (aVar != null && aVar.f11191b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        z70Var.j(z10, i10, null, str, new ai.h5(this, aVar, pageBlock, z70Var2, 18));
        z70Var.y().f18832a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        z70Var.y().f18832a.setTextSize(1, i11);
    }

    public final boolean Q() {
        x3 x3Var = this.f11572r;
        if (x3Var != null && x3Var.k3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27042a);
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                public final r f11444b;

                {
                    this.f11444b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f11444b.f27043b.dismiss();
                            return;
                        default:
                            r rVar = this.f11444b;
                            rVar.T();
                            rVar.f27043b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.z1(this) {
                public final r f11444b;

                {
                    this.f11444b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f11444b.f27043b.dismiss();
                            return;
                        default:
                            r rVar = this.f11444b;
                            rVar.T();
                            rVar.f27043b.dismiss();
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
        if (this.f11576y) {
            this.f11576y = false;
            mz mzVar = this.f11574w;
            if (mzVar != null) {
                mzVar.t(false);
                if (!z10) {
                    this.f11574w.A();
                }
            }
        }
        this.F = null;
        mz mzVar2 = this.f11574w;
        if (mzVar2 != null) {
            mzVar2.setTranslationY(0.0f);
            this.f11574w.setVisibility(8);
        }
        this.f11575x = false;
        this.E = 0;
        c4 c4Var = this.f11573s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(false);
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
        if (this.f11576y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        mz mzVar = this.f11574w;
        float f12 = 0.0f;
        wi wiVar = this.f27043b;
        if (mzVar != null) {
            if (this.f11575x) {
                float f13 = this.E - i10;
                if (this.f11576y) {
                    f11 = -wiVar.f30039l2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            mzVar.setTranslationY(f10);
        }
        c4 c4Var = this.f11573s;
        if (c4Var != null) {
            boolean z10 = this.f11575x;
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
            if (!z10 || this.f11576y) {
                f7 += wiVar.f30039l2;
            }
            c4Var.getBottomContainer().animate().cancel();
            c4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f11575x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f11576y) {
                f12 += wiVar.f30039l2;
            }
            c4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = c4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(sr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f27043b.f30020f0;
        if (m2Var instanceof wn) {
            wn wnVar = (wn) m2Var;
            x3 x3Var = this.f11572r;
            if (!x3Var.r2()) {
                return false;
            }
            TL_iv.RichMessage j22 = x3Var.j2();
            AccountInstance.getInstance(this.f11571n).getMediaDataController().saveDraft(wnVar.a(), wnVar.B7(wnVar.f39573n5), "", null, null, null, null, 0L, false, false, j22);
            jk jkVar = wnVar.Y;
            if (jkVar != null) {
                jkVar.setRichDraftPreview(j22);
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
        if (!this.f11572r.k3() && !this.f11575x) {
            z11 = false;
        } else {
            z11 = true;
        }
        wi wiVar = this.f27043b;
        yh yhVar = wiVar.f30078x1;
        if (wiVar.f30068u2 != z11) {
            wiVar.f30068u2 = z11;
            if (wiVar.S0) {
                yhVar.animate().cancel();
                if (!z11) {
                    yhVar.setVisibility(0);
                }
                float f7 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = yhVar.animate();
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f10).setDuration(180L).withEndAction(new qh(wiVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f7 = 0.0f;
                    }
                    yhVar.setAlpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    yhVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    yhVar.setVisibility(i10);
                }
            }
        }
        if (!z11 && !wiVar.R && wiVar.S0) {
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
        c4 c4Var = this.f11573s;
        if (c4Var != null) {
            x3 x3Var = this.f11572r;
            boolean r22 = x3Var.r2();
            i2 i2Var = x3Var.J3;
            if (i2Var != null && !i2Var.f11425c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = c4Var.f11278r;
            ImageView imageView2 = c4Var.f11277n;
            imageView2.setEnabled(r22);
            float f10 = 0.35f;
            if (r22) {
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
        c4 c4Var = this.f11573s;
        if (c4Var != null) {
            int i10 = this.f11571n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            vg sendButton = c4Var.getSendButton();
            if (z10) {
                x3 x3Var = this.f11572r;
                if (d5.f(x3Var.f11735l3, x3Var.f11736m3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            c4Var.setPremiumLocked(z10);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.Z():void");
    }

    public final void a0() {
        int i10;
        c4 c4Var = this.f11573s;
        if (c4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        x3 x3Var = this.f11572r;
        if (x3Var.getChildCount() <= 0) {
            i10 = x3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < x3Var.getChildCount(); i12++) {
                View childAt = x3Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = x3Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        c4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
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
        x3 x3Var = this.f11572r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f27043b.f30020f0 instanceof wn) && x3Var.r2() && T()) {
                org.telegram.messenger.f0.p(R.string.RichEditorDraftSaved, new xc(this.f11573s, this.f27042a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x3Var.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        mz mzVar;
        x3 x3Var = this.f11572r;
        k3 k3Var = x3Var.f11738n3;
        ca caVar = x3Var.f11740o3;
        if (!k3Var.y() || !caVar.onTouchEvent(motionEvent)) {
            if (this.f11576y && (mzVar = this.f11574w) != null) {
                height = (int) mzVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f11575x && motionEvent.getY() < dp) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && caVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && x3Var.i3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        x3 x3Var = this.f11572r;
        if (x3Var.getChildCount() <= 0) {
            int paddingTop = x3Var.getPaddingTop();
            this.I = paddingTop;
            x3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i11 = 0; i11 < x3Var.getChildCount(); i11++) {
            View childAt = x3Var.getChildAt(i11);
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
        x3Var.setTopGlowOffset(Math.max(0, i10));
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
        return (this.f11572r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public q9 getTextSelectionHelper() {
        return this.f11572r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z10 = this.f11576y;
        if (z10) {
            if (z10) {
                this.f11576y = false;
                mz mzVar = this.f11574w;
                if (mzVar != null) {
                    mzVar.t(false);
                    this.f11574w.A();
                }
                S();
                return false;
            }
        } else if (this.f11575x) {
            R(false);
            return false;
        } else if (!this.f11572r.F2() && !Q()) {
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
        NotificationCenter.ObserversGroup observersGroup;
        vi0 vi0Var = this.O;
        if (vi0Var != null) {
            vi0Var.i();
            this.O = null;
        }
        m.p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.a();
        }
        x3 x3Var = this.f11572r;
        if (x3Var != null) {
            x3Var.v2();
        }
        mz mzVar = this.f11574w;
        if (mzVar != null && (observersGroup = mzVar.I2) != null) {
            observersGroup.removeAllObservers();
            mzVar.I2 = null;
        }
    }

    @Override
    public final boolean n() {
        x3 x3Var = this.f11572r;
        if (x3Var != null) {
            x3Var.v2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f11571n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f11571n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
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
        if (this.f11575x) {
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
        this.f27043b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z10;
        if (this.f27043b.f30057r1.R() > AndroidUtilities.dp(20.0f)) {
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
        if (z10 && this.f11575x && !this.f11576y) {
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

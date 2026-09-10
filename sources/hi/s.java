package hi;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.cj0;
import org.telegram.ui.eo;
import org.telegram.ui.ok;
public final class s extends qi implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public k1 F;
    public int G;
    public w70 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public cj0 O;
    public final e P;
    public final int f9834n;
    public final z3 f9835r;
    public final e4 f9836s;
    public m.r3 v;
    public rz f9837w;
    public boolean f9838x;
    public boolean f9839y;

    public s(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        n nVar = new n(this);
        this.J = true;
        this.P = new e(this, 3);
        this.f9834n = i10;
        this.h = true;
        this.f26424f = true;
        z3 z3Var = new z3(context, i10, f6Var, new of.b(16, this, f6Var));
        this.f9835r = z3Var;
        z3Var.setAdaptiveLinkDialogs(false);
        z3Var.setAllowTapAboveContent(false);
        addView(z3Var, w7.a6.e(-1, -1, 119));
        addView(z3Var.getOverlayView(), w7.a6.e(-1, -1, 119));
        z3Var.y4();
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        e4 e4Var = new e4(context, nVar);
        this.f9836s = e4Var;
        e4Var.setBackVisible(false);
        e4Var.setTopGradientVisible(false);
        Y();
        addView(e4Var, w7.a6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new j(this, 0));
    }

    public static void K(s sVar) {
        boolean z10;
        int i10 = 0;
        if (!sVar.f9835r.j3() && !sVar.f9838x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            yi yiVar = sVar.f26422b;
            if (!yiVar.R && yiVar.S0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (sVar.K != i10) {
            sVar.K = i10;
            sVar.S();
        }
    }

    public static void L(s sVar) {
        z3 z3Var = sVar.f9835r;
        if (sVar.f9838x) {
            k1 O2 = z3Var.O2();
            if (O2 != null) {
                O2.r();
                AndroidUtilities.showKeyboard(O2);
            }
            sVar.R(true);
            return;
        }
        yi yiVar = sVar.f26422b;
        if (sVar.f9837w == null) {
            rz rzVar = new rz(yiVar.f29366f0, true, false, false, sVar.getContext(), true, null, yiVar.f29403r1, true, sVar.f26421a, false, false);
            sVar.f9837w = rzVar;
            rzVar.setVisibility(8);
            rz rzVar2 = sVar.f9837w;
            rzVar2.f26873x2 = false;
            rzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = sVar.f9837w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            sVar.f9837w.setDelegate(new q(sVar));
            sVar.addView(sVar.f9837w, w7.a6.e(-1, sVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = sVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVar.f9837w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        sVar.f9837w.setLayoutParams(layoutParams);
        sVar.f9837w.setTranslationY(0.0f);
        sVar.f9837w.setVisibility(0);
        sVar.f9838x = true;
        sVar.E = emojiPanelHeight;
        k1 O22 = z3Var.O2();
        if (O22 != null) {
            AndroidUtilities.hideKeyboard(O22);
        }
        e4 e4Var = sVar.f9836s;
        if (e4Var != null) {
            e4Var.setEmojiOpened(true);
        }
        sVar.V(false);
        sVar.requestLayout();
    }

    public static k1 M(s sVar) {
        z3 z3Var = sVar.f9835r;
        k1 focusedEditTextOrNull = z3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            sVar.F = focusedEditTextOrNull;
            sVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        k1 k1Var = sVar.F;
        if (k1Var != null) {
            return k1Var;
        }
        return z3Var.O2();
    }

    public static int N(s sVar, k1 k1Var) {
        if (k1Var == sVar.F && sVar.f9835r.getFocusedEditTextOrNull() != k1Var) {
            return Math.min(sVar.G, k1Var.length());
        }
        return Math.max(0, k1Var.getSelectionEnd());
    }

    public static void O(s sVar, int i10, int i11) {
        yi yiVar = sVar.f26422b;
        if (yiVar.f29366f0 == null) {
            return;
        }
        yi yiVar2 = new yi(sVar.getContext(), yiVar.f29366f0, false, false, true, sVar.f26421a);
        yiVar2.Z1 = new o(sVar, yiVar2);
        yiVar2.f29378j0.f0();
        yiVar2.J1(1, true);
        yiVar2.h1(i10);
        yiVar2.f29411t2 = new f(sVar, yiVar2);
        yiVar2.Y = new f(sVar, yiVar2);
        yiVar2.X = new p(sVar, yiVar2);
        yiVar2.r1();
        if (i11 != 0) {
            yiVar2.A1(i11);
        }
        yiVar2.setFocusable(true);
        yiVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        String str2;
        org.telegram.ui.ActionBar.h3 i10 = em.i(1, context, f6Var, true);
        LinearLayout f7 = em.f(context, 1);
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
        f7.addView(horizontalScrollView, w7.a6.t(-1, -2, 49, 12, 2, 12, 0));
        bi.d g10 = em.g(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        l lVar = new l(strArr, horizontalScrollView, g10, zArr2, new gi.a(strArr, 2), imageView, f6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f19293b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
        i3Var.setText(strArr[0]);
        g3Var.addTextChangedListener(new r(strArr, lVar));
        f7.addView(i3Var, w7.a6.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(LocaleController.getString(R.string.Done));
        f7.addView(g10, w7.a6.t(-1, 48, 55, 12, 12, 12, 12));
        lVar.run();
        i10.customView = f7;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.g3 g3Var2 = org.telegram.ui.Cells.i3.this.f19293b;
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
        int i11 = org.telegram.ui.ActionBar.j6.f17872a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        g10.setOnClickListener(new c(g10, zArr, callback, strArr, i10, 0));
        AndroidUtilities.runOnUIThread(new gg.v1(i3Var, 3), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f26422b.f29403r1.R();
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
    public final void D(qi qiVar) {
        this.f26422b.X0.setTitle("");
        this.f9835r.Y2.N(false);
        V(false);
        post(new e(this, 4));
    }

    @Override
    public final void F() {
        this.f9835r.x0(0);
    }

    @Override
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        ok okVar;
        int i12 = this.f9834n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        z3 z3Var = this.f9835r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && f5.f(z3Var.f10008l3, z3Var.f10009m3)) {
            g2.p0(getContext(), new b(z3Var, 0), new e(this, 2), this.f26421a);
            return false;
        }
        if (z3Var.j3() && !z3Var.l3()) {
            if (!z3Var.L3()) {
                e4 e4Var = this.f9836s;
                if (e4Var != null) {
                    e4Var.setSendEnabled(z3Var.L3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                yi yiVar = this.f26422b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
                    if ((p2Var instanceof eo) && (okVar = ((eo) p2Var).Y) != null) {
                        okVar.R0(f5.k(z3Var.f10008l3), z10, i10, i11);
                        yiVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Y2 = z3Var.Y2();
                    if (!Y2.isEmpty()) {
                        ArrayList A2 = z3Var.A2();
                        ArrayList x22 = z3Var.x2();
                        ArrayList a2 = e5.a(i12, Y2);
                        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f29366f0;
                        if (p2Var2 instanceof eo) {
                            eo eoVar = (eo) p2Var2;
                            MessageObject messageObject3 = eoVar.f32421n5;
                            MessageObject messageObject4 = eoVar.X3;
                            j10 = eoVar.N8();
                            sendMessageChatArguments = eoVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(yiVar.J1), Y2, A2, x22, a2, false, yiVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        yiVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean J() {
        return !this.f9835r.j3();
    }

    public final void P(w70 w70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, w70 w70Var2) {
        boolean z10;
        if (aVar != null && aVar.f9421b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        w70Var.j(z10, i10, null, str, new androidx.car.app.utils.b(this, aVar, pageBlock, w70Var2, 14));
        w70Var.y().f17723a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        w70Var.y().f17723a.setTextSize(1, i11);
    }

    public final boolean Q() {
        z3 z3Var = this.f9835r;
        if (z3Var != null && z3Var.j3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26421a);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                public final s f9685b;

                {
                    this.f9685b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f9685b.f26422b.dismiss();
                            return;
                        default:
                            s sVar = this.f9685b;
                            sVar.T();
                            sVar.f26422b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.c2(this) {
                public final s f9685b;

                {
                    this.f9685b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f9685b.f26422b.dismiss();
                            return;
                        default:
                            s sVar = this.f9685b;
                            sVar.T();
                            sVar.f26422b.dismiss();
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
        if (this.f9839y) {
            this.f9839y = false;
            rz rzVar = this.f9837w;
            if (rzVar != null) {
                rzVar.t(false);
                if (!z10) {
                    this.f9837w.A();
                }
            }
        }
        this.F = null;
        rz rzVar2 = this.f9837w;
        if (rzVar2 != null) {
            rzVar2.setTranslationY(0.0f);
            this.f9837w.setVisibility(8);
        }
        this.f9838x = false;
        this.E = 0;
        e4 e4Var = this.f9836s;
        if (e4Var != null) {
            e4Var.setEmojiOpened(false);
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
        if (this.f9839y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        rz rzVar = this.f9837w;
        float f12 = 0.0f;
        yi yiVar = this.f26422b;
        if (rzVar != null) {
            if (this.f9838x) {
                float f13 = this.E - i10;
                if (this.f9839y) {
                    f11 = -yiVar.f29385l2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            rzVar.setTranslationY(f10);
        }
        e4 e4Var = this.f9836s;
        if (e4Var != null) {
            boolean z10 = this.f9838x;
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
            if (!z10 || this.f9839y) {
                f7 += yiVar.f29385l2;
            }
            e4Var.getBottomContainer().animate().cancel();
            e4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f9838x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f9839y) {
                f12 += yiVar.f29385l2;
            }
            e4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = e4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(wr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26422b.f29366f0;
        if (p2Var instanceof eo) {
            eo eoVar = (eo) p2Var;
            z3 z3Var = this.f9835r;
            if (!z3Var.q2()) {
                return false;
            }
            TL_iv.RichMessage i22 = z3Var.i2();
            AccountInstance.getInstance(this.f9834n).getMediaDataController().saveDraft(eoVar.a(), eoVar.B7(eoVar.f32421n5), "", null, null, null, null, 0L, false, false, i22);
            ok okVar = eoVar.Y;
            if (okVar != null) {
                okVar.setRichDraftPreview(i22);
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
        if (!this.f9835r.j3() && !this.f9838x) {
            z11 = false;
        } else {
            z11 = true;
        }
        yi yiVar = this.f26422b;
        ai aiVar = yiVar.f29424x1;
        if (yiVar.f29414u2 != z11) {
            yiVar.f29414u2 = z11;
            if (yiVar.S0) {
                aiVar.animate().cancel();
                if (!z11) {
                    aiVar.setVisibility(0);
                }
                float f7 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = aiVar.animate();
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f10).setDuration(180L).withEndAction(new sh(yiVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f7 = 0.0f;
                    }
                    aiVar.setAlpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    aiVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    aiVar.setVisibility(i10);
                }
            }
        }
        if (!z11 && !yiVar.R && yiVar.S0) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.s.W():void");
    }

    public final void X() {
        boolean z10;
        float f7;
        e4 e4Var = this.f9836s;
        if (e4Var != null) {
            z3 z3Var = this.f9835r;
            boolean q22 = z3Var.q2();
            k2 k2Var = z3Var.J3;
            if (k2Var != null && !k2Var.f9699c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = e4Var.f9551r;
            ImageView imageView2 = e4Var.f9550n;
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
        e4 e4Var = this.f9836s;
        if (e4Var != null) {
            int i10 = this.f9834n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            xg sendButton = e4Var.getSendButton();
            if (z10) {
                z3 z3Var = this.f9835r;
                if (f5.f(z3Var.f10008l3, z3Var.f10009m3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            e4Var.setPremiumLocked(z10);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: hi.s.Z():void");
    }

    public final void a0() {
        int i10;
        e4 e4Var = this.f9836s;
        if (e4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        z3 z3Var = this.f9835r;
        if (z3Var.getChildCount() <= 0) {
            i10 = z3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < z3Var.getChildCount(); i12++) {
                View childAt = z3Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = z3Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        e4Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
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
        z3 z3Var = this.f9835r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f26422b.f29366f0 instanceof eo) && z3Var.q2() && T()) {
                org.telegram.messenger.a2.o(R.string.RichEditorDraftSaved, new wc(this.f9836s, this.f26421a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!z3Var.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        rz rzVar;
        z3 z3Var = this.f9835r;
        m3 m3Var = z3Var.f10011n3;
        ea eaVar = z3Var.f10013o3;
        if (!m3Var.y() || !eaVar.onTouchEvent(motionEvent)) {
            if (this.f9839y && (rzVar = this.f9837w) != null) {
                height = (int) rzVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f9838x && motionEvent.getY() < dp) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && eaVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && z3Var.h3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        z3 z3Var = this.f9835r;
        if (z3Var.getChildCount() <= 0) {
            int paddingTop = z3Var.getPaddingTop();
            this.I = paddingTop;
            z3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i11 = 0; i11 < z3Var.getChildCount(); i11++) {
            View childAt = z3Var.getChildAt(i11);
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
        z3Var.setTopGlowOffset(Math.max(0, i10));
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
        return (this.f9835r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }

    public s9 getTextSelectionHelper() {
        return this.f9835r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z10 = this.f9839y;
        if (z10) {
            if (z10) {
                this.f9839y = false;
                rz rzVar = this.f9837w;
                if (rzVar != null) {
                    rzVar.t(false);
                    this.f9837w.A();
                }
                S();
                return false;
            }
        } else if (this.f9838x) {
            R(false);
            return false;
        } else if (!this.f9835r.E2() && !Q()) {
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
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        z3 z3Var = this.f9835r;
        if (z3Var != null) {
            z3Var.u2();
        }
        rz rzVar = this.f9837w;
        if (rzVar != null) {
            rzVar.D();
        }
    }

    @Override
    public final boolean n() {
        z3 z3Var = this.f9835r;
        if (z3Var != null) {
            z3Var.u2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f9834n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f9834n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
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
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        if (this.f9838x) {
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
        this.f26422b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z10;
        if (this.f26422b.f29403r1.R() > AndroidUtilities.dp(20.0f)) {
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
        if (z10 && this.f9838x && !this.f9839y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: hi.s.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}

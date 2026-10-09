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
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.dj0;
import org.telegram.ui.ok;
import org.telegram.ui.zn;
public final class r extends qi implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public i1 F;
    public int G;
    public p80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public dj0 O;
    public final d P;
    public final int f12649n;
    public final x3 f12650r;
    public final c4 f12651s;
    public m.q3 v;
    public a00 f12652w;
    public boolean f12653x;
    public boolean f12654y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f12649n = i10;
        this.h = true;
        this.f30176f = true;
        x3 x3Var = new x3(context, i10, e6Var, new pf.b(20, this, e6Var));
        this.f12650r = x3Var;
        x3Var.setAdaptiveLinkDialogs(false);
        x3Var.setAllowTapAboveContent(false);
        addView(x3Var, w7.x5.e(-1, -1, 119));
        addView(x3Var.getOverlayView(), w7.x5.e(-1, -1, 119));
        x3Var.A4();
        i2 i2Var = x3Var.H3;
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
        this.f12651s = c4Var;
        c4Var.setBackVisible(false);
        c4Var.setTopGradientVisible(false);
        b0();
        addView(c4Var, w7.x5.e(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(r rVar) {
        boolean z10;
        int i10 = 0;
        if (!rVar.f12650r.l3() && !rVar.f12653x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            yi yiVar = rVar.f30173b;
            if (!yiVar.R && yiVar.V0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (rVar.K != i10) {
            rVar.K = i10;
            rVar.V();
        }
    }

    public static void O(r rVar) {
        x3 x3Var = rVar.f12650r;
        if (rVar.f12653x) {
            i1 Q2 = x3Var.Q2();
            if (Q2 != null) {
                Q2.r();
                AndroidUtilities.showKeyboard(Q2);
            }
            rVar.U(true);
            return;
        }
        yi yiVar = rVar.f30173b;
        if (rVar.f12652w == null) {
            a00 a00Var = new a00(yiVar.f33228f0, true, false, false, rVar.getContext(), true, null, yiVar.f33275u1, true, rVar.f30172a, false, false);
            rVar.f12652w = a00Var;
            a00Var.setVisibility(8);
            a00 a00Var2 = rVar.f12652w;
            a00Var2.f24466w2 = false;
            a00Var2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.f12652w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.f12652w.setDelegate(new p(rVar));
            rVar.addView(rVar.f12652w, w7.x5.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.f12652w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.f12652w.setLayoutParams(layoutParams);
        rVar.f12652w.setTranslationY(0.0f);
        rVar.f12652w.setVisibility(0);
        rVar.f12653x = true;
        rVar.E = emojiPanelHeight;
        i1 Q22 = x3Var.Q2();
        if (Q22 != null) {
            AndroidUtilities.hideKeyboard(Q22);
        }
        c4 c4Var = rVar.f12651s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(true);
        }
        rVar.Y(false);
        rVar.requestLayout();
    }

    public static i1 P(r rVar) {
        x3 x3Var = rVar.f12650r;
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
        return x3Var.Q2();
    }

    public static int Q(r rVar, i1 i1Var) {
        if (i1Var == rVar.F && rVar.f12650r.getFocusedEditTextOrNull() != i1Var) {
            return Math.min(rVar.G, i1Var.length());
        }
        return Math.max(0, i1Var.getSelectionEnd());
    }

    public static void R(r rVar, int i10, int i11) {
        yi yiVar = rVar.f30173b;
        if (yiVar.f33228f0 == null) {
            return;
        }
        yi yiVar2 = new yi(rVar.getContext(), yiVar.f33228f0, false, false, true, rVar.f30172a);
        yiVar2.f33219c2 = new n(rVar, yiVar2);
        yiVar2.f33240j0.f0();
        yiVar2.N1(1, true);
        yiVar2.j1(i10);
        yiVar2.f33283w2 = new e(rVar, yiVar2);
        yiVar2.Y = new e(rVar, yiVar2);
        yiVar2.X = new o(rVar, yiVar2);
        yiVar2.t1();
        if (i11 != 0) {
            yiVar2.D1(i11);
        }
        yiVar2.setFocusable(true);
        yiVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        String str2;
        org.telegram.ui.ActionBar.f3 i10 = bi.i(1, context, e6Var, true);
        LinearLayout e7 = bi.e(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.m1(0.05f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e7.addView(horizontalScrollView, w7.x5.t(-1, -2, 49, 12, 2, 12, 0));
        ci.d f7 = bi.f(24, context, e6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, f7, zArr2, new hi.a(strArr, 2), imageView, e6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, e6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22297b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new q(strArr, kVar));
        e7.addView(j3Var, w7.x5.t(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        e7.addView(f7, w7.x5.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i10.customView = e7;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.h3 h3Var2 = org.telegram.ui.Cells.j3.this.f22297b;
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
        i10.show();
        int i11 = org.telegram.ui.ActionBar.i6.f20741a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        f7.setOnClickListener(new ai.s0(f7, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new i2.h0(j3Var, 1), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f30173b.f33275u1.R();
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
    public final void C(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.C(int, int):void");
    }

    @Override
    public final void G(qi qiVar) {
        this.f30173b.f33211a1.setTitle("");
        this.f12650r.W2.N(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f12650r.x0(0);
    }

    @Override
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        ok okVar;
        int i12 = this.f12649n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        x3 x3Var = this.f12650r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && e5.f(x3Var.j3, x3Var.f12818k3)) {
            e2.p0(getContext(), new b(x3Var, 0), new d(this, 2), this.f30172a);
            return false;
        }
        if (x3Var.l3() && !x3Var.n3()) {
            if (!x3Var.N3()) {
                c4 c4Var = this.f12651s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(x3Var.N3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                yi yiVar = this.f30173b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
                    if ((n2Var instanceof zn) && (okVar = ((zn) n2Var).Y) != null) {
                        okVar.P0(e5.k(x3Var.j3), z10, i10, i11);
                        yiVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList a32 = x3Var.a3();
                    if (!a32.isEmpty()) {
                        ArrayList C2 = x3Var.C2();
                        ArrayList z22 = x3Var.z2();
                        ArrayList a2 = d5.a(i12, a32);
                        org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f33228f0;
                        if (n2Var2 instanceof zn) {
                            zn znVar = (zn) n2Var2;
                            MessageObject messageObject3 = znVar.f44868n5;
                            MessageObject messageObject4 = znVar.X3;
                            j10 = znVar.S8();
                            sendMessageChatArguments = znVar.H8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(yiVar.M1), a32, C2, z22, a2, false, yiVar.p1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        yiVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean L() {
        return !this.f12650r.l3();
    }

    public final void S(p80 p80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, p80 p80Var2) {
        boolean z10;
        if (aVar != null && aVar.f12234b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        p80Var.j(z10, i10, null, str, new ai.i5(this, aVar, pageBlock, p80Var2, 18));
        p80Var.y().f20575a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        p80Var.y().f20575a.setTextSize(1, i11);
    }

    public final boolean T() {
        x3 x3Var = this.f12650r;
        if (x3Var != null && x3Var.l3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30172a);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                public final r f12499b;

                {
                    this.f12499b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f12499b.f30173b.dismiss();
                            return;
                        default:
                            r rVar = this.f12499b;
                            rVar.W();
                            rVar.f30173b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.a2(this) {
                public final r f12499b;

                {
                    this.f12499b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f12499b.f30173b.dismiss();
                            return;
                        default:
                            r rVar = this.f12499b;
                            rVar.W();
                            rVar.f30173b.dismiss();
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

    public final void U(boolean z10) {
        if (this.f12654y) {
            this.f12654y = false;
            a00 a00Var = this.f12652w;
            if (a00Var != null) {
                a00Var.u(false);
                if (!z10) {
                    this.f12652w.C();
                }
            }
        }
        this.F = null;
        a00 a00Var2 = this.f12652w;
        if (a00Var2 != null) {
            a00Var2.setTranslationY(0.0f);
            this.f12652w.setVisibility(8);
        }
        this.f12653x = false;
        this.E = 0;
        c4 c4Var = this.f12651s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(false);
        }
        Y(false);
        requestLayout();
    }

    public final void V() {
        int i10;
        int i11;
        float f7;
        int i12;
        float f10;
        float f11;
        if (this.f12654y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        a00 a00Var = this.f12652w;
        float f12 = 0.0f;
        yi yiVar = this.f30173b;
        if (a00Var != null) {
            if (this.f12653x) {
                float f13 = this.E - i10;
                if (this.f12654y) {
                    f11 = -yiVar.f33256o2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            a00Var.setTranslationY(f10);
        }
        c4 c4Var = this.f12651s;
        if (c4Var != null) {
            boolean z10 = this.f12653x;
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
            if (!z10 || this.f12654y) {
                f7 += yiVar.f33256o2;
            }
            c4Var.getBottomContainer().animate().cancel();
            c4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f12653x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f12654y) {
                f12 += yiVar.f33256o2;
            }
            c4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = c4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(hs.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30173b.f33228f0;
        if (n2Var instanceof zn) {
            zn znVar = (zn) n2Var;
            x3 x3Var = this.f12650r;
            if (!x3Var.s2()) {
                return false;
            }
            TL_iv.RichMessage k22 = x3Var.k2();
            AccountInstance.getInstance(this.f12649n).getMediaDataController().saveDraft(znVar.a(), znVar.E7(znVar.f44868n5), "", null, null, null, null, 0L, false, false, k22);
            ok okVar = znVar.Y;
            if (okVar != null) {
                okVar.setRichDraftPreview(k22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void Y(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (!this.f12650r.l3() && !this.f12653x) {
            z11 = false;
        } else {
            z11 = true;
        }
        yi yiVar = this.f30173b;
        ai aiVar = yiVar.A1;
        if (yiVar.f33287x2 != z11) {
            yiVar.f33287x2 = z11;
            if (yiVar.V0) {
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
        if (!z11 && !yiVar.R && yiVar.V0) {
            i11 = AndroidUtilities.dp(62.0f);
        }
        this.K = i11;
        V();
        if (this.J == z11) {
            this.J = !z11;
            requestLayout();
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.Z():void");
    }

    public final void a0() {
        boolean z10;
        float f7;
        c4 c4Var = this.f12651s;
        if (c4Var != null) {
            x3 x3Var = this.f12650r;
            boolean s22 = x3Var.s2();
            i2 i2Var = x3Var.H3;
            if (i2Var != null && !i2Var.f12484c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = c4Var.f12321r;
            ImageView imageView2 = c4Var.f12320n;
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

    public final void b0() {
        boolean z10;
        c4 c4Var = this.f12651s;
        if (c4Var != null) {
            int i10 = this.f12649n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            xg sendButton = c4Var.getSendButton();
            if (z10) {
                x3 x3Var = this.f12650r;
                if (e5.f(x3Var.j3, x3Var.f12818k3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            c4Var.setPremiumLocked(z10);
        }
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.c0():void");
    }

    public final void d0() {
        int i10;
        c4 c4Var = this.f12651s;
        if (c4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        x3 x3Var = this.f12650r;
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
            b0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        x3 x3Var = this.f12650r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f30173b.f33228f0 instanceof zn) && x3Var.s2() && W()) {
                org.telegram.messenger.q.q(R.string.RichEditorDraftSaved, new ad(this.f12651s, this.f30172a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x3Var.i3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        a00 a00Var;
        x3 x3Var = this.f12650r;
        k3 k3Var = x3Var.f12820l3;
        aa aaVar = x3Var.f12821m3;
        if (!k3Var.x() || !aaVar.onTouchEvent(motionEvent)) {
            if (this.f12654y && (a00Var = this.f12652w) != null) {
                height = (int) a00Var.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f12653x && motionEvent.getY() < dp) {
                U(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && aaVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && x3Var.j3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        x3 x3Var = this.f12650r;
        if (x3Var.getChildCount() <= 0) {
            int paddingTop = x3Var.getPaddingTop();
            this.I = paddingTop;
            x3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
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
        return (this.f12650r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public o9 getTextSelectionHelper() {
        return this.f12650r.getTextSelectionHelper();
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final boolean j() {
        boolean z10 = this.f12654y;
        if (z10) {
            if (z10) {
                this.f12654y = false;
                a00 a00Var = this.f12652w;
                if (a00Var != null) {
                    a00Var.u(false);
                    this.f12652w.C();
                }
                V();
                return false;
            }
        } else if (this.f12653x) {
            U(false);
            return false;
        } else if (!this.f12650r.G2() && !T()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(float f7) {
        V();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f12649n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f12649n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void p() {
        NotificationCenter.ObserversGroup observersGroup;
        dj0 dj0Var = this.O;
        if (dj0Var != null) {
            dj0Var.i();
            this.O = null;
        }
        m.q3 q3Var = this.v;
        if (q3Var != null) {
            q3Var.a();
        }
        x3 x3Var = this.f12650r;
        if (x3Var != null) {
            x3Var.w2();
        }
        a00 a00Var = this.f12652w;
        if (a00Var != null && (observersGroup = a00Var.I2) != null) {
            observersGroup.removeAllObservers();
            a00Var.I2 = null;
        }
    }

    @Override
    public final boolean q() {
        x3 x3Var = this.f12650r;
        if (x3Var != null) {
            x3Var.w2();
            return false;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!T()) {
            return false;
        }
        return true;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        m.q3 q3Var = this.v;
        if (q3Var != null) {
            q3Var.a();
        }
        if (this.f12653x) {
            U(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f30173b.f33275u1.R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        V();
        d0();
    }

    @Override
    public final void z(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.f12653x && !this.f12654y) {
            U(false);
        }
        d0();
    }

    @Override
    public final void t() {
    }
}

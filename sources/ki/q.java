package ki;

import ai.m8;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
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
import ei.bc;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.xc;
import org.telegram.ui.gk;
import org.telegram.ui.qi0;
import org.telegram.ui.sn;
public final class q extends li implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public h1 F;
    public int G;
    public j80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public qi0 O;
    public final d P;
    public final int f15507n;
    public final w3 f15508r;
    public final b4 f15509s;
    public m.s3 v;
    public tz f15510w;
    public boolean f15511x;
    public boolean f15512y;

    public q(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, ti tiVar) {
        super(context, g6Var, tiVar);
        l lVar = new l(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f15507n = i10;
        this.h = true;
        this.f28368f = true;
        w3 w3Var = new w3(context, i10, g6Var, new n4.s(this, g6Var, false, 27));
        this.f15508r = w3Var;
        w3Var.setAdaptiveLinkDialogs(false);
        w3Var.setAllowTapAboveContent(false);
        addView(w3Var, w7.z5.e(-1, -1, 119));
        addView(w3Var.getOverlayView(), w7.z5.e(-1, -1, 119));
        w3Var.F4();
        h2 h2Var = w3Var.K3;
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
        b4 b4Var = new b4(context, lVar);
        this.f15509s = b4Var;
        b4Var.setBackVisible(false);
        b4Var.setTopGradientVisible(false);
        b0();
        addView(b4Var, w7.z5.e(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(q qVar) {
        boolean z10;
        int i10 = 0;
        if (!qVar.f15508r.q3() && !qVar.f15511x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ti tiVar = qVar.f28366b;
            if (!tiVar.R && tiVar.V0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (qVar.K != i10) {
            qVar.K = i10;
            qVar.V();
        }
    }

    public static void O(q qVar) {
        w3 w3Var = qVar.f15508r;
        if (qVar.f15511x) {
            h1 V2 = w3Var.V2();
            if (V2 != null) {
                V2.r();
                AndroidUtilities.showKeyboard(V2);
            }
            qVar.U(true);
            return;
        }
        ti tiVar = qVar.f28366b;
        if (qVar.f15510w == null) {
            tz tzVar = new tz(tiVar.f30730f0, true, false, false, qVar.getContext(), true, null, tiVar.f30777u1, true, qVar.f28365a, false, false);
            qVar.f15510w = tzVar;
            tzVar.setVisibility(8);
            tz tzVar2 = qVar.f15510w;
            tzVar2.f31034x2 = false;
            tzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.f15510w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.f15510w.setDelegate(new o(qVar));
            qVar.addView(qVar.f15510w, w7.z5.e(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.f15510w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.f15510w.setLayoutParams(layoutParams);
        qVar.f15510w.setTranslationY(0.0f);
        qVar.f15510w.setVisibility(0);
        qVar.f15511x = true;
        qVar.E = emojiPanelHeight;
        h1 V22 = w3Var.V2();
        if (V22 != null) {
            AndroidUtilities.hideKeyboard(V22);
        }
        b4 b4Var = qVar.f15509s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(true);
        }
        qVar.Y(false);
        qVar.requestLayout();
    }

    public static h1 P(q qVar) {
        w3 w3Var = qVar.f15508r;
        h1 focusedEditTextOrNull = w3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            qVar.F = focusedEditTextOrNull;
            qVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        h1 h1Var = qVar.F;
        if (h1Var != null) {
            return h1Var;
        }
        return w3Var.V2();
    }

    public static int Q(q qVar, h1 h1Var) {
        if (h1Var == qVar.F && qVar.f15508r.getFocusedEditTextOrNull() != h1Var) {
            return Math.min(qVar.G, h1Var.length());
        }
        return Math.max(0, h1Var.getSelectionEnd());
    }

    public static void R(q qVar, int i10, int i11) {
        ti tiVar = qVar.f28366b;
        if (tiVar.f30730f0 == null) {
            return;
        }
        ti tiVar2 = new ti(qVar.getContext(), tiVar.f30730f0, false, false, true, qVar.f28365a);
        tiVar2.f30722c2 = new m(qVar, tiVar2);
        tiVar2.f30742j0.f0();
        tiVar2.R1(1, true);
        tiVar2.m1(i10);
        tiVar2.f30796z2 = new e(qVar, tiVar2);
        tiVar2.Y = new e(qVar, tiVar2);
        tiVar2.X = new n(qVar, tiVar2);
        tiVar2.w1();
        if (i11 != 0) {
            tiVar2.G1(i11);
        }
        tiVar2.setFocusable(true);
        tiVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        String str2;
        org.telegram.ui.ActionBar.h3 j10 = sl.j(1, context, g6Var, true);
        LinearLayout e = sl.e(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = k6.G6;
        ShapeDrawable c02 = k6.c0(dp, k6.o1(0.05f, k6.w0(i10, g6Var)));
        n6 M = r6.M(0.05f, i10);
        imageView.setBackground(c02);
        r6.k(imageView, c02, M, null, g6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e.addView(horizontalScrollView, w7.z5.t(-1, -2, 49, 12, 2, 12, 0));
        ei.d g10 = sl.g(24, context, g6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        m8 m8Var = new m8(strArr, horizontalScrollView, g10, zArr2, new hg.o(strArr, 13), imageView, g6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, g6Var);
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        int dp2 = AndroidUtilities.dp(24.0f);
        int i11 = k6.f21183d6;
        ShapeDrawable c03 = k6.c0(dp2, k6.w0(i11, g6Var));
        n6 O = r6.O(i11);
        h3Var.setBackground(c03);
        r6.k(h3Var, c03, O, null, g6Var);
        h3Var.setText(strArr[0]);
        f3Var.addTextChangedListener(new p(strArr, m8Var));
        e.addView(h3Var, w7.z5.t(-1, -2, 55, 12, 8, 12, 0));
        g10.setText(LocaleController.getString(R.string.Done));
        e.addView(g10, w7.z5.t(-1, 48, 55, 12, 12, 12, 12));
        m8Var.run();
        j10.customView = e;
        j10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.f3 f3Var2 = org.telegram.ui.Cells.h3.this.d;
                f3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(f3Var2);
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
        j10.show();
        int i12 = k6.f21125a7;
        j10.setBackgroundColorKey(i12);
        j10.fixNavigationBarKey(i12);
        g10.setOnClickListener(new ci.e0(g10, zArr, callback, strArr, j10, 4));
        AndroidUtilities.runOnUIThread(new bc(h3Var, 29), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q2 = this.f28366b.f30777u1.Q();
        if (Q2 <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            Q2 = globalEmojiSettings.getInt(str, AndroidUtilities.dp(200.0f));
        }
        if (Q2 <= 0) {
            Q2 = AndroidUtilities.dp(200.0f);
        }
        return Q2 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: ki.q.B(int, int):void");
    }

    @Override
    public final void F(li liVar) {
        this.f28366b.f30714a1.setTitle("");
        this.f15508r.Z2.N(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f15508r.x0(0);
    }

    @Override
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        gk gkVar;
        int i12 = this.f15507n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        w3 w3Var = this.f15508r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && c5.f(w3Var.f15663m3, w3Var.f15665n3)) {
            d2.p0(getContext(), new b(w3Var, 0), new d(this, 2), this.f28365a);
            return false;
        }
        if (w3Var.q3() && !w3Var.s3()) {
            if (!w3Var.S3()) {
                b4 b4Var = this.f15509s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(w3Var.S3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                ti tiVar = this.f28366b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
                    if ((o2Var instanceof sn) && (gkVar = ((sn) o2Var).Y) != null) {
                        gkVar.P0(c5.k(w3Var.f15663m3), z10, i10, i11);
                        tiVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList f32 = w3Var.f3();
                    if (!f32.isEmpty()) {
                        ArrayList H2 = w3Var.H2();
                        ArrayList E2 = w3Var.E2();
                        ArrayList a2 = b5.a(i12, f32);
                        org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f30730f0;
                        if (o2Var2 instanceof sn) {
                            sn snVar = (sn) o2Var2;
                            MessageObject messageObject3 = snVar.f41767z5;
                            MessageObject messageObject4 = snVar.f41564j4;
                            j11 = snVar.S8();
                            sendMessageChatArguments = snVar.H8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(tiVar.M1), f32, H2, E2, a2, false, tiVar.s1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        tiVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean L() {
        return !this.f15508r.q3();
    }

    public final void S(j80 j80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, j80 j80Var2) {
        boolean z10;
        if (aVar != null && aVar.f15141b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        j80Var.j(z10, i10, null, str, new ai.y0(this, aVar, pageBlock, j80Var2, 24));
        j80Var.y().f20835a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        j80Var.y().f20835a.setTextSize(1, i11);
    }

    public final boolean T() {
        w3 w3Var = this.f15508r;
        if (w3Var != null && w3Var.q3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28365a);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                public final q f15398b;

                {
                    this.f15398b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f15398b.f28366b.dismiss();
                            return;
                        default:
                            q qVar = this.f15398b;
                            qVar.W();
                            qVar.f28366b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.z1(this) {
                public final q f15398b;

                {
                    this.f15398b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f15398b.f28366b.dismiss();
                            return;
                        default:
                            q qVar = this.f15398b;
                            qVar.W();
                            qVar.f28366b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-2);
            alertDialog$Builder.p();
            return false;
        }
        return true;
    }

    public final void U(boolean z10) {
        if (this.f15512y) {
            this.f15512y = false;
            tz tzVar = this.f15510w;
            if (tzVar != null) {
                tzVar.u(false);
                if (!z10) {
                    this.f15510w.B();
                }
            }
        }
        this.F = null;
        tz tzVar2 = this.f15510w;
        if (tzVar2 != null) {
            tzVar2.setTranslationY(0.0f);
            this.f15510w.setVisibility(8);
        }
        this.f15511x = false;
        this.E = 0;
        b4 b4Var = this.f15509s;
        if (b4Var != null) {
            b4Var.setEmojiOpened(false);
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
        if (this.f15512y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        tz tzVar = this.f15510w;
        float f12 = 0.0f;
        ti tiVar = this.f28366b;
        if (tzVar != null) {
            if (this.f15511x) {
                float f13 = this.E - i10;
                if (this.f15512y) {
                    f11 = -tiVar.f30758o2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            tzVar.setTranslationY(f10);
        }
        b4 b4Var = this.f15509s;
        if (b4Var != null) {
            boolean z10 = this.f15511x;
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
            if (!z10 || this.f15512y) {
                f7 += tiVar.f30758o2;
            }
            b4Var.getBottomContainer().animate().cancel();
            b4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f15511x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f15512y) {
                f12 += tiVar.f30758o2;
            }
            b4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = b4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(bs.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28366b.f30730f0;
        if (o2Var instanceof sn) {
            sn snVar = (sn) o2Var;
            w3 w3Var = this.f15508r;
            if (!w3Var.x2()) {
                return false;
            }
            TL_iv.RichMessage p22 = w3Var.p2();
            AccountInstance.getInstance(this.f15507n).getMediaDataController().saveDraft(snVar.a(), snVar.E7(snVar.f41767z5), "", null, null, null, null, 0L, false, false, p22);
            gk gkVar = snVar.Y;
            if (gkVar != null) {
                gkVar.setRichDraftPreview(p22);
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
        if (!this.f15508r.q3() && !this.f15511x) {
            z11 = false;
        } else {
            z11 = true;
        }
        ti tiVar = this.f28366b;
        wh whVar = tiVar.A1;
        if (tiVar.A2 != z11) {
            tiVar.A2 = z11;
            if (tiVar.V0) {
                whVar.animate().cancel();
                if (!z11) {
                    whVar.setVisibility(0);
                }
                float f7 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = whVar.animate();
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f10).setDuration(180L).withEndAction(new ph(tiVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f7 = 0.0f;
                    }
                    whVar.setAlpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    whVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    whVar.setVisibility(i10);
                }
            }
        }
        if (!z11 && !tiVar.R && tiVar.V0) {
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
        throw new UnsupportedOperationException("Method not decompiled: ki.q.Z():void");
    }

    public final void a0() {
        boolean z10;
        float f7;
        b4 b4Var = this.f15509s;
        if (b4Var != null) {
            w3 w3Var = this.f15508r;
            boolean x22 = w3Var.x2();
            h2 h2Var = w3Var.K3;
            if (h2Var != null && !h2Var.f15369c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = b4Var.f15209r;
            ImageView imageView2 = b4Var.f15207n;
            imageView2.setEnabled(x22);
            float f10 = 0.35f;
            if (x22) {
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
        b4 b4Var = this.f15509s;
        if (b4Var != null) {
            int i10 = this.f15507n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            vg sendButton = b4Var.getSendButton();
            if (z10) {
                w3 w3Var = this.f15508r;
                if (c5.f(w3Var.f15663m3, w3Var.f15665n3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            b4Var.setPremiumLocked(z10);
        }
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: ki.q.c0():void");
    }

    public final void d0() {
        int i10;
        b4 b4Var = this.f15509s;
        if (b4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        w3 w3Var = this.f15508r;
        if (w3Var.getChildCount() <= 0) {
            i10 = w3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < w3Var.getChildCount(); i12++) {
                View childAt = w3Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
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
            b0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        w3 w3Var = this.f15508r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f28366b.f30730f0 instanceof sn) && w3Var.x2() && W()) {
                org.telegram.messenger.v0.p(R.string.RichEditorDraftSaved, new xc(this.f15509s, this.f28365a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!w3Var.n3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        tz tzVar;
        w3 w3Var = this.f15508r;
        j3 j3Var = w3Var.f15667o3;
        aa aaVar = w3Var.f15669p3;
        if (!j3Var.x() || !aaVar.onTouchEvent(motionEvent)) {
            if (this.f15512y && (tzVar = this.f15510w) != null) {
                height = (int) tzVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f15511x && motionEvent.getY() < dp) {
                U(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && aaVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && w3Var.o3(motionEvent)) {
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
        w3 w3Var = this.f15508r;
        if (w3Var.getChildCount() <= 0) {
            int paddingTop = w3Var.getPaddingTop();
            this.I = paddingTop;
            w3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
            View childAt = w3Var.getChildAt(i11);
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
        return (this.f15508r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public o9 getTextSelectionHelper() {
        return this.f15508r.getTextSelectionHelper();
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final boolean j() {
        boolean z10 = this.f15512y;
        if (z10) {
            if (z10) {
                this.f15512y = false;
                tz tzVar = this.f15510w;
                if (tzVar != null) {
                    tzVar.u(false);
                    this.f15510w.B();
                }
                V();
                return false;
            }
        } else if (this.f15511x) {
            U(false);
            return false;
        } else if (!this.f15508r.L2() && !T()) {
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
        NotificationCenter.getInstance(this.f15507n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f15507n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void p() {
        NotificationCenter.ObserversGroup observersGroup;
        qi0 qi0Var = this.O;
        if (qi0Var != null) {
            qi0Var.h();
            this.O = null;
        }
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.a();
        }
        w3 w3Var = this.f15508r;
        if (w3Var != null) {
            w3Var.B2();
        }
        tz tzVar = this.f15510w;
        if (tzVar != null && (observersGroup = tzVar.O2) != null) {
            observersGroup.removeAllObservers();
            tzVar.O2 = null;
        }
    }

    @Override
    public final boolean q() {
        w3 w3Var = this.f15508r;
        if (w3Var != null) {
            w3Var.B2();
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
        this.f28366b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.a();
        }
        if (this.f15511x) {
            U(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f28366b.f30777u1.Q() > AndroidUtilities.dp(20.0f)) {
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
        if (z10 && this.f15511x && !this.f15512y) {
            U(false);
        }
        d0();
    }

    @Override
    public final void t() {
    }
}

package li;

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
import bi.i8;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wc;
import org.telegram.ui.jk;
import org.telegram.ui.mn;
import org.telegram.ui.pi0;
import org.telegram.ui.wn;
public final class q extends li implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public g1 F;
    public int G;
    public l80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public pi0 O;
    public final d P;
    public final int f17416n;
    public final v3 f17417r;
    public final a4 f17418s;
    public m.r3 v;
    public sz f17419w;
    public boolean f17420x;
    public boolean f17421y;

    public q(int i10, Context context, u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        l lVar = new l(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f17416n = i10;
        this.h = true;
        this.f30256f = true;
        v3 v3Var = new v3(context, i10, u6Var, new rf.b(this, u6Var, false, 29));
        this.f17417r = v3Var;
        v3Var.setAdaptiveLinkDialogs(false);
        v3Var.setAllowTapAboveContent(false);
        addView(v3Var, kb1.i(-1, -1, 119));
        addView(v3Var.getOverlayView(), kb1.i(-1, -1, 119));
        v3Var.F4();
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        a4 a4Var = new a4(context, lVar);
        this.f17418s = a4Var;
        a4Var.setBackVisible(false);
        a4Var.setTopGradientVisible(false);
        b0();
        addView(a4Var, kb1.i(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(q qVar) {
        boolean z10;
        int i10 = 0;
        if (!qVar.f17417r.q3() && !qVar.f17420x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ti tiVar = qVar.f30254b;
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
        v3 v3Var = qVar.f17417r;
        if (qVar.f17420x) {
            g1 V2 = v3Var.V2();
            if (V2 != null) {
                V2.r();
                AndroidUtilities.showKeyboard(V2);
            }
            qVar.U(true);
            return;
        }
        ti tiVar = qVar.f30254b;
        if (qVar.f17419w == null) {
            sz szVar = new sz(tiVar.f32990f0, true, false, false, qVar.getContext(), true, null, tiVar.f33037u1, true, qVar.f30253a, false, false);
            qVar.f17419w = szVar;
            szVar.setVisibility(8);
            sz szVar2 = qVar.f17419w;
            szVar2.f32781x2 = false;
            szVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.f17419w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.f17419w.setDelegate(new o(qVar));
            qVar.addView(qVar.f17419w, kb1.i(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.f17419w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.f17419w.setLayoutParams(layoutParams);
        qVar.f17419w.setTranslationY(0.0f);
        qVar.f17419w.setVisibility(0);
        qVar.f17420x = true;
        qVar.E = emojiPanelHeight;
        g1 V22 = v3Var.V2();
        if (V22 != null) {
            AndroidUtilities.hideKeyboard(V22);
        }
        a4 a4Var = qVar.f17418s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(true);
        }
        qVar.Y(false);
        qVar.requestLayout();
    }

    public static g1 P(q qVar) {
        v3 v3Var = qVar.f17417r;
        g1 focusedEditTextOrNull = v3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            qVar.F = focusedEditTextOrNull;
            qVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        g1 g1Var = qVar.F;
        if (g1Var != null) {
            return g1Var;
        }
        return v3Var.V2();
    }

    public static int Q(q qVar, g1 g1Var) {
        if (g1Var == qVar.F && qVar.f17417r.getFocusedEditTextOrNull() != g1Var) {
            return Math.min(qVar.G, g1Var.length());
        }
        return Math.max(0, g1Var.getSelectionEnd());
    }

    public static void R(q qVar, int i10, int i11) {
        ti tiVar = qVar.f30254b;
        if (tiVar.f32990f0 == null) {
            return;
        }
        ti tiVar2 = new ti(qVar.getContext(), tiVar.f32990f0, false, false, true, qVar.f30253a);
        tiVar2.f32982c2 = new m(qVar, tiVar2);
        tiVar2.f33002j0.g0();
        tiVar2.R1(1, true);
        tiVar2.n1(i10);
        tiVar2.f33056z2 = new e(qVar, tiVar2);
        tiVar2.Y = new e(qVar, tiVar2);
        tiVar2.X = new n(qVar, tiVar2);
        tiVar2.w1();
        if (i11 != 0) {
            tiVar2.G1(i11);
        }
        tiVar2.setFocusable(true);
        tiVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, u6 u6Var) {
        String str2;
        org.telegram.ui.ActionBar.k3 i10 = wh.i(1, context, u6Var, true);
        LinearLayout d = wh.d(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(8.0f);
        int i11 = y6.G6;
        ShapeDrawable c02 = y6.c0(dp, y6.o1(0.05f, y6.w0(i11, u6Var)));
        b7 L = f7.L(0.05f, i11);
        imageView.setBackground(c02);
        f7.k(imageView, c02, L, null, u6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        d.addView(horizontalScrollView, kb1.x(-1, -2, 49, 12, 2, 12, 0));
        fi.d f7 = wh.f(24, context, u6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        i8 i8Var = new i8(strArr, horizontalScrollView, f7, zArr2, new hi.e2(strArr, 16), imageView, u6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, u6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        int dp2 = AndroidUtilities.dp(24.0f);
        int i12 = y6.f23357d6;
        ShapeDrawable c03 = y6.c0(dp2, y6.w0(i12, u6Var));
        b7 N = f7.N(i12);
        g3Var.setBackground(c03);
        f7.k(g3Var, c03, N, null, u6Var);
        g3Var.setText(strArr[0]);
        e3Var.addTextChangedListener(new p(strArr, i8Var));
        d.addView(g3Var, kb1.x(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        d.addView(f7, kb1.x(-1, 48, 55, 12, 12, 12, 12));
        i8Var.run();
        i10.customView = d;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.e3 e3Var2 = org.telegram.ui.Cells.g3.this.d;
                e3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(e3Var2);
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
        int i13 = y6.f23300a7;
        i10.setBackgroundColorKey(i13);
        i10.fixNavigationBarKey(i13);
        f7.setOnClickListener(new di.e0(f7, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new k2.c(g3Var, 3), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q2 = this.f30254b.f33037u1.Q();
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
        throw new UnsupportedOperationException("Method not decompiled: li.q.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        this.f30254b.f32974a1.setTitle("");
        this.f17417r.f32504g3.O(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f17417r.y0(0);
    }

    @Override
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        mn mnVar;
        SendMessageChatArguments sendMessageChatArguments;
        jk jkVar;
        og ogVar;
        jk jkVar2;
        int i12 = this.f17416n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        v3 v3Var = this.f17417r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && c5.f(v3Var.f17564t3, v3Var.f17566u3)) {
            b2.q0(getContext(), new b(v3Var, 0), new d(this, 2), this.f30253a);
            return false;
        }
        if (v3Var.q3() && !v3Var.s3()) {
            if (!v3Var.S3()) {
                a4 a4Var = this.f17418s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(v3Var.S3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                ti tiVar = this.f30254b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                    if ((r2Var instanceof wn) && (jkVar2 = ((wn) r2Var).Y) != null) {
                        jkVar2.O0(c5.k(v3Var.f17564t3), z10, i10, i11);
                        tiVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList f32 = v3Var.f3();
                    if (!f32.isEmpty()) {
                        ArrayList H2 = v3Var.H2();
                        ArrayList E2 = v3Var.E2();
                        ArrayList a2 = b5.a(i12, f32);
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f32990f0;
                        if (r2Var2 instanceof wn) {
                            wn wnVar = (wn) r2Var2;
                            MessageObject messageObject3 = wnVar.D5;
                            MessageObject messageObject4 = wnVar.f45166j4;
                            mn mnVar2 = wnVar.B5;
                            j11 = wnVar.a9();
                            sendMessageChatArguments = wnVar.O8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                            mnVar = mnVar2;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            mnVar = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(tiVar.M1), f32, H2, E2, a2, false, tiVar.t1(), messageObject, messageObject2, mnVar, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        org.telegram.ui.ActionBar.r2 r2Var3 = tiVar.f32990f0;
                        if ((r2Var3 instanceof wn) && (jkVar = ((wn) r2Var3).Y) != null && (ogVar = jkVar.Z2) != null) {
                            ogVar.A(null, z10, i10, i11, 0L);
                        }
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
        return !this.f17417r.q3();
    }

    public final void S(l80 l80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, l80 l80Var2) {
        boolean z10;
        if (aVar != null && aVar.f17053b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l80Var.j(z10, i10, null, str, new ai.e0(this, aVar, pageBlock, l80Var2, 27));
        l80Var.y().f22637a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        l80Var.y().f22637a.setTextSize(1, i11);
    }

    public final boolean T() {
        v3 v3Var = this.f17417r;
        if (v3Var != null && v3Var.q3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30253a);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                public final q f17304b;

                {
                    this.f17304b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f17304b.f30254b.dismiss();
                            return;
                        default:
                            q qVar = this.f17304b;
                            qVar.W();
                            qVar.f30254b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.b2(this) {
                public final q f17304b;

                {
                    this.f17304b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f17304b.f30254b.dismiss();
                            return;
                        default:
                            q qVar = this.f17304b;
                            qVar.W();
                            qVar.f30254b.dismiss();
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
        if (this.f17421y) {
            this.f17421y = false;
            sz szVar = this.f17419w;
            if (szVar != null) {
                szVar.t(false);
                if (!z10) {
                    this.f17419w.B();
                }
            }
        }
        this.F = null;
        sz szVar2 = this.f17419w;
        if (szVar2 != null) {
            szVar2.setTranslationY(0.0f);
            this.f17419w.setVisibility(8);
        }
        this.f17420x = false;
        this.E = 0;
        a4 a4Var = this.f17418s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(false);
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
        if (this.f17421y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        sz szVar = this.f17419w;
        float f12 = 0.0f;
        ti tiVar = this.f30254b;
        if (szVar != null) {
            if (this.f17420x) {
                float f13 = this.E - i10;
                if (this.f17421y) {
                    f11 = -tiVar.f33018o2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            szVar.setTranslationY(f10);
        }
        a4 a4Var = this.f17418s;
        if (a4Var != null) {
            boolean z10 = this.f17420x;
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
            if (!z10 || this.f17421y) {
                f7 += tiVar.f33018o2;
            }
            a4Var.getBottomContainer().animate().cancel();
            a4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f17420x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f17421y) {
                f12 += tiVar.f33018o2;
            }
            a4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = a4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(ds.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f30254b.f32990f0;
        if (r2Var instanceof wn) {
            wn wnVar = (wn) r2Var;
            v3 v3Var = this.f17417r;
            if (!v3Var.x2()) {
                return false;
            }
            TL_iv.RichMessage p22 = v3Var.p2();
            AccountInstance.getInstance(this.f17416n).getMediaDataController().saveDraft(wnVar.a(), wnVar.K7(wnVar.D5), "", null, null, null, null, 0L, false, false, p22);
            jk jkVar = wnVar.Y;
            if (jkVar != null) {
                jkVar.setRichDraftPreview(p22);
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
        if (!this.f17417r.q3() && !this.f17420x) {
            z11 = false;
        } else {
            z11 = true;
        }
        ti tiVar = this.f30254b;
        th thVar = tiVar.A1;
        if (tiVar.A2 != z11) {
            tiVar.A2 = z11;
            if (tiVar.V0) {
                thVar.animate().cancel();
                if (!z11) {
                    thVar.setVisibility(0);
                }
                float f7 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = thVar.animate();
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
                    thVar.setAlpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    thVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    thVar.setVisibility(i10);
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
        throw new UnsupportedOperationException("Method not decompiled: li.q.Z():void");
    }

    public final void a0() {
        boolean z10;
        float f7;
        a4 a4Var = this.f17418s;
        if (a4Var != null) {
            v3 v3Var = this.f17417r;
            boolean x22 = v3Var.x2();
            f2 f2Var = v3Var.R3;
            if (f2Var != null && !f2Var.f17227c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = a4Var.f17098r;
            ImageView imageView2 = a4Var.f17096n;
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
        a4 a4Var = this.f17418s;
        if (a4Var != null) {
            int i10 = this.f17416n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            vg sendButton = a4Var.getSendButton();
            if (z10) {
                v3 v3Var = this.f17417r;
                if (c5.f(v3Var.f17564t3, v3Var.f17566u3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            a4Var.setPremiumLocked(z10);
        }
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: li.q.c0():void");
    }

    public final void d0() {
        int i10;
        a4 a4Var = this.f17418s;
        if (a4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        v3 v3Var = this.f17417r;
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
            b0();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        v3 v3Var = this.f17417r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f30254b.f32990f0 instanceof wn) && v3Var.x2() && W()) {
                org.telegram.messenger.t.q(R.string.RichEditorDraftSaved, new wc(this.f17418s, this.f30253a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!v3Var.n3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        sz szVar;
        v3 v3Var = this.f17417r;
        j3 j3Var = v3Var.f17568v3;
        ea eaVar = v3Var.f17570w3;
        if (!j3Var.x() || !eaVar.onTouchEvent(motionEvent)) {
            if (this.f17421y && (szVar = this.f17419w) != null) {
                height = (int) szVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f17420x && motionEvent.getY() < dp) {
                U(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && eaVar.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && v3Var.o3(motionEvent)) {
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
        v3 v3Var = this.f17417r;
        if (v3Var.getChildCount() <= 0) {
            int paddingTop = v3Var.getPaddingTop();
            this.I = paddingTop;
            v3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
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
        return (this.f17417r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public s9 getTextSelectionHelper() {
        return this.f17417r.getTextSelectionHelper();
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final boolean j() {
        boolean z10 = this.f17421y;
        if (z10) {
            if (z10) {
                this.f17421y = false;
                sz szVar = this.f17419w;
                if (szVar != null) {
                    szVar.t(false);
                    this.f17419w.B();
                }
                V();
                return false;
            }
        } else if (this.f17420x) {
            U(false);
            return false;
        } else if (!this.f17417r.L2() && !T()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(float f7) {
        V();
    }

    @Override
    public final void o() {
        pi0 pi0Var = this.O;
        if (pi0Var != null) {
            pi0Var.h();
            this.O = null;
        }
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        v3 v3Var = this.f17417r;
        if (v3Var != null) {
            v3Var.B2();
        }
        sz szVar = this.f17419w;
        if (szVar != null) {
            szVar.C();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f17416n).addWeakObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f17416n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean p() {
        v3 v3Var = this.f17417r;
        if (v3Var != null) {
            v3Var.B2();
            return false;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (!T()) {
            return false;
        }
        return true;
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
        this.f30254b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        if (this.f17420x) {
            U(false);
        }
    }

    @Override
    public final void x() {
        boolean z10;
        if (this.f30254b.f33037u1.Q() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        V();
        d0();
    }

    @Override
    public final void y(int i10, boolean z10) {
        this.L = z10;
        V();
        if (z10 && this.f17420x && !this.f17421y) {
            U(false);
        }
        d0();
    }

    @Override
    public final void s() {
    }
}

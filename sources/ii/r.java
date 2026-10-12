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
import org.telegram.messenger.am;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zg;
import org.telegram.ui.ej0;
import org.telegram.ui.eo;
import org.telegram.ui.sk;
public final class r extends si implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public i1 F;
    public int G;
    public s80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public ej0 O;
    public final d P;
    public final int f12644n;
    public final x3 f12645r;
    public final c4 f12646s;
    public m.r3 v;
    public d00 f12647w;
    public boolean f12648x;
    public boolean f12649y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar) {
        super(context, c6Var, ajVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f12644n = i10;
        this.h = true;
        this.f30573f = true;
        x3 x3Var = new x3(context, i10, c6Var, new pf.b(20, this, c6Var));
        this.f12645r = x3Var;
        x3Var.setAdaptiveLinkDialogs(false);
        x3Var.setAllowTapAboveContent(false);
        addView(x3Var, w7.w5.e(-1, -1, 119));
        addView(x3Var.getOverlayView(), w7.w5.e(-1, -1, 119));
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
        this.f12646s = c4Var;
        c4Var.setBackVisible(false);
        c4Var.setTopGradientVisible(false);
        b0();
        addView(c4Var, w7.w5.e(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(r rVar) {
        boolean z10;
        int i10 = 0;
        if (!rVar.f12645r.l3() && !rVar.f12648x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            aj ajVar = rVar.f30570b;
            if (!ajVar.R && ajVar.V0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (rVar.K != i10) {
            rVar.K = i10;
            rVar.V();
        }
    }

    public static void O(r rVar) {
        x3 x3Var = rVar.f12645r;
        if (rVar.f12648x) {
            i1 Q2 = x3Var.Q2();
            if (Q2 != null) {
                Q2.r();
                AndroidUtilities.showKeyboard(Q2);
            }
            rVar.U(true);
            return;
        }
        aj ajVar = rVar.f30570b;
        if (rVar.f12647w == null) {
            d00 d00Var = new d00(ajVar.f24338f0, true, false, false, rVar.getContext(), true, null, ajVar.f24385u1, true, rVar.f30569a, false, false);
            rVar.f12647w = d00Var;
            d00Var.setVisibility(8);
            d00 d00Var2 = rVar.f12647w;
            d00Var2.f25137w2 = false;
            d00Var2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.f12647w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.f12647w.setDelegate(new p(rVar));
            rVar.addView(rVar.f12647w, w7.w5.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.f12647w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.f12647w.setLayoutParams(layoutParams);
        rVar.f12647w.setTranslationY(0.0f);
        rVar.f12647w.setVisibility(0);
        rVar.f12648x = true;
        rVar.E = emojiPanelHeight;
        i1 Q22 = x3Var.Q2();
        if (Q22 != null) {
            AndroidUtilities.hideKeyboard(Q22);
        }
        c4 c4Var = rVar.f12646s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(true);
        }
        rVar.Y(false);
        rVar.requestLayout();
    }

    public static i1 P(r rVar) {
        x3 x3Var = rVar.f12645r;
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
        if (i1Var == rVar.F && rVar.f12645r.getFocusedEditTextOrNull() != i1Var) {
            return Math.min(rVar.G, i1Var.length());
        }
        return Math.max(0, i1Var.getSelectionEnd());
    }

    public static void R(r rVar, int i10, int i11) {
        aj ajVar = rVar.f30570b;
        if (ajVar.f24338f0 == null) {
            return;
        }
        aj ajVar2 = new aj(rVar.getContext(), ajVar.f24338f0, false, false, true, rVar.f30569a);
        ajVar2.f24329c2 = new n(rVar, ajVar2);
        ajVar2.f24350j0.f0();
        ajVar2.N1(1, true);
        ajVar2.j1(i10);
        ajVar2.f24393w2 = new e(rVar, ajVar2);
        ajVar2.Y = new e(rVar, ajVar2);
        ajVar2.X = new o(rVar, ajVar2);
        ajVar2.t1();
        if (i11 != 0) {
            ajVar2.D1(i11);
        }
        ajVar2.setFocusable(true);
        ajVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        String str2;
        org.telegram.ui.ActionBar.e3 i10 = am.i(1, context, c6Var, true);
        LinearLayout e7 = am.e(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.m1(0.05f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e7.addView(horizontalScrollView, w7.w5.t(-1, -2, 49, 12, 2, 12, 0));
        ci.d f7 = am.f(24, context, c6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, f7, zArr2, new hi.a(strArr, 2), imageView, c6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, c6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22081b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new q(strArr, kVar));
        e7.addView(j3Var, w7.w5.t(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        e7.addView(f7, w7.w5.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i10.customView = e7;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.h3 h3Var2 = org.telegram.ui.Cells.j3.this.f22081b;
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
        int i11 = org.telegram.ui.ActionBar.h6.f20504a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        f7.setOnClickListener(new ai.s0(f7, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new i2.h0(j3Var, 1), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f30570b.f24385u1.R();
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
    public final void B(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.B(int, int):void");
    }

    @Override
    public final void G(si siVar) {
        this.f30570b.f24321a1.setTitle("");
        this.f12645r.W2.N(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f12645r.x0(0);
    }

    @Override
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j3) {
        long j10;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        sk skVar;
        int i12 = this.f12644n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        x3 x3Var = this.f12645r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && d5.f(x3Var.j3, x3Var.f12816k3)) {
            e2.p0(getContext(), new b(x3Var, 0), new d(this, 2), this.f30569a);
            return false;
        }
        if (x3Var.l3() && !x3Var.n3()) {
            if (!x3Var.N3()) {
                c4 c4Var = this.f12646s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(x3Var.N3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                aj ajVar = this.f30570b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
                    if ((m2Var instanceof eo) && (skVar = ((eo) m2Var).Y) != null) {
                        skVar.U0(d5.k(x3Var.j3), z10, i10, i11);
                        ajVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList a32 = x3Var.a3();
                    if (!a32.isEmpty()) {
                        ArrayList C2 = x3Var.C2();
                        ArrayList z22 = x3Var.z2();
                        ArrayList a2 = c5.a(i12, a32);
                        org.telegram.ui.ActionBar.m2 m2Var2 = ajVar.f24338f0;
                        if (m2Var2 instanceof eo) {
                            eo eoVar = (eo) m2Var2;
                            MessageObject messageObject3 = eoVar.f37361n5;
                            MessageObject messageObject4 = eoVar.X3;
                            j10 = eoVar.S8();
                            sendMessageChatArguments = eoVar.H8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j10 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(ajVar.M1), a32, C2, z22, a2, false, ajVar.p1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j3, j10, 0L);
                        ajVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean L() {
        return !this.f12645r.l3();
    }

    public final void S(s80 s80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, s80 s80Var2) {
        boolean z10;
        if (aVar != null && aVar.f12232b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        s80Var.j(z10, i10, null, str, new ai.i5(this, aVar, pageBlock, s80Var2, 18));
        s80Var.y().f20322a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        s80Var.y().f20322a.setTextSize(1, i11);
    }

    public final boolean T() {
        x3 x3Var = this.f12645r;
        if (x3Var != null && x3Var.l3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30569a);
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                public final r f12508b;

                {
                    this.f12508b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f12508b.f30570b.dismiss();
                            return;
                        default:
                            r rVar = this.f12508b;
                            rVar.W();
                            rVar.f30570b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.z1(this) {
                public final r f12508b;

                {
                    this.f12508b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f12508b.f30570b.dismiss();
                            return;
                        default:
                            r rVar = this.f12508b;
                            rVar.W();
                            rVar.f30570b.dismiss();
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
        if (this.f12649y) {
            this.f12649y = false;
            d00 d00Var = this.f12647w;
            if (d00Var != null) {
                d00Var.u(false);
                if (!z10) {
                    this.f12647w.B();
                }
            }
        }
        this.F = null;
        d00 d00Var2 = this.f12647w;
        if (d00Var2 != null) {
            d00Var2.setTranslationY(0.0f);
            this.f12647w.setVisibility(8);
        }
        this.f12648x = false;
        this.E = 0;
        c4 c4Var = this.f12646s;
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
        if (this.f12649y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        d00 d00Var = this.f12647w;
        float f12 = 0.0f;
        aj ajVar = this.f30570b;
        if (d00Var != null) {
            if (this.f12648x) {
                float f13 = this.E - i10;
                if (this.f12649y) {
                    f11 = -ajVar.f24366o2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            d00Var.setTranslationY(f10);
        }
        c4 c4Var = this.f12646s;
        if (c4Var != null) {
            boolean z10 = this.f12648x;
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
            if (!z10 || this.f12649y) {
                f7 += ajVar.f24366o2;
            }
            c4Var.getBottomContainer().animate().cancel();
            c4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f12648x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f12649y) {
                f12 += ajVar.f24366o2;
            }
            c4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = c4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(js.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30570b.f24338f0;
        if (m2Var instanceof eo) {
            eo eoVar = (eo) m2Var;
            x3 x3Var = this.f12645r;
            if (!x3Var.s2()) {
                return false;
            }
            TL_iv.RichMessage k22 = x3Var.k2();
            AccountInstance.getInstance(this.f12644n).getMediaDataController().saveDraft(eoVar.a(), eoVar.E7(eoVar.f37361n5), "", null, null, null, null, 0L, false, false, k22);
            sk skVar = eoVar.Y;
            if (skVar != null) {
                skVar.setRichDraftPreview(k22);
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
        if (!this.f12645r.l3() && !this.f12648x) {
            z11 = false;
        } else {
            z11 = true;
        }
        aj ajVar = this.f30570b;
        ci ciVar = ajVar.A1;
        if (ajVar.f24397x2 != z11) {
            ajVar.f24397x2 = z11;
            if (ajVar.V0) {
                ciVar.animate().cancel();
                if (!z11) {
                    ciVar.setVisibility(0);
                }
                float f7 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = ciVar.animate();
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f10).setDuration(180L).withEndAction(new uh(ajVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f7 = 0.0f;
                    }
                    ciVar.setAlpha(f7);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    ciVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    ciVar.setVisibility(i10);
                }
            }
        }
        if (!z11 && !ajVar.R && ajVar.V0) {
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
        c4 c4Var = this.f12646s;
        if (c4Var != null) {
            x3 x3Var = this.f12645r;
            boolean s22 = x3Var.s2();
            i2 i2Var = x3Var.H3;
            if (i2Var != null && !i2Var.f12485c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = c4Var.f12327r;
            ImageView imageView2 = c4Var.f12326n;
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
        c4 c4Var = this.f12646s;
        if (c4Var != null) {
            int i10 = this.f12644n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            zg sendButton = c4Var.getSendButton();
            if (z10) {
                x3 x3Var = this.f12645r;
                if (d5.f(x3Var.j3, x3Var.f12816k3)) {
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
        c4 c4Var = this.f12646s;
        if (c4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        x3 x3Var = this.f12645r;
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
        x3 x3Var = this.f12645r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f30570b.f24338f0 instanceof eo) && x3Var.s2() && W()) {
                org.telegram.messenger.v0.q(R.string.RichEditorDraftSaved, new zc(this.f12646s, this.f30569a), R.raw.contact_check, 36);
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
        d00 d00Var;
        x3 x3Var = this.f12645r;
        k3 k3Var = x3Var.f12818l3;
        aa aaVar = x3Var.f12819m3;
        if (!k3Var.x() || !aaVar.onTouchEvent(motionEvent)) {
            if (this.f12649y && (d00Var = this.f12647w) != null) {
                height = (int) d00Var.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f12648x && motionEvent.getY() < dp) {
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
        x3 x3Var = this.f12645r;
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
        return (this.f12645r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public o9 getTextSelectionHelper() {
        return this.f12645r.getTextSelectionHelper();
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final boolean j() {
        boolean z10 = this.f12649y;
        if (z10) {
            if (z10) {
                this.f12649y = false;
                d00 d00Var = this.f12647w;
                if (d00Var != null) {
                    d00Var.u(false);
                    this.f12647w.B();
                }
                V();
                return false;
            }
        } else if (this.f12648x) {
            U(false);
            return false;
        } else if (!this.f12645r.G2() && !T()) {
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
        NotificationCenter.getInstance(this.f12644n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f12644n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void p() {
        NotificationCenter.ObserversGroup observersGroup;
        ej0 ej0Var = this.O;
        if (ej0Var != null) {
            ej0Var.i();
            this.O = null;
        }
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        x3 x3Var = this.f12645r;
        if (x3Var != null) {
            x3Var.w2();
        }
        d00 d00Var = this.f12647w;
        if (d00Var != null && (observersGroup = d00Var.I2) != null) {
            observersGroup.removeAllObservers();
            d00Var.I2 = null;
        }
    }

    @Override
    public final boolean q() {
        x3 x3Var = this.f12645r;
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
        this.f30570b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        if (this.f12648x) {
            U(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f30570b.f24385u1.R() > AndroidUtilities.dp(20.0f)) {
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
        if (z10 && this.f12648x && !this.f12649y) {
            U(false);
        }
        d0();
    }

    @Override
    public final void t() {
    }
}

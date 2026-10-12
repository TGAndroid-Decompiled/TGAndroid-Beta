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
import org.telegram.messenger.yh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.hj0;
import org.telegram.ui.sk;
public final class r extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public h1 F;
    public int G;
    public m80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public hj0 O;
    public final d P;
    public final int f13482n;
    public final x3 f13483r;
    public final c4 f13484s;
    public m.q3 v;
    public wz f13485w;
    public boolean f13486x;
    public boolean f13487y;

    public r(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var, viVar);
        m mVar = new m(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f13482n = i10;
        this.h = true;
        this.f27673f = true;
        x3 x3Var = new x3(context, i10, c6Var, new qf.b(this, c6Var, false, 28));
        this.f13483r = x3Var;
        x3Var.setAdaptiveLinkDialogs(false);
        x3Var.setAllowTapAboveContent(false);
        addView(x3Var, w7.a6.e(-1, -1, 119));
        addView(x3Var.getOverlayView(), w7.a6.e(-1, -1, 119));
        x3Var.A4();
        h2 h2Var = x3Var.H3;
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
        c4 c4Var = new c4(context, mVar);
        this.f13484s = c4Var;
        c4Var.setBackVisible(false);
        c4Var.setTopGradientVisible(false);
        b0();
        addView(c4Var, w7.a6.e(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(r rVar) {
        boolean z10;
        int i10 = 0;
        if (!rVar.f13483r.l3() && !rVar.f13486x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            vi viVar = rVar.f27671b;
            if (!viVar.R && viVar.V0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (rVar.K != i10) {
            rVar.K = i10;
            rVar.V();
        }
    }

    public static void O(r rVar) {
        x3 x3Var = rVar.f13483r;
        if (rVar.f13486x) {
            h1 Q2 = x3Var.Q2();
            if (Q2 != null) {
                Q2.r();
                AndroidUtilities.showKeyboard(Q2);
            }
            rVar.U(true);
            return;
        }
        vi viVar = rVar.f27671b;
        if (rVar.f13485w == null) {
            wz wzVar = new wz(viVar.f30001f0, true, false, false, rVar.getContext(), true, null, viVar.f30048u1, true, rVar.f27670a, false, false);
            rVar.f13485w = wzVar;
            wzVar.setVisibility(8);
            wz wzVar2 = rVar.f13485w;
            wzVar2.f31078w2 = false;
            wzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = rVar.f13485w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            rVar.f13485w.setDelegate(new p(rVar));
            rVar.addView(rVar.f13485w, w7.a6.e(-1, rVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = rVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.f13485w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        rVar.f13485w.setLayoutParams(layoutParams);
        rVar.f13485w.setTranslationY(0.0f);
        rVar.f13485w.setVisibility(0);
        rVar.f13486x = true;
        rVar.E = emojiPanelHeight;
        h1 Q22 = x3Var.Q2();
        if (Q22 != null) {
            AndroidUtilities.hideKeyboard(Q22);
        }
        c4 c4Var = rVar.f13484s;
        if (c4Var != null) {
            c4Var.setEmojiOpened(true);
        }
        rVar.Y(false);
        rVar.requestLayout();
    }

    public static h1 P(r rVar) {
        x3 x3Var = rVar.f13483r;
        h1 focusedEditTextOrNull = x3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        h1 h1Var = rVar.F;
        if (h1Var != null) {
            return h1Var;
        }
        return x3Var.Q2();
    }

    public static int Q(r rVar, h1 h1Var) {
        if (h1Var == rVar.F && rVar.f13483r.getFocusedEditTextOrNull() != h1Var) {
            return Math.min(rVar.G, h1Var.length());
        }
        return Math.max(0, h1Var.getSelectionEnd());
    }

    public static void R(r rVar, int i10, int i11) {
        vi viVar = rVar.f27671b;
        if (viVar.f30001f0 == null) {
            return;
        }
        vi viVar2 = new vi(rVar.getContext(), viVar.f30001f0, false, false, true, rVar.f27670a);
        viVar2.f29993c2 = new n(rVar, viVar2);
        viVar2.f30013j0.f0();
        viVar2.N1(1, true);
        viVar2.j1(i10);
        viVar2.f30056w2 = new e(rVar, viVar2);
        viVar2.Y = new e(rVar, viVar2);
        viVar2.X = new o(rVar, viVar2);
        viVar2.t1();
        if (i11 != 0) {
            viVar2.D1(i11);
        }
        viVar2.setFocusable(true);
        viVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        String str2;
        org.telegram.ui.ActionBar.e3 i10 = yh.i(1, context, c6Var, true);
        LinearLayout e = yh.e(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.m1(0.05f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        e.addView(horizontalScrollView, w7.a6.t(-1, -2, 49, 12, 2, 12, 0));
        di.d f7 = yh.f(24, context, c6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        k kVar = new k(strArr, horizontalScrollView, f7, zArr2, new ii.a(strArr, 2), imageView, c6Var, new int[]{6}, 0);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, c6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f21368b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new q(strArr, kVar));
        e.addView(j3Var, w7.a6.t(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        e.addView(f7, w7.a6.t(-1, 48, 55, 12, 12, 12, 12));
        kVar.run();
        i10.customView = e;
        i10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.h3 h3Var2 = org.telegram.ui.Cells.j3.this.f21368b;
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
        int i11 = org.telegram.ui.ActionBar.g6.f19843a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        f7.setOnClickListener(new bi.l0(f7, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new ig.t0(j3Var, 6), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f27671b.f30048u1.R();
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
        throw new UnsupportedOperationException("Method not decompiled: ji.r.B(int, int):void");
    }

    @Override
    public final void G(ni niVar) {
        this.f27671b.f29985a1.setTitle("");
        this.f13483r.W2.N(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f13483r.x0(0);
    }

    @Override
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        sk skVar;
        int i12 = this.f13482n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        x3 x3Var = this.f13483r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && g5.f(x3Var.f13635j3, x3Var.f13637k3)) {
            d2.p0(getContext(), new b(x3Var, 0), new d(this, 2), this.f27670a);
            return false;
        }
        if (x3Var.l3() && !x3Var.n3()) {
            if (!x3Var.N3()) {
                c4 c4Var = this.f13484s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(x3Var.N3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                vi viVar = this.f27671b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
                    if ((m2Var instanceof fo) && (skVar = ((fo) m2Var).Y) != null) {
                        skVar.P0(g5.k(x3Var.f13635j3), z10, i10, i11);
                        viVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList a32 = x3Var.a3();
                    if (!a32.isEmpty()) {
                        ArrayList C2 = x3Var.C2();
                        ArrayList z22 = x3Var.z2();
                        ArrayList a2 = f5.a(i12, a32);
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f30001f0;
                        if (m2Var2 instanceof fo) {
                            fo foVar = (fo) m2Var2;
                            MessageObject messageObject3 = foVar.f36038n5;
                            MessageObject messageObject4 = foVar.X3;
                            j11 = foVar.S8();
                            sendMessageChatArguments = foVar.H8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(viVar.M1), a32, C2, z22, a2, false, viVar.p1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        viVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean L() {
        return !this.f13483r.l3();
    }

    public final void S(m80 m80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, m80 m80Var2) {
        boolean z10;
        if (aVar != null && aVar.f13103b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m80Var.j(z10, i10, null, str, new androidx.car.app.utils.b(this, aVar, pageBlock, m80Var2, 18));
        m80Var.y().f19719a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        m80Var.y().f19719a.setTextSize(1, i11);
    }

    public final boolean T() {
        x3 x3Var = this.f13483r;
        if (x3Var != null && x3Var.l3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27670a);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                public final r f13345b;

                {
                    this.f13345b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f13345b.f27671b.dismiss();
                            return;
                        default:
                            r rVar = this.f13345b;
                            rVar.W();
                            rVar.f27671b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.z1(this) {
                public final r f13345b;

                {
                    this.f13345b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f13345b.f27671b.dismiss();
                            return;
                        default:
                            r rVar = this.f13345b;
                            rVar.W();
                            rVar.f27671b.dismiss();
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
        if (this.f13487y) {
            this.f13487y = false;
            wz wzVar = this.f13485w;
            if (wzVar != null) {
                wzVar.u(false);
                if (!z10) {
                    this.f13485w.B();
                }
            }
        }
        this.F = null;
        wz wzVar2 = this.f13485w;
        if (wzVar2 != null) {
            wzVar2.setTranslationY(0.0f);
            this.f13485w.setVisibility(8);
        }
        this.f13486x = false;
        this.E = 0;
        c4 c4Var = this.f13484s;
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
        if (this.f13487y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        wz wzVar = this.f13485w;
        float f12 = 0.0f;
        vi viVar = this.f27671b;
        if (wzVar != null) {
            if (this.f13486x) {
                float f13 = this.E - i10;
                if (this.f13487y) {
                    f11 = -viVar.f30029o2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            wzVar.setTranslationY(f10);
        }
        c4 c4Var = this.f13484s;
        if (c4Var != null) {
            boolean z10 = this.f13486x;
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
            if (!z10 || this.f13487y) {
                f7 += viVar.f30029o2;
            }
            c4Var.getBottomContainer().animate().cancel();
            c4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f13486x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f13487y) {
                f12 += viVar.f30029o2;
            }
            c4Var.setBottomGradientTranslationY(-f12);
            if (this.M != this.K) {
                ViewPropertyAnimator animate = c4Var.getBottomInnerContainer().animate();
                this.M = this.K;
                animate.translationY(-i12).setDuration(320L).setInterpolator(es.h).start();
            }
        }
    }

    public final boolean W() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f27671b.f30001f0;
        if (m2Var instanceof fo) {
            fo foVar = (fo) m2Var;
            x3 x3Var = this.f13483r;
            if (!x3Var.s2()) {
                return false;
            }
            TL_iv.RichMessage k22 = x3Var.k2();
            AccountInstance.getInstance(this.f13482n).getMediaDataController().saveDraft(foVar.a(), foVar.E7(foVar.f36038n5), "", null, null, null, null, 0L, false, false, k22);
            sk skVar = foVar.Y;
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
        if (!this.f13483r.l3() && !this.f13486x) {
            z11 = false;
        } else {
            z11 = true;
        }
        vi viVar = this.f27671b;
        xh xhVar = viVar.A1;
        if (viVar.f30060x2 != z11) {
            viVar.f30060x2 = z11;
            if (viVar.V0) {
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
        if (!z11 && !viVar.R && viVar.V0) {
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
        throw new UnsupportedOperationException("Method not decompiled: ji.r.Z():void");
    }

    public final void a0() {
        boolean z10;
        float f7;
        c4 c4Var = this.f13484s;
        if (c4Var != null) {
            x3 x3Var = this.f13483r;
            boolean s22 = x3Var.s2();
            h2 h2Var = x3Var.H3;
            if (h2Var != null && !h2Var.f13302c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = c4Var.f13181r;
            ImageView imageView2 = c4Var.f13180n;
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
        c4 c4Var = this.f13484s;
        if (c4Var != null) {
            int i10 = this.f13482n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            wg sendButton = c4Var.getSendButton();
            if (z10) {
                x3 x3Var = this.f13483r;
                if (g5.f(x3Var.f13635j3, x3Var.f13637k3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            c4Var.setPremiumLocked(z10);
        }
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: ji.r.c0():void");
    }

    public final void d0() {
        int i10;
        c4 c4Var = this.f13484s;
        if (c4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        x3 x3Var = this.f13483r;
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
        x3 x3Var = this.f13483r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f27671b.f30001f0 instanceof fo) && x3Var.s2() && W()) {
                org.telegram.messenger.q.r(R.string.RichEditorDraftSaved, new zc(this.f13484s, this.f27670a), R.raw.contact_check, 36);
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
        wz wzVar;
        x3 x3Var = this.f13483r;
        k3 k3Var = x3Var.f13639l3;
        aa aaVar = x3Var.f13640m3;
        if (!k3Var.x() || !aaVar.onTouchEvent(motionEvent)) {
            if (this.f13487y && (wzVar = this.f13485w) != null) {
                height = (int) wzVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f13486x && motionEvent.getY() < dp) {
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
        x3 x3Var = this.f13483r;
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
        return (this.f13483r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public o9 getTextSelectionHelper() {
        return this.f13483r.getTextSelectionHelper();
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final boolean j() {
        boolean z10 = this.f13487y;
        if (z10) {
            if (z10) {
                this.f13487y = false;
                wz wzVar = this.f13485w;
                if (wzVar != null) {
                    wzVar.u(false);
                    this.f13485w.B();
                }
                V();
                return false;
            }
        } else if (this.f13486x) {
            U(false);
            return false;
        } else if (!this.f13483r.G2() && !T()) {
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
        NotificationCenter.ObserversGroup observersGroup;
        hj0 hj0Var = this.O;
        if (hj0Var != null) {
            hj0Var.i();
            this.O = null;
        }
        m.q3 q3Var = this.v;
        if (q3Var != null) {
            q3Var.a();
        }
        x3 x3Var = this.f13483r;
        if (x3Var != null) {
            x3Var.w2();
        }
        wz wzVar = this.f13485w;
        if (wzVar != null && (observersGroup = wzVar.I2) != null) {
            observersGroup.removeAllObservers();
            wzVar.I2 = null;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f13482n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f13482n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean q() {
        x3 x3Var = this.f13483r;
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
        this.f27671b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void u() {
        m.q3 q3Var = this.v;
        if (q3Var != null) {
            q3Var.a();
        }
        if (this.f13486x) {
            U(false);
        }
    }

    @Override
    public final void y() {
        boolean z10;
        if (this.f27671b.f30048u1.R() > AndroidUtilities.dp(20.0f)) {
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
        if (z10 && this.f13486x && !this.f13487y) {
            U(false);
        }
        d0();
    }

    @Override
    public final void t() {
    }
}

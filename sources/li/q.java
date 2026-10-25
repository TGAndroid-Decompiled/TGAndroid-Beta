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
import org.telegram.messenger.vh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wc;
import org.telegram.ui.hk;
import org.telegram.ui.kn;
import org.telegram.ui.ni0;
import org.telegram.ui.un;
public final class q extends li implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Q = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int E;
    public g1 F;
    public int G;
    public k80 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public ni0 O;
    public final d P;
    public final int f17417n;
    public final v3 f17418r;
    public final a4 f17419s;
    public m.r3 v;
    public sz f17420w;
    public boolean f17421x;
    public boolean f17422y;

    public q(int i10, Context context, u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        l lVar = new l(this);
        this.J = true;
        this.P = new d(this, 3);
        this.f17417n = i10;
        this.h = true;
        this.f30215f = true;
        v3 v3Var = new v3(context, i10, u6Var, new rf.b(this, u6Var, false, 29));
        this.f17418r = v3Var;
        v3Var.setAdaptiveLinkDialogs(false);
        v3Var.setAllowTapAboveContent(false);
        addView(v3Var, gb1.i(-1, -1, 119));
        addView(v3Var.getOverlayView(), gb1.i(-1, -1, 119));
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
        this.f17419s = a4Var;
        a4Var.setBackVisible(false);
        a4Var.setTopGradientVisible(false);
        b0();
        addView(a4Var, gb1.i(-1, -1, 119));
        a0();
        c0();
        Y(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void N(q qVar) {
        boolean z10;
        int i10 = 0;
        if (!qVar.f17418r.q3() && !qVar.f17421x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ti tiVar = qVar.f30213b;
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
        v3 v3Var = qVar.f17418r;
        if (qVar.f17421x) {
            g1 V2 = v3Var.V2();
            if (V2 != null) {
                V2.r();
                AndroidUtilities.showKeyboard(V2);
            }
            qVar.U(true);
            return;
        }
        ti tiVar = qVar.f30213b;
        if (qVar.f17420w == null) {
            sz szVar = new sz(tiVar.f33018f0, true, false, false, qVar.getContext(), true, null, tiVar.f33065u1, true, qVar.f30212a, false, false);
            qVar.f17420w = szVar;
            szVar.setVisibility(8);
            sz szVar2 = qVar.f17420w;
            szVar2.f32784x2 = false;
            szVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.f17420w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.f17420w.setDelegate(new o(qVar));
            qVar.addView(qVar.f17420w, gb1.i(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.f17420w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.f17420w.setLayoutParams(layoutParams);
        qVar.f17420w.setTranslationY(0.0f);
        qVar.f17420w.setVisibility(0);
        qVar.f17421x = true;
        qVar.E = emojiPanelHeight;
        g1 V22 = v3Var.V2();
        if (V22 != null) {
            AndroidUtilities.hideKeyboard(V22);
        }
        a4 a4Var = qVar.f17419s;
        if (a4Var != null) {
            a4Var.setEmojiOpened(true);
        }
        qVar.Y(false);
        qVar.requestLayout();
    }

    public static g1 P(q qVar) {
        v3 v3Var = qVar.f17418r;
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
        if (g1Var == qVar.F && qVar.f17418r.getFocusedEditTextOrNull() != g1Var) {
            return Math.min(qVar.G, g1Var.length());
        }
        return Math.max(0, g1Var.getSelectionEnd());
    }

    public static void R(q qVar, int i10, int i11) {
        ti tiVar = qVar.f30213b;
        if (tiVar.f33018f0 == null) {
            return;
        }
        ti tiVar2 = new ti(qVar.getContext(), tiVar.f33018f0, false, false, true, qVar.f30212a);
        tiVar2.f33010c2 = new m(qVar, tiVar2);
        tiVar2.f33030j0.f0();
        tiVar2.Q1(1, true);
        tiVar2.m1(i10);
        tiVar2.f33084z2 = new e(qVar, tiVar2);
        tiVar2.Y = new e(qVar, tiVar2);
        tiVar2.X = new n(qVar, tiVar2);
        tiVar2.v1();
        if (i11 != 0) {
            tiVar2.F1(i11);
        }
        tiVar2.setFocusable(true);
        tiVar2.show();
    }

    public static void X(Context context, final String str, final Utilities.Callback callback, u6 u6Var) {
        String str2;
        org.telegram.ui.ActionBar.k3 i10 = vh.i(1, context, u6Var, true);
        LinearLayout d = vh.d(context, 1);
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
        d.addView(horizontalScrollView, gb1.x(-1, -2, 49, 12, 2, 12, 0));
        fi.d f7 = vh.f(24, context, u6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        i8 i8Var = new i8(strArr, horizontalScrollView, f7, zArr2, new hi.e2(strArr, 16), imageView, u6Var, new int[]{6}, 2);
        final org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, u6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        int dp2 = AndroidUtilities.dp(24.0f);
        int i12 = y6.f23354d6;
        ShapeDrawable c03 = y6.c0(dp2, y6.w0(i12, u6Var));
        b7 N = f7.N(i12);
        g3Var.setBackground(c03);
        f7.k(g3Var, c03, N, null, u6Var);
        g3Var.setText(strArr[0]);
        e3Var.addTextChangedListener(new p(strArr, i8Var));
        d.addView(g3Var, gb1.x(-1, -2, 55, 12, 8, 12, 0));
        f7.setText(LocaleController.getString(R.string.Done));
        d.addView(f7, gb1.x(-1, 48, 55, 12, 12, 12, 12));
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
        int i13 = y6.f23297a7;
        i10.setBackgroundColorKey(i13);
        i10.fixNavigationBarKey(i13);
        f7.setOnClickListener(new di.e0(f7, zArr, callback, strArr, i10, 4));
        AndroidUtilities.runOnUIThread(new k2.c(g3Var, 3), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int Q2 = this.f30213b.f33065u1.Q();
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
        this.f30213b.f33002a1.setTitle("");
        this.f17418r.f32150g3.O(false);
        Y(false);
        post(new d(this, 4));
    }

    @Override
    public final void J() {
        this.f17418r.y0(0);
    }

    @Override
    public final boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        kn knVar;
        SendMessageChatArguments sendMessageChatArguments;
        hk hkVar;
        og ogVar;
        hk hkVar2;
        int i12 = this.f17417n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        v3 v3Var = this.f17418r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && c5.f(v3Var.f17565t3, v3Var.f17567u3)) {
            b2.q0(getContext(), new b(v3Var, 0), new d(this, 2), this.f30212a);
            return false;
        }
        if (v3Var.q3() && !v3Var.s3()) {
            if (!v3Var.S3()) {
                a4 a4Var = this.f17419s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(v3Var.S3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                ti tiVar = this.f30213b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
                    if ((r2Var instanceof un) && (hkVar2 = ((un) r2Var).Y) != null) {
                        hkVar2.P0(c5.k(v3Var.f17565t3), z10, i10, i11);
                        tiVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList f32 = v3Var.f3();
                    if (!f32.isEmpty()) {
                        ArrayList H2 = v3Var.H2();
                        ArrayList E2 = v3Var.E2();
                        ArrayList a2 = b5.a(i12, f32);
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f33018f0;
                        if (r2Var2 instanceof un) {
                            un unVar = (un) r2Var2;
                            MessageObject messageObject3 = unVar.f44498z5;
                            MessageObject messageObject4 = unVar.f44295j4;
                            kn knVar2 = unVar.f44473x5;
                            j11 = unVar.X8();
                            sendMessageChatArguments = unVar.L8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                            knVar = knVar2;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            knVar = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(tiVar.M1), f32, H2, E2, a2, false, tiVar.s1(), messageObject, messageObject2, knVar, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        org.telegram.ui.ActionBar.r2 r2Var3 = tiVar.f33018f0;
                        if ((r2Var3 instanceof un) && (hkVar = ((un) r2Var3).Y) != null && (ogVar = hkVar.Z2) != null) {
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
        return !this.f17418r.q3();
    }

    public final void S(k80 k80Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, k80 k80Var2) {
        boolean z10;
        if (aVar != null && aVar.f17054b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k80Var.j(z10, i10, null, str, new ai.e0(this, aVar, pageBlock, k80Var2, 27));
        k80Var.y().f22634a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        k80Var.y().f22634a.setTextSize(1, i11);
    }

    public final boolean T() {
        v3 v3Var = this.f17418r;
        if (v3Var != null && v3Var.q3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30212a);
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                public final q f17305b;

                {
                    this.f17305b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f17305b.f30213b.dismiss();
                            return;
                        default:
                            q qVar = this.f17305b;
                            qVar.W();
                            qVar.f30213b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.b2(this) {
                public final q f17305b;

                {
                    this.f17305b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f17305b.f30213b.dismiss();
                            return;
                        default:
                            q qVar = this.f17305b;
                            qVar.W();
                            qVar.f30213b.dismiss();
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
        if (this.f17422y) {
            this.f17422y = false;
            sz szVar = this.f17420w;
            if (szVar != null) {
                szVar.t(false);
                if (!z10) {
                    this.f17420w.B();
                }
            }
        }
        this.F = null;
        sz szVar2 = this.f17420w;
        if (szVar2 != null) {
            szVar2.setTranslationY(0.0f);
            this.f17420w.setVisibility(8);
        }
        this.f17421x = false;
        this.E = 0;
        a4 a4Var = this.f17419s;
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
        if (this.f17422y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.E;
        }
        sz szVar = this.f17420w;
        float f12 = 0.0f;
        ti tiVar = this.f30213b;
        if (szVar != null) {
            if (this.f17421x) {
                float f13 = this.E - i10;
                if (this.f17422y) {
                    f11 = -tiVar.f33046o2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            szVar.setTranslationY(f10);
        }
        a4 a4Var = this.f17419s;
        if (a4Var != null) {
            boolean z10 = this.f17421x;
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
            if (!z10 || this.f17422y) {
                f7 += tiVar.f33046o2;
            }
            a4Var.getBottomContainer().animate().cancel();
            a4Var.getBottomContainer().setTranslationY(-f7);
            boolean z11 = this.f17421x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f17422y) {
                f12 += tiVar.f33046o2;
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
        org.telegram.ui.ActionBar.r2 r2Var = this.f30213b.f33018f0;
        if (r2Var instanceof un) {
            un unVar = (un) r2Var;
            v3 v3Var = this.f17418r;
            if (!v3Var.x2()) {
                return false;
            }
            TL_iv.RichMessage p22 = v3Var.p2();
            AccountInstance.getInstance(this.f17417n).getMediaDataController().saveDraft(unVar.a(), unVar.I7(unVar.f44498z5), "", null, null, null, null, 0L, false, false, p22);
            hk hkVar = unVar.Y;
            if (hkVar != null) {
                hkVar.setRichDraftPreview(p22);
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
        if (!this.f17418r.q3() && !this.f17421x) {
            z11 = false;
        } else {
            z11 = true;
        }
        ti tiVar = this.f30213b;
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
                    alpha.translationY(f10).setDuration(180L).withEndAction(new nh(tiVar, z11, 3)).start();
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
        a4 a4Var = this.f17419s;
        if (a4Var != null) {
            v3 v3Var = this.f17418r;
            boolean x22 = v3Var.x2();
            f2 f2Var = v3Var.R3;
            if (f2Var != null && !f2Var.f17228c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = a4Var.f17099r;
            ImageView imageView2 = a4Var.f17097n;
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
        a4 a4Var = this.f17419s;
        if (a4Var != null) {
            int i10 = this.f17417n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            vg sendButton = a4Var.getSendButton();
            if (z10) {
                v3 v3Var = this.f17418r;
                if (c5.f(v3Var.f17565t3, v3Var.f17567u3)) {
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
        a4 a4Var = this.f17419s;
        if (a4Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        v3 v3Var = this.f17418r;
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
        v3 v3Var = this.f17418r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f30213b.f33018f0 instanceof un) && v3Var.x2() && W()) {
                org.telegram.messenger.t.q(R.string.RichEditorDraftSaved, new wc(this.f17419s, this.f30212a), R.raw.contact_check, 36);
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
        v3 v3Var = this.f17418r;
        j3 j3Var = v3Var.f17569v3;
        ea eaVar = v3Var.f17571w3;
        if (!j3Var.x() || !eaVar.onTouchEvent(motionEvent)) {
            if (this.f17422y && (szVar = this.f17420w) != null) {
                height = (int) szVar.getY();
            } else {
                height = getHeight() - this.E;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.K;
            if (motionEvent.getAction() == 0 && this.f17421x && motionEvent.getY() < dp) {
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
        v3 v3Var = this.f17418r;
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
        return (this.f17418r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public s9 getTextSelectionHelper() {
        return this.f17418r.getTextSelectionHelper();
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final boolean j() {
        boolean z10 = this.f17422y;
        if (z10) {
            if (z10) {
                this.f17422y = false;
                sz szVar = this.f17420w;
                if (szVar != null) {
                    szVar.t(false);
                    this.f17420w.B();
                }
                V();
                return false;
            }
        } else if (this.f17421x) {
            U(false);
            return false;
        } else if (!this.f17418r.L2() && !T()) {
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
        ni0 ni0Var = this.O;
        if (ni0Var != null) {
            ni0Var.h();
            this.O = null;
        }
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        v3 v3Var = this.f17418r;
        if (v3Var != null) {
            v3Var.B2();
        }
        sz szVar = this.f17420w;
        if (szVar != null && (observersGroup = szVar.M2) != null) {
            observersGroup.removeAllObservers();
            szVar.M2 = null;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f17417n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f17417n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean p() {
        v3 v3Var = this.f17418r;
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
        this.f30213b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.a();
        }
        if (this.f17421x) {
            U(false);
        }
    }

    @Override
    public final void x() {
        boolean z10;
        if (this.f30213b.f33065u1.Q() > AndroidUtilities.dp(20.0f)) {
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
        if (z10 && this.f17421x && !this.f17422y) {
            U(false);
        }
        d0();
    }

    @Override
    public final void s() {
    }
}

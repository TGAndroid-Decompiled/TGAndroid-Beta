package kh;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
public final class u0 extends org.telegram.ui.ActionBar.g3 {
    public final int B;
    public int C;
    public boolean D;
    public final s0 E;
    public final TL_stars.TL_starGiftUnique F;
    public final long G;
    public lh.b3 H;
    public boolean I;
    public final f6 f10836b;
    public final ug.j f10837c;
    public final sg.e d;
    public final ng.a e;
    public final ug.f f10838f;
    public final ch.i h;
    public final q0 f10839n;
    public final FrameLayout f10840r;
    public final lp f10841s;
    public final TextView v;
    public final k6 f10842w;
    public final ImageView f10843x;
    public final Drawable f10844y;

    public u0(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, null, true, true);
        boolean z4;
        xn xnVar;
        this.f10837c = new ug.j();
        ch.i iVar = new ch.i(new n0(this, 0));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.F = tL_starGiftUnique;
        this.G = j10;
        this.B = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        ng.a aVar = new ng.a(obj);
        this.e = aVar;
        p0 p0Var = new p0(this, context);
        this.containerView = p0Var;
        int i10 = this.backgroundPaddingLeft;
        p0Var.setPadding(i10, 0, i10, 0);
        ug.i iVar2 = new ug.i(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar.d = iVar2;
        aVar.e = viewGroup;
        ch.e eVar = new ch.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f2615y = eVar;
        iVar.B = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = ph.l5.e(null, this.currentAccount, j10, j6.I.q());
        this.f10844y = e;
        p0Var.V(e);
        f6 f6Var2 = new f6(context, this.currentAccount, f6Var);
        this.f10836b = f6Var2;
        f6Var2.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        f6Var2.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        f6Var2.setLayoutBackground(new org.telegram.ui.ActionBar.w5(f6Var2, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        p0Var.addView(f6Var2, k7.b6.e(-2, -2, 48));
        ug.f fVar = new ug.f(context);
        this.f10838f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(aVar.c(fVar, rg.b.b(f6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(aVar.c(fVar, rg.b.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        q0 q0Var = new q0(this, AndroidUtilities.getActivity(), p0Var);
        this.f10839n = q0Var;
        q0Var.setInAppInsetsController(iVar);
        q0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        q0Var.f22846u4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        q0Var.f22841t4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((xnVar = q0Var.L2) == null || !xnVar.isInBubbleMode())) {
            z4 = true;
        } else {
            z4 = false;
        }
        q0Var.f22757e2 = z4;
        q0Var.V0(false, false, false);
        q0Var.g1(true, false);
        q0Var.f22848v1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        q0Var.getSendButton().setAlpha(0.0f);
        q0Var.getEditField().setMaxLines(3);
        q0Var.setCustomWindowView(this.container);
        q0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(q0Var, k7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), k7.b6.c(-1.0f, -1));
        this.containerView.addView(fVar, k7.b6.c(-1.0f, -1));
        q0Var.setDelegate(new r0(this, tL_starGiftUnique));
        ff ffVar = q0Var.B0;
        Object obj2 = new Object();
        InputFilter[] filters = ffVar.getFilters();
        if (filters == null) {
            ffVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            ffVar.setFilters(inputFilterArr);
        }
        k6 k6Var = new k6(context, false, false, false);
        this.f10842w = k6Var;
        k6Var.setAllowCancel(true);
        k6Var.setScaleProperty(0.6f);
        k6Var.setVisibility(8);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTextColor(getThemedColor(j6.f20281y6));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(17);
        this.containerView.addView(k6Var, k7.b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? lgVar = new lg(R.drawable.send_plane_24, context, f6Var, false);
        this.E = lgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        lgVar.F = dp;
        lgVar.G = dp2;
        lgVar.J = AndroidUtilities.dp(6.0f);
        lgVar.K = AndroidUtilities.dp(8.0f);
        lgVar.f26645e0 = true;
        this.containerView.addView((View) lgVar, k7.b6.e(110, 50, 85));
        lgVar.setScrimViewBackgroundColor(getThemedColor(j6.f19906d6));
        lgVar.setOnClickListener(new View.OnClickListener(this) {
            public final u0 f10731b;

            {
                this.f10731b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u0 u0Var = this.f10731b;
                        if (u0Var.B - u0Var.C < 0) {
                            AndroidUtilities.shakeView(u0Var.f10842w);
                            return;
                        }
                        lh.b3 b3Var = u0Var.H;
                        if (b3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = u0Var.f10839n.getTextWithEntities();
                            boolean z10 = u0Var.D;
                            lh.g5 g5Var = (lh.g5) b3Var.f12145c;
                            u0 u0Var2 = (u0) b3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                            long j11 = b3Var.f12144b;
                            mf.b bVar = (mf.b) b3Var.f12146f;
                            if (!u0Var2.I) {
                                g5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, u0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        u0 u0Var3 = this.f10731b;
                        boolean z11 = u0Var3.D;
                        u0Var3.D = !z11;
                        u0Var3.f10841s.a(z11, true);
                        return;
                    default:
                        this.f10731b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = j6.ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new org.telegram.ui.ActionBar.w5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, k7.b6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10840r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        lp lpVar = new lp(context, 18, f6Var);
        this.f10841s = lpVar;
        lpVar.getCheckBoxBase().j(true);
        lpVar.getCheckBoxBase().e = 0.9f;
        lpVar.b(i11, i11, j6.f20032k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(!this.D, false);
        f6Var2.getLayout().R = new n0(this, 1);
        lpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(lpVar, k7.b6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.w5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final u0 f10731b;

            {
                this.f10731b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u0 u0Var = this.f10731b;
                        if (u0Var.B - u0Var.C < 0) {
                            AndroidUtilities.shakeView(u0Var.f10842w);
                            return;
                        }
                        lh.b3 b3Var = u0Var.H;
                        if (b3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = u0Var.f10839n.getTextWithEntities();
                            boolean z10 = u0Var.D;
                            lh.g5 g5Var = (lh.g5) b3Var.f12145c;
                            u0 u0Var2 = (u0) b3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                            long j11 = b3Var.f12144b;
                            mf.b bVar = (mf.b) b3Var.f12146f;
                            if (!u0Var2.I) {
                                g5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, u0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        u0 u0Var3 = this.f10731b;
                        boolean z11 = u0Var3.D;
                        u0Var3.D = !z11;
                        u0Var3.f10841s.a(z11, true);
                        return;
                    default:
                        this.f10731b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, k7.b6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f10843x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.w5 w5Var = new org.telegram.ui.ActionBar.w5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = tg.c.f44929a;
        imageView.setBackground(new org.telegram.ui.ActionBar.v5(dp3, dp4, w5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final u0 f10731b;

            {
                this.f10731b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u0 u0Var = this.f10731b;
                        if (u0Var.B - u0Var.C < 0) {
                            AndroidUtilities.shakeView(u0Var.f10842w);
                            return;
                        }
                        lh.b3 b3Var = u0Var.H;
                        if (b3Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = u0Var.f10839n.getTextWithEntities();
                            boolean z10 = u0Var.D;
                            lh.g5 g5Var = (lh.g5) b3Var.f12145c;
                            u0 u0Var2 = (u0) b3Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) b3Var.e;
                            long j11 = b3Var.f12144b;
                            mf.b bVar = (mf.b) b3Var.f12146f;
                            if (!u0Var2.I) {
                                g5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, u0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        u0 u0Var3 = this.f10731b;
                        boolean z11 = u0Var3.D;
                        u0Var3.D = !z11;
                        u0Var3.f10841s.a(z11, true);
                        return;
                    default:
                        this.f10731b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, k7.b6.e(56, 56, 53));
        k7.d6.b(frameLayout, 0.05f, 1.2f);
        k7.d6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        gg.f fVar2 = new gg.f(this, 21);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(viewGroup3, fVar2);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ch.i iVar = this.h;
        int i10 = iVar.e(647).f7214b;
        float inputBubbleHeight = this.f10838f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        f6 f6Var = this.f10836b;
        FrameLayout frameLayout = this.f10840r;
        f6Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - f6Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - f6Var.getHeight()));
        f6Var.invalidate();
        float y10 = f6Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f10 = i10;
        ImageView imageView = this.f10843x;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    @Override
    public final void onBackPressed() {
        q0 q0Var = this.f10839n;
        if (q0Var != null && q0Var.t0()) {
            q0Var.m0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        ic.a(this.container, new t0(this, 0));
        l40 l40Var = l40.f26548s;
        if (l40Var.c()) {
            l40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.G);
            StringBuilder sb = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F;
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            new qc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), a2.l(tL_starGiftUnique.num, ',', sb))), null).k(true);
        }
    }

    public final Paint p(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        if (f6Var != null) {
            paint = f6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return j6.S0("paintChatActionBackground");
    }
}

package gh;

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
import lh.q6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.y30;
import org.telegram.ui.rn;

public final class x0 extends org.telegram.ui.ActionBar.e3 {
    public final int A;
    public int B;
    public boolean C;
    public final v0 D;
    public final TL_stars.TL_starGiftUnique E;
    public final long F;
    public hh.c3 G;
    public boolean H;

    public final n6 f7614b;

    public final qg.k f7615c;
    public final og.e d;

    public final jg.a f7616e;

    public final qg.g f7617f;
    public final yg.i h;

    public final t0 f7618n;

    public final FrameLayout f7619r;

    public final bp f7620s;
    public final TextView v;

    public final org.telegram.ui.Components.j6 f7621w;

    public final ImageView f7622x;

    public final Drawable f7623y;

    public x0(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        rn rnVar;
        super(context, null, true, true);
        final int i10 = 1;
        this.f7615c = new qg.k();
        final int i11 = 0;
        yg.i iVar = new yg.i(new q0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.E = tL_starGiftUnique;
        this.F = j10;
        this.A = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        og.e eVar = new og.e();
        this.d = eVar;
        jg.a aVar = new jg.a(eVar);
        this.f7616e = aVar;
        s0 s0Var = new s0(this, context);
        this.containerView = s0Var;
        int i12 = this.backgroundPaddingLeft;
        s0Var.setPadding(i12, 0, i12, 0);
        qg.j jVar = new qg.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar.d = jVar;
        aVar.f12943e = viewGroup;
        yg.e eVar2 = new yg.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f50164y = eVar2;
        iVar.A = viewGroup2;
        eVar2.d.add(iVar);
        Drawable drawableE = q6.e(null, this.currentAccount, j10, org.telegram.ui.ActionBar.g6.I.q());
        this.f7623y = drawableE;
        s0Var.V(drawableE);
        n6 n6Var = new n6(context, this.currentAccount, c6Var);
        this.f7614b = n6Var;
        n6Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        n6Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        n6Var.setLayoutBackground(new org.telegram.ui.ActionBar.t5(n6Var, this.containerView, AndroidUtilities.dp(18.0f), q("paintChatActionBackground")));
        s0Var.addView(n6Var, h7.z5.e(-2, -2, 48));
        qg.g gVar = new qg.g(context);
        this.f7617f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(aVar.c(gVar, ng.c.b(c6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(aVar.c(gVar, ng.c.b(c6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        t0 t0Var = new t0(this, AndroidUtilities.getActivity(), s0Var);
        this.f7618n = t0Var;
        t0Var.setInAppInsetsController(iVar);
        t0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        t0Var.f26182t4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        t0Var.f26177s4 = false;
        t0Var.f26092d2 = !AndroidUtilities.isInMultiwindow && ((rnVar = t0Var.K2) == null || !rnVar.isInBubbleMode());
        t0Var.U0(false, false, false);
        t0Var.f1(true, false);
        t0Var.f26184u1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        t0Var.getSendButton().setAlpha(0.0f);
        t0Var.getEditField().setMaxLines(3);
        t0Var.setCustomWindowView(this.container);
        t0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(t0Var, h7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), h7.z5.c(-1.0f, -1));
        this.containerView.addView(gVar, h7.z5.c(-1.0f, -1));
        t0Var.setDelegate(new u0(this, tL_starGiftUnique));
        bf bfVar = t0Var.A0;
        hd hdVar = new hd();
        InputFilter[] filters = bfVar.getFilters();
        if (filters == null) {
            bfVar.setFilters(new InputFilter[]{hdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = hdVar;
            bfVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f7621w = j6Var;
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        j6Var.setVisibility(8);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(17);
        this.containerView.addView(j6Var, h7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        v0 v0Var = new v0(R.drawable.send_plane_24, context, c6Var, false);
        this.D = v0Var;
        int iDp = AndroidUtilities.dp(38.0f);
        int iDp2 = AndroidUtilities.dp(38.0f);
        v0Var.E = iDp;
        v0Var.F = iDp2;
        float fDp = AndroidUtilities.dp(6.0f);
        float fDp2 = AndroidUtilities.dp(8.0f);
        v0Var.I = fDp;
        v0Var.J = fDp2;
        v0Var.f28994d0 = true;
        this.containerView.addView(v0Var, h7.z5.e(110, 50, 85));
        v0Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        v0Var.setOnClickListener(new View.OnClickListener(this) {

            public final x0 f7513b;

            {
                this.f7513b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        x0 x0Var = this.f7513b;
                        if (x0Var.A - x0Var.B >= 0) {
                            hh.c3 c3Var = x0Var.G;
                            if (c3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = x0Var.f7618n.getTextWithEntities();
                                boolean z10 = x0Var.C;
                                hh.i5 i5Var = (hh.i5) c3Var.f9067c;
                                x0 x0Var2 = (x0) c3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) c3Var.f9068e;
                                long j11 = c3Var.f9066b;
                                hf.b bVar = (hf.b) c3Var.f9069f;
                                if (!x0Var2.H) {
                                    i5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, x0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(x0Var.f7621w);
                            break;
                        }
                        break;
                    case 1:
                        x0 x0Var3 = this.f7513b;
                        boolean z11 = x0Var3.C;
                        x0Var3.C = !z11;
                        x0Var3.f7620s.a(z11, true);
                        break;
                    default:
                        this.f7513b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i13 = org.telegram.ui.ActionBar.g6.f23150ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.t5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, q("paintChatActionBackground")));
        this.containerView.addView(textView, h7.z5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7619r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, h7.z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        bp bpVar = new bp(context, 18, c6Var);
        this.f7620s = bpVar;
        bpVar.getCheckBoxBase().j(true);
        bpVar.getCheckBoxBase().f26298e = 0.9f;
        bpVar.b(i13, i13, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(!this.C, false);
        n6Var.getLayout().R = new q0(this, i10);
        bpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(bpVar, h7.z5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.t5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), q("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {

            public final x0 f7513b;

            {
                this.f7513b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        x0 x0Var = this.f7513b;
                        if (x0Var.A - x0Var.B >= 0) {
                            hh.c3 c3Var = x0Var.G;
                            if (c3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = x0Var.f7618n.getTextWithEntities();
                                boolean z10 = x0Var.C;
                                hh.i5 i5Var = (hh.i5) c3Var.f9067c;
                                x0 x0Var2 = (x0) c3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) c3Var.f9068e;
                                long j11 = c3Var.f9066b;
                                hf.b bVar = (hf.b) c3Var.f9069f;
                                if (!x0Var2.H) {
                                    i5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, x0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(x0Var.f7621w);
                            break;
                        }
                        break;
                    case 1:
                        x0 x0Var3 = this.f7513b;
                        boolean z11 = x0Var3.C;
                        x0Var3.C = !z11;
                        x0Var3.f7620s.a(z11, true);
                        break;
                    default:
                        this.f7513b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, h7.z5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f7622x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.t5 t5Var = new org.telegram.ui.ActionBar.t5(imageView, this.containerView, AndroidUtilities.dp(16.0f), q("paintChatActionBackground"));
        int iDp3 = AndroidUtilities.dp(32.0f);
        int iDp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = pg.c.f46019a;
        imageView.setBackground(new org.telegram.ui.ActionBar.s5(iDp3, iDp4, t5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final x0 f7513b;

            {
                this.f7513b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        x0 x0Var = this.f7513b;
                        if (x0Var.A - x0Var.B >= 0) {
                            hh.c3 c3Var = x0Var.G;
                            if (c3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = x0Var.f7618n.getTextWithEntities();
                                boolean z10 = x0Var.C;
                                hh.i5 i5Var = (hh.i5) c3Var.f9067c;
                                x0 x0Var2 = (x0) c3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) c3Var.f9068e;
                                long j11 = c3Var.f9066b;
                                hf.b bVar = (hf.b) c3Var.f9069f;
                                if (!x0Var2.H) {
                                    i5Var.c2(tL_starGiftUnique2, j11, bVar, textWithEntities, z10, x0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(x0Var.f7621w);
                            break;
                        }
                        break;
                    case 1:
                        x0 x0Var3 = this.f7513b;
                        boolean z11 = x0Var3.C;
                        x0Var3.C = !z11;
                        x0Var3.f7620s.a(z11, true);
                        break;
                    default:
                        this.f7513b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, h7.z5.e(56, 56, 53));
        h7.b6.b(frameLayout, 0.05f, 1.2f);
        h7.b6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        a1.c cVar = new a1.c(this, 27);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(viewGroup3, cVar);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onBackPressed() {
        t0 t0Var = this.f7618n;
        if (t0Var == null || !t0Var.t0()) {
            super.onBackPressed();
        } else {
            t0Var.m0(true);
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        ec.a(this.container, new w0(this, 0));
        y30 y30Var = y30.GiftMessageHint;
        if (y30Var.c()) {
            y30Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.F);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new mc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), i0.a.m(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final void p() {
        yg.i iVar = this.h;
        int i10 = iVar.e(647).f10490b;
        float fDp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f7617f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        n6 n6Var = this.f7614b;
        float fDp2 = ((fDp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - n6Var.getHeight()) / 2.0f);
        float height2 = (this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f);
        FrameLayout frameLayout = this.f7619r;
        n6Var.setTranslationY(Math.min(fDp2, ((height2 - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - n6Var.getHeight()));
        n6Var.invalidate();
        float y10 = n6Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f10 = i10;
        ImageView imageView = this.f7622x;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint q(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        Paint paintN = c6Var != null ? c6Var.N("paintChatActionBackground") : null;
        return paintN != null ? paintN : org.telegram.ui.ActionBar.g6.S0("paintChatActionBackground");
    }
}

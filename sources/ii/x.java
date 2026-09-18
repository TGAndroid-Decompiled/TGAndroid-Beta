package ii;

import ai.m8;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
public final class x extends bb {
    public final int X;
    public final Utilities.Callback Y;
    public l61 Z;
    public final FrameLayout f11746a0;
    public final FrameLayout f11747b0;
    public final RichMessageLayout.PreviewView f11748c0;
    public final FrameLayout f11749d0;
    public final org.telegram.ui.Cells.j3 f11750e0;
    public final ci.d f11751f0;
    public boolean f11752g0;
    public int f11753h0;
    public TL_iv.RichMessage f11754i0;

    public x(int i10, Context context, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = j6.f19006a7;
        setBackgroundColor(j6.v0(i11, e6Var));
        fixNavigationBar(j6.v0(i11, e6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11746a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, e6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, w7.y5.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i12, e6Var), PorterDuff.Mode.SRC_IN));
        w7.a6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x f11682b;

            {
                this.f11682b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11682b.dismiss();
                        return;
                    default:
                        x xVar = this.f11682b;
                        org.telegram.ui.Cells.j3 j3Var = xVar.f11750e0;
                        if (!xVar.f11752g0) {
                            TL_iv.RichMessage richMessage = xVar.f11754i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var.f20455b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f11752g0 = true;
                                xVar.f11751f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f11753h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new m8(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var.f20455b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.y5.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11747b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, e6Var);
        this.f11748c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = j6.f19062d6;
        previewView.setBackground(j6.b0(dp, j6.v0(i13, e6Var)));
        frameLayout2.addView(previewView, w7.y5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f11749d0 = frameLayout3;
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), e6Var);
        this.f11750e0 = j3Var;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f20455b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(j6.b0(AndroidUtilities.dp(20.0f), j6.v0(i13, e6Var)));
        h3Var.addTextChangedListener(new w(this));
        frameLayout3.addView(j3Var, w7.y5.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ci.d f7 = wh.f(24, context, e6Var, true);
        this.f11751f0 = f7;
        f7.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final x f11682b;

            {
                this.f11682b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11682b.dismiss();
                        return;
                    default:
                        x xVar = this.f11682b;
                        org.telegram.ui.Cells.j3 j3Var2 = xVar.f11750e0;
                        if (!xVar.f11752g0) {
                            TL_iv.RichMessage richMessage = xVar.f11754i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var2.f20455b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f11752g0 = true;
                                xVar.f11751f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f11753h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new m8(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var2.f20455b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(f7, w7.y5.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.j jVar = new s4.j();
        jVar.f42964m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        wl0 wl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.N(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f11754i0;
        ci.d dVar = this.f11751f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f11750e0.f20455b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f11753h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f11753h0, true);
            this.f11753h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f11750e0.f20455b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new i2.g0(this, 2), 200L);
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(wl0Var, getContext(), this.X, 0, true, new hi.a(this, 3), this.resourcesProvider);
        this.Z = l61Var;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}

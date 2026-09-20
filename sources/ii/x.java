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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
public final class x extends ab {
    public final int X;
    public final Utilities.Callback Y;
    public k61 Z;
    public final FrameLayout f11747a0;
    public final FrameLayout f11748b0;
    public final RichMessageLayout.PreviewView f11749c0;
    public final FrameLayout f11750d0;
    public final org.telegram.ui.Cells.k3 f11751e0;
    public final ci.d f11752f0;
    public boolean f11753g0;
    public int f11754h0;
    public TL_iv.RichMessage f11755i0;

    public x(int i10, Context context, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, f6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = j6.f19038a7;
        setBackgroundColor(j6.v0(i11, f6Var));
        fixNavigationBar(j6.v0(i11, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11747a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, f6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, w7.y5.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x f11683b;

            {
                this.f11683b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11683b.dismiss();
                        return;
                    default:
                        x xVar = this.f11683b;
                        org.telegram.ui.Cells.k3 k3Var = xVar.f11751e0;
                        if (!xVar.f11753g0) {
                            TL_iv.RichMessage richMessage = xVar.f11755i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = k3Var.f20527b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f11753g0 = true;
                                xVar.f11752f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f11754h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new m8(xVar, 16));
                                AndroidUtilities.hideKeyboard(k3Var.f20527b);
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
        this.f11748b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, f6Var);
        this.f11749c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = j6.f19094d6;
        previewView.setBackground(j6.b0(dp, j6.v0(i13, f6Var)));
        frameLayout2.addView(previewView, w7.y5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f11750d0 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.f11751e0 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.f20527b;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        k3Var.setBackground(j6.b0(AndroidUtilities.dp(20.0f), j6.v0(i13, f6Var)));
        i3Var.addTextChangedListener(new w(this));
        frameLayout3.addView(k3Var, w7.y5.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ci.d g10 = rk.g(24, context, f6Var, true);
        this.f11752f0 = g10;
        g10.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final x f11683b;

            {
                this.f11683b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11683b.dismiss();
                        return;
                    default:
                        x xVar = this.f11683b;
                        org.telegram.ui.Cells.k3 k3Var2 = xVar.f11751e0;
                        if (!xVar.f11753g0) {
                            TL_iv.RichMessage richMessage = xVar.f11755i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = k3Var2.f20527b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f11753g0 = true;
                                xVar.f11752f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f11754h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new m8(xVar, 16));
                                AndroidUtilities.hideKeyboard(k3Var2.f20527b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(g10, w7.y5.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.j jVar = new s4.j();
        jVar.f43009m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        vl0 vl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.N(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f11755i0;
        ci.d dVar = this.f11752f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f11751e0.f20527b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f11754h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f11754h0, true);
            this.f11754h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f11751e0.f20527b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new i2.g0(this, 2), 200L);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(vl0Var, getContext(), this.X, 0, true, new hi.a(this, 3), this.resourcesProvider);
        this.Z = k61Var;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}

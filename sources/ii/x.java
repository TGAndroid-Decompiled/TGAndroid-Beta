package ii;

import ai.n8;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
public final class x extends cb {
    public final int X;
    public final Utilities.Callback Y;
    public u61 Z;
    public final FrameLayout f12742a0;
    public final FrameLayout f12743b0;
    public final RichMessageLayout.PreviewView f12744c0;
    public final FrameLayout f12745d0;
    public final org.telegram.ui.Cells.j3 f12746e0;
    public final ci.d f12747f0;
    public boolean f12748g0;
    public int f12749h0;
    public TL_iv.RichMessage f12750i0;

    public x(int i10, Context context, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, true, false, d6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = org.telegram.ui.ActionBar.i6.f20761a7;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12742a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x f12693b;

            {
                this.f12693b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12693b.dismiss();
                        return;
                    default:
                        x xVar = this.f12693b;
                        org.telegram.ui.Cells.j3 j3Var = xVar.f12746e0;
                        if (!xVar.f12748g0) {
                            TL_iv.RichMessage richMessage = xVar.f12750i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var.f22306b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f12748g0 = true;
                                xVar.f12747f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f12749h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new n8(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var.f22306b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12743b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, d6Var);
        this.f12744c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = org.telegram.ui.ActionBar.i6.f20817d6;
        previewView.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.v0(i13, d6Var)));
        frameLayout2.addView(previewView, w7.z5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f12745d0 = frameLayout3;
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), d6Var);
        this.f12746e0 = j3Var;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22306b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.i6.v0(i13, d6Var)));
        h3Var.addTextChangedListener(new w(this));
        frameLayout3.addView(j3Var, w7.z5.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ci.d g10 = ok.g(24, context, d6Var, true);
        this.f12747f0 = g10;
        g10.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final x f12693b;

            {
                this.f12693b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12693b.dismiss();
                        return;
                    default:
                        x xVar = this.f12693b;
                        org.telegram.ui.Cells.j3 j3Var2 = xVar.f12746e0;
                        if (!xVar.f12748g0) {
                            TL_iv.RichMessage richMessage = xVar.f12750i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var2.f22306b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f12748g0 = true;
                                xVar.f12747f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f12749h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new n8(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var2.f22306b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(g10, w7.z5.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.j jVar = new s4.j();
        jVar.f46562m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        zl0 zl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.N(false);
        N();
    }

    public final void N() {
        TL_iv.RichMessage richMessage = this.f12750i0;
        ci.d dVar = this.f12747f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f12746e0.f22306b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f12749h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f12749h0, true);
            this.f12749h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f12746e0.f22306b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new i2.h0(this, 2), 200L);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.X, 0, true, new hi.a(this, 3), this.resourcesProvider);
        this.Z = u61Var;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}

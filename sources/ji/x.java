package ji;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
public final class x extends db {
    public final int X;
    public final Utilities.Callback Y;
    public a71 Z;
    public final FrameLayout f13606a0;
    public final FrameLayout f13607b0;
    public final RichMessageLayout.PreviewView f13608c0;
    public final FrameLayout f13609d0;
    public final org.telegram.ui.Cells.j3 f13610e0;
    public final di.d f13611f0;
    public boolean f13612g0;
    public int f13613h0;
    public TL_iv.RichMessage f13614i0;

    public x(int i10, Context context, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, c6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = org.telegram.ui.ActionBar.g6.f19543a7;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13606a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.a(56.0f, 22.0f, 6.0f, 56.0f, 0.0f, -1, 51));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x f13570b;

            {
                this.f13570b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f13570b.dismiss();
                        return;
                    default:
                        x xVar = this.f13570b;
                        org.telegram.ui.Cells.j3 j3Var = xVar.f13610e0;
                        if (!xVar.f13612g0) {
                            TL_iv.RichMessage richMessage = xVar.f13614i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var.f21083b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f13612g0 = true;
                                xVar.f13611f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f13613h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new z7(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var.f21083b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.a(48.0f, 0.0f, 10.0f, 12.0f, 0.0f, 48, 53));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f13607b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, c6Var);
        this.f13608c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = org.telegram.ui.ActionBar.g6.f19601d6;
        previewView.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.w0(i13, c6Var)));
        frameLayout2.addView(previewView, w7.z5.d(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f13609d0 = frameLayout3;
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.f13610e0 = j3Var;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f21083b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.w0(i13, c6Var)));
        h3Var.addTextChangedListener(new w(this));
        frameLayout3.addView(j3Var, w7.z5.d(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        di.d f7 = sk.f(24, context, c6Var, true);
        this.f13611f0 = f7;
        f7.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final x f13570b;

            {
                this.f13570b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f13570b.dismiss();
                        return;
                    default:
                        x xVar = this.f13570b;
                        org.telegram.ui.Cells.j3 j3Var2 = xVar.f13610e0;
                        if (!xVar.f13612g0) {
                            TL_iv.RichMessage richMessage = xVar.f13614i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var2.f21083b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f13612g0 = true;
                                xVar.f13611f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f13613h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new z7(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var2.f21083b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(f7, w7.z5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 87));
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.N(false);
        Q();
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }

    public final void Q() {
        TL_iv.RichMessage richMessage = this.f13614i0;
        di.d dVar = this.f13611f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f13610e0.f21083b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f13613h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f13613h0, true);
            this.f13613h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f13610e0.f21083b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new ig.t0(this, 7), 200L);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.X, 0, true, new ii.a(this, 3), this.resourcesProvider);
        this.Z = a71Var;
        return a71Var;
    }
}

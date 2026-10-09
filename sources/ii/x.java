package ii;

import ai.o8;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
public final class x extends eb {
    public final int X;
    public final Utilities.Callback Y;
    public c71 Z;
    public final FrameLayout f12790a0;
    public final FrameLayout f12791b0;
    public final RichMessageLayout.PreviewView f12792c0;
    public final FrameLayout f12793d0;
    public final org.telegram.ui.Cells.j3 f12794e0;
    public final ci.d f12795f0;
    public boolean f12796g0;
    public int f12797h0;
    public TL_iv.RichMessage f12798i0;

    public x(int i10, Context context, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = org.telegram.ui.ActionBar.i6.f20741a7;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12790a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, w7.x5.a(56.0f, 22.0f, 6.0f, 56.0f, 0.0f, -1, 51));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), PorterDuff.Mode.SRC_IN));
        w7.z5.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x f12741b;

            {
                this.f12741b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12741b.dismiss();
                        return;
                    default:
                        x xVar = this.f12741b;
                        org.telegram.ui.Cells.j3 j3Var = xVar.f12794e0;
                        if (!xVar.f12796g0) {
                            TL_iv.RichMessage richMessage = xVar.f12798i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var.f22297b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f12796g0 = true;
                                xVar.f12795f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f12797h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new o8(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var.f22297b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.a(48.0f, 0.0f, 10.0f, 12.0f, 0.0f, 48, 53));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12791b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, e6Var);
        this.f12792c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = org.telegram.ui.ActionBar.i6.f20797d6;
        previewView.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.w0(i13, e6Var)));
        frameLayout2.addView(previewView, w7.x5.d(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f12793d0 = frameLayout3;
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), e6Var);
        this.f12794e0 = j3Var;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22297b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.i6.w0(i13, e6Var)));
        h3Var.addTextChangedListener(new w(this));
        frameLayout3.addView(j3Var, w7.x5.d(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ci.d f7 = bi.f(24, context, e6Var, true);
        this.f12795f0 = f7;
        f7.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final x f12741b;

            {
                this.f12741b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12741b.dismiss();
                        return;
                    default:
                        x xVar = this.f12741b;
                        org.telegram.ui.Cells.j3 j3Var2 = xVar.f12794e0;
                        if (!xVar.f12796g0) {
                            TL_iv.RichMessage richMessage = xVar.f12798i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = j3Var2.f22297b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f12796g0 = true;
                                xVar.f12795f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f12797h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new o8(xVar, 16));
                                AndroidUtilities.hideKeyboard(j3Var2.f22297b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(f7, w7.x5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 87));
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.j jVar = new s4.j();
        jVar.f47696m = false;
        jVar.C = false;
        jVar.o(hs.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        qm0 qm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.N(false);
        Q();
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }

    public final void Q() {
        TL_iv.RichMessage richMessage = this.f12798i0;
        ci.d dVar = this.f12795f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f12794e0.f22297b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f12797h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f12797h0, true);
            this.f12797h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f12794e0.f22297b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new i2.h0(this, 2), 200L);
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.X, 0, true, new hi.a(this, 3), this.resourcesProvider);
        this.Z = c71Var;
        return c71Var;
    }
}

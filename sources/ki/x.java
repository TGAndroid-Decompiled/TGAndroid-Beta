package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
public final class x extends bb {
    public final int X;
    public final Utilities.Callback Y;
    public b71 Z;
    public final FrameLayout f15689a0;
    public final FrameLayout f15690b0;
    public final RichMessageLayout.PreviewView f15691c0;
    public final FrameLayout f15692d0;
    public final org.telegram.ui.Cells.h3 f15693e0;
    public final ei.d f15694f0;
    public boolean f15695g0;
    public int f15696h0;
    public TL_iv.RichMessage f15697i0;

    public x(int i10, Context context, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, g6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = k6.f21125a7;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15689a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = k6.G6;
        r6.W(textView, i12, g6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(imageView, i12, g6Var, PorterDuff.Mode.SRC_IN);
        w7.b6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x f15625b;

            {
                this.f15625b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15625b.dismiss();
                        return;
                    default:
                        x xVar = this.f15625b;
                        org.telegram.ui.Cells.h3 h3Var = xVar.f15693e0;
                        if (!xVar.f15695g0) {
                            TL_iv.RichMessage richMessage = xVar.f15697i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = h3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f15695g0 = true;
                                xVar.f15694f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f15696h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new ai.h(xVar, 22));
                                AndroidUtilities.hideKeyboard(h3Var.d);
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
        this.f15690b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, g6Var);
        this.f15691c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = k6.f21183d6;
        ShapeDrawable c02 = k6.c0(dp, k6.w0(i13, g6Var));
        n6 O = r6.O(i13);
        previewView.setBackground(c02);
        r6.k(previewView, c02, O, null, g6Var);
        frameLayout2.addView(previewView, w7.z5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15692d0 = frameLayout3;
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), g6Var);
        this.f15693e0 = h3Var;
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        ShapeDrawable c03 = k6.c0(AndroidUtilities.dp(20.0f), k6.w0(i13, g6Var));
        n6 O2 = r6.O(i13);
        h3Var.setBackground(c03);
        r6.k(h3Var, c03, O2, null, g6Var);
        f3Var.addTextChangedListener(new w(this));
        frameLayout3.addView(h3Var, w7.z5.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ei.d g10 = sl.g(24, context, g6Var, true);
        this.f15694f0 = g10;
        g10.i(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final x f15625b;

            {
                this.f15625b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15625b.dismiss();
                        return;
                    default:
                        x xVar = this.f15625b;
                        org.telegram.ui.Cells.h3 h3Var2 = xVar.f15693e0;
                        if (!xVar.f15695g0) {
                            TL_iv.RichMessage richMessage = xVar.f15697i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = xVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                xVar.dismiss();
                                return;
                            }
                            String trim = h3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                xVar.f15695g0 = true;
                                xVar.f15694f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                xVar.f15696h0 = ConnectionsManager.getInstance(xVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new ai.h(xVar, 22));
                                AndroidUtilities.hideKeyboard(h3Var2.d);
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
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.N(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f15697i0;
        ei.d dVar = this.f15694f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f15693e0.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f15696h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f15696h0, true);
            this.f15696h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f15693e0.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new u(this, 0), 200L);
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.X, 0, true, new hg.o(this, 14), this.resourcesProvider);
        this.Z = b71Var;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}

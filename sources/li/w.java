package li;

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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
public final class w extends bb {
    public final int X;
    public final Utilities.Callback Y;
    public j71 Z;
    public final FrameLayout f17582a0;
    public final FrameLayout f17583b0;
    public final RichMessageLayout.PreviewView f17584c0;
    public final FrameLayout f17585d0;
    public final org.telegram.ui.Cells.g3 f17586e0;
    public final fi.d f17587f0;
    public boolean f17588g0;
    public int f17589h0;
    public TL_iv.RichMessage f17590i0;

    public w(int i10, Context context, Utilities.Callback callback, u6 u6Var) {
        super(context, null, true, false, u6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = y6.f23297a7;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17582a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = y6.G6;
        f7.V(textView, i12, u6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, gb1.h(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f7.t(imageView, i12, u6Var, PorterDuff.Mode.SRC_IN);
        gb1.b(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w f17504b;

            {
                this.f17504b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f17504b.dismiss();
                        return;
                    default:
                        w wVar = this.f17504b;
                        org.telegram.ui.Cells.g3 g3Var = wVar.f17586e0;
                        if (!wVar.f17588g0) {
                            TL_iv.RichMessage richMessage = wVar.f17590i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = wVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                return;
                            }
                            String trim = g3Var.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                wVar.f17588g0 = true;
                                wVar.f17587f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                wVar.f17589h0 = ConnectionsManager.getInstance(wVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new bi.i0(wVar, 21));
                                AndroidUtilities.hideKeyboard(g3Var.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, gb1.h(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f17583b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, u6Var);
        this.f17584c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = y6.f23354d6;
        ShapeDrawable c02 = y6.c0(dp, y6.w0(i13, u6Var));
        b7 N = f7.N(i13);
        previewView.setBackground(c02);
        f7.k(previewView, c02, N, null, u6Var);
        frameLayout2.addView(previewView, gb1.g(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f17585d0 = frameLayout3;
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), u6Var);
        this.f17586e0 = g3Var;
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        ShapeDrawable c03 = y6.c0(AndroidUtilities.dp(20.0f), y6.w0(i13, u6Var));
        b7 N2 = f7.N(i13);
        g3Var.setBackground(c03);
        f7.k(g3Var, c03, N2, null, u6Var);
        e3Var.addTextChangedListener(new v(this));
        frameLayout3.addView(g3Var, gb1.g(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        fi.d f7 = vh.f(24, context, u6Var, true);
        this.f17587f0 = f7;
        f7.i(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final w f17504b;

            {
                this.f17504b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f17504b.dismiss();
                        return;
                    default:
                        w wVar = this.f17504b;
                        org.telegram.ui.Cells.g3 g3Var2 = wVar.f17586e0;
                        if (!wVar.f17588g0) {
                            TL_iv.RichMessage richMessage = wVar.f17590i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = wVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                return;
                            }
                            String trim = g3Var2.d.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                wVar.f17588g0 = true;
                                wVar.f17587f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                wVar.f17589h0 = ConnectionsManager.getInstance(wVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new bi.i0(wVar, 21));
                                AndroidUtilities.hideKeyboard(g3Var2.d);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(f7, gb1.h(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.O(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.f17590i0;
        fi.d dVar = this.f17587f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f17586e0.d.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f17589h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f17589h0, true);
            this.f17589h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f17586e0.d);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new k2.c(this, 4), 200L);
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.X, 0, true, new hi.e2(this, 17), this.resourcesProvider);
        this.Z = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}

package hi;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
public final class y extends ab {
    public final int X;
    public final Utilities.Callback Y;
    public j61 Z;
    public final FrameLayout f9963a0;
    public final FrameLayout f9964b0;
    public final RichMessageLayout.PreviewView f9965c0;
    public final FrameLayout f9966d0;
    public final org.telegram.ui.Cells.i3 f9967e0;
    public final bi.d f9968f0;
    public boolean f9969g0;
    public int f9970h0;
    public TL_iv.RichMessage f9971i0;

    public y(int i10, Context context, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, f6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = org.telegram.ui.ActionBar.j6.f17872a7;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9963a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, w7.a6.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        w7.c6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f9917b;

            {
                this.f9917b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9917b.dismiss();
                        return;
                    default:
                        y yVar = this.f9917b;
                        org.telegram.ui.Cells.i3 i3Var = yVar.f9967e0;
                        if (!yVar.f9969g0) {
                            TL_iv.RichMessage richMessage = yVar.f9971i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = yVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                yVar.dismiss();
                                return;
                            }
                            String trim = i3Var.f19293b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                yVar.f9969g0 = true;
                                yVar.f9968f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                yVar.f9970h0 = ConnectionsManager.getInstance(yVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new bi.c2(yVar, 13));
                                AndroidUtilities.hideKeyboard(i3Var.f19293b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.a6.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9964b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, f6Var);
        this.f9965c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f17928d6;
        previewView.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
        frameLayout2.addView(previewView, w7.a6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f9966d0 = frameLayout3;
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.f9967e0 = i3Var;
        org.telegram.ui.Cells.g3 g3Var = i3Var.f19293b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
        g3Var.addTextChangedListener(new x(this));
        frameLayout3.addView(i3Var, w7.a6.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        bi.d g10 = em.g(24, context, f6Var, true);
        this.f9968f0 = g10;
        g10.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final y f9917b;

            {
                this.f9917b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9917b.dismiss();
                        return;
                    default:
                        y yVar = this.f9917b;
                        org.telegram.ui.Cells.i3 i3Var2 = yVar.f9967e0;
                        if (!yVar.f9969g0) {
                            TL_iv.RichMessage richMessage = yVar.f9971i0;
                            if (richMessage != null) {
                                Utilities.Callback callback2 = yVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                yVar.dismiss();
                                return;
                            }
                            String trim = i3Var2.f19293b.getText().toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                yVar.f9969g0 = true;
                                yVar.f9968f0.setLoading(true);
                                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                inputaicomposetonesingleuse.custom_prompt = trim;
                                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                yVar.f9970h0 = ConnectionsManager.getInstance(yVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new bi.c2(yVar, 13));
                                AndroidUtilities.hideKeyboard(i3Var2.f19293b);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.containerView.addView(g10, w7.a6.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
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
        TL_iv.RichMessage richMessage = this.f9971i0;
        bi.d dVar = this.f9968f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.f9967e0.f19293b.getText().toString().trim()));
        }
    }

    @Override
    public final void dismiss() {
        if (this.f9970h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.f9970h0, true);
            this.f9970h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.f9967e0.f19293b);
        super.dismiss();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new gg.v1(this, 4), 200L);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.X, 0, true, new gi.a(this, 3), this.resourcesProvider);
        this.Z = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}

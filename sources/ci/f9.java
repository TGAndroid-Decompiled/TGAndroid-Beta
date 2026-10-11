package ci;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.sm0;
public final class f9 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f5086b;
    public ArrayList f5087c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback f5088e;
    public final sm0 f5089f;
    public final e9 h;
    public final TextView f5090n;

    public f9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f5086b = i10;
        this.f5087c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.f5088e = callback;
        this.containerView = new c9(this, context, d6Var);
        sm0 sm0Var = new sm0(context, d6Var);
        this.f5089f = sm0Var;
        int i12 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i12, 0, i12, 0);
        e9 e9Var = new e9(this);
        this.h = e9Var;
        sm0Var.setAdapter(e9Var);
        sm0Var.setLayoutManager(new s4.d0());
        this.containerView.addView(sm0Var, w7.x5.e(-1, -1, 119));
        sm0Var.setOnItemClickListener(new gm0() {
            @Override
            public final void d(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                f9 f9Var = f9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) f9Var.f5087c.get(i13 - 2);
                int i14 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                Utilities.Callback callback2 = callback;
                if (i14 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    f9Var.dismiss();
                    return;
                }
                Context context2 = f9Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context2, 3, d6Var2);
                a2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new ai.d5(a2Var, callback2, inputPeer2, 4), true, d6Var2);
                f9Var.dismiss();
            }
        });
        sm0Var.setOnScrollListener(new d9(this));
        TextView textView = new TextView(getContext());
        this.f5090n = textView;
        ai.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, w7.x5.d(-2.0f, -1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (u() > ((int) (AndroidUtilities.displaySize.y * 0.5f))) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesSendAsUpdate) {
            this.f5087c = MessagesController.getInstance(this.f5086b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f5086b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f5086b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float u() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            sm0 sm0Var = this.f5089f;
            if (i10 < sm0Var.getChildCount()) {
                View childAt = sm0Var.getChildAt(i10);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i10++;
            } else {
                return measuredHeight;
            }
        }
    }
}

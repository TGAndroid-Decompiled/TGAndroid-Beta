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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.zl0;
public final class e9 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f5041b;
    public ArrayList f5042c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback f5043e;
    public final zl0 f5044f;
    public final d9 h;
    public final TextView f5045n;

    public e9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f5041b = i10;
        this.f5042c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.f5043e = callback;
        this.containerView = new b9(this, context, d6Var);
        zl0 zl0Var = new zl0(context, d6Var);
        this.f5044f = zl0Var;
        int i12 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i12, 0, i12, 0);
        d9 d9Var = new d9(this);
        this.h = d9Var;
        zl0Var.setAdapter(d9Var);
        zl0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(zl0Var, w7.z5.e(-1, -1, 119));
        zl0Var.setOnItemClickListener(new ml0() {
            @Override
            public final void d(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                e9 e9Var = e9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) e9Var.f5042c.get(i13 - 2);
                long j3 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    e9Var.dismiss();
                    return;
                }
                Context context2 = e9Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context2, 3, d6Var2);
                b2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new ai.c5(b2Var, callback2, inputPeer2, 4), true, d6Var2);
                e9Var.dismiss();
            }
        });
        zl0Var.setOnScrollListener(new c9(this));
        TextView textView = new TextView(getContext());
        this.f5045n = textView;
        bi.m(org.telegram.ui.ActionBar.i6.G6, d6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, w7.z5.c(-2.0f, -1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (s() > ((int) (AndroidUtilities.displaySize.y * 0.5f))) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesSendAsUpdate) {
            this.f5042c = MessagesController.getInstance(this.f5041b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f5041b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f5041b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            zl0 zl0Var = this.f5044f;
            if (i10 < zl0Var.getChildCount()) {
                View childAt = zl0Var.getChildAt(i10);
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

package kh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wk0;
public final class u8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f16165b;
    public ArrayList f16166c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback f16167e;
    public final wk0 f16168f;
    public final t8 h;
    public final TextView f16169n;

    public u8(Context context, final int i9, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        int i10;
        fixNavigationBar();
        MessagesController.getInstance(i9).getStoriesController().R();
        this.f16165b = i9;
        this.f16166c = MessagesController.getInstance(i9).getStoriesController().T;
        this.d = inputPeer;
        this.f16167e = callback;
        this.containerView = new r8(this, context, b6Var);
        wk0 wk0Var = new wk0(context, b6Var);
        this.f16168f = wk0Var;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, 0, i11, 0);
        t8 t8Var = new t8(this);
        this.h = t8Var;
        wk0Var.setAdapter(t8Var);
        wk0Var.setLayoutManager(new f2.m0());
        this.containerView.addView(wk0Var, g7.e6.e(-1, -1, 119));
        wk0Var.setOnItemClickListener(new mk0() {
            @Override
            public final void a(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                u8 u8Var = u8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) u8Var.f16166c.get(i12 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    u8Var.dismiss();
                    return;
                }
                Context context2 = u8Var.getContext();
                org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context2, 3, b6Var2);
                c2Var.q(200L);
                MessagesController.getInstance(i9).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new g7(c2Var, callback2, inputPeer2, 1), true, b6Var2);
                u8Var.dismiss();
            }
        });
        wk0Var.setOnScrollListener(new s8(this));
        TextView textView = new TextView(getContext());
        this.f16169n = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i10 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i10 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i10));
        this.containerView.addView(textView, g7.e6.c(-2.0f, -1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (s() > ((int) (AndroidUtilities.displaySize.y * 0.5f))) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesSendAsUpdate) {
            this.f16166c = MessagesController.getInstance(this.f16165b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f16165b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f16165b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.f16168f;
            if (i9 < wk0Var.getChildCount()) {
                View childAt = wk0Var.getChildAt(i9);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i9++;
            } else {
                return measuredHeight;
            }
        }
    }
}

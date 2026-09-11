package di;

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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.zk0;
public final class h9 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f7331b;
    public ArrayList f7332c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback f7333e;
    public final ll0 f7334f;
    public final g9 h;
    public final TextView f7335n;

    public h9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f7331b = i10;
        this.f7332c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.f7333e = callback;
        this.containerView = new e9(this, context, f6Var);
        ll0 ll0Var = new ll0(context, f6Var);
        this.f7334f = ll0Var;
        int i12 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i12, 0, i12, 0);
        g9 g9Var = new g9(this);
        this.h = g9Var;
        ll0Var.setAdapter(g9Var);
        ll0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(ll0Var, w7.x5.e(-1, -1, 119));
        ll0Var.setOnItemClickListener(new zk0() {
            @Override
            public final void a(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                h9 h9Var = h9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) h9Var.f7332c.get(i13 - 2);
                long j3 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    h9Var.dismiss();
                    return;
                }
                Context context2 = h9Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context2, 3, f6Var2);
                b2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new s7(b2Var, callback2, inputPeer2, 1), true, f6Var2);
                h9Var.dismiss();
            }
        });
        ll0Var.setOnScrollListener(new f9(this));
        TextView textView = new TextView(getContext());
        this.f7335n = textView;
        vl.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, w7.x5.c(-2.0f, -1));
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
            this.f7332c = MessagesController.getInstance(this.f7331b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f7331b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f7331b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            ll0 ll0Var = this.f7334f;
            if (i10 < ll0Var.getChildCount()) {
                View childAt = ll0Var.getChildAt(i10);
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

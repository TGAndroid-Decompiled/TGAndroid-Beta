package nh;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.zk0;
public final class h8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17851b;
    public ArrayList f17852c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback f17853e;
    public final jl0 f17854f;
    public final g8 h;
    public final TextView f17855n;

    public h8(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f17851b = i10;
        this.f17852c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.f17853e = callback;
        this.containerView = new e8(this, context, c6Var);
        jl0 jl0Var = new jl0(context, c6Var);
        this.f17854f = jl0Var;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, 0, i12, 0);
        g8 g8Var = new g8(this);
        this.h = g8Var;
        jl0Var.setAdapter(g8Var);
        jl0Var.setLayoutManager(new f2.j0());
        this.containerView.addView(jl0Var, i7.f6.e(-1, -1, 119));
        jl0Var.setOnItemClickListener(new zk0() {
            @Override
            public final void c(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                h8 h8Var = h8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) h8Var.f17852c.get(i13 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    h8Var.dismiss();
                    return;
                }
                Context context2 = h8Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context2, 3, c6Var2);
                c2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new cg.f0(c2Var, callback2, inputPeer2, 2), true, c6Var2);
                h8Var.dismiss();
            }
        });
        jl0Var.setOnScrollListener(new f8(this));
        TextView textView = new TextView(getContext());
        this.f17855n = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, i7.f6.c(-2.0f, -1));
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
            this.f17852c = MessagesController.getInstance(this.f17851b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f17851b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f17851b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            jl0 jl0Var = this.f17854f;
            if (i10 < jl0Var.getChildCount()) {
                View childAt = jl0Var.getChildAt(i10);
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

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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.yl0;
public final class i9 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f4799b;
    public ArrayList f4800c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final yl0 f4801f;
    public final h9 h;
    public final TextView f4802n;

    public i9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f4799b = i10;
        this.f4800c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new f9(this, context, f6Var);
        yl0 yl0Var = new yl0(context, f6Var);
        this.f4801f = yl0Var;
        int i12 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i12, 0, i12, 0);
        h9 h9Var = new h9(this);
        this.h = h9Var;
        yl0Var.setAdapter(h9Var);
        yl0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(yl0Var, w7.y5.e(-1, -1, 119));
        yl0Var.setOnItemClickListener(new ml0() {
            @Override
            public final void d(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                i9 i9Var = i9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) i9Var.f4800c.get(i13 - 2);
                long j3 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    i9Var.dismiss();
                    return;
                }
                Context context2 = i9Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context2, 3, f6Var2);
                b2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new s7(b2Var, callback2, inputPeer2, 1), true, f6Var2);
                i9Var.dismiss();
            }
        });
        yl0Var.setOnScrollListener(new g9(this));
        TextView textView = new TextView(getContext());
        this.f4802n = textView;
        rk.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, w7.y5.c(-2.0f, -1));
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
            this.f4800c = MessagesController.getInstance(this.f4799b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f4799b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f4799b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int S;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            yl0 yl0Var = this.f4801f;
            if (i10 < yl0Var.getChildCount()) {
                View childAt = yl0Var.getChildAt(i10);
                if (childAt != null && (S = RecyclerView.S(childAt)) != -1 && S > 0) {
                    measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i10++;
            } else {
                return measuredHeight;
            }
        }
    }
}

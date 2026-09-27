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
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.yl0;
public final class e9 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f4666b;
    public ArrayList f4667c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final yl0 f4668f;
    public final d9 h;
    public final TextView f4669n;

    public e9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f4666b = i10;
        this.f4667c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new b9(this, context, e6Var);
        yl0 yl0Var = new yl0(context, e6Var);
        this.f4668f = yl0Var;
        int i12 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i12, 0, i12, 0);
        d9 d9Var = new d9(this);
        this.h = d9Var;
        yl0Var.setAdapter(d9Var);
        yl0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(yl0Var, w7.y5.e(-1, -1, 119));
        yl0Var.setOnItemClickListener(new ml0() {
            @Override
            public final void d(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                e9 e9Var = e9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) e9Var.f4667c.get(i13 - 2);
                long j3 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    e9Var.dismiss();
                    return;
                }
                Context context2 = e9Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context2, 3, e6Var2);
                c2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new ai.c5(c2Var, callback2, inputPeer2, 4), true, e6Var2);
                e9Var.dismiss();
            }
        });
        yl0Var.setOnScrollListener(new c9(this));
        TextView textView = new TextView(getContext());
        this.f4669n = textView;
        qk.n(org.telegram.ui.ActionBar.i6.G6, e6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, e6Var));
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
            this.f4667c = MessagesController.getInstance(this.f4666b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f4666b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f4666b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int S;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            yl0 yl0Var = this.f4668f;
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

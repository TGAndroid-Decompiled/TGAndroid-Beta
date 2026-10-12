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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.mm0;
public final class e9 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f6908b;
    public ArrayList f6909c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final mm0 f6910f;
    public final d9 h;
    public final TextView f6911n;

    public e9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f6908b = i10;
        this.f6909c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new b9(this, context, c6Var);
        mm0 mm0Var = new mm0(context, c6Var);
        this.f6910f = mm0Var;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, 0);
        d9 d9Var = new d9(this);
        this.h = d9Var;
        mm0Var.setAdapter(d9Var);
        mm0Var.setLayoutManager(new s4.b0());
        this.containerView.addView(mm0Var, w7.a6.e(-1, -1, 119));
        mm0Var.setOnItemClickListener(new am0() {
            @Override
            public final void a(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                e9 e9Var = e9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) e9Var.f6909c.get(i13 - 2);
                int i14 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                Utilities.Callback callback2 = callback;
                if (i14 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    e9Var.dismiss();
                    return;
                }
                Context context2 = e9Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context2, 3, c6Var2);
                a2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new bi.q4(a2Var, callback2, inputPeer2, 4), true, c6Var2);
                e9Var.dismiss();
            }
        });
        mm0Var.setOnScrollListener(new c9(this));
        TextView textView = new TextView(getContext());
        this.f6911n = textView;
        yh.n(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, w7.a6.d(-2.0f, -1));
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
            this.f6909c = MessagesController.getInstance(this.f6908b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f6908b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f6908b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float u() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.f6910f;
            if (i10 < mm0Var.getChildCount()) {
                View childAt = mm0Var.getChildAt(i10);
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

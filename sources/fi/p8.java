package fi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zl0;
public final class p8 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f11444b;
    public ArrayList f11445c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final mm0 f11446f;
    public final o8 h;
    public final TextView f11447n;

    public p8(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f11444b = i10;
        this.f11445c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new m8(this, context, u6Var);
        mm0 mm0Var = new mm0(context, u6Var);
        this.f11446f = mm0Var;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, 0);
        o8 o8Var = new o8(this);
        this.h = o8Var;
        mm0Var.setAdapter(o8Var);
        mm0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(mm0Var, gb1.i(-1, -1, 119));
        mm0Var.setOnItemClickListener(new zl0() {
            @Override
            public final void c(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                p8 p8Var = p8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) p8Var.f11445c.get(i13 - 2);
                int i14 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                Utilities.Callback callback2 = callback;
                if (i14 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    p8Var.dismiss();
                    return;
                }
                Context context2 = p8Var.getContext();
                org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context2, 3, u6Var2);
                e2Var.r(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new bi.v3(e2Var, callback2, inputPeer2, 5), true, u6Var2);
                p8Var.dismiss();
            }
        });
        mm0Var.setOnScrollListener(new n8(this));
        TextView textView = new TextView(getContext());
        this.f11447n = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, textView, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, gb1.g(-2.0f, -1));
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
            this.f11445c = MessagesController.getInstance(this.f11444b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f11444b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f11444b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.f11446f;
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

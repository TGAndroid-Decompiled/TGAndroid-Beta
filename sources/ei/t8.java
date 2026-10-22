package ei;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.xl0;
public final class t8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f9857b;
    public ArrayList f9858c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final jm0 f9859f;
    public final s8 h;
    public final TextView f9860n;

    public t8(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f9857b = i10;
        this.f9858c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new q8(this, context, d6Var);
        jm0 jm0Var = new jm0(context, d6Var);
        this.f9859f = jm0Var;
        int i12 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i12, 0, i12, 0);
        s8 s8Var = new s8(this);
        this.h = s8Var;
        jm0Var.setAdapter(s8Var);
        jm0Var.setLayoutManager(new s4.b0());
        this.containerView.addView(jm0Var, w7.z5.e(-1, -1, 119));
        jm0Var.setOnItemClickListener(new xl0() {
            @Override
            public final void a(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                t8 t8Var = t8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) t8Var.f9858c.get(i13 - 2);
                int i14 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                Utilities.Callback callback2 = callback;
                if (i14 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    t8Var.dismiss();
                    return;
                }
                Context context2 = t8Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context2, 3, d6Var2);
                b2Var.r(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new ai.a4(b2Var, callback2, inputPeer2, 5), true, d6Var2);
                t8Var.dismiss();
            }
        });
        jm0Var.setOnScrollListener(new r8(this));
        TextView textView = new TextView(getContext());
        this.f9860n = textView;
        ok.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, d6Var));
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
        if (u() > ((int) (AndroidUtilities.displaySize.y * 0.5f))) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesSendAsUpdate) {
            this.f9858c = MessagesController.getInstance(this.f9857b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f9857b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f9857b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float u() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            jm0 jm0Var = this.f9859f;
            if (i10 < jm0Var.getChildCount()) {
                View childAt = jm0Var.getChildAt(i10);
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

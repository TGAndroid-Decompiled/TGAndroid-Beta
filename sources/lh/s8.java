package lh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.zk0;

public final class s8 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {

    public final int f16734b;

    public ArrayList f16735c;
    public final TLRPC.InputPeer d;

    public final Utilities.Callback f16736e;

    public final zk0 f16737f;
    public final r8 h;

    public final TextView f16738n;

    public s8(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f16734b = i10;
        this.f16735c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.f16736e = callback;
        this.containerView = new p8(this, context, c6Var);
        zk0 zk0Var = new zk0(context, c6Var);
        this.f16737f = zk0Var;
        int i11 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i11, 0, i11, 0);
        r8 r8Var = new r8(this);
        this.h = r8Var;
        zk0Var.setAdapter(r8Var);
        zk0Var.setLayoutManager(new f2.k0());
        this.containerView.addView(zk0Var, h7.z5.e(-1, -1, 119));
        zk0Var.setOnItemClickListener(new pk0() {
            @Override
            public final void a(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                s8 s8Var = this.f16486a;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) s8Var.f16735c.get(i12 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    s8Var.dismiss();
                    return;
                }
                Context context2 = s8Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context2, 3, c6Var2);
                b2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new ag.o0(b2Var, callback2, inputPeer2, 2), true, c6Var2);
                s8Var.dismiss();
            }
        });
        zk0Var.setOnScrollListener(new q8(this));
        TextView textView = new TextView(getContext());
        this.f16738n = textView;
        rl.l(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(z10 ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
        this.containerView.addView(textView, h7.z5.c(-2.0f, -1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return t() > ((float) ((int) (((float) AndroidUtilities.displaySize.y) * 0.5f)));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesSendAsUpdate) {
            this.f16735c = MessagesController.getInstance(this.f16734b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f16734b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f16734b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float t() {
        int iR;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            zk0 zk0Var = this.f16737f;
            if (i10 >= zk0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (childAt != null && (iR = RecyclerView.R(childAt)) != -1 && iR > 0) {
                measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i10++;
        }
    }
}

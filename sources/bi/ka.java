package bi;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.vl0;
public final class ka extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f3002b;
    public ArrayList f3003c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final vl0 f3004f;
    public final ja h;
    public final TextView f3005n;

    public ka(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f3002b = i10;
        this.f3003c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new ha(this, context, f6Var);
        vl0 vl0Var = new vl0(context, f6Var);
        this.f3004f = vl0Var;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, 0, i12, 0);
        ja jaVar = new ja(this);
        this.h = jaVar;
        vl0Var.setAdapter(jaVar);
        vl0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(vl0Var, w7.a6.e(-1, -1, 119));
        vl0Var.setOnItemClickListener(new jl0() {
            @Override
            public final void d(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                ka kaVar = ka.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) kaVar.f3003c.get(i13 - 2);
                long j3 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    kaVar.dismiss();
                    return;
                }
                Context context2 = kaVar.getContext();
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, f6Var2);
                d2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new t8(d2Var, callback2, inputPeer2, 1), true, f6Var2);
                kaVar.dismiss();
            }
        });
        vl0Var.setOnScrollListener(new ia(this));
        TextView textView = new TextView(getContext());
        this.f3005n = textView;
        em.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, w7.a6.c(-2.0f, -1));
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
            this.f3003c = MessagesController.getInstance(this.f3002b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f3002b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f3002b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            vl0 vl0Var = this.f3004f;
            if (i10 < vl0Var.getChildCount()) {
                View childAt = vl0Var.getChildAt(i10);
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

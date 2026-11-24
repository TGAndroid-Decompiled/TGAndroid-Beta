package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p19 extends FrameLayout {
    public final tk4 a;
    public final TextView b;
    public final hd0 c;
    public final ImageView d;
    public final bf0 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final k47 s;
    public int w;
    public gu2 x;

    public p19(Context context, int i, k47 k47Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i;
        this.s = k47Var;
        tk4 tk4Var = new tk4(context, null);
        this.a = tk4Var;
        tk4Var.e(cmb.F8, cmb.h6, -1);
        tk4Var.setViewType(13);
        tk4Var.setIsSingleCell(false);
        addView(tk4Var, qoe.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.D8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, qoe.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        hd0 hd0Var = new hd0(context, false);
        this.c = hd0Var;
        hd0Var.setStyle(11);
        hd0Var.setAvatarsTextSize(gm.L(22.0f));
        addView(hd0Var, qoe.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, qoe.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(2131232329).mutate();
        anb.x(this, mutate, cmb.E8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        bf0 bf0Var = new bf0(context);
        this.e = bf0Var;
        addView(bf0Var, qoe.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        hd0Var.setAlpha(0.0f);
        setBackground(cmb.L0(false));
    }

    public final void a() {
        int i = this.f;
        oc7 r1 = oc7.r1(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        k47 k47Var = this.s;
        tL_messages_getMessageReactionsList.peer = r1.i1(k47.B0(k47Var.k));
        tL_messages_getMessageReactionsList.id = k47Var.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new r15(this, (byte) 24), 64);
    }

    public List<o19> getSeenUsers() {
        return this.n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j;
        super.onAttachedToWindow();
        int i = this.f;
        oc7 r1 = oc7.r1(i);
        k47 k47Var = this.s;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(k47Var.x0()));
        TLRPC.ChatFull M0 = r1.M0(k47Var.x0());
        if (L0 != null && k47Var.O3() && k47Var.p4() && !k47Var.Y2() && !k47Var.n4() && !k47Var.m4() && !k47Var.k.media_unread && !k47Var.E4() && ConnectionsManager.getInstance(i).getCurrentTime() - k47Var.k.date < 604800 && ((sd2.n0(L0) || !sd2.T(L0)) && M0 != null && M0.participants_count <= oc7.r1(i).l4.N0.f() && !(k47Var.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = k47Var.e1();
            tL_messages_getMessageReadParticipants.peer = oc7.r1(i).i1(k47.B0(k47Var.k));
            TLRPC.Peer peer = k47Var.k.from_id;
            if (peer != null) {
                j = peer.user_id;
            } else {
                j = 0;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new jb7(this, j, L0, (byte) 13), 64);
            return;
        }
        a();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.w;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        tk4 tk4Var = this.a;
        if (tk4Var.getVisibility() == 0) {
            this.h = true;
            tk4Var.setVisibility(8);
            super.onMeasure(i, i2);
            tk4Var.getLayoutParams().width = getMeasuredWidth();
            tk4Var.setVisibility(0);
            this.h = false;
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(gu2 gu2Var) {
        this.x = gu2Var;
    }
}

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
public final class oz8 extends FrameLayout {
    public final pi4 a;
    public final TextView b;
    public final hc0 c;
    public final ImageView d;
    public final be0 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final k27 s;
    public int w;
    public vs2 x;

    public oz8(Context context, int i, k27 k27Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i;
        this.s = k27Var;
        pi4 pi4Var = new pi4(context, null);
        this.a = pi4Var;
        pi4Var.e(bkb.F8, bkb.h6, -1);
        pi4Var.setViewType(13);
        pi4Var.setIsSingleCell(false);
        addView(pi4Var, nme.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, bkb.D8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, nme.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        hc0 hc0Var = new hc0(context, false);
        this.c = hc0Var;
        hc0Var.setStyle(11);
        hc0Var.setAvatarsTextSize(gl.L(22.0f));
        addView(hc0Var, nme.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, nme.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(2131232328).mutate();
        zkb.x(this, mutate, bkb.E8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        be0 be0Var = new be0(context);
        this.e = be0Var;
        addView(be0Var, nme.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        hc0Var.setAlpha(0.0f);
        setBackground(bkb.L0(false));
    }

    public final void a() {
        int i = this.f;
        na7 q1 = na7.q1(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        k27 k27Var = this.s;
        tL_messages_getMessageReactionsList.peer = q1.h1(k27.B0(k27Var.k));
        tL_messages_getMessageReactionsList.id = k27Var.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new n35(this, (byte) 23), 64);
    }

    public List<nz8> getSeenUsers() {
        return this.n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j;
        super.onAttachedToWindow();
        int i = this.f;
        na7 q1 = na7.q1(i);
        k27 k27Var = this.s;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(k27Var.x0()));
        TLRPC.ChatFull L0 = q1.L0(k27Var.x0());
        if (K0 != null && k27Var.O3() && k27Var.p4() && !k27Var.Y2() && !k27Var.n4() && !k27Var.m4() && !k27Var.k.media_unread && !k27Var.E4() && ConnectionsManager.getInstance(i).getCurrentTime() - k27Var.k.date < 604800 && ((hc2.n0(K0) || !hc2.T(K0)) && L0 != null && L0.participants_count <= na7.q1(i).k4.N0.f() && !(k27Var.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = k27Var.e1();
            tL_messages_getMessageReadParticipants.peer = na7.q1(i).h1(k27.B0(k27Var.k));
            TLRPC.Peer peer = k27Var.k.from_id;
            if (peer != null) {
                j = peer.user_id;
            } else {
                j = 0;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new w47(this, j, K0, (byte) 13), 64);
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
        pi4 pi4Var = this.a;
        if (pi4Var.getVisibility() == 0) {
            this.h = true;
            pi4Var.setVisibility(8);
            super.onMeasure(i, i2);
            pi4Var.getLayoutParams().width = getMeasuredWidth();
            pi4Var.setVisibility(0);
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

    public void setSeenCallback(vs2 vs2Var) {
        this.x = vs2Var;
    }
}

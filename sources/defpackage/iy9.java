package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class iy9 extends fy0 {
    public TLRPC.Chat S1;
    public final TLRPC.User T1;
    public final eg U1;
    public TLObject V1;
    public final FrameLayout W1;
    public final ay9 X1;
    public final cy9 Y1;
    public final hy9 Z1;
    public final hy9 a2;
    public final hy9 b2;
    public final u41 c2;
    public l5c d2;
    public Context e2;

    public iy9(Activity activity, TLRPC.Chat chat, TLRPC.User user, eg egVar, wjb wjbVar) {
        super(2, wjbVar, (Context) activity, true);
        this.E1 = gl.L(12.0f);
        this.Q0 = true;
        this.S1 = chat;
        this.T1 = user;
        this.V1 = user;
        this.U1 = egVar;
        y6c.h(this.a).f();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = gl.L(20.0f);
        int i = bkb.N5;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, this.J0));
        vkb M = zkb.M(i);
        frameLayout2.setBackground(b0);
        zkb.j(frameLayout2, b0, M, null, wjbVar);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232742);
        int i2 = bkb.O5;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, nme.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(activity);
        this.X1 = editTextBoldCursor;
        zkb.X(editTextBoldCursor, bkb.Q5, wjbVar);
        zkb.D(editTextBoldCursor, i2, wjbVar);
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(gl.L(46.0f), 0, gl.L(16.0f), 0);
        editTextBoldCursor.setTranslationY(-gl.L(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 23));
        editTextBoldCursor.addTextChangedListener(new by9(this));
        editTextBoldCursor.setHint(k96.M0(2131745565, null));
        frameLayout2.addView((View) editTextBoldCursor, nme.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, nme.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.o1));
        float f = this.u0 / gl.p;
        viewGroup.addView(frameLayout, max, nme.d(-1, 64.0f, 55, f, 0.0f, f, 0.0f));
        ?? frameLayout3 = new FrameLayout(activity);
        this.Y1 = frameLayout3;
        be0 be0Var = new be0(activity);
        be0Var.setImageDrawable(new oy8(2131624315, gl.L(130.0f), gl.L(130.0f)));
        frameLayout3.addView(be0Var, nme.e(130, 130, 17));
        hy9 hy9Var = new hy9(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        hy9Var.e.add(new zk9(this, (byte) 21));
        this.Z1 = hy9Var;
        hy9 hy9Var2 = new hy9(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        hy9Var2.e.add(new zk9(this, (byte) 21));
        this.a2 = hy9Var2;
        hy9 hy9Var3 = new hy9(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        hy9Var3.e.add(new zk9(this, (byte) 21));
        this.b2 = hy9Var3;
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, gl.L(68.0f));
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new f09(this, (byte) 4));
        dy9 dy9Var = new dy9(this);
        dy9Var.m = false;
        dy9Var.C = false;
        dy9Var.o(s33.h);
        dy9Var.n(350L);
        this.n1.setItemAnimator(dy9Var);
        this.n1.addOnLayoutChangeListener(new ey9(this));
        this.n1.j(new fy9(this));
        this.b.addView(new gy9(this, getContext()), nme.e(-1, 68, 87));
        u41 u41Var = new u41(wjbVar, getContext(), true);
        u41Var.setRoundRadius(24);
        this.c2 = u41Var;
        u41Var.setColor(bkb.v0(bkb.q7, this.J0));
        Z0(false);
        ViewGroup viewGroup2 = this.b;
        float f2 = (this.u0 / gl.p) + 10.0f;
        viewGroup2.addView(u41Var, nme.d(-1, 48.0f, 87, f2, 10.0f, f2, 10.0f));
        u41Var.setOnClickListener(new ik8(this, (byte) 20));
        l5c l5cVar = this.d2;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
        hy9Var.b();
        hy9Var2.b();
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new tf8(this, (byte) 16), this.J0);
        this.d2 = l5cVar;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131754207, null);
    }

    public final void Y0(TLRPC.User user, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.e2 = getContext();
        }
        if (this.e2 != null) {
            if (tL_inputCheckPasswordSRP != null && !hc2.T(this.S1)) {
                d S = LaunchActivity.S();
                if (S == null) {
                    return;
                }
                na7.q1(this.a).P(this.e2, this.S1.id, S, new lt(this, user, tL_inputCheckPasswordSRP, twoStepVerificationActivity, (byte) 19), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (hc2.T(this.S1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.S1;
                tL_inputChannel.channel_id = chat.id;
                tL_inputChannel.access_hash = chat.access_hash;
            } else {
                tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
            }
            if (tL_inputCheckPasswordSRP != null) {
                tL_inputCheckPasswordEmpty = tL_inputCheckPasswordSRP;
            } else {
                tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
            tL_channels_editCreator.user_id = na7.q1(this.a).o1(user);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new fn0(this, tL_inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, (byte) 15));
        }
    }

    public final void Z0(boolean z) {
        int i;
        int L;
        String str;
        if (hc2.V(this.S1)) {
            i = 2131748811;
        } else {
            i = 2131748802;
        }
        float L2 = gl.L(32.0f);
        u41 u41Var = this.c2;
        if (u41Var.getWidth() > 0) {
            L = u41Var.getWidth();
        } else {
            L = gl.q.x - gl.L(20.0f);
        }
        float max = Math.max(L2, (L - gl.L(16.0f)) - u41Var.getTextPaint().measureText(k96.M0(i, null)));
        TLObject tLObject = this.V1;
        if (tLObject instanceof TLRPC.User) {
            str = l7c.l((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        u41Var.i(k96.a0(null, null, i, TextUtils.ellipsize(str, u41Var.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z, true);
    }

    public final void a1() {
        float f = -gl.L(64.0f);
        int i = 0;
        while (true) {
            o39 o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                break;
            }
            View childAt = o39Var.getChildAt(i);
            if (childAt.getId() == 3) {
                f = childAt.getY();
                break;
            }
            i++;
        }
        this.W1.setTranslationY(f);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Z1.a();
        this.a2.a();
        this.b2.a();
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            u41 u41Var = this.c2;
            if (u41Var != null) {
                u41Var.setColor(bkb.v0(bkb.q7, this.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}

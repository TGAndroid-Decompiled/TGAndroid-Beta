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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b2a extends ny0 {
    public TLRPC.Chat S1;
    public final TLRPC.User T1;
    public final zd U1;
    public TLObject V1;
    public final FrameLayout W1;
    public final t1a X1;
    public final v1a Y1;
    public final a2a Z1;
    public final a2a a2;
    public final a2a b2;
    public final c51 c2;
    public l9c d2;
    public Context e2;

    public b2a(Activity activity, TLRPC.Chat chat, TLRPC.User user, zd zdVar, vnb vnbVar) {
        super(2, vnbVar, (Context) activity, true);
        this.E1 = hl.L(12.0f);
        this.Q0 = true;
        this.S1 = chat;
        this.T1 = user;
        this.V1 = user;
        this.U1 = zdVar;
        yac.h(this.a).f();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = hl.L(20.0f);
        int i = aob.O5;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, this.J0));
        uob M = yob.M(i);
        frameLayout2.setBackground(b0);
        yob.j(frameLayout2, b0, M, null, vnbVar);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232753);
        int i2 = aob.P5;
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, tre.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(activity);
        this.X1 = editTextBoldCursor;
        yob.X(editTextBoldCursor, aob.R5, vnbVar);
        yob.D(editTextBoldCursor, i2, vnbVar);
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(hl.L(46.0f), 0, hl.L(16.0f), 0);
        editTextBoldCursor.setTranslationY(-hl.L(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 23));
        editTextBoldCursor.addTextChangedListener(new u1a(this));
        editTextBoldCursor.setHint(ob6.M0(2131745485, null));
        frameLayout2.addView((View) editTextBoldCursor, tre.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, tre.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.o1));
        float f = this.u0 / hl.p;
        viewGroup.addView(frameLayout, max, tre.d(-1, 64.0f, 55, f, 0.0f, f, 0.0f));
        ?? frameLayout3 = new FrameLayout(activity);
        this.Y1 = frameLayout3;
        de0 de0Var = new de0(activity);
        de0Var.setImageDrawable(new b29(2131624315, hl.L(130.0f), hl.L(130.0f)));
        frameLayout3.addView(de0Var, tre.e(130, 130, 17));
        a2a a2aVar = new a2a(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        a2aVar.e.add(new ux9(this, (byte) 7));
        this.Z1 = a2aVar;
        a2a a2aVar2 = new a2a(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        a2aVar2.e.add(new ux9(this, (byte) 7));
        this.a2 = a2aVar2;
        a2a a2aVar3 = new a2a(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        a2aVar3.e.add(new ux9(this, (byte) 7));
        this.b2 = a2aVar3;
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, hl.L(68.0f));
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new t39(this, (byte) 4));
        w1a w1aVar = new w1a(this);
        w1aVar.m = false;
        w1aVar.C = false;
        w1aVar.o(k43.h);
        w1aVar.n(350L);
        this.n1.setItemAnimator(w1aVar);
        this.n1.addOnLayoutChangeListener(new x1a(this));
        this.n1.j(new y1a(this));
        this.b.addView(new z1a(this, getContext()), tre.e(-1, 68, 87));
        c51 c51Var = new c51(vnbVar, getContext(), true);
        c51Var.setRoundRadius(24);
        this.c2 = c51Var;
        c51Var.setColor(aob.v0(aob.r7, this.J0));
        a1(false);
        ViewGroup viewGroup2 = this.b;
        float f2 = (this.u0 / hl.p) + 10.0f;
        viewGroup2.addView(c51Var, tre.d(-1, 48.0f, 87, f2, 10.0f, f2, 10.0f));
        c51Var.setOnClickListener(new jn8(this, (byte) 22));
        l9c l9cVar = this.d2;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
        a2aVar.b();
        a2aVar2.b();
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new hj8(this, (byte) 16), this.J0);
        this.d2 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131754203, null);
    }

    public final void Z0(TLRPC.User user, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.e2 = getContext();
        }
        if (this.e2 != null) {
            if (tL_inputCheckPasswordSRP != null && !xc2.T(this.S1)) {
                e S = LaunchActivity.S();
                if (S == null) {
                    return;
                }
                uc7.s1(this.a).R(this.e2, this.S1.id, S, new pt(this, user, tL_inputCheckPasswordSRP, twoStepVerificationActivity, (byte) 21), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (xc2.T(this.S1)) {
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
            tL_channels_editCreator.user_id = uc7.s1(this.a).q1(user);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new in0(this, tL_inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, (byte) 15));
        }
    }

    public final void a1(boolean z) {
        int i;
        int L;
        String str;
        if (xc2.V(this.S1)) {
            i = 2131748757;
        } else {
            i = 2131748748;
        }
        float L2 = hl.L(32.0f);
        c51 c51Var = this.c2;
        if (c51Var.getWidth() > 0) {
            L = c51Var.getWidth();
        } else {
            L = hl.q.x - hl.L(20.0f);
        }
        float max = Math.max(L2, (L - hl.L(16.0f)) - c51Var.getTextPaint().measureText(ob6.M0(i, null)));
        TLObject tLObject = this.V1;
        if (tLObject instanceof TLRPC.User) {
            str = lbc.l((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        c51Var.i(ob6.a0(null, null, i, TextUtils.ellipsize(str, c51Var.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z, true);
    }

    public final void b1() {
        float f = -hl.L(64.0f);
        int i = 0;
        while (true) {
            d79 d79Var = this.n1;
            if (i >= d79Var.getChildCount()) {
                break;
            }
            View childAt = d79Var.getChildAt(i);
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
            c51 c51Var = this.c2;
            if (c51Var != null) {
                c51Var.setColor(aob.v0(aob.r7, this.J0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

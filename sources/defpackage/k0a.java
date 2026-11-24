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
public final class k0a extends mz0 {
    public TLRPC.Chat S1;
    public final TLRPC.User T1;
    public final eh U1;
    public TLObject V1;
    public final FrameLayout W1;
    public final b0a X1;
    public final e0a Y1;
    public final j0a Z1;
    public final j0a a2;
    public final j0a b2;
    public final b61 c2;
    public l7c d2;
    public Context e2;

    public k0a(Activity activity, TLRPC.Chat chat, TLRPC.User user, eh ehVar, ylb ylbVar) {
        super(2, ylbVar, (Context) activity, true);
        this.E1 = gm.L(12.0f);
        this.Q0 = true;
        this.S1 = chat;
        this.T1 = user;
        this.V1 = user;
        this.U1 = ehVar;
        z8c.h(this.a).f();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = gm.L(20.0f);
        int i = cmb.N5;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i, this.J0));
        wmb M = anb.M(i);
        frameLayout2.setBackground(b0);
        anb.j(frameLayout2, b0, M, null, ylbVar);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232754);
        int i2 = cmb.O5;
        anb.s(imageView, i2, ylbVar, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, qoe.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(activity);
        this.X1 = editTextBoldCursor;
        anb.X(editTextBoldCursor, cmb.Q5, ylbVar);
        anb.D(editTextBoldCursor, i2, ylbVar);
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(gm.L(46.0f), 0, gm.L(16.0f), 0);
        editTextBoldCursor.setTranslationY(-gm.L(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 24));
        editTextBoldCursor.addTextChangedListener(new d0a(this));
        editTextBoldCursor.setHint(jb6.M0(2131745491, null));
        frameLayout2.addView((View) editTextBoldCursor, qoe.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, qoe.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.o1));
        float f = this.u0 / gm.p;
        viewGroup.addView(frameLayout, max, qoe.d(-1, 64.0f, 55, f, 0.0f, f, 0.0f));
        ?? frameLayout3 = new FrameLayout(activity);
        this.Y1 = frameLayout3;
        bf0 bf0Var = new bf0(activity);
        bf0Var.setImageDrawable(new p09(2131624315, gm.L(130.0f), gm.L(130.0f)));
        frameLayout3.addView(bf0Var, qoe.e(130, 130, 17));
        j0a j0aVar = new j0a(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        j0aVar.e.add(new kf9(this, (byte) 29));
        this.Z1 = j0aVar;
        j0a j0aVar2 = new j0a(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        j0aVar2.e.add(new kf9(this, (byte) 29));
        this.a2 = j0aVar2;
        j0a j0aVar3 = new j0a(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        j0aVar3.e.add(new kf9(this, (byte) 29));
        this.b2 = j0aVar3;
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, gm.L(68.0f));
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new s19(this, (byte) 5));
        f0a f0aVar = new f0a(this);
        f0aVar.m = false;
        f0aVar.C = false;
        f0aVar.o(d53.h);
        f0aVar.n(350L);
        this.n1.setItemAnimator(f0aVar);
        this.n1.addOnLayoutChangeListener(new g0a(this));
        this.n1.j(new h0a(this));
        this.b.addView(new i0a(this, getContext()), qoe.e(-1, 68, 87));
        b61 b61Var = new b61(ylbVar, getContext(), true);
        b61Var.setRoundRadius(24);
        this.c2 = b61Var;
        b61Var.setColor(cmb.v0(cmb.q7, this.J0));
        Z0(false);
        ViewGroup viewGroup2 = this.b;
        float f2 = (this.u0 / gm.p) + 10.0f;
        viewGroup2.addView(b61Var, qoe.d(-1, 48.0f, 87, f2, 10.0f, f2, 10.0f));
        b61Var.setOnClickListener(new wk8(this, (byte) 23));
        l7c l7cVar = this.d2;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
        j0aVar.b();
        j0aVar2.b();
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new vh8(this, (byte) 16), this.J0);
        this.d2 = l7cVar;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131754175, null);
    }

    public final void Y0(TLRPC.User user, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.e2 = getContext();
        }
        if (this.e2 != null) {
            if (tL_inputCheckPasswordSRP != null && !sd2.T(this.S1)) {
                d S = LaunchActivity.S();
                if (S == null) {
                    return;
                }
                oc7.r1(this.a).P(this.e2, this.S1.id, S, new lu(this, user, tL_inputCheckPasswordSRP, twoStepVerificationActivity, (byte) 19), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (sd2.T(this.S1)) {
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
            tL_channels_editCreator.user_id = oc7.r1(this.a).p1(user);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new fo0(this, tL_inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, (byte) 15));
        }
    }

    public final void Z0(boolean z) {
        int i;
        int L;
        String str;
        if (sd2.V(this.S1)) {
            i = 2131748760;
        } else {
            i = 2131748751;
        }
        float L2 = gm.L(32.0f);
        b61 b61Var = this.c2;
        if (b61Var.getWidth() > 0) {
            L = b61Var.getWidth();
        } else {
            L = gm.q.x - gm.L(20.0f);
        }
        float max = Math.max(L2, (L - gm.L(16.0f)) - b61Var.getTextPaint().measureText(jb6.M0(i, null)));
        TLObject tLObject = this.V1;
        if (tLObject instanceof TLRPC.User) {
            str = m9c.l((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        b61Var.i(jb6.a0(null, null, i, TextUtils.ellipsize(str, b61Var.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z, true);
    }

    public final void a1() {
        float f = -gm.L(64.0f);
        int i = 0;
        while (true) {
            r59 r59Var = this.n1;
            if (i >= r59Var.getChildCount()) {
                break;
            }
            View childAt = r59Var.getChildAt(i);
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
            b61 b61Var = this.c2;
            if (b61Var != null) {
                b61Var.setColor(cmb.v0(cmb.q7, this.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

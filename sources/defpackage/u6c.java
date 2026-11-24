package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6c extends FrameLayout implements tjb {
    public final wjb a;
    public final be0 b;
    public final df0 c;
    public final jia d;
    public final ImageView e;
    public final pb0 f;
    public String h;
    public int n;
    public final int r;
    public int s;
    public int w;
    public final boolean x;

    public u6c(Context context, wjb wjbVar) {
        super(context);
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        float f6;
        float f7;
        float f8;
        this.r = y6c.t0;
        this.x = true;
        this.a = wjbVar;
        this.s = bkb.v0(bkb.x6, wjbVar);
        this.w = bkb.v0(bkb.m6, wjbVar);
        this.f = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z = k96.a0;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i6 = i | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 11.0f;
        }
        if (z) {
            f2 = 11.0f;
        } else {
            f2 = 0.0f;
        }
        addView(be0Var, nme.d(48, 48.0f, i6, f, 11.0f, f2, 0.0f));
        df0 df0Var = new df0(context, (byte) 5);
        this.c = df0Var;
        kk7.i(df0Var);
        zkb.W(df0Var, bkb.F6, wjbVar);
        df0Var.setTextSize(17);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        df0Var.setGravity(i2 | 48);
        boolean z2 = k96.a0;
        if (z2) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i7 = i3 | 48;
        if (z2) {
            f3 = 28.0f;
        } else {
            f3 = 72.0f;
        }
        if (z2) {
            f4 = 72.0f;
        } else {
            f4 = 28.0f;
        }
        addView(df0Var, nme.d(-1, 20.0f, i7, f3, 14.5f, f4, 0.0f));
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        jiaVar.setTextSize(14);
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        jiaVar.setGravity(i4 | 48);
        boolean z3 = k96.a0;
        if (z3) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i8 = i5 | 48;
        if (z3) {
            f5 = 28.0f;
        } else {
            f5 = 72.0f;
        }
        if (z3) {
            f6 = 72.0f;
        } else {
            f6 = 28.0f;
        }
        addView(jiaVar, nme.d(-1, 20.0f, i8, f5, 37.5f, f6, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z4 = k96.a0;
        int i9 = (z4 ? 5 : 3) | 16;
        if (z4) {
            f7 = 0.0f;
        } else {
            f7 = 16.0f;
        }
        if (z4) {
            f8 = 16.0f;
        } else {
            f8 = 0.0f;
        }
        addView(imageView, nme.d(-2, -2.0f, i9, f7, 0.0f, f8, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String str2;
        TLRPC.UserStatus userStatus;
        float f;
        be0 be0Var = this.b;
        jia jiaVar = this.d;
        df0 df0Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            df0Var.k("");
            jiaVar.l("", false);
            be0Var.setImageDrawable(null);
            return;
        }
        this.h = str;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            user = null;
        } else {
            chat = null;
            user = null;
        }
        pb0 pb0Var = this.f;
        if (user != null) {
            pb0Var.q(user);
        } else if (chat != null) {
            pb0Var.p(chat);
        } else {
            pb0Var.j(this.n, "#", null, null);
        }
        if (user != null) {
            str2 = l7c.r(user);
        } else {
            str2 = chat.title;
        }
        df0Var.k(str2);
        if (this.h != null) {
            jiaVar.setTextColor(this.s);
            jiaVar.l(this.h, false);
            if (be0Var != null) {
                be0Var.f(user, pb0Var);
            }
        } else if (user != null) {
            if (user.bot) {
                jiaVar.setTextColor(this.s);
                if (user.bot_chat_history) {
                    jiaVar.l(k96.M0(2131752934, null), false);
                } else {
                    jiaVar.l(k96.M0(2131752935, null), false);
                }
            } else {
                long j = user.id;
                int i = this.r;
                if (j != y6c.h(i).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i).getCurrentTime()) && !na7.q1(i).a0.containsKey(Long.valueOf(user.id)))) {
                    jiaVar.setTextColor(this.s);
                    jiaVar.l(k96.d0(i, user, null, null), false);
                } else {
                    jiaVar.setTextColor(this.w);
                    jiaVar.l(k96.M0(2131747633, null), false);
                }
            }
            be0Var.f(user, pb0Var);
        } else if (chat != null) {
            jiaVar.setTextColor(this.s);
            if (hc2.T(chat) && !chat.megagroup) {
                int i2 = chat.participants_count;
                if (i2 != 0) {
                    jiaVar.l(k96.G(i2, "Subscribers", new Object[0]), false);
                } else if (!hc2.t0(chat)) {
                    jiaVar.l(k96.M0(2131752317, null), false);
                } else {
                    jiaVar.l(k96.M0(2131752306, null), false);
                }
            } else {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    jiaVar.l(k96.G(i3, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    jiaVar.l(k96.M0(2131748450, null), false);
                } else if (!hc2.t0(chat)) {
                    jiaVar.l(k96.M0(2131748449, null), false);
                } else {
                    jiaVar.l(k96.M0(2131748446, null), false);
                }
            }
            be0Var.f(chat, pb0Var);
        } else {
            be0Var.setImageDrawable(pb0Var);
        }
        if (chat != null && chat.forum) {
            f = 14.0f;
        } else {
            f = 24.0f;
        }
        be0Var.setRoundRadius(gl.L(f));
        ImageView imageView = this.e;
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
            return;
        }
        imageView.getVisibility();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(70.0f), 1073741824));
    }

    public void setCurrentId(int i) {
        this.n = i;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i;
        int i2;
        try {
            int i3 = this.s;
            int i4 = this.w;
            wjb wjbVar = this.a;
            if (this.x) {
                this.s = bkb.v0(bkb.x6, wjbVar);
                this.w = bkb.v0(bkb.m6, wjbVar);
            }
            jia jiaVar = this.d;
            if (jiaVar != null) {
                int textColor = jiaVar.getTextColor();
                if (textColor == i4 && i4 != (i2 = this.w)) {
                    jiaVar.setTextColor(i2);
                } else if (textColor == i3 && i3 != (i = this.s)) {
                    jiaVar.setTextColor(i);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z) {
    }
}

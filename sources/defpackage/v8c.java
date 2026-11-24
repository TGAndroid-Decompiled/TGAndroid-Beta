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
public final class v8c extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final dg0 c;
    public final lka d;
    public final ImageView e;
    public final pc0 f;
    public String h;
    public int n;
    public final int r;
    public int s;
    public int w;
    public final boolean x;

    public v8c(Context context, ylb ylbVar) {
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
        this.r = z8c.t0;
        this.x = true;
        this.a = ylbVar;
        this.s = cmb.v0(cmb.x6, ylbVar);
        this.w = cmb.v0(cmb.m6, ylbVar);
        this.f = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(24.0f));
        boolean z = jb6.a0;
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
        addView(bf0Var, qoe.d(48, 48.0f, i6, f, 11.0f, f2, 0.0f));
        dg0 dg0Var = new dg0(context, (byte) 5);
        this.c = dg0Var;
        nm7.i(dg0Var);
        anb.W(dg0Var, cmb.F6, ylbVar);
        dg0Var.setTextSize(17);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        dg0Var.setGravity(i2 | 48);
        boolean z2 = jb6.a0;
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
        addView(dg0Var, qoe.d(-1, 20.0f, i7, f3, 14.5f, f4, 0.0f));
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        lkaVar.setTextSize(14);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        lkaVar.setGravity(i4 | 48);
        boolean z3 = jb6.a0;
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
        addView(lkaVar, qoe.d(-1, 20.0f, i8, f5, 37.5f, f6, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z4 = jb6.a0;
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
        addView(imageView, qoe.d(-2, -2.0f, i9, f7, 0.0f, f8, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String str2;
        TLRPC.UserStatus userStatus;
        float f;
        bf0 bf0Var = this.b;
        lka lkaVar = this.d;
        dg0 dg0Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            dg0Var.k("");
            lkaVar.l("", false);
            bf0Var.setImageDrawable(null);
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
        pc0 pc0Var = this.f;
        if (user != null) {
            pc0Var.q(user);
        } else if (chat != null) {
            pc0Var.p(chat);
        } else {
            pc0Var.j(this.n, "#", null, null);
        }
        if (user != null) {
            str2 = m9c.r(user);
        } else {
            str2 = chat.title;
        }
        dg0Var.k(str2);
        if (this.h != null) {
            lkaVar.setTextColor(this.s);
            lkaVar.l(this.h, false);
            if (bf0Var != null) {
                bf0Var.f(user, pc0Var);
            }
        } else if (user != null) {
            if (user.bot) {
                lkaVar.setTextColor(this.s);
                if (user.bot_chat_history) {
                    lkaVar.l(jb6.M0(2131752899, null), false);
                } else {
                    lkaVar.l(jb6.M0(2131752900, null), false);
                }
            } else {
                long j = user.id;
                int i = this.r;
                if (j != z8c.h(i).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i).getCurrentTime()) && !oc7.r1(i).a0.containsKey(Long.valueOf(user.id)))) {
                    lkaVar.setTextColor(this.s);
                    lkaVar.l(jb6.d0(i, user, null, null), false);
                } else {
                    lkaVar.setTextColor(this.w);
                    lkaVar.l(jb6.M0(2131747559, null), false);
                }
            }
            bf0Var.f(user, pc0Var);
        } else if (chat != null) {
            lkaVar.setTextColor(this.s);
            if (sd2.T(chat) && !chat.megagroup) {
                int i2 = chat.participants_count;
                if (i2 != 0) {
                    lkaVar.l(jb6.G(i2, "Subscribers", new Object[0]), false);
                } else if (!sd2.t0(chat)) {
                    lkaVar.l(jb6.M0(2131752271, null), false);
                } else {
                    lkaVar.l(jb6.M0(2131752260, null), false);
                }
            } else {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    lkaVar.l(jb6.G(i3, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    lkaVar.l(jb6.M0(2131748399, null), false);
                } else if (!sd2.t0(chat)) {
                    lkaVar.l(jb6.M0(2131748398, null), false);
                } else {
                    lkaVar.l(jb6.M0(2131748395, null), false);
                }
            }
            bf0Var.f(chat, pc0Var);
        } else {
            bf0Var.setImageDrawable(pc0Var);
        }
        if (chat != null && chat.forum) {
            f = 14.0f;
        } else {
            f = 24.0f;
        }
        bf0Var.setRoundRadius(gm.L(f));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(70.0f), 1073741824));
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
            ylb ylbVar = this.a;
            if (this.x) {
                this.s = cmb.v0(cmb.x6, ylbVar);
                this.w = cmb.v0(cmb.m6, ylbVar);
            }
            lka lkaVar = this.d;
            if (lkaVar != null) {
                int textColor = lkaVar.getTextColor();
                if (textColor == i4 && i4 != (i2 = this.w)) {
                    lkaVar.setTextColor(i2);
                } else if (textColor == i3 && i3 != (i = this.s)) {
                    lkaVar.setTextColor(i);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z) {
    }
}

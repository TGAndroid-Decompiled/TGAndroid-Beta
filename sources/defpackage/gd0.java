package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gd0 {
    public float A;
    public boolean B;
    public boolean a;
    public boolean d;
    public ValueAnimator f;
    public boolean g;
    public Runnable j;
    public int k;
    public boolean l;
    public final boolean m;
    public int n;
    public int o;
    public int p;
    public final View r;
    public int s;
    public boolean w;
    public boolean x;
    public i4b y;
    public final Random z;
    public final fd0[] b = new fd0[3];
    public final fd0[] c = new fd0[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = gm.L(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public short v = 220;

    public gd0(View view, boolean z) {
        d53 d53Var = d53.f;
        this.z = new Random();
        this.r = view;
        for (int i = 0; i < 3; i++) {
            fd0[] fd0VarArr = this.b;
            ?? obj = new Object();
            fd0VarArr[i] = obj;
            obj.e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.b[i].e;
            imageReceiver.K0 = true;
            imageReceiver.q0(gm.L(12.0f));
            this.b[i].a = new pc0((ylb) null);
            this.b[i].a.s(gm.L(12.0f));
            fd0[] fd0VarArr2 = this.c;
            ?? obj2 = new Object();
            fd0VarArr2[i] = obj2;
            obj2.e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.c[i].e;
            imageReceiver2.K0 = true;
            imageReceiver2.q0(gm.L(12.0f));
            this.c[i].a = new pc0((ylb) null);
            this.c[i].a.s(gm.L(12.0f));
        }
        this.m = z;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z, boolean z2) {
        fd0[] fd0VarArr;
        fd0[] fd0VarArr2;
        if (this.d && z) {
            fd0[] fd0VarArr3 = new fd0[3];
            int i = 0;
            boolean z3 = false;
            while (true) {
                fd0VarArr = this.b;
                fd0VarArr2 = this.c;
                if (i >= 3) {
                    break;
                }
                fd0VarArr3[i] = fd0VarArr[i];
                fd0 fd0Var = fd0VarArr[i];
                long j = fd0Var.g;
                fd0 fd0Var2 = fd0VarArr2[i];
                if (j != fd0Var2.g) {
                    z3 = true;
                } else {
                    fd0Var.d = fd0Var2.d;
                }
                i++;
            }
            if (!z3) {
                this.e = 1.0f;
                return;
            }
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = 0;
                while (true) {
                    if (i3 < 3) {
                        if (fd0VarArr[i3].g == fd0VarArr2[i2].g) {
                            fd0VarArr3[i3] = null;
                            if (i2 == i3) {
                                fd0 fd0Var3 = fd0VarArr2[i2];
                                fd0Var3.i = -1;
                                vb5 vb5Var = fd0Var3.b;
                                fd0 fd0Var4 = fd0VarArr[i2];
                                fd0Var3.b = fd0Var4.b;
                                fd0Var4.b = vb5Var;
                            } else {
                                fd0 fd0Var5 = fd0VarArr2[i2];
                                fd0Var5.i = 2;
                                fd0Var5.j = i3;
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        fd0VarArr2[i2].i = 0;
                        break;
                    }
                }
            }
            for (int i4 = 0; i4 < 3; i4++) {
                fd0 fd0Var6 = fd0VarArr3[i4];
                if (fd0Var6 != null) {
                    fd0Var6.i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f.cancel();
                if (this.w) {
                    k();
                    this.w = false;
                }
            }
            this.e = 0.0f;
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f = ofFloat;
                ofFloat.addUpdateListener(new f0(this, (byte) 13));
                this.f.addListener(new g0(this, (byte) 20));
                this.f.setDuration(this.v);
                this.f.setInterpolator(d53.f);
                this.f.start();
            } else {
                this.w = true;
            }
            d();
            return;
        }
        this.e = 1.0f;
        k();
    }

    public final int b() {
        float f;
        int i = this.s;
        if (i != 0) {
            return i;
        }
        int i2 = this.k;
        if (i2 != 4 && i2 != 10) {
            f = 24.0f;
        } else {
            f = 32.0f;
        }
        return gm.L(f);
    }

    public final float c() {
        boolean z;
        float f;
        int L;
        int i = this.k;
        int i2 = 0;
        if (i != 4 && i != 10) {
            z = false;
        } else {
            z = true;
        }
        if (i == 11) {
            L = gm.L(12.0f);
        } else {
            int i3 = this.s;
            if (i3 != 0) {
                L = (int) (i3 * this.t);
            } else {
                if (z) {
                    f = 24.0f;
                } else {
                    f = 20.0f;
                }
                L = gm.L(f);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 3; i5++) {
            if (this.b[i5].g != 0) {
                i4++;
            }
        }
        int max = Math.max(0, i4 - 1) * L;
        if (i4 > 0) {
            i2 = b();
        }
        return max + i2;
    }

    public final void d() {
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i = 0; i < 3; i++) {
                this.b[i].e.I();
                this.c[i].e.I();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i = 0; i < 3; i++) {
                this.b[i].e.K();
                this.c[i].e.K();
            }
            if (this.k == 3) {
                cmb.E0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd0.g(android.graphics.Canvas):void");
    }

    public final void h(int i) {
        pc0 pc0Var;
        pc0 pc0Var2;
        for (int i2 = 0; i2 < 3; i2++) {
            fd0 fd0Var = this.b[i2];
            if (fd0Var != null && (pc0Var2 = fd0Var.a) != null) {
                pc0Var2.s(i);
            }
            fd0 fd0Var2 = this.c[i2];
            if (fd0Var2 != null && (pc0Var = fd0Var2.a) != null) {
                pc0Var.s(i);
            }
        }
    }

    public final void i(int i) {
        this.n = i;
        View view = this.r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i, int i2, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        fd0[] fd0VarArr = this.c;
        fd0 fd0Var = fd0VarArr[i];
        fd0Var.g = 0L;
        fd0Var.f = null;
        if (tLObject == null) {
            fd0Var.e.g0(null);
            d();
            return;
        }
        fd0Var.d = -1L;
        fd0Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            fd0Var.f = groupCallParticipant;
            long B1 = k47.B1(groupCallParticipant.peer);
            if (pg3.D(B1)) {
                user = oc7.r1(i2).W1(Long.valueOf(B1));
                fd0VarArr[i].a.q(user);
                chat = null;
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-B1));
                fd0VarArr[i].a.p(L0);
                chat = L0;
                user = null;
            }
            if (this.k == 4) {
                if (B1 == z8c.h(j5.a(i2).a).e()) {
                    fd0VarArr[i].d = 0L;
                } else if (this.m) {
                    fd0VarArr[i].d = groupCallParticipant.lastActiveDate;
                } else {
                    fd0VarArr[i].d = groupCallParticipant.active_date;
                }
            } else {
                fd0VarArr[i].d = groupCallParticipant.active_date;
            }
            fd0VarArr[i].g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                fd0Var.a.f(1);
                fd0VarArr[i].a.p = 0.6f;
            } else {
                fd0Var.a.f(0);
                pc0 pc0Var = fd0VarArr[i].a;
                pc0Var.p = 1.0f;
                pc0Var.q(user2);
            }
            fd0VarArr[i].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            fd0Var.a.f(0);
            pc0 pc0Var2 = fd0VarArr[i].a;
            pc0Var2.p = 1.0f;
            pc0Var2.p(chat);
            fd0VarArr[i].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            fd0VarArr[i].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 50, true, null, false);
                fd0VarArr[i].e.Z(gn5.c(bc4.w(storyItem.media.document.thumbs, 50, true, w, true), storyItem.media.document), td4.n(b, b, "_"), gn5.c(w, storyItem.media.document), td4.n(b, b, "_"), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w2 = bc4.w(photo.sizes, 50, true, null, false);
                    fd0VarArr[i].e.Z(gn5.i(bc4.w(storyItem.media.photo.sizes, 50, true, w2, true), storyItem.media.photo), td4.n(b, b, "_"), gn5.i(w2, storyItem.media.photo), td4.n(b, b, "_"), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.a) {
                fd0 fd0Var2 = fd0VarArr[i];
                fd0Var2.e.g0(fd0Var2.a);
            } else {
                fd0 fd0Var3 = fd0VarArr[i];
                fd0Var3.e.U(user, fd0Var3.a, null);
            }
        } else {
            fd0 fd0Var4 = fd0VarArr[i];
            fd0Var4.e.U(chat, fd0Var4.a, null);
        }
        fd0VarArr[i].e.q0(b / 2);
        float f = b;
        fd0VarArr[i].e.i0(0.0f, 0.0f, f, f);
        d();
    }

    public final void k() {
        for (int i = 0; i < 3; i++) {
            fd0[] fd0VarArr = this.b;
            fd0 fd0Var = fd0VarArr[i];
            fd0[] fd0VarArr2 = this.c;
            fd0VarArr[i] = fd0VarArr2[i];
            fd0VarArr2[i] = fd0Var;
        }
    }
}

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
public final class gc0 {
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
    public h2b y;
    public final Random z;
    public final fc0[] b = new fc0[3];
    public final fc0[] c = new fc0[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = gl.L(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public short v = 220;

    public gc0(View view, boolean z) {
        s33 s33Var = s33.f;
        this.z = new Random();
        this.r = view;
        for (int i = 0; i < 3; i++) {
            fc0[] fc0VarArr = this.b;
            ?? obj = new Object();
            fc0VarArr[i] = obj;
            obj.e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.b[i].e;
            imageReceiver.K0 = true;
            imageReceiver.q0(gl.L(12.0f));
            this.b[i].a = new pb0((wjb) null);
            this.b[i].a.s(gl.L(12.0f));
            fc0[] fc0VarArr2 = this.c;
            ?? obj2 = new Object();
            fc0VarArr2[i] = obj2;
            obj2.e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.c[i].e;
            imageReceiver2.K0 = true;
            imageReceiver2.q0(gl.L(12.0f));
            this.c[i].a = new pb0((wjb) null);
            this.c[i].a.s(gl.L(12.0f));
        }
        this.m = z;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z, boolean z2) {
        fc0[] fc0VarArr;
        fc0[] fc0VarArr2;
        if (this.d && z) {
            fc0[] fc0VarArr3 = new fc0[3];
            int i = 0;
            boolean z3 = false;
            while (true) {
                fc0VarArr = this.b;
                fc0VarArr2 = this.c;
                if (i >= 3) {
                    break;
                }
                fc0VarArr3[i] = fc0VarArr[i];
                fc0 fc0Var = fc0VarArr[i];
                long j = fc0Var.g;
                fc0 fc0Var2 = fc0VarArr2[i];
                if (j != fc0Var2.g) {
                    z3 = true;
                } else {
                    fc0Var.d = fc0Var2.d;
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
                        if (fc0VarArr[i3].g == fc0VarArr2[i2].g) {
                            fc0VarArr3[i3] = null;
                            if (i2 == i3) {
                                fc0 fc0Var3 = fc0VarArr2[i2];
                                fc0Var3.i = -1;
                                x95 x95Var = fc0Var3.b;
                                fc0 fc0Var4 = fc0VarArr[i2];
                                fc0Var3.b = fc0Var4.b;
                                fc0Var4.b = x95Var;
                            } else {
                                fc0 fc0Var5 = fc0VarArr2[i2];
                                fc0Var5.i = 2;
                                fc0Var5.j = i3;
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        fc0VarArr2[i2].i = 0;
                        break;
                    }
                }
            }
            for (int i4 = 0; i4 < 3; i4++) {
                fc0 fc0Var6 = fc0VarArr3[i4];
                if (fc0Var6 != null) {
                    fc0Var6.i = 1;
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
                ofFloat.addUpdateListener(new f0(this, (byte) 12));
                this.f.addListener(new g0(this, (byte) 18));
                this.f.setDuration(this.v);
                this.f.setInterpolator(s33.f);
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
        return gl.L(f);
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
            L = gl.L(12.0f);
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
                L = gl.L(f);
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
                bkb.E0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc0.g(android.graphics.Canvas):void");
    }

    public final void h(int i) {
        pb0 pb0Var;
        pb0 pb0Var2;
        for (int i2 = 0; i2 < 3; i2++) {
            fc0 fc0Var = this.b[i2];
            if (fc0Var != null && (pb0Var2 = fc0Var.a) != null) {
                pb0Var2.s(i);
            }
            fc0 fc0Var2 = this.c[i2];
            if (fc0Var2 != null && (pb0Var = fc0Var2.a) != null) {
                pb0Var.s(i);
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
        fc0[] fc0VarArr = this.c;
        fc0 fc0Var = fc0VarArr[i];
        fc0Var.g = 0L;
        fc0Var.f = null;
        if (tLObject == null) {
            fc0Var.e.g0(null);
            d();
            return;
        }
        fc0Var.d = -1L;
        fc0Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            fc0Var.f = groupCallParticipant;
            long B1 = k27.B1(groupCallParticipant.peer);
            if (cf3.D(B1)) {
                user = na7.q1(i2).V1(Long.valueOf(B1));
                fc0VarArr[i].a.q(user);
                chat = null;
            } else {
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-B1));
                fc0VarArr[i].a.p(K0);
                chat = K0;
                user = null;
            }
            if (this.k == 4) {
                if (B1 == y6c.h(j5.a(i2).a).e()) {
                    fc0VarArr[i].d = 0L;
                } else if (this.m) {
                    fc0VarArr[i].d = groupCallParticipant.lastActiveDate;
                } else {
                    fc0VarArr[i].d = groupCallParticipant.active_date;
                }
            } else {
                fc0VarArr[i].d = groupCallParticipant.active_date;
            }
            fc0VarArr[i].g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                fc0Var.a.f(1);
                fc0VarArr[i].a.p = 0.6f;
            } else {
                fc0Var.a.f(0);
                pb0 pb0Var = fc0VarArr[i].a;
                pb0Var.p = 1.0f;
                pb0Var.q(user2);
            }
            fc0VarArr[i].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            fc0Var.a.f(0);
            pb0 pb0Var2 = fc0VarArr[i].a;
            pb0Var2.p = 1.0f;
            pb0Var2.p(chat);
            fc0VarArr[i].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            fc0VarArr[i].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 50, true, null, false);
                fc0VarArr[i].e.Z(gl5.c(ba4.w(storyItem.media.document.thumbs, 50, true, w, true), storyItem.media.document), tb4.m(b, b, "_"), gl5.c(w, storyItem.media.document), tb4.m(b, b, "_"), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w2 = ba4.w(photo.sizes, 50, true, null, false);
                    fc0VarArr[i].e.Z(gl5.i(ba4.w(storyItem.media.photo.sizes, 50, true, w2, true), storyItem.media.photo), tb4.m(b, b, "_"), gl5.i(w2, storyItem.media.photo), tb4.m(b, b, "_"), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.a) {
                fc0 fc0Var2 = fc0VarArr[i];
                fc0Var2.e.g0(fc0Var2.a);
            } else {
                fc0 fc0Var3 = fc0VarArr[i];
                fc0Var3.e.U(user, fc0Var3.a, null);
            }
        } else {
            fc0 fc0Var4 = fc0VarArr[i];
            fc0Var4.e.U(chat, fc0Var4.a, null);
        }
        fc0VarArr[i].e.q0(b / 2);
        float f = b;
        fc0VarArr[i].e.i0(0.0f, 0.0f, f, f);
        d();
    }

    public final void k() {
        for (int i = 0; i < 3; i++) {
            fc0[] fc0VarArr = this.b;
            fc0 fc0Var = fc0VarArr[i];
            fc0[] fc0VarArr2 = this.c;
            fc0VarArr[i] = fc0VarArr2[i];
            fc0VarArr2[i] = fc0Var;
        }
    }
}

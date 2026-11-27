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
public final class ic0 {
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
    public d6b y;
    public final Random z;
    public final hc0[] b = new hc0[3];
    public final hc0[] c = new hc0[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);
    public int q = hl.L(1.67f);
    public float t = 0.8f;
    public float u = 1.0f;
    public short v = 220;

    public ic0(View view, boolean z) {
        k43 k43Var = k43.f;
        this.z = new Random();
        this.r = view;
        for (int i = 0; i < 3; i++) {
            hc0[] hc0VarArr = this.b;
            ?? obj = new Object();
            hc0VarArr[i] = obj;
            obj.e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.b[i].e;
            imageReceiver.K0 = true;
            imageReceiver.q0(hl.L(12.0f));
            this.b[i].a = new rb0((vnb) null);
            this.b[i].a.s(hl.L(12.0f));
            hc0[] hc0VarArr2 = this.c;
            ?? obj2 = new Object();
            hc0VarArr2[i] = obj2;
            obj2.e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.c[i].e;
            imageReceiver2.K0 = true;
            imageReceiver2.q0(hl.L(12.0f));
            this.c[i].a = new rb0((vnb) null);
            this.c[i].a.s(hl.L(12.0f));
        }
        this.m = z;
        this.i.setColor(0);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z, boolean z2) {
        hc0[] hc0VarArr;
        hc0[] hc0VarArr2;
        if (this.d && z) {
            hc0[] hc0VarArr3 = new hc0[3];
            int i = 0;
            boolean z3 = false;
            while (true) {
                hc0VarArr = this.b;
                hc0VarArr2 = this.c;
                if (i >= 3) {
                    break;
                }
                hc0VarArr3[i] = hc0VarArr[i];
                hc0 hc0Var = hc0VarArr[i];
                long j = hc0Var.g;
                hc0 hc0Var2 = hc0VarArr2[i];
                if (j != hc0Var2.g) {
                    z3 = true;
                } else {
                    hc0Var.d = hc0Var2.d;
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
                        if (hc0VarArr[i3].g == hc0VarArr2[i2].g) {
                            hc0VarArr3[i3] = null;
                            if (i2 == i3) {
                                hc0 hc0Var3 = hc0VarArr2[i2];
                                hc0Var3.i = -1;
                                yb5 yb5Var = hc0Var3.b;
                                hc0 hc0Var4 = hc0VarArr[i2];
                                hc0Var3.b = hc0Var4.b;
                                hc0Var4.b = yb5Var;
                            } else {
                                hc0 hc0Var5 = hc0VarArr2[i2];
                                hc0Var5.i = 2;
                                hc0Var5.j = i3;
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        hc0VarArr2[i2].i = 0;
                        break;
                    }
                }
            }
            for (int i4 = 0; i4 < 3; i4++) {
                hc0 hc0Var6 = hc0VarArr3[i4];
                if (hc0Var6 != null) {
                    hc0Var6.i = 1;
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
                ofFloat.addUpdateListener(new g0(this, (byte) 12));
                this.f.addListener(new h0(this, (byte) 18));
                this.f.setDuration(this.v);
                this.f.setInterpolator(k43.f);
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
        return hl.L(f);
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
            L = hl.L(12.0f);
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
                L = hl.L(f);
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
                aob.E0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic0.g(android.graphics.Canvas):void");
    }

    public final void h(int i) {
        rb0 rb0Var;
        rb0 rb0Var2;
        for (int i2 = 0; i2 < 3; i2++) {
            hc0 hc0Var = this.b[i2];
            if (hc0Var != null && (rb0Var2 = hc0Var.a) != null) {
                rb0Var2.s(i);
            }
            hc0 hc0Var2 = this.c[i2];
            if (hc0Var2 != null && (rb0Var = hc0Var2.a) != null) {
                rb0Var.s(i);
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
        hc0[] hc0VarArr = this.c;
        hc0 hc0Var = hc0VarArr[i];
        hc0Var.g = 0L;
        hc0Var.f = null;
        if (tLObject == null) {
            hc0Var.e.g0(null);
            d();
            return;
        }
        hc0Var.d = -1L;
        hc0Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            hc0Var.f = groupCallParticipant;
            long B1 = r47.B1(groupCallParticipant.peer);
            if (wf3.D(B1)) {
                user = uc7.s1(i2).X1(Long.valueOf(B1));
                hc0VarArr[i].a.q(user);
                chat = null;
            } else {
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-B1));
                hc0VarArr[i].a.p(M0);
                chat = M0;
                user = null;
            }
            if (this.k == 4) {
                if (B1 == yac.h(k5.a(i2).a).e()) {
                    hc0VarArr[i].d = 0L;
                } else if (this.m) {
                    hc0VarArr[i].d = groupCallParticipant.lastActiveDate;
                } else {
                    hc0VarArr[i].d = groupCallParticipant.active_date;
                }
            } else {
                hc0VarArr[i].d = groupCallParticipant.active_date;
            }
            hc0VarArr[i].g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.a) {
                hc0Var.a.f(1);
                hc0VarArr[i].a.p = 0.6f;
            } else {
                hc0Var.a.f(0);
                rb0 rb0Var = hc0VarArr[i].a;
                rb0Var.p = 1.0f;
                rb0Var.q(user2);
            }
            hc0VarArr[i].g = user2.id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            hc0Var.a.f(0);
            rb0 rb0Var2 = hc0VarArr[i].a;
            rb0Var2.p = 1.0f;
            rb0Var2.p(chat);
            hc0VarArr[i].g = -chat.id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            hc0VarArr[i].g = storyItem.id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w = xb4.w(document.thumbs, 50, true, null, false);
                hc0VarArr[i].e.Z(jn5.c(xb4.w(storyItem.media.document.thumbs, 50, true, w, true), storyItem.media.document), qd4.m(b, b, "_"), jn5.c(w, storyItem.media.document), qd4.m(b, b, "_"), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w2 = xb4.w(photo.sizes, 50, true, null, false);
                    hc0VarArr[i].e.Z(jn5.i(xb4.w(storyItem.media.photo.sizes, 50, true, w2, true), storyItem.media.photo), qd4.m(b, b, "_"), jn5.i(w2, storyItem.media.photo), qd4.m(b, b, "_"), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.a) {
                hc0 hc0Var2 = hc0VarArr[i];
                hc0Var2.e.g0(hc0Var2.a);
            } else {
                hc0 hc0Var3 = hc0VarArr[i];
                hc0Var3.e.U(user, hc0Var3.a, null);
            }
        } else {
            hc0 hc0Var4 = hc0VarArr[i];
            hc0Var4.e.U(chat, hc0Var4.a, null);
        }
        hc0VarArr[i].e.q0(b / 2);
        float f = b;
        hc0VarArr[i].e.i0(0.0f, 0.0f, f, f);
        d();
    }

    public final void k() {
        for (int i = 0; i < 3; i++) {
            hc0[] hc0VarArr = this.b;
            hc0 hc0Var = hc0VarArr[i];
            hc0[] hc0VarArr2 = this.c;
            hc0VarArr[i] = hc0VarArr2[i];
            hc0VarArr2[i] = hc0Var;
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ab9 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final ll E;
    public final ll F;
    public final ll G;
    public final ll H;
    public final ll I;
    public final mm J;
    public final mm K;
    public final mm L;
    public final mm M;
    public final mm N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public byte S;
    public vnb T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public za9[] a0;
    public float b0;
    public boolean c0;
    public va6 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public ul t;
    public ul u;
    public long v;
    public long w;
    public int x;
    public int y;
    public int z;
    public final RectF a = new RectF();
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f = new Path();
    public final Paint g = new Paint();
    public int q = 0;
    public float r = 1.0f;

    public ab9(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new xc(this, (byte) 13));
        }
        k43 k43Var = k43.h;
        this.E = new ll(view, 400L, k43Var, 0);
        this.F = new ll(view, 400L, k43Var, 0);
        this.G = new ll(view, 400L, k43Var, 0);
        this.H = new ll(view, 400L, k43Var, 0);
        this.I = new ll(view, 400L, k43Var, 0);
        this.J = new mm(view, 0L, 400L, k43Var);
        this.K = new mm(view, 0L, 400L, k43Var);
        this.L = new mm(view, 0L, 440L, k43Var);
        this.M = new mm(view, 0L, 320L, k43Var);
        this.N = new mm(view, 0L, 320L, k43Var);
    }

    public final int a(r47 r47Var, TLRPC.User user, TLRPC.Chat chat, vnb vnbVar, int i) {
        boolean o;
        boolean z;
        ll llVar;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        r47 r47Var2;
        TLRPC.Message message2;
        int F;
        TLRPC.User user2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int i2;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int v0;
        boolean z2;
        View view;
        TLRPC.Message message4;
        TLRPC.User user3;
        int i3;
        float f;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        this.R = false;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        if (r47Var != null && !r47Var.O3() && i != 2 && (tL_peerColorCollectible = r47Var.g1) != null) {
            return l(r47Var, tL_peerColorCollectible, vnbVar);
        }
        this.V = false;
        this.v = 0L;
        this.w = 0L;
        if (r47Var != null && r47Var.q4()) {
            z = true;
        } else {
            z = false;
        }
        this.s = z;
        ll llVar2 = this.I;
        float f2 = 0.1f;
        if (r47Var == null) {
            this.R = true;
            this.S = i;
            this.T = vnbVar;
            this.U = yob.b;
            this.j = false;
            this.i = false;
            int v02 = aob.v0(aob.Ld, vnbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            if (o) {
                f = 0.12f;
            } else {
                f = 0.1f;
            }
            this.x = aob.p1(f, v02);
            this.C = h();
            int v03 = aob.v0(aob.Nd, vnbVar);
            this.y = v03;
            return llVar2.a(v03, false);
        }
        int i4 = r47Var.K1;
        if (i == 4 && (message4 = r47Var.k) != null && r47.n1(message4) != null && (r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaContact)) {
            long j = r47.n1(r47Var.k).user_id;
            if (j != 0) {
                user3 = uc7.s1(i4).X1(Long.valueOf(j));
            } else {
                user3 = null;
            }
            if (!r47Var.O3() && i != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor3, vnbVar);
                }
            }
            if (user3 != null) {
                i3 = lbc.f(user3);
                llVar = llVar2;
                this.v = lbc.g(user3);
            } else {
                llVar = llVar2;
                i3 = 0;
            }
            m(r47Var, i3, vnbVar);
            this.x = aob.p1(0.1f, this.z);
            this.y = this.z;
        } else {
            llVar = llVar2;
            if (i != 0 && (r47Var.e1 >= 0 || (r47Var.k != null && (((r47Var.p3() || wf3.B(r47.B0(r47Var.k))) && user4 != null) || ((r47Var.n3() && chat != null) || (((message3 = r47Var.k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (r47Var.q4() && (peerColor2 = r47Var.Z0) != null && peerColor2.color != -1))))))) {
                int i5 = r47Var.e1;
                if (i5 < 0) {
                    if (r47Var.q4() && (peerColor = r47Var.Z0) != null && (i2 = peerColor.color) != -1) {
                        if (i == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = r47Var.k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long n = wf3.n(peer);
                            i2 = 5;
                            if (n < 0) {
                                TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(-n));
                                if (!r47Var.O3() && i != 2 && M0 != null) {
                                    TLRPC.PeerColor peerColor4 = M0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor4, vnbVar);
                                    }
                                }
                                if (M0 != null) {
                                    i2 = xc2.F(M0);
                                }
                                if (i == 3) {
                                    this.v = xc2.G(M0);
                                }
                            } else {
                                TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(n));
                                if (!r47Var.O3() && i != 2 && X1 != null) {
                                    TLRPC.PeerColor peerColor5 = X1.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor5, vnbVar);
                                    }
                                }
                                if (X1 != null) {
                                    i2 = lbc.f(X1);
                                }
                                if (i == 3) {
                                    this.v = lbc.g(X1);
                                }
                            }
                        } else if (wf3.B(r47.B0(message5)) && user4 != null) {
                            if (r47Var.O3()) {
                                user2 = yac.h(i4).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!r47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor6, vnbVar);
                                }
                            }
                            i5 = lbc.f(user4);
                            if (i == 3) {
                                this.v = lbc.g(user4);
                            }
                        } else if (r47Var.p3() && user4 != null) {
                            if (!r47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor7, vnbVar);
                                }
                            }
                            i5 = lbc.f(user4);
                            if (i == 3) {
                                this.v = lbc.g(user4);
                            }
                        } else if (r47Var.n3() && chat != null) {
                            if (!r47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor8, vnbVar);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = r47Var.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User X12 = uc7.s1(i4).X1(Long.valueOf(Z0));
                                    F = lbc.f(X12);
                                    if (i == 3) {
                                        this.v = lbc.g(X12);
                                    }
                                } else {
                                    TLRPC.Chat M02 = uc7.s1(i4).M0(Long.valueOf(-Z0));
                                    F = xc2.F(M02);
                                    if (i == 3) {
                                        this.v = xc2.G(M02);
                                    }
                                }
                                i5 = F;
                            } else {
                                i5 = xc2.F(chat);
                                if (i == 3) {
                                    this.v = xc2.G(chat);
                                }
                            }
                        } else {
                            i5 = 0;
                        }
                    }
                    i5 = i2;
                }
                m(r47Var, i5, vnbVar);
                this.x = aob.p1(0.1f, this.z);
                this.y = this.z;
            } else if (i == 0 && (r47Var.e1 >= 0 || ((message = r47Var.k) != null && r47Var.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (r47Var2 = r47Var.C).k) != null && message2.from_id != null && (r47Var2.p3() || wf3.B(r47.B0(r47Var.k)) || r47Var.C.n3()))))) {
                int i6 = r47Var.e1;
                if (i6 < 0) {
                    boolean B = wf3.B(r47.B0(r47Var.C.k));
                    r47 r47Var3 = r47Var.C;
                    if (B) {
                        if (r47Var3.O3()) {
                            user4 = yac.h(r47Var.C.K1).f();
                        }
                        if (user4 != null) {
                            i6 = lbc.f(user4);
                            this.v = lbc.g(user4);
                        }
                        i6 = 0;
                    } else if (r47Var3.p3()) {
                        TLRPC.User X13 = uc7.s1(i4).X1(Long.valueOf(r47Var.C.k.from_id.user_id));
                        if (!r47Var.O3() && i != 2 && X13 != null) {
                            TLRPC.PeerColor peerColor9 = X13.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor9, vnbVar);
                            }
                        }
                        if (X13 != null) {
                            i6 = lbc.f(X13);
                            this.v = lbc.g(X13);
                        }
                        i6 = 0;
                    } else {
                        if (r47Var.C.n3()) {
                            TLRPC.Chat M03 = uc7.s1(i4).M0(Long.valueOf(r47Var.C.k.from_id.channel_id));
                            if (!r47Var.O3() && i != 2 && M03 != null) {
                                TLRPC.PeerColor peerColor10 = M03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor10, vnbVar);
                                }
                            }
                            if (M03 != null) {
                                i6 = xc2.F(M03);
                                this.v = xc2.G(M03);
                            }
                        }
                        i6 = 0;
                    }
                }
                m(r47Var.C, i6, vnbVar);
                this.x = aob.p1(0.1f, this.z);
                this.y = this.z;
            } else {
                this.i = false;
                this.j = false;
                int v04 = aob.v0(aob.Ld, vnbVar);
                this.B = v04;
                this.A = v04;
                this.z = v04;
                this.x = aob.p1(0.1f, v04);
                this.y = aob.v0(aob.Nd, vnbVar);
            }
        }
        if (r47Var.O5()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = aob.v0(aob.Od, vnbVar);
        } else if (r47Var.O3() || i == 2) {
            if (i == 2 && !r47Var.O3()) {
                v0 = aob.v0(aob.gl, vnbVar);
                this.B = v0;
                this.A = v0;
                this.z = v0;
            } else {
                int i7 = aob.Rb;
                Integer y0 = aob.y0(i7, vnbVar);
                if (y0 != null) {
                    v0 = y0.intValue();
                } else {
                    if (this.i || this.j) {
                        i7 = aob.Sb;
                    }
                    v0 = aob.v0(i7, vnbVar);
                }
                this.B = v0;
                this.A = v0;
                this.z = v0;
            }
            if (this.j) {
                this.V = true;
                this.z = aob.p1(0.2f, v0);
                this.A = aob.p1(0.5f, this.A);
            } else if (this.i) {
                this.V = true;
                this.z = aob.p1(0.35f, v0);
            }
            int i8 = this.B;
            if (o) {
                f2 = 0.12f;
            }
            this.x = aob.p1(f2, i8);
            int i9 = aob.Tb;
            this.y = aob.v0(i9, vnbVar);
            if (r47Var.P2() && r47Var.O3()) {
                this.x = vm2.k(aob.v0(aob.Oa, vnbVar), vm2.k(aob.v0(aob.La, vnbVar), aob.v0(aob.ua, vnbVar)));
                this.y = aob.y0(i9, vnbVar).intValue();
            }
        }
        if (i == 0 || i == 3 || i == 4) {
            long j2 = r47Var.f1;
            if (j2 != -1) {
                this.v = j2;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.t.a();
            }
        }
        ul ulVar = this.t;
        if (ulVar != null) {
            z2 = true;
            if (ulVar.j(this.v, true)) {
                this.c0 = false;
            }
        } else {
            z2 = true;
        }
        ul ulVar2 = this.u;
        if (ulVar2 != null) {
            ulVar2.j(this.w, z2);
        }
        this.C = h();
        return llVar.a(this.y, false);
    }

    public final void b() {
        ab9 ab9Var;
        if (this.R && this.U != yob.b) {
            try {
                ab9Var = this;
            } catch (Exception e) {
                e = e;
                ab9Var = this;
            }
            try {
                ab9Var.a(null, null, null, this.T, this.S);
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                ab9Var.R = false;
                cc4.g(exc, true);
            }
        }
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float max = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = hl.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = hl.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f4, z, z2);
    }

    public final void e(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        boolean z3;
        nl nlVar;
        float d;
        int i;
        ul ulVar;
        float f2;
        b();
        if (!z2) {
            int p1 = aob.p1(f, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(p1);
            float[] fArr = this.e;
            if (zwe.a(fArr)) {
                float f3 = fArr[0];
                canvas.drawRoundRect(rectF, f3, f3, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        ul ulVar2 = this.t;
        if (ulVar2 != null) {
            if (!this.c0) {
                Drawable drawable = ulVar2.f[0];
                if ((drawable instanceof wl) && (nlVar = ((wl) drawable).k) != null && nlVar.C()) {
                    this.c0 = true;
                } else {
                    z3 = false;
                    d = this.L.d(z3);
                    if (d <= 0.0f && this.r > 0.0f) {
                        if (this.a0 == null) {
                            i = 0;
                            this.a0 = new za9[]{new za9(4.0f, -6.33f, 1.0f, 1.0f), new za9(30.0f, 3.0f, 0.78f, 0.9f), new za9(46.0f, -17.0f, 0.6f, 0.6f), new za9(69.66f, -0.666f, 0.87f, 0.7f), new za9(98.0f, -12.6f, 1.03f, 0.3f), new za9(51.0f, 24.0f, 1.0f, 0.5f), new za9(6.33f, 20.0f, 0.77f, 0.7f), new za9(-19.0f, 12.0f, 0.8f, 0.6f, 0), new za9(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.b0);
                        float max = Math.max(rectF.right - hl.L(15.0f), rectF.centerX());
                        if (z) {
                            max -= hl.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + hl.L(21.0f));
                        ul ulVar3 = this.u;
                        if (ulVar3 != null) {
                            ulVar3.w = (int) (f * 255.0f);
                        }
                        this.t.k(Integer.valueOf(this.C));
                        int i2 = i;
                        while (true) {
                            za9[] za9VarArr = this.a0;
                            if (i2 < za9VarArr.length) {
                                if (i2 != 0 || (ulVar = this.u) == null || this.w == 0) {
                                    ulVar = this.t;
                                }
                                za9 za9Var = za9VarArr[i2];
                                if (!za9Var.e || z) {
                                    if (ulVar == this.u) {
                                        f2 = 1.0f;
                                    } else {
                                        f2 = 0.3f;
                                    }
                                    ulVar.w = (int) (f2 * 255.0f * za9Var.d * this.r);
                                    float L = max - hl.L(za9Var.a);
                                    float L2 = hl.L(za9Var.b) + min;
                                    float L3 = hl.L(10.0f) * za9Var.c * d;
                                    ulVar.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                                    ulVar.draw(canvas);
                                }
                                i2++;
                            } else {
                                canvas.restore();
                                return;
                            }
                        }
                    }
                }
            }
            z3 = true;
            d = this.L.d(z3);
            if (d <= 0.0f) {
            }
        }
    }

    public final void f(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab9.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        va6 va6Var;
        float max = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = hl.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = hl.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((va6Var = this.h) == null || !va6Var.d())) {
            va6 va6Var2 = this.h;
            if (va6Var2 != null) {
                va6Var2.b = -1L;
                return;
            }
            return;
        }
        va6 va6Var3 = this.h;
        if (va6Var3 == null) {
            va6Var3 = new va6();
            this.h = va6Var3;
            va6Var3.D = true;
            va6Var3.t = 3.5f;
            va6Var3.u = 0.5f;
        }
        va6Var3.g(aob.p1(0.1f, this.z), aob.p1(0.3f, this.z), aob.p1(0.3f, this.z), aob.p1(1.25f, this.z));
        this.h.e(rectF);
        this.h.i(fArr);
        this.h.x.setStrokeWidth(hl.L(1.0f));
        this.h.setAlpha((int) (f4 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        if (this.V) {
            return this.A;
        }
        return this.z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void j(float f) {
        this.b0 = f;
    }

    public final void k() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        ul ulVar = this.t;
        if (ulVar != null) {
            ulVar.d.e(true, 1.0f);
        }
    }

    public final int l(r47 r47Var, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, vnb vnbVar) {
        boolean o;
        int i;
        ArrayList<Integer> arrayList;
        boolean z;
        boolean z2;
        int i2;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        if (o && (tL_peerColorCollectible.flags & 1) != 0) {
            i = tL_peerColorCollectible.dark_accent_color;
        } else {
            i = tL_peerColorCollectible.accent_color;
        }
        if (o && (tL_peerColorCollectible.flags & 2) != 0) {
            arrayList = tL_peerColorCollectible.dark_colors;
        } else {
            arrayList = tL_peerColorCollectible.colors;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            if (r47Var != null) {
                i2 = r47Var.e1();
            } else {
                i2 = 0;
            }
            if (i2 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i2;
        }
        this.V = false;
        this.z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        if (z) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.j = z2;
        if (z2) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i3 = i | (-16777216);
        this.y = i3;
        this.x = aob.p1(0.1f, i3);
        long j = tL_peerColorCollectible.background_emoji_id;
        this.v = j;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        View view = this.D;
        if (i4 != 0 && this.t == null && view != null) {
            this.t = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.t.a();
            }
        }
        ul ulVar = this.t;
        if (ulVar != null && ulVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.u.a();
            }
        }
        ul ulVar2 = this.u;
        if (ulVar2 != null) {
            ulVar2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void m(r47 r47Var, int i, vnb vnbVar) {
        int i2;
        kc7 kc7Var;
        boolean z;
        int i3;
        int i4;
        if (vnbVar != null) {
            vnbVar.a();
        } else {
            aob.h1();
        }
        boolean z2 = true;
        if (this.P != i) {
            if (r47Var != null) {
                i4 = r47Var.e1();
            } else {
                i4 = 0;
            }
            if (i4 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i;
            this.O = i4;
        }
        if (i < 7) {
            int v0 = aob.v0(aob.r8[i], vnbVar);
            this.B = v0;
            this.A = v0;
            this.z = v0;
            this.j = false;
            this.i = false;
            return;
        }
        if (r47Var != null) {
            i2 = r47Var.K1;
        } else {
            i2 = yac.t0;
        }
        lc7 lc7Var = uc7.s1(i2).F3;
        if (lc7Var != null) {
            kc7Var = lc7Var.d(i);
        } else {
            kc7Var = null;
        }
        if (kc7Var == null) {
            if (r47Var != null && r47Var.O3()) {
                i3 = aob.Rb;
            } else {
                i3 = aob.Ld;
            }
            int v02 = aob.v0(i3, vnbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = kc7Var.e(0, vnbVar);
        this.A = kc7Var.e(1, vnbVar);
        int e = kc7Var.e(2, vnbVar);
        this.B = e;
        int i5 = this.A;
        int i6 = this.z;
        if (i5 != i6) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        if (e == i6) {
            z2 = false;
        }
        this.j = z2;
        if (z2) {
            this.B = i5;
            this.A = e;
        }
    }

    public final int n(vnb vnbVar) {
        View view;
        this.R = false;
        int i = aob.q7;
        this.y = aob.v0(i, vnbVar);
        this.z = aob.v0(i, vnbVar);
        this.i = false;
        this.j = false;
        this.x = aob.p1(0.1f, aob.v0(i, vnbVar));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.t.a();
            }
        }
        ul ulVar = this.t;
        if (ulVar != null && ulVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = h();
        return this.I.a(this.y, false);
    }

    public final void o(boolean z) {
        va6 va6Var;
        boolean z2 = this.W;
        if (!z) {
            if (z2) {
                this.X = 0.0f;
                va6 va6Var2 = this.h;
                if (va6Var2 != null) {
                    va6Var2.a();
                }
            }
        } else if (!z2 && (va6Var = this.h) != null) {
            va6Var.c = -1L;
            va6Var.b = -1L;
        }
        this.W = z;
    }

    public final void p(int i, boolean z) {
        float f;
        this.R = false;
        this.V = false;
        this.j = false;
        this.i = false;
        this.B = i;
        this.A = i;
        this.z = i;
        if (z) {
            f = 0.12f;
        } else {
            f = 0.1f;
        }
        this.x = aob.p1(f, i);
        this.C = i;
    }
}

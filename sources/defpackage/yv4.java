package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class yv4 {
    public static final HashMap Y;
    public StaticLayout A;
    public TextPaint B;
    public TextPaint C;
    public TextPaint D;
    public TextPaint E;
    public TextPaint F;
    public Paint G;
    public TextPaint H;
    public Paint I;
    public Paint J;
    public Paint K;
    public Paint L;
    public RectF M;
    public RectF N;
    public Rect O;
    public Rect P;
    public int[] Q;
    public int R;
    public ff0 S;
    public k27 T;
    public boolean U;
    public ImageReceiver[] a;
    public pb0[] b;
    public final gb2 c;
    public ImageReceiver d;
    public CharSequence[] e;
    public TLRPC.Chat[] f;
    public float[] g;
    public boolean[] h;
    public Rect[] i;
    public boolean[] j;
    public int m;
    public float n;
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Drawable t;
    public String u;
    public int v;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;
    public StaticLayout z;
    public int k = 0;
    public int l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        b00.q(1, hashMap, "1⃣", 3, "2⃣");
        b00.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public yv4(gb2 gb2Var) {
        this.c = gb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        k27 k27Var = this.T;
        if (k27Var != null && k27Var.u3()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i = 0;
                while (true) {
                    Rect[] rectArr = this.i;
                    if (i < rectArr.length) {
                        if (rectArr[i].contains(x, y)) {
                            this.V = i;
                            this.S.setHotspot(x, y);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i++;
                    } else if (this.P.contains(x, y)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    gb2 gb2Var = this.c;
                    if (gb2Var.getDelegate() != null) {
                        gb2Var.getDelegate().m0(gb2Var, this.V);
                    }
                    gb2Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    k27 k27Var2 = this.T;
                    if (k27Var2 != null && k27Var2.k != null) {
                        on0.e(k27Var2, new be2(k27Var2, (byte) 6), new bm0((byte) 1));
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 3) {
                if (this.W) {
                    c(false);
                }
                this.W = false;
                this.X = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i, int i2, wjb wjbVar) {
        float f;
        TextPaint textPaint;
        float f2;
        float f3;
        float f4;
        da7 d;
        int v0;
        int i3;
        Canvas canvas2 = canvas;
        k27 k27Var = this.T;
        if (k27Var != null && k27Var.u3()) {
            ff0 ff0Var = this.S;
            gb2 gb2Var = this.c;
            int i4 = 0;
            if (ff0Var == null) {
                int w0 = bkb.w0(null, bkb.h6, false);
                this.R = w0;
                ff0 Y2 = bkb.Y(w0, 12, 12);
                this.S = Y2;
                Y2.setCallback(gb2Var);
            }
            this.E.setColor(bkb.n2.getColor());
            this.F.setColor(bkb.p1(0.45f, bkb.n2.getColor()));
            this.G.setColor(bkb.p1(0.15f, bkb.n2.getColor()));
            this.H.setColor(bkb.n2.getColor());
            boolean O3 = this.T.O3();
            TextPaint textPaint2 = this.D;
            if (O3) {
                int i5 = bkb.Nb;
                textPaint2.setColor(bkb.v0(i5, wjbVar));
                this.I.setColor(bkb.v0(i5, wjbVar));
                this.J.setColor(bkb.v0(bkb.Qb, wjbVar));
            } else {
                int i6 = bkb.Ad;
                textPaint2.setColor(bkb.v0(i6, wjbVar));
                this.I.setColor(bkb.v0(i6, wjbVar));
                this.J.setColor(bkb.v0(bkb.Kd, wjbVar));
            }
            if (this.U) {
                this.I.setColor(bkb.v0(bkb.Vk, wjbVar));
            }
            canvas2.save();
            int L = i2 - gl.L(4.0f);
            canvas2.translate(L, i);
            this.P.set(L, i, this.l + L, this.k + i);
            canvas2.saveLayer(0.0f, 0.0f, this.l, this.k, this.K, 31);
            this.d.h(canvas2, null);
            float f5 = this.l / 2.0f;
            float L2 = gl.L(106.0f);
            int L3 = gl.L(12.0f) + this.O.width();
            int L4 = gl.L(10.0f) + this.O.height();
            this.M.set(f5 - ((gl.L(2.0f) + L3) / 2.0f), L2 - ((gl.L(2.0f) + L4) / 2.0f), ((gl.L(2.0f) + L3) / 2.0f) + f5, ((gl.L(2.0f) + L4) / 2.0f) + L2);
            canvas2.drawRoundRect(this.M, gl.L(11.0f), gl.L(11.0f), this.L);
            float f6 = L3 / 2.0f;
            float f7 = L4 / 2.0f;
            this.M.set(f5 - f6, L2 - f7, f5 + f6, L2 + f7);
            canvas2.drawRoundRect(this.M, gl.L(10.0f), gl.L(10.0f), this.I);
            Drawable drawable = this.t;
            if (drawable != null) {
                drawable.setBounds(gl.L(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - gl.L(6.96f), gl.L(21.24f) + ((int) this.M.left), gl.L(6.96f) + ((int) this.M.centerY()));
                this.t.draw(canvas2);
            }
            String str = this.u;
            float centerX = this.M.centerX();
            if (this.U) {
                f = 8.0f;
            } else {
                f = 0.0f;
            }
            float L5 = centerX + gl.L(f);
            float centerY = this.M.centerY() + gl.L(4.0f);
            if (this.U) {
                textPaint = this.C;
            } else {
                textPaint = this.B;
            }
            canvas2.drawText(str, L5, centerY, textPaint);
            canvas2.restore();
            canvas2.translate(0.0f, gl.L(128.0f));
            int L6 = gl.L(128.0f) + i;
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.w.draw(canvas2);
            canvas2.translate(0.0f, this.p);
            float f8 = 6.0f;
            if (this.x != null) {
                canvas2.restore();
                canvas2.save();
                float L7 = (this.p + this.m) - gl.L(6.0f);
                float f9 = this.l / 2.0f;
                canvas2.drawText(this.o, f9, L7, this.F);
                f2 = 16.0f;
                canvas2.drawLine(gl.L(17.0f), L7 - gl.L(4.0f), (f9 - (this.n / 2.0f)) - gl.L(6.0f), L7 - gl.L(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(gl.L(6.0f) + (this.n / 2.0f) + f9, L7 - gl.L(4.0f), this.l - gl.L(16.0f), L7 - gl.L(4.0f), this.G);
                canvas2.translate((this.l - this.x.getWidth()) / 2.0f, this.p);
                this.x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.m + this.p);
            } else {
                f2 = 16.0f;
            }
            this.y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, gl.L(6.0f) + this.q);
            int w = de9.w(6.0f, this.q, L6);
            int i7 = 0;
            int i8 = 0;
            while (true) {
                boolean[] zArr = this.j;
                if (i7 >= zArr.length) {
                    break;
                } else if (zArr[i7]) {
                    canvas2.save();
                    int i9 = i7;
                    float f10 = 0.0f;
                    while (true) {
                        f4 = f8;
                        f10 += this.g[i9] + gl.L(40.0f);
                        i9++;
                        boolean[] zArr2 = this.j;
                        if (i9 >= zArr2.length || this.h[i9] || !zArr2[i9]) {
                            break;
                        }
                        f8 = f4;
                    }
                    float f11 = f5 - (f10 / 2.0f);
                    canvas2.translate(f11, 0.0f);
                    int i10 = ((int) f11) + L;
                    int i11 = i7;
                    while (true) {
                        TLRPC.Chat chat = this.f[i11];
                        if (this.T.O3()) {
                            v0 = bkb.v0(bkb.Nb, wjbVar);
                        } else {
                            int F = hc2.F(chat);
                            if (F < 7) {
                                v0 = bkb.v0(bkb.q8[F], wjbVar);
                            } else {
                                ea7 ea7Var = na7.q1(y6c.t0).E3;
                                if (ea7Var == null) {
                                    d = null;
                                } else {
                                    d = ea7Var.d(F);
                                }
                                if (d != null) {
                                    v0 = d.e(i4, wjbVar);
                                } else {
                                    v0 = bkb.v0(bkb.q8[i4], wjbVar);
                                }
                            }
                        }
                        int i12 = this.V;
                        if (i12 >= 0 && i12 == i11) {
                            i3 = v0;
                        } else {
                            i3 = i8;
                        }
                        this.D.setColor(v0);
                        this.J.setColor(v0);
                        this.J.setAlpha(25);
                        this.a[i11].h(canvas2, null);
                        CharSequence charSequence = this.e[i11];
                        int i13 = i10;
                        canvas2.drawText(charSequence, 0, charSequence.length(), gl.L(30.0f), gl.L(f2), this.D);
                        this.N.set(0.0f, 0.0f, this.g[i11] + gl.L(40.0f), gl.L(24.0f));
                        canvas2.drawRoundRect(this.N, gl.L(12.0f), gl.L(12.0f), this.J);
                        float f12 = i13;
                        this.i[i11].set(i13, w, (int) (this.N.width() + f12), gl.L(24.0f) + w);
                        canvas2.translate(this.N.width() + gl.L(f4), 0.0f);
                        i10 = (int) (this.N.width() + gl.L(f4) + f12);
                        i11++;
                        boolean[] zArr3 = this.j;
                        if (i11 >= zArr3.length || this.h[i11] || !zArr3[i11]) {
                            break;
                        }
                        i8 = i3;
                        i4 = 0;
                    }
                    canvas2.restore();
                    canvas2.translate(0.0f, gl.L(30.0f));
                    w += gl.L(30.0f);
                    i7 = i11;
                    i8 = i3;
                    i4 = 0;
                    f8 = f4;
                } else {
                    i7++;
                    i4 = 0;
                }
            }
            float f13 = f8;
            if (this.A != null) {
                canvas2.save();
                canvas2.translate((this.l - this.A.getWidth()) / 2.0f, gl.L(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.s);
            }
            canvas2.translate(0.0f, gl.L(f13));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (bkb.I.o()) {
                    f3 = 0.12f;
                } else {
                    f3 = 0.1f;
                }
                int p1 = bkb.p1(f3, i8);
                if (this.R != p1) {
                    ff0 ff0Var2 = this.S;
                    this.R = p1;
                    bkb.F1(ff0Var2, p1, true);
                }
                this.S.setBounds(this.i[this.V]);
                this.S.setCallback(gb2Var);
            }
        }
    }

    public final void c(boolean z) {
        ff0 ff0Var;
        k27 k27Var = this.T;
        if (k27Var != null && k27Var.u3() && (ff0Var = this.S) != null) {
            gb2 gb2Var = this.c;
            if (z) {
                ff0Var.setCallback(new in(this, (byte) 5));
                this.S.setState(this.Q);
                gb2Var.invalidate();
                return;
            }
            ff0Var.setState(StateSet.NOTHING);
            gb2Var.invalidate();
        }
    }

    public final void d(int i, int i2, k27 k27Var) {
        float f;
        boolean z;
        float f2;
        TLRPC.Document document;
        boolean z2;
        String str;
        boolean z3;
        int L;
        TLRPC.Peer peer;
        String str2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int i3;
        String str3;
        boolean z4;
        String str4;
        this.T = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        boolean z5 = false;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        if (k27Var.u3()) {
            this.T = k27Var;
            float f3 = 12.0f;
            boolean z6 = true;
            if (this.B == null) {
                this.B = new TextPaint(1);
                this.C = new TextPaint(1);
                this.D = new TextPaint(1);
                this.E = new TextPaint(1);
                this.F = new TextPaint(1);
                this.G = new Paint(1);
                this.H = new TextPaint(1);
                this.I = new Paint(1);
                this.J = new Paint(1);
                this.K = new Paint();
                this.L = new Paint();
                this.M = new RectF();
                this.N = new RectF();
                this.O = new Rect();
                this.P = new Rect();
                this.Q = new int[]{16842910, 16842919};
                this.e = new CharSequence[10];
                this.f = new TLRPC.Chat[10];
                this.g = new float[10];
                this.h = new boolean[10];
                this.i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(gl.o());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(gl.L(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(gl.o());
                this.C.setTextSize(gl.L(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(gl.o());
                this.D.setTextSize(gl.L(13.0f));
                this.H.setTextSize(gl.L(13.0f));
                this.E.setTextSize(gl.L(14.0f));
                this.F.setTextSize(gl.L(14.0f));
                this.F.setTextAlign(align);
            }
            float f4 = 18.0f;
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new pb0[10];
                this.j = new boolean[10];
                int i4 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i4 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i4] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i4];
                    imageReceiver2.A1 = true;
                    imageReceiver2.q0(gl.L(12.0f));
                    this.b[i4] = new pb0((wjb) null);
                    this.b[i4].s(gl.L(18.0f));
                    this.i[i4] = new Rect();
                    i4++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) k27Var.k.media;
            String str5 = y6c.h(y6c.t0).c0;
            int i5 = y6c.t0;
            if (str5 == null) {
                hq6.d0(i5).B();
                f = 12.0f;
                z = true;
                f2 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet q0 = hq6.d0(i5).q0(str5);
                if (q0 == null) {
                    q0 = hq6.d0(y6c.t0).o0(str5);
                }
                if (q0 != null) {
                    String str6 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = q0.packs;
                    int size = arrayList.size();
                    document = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i6);
                            i6++;
                            TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                            f = f3;
                            if (Objects.equals(tL_stickerPack2.emoticon, str6)) {
                                ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                                int size2 = arrayList2.size();
                                f2 = f4;
                                int i7 = z5;
                                while (true) {
                                    if (i7 < size2) {
                                        Long l = arrayList2.get(i7);
                                        int i8 = i7 + 1;
                                        long longValue = l.longValue();
                                        ArrayList<TLRPC.Document> arrayList3 = q0.documents;
                                        int size3 = arrayList3.size();
                                        z = z6;
                                        int i9 = z5;
                                        while (true) {
                                            if (i9 < size3) {
                                                TLRPC.Document document2 = arrayList3.get(i9);
                                                int i10 = i9 + 1;
                                                TLRPC.Document document3 = document2;
                                                ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                                str = str6;
                                                if (document3.id == longValue) {
                                                    document = document3;
                                                    break;
                                                }
                                                str6 = str;
                                                arrayList3 = arrayList4;
                                                i9 = i10;
                                            } else {
                                                str = str6;
                                                break;
                                            }
                                        }
                                        if (document != null) {
                                            break;
                                        }
                                        z6 = z;
                                        str6 = str;
                                        z5 = false;
                                        i7 = i8;
                                    } else {
                                        str = str6;
                                        z = z6;
                                        break;
                                    }
                                }
                            } else {
                                str = str6;
                                z = z6;
                                f2 = f4;
                            }
                            if (document != null) {
                                break;
                            }
                            f3 = f;
                            f4 = f2;
                            z6 = z;
                            str6 = str;
                            z5 = false;
                        } else {
                            f = f3;
                            z = z6;
                            f2 = f4;
                            break;
                        }
                    }
                    if (document == null && !q0.documents.isEmpty()) {
                        z5 = false;
                        document = q0.documents.get(0);
                    } else {
                        z5 = false;
                    }
                } else {
                    f = 12.0f;
                    z = true;
                    f2 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    kcb d = uo3.d(document.thumbs, bkb.b7, 0.2f, z5);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    this.d.d0(gl5.b(document), "160_160_firstframe", d, "tgs", q0, 1);
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
                    hq6 d0 = hq6.d0(y6c.t0);
                    if (tL_messages_stickerSet == null) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    d0.d1(str5, false, z2);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) k27Var.k.media;
            if ((tL_messageMediaGiveaway2.flags & 32) != 0) {
                z3 = z;
            } else {
                z3 = false;
            }
            this.U = z3;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.b = (pb0[]) Arrays.copyOf(this.b, size4);
                this.j = Arrays.copyOf(this.j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.g = Arrays.copyOf(this.g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.i = (Rect[]) Arrays.copyOf(this.i, size4);
                this.f = (TLRPC.Chat[]) Arrays.copyOf(this.f, size4);
                int i11 = length - 1;
                while (i11 < size4) {
                    this.a[i11] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i11];
                    imageReceiver3.A1 = z;
                    imageReceiver3.q0(gl.L(f));
                    this.b[i11] = new pb0((wjb) null);
                    this.b[i11].s(gl.L(f2));
                    this.i[i11] = new Rect();
                    i11++;
                    z = true;
                }
            }
            int L2 = gl.L(148.0f);
            if (gl.O1()) {
                L = gl.P0() - gl.L(80.0f);
            } else {
                L = i - gl.L(80.0f);
            }
            int i12 = L;
            na7 q1 = na7.q1(y6c.t0);
            boolean l3 = k27.l3(k27Var.k);
            TLRPC.Message message = k27Var.k;
            if (l3) {
                peer = message.fwd_from.from_id;
            } else {
                peer = message.peer_id;
            }
            boolean V = hc2.V(q1.K0(Long.valueOf(-k27.B1(peer))));
            SpannableStringBuilder S2 = gl.S2(k96.M0(2131753390, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(S2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, S2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) gl.S2(k96.H(',', "BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) gl.S2(k96.G(tL_messageMediaGiveaway2.quantity, "BoostingStarsGiveawayMsgInfoPlural2", new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) gl.S2(k96.H(',', "BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) gl.S2(k96.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgInfoPlural2", k96.G(tL_messageMediaGiveaway2.months, "BoldMonths", new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder S22 = gl.S2(k96.M0(2131753407, "BoostingGiveawayMsgParticipants"));
            spannableStringBuilder3.append((CharSequence) S22);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, S22.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                if (V) {
                    str4 = "BoostingGiveawayMsgNewSubsPlural";
                } else {
                    str4 = "BoostingGiveawayMsgNewSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) k96.G(tL_messageMediaGiveaway2.channels.size(), str4, new Object[0]));
            } else {
                if (V) {
                    str2 = "BoostingGiveawayMsgAllSubsPlural";
                } else {
                    str2 = "BoostingGiveawayMsgAllSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) k96.G(tL_messageMediaGiveaway2.channels.size(), str2, new Object[0]));
            }
            SpannableStringBuilder S23 = gl.S2(k96.M0(2131753165, "BoostingWinnersDate"));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(S23);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, S23.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = k96.D0().r0().format(date);
            String format2 = k96.D0().o0().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) k96.a0("formatDateAtTime", null, 2131742520, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.w = lwa.c(spannableStringBuilder, textPaint2, i12, alignment, gl.L(2.0f), truncateAt, i12, 10, true);
            this.y = lwa.c(spannableStringBuilder3, this.E, i12, alignment, gl.L(2.0f), truncateAt, i12, 10, true);
            this.z = lwa.c(spannableStringBuilder4, this.E, i12, alignment, gl.L(3.0f), truncateAt, i12, 10, true);
            int i13 = 0;
            for (int i14 = 0; i14 < this.w.getLineCount(); i14++) {
                i13 = (int) Math.max(i13, Math.ceil(this.w.getLineWidth(i14)));
            }
            for (int i15 = 0; i15 < this.y.getLineCount(); i15++) {
                i13 = (int) Math.max(i13, Math.ceil(this.y.getLineWidth(i15)));
            }
            for (int i16 = 0; i16 < this.z.getLineCount(); i16++) {
                i13 = (int) Math.max(i13, Math.ceil(this.z.getLineWidth(i16)));
            }
            if (i13 < gl.L(180.0f)) {
                i13 = gl.L(180.0f);
            }
            int i17 = i13;
            String str7 = tL_messageMediaGiveaway2.prize_description;
            if (str7 != null && !str7.isEmpty()) {
                StaticLayout c = lwa.c(vu3.m(gl.S2(k96.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false, null, 0), this.E, i17, Layout.Alignment.ALIGN_CENTER, gl.L(2.0f), TextUtils.TruncateAt.END, i17, 20, true);
                this.x = c;
                this.m = gl.L(22.0f) + c.getLineBottom(c.getLineCount() - 1);
                String M0 = k96.M0(2131753403, null);
                this.o = M0;
                this.n = this.F.measureText(M0, 0, M0.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i18 = 0;
                while (i18 < size5) {
                    String str8 = arrayList6.get(i18);
                    i18++;
                    String str9 = str8;
                    String displayCountry = new Locale("", str9).getDisplayCountry(Locale.getDefault());
                    String E0 = k96.E0(str9);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (E0 != null) {
                        spannableStringBuilder5.append((CharSequence) E0).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = lwa.c(vu3.m(gl.S2(k96.a0("BoostingGiveAwayFromCountries", null, 2131753490, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false, null, 0), this.H, i17, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i17, 10, true);
                }
            }
            int max = Math.max(i2, Math.min(gl.L(38.0f) + i17, i12));
            this.v = max - i12;
            float f5 = max;
            float f6 = L2;
            float f7 = f6 / 2.0f;
            this.d.i0((f5 / 2.0f) - f7, gl.L(42.0f) - f7, f6, f6);
            int L3 = gl.L(5.0f) + this.w.getLineBottom(staticLayout.getLineCount() - 1);
            this.p = L3;
            this.q = this.y.getLineBottom(staticLayout2.getLineCount() - 1) + L3 + this.m;
            this.r = this.z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            if (staticLayout4 != null) {
                i3 = staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + gl.L(f);
            } else {
                i3 = 0;
            }
            this.s = i3;
            int i19 = this.k + this.q + i3 + this.r;
            this.k = i19;
            this.k = gl.L(128.0f) + i19;
            this.l = max;
            if (this.U) {
                if (this.t == null) {
                    this.t = b00.d(a.b, 2131231126);
                }
                str3 = k96.E((int) tL_messageMediaGiveaway2.stars, ',');
                this.u = str3;
            } else {
                this.t = null;
                str3 = "x" + tL_messageMediaGiveaway2.quantity;
                this.u = str3;
            }
            this.B.getTextBounds(str3, 0, str3.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = gl.L(20.0f) + rect.right;
            }
            Arrays.fill(this.j, false);
            this.k = gl.L(30.0f) + this.k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i20 = 0;
            while (i20 < size6) {
                Long l2 = arrayList8.get(i20);
                i20++;
                Long l4 = l2;
                if (na7.q1(y6c.t0).K0(l4) != null) {
                    arrayList7.add(l4);
                }
            }
            float f8 = 0.0f;
            for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                Long l5 = (Long) arrayList7.get(i21);
                long longValue2 = l5.longValue();
                TLRPC.Chat K0 = na7.q1(y6c.t0).K0(l5);
                if (K0 != null) {
                    this.j[i21] = true;
                    this.f[i21] = K0;
                    this.e[i21] = TextUtils.ellipsize(vu3.m(K0.title, this.D.getFontMetricsInt(), false, null, 0), this.D, 0.8f * f5, TextUtils.TruncateAt.END);
                    float[] fArr = this.g;
                    TextPaint textPaint3 = this.D;
                    CharSequence charSequence = this.e[i21];
                    fArr[i21] = textPaint3.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.g[i21] + gl.L(40.0f);
                    f8 += L4;
                    boolean[] zArr = this.h;
                    if (i21 > 0) {
                        if (f8 > 0.9f * f5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zArr[i21] = z4;
                        if (z4) {
                            this.k = gl.L(30.0f) + this.k;
                            f8 = L4;
                        }
                    } else {
                        zArr[i21] = false;
                    }
                    this.b[i21].p(K0);
                    this.a[i21].U(K0, this.b[i21], null);
                    this.a[i21].i0(0.0f, 0.0f, gl.L(24.0f), gl.L(24.0f));
                } else {
                    this.f[i21] = null;
                    this.j[i21] = false;
                    this.e[i21] = "";
                    this.h[i21] = false;
                    this.g[i21] = gl.L(20.0f);
                    this.b[i21].j(longValue2, "", "", null);
                }
            }
        }
    }
}

package ah;

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
import ei.e;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import k2.p1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.jz;
import org.telegram.messenger.k5;
import org.telegram.messenger.li;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.u8;
import xg.s;
public final class b {
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
    public y S;
    public zi T;
    public boolean U;
    public ImageReceiver[] f424a;
    public u8[] f425b;
    public final q1 f426c;
    public ImageReceiver d;
    public CharSequence[] f427e;
    public TLRPC.Chat[] f428f;
    public float[] f429g;
    public boolean[] h;
    public Rect[] f430i;
    public boolean[] f431j;
    public int f434m;
    public float f435n;
    public String f436o;
    public int f437p;
    public int f438q;
    public int f439r;
    public int f440s;
    public Drawable f441t;
    public String f442u;
    public int v;
    public StaticLayout f443w;
    public StaticLayout f444x;
    public StaticLayout f445y;
    public StaticLayout f446z;
    public int f432k = 0;
    public int f433l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        com.google.android.recaptcha.internal.a.w(1, hashMap, "1⃣", 3, "2⃣");
        com.google.android.recaptcha.internal.a.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public b(q1 q1Var) {
        this.f426c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        zi ziVar = this.T;
        if (ziVar != null && ziVar.v3()) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i3 = 0;
                while (true) {
                    Rect[] rectArr = this.f430i;
                    if (i3 < rectArr.length) {
                        if (rectArr[i3].contains(x10, y9)) {
                            this.V = i3;
                            this.S.setHotspot(x10, y9);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i3++;
                    } else if (this.P.contains(x10, y9)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    q1 q1Var = this.f426c;
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().z1(q1Var, this.V);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    zi ziVar2 = this.T;
                    if (ziVar2 != null && ziVar2.f26868k != null) {
                        s.d(ziVar2, new xg.d(ziVar2, 0), new e(28));
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

    public final void b(Canvas canvas, int i3, int i10, e6 e6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        float f13;
        wo d;
        int w02;
        int i11;
        Canvas canvas2 = canvas;
        zi ziVar = this.T;
        if (ziVar != null && ziVar.v3()) {
            y yVar = this.S;
            q1 q1Var = this.f426c;
            int i12 = 0;
            if (yVar == null) {
                int x02 = k6.x0(null, k6.f27972i6, false);
                this.R = x02;
                y a02 = k6.a0(x02, 12, 12);
                this.S = a02;
                a02.setCallback(q1Var);
            }
            this.E.setColor(k6.f28077o2.getColor());
            this.F.setColor(k6.r1(0.45f, k6.f28077o2.getColor()));
            this.G.setColor(k6.r1(0.15f, k6.f28077o2.getColor()));
            this.H.setColor(k6.f28077o2.getColor());
            if (this.T.Q3()) {
                TextPaint textPaint2 = this.D;
                int i13 = k6.Lb;
                textPaint2.setColor(k6.w0(i13, e6Var));
                this.I.setColor(k6.w0(i13, e6Var));
                this.J.setColor(k6.w0(k6.Ob, e6Var));
            } else {
                TextPaint textPaint3 = this.D;
                int i14 = k6.f28278yd;
                textPaint3.setColor(k6.w0(i14, e6Var));
                this.I.setColor(k6.w0(i14, e6Var));
                this.J.setColor(k6.w0(k6.Id, e6Var));
            }
            if (this.U) {
                this.I.setColor(k6.w0(k6.Tk, e6Var));
            }
            canvas2.save();
            int L = i10 - g0.L(4.0f);
            canvas2.translate(L, i3);
            this.P.set(L, i3, this.f433l + L, this.f432k + i3);
            canvas2.saveLayer(0.0f, 0.0f, this.f433l, this.f432k, this.K, 31);
            this.d.h(canvas2, null);
            float f14 = this.f433l / 2.0f;
            float L2 = g0.L(106.0f);
            int L3 = g0.L(12.0f) + this.O.width();
            int L4 = g0.L(10.0f) + this.O.height();
            this.M.set(f14 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f14, ((g0.L(2.0f) + L4) / 2.0f) + L2);
            canvas2.drawRoundRect(this.M, g0.L(11.0f), g0.L(11.0f), this.L);
            float f15 = L3 / 2.0f;
            float f16 = L4 / 2.0f;
            this.M.set(f14 - f15, L2 - f16, f14 + f15, L2 + f16);
            canvas2.drawRoundRect(this.M, g0.L(10.0f), g0.L(10.0f), this.I);
            Drawable drawable = this.f441t;
            if (drawable != null) {
                drawable.setBounds(g0.L(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.M.left), g0.L(6.96f) + ((int) this.M.centerY()));
                this.f441t.draw(canvas2);
            }
            String str = this.f442u;
            float centerX = this.M.centerX();
            if (this.U) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float L5 = centerX + g0.L(f10);
            float centerY = this.M.centerY() + g0.L(4.0f);
            if (this.U) {
                textPaint = this.C;
            } else {
                textPaint = this.B;
            }
            canvas2.drawText(str, L5, centerY, textPaint);
            canvas2.restore();
            canvas2.translate(0.0f, g0.L(128.0f));
            int L6 = g0.L(128.0f) + i3;
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f443w.draw(canvas2);
            canvas2.translate(0.0f, this.f437p);
            float f17 = 6.0f;
            if (this.f444x != null) {
                canvas2.restore();
                canvas2.save();
                float L7 = (this.f437p + this.f434m) - g0.L(6.0f);
                float f18 = this.f433l / 2.0f;
                canvas2.drawText(this.f436o, f18, L7, this.F);
                f11 = 16.0f;
                canvas2.drawLine(g0.L(17.0f), L7 - g0.L(4.0f), (f18 - (this.f435n / 2.0f)) - g0.L(6.0f), L7 - g0.L(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(g0.L(6.0f) + (this.f435n / 2.0f) + f18, L7 - g0.L(4.0f), this.f433l - g0.L(16.0f), L7 - g0.L(4.0f), this.G);
                canvas2.translate((this.f433l - this.f444x.getWidth()) / 2.0f, this.f437p);
                this.f444x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.f434m + this.f437p);
            } else {
                f11 = 16.0f;
            }
            this.f445y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, g0.L(6.0f) + this.f438q);
            int C = k5.C(6.0f, this.f438q, L6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr = this.f431j;
                if (i15 >= zArr.length) {
                    break;
                } else if (zArr[i15]) {
                    canvas2.save();
                    int i17 = i15;
                    float f19 = 0.0f;
                    while (true) {
                        f13 = f17;
                        f19 += this.f429g[i17] + g0.L(40.0f);
                        i17++;
                        boolean[] zArr2 = this.f431j;
                        if (i17 >= zArr2.length || this.h[i17] || !zArr2[i17]) {
                            break;
                        }
                        f17 = f13;
                    }
                    float f20 = f14 - (f19 / 2.0f);
                    canvas2.translate(f20, 0.0f);
                    int i18 = ((int) f20) + L;
                    int i19 = i15;
                    while (true) {
                        TLRPC.Chat chat = this.f428f[i19];
                        if (this.T.Q3()) {
                            w02 = k6.w0(k6.Lb, e6Var);
                        } else {
                            int F = t3.F(chat);
                            if (F < 7) {
                                w02 = k6.w0(k6.f28142r8[F], e6Var);
                            } else {
                                xo xoVar = hp.s1(h10.f22829t0).f23099q4;
                                if (xoVar == null) {
                                    d = null;
                                } else {
                                    d = xoVar.d(F);
                                }
                                if (d != null) {
                                    w02 = d.e(i12, e6Var);
                                } else {
                                    w02 = k6.w0(k6.f28142r8[i12], e6Var);
                                }
                            }
                        }
                        int i20 = this.V;
                        if (i20 >= 0 && i20 == i19) {
                            i11 = w02;
                        } else {
                            i11 = i16;
                        }
                        this.D.setColor(w02);
                        this.J.setColor(w02);
                        this.J.setAlpha(25);
                        this.f424a[i19].h(canvas2, null);
                        CharSequence charSequence = this.f427e[i19];
                        int i21 = i18;
                        canvas2.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(f11), this.D);
                        this.N.set(0.0f, 0.0f, this.f429g[i19] + g0.L(40.0f), g0.L(24.0f));
                        canvas2.drawRoundRect(this.N, g0.L(12.0f), g0.L(12.0f), this.J);
                        float f21 = i21;
                        this.f430i[i19].set(i21, C, (int) (this.N.width() + f21), g0.L(24.0f) + C);
                        canvas2.translate(this.N.width() + g0.L(f13), 0.0f);
                        i18 = (int) (this.N.width() + g0.L(f13) + f21);
                        i19++;
                        boolean[] zArr3 = this.f431j;
                        if (i19 >= zArr3.length || this.h[i19] || !zArr3[i19]) {
                            break;
                        }
                        i16 = i11;
                        i12 = 0;
                    }
                    canvas2.restore();
                    canvas2.translate(0.0f, g0.L(30.0f));
                    C += g0.L(30.0f);
                    i15 = i19;
                    i16 = i11;
                    i12 = 0;
                    f17 = f13;
                } else {
                    i15++;
                    i12 = 0;
                }
            }
            float f22 = f17;
            if (this.A != null) {
                canvas2.save();
                canvas2.translate((this.f433l - this.A.getWidth()) / 2.0f, g0.L(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.f440s);
            }
            canvas2.translate(0.0f, g0.L(f22));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f446z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (k6.I.q()) {
                    f12 = 0.12f;
                } else {
                    f12 = 0.1f;
                }
                int r12 = k6.r1(f12, i16);
                if (this.R != r12) {
                    y yVar2 = this.S;
                    this.R = r12;
                    k6.H1(yVar2, r12, true);
                }
                this.S.setBounds(this.f430i[this.V]);
                this.S.setCallback(q1Var);
            }
        }
    }

    public final void c(boolean z10) {
        y yVar;
        zi ziVar = this.T;
        if (ziVar != null && ziVar.v3() && (yVar = this.S) != null) {
            q1 q1Var = this.f426c;
            if (z10) {
                yVar.setCallback(new a(this, 0));
                this.S.setState(this.Q);
                q1Var.invalidate();
                return;
            }
            yVar.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
    }

    public final void d(int i3, int i10, zi ziVar) {
        float f10;
        boolean z10;
        float f11;
        TLRPC.Document document;
        boolean z11;
        String str;
        boolean z12;
        int L;
        TLRPC.Peer peer;
        String str2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int i11;
        boolean z13;
        String str3;
        this.T = null;
        this.f443w = null;
        this.f444x = null;
        this.f445y = null;
        this.f446z = null;
        this.A = null;
        boolean z14 = false;
        this.f432k = 0;
        this.f433l = 0;
        this.f434m = 0;
        this.f435n = 0.0f;
        if (ziVar.v3()) {
            this.T = ziVar;
            float f12 = 12.0f;
            boolean z15 = true;
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
                this.f427e = new CharSequence[10];
                this.f428f = new TLRPC.Chat[10];
                this.f429g = new float[10];
                this.h = new boolean[10];
                this.f430i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f426c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(g0.o());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(g0.L(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(g0.o());
                this.C.setTextSize(g0.L(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(g0.o());
                this.D.setTextSize(g0.L(13.0f));
                this.H.setTextSize(g0.L(13.0f));
                this.E.setTextSize(g0.L(14.0f));
                this.F.setTextSize(g0.L(14.0f));
                this.F.setTextAlign(align);
            }
            float f13 = 18.0f;
            if (this.f424a == null) {
                this.f424a = new ImageReceiver[10];
                this.f425b = new u8[10];
                this.f431j = new boolean[10];
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f424a;
                    if (i12 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i12] = new ImageReceiver(this.f426c);
                    ImageReceiver imageReceiver2 = this.f424a[i12];
                    imageReceiver2.A1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.f425b[i12] = new u8((e6) null);
                    this.f425b[i12].u(g0.L(18.0f));
                    this.f430i[i12] = new Rect();
                    i12++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) ziVar.f26868k.media;
            String str4 = h10.i(h10.f22829t0).f22836c0;
            if (str4 == null) {
                li.b0(h10.f22829t0).z();
                f10 = 12.0f;
                z10 = true;
                f11 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet p02 = li.b0(h10.f22829t0).p0(str4);
                if (p02 == null) {
                    p02 = li.b0(h10.f22829t0).n0(str4);
                }
                if (p02 != null) {
                    String str5 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = p02.packs;
                    int size = arrayList.size();
                    document = null;
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i13);
                            i13++;
                            TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                            f10 = f12;
                            if (Objects.equals(tL_stickerPack2.emoticon, str5)) {
                                ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                                int size2 = arrayList2.size();
                                f11 = f13;
                                int i14 = z14;
                                while (true) {
                                    if (i14 < size2) {
                                        Long l10 = arrayList2.get(i14);
                                        int i15 = i14 + 1;
                                        long longValue = l10.longValue();
                                        ArrayList<TLRPC.Document> arrayList3 = p02.documents;
                                        int size3 = arrayList3.size();
                                        z10 = z15;
                                        int i16 = z14;
                                        while (true) {
                                            if (i16 < size3) {
                                                TLRPC.Document document2 = arrayList3.get(i16);
                                                int i17 = i16 + 1;
                                                TLRPC.Document document3 = document2;
                                                ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                                str = str5;
                                                if (document3.f27007id == longValue) {
                                                    document = document3;
                                                    break;
                                                }
                                                str5 = str;
                                                arrayList3 = arrayList4;
                                                i16 = i17;
                                            } else {
                                                str = str5;
                                                break;
                                            }
                                        }
                                        if (document != null) {
                                            break;
                                        }
                                        z15 = z10;
                                        str5 = str;
                                        z14 = false;
                                        i14 = i15;
                                    } else {
                                        str = str5;
                                        z10 = z15;
                                        break;
                                    }
                                }
                            } else {
                                str = str5;
                                z10 = z15;
                                f11 = f13;
                            }
                            if (document != null) {
                                break;
                            }
                            f12 = f10;
                            f13 = f11;
                            z15 = z10;
                            str5 = str;
                            z14 = false;
                        } else {
                            f10 = f12;
                            z10 = z15;
                            f11 = f13;
                            break;
                        }
                    }
                    if (document == null && !p02.documents.isEmpty()) {
                        z14 = false;
                        document = p02.documents.get(0);
                    } else {
                        z14 = false;
                    }
                } else {
                    f10 = 12.0f;
                    z10 = true;
                    f11 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    jz d = t5.d(document.thumbs, k6.f27862c7, 0.2f, z14);
                    if (d != null) {
                        d.f23763e = 512;
                        d.f23764f = 512;
                    }
                    this.d.q0(ac.b(document), "160_160_firstframe", d, "tgs", p02, 1);
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                    li b02 = li.b0(h10.f22829t0);
                    if (tL_messages_stickerSet == null) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    b02.c1(str4, false, z11);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) ziVar.f26868k.media;
            if ((tL_messageMediaGiveaway2.flags & 32) != 0) {
                z12 = z10;
            } else {
                z12 = false;
            }
            this.U = z12;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f424a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f424a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f425b = (u8[]) Arrays.copyOf(this.f425b, size4);
                this.f431j = Arrays.copyOf(this.f431j, size4);
                this.f427e = (CharSequence[]) Arrays.copyOf(this.f427e, size4);
                this.f429g = Arrays.copyOf(this.f429g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f430i = (Rect[]) Arrays.copyOf(this.f430i, size4);
                this.f428f = (TLRPC.Chat[]) Arrays.copyOf(this.f428f, size4);
                int i18 = length - 1;
                while (i18 < size4) {
                    this.f424a[i18] = new ImageReceiver(this.f426c);
                    ImageReceiver imageReceiver3 = this.f424a[i18];
                    imageReceiver3.A1 = z10;
                    imageReceiver3.J0(g0.L(f10));
                    this.f425b[i18] = new u8((e6) null);
                    this.f425b[i18].u(g0.L(f11));
                    this.f430i[i18] = new Rect();
                    i18++;
                    z10 = true;
                }
            }
            int L2 = g0.L(148.0f);
            if (g0.Q1()) {
                L = g0.Q0() - g0.L(80.0f);
            } else {
                L = i3 - g0.L(80.0f);
            }
            int i19 = L;
            hp s12 = hp.s1(h10.f22829t0);
            boolean m32 = zi.m3(ziVar.f26868k);
            TLRPC.Message message = ziVar.f26868k;
            if (m32) {
                peer = message.fwd_from.from_id;
            } else {
                peer = message.peer_id;
            }
            boolean V = t3.V(s12.M0(Long.valueOf(-zi.C1(peer))));
            SpannableStringBuilder X2 = g0.X2(bd.M0(2131753393, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, X2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.H(',', "BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.G(tL_messageMediaGiveaway2.quantity, "BoostingStarsGiveawayMsgInfoPlural2", new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.H(',', "BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgInfoPlural2", bd.G(tL_messageMediaGiveaway2.months, "BoldMonths", new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder X22 = g0.X2(bd.M0(2131753410, "BoostingGiveawayMsgParticipants"));
            spannableStringBuilder3.append((CharSequence) X22);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, X22.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                if (V) {
                    str3 = "BoostingGiveawayMsgNewSubsPlural";
                } else {
                    str3 = "BoostingGiveawayMsgNewSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) bd.G(tL_messageMediaGiveaway2.channels.size(), str3, new Object[0]));
            } else {
                if (V) {
                    str2 = "BoostingGiveawayMsgAllSubsPlural";
                } else {
                    str2 = "BoostingGiveawayMsgAllSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) bd.G(tL_messageMediaGiveaway2.channels.size(), str2, new Object[0]));
            }
            SpannableStringBuilder X23 = g0.X2(bd.M0(2131753168, "BoostingWinnersDate"));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(X23);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, X23.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = bd.E0().s0().format(date);
            String format2 = bd.E0().p0().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) bd.a0("formatDateAtTime", null, 2131742793, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f443w = lu0.c(spannableStringBuilder, textPaint2, i19, alignment, g0.L(2.0f), truncateAt, i19, 10, true);
            this.f445y = lu0.c(spannableStringBuilder3, this.E, i19, alignment, g0.L(2.0f), truncateAt, i19, 10, true);
            this.f446z = lu0.c(spannableStringBuilder4, this.E, i19, alignment, g0.L(3.0f), truncateAt, i19, 10, true);
            int i20 = 0;
            for (int i21 = 0; i21 < this.f443w.getLineCount(); i21++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f443w.getLineWidth(i21)));
            }
            for (int i22 = 0; i22 < this.f445y.getLineCount(); i22++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f445y.getLineWidth(i22)));
            }
            for (int i23 = 0; i23 < this.f446z.getLineCount(); i23++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f446z.getLineWidth(i23)));
            }
            if (i20 < g0.L(180.0f)) {
                i20 = g0.L(180.0f);
            }
            int i24 = i20;
            String str6 = tL_messageMediaGiveaway2.prize_description;
            if (str6 != null && !str6.isEmpty()) {
                StaticLayout c2 = lu0.c(i6.m(g0.X2(bd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false, null, 0), this.E, i24, Layout.Alignment.ALIGN_CENTER, g0.L(2.0f), TextUtils.TruncateAt.END, i24, 20, true);
                this.f444x = c2;
                this.f434m = g0.L(22.0f) + c2.getLineBottom(c2.getLineCount() - 1);
                String M0 = bd.M0(2131753406, null);
                this.f436o = M0;
                this.f435n = this.F.measureText(M0, 0, M0.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i25 = 0;
                while (i25 < size5) {
                    String str7 = arrayList6.get(i25);
                    i25++;
                    String str8 = str7;
                    String displayCountry = new Locale("", str8).getDisplayCountry(Locale.getDefault());
                    String F0 = bd.F0(str8);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (F0 != null) {
                        spannableStringBuilder5.append((CharSequence) F0).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = lu0.c(i6.m(g0.X2(bd.a0("BoostingGiveAwayFromCountries", null, 2131753493, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false, null, 0), this.H, i24, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i24, 10, true);
                }
            }
            int max = Math.max(i10, Math.min(g0.L(38.0f) + i24, i19));
            this.v = max - i19;
            float f14 = max;
            float f15 = L2;
            float f16 = f15 / 2.0f;
            this.d.y0((f14 / 2.0f) - f16, g0.L(42.0f) - f16, f15, f15);
            int L3 = g0.L(5.0f) + this.f443w.getLineBottom(staticLayout.getLineCount() - 1);
            this.f437p = L3;
            this.f438q = this.f445y.getLineBottom(staticLayout2.getLineCount() - 1) + L3 + this.f434m;
            this.f439r = this.f446z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            if (staticLayout4 != null) {
                i11 = staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + g0.L(f10);
            } else {
                i11 = 0;
            }
            this.f440s = i11;
            int i26 = this.f432k + this.f438q + i11 + this.f439r;
            this.f432k = i26;
            this.f432k = g0.L(128.0f) + i26;
            this.f433l = max;
            if (this.U) {
                if (this.f441t == null) {
                    this.f441t = p1.g(t0.f25457b, 2131231124);
                }
                this.f442u = bd.E((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f441t = null;
                this.f442u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str9 = this.f442u;
            textPaint3.getTextBounds(str9, 0, str9.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f431j, false);
            this.f432k = g0.L(30.0f) + this.f432k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i27 = 0;
            while (i27 < size6) {
                Long l11 = arrayList8.get(i27);
                i27++;
                Long l12 = l11;
                if (hp.s1(h10.f22829t0).M0(l12) != null) {
                    arrayList7.add(l12);
                }
            }
            float f17 = 0.0f;
            for (int i28 = 0; i28 < arrayList7.size(); i28++) {
                Long l13 = (Long) arrayList7.get(i28);
                long longValue2 = l13.longValue();
                TLRPC.Chat M02 = hp.s1(h10.f22829t0).M0(l13);
                if (M02 != null) {
                    this.f431j[i28] = true;
                    this.f428f[i28] = M02;
                    this.f427e[i28] = TextUtils.ellipsize(i6.m(M02.title, this.D.getFontMetricsInt(), false, null, 0), this.D, 0.8f * f14, TextUtils.TruncateAt.END);
                    float[] fArr = this.f429g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.f427e[i28];
                    fArr[i28] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.f429g[i28] + g0.L(40.0f);
                    f17 += L4;
                    if (i28 > 0) {
                        boolean[] zArr = this.h;
                        if (f17 > 0.9f * f14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zArr[i28] = z13;
                        if (z13) {
                            this.f432k = g0.L(30.0f) + this.f432k;
                            f17 = L4;
                        }
                    } else {
                        this.h[i28] = false;
                    }
                    this.f425b[i28].q(M02);
                    this.f424a[i28].i0(M02, this.f425b[i28], null);
                    this.f424a[i28].y0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    this.f428f[i28] = null;
                    this.f431j[i28] = false;
                    this.f427e[i28] = "";
                    this.h[i28] = false;
                    this.f429g[i28] = g0.L(20.0f);
                    this.f425b[i28].k(longValue2, "", "", null);
                }
            }
        }
    }
}

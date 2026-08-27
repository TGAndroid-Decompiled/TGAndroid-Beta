package fg;

import ag.n0;
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
import cg.h;
import cg.q0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.y8;

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
    public z S;
    public MessageObject T;
    public boolean U;

    public ImageReceiver[] f6053a;

    public y8[] f6054b;

    public final s1 f6055c;
    public ImageReceiver d;

    public CharSequence[] f6056e;

    public TLRPC.Chat[] f6057f;

    public float[] f6058g;
    public boolean[] h;

    public Rect[] f6059i;

    public boolean[] f6060j;

    public int f6063m;

    public float f6064n;

    public String f6065o;

    public int f6066p;

    public int f6067q;

    public int f6068r;

    public int f6069s;

    public Drawable f6070t;

    public String f6071u;
    public int v;

    public StaticLayout f6072w;

    public StaticLayout f6073x;

    public StaticLayout f6074y;

    public StaticLayout f6075z;

    public int f6061k = 0;

    public int f6062l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap map = new HashMap();
        Y = map;
        s3.c.m(1, map, "1⃣", 3, "2⃣");
        s3.c.m(6, map, "3⃣", 12, "4⃣");
        map.put(24, "5⃣");
    }

    public b(s1 s1Var) {
        this.f6055c = s1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f6059i;
                    if (i10 >= rectArr.length) {
                        if (!this.P.contains(x8, y10)) {
                            break;
                        }
                        this.X = true;
                        return true;
                    }
                    if (rectArr[i10].contains(x8, y10)) {
                        this.V = i10;
                        this.S.setHotspot(x8, y10);
                        this.W = true;
                        c(true);
                        return true;
                    }
                    i10++;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    s1 s1Var = this.f6055c;
                    if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().R(this.V, s1Var);
                    }
                    s1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    MessageObject messageObject2 = this.T;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        q0.d(messageObject2, new n0(messageObject2, 2), new h(0));
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

    public final void b(Canvas canvas, int i10, int i11, c6 c6Var) {
        float f10;
        boolean[] zArr;
        int color;
        int i12;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.T;
        if (messageObject == null || !messageObject.isGiveaway()) {
            return;
        }
        z zVar = this.S;
        s1 s1Var = this.f6055c;
        int i13 = 0;
        if (zVar == null) {
            int iW0 = g6.w0(null, g6.f23144i6, false);
            this.R = iW0;
            z zVarY = g6.Y(iW0, 12, 12);
            this.S = zVarY;
            zVarY.setCallback(s1Var);
        }
        this.E.setColor(g6.f23247o2.getColor());
        this.F.setColor(g6.l1(0.45f, g6.f23247o2.getColor()));
        this.G.setColor(g6.l1(0.15f, g6.f23247o2.getColor()));
        this.H.setColor(g6.f23247o2.getColor());
        if (this.T.isOutOwner()) {
            TextPaint textPaint = this.D;
            int i14 = g6.Xa;
            textPaint.setColor(g6.v0(i14, c6Var));
            this.I.setColor(g6.v0(i14, c6Var));
            this.J.setColor(g6.v0(g6.f23003ab, c6Var));
        } else {
            TextPaint textPaint2 = this.D;
            int i15 = g6.Kc;
            textPaint2.setColor(g6.v0(i15, c6Var));
            this.I.setColor(g6.v0(i15, c6Var));
            this.J.setColor(g6.v0(g6.Uc, c6Var));
        }
        if (this.U) {
            this.I.setColor(g6.v0(g6.fk, c6Var));
        }
        canvas2.save();
        int iDp = i11 - AndroidUtilities.dp(4.0f);
        canvas2.translate(iDp, i10);
        this.P.set(iDp, i10, this.f6062l + iDp, this.f6061k + i10);
        canvas2.saveLayer(0.0f, 0.0f, this.f6062l, this.f6061k, this.K, 31);
        this.d.draw(canvas2);
        float f11 = this.f6062l / 2.0f;
        float fDp = AndroidUtilities.dp(106.0f);
        int iDp2 = AndroidUtilities.dp(12.0f) + this.O.width();
        int iDp3 = AndroidUtilities.dp(10.0f) + this.O.height();
        this.M.set(f11 - ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f), fDp - ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f), ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f) + f11, ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f) + fDp);
        canvas2.drawRoundRect(this.M, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.L);
        float f12 = iDp2 / 2.0f;
        float f13 = iDp3 / 2.0f;
        this.M.set(f11 - f12, fDp - f13, f11 + f12, fDp + f13);
        canvas2.drawRoundRect(this.M, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.I);
        Drawable drawable = this.f6070t;
        if (drawable != null) {
            drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.M.left), AndroidUtilities.dp(6.96f) + ((int) this.M.centerY()));
            this.f6070t.draw(canvas2);
        }
        canvas2.drawText(this.f6071u, this.M.centerX() + AndroidUtilities.dp(this.U ? 8.0f : 0.0f), this.M.centerY() + AndroidUtilities.dp(4.0f), this.U ? this.C : this.B);
        canvas2.restore();
        canvas2.translate(0.0f, AndroidUtilities.dp(128.0f));
        int iDp4 = AndroidUtilities.dp(128.0f) + i10;
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.f6072w.draw(canvas2);
        canvas2.translate(0.0f, this.f6066p);
        if (this.f6073x != null) {
            canvas2.restore();
            canvas2.save();
            float fDp2 = (this.f6066p + this.f6063m) - AndroidUtilities.dp(6.0f);
            float f14 = this.f6062l / 2.0f;
            canvas2.drawText(this.f6065o, f14, fDp2, this.F);
            f10 = 16.0f;
            canvas2.drawLine(AndroidUtilities.dp(17.0f), fDp2 - AndroidUtilities.dp(4.0f), (f14 - (this.f6064n / 2.0f)) - AndroidUtilities.dp(6.0f), fDp2 - AndroidUtilities.dp(4.0f), this.G);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(6.0f) + (this.f6064n / 2.0f) + f14, fDp2 - AndroidUtilities.dp(4.0f), this.f6062l - AndroidUtilities.dp(16.0f), fDp2 - AndroidUtilities.dp(4.0f), this.G);
            canvas2.translate((this.f6062l - this.f6073x.getWidth()) / 2.0f, this.f6066p);
            this.f6073x.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(this.v / 2.0f, this.f6063m + this.f6066p);
        } else {
            f10 = 16.0f;
        }
        this.f6074y.draw(canvas2);
        canvas2.restore();
        canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f6067q);
        int iC = y1.C(6.0f, this.f6067q, iDp4);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            boolean[] zArr2 = this.f6060j;
            if (i16 >= zArr2.length) {
                break;
            }
            if (zArr2[i16]) {
                canvas2.save();
                int i18 = i16;
                float fDp3 = 0.0f;
                do {
                    fDp3 += this.f6058g[i18] + AndroidUtilities.dp(40.0f);
                    i18++;
                    zArr = this.f6060j;
                    if (i18 >= zArr.length || this.h[i18]) {
                        break;
                    }
                } while (zArr[i18]);
                float f15 = f11 - (fDp3 / 2.0f);
                canvas2.translate(f15, 0.0f);
                int iWidth = ((int) f15) + iDp;
                int i19 = i16;
                while (true) {
                    TLRPC.Chat chat = this.f6057f[i19];
                    if (this.T.isOutOwner()) {
                        color = g6.v0(g6.Xa, c6Var);
                    } else {
                        int colorId = ChatObject.getColorId(chat);
                        if (colorId < 7) {
                            color = g6.v0(g6.f23303r8[colorId], c6Var);
                        } else {
                            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                            MessagesController.PeerColor color2 = peerColors == null ? null : peerColors.getColor(colorId);
                            color = color2 != null ? color2.getColor(i13, c6Var) : g6.v0(g6.f23303r8[i13], c6Var);
                        }
                    }
                    int i20 = this.V;
                    i12 = (i20 < 0 || i20 != i19) ? i17 : color;
                    this.D.setColor(color);
                    this.J.setColor(color);
                    this.J.setAlpha(25);
                    this.f6053a[i19].draw(canvas2);
                    CharSequence charSequence = this.f6056e[i19];
                    int i21 = iWidth;
                    canvas2.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f10), this.D);
                    this.N.set(0.0f, 0.0f, this.f6058g[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas2.drawRoundRect(this.N, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.J);
                    float f16 = i21;
                    this.f6059i[i19].set(i21, iC, (int) (this.N.width() + f16), AndroidUtilities.dp(24.0f) + iC);
                    canvas2.translate(this.N.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    iWidth = (int) (this.N.width() + AndroidUtilities.dp(6.0f) + f16);
                    i19++;
                    boolean[] zArr3 = this.f6060j;
                    if (i19 >= zArr3.length || this.h[i19] || !zArr3[i19]) {
                        break;
                    }
                    i17 = i12;
                    i13 = 0;
                }
                canvas2.restore();
                canvas2.translate(0.0f, AndroidUtilities.dp(30.0f));
                iC += AndroidUtilities.dp(30.0f);
                i16 = i19;
                i17 = i12;
            } else {
                i16++;
            }
            i13 = 0;
        }
        if (this.A != null) {
            canvas2.save();
            canvas2.translate((this.f6062l - this.A.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
            this.A.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, this.f6069s);
        }
        canvas2.translate(0.0f, AndroidUtilities.dp(6.0f));
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.f6075z.draw(canvas2);
        canvas2.restore();
        canvas2.restore();
        if (this.V >= 0) {
            int iL1 = g6.l1(g6.I.q() ? 0.12f : 0.1f, i17);
            if (this.R != iL1) {
                z zVar2 = this.S;
                this.R = iL1;
                g6.B1(zVar2, iL1, true);
            }
            this.S.setBounds(this.f6059i[this.V]);
            this.S.setCallback(s1Var);
        }
    }

    public final void c(boolean z10) {
        z zVar;
        MessageObject messageObject = this.T;
        if (messageObject == null || !messageObject.isGiveaway() || (zVar = this.S) == null) {
            return;
        }
        s1 s1Var = this.f6055c;
        if (!z10) {
            zVar.setState(StateSet.NOTHING);
            s1Var.invalidate();
        } else {
            zVar.setCallback(new a(this, 0));
            this.S.setState(this.Q);
            s1Var.invalidate();
        }
    }

    public final void d(int i10, int i11, MessageObject messageObject) {
        float f10;
        float f11;
        TLRPC.Document document;
        String str;
        this.T = null;
        this.f6072w = null;
        this.f6073x = null;
        this.f6074y = null;
        this.f6075z = null;
        this.A = null;
        this.f6061k = 0;
        this.f6062l = 0;
        this.f6063m = 0;
        this.f6064n = 0.0f;
        if (messageObject.isGiveaway()) {
            this.T = messageObject;
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
                this.f6056e = new CharSequence[10];
                this.f6057f = new TLRPC.Chat[10];
                this.f6058g = new float[10];
                this.h = new boolean[10];
                this.f6059i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f6055c);
                this.d = imageReceiver;
                imageReceiver.setAllowLoadingOnAttachedOnly(true);
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(AndroidUtilities.bold());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(AndroidUtilities.dp(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(AndroidUtilities.bold());
                this.C.setTextSize(AndroidUtilities.dp(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(AndroidUtilities.bold());
                this.D.setTextSize(AndroidUtilities.dp(13.0f));
                this.H.setTextSize(AndroidUtilities.dp(13.0f));
                this.E.setTextSize(AndroidUtilities.dp(14.0f));
                this.F.setTextSize(AndroidUtilities.dp(14.0f));
                this.F.setTextAlign(align);
            }
            if (this.f6053a == null) {
                this.f6053a = new ImageReceiver[10];
                this.f6054b = new y8[10];
                this.f6060j = new boolean[10];
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f6053a;
                    if (i12 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i12] = new ImageReceiver(this.f6055c);
                    this.f6053a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f6053a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f6054b[i12] = new y8((c6) null);
                    this.f6054b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f6059i[i12] = new Rect();
                    i12++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            String str2 = UserConfig.getInstance(UserConfig.selectedAccount).premiumGiftsStickerPack;
            if (str2 == null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).checkPremiumGiftStickers();
                f10 = 12.0f;
                f11 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByName(str2);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByEmojiOrName(str2);
                }
                if (stickerSetByName != null) {
                    String str3 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = stickerSetByName.packs;
                    int size = arrayList.size();
                    document = null;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            f10 = 12.0f;
                            f11 = 18.0f;
                            break;
                        }
                        TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i13);
                        i13++;
                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                        f10 = 12.0f;
                        if (Objects.equals(tL_stickerPack2.emoticon, str3)) {
                            ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                            int size2 = arrayList2.size();
                            int i14 = 0;
                            f11 = 18.0f;
                            while (true) {
                                if (i14 < size2) {
                                    Long l10 = arrayList2.get(i14);
                                    i14++;
                                    long jLongValue = l10.longValue();
                                    ArrayList<TLRPC.Document> arrayList3 = stickerSetByName.documents;
                                    int size3 = arrayList3.size();
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= size3) {
                                            str = str3;
                                            break;
                                        }
                                        TLRPC.Document document2 = arrayList3.get(i15);
                                        i15++;
                                        TLRPC.Document document3 = document2;
                                        ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                        str = str3;
                                        if (document3.f22386id == jLongValue) {
                                            document = document3;
                                            break;
                                        } else {
                                            str3 = str;
                                            arrayList3 = arrayList4;
                                        }
                                    }
                                    if (document != null) {
                                        break;
                                    } else {
                                        str3 = str;
                                    }
                                } else {
                                    str = str3;
                                }
                            }
                            if (document != null) {
                                break;
                            } else {
                                str3 = str;
                            }
                        } else {
                            str = str3;
                            f11 = 18.0f;
                        }
                        if (document != null) {
                            break;
                            break;
                        }
                        str3 = str;
                    }
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    f10 = 12.0f;
                    f11 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, g6.f23037c7, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.d.setImage(ImageLocation.getForDocument(document), "160_160_firstframe", svgThumb, "tgs", stickerSetByName, 1);
                } else {
                    MediaDataController.getInstance(UserConfig.selectedAccount).loadStickersByEmojiOrName(str2, false, stickerSetByName == null);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            this.U = (tL_messageMediaGiveaway2.flags & 32) != 0;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f6053a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f6053a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f6054b = (y8[]) Arrays.copyOf(this.f6054b, size4);
                this.f6060j = Arrays.copyOf(this.f6060j, size4);
                this.f6056e = (CharSequence[]) Arrays.copyOf(this.f6056e, size4);
                this.f6058g = Arrays.copyOf(this.f6058g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f6059i = (Rect[]) Arrays.copyOf(this.f6059i, size4);
                this.f6057f = (TLRPC.Chat[]) Arrays.copyOf(this.f6057f, size4);
                for (int i16 = length - 1; i16 < size4; i16++) {
                    this.f6053a[i16] = new ImageReceiver(this.f6055c);
                    this.f6053a[i16].setAllowLoadingOnAttachedOnly(true);
                    this.f6053a[i16].setRoundRadius(AndroidUtilities.dp(f10));
                    this.f6054b[i16] = new y8((c6) null);
                    this.f6054b[i16].u(AndroidUtilities.dp(f11));
                    this.f6059i[i16] = new Rect();
                }
            }
            int iDp = AndroidUtilities.dp(148.0f);
            int minTabletSide = AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(80.0f) : i10 - AndroidUtilities.dp(80.0f);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            boolean zIsForwarded = messageObject.isForwarded();
            TLRPC.Message message = messageObject.messageOwner;
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-MessageObject.getPeerId(zIsForwarded ? message.fwd_from.from_id : message.peer_id))));
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiveawayPrizes));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderReplaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilderReplaceTags.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway2.months, new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayMsgParticipants", R.string.BoostingGiveawayMsgParticipants));
            spannableStringBuilder3.append((CharSequence) spannableStringBuilderReplaceTags2);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, spannableStringBuilderReplaceTags2.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingGiveawayMsgNewSubsPlural" : "BoostingGiveawayMsgNewSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            } else {
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingGiveawayMsgAllSubsPlural" : "BoostingGiveawayMsgAllSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            }
            SpannableStringBuilder spannableStringBuilderReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingWinnersDate", R.string.BoostingWinnersDate));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilderReplaceTags3);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilderReplaceTags3.length(), 33);
            Date date = new Date(((long) tL_messageMediaGiveaway2.until_date) * 1000);
            String str4 = LocaleController.getInstance().getFormatterGiveawayCard().format(date);
            String str5 = LocaleController.getInstance().getFormatterDay().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, str4, str5));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float fDp = AndroidUtilities.dp(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f6072w = tv0.c(spannableStringBuilder, textPaint2, minTabletSide, alignment, fDp, false, truncateAt, minTabletSide, 10, true);
            this.f6074y = tv0.c(spannableStringBuilder3, this.E, minTabletSide, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, minTabletSide, 10, true);
            this.f6075z = tv0.c(spannableStringBuilder4, this.E, minTabletSide, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, minTabletSide, 10, true);
            int iDp2 = 0;
            for (int i17 = 0; i17 < this.f6072w.getLineCount(); i17++) {
                iDp2 = (int) Math.max(iDp2, Math.ceil(this.f6072w.getLineWidth(i17)));
            }
            for (int i18 = 0; i18 < this.f6074y.getLineCount(); i18++) {
                iDp2 = (int) Math.max(iDp2, Math.ceil(this.f6074y.getLineWidth(i18)));
            }
            for (int i19 = 0; i19 < this.f6075z.getLineCount(); i19++) {
                iDp2 = (int) Math.max(iDp2, Math.ceil(this.f6075z.getLineWidth(i19)));
            }
            if (iDp2 < AndroidUtilities.dp(180.0f)) {
                iDp2 = AndroidUtilities.dp(180.0f);
            }
            int i20 = iDp2;
            String str6 = tL_messageMediaGiveaway2.prize_description;
            if (str6 != null && !str6.isEmpty()) {
                StaticLayout staticLayoutC = tv0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.quantity, tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false), this.E, i20, Layout.Alignment.ALIGN_CENTER, AndroidUtilities.dp(2.0f), false, TextUtils.TruncateAt.END, i20, 20, true);
                this.f6073x = staticLayoutC;
                this.f6063m = AndroidUtilities.dp(22.0f) + staticLayoutC.getLineBottom(staticLayoutC.getLineCount() - 1);
                String string = LocaleController.getString(R.string.BoostingGiveawayMsgWithDivider);
                this.f6065o = string;
                this.f6064n = this.F.measureText(string, 0, string.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i21 = 0;
                while (i21 < size5) {
                    String str7 = arrayList6.get(i21);
                    i21++;
                    String str8 = str7;
                    String displayCountry = new Locale("", str8).getDisplayCountry(Locale.getDefault());
                    String languageFlag = LocaleController.getLanguageFlag(str8);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (languageFlag != null) {
                        spannableStringBuilder5.append((CharSequence) languageFlag).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = tv0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveAwayFromCountries", R.string.BoostingGiveAwayFromCountries, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false), this.H, i20, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i20, 10, true);
                }
            }
            int iMax = Math.max(i11, Math.min(AndroidUtilities.dp(38.0f) + i20, minTabletSide));
            this.v = iMax - minTabletSide;
            float f12 = iMax;
            float f13 = iDp;
            float f14 = f13 / 2.0f;
            this.d.setImageCoords((f12 / 2.0f) - f14, AndroidUtilities.dp(42.0f) - f14, f13, f13);
            StaticLayout staticLayout = this.f6072w;
            int iDp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f6066p = iDp3;
            int i22 = iDp3 + this.f6063m;
            StaticLayout staticLayout2 = this.f6074y;
            this.f6067q = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + i22;
            StaticLayout staticLayout3 = this.f6075z;
            this.f6068r = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            int lineBottom = staticLayout4 != null ? staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(f10) : 0;
            this.f6069s = lineBottom;
            int i23 = this.f6061k + this.f6067q + lineBottom + this.f6068r;
            this.f6061k = i23;
            this.f6061k = AndroidUtilities.dp(128.0f) + i23;
            this.f6062l = iMax;
            if (this.U) {
                if (this.f6070t == null) {
                    this.f6070t = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f6071u = LocaleController.formatNumber((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f6070t = null;
                this.f6071u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str9 = this.f6071u;
            textPaint3.getTextBounds(str9, 0, str9.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f6060j, false);
            this.f6061k = AndroidUtilities.dp(30.0f) + this.f6061k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i24 = 0;
            while (i24 < size6) {
                Long l11 = arrayList8.get(i24);
                i24++;
                Long l12 = l11;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getChat(l12) != null) {
                    arrayList7.add(l12);
                }
            }
            float f15 = 0.0f;
            for (int i25 = 0; i25 < arrayList7.size(); i25++) {
                Long l13 = (Long) arrayList7.get(i25);
                long jLongValue2 = l13.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(l13);
                if (chat != null) {
                    this.f6060j[i25] = true;
                    this.f6057f[i25] = chat;
                    this.f6056e[i25] = TextUtils.ellipsize(Emoji.replaceEmoji(chat.title, this.D.getFontMetricsInt(), false), this.D, 0.8f * f12, TextUtils.TruncateAt.END);
                    float[] fArr = this.f6058g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.f6056e[i25];
                    fArr[i25] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float fDp2 = this.f6058g[i25] + AndroidUtilities.dp(40.0f);
                    f15 += fDp2;
                    if (i25 > 0) {
                        boolean[] zArr = this.h;
                        boolean z10 = f15 > 0.9f * f12;
                        zArr[i25] = z10;
                        if (z10) {
                            this.f6061k = AndroidUtilities.dp(30.0f) + this.f6061k;
                            f15 = fDp2;
                        }
                    } else {
                        this.h[i25] = false;
                    }
                    this.f6054b[i25].q(chat);
                    this.f6053a[i25].setForUserOrChat(chat, this.f6054b[i25]);
                    this.f6053a[i25].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.f6057f[i25] = null;
                    this.f6060j[i25] = false;
                    this.f6056e[i25] = "";
                    this.h[i25] = false;
                    this.f6058g[i25] = AndroidUtilities.dp(20.0f);
                    this.f6054b[i25].n(jLongValue2, "", "");
                }
            }
        }
    }
}

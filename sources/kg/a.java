package kg;

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
import dg.h0;
import hg.h;
import hg.p0;
import i.f;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.z8;
public final class a {
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
    public ImageReceiver[] f11184a;
    public z8[] f11185b;
    public final t1 f11186c;
    public ImageReceiver d;
    public CharSequence[] f11187e;
    public TLRPC.Chat[] f11188f;
    public float[] f11189g;
    public boolean[] h;
    public Rect[] f11190i;
    public boolean[] f11191j;
    public int f11194m;
    public float f11195n;
    public String f11196o;
    public int f11197p;
    public int f11198q;
    public int f11199r;
    public int f11200s;
    public Drawable f11201t;
    public String f11202u;
    public int v;
    public StaticLayout f11203w;
    public StaticLayout f11204x;
    public StaticLayout f11205y;
    public StaticLayout f11206z;
    public int f11192k = 0;
    public int f11193l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        w.c.l(1, hashMap, "1⃣", 3, "2⃣");
        w.c.l(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(t1 t1Var) {
        this.f11186c = t1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f11190i;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y10)) {
                            this.V = i10;
                            this.S.setHotspot(x10, y10);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.P.contains(x10, y10)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    t1 t1Var = this.f11186c;
                    if (t1Var.getDelegate() != null) {
                        t1Var.getDelegate().L(this.V, t1Var);
                    }
                    t1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    MessageObject messageObject2 = this.T;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        p0.d(messageObject2, new h0(messageObject2, 7), new h(0));
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

    public final void b(Canvas canvas, int i10, int i11, g6 g6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        MessagesController.PeerColor color;
        int v02;
        int i12;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            z zVar = this.S;
            t1 t1Var = this.f11186c;
            int i13 = 0;
            if (zVar == null) {
                int w02 = k6.w0(null, k6.f21752i6, false);
                this.R = w02;
                z Y2 = k6.Y(w02, 12, 12);
                this.S = Y2;
                Y2.setCallback(t1Var);
            }
            this.E.setColor(k6.f21855o2.getColor());
            this.F.setColor(k6.l1(0.45f, k6.f21855o2.getColor()));
            this.G.setColor(k6.l1(0.15f, k6.f21855o2.getColor()));
            this.H.setColor(k6.f21855o2.getColor());
            if (this.T.isOutOwner()) {
                TextPaint textPaint2 = this.D;
                int i14 = k6.Xa;
                textPaint2.setColor(k6.v0(i14, g6Var));
                this.I.setColor(k6.v0(i14, g6Var));
                this.J.setColor(k6.v0(k6.f21611ab, g6Var));
            } else {
                TextPaint textPaint3 = this.D;
                int i15 = k6.Kc;
                textPaint3.setColor(k6.v0(i15, g6Var));
                this.I.setColor(k6.v0(i15, g6Var));
                this.J.setColor(k6.v0(k6.Uc, g6Var));
            }
            if (this.U) {
                this.I.setColor(k6.v0(k6.fk, g6Var));
            }
            canvas2.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            canvas2.translate(dp, i10);
            this.P.set(dp, i10, this.f11193l + dp, this.f11192k + i10);
            canvas2.saveLayer(0.0f, 0.0f, this.f11193l, this.f11192k, this.K, 31);
            this.d.draw(canvas2);
            float f13 = this.f11193l / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.O.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.O.height();
            this.M.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.L);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.M.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.I);
            Drawable drawable = this.f11201t;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.M.left), AndroidUtilities.dp(6.96f) + ((int) this.M.centerY()));
                this.f11201t.draw(canvas2);
            }
            String str = this.f11202u;
            float centerX = this.M.centerX();
            if (this.U) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f10);
            float centerY = this.M.centerY() + AndroidUtilities.dp(4.0f);
            if (this.U) {
                textPaint = this.C;
            } else {
                textPaint = this.B;
            }
            canvas2.drawText(str, dp5, centerY, textPaint);
            canvas2.restore();
            canvas2.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f11203w.draw(canvas2);
            canvas2.translate(0.0f, this.f11197p);
            if (this.f11204x != null) {
                canvas2.restore();
                canvas2.save();
                float dp7 = (this.f11197p + this.f11194m) - AndroidUtilities.dp(6.0f);
                float f16 = this.f11193l / 2.0f;
                canvas2.drawText(this.f11196o, f16, dp7, this.F);
                f11 = 16.0f;
                canvas2.drawLine(AndroidUtilities.dp(17.0f), dp7 - AndroidUtilities.dp(4.0f), (f16 - (this.f11195n / 2.0f)) - AndroidUtilities.dp(6.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(AndroidUtilities.dp(6.0f) + (this.f11195n / 2.0f) + f16, dp7 - AndroidUtilities.dp(4.0f), this.f11193l - AndroidUtilities.dp(16.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2.translate((this.f11193l - this.f11204x.getWidth()) / 2.0f, this.f11197p);
                this.f11204x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.f11194m + this.f11197p);
            } else {
                f11 = 16.0f;
            }
            this.f11205y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f11198q);
            int C = y3.C(6.0f, this.f11198q, dp6);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                boolean[] zArr = this.f11191j;
                if (i16 >= zArr.length) {
                    break;
                }
                if (zArr[i16]) {
                    canvas2.save();
                    int i18 = i16;
                    float f17 = 0.0f;
                    while (true) {
                        f17 += this.f11189g[i18] + AndroidUtilities.dp(40.0f);
                        i18++;
                        boolean[] zArr2 = this.f11191j;
                        if (i18 >= zArr2.length || this.h[i18] || !zArr2[i18]) {
                            break;
                        }
                    }
                    float f18 = f13 - (f17 / 2.0f);
                    canvas2.translate(f18, 0.0f);
                    int i19 = ((int) f18) + dp;
                    int i20 = i16;
                    while (true) {
                        TLRPC.Chat chat = this.f11188f[i20];
                        if (this.T.isOutOwner()) {
                            v02 = k6.v0(k6.Xa, g6Var);
                        } else {
                            int colorId = ChatObject.getColorId(chat);
                            if (colorId < 7) {
                                v02 = k6.v0(k6.f21916r8[colorId], g6Var);
                            } else {
                                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                                if (peerColors == null) {
                                    color = null;
                                } else {
                                    color = peerColors.getColor(colorId);
                                }
                                if (color != null) {
                                    v02 = color.getColor(i13, g6Var);
                                } else {
                                    v02 = k6.v0(k6.f21916r8[i13], g6Var);
                                }
                            }
                        }
                        int i21 = this.V;
                        if (i21 >= 0 && i21 == i20) {
                            i12 = v02;
                        } else {
                            i12 = i17;
                        }
                        this.D.setColor(v02);
                        this.J.setColor(v02);
                        this.J.setAlpha(25);
                        this.f11184a[i20].draw(canvas2);
                        CharSequence charSequence = this.f11187e[i20];
                        int i22 = i19;
                        canvas2.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f11), this.D);
                        this.N.set(0.0f, 0.0f, this.f11189g[i20] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas2.drawRoundRect(this.N, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.J);
                        float f19 = i22;
                        this.f11190i[i20].set(i22, C, (int) (this.N.width() + f19), AndroidUtilities.dp(24.0f) + C);
                        canvas2.translate(this.N.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i19 = (int) (this.N.width() + AndroidUtilities.dp(6.0f) + f19);
                        i20++;
                        boolean[] zArr3 = this.f11191j;
                        if (i20 >= zArr3.length || this.h[i20] || !zArr3[i20]) {
                            break;
                        }
                        i17 = i12;
                        i13 = 0;
                    }
                    canvas2.restore();
                    canvas2.translate(0.0f, AndroidUtilities.dp(30.0f));
                    C += AndroidUtilities.dp(30.0f);
                    i16 = i20;
                    i17 = i12;
                } else {
                    i16++;
                }
                i13 = 0;
            }
            if (this.A != null) {
                canvas2.save();
                canvas2.translate((this.f11193l - this.A.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.f11200s);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f11206z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (k6.I.q()) {
                    f12 = 0.12f;
                } else {
                    f12 = 0.1f;
                }
                int l1 = k6.l1(f12, i17);
                if (this.R != l1) {
                    z zVar2 = this.S;
                    this.R = l1;
                    k6.B1(zVar2, l1, true);
                }
                this.S.setBounds(this.f11190i[this.V]);
                this.S.setCallback(t1Var);
            }
        }
    }

    public final void c(boolean z4) {
        z zVar;
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway() && (zVar = this.S) != null) {
            t1 t1Var = this.f11186c;
            if (z4) {
                zVar.setCallback(new f(this, 2));
                this.S.setState(this.Q);
                t1Var.invalidate();
                return;
            }
            zVar.setState(StateSet.NOTHING);
            t1Var.invalidate();
        }
    }

    public final void d(int i10, int i11, MessageObject messageObject) {
        float f10;
        float f11;
        TLRPC.Document document;
        boolean z4;
        String str;
        boolean z10;
        int dp;
        TLRPC.Peer peer;
        String str2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int i12;
        boolean z11;
        String str3;
        this.T = null;
        this.f11203w = null;
        this.f11204x = null;
        this.f11205y = null;
        this.f11206z = null;
        this.A = null;
        this.f11192k = 0;
        this.f11193l = 0;
        this.f11194m = 0;
        this.f11195n = 0.0f;
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
                this.f11187e = new CharSequence[10];
                this.f11188f = new TLRPC.Chat[10];
                this.f11189g = new float[10];
                this.h = new boolean[10];
                this.f11190i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f11186c);
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
            if (this.f11184a == null) {
                this.f11184a = new ImageReceiver[10];
                this.f11185b = new z8[10];
                this.f11191j = new boolean[10];
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f11184a;
                    if (i13 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i13] = new ImageReceiver(this.f11186c);
                    this.f11184a[i13].setAllowLoadingOnAttachedOnly(true);
                    this.f11184a[i13].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f11185b[i13] = new z8((g6) null);
                    this.f11185b[i13].u(AndroidUtilities.dp(18.0f));
                    this.f11190i[i13] = new Rect();
                    i13++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            String str4 = UserConfig.getInstance(UserConfig.selectedAccount).premiumGiftsStickerPack;
            if (str4 == null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).checkPremiumGiftStickers();
                f10 = 12.0f;
                f11 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByName(str4);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByEmojiOrName(str4);
                }
                if (stickerSetByName != null) {
                    String str5 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = stickerSetByName.packs;
                    int size = arrayList.size();
                    document = null;
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i14);
                            i14++;
                            TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                            f10 = 12.0f;
                            if (Objects.equals(tL_stickerPack2.emoticon, str5)) {
                                ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                                int size2 = arrayList2.size();
                                int i15 = 0;
                                f11 = 18.0f;
                                while (i15 < size2) {
                                    Long l10 = arrayList2.get(i15);
                                    i15++;
                                    long longValue = l10.longValue();
                                    ArrayList<TLRPC.Document> arrayList3 = stickerSetByName.documents;
                                    int size3 = arrayList3.size();
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < size3) {
                                            TLRPC.Document document2 = arrayList3.get(i16);
                                            i16++;
                                            TLRPC.Document document3 = document2;
                                            ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                            str = str5;
                                            if (document3.f20851id == longValue) {
                                                document = document3;
                                                break;
                                            } else {
                                                str5 = str;
                                                arrayList3 = arrayList4;
                                            }
                                        } else {
                                            str = str5;
                                            break;
                                        }
                                    }
                                    if (document != null) {
                                        break;
                                    }
                                    str5 = str;
                                }
                                str = str5;
                            } else {
                                str = str5;
                                f11 = 18.0f;
                            }
                            if (document != null) {
                                break;
                            }
                            str5 = str;
                        } else {
                            f10 = 12.0f;
                            f11 = 18.0f;
                            break;
                        }
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, k6.f21644c7, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.d.setImage(ImageLocation.getForDocument(document), "160_160_firstframe", svgThumb, "tgs", stickerSetByName, 1);
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                    MediaDataController mediaDataController = MediaDataController.getInstance(UserConfig.selectedAccount);
                    if (tL_messages_stickerSet == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    mediaDataController.loadStickersByEmojiOrName(str4, false, z4);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            if ((tL_messageMediaGiveaway2.flags & 32) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.U = z10;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f11184a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f11184a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f11185b = (z8[]) Arrays.copyOf(this.f11185b, size4);
                this.f11191j = Arrays.copyOf(this.f11191j, size4);
                this.f11187e = (CharSequence[]) Arrays.copyOf(this.f11187e, size4);
                this.f11189g = Arrays.copyOf(this.f11189g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f11190i = (Rect[]) Arrays.copyOf(this.f11190i, size4);
                this.f11188f = (TLRPC.Chat[]) Arrays.copyOf(this.f11188f, size4);
                for (int i17 = length - 1; i17 < size4; i17++) {
                    this.f11184a[i17] = new ImageReceiver(this.f11186c);
                    this.f11184a[i17].setAllowLoadingOnAttachedOnly(true);
                    this.f11184a[i17].setRoundRadius(AndroidUtilities.dp(f10));
                    this.f11185b[i17] = new z8((g6) null);
                    this.f11185b[i17].u(AndroidUtilities.dp(f11));
                    this.f11190i[i17] = new Rect();
                }
            }
            int dp2 = AndroidUtilities.dp(148.0f);
            if (AndroidUtilities.isTablet()) {
                dp = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(80.0f);
            } else {
                dp = i10 - AndroidUtilities.dp(80.0f);
            }
            int i18 = dp;
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            boolean isForwarded = messageObject.isForwarded();
            TLRPC.Message message = messageObject.messageOwner;
            if (isForwarded) {
                peer = message.fwd_from.from_id;
            } else {
                peer = message.peer_id;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-MessageObject.getPeerId(peer))));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiveawayPrizes));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
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
            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayMsgParticipants", R.string.BoostingGiveawayMsgParticipants));
            spannableStringBuilder3.append((CharSequence) replaceTags2);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, replaceTags2.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                if (isChannelAndNotMegaGroup) {
                    str3 = "BoostingGiveawayMsgNewSubsPlural";
                } else {
                    str3 = "BoostingGiveawayMsgNewSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(str3, tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            } else {
                if (isChannelAndNotMegaGroup) {
                    str2 = "BoostingGiveawayMsgAllSubsPlural";
                } else {
                    str2 = "BoostingGiveawayMsgAllSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(str2, tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            }
            SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingWinnersDate", R.string.BoostingWinnersDate));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceTags3);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags3.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = LocaleController.getInstance().getFormatterGiveawayCard().format(date);
            String format2 = LocaleController.getInstance().getFormatterDay().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f11203w = kw0.c(spannableStringBuilder, textPaint2, i18, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, i18, 10, true);
            this.f11205y = kw0.c(spannableStringBuilder3, this.E, i18, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, i18, 10, true);
            this.f11206z = kw0.c(spannableStringBuilder4, this.E, i18, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, i18, 10, true);
            int i19 = 0;
            for (int i20 = 0; i20 < this.f11203w.getLineCount(); i20++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f11203w.getLineWidth(i20)));
            }
            for (int i21 = 0; i21 < this.f11205y.getLineCount(); i21++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f11205y.getLineWidth(i21)));
            }
            for (int i22 = 0; i22 < this.f11206z.getLineCount(); i22++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f11206z.getLineWidth(i22)));
            }
            if (i19 < AndroidUtilities.dp(180.0f)) {
                i19 = AndroidUtilities.dp(180.0f);
            }
            int i23 = i19;
            String str6 = tL_messageMediaGiveaway2.prize_description;
            if (str6 != null && !str6.isEmpty()) {
                StaticLayout c3 = kw0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.quantity, tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false), this.E, i23, Layout.Alignment.ALIGN_CENTER, AndroidUtilities.dp(2.0f), false, TextUtils.TruncateAt.END, i23, 20, true);
                this.f11204x = c3;
                this.f11194m = AndroidUtilities.dp(22.0f) + c3.getLineBottom(c3.getLineCount() - 1);
                String string = LocaleController.getString(R.string.BoostingGiveawayMsgWithDivider);
                this.f11196o = string;
                this.f11195n = this.F.measureText(string, 0, string.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i24 = 0;
                while (i24 < size5) {
                    String str7 = arrayList6.get(i24);
                    i24++;
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
                    this.A = kw0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveAwayFromCountries", R.string.BoostingGiveAwayFromCountries, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false), this.H, i23, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i23, 10, true);
                }
            }
            int max = Math.max(i11, Math.min(AndroidUtilities.dp(38.0f) + i23, i18));
            this.v = max - i18;
            float f12 = max;
            float f13 = dp2;
            float f14 = f13 / 2.0f;
            this.d.setImageCoords((f12 / 2.0f) - f14, AndroidUtilities.dp(42.0f) - f14, f13, f13);
            int dp3 = AndroidUtilities.dp(5.0f) + this.f11203w.getLineBottom(staticLayout.getLineCount() - 1);
            this.f11197p = dp3;
            this.f11198q = this.f11205y.getLineBottom(staticLayout2.getLineCount() - 1) + dp3 + this.f11194m;
            this.f11199r = this.f11206z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            if (staticLayout4 != null) {
                i12 = staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(f10);
            } else {
                i12 = 0;
            }
            this.f11200s = i12;
            int i25 = this.f11192k + this.f11198q + i12 + this.f11199r;
            this.f11192k = i25;
            this.f11192k = AndroidUtilities.dp(128.0f) + i25;
            this.f11193l = max;
            if (this.U) {
                if (this.f11201t == null) {
                    this.f11201t = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f11202u = LocaleController.formatNumber((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f11201t = null;
                this.f11202u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str9 = this.f11202u;
            textPaint3.getTextBounds(str9, 0, str9.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f11191j, false);
            this.f11192k = AndroidUtilities.dp(30.0f) + this.f11192k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i26 = 0;
            while (i26 < size6) {
                Long l11 = arrayList8.get(i26);
                i26++;
                Long l12 = l11;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getChat(l12) != null) {
                    arrayList7.add(l12);
                }
            }
            float f15 = 0.0f;
            for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                Long l13 = (Long) arrayList7.get(i27);
                long longValue2 = l13.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(l13);
                if (chat != null) {
                    this.f11191j[i27] = true;
                    this.f11188f[i27] = chat;
                    this.f11187e[i27] = TextUtils.ellipsize(Emoji.replaceEmoji(chat.title, this.D.getFontMetricsInt(), false), this.D, 0.8f * f12, TextUtils.TruncateAt.END);
                    float[] fArr = this.f11189g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.f11187e[i27];
                    fArr[i27] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.f11189g[i27] + AndroidUtilities.dp(40.0f);
                    f15 += dp4;
                    if (i27 > 0) {
                        boolean[] zArr = this.h;
                        if (f15 > 0.9f * f12) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i27] = z11;
                        if (z11) {
                            this.f11192k = AndroidUtilities.dp(30.0f) + this.f11192k;
                            f15 = dp4;
                        }
                    } else {
                        this.h[i27] = false;
                    }
                    this.f11185b[i27].q(chat);
                    this.f11184a[i27].setForUserOrChat(chat, this.f11185b[i27]);
                    this.f11184a[i27].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.f11188f[i27] = null;
                    this.f11191j[i27] = false;
                    this.f11187e[i27] = "";
                    this.h[i27] = false;
                    this.f11189g[i27] = AndroidUtilities.dp(20.0f);
                    this.f11185b[i27].n(longValue2, "", "");
                }
            }
        }
    }
}

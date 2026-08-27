package ig;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import hh.f1;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.j51;
import org.telegram.ui.rn;

public final class m0 {
    public static m0 B;
    public static m0 C;
    public static int D;
    public static long E;
    public boolean A;

    public final int f11351a;

    public final k0 f11352b;

    public final k0 f11353c;
    public final k0 d;

    public final FrameLayout f11354e;

    public final m0 f11355f;

    public float f11356g;
    public float h;

    public final j0 f11357i;

    public WindowManager f11359k;

    public boolean f11360l;

    public float f11361m;

    public final int f11362n;

    public final long f11363o;

    public final q0 f11364p;

    public float f11365q;

    public float f11366r;

    public boolean f11367s;

    public final uj0 f11368t;

    public boolean f11369u;
    public final View v;

    public boolean f11370w;

    public long f11372y;

    public boolean f11373z;

    public final int[] f11358j = new int[2];

    public final ArrayList f11371x = new ArrayList();

    public m0(Context context, n2 n2Var, wj0 wj0Var, View view, View view2, float f10, float f11, q0 q0Var, int i10, int i11, boolean z10) {
        MessageObject messageObject;
        Context context2;
        View view3;
        wj0 wj0Var2;
        int i12;
        View view4;
        n2 n2Var2;
        rn rnVar;
        float f12;
        float f13;
        float f14;
        int i13;
        float imageHeight;
        int iRound;
        int iDp;
        float f15;
        int iE;
        int i14;
        int i15;
        FrameLayout frameLayout;
        j0 j0Var;
        MessageObject messageObject2;
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i16;
        k5 k5Var;
        k0 k0Var4;
        MessageObject messageObject3;
        int iV0;
        boolean z11;
        int i17;
        c6 resourceProvider;
        k5 k5Var2;
        int i18;
        int i19;
        int i20;
        TLRPC.Document document;
        boolean z12;
        float f16;
        rn rnVar2;
        l0 l0Var;
        float f17;
        float f18;
        int i21;
        float f19;
        float f20;
        float f21;
        float fD;
        float fD2;
        float f22;
        int i22;
        float f23;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.f11368t = null;
        this.f11373z = z10;
        boolean z13 = view instanceof s1;
        if (z13) {
            messageObject = ((s1) view).getMessageObject();
            this.f11362n = messageObject.getId();
            this.f11363o = messageObject.getGroupId();
        } else if (view instanceof v0) {
            messageObject = ((v0) view).getMessageObject();
            this.f11362n = messageObject.getId();
            this.f11363o = 0L;
        } else {
            this.f11362n = 0;
            this.f11363o = 0L;
            messageObject = null;
        }
        this.f11364p = q0Var;
        this.f11351a = i11;
        this.v = view;
        o0 o0VarL = z13 ? ((s1) view).J.l(q0Var) : view instanceof v0 ? ((v0) view).f25785y0.l(q0Var) : null;
        if (z10 && i11 == 2) {
            view3 = view2;
            wj0Var2 = wj0Var;
            view4 = view;
            n2Var2 = n2Var;
            m0 m0Var = new m0(context, n2Var2, wj0Var2, view4, view3, f10, f11, q0Var, i10, 1, true);
            context2 = context;
            i12 = i10;
            this.f11355f = m0Var;
            C = m0Var;
        } else {
            context2 = context;
            view3 = view2;
            wj0Var2 = wj0Var;
            i12 = i10;
            view4 = view;
            n2Var2 = n2Var;
        }
        rn rnVar3 = n2Var2 instanceof rn ? (rn) n2Var2 : null;
        if (wj0Var2 != null) {
            f1 f1Var = wj0Var2.f34236b;
            for (int i23 = 0; i23 < f1Var.getChildCount(); i23++) {
                if ((f1Var.getChildAt(i23) instanceof uj0) && ((uj0) f1Var.getChildAt(i23)).f33102e.equals(this.f11364p)) {
                    this.f11368t = (uj0) f1Var.getChildAt(i23);
                    break;
                }
            }
        }
        if (i11 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject == 0 || (tL_messageReactions = messageObject.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList == null || rnVar3 == null || rnVar3.a() >= r5) {
                rnVar = rnVar3;
                f12 = 0.0f;
            } else {
                f12 = 0.0f;
                int i24 = 0;
                while (i24 < arrayList.size()) {
                    if (this.f11364p.equals(arrayList.get(i24).reaction) && arrayList.get(i24).unread) {
                        y8 y8Var = new y8((c6) null);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        long peerId = MessageObject.getPeerId(arrayList.get(i24).peer_id);
                        if (peerId < 0) {
                            rnVar2 = rnVar3;
                            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                y8Var.k(i12, chat);
                                imageReceiver.setForUserOrChat(chat, y8Var);
                                l0Var = new l0();
                                l0Var.f11339a = imageReceiver;
                                f17 = 100.0f;
                                l0Var.f11342e = s3.c.c(pa.f(random, 100), 100.0f, 0.1f, 0.3f);
                                l0Var.h = s3.c.c(pa.f(random, 100), 100.0f, 0.4f, 0.8f);
                                l0Var.f11345i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                l0Var.f11340b = (int) s3.c.c(pa.f(random, 100), 100.0f, 200.0f, 400.0f);
                                f18 = 0.2f;
                                if (this.f11371x.isEmpty()) {
                                    l0Var.f11343f = a9.p.d(pa.f(random, 100), 0.6f, 100.0f, 0.2f);
                                    l0Var.f11344g = (pa.f(random, 100) * 0.4f) / 100.0f;
                                } else {
                                    i21 = 0;
                                    f19 = 0.0f;
                                    f20 = 0.0f;
                                    f21 = 0.0f;
                                    while (i21 < 10) {
                                        int i25 = i21;
                                        fD = a9.p.d(pa.f(random, 100), 0.6f, f17, f18);
                                        fD2 = a9.p.d(pa.f(random, 100), 0.4f, f17, f18);
                                        f22 = 2.1474836E9f;
                                        for (i22 = 0; i22 < this.f11371x.size(); i22++) {
                                            float f24 = ((l0) this.f11371x.get(i22)).f11343f - fD;
                                            float f25 = ((l0) this.f11371x.get(i22)).f11344g - fD2;
                                            f23 = (f25 * f25) + (f24 * f24);
                                            if (f23 < f22) {
                                                f22 = f23;
                                            }
                                        }
                                        if (f22 > f19) {
                                            f21 = fD2;
                                            f20 = fD;
                                            f19 = f22;
                                        }
                                        i21 = i25 + 1;
                                        f18 = 0.2f;
                                        f17 = 100.0f;
                                    }
                                    l0Var.f11343f = f20;
                                    l0Var.f11344g = f21;
                                }
                                this.f11371x.add(l0Var);
                            }
                        } else {
                            rnVar2 = rnVar3;
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                y8Var.m(i12, user);
                                imageReceiver.setForUserOrChat(user, y8Var);
                                l0Var = new l0();
                                l0Var.f11339a = imageReceiver;
                                f17 = 100.0f;
                                l0Var.f11342e = s3.c.c(pa.f(random, 100), 100.0f, 0.1f, 0.3f);
                                l0Var.h = s3.c.c(pa.f(random, 100), 100.0f, 0.4f, 0.8f);
                                l0Var.f11345i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                l0Var.f11340b = (int) s3.c.c(pa.f(random, 100), 100.0f, 200.0f, 400.0f);
                                f18 = 0.2f;
                                if (this.f11371x.isEmpty()) {
                                    l0Var.f11343f = a9.p.d(pa.f(random, 100), 0.6f, 100.0f, 0.2f);
                                    l0Var.f11344g = (pa.f(random, 100) * 0.4f) / 100.0f;
                                } else {
                                    i21 = 0;
                                    f19 = 0.0f;
                                    f20 = 0.0f;
                                    f21 = 0.0f;
                                    while (i21 < 10) {
                                        int i26 = i21;
                                        fD = a9.p.d(pa.f(random, 100), 0.6f, f17, f18);
                                        fD2 = a9.p.d(pa.f(random, 100), 0.4f, f17, f18);
                                        f22 = 2.1474836E9f;
                                        while (i22 < this.f11371x.size()) {
                                            float f26 = ((l0) this.f11371x.get(i22)).f11343f - fD;
                                            float f27 = ((l0) this.f11371x.get(i22)).f11344g - fD2;
                                            f23 = (f27 * f27) + (f26 * f26);
                                            if (f23 < f22) {
                                                f22 = f23;
                                            }
                                        }
                                        if (f22 > f19) {
                                            f21 = fD2;
                                            f20 = fD;
                                            f19 = f22;
                                        }
                                        i21 = i26 + 1;
                                        f18 = 0.2f;
                                        f17 = 100.0f;
                                    }
                                    l0Var.f11343f = f20;
                                    l0Var.f11344g = f21;
                                }
                                this.f11371x.add(l0Var);
                            }
                        }
                    } else {
                        rnVar2 = rnVar3;
                    }
                    i24++;
                    i12 = i10;
                    rnVar3 = rnVar2;
                }
                rnVar = rnVar3;
            }
        } else {
            rnVar = rnVar3;
            f12 = 0.0f;
        }
        uj0 uj0Var = this.f11368t;
        boolean z14 = (uj0Var == null && (f10 == f12 || f11 == f12)) ? false : true;
        if (view3 != null) {
            view3.getLocationOnScreen(this.f11358j);
            int[] iArr = this.f11358j;
            float fA = iArr[0];
            float width = iArr[1];
            imageHeight = view3.getScaleX() * view3.getWidth();
            if (view3 instanceof j51) {
                float f28 = ((j51) view3).C;
                if (f28 > f12) {
                    imageHeight = view3.getWidth() * ((f28 * 2.0f) + 1.0f);
                    fA = y1.a(imageHeight, view3.getWidth(), 2.0f, fA);
                    width -= imageHeight - view3.getWidth();
                }
            }
            f14 = width;
            f13 = fA;
        } else {
            if (uj0Var == null) {
                if (o0VarL != 0) {
                    ImageReceiver imageReceiver2 = o0VarL.C;
                    view4.getLocationInWindow(this.f11358j);
                    float imageX = this.f11358j[0] + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                    float imageY = this.f11358j[1] + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageY());
                    imageHeight = imageReceiver2 == null ? 0.0f : imageReceiver2.getImageHeight();
                    f13 = imageX;
                    f14 = imageY;
                } else {
                    if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.f11358j);
                        int[] iArr2 = this.f11358j;
                        float f29 = iArr2[0] + f10;
                        f14 = iArr2[1] + f11 + (view4 instanceof s1 ? ((s1) view4).R : 0);
                        f13 = f29;
                    } else {
                        f13 = f10;
                        f14 = f11;
                    }
                    i13 = 2;
                    imageHeight = 0.0f;
                }
                if (i11 == i13) {
                    if (z10 || !SharedConfig.deviceIsHigh()) {
                        f16 = 34.0f;
                    } else {
                        f16 = 60.0f;
                    }
                    int iDp2 = AndroidUtilities.dp(f16);
                    iRound = (int) ((iDp2 * 2.0f) / AndroidUtilities.density);
                    iDp = iDp2;
                } else if (i11 == 1) {
                    int iDp3 = AndroidUtilities.dp(350.0f);
                    Point point = AndroidUtilities.displaySize;
                    int iRound2 = Math.round(Math.min(iDp3, Math.min(point.x, point.y)) * 0.8f);
                    int iDp4 = AndroidUtilities.dp(350.0f);
                    Point point2 = AndroidUtilities.displaySize;
                    iRound = (int) (Math.round(Math.min(iDp4, Math.min(point2.x, point2.y)) * 0.7f) / AndroidUtilities.density);
                    iDp = iRound2;
                } else if (z10) {
                    if (SharedConfig.deviceIsHigh()) {
                        f15 = 240.0f;
                    } else {
                        f15 = 140.0f;
                    }
                    int iDp5 = AndroidUtilities.dp(f15);
                    if (SharedConfig.deviceIsHigh()) {
                        iE = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                    } else {
                        iE = e();
                    }
                    iRound = iE;
                    iDp = iDp5;
                } else {
                    iDp = AndroidUtilities.dp(80.0f);
                    iRound = e();
                }
                i14 = iDp >> 1;
                i15 = iRound >> 1;
                float f30 = imageHeight / i14;
                this.f11356g = 0.0f;
                this.h = 0.0f;
                frameLayout = new FrameLayout(context2);
                this.f11354e = frameLayout;
                int i27 = iDp;
                int i28 = iRound;
                View view5 = view4;
                messageObject2 = messageObject;
                j0Var = new j0(this, context2, n2Var, view5, z10, messageObject2, rnVar, i14, i11, z14, f30, f13, f14, q0Var);
                this.f11357i = j0Var;
                k0Var = new k0(this, context2);
                this.f11352b = k0Var;
                k0Var2 = new k0(this, context2);
                this.f11353c = k0Var2;
                k0Var3 = new k0(this, context2);
                this.d = k0Var3;
                if (q0Var.f11412f != null) {
                    tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(this.f11364p.f11412f);
                } else {
                    tL_availableReaction = null;
                }
                if (tL_availableReaction != null && q0Var.f11413g == r5) {
                    this.f11360l = true;
                    return;
                }
                if (tL_availableReaction != null) {
                    i20 = 2;
                    if (i11 != 2) {
                        if ((i11 != 1 && LiteMode.isEnabled(4112)) || i11 == 0) {
                            TLRPC.Document document2 = i11 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                            String strA = i11 == 1 ? a() : com.google.android.recaptcha.internal.a.l(i28, "_", i28);
                            ImageReceiver imageReceiver3 = k0Var.getImageReceiver();
                            StringBuilder sb2 = new StringBuilder();
                            int i29 = D;
                            D = i29 + 1;
                            sb2.append(i29);
                            sb2.append("_");
                            sb2.append(this.f11362n);
                            sb2.append("_");
                            imageReceiver3.setUniqKeyPrefix(sb2.toString());
                            k0Var.j(ImageLocation.getForDocument(document2), strA, null, null, 0, null);
                            z12 = false;
                            k0Var.getImageReceiver().setAutoRepeat(0);
                            k0Var.getImageReceiver().setAllowStartAnimation(false);
                        }
                        if (k0Var.getImageReceiver().getLottieAnimation() != null) {
                            k0Var.getImageReceiver().getLottieAnimation().L(z12 ? 1 : 0, z12, z12);
                            k0Var.getImageReceiver().getLottieAnimation().start();
                        }
                        i20 = 2;
                        r11 = z12;
                    } else {
                        r11 = 0;
                    }
                    if (i11 == i20) {
                        if (z10) {
                            document = tL_availableReaction.select_animation;
                        } else {
                            document = tL_availableReaction.appear_animation;
                        }
                        ImageReceiver imageReceiver4 = k0Var2.getImageReceiver();
                        StringBuilder sb3 = new StringBuilder();
                        int i30 = D;
                        D = i30 + 1;
                        sb3.append(i30);
                        sb3.append("_");
                        sb3.append(this.f11362n);
                        sb3.append("_");
                        imageReceiver4.setUniqKeyPrefix(sb3.toString());
                        k0Var2.j(ImageLocation.getForDocument(document), com.google.android.recaptcha.internal.a.l(i15, "_", i15), null, null, 0, null);
                    } else if (i11 == 0) {
                        TLRPC.Document document3 = tL_availableReaction.activate_animation;
                        ImageReceiver imageReceiver5 = k0Var2.getImageReceiver();
                        StringBuilder sb4 = new StringBuilder();
                        int i31 = D;
                        D = i31 + 1;
                        sb4.append(i31);
                        sb4.append("_");
                        sb4.append(this.f11362n);
                        sb4.append("_");
                        imageReceiver5.setUniqKeyPrefix(sb4.toString());
                        k0Var2.j(ImageLocation.getForDocument(document3), com.google.android.recaptcha.internal.a.l(i15, "_", i15), null, null, 0, null);
                    }
                    k0Var4 = k0Var3;
                } else {
                    r11 = 0;
                    r11 = 0;
                    if (i11 == 0) {
                        i16 = i10;
                        k5Var2 = new k5(1, i16, q0Var.f11413g);
                        k5Var2.o(k0Var2);
                        k0Var2.D = k5Var2;
                        if (k0Var2.F) {
                            k5Var2.a(k0Var2);
                        }
                    } else {
                        i16 = i10;
                        if (i11 == 2) {
                            k0Var4 = k0Var3;
                            messageObject3 = messageObject2;
                            k5Var = new k5(2, i16, q0Var.f11413g);
                            k5Var.o(k0Var2);
                            k0Var2.D = k5Var;
                            if (k0Var2.F) {
                                k5Var.a(k0Var2);
                            }
                        }
                        if (i11 != 0 || i11 == 1) {
                            k5 k5Var3 = new k5(2, i16, q0Var.f11413g);
                            if (messageObject3 != null) {
                                if (messageObject3.shouldDrawWithoutBackground()) {
                                    if (messageObject3.isOutOwner()) {
                                        i17 = g6.Sb;
                                    } else {
                                        i17 = g6.Cj;
                                    }
                                } else if (messageObject3.isOutOwner()) {
                                    i17 = g6.Gj;
                                } else {
                                    i17 = g6.Fj;
                                }
                                if (n2Var != null) {
                                    resourceProvider = n2Var.getResourceProvider();
                                } else {
                                    resourceProvider = null;
                                }
                                iV0 = g6.v0(i17, resourceProvider);
                            } else {
                                iV0 = -1;
                            }
                            k5Var3.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
                            if (i11 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            k0Var.E = d.a(k5Var3, z11, !z11);
                            j0Var.setClipChildren(false);
                        }
                    }
                    k0Var4 = k0Var3;
                    messageObject3 = messageObject2;
                    if (i11 != 0) {
                        k5 k5Var4 = new k5(2, i16, q0Var.f11413g);
                        if (messageObject3 != null) {
                            if (messageObject3.shouldDrawWithoutBackground()) {
                                if (messageObject3.isOutOwner()) {
                                    i17 = g6.Sb;
                                } else {
                                    i17 = g6.Cj;
                                }
                            } else if (messageObject3.isOutOwner()) {
                                i17 = g6.Gj;
                            } else {
                                i17 = g6.Fj;
                            }
                            if (n2Var != null) {
                                resourceProvider = n2Var.getResourceProvider();
                            } else {
                                resourceProvider = null;
                            }
                            iV0 = g6.v0(i17, resourceProvider);
                        } else {
                            iV0 = -1;
                        }
                        k5Var4.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
                        if (i11 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k0Var.E = d.a(k5Var4, z11, !z11);
                        j0Var.setClipChildren(false);
                    } else {
                        k5 k5Var5 = new k5(2, i16, q0Var.f11413g);
                        if (messageObject3 != null) {
                            if (messageObject3.shouldDrawWithoutBackground()) {
                                if (messageObject3.isOutOwner()) {
                                    i17 = g6.Sb;
                                } else {
                                    i17 = g6.Cj;
                                }
                            } else if (messageObject3.isOutOwner()) {
                                i17 = g6.Gj;
                            } else {
                                i17 = g6.Fj;
                            }
                            if (n2Var != null) {
                                resourceProvider = n2Var.getResourceProvider();
                            } else {
                                resourceProvider = null;
                            }
                            iV0 = g6.v0(i17, resourceProvider);
                        } else {
                            iV0 = -1;
                        }
                        k5Var5.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
                        if (i11 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k0Var.E = d.a(k5Var5, z11, !z11);
                        j0Var.setClipChildren(false);
                    }
                }
                k0Var2.getImageReceiver().setAutoRepeat(r11);
                k0Var2.getImageReceiver().setAllowStartAnimation(r11);
                if (k0Var2.getImageReceiver().getLottieAnimation() != null) {
                    if (i11 == 2) {
                        k0Var2.getImageReceiver().getLottieAnimation().L(k0Var2.getImageReceiver().getLottieAnimation().f31312e[r11] - 1, r11, r11);
                    } else {
                        k0Var2.getImageReceiver().getLottieAnimation().L(r11, r11, r11);
                        k0Var2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i18 = i27 - i14;
                i19 = i18 >> 1;
                i18 = i11 == 1 ? i19 : i18;
                frameLayout.addView(k0Var2);
                k0Var2.getLayoutParams().width = i14;
                k0Var2.getLayoutParams().height = i14;
                ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).topMargin = i19;
                ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).leftMargin = i18;
                if (i11 != 1 && !z10) {
                    if (tL_availableReaction != null) {
                        k0Var4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(k0Var4);
                    k0Var4.getLayoutParams().width = i14;
                    k0Var4.getLayoutParams().height = i14;
                    ((FrameLayout.LayoutParams) k0Var4.getLayoutParams()).topMargin = i19;
                    ((FrameLayout.LayoutParams) k0Var4.getLayoutParams()).leftMargin = i18;
                }
                j0Var.addView(frameLayout);
                frameLayout.getLayoutParams().width = i27;
                frameLayout.getLayoutParams().height = i27;
                int i32 = -i19;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i32;
                int i33 = -i18;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i33;
                j0Var.addView(k0Var);
                k0Var.getLayoutParams().width = i27;
                k0Var.getLayoutParams().height = i27;
                k0Var.getLayoutParams().width = i27;
                k0Var.getLayoutParams().height = i27;
                ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).topMargin = i32;
                ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).leftMargin = i33;
                frameLayout.setPivotX(i18);
                frameLayout.setPivotY(i19);
            }
            uj0Var.getLocationOnScreen(this.f11358j);
            float x8 = this.f11358j[0] + this.f11368t.f33100b.getX();
            float y10 = this.f11358j[1] + this.f11368t.f33100b.getY();
            imageHeight = this.f11368t.getScaleX() * this.f11368t.f33100b.getWidth();
            f13 = x8;
            f14 = y10;
        }
        i13 = 2;
        if (i11 == i13) {
            if (z10) {
                f16 = 34.0f;
            } else {
                f16 = 34.0f;
            }
            int iDp6 = AndroidUtilities.dp(f16);
            iRound = (int) ((iDp6 * 2.0f) / AndroidUtilities.density);
            iDp = iDp6;
        } else if (i11 == 1) {
            int iDp7 = AndroidUtilities.dp(350.0f);
            Point point3 = AndroidUtilities.displaySize;
            int iRound3 = Math.round(Math.min(iDp7, Math.min(point3.x, point3.y)) * 0.8f);
            int iDp8 = AndroidUtilities.dp(350.0f);
            Point point4 = AndroidUtilities.displaySize;
            iRound = (int) (Math.round(Math.min(iDp8, Math.min(point4.x, point4.y)) * 0.7f) / AndroidUtilities.density);
            iDp = iRound3;
        } else if (z10) {
            if (SharedConfig.deviceIsHigh()) {
                f15 = 240.0f;
            } else {
                f15 = 140.0f;
            }
            int iDp9 = AndroidUtilities.dp(f15);
            if (SharedConfig.deviceIsHigh()) {
                iE = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
            } else {
                iE = e();
            }
            iRound = iE;
            iDp = iDp9;
        } else {
            iDp = AndroidUtilities.dp(80.0f);
            iRound = e();
        }
        i14 = iDp >> 1;
        i15 = iRound >> 1;
        float f31 = imageHeight / i14;
        this.f11356g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.f11354e = frameLayout;
        int i210 = iDp;
        int i211 = iRound;
        View view6 = view4;
        messageObject2 = messageObject;
        j0Var = new j0(this, context2, n2Var, view6, z10, messageObject2, rnVar, i14, i11, z14, f31, f13, f14, q0Var);
        this.f11357i = j0Var;
        k0Var = new k0(this, context2);
        this.f11352b = k0Var;
        k0Var2 = new k0(this, context2);
        this.f11353c = k0Var2;
        k0Var3 = new k0(this, context2);
        this.d = k0Var3;
        if (q0Var.f11412f != null) {
            tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(this.f11364p.f11412f);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction != null) {
            i20 = 2;
            if (i11 != 2) {
                z12 = i11 != 1 ? false : false;
                if (k0Var.getImageReceiver().getLottieAnimation() != null) {
                    k0Var.getImageReceiver().getLottieAnimation().L(z12 ? 1 : 0, z12, z12);
                    k0Var.getImageReceiver().getLottieAnimation().start();
                }
                i20 = 2;
                r11 = z12;
            } else {
                r11 = 0;
            }
            if (i11 == i20) {
                if (z10) {
                    document = tL_availableReaction.select_animation;
                } else {
                    document = tL_availableReaction.appear_animation;
                }
                ImageReceiver imageReceiver6 = k0Var2.getImageReceiver();
                StringBuilder sb5 = new StringBuilder();
                int i34 = D;
                D = i34 + 1;
                sb5.append(i34);
                sb5.append("_");
                sb5.append(this.f11362n);
                sb5.append("_");
                imageReceiver6.setUniqKeyPrefix(sb5.toString());
                k0Var2.j(ImageLocation.getForDocument(document), com.google.android.recaptcha.internal.a.l(i15, "_", i15), null, null, 0, null);
            } else if (i11 == 0) {
                TLRPC.Document document4 = tL_availableReaction.activate_animation;
                ImageReceiver imageReceiver7 = k0Var2.getImageReceiver();
                StringBuilder sb6 = new StringBuilder();
                int i35 = D;
                D = i35 + 1;
                sb6.append(i35);
                sb6.append("_");
                sb6.append(this.f11362n);
                sb6.append("_");
                imageReceiver7.setUniqKeyPrefix(sb6.toString());
                k0Var2.j(ImageLocation.getForDocument(document4), com.google.android.recaptcha.internal.a.l(i15, "_", i15), null, null, 0, null);
            }
            k0Var4 = k0Var3;
        } else {
            r11 = 0;
            r11 = 0;
            if (i11 == 0) {
                i16 = i10;
                k5Var2 = new k5(1, i16, q0Var.f11413g);
                k5Var2.o(k0Var2);
                k0Var2.D = k5Var2;
                if (k0Var2.F) {
                    k5Var2.a(k0Var2);
                }
            } else {
                i16 = i10;
                if (i11 == 2) {
                    k0Var4 = k0Var3;
                    messageObject3 = messageObject2;
                    k5Var = new k5(2, i16, q0Var.f11413g);
                    k5Var.o(k0Var2);
                    k0Var2.D = k5Var;
                    if (k0Var2.F) {
                        k5Var.a(k0Var2);
                    }
                }
                if (i11 != 0) {
                    k5 k5Var6 = new k5(2, i16, q0Var.f11413g);
                    if (messageObject3 != null) {
                        if (messageObject3.shouldDrawWithoutBackground()) {
                            if (messageObject3.isOutOwner()) {
                                i17 = g6.Sb;
                            } else {
                                i17 = g6.Cj;
                            }
                        } else if (messageObject3.isOutOwner()) {
                            i17 = g6.Gj;
                        } else {
                            i17 = g6.Fj;
                        }
                        if (n2Var != null) {
                            resourceProvider = n2Var.getResourceProvider();
                        } else {
                            resourceProvider = null;
                        }
                        iV0 = g6.v0(i17, resourceProvider);
                    } else {
                        iV0 = -1;
                    }
                    k5Var6.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k0Var.E = d.a(k5Var6, z11, !z11);
                    j0Var.setClipChildren(false);
                } else {
                    k5 k5Var7 = new k5(2, i16, q0Var.f11413g);
                    if (messageObject3 != null) {
                        if (messageObject3.shouldDrawWithoutBackground()) {
                            if (messageObject3.isOutOwner()) {
                                i17 = g6.Sb;
                            } else {
                                i17 = g6.Cj;
                            }
                        } else if (messageObject3.isOutOwner()) {
                            i17 = g6.Gj;
                        } else {
                            i17 = g6.Fj;
                        }
                        if (n2Var != null) {
                            resourceProvider = n2Var.getResourceProvider();
                        } else {
                            resourceProvider = null;
                        }
                        iV0 = g6.v0(i17, resourceProvider);
                    } else {
                        iV0 = -1;
                    }
                    k5Var7.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k0Var.E = d.a(k5Var7, z11, !z11);
                    j0Var.setClipChildren(false);
                }
            }
            k0Var4 = k0Var3;
            messageObject3 = messageObject2;
            if (i11 != 0) {
                k5 k5Var8 = new k5(2, i16, q0Var.f11413g);
                if (messageObject3 != null) {
                    if (messageObject3.shouldDrawWithoutBackground()) {
                        if (messageObject3.isOutOwner()) {
                            i17 = g6.Sb;
                        } else {
                            i17 = g6.Cj;
                        }
                    } else if (messageObject3.isOutOwner()) {
                        i17 = g6.Gj;
                    } else {
                        i17 = g6.Fj;
                    }
                    if (n2Var != null) {
                        resourceProvider = n2Var.getResourceProvider();
                    } else {
                        resourceProvider = null;
                    }
                    iV0 = g6.v0(i17, resourceProvider);
                } else {
                    iV0 = -1;
                }
                k5Var8.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k0Var.E = d.a(k5Var8, z11, !z11);
                j0Var.setClipChildren(false);
            } else {
                k5 k5Var9 = new k5(2, i16, q0Var.f11413g);
                if (messageObject3 != null) {
                    if (messageObject3.shouldDrawWithoutBackground()) {
                        if (messageObject3.isOutOwner()) {
                            i17 = g6.Sb;
                        } else {
                            i17 = g6.Cj;
                        }
                    } else if (messageObject3.isOutOwner()) {
                        i17 = g6.Gj;
                    } else {
                        i17 = g6.Fj;
                    }
                    if (n2Var != null) {
                        resourceProvider = n2Var.getResourceProvider();
                    } else {
                        resourceProvider = null;
                    }
                    iV0 = g6.v0(i17, resourceProvider);
                } else {
                    iV0 = -1;
                }
                k5Var9.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k0Var.E = d.a(k5Var9, z11, !z11);
                j0Var.setClipChildren(false);
            }
        }
        k0Var2.getImageReceiver().setAutoRepeat(r11);
        k0Var2.getImageReceiver().setAllowStartAnimation(r11);
        if (k0Var2.getImageReceiver().getLottieAnimation() != null) {
            if (i11 == 2) {
                k0Var2.getImageReceiver().getLottieAnimation().L(k0Var2.getImageReceiver().getLottieAnimation().f31312e[r11] - 1, r11, r11);
            } else {
                k0Var2.getImageReceiver().getLottieAnimation().L(r11, r11, r11);
                k0Var2.getImageReceiver().getLottieAnimation().start();
            }
        }
        i18 = i210 - i14;
        i19 = i18 >> 1;
        if (i11 == 1) {
        }
        frameLayout.addView(k0Var2);
        k0Var2.getLayoutParams().width = i14;
        k0Var2.getLayoutParams().height = i14;
        ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).topMargin = i19;
        ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).leftMargin = i18;
        if (i11 != 1) {
            if (tL_availableReaction != null) {
                k0Var4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
            }
            frameLayout.addView(k0Var4);
            k0Var4.getLayoutParams().width = i14;
            k0Var4.getLayoutParams().height = i14;
            ((FrameLayout.LayoutParams) k0Var4.getLayoutParams()).topMargin = i19;
            ((FrameLayout.LayoutParams) k0Var4.getLayoutParams()).leftMargin = i18;
        }
        j0Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i210;
        frameLayout.getLayoutParams().height = i210;
        int i36 = -i19;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i36;
        int i37 = -i18;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i37;
        j0Var.addView(k0Var);
        k0Var.getLayoutParams().width = i210;
        k0Var.getLayoutParams().height = i210;
        k0Var.getLayoutParams().width = i210;
        k0Var.getLayoutParams().height = i210;
        ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).topMargin = i36;
        ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).leftMargin = i37;
        frameLayout.setPivotX(i18);
        frameLayout.setPivotY(i19);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i10 = 0;
        while (i10 < 2) {
            m0 m0Var = i10 == 0 ? B : C;
            if (m0Var != null) {
                if (z10) {
                    m0Var.c();
                } else {
                    m0Var.f11360l = true;
                }
            }
            i10++;
        }
        C = null;
        B = null;
    }

    public static void d(n2 n2Var, wj0 wj0Var, View view, View view2, float f10, float f11, q0 q0Var, int i10, int i11) {
        boolean z10;
        n1 n1Var;
        if (view == null || q0Var == null || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i11 == 2 || i11 == 0) {
                d(n2Var, null, view, view2, 0.0f, 0.0f, q0Var, i10, 1);
            }
            m0 m0Var = new m0(n2Var.getParentActivity(), n2Var, wj0Var, view, view2, f10, f11, q0Var, i10, i11, false);
            if (i11 == 1) {
                C = m0Var;
            } else {
                B = m0Var;
            }
            if (n2Var instanceof rn) {
                z10 = (i11 == 0 || i11 == 2) && (n1Var = ((rn) n2Var).M8) != null && n1Var.isShowing();
            }
            m0Var.f11370w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = n2Var.getParentActivity().getWindowManager();
                m0Var.f11359k = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, m0Var.f11357i, layoutParams);
                m0Var.f11359k.addView(m0Var.f11357i, layoutParams);
            } else {
                ((FrameLayout) n2Var.getParentActivity().getWindow().getDecorView()).addView(m0Var.f11357i);
            }
            view.invalidate();
            if (!(view instanceof s1) || ((s1) view).getCurrentMessagesGroup() == null || view.getParent() == null) {
                return;
            }
            ((View) view.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        m0 m0Var = B;
        if (m0Var != null) {
            m0Var.f11367s = true;
            m0Var.f11372y = System.currentTimeMillis();
            if (B.f11351a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        m0 m0Var2 = C;
        if (m0Var2 != null) {
            View view = m0Var2.v;
            if (view instanceof s1) {
                ((s1) view).J.b(m0Var2.f11364p);
            } else if (view instanceof v0) {
                ((v0) view).f25785y0.b(m0Var2.f11364p);
            }
        }
    }

    public static void g() {
        m0 m0Var = C;
        if (m0Var == null || m0Var.f11367s) {
            return;
        }
        m0Var.f11367s = true;
        m0Var.f11372y = System.currentTimeMillis();
        if (C.f11351a != 1 || System.currentTimeMillis() - E <= 200) {
            return;
        }
        E = System.currentTimeMillis();
        View view = C.v;
        if (view != null) {
            view.performHapticFeedback(3);
        }
    }

    public final void c() {
        try {
            boolean z10 = this.f11370w;
            j0 j0Var = this.f11357i;
            if (z10) {
                this.f11359k.removeView(j0Var);
            } else {
                AndroidUtilities.removeFromParent(j0Var);
            }
        } catch (Exception unused) {
        }
    }
}

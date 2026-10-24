package ai;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class me extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final ci.v0 G;
    public final ci.q0 H;
    public final View I;
    public final vp J;
    public final ae K;
    public final MessageObject L;
    public final ArrayList M;
    public final c N;
    public int O;
    public ci.m2 P;
    public int Q;
    public a1.c R;
    public final vq[] S;
    public boolean T;
    public boolean U;
    public sn V;
    public View W;
    public ValueAnimator X;
    public final org.telegram.ui.ActionBar.g6 f1840b;
    public final int f1841c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f1842f;
    public final FrameLayout h;
    public final LinearLayout f1843n;
    public final vd f1844r;
    public final FrameLayout f1845s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.u9 f1846w;
    public final ei.d f1847x;
    public final le f1848y;

    public me(Context context, final int i10, final long j10, sn snVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        String formatString;
        long j12;
        int i11;
        Context context2;
        int i12;
        this.S = new vq[1];
        this.U = false;
        this.f1840b = g6Var;
        this.f1841c = i10;
        this.L = messageObject;
        this.M = arrayList;
        this.d = z11;
        this.e = z10;
        c cVar = new c(context, i10, g6Var);
        this.N = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.container.addView(cVar, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.b6.a(cVar);
        cVar.setOnClickListener(new qd(context, 0, g6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor3.my || peerDialogId == clientUserId) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
        } else {
            messageReactor = null;
        }
        boolean z14 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z11) {
            if (arrayList != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    } else if (((TLRPC.MessageReactor) arrayList.get(i14)).my) {
                        TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) arrayList.get(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.E = j11;
        } else {
            this.E = ha.y(i10, false).B(messageObject);
        }
        long j13 = this.E;
        this.F = j13 != 2666000 ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21255h5, g6Var));
        this.O = this.navBarColor;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1842f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, w7.z5.n(-1, -2));
        this.f1844r = new vd(this, context, g6Var, z11, i10);
        int i15 = 9;
        int[] iArr = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j14 = MessagesController.getInstance(i10).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        while (true) {
            if (i16 >= i15) {
                z12 = z14;
                break;
            }
            int i17 = iArr[i16];
            z12 = z14;
            if (i17 > j14) {
                arrayList2.add(Integer.valueOf((int) j14));
                break;
            }
            arrayList2.add(Integer.valueOf(i17));
            if (iArr[i16] == j14) {
                break;
            }
            i16++;
            z14 = z12;
            i15 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            iArr2[i18] = ((Integer) arrayList2.get(i18)).intValue();
        }
        vd vdVar = this.f1844r;
        vdVar.f1580e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                vdVar.setAlpha(0.5f);
            }
            this.h.addView(this.f1844r, w7.z5.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z12) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f1843n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.z5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f1845s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        int dp = AndroidUtilities.dp(14.0f);
        int i19 = org.telegram.ui.ActionBar.k6.f21272i5;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i19, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i19);
        frameLayout3.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, c02, O, null, g6Var);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f1846w = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        u9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        s();
        frameLayout3.addView(u9Var, w7.z5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i20 = org.telegram.ui.ActionBar.k6.f21440r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i20, g6Var, mode);
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.z5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.z5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.z5.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.b6.a(frameLayout2);
        k0.g(i10).o();
        wd wdVar = new wd(context, 0);
        int i21 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(wdVar, i21, g6Var);
        wdVar.setTextSize(1, 20.0f);
        wdVar.setGravity(17);
        wdVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        wdVar.setTypeface(AndroidUtilities.bold());
        wdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(wdVar, w7.z5.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        r(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, g6Var, mode);
        w7.b6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final me f2140b;

            {
                this.f2140b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f2140b.dismiss();
                        return;
                    default:
                        me meVar = this.f2140b;
                        vp vpVar = meVar.J;
                        vpVar.a(!vpVar.f32005a.f24297q, true);
                        if (vpVar.f32005a.f24297q) {
                            j15 = meVar.F;
                        } else {
                            j15 = 2666000;
                        }
                        meVar.E = j15;
                        meVar.s();
                        le leVar = meVar.f1848y;
                        if (leVar != null) {
                            leVar.setMyPrivacy(meVar.E);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.z5.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.z5.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, i21, g6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor.count);
            chat = chat2;
            z13 = false;
        } else {
            chat = chat2;
            z13 = false;
            formatString = LocaleController.formatString(R.string.StarsReactionText, chat2 == null ? "" : chat2.title);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z13));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.z5.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new xd(context, g6Var), w7.z5.t(-1, 30, 55, 0, 20, 0, 0));
            }
            le leVar = new le(this, context, z11);
            this.f1848y = leVar;
            leVar.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    int i22 = (l4.longValue() > 0L ? 1 : (l4.longValue() == 0L ? 0 : -1));
                    me meVar = me.this;
                    boolean z15 = z11;
                    if (i22 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new yd(meVar, bundle, z15));
                        meVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new zd(meVar, bundle2, z15));
                    }
                    meVar.dismiss();
                }
            });
            this.f1842f.addView(leVar, w7.z5.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.I = view;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21185d7, view, g6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.f1842f.addView(view, w7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f1848y = null;
            this.I = null;
        }
        if (z11) {
            int i22 = org.telegram.ui.ActionBar.k6.f21290j5;
            TextView b10 = w7.d6.b(context, 20.0f, i22, true, g6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f1842f.addView(b10, w7.z5.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.d6.b(context, 14.0f, i22, false, g6Var);
            b11.setGravity(17);
            if (z10) {
                i12 = R.string.LiveStoryReactText;
            } else {
                i12 = z12 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText;
            }
            tl.r(i12, new Object[]{DialogObject.getName(j10)}, b11);
            this.f1842f.addView(b11, w7.z5.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.G = obj2;
            obj2.f6003c = this.E;
            obj2.f6005g = 50L;
            obj2.e = true;
            ci.q0 q0Var = new ci.q0(i10, context, true);
            this.H = q0Var;
            q0Var.set(obj2);
            this.f1842f.addView(q0Var, w7.z5.t(-2, -2, 17, 32, 0, 32, 20));
        }
        vp vpVar = new vp(context, 21, g6Var);
        this.J = vpVar;
        vpVar.b(org.telegram.ui.ActionBar.k6.f21257h7, org.telegram.ui.ActionBar.k6.f21292j7, org.telegram.ui.ActionBar.k6.f21312k7);
        vpVar.setDrawUnchecked(true);
        vpVar.a(this.E != 2666000, false);
        le leVar2 = this.f1848y;
        if (leVar2 != null) {
            leVar2.setMyPrivacy(this.E);
        }
        vpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, i21, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(vpVar, w7.z5.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.z5.q(-2, -2, 16));
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final me f2140b;

            {
                this.f2140b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f2140b.dismiss();
                        return;
                    default:
                        me meVar = this.f2140b;
                        vp vpVar2 = meVar.J;
                        vpVar2.a(!vpVar2.f32005a.f24297q, true);
                        if (vpVar2.f32005a.f24297q) {
                            j15 = meVar.F;
                        } else {
                            j15 = 2666000;
                        }
                        meVar.E = j15;
                        meVar.s();
                        le leVar3 = meVar.f1848y;
                        if (leVar3 != null) {
                            leVar3.setMyPrivacy(meVar.E);
                            return;
                        }
                        return;
                }
            }
        });
        w7.b6.b(linearLayout4, 0.05f, 1.2f);
        int i23 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i23, g6Var), 6, 6);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i23);
        linearLayout4.setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(linearLayout4, Z, null, O2, g6Var);
        if (!z11 && (z10 || messageReactor != null)) {
            this.f1842f.addView(linearLayout4, w7.z5.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        ei.d dVar = new ei.d(context, g6Var, true);
        this.f1847x = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f1842f.addView(dVar, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        t(0L);
        dVar.i(nd.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.S), true, true);
        if (z10) {
            j12 = 0;
            i11 = 17;
            context2 = context;
            dVar.setOnClickListener(new nb(this, messageObject, snVar, i10, z11, context, g6Var, j10, chat));
        } else {
            j12 = 0;
            i11 = 17;
            context2 = context;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                me.m(me.this, i10, g6Var, j10, z11);
            }
        });
        w90 w90Var = new w90(context2, g6Var);
        w90Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21589z6, g6Var);
        if (z11 && !z10) {
            w90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            w90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new sa(context2, 6)));
        }
        w90Var.setGravity(i11);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21310k5, g6Var);
        if (z10 || z11) {
            this.f1842f.addView(w90Var, w7.z5.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f1842f);
        ae aeVar = new ae(context2, 1, 2, 0);
        this.K = aeVar;
        tg.g gVar = aeVar.f47546b;
        gVar.f47530z = org.telegram.ui.ActionBar.k6.fk;
        gVar.A = org.telegram.ui.ActionBar.k6.gk;
        gVar.b();
        aeVar.f47546b.f47516k = 1.0f;
        aeVar.setVisibility(4);
        aeVar.setPaused(true);
        this.container.addView(aeVar, w7.z5.c(150.0f, 150));
        this.f1844r.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i24)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor != null ? j15 - messageReactor.count : j15;
            if (j15 > j12) {
                this.f1844r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void m(me meVar, int i10, org.telegram.ui.ActionBar.g6 g6Var, long j10, boolean z10) {
        long j11;
        boolean z11;
        me meVar2 = meVar;
        k0 g10 = k0.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.f1606l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        h80 F = h80.F(meVar2.containerView, g6Var, meVar2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).f20491id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = i12;
                    } else {
                        j11 = -chat.f20344id;
                    }
                }
                meVar2 = meVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = meVar2.E;
                if (j11 != j12 && (j12 != 0 || j11 != UserConfig.getInstance(i10).getClientUserId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                F.g(tLObject, z11, new ud(meVar2, j11, z10, 0));
                meVar2 = meVar;
                i11 = i12;
            }
        }
        F.f26930t = false;
        F.Y = true;
        F.f26929s = 0;
        F.V(5);
        F.Z();
    }

    @Override
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        float f7;
        float f10;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float[] fArr = {f7};
        c cVar = this.N;
        arrayList.add(ObjectAnimator.ofFloat(cVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(cVar, property2, f10));
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(cVar, property3, f11));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f1844r.f1587k0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            r(true);
        }
    }

    @Override
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.T && !this.U) {
            this.U = true;
            MessageObject messageObject = this.L;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.E)) {
                messageObject.setMyPaidReactionDialogId(this.E);
                aa b10 = aa.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f1841c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.f980a;
                int i11 = b10.f981b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.E;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.E);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f980a), Integer.valueOf(i11), Long.valueOf(this.E));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new h(this, 5));
            }
        }
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.X;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.dismissInternal();
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar = this.N;
        if (f7 >= cVar.getX() && f7 <= cVar.getX() + cVar.getWidth() && f10 >= cVar.getY() && f10 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f1841c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f1841c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onThemeColorsChanged() {
        int w02;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColorKey < 0 && this.navBarColor == this.O && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21255h5, this.f1840b)) != this.navBarColor) {
                this.navBarColor = w02;
                this.O = w02;
                setOverlayNavBarColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p(final da daVar) {
        ah.g1 g1Var;
        View view;
        ah.j1 j1Var;
        ci.m2 m2Var;
        View view2;
        ah.j1 j1Var2;
        ah.g1 g1Var2;
        MessageObject messageObject;
        vd vdVar = this.f1844r;
        ae aeVar = this.K;
        MessageObject messageObject2 = this.L;
        if (messageObject2 != null && (view2 = this.V.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.W;
            if (view3 instanceof org.telegram.ui.Cells.t1) {
                j1Var2 = ((org.telegram.ui.Cells.t1) view3).N;
                j1Var2.getClass();
                g1Var2 = j1Var2.m("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                j1Var2 = ((org.telegram.ui.Cells.v0) view3).E0;
                j1Var2.getClass();
                g1Var2 = j1Var2.m("stars");
            } else {
                j1Var2 = null;
                g1Var2 = null;
            }
            if (g1Var2 == null && j1Var2 != null) {
                MessageObject.GroupedMessages c92 = this.V.c9(messageObject2);
                if (c92 != null && !c92.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = c92.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            MessageObject messageObject3 = arrayList.get(i10);
                            i10++;
                            messageObject = messageObject3;
                            MessageObject.GroupedMessagePosition position = c92.getPosition(messageObject);
                            if (position != null) {
                                int i11 = position.flags;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            messageObject = null;
                            break;
                        }
                    }
                    if (messageObject != null) {
                        view3 = this.V.t8(messageObject.getId(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Cells.t1) {
                        j1Var2 = ((org.telegram.ui.Cells.t1) view3).N;
                        j1Var2.getClass();
                        g1Var2 = j1Var2.m("stars");
                    }
                } else {
                    return;
                }
            }
            if (g1Var2 != null) {
                j1Var = j1Var2;
                g1Var = g1Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.P == null) {
            return;
        } else {
            g1Var = null;
            view = null;
            j1Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        vdVar.getLocationInWindow(iArr);
        rectF.set(vdVar.G.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        od odVar = new od(this, 2);
        aeVar.f47545a0 = odVar;
        if (aeVar.W) {
            aeVar.f47545a0 = null;
            odVar.run();
        }
        if (g1Var != null) {
            g1Var.f756l = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ah.g1 g1Var3 = g1Var;
        ci.q0[] q0VarArr = new ci.q0[1];
        if (this.d && (m2Var = this.P) != null) {
            q0VarArr[0] = m2Var.d(this.Q);
        }
        final RectF rectF2 = new RectF();
        final v7 v7Var = new v7(this, q0VarArr, iArr, rectF2, view, j1Var, g1Var3, 3);
        View view4 = view;
        v7Var.run();
        aeVar.setPaused(false);
        aeVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        aeVar.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        aeVar.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        aeVar.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        aeVar.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.X;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.X = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                v7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                me meVar = me.this;
                ae aeVar2 = meVar.K;
                aeVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                aeVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                aeVar2.setScaleX(lerp);
                aeVar2.setScaleY(lerp);
                tg.g gVar = aeVar2.f47546b;
                gVar.d = 360.0f * floatValue;
                gVar.f47516k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.c0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        meVar.container.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = daVar;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.X.addListener(new be(this, g1Var3, view4, q0VarArr, zArr, rectF2, daVar));
        this.X.setDuration(800L);
        this.X.setInterpolator(new ce(0));
        this.X.start();
    }

    public final boolean q() {
        if (!this.d) {
            k0 g10 = k0.g(this.f1841c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f1606l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void r(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f1845s;
        int i10 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != q()) {
            if (!q()) {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                if (q()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f1843n, changeBounds);
            }
        }
    }

    public final void s() {
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.f26245p = 0.42f;
        long j10 = this.E;
        int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        org.telegram.ui.Components.u9 u9Var = this.f1846w;
        if (i10 == 0) {
            f9Var.g(21);
            int i11 = org.telegram.ui.ActionBar.k6.f21167c8;
            org.telegram.ui.ActionBar.g6 g6Var = this.f1840b;
            f9Var.i(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
            u9Var.e(null, f9Var);
            return;
        }
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f1841c;
        if (i12 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.E));
            f9Var.r(user);
            u9Var.e(user, f9Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.E));
        f9Var.q(chat);
        u9Var.e(chat, f9Var);
    }

    public final void t(long j10) {
        le leVar;
        long j11;
        long j12;
        boolean z10;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (leVar = this.f1848y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f1841c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.M;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z11 = messageReactor.anonymous;
                    if (z11) {
                        if (messageReactor.my) {
                            peerDialogId = clientUserId;
                        } else {
                            peerDialogId = (-i11) - i10;
                        }
                    }
                    if (!messageReactor.my && peerDialogId != clientUserId) {
                        long j15 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f1327a = z11;
                        obj.f1328b = false;
                        obj.f1329c = peerDialogId;
                        obj.d = j15;
                        arrayList.add(obj);
                    } else {
                        j12 = messageReactor.count;
                    }
                    i11++;
                    j13 = j14;
                    i10 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                if (this.E == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f1327a = z10;
                obj2.f1328b = true;
                obj2.f1329c = clientUserId;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new a4.d(5));
            leVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}

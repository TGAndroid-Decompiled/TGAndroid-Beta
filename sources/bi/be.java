package bi;

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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class be extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final di.v0 G;
    public final di.q0 H;
    public final View I;
    public final zp J;
    public final qd K;
    public final MessageObject L;
    public final ArrayList M;
    public final c N;
    public int O;
    public di.m2 P;
    public int Q;
    public a1.c R;
    public final zq[] S;
    public boolean T;
    public boolean U;
    public un V;
    public View W;
    public ValueAnimator X;
    public final org.telegram.ui.ActionBar.u6 f4399b;
    public final int f4400c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f4401f;
    public final FrameLayout h;
    public final LinearLayout f4402n;
    public final ld f4403r;
    public final FrameLayout f4404s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.y9 f4405w;
    public final fi.d f4406x;
    public final ae f4407y;

    public be(Context context, final int i10, final long j10, un unVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        String formatString;
        long j12;
        int i11;
        Context context2;
        int i12;
        this.S = new zq[1];
        this.U = false;
        this.f4399b = u6Var;
        this.f4400c = i10;
        this.L = messageObject;
        this.M = arrayList;
        this.d = z11;
        this.e = z10;
        c cVar = new c(context, i10, u6Var);
        this.N = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.container.addView(cVar, gb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        gb1.b(cVar);
        cVar.setOnClickListener(new gd(context, 0, u6Var));
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
            this.E = ca.y(i10, false).B(messageObject);
        }
        long j13 = this.E;
        this.F = j13 != 2666000 ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, u6Var));
        this.O = this.navBarColor;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4401f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, gb1.r(-1, -2));
        this.f4403r = new ld(this, context, u6Var, z11, i10);
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
        ld ldVar = this.f4403r;
        ldVar.f5798e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                ldVar.setAlpha(0.5f);
            }
            this.h.addView(this.f4403r, gb1.h(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z12) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f4402n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, gb1.h(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f4404s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        int dp = AndroidUtilities.dp(14.0f);
        int i19 = org.telegram.ui.ActionBar.y6.f23445i5;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i19, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
        frameLayout3.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout3, c02, N, null, u6Var);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f4405w = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(y9Var, gb1.i(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i20 = org.telegram.ui.ActionBar.y6.f23612r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView, i20, u6Var, mode);
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, gb1.h(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, gb1.i(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, gb1.t(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        gb1.b(frameLayout2);
        m0.g(i10).o();
        md mdVar = new md(context, 0);
        int i21 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(mdVar, i21, u6Var);
        mdVar.setTextSize(1, 20.0f);
        mdVar.setGravity(17);
        mdVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        mdVar.setTypeface(AndroidUtilities.bold());
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(mdVar, gb1.t(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.W5, u6Var, mode);
        gb1.b(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final be f4803b;

            {
                this.f4803b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f4803b.dismiss();
                        return;
                    default:
                        be beVar = this.f4803b;
                        zp zpVar = beVar.J;
                        zpVar.a(!zpVar.f35379a.f26087q, true);
                        if (zpVar.f35379a.f26087q) {
                            j15 = beVar.F;
                        } else {
                            j15 = 2666000;
                        }
                        beVar.E = j15;
                        beVar.r();
                        ae aeVar = beVar.f4407y;
                        if (aeVar != null) {
                            aeVar.setMyPrivacy(beVar.E);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, gb1.t(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, gb1.h(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, i21, u6Var);
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
            linearLayout3.addView(textView, gb1.x(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new nd(context, u6Var), gb1.x(-1, 30, 55, 0, 20, 0, 0));
            }
            ae aeVar = new ae(this, context, z11);
            this.f4407y = aeVar;
            aeVar.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    int i22 = (l4.longValue() > 0L ? 1 : (l4.longValue() == 0L ? 0 : -1));
                    be beVar = be.this;
                    boolean z15 = z11;
                    if (i22 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new od(beVar, bundle, z15));
                        beVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new pd(beVar, bundle2, z15));
                    }
                    beVar.dismiss();
                }
            });
            this.f4401f.addView(aeVar, gb1.o(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.I = view;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23355d7, view, u6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.f4401f.addView(view, gb1.w(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f4407y = null;
            this.I = null;
        }
        if (z11) {
            int i22 = org.telegram.ui.ActionBar.y6.f23462j5;
            TextView L = gb1.L(context, 20.0f, i22, true, u6Var);
            L.setGravity(17);
            L.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f4401f.addView(L, gb1.x(-1, -2, 7, 32, 6, 32, 9));
            TextView L2 = gb1.L(context, 14.0f, i22, false, u6Var);
            L2.setGravity(17);
            if (z10) {
                i12 = R.string.LiveStoryReactText;
            } else {
                i12 = z12 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText;
            }
            vh.o(i12, new Object[]{DialogObject.getName(j10)}, L2);
            this.f4401f.addView(L2, gb1.x(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.G = obj2;
            obj2.f9240c = this.E;
            obj2.f9242g = 50L;
            obj2.e = true;
            di.q0 q0Var = new di.q0(i10, context, true);
            this.H = q0Var;
            q0Var.set(obj2);
            this.f4401f.addView(q0Var, gb1.x(-2, -2, 17, 32, 0, 32, 20));
        }
        zp zpVar = new zp(context, 21, u6Var);
        this.J = zpVar;
        zpVar.b(org.telegram.ui.ActionBar.y6.f23427h7, org.telegram.ui.ActionBar.y6.f23464j7, org.telegram.ui.ActionBar.y6.f23483k7);
        zpVar.setDrawUnchecked(true);
        zpVar.a(this.E != 2666000, false);
        ae aeVar2 = this.f4407y;
        if (aeVar2 != null) {
            aeVar2.setMyPrivacy(this.E);
        }
        zpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView2, i21, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(zpVar, gb1.x(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, gb1.u(-2, -2, 16));
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final be f4803b;

            {
                this.f4803b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f4803b.dismiss();
                        return;
                    default:
                        be beVar = this.f4803b;
                        zp zpVar2 = beVar.J;
                        zpVar2.a(!zpVar2.f35379a.f26087q, true);
                        if (zpVar2.f35379a.f26087q) {
                            j15 = beVar.F;
                        } else {
                            j15 = 2666000;
                        }
                        beVar.E = j15;
                        beVar.r();
                        ae aeVar3 = beVar.f4407y;
                        if (aeVar3 != null) {
                            aeVar3.setMyPrivacy(beVar.E);
                            return;
                        }
                        return;
                }
            }
        });
        gb1.c(linearLayout4, 0.05f, 1.2f);
        int i23 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i23, u6Var), 6, 6);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i23);
        linearLayout4.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(linearLayout4, Z, null, N2, u6Var);
        if (!z11 && (z10 || messageReactor != null)) {
            this.f4401f.addView(linearLayout4, gb1.x(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        fi.d dVar = new fi.d(context, u6Var, true);
        this.f4406x = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f4401f.addView(dVar, gb1.o(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.i(dd.U0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.S), true, true);
        if (z10) {
            j12 = 0;
            i11 = 17;
            context2 = context;
            dVar.setOnClickListener(new lb(this, messageObject, unVar, i10, z11, context, u6Var, j10, chat));
        } else {
            j12 = 0;
            i11 = 17;
            context2 = context;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                be.m(be.this, i10, u6Var, j10, z11);
            }
        });
        z90 z90Var = new z90(context2, u6Var);
        z90Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        if (z11 && !z10) {
            z90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            z90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new ra(context2, 6)));
        }
        z90Var.setGravity(i11);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.f23481k5, u6Var);
        if (z10 || z11) {
            this.f4401f.addView(z90Var, gb1.x(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f4401f);
        qd qdVar = new qd(context2, 1, 2, 0);
        this.K = qdVar;
        ug.g gVar = qdVar.f49813b;
        gVar.f49797z = org.telegram.ui.ActionBar.y6.fk;
        gVar.A = org.telegram.ui.ActionBar.y6.gk;
        gVar.b();
        qdVar.f49813b.f49783k = 1.0f;
        qdVar.setVisibility(4);
        qdVar.setPaused(true);
        this.container.addView(qdVar, gb1.g(150.0f, 150));
        this.f4403r.setValue(50);
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
                this.f4403r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void m(be beVar, int i10, org.telegram.ui.ActionBar.u6 u6Var, long j10, boolean z10) {
        long j11;
        boolean z11;
        be beVar2 = beVar;
        m0 g7 = m0.g(i10);
        g7.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g7.f5070l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        k80 F = k80.F(beVar2.containerView, u6Var, beVar2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).f22174id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = i12;
                    } else {
                        j11 = -chat.f22027id;
                    }
                }
                beVar2 = beVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = beVar2.E;
                if (j11 != j12 && (j12 != 0 || j11 != UserConfig.getInstance(i10).getClientUserId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                F.g(tLObject, z11, new kd(beVar2, j11, z10, 0));
                beVar2 = beVar;
                i11 = i12;
            }
        }
        F.f29867t = false;
        F.Y = true;
        F.f29866s = 0;
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
        if (this.f4403r.f5805k0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            q(true);
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
                v9 b10 = v9.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f4400c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.f5571a;
                int i11 = b10.f5572b;
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
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f5571a), Integer.valueOf(i11), Long.valueOf(this.E));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new i0(this, 4));
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

    public final void o(final y9 y9Var) {
        bh.v0 v0Var;
        View view;
        bh.y0 y0Var;
        di.m2 m2Var;
        View view2;
        bh.y0 y0Var2;
        bh.v0 v0Var2;
        MessageObject messageObject;
        ld ldVar = this.f4403r;
        qd qdVar = this.K;
        MessageObject messageObject2 = this.L;
        if (messageObject2 != null && (view2 = this.V.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.W;
            if (view3 instanceof org.telegram.ui.Cells.s1) {
                y0Var2 = ((org.telegram.ui.Cells.s1) view3).N;
                y0Var2.getClass();
                v0Var2 = y0Var2.m("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                y0Var2 = ((org.telegram.ui.Cells.v0) view3).E0;
                y0Var2.getClass();
                v0Var2 = y0Var2.m("stars");
            } else {
                y0Var2 = null;
                v0Var2 = null;
            }
            if (v0Var2 == null && y0Var2 != null) {
                MessageObject.GroupedMessages h92 = this.V.h9(messageObject2);
                if (h92 != null && !h92.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = h92.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            MessageObject messageObject3 = arrayList.get(i10);
                            i10++;
                            messageObject = messageObject3;
                            MessageObject.GroupedMessagePosition position = h92.getPosition(messageObject);
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
                        view3 = this.V.x8(messageObject.getId(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Cells.s1) {
                        y0Var2 = ((org.telegram.ui.Cells.s1) view3).N;
                        y0Var2.getClass();
                        v0Var2 = y0Var2.m("stars");
                    }
                } else {
                    return;
                }
            }
            if (v0Var2 != null) {
                y0Var = y0Var2;
                v0Var = v0Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.P == null) {
            return;
        } else {
            v0Var = null;
            view = null;
            y0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        ldVar.getLocationInWindow(iArr);
        rectF.set(ldVar.G.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        ed edVar = new ed(this, 2);
        qdVar.f49812a0 = edVar;
        if (qdVar.W) {
            qdVar.f49812a0 = null;
            edVar.run();
        }
        if (v0Var != null) {
            v0Var.f4178l = false;
        }
        if (view != null) {
            view.invalidate();
        }
        bh.v0 v0Var3 = v0Var;
        di.q0[] q0VarArr = new di.q0[1];
        if (this.d && (m2Var = this.P) != null) {
            q0VarArr[0] = m2Var.d(this.Q);
        }
        final RectF rectF2 = new RectF();
        final r7 r7Var = new r7(this, q0VarArr, iArr, rectF2, view, y0Var, v0Var3, 3);
        View view4 = view;
        r7Var.run();
        qdVar.setPaused(false);
        qdVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        qdVar.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        qdVar.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        qdVar.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        qdVar.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
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
                r7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                be beVar = be.this;
                qd qdVar2 = beVar.K;
                qdVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                qdVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                qdVar2.setScaleX(lerp);
                qdVar2.setScaleY(lerp);
                ug.g gVar = qdVar2.f49813b;
                gVar.d = 360.0f * floatValue;
                gVar.f49783k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.c0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        beVar.container.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = y9Var;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.X.addListener(new rd(this, v0Var3, view4, q0VarArr, zArr, rectF2, y9Var));
        this.X.setDuration(800L);
        this.X.setInterpolator(new a5.c(1));
        this.X.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f4400c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f4400c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onThemeColorsChanged() {
        int w02;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColorKey < 0 && this.navBarColor == this.O && (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, this.f4399b)) != this.navBarColor) {
                this.navBarColor = w02;
                this.O = w02;
                setOverlayNavBarColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean p() {
        if (!this.d) {
            m0 g7 = m0.g(this.f4400c);
            g7.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g7.f5070l;
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

    public final void q(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f4404s;
        int i10 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != p()) {
            if (!p()) {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                if (p()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f4402n, changeBounds);
            }
        }
    }

    public final void r() {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.f29540p = 0.42f;
        long j10 = this.E;
        int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        org.telegram.ui.Components.y9 y9Var = this.f4405w;
        if (i10 == 0) {
            j9Var.g(21);
            int i11 = org.telegram.ui.ActionBar.y6.f23337c8;
            org.telegram.ui.ActionBar.u6 u6Var = this.f4399b;
            j9Var.i(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            y9Var.f(null, j9Var);
            return;
        }
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f4400c;
        if (i12 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.E));
            j9Var.r(user);
            y9Var.f(user, j9Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.E));
        j9Var.q(chat);
        y9Var.f(chat, j9Var);
    }

    public final void s(long j10) {
        ae aeVar;
        long j11;
        long j12;
        boolean z10;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (aeVar = this.f4407y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f4400c).getClientUserId();
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
                        obj.f5531a = z11;
                        obj.f5532b = false;
                        obj.f5533c = peerDialogId;
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
                obj2.f5531a = z10;
                obj2.f5532b = true;
                obj2.f5533c = clientUserId;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new a4.d(5));
            aeVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}

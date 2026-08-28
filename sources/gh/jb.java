package gh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class jb extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public long B;
    public final ih.u0 C;
    public final ih.p0 D;
    public final dp E;
    public final dg.q F;
    public final MessageObject G;
    public final ArrayList H;
    public final b I;
    public ih.h2 J;
    public int K;
    public i3 L;
    public final eq[] M;
    public boolean N;
    public boolean O;
    public qn P;
    public View Q;
    public ValueAnimator R;
    public final org.telegram.ui.ActionBar.b6 f8368b;
    public final int f8369c;
    public final boolean d;
    public final boolean f8370e;
    public final LinearLayout f8371f;
    public final FrameLayout h;
    public final LinearLayout f8372n;
    public final va f8373r;
    public final FrameLayout f8374s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.o9 f8375w;
    public final kh.d f8376x;
    public final ib f8377y;

    public jb(Context context, final int i9, final long j10, qn qnVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        TLRPC.MessageReactor messageReactor2;
        float f10;
        float f11;
        float f12;
        TLRPC.MessageReactor messageReactor3;
        boolean z13;
        String str;
        TLRPC.Chat chat;
        boolean z14;
        String formatString;
        boolean z15;
        Context context2;
        long j12;
        float f13;
        int i10;
        int i11;
        int i12;
        float f14;
        this.M = new eq[1];
        this.O = false;
        this.f8368b = b6Var;
        this.f8369c = i9;
        this.G = messageObject;
        this.H = arrayList;
        this.d = z11;
        this.f8370e = z10;
        b bVar = new b(context, i9, b6Var);
        this.I = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        g7.g6.a(bVar);
        bVar.setOnClickListener(new fh.o(context, 1, b6Var));
        long clientUserId = UserConfig.getInstance(i9).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            TLRPC.MessageReactor messageReactor4 = null;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.MessageReactor messageReactor5 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor5.peer_id);
                if (messageReactor5.anonymous && messageReactor5.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor5.my || peerDialogId == clientUserId) {
                    messageReactor4 = messageReactor5;
                }
            }
            messageReactor = messageReactor4;
        } else {
            messageReactor = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            if (arrayList != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    } else if (((TLRPC.MessageReactor) arrayList.get(i14)).my) {
                        TLRPC.MessageReactor messageReactor6 = (TLRPC.MessageReactor) arrayList.get(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            messageReactor2 = messageReactor;
            this.A = j11;
        } else {
            messageReactor2 = messageReactor;
            this.A = v7.y(i9, false).B(messageObject);
        }
        long j13 = this.A;
        this.B = j13 != 2666000 ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8371f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, g7.e6.n(-1, -2));
        this.f8373r = new va(this, context, b6Var, z11, i9);
        int i15 = 9;
        int[] iArr = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j14 = MessagesController.getInstance(i9).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        while (true) {
            if (i16 >= i15) {
                break;
            }
            int i17 = iArr[i16];
            if (i17 > j14) {
                arrayList2.add(Integer.valueOf((int) j14));
                break;
            }
            arrayList2.add(Integer.valueOf(i17));
            if (iArr[i16] == j14) {
                break;
            }
            i16++;
            i15 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            iArr2[i18] = ((Integer) arrayList2.get(i18)).intValue();
        }
        va vaVar = this.f8373r;
        vaVar.f8166a0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                vaVar.setAlpha(0.5f);
            }
            FrameLayout frameLayout2 = this.h;
            va vaVar2 = this.f8373r;
            if (z11) {
                f10 = -50.0f;
            } else {
                f10 = 0.0f;
            }
            if (z11 && !z12) {
                f11 = -40.0f;
            } else {
                f11 = 0.0f;
            }
            frameLayout2.addView(vaVar2, g7.e6.d(-1, -2.0f, 55, 0.0f, f10, 0.0f, f11));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8372n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, g7.e6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f8374s = frameLayout3;
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.v = frameLayout4;
        frameLayout4.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23091i5, b6Var)));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f8375w = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        o9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout4.addView(o9Var, g7.e6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23247r5, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout4.addView(imageView, g7.e6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout3.addView(frameLayout4, g7.e6.e(52, 28, 17));
        frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout3, g7.e6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        g7.g6.a(frameLayout3);
        c0.g(i9).o();
        bg.t tVar = new bg.t(context, 1);
        int i19 = org.telegram.ui.ActionBar.f6.G6;
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i19, b6Var));
        tVar.setTextSize(1, 20.0f);
        tVar.setGravity(17);
        tVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(tVar, g7.e6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, b6Var), mode));
        g7.g6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final jb f8851b;

            {
                this.f8851b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f8851b.dismiss();
                        return;
                    default:
                        jb jbVar = this.f8851b;
                        dp dpVar = jbVar.E;
                        dpVar.a(!dpVar.f27781a.f26313q, true);
                        if (dpVar.f27781a.f26313q) {
                            j15 = jbVar.B;
                        } else {
                            j15 = 2666000;
                        }
                        jbVar.A = j15;
                        jbVar.r();
                        ib ibVar = jbVar.f8377y;
                        if (ibVar != null) {
                            ibVar.setMyPrivacy(jbVar.A);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, g7.e6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout5 = this.h;
        if (z11) {
            f12 = 0.0f;
        } else if (z10) {
            f12 = 179.0f;
        } else {
            f12 = 45.0f;
        }
        frameLayout5.addView(linearLayout3, g7.e6.d(-1, -2.0f, 55, 0.0f, f12, 0.0f, 15.0f));
        boolean z16 = z12;
        TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        ll.n(i19, b6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor2 != null) {
            messageReactor3 = messageReactor2;
            z13 = z16;
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor3.count);
            chat = chat2;
            z14 = false;
        } else {
            messageReactor3 = messageReactor2;
            z13 = z16;
            int i20 = R.string.StarsReactionText;
            if (chat2 == null) {
                str = "";
            } else {
                str = chat2.title;
            }
            chat = chat2;
            z14 = false;
            formatString = LocaleController.formatString(i20, str);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z14));
        if (z10 && !z11) {
            linearLayout3.addView(textView, g7.e6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z13) {
            if (!z11) {
                linearLayout3.addView(new wa(context, b6Var), g7.e6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            ib ibVar = new ib(this, context, z11);
            this.f8377y = ibVar;
            ibVar.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    jb jbVar = jb.this;
                    boolean z17 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == UserConfig.getInstance(i9).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new xa(jbVar, bundle, z17));
                        jbVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        U.presentFragment(new ya(jbVar, bundle2, z17));
                    }
                    jbVar.dismiss();
                }
            });
            LinearLayout linearLayout4 = this.f8371f;
            if (z11) {
                f14 = -50.0f;
            } else {
                f14 = 0.0f;
            }
            linearLayout4.addView(ibVar, g7.e6.k(0.0f, f14, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, b6Var));
            if (!z11 && (z10 || messageReactor3 != null)) {
                this.f8371f.addView(view, g7.e6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f8377y = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.f6.f23108j5;
            TextView b10 = g7.i6.b(context, 20.0f, i21, true, b6Var);
            b10.setGravity(17);
            if (z10) {
                i11 = R.string.LiveStoryReactTitle;
            } else {
                i11 = R.string.LiveStoryReactAdminTitle;
            }
            b10.setText(LocaleController.getString(i11));
            this.f8371f.addView(b10, g7.e6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = g7.i6.b(context, 14.0f, i21, false, b6Var);
            b11.setGravity(17);
            if (z10) {
                i12 = R.string.LiveStoryReactText;
            } else if (z13) {
                i12 = R.string.LiveStoryReactAdminText;
            } else {
                i12 = R.string.LiveStoryReactAdminEmptyText;
            }
            ll.q(i12, new Object[]{DialogObject.getName(j10)}, b11);
            this.f8371f.addView(b11, g7.e6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.C = obj2;
            obj2.f12176c = this.A;
            obj2.f12179g = 50L;
            obj2.f12177e = true;
            ih.p0 p0Var = new ih.p0(i9, context, true);
            this.D = p0Var;
            p0Var.set(obj2);
            this.f8371f.addView(p0Var, g7.e6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        dp dpVar = new dp(context, 21, b6Var);
        this.E = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.f23074h7, org.telegram.ui.ActionBar.f6.f23110j7, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(true);
        if (this.A != 2666000) {
            z15 = true;
        } else {
            z15 = false;
        }
        dpVar.a(z15, false);
        ib ibVar2 = this.f8377y;
        if (ibVar2 != null) {
            ibVar2.setMyPrivacy(this.A);
        }
        dpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        ll.n(i19, b6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout5.addView(dpVar, g7.e6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout5.addView(textView2, g7.e6.q(-2, -2, 16));
        linearLayout5.setOnClickListener(new View.OnClickListener(this) {
            public final jb f8851b;

            {
                this.f8851b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f8851b.dismiss();
                        return;
                    default:
                        jb jbVar = this.f8851b;
                        dp dpVar2 = jbVar.E;
                        dpVar2.a(!dpVar2.f27781a.f26313q, true);
                        if (dpVar2.f27781a.f26313q) {
                            j15 = jbVar.B;
                        } else {
                            j15 = 2666000;
                        }
                        jbVar.A = j15;
                        jbVar.r();
                        ib ibVar3 = jbVar.f8377y;
                        if (ibVar3 != null) {
                            ibVar3.setMyPrivacy(jbVar.A);
                            return;
                        }
                        return;
                }
            }
        });
        g7.g6.b(linearLayout5, 0.05f, 1.2f);
        linearLayout5.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 6, 6));
        if (!z11 && (z10 || messageReactor3 != null)) {
            LinearLayout linearLayout6 = this.f8371f;
            if (z13) {
                i10 = 10;
            } else {
                i10 = 4;
            }
            linearLayout6.addView(linearLayout5, g7.e6.t(-2, -2, 1, 0, i10, 0, 10));
        }
        kh.d dVar = new kh.d(context, b6Var, true);
        this.f8376x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f8371f.addView(dVar, g7.e6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.M), true, true);
        if (z10) {
            j12 = 0;
            f13 = 1.0f;
            context2 = context;
            dVar.setOnClickListener(new u8(this, messageObject, qnVar, i9, z11, context, b6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
            f13 = 1.0f;
        }
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                jb.m(jb.this, i9, b6Var, j10, z11);
            }
        });
        l80 l80Var = new l80(context2, b6Var);
        l80Var.setTextSize(1, 13.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        if (z11 && !z10) {
            l80Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new e2.f(context2, 10)));
        }
        l80Var.setGravity(17);
        l80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23126k5));
        if (z10 || z11) {
            this.f8371f.addView(l80Var, g7.e6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f8371f);
        dg.q qVar = new dg.q(context2, 1, 2, 1);
        this.F = qVar;
        ag.a aVar = qVar.f205b;
        aVar.f181w = org.telegram.ui.ActionBar.f6.fk;
        aVar.f182x = org.telegram.ui.ActionBar.f6.gk;
        aVar.b();
        qVar.f205b.h = f13;
        qVar.setVisibility(4);
        qVar.setPaused(true);
        this.container.addView(qVar, g7.e6.c(150.0f, 150));
        this.f8373r.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i22)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor3 != null ? j15 - messageReactor3.count : j15;
            if (j15 > j12) {
                this.f8373r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void m(jb jbVar, int i9, org.telegram.ui.ActionBar.b6 b6Var, long j10, boolean z10) {
        long j11;
        boolean z11;
        jb jbVar2 = jbVar;
        c0 g10 = c0.g(i9);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.f7903l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i9).getCurrentUser());
        x60 F = x60.F(jbVar2.containerView, b6Var, jbVar2.v);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).f22527id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = i11;
                    } else {
                        j11 = -chat.f22380id;
                    }
                }
                jbVar2 = jbVar;
                i10 = i11;
            }
            if (j11 == j10) {
                i10 = i11;
            } else {
                long j12 = jbVar2.A;
                if (j11 != j12 && (j12 != 0 || j11 != UserConfig.getInstance(i9).getClientUserId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                F.g(tLObject, z11, new ua(jbVar2, j11, z10, 0));
                jbVar2 = jbVar;
                i10 = i11;
            }
        }
        F.f34581t = false;
        F.Y = true;
        F.f34580s = 0;
        F.V(5);
        F.Z();
    }

    @Override
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        float f10;
        float f11;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float[] fArr = {f10};
        b bVar = this.I;
        arrayList.add(ObjectAnimator.ofFloat(bVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property2, f11));
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property3, f12));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f8373r.f8176g0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.adminedChannelsLoaded) {
            q(true);
        }
    }

    @Override
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.N && !this.O) {
            this.O = true;
            MessageObject messageObject = this.G;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.A)) {
                messageObject.setMyPaidReactionDialogId(this.A);
                p7 b10 = p7.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i9 = this.f8369c;
                MessagesController messagesController = MessagesController.getInstance(i9);
                long j10 = b10.f8727a;
                int i10 = b10.f8728b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j11 = this.A;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i9).getInputPeer(this.A);
                }
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f8727a), Integer.valueOf(i10), Long.valueOf(this.A));
                ConnectionsManager.getInstance(i9).sendRequest(tL_messages_togglePaidReactionPrivacy, new bf.a(this, 10));
            }
        }
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.dismissInternal();
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar = this.I;
        if (f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    public final void o(final gh.s7 r17) {
        throw new UnsupportedOperationException("Method not decompiled: gh.jb.o(gh.s7):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f8369c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f8369c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final boolean p() {
        if (!this.d) {
            c0 g10 = c0.g(this.f8369c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f7903l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f8374s;
        int i9 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != p()) {
            if (!p()) {
                i9 = 8;
            }
            frameLayout.setVisibility(i9);
            if (z10) {
                if (p()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f8372n, changeBounds);
            }
        }
    }

    public final void r() {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.f35234p = 0.42f;
        long j10 = this.A;
        org.telegram.ui.Components.o9 o9Var = this.f8375w;
        if (j10 == 2666000) {
            z8Var.g(21);
            int i9 = org.telegram.ui.ActionBar.f6.f22985c8;
            org.telegram.ui.ActionBar.b6 b6Var = this.f8368b;
            z8Var.i(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            o9Var.e(null, z8Var);
            return;
        }
        int i10 = this.f8369c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.A));
            z8Var.r(user);
            o9Var.e(user, z8Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-this.A));
        z8Var.q(chat);
        o9Var.e(chat, z8Var);
    }

    public final void s(long j10) {
        ib ibVar;
        long j11;
        long j12;
        boolean z10;
        long j13 = 0;
        if ((!this.d || this.f8370e || j10 <= 0) && (ibVar = this.f8377y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f8369c).getClientUserId();
            int i9 = 1;
            ArrayList arrayList2 = this.H;
            if (arrayList2 != null) {
                j12 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z11 = messageReactor.anonymous;
                    if (z11) {
                        if (messageReactor.my) {
                            peerDialogId = clientUserId;
                        } else {
                            peerDialogId = (-i10) - i9;
                        }
                    }
                    if (!messageReactor.my && peerDialogId != clientUserId) {
                        long j15 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f7942a = z11;
                        obj.f7943b = false;
                        obj.f7944c = peerDialogId;
                        obj.d = j15;
                        arrayList.add(obj);
                    } else {
                        j12 = messageReactor.count;
                    }
                    i10++;
                    j13 = j14;
                    i9 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                if (this.A == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f7942a = z10;
                obj2.f7943b = true;
                obj2.f7944c = clientUserId;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new a5.e(19));
            ibVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}

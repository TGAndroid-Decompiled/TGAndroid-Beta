package mh;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class eb extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public long B;
    public long C;
    public final oh.t0 D;
    public final oh.o0 E;
    public final np F;
    public final fg.i G;
    public final MessageObject H;
    public final ArrayList I;
    public final b J;
    public oh.h2 K;
    public int L;
    public m5 M;
    public final oq[] N;
    public boolean O;
    public boolean P;
    public xn Q;
    public View R;
    public ValueAnimator S;
    public final org.telegram.ui.ActionBar.g6 f13988b;
    public final int f13989c;
    public final boolean d;
    public final boolean f13990e;
    public final LinearLayout f13991f;
    public final FrameLayout h;
    public final LinearLayout f13992n;
    public final qa f13993r;
    public final FrameLayout f13994s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.p9 f13995w;
    public final qh.d f13996x;
    public final db f13997y;

    public eb(Context context, final int i10, final long j10, xn xnVar, MessageObject messageObject, ArrayList arrayList, boolean z4, final boolean z10, long j11, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        TLRPC.MessageReactor messageReactor;
        TLRPC.MessageReactor messageReactor2;
        TLRPC.MessageReactor messageReactor3;
        boolean z11;
        TLRPC.Chat chat;
        boolean z12;
        String formatString;
        Context context2;
        long j12;
        float f10;
        int i11;
        int i12;
        this.N = new oq[1];
        this.P = false;
        this.f13988b = g6Var;
        this.f13989c = i10;
        this.H = messageObject;
        this.I = arrayList;
        this.d = z10;
        this.f13990e = z4;
        b bVar = new b(context, i10, g6Var);
        this.J = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.e6.a(bVar);
        bVar.setOnClickListener(new lh.m(context, 1, g6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
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
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z10) {
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
            this.B = j11;
        } else {
            messageReactor2 = messageReactor;
            this.B = t7.y(i10, false).B(messageObject);
        }
        long j13 = this.B;
        this.C = j13 != 2666000 ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f13991f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, k7.c6.n(-1, -2));
        this.f13993r = new qa(this, context, g6Var, z10, i10);
        int i15 = 9;
        int[] iArr = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j14 = MessagesController.getInstance(i10).starsPaidReactionAmountMax;
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
        qa qaVar = this.f13993r;
        qaVar.f13768b0 = iArr2;
        if (z4 || z10) {
            if (!z4) {
                qaVar.setAlpha(0.5f);
            }
            this.h.addView(this.f13993r, k7.c6.d(-1, -2.0f, 55, 0.0f, z10 ? -50.0f : 0.0f, 0.0f, (!z10 || z13) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f13992n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z10) {
            this.h.addView(linearLayout2, k7.c6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f13994s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21749i5, g6Var)));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f13995w = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        p9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(p9Var, k7.c6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21911r5, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, k7.c6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, k7.c6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, k7.c6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        k7.e6.a(frameLayout2);
        a0.g(i10).o();
        hg.q qVar = new hg.q(context, 1);
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i19, g6Var));
        qVar.setTextSize(1, 20.0f);
        qVar.setGravity(17);
        qVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(qVar, k7.c6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W5, g6Var), mode));
        k7.e6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final eb f14459b;

            {
                this.f14459b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f14459b.dismiss();
                        return;
                    default:
                        eb ebVar = this.f14459b;
                        np npVar = ebVar.F;
                        npVar.a(!npVar.f29606a.f24809q, true);
                        if (npVar.f29606a.f24809q) {
                            j15 = ebVar.C;
                        } else {
                            j15 = 2666000;
                        }
                        ebVar.B = j15;
                        ebVar.r();
                        db dbVar = ebVar.f13997y;
                        if (dbVar != null) {
                            dbVar.setMyPrivacy(ebVar.B);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, k7.c6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, k7.c6.d(-1, -2.0f, 55, 0.0f, z10 ? 0.0f : z4 ? 179.0f : 45.0f, 0.0f, 15.0f));
        boolean z14 = z13;
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(i19, g6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor2 != null) {
            messageReactor3 = messageReactor2;
            z11 = z14;
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor3.count);
            chat = chat2;
            z12 = false;
        } else {
            messageReactor3 = messageReactor2;
            z11 = z14;
            int i20 = R.string.StarsReactionText;
            String str = chat2 == null ? "" : chat2.title;
            chat = chat2;
            z12 = false;
            formatString = LocaleController.formatString(i20, str);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z12));
        if (z4 && !z10) {
            linearLayout3.addView(textView, k7.c6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z11) {
            if (!z10) {
                linearLayout3.addView(new ra(context, g6Var), k7.c6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            db dbVar = new db(this, context, z10);
            this.f13997y = dbVar;
            dbVar.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    eb ebVar = eb.this;
                    boolean z15 = z10;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new sa(ebVar, bundle, z15));
                        ebVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        U.presentFragment(new ta(ebVar, bundle2, z15));
                    }
                    ebVar.dismiss();
                }
            });
            this.f13991f.addView(dbVar, k7.c6.k(0.0f, z10 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, g6Var));
            if (!z10 && (z4 || messageReactor3 != null)) {
                this.f13991f.addView(view, k7.c6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f13997y = null;
        }
        if (z10) {
            int i21 = org.telegram.ui.ActionBar.k6.f21766j5;
            TextView b10 = k7.g6.b(context, 20.0f, i21, true, g6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z4 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f13991f.addView(b10, k7.c6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = k7.g6.b(context, 14.0f, i21, false, g6Var);
            b11.setGravity(17);
            if (z4) {
                i12 = R.string.LiveStoryReactText;
            } else {
                i12 = z11 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText;
            }
            org.telegram.ui.b.o(i12, new Object[]{DialogObject.getName(j10)}, b11);
            this.f13991f.addView(b11, k7.c6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z10) {
            ?? obj2 = new Object();
            this.D = obj2;
            obj2.f17757c = this.B;
            obj2.f17760g = 50L;
            obj2.f17758e = true;
            oh.o0 o0Var = new oh.o0(i10, context, true);
            this.E = o0Var;
            o0Var.set(obj2);
            this.f13991f.addView(o0Var, k7.c6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        np npVar = new np(context, 21, g6Var);
        this.F = npVar;
        npVar.b(org.telegram.ui.ActionBar.k6.f21733h7, org.telegram.ui.ActionBar.k6.f21768j7, org.telegram.ui.ActionBar.k6.f21786k7);
        npVar.setDrawUnchecked(true);
        npVar.a(this.B != 2666000, false);
        db dbVar2 = this.f13997y;
        if (dbVar2 != null) {
            dbVar2.setMyPrivacy(this.B);
        }
        npVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.l(i19, g6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(npVar, k7.c6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, k7.c6.q(-2, -2, 16));
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final eb f14459b;

            {
                this.f14459b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f14459b.dismiss();
                        return;
                    default:
                        eb ebVar = this.f14459b;
                        np npVar2 = ebVar.F;
                        npVar2.a(!npVar2.f29606a.f24809q, true);
                        if (npVar2.f29606a.f24809q) {
                            j15 = ebVar.C;
                        } else {
                            j15 = 2666000;
                        }
                        ebVar.B = j15;
                        ebVar.r();
                        db dbVar3 = ebVar.f13997y;
                        if (dbVar3 != null) {
                            dbVar3.setMyPrivacy(ebVar.B);
                            return;
                        }
                        return;
                }
            }
        });
        k7.e6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 6, 6));
        if (!z10 && (z4 || messageReactor3 != null)) {
            this.f13991f.addView(linearLayout4, k7.c6.t(-2, -2, 1, 0, z11 ? 10 : 4, 0, 10));
        }
        qh.d dVar = new qh.d(context, g6Var, true);
        this.f13996x = dVar;
        dVar.e();
        if (z4 || z10) {
            if (!z4) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f13991f.addView(dVar, k7.c6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.N), true, true);
        if (z4) {
            j12 = 0;
            f10 = 1.0f;
            i11 = 3;
            context2 = context;
            dVar.setOnClickListener(new r8(this, messageObject, xnVar, i10, z10, context, g6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
            f10 = 1.0f;
            i11 = 3;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                eb.m(eb.this, i10, g6Var, j10, z10);
            }
        });
        g90 g90Var = new g90(context2, g6Var);
        g90Var.setTextSize(1, 13.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, g6Var));
        if (z10 && !z4) {
            g90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new e2.f(context2, 10)));
        }
        g90Var.setGravity(17);
        g90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21784k5));
        if (z4 || z10) {
            this.f13991f.addView(g90Var, k7.c6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f13991f);
        fg.i iVar = new fg.i(context2, 1, 2, i11);
        this.G = iVar;
        gg.a aVar = iVar.f7087b;
        aVar.f7065w = org.telegram.ui.ActionBar.k6.fk;
        aVar.f7066x = org.telegram.ui.ActionBar.k6.gk;
        aVar.b();
        iVar.f7087b.h = f10;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        this.container.addView(iVar, k7.c6.c(150.0f, 150));
        this.f13993r.setValue(50);
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
                this.f13993r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void m(eb ebVar, int i10, org.telegram.ui.ActionBar.g6 g6Var, long j10, boolean z4) {
        long j11;
        boolean z10;
        eb ebVar2 = ebVar;
        a0 g10 = a0.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.f13676l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        q70 F = q70.F(ebVar2.containerView, g6Var, ebVar2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).f20990id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = i12;
                    } else {
                        j11 = -chat.f20843id;
                    }
                }
                ebVar2 = ebVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = ebVar2.B;
                if (j11 != j12 && (j12 != 0 || j11 != UserConfig.getInstance(i10).getClientUserId())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                F.g(tLObject, z10, new pa(ebVar2, j11, z4, 0));
                ebVar2 = ebVar;
                i11 = i12;
            }
        }
        F.f30330t = false;
        F.Y = true;
        F.f30329s = 0;
        F.V(5);
        F.Z();
    }

    @Override
    public final void appendOpenAnimator(boolean z4, ArrayList arrayList) {
        float f10;
        float f11;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float[] fArr = {f10};
        b bVar = this.J;
        arrayList.add(ObjectAnimator.ofFloat(bVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property2, f11));
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property3, f12));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f13993r.f13777h0) {
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
        if (!this.O && !this.P) {
            this.P = true;
            MessageObject messageObject = this.H;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.B)) {
                messageObject.setMyPaidReactionDialogId(this.B);
                n7 b10 = n7.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f13989c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.f14490a;
                int i11 = b10.f14491b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.B;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.B);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f14490a), Integer.valueOf(i11), Long.valueOf(this.B));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new gf.a(this, 10));
            }
        }
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.dismissInternal();
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar = this.J;
        if (f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    public final void o(final mh.q7 r17) {
        throw new UnsupportedOperationException("Method not decompiled: mh.eb.o(mh.q7):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f13989c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f13989c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final boolean p() {
        if (!this.d) {
            a0 g10 = a0.g(this.f13989c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f13676l;
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

    public final void q(boolean z4) {
        boolean z10;
        FrameLayout frameLayout = this.f13994s;
        int i10 = 0;
        if (frameLayout.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != p()) {
            if (!p()) {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z4) {
                if (p()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f13992n, changeBounds);
            }
        }
    }

    public final void r() {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.f33803p = 0.42f;
        long j10 = this.B;
        org.telegram.ui.Components.p9 p9Var = this.f13995w;
        if (j10 == 2666000) {
            z8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.k6.f21643c8;
            org.telegram.ui.ActionBar.g6 g6Var = this.f13988b;
            z8Var.i(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            p9Var.e(null, z8Var);
            return;
        }
        int i11 = this.f13989c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.B));
            z8Var.r(user);
            p9Var.e(user, z8Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.B));
        z8Var.q(chat);
        p9Var.e(chat, z8Var);
    }

    public final void s(long j10) {
        db dbVar;
        long j11;
        long j12;
        boolean z4;
        long j13 = 0;
        if ((!this.d || this.f13990e || j10 <= 0) && (dbVar = this.f13997y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f13989c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.I;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        if (messageReactor.my) {
                            peerDialogId = clientUserId;
                        } else {
                            peerDialogId = (-i11) - i10;
                        }
                    }
                    if (!messageReactor.my && peerDialogId != clientUserId) {
                        long j15 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f15065a = z10;
                        obj.f15066b = false;
                        obj.f15067c = peerDialogId;
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
                if (this.B == 2666000) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ?? obj2 = new Object();
                obj2.f15065a = z4;
                obj2.f15066b = true;
                obj2.f15067c = clientUserId;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new e5.f(20));
            dbVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}

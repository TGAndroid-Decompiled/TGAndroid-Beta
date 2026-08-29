package jh;

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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class db extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public long B;
    public final lh.s0 C;
    public final lh.n0 D;
    public final hp E;
    public final cg.i F;
    public final MessageObject G;
    public final ArrayList H;
    public final b I;
    public lh.f2 J;
    public int K;
    public l4.s0 L;
    public final iq[] M;
    public boolean N;
    public boolean O;
    public tn P;
    public View Q;
    public ValueAnimator R;
    public final org.telegram.ui.ActionBar.c6 f11973b;
    public final int f11974c;
    public final boolean d;
    public final boolean f11975e;
    public final LinearLayout f11976f;
    public final FrameLayout h;
    public final LinearLayout f11977n;
    public final pa f11978r;
    public final FrameLayout f11979s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.t9 f11980w;
    public final nh.d f11981x;
    public final cb f11982y;

    public db(Context context, final int i10, final long j10, tn tnVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        TLRPC.MessageReactor messageReactor;
        TLRPC.MessageReactor messageReactor2;
        TLRPC.MessageReactor messageReactor3;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        String formatString;
        Context context2;
        long j12;
        float f9;
        int i11;
        int i12;
        this.M = new iq[1];
        this.O = false;
        this.f11973b = c6Var;
        this.f11974c = i10;
        this.G = messageObject;
        this.H = arrayList;
        this.d = z11;
        this.f11975e = z10;
        b bVar = new b(context, i10, c6Var);
        this.I = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        i7.h6.a(bVar);
        bVar.setOnClickListener(new ih.n(context, 1, c6Var));
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
        boolean z14 = (arrayList == null || arrayList.isEmpty()) ? false : true;
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
            this.A = s7.y(i10, false).B(messageObject);
        }
        long j13 = this.A;
        this.B = j13 != 2666000 ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11976f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, i7.f6.n(-1, -2));
        this.f11978r = new pa(this, context, c6Var, z11, i10);
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
        pa paVar = this.f11978r;
        paVar.f11749a0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                paVar.setAlpha(0.5f);
            }
            this.h.addView(this.f11978r, i7.f6.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z14) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f11977n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, i7.f6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11979s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23151i5, c6Var)));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f11980w = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        t9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(t9Var, i7.f6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23310r5, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, i7.f6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, i7.f6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, i7.f6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        i7.h6.a(frameLayout2);
        b0.g(i10).o();
        eg.r rVar = new eg.r(context, 1);
        int i19 = org.telegram.ui.ActionBar.g6.G6;
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i19, c6Var));
        rVar.setTextSize(1, 20.0f);
        rVar.setGravity(17);
        rVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(rVar, i7.f6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, c6Var), mode));
        i7.h6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final db f12440b;

            {
                this.f12440b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f12440b.dismiss();
                        return;
                    default:
                        db dbVar = this.f12440b;
                        hp hpVar = dbVar.E;
                        hpVar.a(!hpVar.f29211a.f26324q, true);
                        if (hpVar.f29211a.f26324q) {
                            j15 = dbVar.B;
                        } else {
                            j15 = 2666000;
                        }
                        dbVar.A = j15;
                        dbVar.r();
                        cb cbVar = dbVar.f11982y;
                        if (cbVar != null) {
                            cbVar.setMyPrivacy(dbVar.A);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, i7.f6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, i7.f6.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        boolean z15 = z14;
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(i19, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor2 != null) {
            messageReactor3 = messageReactor2;
            z12 = z15;
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor3.count);
            chat = chat2;
            z13 = false;
        } else {
            messageReactor3 = messageReactor2;
            z12 = z15;
            int i20 = R.string.StarsReactionText;
            String str = chat2 == null ? "" : chat2.title;
            chat = chat2;
            z13 = false;
            formatString = LocaleController.formatString(i20, str);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z13));
        if (z10 && !z11) {
            linearLayout3.addView(textView, i7.f6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new qa(context, c6Var), i7.f6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            cb cbVar = new cb(this, context, z11);
            this.f11982y = cbVar;
            cbVar.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    db dbVar = db.this;
                    boolean z16 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new ra(dbVar, bundle, z16));
                        dbVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        U.presentFragment(new sa(dbVar, bundle2, z16));
                    }
                    dbVar.dismiss();
                }
            });
            this.f11976f.addView(cbVar, i7.f6.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, c6Var));
            if (!z11 && (z10 || messageReactor3 != null)) {
                this.f11976f.addView(view, i7.f6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f11982y = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.g6.f23169j5;
            TextView b10 = i7.j6.b(context, 20.0f, i21, true, c6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f11976f.addView(b10, i7.f6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = i7.j6.b(context, 14.0f, i21, false, c6Var);
            b11.setGravity(17);
            if (z10) {
                i12 = R.string.LiveStoryReactText;
            } else {
                i12 = z12 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText;
            }
            org.telegram.ui.b.p(i12, new Object[]{DialogObject.getName(j10)}, b11);
            this.f11976f.addView(b11, i7.f6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.C = obj2;
            obj2.f16196c = this.A;
            obj2.f16199g = 50L;
            obj2.f16197e = true;
            lh.n0 n0Var = new lh.n0(i10, context, true);
            this.D = n0Var;
            n0Var.set(obj2);
            this.f11976f.addView(n0Var, i7.f6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        hp hpVar = new hp(context, 21, c6Var);
        this.E = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.f23135h7, org.telegram.ui.ActionBar.g6.f23171j7, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(this.A != 2666000, false);
        cb cbVar2 = this.f11982y;
        if (cbVar2 != null) {
            cbVar2.setMyPrivacy(this.A);
        }
        hpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.m(i19, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(hpVar, i7.f6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, i7.f6.q(-2, -2, 16));
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final db f12440b;

            {
                this.f12440b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f12440b.dismiss();
                        return;
                    default:
                        db dbVar = this.f12440b;
                        hp hpVar2 = dbVar.E;
                        hpVar2.a(!hpVar2.f29211a.f26324q, true);
                        if (hpVar2.f29211a.f26324q) {
                            j15 = dbVar.B;
                        } else {
                            j15 = 2666000;
                        }
                        dbVar.A = j15;
                        dbVar.r();
                        cb cbVar3 = dbVar.f11982y;
                        if (cbVar3 != null) {
                            cbVar3.setMyPrivacy(dbVar.A);
                            return;
                        }
                        return;
                }
            }
        });
        i7.h6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 6, 6));
        if (!z11 && (z10 || messageReactor3 != null)) {
            this.f11976f.addView(linearLayout4, i7.f6.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        nh.d dVar = new nh.d(context, c6Var, true);
        this.f11981x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f11976f.addView(dVar, i7.f6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(ia.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.M), true, true);
        if (z10) {
            j12 = 0;
            f9 = 1.0f;
            i11 = 3;
            context2 = context;
            dVar.setOnClickListener(new q8(this, messageObject, tnVar, i10, z11, context, c6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
            f9 = 1.0f;
            i11 = 3;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                db.m(db.this, i10, c6Var, j10, z11);
            }
        });
        y80 y80Var = new y80(context2, c6Var);
        y80Var.setTextSize(1, 13.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        if (z11 && !z10) {
            y80Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new e2.e(context2, 10)));
        }
        y80Var.setGravity(17);
        y80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23188k5));
        if (z10 || z11) {
            this.f11976f.addView(y80Var, i7.f6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f11976f);
        cg.i iVar = new cg.i(context2, 1, 2, i11);
        this.F = iVar;
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = org.telegram.ui.ActionBar.g6.fk;
        aVar.f5569x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.f5590b.h = f9;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        this.container.addView(iVar, i7.f6.c(150.0f, 150));
        this.f11978r.setValue(50);
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
                this.f11978r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void m(db dbVar, int i10, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z10) {
        long j11;
        boolean z11;
        db dbVar2 = dbVar;
        b0 g10 = b0.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.f11783l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        j70 F = j70.F(dbVar2.containerView, c6Var, dbVar2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).f22539id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = i12;
                    } else {
                        j11 = -chat.f22392id;
                    }
                }
                dbVar2 = dbVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = dbVar2.A;
                if (j11 != j12 && (j12 != 0 || j11 != UserConfig.getInstance(i10).getClientUserId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                F.g(tLObject, z11, new oa(dbVar2, j11, z10, 0));
                dbVar2 = dbVar;
                i11 = i12;
            }
        }
        F.f29601t = false;
        F.Y = true;
        F.f29600s = 0;
        F.V(5);
        F.Z();
    }

    @Override
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        float f9;
        float f10;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float[] fArr = {f9};
        b bVar = this.I;
        arrayList.add(ObjectAnimator.ofFloat(bVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property2, f10));
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property3, f11));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f11978r.f11759g0) {
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
        if (!this.N && !this.O) {
            this.O = true;
            MessageObject messageObject = this.G;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.A)) {
                messageObject.setMyPaidReactionDialogId(this.A);
                m7 b10 = m7.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f11974c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.f12468a;
                int i11 = b10.f12469b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.A;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.A);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f12468a), Integer.valueOf(i11), Long.valueOf(this.A));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new ef.a(this, 10));
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
    public final boolean isTouchOutside(float f9, float f10) {
        b bVar = this.I;
        if (f9 >= bVar.getX() && f9 <= bVar.getX() + bVar.getWidth() && f10 >= bVar.getY() && f10 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f9, f10);
    }

    public final void o(final jh.p7 r17) {
        throw new UnsupportedOperationException("Method not decompiled: jh.db.o(jh.p7):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f11974c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f11974c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final boolean p() {
        if (!this.d) {
            b0 g10 = b0.g(this.f11974c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f11783l;
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
        FrameLayout frameLayout = this.f11979s;
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
                TransitionManager.beginDelayedTransition(this.f11977n, changeBounds);
            }
        }
    }

    public final void r() {
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.f27964p = 0.42f;
        long j10 = this.A;
        org.telegram.ui.Components.t9 t9Var = this.f11980w;
        if (j10 == 2666000) {
            e9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.g6.f23046c8;
            org.telegram.ui.ActionBar.c6 c6Var = this.f11973b;
            e9Var.i(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            t9Var.e(null, e9Var);
            return;
        }
        int i11 = this.f11974c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.A));
            e9Var.r(user);
            t9Var.e(user, e9Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.A));
        e9Var.q(chat);
        t9Var.e(chat, e9Var);
    }

    public final void s(long j10) {
        cb cbVar;
        long j11;
        long j12;
        boolean z10;
        long j13 = 0;
        if ((!this.d || this.f11975e || j10 <= 0) && (cbVar = this.f11982y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f11974c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.H;
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
                        obj.f13041a = z11;
                        obj.f13042b = false;
                        obj.f13043c = peerDialogId;
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
                if (this.A == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f13041a = z10;
                obj2.f13042b = true;
                obj2.f13043c = clientUserId;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new c5.e(19));
            cbVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}

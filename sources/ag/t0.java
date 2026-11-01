package ag;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.m4;
import j$.util.Objects;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import lg.s;
import mg.p;
import mg.x0;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.r20;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a5;
import org.telegram.ui.b5;
import org.telegram.ui.be;
import org.telegram.ui.cr0;
import org.telegram.ui.d7;
import org.telegram.ui.h4;
import org.telegram.ui.i7;
import org.telegram.ui.j9;
import org.telegram.ui.l60;
import org.telegram.ui.le;
import org.telegram.ui.m7;
import org.telegram.ui.m8;
import org.telegram.ui.n8;
import org.telegram.ui.qv0;
import org.telegram.ui.rd;
import org.telegram.ui.s61;
import org.telegram.ui.sd;
import org.telegram.ui.u3;
import org.telegram.ui.un;
import org.telegram.ui.w6;
import org.telegram.ui.y6;
import org.telegram.ui.zd;
import vh.s7;
import vh.v3;
import w7.b6;
public final class t0 implements View.OnClickListener {
    public final int f710a;
    public final Object f711b;
    public final Object f712c;

    public t0(int i10, Object obj, Object obj2) {
        this.f710a = i10;
        this.f711b = obj;
        this.f712c = obj2;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        jg.s2 j10;
        int i10;
        int i11;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        ?? r10;
        String str5;
        String str6;
        boolean z11;
        switch (this.f710a) {
            case 0:
                org.telegram.messenger.i0.g(((TL_account.TL_businessChatLink) this.f711b).link);
                cc.a0((un) this.f712c).k(false).j();
                return;
            case 1:
                j1 j1Var = (j1) this.f711b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.f712c;
                x0 x0Var = j1Var.R1;
                vh.d dVar = j1Var.V1;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = wp.r1(j1Var.f21584a).n1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = x0Var.b();
                    ConnectionsManager.getInstance(j1Var.f21584a).sendRequest(updateconnectedbot, new p0(j1Var, tL_connectedBot, x0Var.c(), 1));
                    return;
                }
                return;
            case 2:
                ai.c cVar = (ai.c) this.f711b;
                cVar.getClass();
                ((Runnable) this.f712c).run();
                cVar.dismiss();
                return;
            case 3:
                bi.k2.c0((bi.k2) this.f711b, (Context) this.f712c, view);
                return;
            case 4:
                ig.u uVar = (ig.u) this.f711b;
                Context context = (Context) this.f712c;
                androidx.activity.o oVar = uVar.f8479o1;
                switch (oVar.f952a) {
                    case 3:
                        z10 = oVar.f953b;
                        break;
                    default:
                        z10 = oVar.f953b;
                        break;
                }
                if (!z10) {
                    androidx.activity.o oVar2 = uVar.f8479o1;
                    switch (oVar2.f952a) {
                        case 3:
                            view2 = (cr0) oVar2.d;
                            break;
                        default:
                            view2 = (s7) oVar2.d;
                            break;
                    }
                    Bitmap M3 = org.telegram.messenger.i0.M3(view2);
                    Bitmap createBitmap = Bitmap.createBitmap(M3.getWidth(), M3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    androidx.activity.o oVar3 = uVar.f8479o1;
                    switch (oVar3.f952a) {
                        case 3:
                            jg.j0 j0Var = ((cr0) oVar3.d).F0;
                            Matrix matrix = j0Var.getMatrix();
                            canvas.save();
                            canvas.translate(j0Var.getX(), j0Var.getY());
                            canvas.concat(matrix);
                            Bitmap bitmap2 = (Bitmap) oVar3.f954c;
                            canvas.scale(j0Var.getWidth() / bitmap2.getWidth(), j0Var.getHeight() / bitmap2.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            canvas.drawBitmap(M3, 0.0f, 0.0f, (Paint) null);
                            M3.recycle();
                            ig.j jVar = new ig.j(uVar, context, createBitmap);
                            androidx.activity.o oVar4 = uVar.f8479o1;
                            switch (oVar4.f952a) {
                                case 3:
                                    frameLayout = ((cr0) oVar4.d).N0;
                                    break;
                                default:
                                    frameLayout = ((s7) oVar4.d).E0;
                                    break;
                            }
                            frameLayout.addView(jVar, b6.c(-1.0f, -1));
                            androidx.activity.o oVar5 = uVar.f8479o1;
                            Objects.requireNonNull(oVar5);
                            jVar.setColorListener(new ig.i(oVar5, 0));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                            duration.setInterpolator(gr.f26523f);
                            duration.addUpdateListener(new bg.k(jVar, 6));
                            duration.start();
                            androidx.activity.o oVar6 = uVar.f8479o1;
                            switch (oVar6.f952a) {
                                case 3:
                                    oVar6.f953b = true;
                                    break;
                                default:
                                    oVar6.f953b = true;
                                    break;
                            }
                            uVar.dismiss();
                            return;
                        default:
                            v3 v3Var = ((s7) oVar3.d).f51003x0;
                            Matrix matrix2 = v3Var.getMatrix();
                            canvas.save();
                            canvas.translate(v3Var.getX(), v3Var.getY());
                            canvas.concat(matrix2);
                            v3Var.getWidth();
                            throw null;
                    }
                }
                return;
            case 5:
                jn.g0((un) this.f712c, 41026, new l((ih.d) this.f711b, 12), null);
                return;
            case 6:
                jg.v2 v2Var = (jg.v2) this.f711b;
                ll llVar = (ll) this.f712c;
                jg.s2[] s2VarArr = v2Var.H;
                if (s2VarArr != null && s2VarArr.length != 0 && v2Var.I != null && (j10 = v2Var.j(v2Var.f10326n0, v2Var.f10327o0)) != null) {
                    llVar.a(j10);
                    return;
                }
                return;
            case 7:
                kg.q0 q0Var = (kg.q0) this.f711b;
                Context context2 = (Context) this.f712c;
                org.telegram.ui.ActionBar.k2 k2Var = q0Var.C2;
                int i12 = q0Var.Z1;
                if (i12 != 11 && i12 != 34) {
                    if (i12 != 19 && i12 != 32 && !q0Var.s1()) {
                        if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                            if (!e20.i(q0Var.f21584a).q() && !wp.r1(q0Var.f21584a).A3() && !q0Var.F2) {
                                if (k2Var != null) {
                                    if (k2Var.getVisibleDialog() != null) {
                                        k2Var.getVisibleDialog().dismiss();
                                    }
                                    k2Var.presentFragment(new PremiumPreviewFragment(0, kg.q0.u1(i12)));
                                    q0Var.dismiss();
                                    return;
                                }
                                return;
                            }
                            q0Var.dismiss();
                            return;
                        }
                        org.telegram.messenger.i0.g(q0Var.k1());
                        q0Var.dismiss();
                        return;
                    }
                    org.telegram.messenger.h3 h3Var = q0Var.U1;
                    if (h3Var.f16006b) {
                        if (e20.i(q0Var.f21584a).q() && mg.k0.i()) {
                            mg.p.i(q0Var.S1, q0Var);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, q0Var.I0);
                        alertDialog$Builder.f20135a.R = dd.L0(2131747047, null);
                        if (q0Var.r1()) {
                            i10 = 2131747045;
                        } else {
                            i10 = 2131747046;
                        }
                        alertDialog$Builder.f20135a.T = org.telegram.messenger.i0.W2(dd.L0(i10, null));
                        alertDialog$Builder.k(dd.L0(2131752152, null), new kg.b0(q0Var, 0));
                        alertDialog$Builder.h(dd.L0(2131752589, null), new k2.k0(2));
                        alertDialog$Builder.p();
                        return;
                    }
                    boolean z12 = h3Var.f16005a;
                    if (z12 && h3Var.f16007c == 0) {
                        if (h3Var.e && mg.k0.i()) {
                            q0Var.X1 = true;
                            q0Var.f11240p2.f24104d0 = false;
                            org.telegram.ui.ActionBar.k2 k2Var2 = q0Var.f26727o1;
                            org.telegram.messenger.h3 h3Var2 = q0Var.U1;
                            mg.o1 o1Var = new mg.o1(k2Var2, h3Var2.h, h3Var2.f16012k);
                            o1Var.show();
                            o1Var.H0 = new x(q0Var, 4);
                            return;
                        }
                        q0Var.i1();
                        return;
                    } else if (z12) {
                        FrameLayout frameLayout2 = new FrameLayout(q0Var.getContext());
                        g9 g9Var = new g9(q0Var.getContext());
                        g9Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                        frameLayout2.addView(g9Var, b6.c(60.0f, 60));
                        frameLayout2.setClipChildren(false);
                        Paint paint = new Paint(1);
                        paint.setColor(t6.x0(null, t6.f21002h5, false));
                        frameLayout2.addView(new kg.f0(q0Var.getContext(), paint, q0Var.getContext().getDrawable(2131231127)), b6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                        ImageView imageView = new ImageView(q0Var.getContext());
                        imageView.setImageResource(2131232055);
                        a7.t(imageView, t6.f21096m6, null, PorterDuff.Mode.SRC_ATOP);
                        frameLayout2.addView(imageView, b6.e(24, 24, 17));
                        g9 g9Var2 = new g9(q0Var.getContext());
                        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                        frameLayout2.addView(g9Var2, b6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                        FrameLayout frameLayout3 = new FrameLayout(q0Var.getContext());
                        frameLayout3.addView(frameLayout2, b6.e(-2, 60, 1));
                        frameLayout3.setClipChildren(false);
                        TextView textView = new TextView(context2);
                        textView.setLetterSpacing(0.025f);
                        a7.V(textView, t6.f21038j5, null);
                        textView.setTextSize(1, 16.0f);
                        frameLayout3.addView(textView, b6.t(-1, -2, 0, 24, 80, 24, 0));
                        r8 r8Var = new r8((p6) null);
                        TLRPC.Chat L0 = wp.r1(q0Var.f21584a).L0(Long.valueOf(-q0Var.U1.f16007c));
                        r8Var.q(L0);
                        g9Var.e(L0, r8Var);
                        r8 r8Var2 = new r8((p6) null);
                        TLRPC.Chat L02 = wp.r1(q0Var.f21584a).L0(Long.valueOf(-q0Var.S1));
                        r8Var2.q(L02);
                        g9Var2.e(L02, r8Var2);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.o(frameLayout3);
                        m5.q("ReplaceBoostChannelDescription", null, 2131746285, new Object[]{L0.title, L02.title}, textView);
                        alertDialog$Builder2.k(dd.L0(2131746287, null), new kg.b0(q0Var, 1));
                        alertDialog$Builder2.h(dd.L0(2131752589, null), new k2.k0(3));
                        alertDialog$Builder2.p();
                        return;
                    } else {
                        int i13 = h3Var.f16008f;
                        if (i13 != 0) {
                            mg.p.g(i13);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 8:
                mg.o1 o1Var2 = (mg.o1) this.f711b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f712c;
                ArrayList arrayList = o1Var2.P1;
                if (!arrayList.isEmpty()) {
                    mg.z0 z0Var = o1Var2.S1;
                    if (!z0Var.Q) {
                        z0Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(o5.o(tL_myBoost.peer)));
                        }
                        mg.k0.a(chat.f19794id, arrayList2, new m2(o1Var2, chat, arrayList2, hashSet, 2), new l(o1Var2, 19));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                mg.i2 i2Var = (mg.i2) this.f711b;
                ArrayList arrayList3 = (ArrayList) this.f712c;
                HashSet hashSet2 = i2Var.Z1;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList3.get(i15);
                    i15++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    i2Var.f13143f2.remove(l4);
                }
                i2Var.e1();
                i2Var.R1.b(true, hashSet2, new mg.w1(i2Var, 5), null);
                i2Var.p1(true, true);
                i2Var.f1();
                return;
            case 10:
                final mg.i2 i2Var2 = (mg.i2) this.f711b;
                final TLRPC.User user = (TLRPC.User) this.f712c;
                z60 F = z60.F(i2Var2.f21590c, i2Var2.I0, (View) view.getParent());
                F.c(2131232579, dd.L0(2131745618, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    k2 k2Var3 = i2Var2.f26727o1;
                                    if (k2Var3 == null) {
                                        k2 T = LaunchActivity.T();
                                        ?? obj3 = new Object();
                                        obj3.f20390a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f19943id);
                                            T.showAsSheet(new un(bundle), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f19943id);
                                    k2Var3.presentFragment(new un(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    k2 k2Var4 = i2Var2.f26727o1;
                                    if (k2Var4 == null) {
                                        k2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj4 = new Object();
                                            obj4.f20390a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f19943id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f19943id);
                                    k2Var4.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                F.c(2131232265, dd.L0(2131747802, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    k2 k2Var3 = i2Var2.f26727o1;
                                    if (k2Var3 == null) {
                                        k2 T = LaunchActivity.T();
                                        ?? obj3 = new Object();
                                        obj3.f20390a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f19943id);
                                            T.showAsSheet(new un(bundle), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f19943id);
                                    k2Var3.presentFragment(new un(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    k2 k2Var4 = i2Var2.f26727o1;
                                    if (k2Var4 == null) {
                                        k2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj4 = new Object();
                                            obj4.f20390a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f19943id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f19943id);
                                    k2Var4.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                F.Z();
                return;
            case 11:
                final ng.f fVar = (ng.f) this.f711b;
                final og.a aVar = (og.a) this.f712c;
                if (fVar.d) {
                    if (!aVar.f14166a.Q) {
                        aVar.b(true);
                        String str7 = fVar.h;
                        r20 r20Var = new r20() {
                            @Override
                            public final void a(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        x0 x0Var2 = (x0) fVar;
                                        i0.h3(new s(x0Var2, 9), 200L);
                                        x0Var2.f13287r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        f fVar2 = fVar;
                                        p.c((TLRPC.TL_error) obj3, fVar2.f13779n, fVar2.f13777c, new c(fVar2, 1));
                                        return;
                                }
                            }
                        };
                        r20 r20Var2 = new r20() {
                            @Override
                            public final void a(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        x0 x0Var2 = (x0) fVar;
                                        i0.h3(new s(x0Var2, 9), 200L);
                                        x0Var2.f13287r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        f fVar2 = fVar;
                                        p.c((TLRPC.TL_error) obj3, fVar2.f13779n, fVar2.f13777c, new c(fVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e20.f15506s0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str7;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new mg.b0(r20Var2, r20Var, 0), 2);
                        return;
                    }
                    return;
                }
                ((mg.x0) fVar).f13287r.dismiss();
                return;
            case 12:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f712c;
                og.g gVar = ((og.h) this.f711b).f14200w;
                if (gVar != null) {
                    mg.w0 w0Var = ((mg.m0) gVar).f13188a;
                    w0Var.U1.remove(chat2);
                    w0Var.k1(true, true);
                    return;
                }
                return;
            case 13:
                ((l) this.f711b).a((TLRPC.TL_payments_checkedGiftCode) this.f712c);
                return;
            case 14:
                ((l) this.f711b).a((TLRPC.Chat) this.f712c);
                return;
            case 15:
                ((VideoAds) this.f711b).lambda$show$2((VideoAds.CloseDrawable) this.f712c, view);
                return;
            case 16:
                ((VideoAds) this.f711b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f712c, view);
                return;
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f711b;
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.f712c;
                int indexOf = t0Var.f20835g0.indexOf(s0Var.getFilter());
                if (t0Var.f20836h0 != indexOf) {
                    t0Var.f20836h0 = indexOf;
                    t0Var.D();
                    return;
                } else if (s0Var.getFilter().h) {
                    if (!s0Var.f20754a.f7022f) {
                        s0Var.setSelectedForDelete(true);
                        return;
                    }
                    zf.e0 filter = s0Var.getFilter();
                    t0Var.I(filter);
                    org.telegram.ui.ActionBar.p0 p0Var = t0Var.H;
                    if (p0Var != null) {
                        p0Var.j(filter);
                        t0Var.H.l(t0Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 18:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f711b;
                org.telegram.ui.ActionBar.t0 t0Var2 = (org.telegram.ui.ActionBar.t0) this.f712c;
                if (t0Var2.x() && r0Var.f20713f) {
                    if (!t0Var2.T) {
                        t0Var2.T = true;
                        t0Var2.q();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = t0Var2.f20829c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.o0 o0Var = t0Var2.P;
                if (o0Var != null) {
                    o0Var.k(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f711b;
                if (!((org.telegram.ui.ActionBar.q1) this.f712c).f21412a) {
                    org.telegram.ui.ActionBar.u1 u1Var = x1Var.f21498o0;
                    if (u1Var != null) {
                        u1Var.h(x1Var, -1);
                    }
                    if (x1Var.f21491j0) {
                        x1Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.f711b;
                if (!((org.telegram.ui.ActionBar.q1) this.f712c).f21412a) {
                    org.telegram.ui.ActionBar.u1 u1Var2 = x1Var2.f21500q0;
                    if (u1Var2 != null) {
                        u1Var2.h(x1Var2, -2);
                    }
                    if (x1Var2.f21491j0) {
                        x1Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.x1 x1Var3 = (org.telegram.ui.ActionBar.x1) this.f711b;
                if (!((org.telegram.ui.ActionBar.q1) this.f712c).f21412a) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = x1Var3.f21506u0;
                    if (u1Var3 != null) {
                        u1Var3.h(x1Var3, -2);
                    }
                    if (x1Var3.f21491j0) {
                        x1Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ActionBar.x1 x1Var4 = (org.telegram.ui.ActionBar.x1) this.f711b;
                if (!((org.telegram.ui.ActionBar.q1) this.f712c).f21412a) {
                    m4 m4Var = x1Var4.f21504s0;
                    if (m4Var != null) {
                        m4Var.h(x1Var4, -2);
                    }
                    if (x1Var4.f21491j0) {
                        x1Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                h4 h4Var = (h4) this.f711b;
                Activity activity = (Activity) this.f712c;
                u3 u3Var = h4Var.K;
                if (!h4Var.f37679h0.A0) {
                    org.telegram.ui.l3 l3Var = h4Var.f37691u0[0];
                    if (l3Var.f()) {
                        if (l3Var.getWebView() != null && !h4Var.f37679h0.W) {
                            if (h4Var.f37680i0 != null) {
                                org.telegram.ui.web.v0 webView = l3Var.getWebView();
                                if (webView != null) {
                                    str = webView.getTitle();
                                } else {
                                    str = null;
                                }
                                if (webView != null) {
                                    str2 = webView.getUrl();
                                } else {
                                    str2 = null;
                                }
                                String u10 = org.telegram.ui.web.z0.u(str2);
                                org.telegram.ui.web.j jVar2 = h4Var.f37680i0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = dd.L0(2131742952, null);
                                }
                                if (TextUtils.isEmpty(u10)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = u10;
                                }
                                org.telegram.ui.v vVar = new org.telegram.ui.v(h4Var, u10, 0);
                                org.telegram.ui.w wVar = new org.telegram.ui.w(h4Var, l3Var, activity, 0);
                                org.telegram.ui.p pVar = new org.telegram.ui.p(h4Var, 1);
                                org.telegram.ui.p pVar2 = new org.telegram.ui.p(h4Var, 2);
                                org.telegram.ui.x xVar = new org.telegram.ui.x(h4Var, u10, l3Var, 0);
                                ii iiVar = jVar2.f42874x;
                                ImageView imageView2 = jVar2.f42869f;
                                if (bitmap == null) {
                                    imageView2.setImageResource(2131232193);
                                    str4 = str3;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(jVar2.H, PorterDuff.Mode.SRC_IN));
                                    r10 = 0;
                                } else {
                                    str4 = str3;
                                    imageView2.setImageDrawable(new BitmapDrawable(jVar2.getContext().getResources(), bitmap));
                                    r10 = 0;
                                    imageView2.setColorFilter((ColorFilter) null);
                                }
                                TextView textView2 = jVar2.f42871r;
                                textView2.setText(k6.m(str, textView2.getPaint().getFontMetricsInt(), false, r10, 0));
                                try {
                                    Uri parse = Uri.parse(str4);
                                    str5 = gf.f.u(parse, r10, r10, gf.f.a(parse.getHost()), r10);
                                } catch (Exception e) {
                                    try {
                                        f8.g(e, false);
                                        str5 = str4;
                                    } catch (Exception e7) {
                                        e = e7;
                                        str5 = str4;
                                        f8.g(e, true);
                                        str6 = str5;
                                        TextView textView3 = jVar2.f42872s;
                                        i11 = 0;
                                        textView3.setText(k6.m(str6, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                                        jVar2.L = wVar;
                                        jVar2.M = pVar;
                                        jVar2.N = pVar2;
                                        jVar2.e.setOnClickListener(new qv0(18, jVar2, vVar));
                                        jVar2.f42870n.setOnClickListener(xVar);
                                        jVar2.f42867b = false;
                                        jVar2.setInput(null);
                                        iiVar.f31183f3.O(true);
                                        iiVar.v0(0);
                                        org.telegram.ui.m0 m0Var = h4Var.f37679h0;
                                        e0 e0Var = new e0(12, l3Var, activity);
                                        zd zdVar = m0Var.f42897b0;
                                        zdVar.setText("");
                                        zdVar.setSelection(i11, zdVar.getText().length());
                                        zdVar.setScrollX(i11);
                                        m0Var.f42921v0 = e0Var;
                                        m0Var.k(true);
                                        return;
                                    }
                                }
                                try {
                                    str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e10) {
                                    e = e10;
                                    f8.g(e, true);
                                    str6 = str5;
                                    TextView textView32 = jVar2.f42872s;
                                    i11 = 0;
                                    textView32.setText(k6.m(str6, textView32.getPaint().getFontMetricsInt(), false, null, 0));
                                    jVar2.L = wVar;
                                    jVar2.M = pVar;
                                    jVar2.N = pVar2;
                                    jVar2.e.setOnClickListener(new qv0(18, jVar2, vVar));
                                    jVar2.f42870n.setOnClickListener(xVar);
                                    jVar2.f42867b = false;
                                    jVar2.setInput(null);
                                    iiVar.f31183f3.O(true);
                                    iiVar.v0(0);
                                    org.telegram.ui.m0 m0Var2 = h4Var.f37679h0;
                                    e0 e0Var2 = new e0(12, l3Var, activity);
                                    zd zdVar2 = m0Var2.f42897b0;
                                    zdVar2.setText("");
                                    zdVar2.setSelection(i11, zdVar2.getText().length());
                                    zdVar2.setScrollX(i11);
                                    m0Var2.f42921v0 = e0Var2;
                                    m0Var2.k(true);
                                    return;
                                }
                                TextView textView322 = jVar2.f42872s;
                                i11 = 0;
                                textView322.setText(k6.m(str6, textView322.getPaint().getFontMetricsInt(), false, null, 0));
                                jVar2.L = wVar;
                                jVar2.M = pVar;
                                jVar2.N = pVar2;
                                jVar2.e.setOnClickListener(new qv0(18, jVar2, vVar));
                                jVar2.f42870n.setOnClickListener(xVar);
                                jVar2.f42867b = false;
                                jVar2.setInput(null);
                                iiVar.f31183f3.O(true);
                                iiVar.v0(0);
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.m0 m0Var22 = h4Var.f37679h0;
                            e0 e0Var22 = new e0(12, l3Var, activity);
                            zd zdVar22 = m0Var22.f42897b0;
                            zdVar22.setText("");
                            zdVar22.setSelection(i11, zdVar22.getText().length());
                            zdVar22.setScrollX(i11);
                            m0Var22.f42921v0 = e0Var22;
                            m0Var22.k(true);
                            return;
                        }
                        return;
                    } else if (u3Var != null) {
                        ev0 ev0Var = new ev0(activity);
                        ev0Var.f48056a = 1;
                        ev0Var.f25942s = -org.telegram.messenger.i0.L(32.0f);
                        l3Var.d.w0(ev0Var);
                        return;
                    } else {
                        l3Var.f39061b.y0(0);
                        return;
                    }
                }
                return;
            case 24:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.f711b;
                l60 l60Var = (l60) this.f712c;
                if (c1Var.h == 0) {
                    c1Var.a(1, true);
                    int i16 = ((h4) l60Var).X;
                    TLRPC.Chat chat3 = l60Var.f39099n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = wp.h1(chat3);
                    ConnectionsManager.getInstance(i16).sendRequestTyped(tL_channels_joinChannel, new org.telegram.ui.f0(c1Var, i16, tL_channels_joinChannel, chat3, 0));
                    return;
                }
                return;
            case 25:
                a5 a5Var = (a5) this.f711b;
                a5Var.b(false);
                a5Var.e.d((b5) this.f712c);
                return;
            case 26:
                ((y6) ((w6) this.f711b).f42676f).x0((org.telegram.ui.Cells.c2) this.f712c);
                return;
            case 27:
                d7 d7Var = (d7) this.f711b;
                m7 m7Var = (m7) this.f712c;
                i7 i7Var = d7Var.f36511f.F;
                if (i7Var != null) {
                    i7Var.a(m7Var.f39449c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.k1 k1Var = d7Var.f36508a;
                if (k1Var != null) {
                    k1Var.d(true);
                    return;
                }
                return;
            case 28:
                j9 j9Var = (j9) this.f711b;
                org.telegram.ui.g9 g9Var3 = (org.telegram.ui.g9) this.f712c;
                ArrayList arrayList4 = g9Var3.f37406b;
                if (arrayList4.size() == 1) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(0);
                    TLRPC.UserFull a2 = j9Var.getMessagesController().a2(user2.f19943id);
                    j9Var.L = user2;
                    boolean z13 = g9Var3.e;
                    if (!z13 && (a2 == null || !a2.video_calls_available)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    org.telegram.ui.Components.voip.n1.m(user2, z13, z11, j9Var.getParentActivity(), null, j9Var.getAccountInstance());
                    return;
                }
                boolean z14 = g9Var3.e;
                HashSet hashSet3 = new HashSet();
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList4.get(i17);
                    i17++;
                    hashSet3.add(Long.valueOf(((TLRPC.User) obj3).f19943id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var3.f37407c.get(0)).f19815id;
                org.telegram.ui.ActionBar.x1 x1Var5 = new org.telegram.ui.ActionBar.x1(3, j9Var.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = j9Var.getMessagesController().Q6;
                x1Var5.setOnCancelListener(new n8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(j9Var, x1Var5, hashSet3, tL_inputGroupCallInviteMessage, z14, 1)), 1));
                x1Var5.r(600L);
                return;
            default:
                le leVar = (le) this.f711b;
                s61 s61Var = (s61) this.f712c;
                vh.d dVar2 = leVar.A0;
                if (view.isEnabled() && !dVar2.Q) {
                    be beVar = leVar.G0;
                    if (beVar == null || !beVar.Q) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(leVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34136b0 = rdVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.x0(new sd(leVar, s61Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

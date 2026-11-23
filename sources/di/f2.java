package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.media.AudioManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.op;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class f2 implements Runnable {
    public final int f8781a;
    public final Object f8782b;
    public final Object f8783c;

    public f2(int i7, Object obj, Object obj2) {
        this.f8781a = i7;
        this.f8782b = obj;
        this.f8783c = obj2;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.lc b02;
        int i7;
        gj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z10;
        TLRPC.TL_messageReactions tL_messageReactions2;
        fi.c1 c1Var;
        long j3;
        int i10;
        int i11;
        hi.ra raVar;
        fi.e9 e9Var;
        int i12 = 2131624012;
        switch (this.f8781a) {
            case 0:
                q8 q8Var = (q8) this.f8782b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f8783c;
                if (q8Var instanceof bi.x7) {
                    ((bi.x7) q8Var).n(tL_starGiftUnique);
                    return;
                }
                return;
            case 1:
                p2 p2Var = (p2) this.f8783c;
                Runnable runnable = ((Runnable[]) this.f8782b)[0];
                if (runnable != null) {
                    runnable.run();
                }
                p2Var.a(0L);
                return;
            case 2:
                f6 f6Var = (f6) this.f8782b;
                if (!((y8) this.f8783c).f10088e) {
                    org.telegram.ui.Components.gc Q = f6Var.k().Q(2131624012, 36, hd.a0(null, null, 2131743633, "NO_BALANCE"));
                    Q.f35537t = true;
                    Q.j();
                    return;
                }
                f6Var.f8806g2.setLoading(false);
                f6Var.x1();
                return;
            case 3:
                ((f6) this.f8782b).k().g0((TLRPC.TL_error) this.f8783c, false);
                return;
            case 4:
                np.u1(((f6) this.f8782b).f30173a).V3((TLRPC.Updates) ((TLObject) this.f8783c), false);
                return;
            case 5:
                f6 f6Var2 = (f6) this.f8782b;
                org.telegram.ui.Components.lc.b0((bn) this.f8783c).L(2131624034, hd.N0(2131744853, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744851, org.telegram.messenger.n5.t(f6Var2.T1))), hd.N0(2131744852, null), new k1(f6Var2, 12)).k(true);
                return;
            case 6:
                f6 f6Var3 = (f6) this.f8782b;
                f6Var3.getClass();
                ((boolean[]) this.f8783c)[0] = true;
                f6Var3.f8806g2.setLoading(false);
                f6Var3.x1();
                return;
            case 7:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.f8783c;
                o10.u(hd.a0(null, null, 2131749445, tL_starGiftUnique2.title + " #" + tL_starGiftUnique2.num), ((f6) this.f8782b).k(), 2131624052, 36);
                return;
            case 8:
                ((f6) this.f8782b).B2((CharSequence) this.f8783c);
                return;
            case 9:
                f6.h1((f6) this.f8782b, (TL_stars.TL_payments_uniqueStarGift) this.f8783c);
                return;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f8783c;
                ((org.telegram.ui.ActionBar.t1) this.f8782b).dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i12 = 2131624021;
                        i7 = 2131743635;
                        str = null;
                    } else {
                        str = null;
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i7 = 2131743636;
                    }
                    org.telegram.messenger.f3.n(str, i7, b02, i12, 36);
                    return;
                }
                return;
            case 11:
                k6 k6Var = (k6) this.f8782b;
                bn bnVar = (bn) this.f8783c;
                org.telegram.ui.Cells.z zVar = k6Var.f9198b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    k6Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = k6Var.f9198b;
                    if (zVar2 instanceof org.telegram.ui.Cells.r1) {
                        messageObject = ((org.telegram.ui.Cells.r1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f24213k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f24213k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    gj gjVar = messageObject;
                    w8 w8Var = y8.y(gjVar.K1, false).B;
                    if (w8Var != null) {
                        w8Var.b();
                    }
                    TLRPC.ChatFull chatFull = bnVar.f46181r8;
                    Context context = k6Var.getContext();
                    int currentAccount = bnVar.getCurrentAccount();
                    long a10 = bnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    mc mcVar = new mc(context, currentAccount, a10, bnVar, gjVar, arrayList2, z10, false, 0L, bnVar.getResourceProvider());
                    gjVar.e1();
                    org.telegram.ui.Cells.z zVar3 = k6Var.f9198b;
                    mcVar.Q1 = bnVar;
                    mcVar.R1 = zVar3;
                    mcVar.show();
                    return;
                }
                return;
            case 12:
                TLObject tLObject = (TLObject) this.f8782b;
                ai.h0 h0Var = (ai.h0) this.f8783c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    h0Var.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    h0Var.a(null);
                    return;
                }
            case 13:
                boolean[] zArr = (boolean[]) this.f8782b;
                r10 r10Var = (r10) this.f8783c;
                if (!zArr[0]) {
                    r10Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 14:
                p8 p8Var = (p8) this.f8782b;
                TLObject tLObject2 = (TLObject) this.f8783c;
                ArrayList arrayList3 = p8Var.f9552l;
                int i13 = p8Var.f9543a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    np.u1(i13).f4(tL_payments_savedStarGifts.users, false);
                    np.u1(i13).Z3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i14 = 0;
                        while (i14 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i14)).pinned_to_top) {
                            i14++;
                        }
                        arrayList3.add(i14, savedStarGift);
                        ls.f(i13).k(232, Long.valueOf(p8Var.f9544b), p8Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((np) this.f8782b).V3((TLRPC.Updates) ((TLObject) this.f8783c), false);
                return;
            case 16:
                new org.telegram.ui.Components.lc(((org.telegram.ui.ActionBar.w2[]) this.f8782b)[0].F, (org.telegram.ui.ActionBar.h6) this.f8783c).Q(2131623994, 36, hd.N0(2131744704, null)).k(false);
                return;
            case 17:
                mc mcVar2 = (mc) this.f8782b;
                mcVar2.O1 = true;
                mcVar2.K0(new u8((w8) this.f8783c, 2));
                org.telegram.messenger.g0.h3(new qb(mcVar2, 1), 240L);
                return;
            case 18:
                ((v0.g) this.f8782b).a((w0.d) this.f8783c);
                return;
            case 19:
                ((v0.g) this.f8782b).onResult((v0.f) this.f8783c);
                return;
            case 20:
                v0.c cVar = (v0.c) this.f8783c;
                v0.g gVar = ((e1.d) this.f8782b).f10322f;
                if (gVar != null) {
                    gVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 21:
                f2.i.f11076a = (AudioManager) ((Context) this.f8782b).getSystemService("audio");
                ((h2.i) this.f8783c).e();
                return;
            case 22:
                ((fi.f9) this.f8782b).N(ProfileActivity.D4(((fi.r0) this.f8783c).f12519c));
                return;
            case 23:
                fi.a2 a2Var = (fi.a2) this.f8782b;
                org.telegram.messenger.g0.g(((fi.m0) this.f8783c).f12295w);
                if (org.telegram.messenger.g0.G3()) {
                    Toast.makeText(a2Var.getContext(), hd.N0(2131743951, null), 0).show();
                    return;
                }
                return;
            case 24:
                fi.a2 a2Var2 = (fi.a2) this.f8782b;
                fi.r0 r0Var = (fi.r0) this.f8783c;
                long j10 = r0Var.f12519c;
                fi.z3 z3Var = a2Var2.f11749j0;
                if (j10 != k10.i(z3Var.f12891m2).e() && ((c1Var = a2Var2.f11748i0.B0) == null || j10 != org.telegram.messenger.n5.o(c1Var.i()))) {
                    if (z3Var.f12939y3 != null) {
                        for (int i15 = 0; i15 < z3Var.f12939y3.peers.size(); i15++) {
                            if (j10 != org.telegram.messenger.n5.o(z3Var.f12939y3.peers.get(i15).peer)) {
                            }
                        }
                    }
                    Context context2 = a2Var2.getContext();
                    long j11 = r0Var.f12519c;
                    fi.b0 b0Var = new fi.b0(0, a2Var2, r0Var);
                    fi.h0 h0Var2 = new fi.h0(1);
                    org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context2, (org.telegram.ui.ActionBar.h6) h0Var2, false);
                    w2Var.O();
                    LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, h0Var2);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setText(hd.N0(2131751484, null));
                    g10.addView(textView, c8.ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, h0Var2);
                    o4Var.setText(hd.N0(2131751581, null));
                    g10.addView(o4Var, c8.ma.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var2);
                    op checkBoxRound = d2Var.getCheckBoxRound();
                    int i16 = org.telegram.ui.ActionBar.m6.V6;
                    int i17 = org.telegram.ui.ActionBar.m6.f29437g7;
                    int i18 = org.telegram.ui.ActionBar.m6.f29511k7;
                    checkBoxRound.b(i16, i17, i18);
                    d2Var.e(hd.N0(2131751490, null), null, false, true, false);
                    d2Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.d2 d2Var2 = d2Var;
                                    d2Var2.c(!d2Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.d2 d2Var3 = d2Var;
                                    d2Var3.c(!d2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.d2 d2Var4 = d2Var;
                                    d2Var4.c(!d2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i19 = org.telegram.ui.ActionBar.m6.f29473i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i19, h0Var2), 2, -1);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
                    d2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.t6.j(d2Var, h02, null, M, h0Var2);
                    g10.addView(d2Var, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var2);
                    d2Var2.getCheckBoxRound().b(i16, i17, i18);
                    d2Var2.e(hd.a0(null, null, 2131751575, org.telegram.messenger.n5.l(k10.f24968t0, j11)), null, false, true, false);
                    d2Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.d2 d2Var22 = d2Var2;
                                    d2Var22.c(!d2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.d2 d2Var3 = d2Var2;
                                    d2Var3.c(!d2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.d2 d2Var4 = d2Var2;
                                    d2Var4.c(!d2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i19, h0Var2), 2, -1);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i19);
                    d2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.t6.j(d2Var2, h03, null, M2, h0Var2);
                    g10.addView(d2Var2, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var3 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var2);
                    d2Var3.getCheckBoxRound().b(i16, i17, i18);
                    d2Var3.e(hd.a0(null, null, 2131751556, org.telegram.messenger.n5.l(k10.f24968t0, j11)), null, false, false, false);
                    d2Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.d2 d2Var22 = d2Var3;
                                    d2Var22.c(!d2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.d2 d2Var32 = d2Var3;
                                    d2Var32.c(!d2Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.d2 d2Var4 = d2Var3;
                                    d2Var4.c(!d2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i19, h0Var2), 2, -1);
                    org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i19);
                    d2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.t6.j(d2Var3, h04, null, M3, h0Var2);
                    g10.addView(d2Var3, c8.ma.o(-1, -2));
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2, h0Var2);
                    a9Var.setBackgroundColor(-16777216);
                    a9Var.setFixedSize(12);
                    g10.addView(a9Var, c8.ma.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    hi.e eVar = new hi.e(context2, h0Var2, true);
                    eVar.i(hd.N0(2131751501, null), false, true);
                    eVar.setOnClickListener(new fi.d0(d2Var, d2Var2, d2Var3, b0Var, w2Var, 0));
                    frameLayout.addView(eVar, c8.ma.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, c8.ma.o(-1, -2));
                    w2Var.O = g10;
                    w2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = a2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(r0Var.f12517a));
                ConnectionsManager.getInstance(a2Var2.O).sendRequest(deletegroupcallmessages, null);
                a2Var2.c(r0Var.f12517a);
                return;
            case 25:
                fi.c1 c1Var2 = (fi.c1) this.f8782b;
                ArrayList arrayList4 = (ArrayList) this.f8783c;
                int size = arrayList4.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList4.get(i20);
                    i20++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    ls.f(c1Var2.f11839e).k(177, Long.valueOf(tL_updateGroupCallMessage.call.f28451id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 26:
                ((fi.c1) this.f8782b).G.remove((String) this.f8783c);
                return;
            case 27:
                fi.z3 z3Var2 = (fi.z3) this.f8782b;
                hi.l3 l3Var = (hi.l3) this.f8783c;
                z3Var2.removeView(l3Var);
                if (z3Var2.N1 == l3Var) {
                    z3Var2.N1 = null;
                    return;
                }
                return;
            case 28:
                fi.z3 z3Var3 = (fi.z3) this.f8782b;
                hi.sa D = hi.sa.D((Activity) this.f8783c, z3Var3.f12891m2);
                fi.y3 y3Var = z3Var3.f12930w2;
                if (y3Var != null && (e9Var = (fi.e9) y3Var.f12815c) != null) {
                    j3 = e9Var.currentPosition;
                } else {
                    j3 = 0;
                }
                File h = z3Var3.f12937y1.h();
                TL_stories.StoryItem storyItem = z3Var3.f12937y1.f12765a;
                hi.c7 c7Var = new hi.c7();
                c7Var.f14366n = true;
                c7Var.f14378t = storyItem.media;
                int i21 = c7Var.f14338a;
                c7Var.f14372q = np.u1(i21).B1(storyItem.dialogId);
                c7Var.f14374r = storyItem.f28673id;
                c7Var.f14376s = storyItem.caption;
                c7Var.L = h;
                c7Var.M = false;
                c7Var.f14362k0 = 720;
                c7Var.f14364l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    c7Var.K = false;
                    if (h != null) {
                        c7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    c7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i22 = 0;
                        while (true) {
                            if (i22 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i22);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    c7Var.f14362k0 = documentAttribute.f28441w;
                                    c7Var.f14364l0 = documentAttribute.h;
                                    c7Var.f14357i = documentAttribute.duration;
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            c7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i23 = 0; i23 < storyItem.media.document.thumbs.size(); i23++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i23);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    c7Var.O = org.telegram.messenger.fc.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i21);
                                    File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        c7Var.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                c7Var.A();
                c7Var.e(storyItem);
                hi.la d = hi.na.d(z3Var3.f12916t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f15402f;
                int i24 = D.f15392c;
                if (!D.d) {
                    if (np.u1(i24).A2()) {
                        org.telegram.ui.b.b(i24);
                    } else {
                        D.f15451v0 = false;
                        D.f15398e = false;
                        D.C2 = false;
                        if (windowManager != null && (raVar = D.f15425n) != null && raVar.getParent() == null) {
                            org.telegram.messenger.g0.w3(windowManager, D.f15425n, layoutParams);
                            windowManager.addView(D.f15425n, layoutParams);
                            D.f0();
                        }
                        D.L1 = c7Var;
                        hi.q8.a(i24, c7Var);
                        hi.c7 c7Var2 = D.L1;
                        if (c7Var2 != null && c7Var2.K) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        D.P1 = i10;
                        D.f15445t0.f15546g = false;
                        if (d != null) {
                            D.G = d;
                            D.K = d.f15135a;
                            rectF.set(d.f15137c);
                            D.H = d.f15136b;
                            D.G.e();
                        } else {
                            D.K = 0;
                            Point point = org.telegram.messenger.g0.f24046q;
                            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
                            D.H = org.telegram.messenger.g0.L(8.0f);
                        }
                        D.f15437r.c();
                        hi.ea eaVar = D.f15412i0;
                        int i25 = D.K;
                        if (i25 != 1 && i25 != 0) {
                            i11 = -14737633;
                        } else {
                            i11 = 0;
                        }
                        eaVar.setBackgroundColor(i11);
                        D.f15437r.setTranslationX(0.0f);
                        D.f15437r.setTranslationY(0.0f);
                        D.f15437r.b(0.0f);
                        D.f15437r.setScaleX(1.0f);
                        D.f15437r.setScaleY(1.0f);
                        D.L = 0.0f;
                        org.telegram.messenger.g0.g2(D.f15388b);
                        hi.c7 c7Var3 = D.L1;
                        if (c7Var3 != null) {
                            D.f15397d1.setText(c7Var3.C0);
                        }
                        D.K(new hi.r8(D, 7), j3);
                        D.f15394c1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.f15455w0 = 0L;
                        D.f15459x0 = "";
                    }
                }
                D.R = new fi.r1(z3Var3, 12);
                D.S = new fi.w1(0, z3Var3, D);
                return;
            default:
                fi.r3 r3Var = (fi.r3) this.f8782b;
                r3Var.getClass();
                ((fi.w8) r3Var.f12532x.A1).h(new ug.y0(((fi.f9) this.f8783c).f12010f, 14, false));
                return;
        }
    }

    public f2(y8 y8Var, boolean[] zArr, r10 r10Var) {
        this.f8781a = 13;
        this.f8782b = zArr;
        this.f8783c = r10Var;
    }
}

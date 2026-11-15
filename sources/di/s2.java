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
import java.util.List;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.fp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class s2 implements Runnable {
    public final int f9365a;
    public final Object f9366b;
    public final Object f9367c;

    public s2(int i7, Object obj, Object obj2) {
        this.f9365a = i7;
        this.f9366b = obj;
        this.f9367c = obj2;
    }

    @Override
    public final void run() {
        gj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z10;
        TLRPC.TL_messageReactions tL_messageReactions2;
        fi.e1 e1Var;
        long j3;
        int i7;
        int i10;
        hi.ra raVar;
        fi.h9 h9Var;
        String str = null;
        boolean z11 = true;
        switch (this.f9365a) {
            case 0:
                c6 c6Var = (c6) this.f9366b;
                if (!((u8) this.f9367c).f9532e) {
                    org.telegram.ui.Components.xb Q = c6Var.k().Q(2131624012, 36, hd.a0(null, null, 2131743878, "NO_BALANCE"));
                    Q.f41645t = true;
                    Q.j();
                    return;
                }
                c6Var.f8319g2.setLoading(false);
                c6Var.t1();
                return;
            case 1:
                np.s1(((c6) this.f9366b).f29679a).O3((TLRPC.Updates) ((TLObject) this.f9367c), false);
                return;
            case 2:
                ((c6) this.f9366b).k().f0((TLRPC.TL_error) this.f9367c, false);
                return;
            case 3:
                c6 c6Var2 = (c6) this.f9366b;
                org.telegram.ui.Components.cc.a0((an) this.f9367c).L(2131624034, hd.M0(2131745096, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131745094, org.telegram.messenger.m5.t(c6Var2.T1))), hd.M0(2131745095, null), new l1(c6Var2, 8)).k(true);
                return;
            case 4:
                c6 c6Var3 = (c6) this.f9366b;
                c6Var3.getClass();
                ((boolean[]) this.f9367c)[0] = true;
                c6Var3.f8319g2.setLoading(false);
                c6Var3.t1();
                return;
            case 5:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f9367c;
                i20.t(hd.a0(null, null, 2131749618, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), ((c6) this.f9366b).k(), 2131624052, 36);
                return;
            case 6:
                ((c6) this.f9366b).p2((CharSequence) this.f9367c);
                return;
            case 7:
                h6 h6Var = (h6) this.f9366b;
                an anVar = (an) this.f9367c;
                org.telegram.ui.Cells.z zVar = h6Var.f8716b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    h6Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = h6Var.f8716b;
                    if (zVar2 instanceof org.telegram.ui.Cells.q1) {
                        messageObject = ((org.telegram.ui.Cells.q1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f23819k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f23819k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    gj gjVar = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    s8 s8Var = u8.y(gjVar.K1, false).B;
                    if (s8Var != null) {
                        s8Var.b();
                    }
                    TLRPC.ChatFull chatFull = anVar.f45333q8;
                    Context context = h6Var.getContext();
                    int currentAccount = anVar.getCurrentAccount();
                    long a10 = anVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    ic icVar = new ic(context, currentAccount, a10, anVar, gjVar, arrayList2, z10, false, 0L, anVar.getResourceProvider());
                    gjVar.e1();
                    org.telegram.ui.Cells.z zVar3 = h6Var.f8716b;
                    icVar.Q1 = anVar;
                    icVar.R1 = zVar3;
                    icVar.show();
                    return;
                }
                return;
            case 8:
                TLObject tLObject = (TLObject) this.f9366b;
                ai.g0 g0Var = (ai.g0) this.f9367c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    g0Var.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    g0Var.a(null);
                    return;
                }
            case 9:
                boolean[] zArr = (boolean[]) this.f9366b;
                s10 s10Var = (s10) this.f9367c;
                if (!zArr[0]) {
                    s10Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 10:
                l8 l8Var = (l8) this.f9366b;
                TLObject tLObject2 = (TLObject) this.f9367c;
                ArrayList arrayList3 = l8Var.f9001l;
                int i11 = l8Var.f8992a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    np.s1(i11).Y3(tL_payments_savedStarGifts.users, false);
                    np.s1(i11).S3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i12 = 0;
                        while (i12 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i12)).pinned_to_top) {
                            i12++;
                        }
                        arrayList3.add(i12, savedStarGift);
                        ns.f(i11).k(230, Long.valueOf(l8Var.f8993b), l8Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((np) this.f9366b).O3((TLRPC.Updates) ((TLObject) this.f9367c), false);
                return;
            case 12:
                new org.telegram.ui.Components.cc(((org.telegram.ui.ActionBar.u2[]) this.f9366b)[0].F, (org.telegram.ui.ActionBar.e6) this.f9367c).Q(2131623994, 36, hd.M0(2131744947, null)).k(false);
                return;
            case 13:
                ic icVar2 = (ic) this.f9366b;
                icVar2.O1 = true;
                icVar2.J0(new q8((s8) this.f9367c, 2));
                org.telegram.messenger.g0.i3(new mb(icVar2, 1), 240L);
                return;
            case 14:
                ((v0.g) this.f9366b).a((w0.d) this.f9367c);
                return;
            case 15:
                ((v0.g) this.f9366b).onResult((v0.f) this.f9367c);
                return;
            case 16:
                v0.c cVar = (v0.c) this.f9367c;
                v0.g gVar = ((e1.d) this.f9366b).f9975f;
                if (gVar != null) {
                    gVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 17:
                f2.h.f10725a = (AudioManager) ((Context) this.f9366b).getSystemService("audio");
                ((h2.i) this.f9367c).e();
                return;
            case 18:
                ((fi.i9) this.f9366b).N(ProfileActivity.C4(((fi.s0) this.f9367c).f12299c));
                return;
            case 19:
                fi.c2 c2Var = (fi.c2) this.f9366b;
                org.telegram.messenger.g0.g(((fi.n0) this.f9367c).f12058w);
                if (org.telegram.messenger.g0.H3()) {
                    Toast.makeText(c2Var.getContext(), hd.M0(2131744194, null), 0).show();
                    return;
                }
                return;
            case 20:
                fi.c2 c2Var2 = (fi.c2) this.f9366b;
                fi.s0 s0Var = (fi.s0) this.f9367c;
                long j10 = s0Var.f12299c;
                fi.b4 b4Var = c2Var2.f11589j0;
                if (j10 != m10.i(b4Var.f11497m2).e() && ((e1Var = c2Var2.f11588i0.B0) == null || j10 != org.telegram.messenger.m5.o(e1Var.i()))) {
                    if (b4Var.f11545y3 != null) {
                        for (int i13 = 0; i13 < b4Var.f11545y3.peers.size(); i13++) {
                            if (j10 != org.telegram.messenger.m5.o(b4Var.f11545y3.peers.get(i13).peer)) {
                            }
                        }
                    }
                    Context context2 = c2Var2.getContext();
                    long j11 = s0Var.f12299c;
                    fi.b0 b0Var = new fi.b0(0, c2Var2, s0Var);
                    fi.i0 i0Var = new fi.i0(1);
                    org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context2, (org.telegram.ui.ActionBar.e6) i0Var, false);
                    u2Var.O();
                    LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                    TextView g10 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                    org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.f28957j5, i0Var);
                    g10.setTypeface(org.telegram.messenger.g0.o());
                    g10.setText(hd.M0(2131751496, null));
                    f10.addView(g10, c8.ja.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i0Var);
                    n4Var.setText(hd.M0(2131751593, null));
                    f10.addView(n4Var, c8.ja.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var);
                    fp checkBoxRound = c2Var3.getCheckBoxRound();
                    int i14 = org.telegram.ui.ActionBar.j6.V6;
                    int i15 = org.telegram.ui.ActionBar.j6.f28905g7;
                    int i16 = org.telegram.ui.ActionBar.j6.f28979k7;
                    checkBoxRound.b(i14, i15, i16);
                    c2Var3.e(hd.M0(2131751502, null), null, false, true, false);
                    c2Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var4 = c2Var3;
                                    c2Var4.c(!c2Var4.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var5 = c2Var3;
                                    c2Var5.c(!c2Var5.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var6 = c2Var3;
                                    c2Var6.c(!c2Var6.b(), true);
                                    return;
                            }
                        }
                    });
                    int i17 = org.telegram.ui.ActionBar.j6.f28941i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i17, i0Var), 2, -1);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
                    c2Var3.setBackground(h02);
                    org.telegram.ui.ActionBar.q6.j(c2Var3, h02, null, M, i0Var);
                    f10.addView(c2Var3, c8.ja.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var);
                    c2Var4.getCheckBoxRound().b(i14, i15, i16);
                    c2Var4.e(hd.a0(null, null, 2131751587, org.telegram.messenger.m5.l(m10.f24940t0, j11)), null, false, true, false);
                    c2Var4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var42 = c2Var4;
                                    c2Var42.c(!c2Var42.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var5 = c2Var4;
                                    c2Var5.c(!c2Var5.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var6 = c2Var4;
                                    c2Var6.c(!c2Var6.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i17, i0Var), 2, -1);
                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i17);
                    c2Var4.setBackground(h03);
                    org.telegram.ui.ActionBar.q6.j(c2Var4, h03, null, M2, i0Var);
                    f10.addView(c2Var4, c8.ja.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var5 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var);
                    c2Var5.getCheckBoxRound().b(i14, i15, i16);
                    c2Var5.e(hd.a0(null, null, 2131751568, org.telegram.messenger.m5.l(m10.f24940t0, j11)), null, false, false, false);
                    c2Var5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var42 = c2Var5;
                                    c2Var42.c(!c2Var42.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var52 = c2Var5;
                                    c2Var52.c(!c2Var52.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var6 = c2Var5;
                                    c2Var6.c(!c2Var6.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i17, i0Var), 2, -1);
                    org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i17);
                    c2Var5.setBackground(h04);
                    org.telegram.ui.ActionBar.q6.j(c2Var5, h04, null, M3, i0Var);
                    f10.addView(c2Var5, c8.ja.o(-1, -2));
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context2, i0Var);
                    y8Var.setBackgroundColor(-16777216);
                    y8Var.setFixedSize(12);
                    f10.addView(y8Var, c8.ja.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    hi.d dVar = new hi.d(context2, i0Var, true);
                    dVar.i(hd.M0(2131751513, null), false, true);
                    dVar.setOnClickListener(new fi.d0(c2Var3, c2Var4, c2Var5, b0Var, u2Var, 0));
                    frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, c8.ja.o(-1, -2));
                    u2Var.O = f10;
                    u2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = c2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.f12297a));
                ConnectionsManager.getInstance(c2Var2.O).sendRequest(deletegroupcallmessages, null);
                c2Var2.c(s0Var.f12297a);
                return;
            case 21:
                fi.e1 e1Var2 = (fi.e1) this.f9366b;
                ArrayList arrayList4 = (ArrayList) this.f9367c;
                int size = arrayList4.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList4.get(i18);
                    i18++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    ns.f(e1Var2.f11656e).k(177, Long.valueOf(tL_updateGroupCallMessage.call.f28068id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 22:
                ((fi.e1) this.f9366b).G.remove((String) this.f9367c);
                return;
            case 23:
                fi.b4 b4Var2 = (fi.b4) this.f9366b;
                hi.l3 l3Var = (hi.l3) this.f9367c;
                b4Var2.removeView(l3Var);
                if (b4Var2.N1 == l3Var) {
                    b4Var2.N1 = null;
                    return;
                }
                return;
            case 24:
                fi.b4 b4Var3 = (fi.b4) this.f9366b;
                hi.sa D = hi.sa.D((Activity) this.f9367c, b4Var3.f11497m2);
                fi.a4 a4Var = b4Var3.f11536w2;
                if (a4Var != null && (h9Var = (fi.h9) a4Var.f11407c) != null) {
                    j3 = h9Var.currentPosition;
                } else {
                    j3 = 0;
                }
                File h = b4Var3.f11543y1.h();
                TL_stories.StoryItem storyItem = b4Var3.f11543y1.f12579a;
                hi.d7 d7Var = new hi.d7();
                d7Var.f14151n = true;
                d7Var.f14163t = storyItem.media;
                int i19 = d7Var.f14123a;
                d7Var.f14157q = np.s1(i19).z1(storyItem.dialogId);
                d7Var.f14159r = storyItem.f28290id;
                d7Var.f14161s = storyItem.caption;
                d7Var.L = h;
                d7Var.M = false;
                d7Var.f14147k0 = 720;
                d7Var.f14149l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    d7Var.K = false;
                    if (h != null) {
                        d7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    d7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i20 = 0;
                        while (true) {
                            if (i20 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i20);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    d7Var.f14147k0 = documentAttribute.f28058w;
                                    d7Var.f14149l0 = documentAttribute.h;
                                    d7Var.f14142i = documentAttribute.duration;
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            d7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i21 = 0; i21 < storyItem.media.document.thumbs.size(); i21++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i21);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    d7Var.O = org.telegram.messenger.fc.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i19);
                                    File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        d7Var.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                d7Var.A();
                d7Var.e(storyItem);
                hi.la d = hi.na.d(b4Var3.f11522t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f15053f;
                int i22 = D.f15043c;
                if (!D.d) {
                    if (np.s1(i22).v2()) {
                        org.telegram.ui.b.b(i22);
                    } else {
                        D.f15102v0 = false;
                        D.f15049e = false;
                        D.C2 = false;
                        if (windowManager != null && (raVar = D.f15076n) != null && raVar.getParent() == null) {
                            org.telegram.messenger.g0.x3(windowManager, D.f15076n, layoutParams);
                            windowManager.addView(D.f15076n, layoutParams);
                            D.f0();
                        }
                        D.L1 = d7Var;
                        hi.r8.a(i22, d7Var);
                        hi.d7 d7Var2 = D.L1;
                        if (d7Var2 != null && d7Var2.K) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        D.P1 = i7;
                        D.f15096t0.f15295g = false;
                        if (d != null) {
                            D.G = d;
                            D.K = d.f14781a;
                            rectF.set(d.f14783c);
                            D.H = d.f14782b;
                            D.G.e();
                        } else {
                            D.K = 0;
                            Point point = org.telegram.messenger.g0.f23611q;
                            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
                            D.H = org.telegram.messenger.g0.L(8.0f);
                        }
                        D.f15088r.c();
                        hi.ea eaVar = D.f15063i0;
                        int i23 = D.K;
                        if (i23 != 1 && i23 != 0) {
                            i10 = -14737633;
                        } else {
                            i10 = 0;
                        }
                        eaVar.setBackgroundColor(i10);
                        D.f15088r.setTranslationX(0.0f);
                        D.f15088r.setTranslationY(0.0f);
                        D.f15088r.b(0.0f);
                        D.f15088r.setScaleX(1.0f);
                        D.f15088r.setScaleY(1.0f);
                        D.L = 0.0f;
                        org.telegram.messenger.g0.g2(D.f15039b);
                        hi.d7 d7Var3 = D.L1;
                        if (d7Var3 != null) {
                            D.f15048d1.setText(d7Var3.C0);
                        }
                        D.K(new hi.s8(D, 7), j3);
                        D.f15045c1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.f15106w0 = 0L;
                        D.f15110x0 = "";
                    }
                }
                D.R = new fi.t1(b4Var3, 12);
                D.S = new fi.y1(0, b4Var3, D);
                return;
            case 25:
                fi.t3 t3Var = (fi.t3) this.f9366b;
                t3Var.getClass();
                ((fi.z8) t3Var.f12360x.A1).h(new ug.x0(((fi.i9) this.f9367c).f11844f, 14, false));
                return;
            case 26:
                fi.n4 n4Var2 = (fi.n4) this.f9366b;
                n4Var2.f12075f = null;
                fi.c5 c5Var = n4Var2.h;
                c5Var.R = false;
                c5Var.P.f12117c = ((String) this.f9367c).toLowerCase();
                fi.c5.b(c5Var);
                return;
            case 27:
                z10 z10Var = (z10) this.f9366b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9367c;
                if (z10Var != null) {
                    if (tL_error != null) {
                        z11 = false;
                    }
                    z10Var.a(Boolean.valueOf(z11));
                    return;
                }
                return;
            case 28:
                fi.d6 d6Var = (fi.d6) this.f9366b;
                TLObject tLObject3 = (TLObject) this.f9367c;
                fi.h6 h6Var2 = d6Var.f11952q;
                int i24 = d6Var.f11940c;
                ArrayList arrayList5 = d6Var.f11944i;
                d6Var.I = 0;
                if (tLObject3 instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject3;
                    np.s1(i24).Y3(tL_foundStories.users, false);
                    np.s1(i24).S3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList6 = tL_foundStories.stories;
                    int size2 = arrayList6.size();
                    int i25 = 0;
                    while (i25 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList6.get(i25);
                        i25++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = org.telegram.messenger.m5.o(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList5.size();
                        gj gjVar2 = new gj(i24, tL_foundStory2.storyItem);
                        gjVar2.r0(false);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(Integer.valueOf(arrayList5.size()));
                        d6Var.F.add(arrayList7);
                        arrayList5.add(gjVar2);
                    }
                    d6Var.J = Math.max(arrayList5.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        d6Var.J = arrayList5.size();
                    }
                    if (arrayList5.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    d6Var.H = str;
                    d6Var.G = false;
                    org.telegram.messenger.g0.r(h6Var2);
                    org.telegram.messenger.g0.h3(h6Var2);
                    return;
                }
                return;
            default:
                fi.g6 g6Var = (fi.g6) this.f9366b;
                ArrayList arrayList8 = g6Var.h;
                arrayList8.clear();
                arrayList8.addAll((List) this.f9367c);
                g6Var.d = true;
                g6Var.f11745e = false;
                g6Var.d();
                ns.f(g6Var.f11742a).k(205, Long.valueOf(g6Var.f11743b), g6Var);
                return;
        }
    }

    public s2(u8 u8Var, boolean[] zArr, s10 s10Var) {
        this.f9365a = 9;
        this.f9366b = zArr;
        this.f9367c = s10Var;
    }
}

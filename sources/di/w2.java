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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class w2 implements Runnable {
    public final int f9959a;
    public final Object f9960b;
    public final Object f9961c;

    public w2(int i7, Object obj, Object obj2) {
        this.f9959a = i7;
        this.f9960b = obj;
        this.f9961c = obj2;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.lc b02;
        int i7;
        fj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z10;
        TLRPC.TL_messageReactions tL_messageReactions2;
        fi.c1 c1Var;
        long j3;
        int i10;
        int i11;
        hi.sa saVar;
        fi.e9 e9Var;
        int i12 = 2131624012;
        boolean z11 = true;
        switch (this.f9959a) {
            case 0:
                f6 f6Var = (f6) this.f9960b;
                if (!((x8) this.f9961c).f10018e) {
                    org.telegram.ui.Components.gc Q = f6Var.k().Q(2131624012, 36, gd.a0(null, null, 2131743641, "NO_BALANCE"));
                    Q.f35471t = true;
                    Q.j();
                    return;
                }
                f6Var.f8779g2.setLoading(false);
                f6Var.x1();
                return;
            case 1:
                ((f6) this.f9960b).k().g0((TLRPC.TL_error) this.f9961c, false);
                return;
            case 2:
                mp.u1(((f6) this.f9960b).f30187a).V3((TLRPC.Updates) ((TLObject) this.f9961c), false);
                return;
            case 3:
                f6 f6Var2 = (f6) this.f9960b;
                org.telegram.ui.Components.lc.b0((bn) this.f9961c).L(2131624034, gd.M0(2131744861, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744859, org.telegram.messenger.n5.t(f6Var2.T1))), gd.M0(2131744860, null), new k1(f6Var2, 12)).k(true);
                return;
            case 4:
                f6 f6Var3 = (f6) this.f9960b;
                f6Var3.getClass();
                ((boolean[]) this.f9961c)[0] = true;
                f6Var3.f8779g2.setLoading(false);
                f6Var3.x1();
                return;
            case 5:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f9961c;
                n10.u(gd.a0(null, null, 2131749446, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), ((f6) this.f9960b).k(), 2131624052, 36);
                return;
            case 6:
                ((f6) this.f9960b).B2((CharSequence) this.f9961c);
                return;
            case 7:
                f6.h1((f6) this.f9960b, (TL_stars.TL_payments_uniqueStarGift) this.f9961c);
                return;
            case 8:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9961c;
                ((org.telegram.ui.ActionBar.u1) this.f9960b).dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i12 = 2131624021;
                        i7 = 2131743643;
                        str = null;
                    } else {
                        str = null;
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i7 = 2131743644;
                    }
                    org.telegram.messenger.f3.n(str, i7, b02, i12, 36);
                    return;
                }
                return;
            case 9:
                k6 k6Var = (k6) this.f9960b;
                bn bnVar = (bn) this.f9961c;
                org.telegram.ui.Cells.z zVar = k6Var.f9172b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    k6Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = k6Var.f9172b;
                    if (zVar2 instanceof org.telegram.ui.Cells.r1) {
                        messageObject = ((org.telegram.ui.Cells.r1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f23965k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f23965k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    fj fjVar = messageObject;
                    v8 v8Var = x8.y(fjVar.K1, false).B;
                    if (v8Var != null) {
                        v8Var.b();
                    }
                    TLRPC.ChatFull chatFull = bnVar.f46154r8;
                    Context context = k6Var.getContext();
                    int currentAccount = bnVar.getCurrentAccount();
                    long a10 = bnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    mc mcVar = new mc(context, currentAccount, a10, bnVar, fjVar, arrayList2, z10, false, 0L, bnVar.getResourceProvider());
                    fjVar.e1();
                    org.telegram.ui.Cells.z zVar3 = k6Var.f9172b;
                    mcVar.Q1 = bnVar;
                    mcVar.R1 = zVar3;
                    mcVar.show();
                    return;
                }
                return;
            case 10:
                TLObject tLObject = (TLObject) this.f9960b;
                ai.g0 g0Var = (ai.g0) this.f9961c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    g0Var.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    g0Var.a(null);
                    return;
                }
            case 11:
                boolean[] zArr = (boolean[]) this.f9960b;
                q10 q10Var = (q10) this.f9961c;
                if (!zArr[0]) {
                    q10Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 12:
                o8 o8Var = (o8) this.f9960b;
                TLObject tLObject2 = (TLObject) this.f9961c;
                ArrayList arrayList3 = o8Var.f9467l;
                int i13 = o8Var.f9458a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    mp.u1(i13).f4(tL_payments_savedStarGifts.users, false);
                    mp.u1(i13).Z3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i14 = 0;
                        while (i14 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i14)).pinned_to_top) {
                            i14++;
                        }
                        arrayList3.add(i14, savedStarGift);
                        ks.f(i13).k(232, Long.valueOf(o8Var.f9459b), o8Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((mp) this.f9960b).V3((TLRPC.Updates) ((TLObject) this.f9961c), false);
                return;
            case 14:
                new org.telegram.ui.Components.lc(((org.telegram.ui.ActionBar.x2[]) this.f9960b)[0].F, (org.telegram.ui.ActionBar.i6) this.f9961c).Q(2131623994, 36, gd.M0(2131744712, null)).k(false);
                return;
            case 15:
                mc mcVar2 = (mc) this.f9960b;
                mcVar2.O1 = true;
                mcVar2.K0(new t8((v8) this.f9961c, 2));
                org.telegram.messenger.g0.h3(new qb(mcVar2, 1), 240L);
                return;
            case 16:
                ((v0.g) this.f9960b).a((w0.d) this.f9961c);
                return;
            case 17:
                ((v0.g) this.f9960b).onResult((v0.f) this.f9961c);
                return;
            case 18:
                v0.c cVar = (v0.c) this.f9961c;
                v0.g gVar = ((e1.d) this.f9960b).f10290f;
                if (gVar != null) {
                    gVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 19:
                f2.i.f11044a = (AudioManager) ((Context) this.f9960b).getSystemService("audio");
                ((h2.i) this.f9961c).e();
                return;
            case 20:
                ((fi.f9) this.f9960b).N(ProfileActivity.D4(((fi.r0) this.f9961c).f12485c));
                return;
            case 21:
                fi.a2 a2Var = (fi.a2) this.f9960b;
                org.telegram.messenger.g0.g(((fi.m0) this.f9961c).f12249w);
                if (org.telegram.messenger.g0.G3()) {
                    Toast.makeText(a2Var.getContext(), gd.M0(2131743959, null), 0).show();
                    return;
                }
                return;
            case 22:
                fi.a2 a2Var2 = (fi.a2) this.f9960b;
                fi.r0 r0Var = (fi.r0) this.f9961c;
                long j10 = r0Var.f12485c;
                fi.z3 z3Var = a2Var2.f11717j0;
                if (j10 != j10.i(z3Var.f12847m2).e() && ((c1Var = a2Var2.f11716i0.B0) == null || j10 != org.telegram.messenger.n5.o(c1Var.i()))) {
                    if (z3Var.f12895y3 != null) {
                        for (int i15 = 0; i15 < z3Var.f12895y3.peers.size(); i15++) {
                            if (j10 != org.telegram.messenger.n5.o(z3Var.f12895y3.peers.get(i15).peer)) {
                            }
                        }
                    }
                    Context context2 = a2Var2.getContext();
                    long j11 = r0Var.f12485c;
                    fi.b0 b0Var = new fi.b0(0, a2Var2, r0Var);
                    fi.h0 h0Var = new fi.h0(1);
                    org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, context2, (org.telegram.ui.ActionBar.i6) h0Var, false);
                    x2Var.O();
                    LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, h0Var);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setText(gd.M0(2131751485, null));
                    g10.addView(textView, c8.ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, h0Var);
                    o4Var.setText(gd.M0(2131751582, null));
                    g10.addView(o4Var, c8.ma.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    org.telegram.ui.Components.mp checkBoxRound = d2Var.getCheckBoxRound();
                    int i16 = org.telegram.ui.ActionBar.n6.V6;
                    int i17 = org.telegram.ui.ActionBar.n6.f29450g7;
                    int i18 = org.telegram.ui.ActionBar.n6.f29524k7;
                    checkBoxRound.b(i16, i17, i18);
                    d2Var.e(gd.M0(2131751491, null), null, false, true, false);
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
                    int i19 = org.telegram.ui.ActionBar.n6.f29486i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i19, h0Var), 2, -1);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i19);
                    d2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, h0Var);
                    g10.addView(d2Var, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    d2Var2.getCheckBoxRound().b(i16, i17, i18);
                    d2Var2.e(gd.a0(null, null, 2131751576, org.telegram.messenger.n5.l(j10.f24770t0, j11)), null, false, true, false);
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
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i19, h0Var), 2, -1);
                    org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i19);
                    d2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.u6.j(d2Var2, h03, null, M2, h0Var);
                    g10.addView(d2Var2, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var3 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    d2Var3.getCheckBoxRound().b(i16, i17, i18);
                    d2Var3.e(gd.a0(null, null, 2131751557, org.telegram.messenger.n5.l(j10.f24770t0, j11)), null, false, false, false);
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
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i19, h0Var), 2, -1);
                    org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i19);
                    d2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.u6.j(d2Var3, h04, null, M3, h0Var);
                    g10.addView(d2Var3, c8.ma.o(-1, -2));
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2, h0Var);
                    a9Var.setBackgroundColor(-16777216);
                    a9Var.setFixedSize(12);
                    g10.addView(a9Var, c8.ma.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    hi.d dVar = new hi.d(context2, h0Var, true);
                    dVar.i(gd.M0(2131751502, null), false, true);
                    dVar.setOnClickListener(new fi.d0(d2Var, d2Var2, d2Var3, b0Var, x2Var, 0));
                    frameLayout.addView(dVar, c8.ma.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, c8.ma.o(-1, -2));
                    x2Var.O = g10;
                    x2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = a2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(r0Var.f12483a));
                ConnectionsManager.getInstance(a2Var2.O).sendRequest(deletegroupcallmessages, null);
                a2Var2.c(r0Var.f12483a);
                return;
            case 23:
                fi.c1 c1Var2 = (fi.c1) this.f9960b;
                ArrayList arrayList4 = (ArrayList) this.f9961c;
                int size = arrayList4.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList4.get(i20);
                    i20++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    ks.f(c1Var2.f11793e).k(177, Long.valueOf(tL_updateGroupCallMessage.call.f28420id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 24:
                ((fi.c1) this.f9960b).G.remove((String) this.f9961c);
                return;
            case 25:
                fi.z3 z3Var2 = (fi.z3) this.f9960b;
                hi.m3 m3Var = (hi.m3) this.f9961c;
                z3Var2.removeView(m3Var);
                if (z3Var2.N1 == m3Var) {
                    z3Var2.N1 = null;
                    return;
                }
                return;
            case 26:
                fi.z3 z3Var3 = (fi.z3) this.f9960b;
                hi.ta D = hi.ta.D((Activity) this.f9961c, z3Var3.f12847m2);
                fi.y3 y3Var = z3Var3.f12886w2;
                if (y3Var != null && (e9Var = (fi.e9) y3Var.f12772c) != null) {
                    j3 = e9Var.currentPosition;
                } else {
                    j3 = 0;
                }
                File h = z3Var3.f12893y1.h();
                TL_stories.StoryItem storyItem = z3Var3.f12893y1.f12720a;
                hi.d7 d7Var = new hi.d7();
                d7Var.f14413n = true;
                d7Var.f14425t = storyItem.media;
                int i21 = d7Var.f14385a;
                d7Var.f14419q = mp.u1(i21).B1(storyItem.dialogId);
                d7Var.f14421r = storyItem.f28642id;
                d7Var.f14423s = storyItem.caption;
                d7Var.L = h;
                d7Var.M = false;
                d7Var.f14409k0 = 720;
                d7Var.f14411l0 = 1280;
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
                        int i22 = 0;
                        while (true) {
                            if (i22 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i22);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    d7Var.f14409k0 = documentAttribute.f28410w;
                                    d7Var.f14411l0 = documentAttribute.h;
                                    d7Var.f14404i = documentAttribute.duration;
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
                            d7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i23 = 0; i23 < storyItem.media.document.thumbs.size(); i23++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i23);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    d7Var.O = org.telegram.messenger.ec.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i21);
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
                hi.ma d = hi.oa.d(z3Var3.f12872t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f15438f;
                int i24 = D.f15428c;
                if (!D.d) {
                    if (mp.u1(i24).A2()) {
                        org.telegram.ui.b.b(i24);
                    } else {
                        D.f15487v0 = false;
                        D.f15434e = false;
                        D.C2 = false;
                        if (windowManager != null && (saVar = D.f15461n) != null && saVar.getParent() == null) {
                            org.telegram.messenger.g0.w3(windowManager, D.f15461n, layoutParams);
                            windowManager.addView(D.f15461n, layoutParams);
                            D.f0();
                        }
                        D.L1 = d7Var;
                        hi.r8.a(i24, d7Var);
                        hi.d7 d7Var2 = D.L1;
                        if (d7Var2 != null && d7Var2.K) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        D.P1 = i10;
                        D.f15481t0.f15576g = false;
                        if (d != null) {
                            D.G = d;
                            D.K = d.f15199a;
                            rectF.set(d.f15201c);
                            D.H = d.f15200b;
                            D.G.e();
                        } else {
                            D.K = 0;
                            Point point = org.telegram.messenger.g0.f24118q;
                            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
                            D.H = org.telegram.messenger.g0.L(8.0f);
                        }
                        D.f15473r.c();
                        hi.fa faVar = D.f15448i0;
                        int i25 = D.K;
                        if (i25 != 1 && i25 != 0) {
                            i11 = -14737633;
                        } else {
                            i11 = 0;
                        }
                        faVar.setBackgroundColor(i11);
                        D.f15473r.setTranslationX(0.0f);
                        D.f15473r.setTranslationY(0.0f);
                        D.f15473r.b(0.0f);
                        D.f15473r.setScaleX(1.0f);
                        D.f15473r.setScaleY(1.0f);
                        D.L = 0.0f;
                        org.telegram.messenger.g0.g2(D.f15424b);
                        hi.d7 d7Var3 = D.L1;
                        if (d7Var3 != null) {
                            D.f15433d1.setText(d7Var3.C0);
                        }
                        D.K(new hi.s8(D, 7), j3);
                        D.f15430c1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.f15491w0 = 0L;
                        D.f15495x0 = "";
                    }
                }
                D.R = new fi.r1(z3Var3, 12);
                D.S = new fi.w1(0, z3Var3, D);
                return;
            case 27:
                fi.r3 r3Var = (fi.r3) this.f9960b;
                r3Var.getClass();
                ((fi.w8) r3Var.f12498x.A1).h(new ug.z0(((fi.f9) this.f9961c).f11966f, 14, false));
                return;
            case 28:
                fi.l4 l4Var = (fi.l4) this.f9960b;
                l4Var.f12217f = null;
                fi.a5 a5Var = l4Var.h;
                a5Var.R = false;
                a5Var.P.f12266c = ((String) this.f9961c).toLowerCase();
                fi.a5.b(a5Var);
                return;
            default:
                x10 x10Var = (x10) this.f9960b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9961c;
                if (x10Var != null) {
                    if (tL_error2 != null) {
                        z11 = false;
                    }
                    x10Var.a(Boolean.valueOf(z11));
                    return;
                }
                return;
        }
    }

    public w2(x8 x8Var, boolean[] zArr, q10 q10Var) {
        this.f9959a = 11;
        this.f9960b = zArr;
        this.f9961c = q10Var;
    }
}

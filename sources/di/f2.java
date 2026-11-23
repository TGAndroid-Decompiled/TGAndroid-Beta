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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.lp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class f2 implements Runnable {
    public final int f8742a;
    public final Object f8743b;
    public final Object f8744c;

    public f2(int i7, Object obj, Object obj2) {
        this.f8742a = i7;
        this.f8743b = obj;
        this.f8744c = obj2;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.kc b02;
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
        hi.mb mbVar;
        fi.e9 e9Var;
        int i12 = 2131624012;
        switch (this.f8742a) {
            case 0:
                q8 q8Var = (q8) this.f8743b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f8744c;
                if (q8Var instanceof bi.a8) {
                    ((bi.a8) q8Var).n(tL_starGiftUnique);
                    return;
                }
                return;
            case 1:
                p2 p2Var = (p2) this.f8744c;
                Runnable runnable = ((Runnable[]) this.f8743b)[0];
                if (runnable != null) {
                    runnable.run();
                }
                p2Var.a(0L);
                return;
            case 2:
                f6 f6Var = (f6) this.f8743b;
                if (!((y8) this.f8744c).f10049e) {
                    org.telegram.ui.Components.fc Q = f6Var.k().Q(2131624012, 36, gd.a0(null, null, 2131743631, "NO_BALANCE"));
                    Q.f35101t = true;
                    Q.j();
                    return;
                }
                f6Var.f8767g2.setLoading(false);
                f6Var.x1();
                return;
            case 3:
                ((f6) this.f8743b).k().g0((TLRPC.TL_error) this.f8744c, false);
                return;
            case 4:
                mp.u1(((f6) this.f8743b).f30223a).V3((TLRPC.Updates) ((TLObject) this.f8744c), false);
                return;
            case 5:
                f6 f6Var2 = (f6) this.f8743b;
                org.telegram.ui.Components.kc.b0((bn) this.f8744c).L(2131624034, gd.N0(2131744855, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744853, org.telegram.messenger.n5.t(f6Var2.T1))), gd.N0(2131744854, null), new k1(f6Var2, 12)).k(true);
                return;
            case 6:
                f6 f6Var3 = (f6) this.f8743b;
                f6Var3.getClass();
                ((boolean[]) this.f8744c)[0] = true;
                f6Var3.f8767g2.setLoading(false);
                f6Var3.x1();
                return;
            case 7:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.f8744c;
                m10.u(gd.a0(null, null, 2131749445, tL_starGiftUnique2.title + " #" + tL_starGiftUnique2.num), ((f6) this.f8743b).k(), 2131624052, 36);
                return;
            case 8:
                ((f6) this.f8743b).B2((CharSequence) this.f8744c);
                return;
            case 9:
                f6.h1((f6) this.f8743b, (TL_stars.TL_payments_uniqueStarGift) this.f8744c);
                return;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f8744c;
                ((org.telegram.ui.ActionBar.t1) this.f8743b).dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        b02 = org.telegram.ui.Components.kc.b0(T);
                        i12 = 2131624021;
                        i7 = 2131743633;
                        str = null;
                    } else {
                        str = null;
                        b02 = org.telegram.ui.Components.kc.b0(T);
                        i7 = 2131743634;
                    }
                    org.telegram.messenger.f3.n(str, i7, b02, i12, 36);
                    return;
                }
                return;
            case 11:
                k6 k6Var = (k6) this.f8743b;
                bn bnVar = (bn) this.f8744c;
                org.telegram.ui.Cells.z zVar = k6Var.f9159b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    k6Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = k6Var.f9159b;
                    if (zVar2 instanceof org.telegram.ui.Cells.r1) {
                        messageObject = ((org.telegram.ui.Cells.r1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f24073k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f24073k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    fj fjVar = messageObject;
                    w8 w8Var = y8.y(fjVar.K1, false).B;
                    if (w8Var != null) {
                        w8Var.b();
                    }
                    TLRPC.ChatFull chatFull = bnVar.f46349r8;
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
                    org.telegram.ui.Cells.z zVar3 = k6Var.f9159b;
                    mcVar.Q1 = bnVar;
                    mcVar.R1 = zVar3;
                    mcVar.show();
                    return;
                }
                return;
            case 12:
                TLObject tLObject = (TLObject) this.f8743b;
                ai.d0 d0Var = (ai.d0) this.f8744c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    d0Var.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    d0Var.a(null);
                    return;
                }
            case 13:
                boolean[] zArr = (boolean[]) this.f8743b;
                p10 p10Var = (p10) this.f8744c;
                if (!zArr[0]) {
                    p10Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 14:
                p8 p8Var = (p8) this.f8743b;
                TLObject tLObject2 = (TLObject) this.f8744c;
                ArrayList arrayList3 = p8Var.f9513l;
                int i13 = p8Var.f9504a;
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
                        ks.f(i13).k(232, Long.valueOf(p8Var.f9505b), p8Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((mp) this.f8743b).V3((TLRPC.Updates) ((TLObject) this.f8744c), false);
                return;
            case 16:
                new org.telegram.ui.Components.kc(((org.telegram.ui.ActionBar.w2[]) this.f8743b)[0].F, (org.telegram.ui.ActionBar.i6) this.f8744c).Q(2131623994, 36, gd.N0(2131744706, null)).k(false);
                return;
            case 17:
                mc mcVar2 = (mc) this.f8743b;
                mcVar2.O1 = true;
                mcVar2.K0(new u8((w8) this.f8744c, 2));
                org.telegram.messenger.g0.h3(new qb(mcVar2, 1), 240L);
                return;
            case 18:
                ((v0.g) this.f8743b).T((w0.d) this.f8744c);
                return;
            case 19:
                ((v0.g) this.f8743b).onResult((v0.f) this.f8744c);
                return;
            case 20:
                v0.c cVar = (v0.c) this.f8744c;
                v0.g gVar = ((e1.d) this.f8743b).f10283f;
                if (gVar != null) {
                    gVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 21:
                f2.i.f11037a = (AudioManager) ((Context) this.f8743b).getSystemService("audio");
                ((h2.i) this.f8744c).e();
                return;
            case 22:
                ((fi.f9) this.f8743b).N(ProfileActivity.D4(((fi.r0) this.f8744c).f12481c));
                return;
            case 23:
                fi.a2 a2Var = (fi.a2) this.f8743b;
                org.telegram.messenger.g0.g(((fi.m0) this.f8744c).f12257w);
                if (org.telegram.messenger.g0.G3()) {
                    Toast.makeText(a2Var.getContext(), gd.N0(2131743949, null), 0).show();
                    return;
                }
                return;
            case 24:
                fi.a2 a2Var2 = (fi.a2) this.f8743b;
                fi.r0 r0Var = (fi.r0) this.f8744c;
                long j10 = r0Var.f12481c;
                fi.z3 z3Var = a2Var2.f11711j0;
                if (j10 != i10.i(z3Var.f12853m2).e() && ((c1Var = a2Var2.f11710i0.B0) == null || j10 != org.telegram.messenger.n5.o(c1Var.i()))) {
                    if (z3Var.f12901y3 != null) {
                        for (int i15 = 0; i15 < z3Var.f12901y3.peers.size(); i15++) {
                            if (j10 != org.telegram.messenger.n5.o(z3Var.f12901y3.peers.get(i15).peer)) {
                            }
                        }
                    }
                    Context context2 = a2Var2.getContext();
                    long j11 = r0Var.f12481c;
                    fi.b0 b0Var = new fi.b0(0, a2Var2, r0Var);
                    fi.h0 h0Var = new fi.h0(1);
                    org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context2, (org.telegram.ui.ActionBar.i6) h0Var, false);
                    w2Var.O();
                    LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, h0Var);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setText(gd.N0(2131751484, null));
                    g10.addView(textView, c8.na.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, h0Var);
                    o4Var.setText(gd.N0(2131751581, null));
                    g10.addView(o4Var, c8.na.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    lp checkBoxRound = d2Var.getCheckBoxRound();
                    int i16 = org.telegram.ui.ActionBar.n6.V6;
                    int i17 = org.telegram.ui.ActionBar.n6.f29507g7;
                    int i18 = org.telegram.ui.ActionBar.n6.f29581k7;
                    checkBoxRound.b(i16, i17, i18);
                    d2Var.e(gd.N0(2131751490, null), null, false, true, false);
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
                    int i19 = org.telegram.ui.ActionBar.n6.f29543i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i19, h0Var), 2, -1);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i19);
                    d2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, h0Var);
                    g10.addView(d2Var, c8.na.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    d2Var2.getCheckBoxRound().b(i16, i17, i18);
                    d2Var2.e(gd.a0(null, null, 2131751575, org.telegram.messenger.n5.l(i10.f24637t0, j11)), null, false, true, false);
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
                    g10.addView(d2Var2, c8.na.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var3 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    d2Var3.getCheckBoxRound().b(i16, i17, i18);
                    d2Var3.e(gd.a0(null, null, 2131751556, org.telegram.messenger.n5.l(i10.f24637t0, j11)), null, false, false, false);
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
                    g10.addView(d2Var3, c8.na.o(-1, -2));
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context2, h0Var);
                    z8Var.setBackgroundColor(-16777216);
                    z8Var.setFixedSize(12);
                    g10.addView(z8Var, c8.na.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    hi.e eVar = new hi.e(context2, h0Var, true);
                    eVar.i(gd.N0(2131751501, null), false, true);
                    eVar.setOnClickListener(new fi.d0(d2Var, d2Var2, d2Var3, b0Var, w2Var, 0));
                    frameLayout.addView(eVar, c8.na.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, c8.na.o(-1, -2));
                    w2Var.O = g10;
                    w2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = a2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(r0Var.f12479a));
                ConnectionsManager.getInstance(a2Var2.O).sendRequest(deletegroupcallmessages, null);
                a2Var2.c(r0Var.f12479a);
                return;
            case 25:
                fi.c1 c1Var2 = (fi.c1) this.f8743b;
                ArrayList arrayList4 = (ArrayList) this.f8744c;
                int size = arrayList4.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList4.get(i20);
                    i20++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    ks.f(c1Var2.f11801e).k(177, Long.valueOf(tL_updateGroupCallMessage.call.f28509id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 26:
                ((fi.c1) this.f8743b).G.remove((String) this.f8744c);
                return;
            case 27:
                fi.z3 z3Var2 = (fi.z3) this.f8743b;
                hi.u3 u3Var = (hi.u3) this.f8744c;
                z3Var2.removeView(u3Var);
                if (z3Var2.N1 == u3Var) {
                    z3Var2.N1 = null;
                    return;
                }
                return;
            case 28:
                fi.z3 z3Var3 = (fi.z3) this.f8743b;
                hi.nb D = hi.nb.D((Activity) this.f8744c, z3Var3.f12853m2);
                fi.y3 y3Var = z3Var3.f12892w2;
                if (y3Var != null && (e9Var = (fi.e9) y3Var.f12777c) != null) {
                    j3 = e9Var.currentPosition;
                } else {
                    j3 = 0;
                }
                File h = z3Var3.f12899y1.h();
                TL_stories.StoryItem storyItem = z3Var3.f12899y1.f12727a;
                hi.x7 x7Var = new hi.x7();
                x7Var.f15761n = true;
                x7Var.f15773t = storyItem.media;
                int i21 = x7Var.f15733a;
                x7Var.f15767q = mp.u1(i21).B1(storyItem.dialogId);
                x7Var.f15769r = storyItem.f28731id;
                x7Var.f15771s = storyItem.caption;
                x7Var.L = h;
                x7Var.M = false;
                x7Var.f15757k0 = 720;
                x7Var.f15759l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    x7Var.K = false;
                    if (h != null) {
                        x7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    x7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i22 = 0;
                        while (true) {
                            if (i22 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i22);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    x7Var.f15757k0 = documentAttribute.f28499w;
                                    x7Var.f15759l0 = documentAttribute.h;
                                    x7Var.f15752i = documentAttribute.duration;
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
                            x7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i23 = 0; i23 < storyItem.media.document.thumbs.size(); i23++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i23);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    x7Var.O = org.telegram.messenger.ec.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i21);
                                    File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        x7Var.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                x7Var.A();
                x7Var.e(storyItem);
                hi.gb d = hi.ib.d(z3Var3.f12878t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f15072f;
                int i24 = D.f15062c;
                if (!D.d) {
                    if (mp.u1(i24).A2()) {
                        org.telegram.ui.b.b(i24);
                    } else {
                        D.f15121v0 = false;
                        D.f15068e = false;
                        D.C2 = false;
                        if (windowManager != null && (mbVar = D.f15095n) != null && mbVar.getParent() == null) {
                            org.telegram.messenger.g0.w3(windowManager, D.f15095n, layoutParams);
                            windowManager.addView(D.f15095n, layoutParams);
                            D.f0();
                        }
                        D.L1 = x7Var;
                        hi.l9.a(i24, x7Var);
                        hi.x7 x7Var2 = D.L1;
                        if (x7Var2 != null && x7Var2.K) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        D.P1 = i10;
                        D.f15115t0.f14374g = false;
                        if (d != null) {
                            D.G = d;
                            D.K = d.f14708a;
                            rectF.set(d.f14710c);
                            D.H = d.f14709b;
                            D.G.e();
                        } else {
                            D.K = 0;
                            Point point = org.telegram.messenger.g0.f24226q;
                            rectF.set(0.0f, org.telegram.messenger.g0.L(100.0f), point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
                            D.H = org.telegram.messenger.g0.L(8.0f);
                        }
                        D.f15107r.c();
                        hi.za zaVar = D.f15082i0;
                        int i25 = D.K;
                        if (i25 != 1 && i25 != 0) {
                            i11 = -14737633;
                        } else {
                            i11 = 0;
                        }
                        zaVar.setBackgroundColor(i11);
                        D.f15107r.setTranslationX(0.0f);
                        D.f15107r.setTranslationY(0.0f);
                        D.f15107r.b(0.0f);
                        D.f15107r.setScaleX(1.0f);
                        D.f15107r.setScaleY(1.0f);
                        D.L = 0.0f;
                        org.telegram.messenger.g0.g2(D.f15058b);
                        hi.x7 x7Var3 = D.L1;
                        if (x7Var3 != null) {
                            D.f15067d1.setText(x7Var3.C0);
                        }
                        D.K(new hi.m9(D, 7), j3);
                        D.f15064c1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.f15125w0 = 0L;
                        D.f15129x0 = "";
                    }
                }
                D.R = new fi.r1(z3Var3, 12);
                D.S = new fi.w1(0, z3Var3, D);
                return;
            default:
                fi.r3 r3Var = (fi.r3) this.f8743b;
                r3Var.getClass();
                ((fi.w8) r3Var.f12494x.A1).h(new ug.y0(((fi.f9) this.f8744c).f11972f, 14, false));
                return;
        }
    }

    public f2(y8 y8Var, boolean[] zArr, p10 p10Var) {
        this.f8742a = 13;
        this.f8743b = zArr;
        this.f8744c = p10Var;
    }
}

package kg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bb1;
import org.telegram.ui.bn;
import org.telegram.ui.ns;
public final class q0 implements Runnable {
    public final int f18461a = 1;
    public final Object f18462b;
    public final boolean f18463c;
    public final Object d;
    public final Object f18464e;
    public final Object f18465f;
    public final Object h;
    public final TLObject f18466n;

    public q0(File file, ArrayList arrayList, g2 g2Var, bn bnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.f18462b = arrayList;
        this.f18464e = g2Var;
        this.f18465f = bnVar;
        this.h = document;
        this.f18463c = z10;
        this.f18466n = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        boolean z10;
        ArrayList arrayList;
        ?? r82;
        zh.l lVar;
        String a02;
        int i7 = this.f18461a;
        boolean z11 = this.f18463c;
        int i10 = 0;
        Object obj = this.f18462b;
        TLObject tLObject = this.f18466n;
        Object obj2 = this.h;
        Object obj3 = this.f18465f;
        Object obj4 = this.f18464e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                s0.Z((s0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.f18463c, (TLRPC.User) tLObject);
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                g2 g2Var = (g2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new ff(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.p1().I2(g2Var.getParentActivity(), null, g2Var.getResourceProvider());
                PhotoViewer.p1().f2(arrayList2, 0, 11, false, new Object(), (bn) obj3);
                PhotoViewer p12 = PhotoViewer.p1();
                if (z11) {
                    document = document2;
                } else {
                    document = null;
                }
                p12.S0(document2, document, false, null);
                ns p10 = ns.p();
                if (z11) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                p10.T = tL_messages_stickerSet;
                return;
            case 2:
                bb1.i0((bb1) obj5, (TLRPC.TL_error) obj4, this.f18463c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                zh.l lVar2 = (zh.l) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i11 = lVar2.f62062k;
                ArrayList arrayList3 = lVar2.f62057e;
                g2 g2Var2 = lVar2.f62059g;
                if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z12 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            np.u1(i11).b3(0, tL_updates.chats.get(0).f28434id, true);
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList3.size()) {
                                z10 = z11;
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i12);
                                } else {
                                    i12++;
                                    z11 = z10;
                                }
                            } else {
                                z10 = z11;
                            }
                        }
                        zh.g gVar = lVar2.f62058f;
                        zh.l lVar3 = gVar.f62036c;
                        int i13 = 0;
                        while (true) {
                            arrayList = lVar3.f62056c;
                            if (i13 < arrayList.size()) {
                                r82 = z12;
                                lVar = lVar2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i13)).user_id != tL_chatInviteImporter.user_id) {
                                    i13++;
                                    z12 = r82 == true ? 1 : 0;
                                    lVar2 = lVar;
                                }
                            } else {
                                r82 = z12;
                                lVar = lVar2;
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            arrayList.remove(i13);
                            gVar.s(((gVar.f62036c.B ? 1 : 0) ^ r82) + i13);
                            if (arrayList.isEmpty()) {
                                gVar.s(r82);
                            }
                        }
                        zh.l lVar4 = lVar;
                        lVar4.f(lVar4.f62071t, false, r82);
                        if (z10) {
                            sb sbVar = new sb(g2Var2.getParentActivity(), g2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            q9 q9Var = sbVar.f39544a;
                            q9Var.setRoundRadius(L);
                            q9Var.f(user, new b9(0, user));
                            String k10 = p10.k(user, true);
                            if (lVar4.f62054a) {
                                a02 = hd.a0("HasBeenAddedToChannel", null, 2131749171, k10);
                            } else {
                                a02 = hd.a0("HasBeenAddedToGroup", null, 2131749170, k10);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(k10);
                            spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), indexOf, k10.length() + indexOf, 18);
                            sbVar.f39545b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                gc.g(g2Var2, sbVar, 2750).j();
                            } else {
                                gc.f(lVar4.h, sbVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y s5 = g2Var2.getActionBar().s();
                        if (TextUtils.isEmpty(lVar4.f62071t) && lVar4.f62063l) {
                            org.telegram.ui.ActionBar.q0 j3 = s5.j(0);
                            if (arrayList3.isEmpty()) {
                                i10 = 8;
                            }
                            j3.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    c5.c0(i11, tL_error, g2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public q0(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = s0Var;
        this.f18464e = tL_error;
        this.f18465f = tLObject;
        this.h = iArr;
        this.f18462b = arrayList;
        this.f18463c = z10;
        this.f18466n = user;
    }

    public q0(bb1 bb1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = bb1Var;
        this.f18464e = tL_error;
        this.f18463c = z10;
        this.f18465f = tLObject;
        this.h = bArr;
        this.f18462b = str;
        this.f18466n = passwordinputsettings;
    }

    public q0(zh.l lVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = lVar;
        this.f18464e = tL_error;
        this.f18465f = tLObject;
        this.h = tL_chatInviteImporter;
        this.f18463c = z10;
        this.f18466n = user;
        this.f18462b = tL_messages_hideChatJoinRequest;
    }
}

package kg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.ns;
import org.telegram.ui.za1;
public final class q0 implements Runnable {
    public final int f18517a = 1;
    public final Object f18518b;
    public final boolean f18519c;
    public final Object d;
    public final Object f18520e;
    public final Object f18521f;
    public final Object h;
    public final TLObject f18522n;

    public q0(File file, ArrayList arrayList, g2 g2Var, bn bnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.f18518b = arrayList;
        this.f18520e = g2Var;
        this.f18521f = bnVar;
        this.h = document;
        this.f18519c = z10;
        this.f18522n = tL_messages_stickerSet;
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
        int i7 = this.f18517a;
        boolean z11 = this.f18519c;
        int i10 = 0;
        Object obj = this.f18518b;
        TLObject tLObject = this.f18522n;
        Object obj2 = this.h;
        Object obj3 = this.f18521f;
        Object obj4 = this.f18520e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                s0.Z((s0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.f18519c, (TLRPC.User) tLObject);
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                g2 g2Var = (g2) obj4;
                TLRPC.Document document2 = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new ef(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.p1().J2(g2Var.getParentActivity(), null, g2Var.getResourceProvider());
                PhotoViewer.p1().g2(arrayList2, 0, 11, false, new Object(), (bn) obj3);
                PhotoViewer p12 = PhotoViewer.p1();
                if (z11) {
                    document = document2;
                } else {
                    document = null;
                }
                p12.T0(document2, document, false, null);
                ns p10 = ns.p();
                if (z11) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                } else {
                    tL_messages_stickerSet = null;
                }
                p10.T = tL_messages_stickerSet;
                return;
            case 2:
                za1.i0((za1) obj5, (TLRPC.TL_error) obj4, this.f18519c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                return;
            default:
                zh.l lVar2 = (zh.l) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i11 = lVar2.f62145k;
                ArrayList arrayList3 = lVar2.f62140e;
                g2 g2Var2 = lVar2.f62142g;
                if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                    if (tL_error == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z12 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            mp.u1(i11).b3(0, tL_updates.chats.get(0).f28492id, true);
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
                        zh.g gVar = lVar2.f62141f;
                        zh.l lVar3 = gVar.f62119c;
                        int i13 = 0;
                        while (true) {
                            arrayList = lVar3.f62139c;
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
                            gVar.s(((gVar.f62119c.B ? 1 : 0) ^ r82) + i13);
                            if (arrayList.isEmpty()) {
                                gVar.s(r82);
                            }
                        }
                        zh.l lVar4 = lVar;
                        lVar4.f(lVar4.f62154t, false, r82);
                        if (z10) {
                            rb rbVar = new rb(g2Var2.getParentActivity(), g2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            p9 p9Var = rbVar.f39267a;
                            p9Var.setRoundRadius(L);
                            p9Var.f(user, new a9(0, user));
                            String k10 = n10.k(user, true);
                            if (lVar4.f62137a) {
                                a02 = gd.a0("HasBeenAddedToChannel", null, 2131749171, k10);
                            } else {
                                a02 = gd.a0("HasBeenAddedToGroup", null, 2131749170, k10);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(k10);
                            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), indexOf, k10.length() + indexOf, 18);
                            rbVar.f39268b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                fc.g(g2Var2, rbVar, 2750).j();
                            } else {
                                fc.f(lVar4.h, rbVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y s5 = g2Var2.getActionBar().s();
                        if (TextUtils.isEmpty(lVar4.f62154t) && lVar4.f62146l) {
                            org.telegram.ui.ActionBar.q0 j3 = s5.j(0);
                            if (arrayList3.isEmpty()) {
                                i10 = 8;
                            }
                            j3.setVisibility(i10);
                            return;
                        }
                        return;
                    }
                    b5.c0(i11, tL_error, g2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
        }
    }

    public q0(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = s0Var;
        this.f18520e = tL_error;
        this.f18521f = tLObject;
        this.h = iArr;
        this.f18518b = arrayList;
        this.f18519c = z10;
        this.f18522n = user;
    }

    public q0(za1 za1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = za1Var;
        this.f18520e = tL_error;
        this.f18519c = z10;
        this.f18521f = tLObject;
        this.h = bArr;
        this.f18518b = str;
        this.f18522n = passwordinputsettings;
    }

    public q0(zh.l lVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = lVar;
        this.f18520e = tL_error;
        this.f18521f = tLObject;
        this.h = tL_chatInviteImporter;
        this.f18519c = z10;
        this.f18522n = user;
        this.f18518b = tL_messages_hideChatJoinRequest;
    }
}
